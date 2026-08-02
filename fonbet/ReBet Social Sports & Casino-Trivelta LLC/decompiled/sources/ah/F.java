package ah;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class F {

    /* renamed from: k, reason: collision with root package name */
    public static final a f15950k;

    /* renamed from: l, reason: collision with root package name */
    public static final P f15951l;

    /* renamed from: a, reason: collision with root package name */
    public L f15952a;

    /* renamed from: b, reason: collision with root package name */
    public String f15953b;

    /* renamed from: c, reason: collision with root package name */
    public int f15954c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15955d;

    /* renamed from: e, reason: collision with root package name */
    public String f15956e;

    /* renamed from: f, reason: collision with root package name */
    public String f15957f;

    /* renamed from: g, reason: collision with root package name */
    public String f15958g;

    /* renamed from: h, reason: collision with root package name */
    public List f15959h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC2006A f15960i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC2006A f15961j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        f15950k = aVar;
        f15951l = N.c(G.a(aVar));
    }

    public F(L protocol, String host, int i10, String str, String str2, List pathSegments, z parameters, String fragment, boolean z10) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f15952a = protocol;
        this.f15953b = host;
        this.f15954c = i10;
        this.f15955d = z10;
        this.f15956e = str != null ? AbstractC2010b.m(str, false, 1, null) : null;
        this.f15957f = str2 != null ? AbstractC2010b.m(str2, false, 1, null) : null;
        this.f15958g = AbstractC2010b.r(fragment, false, false, null, 7, null);
        List list = pathSegments;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC2010b.p((String) it.next()));
        }
        this.f15959h = arrayList;
        InterfaceC2006A e10 = S.e(parameters);
        this.f15960i = e10;
        this.f15961j = new Q(e10);
    }

    public final void A(String str) {
        this.f15956e = str != null ? AbstractC2010b.m(str, false, 1, null) : null;
    }

    public final void a() {
        if (this.f15953b.length() <= 0 && !Intrinsics.areEqual(this.f15952a.d(), "file")) {
            P p10 = f15951l;
            this.f15953b = p10.g();
            if (Intrinsics.areEqual(this.f15952a, L.f15964c.c())) {
                this.f15952a = p10.k();
            }
            if (this.f15954c == 0) {
                this.f15954c = p10.l();
            }
        }
    }

    public final P b() {
        a();
        return new P(this.f15952a, this.f15953b, this.f15954c, m(), this.f15961j.build(), i(), q(), l(), this.f15955d, c());
    }

    public final String c() {
        Appendable d10;
        a();
        d10 = H.d(this, new StringBuilder(256));
        String sb2 = ((StringBuilder) d10).toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "appendTo(StringBuilder(256)).toString()");
        return sb2;
    }

    public final String d() {
        return this.f15958g;
    }

    public final InterfaceC2006A e() {
        return this.f15960i;
    }

    public final String f() {
        return this.f15957f;
    }

    public final List g() {
        return this.f15959h;
    }

    public final String h() {
        return this.f15956e;
    }

    public final String i() {
        return AbstractC2010b.k(this.f15958g, 0, 0, false, null, 15, null);
    }

    public final String j() {
        return this.f15953b;
    }

    public final InterfaceC2006A k() {
        return this.f15961j;
    }

    public final String l() {
        String str = this.f15957f;
        if (str != null) {
            return AbstractC2010b.i(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final List m() {
        List list = this.f15959h;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC2010b.i((String) it.next(), 0, 0, null, 7, null));
        }
        return arrayList;
    }

    public final int n() {
        return this.f15954c;
    }

    public final L o() {
        return this.f15952a;
    }

    public final boolean p() {
        return this.f15955d;
    }

    public final String q() {
        String str = this.f15956e;
        if (str != null) {
            return AbstractC2010b.i(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final void r(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f15958g = str;
    }

    public final void s(InterfaceC2006A value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f15960i = value;
        this.f15961j = new Q(value);
    }

    public final void t(String str) {
        this.f15957f = str;
    }

    public String toString() {
        Appendable d10;
        d10 = H.d(this, new StringBuilder(256));
        String sb2 = ((StringBuilder) d10).toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "appendTo(StringBuilder(256)).toString()");
        return sb2;
    }

    public final void u(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f15959h = list;
    }

    public final void v(String str) {
        this.f15956e = str;
    }

    public final void w(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f15953b = str;
    }

    public final void x(int i10) {
        this.f15954c = i10;
    }

    public final void y(L l10) {
        Intrinsics.checkNotNullParameter(l10, "<set-?>");
        this.f15952a = l10;
    }

    public final void z(boolean z10) {
        this.f15955d = z10;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ F(ah.L r4, java.lang.String r5, int r6, java.lang.String r7, java.lang.String r8, java.util.List r9, ah.z r10, java.lang.String r11, boolean r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r3 = this;
            r14 = r13 & 1
            if (r14 == 0) goto La
            ah.L$a r4 = ah.L.f15964c
            ah.L r4 = r4.c()
        La:
            r14 = r13 & 2
            java.lang.String r0 = ""
            if (r14 == 0) goto L11
            r5 = r0
        L11:
            r14 = r13 & 4
            r1 = 0
            if (r14 == 0) goto L17
            r6 = r1
        L17:
            r14 = r13 & 8
            r2 = 0
            if (r14 == 0) goto L1d
            r7 = r2
        L1d:
            r14 = r13 & 16
            if (r14 == 0) goto L22
            r8 = r2
        L22:
            r14 = r13 & 32
            if (r14 == 0) goto L2a
            java.util.List r9 = kotlin.collections.CollectionsKt.emptyList()
        L2a:
            r14 = r13 & 64
            if (r14 == 0) goto L34
            ah.z$a r10 = ah.z.f16246b
            ah.z r10 = r10.a()
        L34:
            r14 = r13 & 128(0x80, float:1.8E-43)
            if (r14 == 0) goto L39
            r11 = r0
        L39:
            r13 = r13 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L48
            r14 = r1
            r12 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r5 = r3
            goto L52
        L48:
            r14 = r12
            r13 = r11
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
        L52:
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.F.<init>(ah.L, java.lang.String, int, java.lang.String, java.lang.String, java.util.List, ah.z, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
