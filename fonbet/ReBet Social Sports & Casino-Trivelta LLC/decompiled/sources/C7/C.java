package C7;

import A7.C1025d;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.imagepipeline.producers.C3017a;
import com.facebook.imagepipeline.producers.C3023g;
import com.facebook.imagepipeline.producers.C3024h;
import com.facebook.imagepipeline.producers.C3025i;
import com.facebook.imagepipeline.producers.C3026j;
import com.facebook.imagepipeline.producers.C3027k;
import com.facebook.imagepipeline.producers.C3028l;
import com.facebook.imagepipeline.producers.C3031o;
import com.facebook.imagepipeline.producers.C3032p;
import com.facebook.imagepipeline.producers.C3034s;
import com.facebook.imagepipeline.producers.C3037v;
import com.facebook.imagepipeline.producers.C3038w;
import com.facebook.imagepipeline.producers.C3040y;
import com.facebook.imagepipeline.producers.C3041z;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.X;
import com.facebook.imagepipeline.producers.Y;
import com.facebook.imagepipeline.producers.a0;
import com.facebook.imagepipeline.producers.b0;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.i0;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.producers.n0;
import com.facebook.imagepipeline.producers.o0;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.r0;
import com.facebook.imagepipeline.producers.t0;
import com.facebook.imagepipeline.producers.u0;
import z7.AbstractC6940d;

/* loaded from: classes2.dex */
public class C {

    /* renamed from: a, reason: collision with root package name */
    public ContentResolver f1178a;

    /* renamed from: b, reason: collision with root package name */
    public Resources f1179b;

    /* renamed from: c, reason: collision with root package name */
    public AssetManager f1180c;

    /* renamed from: d, reason: collision with root package name */
    public final G6.a f1181d;

    /* renamed from: e, reason: collision with root package name */
    public final F7.c f1182e;

    /* renamed from: f, reason: collision with root package name */
    public final F7.e f1183f;

    /* renamed from: g, reason: collision with root package name */
    public final EnumC1050n f1184g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1185h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1186i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC1052p f1187j;

    /* renamed from: k, reason: collision with root package name */
    public final G6.i f1188k;

    /* renamed from: l, reason: collision with root package name */
    public final D6.n f1189l;

    /* renamed from: m, reason: collision with root package name */
    public final A7.x f1190m;

    /* renamed from: n, reason: collision with root package name */
    public final A7.x f1191n;

    /* renamed from: o, reason: collision with root package name */
    public final A7.k f1192o;

    /* renamed from: p, reason: collision with root package name */
    public final C1025d f1193p;

    /* renamed from: q, reason: collision with root package name */
    public final C1025d f1194q;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC6940d f1195r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1196s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1197t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1198u;

    /* renamed from: v, reason: collision with root package name */
    public final C1037a f1199v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1200w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f1201x;

    public C(Context context, G6.a aVar, F7.c cVar, F7.e eVar, EnumC1050n enumC1050n, boolean z10, boolean z11, InterfaceC1052p interfaceC1052p, G6.i iVar, A7.x xVar, A7.x xVar2, D6.n nVar, A7.k kVar, AbstractC6940d abstractC6940d, int i10, int i11, boolean z12, int i12, C1037a c1037a, boolean z13, int i13) {
        this.f1178a = context.getApplicationContext().getContentResolver();
        this.f1179b = context.getApplicationContext().getResources();
        this.f1180c = context.getApplicationContext().getAssets();
        this.f1181d = aVar;
        this.f1182e = cVar;
        this.f1183f = eVar;
        this.f1184g = enumC1050n;
        this.f1185h = z10;
        this.f1186i = z11;
        this.f1187j = interfaceC1052p;
        this.f1188k = iVar;
        this.f1191n = xVar;
        this.f1190m = xVar2;
        this.f1189l = nVar;
        this.f1192o = kVar;
        this.f1195r = abstractC6940d;
        this.f1193p = new C1025d(i13);
        this.f1194q = new C1025d(i13);
        this.f1196s = i10;
        this.f1197t = i11;
        this.f1198u = z12;
        this.f1200w = i12;
        this.f1199v = c1037a;
        this.f1201x = z13;
    }

    public static C3017a a(d0 d0Var) {
        return new C3017a(d0Var);
    }

    public static C3028l h(d0 d0Var, d0 d0Var2) {
        return new C3028l(d0Var, d0Var2);
    }

    public a0 A(d0 d0Var) {
        return new a0(this.f1191n, this.f1192o, d0Var);
    }

    public b0 B(d0 d0Var) {
        return new b0(d0Var, this.f1195r, this.f1187j.e());
    }

    public i0 C() {
        return new i0(this.f1187j.f(), this.f1188k, this.f1178a);
    }

    public k0 D(d0 d0Var, boolean z10, O7.d dVar) {
        return new k0(this.f1187j.e(), this.f1188k, d0Var, z10, dVar);
    }

    public n0 E(d0 d0Var) {
        return new n0(d0Var);
    }

    public r0 F(d0 d0Var) {
        return new r0(5, this.f1187j.a(), d0Var);
    }

    public t0 G(u0[] u0VarArr) {
        return new t0(u0VarArr);
    }

    public d0 b(d0 d0Var, p0 p0Var) {
        return new o0(d0Var, p0Var);
    }

    public C3023g c(d0 d0Var) {
        return new C3023g(this.f1191n, this.f1192o, d0Var);
    }

    public C3024h d(d0 d0Var) {
        return new C3024h(this.f1192o, d0Var);
    }

    public C3025i e(d0 d0Var) {
        return new C3025i(this.f1191n, this.f1192o, d0Var);
    }

    public C3026j f(d0 d0Var) {
        return new C3026j(d0Var, this.f1196s, this.f1197t, this.f1198u);
    }

    public C3027k g(d0 d0Var) {
        return new C3027k(this.f1190m, this.f1189l, this.f1192o, this.f1193p, this.f1194q, d0Var);
    }

    public C3031o i() {
        return new C3031o(this.f1188k);
    }

    public C3032p j(d0 d0Var) {
        return new C3032p(this.f1181d, this.f1187j.d(), this.f1182e, this.f1183f, this.f1184g, this.f1185h, this.f1186i, d0Var, this.f1200w, this.f1199v, null, D6.o.f2570b);
    }

    public C3034s k(d0 d0Var) {
        return new C3034s(d0Var, this.f1187j.c());
    }

    public C3037v l(d0 d0Var) {
        return new C3037v(this.f1189l, this.f1192o, d0Var);
    }

    public C3038w m(d0 d0Var) {
        return new C3038w(this.f1189l, this.f1192o, d0Var);
    }

    public C3040y n(d0 d0Var) {
        return new C3040y(this.f1192o, this.f1201x, d0Var);
    }

    public d0 o(d0 d0Var) {
        return new C3041z(this.f1190m, this.f1192o, d0Var);
    }

    public com.facebook.imagepipeline.producers.A p(d0 d0Var) {
        return new com.facebook.imagepipeline.producers.A(this.f1189l, this.f1192o, this.f1193p, this.f1194q, d0Var);
    }

    public com.facebook.imagepipeline.producers.H q() {
        return new com.facebook.imagepipeline.producers.H(this.f1187j.f(), this.f1188k, this.f1180c);
    }

    public com.facebook.imagepipeline.producers.I r() {
        return new com.facebook.imagepipeline.producers.I(this.f1187j.f(), this.f1188k, this.f1178a);
    }

    public com.facebook.imagepipeline.producers.J s() {
        return new com.facebook.imagepipeline.producers.J(this.f1187j.f(), this.f1188k, this.f1178a);
    }

    public LocalExifThumbnailProducer t() {
        return new LocalExifThumbnailProducer(this.f1187j.g(), this.f1188k, this.f1178a);
    }

    public com.facebook.imagepipeline.producers.M u() {
        return new com.facebook.imagepipeline.producers.M(this.f1187j.f(), this.f1188k);
    }

    public com.facebook.imagepipeline.producers.N v() {
        return new com.facebook.imagepipeline.producers.N(this.f1187j.f(), this.f1188k, this.f1179b);
    }

    public com.facebook.imagepipeline.producers.S w() {
        return new com.facebook.imagepipeline.producers.S(this.f1187j.e(), this.f1178a);
    }

    public com.facebook.imagepipeline.producers.T x() {
        return new com.facebook.imagepipeline.producers.T(this.f1187j.f(), this.f1178a);
    }

    public d0 y(X x10) {
        return new com.facebook.imagepipeline.producers.W(this.f1188k, this.f1181d, x10);
    }

    public Y z(d0 d0Var) {
        return new Y(this.f1189l, this.f1192o, this.f1188k, this.f1181d, d0Var);
    }
}
