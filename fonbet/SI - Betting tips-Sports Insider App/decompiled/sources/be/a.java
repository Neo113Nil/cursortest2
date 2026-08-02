package be;

import android.content.Context;
import android.widget.LinearLayout;
import b2.b;
import ce.e;
import ce.f;
import ce.g;
import ce.h;
import ce.i;
import ce.j;
import com.sports.insider.R;
import gf.k;
import gf.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pd.v;
import wd.c;
import yd.d;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3169f;

    /* renamed from: g, reason: collision with root package name */
    public final t f3170g;

    public a(int i5) {
        this.f3169f = i5;
        switch (i5) {
            case 1:
                this.f3170g = k.b(new b(3));
                break;
            case 2:
                this.f3170g = k.b(new b(4));
                break;
            case 3:
                this.f3170g = k.b(new b(5));
                break;
            case 4:
                this.f3170g = k.b(new b(6));
                break;
            case 5:
                this.f3170g = k.b(new b(7));
                break;
            case 6:
                this.f3170g = k.b(new b(8));
                break;
            case 7:
                this.f3170g = k.b(new b(9));
                break;
            case 8:
                this.f3170g = k.b(new b(10));
                break;
            case 9:
                this.f3170g = k.b(new b(11));
                break;
            case 10:
                this.f3170g = k.b(new b(14));
                break;
            case 11:
                this.f3170g = k.b(new b(16));
                break;
            case 12:
                this.f3170g = k.b(new b(17));
                break;
            case 13:
                this.f3170g = k.b(new b(18));
                break;
            case 14:
                this.f3170g = k.b(new v(28));
                break;
            case 15:
                this.f3170g = k.b(new v(29));
                break;
            case 16:
                final int i10 = 0;
                this.f3170g = k.b(new Function0() { // from class: xd.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i10) {
                            case 0:
                                return new yd.c();
                            case 1:
                                return new d();
                            case 2:
                                return new ae.a();
                            case 3:
                                return new ae.b();
                            case 4:
                                return new ae.c();
                            default:
                                return new ae.d();
                        }
                    }
                });
                break;
            case 17:
                final int i11 = 1;
                this.f3170g = k.b(new Function0() { // from class: xd.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i11) {
                            case 0:
                                return new yd.c();
                            case 1:
                                return new d();
                            case 2:
                                return new ae.a();
                            case 3:
                                return new ae.b();
                            case 4:
                                return new ae.c();
                            default:
                                return new ae.d();
                        }
                    }
                });
                break;
            case 18:
                final int i12 = 2;
                this.f3170g = k.b(new Function0() { // from class: xd.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i12) {
                            case 0:
                                return new yd.c();
                            case 1:
                                return new d();
                            case 2:
                                return new ae.a();
                            case 3:
                                return new ae.b();
                            case 4:
                                return new ae.c();
                            default:
                                return new ae.d();
                        }
                    }
                });
                break;
            case 19:
                final int i13 = 3;
                this.f3170g = k.b(new Function0() { // from class: xd.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                return new yd.c();
                            case 1:
                                return new d();
                            case 2:
                                return new ae.a();
                            case 3:
                                return new ae.b();
                            case 4:
                                return new ae.c();
                            default:
                                return new ae.d();
                        }
                    }
                });
                break;
            case 20:
                final int i14 = 4;
                this.f3170g = k.b(new Function0() { // from class: xd.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                return new yd.c();
                            case 1:
                                return new d();
                            case 2:
                                return new ae.a();
                            case 3:
                                return new ae.b();
                            case 4:
                                return new ae.c();
                            default:
                                return new ae.d();
                        }
                    }
                });
                break;
            case 21:
                final int i15 = 5;
                this.f3170g = k.b(new Function0() { // from class: xd.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                return new yd.c();
                            case 1:
                                return new d();
                            case 2:
                                return new ae.a();
                            case 3:
                                return new ae.b();
                            case 4:
                                return new ae.c();
                            default:
                                return new ae.d();
                        }
                    }
                });
                break;
            default:
                this.f3170g = k.b(new b(2));
                break;
        }
    }

    private final void f(LinearLayout root) {
        Intrinsics.checkNotNullParameter(root, "root");
        wd.b bVar = new wd.b(S().a(1, this.f25251a), 16, 24, 16, 0, 0, Boolean.TRUE, null, null, null, null, 515854);
        Context context = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        root.addView(d(context, bVar));
        String a7 = S().a(2, this.f25251a);
        Boolean bool = Boolean.FALSE;
        wd.b bVar2 = new wd.b(a7, 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context2 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        root.addView(d(context2, bVar2));
        wd.b bVar3 = new wd.b(S().a(3, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context3 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        root.addView(d(context3, bVar3));
        wd.b bVar4 = new wd.b(S().a(4, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context4 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        root.addView(d(context4, bVar4));
        wd.b bVar5 = new wd.b(S().a(5, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context5 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        root.addView(d(context5, bVar5));
        wd.b bVar6 = new wd.b(S().a(6, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context6 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        root.addView(d(context6, bVar6));
    }

    private final void g(LinearLayout root) {
        Intrinsics.checkNotNullParameter(root, "root");
        if (!Intrinsics.areEqual(this.f25251a, "ru")) {
            String b10 = T().b(1, this.f25251a);
            Boolean bool = Boolean.FALSE;
            wd.b bVar = new wd.b(b10, 16, 24, 16, 0, 0, bool, null, null, null, null, 515854);
            Context context = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            root.addView(d(context, bVar));
            wd.b bVar2 = new wd.b(T().b(2, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
            Context context2 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            root.addView(d(context2, bVar2));
            wd.b bVar3 = new wd.b(T().b(3, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
            Context context3 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            root.addView(d(context3, bVar3));
            wd.b bVar4 = new wd.b(T().b(4, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, T().b(4, this.f25251a), 249614);
            Context context4 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            root.addView(d(context4, bVar4));
            return;
        }
        String a7 = T().a(1);
        Boolean bool2 = Boolean.FALSE;
        wd.b bVar5 = new wd.b(a7, 16, 24, 16, 0, 0, bool2, null, null, null, null, 515854);
        Context context5 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        root.addView(d(context5, bVar5));
        wd.b bVar6 = new wd.b(T().a(2), 16, 10, 16, 0, this.f25254d, bool2, null, null, null, null, 511758);
        Context context6 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        root.addView(d(context6, bVar6));
        wd.b bVar7 = new wd.b(T().a(3), 16, 10, 16, 0, this.f25254d, bool2, null, null, null, null, 511758);
        Context context7 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        root.addView(d(context7, bVar7));
        wd.b bVar8 = new wd.b(T().a(4), 16, 10, 16, 0, 0, bool2, null, null, null, null, 515854);
        Context context8 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        root.addView(d(context8, bVar8));
        I(root, new wd.a(10), new wd.b(T().a(5), 0, 0, 0, 0, this.f25254d, bool2, null, null, null, null, 511998));
        I(root, new wd.a(0), new wd.b(T().a(6), 0, 0, 0, 0, this.f25254d, bool2, null, null, null, null, 511998));
        I(root, new wd.a(0), new wd.b(T().a(7), 0, 0, 0, 0, this.f25254d, bool2, null, null, null, null, 511998));
        I(root, new wd.a(0), new wd.b(T().a(8), 0, 0, 0, 0, this.f25254d, bool2, null, null, null, null, 511998));
        wd.b bVar9 = new wd.b(T().a(9), 16, 10, 16, 0, this.f25254d, bool2, null, null, null, null, 511758);
        Context context9 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
        root.addView(d(context9, bVar9));
        wd.b bVar10 = new wd.b(T().a(10), 16, 10, 16, 0, 0, bool2, null, null, null, null, 515854);
        Context context10 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
        root.addView(d(context10, bVar10));
    }

    private final void h(LinearLayout root) {
        Intrinsics.checkNotNullParameter(root, "root");
        String a7 = U().a(1, this.f25251a);
        Boolean bool = Boolean.FALSE;
        wd.b bVar = new wd.b(a7, 16, 24, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        root.addView(d(context, bVar));
        wd.b bVar2 = new wd.b(U().a(2, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context2 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        root.addView(d(context2, bVar2));
        J(root, new wd.a(10), new wd.b(U().a(3, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        J(root, new wd.a(0), new wd.b(U().a(4, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        J(root, new wd.a(0), new wd.b(U().a(5, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        J(root, new wd.a(0), new wd.b(U().a(6, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        wd.b bVar3 = new wd.b(U().a(7, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context3 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        root.addView(d(context3, bVar3));
    }

    private final void i(LinearLayout root) {
        Intrinsics.checkNotNullParameter(root, "root");
        String a7 = V().a(1, this.f25251a);
        Boolean bool = Boolean.FALSE;
        wd.b bVar = new wd.b(a7, 16, 24, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        root.addView(d(context, bVar));
        K(root, new wd.a(10), new wd.b(V().a(2, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        K(root, new wd.a(0), new wd.b(V().a(3, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        K(root, new wd.a(0), new wd.b(V().a(4, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        K(root, new wd.a(0), new wd.b(V().a(5, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        K(root, new wd.a(0), new wd.b(V().a(6, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        wd.b bVar2 = new wd.b(V().a(7, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context2 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        root.addView(d(context2, bVar2));
        K(root, new wd.a(10), new wd.b(V().a(8, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        K(root, new wd.a(0), new wd.b(V().a(9, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        K(root, new wd.a(0), new wd.b(V().a(10, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        K(root, new wd.a(0), new wd.b(V().a(11, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        wd.b bVar3 = new wd.b(V().a(12, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context3 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        root.addView(d(context3, bVar3));
    }

    private final void j(LinearLayout root) {
        Intrinsics.checkNotNullParameter(root, "root");
        String a7 = W().a(1, this.f25251a);
        Boolean bool = Boolean.FALSE;
        wd.b bVar = new wd.b(a7, 16, 24, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        root.addView(d(context, bVar));
        A(root, new wd.a(10), new wd.b(W().a(2, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        A(root, new wd.a(0), new wd.b(W().a(3, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        A(root, new wd.a(0), new wd.b(W().a(4, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        wd.b bVar2 = new wd.b(W().a(5, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context2 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        root.addView(d(context2, bVar2));
        String a10 = W().a(6, this.f25251a);
        h W = W();
        String language = this.f25251a;
        W.getClass();
        Intrinsics.checkNotNullParameter(language, "language");
        wd.b bVar3 = new wd.b(a10, 16, 10, 16, 0, this.f25254d, bool, null, null, null, !Intrinsics.areEqual(language, "ru") ? "https://support.google.com/googleplay/answer/2651410?hl=en&amp;co=GENIE.CountryCode%3DIndonesia#zippy=" : null, 249614);
        Context context3 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        root.addView(d(context3, bVar3));
        wd.b bVar4 = new wd.b(W().a(7, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context4 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        root.addView(d(context4, bVar4));
        wd.b bVar5 = new wd.b(W().a(8, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context5 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        root.addView(d(context5, bVar5));
    }

    private final void k(LinearLayout root) {
        Intrinsics.checkNotNullParameter(root, "root");
        String a7 = X().a(1, this.f25251a);
        Boolean bool = Boolean.FALSE;
        wd.b bVar = new wd.b(a7, 16, 24, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        root.addView(d(context, bVar));
        B(root, new wd.a(10), new wd.b(X().a(2, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        B(root, new wd.a(0), new wd.b(X().a(3, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        B(root, new wd.a(0), new wd.b(X().a(4, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        wd.b bVar2 = new wd.b(X().a(5, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context2 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        root.addView(d(context2, bVar2));
        String a10 = X().a(6, this.f25251a);
        i X = X();
        String language = this.f25251a;
        X.getClass();
        Intrinsics.checkNotNullParameter(language, "language");
        wd.b bVar3 = new wd.b(a10, 16, 10, 16, 0, this.f25254d, bool, null, null, null, !Intrinsics.areEqual(language, "ru") ? "https://support.google.com/googleplay/answer/2651410?hl=en&amp;co=GENIE.CountryCode%3DIndonesia#zippy=" : null, 249614);
        Context context3 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        root.addView(d(context3, bVar3));
        wd.b bVar4 = new wd.b(X().a(7, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context4 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        root.addView(d(context4, bVar4));
        wd.b bVar5 = new wd.b(X().a(8, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context5 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        root.addView(d(context5, bVar5));
        wd.b bVar6 = new wd.b(X().a(9, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context6 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        root.addView(d(context6, bVar6));
        wd.b bVar7 = new wd.b(X().a(10, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context7 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        root.addView(d(context7, bVar7));
        wd.b bVar8 = new wd.b(X().a(11, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context8 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        root.addView(d(context8, bVar8));
        wd.b bVar9 = new wd.b(X().a(12, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context9 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
        root.addView(d(context9, bVar9));
        wd.b bVar10 = new wd.b(X().a(13, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context10 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
        root.addView(d(context10, bVar10));
    }

    private final void l(LinearLayout root) {
        Intrinsics.checkNotNullParameter(root, "root");
        String a7 = Y().a(1, this.f25251a);
        Boolean bool = Boolean.FALSE;
        wd.b bVar = new wd.b(a7, 16, 24, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        root.addView(d(context, bVar));
        wd.b bVar2 = new wd.b(Y().a(2, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context2 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        root.addView(d(context2, bVar2));
        wd.b bVar3 = new wd.b(Y().a(3, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context3 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        root.addView(d(context3, bVar3));
        wd.b bVar4 = new wd.b(Y().a(4, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context4 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        root.addView(d(context4, bVar4));
        C(root, new wd.a(10), new wd.b(Y().a(5, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        C(root, new wd.a(0), new wd.b(Y().a(6, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        C(root, new wd.a(0), new wd.b(Y().a(7, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        wd.b bVar5 = new wd.b(Y().a(8, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context5 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        root.addView(d(context5, bVar5));
        wd.b bVar6 = new wd.b(Y().a(9, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context6 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        root.addView(d(context6, bVar6));
        C(root, new wd.a(10), new wd.b(Y().a(10, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        C(root, new wd.a(0), new wd.b(Y().a(11, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        C(root, new wd.a(0), new wd.b(Y().a(12, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        C(root, new wd.a(0), new wd.b(Y().a(13, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        wd.b bVar7 = new wd.b(Y().a(14, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context7 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        root.addView(d(context7, bVar7));
        C(root, new wd.a(10), new wd.b(Y().a(15, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        C(root, new wd.a(0), new wd.b(Y().a(16, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        C(root, new wd.a(0), new wd.b(Y().a(17, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
    }

    private final void m(LinearLayout root) {
        Intrinsics.checkNotNullParameter(root, "root");
        String a7 = Z().a(1, this.f25251a);
        Boolean bool = Boolean.FALSE;
        wd.b bVar = new wd.b(a7, 16, 24, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        root.addView(d(context, bVar));
        wd.a aVar = new wd.a(10);
        wd.b bVar2 = new wd.b(Z().a(2, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998);
        Context context2 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        LinearLayout b10 = b(context2, aVar);
        Context context3 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        wd.b bVar3 = this.f25255e;
        b10.addView(d(context3, bVar3));
        Context context4 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        wd.a c2 = yg.a.c(b10, d(context4, bVar2), root, b10, 0);
        Context context5 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        LinearLayout b11 = b(context5, c2);
        wd.b bVar4 = new wd.b(Z().a(3, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998);
        Context context6 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        b11.addView(d(context6, bVar3));
        Context context7 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        b11.addView(d(context7, bVar4));
        root.addView(b11);
        wd.b bVar5 = new wd.b(Z().a(4, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context8 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        root.addView(d(context8, bVar5));
        wd.a aVar2 = new wd.a(10);
        Context context9 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
        LinearLayout b12 = b(context9, aVar2);
        wd.b bVar6 = new wd.b(Z().a(5, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998);
        Context context10 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
        b12.addView(d(context10, bVar3));
        Context context11 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
        wd.a c8 = yg.a.c(b12, d(context11, bVar6), root, b12, 0);
        Context context12 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
        LinearLayout b13 = b(context12, c8);
        wd.b bVar7 = new wd.b(Z().a(6, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998);
        Context context13 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context13, "getContext(...)");
        b13.addView(d(context13, bVar3));
        Context context14 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context14, "getContext(...)");
        b13.addView(d(context14, bVar7));
        root.addView(b13);
        wd.b bVar8 = new wd.b(Z().a(7, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context15 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context15, "getContext(...)");
        root.addView(d(context15, bVar8));
        wd.a aVar3 = new wd.a(10);
        Context context16 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context16, "getContext(...)");
        LinearLayout b14 = b(context16, aVar3);
        wd.b bVar9 = new wd.b(Z().a(8, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998);
        Context context17 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context17, "getContext(...)");
        b14.addView(d(context17, bVar3));
        Context context18 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context18, "getContext(...)");
        wd.a c10 = yg.a.c(b14, d(context18, bVar9), root, b14, 0);
        Context context19 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context19, "getContext(...)");
        LinearLayout b15 = b(context19, c10);
        wd.b bVar10 = new wd.b(Z().a(9, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998);
        Context context20 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context20, "getContext(...)");
        b15.addView(d(context20, bVar3));
        Context context21 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context21, "getContext(...)");
        wd.a c11 = yg.a.c(b15, d(context21, bVar10), root, b15, 0);
        Context context22 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context22, "getContext(...)");
        LinearLayout b16 = b(context22, c11);
        wd.b bVar11 = new wd.b(Z().a(10, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998);
        Context context23 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context23, "getContext(...)");
        b16.addView(d(context23, bVar3));
        Context context24 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context24, "getContext(...)");
        b16.addView(d(context24, bVar11));
        root.addView(b16);
        if (Z().a(11, this.f25251a).length() > 0) {
            wd.b bVar12 = new wd.b(Z().a(11, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
            Context context25 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context25, "getContext(...)");
            root.addView(d(context25, bVar12));
        }
    }

    private final void n(LinearLayout root) {
        Intrinsics.checkNotNullParameter(root, "root");
        String a7 = a0().a(1, this.f25251a);
        Boolean bool = Boolean.FALSE;
        wd.b bVar = new wd.b(a7, 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        root.addView(d(context, bVar));
        if (a0().a(2, this.f25251a).length() > 0) {
            wd.b bVar2 = new wd.b(a0().a(2, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
            Context context2 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            root.addView(d(context2, bVar2));
        }
        if (a0().a(3, this.f25251a).length() > 0) {
            wd.b bVar3 = new wd.b(a0().a(3, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
            Context context3 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            root.addView(d(context3, bVar3));
        }
        wd.b bVar4 = new wd.b(a0().a(4, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context4 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        root.addView(d(context4, bVar4));
        wd.b bVar5 = new wd.b(a0().a(5, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context5 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        root.addView(d(context5, bVar5));
        wd.b bVar6 = new wd.b(a0().a(6, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context6 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        root.addView(d(context6, bVar6));
        wd.b bVar7 = new wd.b(a0().a(7, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context7 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        root.addView(d(context7, bVar7));
        wd.b bVar8 = new wd.b(a0().a(8, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context8 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        root.addView(d(context8, bVar8));
        wd.b bVar9 = new wd.b(a0().a(9, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context9 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
        root.addView(d(context9, bVar9));
        wd.b bVar10 = new wd.b(a0().a(10, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context10 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
        root.addView(d(context10, bVar10));
        wd.b bVar11 = new wd.b(a0().a(11, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context11 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
        root.addView(d(context11, bVar11));
        if (a0().a(12, this.f25251a).length() > 0) {
            wd.b bVar12 = new wd.b(a0().a(12, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
            Context context12 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
            root.addView(d(context12, bVar12));
        }
    }

    private final void o(LinearLayout root) {
        Intrinsics.checkNotNullParameter(root, "root");
        String a7 = b0().a(1, this.f25251a);
        Boolean bool = Boolean.FALSE;
        wd.b bVar = new wd.b(a7, 16, 24, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        root.addView(d(context, bVar));
        if (b0().a(2, this.f25251a).length() > 0) {
            wd.b bVar2 = new wd.b(b0().a(2, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
            Context context2 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            root.addView(d(context2, bVar2));
        }
        wd.b bVar3 = new wd.b(b0().a(3, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context3 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        root.addView(d(context3, bVar3));
        wd.a aVar = new wd.a(10);
        Context context4 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        LinearLayout b10 = b(context4, aVar);
        wd.b bVar4 = new wd.b(b0().a(4, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998);
        Context context5 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        wd.b bVar5 = this.f25255e;
        b10.addView(d(context5, bVar5));
        Context context6 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        wd.a c2 = yg.a.c(b10, d(context6, bVar4), root, b10, 0);
        Context context7 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        LinearLayout b11 = b(context7, c2);
        wd.b bVar6 = new wd.b(b0().a(5, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998);
        Context context8 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        b11.addView(d(context8, bVar5));
        Context context9 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
        wd.a c8 = yg.a.c(b11, d(context9, bVar6), root, b11, 0);
        Context context10 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
        LinearLayout b12 = b(context10, c8);
        wd.b bVar7 = new wd.b(b0().a(6, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998);
        Context context11 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
        b12.addView(d(context11, bVar5));
        Context context12 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
        b12.addView(d(context12, bVar7));
        root.addView(b12);
        wd.b bVar8 = new wd.b(b0().a(7, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context13 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context13, "getContext(...)");
        root.addView(d(context13, bVar8));
        wd.a aVar2 = new wd.a(10);
        Context context14 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context14, "getContext(...)");
        LinearLayout b13 = b(context14, aVar2);
        wd.b bVar9 = new wd.b(b0().a(8, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998);
        Context context15 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context15, "getContext(...)");
        b13.addView(d(context15, bVar5));
        Context context16 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context16, "getContext(...)");
        wd.a c10 = yg.a.c(b13, d(context16, bVar9), root, b13, 0);
        Context context17 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context17, "getContext(...)");
        LinearLayout b14 = b(context17, c10);
        wd.b bVar10 = new wd.b(b0().a(9, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998);
        Context context18 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context18, "getContext(...)");
        b14.addView(d(context18, bVar5));
        Context context19 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context19, "getContext(...)");
        wd.a c11 = yg.a.c(b14, d(context19, bVar10), root, b14, 0);
        Context context20 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context20, "getContext(...)");
        LinearLayout b15 = b(context20, c11);
        wd.b bVar11 = new wd.b(b0().a(10, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998);
        Context context21 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context21, "getContext(...)");
        b15.addView(d(context21, bVar5));
        Context context22 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context22, "getContext(...)");
        b15.addView(d(context22, bVar11));
        root.addView(b15);
        if (b0().a(11, this.f25251a).length() > 0) {
            wd.b bVar12 = new wd.b(b0().a(11, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
            Context context23 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context23, "getContext(...)");
            root.addView(d(context23, bVar12));
        }
        if (b0().a(12, this.f25251a).length() > 0) {
            wd.b bVar13 = new wd.b(b0().a(12, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
            Context context24 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context24, "getContext(...)");
            root.addView(d(context24, bVar13));
        }
        if (b0().a(13, this.f25251a).length() > 0) {
            wd.b bVar14 = new wd.b(b0().a(13, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
            Context context25 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context25, "getContext(...)");
            root.addView(d(context25, bVar14));
        }
    }

    private final void p(LinearLayout root) {
        Intrinsics.checkNotNullParameter(root, "root");
        String a7 = c0().a(1, this.f25251a);
        Boolean bool = Boolean.FALSE;
        wd.b bVar = new wd.b(a7, 16, 24, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        root.addView(d(context, bVar));
        if (c0().a(2, this.f25251a).length() > 0) {
            wd.b bVar2 = new wd.b(c0().a(2, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
            Context context2 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            root.addView(d(context2, bVar2));
        }
        if (c0().a(3, this.f25251a).length() > 0) {
            wd.b bVar3 = new wd.b(c0().a(3, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
            Context context3 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            root.addView(d(context3, bVar3));
        }
        wd.b bVar4 = new wd.b(c0().a(4, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context4 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        root.addView(d(context4, bVar4));
        wd.b bVar5 = new wd.b(c0().a(5, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context5 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        root.addView(d(context5, bVar5));
        if (c0().a(6, this.f25251a).length() > 0) {
            wd.b bVar6 = new wd.b(c0().a(6, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
            Context context6 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            root.addView(d(context6, bVar6));
        }
        if (c0().a(7, this.f25251a).length() > 0) {
            wd.b bVar7 = new wd.b(c0().a(7, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
            Context context7 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            root.addView(d(context7, bVar7));
        }
        if (c0().a(8, this.f25251a).length() > 0) {
            wd.b bVar8 = new wd.b(c0().a(8, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
            Context context8 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
            root.addView(d(context8, bVar8));
        }
        wd.b bVar9 = new wd.b(c0().a(9, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context9 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
        root.addView(d(context9, bVar9));
        wd.a aVar = new wd.a(10);
        Context context10 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
        LinearLayout b10 = b(context10, aVar);
        wd.b bVar10 = new wd.b(c0().a(10, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998);
        Context context11 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
        wd.b bVar11 = this.f25255e;
        b10.addView(d(context11, bVar11));
        Context context12 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
        wd.a c2 = yg.a.c(b10, d(context12, bVar10), root, b10, 0);
        Context context13 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context13, "getContext(...)");
        LinearLayout b11 = b(context13, c2);
        wd.b bVar12 = new wd.b(c0().a(11, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998);
        Context context14 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context14, "getContext(...)");
        b11.addView(d(context14, bVar11));
        Context context15 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context15, "getContext(...)");
        wd.a c8 = yg.a.c(b11, d(context15, bVar12), root, b11, 0);
        Context context16 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context16, "getContext(...)");
        LinearLayout b12 = b(context16, c8);
        wd.b bVar13 = new wd.b(c0().a(12, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998);
        Context context17 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context17, "getContext(...)");
        b12.addView(d(context17, bVar11));
        Context context18 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context18, "getContext(...)");
        b12.addView(d(context18, bVar13));
        root.addView(b12);
        wd.b bVar14 = new wd.b(c0().a(13, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context19 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context19, "getContext(...)");
        root.addView(d(context19, bVar14));
        wd.a aVar2 = new wd.a(10);
        Context context20 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context20, "getContext(...)");
        LinearLayout b13 = b(context20, aVar2);
        wd.b bVar15 = new wd.b(c0().a(14, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998);
        Context context21 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context21, "getContext(...)");
        b13.addView(d(context21, bVar11));
        Context context22 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context22, "getContext(...)");
        wd.a c10 = yg.a.c(b13, d(context22, bVar15), root, b13, 0);
        Context context23 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context23, "getContext(...)");
        LinearLayout b14 = b(context23, c10);
        wd.b bVar16 = new wd.b(c0().a(15, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998);
        Context context24 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context24, "getContext(...)");
        b14.addView(d(context24, bVar11));
        Context context25 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context25, "getContext(...)");
        wd.a c11 = yg.a.c(b14, d(context25, bVar16), root, b14, 0);
        Context context26 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context26, "getContext(...)");
        LinearLayout b15 = b(context26, c11);
        wd.b bVar17 = new wd.b(c0().a(16, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998);
        Context context27 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context27, "getContext(...)");
        b15.addView(d(context27, bVar11));
        Context context28 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context28, "getContext(...)");
        b15.addView(d(context28, bVar17));
        root.addView(b15);
        if (c0().a(17, this.f25251a).length() > 0) {
            wd.b bVar18 = new wd.b(c0().a(17, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
            Context context29 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context29, "getContext(...)");
            root.addView(d(context29, bVar18));
        }
    }

    private final void q(LinearLayout root) {
        Intrinsics.checkNotNullParameter(root, "root");
        String a7 = d0().a(1, this.f25251a);
        Boolean bool = Boolean.FALSE;
        wd.b bVar = new wd.b(a7, 16, 24, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        root.addView(d(context, bVar));
        wd.b bVar2 = new wd.b(d0().a(2, this.f25251a), 16, 10, 16, 0, 0, bool, 17, 1, null, null, 466702);
        Context context2 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        root.addView(d(context2, bVar2));
        wd.b bVar3 = new wd.b(d0().a(3, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context3 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        root.addView(d(context3, bVar3));
        x(root, new wd.a(10), new wd.b(d0().a(4, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        x(root, new wd.a(0), new wd.b(d0().a(5, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        x(root, new wd.a(0), new wd.b(d0().a(6, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        x(root, new wd.a(0), new wd.b(d0().a(7, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        if (d0().a(8, this.f25251a).length() > 0) {
            wd.b bVar4 = new wd.b(d0().a(8, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
            Context context4 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            root.addView(d(context4, bVar4));
        }
        wd.b bVar5 = new wd.b(d0().a(9, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context5 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        root.addView(d(context5, bVar5));
        x(root, new wd.a(10), new wd.b(d0().a(10, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        x(root, new wd.a(0), new wd.b(d0().a(11, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        wd.b bVar6 = new wd.b(d0().a(12, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context6 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        root.addView(d(context6, bVar6));
        wd.b bVar7 = new wd.b(d0().a(13, this.f25251a), 16, 10, 16, 0, 0, bool, 17, 1, null, null, 466702);
        Context context7 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        root.addView(d(context7, bVar7));
        wd.b bVar8 = new wd.b(d0().a(14, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context8 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        root.addView(d(context8, bVar8));
        x(root, new wd.a(10), new wd.b(d0().a(15, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        x(root, new wd.a(0), new wd.b(d0().a(16, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        x(root, new wd.a(0), new wd.b(d0().a(17, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        wd.b bVar9 = new wd.b(d0().a(18, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context9 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
        root.addView(d(context9, bVar9));
        x(root, new wd.a(10), new wd.b(d0().a(19, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        x(root, new wd.a(0), new wd.b(d0().a(20, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        x(root, new wd.a(0), new wd.b(d0().a(21, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        x(root, new wd.a(0), new wd.b(d0().a(22, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        if (d0().a(23, this.f25251a).length() > 0) {
            wd.b bVar10 = new wd.b(d0().a(23, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
            Context context10 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
            root.addView(d(context10, bVar10));
        }
    }

    private final void r(LinearLayout root) {
        Intrinsics.checkNotNullParameter(root, "root");
        String a7 = e0().a(1, this.f25251a);
        Boolean bool = Boolean.FALSE;
        wd.b bVar = new wd.b(a7, 16, 24, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        root.addView(d(context, bVar));
        if (e0().a(2, this.f25251a).length() > 0) {
            wd.b bVar2 = new wd.b(e0().a(2, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
            Context context2 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            root.addView(d(context2, bVar2));
        }
        if (e0().a(3, this.f25251a).length() > 0) {
            wd.b bVar3 = new wd.b(e0().a(3, this.f25251a), 16, 10, 16, 0, 0, Boolean.TRUE, null, null, null, null, 515846);
            Context context3 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            root.addView(d(context3, bVar3));
        }
        if (e0().a(4, this.f25251a).length() > 0) {
            wd.b bVar4 = new wd.b(e0().a(4, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
            Context context4 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            root.addView(d(context4, bVar4));
        }
        wd.b bVar5 = new wd.b(e0().a(5, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context5 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        root.addView(d(context5, bVar5));
        wd.b bVar6 = new wd.b(e0().a(6, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context6 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        root.addView(d(context6, bVar6));
        if (e0().a(7, this.f25251a).length() > 0) {
            wd.b bVar7 = new wd.b(e0().a(7, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
            Context context7 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            root.addView(d(context7, bVar7));
        }
        wd.b bVar8 = new wd.b(e0().a(8, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context8 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        root.addView(d(context8, bVar8));
        wd.b bVar9 = new wd.b(e0().a(9, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context9 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
        root.addView(d(context9, bVar9));
        if (e0().a(10, this.f25251a).length() > 0) {
            wd.b bVar10 = new wd.b(e0().a(10, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
            Context context10 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
            root.addView(d(context10, bVar10));
        }
        if (e0().a(11, this.f25251a).length() > 0) {
            wd.b bVar11 = new wd.b(e0().a(11, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
            Context context11 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
            root.addView(d(context11, bVar11));
        }
        wd.b bVar12 = new wd.b(e0().a(12, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context12 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
        root.addView(d(context12, bVar12));
        if (e0().a(13, this.f25251a).length() > 0) {
            wd.b bVar13 = new wd.b(e0().a(13, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
            Context context13 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context13, "getContext(...)");
            root.addView(d(context13, bVar13));
        }
    }

    private final void s(LinearLayout root) {
        Intrinsics.checkNotNullParameter(root, "root");
        String a7 = f0().a(1, this.f25251a);
        Boolean bool = Boolean.FALSE;
        wd.b bVar = new wd.b(a7, 16, 24, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        root.addView(d(context, bVar));
        wd.b bVar2 = new wd.b(f0().a(2, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context2 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        root.addView(d(context2, bVar2));
        wd.b bVar3 = new wd.b(f0().a(3, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context3 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        root.addView(d(context3, bVar3));
        wd.b bVar4 = new wd.b(f0().a(4, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context4 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        root.addView(d(context4, bVar4));
        wd.b bVar5 = new wd.b(f0().a(5, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context5 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        root.addView(d(context5, bVar5));
        wd.b bVar6 = new wd.b(f0().a(6, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context6 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        root.addView(d(context6, bVar6));
        if (f0().a(7, this.f25251a).length() > 0) {
            wd.b bVar7 = new wd.b(f0().a(7, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
            Context context7 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            root.addView(d(context7, bVar7));
        }
    }

    private final void t(LinearLayout root) {
        Intrinsics.checkNotNullParameter(root, "root");
        String a7 = g0().a(1, this.f25251a);
        Boolean bool = Boolean.FALSE;
        wd.b bVar = new wd.b(a7, 16, 24, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        root.addView(d(context, bVar));
        wd.b bVar2 = new wd.b(g0().a(2, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context2 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        root.addView(d(context2, bVar2));
        wd.b bVar3 = new wd.b(g0().a(3, this.f25251a), 16, 10, 16, 0, 0, Boolean.TRUE, null, null, null, null, 515846);
        Context context3 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        root.addView(d(context3, bVar3));
        if (g0().a(4, this.f25251a).length() > 0) {
            wd.b bVar4 = new wd.b(g0().a(4, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
            Context context4 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            root.addView(d(context4, bVar4));
        }
        wd.b bVar5 = new wd.b(g0().a(5, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context5 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        root.addView(d(context5, bVar5));
        if (g0().a(6, this.f25251a).length() > 0) {
            wd.b bVar6 = new wd.b(g0().a(6, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
            Context context6 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            root.addView(d(context6, bVar6));
        }
        if (g0().a(7, this.f25251a).length() > 0) {
            wd.b bVar7 = new wd.b(g0().a(7, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
            Context context7 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            root.addView(d(context7, bVar7));
        }
        wd.b bVar8 = new wd.b(g0().a(8, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context8 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        root.addView(d(context8, bVar8));
        if (g0().a(9, this.f25251a).length() > 0) {
            wd.b bVar9 = new wd.b(g0().a(9, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
            Context context9 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
            root.addView(d(context9, bVar9));
        }
        wd.b bVar10 = new wd.b(g0().a(10, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context10 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
        root.addView(d(context10, bVar10));
        z(root, new wd.a(10), new wd.b(g0().a(11, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        z(root, new wd.a(0), new wd.b(g0().a(12, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        z(root, new wd.a(0), new wd.b(g0().a(13, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        z(root, new wd.a(0), new wd.b(g0().a(14, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        if (g0().a(15, this.f25251a).length() > 0) {
            wd.b bVar11 = new wd.b(g0().a(15, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
            Context context11 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
            root.addView(d(context11, bVar11));
        }
    }

    private final void u(LinearLayout root) {
        Intrinsics.checkNotNullParameter(root, "root");
        String a7 = L().a(1, this.f25251a);
        Boolean bool = Boolean.FALSE;
        wd.b bVar = new wd.b(a7, 16, 24, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        root.addView(d(context, bVar));
        if (L().a(2, this.f25251a).length() > 0) {
            wd.b bVar2 = new wd.b(L().a(2, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
            Context context2 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            root.addView(d(context2, bVar2));
        }
        D(root, new wd.a(10), new wd.b(L().a(3, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        D(root, new wd.a(0), new wd.b(L().a(4, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        D(root, new wd.a(0), new wd.b(L().a(5, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        D(root, new wd.a(0), new wd.b(L().a(6, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        D(root, new wd.a(0), new wd.b(L().a(7, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        D(root, new wd.a(0), new wd.b(L().a(8, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        if (L().a(9, this.f25251a).length() > 0) {
            wd.b bVar3 = new wd.b(L().a(9, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
            Context context3 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            root.addView(d(context3, bVar3));
        }
        wd.b bVar4 = new wd.b(L().a(10, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context4 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        root.addView(d(context4, bVar4));
        D(root, new wd.a(10), new wd.b(L().a(11, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        D(root, new wd.a(0), new wd.b(L().a(12, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        D(root, new wd.a(0), new wd.b(L().a(13, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        D(root, new wd.a(0), new wd.b(L().a(14, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
    }

    private final void v(LinearLayout root) {
        Intrinsics.checkNotNullParameter(root, "root");
        String a7 = M().a(1, this.f25251a);
        Boolean bool = Boolean.FALSE;
        wd.b bVar = new wd.b(a7, 16, 24, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        root.addView(d(context, bVar));
        wd.b bVar2 = new wd.b(M().a(2, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context2 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        root.addView(d(context2, bVar2));
        E(root, new wd.a(0), new wd.b(M().a(3, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        E(root, new wd.a(0), new wd.b(M().a(4, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        E(root, new wd.a(0), new wd.b(M().a(5, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        wd.b bVar3 = new wd.b(M().a(6, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context3 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        root.addView(d(context3, bVar3));
    }

    private final void w(LinearLayout root) {
        Intrinsics.checkNotNullParameter(root, "root");
        String a7 = N().a(1, this.f25251a);
        Boolean bool = Boolean.FALSE;
        wd.b bVar = new wd.b(a7, 16, 24, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        root.addView(d(context, bVar));
        wd.b bVar2 = new wd.b(N().a(2, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context2 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        root.addView(d(context2, bVar2));
        wd.b bVar3 = new wd.b(N().a(3, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context3 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        root.addView(d(context3, bVar3));
        wd.b bVar4 = new wd.b(N().a(4, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context4 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        root.addView(d(context4, bVar4));
        F(root, new wd.a(10), new wd.b(N().a(5, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        F(root, new wd.a(0), new wd.b(N().a(6, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        F(root, new wd.a(0), new wd.b(N().a(7, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        wd.b bVar5 = new wd.b(N().a(8, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context5 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        root.addView(d(context5, bVar5));
        if (N().a(9, this.f25251a).length() > 0) {
            wd.b bVar6 = new wd.b(N().a(9, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
            Context context6 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            root.addView(d(context6, bVar6));
        }
        wd.b bVar7 = new wd.b(N().a(10, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context7 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        root.addView(d(context7, bVar7));
        F(root, new wd.a(10), new wd.b(N().a(11, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        F(root, new wd.a(0), new wd.b(N().a(12, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        F(root, new wd.a(0), new wd.b(N().a(13, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        F(root, new wd.a(0), new wd.b(N().a(14, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        F(root, new wd.a(0), new wd.b(N().a(15, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        wd.b bVar8 = new wd.b(N().a(16, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context8 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        root.addView(d(context8, bVar8));
        wd.b bVar9 = new wd.b(N().a(17, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context9 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
        root.addView(d(context9, bVar9));
        wd.b bVar10 = new wd.b(N().a(18, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context10 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
        root.addView(d(context10, bVar10));
        F(root, new wd.a(10), new wd.b(N().a(19, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        F(root, new wd.a(0), new wd.b(N().a(20, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        F(root, new wd.a(0), new wd.b(N().a(21, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        F(root, new wd.a(0), new wd.b(N().a(22, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        F(root, new wd.a(0), new wd.b(N().a(23, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        F(root, new wd.a(0), new wd.b(N().a(24, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        wd.b bVar11 = new wd.b(N().a(25, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context11 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
        root.addView(d(context11, bVar11));
        wd.b bVar12 = new wd.b(N().a(26, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context12 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
        root.addView(d(context12, bVar12));
        wd.b bVar13 = new wd.b(N().a(27, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context13 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context13, "getContext(...)");
        root.addView(d(context13, bVar13));
        F(root, new wd.a(10), new wd.b(N().a(28, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        F(root, new wd.a(0), new wd.b(N().a(29, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        F(root, new wd.a(0), new wd.b(N().a(30, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        if (N().a(31, this.f25251a).length() > 0) {
            wd.b bVar14 = new wd.b(N().a(31, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
            Context context14 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context14, "getContext(...)");
            root.addView(d(context14, bVar14));
        }
        wd.b bVar15 = new wd.b(N().a(32, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
        Context context15 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context15, "getContext(...)");
        root.addView(d(context15, bVar15));
        wd.b bVar16 = new wd.b(N().a(33, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context16 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context16, "getContext(...)");
        root.addView(d(context16, bVar16));
        F(root, new wd.a(10), new wd.b(N().a(34, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
        F(root, new wd.a(0), new wd.b(N().a(35, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
    }

    public void A(LinearLayout linearLayout, wd.a aVar, wd.b bVar) {
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LinearLayout b10 = b(context, aVar);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        b10.addView(d(context2, this.f25255e));
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        b10.addView(d(context3, bVar));
        linearLayout.addView(b10);
    }

    public void B(LinearLayout linearLayout, wd.a aVar, wd.b bVar) {
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LinearLayout b10 = b(context, aVar);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        b10.addView(d(context2, this.f25255e));
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        b10.addView(d(context3, bVar));
        linearLayout.addView(b10);
    }

    public void C(LinearLayout linearLayout, wd.a aVar, wd.b bVar) {
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LinearLayout b10 = b(context, aVar);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        b10.addView(d(context2, this.f25255e));
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        b10.addView(d(context3, bVar));
        linearLayout.addView(b10);
    }

    public void D(LinearLayout linearLayout, wd.a aVar, wd.b bVar) {
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LinearLayout b10 = b(context, aVar);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        b10.addView(d(context2, this.f25255e));
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        b10.addView(d(context3, bVar));
        linearLayout.addView(b10);
    }

    public void E(LinearLayout linearLayout, wd.a aVar, wd.b bVar) {
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LinearLayout b10 = b(context, aVar);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        b10.addView(d(context2, this.f25255e));
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        b10.addView(d(context3, bVar));
        linearLayout.addView(b10);
    }

    public void F(LinearLayout linearLayout, wd.a aVar, wd.b bVar) {
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LinearLayout b10 = b(context, aVar);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        b10.addView(d(context2, this.f25255e));
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        b10.addView(d(context3, bVar));
        linearLayout.addView(b10);
    }

    public void G(LinearLayout linearLayout, wd.a aVar, wd.b bVar) {
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LinearLayout b10 = b(context, aVar);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        b10.addView(d(context2, this.f25255e));
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        b10.addView(d(context3, bVar));
        linearLayout.addView(b10);
    }

    public void H(LinearLayout linearLayout, wd.a aVar, wd.b bVar) {
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LinearLayout b10 = b(context, aVar);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        b10.addView(d(context2, this.f25255e));
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        b10.addView(d(context3, bVar));
        linearLayout.addView(b10);
    }

    public void I(LinearLayout linearLayout, wd.a aVar, wd.b bVar) {
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LinearLayout b10 = b(context, aVar);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        b10.addView(d(context2, this.f25255e));
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        b10.addView(d(context3, bVar));
        linearLayout.addView(b10);
    }

    public void J(LinearLayout linearLayout, wd.a aVar, wd.b bVar) {
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LinearLayout b10 = b(context, aVar);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        b10.addView(d(context2, this.f25255e));
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        b10.addView(d(context3, bVar));
        linearLayout.addView(b10);
    }

    public void K(LinearLayout linearLayout, wd.a aVar, wd.b bVar) {
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LinearLayout b10 = b(context, aVar);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        b10.addView(d(context2, this.f25255e));
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        b10.addView(d(context3, bVar));
        linearLayout.addView(b10);
    }

    public ae.a L() {
        return (ae.a) this.f3170g.getValue();
    }

    public ae.b M() {
        return (ae.b) this.f3170g.getValue();
    }

    public ae.c N() {
        return (ae.c) this.f3170g.getValue();
    }

    public ae.d O() {
        return (ae.d) this.f3170g.getValue();
    }

    public ce.a P() {
        return (ce.a) this.f3170g.getValue();
    }

    public ce.b Q() {
        return (ce.b) this.f3170g.getValue();
    }

    public ce.c R() {
        return (ce.c) this.f3170g.getValue();
    }

    public ce.d S() {
        return (ce.d) this.f3170g.getValue();
    }

    public e T() {
        return (e) this.f3170g.getValue();
    }

    public f U() {
        return (f) this.f3170g.getValue();
    }

    public g V() {
        return (g) this.f3170g.getValue();
    }

    public h W() {
        return (h) this.f3170g.getValue();
    }

    public i X() {
        return (i) this.f3170g.getValue();
    }

    public j Y() {
        return (j) this.f3170g.getValue();
    }

    public ee.a Z() {
        return (ee.a) this.f3170g.getValue();
    }

    @Override // wd.c
    public final void a(LinearLayout root) {
        String str;
        switch (this.f3169f) {
            case 0:
                Intrinsics.checkNotNullParameter(root, "root");
                String a7 = P().a(1, this.f25251a);
                Boolean bool = Boolean.FALSE;
                wd.b bVar = new wd.b(a7, 16, 24, 16, 0, 0, bool, null, null, null, null, 515854);
                Context context = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                root.addView(d(context, bVar));
                G(root, new wd.a(10), new wd.b(P().a(2, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
                G(root, new wd.a(0), new wd.b(P().a(3, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
                G(root, new wd.a(0), new wd.b(P().a(4, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998));
                wd.b bVar2 = new wd.b(P().a(5, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
                Context context2 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                root.addView(d(context2, bVar2));
                String a10 = P().a(6, this.f25251a);
                ce.a P = P();
                String language = this.f25251a;
                P.getClass();
                Intrinsics.checkNotNullParameter(language, "language");
                wd.b bVar3 = new wd.b(a10, 16, 10, 16, 0, this.f25254d, bool, null, null, null, !Intrinsics.areEqual(language, "ru") ? "https://support.google.com/googleplay/answer/2651410?hl=en&amp;co=GENIE.CountryCode%3DIndonesia#zippy=" : null, 249614);
                Context context3 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                root.addView(d(context3, bVar3));
                wd.b bVar4 = new wd.b(P().a(7, this.f25251a), 16, 10, 16, 0, 0, bool, null, null, null, null, 515854);
                Context context4 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                root.addView(d(context4, bVar4));
                wd.b bVar5 = new wd.b(P().a(8, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
                Context context5 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                root.addView(d(context5, bVar5));
                break;
            case 1:
                Intrinsics.checkNotNullParameter(root, "root");
                String a11 = Q().a(1, this.f25251a);
                Boolean bool2 = Boolean.FALSE;
                wd.b bVar6 = new wd.b(a11, 16, 24, 16, 0, 0, bool2, null, null, null, null, 515854);
                Context context6 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                root.addView(d(context6, bVar6));
                H(root, new wd.a(10), new wd.b(Q().a(2, this.f25251a), 0, 0, 0, 0, this.f25254d, bool2, null, null, null, null, 511998));
                H(root, new wd.a(0), new wd.b(Q().a(3, this.f25251a), 0, 0, 0, 0, this.f25254d, bool2, null, null, null, null, 511998));
                H(root, new wd.a(0), new wd.b(Q().a(4, this.f25251a), 0, 0, 0, 0, this.f25254d, bool2, null, null, null, null, 511998));
                wd.b bVar7 = new wd.b(Q().a(5, this.f25251a), 16, 10, 16, 0, 0, bool2, null, null, null, null, 515854);
                Context context7 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                root.addView(d(context7, bVar7));
                String a12 = Q().a(6, this.f25251a);
                ce.b Q = Q();
                String language2 = this.f25251a;
                Q.getClass();
                Intrinsics.checkNotNullParameter(language2, "language");
                wd.b bVar8 = new wd.b(a12, 16, 10, 16, 0, this.f25254d, bool2, null, null, null, !Intrinsics.areEqual(language2, "ru") ? "https://support.google.com/googleplay/answer/2651410?hl=en&amp;co=GENIE.CountryCode%3DIndonesia#zippy=" : null, 249614);
                Context context8 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                root.addView(d(context8, bVar8));
                wd.b bVar9 = new wd.b(Q().a(7, this.f25251a), 16, 10, 16, 0, 0, bool2, null, null, null, null, 515854);
                Context context9 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
                root.addView(d(context9, bVar9));
                wd.b bVar10 = new wd.b(Q().a(8, this.f25251a), 16, 10, 16, 0, this.f25254d, bool2, null, null, null, null, 511758);
                Context context10 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
                root.addView(d(context10, bVar10));
                wd.b bVar11 = new wd.b(Q().a(9, this.f25251a), 16, 10, 16, 0, 0, bool2, null, null, null, null, 515854);
                Context context11 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
                root.addView(d(context11, bVar11));
                wd.b bVar12 = new wd.b(Q().a(10, this.f25251a), 16, 10, 16, 0, this.f25254d, bool2, null, null, null, null, 511758);
                Context context12 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
                root.addView(d(context12, bVar12));
                wd.b bVar13 = new wd.b(Q().a(11, this.f25251a), 16, 10, 16, 0, 0, bool2, null, null, null, null, 515854);
                Context context13 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context13, "getContext(...)");
                root.addView(d(context13, bVar13));
                wd.b bVar14 = new wd.b(Q().a(12, this.f25251a), 16, 10, 16, 0, this.f25254d, bool2, null, null, null, null, 511758);
                Context context14 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context14, "getContext(...)");
                root.addView(d(context14, bVar14));
                wd.b bVar15 = new wd.b(Q().a(13, this.f25251a), 16, 10, 16, 0, this.f25254d, bool2, null, null, null, null, 511758);
                Context context15 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context15, "getContext(...)");
                root.addView(d(context15, bVar15));
                break;
            case 2:
                Intrinsics.checkNotNullParameter(root, "root");
                wd.a aVar = new wd.a(24);
                String a13 = R().a(2, this.f25251a);
                Boolean bool3 = Boolean.FALSE;
                y(root, aVar, new wd.b(a13, 0, 0, 0, 0, 0, bool3, null, null, null, null, 516094), "1.");
                y(root, new wd.a(10), new wd.b(R().a(3, this.f25251a), 0, 0, 0, 0, 0, bool3, null, null, R().b(3, this.f25251a), null, 385022), "2.");
                y(root, new wd.a(10), new wd.b(R().a(4, this.f25251a), 0, 0, 0, 0, 0, bool3, null, null, R().b(4, this.f25251a), null, 385022), "3.");
                y(root, new wd.a(10), new wd.b(R().a(5, this.f25251a), 0, 0, 0, 0, 0, bool3, null, null, R().b(5, this.f25251a), null, 385022), "4.");
                break;
            case 3:
                f(root);
                break;
            case 4:
                g(root);
                break;
            case 5:
                h(root);
                break;
            case 6:
                i(root);
                break;
            case 7:
                j(root);
                break;
            case 8:
                k(root);
                break;
            case 9:
                l(root);
                break;
            case 10:
                m(root);
                break;
            case 11:
                n(root);
                break;
            case 12:
                o(root);
                break;
            case 13:
                p(root);
                break;
            case 14:
                q(root);
                break;
            case 15:
                r(root);
                break;
            case 16:
                s(root);
                break;
            case 17:
                t(root);
                break;
            case 18:
                u(root);
                break;
            case 19:
                v(root);
                break;
            case 20:
                w(root);
                break;
            default:
                Integer num = 1;
                Intrinsics.checkNotNullParameter(root, "root");
                ae.d O = O();
                String language3 = this.f25251a;
                O.getClass();
                Intrinsics.checkNotNullParameter(language3, "language");
                int hashCode = language3.hashCode();
                if (hashCode == 3201) {
                    if (language3.equals("de")) {
                        str = "Heutzutage erlauben Buchmacher Wetten auf fast alles, es hängt ganz von Ihren Vorlieben ab. Manche bevorzugen Einzelwetten mit niedrigen Quoten, andere wollen mit Kombiwetten einen großen Gewinn erzielen. Jetzt werden wir über die beliebtesten Wetten im Sportwettenbereich sprechen.";
                    }
                    str = "Nowadays bookmakers allow to bet on almost anything, it’s all up to your preferences. Someone prefers single bets with small odds, someone wants to take a big profit using express bets. Now we are going to speak about most popular bets in betting.";
                } else if (hashCode == 3246) {
                    if (language3.equals("es")) {
                        str = "Hoy en día, las casas de apuestas permiten apostar prácticamente en todo, depende de tus preferencias. Algunos prefieren apuestas simples con cuotas bajas, otros buscan obtener grandes beneficios con apuestas combinadas. Ahora vamos a hablar de las apuestas más populares en las apuestas deportivas.";
                    }
                    str = "Nowadays bookmakers allow to bet on almost anything, it’s all up to your preferences. Someone prefers single bets with small odds, someone wants to take a big profit using express bets. Now we are going to speak about most popular bets in betting.";
                } else if (hashCode == 3276) {
                    if (language3.equals("fr")) {
                        str = "De nos jours, les bookmakers permettent de parier sur presque tout, tout dépend de vos préférences. Certains préfèrent les paris simples avec de petites cotes, d'autres veulent réaliser un gros profit avec les paris combinés. Maintenant, nous allons parler des paris les plus populaires dans les paris sportifs.";
                    }
                    str = "Nowadays bookmakers allow to bet on almost anything, it’s all up to your preferences. Someone prefers single bets with small odds, someone wants to take a big profit using express bets. Now we are going to speak about most popular bets in betting.";
                } else if (hashCode == 3588) {
                    if (language3.equals("pt")) {
                        str = "Hoje em dia, as casas de apostas permitem apostar em quase tudo, tudo depende das suas preferências. Alguns preferem apostas simples com odds baixas, outros querem obter grandes lucros com apostas combinadas. Agora vamos falar sobre as apostas mais populares nas apostas desportivas.";
                    }
                    str = "Nowadays bookmakers allow to bet on almost anything, it’s all up to your preferences. Someone prefers single bets with small odds, someone wants to take a big profit using express bets. Now we are going to speak about most popular bets in betting.";
                } else if (hashCode != 3651) {
                    if (hashCode == 3710 && language3.equals("tr")) {
                        str = "Günümüzde bahis siteleri neredeyse her şey üzerine bahis yapmaya izin veriyor, tamamen sizin tercihlerinize bağlı. Bazıları düşük oranlı tekli bahisleri tercih eder, bazıları ise kombine bahislerle büyük kazanç elde etmek ister. Şimdi spor bahislerindeki en popüler bahislerden bahsedeceğiz.";
                    }
                    str = "Nowadays bookmakers allow to bet on almost anything, it’s all up to your preferences. Someone prefers single bets with small odds, someone wants to take a big profit using express bets. Now we are going to speak about most popular bets in betting.";
                } else {
                    if (language3.equals("ru")) {
                        str = "В настоящее время в букмекерских конторах сделать ставку можно практически на всё, что придет в голову. В пользу какой именно сделать выбор - решать только вам, всё зависит от личных предпочтений и знаний. Кто-то не особо любит рисковать, выбирая одинары с небольшими коэффициентами, а кто-то жаждет больших выигрышей, собирая экспрессы. Ниже мы расскажем вам о самых популярных видах ставок у игроков.";
                    }
                    str = "Nowadays bookmakers allow to bet on almost anything, it’s all up to your preferences. Someone prefers single bets with small odds, someone wants to take a big profit using express bets. Now we are going to speak about most popular bets in betting.";
                }
                String str2 = str;
                Boolean bool4 = Boolean.FALSE;
                wd.b bVar16 = new wd.b(str2, 16, 24, 16, 0, this.f25254d, bool4, null, null, null, null, 507918);
                Context context16 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context16, "getContext(...)");
                root.addView(d(context16, bVar16));
                if (O().c(2, this.f25251a).length() > 0) {
                    wd.b bVar17 = new wd.b(O().c(2, this.f25251a), 16, 10, 16, 0, 0, Boolean.TRUE, num, num, null, null, 466702);
                    num = num;
                    Context context17 = root.getContext();
                    Intrinsics.checkNotNullExpressionValue(context17, "getContext(...)");
                    root.addView(d(context17, bVar17));
                }
                wd.b bVar18 = new wd.b(O().c(3, this.f25251a), 16, 10, 16, 0, 0, bool4, null, null, null, null, 515854);
                Context context18 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context18, "getContext(...)");
                root.addView(d(context18, bVar18));
                wd.b bVar19 = new wd.b(O().c(4, this.f25251a), 16, 10, 16, 0, this.f25254d, bool4, null, null, null, null, 511758);
                Context context19 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context19, "getContext(...)");
                root.addView(d(context19, bVar19));
                if (O().c(1, this.f25251a).length() > 0) {
                    wd.b bVar20 = new wd.b(O().c(1, this.f25251a), 16, 10, 16, 0, this.f25254d, bool4, null, null, null, null, 511758);
                    Context context20 = root.getContext();
                    Intrinsics.checkNotNullExpressionValue(context20, "getContext(...)");
                    root.addView(d(context20, bVar20));
                }
                wd.a aVar2 = new wd.a(10);
                Context context21 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context21, "getContext(...)");
                LinearLayout b10 = b(context21, aVar2);
                wd.b bVar21 = new wd.b(O().c(5, this.f25251a), 0, 0, 0, 0, this.f25254d, bool4, null, null, null, null, 511998);
                Context context22 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context22, "getContext(...)");
                wd.b bVar22 = this.f25255e;
                b10.addView(d(context22, bVar22));
                Context context23 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context23, "getContext(...)");
                wd.a c2 = yg.a.c(b10, d(context23, bVar21), root, b10, 0);
                Context context24 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context24, "getContext(...)");
                LinearLayout b11 = b(context24, c2);
                wd.b bVar23 = new wd.b(O().c(6, this.f25251a), 0, 0, 0, 0, this.f25254d, bool4, null, null, null, null, 511998);
                Context context25 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context25, "getContext(...)");
                b11.addView(d(context25, bVar22));
                Context context26 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context26, "getContext(...)");
                wd.a c8 = yg.a.c(b11, d(context26, bVar23), root, b11, 0);
                Context context27 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context27, "getContext(...)");
                LinearLayout b12 = b(context27, c8);
                wd.b bVar24 = new wd.b(O().c(7, this.f25251a), 0, 0, 0, 0, this.f25254d, bool4, null, null, null, null, 511998);
                Context context28 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context28, "getContext(...)");
                b12.addView(d(context28, bVar22));
                Context context29 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context29, "getContext(...)");
                wd.a c10 = yg.a.c(b12, d(context29, bVar24), root, b12, 0);
                Context context30 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context30, "getContext(...)");
                LinearLayout b13 = b(context30, c10);
                wd.b bVar25 = new wd.b(O().c(8, this.f25251a), 0, 0, 0, 0, this.f25254d, bool4, null, null, null, null, 511998);
                Context context31 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context31, "getContext(...)");
                b13.addView(d(context31, bVar22));
                Context context32 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context32, "getContext(...)");
                wd.a c11 = yg.a.c(b13, d(context32, bVar25), root, b13, 0);
                Context context33 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context33, "getContext(...)");
                LinearLayout b14 = b(context33, c11);
                wd.b bVar26 = new wd.b(O().c(9, this.f25251a), 0, 0, 0, 0, this.f25254d, bool4, null, null, null, null, 511998);
                Context context34 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context34, "getContext(...)");
                b14.addView(d(context34, bVar22));
                Context context35 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context35, "getContext(...)");
                wd.a c12 = yg.a.c(b14, d(context35, bVar26), root, b14, 0);
                Context context36 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context36, "getContext(...)");
                LinearLayout b15 = b(context36, c12);
                wd.b bVar27 = new wd.b(O().c(10, this.f25251a), 0, 0, 0, 0, this.f25254d, bool4, null, null, null, null, 511998);
                Context context37 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context37, "getContext(...)");
                b15.addView(d(context37, bVar22));
                Context context38 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context38, "getContext(...)");
                b15.addView(d(context38, bVar27));
                root.addView(b15);
                if (O().c(11, this.f25251a).length() > 0) {
                    wd.b bVar28 = new wd.b(O().c(11, this.f25251a), 16, 10, 16, 0, this.f25254d, bool4, null, null, null, null, 511758);
                    Context context39 = root.getContext();
                    Intrinsics.checkNotNullExpressionValue(context39, "getContext(...)");
                    root.addView(d(context39, bVar28));
                }
                wd.b bVar29 = new wd.b(O().b(1, this.f25251a), 16, 10, 16, 0, 0, bool4, null, null, null, null, 515854);
                Context context40 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context40, "getContext(...)");
                root.addView(d(context40, bVar29));
                wd.b bVar30 = new wd.b(O().b(2, this.f25251a), 16, 10, 16, 0, this.f25254d, bool4, null, null, null, null, 511758);
                Context context41 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context41, "getContext(...)");
                root.addView(d(context41, bVar30));
                wd.a aVar3 = new wd.a(10);
                Context context42 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context42, "getContext(...)");
                LinearLayout b16 = b(context42, aVar3);
                wd.b bVar31 = new wd.b(O().b(3, this.f25251a), 0, 0, 0, 0, this.f25254d, bool4, null, null, null, null, 511998);
                Context context43 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context43, "getContext(...)");
                b16.addView(d(context43, bVar22));
                Context context44 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context44, "getContext(...)");
                b16.addView(d(context44, bVar31));
                root.addView(b16);
                wd.b bVar32 = new wd.b(O().b(4, this.f25251a), 24, 10, 24, 0, this.f25254d, bool4, null, null, null, null, 446222);
                Context context45 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context45, "getContext(...)");
                root.addView(d(context45, bVar32));
                wd.a aVar4 = new wd.a(10);
                Context context46 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context46, "getContext(...)");
                LinearLayout b17 = b(context46, aVar4);
                wd.b bVar33 = new wd.b(O().b(5, this.f25251a), 0, 0, 0, 0, this.f25254d, bool4, null, null, null, null, 511998);
                Context context47 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context47, "getContext(...)");
                b17.addView(d(context47, bVar22));
                Context context48 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context48, "getContext(...)");
                b17.addView(d(context48, bVar33));
                root.addView(b17);
                wd.b bVar34 = new wd.b(O().b(6, this.f25251a), 24, 10, 24, 0, this.f25254d, bool4, null, null, null, null, 446222);
                Context context49 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context49, "getContext(...)");
                root.addView(d(context49, bVar34));
                wd.a aVar5 = new wd.a(10);
                Context context50 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context50, "getContext(...)");
                LinearLayout b18 = b(context50, aVar5);
                wd.b bVar35 = new wd.b(O().b(7, this.f25251a), 0, 0, 0, 0, this.f25254d, bool4, null, null, null, null, 511998);
                Context context51 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context51, "getContext(...)");
                b18.addView(d(context51, bVar22));
                Context context52 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context52, "getContext(...)");
                b18.addView(d(context52, bVar35));
                root.addView(b18);
                wd.b bVar36 = new wd.b(O().b(8, this.f25251a), 24, 10, 24, 0, this.f25254d, bool4, null, null, null, null, 446222);
                Context context53 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context53, "getContext(...)");
                root.addView(d(context53, bVar36));
                wd.b bVar37 = new wd.b(O().b(9, this.f25251a), 16, 10, 16, 0, this.f25254d, bool4, null, null, null, null, 511758);
                Context context54 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context54, "getContext(...)");
                root.addView(d(context54, bVar37));
                wd.b bVar38 = new wd.b(O().e(1, this.f25251a), 16, 10, 16, 0, 0, bool4, null, null, null, null, 515854);
                Context context55 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context55, "getContext(...)");
                root.addView(d(context55, bVar38));
                wd.b bVar39 = new wd.b(O().e(2, this.f25251a), 16, 10, 16, 0, this.f25254d, bool4, null, null, null, null, 511758);
                Context context56 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context56, "getContext(...)");
                root.addView(d(context56, bVar39));
                wd.a aVar6 = new wd.a(10);
                Context context57 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context57, "getContext(...)");
                LinearLayout b19 = b(context57, aVar6);
                wd.b bVar40 = new wd.b(O().e(3, this.f25251a), 0, 0, 0, 0, this.f25254d, bool4, null, null, null, null, 511998);
                Context context58 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context58, "getContext(...)");
                b19.addView(d(context58, bVar22));
                Context context59 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context59, "getContext(...)");
                b19.addView(d(context59, bVar40));
                root.addView(b19);
                wd.b bVar41 = new wd.b(O().e(4, this.f25251a), 24, 10, 24, 0, this.f25254d, bool4, null, null, null, null, 446222);
                Context context60 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context60, "getContext(...)");
                root.addView(d(context60, bVar41));
                wd.a aVar7 = new wd.a(10);
                Context context61 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context61, "getContext(...)");
                LinearLayout b20 = b(context61, aVar7);
                wd.b bVar42 = new wd.b(O().e(5, this.f25251a), 0, 0, 0, 0, this.f25254d, bool4, null, null, null, null, 511998);
                Context context62 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context62, "getContext(...)");
                b20.addView(d(context62, bVar22));
                Context context63 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context63, "getContext(...)");
                b20.addView(d(context63, bVar42));
                root.addView(b20);
                wd.b bVar43 = new wd.b(O().e(6, this.f25251a), 24, 10, 24, 0, this.f25254d, bool4, null, null, null, null, 446222);
                Context context64 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context64, "getContext(...)");
                root.addView(d(context64, bVar43));
                wd.b bVar44 = new wd.b(O().e(7, this.f25251a), 16, 10, 16, 0, this.f25254d, bool4, null, null, null, null, 511758);
                Context context65 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context65, "getContext(...)");
                root.addView(d(context65, bVar44));
                wd.a aVar8 = new wd.a(10);
                Context context66 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context66, "getContext(...)");
                LinearLayout b21 = b(context66, aVar8);
                wd.b bVar45 = new wd.b(O().e(8, this.f25251a), 0, 0, 0, 0, this.f25254d, bool4, null, null, null, null, 511998);
                Context context67 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context67, "getContext(...)");
                b21.addView(d(context67, bVar22));
                Context context68 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context68, "getContext(...)");
                wd.a c13 = yg.a.c(b21, d(context68, bVar45), root, b21, 0);
                Context context69 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context69, "getContext(...)");
                LinearLayout b22 = b(context69, c13);
                wd.b bVar46 = new wd.b(O().e(9, this.f25251a), 0, 0, 0, 0, this.f25254d, bool4, null, null, null, null, 511998);
                Context context70 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context70, "getContext(...)");
                b22.addView(d(context70, bVar22));
                Context context71 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context71, "getContext(...)");
                b22.addView(d(context71, bVar46));
                root.addView(b22);
                wd.b bVar47 = new wd.b(O().a(1, this.f25251a), 16, 10, 16, 0, 0, bool4, 17, num, null, null, 466702);
                Context context72 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context72, "getContext(...)");
                root.addView(d(context72, bVar47));
                wd.b bVar48 = new wd.b(O().a(2, this.f25251a), 16, 10, 16, 0, this.f25254d, bool4, null, null, null, null, 511758);
                Context context73 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context73, "getContext(...)");
                root.addView(d(context73, bVar48));
                wd.b bVar49 = new wd.b(O().d(1, this.f25251a), 16, 10, 16, 0, 0, bool4, 17, num, null, null, 466702);
                Context context74 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context74, "getContext(...)");
                root.addView(d(context74, bVar49));
                wd.b bVar50 = new wd.b(O().d(2, this.f25251a), 16, 10, 16, 0, this.f25254d, bool4, null, null, null, null, 511758);
                Context context75 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context75, "getContext(...)");
                root.addView(d(context75, bVar50));
                wd.b bVar51 = new wd.b(O().d(3, this.f25251a), 16, 10, 16, 0, this.f25254d, bool4, null, null, null, null, 511758);
                Context context76 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context76, "getContext(...)");
                root.addView(d(context76, bVar51));
                break;
        }
    }

    public ee.c a0() {
        return (ee.c) this.f3170g.getValue();
    }

    public ee.d b0() {
        return (ee.d) this.f3170g.getValue();
    }

    @Override // wd.c
    public final int c() {
        switch (this.f3169f) {
            case 0:
                return R.string.vip_access;
            case 1:
                return R.string.express_prediction;
            case 2:
                return R.string.how_delete_account;
            case 3:
                return R.string.How_to_get_a_bonus;
            case 4:
                return R.string.how_to_pay;
            case 5:
                return R.string.recommendation_how_to_place_a_bet;
            case 6:
                return R.string.recommendation_how_to_register_in_bookmaker_office;
            case 7:
                return R.string.recommendation_live;
            case 8:
                return R.string.premium_prediction;
            case 9:
                return R.string.ResponsibleGamingActivityTittle;
            case 10:
                return R.string.Beating_totals;
            case 11:
                return R.string.For_beginners_and_experienced_Betting_strategies;
            case 12:
                return R.string.Corridor_betting;
            case 13:
                return R.string.Value_betting_how_good_is_your_intuition;
            case 14:
                return R.string.Going_deeper_bets_on_cards_and_corners;
            case 15:
                return R.string.Why_does_psychology_matter;
            case 16:
                return R.string.Rational_income_maximization_principle;
            case 17:
                return R.string.Why_does_psychology_matter;
            case 18:
                return R.string.Typical_mistakes;
            case 19:
                return R.string.What_is_losing_streak_and_how_to_deal_with_it;
            case 20:
                return R.string.Betting_first_steps;
            default:
                return R.string.Types_of_bets;
        }
    }

    public ee.e c0() {
        return (ee.e) this.f3170g.getValue();
    }

    public yd.a d0() {
        return (yd.a) this.f3170g.getValue();
    }

    public yd.b e0() {
        return (yd.b) this.f3170g.getValue();
    }

    public yd.c f0() {
        return (yd.c) this.f3170g.getValue();
    }

    public d g0() {
        return (d) this.f3170g.getValue();
    }

    public void x(LinearLayout linearLayout, wd.a aVar, wd.b bVar) {
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LinearLayout b10 = b(context, aVar);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        b10.addView(d(context2, this.f25255e));
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        b10.addView(d(context3, bVar));
        linearLayout.addView(b10);
    }

    public void y(LinearLayout linearLayout, wd.a aVar, wd.b bVar, String str) {
        wd.b bVar2 = new wd.b(str, 0, 0, 0, 5, 0, Boolean.FALSE, null, 4, null, null, 479484);
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LinearLayout b10 = b(context, aVar);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        b10.addView(d(context2, bVar2));
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        b10.addView(d(context3, bVar));
        linearLayout.addView(b10);
    }

    public void z(LinearLayout linearLayout, wd.a aVar, wd.b bVar) {
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LinearLayout b10 = b(context, aVar);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        b10.addView(d(context2, this.f25255e));
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        b10.addView(d(context3, bVar));
        linearLayout.addView(b10);
    }
}
