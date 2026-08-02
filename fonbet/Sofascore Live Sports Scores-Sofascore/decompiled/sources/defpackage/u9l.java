package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class u9l {
    public static final x9l b;
    public final x9l a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 36 ? new k9l() : i >= 35 ? new j9l() : i >= 34 ? new i9l() : i >= 31 ? new h9l() : i >= 30 ? new g9l() : i >= 29 ? new f9l() : new e9l()).b().a.a().a.b().a.c();
    }

    public u9l(x9l x9lVar) {
        this.a = x9lVar;
    }

    public x9l a() {
        return this.a;
    }

    public x9l b() {
        return this.a;
    }

    public x9l c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9l)) {
            return false;
        }
        u9l u9lVar = (u9l) obj;
        return t() == u9lVar.t() && s() == u9lVar.s() && Objects.equals(n(), u9lVar.n()) && Objects.equals(l(), u9lVar.l()) && Objects.equals(h(), u9lVar.h());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public List<Rect> g(int i) {
        return Collections.EMPTY_LIST;
    }

    public e55 h() {
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(t()), Boolean.valueOf(s()), n(), l(), h());
    }

    public u4a i(int i) {
        return u4a.e;
    }

    public u4a j(int i) {
        if ((i & 8) == 0) {
            return u4a.e;
        }
        a70.p("Unable to query the maximum insets for IME");
        return null;
    }

    public u4a k() {
        return n();
    }

    public u4a l() {
        return u4a.e;
    }

    public u4a m() {
        return n();
    }

    public u4a n() {
        return u4a.e;
    }

    public u4a o() {
        return n();
    }

    public x9l r(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public boolean u(int i) {
        return true;
    }

    public void q() {
    }

    public void A(int i) {
    }

    public void B(Rect[][] rectArr) {
    }

    public void C(Rect[][] rectArr) {
    }

    public void d(View view) {
    }

    public void e(x9l x9lVar) {
    }

    public void p(View view) {
    }

    public void v(h55 h55Var) {
    }

    public void w(u4a[] u4aVarArr) {
    }

    public void x(u4a u4aVar) {
    }

    public void y(x9l x9lVar) {
    }

    public void z(u4a u4aVar) {
    }
}
