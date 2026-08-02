package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.kj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287kj {

    /* renamed from: a, reason: collision with root package name */
    public final String f14144a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f14145b;

    /* renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f14146c;

    /* renamed from: d, reason: collision with root package name */
    public final C0362nj f14147d;

    public C0287kj(String str, Context context, CounterConfigurationReporterType counterConfigurationReporterType, C0362nj c0362nj) {
        this.f14144a = str;
        this.f14145b = context;
        int i5 = AbstractC0261jj.f14055a[counterConfigurationReporterType.ordinal()];
        if (i5 == 1) {
            this.f14146c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        } else if (i5 != 2) {
            this.f14146c = null;
        } else {
            this.f14146c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL;
        }
        this.f14147d = c0362nj;
    }
}
