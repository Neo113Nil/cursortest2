package io.sentry.android.core.performance;

import android.os.SystemClock;
import io.sentry.AbstractC4779m;
import io.sentry.AbstractC4856v2;
import io.sentry.C4835t3;

/* loaded from: classes3.dex */
public class n implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public String f51259a;

    /* renamed from: b, reason: collision with root package name */
    public long f51260b;

    /* renamed from: c, reason: collision with root package name */
    public long f51261c;

    /* renamed from: d, reason: collision with root package name */
    public long f51262d;

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(n nVar) {
        return Long.compare(this.f51260b, nVar.f51260b);
    }

    public String b() {
        return this.f51259a;
    }

    public long c() {
        if (n()) {
            return this.f51262d - this.f51261c;
        }
        return 0L;
    }

    public AbstractC4856v2 d() {
        if (n()) {
            return new C4835t3(AbstractC4779m.i(e()));
        }
        return null;
    }

    public long e() {
        if (m()) {
            return this.f51260b + c();
        }
        return 0L;
    }

    public double f() {
        return AbstractC4779m.j(e());
    }

    public AbstractC4856v2 g() {
        if (m()) {
            return new C4835t3(AbstractC4779m.i(h()));
        }
        return null;
    }

    public long h() {
        return this.f51260b;
    }

    public double i() {
        return AbstractC4779m.j(this.f51260b);
    }

    public long j() {
        return this.f51261c;
    }

    public boolean k() {
        return this.f51261c == 0;
    }

    public boolean l() {
        return this.f51262d == 0;
    }

    public boolean m() {
        return this.f51261c != 0;
    }

    public boolean n() {
        return this.f51262d != 0;
    }

    public void o() {
        this.f51259a = null;
        this.f51261c = 0L;
        this.f51262d = 0L;
        this.f51260b = 0L;
    }

    public void p(long j10) {
        this.f51261c = j10;
        this.f51260b = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.f51261c);
    }

    public void q(long j10) {
        this.f51262d = j10;
    }

    public void r(String str, long j10, long j11, long j12) {
        this.f51259a = str;
        this.f51260b = j10;
        this.f51261c = j11;
        this.f51262d = j12;
    }

    public void s() {
        this.f51262d = SystemClock.uptimeMillis();
    }
}
