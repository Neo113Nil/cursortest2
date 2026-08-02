package com.learnium.RNDeviceInfo.resolver;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes8.dex */
public class DeviceIdResolver {
    private final Context context;

    public DeviceIdResolver(Context context) {
        this.context = context;
    }

    public String getInstanceIdSync() {
        try {
            return getFirebaseInstanceId();
        } catch (ClassNotFoundException unused) {
            try {
                return getGmsInstanceId();
            } catch (ClassNotFoundException unused2) {
                System.err.println("Can't generate id. Please add com.google.firebase:firebase-iid to your project.");
                return "unknown";
            } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException unused3) {
                System.err.println("N/A: Unsupported version of com.google.android.gms.iid in your project.");
                System.err.println("Can't generate id. Please add com.google.firebase:firebase-iid to your project.");
                return "unknown";
            }
        } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException unused4) {
            System.err.println("N/A: Unsupported version of com.google.firebase:firebase-iid in your project.");
            return getGmsInstanceId();
        }
    }

    String getGmsInstanceId() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object invoke = Class.forName("com.google.android.gms.iid.InstanceID").getDeclaredMethod("getInstance", Context.class).invoke(null, this.context);
        return (String) invoke.getClass().getMethod("getId", null).invoke(invoke, null);
    }

    String getFirebaseInstanceId() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object invoke = Class.forName("com.google.firebase.iid.FirebaseInstanceId").getDeclaredMethod("getInstance", null).invoke(null, null);
        return (String) invoke.getClass().getMethod("getId", null).invoke(invoke, null);
    }
}
