package com.google.android.gms.location;

import V9.InterfaceC1748d;
import V9.InterfaceC1749e;
import V9.InterfaceC1752h;
import V9.InterfaceC1753i;
import V9.InterfaceC1758n;
import V9.InterfaceC1759o;
import android.content.Context;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.internal.location.zzau;
import com.google.android.gms.internal.location.zzbp;
import com.google.android.gms.internal.location.zzbv;
import com.google.android.gms.internal.location.zzbz;
import com.google.android.gms.internal.location.zzcc;
import com.google.android.gms.internal.location.zzce;

/* loaded from: classes2.dex */
public abstract class LocationServices {

    /* renamed from: a, reason: collision with root package name */
    public static final C3117a f33128a = zzbp.zzb;

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC1748d f33129b = new zzau();

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC1752h f33130c = new zzbv();

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC1758n f33131d = new zzcc();

    public static InterfaceC1749e a(Context context) {
        return new zzbp(context);
    }

    public static InterfaceC1753i b(Context context) {
        return new zzbz(context);
    }

    public static InterfaceC1759o c(Context context) {
        return new zzce(context);
    }
}
