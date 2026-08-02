package com.vk.id.captcha.web;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f60594a;

    public b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.f60594a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        if (r0.hasTransport(3) == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        Network activeNetwork;
        Boolean bool;
        boolean z11;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f60594a.getSystemService("connectivity");
        if (connectivityManager != null && (activeNetwork = connectivityManager.getActiveNetwork()) != null) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(12)) {
                    z11 = true;
                    if (!networkCapabilities.hasTransport(1)) {
                        if (!networkCapabilities.hasTransport(4)) {
                            if (!networkCapabilities.hasTransport(0)) {
                            }
                        }
                    }
                    bool = Boolean.valueOf(z11);
                }
                z11 = false;
                bool = Boolean.valueOf(z11);
            } else {
                bool = null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }
}
