package de;

import android.content.Context;
import android.widget.LinearLayout;
import com.sports.insider.R;
import gf.k;
import gf.t;
import kotlin.jvm.internal.Intrinsics;
import wd.b;
import wd.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: f, reason: collision with root package name */
    public final b f8369f = new b("-", 0, 0, 0, 5, 0, Boolean.FALSE, null, 4, null, null, 479484);

    /* renamed from: g, reason: collision with root package name */
    public final t f8370g = k.b(new b2.b(15));

    @Override // wd.c
    public final void a(LinearLayout root) {
        Intrinsics.checkNotNullParameter(root, "root");
        String a7 = f().a(1, this.f25251a);
        Boolean bool = Boolean.FALSE;
        b bVar = new b(a7, 16, 24, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        root.addView(d(context, bVar));
        if (f().a(2, this.f25251a).length() > 0) {
            b bVar2 = new b(f().a(2, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
            Context context2 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            root.addView(d(context2, bVar2));
        }
        b bVar3 = new b(f().a(3, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context3 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        root.addView(d(context3, bVar3));
        wd.a aVar = new wd.a(0);
        Context context4 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        LinearLayout b10 = b(context4, aVar);
        b bVar4 = new b(f().a(4, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998);
        Context context5 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        b bVar5 = this.f8369f;
        b10.addView(d(context5, bVar5));
        Context context6 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        wd.a c2 = yg.a.c(b10, d(context6, bVar4), root, b10, 0);
        Context context7 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        LinearLayout b11 = b(context7, c2);
        b bVar6 = new b(f().a(5, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998);
        Context context8 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        b11.addView(d(context8, bVar5));
        Context context9 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
        wd.a c8 = yg.a.c(b11, d(context9, bVar6), root, b11, 0);
        Context context10 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
        LinearLayout b12 = b(context10, c8);
        b bVar7 = new b(f().a(6, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998);
        Context context11 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
        b12.addView(d(context11, bVar5));
        Context context12 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
        wd.a c10 = yg.a.c(b12, d(context12, bVar7), root, b12, 0);
        Context context13 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context13, "getContext(...)");
        LinearLayout b13 = b(context13, c10);
        b bVar8 = new b(f().a(7, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998);
        Context context14 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context14, "getContext(...)");
        b13.addView(d(context14, bVar5));
        Context context15 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context15, "getContext(...)");
        wd.a c11 = yg.a.c(b13, d(context15, bVar8), root, b13, 0);
        Context context16 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context16, "getContext(...)");
        LinearLayout b14 = b(context16, c11);
        b bVar9 = new b(f().a(8, this.f25251a), 0, 0, 0, 0, this.f25254d, bool, null, null, null, null, 511998);
        Context context17 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context17, "getContext(...)");
        b14.addView(d(context17, bVar5));
        Context context18 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context18, "getContext(...)");
        b14.addView(d(context18, bVar9));
        root.addView(b14);
        b bVar10 = new b(f().a(9, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context19 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context19, "getContext(...)");
        root.addView(d(context19, bVar10));
        b bVar11 = new b(f().a(10, this.f25251a), 16, 10, 16, 0, this.f25254d, bool, null, null, null, null, 511758);
        Context context20 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context20, "getContext(...)");
        root.addView(d(context20, bVar11));
    }

    @Override // wd.c
    public final int c() {
        return R.string.Both_teams_to_score;
    }

    public final ee.b f() {
        return (ee.b) this.f8370g.getValue();
    }
}
