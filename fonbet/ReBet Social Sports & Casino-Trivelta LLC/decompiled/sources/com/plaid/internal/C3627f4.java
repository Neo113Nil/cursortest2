package com.plaid.internal;

import android.net.NetworkCapabilities;
import android.os.Build;
import androidx.annotation.NonNull;

/* renamed from: com.plaid.internal.f4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3627f4 {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC3663j4 f40603a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC3801z f40604b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC3801z f40605c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC3801z f40606d;

    public C3627f4(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(0)) {
            this.f40603a = EnumC3663j4.CELLULAR;
        } else if (networkCapabilities.hasTransport(1)) {
            this.f40603a = EnumC3663j4.WIFI;
        } else if (networkCapabilities.hasTransport(3)) {
            this.f40603a = EnumC3663j4.WIRED;
        } else {
            this.f40603a = EnumC3663j4.OTHER;
        }
        this.f40605c = networkCapabilities.hasCapability(12) ? EnumC3801z.YES : EnumC3801z.NO;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f40604b = networkCapabilities.hasCapability(19) ? EnumC3801z.YES : EnumC3801z.NO;
        } else {
            this.f40604b = EnumC3801z.UNKNOWN;
        }
        this.f40606d = networkCapabilities.hasCapability(16) ? EnumC3801z.YES : EnumC3801z.NO;
    }

    @NonNull
    public final String toString() {
        return "type=" + this.f40603a.name() + ", foreground=" + this.f40604b + ", internet capable=" + this.f40605c + ", validated=" + this.f40606d;
    }
}
