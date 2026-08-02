package com.google.android.gms.internal.cast;

import android.os.IInterface;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.internal.zzg;
import com.google.android.gms.cast.framework.zzak;
import com.google.android.gms.cast.framework.zzar;
import com.google.android.gms.cast.framework.zzau;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.kmn;
import defpackage.wqn;
import defpackage.x7p;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface zzbc extends IInterface {
    zzar Q2(ObjectWrapper objectWrapper, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2);

    zzau S0(String str, String str2, kmn kmnVar);

    zzak V1(CastOptions castOptions, IObjectWrapper iObjectWrapper, x7p x7pVar);

    zzg b1(ObjectWrapper objectWrapper, ObjectWrapper objectWrapper2, wqn wqnVar, int i, int i2);

    zzg d4(ObjectWrapper objectWrapper, wqn wqnVar, int i, int i2);

    com.google.android.gms.cast.framework.zzah x0(ObjectWrapper objectWrapper, CastOptions castOptions, zzbe zzbeVar, HashMap hashMap);

    int zze();
}
