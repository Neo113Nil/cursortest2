package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.vh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0559vh {

    /* renamed from: a, reason: collision with root package name */
    public final P5 f14794a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14795b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14796c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f14797d;

    /* renamed from: e, reason: collision with root package name */
    public final Fh f14798e;

    public C0559vh(P5 p52, boolean z5, int i5, HashMap hashMap, Fh fh2) {
        this.f14794a = p52;
        this.f14795b = z5;
        this.f14796c = i5;
        this.f14797d = hashMap;
        this.f14798e = fh2;
    }

    public final String toString() {
        return "ReportToSend(report=" + this.f14794a + ", serviceDataReporterType=" + this.f14796c + ", environment=" + this.f14798e + ", isCrashReport=" + this.f14795b + ", trimmedFields=" + this.f14797d + ')';
    }
}
