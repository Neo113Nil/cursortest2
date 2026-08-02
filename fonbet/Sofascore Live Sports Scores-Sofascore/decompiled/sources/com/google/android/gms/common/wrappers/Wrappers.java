package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public class Wrappers {
    public static final Wrappers b = new Wrappers();
    public PackageManagerWrapper a = null;

    public static PackageManagerWrapper a(Context context) {
        PackageManagerWrapper packageManagerWrapper;
        Wrappers wrappers = b;
        synchronized (wrappers) {
            try {
                packageManagerWrapper = wrappers.a;
                if (packageManagerWrapper == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    packageManagerWrapper = new PackageManagerWrapper(context);
                    wrappers.a = packageManagerWrapper;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return packageManagerWrapper;
    }
}
