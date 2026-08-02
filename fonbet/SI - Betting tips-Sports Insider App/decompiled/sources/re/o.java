package re;

import android.content.Context;
import androidx.recyclerview.widget.d2;
import c4.v;
import c4.y;
import com.sports.insider.R;
import com.sports.insider.ui.views.TelegramBannerView;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o extends d2 {

    /* renamed from: a, reason: collision with root package name */
    public TelegramBannerView f22493a;

    public static final void b(o oVar, c4.m mVar) {
        c4.a aVar = mVar instanceof c4.a ? (c4.a) mVar : null;
        oVar.f22493a.setBitmapFt(aVar != null ? aVar.f3564a : null);
    }

    public static final void c(o oVar, c4.m mVar) {
        c4.a aVar = mVar instanceof c4.a ? (c4.a) mVar : null;
        oVar.f22493a.setBitmapSi(aVar != null ? aVar.f3564a : null);
    }

    public static final void d(o oVar, c4.m mVar) {
        c4.a aVar = mVar instanceof c4.a ? (c4.a) mVar : null;
        oVar.f22493a.setBitmapTg(aVar != null ? aVar.f3564a : null);
    }

    public final void e(Context context, int i5, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (i5 <= 0 || i10 <= 0) {
            return;
        }
        q4.e eVar = new q4.e(context);
        eVar.f21940c = Integer.valueOf(R.drawable.ball_white);
        eVar.f21951o = r4.g.f22298a;
        eVar.c(i5, i10);
        q4.b bVar = q4.b.f21931d;
        eVar.f21946i = bVar;
        eVar.f21945h = bVar;
        eVar.j = bVar;
        eVar.f21941d = new n(this, 0);
        ((v) y.a(context)).a(eVar.a());
    }

    public final void f(Context context, int i5, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (i5 <= 0 || i10 <= 0) {
            return;
        }
        q4.e eVar = new q4.e(context);
        eVar.f21940c = Integer.valueOf(R.drawable.sportinsider);
        eVar.f21951o = r4.g.f22298a;
        eVar.c(i5, i10);
        q4.b bVar = q4.b.f21930c;
        eVar.f21946i = bVar;
        eVar.f21945h = bVar;
        eVar.j = q4.b.f21931d;
        eVar.f21941d = new n(this, 1);
        ((v) y.a(context)).a(eVar.a());
    }

    public final void g(Context context, int i5, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (i5 <= 0 || i10 <= 0) {
            return;
        }
        q4.e eVar = new q4.e(context);
        eVar.f21940c = Integer.valueOf(R.drawable.tgicon);
        eVar.f21951o = r4.g.f22298a;
        eVar.c(i5, i10);
        q4.b bVar = q4.b.f21930c;
        eVar.f21946i = bVar;
        eVar.f21945h = bVar;
        eVar.j = q4.b.f21931d;
        eVar.f21941d = new n(this, 2);
        ((v) y.a(context)).a(eVar.a());
    }
}
