package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Cc {

    /* renamed from: a, reason: collision with root package name */
    public final Xm f12101a;

    /* renamed from: b, reason: collision with root package name */
    public final Xm f12102b;

    /* renamed from: c, reason: collision with root package name */
    public final C0322m4 f12103c;

    /* renamed from: d, reason: collision with root package name */
    public final PublicLogger f12104d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12105e;

    public Cc(String str, PublicLogger publicLogger) {
        this(new C0322m4(30), new Xm(50, str.concat("map key"), publicLogger), new Xm(4000, str.concat("map value"), publicLogger), str, publicLogger);
    }

    public Cc(C0322m4 c0322m4, Xm xm, Xm xm2, String str, PublicLogger publicLogger) {
        this.f12103c = c0322m4;
        this.f12101a = xm;
        this.f12102b = xm2;
        this.f12105e = str;
        this.f12104d = publicLogger;
    }
}
