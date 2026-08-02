package io.sentry;

import java.io.File;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f17226a;

    /* renamed from: b, reason: collision with root package name */
    public final ILogger f17227b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17228c;

    /* renamed from: d, reason: collision with root package name */
    public final s6 f17229d;

    public w(b1 b1Var, ILogger iLogger, long j, int i5) {
        this.f17226a = b1Var;
        this.f17227b = iLogger;
        this.f17228c = j;
        this.f17229d = new s6(new g(i5));
    }

    public abstract boolean a(String str);

    public abstract void b(File file, h0 h0Var);
}
