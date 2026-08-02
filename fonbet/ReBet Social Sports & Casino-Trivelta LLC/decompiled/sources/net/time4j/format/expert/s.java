package net.time4j.format.expert;

import java.text.ParsePosition;
import kotlin.text.Typography;

/* loaded from: classes5.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public ParsePosition f58045a;

    /* renamed from: b, reason: collision with root package name */
    public String f58046b;

    /* renamed from: c, reason: collision with root package name */
    public oi.q f58047c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f58048d;

    public s() {
        this(0);
    }

    public void a() {
        this.f58045a.setErrorIndex(-1);
        this.f58046b = "";
    }

    public void b() {
        this.f58048d = false;
    }

    public int c() {
        return this.f58045a.getErrorIndex();
    }

    public String d() {
        return this.f58046b;
    }

    public ParsePosition e() {
        return this.f58045a;
    }

    public int f() {
        return this.f58045a.getIndex();
    }

    public oi.q g() {
        if (this.f58047c == null) {
            this.f58047c = new v(0, false);
        }
        return this.f58047c;
    }

    public oi.q h() {
        return this.f58047c;
    }

    public boolean i() {
        return this.f58045a.getErrorIndex() != -1;
    }

    public boolean j() {
        return this.f58048d;
    }

    public void k(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Undefined error index: " + i10);
        }
        if (str == null || str.isEmpty()) {
            str = "Error occurred at position: " + i10;
        }
        this.f58046b = str;
        this.f58045a.setErrorIndex(i10);
    }

    public void l(int i10) {
        if (i10 >= 0) {
            this.f58045a.setIndex(i10);
            return;
        }
        throw new IllegalArgumentException("Undefined position: " + i10);
    }

    public void m(oi.q qVar) {
        this.f58047c = qVar;
    }

    public void n() {
        if (!i()) {
            this.f58046b = "Warning state active.";
            this.f58045a.setErrorIndex(f());
        }
        this.f58048d = true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("[position=");
        sb2.append(f());
        sb2.append(", error-index=");
        sb2.append(c());
        sb2.append(", error-message=\"");
        sb2.append(this.f58046b);
        sb2.append(Typography.quote);
        if (this.f58048d) {
            sb2.append(", warning-active");
        }
        if (this.f58047c != null) {
            sb2.append(", raw-values=");
            sb2.append(this.f58047c);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public s(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Undefined: " + i10);
        }
        this.f58045a = new ParsePosition(i10);
        this.f58046b = "";
        this.f58047c = null;
        this.f58048d = false;
    }
}
