package com.getcapacitor;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class PluginCall {
    public static final String CALLBACK_ID_DANGLING = "-1";
    private static final String UNAVAILABLE = "not available";
    private static final String UNIMPLEMENTED = "not implemented";
    private final String callbackId;
    private final JSObject data;
    private final String methodName;
    private final MessageHandler msgHandler;
    private final String pluginId;
    private boolean shouldSave = false;
    private boolean isReleased = false;

    public PluginCall(MessageHandler messageHandler, String str, String str2, String str3, JSObject jSObject) {
        this.msgHandler = messageHandler;
        this.pluginId = str;
        this.callbackId = str2;
        this.methodName = str3;
        this.data = jSObject;
    }

    public void successCallback(PluginResult pluginResult) {
        if ("-1".equals(this.callbackId)) {
            return;
        }
        this.msgHandler.sendResponseMessage(this, pluginResult, null);
    }

    public void success(JSObject jSObject) {
        this.msgHandler.sendResponseMessage(this, new PluginResult(jSObject), null);
    }

    public void success() {
        success(new JSObject());
    }

    public void resolve(JSObject jSObject) {
        this.msgHandler.sendResponseMessage(this, new PluginResult(jSObject), null);
    }

    public void resolve() {
        success(new JSObject());
    }

    public void errorCallback(String str) {
        PluginResult pluginResult = new PluginResult();
        try {
            pluginResult.put("message", str);
        } catch (Exception e) {
            Logger.error(Logger.tags("Plugin"), e.toString(), null);
        }
        this.msgHandler.sendResponseMessage(this, null, pluginResult);
    }

    public void error(String str, Exception exc) {
        error(str, null, exc);
    }

    public void error(String str, String str2, Exception exc) {
        PluginResult pluginResult = new PluginResult();
        if (exc != null) {
            Logger.error(Logger.tags("Plugin"), str, exc);
        }
        try {
            pluginResult.put("message", str);
            pluginResult.put("code", str2);
        } catch (Exception e) {
            Logger.error(Logger.tags("Plugin"), e.getMessage(), null);
        }
        this.msgHandler.sendResponseMessage(this, null, pluginResult);
    }

    public void error(String str) {
        error(str, null);
    }

    public void reject(String str, Exception exc) {
        error(str, exc);
    }

    public void reject(String str, String str2) {
        error(str, str2, null);
    }

    public void reject(String str) {
        error(str, null);
    }

    public void unimplemented() {
        error(UNIMPLEMENTED, null);
    }

    public void unavailable() {
        error(UNAVAILABLE, null);
    }

    public String getPluginId() {
        return this.pluginId;
    }

    public String getCallbackId() {
        return this.callbackId;
    }

    public String getMethodName() {
        return this.methodName;
    }

    public JSObject getData() {
        return this.data;
    }

    public String getString(String str) {
        return getString(str, null);
    }

    public String getString(String str, String str2) {
        Object opt = this.data.opt(str);
        return (opt != null && (opt instanceof String)) ? (String) opt : str2;
    }

    public Integer getInt(String str) {
        return getInt(str, null);
    }

    public Integer getInt(String str, Integer num) {
        Object opt = this.data.opt(str);
        return (opt != null && (opt instanceof Integer)) ? (Integer) opt : num;
    }

    public Float getFloat(String str) {
        return getFloat(str, null);
    }

    public Float getFloat(String str, Float f) {
        Object opt = this.data.opt(str);
        if (opt != null) {
            if (opt instanceof Float) {
                return (Float) opt;
            }
            if (opt instanceof Double) {
                return Float.valueOf(((Double) opt).floatValue());
            }
            if (opt instanceof Integer) {
                return Float.valueOf(((Integer) opt).floatValue());
            }
        }
        return f;
    }

    public Double getDouble(String str) {
        return getDouble(str, null);
    }

    public Double getDouble(String str, Double d) {
        Object opt = this.data.opt(str);
        if (opt != null) {
            if (opt instanceof Double) {
                return (Double) opt;
            }
            if (opt instanceof Float) {
                return Double.valueOf(((Float) opt).doubleValue());
            }
            if (opt instanceof Integer) {
                return Double.valueOf(((Integer) opt).doubleValue());
            }
        }
        return d;
    }

    public Boolean getBoolean(String str) {
        return getBoolean(str, null);
    }

    public Boolean getBoolean(String str, Boolean bool) {
        Object opt = this.data.opt(str);
        return (opt != null && (opt instanceof Boolean)) ? (Boolean) opt : bool;
    }

    public JSObject getObject(String str) {
        return getObject(str, new JSObject());
    }

    public JSObject getObject(String str, JSObject jSObject) {
        Object opt = this.data.opt(str);
        if (opt != null && (opt instanceof JSONObject)) {
            try {
                return JSObject.fromJSONObject((JSONObject) opt);
            } catch (JSONException unused) {
            }
        }
        return jSObject;
    }

    public JSArray getArray(String str) {
        return getArray(str, new JSArray());
    }

    public JSArray getArray(String str, JSArray jSArray) {
        Object opt = this.data.opt(str);
        if (opt != null && (opt instanceof JSONArray)) {
            try {
                JSONArray jSONArray = (JSONArray) opt;
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.get(i));
                }
                return new JSArray(arrayList.toArray());
            } catch (JSONException unused) {
            }
        }
        return jSArray;
    }

    public boolean hasOption(String str) {
        return this.data.has(str);
    }

    public void save() {
        this.shouldSave = true;
    }

    public void release(Bridge bridge) {
        this.shouldSave = false;
        bridge.releaseCall(this);
        this.isReleased = true;
    }

    public boolean isSaved() {
        return this.shouldSave;
    }

    public boolean isReleased() {
        return this.isReleased;
    }

    class PluginCallDataTypeException extends Exception {
        PluginCallDataTypeException(String str) {
            super(str);
        }
    }
}
