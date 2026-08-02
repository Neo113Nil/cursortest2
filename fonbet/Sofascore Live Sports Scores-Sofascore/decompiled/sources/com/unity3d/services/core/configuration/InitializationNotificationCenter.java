package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class InitializationNotificationCenter implements IInitializationNotificationCenter {
    private static InitializationNotificationCenter instance;
    private HashMap<Integer, IInitializationListener> _sdkListeners = new HashMap<>();

    public static InitializationNotificationCenter getInstance() {
        InitializationNotificationCenter initializationNotificationCenter = instance;
        if (initializationNotificationCenter != null) {
            return initializationNotificationCenter;
        }
        InitializationNotificationCenter initializationNotificationCenter2 = new InitializationNotificationCenter();
        instance = initializationNotificationCenter2;
        return initializationNotificationCenter2;
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void addListener(IInitializationListener iInitializationListener) {
        synchronized (this._sdkListeners) {
            if (iInitializationListener != null) {
                try {
                    this._sdkListeners.put(new Integer(iInitializationListener.hashCode()), iInitializationListener);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void removeListener(IInitializationListener iInitializationListener) {
        synchronized (this._sdkListeners) {
            if (iInitializationListener != null) {
                try {
                    removeListener(new Integer(iInitializationListener.hashCode()));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void triggerOnSdkInitializationFailed(String str, ErrorState errorState, int i) {
        InitializationNotificationCenter initializationNotificationCenter;
        final ErrorState errorState2;
        final int i2;
        synchronized (this._sdkListeners) {
            try {
                final String str2 = "SDK Failed to Initialize due to " + str;
                DeviceLog.error(str2);
                ArrayList arrayList = new ArrayList();
                for (final Map.Entry<Integer, IInitializationListener> entry : this._sdkListeners.entrySet()) {
                    if (entry.getValue() != null) {
                        initializationNotificationCenter = this;
                        errorState2 = errorState;
                        i2 = i;
                        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.configuration.InitializationNotificationCenter.2
                            @Override // java.lang.Runnable
                            public void run() {
                                ((IInitializationListener) entry.getValue()).onSdkInitializationFailed(str2, errorState2, i2);
                            }
                        });
                    } else {
                        initializationNotificationCenter = this;
                        errorState2 = errorState;
                        i2 = i;
                        arrayList.add(entry.getKey());
                    }
                    this = initializationNotificationCenter;
                    errorState = errorState2;
                    i = i2;
                }
                InitializationNotificationCenter initializationNotificationCenter2 = this;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    initializationNotificationCenter2._sdkListeners.remove((Integer) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void triggerOnSdkInitialized() {
        synchronized (this._sdkListeners) {
            try {
                ArrayList arrayList = new ArrayList();
                for (final Map.Entry<Integer, IInitializationListener> entry : this._sdkListeners.entrySet()) {
                    if (entry.getValue() != null) {
                        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.configuration.InitializationNotificationCenter.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((IInitializationListener) entry.getValue()).onSdkInitialized();
                            }
                        });
                    } else {
                        arrayList.add(entry.getKey());
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this._sdkListeners.remove((Integer) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void removeListener(Integer num) {
        this._sdkListeners.remove(num);
    }
}
