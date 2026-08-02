package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.ModuleHolder;
import expo.modules.kotlin.ModuleRegistry;
import expo.modules.kotlin.exception.JavaScriptEvaluateException;
import expo.modules.kotlin.runtime.Runtime;
import expo.modules.kotlin.sharedobjects.ClassRegistry;
import expo.modules.kotlin.sharedobjects.SharedObject;
import expo.modules.kotlin.sharedobjects.SharedObjectId;
import expo.modules.kotlin.sharedobjects.SharedObjectRegistry;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JSIContext.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u001f\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086 J\u0011\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0086 J\t\u0010\u0013\u001a\u00020\u0014H\u0086 J\t\u0010\u0015\u001a\u00020\u0014H\u0086 J\u0011\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0086 J\t\u0010\u0019\u001a\u00020\u0012H\u0086 J\u0019\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0014H\u0086 J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u0010H\u0007J\u0010\u0010!\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u0010H\u0007J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100$H\u0007¢\u0006\u0002\u0010%J\u0018\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\u0014H\u0007J\u0012\u0010)\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u001c\u0010+\u001a\u00020\u00122\n\u0010'\u001a\u0006\u0012\u0002\b\u00030,2\u0006\u0010\u001d\u001a\u00020\u0014H\u0007J\u0016\u0010-\u001a\u0004\u0018\u00010\u00142\n\u0010'\u001a\u0006\u0012\u0002\b\u00030,H\u0007J\b\u0010.\u001a\u00020\u0012H\u0004J\b\u0010/\u001a\u00020\u0012H\u0016J\b\u00100\u001a\u00020\u0005H\u0016R\u0010\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u00061"}, d2 = {"Lexpo/modules/kotlin/jni/JSIContext;", "Lexpo/modules/kotlin/jni/Destructible;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "mHybridData", "Lcom/facebook/jni/HybridData;", "runtimeHolder", "Ljava/lang/ref/WeakReference;", "Lexpo/modules/kotlin/runtime/Runtime;", "<init>", "(Lcom/facebook/jni/HybridData;Ljava/lang/ref/WeakReference;)V", "getRuntimeHolder", "()Ljava/lang/ref/WeakReference;", "evaluateScript", "Lexpo/modules/kotlin/jni/JavaScriptValue;", "script", "", "evaluateVoidScript", "", "global", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "createObject", "scheduleOnJSThread", "runnable", "Ljava/lang/Runnable;", "drainJSEventLoop", "setNativeStateForSharedObject", "id", "", "js", "getJavaScriptModuleObject", "Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "name", "hasModule", "", "getJavaScriptModulesName", "", "()[Ljava/lang/String;", "registerSharedObject", "native", "", "getSharedObject", "deleteSharedObject", "registerClass", "Ljava/lang/Class;", "getJavascriptClass", "finalize", AnalyticsConstantsKt.CLOSE_BUTTON, "getHybridDataForJNIDeallocator", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class JSIContext implements Destructible, AutoCloseable {
    private final HybridData mHybridData;
    private final WeakReference<Runtime> runtimeHolder;

    public final native JavaScriptObject createObject();

    public final native void drainJSEventLoop();

    public final native JavaScriptValue evaluateScript(String script) throws JavaScriptEvaluateException;

    public final native void evaluateVoidScript(String script) throws JavaScriptEvaluateException;

    public final native JavaScriptObject global();

    public final native void scheduleOnJSThread(Runnable runnable);

    public final native void setNativeStateForSharedObject(int id, JavaScriptObject js);

    public JSIContext(HybridData mHybridData, WeakReference<Runtime> runtimeHolder) {
        Intrinsics.checkNotNullParameter(mHybridData, "mHybridData");
        Intrinsics.checkNotNullParameter(runtimeHolder, "runtimeHolder");
        this.mHybridData = mHybridData;
        this.runtimeHolder = runtimeHolder;
    }

    public final WeakReference<Runtime> getRuntimeHolder() {
        return this.runtimeHolder;
    }

    public final JavaScriptModuleObject getJavaScriptModuleObject(String name) {
        AppContext appContext;
        ModuleRegistry registry;
        ModuleHolder<?> moduleHolder;
        Intrinsics.checkNotNullParameter(name, "name");
        Runtime runtime = this.runtimeHolder.get();
        if (runtime == null || (appContext = runtime.getAppContext()) == null || (registry = appContext.getRegistry()) == null || (moduleHolder = registry.getModuleHolder(name)) == null) {
            return null;
        }
        return moduleHolder.getJsObject();
    }

    public final boolean hasModule(String name) {
        AppContext appContext;
        ModuleRegistry registry;
        Intrinsics.checkNotNullParameter(name, "name");
        Runtime runtime = this.runtimeHolder.get();
        if (runtime == null || (appContext = runtime.getAppContext()) == null || (registry = appContext.getRegistry()) == null) {
            return false;
        }
        return registry.hasModule(name);
    }

    public final String[] getJavaScriptModulesName() {
        AppContext appContext;
        ModuleRegistry registry;
        Map<String, ModuleHolder<?>> registry2;
        Set<String> keySet;
        String[] strArr;
        Runtime runtime = this.runtimeHolder.get();
        return (runtime == null || (appContext = runtime.getAppContext()) == null || (registry = appContext.getRegistry()) == null || (registry2 = registry.getRegistry()) == null || (keySet = registry2.keySet()) == null || (strArr = (String[]) keySet.toArray(new String[0])) == null) ? new String[0] : strArr;
    }

    public final void registerSharedObject(Object r2, JavaScriptObject js) {
        SharedObjectRegistry sharedObjectRegistry;
        Intrinsics.checkNotNullParameter(r2, "native");
        Intrinsics.checkNotNullParameter(js, "js");
        Runtime runtime = this.runtimeHolder.get();
        if (runtime == null || (sharedObjectRegistry = runtime.getSharedObjectRegistry()) == null) {
            return;
        }
        SharedObjectId.m11873boximpl(sharedObjectRegistry.m11886add5WKnsLU$expo_modules_core_release((SharedObject) r2, js));
    }

    public final JavaScriptObject getSharedObject(int id) {
        Runtime runtime = this.runtimeHolder.get();
        if (runtime == null) {
            return null;
        }
        return SharedObjectId.m11878toJavaScriptObjectNullimpl(SharedObjectId.m11874constructorimpl(id), runtime);
    }

    public final void deleteSharedObject(int id) {
        SharedObjectRegistry sharedObjectRegistry;
        Runtime runtime = this.runtimeHolder.get();
        if (runtime == null || (sharedObjectRegistry = runtime.getSharedObjectRegistry()) == null) {
            return;
        }
        sharedObjectRegistry.m11887deletekyJHjyY$expo_modules_core_release(SharedObjectId.m11874constructorimpl(id));
    }

    public final void registerClass(Class<?> r2, JavaScriptObject js) {
        ClassRegistry classRegistry;
        Intrinsics.checkNotNullParameter(r2, "native");
        Intrinsics.checkNotNullParameter(js, "js");
        Runtime runtime = this.runtimeHolder.get();
        if (runtime == null || (classRegistry = runtime.getClassRegistry()) == null) {
            return;
        }
        classRegistry.add$expo_modules_core_release(r2, js);
    }

    public final JavaScriptObject getJavascriptClass(Class<?> r2) {
        ClassRegistry classRegistry;
        Intrinsics.checkNotNullParameter(r2, "native");
        Runtime runtime = this.runtimeHolder.get();
        if (runtime == null || (classRegistry = runtime.getClassRegistry()) == null) {
            return null;
        }
        return classRegistry.toJavaScriptObject$expo_modules_core_release(r2);
    }

    protected final void finalize() throws Throwable {
        close();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.mHybridData.resetNative();
    }

    @Override // expo.modules.kotlin.jni.Destructible
    /* renamed from: getHybridDataForJNIDeallocator, reason: from getter */
    public HybridData getMHybridData() {
        return this.mHybridData;
    }
}
