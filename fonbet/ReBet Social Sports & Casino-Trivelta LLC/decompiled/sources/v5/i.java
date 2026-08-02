package v5;

import A5.C1013a;
import A5.C1015c;
import A5.C1017e;
import A5.C1018f;
import A5.C1019g;
import A5.C1020h;
import A5.C1021i;
import A5.E;
import A5.H;
import A5.I;
import android.opengl.GLSurfaceView;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.AbsSeekBar;
import android.widget.AdapterView;
import android.widget.AdapterViewAnimator;
import android.widget.AdapterViewFlipper;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.VideoView;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y5.C6855b;

/* loaded from: classes2.dex */
public abstract class i implements InterfaceC6639b {

    /* renamed from: b, reason: collision with root package name */
    public static final j f67039b = new j(null);

    /* renamed from: a, reason: collision with root package name */
    public final Class f67040a;

    public static final class A extends i {
        public A() {
            super(ToggleButton.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public A5.C a(ToggleButton view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new A5.C(view, hierarchyMaskConfiguration, false, 4, null);
        }
    }

    public static final class B extends i {
        public B() {
            super(VideoView.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public A5.D a(VideoView view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new A5.D(view);
        }
    }

    public static final class C extends i {
        public C() {
            super(ViewGroup.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public E a(ViewGroup view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new E(view);
        }
    }

    public static final class D extends i {
        public D() {
            super(WebView.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public I a(WebView view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new I(view);
        }
    }

    /* renamed from: v5.i$a, reason: case insensitive filesystem */
    public static final class C6640a extends i {
        public C6640a() {
            super(AbsListView.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C1013a a(AbsListView view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new C1013a(view, false, false, 0, 0, null, null, 0, 0, 0, 0, 0, false, false, false, false, false, false, 262142, null);
        }
    }

    /* renamed from: v5.i$b, reason: case insensitive filesystem */
    public static final class C6641b extends i {
        public C6641b() {
            super(AbsSeekBar.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C1015c a(AbsSeekBar view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new C1015c(view);
        }
    }

    /* renamed from: v5.i$c, reason: case insensitive filesystem */
    public static final class C6642c extends i {
        public C6642c() {
            super(AdapterViewAnimator.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C1017e a(AdapterViewAnimator view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new C1017e(view, 0, 2, null);
        }
    }

    /* renamed from: v5.i$d, reason: case insensitive filesystem */
    public static final class C6643d extends i {
        public C6643d() {
            super(AdapterView.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C1019g a(AdapterView view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new C1019g(view, 0, 0, 0L, 0, 0, 0, 126, null);
        }
    }

    public static final class e extends i {
        public e() {
            super(AdapterViewFlipper.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C1018f a(AdapterViewFlipper view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new C1018f(view, 0, false, 6, null);
        }
    }

    public static final class f extends i {
        public f() {
            super(View.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public H a(View view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new H(view, null, 0, false, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 0, 0, false, false, false, null, 1048574, null);
        }
    }

    public static final class g extends i {
        public g() {
            super(Button.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C1020h a(Button view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new C1020h(view, hierarchyMaskConfiguration);
        }
    }

    public static final class h extends i {
        public h() {
            super(CheckBox.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C1021i a(CheckBox view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new C1021i(view, hierarchyMaskConfiguration, false, 4, null);
        }
    }

    /* renamed from: v5.i$i, reason: collision with other inner class name */
    public static final class C0937i extends i {
        public C0937i() {
            super(CheckedTextView.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public A5.j a(CheckedTextView view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new A5.j(view, hierarchyMaskConfiguration, false, 4, null);
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return CollectionsKt.listOf((Object[]) new i[]{new f(), new C(), new C6640a(), new C6641b(), new C6642c(), new e(), new C6643d(), new g(), new h(), new C0937i(), new k(), new l(), new m(), new p(), new q(), new r(), new s(), new t(), new u(), new v(), new w(), new y(), new z(), new A(), new o(), new D(), new n(), new B(), new x()});
        }

        public j() {
        }
    }

    public static final class k extends i {
        public k() {
            super(CompoundButton.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public A5.k a(CompoundButton view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new A5.k(view, hierarchyMaskConfiguration);
        }
    }

    public static final class l extends i {
        public l() {
            super(EditText.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public A5.l a(EditText view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new A5.l(view, hierarchyMaskConfiguration, null, 4, null);
        }
    }

    public static final class m extends i {
        public m() {
            super(ExpandableListView.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public A5.m a(ExpandableListView view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new A5.m(view, 0L, 0L, 6, null);
        }
    }

    public static final class n extends i {
        public n() {
            super(GLSurfaceView.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public A5.n a(GLSurfaceView view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new A5.n(view);
        }
    }

    public static final class o extends i {
        public o() {
            super(GridLayout.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public A5.o a(GridLayout view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new A5.o(view, 0, 0, false, false, null, 62, null);
        }
    }

    public static final class p extends i {
        public p() {
            super(GridView.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public A5.p a(GridView view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new A5.p(view, 0, 0, 0, 0, 0, 0, 0, 0, 510, null);
        }
    }

    public static final class q extends i {
        public q() {
            super(ImageView.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public A5.q a(ImageView view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new A5.q(view, null, 0, 0, hierarchyMaskConfiguration, 14, null);
        }
    }

    public static final class r extends i {
        public r() {
            super(ListView.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public A5.s a(ListView view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new A5.s(view, false, false, 0, 0, 0, false, 0, 254, null);
        }
    }

    public static final class s extends i {
        public s() {
            super(ProgressBar.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public A5.t a(ProgressBar view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new A5.t(view, 0, 0, 0, 14, null);
        }
    }

    public static final class t extends i {
        public t() {
            super(RadioButton.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public A5.u a(RadioButton view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new A5.u(view, hierarchyMaskConfiguration, false, 4, null);
        }
    }

    public static final class u extends i {
        public u() {
            super(RadioGroup.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public A5.v a(RadioGroup view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new A5.v(view, 0, 2, null);
        }
    }

    public static final class v extends i {
        public v() {
            super(RatingBar.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public A5.w a(RatingBar view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new A5.w(view, 0.0f, 0.0f, 0, false, 30, null);
        }
    }

    public static final class w extends i {
        public w() {
            super(Spinner.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public A5.x a(Spinner view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new A5.x(view, 0, 0, 0, 0, null, 62, null);
        }
    }

    public static final class x extends i {
        public x() {
            super(SurfaceView.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public A5.y a(SurfaceView view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new A5.y(view);
        }
    }

    public static final class y extends i {
        public y() {
            super(Switch.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public A5.z a(Switch view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new A5.z(view, hierarchyMaskConfiguration, false, 4, null);
        }
    }

    public static final class z extends i {
        public z() {
            super(TextView.class, null);
        }

        @Override // v5.InterfaceC6639b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public A5.A a(TextView view, C6855b hierarchyMaskConfiguration) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
            return new A5.A(view, hierarchyMaskConfiguration, null, 4, null);
        }
    }

    public /* synthetic */ i(Class cls, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls);
    }

    public final Class b() {
        return this.f67040a;
    }

    public i(Class cls) {
        this.f67040a = cls;
    }
}
