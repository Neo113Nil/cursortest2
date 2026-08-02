package v5;

import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x5.C6796a;
import x5.C6797b;
import x5.C6798c;
import x5.C6799d;
import x5.C6800e;

/* loaded from: classes2.dex */
public abstract class h implements InterfaceC6638a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f67037b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Class f67038a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return CollectionsKt.listOf((Object[]) new h[]{new i(), new g(), new C0936h(), new b(), new c(), new d(), new e(), new f()});
        }

        public a() {
        }
    }

    public static final class b extends h {
        public b() {
            super(FrameLayout.LayoutParams.class, null);
        }

        @Override // v5.InterfaceC6638a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C6796a a(FrameLayout.LayoutParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            return new C6796a(params, 0, 2, null);
        }
    }

    public static final class c extends h {
        public c() {
            super(GridLayout.LayoutParams.class, null);
        }

        @Override // v5.InterfaceC6638a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C6797b a(GridLayout.LayoutParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            return new C6797b(params);
        }
    }

    public static final class d extends h {
        public d() {
            super(LinearLayout.LayoutParams.class, null);
        }

        @Override // v5.InterfaceC6638a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C6798c a(LinearLayout.LayoutParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            return new C6798c(params, 0.0f, null, 6, null);
        }
    }

    public static final class e extends h {
        public e() {
            super(RelativeLayout.LayoutParams.class, null);
        }

        @Override // v5.InterfaceC6638a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C6799d a(RelativeLayout.LayoutParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            return new C6799d(params, null, 2, null);
        }
    }

    public static final class f extends h {
        public f() {
            super(TableLayout.LayoutParams.class, null);
        }

        @Override // v5.InterfaceC6638a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C6800e a(TableLayout.LayoutParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            return new C6800e(params);
        }
    }

    public static final class g extends h {
        public g() {
            super(ViewGroup.LayoutParams.class, null);
        }

        @Override // v5.InterfaceC6638a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public x5.f a(ViewGroup.LayoutParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            return new x5.f(params, null, 0, 0, 14, null);
        }
    }

    /* renamed from: v5.h$h, reason: collision with other inner class name */
    public static final class C0936h extends h {
        public C0936h() {
            super(ViewGroup.MarginLayoutParams.class, null);
        }

        @Override // v5.InterfaceC6638a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public x5.g a(ViewGroup.MarginLayoutParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            return new x5.g(params, 0, 0, 0, 0, 0, 0, 0, 254, null);
        }
    }

    public static final class i extends h {
        public i() {
            super(WindowManager.LayoutParams.class, null);
        }

        @Override // v5.InterfaceC6638a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public x5.h a(WindowManager.LayoutParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            return new x5.h(params, 0, 0.0f, false, 14, null);
        }
    }

    public /* synthetic */ h(Class cls, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls);
    }

    public final Class b() {
        return this.f67038a;
    }

    public h(Class cls) {
        this.f67038a = cls;
    }
}
