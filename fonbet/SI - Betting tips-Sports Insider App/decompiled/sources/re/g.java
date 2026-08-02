package re;

import android.content.Context;
import android.os.CountDownTimer;
import androidx.recyclerview.widget.d2;
import c4.v;
import c4.y;
import com.sports.insider.R;
import kotlin.text.StringsKt;
import ve.u;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends d2 {

    /* renamed from: a, reason: collision with root package name */
    public u f22477a;

    /* renamed from: b, reason: collision with root package name */
    public CountDownTimer f22478b;

    /* renamed from: c, reason: collision with root package name */
    public long f22479c;

    public static final void b(g gVar, c4.m mVar) {
        c4.a aVar = mVar instanceof c4.a ? (c4.a) mVar : null;
        gVar.f22477a.setBitmap(aVar != null ? aVar.f3564a : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r1 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Context context, String str, int i5, int i10) {
        Object obj;
        int i11 = R.drawable.bg_prediction;
        if (str != null && str.length() != 0) {
            boolean H = StringsKt.H(str);
            obj = str;
        }
        obj = Integer.valueOf(R.drawable.bg_prediction);
        q4.e eVar = new q4.e(context);
        eVar.f21940c = obj;
        eVar.f21951o = r4.g.f22298a;
        eVar.c(i5, i10);
        q4.j.c(eVar, R.drawable.bg_prediction);
        eVar.f21948l = new eb.b(i11, 9);
        q4.b bVar = q4.b.f21930c;
        eVar.f21946i = bVar;
        eVar.f21945h = bVar;
        eVar.j = bVar;
        eVar.f21941d = new d(this, 0);
        ((v) y.a(context)).a(eVar.a());
    }

    public final void d(Context context, int i5, String str) {
        if (str == null || str.length() == 0 || StringsKt.H(str)) {
            f(null);
            return;
        }
        q4.e eVar = new q4.e(context);
        eVar.f21940c = str;
        eVar.f21951o = r4.g.f22299b;
        eVar.c(i5, i5);
        q4.b bVar = q4.b.f21930c;
        eVar.f21946i = bVar;
        eVar.f21945h = bVar;
        eVar.j = bVar;
        eVar.f21941d = new d(this, 1);
        ((v) y.a(context)).a(eVar.a());
    }

    public final void e(Context context, int i5, String str) {
        if (str == null || str.length() == 0 || StringsKt.H(str)) {
            g(null);
            return;
        }
        q4.e eVar = new q4.e(context);
        eVar.f21940c = str;
        eVar.f21951o = r4.g.f22299b;
        eVar.c(i5, i5);
        q4.b bVar = q4.b.f21930c;
        eVar.f21946i = bVar;
        eVar.f21945h = bVar;
        eVar.j = bVar;
        eVar.f21941d = new d(this, 2);
        ((v) y.a(context)).a(eVar.a());
    }

    public final void f(c4.m mVar) {
        c4.a aVar = mVar instanceof c4.a ? (c4.a) mVar : null;
        this.f22477a.setBitmapFlagGuest(aVar != null ? aVar.f3564a : null);
    }

    public final void g(c4.m mVar) {
        c4.a aVar = mVar instanceof c4.a ? (c4.a) mVar : null;
        this.f22477a.setBitmapFlagHome(aVar != null ? aVar.f3564a : null);
    }

    public final void h() {
        CountDownTimer countDownTimer = this.f22478b;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f22478b = null;
    }
}
