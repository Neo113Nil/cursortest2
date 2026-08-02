package com.vk.superapp;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.navigation.marked.FragmentWithGlobalSearch$EntryMethod;
import com.vk.superapp.SuperAppFeatures;
import com.vk.superapp.api.dto.menu.QueueParams;
import com.vk.superapp.api.dto.menu.SuperAppAnimationConfig;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import java.util.List;
import xsna.aan0;
import xsna.cbn0;
import xsna.dlj0;
import xsna.e20;
import xsna.enx0;
import xsna.it80;
import xsna.k9n0;
import xsna.m6r0;
import xsna.m7n0;
import xsna.m9n0;
import xsna.n9n0;
import xsna.o7n0;
import xsna.ocn0;
import xsna.qnx0;
import xsna.s3q0;
import xsna.ww50;
import xsna.y3l0;

/* compiled from: SuperAppBridgeStub.kt */
/* loaded from: classes11.dex */
public final class a implements o7n0 {
    public static final a a = new a();
    public static final c b = new c();
    public static final b c = new b();
    public static final g d = new g();
    public static final C1851a e = new C1851a();
    public static final h f = new h();
    public static final d g = new d();
    public static final e h = new e();
    public static final f i = new f();

    /* compiled from: SuperAppBridgeStub.kt */
    /* renamed from: com.vk.superapp.a$a, reason: collision with other inner class name */
    public static final class C1851a implements m7n0 {
        @Override // xsna.m7n0
        public final m6r0 getAccount() {
            return new m6r0();
        }
    }

    /* compiled from: SuperAppBridgeStub.kt */
    public static final class c implements SuperAppFeatures {
        @Override // com.vk.superapp.SuperAppFeatures
        public final String a(SuperAppFeatures.RequestName requestName) {
            return "";
        }

        @Override // com.vk.superapp.SuperAppFeatures
        public final String getSupportedFeatures() {
            return "";
        }
    }

    /* compiled from: SuperAppBridgeStub.kt */
    public static final class e implements m9n0 {
        @Override // xsna.m9n0
        public final int a(String str) {
            return 0;
        }

        @Override // xsna.m9n0
        public final int b(String str) {
            return 0;
        }

        @Override // xsna.m9n0
        public final boolean c(ww50<?> ww50Var, String str) {
            return false;
        }

        @Override // xsna.m9n0
        public final boolean d(String str) {
            return false;
        }

        @Override // xsna.m9n0
        public final String e(Context context, String str) {
            return null;
        }

        @Override // xsna.m9n0
        public final dlj0 f() {
            return new dlj0(0);
        }
    }

    @Override // xsna.o7n0
    public final SuperAppFeatures R() {
        return b;
    }

    @Override // xsna.o7n0
    public final cbn0 a() {
        return d;
    }

    @Override // xsna.o7n0
    public final ocn0 b() {
        return f;
    }

    @Override // xsna.o7n0
    public final m7n0 c() {
        return e;
    }

    @Override // xsna.o7n0
    public final k9n0 d() {
        return g;
    }

    @Override // xsna.o7n0
    public final m9n0 e() {
        return h;
    }

    @Override // xsna.o7n0
    public final aan0 f() {
        return i;
    }

    @Override // xsna.o7n0
    public final com.vk.superapp.b getCache() {
        return c;
    }

    /* compiled from: SuperAppBridgeStub.kt */
    public static final class b implements com.vk.superapp.b {
        public final g0 a;
        public final g0 b;
        public final g0 c;
        public final g0 d;
        public final g0 e;
        public final g0 f;

        public b() {
            g0 g0Var = g0.b;
            this.a = g0Var;
            this.b = g0Var;
            this.c = g0Var;
            this.d = g0Var;
            this.e = g0Var;
            this.f = g0Var;
        }

        @Override // com.vk.superapp.b
        public final q<it80<Throwable>> A() {
            return this.d;
        }

        @Override // com.vk.superapp.b
        public final q<Boolean> B() {
            return this.c;
        }

        @Override // com.vk.superapp.b
        public final boolean C() {
            return false;
        }

        @Override // com.vk.superapp.b
        public final q<QueueParams> F() {
            return this.e;
        }

        @Override // com.vk.superapp.b
        public final String a(SuperAppFeatures.RequestName requestName) {
            return null;
        }

        @Override // com.vk.superapp.b
        public final boolean b(SuperAppWidget superAppWidget) {
            return false;
        }

        @Override // com.vk.superapp.b
        public final q<it80<n9n0>> c() {
            return this.b;
        }

        @Override // com.vk.superapp.b
        public final boolean e() {
            return false;
        }

        @Override // com.vk.superapp.b
        public final q<it80<n9n0>> f(String str) {
            return g0.b;
        }

        @Override // com.vk.superapp.b
        public final SuperAppAnimationConfig m() {
            return null;
        }

        @Override // com.vk.superapp.b
        public final q<SuperAppAnimationConfig> o() {
            return this.f;
        }

        @Override // com.vk.superapp.b
        public final q<s3q0> v() {
            return this.a;
        }

        @Override // com.vk.superapp.b
        public final boolean x() {
            return false;
        }

        @Override // com.vk.superapp.b
        public final n9n0 z() {
            return null;
        }

        @Override // com.vk.superapp.b
        public final void k() {
        }

        @Override // com.vk.superapp.b
        public final void n() {
        }

        @Override // com.vk.superapp.b
        public final void u() {
        }

        @Override // com.vk.superapp.b
        public final void w() {
        }

        @Override // com.vk.superapp.b
        public final void D(SuperAppWidget superAppWidget) {
        }

        @Override // com.vk.superapp.b
        public final void E(SuperAppWidget superAppWidget) {
        }

        @Override // com.vk.superapp.b
        public final void d(List<? extends MiniWidgetItem> list) {
        }

        @Override // com.vk.superapp.b
        public final void g(SuperAppWidget superAppWidget) {
        }

        @Override // com.vk.superapp.b
        public final void h(List<String> list) {
        }

        @Override // com.vk.superapp.b
        public final void i(List<qnx0> list) {
        }

        @Override // com.vk.superapp.b
        public final void j(List list) {
        }

        @Override // com.vk.superapp.b
        public final void l(long j) {
        }

        @Override // com.vk.superapp.b
        public final void r(String str) {
        }

        @Override // com.vk.superapp.b
        public final void s(boolean z) {
        }

        @Override // com.vk.superapp.b
        public final void t(String str) {
        }

        @Override // com.vk.superapp.b
        public final void y(String str) {
        }

        @Override // com.vk.superapp.b
        public final void p(String str, enx0 enx0Var) {
        }

        @Override // com.vk.superapp.b
        public final void q(String str, boolean z) {
        }
    }

    /* compiled from: SuperAppBridgeStub.kt */
    public static final class f implements aan0 {
        @Override // xsna.aan0
        public final void a(WebApiApplication webApiApplication) {
        }

        @Override // xsna.aan0
        public final void b(long j) {
        }
    }

    /* compiled from: SuperAppBridgeStub.kt */
    public static final class g implements cbn0 {
        @Override // xsna.cbn0
        public final void e(FragmentActivity fragmentActivity) {
        }

        @Override // xsna.cbn0
        public final void h(Context context) {
        }

        @Override // xsna.cbn0
        public final void f(FragmentActivity fragmentActivity, FragmentWithGlobalSearch$EntryMethod fragmentWithGlobalSearch$EntryMethod) {
        }

        @Override // xsna.cbn0
        public final void g(ww50<?> ww50Var, String str) {
        }

        @Override // xsna.cbn0
        public final void a(Context context, long j, String str) {
        }

        @Override // xsna.cbn0
        public final void b(Context context, long j, String str) {
        }

        @Override // xsna.cbn0
        public final void d(Context context, WebApiApplication webApiApplication, String str, Integer num, UserId userId, String str2) {
        }
    }

    /* compiled from: SuperAppBridgeStub.kt */
    public static final class h implements ocn0 {
        @Override // xsna.ocn0
        public final void a(String str) {
        }
    }

    /* compiled from: SuperAppBridgeStub.kt */
    public static final class d implements k9n0 {
        @Override // xsna.k9n0
        public final boolean b(Context context) {
            return false;
        }

        @Override // xsna.k9n0
        public final boolean c(Context context) {
            return false;
        }

        @Override // xsna.k9n0
        public final void a(Context context, y3l0 y3l0Var, e20 e20Var) {
        }
    }
}
