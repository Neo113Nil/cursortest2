package io.appmetrica.analytics.impl;

import android.util.Pair;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0242j0 {

    /* renamed from: a, reason: collision with root package name */
    public Fc f13989a;

    /* renamed from: b, reason: collision with root package name */
    public long f13990b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13991c;

    /* renamed from: d, reason: collision with root package name */
    public final C0463rl f13992d;

    public C0242j0(String str, long j, C0463rl c0463rl) {
        this.f13990b = j;
        try {
            this.f13989a = new Fc(str);
        } catch (Throwable unused) {
            this.f13989a = new Fc();
        }
        this.f13992d = c0463rl;
    }

    public final synchronized void a(Pair pair) {
        if (this.f13992d.b(this.f13989a, (String) pair.first, (String) pair.second)) {
            this.f13991c = true;
        }
    }

    public final synchronized String toString() {
        return "Map size " + this.f13989a.size() + ". Is changed " + this.f13991c + ". Current revision " + this.f13990b;
    }

    public final synchronized C0217i0 a() {
        try {
            if (this.f13991c) {
                this.f13990b++;
                this.f13991c = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return new C0217i0(AbstractC0176gb.b(this.f13989a), this.f13990b);
    }
}
