package com.appsflyer.internal;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.mz1;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFg1jSDK {
    private StringBuilder AFKeystoreWrapper = new StringBuilder();
    private final List<AFa1vSDK> unregisterClient = new ArrayList();
    private final String AFLogger = null;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum AFa1vSDK {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    private void unregisterClient() throws AFg1oSDK {
        if (this.unregisterClient.isEmpty()) {
            return;
        }
        AFa1vSDK AFKeystoreWrapper = AFKeystoreWrapper();
        if (AFKeystoreWrapper == AFa1vSDK.EMPTY_ARRAY) {
            AFa1vSDK aFa1vSDK = AFa1vSDK.NONEMPTY_ARRAY;
            this.unregisterClient.set(r2.size() - 1, aFa1vSDK);
        } else {
            if (AFKeystoreWrapper == AFa1vSDK.NONEMPTY_ARRAY) {
                this.AFKeystoreWrapper.append(',');
                return;
            }
            if (AFKeystoreWrapper != AFa1vSDK.DANGLING_KEY) {
                if (AFKeystoreWrapper != AFa1vSDK.NULL) {
                    throw new AFg1oSDK("Nesting problem");
                }
            } else {
                this.AFKeystoreWrapper.append(":");
                AFa1vSDK aFa1vSDK2 = AFa1vSDK.NONEMPTY_OBJECT;
                this.unregisterClient.set(r2.size() - 1, aFa1vSDK2);
            }
        }
    }

    public final void AFKeystoreWrapper(String str) {
        this.AFKeystoreWrapper.append("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\f') {
                this.AFKeystoreWrapper.append("\\f");
            } else if (charAt == '\r') {
                this.AFKeystoreWrapper.append("\\r");
            } else if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        this.AFKeystoreWrapper.append("\\b");
                        break;
                    case '\t':
                        this.AFKeystoreWrapper.append("\\t");
                        break;
                    case '\n':
                        this.AFKeystoreWrapper.append("\\n");
                        break;
                    default:
                        StringBuilder sb = this.AFKeystoreWrapper;
                        if (charAt <= 31) {
                            sb.append(String.format(Locale.US, "\\u%04x", Integer.valueOf(charAt)));
                            break;
                        } else {
                            sb.append(charAt);
                            break;
                        }
                }
            } else {
                StringBuilder sb2 = this.AFKeystoreWrapper;
                sb2.append('\\');
                sb2.append(charAt);
            }
        }
        this.AFKeystoreWrapper.append("\"");
    }

    public final AFg1jSDK d(Object obj) throws AFg1oSDK {
        if (this.unregisterClient.isEmpty()) {
            throw new AFg1oSDK("Nesting problem");
        }
        if (((Class) AFb1ySDK.AFLogger((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 36, View.resolveSizeAndState(0, 0, 0) + Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16))).isInstance(obj)) {
            try {
                Object[] objArr = {this};
                Map map = AFb1ySDK.getInstance;
                Object obj2 = map.get(1348120281);
                if (obj2 == null) {
                    obj2 = ((Class) AFb1ySDK.AFLogger(36 - ExpandableListView.getPackedPositionChild(0L), 321 - TextUtils.getOffsetBefore("", 0), (char) ((-1) - TextUtils.lastIndexOf("", '0')))).getDeclaredMethod("unregisterClient", AFg1jSDK.class);
                    map.put(1348120281, obj2);
                }
                ((Method) obj2).invoke(obj, objArr);
                return this;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (obj instanceof AFg1rSDK) {
            ((AFg1rSDK) obj).d(this);
            return this;
        }
        unregisterClient();
        if (obj == null || (obj instanceof Boolean) || obj == AFg1rSDK.unregisterClient) {
            this.AFKeystoreWrapper.append(obj);
            return this;
        }
        if (obj instanceof Number) {
            this.AFKeystoreWrapper.append(AFg1rSDK.AFLogger((Number) obj));
            return this;
        }
        AFKeystoreWrapper(obj.toString());
        return this;
    }

    public final void registerClient() throws AFg1oSDK {
        AFa1vSDK AFKeystoreWrapper = AFKeystoreWrapper();
        if (AFKeystoreWrapper == AFa1vSDK.NONEMPTY_OBJECT) {
            this.AFKeystoreWrapper.append(',');
        } else if (AFKeystoreWrapper != AFa1vSDK.EMPTY_OBJECT) {
            throw new AFg1oSDK("Nesting problem");
        }
        AFa1vSDK aFa1vSDK = AFa1vSDK.DANGLING_KEY;
        this.unregisterClient.set(r2.size() - 1, aFa1vSDK);
    }

    public final String toString() {
        if (this.AFKeystoreWrapper.length() == 0) {
            return null;
        }
        return this.AFKeystoreWrapper.toString();
    }

    public final AFg1jSDK registerClient(AFa1vSDK aFa1vSDK, String str) throws AFg1oSDK {
        if (this.unregisterClient.isEmpty() && this.AFKeystoreWrapper.length() > 0) {
            throw new AFg1oSDK("Nesting problem: multiple top-level roots");
        }
        unregisterClient();
        this.unregisterClient.add(aFa1vSDK);
        this.AFKeystoreWrapper.append(str);
        return this;
    }

    private AFa1vSDK AFKeystoreWrapper() throws AFg1oSDK {
        if (!this.unregisterClient.isEmpty()) {
            return (AFa1vSDK) mz1.g(1, this.unregisterClient);
        }
        throw new AFg1oSDK("Nesting problem");
    }

    public final AFg1jSDK d(AFa1vSDK aFa1vSDK, AFa1vSDK aFa1vSDK2, String str) throws AFg1oSDK {
        AFa1vSDK AFKeystoreWrapper = AFKeystoreWrapper();
        if (AFKeystoreWrapper != aFa1vSDK2 && AFKeystoreWrapper != aFa1vSDK) {
            throw new AFg1oSDK("Nesting problem");
        }
        this.unregisterClient.remove(r2.size() - 1);
        this.AFKeystoreWrapper.append(str);
        return this;
    }
}
