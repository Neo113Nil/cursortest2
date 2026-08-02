package com.plaid.internal;

import android.content.res.Resources;
import android.os.Build;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class O4 implements H0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final O4 f39477a = new O4();

    /* renamed from: b, reason: collision with root package name */
    public static final String f39478b = Build.ID;

    /* renamed from: c, reason: collision with root package name */
    public static final String f39479c = Build.MANUFACTURER;

    /* renamed from: d, reason: collision with root package name */
    public static final String f39480d = Build.MODEL;

    /* renamed from: e, reason: collision with root package name */
    public static final String f39481e = Build.DEVICE;

    /* renamed from: f, reason: collision with root package name */
    public static final String f39482f = Build.TYPE;

    /* renamed from: g, reason: collision with root package name */
    public static final String f39483g = Build.VERSION.RELEASE;

    /* renamed from: h, reason: collision with root package name */
    public static final String f39484h = Build.VERSION.CODENAME;

    /* renamed from: i, reason: collision with root package name */
    public static final int f39485i = Build.VERSION.SDK_INT;

    /* renamed from: j, reason: collision with root package name */
    public static final int f39486j = Resources.getSystem().getDisplayMetrics().heightPixels;

    /* renamed from: k, reason: collision with root package name */
    public static final int f39487k = Resources.getSystem().getDisplayMetrics().widthPixels;

    @Override // com.plaid.internal.H0
    public final String a() {
        return f39479c;
    }

    @Override // com.plaid.internal.H0
    public final String b() {
        return f39480d;
    }

    @Override // com.plaid.internal.H0
    public final String c() {
        return f39484h;
    }

    @Override // com.plaid.internal.H0
    public final String d() {
        return f39482f;
    }

    @Override // com.plaid.internal.H0
    public final String e() {
        return f39483g;
    }

    @Override // com.plaid.internal.H0
    public final int f() {
        return f39485i;
    }

    @Override // com.plaid.internal.H0
    public final String g() {
        return f39481e;
    }

    @Override // com.plaid.internal.H0
    public final String getId() {
        return f39478b;
    }
}
