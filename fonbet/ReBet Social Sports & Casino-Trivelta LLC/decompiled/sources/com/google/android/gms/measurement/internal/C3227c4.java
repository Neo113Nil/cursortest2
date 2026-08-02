package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzdd;

/* renamed from: com.google.android.gms.measurement.internal.c4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3227c4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33962a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f33963b;

    /* renamed from: c, reason: collision with root package name */
    public long f33964c;

    /* renamed from: d, reason: collision with root package name */
    public zzdd f33965d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f33966e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f33967f;

    /* renamed from: g, reason: collision with root package name */
    public String f33968g;

    public C3227c4(Context context, zzdd zzddVar, Long l10) {
        this.f33966e = true;
        AbstractC3191o.m(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC3191o.m(applicationContext);
        this.f33962a = applicationContext;
        this.f33967f = l10;
        if (zzddVar != null) {
            this.f33965d = zzddVar;
            this.f33966e = zzddVar.zzc;
            this.f33964c = zzddVar.zzb;
            this.f33968g = zzddVar.zze;
            Bundle bundle = zzddVar.zzd;
            if (bundle != null) {
                this.f33963b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
