package by.chemerisuk.cordova.support;

import android.util.Pair;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.LOG;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ReflectiveCordovaPlugin extends CordovaPlugin {
    private static String TAG = "ReflectiveCordovaPlugin";
    private Map<String, Pair<Method, ExecutionThread>> pairs;

    public enum ExecutionThread {
        MAIN,
        UI,
        WORKER
    }

    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) {
        if (this.pairs == null) {
            this.pairs = createCommandFactories();
        }
        Pair<Method, ExecutionThread> pair = this.pairs.get(str);
        if (pair == null) {
            return false;
        }
        Runnable createCommand = createCommand((Method) pair.first, getMethodArgs(jSONArray, callbackContext), callbackContext);
        ExecutionThread executionThread = (ExecutionThread) pair.second;
        if (executionThread == ExecutionThread.WORKER) {
            this.f3354cordova.getThreadPool().execute(createCommand);
            return true;
        }
        if (executionThread == ExecutionThread.UI) {
            this.f3354cordova.getActivity().runOnUiThread(createCommand);
            return true;
        }
        createCommand.run();
        return true;
    }

    private Runnable createCommand(final Method method, final Object[] objArr, final CallbackContext callbackContext) {
        return new Runnable() { // from class: by.chemerisuk.cordova.support.ReflectiveCordovaPlugin.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    method.invoke(ReflectiveCordovaPlugin.this, objArr);
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof InvocationTargetException) {
                        th = ((InvocationTargetException) th).getTargetException();
                    }
                    LOG.e(ReflectiveCordovaPlugin.TAG, "Uncaught exception at " + getClass().getSimpleName() + "#" + method.getName(), th);
                    callbackContext.error(th.getMessage());
                }
            }
        };
    }

    private Map<String, Pair<Method, ExecutionThread>> createCommandFactories() {
        HashMap hashMap = new HashMap();
        for (Method method : getClass().getDeclaredMethods()) {
            CordovaMethod cordovaMethod = (CordovaMethod) method.getAnnotation(CordovaMethod.class);
            if (cordovaMethod != null) {
                String action = cordovaMethod.action();
                if (action.isEmpty()) {
                    action = method.getName();
                }
                hashMap.put(action, new Pair(method, cordovaMethod.value()));
                method.setAccessible(true);
            }
        }
        return hashMap;
    }

    private static Object[] getMethodArgs(JSONArray jSONArray, CallbackContext callbackContext) {
        int length = jSONArray.length();
        Object[] objArr = new Object[length + 1];
        for (int i = 0; i < length; i++) {
            Object opt = jSONArray.opt(i);
            if (JSONObject.NULL.equals(opt)) {
                opt = null;
            }
            objArr[i] = opt;
        }
        objArr[length] = callbackContext;
        return objArr;
    }
}
