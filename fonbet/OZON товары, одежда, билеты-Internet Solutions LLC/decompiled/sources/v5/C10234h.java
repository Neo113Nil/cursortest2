package v5;

import A5.k;
import Kk.C3532b;
import We.z;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7705l;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import m5.C8079b;
import n5.g;
import org.jetbrains.annotations.NotNull;
import p5.h;
import t5.InterfaceC9758c;
import v5.C10240n;
import w5.C10430b;
import w5.C10432d;
import w5.C10433e;
import w5.C10435g;
import w5.EnumC10431c;
import w5.EnumC10434f;
import w5.InterfaceC10436h;
import w5.InterfaceC10439k;
import x5.C10657a;
import x5.InterfaceC10658b;
import x5.InterfaceC10659c;
import xe.I;
import z5.InterfaceC10985c;

/* renamed from: v5.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10234h {

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private final AbstractC5434v f102166A;

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private final InterfaceC10436h f102167B;

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final EnumC10434f f102168C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final C10240n f102169D;

    /* renamed from: E, reason: collision with root package name */
    private final InterfaceC9758c.b f102170E;

    /* renamed from: F, reason: collision with root package name */
    private final Integer f102171F;

    /* renamed from: G, reason: collision with root package name */
    private final Drawable f102172G;

    /* renamed from: H, reason: collision with root package name */
    private final Integer f102173H;

    /* renamed from: I, reason: collision with root package name */
    private final Drawable f102174I;

    /* renamed from: J, reason: collision with root package name */
    private final Integer f102175J;

    /* renamed from: K, reason: collision with root package name */
    private final Drawable f102176K;

    /* renamed from: L, reason: collision with root package name */
    @NotNull
    private final C10230d f102177L;

    /* renamed from: M, reason: collision with root package name */
    @NotNull
    private final C10229c f102178M;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f102179a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f102180b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10658b f102181c;

    /* renamed from: d, reason: collision with root package name */
    private final b f102182d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC9758c.b f102183e;

    /* renamed from: f, reason: collision with root package name */
    private final String f102184f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Bitmap.Config f102185g;

    /* renamed from: h, reason: collision with root package name */
    private final ColorSpace f102186h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final EnumC10431c f102187i;

    /* renamed from: j, reason: collision with root package name */
    private final Pair<h.a<?>, Class<?>> f102188j;

    /* renamed from: k, reason: collision with root package name */
    private final g.a f102189k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final List<y5.b> f102190l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final InterfaceC10985c f102191m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final z f102192n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final C10244r f102193o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f102194p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f102195q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f102196r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f102197s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final EnumC10228b f102198t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final EnumC10228b f102199u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final EnumC10228b f102200v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final I f102201w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final I f102202x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final I f102203y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private final I f102204z;

    /* renamed from: v5.h$b */
    public interface b {
        default void a(@NotNull C10234h c10234h) {
        }

        default void b(@NotNull C10234h c10234h, @NotNull C10232f c10232f) {
        }

        default void c(@NotNull C10234h c10234h, @NotNull C10243q c10243q) {
        }
    }

    private C10234h() {
        throw null;
    }

    public C10234h(Context context, Object obj, InterfaceC10658b interfaceC10658b, b bVar, InterfaceC9758c.b bVar2, String str, Bitmap.Config config, ColorSpace colorSpace, EnumC10431c enumC10431c, Pair pair, g.a aVar, List list, InterfaceC10985c interfaceC10985c, z zVar, C10244r c10244r, boolean z11, boolean z12, boolean z13, boolean z14, EnumC10228b enumC10228b, EnumC10228b enumC10228b2, EnumC10228b enumC10228b3, I i11, I i12, I i13, I i14, AbstractC5434v abstractC5434v, InterfaceC10436h interfaceC10436h, EnumC10434f enumC10434f, C10240n c10240n, InterfaceC9758c.b bVar3, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, C10230d c10230d, C10229c c10229c) {
        this.f102179a = context;
        this.f102180b = obj;
        this.f102181c = interfaceC10658b;
        this.f102182d = bVar;
        this.f102183e = bVar2;
        this.f102184f = str;
        this.f102185g = config;
        this.f102186h = colorSpace;
        this.f102187i = enumC10431c;
        this.f102188j = pair;
        this.f102189k = aVar;
        this.f102190l = list;
        this.f102191m = interfaceC10985c;
        this.f102192n = zVar;
        this.f102193o = c10244r;
        this.f102194p = z11;
        this.f102195q = z12;
        this.f102196r = z13;
        this.f102197s = z14;
        this.f102198t = enumC10228b;
        this.f102199u = enumC10228b2;
        this.f102200v = enumC10228b3;
        this.f102201w = i11;
        this.f102202x = i12;
        this.f102203y = i13;
        this.f102204z = i14;
        this.f102166A = abstractC5434v;
        this.f102167B = interfaceC10436h;
        this.f102168C = enumC10434f;
        this.f102169D = c10240n;
        this.f102170E = bVar3;
        this.f102171F = num;
        this.f102172G = drawable;
        this.f102173H = num2;
        this.f102174I = drawable2;
        this.f102175J = num3;
        this.f102176K = drawable3;
        this.f102177L = c10230d;
        this.f102178M = c10229c;
    }

    public static a Q(C10234h c10234h) {
        Context context = c10234h.f102179a;
        c10234h.getClass();
        return new a(c10234h, context);
    }

    public final b A() {
        return this.f102182d;
    }

    public final InterfaceC9758c.b B() {
        return this.f102183e;
    }

    @NotNull
    public final EnumC10228b C() {
        return this.f102198t;
    }

    @NotNull
    public final EnumC10228b D() {
        return this.f102200v;
    }

    @NotNull
    public final C10240n E() {
        return this.f102169D;
    }

    public final Drawable F() {
        this.f102178M.getClass();
        return A5.i.c(this, this.f102172G, this.f102171F, null);
    }

    public final InterfaceC9758c.b G() {
        return this.f102170E;
    }

    @NotNull
    public final EnumC10431c H() {
        return this.f102187i;
    }

    public final boolean I() {
        return this.f102197s;
    }

    @NotNull
    public final EnumC10434f J() {
        return this.f102168C;
    }

    @NotNull
    public final InterfaceC10436h K() {
        return this.f102167B;
    }

    @NotNull
    public final C10244r L() {
        return this.f102193o;
    }

    public final InterfaceC10658b M() {
        return this.f102181c;
    }

    @NotNull
    public final I N() {
        return this.f102204z;
    }

    @NotNull
    public final List<y5.b> O() {
        return this.f102190l;
    }

    @NotNull
    public final InterfaceC10985c P() {
        return this.f102191m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10234h)) {
            return false;
        }
        C10234h c10234h = (C10234h) obj;
        return Intrinsics.d(this.f102179a, c10234h.f102179a) && Intrinsics.d(this.f102180b, c10234h.f102180b) && Intrinsics.d(this.f102181c, c10234h.f102181c) && Intrinsics.d(this.f102182d, c10234h.f102182d) && Intrinsics.d(this.f102183e, c10234h.f102183e) && Intrinsics.d(this.f102184f, c10234h.f102184f) && this.f102185g == c10234h.f102185g && Intrinsics.d(this.f102186h, c10234h.f102186h) && this.f102187i == c10234h.f102187i && Intrinsics.d(this.f102188j, c10234h.f102188j) && Intrinsics.d(this.f102189k, c10234h.f102189k) && Intrinsics.d(this.f102190l, c10234h.f102190l) && Intrinsics.d(this.f102191m, c10234h.f102191m) && Intrinsics.d(this.f102192n, c10234h.f102192n) && Intrinsics.d(this.f102193o, c10234h.f102193o) && this.f102194p == c10234h.f102194p && this.f102195q == c10234h.f102195q && this.f102196r == c10234h.f102196r && this.f102197s == c10234h.f102197s && this.f102198t == c10234h.f102198t && this.f102199u == c10234h.f102199u && this.f102200v == c10234h.f102200v && Intrinsics.d(this.f102201w, c10234h.f102201w) && Intrinsics.d(this.f102202x, c10234h.f102202x) && Intrinsics.d(this.f102203y, c10234h.f102203y) && Intrinsics.d(this.f102204z, c10234h.f102204z) && Intrinsics.d(this.f102170E, c10234h.f102170E) && Intrinsics.d(this.f102171F, c10234h.f102171F) && Intrinsics.d(this.f102172G, c10234h.f102172G) && Intrinsics.d(this.f102173H, c10234h.f102173H) && Intrinsics.d(this.f102174I, c10234h.f102174I) && Intrinsics.d(this.f102175J, c10234h.f102175J) && Intrinsics.d(this.f102176K, c10234h.f102176K) && Intrinsics.d(this.f102166A, c10234h.f102166A) && Intrinsics.d(this.f102167B, c10234h.f102167B) && this.f102168C == c10234h.f102168C && Intrinsics.d(this.f102169D, c10234h.f102169D) && Intrinsics.d(this.f102177L, c10234h.f102177L) && Intrinsics.d(this.f102178M, c10234h.f102178M);
    }

    public final boolean g() {
        return this.f102194p;
    }

    public final boolean h() {
        return this.f102195q;
    }

    public final int hashCode() {
        int c11 = H00.a.c(this.f102179a.hashCode() * 31, 31, this.f102180b);
        InterfaceC10658b interfaceC10658b = this.f102181c;
        int hashCode = (c11 + (interfaceC10658b != null ? interfaceC10658b.hashCode() : 0)) * 31;
        b bVar = this.f102182d;
        int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        InterfaceC9758c.b bVar2 = this.f102183e;
        int hashCode3 = (hashCode2 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        String str = this.f102184f;
        int hashCode4 = (this.f102185g.hashCode() + ((hashCode3 + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        ColorSpace colorSpace = this.f102186h;
        int hashCode5 = (this.f102187i.hashCode() + ((hashCode4 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31;
        Pair<h.a<?>, Class<?>> pair = this.f102188j;
        int hashCode6 = (hashCode5 + (pair != null ? pair.hashCode() : 0)) * 31;
        g.a aVar = this.f102189k;
        int hashCode7 = (this.f102169D.hashCode() + ((this.f102168C.hashCode() + ((this.f102167B.hashCode() + ((this.f102166A.hashCode() + ((this.f102204z.hashCode() + ((this.f102203y.hashCode() + ((this.f102202x.hashCode() + ((this.f102201w.hashCode() + ((this.f102200v.hashCode() + ((this.f102199u.hashCode() + ((this.f102198t.hashCode() + C3532b.a(C3532b.a(C3532b.a(C3532b.a((this.f102193o.hashCode() + ((this.f102192n.hashCode() + ((this.f102191m.hashCode() + G.g.b((hashCode6 + (aVar != null ? aVar.hashCode() : 0)) * 31, 31, this.f102190l)) * 31)) * 31)) * 31, 31, this.f102194p), 31, this.f102195q), 31, this.f102196r), 31, this.f102197s)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        InterfaceC9758c.b bVar3 = this.f102170E;
        int hashCode8 = (hashCode7 + (bVar3 != null ? bVar3.hashCode() : 0)) * 31;
        Integer num = this.f102171F;
        int hashCode9 = (hashCode8 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.f102172G;
        int hashCode10 = (hashCode9 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.f102173H;
        int hashCode11 = (hashCode10 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f102174I;
        int hashCode12 = (hashCode11 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Integer num3 = this.f102175J;
        int hashCode13 = (hashCode12 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f102176K;
        int hashCode14 = drawable3 != null ? drawable3.hashCode() : 0;
        return this.f102178M.hashCode() + ((this.f102177L.hashCode() + ((hashCode13 + hashCode14) * 31)) * 31);
    }

    public final boolean i() {
        return this.f102196r;
    }

    @NotNull
    public final Bitmap.Config j() {
        return this.f102185g;
    }

    public final ColorSpace k() {
        return this.f102186h;
    }

    @NotNull
    public final Context l() {
        return this.f102179a;
    }

    @NotNull
    public final Object m() {
        return this.f102180b;
    }

    @NotNull
    public final I n() {
        return this.f102203y;
    }

    public final g.a o() {
        return this.f102189k;
    }

    @NotNull
    public final C10229c p() {
        return this.f102178M;
    }

    @NotNull
    public final C10230d q() {
        return this.f102177L;
    }

    public final String r() {
        return this.f102184f;
    }

    @NotNull
    public final EnumC10228b s() {
        return this.f102199u;
    }

    public final Drawable t() {
        this.f102178M.getClass();
        return A5.i.c(this, this.f102174I, this.f102173H, null);
    }

    public final Drawable u() {
        this.f102178M.getClass();
        return A5.i.c(this, this.f102176K, this.f102175J, null);
    }

    @NotNull
    public final I v() {
        return this.f102202x;
    }

    public final Pair<h.a<?>, Class<?>> w() {
        return this.f102188j;
    }

    @NotNull
    public final z x() {
        return this.f102192n;
    }

    @NotNull
    public final I y() {
        return this.f102201w;
    }

    @NotNull
    public final AbstractC5434v z() {
        return this.f102166A;
    }

    /* renamed from: v5.h$a */
    public static final class a {

        /* renamed from: A, reason: collision with root package name */
        private I f102205A;

        /* renamed from: B, reason: collision with root package name */
        private C10240n.a f102206B;

        /* renamed from: C, reason: collision with root package name */
        private InterfaceC9758c.b f102207C;

        /* renamed from: D, reason: collision with root package name */
        private Integer f102208D;

        /* renamed from: E, reason: collision with root package name */
        private Drawable f102209E;

        /* renamed from: F, reason: collision with root package name */
        private Integer f102210F;

        /* renamed from: G, reason: collision with root package name */
        private Drawable f102211G;

        /* renamed from: H, reason: collision with root package name */
        private Integer f102212H;

        /* renamed from: I, reason: collision with root package name */
        private Drawable f102213I;

        /* renamed from: J, reason: collision with root package name */
        private AbstractC5434v f102214J;

        /* renamed from: K, reason: collision with root package name */
        private InterfaceC10436h f102215K;

        /* renamed from: L, reason: collision with root package name */
        private EnumC10434f f102216L;

        /* renamed from: M, reason: collision with root package name */
        private AbstractC5434v f102217M;

        /* renamed from: N, reason: collision with root package name */
        private InterfaceC10436h f102218N;

        /* renamed from: O, reason: collision with root package name */
        private EnumC10434f f102219O;

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Context f102220a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private C10229c f102221b;

        /* renamed from: c, reason: collision with root package name */
        private Object f102222c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC10658b f102223d;

        /* renamed from: e, reason: collision with root package name */
        private b f102224e;

        /* renamed from: f, reason: collision with root package name */
        private InterfaceC9758c.b f102225f;

        /* renamed from: g, reason: collision with root package name */
        private String f102226g;

        /* renamed from: h, reason: collision with root package name */
        private Bitmap.Config f102227h;

        /* renamed from: i, reason: collision with root package name */
        private ColorSpace f102228i;

        /* renamed from: j, reason: collision with root package name */
        private EnumC10431c f102229j;

        /* renamed from: k, reason: collision with root package name */
        private Pair<? extends h.a<?>, ? extends Class<?>> f102230k;

        /* renamed from: l, reason: collision with root package name */
        private g.a f102231l;

        /* renamed from: m, reason: collision with root package name */
        @NotNull
        private List<? extends y5.b> f102232m;

        /* renamed from: n, reason: collision with root package name */
        private InterfaceC10985c f102233n;

        /* renamed from: o, reason: collision with root package name */
        private z.a f102234o;

        /* renamed from: p, reason: collision with root package name */
        private LinkedHashMap f102235p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f102236q;

        /* renamed from: r, reason: collision with root package name */
        private Boolean f102237r;

        /* renamed from: s, reason: collision with root package name */
        private Boolean f102238s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f102239t;

        /* renamed from: u, reason: collision with root package name */
        private EnumC10228b f102240u;

        /* renamed from: v, reason: collision with root package name */
        private EnumC10228b f102241v;

        /* renamed from: w, reason: collision with root package name */
        private EnumC10228b f102242w;

        /* renamed from: x, reason: collision with root package name */
        private I f102243x;

        /* renamed from: y, reason: collision with root package name */
        private I f102244y;

        /* renamed from: z, reason: collision with root package name */
        private I f102245z;

        public a(@NotNull Context context) {
            this.f102220a = context;
            this.f102221b = A5.i.b();
            this.f102222c = null;
            this.f102223d = null;
            this.f102224e = null;
            this.f102225f = null;
            this.f102226g = null;
            this.f102227h = null;
            this.f102228i = null;
            this.f102229j = null;
            this.f102230k = null;
            this.f102231l = null;
            this.f102232m = K.f71697a;
            this.f102233n = null;
            this.f102234o = null;
            this.f102235p = null;
            this.f102236q = true;
            this.f102237r = null;
            this.f102238s = null;
            this.f102239t = true;
            this.f102240u = null;
            this.f102241v = null;
            this.f102242w = null;
            this.f102243x = null;
            this.f102244y = null;
            this.f102245z = null;
            this.f102205A = null;
            this.f102206B = null;
            this.f102207C = null;
            this.f102208D = null;
            this.f102209E = null;
            this.f102210F = null;
            this.f102211G = null;
            this.f102212H = null;
            this.f102213I = null;
            this.f102214J = null;
            this.f102215K = null;
            this.f102216L = null;
            this.f102217M = null;
            this.f102218N = null;
            this.f102219O = null;
        }

        @NotNull
        public final C10234h a() {
            View view;
            ImageView.ScaleType scaleType;
            Object obj = this.f102222c;
            if (obj == null) {
                obj = C10236j.f102246a;
            }
            Object obj2 = obj;
            InterfaceC10658b interfaceC10658b = this.f102223d;
            b bVar = this.f102224e;
            Bitmap.Config config = this.f102227h;
            if (config == null) {
                config = this.f102221b.b();
            }
            Bitmap.Config config2 = config;
            EnumC10431c enumC10431c = this.f102229j;
            if (enumC10431c == null) {
                enumC10431c = this.f102221b.i();
            }
            EnumC10431c enumC10431c2 = enumC10431c;
            List<? extends y5.b> list = this.f102232m;
            InterfaceC10985c interfaceC10985c = this.f102233n;
            if (interfaceC10985c == null) {
                interfaceC10985c = this.f102221b.k();
            }
            InterfaceC10985c interfaceC10985c2 = interfaceC10985c;
            z.a aVar = this.f102234o;
            z g10 = A5.k.g(aVar != null ? aVar.e() : null);
            LinkedHashMap linkedHashMap = this.f102235p;
            boolean z11 = false;
            C10244r c10244r = linkedHashMap != null ? new C10244r(A5.c.b(linkedHashMap), false ? 1 : 0) : null;
            if (c10244r == null) {
                c10244r = C10244r.f102276b;
            }
            C10244r c10244r2 = c10244r;
            Boolean bool = this.f102237r;
            boolean booleanValue = bool != null ? bool.booleanValue() : this.f102221b.a();
            Boolean bool2 = this.f102238s;
            if (bool2 != null) {
                z11 = bool2.booleanValue();
            } else {
                this.f102221b.getClass();
            }
            boolean z12 = z11;
            EnumC10228b enumC10228b = this.f102240u;
            if (enumC10228b == null) {
                enumC10228b = this.f102221b.g();
            }
            EnumC10228b enumC10228b2 = enumC10228b;
            EnumC10228b enumC10228b3 = this.f102241v;
            if (enumC10228b3 == null) {
                enumC10228b3 = this.f102221b.d();
            }
            EnumC10228b enumC10228b4 = enumC10228b3;
            EnumC10228b enumC10228b5 = this.f102242w;
            if (enumC10228b5 == null) {
                enumC10228b5 = this.f102221b.h();
            }
            EnumC10228b enumC10228b6 = enumC10228b5;
            I i11 = this.f102243x;
            if (i11 == null) {
                i11 = this.f102221b.f();
            }
            I i12 = i11;
            I i13 = this.f102244y;
            if (i13 == null) {
                i13 = this.f102221b.e();
            }
            I i14 = i13;
            I i15 = this.f102245z;
            if (i15 == null) {
                i15 = this.f102221b.c();
            }
            I i16 = i15;
            I i17 = this.f102205A;
            if (i17 == null) {
                i17 = this.f102221b.j();
            }
            I i18 = i17;
            AbstractC5434v abstractC5434v = this.f102214J;
            Context context = this.f102220a;
            if (abstractC5434v == null && (abstractC5434v = this.f102217M) == null) {
                InterfaceC10658b interfaceC10658b2 = this.f102223d;
                Object context2 = interfaceC10658b2 instanceof InterfaceC10659c ? ((InterfaceC10659c) interfaceC10658b2).getView().getContext() : context;
                while (true) {
                    if (context2 instanceof J) {
                        abstractC5434v = ((J) context2).getLifecycle();
                        break;
                    }
                    if (!(context2 instanceof ContextWrapper)) {
                        abstractC5434v = null;
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
                if (abstractC5434v == null) {
                    abstractC5434v = C10233g.f102164b;
                }
            }
            AbstractC5434v abstractC5434v2 = abstractC5434v;
            InterfaceC10436h interfaceC10436h = this.f102215K;
            if (interfaceC10436h == null && (interfaceC10436h = this.f102218N) == null) {
                InterfaceC10658b interfaceC10658b3 = this.f102223d;
                if (interfaceC10658b3 instanceof InterfaceC10659c) {
                    View view2 = ((InterfaceC10659c) interfaceC10658b3).getView();
                    interfaceC10436h = (view2 == null || !((scaleType = ((ImageView) view2).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? new C10433e(view2) : new C10432d(C10435g.f103580c);
                } else {
                    interfaceC10436h = new C10430b(context);
                }
            }
            InterfaceC10436h interfaceC10436h2 = interfaceC10436h;
            EnumC10434f enumC10434f = this.f102216L;
            if (enumC10434f == null && (enumC10434f = this.f102219O) == null) {
                InterfaceC10436h interfaceC10436h3 = this.f102215K;
                InterfaceC10439k interfaceC10439k = interfaceC10436h3 instanceof InterfaceC10439k ? (InterfaceC10439k) interfaceC10436h3 : null;
                if (interfaceC10439k == null || (view = interfaceC10439k.getView()) == null) {
                    InterfaceC10658b interfaceC10658b4 = this.f102223d;
                    InterfaceC10659c interfaceC10659c = interfaceC10658b4 instanceof InterfaceC10659c ? (InterfaceC10659c) interfaceC10658b4 : null;
                    view = interfaceC10659c != null ? interfaceC10659c.getView() : null;
                }
                if (view instanceof ImageView) {
                    int i19 = A5.k.f430d;
                    ImageView.ScaleType scaleType2 = ((ImageView) view).getScaleType();
                    int i21 = scaleType2 == null ? -1 : k.a.f431a[scaleType2.ordinal()];
                    enumC10434f = (i21 == 1 || i21 == 2 || i21 == 3 || i21 == 4) ? EnumC10434f.FIT : EnumC10434f.FILL;
                } else {
                    enumC10434f = EnumC10434f.FIT;
                }
            }
            EnumC10434f enumC10434f2 = enumC10434f;
            C10240n.a aVar2 = this.f102206B;
            C10240n a11 = aVar2 != null ? aVar2.a() : null;
            if (a11 == null) {
                a11 = C10240n.f102263b;
            }
            return new C10234h(this.f102220a, obj2, interfaceC10658b, bVar, this.f102225f, this.f102226g, config2, this.f102228i, enumC10431c2, this.f102230k, this.f102231l, list, interfaceC10985c2, g10, c10244r2, this.f102236q, booleanValue, z12, this.f102239t, enumC10228b2, enumC10228b4, enumC10228b6, i12, i14, i16, i18, abstractC5434v2, interfaceC10436h2, enumC10434f2, a11, this.f102207C, this.f102208D, this.f102209E, this.f102210F, this.f102211G, this.f102212H, this.f102213I, new C10230d(this.f102214J, this.f102215K, this.f102216L, this.f102243x, this.f102244y, this.f102245z, this.f102205A, this.f102233n, this.f102229j, this.f102227h, this.f102237r, this.f102238s, this.f102240u, this.f102241v, this.f102242w), this.f102221b);
        }

        @NotNull
        public final void b(Object obj) {
            this.f102222c = obj;
        }

        @NotNull
        public final void c(@NotNull C10229c c10229c) {
            this.f102221b = c10229c;
            this.f102219O = null;
        }

        @NotNull
        public final void d(b bVar) {
            this.f102224e = bVar;
        }

        @NotNull
        public final void e(@NotNull EnumC10431c enumC10431c) {
            this.f102229j = enumC10431c;
        }

        @NotNull
        public final void f(@NotNull EnumC10434f enumC10434f) {
            this.f102216L = enumC10434f;
        }

        @NotNull
        public final void g(@NotNull InterfaceC10436h interfaceC10436h) {
            this.f102215K = interfaceC10436h;
            this.f102217M = null;
            this.f102218N = null;
            this.f102219O = null;
        }

        @NotNull
        public final void h(@NotNull ImageView imageView) {
            this.f102223d = new C10657a(imageView);
            this.f102217M = null;
            this.f102218N = null;
            this.f102219O = null;
        }

        @NotNull
        public final void i(C8079b c8079b) {
            this.f102223d = c8079b;
            this.f102217M = null;
            this.f102218N = null;
            this.f102219O = null;
        }

        @NotNull
        public final void j(@NotNull y5.b... bVarArr) {
            this.f102232m = A5.c.a(C7705l.f0(bVarArr));
        }

        public a(@NotNull C10234h c10234h, @NotNull Context context) {
            this.f102220a = context;
            this.f102221b = c10234h.p();
            this.f102222c = c10234h.m();
            this.f102223d = c10234h.M();
            this.f102224e = c10234h.A();
            this.f102225f = c10234h.B();
            this.f102226g = c10234h.r();
            this.f102227h = c10234h.q().c();
            this.f102228i = c10234h.k();
            this.f102229j = c10234h.q().k();
            this.f102230k = c10234h.w();
            this.f102231l = c10234h.o();
            this.f102232m = c10234h.O();
            this.f102233n = c10234h.q().o();
            this.f102234o = c10234h.x().h();
            this.f102235p = U.u(c10234h.L().a());
            this.f102236q = c10234h.g();
            this.f102237r = c10234h.q().a();
            this.f102238s = c10234h.q().b();
            this.f102239t = c10234h.I();
            this.f102240u = c10234h.q().i();
            this.f102241v = c10234h.q().e();
            this.f102242w = c10234h.q().j();
            this.f102243x = c10234h.q().g();
            this.f102244y = c10234h.q().f();
            this.f102245z = c10234h.q().d();
            this.f102205A = c10234h.q().n();
            C10240n E11 = c10234h.E();
            E11.getClass();
            this.f102206B = new C10240n.a(E11);
            this.f102207C = c10234h.G();
            this.f102208D = c10234h.f102171F;
            this.f102209E = c10234h.f102172G;
            this.f102210F = c10234h.f102173H;
            this.f102211G = c10234h.f102174I;
            this.f102212H = c10234h.f102175J;
            this.f102213I = c10234h.f102176K;
            this.f102214J = c10234h.q().h();
            this.f102215K = c10234h.q().m();
            this.f102216L = c10234h.q().l();
            if (c10234h.l() == context) {
                this.f102217M = c10234h.z();
                this.f102218N = c10234h.K();
                this.f102219O = c10234h.J();
            } else {
                this.f102217M = null;
                this.f102218N = null;
                this.f102219O = null;
            }
        }
    }
}
