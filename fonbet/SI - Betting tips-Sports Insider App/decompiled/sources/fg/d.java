package fg;

import android.net.Uri;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.app.t;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.c1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d1;
import androidx.recyclerview.widget.d2;
import bg.n;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.ui.faq.FaqFragment;
import com.sports.insider.ui.news.fragment.NewsFragment;
import com.sports.insider.ui.strip.PredictionListFragment;
import com.sports.insider.ui.support.SupportChat;
import e3.i0;
import e3.j;
import eg.c0;
import eg.m0;
import eg.t1;
import gg.v;
import gg.w;
import hc.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import jg.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m3.g;
import m3.i;
import m3.k;
import m3.l;
import m3.u;
import oi.a0;
import pe.s;
import re.o;
import re.p;
import ve.x;
import y1.b0;
import y1.d0;
import y1.h0;
import y1.j0;
import y1.r;
import y1.t0;
import y1.v0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9620b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9621c;

    public /* synthetic */ d(int i5, Object obj, Object obj2) {
        this.f9619a = i5;
        this.f9620b = obj;
        this.f9621c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int absoluteAdapterPosition;
        SupportChat supportChat;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator rotation;
        ViewPropertyAnimator listener;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator rotation2;
        ViewPropertyAnimator listener2;
        ViewPropertyAnimator duration2;
        b0 c2;
        int i5 = this.f9619a;
        int i10 = 2;
        int i11 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object obj2 = this.f9621c;
        Object obj3 = this.f9620b;
        switch (i5) {
            case 0:
                ((e) obj3).f9622c.removeCallbacks((t) obj2);
                return Unit.f19194a;
            case 1:
                ge.b bVar = (ge.b) obj3;
                hc.c cVar = (hc.c) obj2;
                if (bVar != null) {
                    bVar.v(cVar);
                }
                return Unit.f19194a;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                s2.c r02 = _connection.r0((String) obj3);
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        r02.f(i11, ((Number) it.next()).intValue());
                        i11++;
                    }
                    r02.n0();
                    int q = io.sentry.config.a.q(_connection);
                    r02.close();
                    return Integer.valueOf(q);
                } catch (Throwable th2) {
                    throw th2;
                }
            case 3:
                he.b bVar2 = (he.b) obj3;
                he.c cVar2 = (he.c) obj2;
                if (bVar2.getAbsoluteAdapterPosition() == -1) {
                    return Unit.f19194a;
                }
                int i12 = ((h) cVar2.f10587a.get(bVar2.getAbsoluteAdapterPosition())).f10494a;
                if (i12 < 1) {
                    return Unit.f19194a;
                }
                NewsFragment newsFragment = cVar2.f10589c;
                if (newsFragment != null && i12 > 0) {
                    try {
                        r r5 = a.a.r(newsFragment);
                        ie.b bVar3 = new ie.b();
                        bVar3.f11235a.put("newsId", Integer.valueOf(i12));
                        Intrinsics.checkNotNullExpressionValue(bVar3, "setNewsId(...)");
                        r5.d(bVar3);
                    } catch (IllegalArgumentException | CancellationException unused) {
                    } catch (Exception ex) {
                        Intrinsics.checkNotNullParameter(ex, "ex");
                        jg.d dVar = MyApp.f6830c;
                        lg.e eVar = m0.f9201a;
                        c0.t(dVar, lg.d.f20063c, null, new q4.r(ex, objArr == true ? 1 : 0, 18), 2);
                    }
                }
                return Unit.f19194a;
            case 4:
                ((t1) obj3).k(null);
                ((v) ((w) obj2)).g((i3.c) obj);
                return Unit.f19194a;
            case 5:
                s2.a _connection2 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                ((m3.c) obj3).f20305b.g0(_connection2, (m3.a) obj2);
                return Unit.f19194a;
            case 6:
                s2.a _connection3 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection3, "_connection");
                ((m3.e) obj3).f20309b.g0(_connection3, (m3.d) obj2);
                return Unit.f19194a;
            case 7:
                s2.a _connection4 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection4, "_connection");
                ((i) obj3).f20320b.g0(_connection4, (g) obj2);
                return Unit.f19194a;
            case 8:
                s2.a _connection5 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection5, "_connection");
                ((l) obj3).f20326b.g0(_connection5, (k) obj2);
                return Unit.f19194a;
            case 9:
                i0 i0Var = (i0) obj3;
                String str = (String) obj2;
                s2.a _connection6 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection6, "_connection");
                s2.c r03 = _connection6.r0("UPDATE workspec SET state=? WHERE id=?");
                try {
                    r03.f(1, rh.g.J(i0Var));
                    r03.B(2, str);
                    r03.n0();
                    int q3 = io.sentry.config.a.q(_connection6);
                    r03.close();
                    return Integer.valueOf(q3);
                } finally {
                }
            case 10:
                j jVar = (j) obj3;
                String str2 = (String) obj2;
                s2.a _connection7 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection7, "_connection");
                s2.c r04 = _connection7.r0("UPDATE workspec SET output=? WHERE id=?");
                try {
                    j jVar2 = j.f8531b;
                    r04.g(1, rh.g.L(jVar));
                    r04.B(2, str2);
                    r04.n0();
                    r04.close();
                    return Unit.f19194a;
                } finally {
                }
            case 11:
                s2.a _connection8 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection8, "_connection");
                ((u) obj3).f20366b.g0(_connection8, (m3.t) obj2);
                return Unit.f19194a;
            case 12:
                qe.e eVar2 = (qe.e) obj3;
                d2 d2Var = (d2) obj2;
                if (d2Var instanceof o) {
                    Fragment fragment = eVar2.f22131b;
                    PredictionListFragment predictionListFragment = fragment instanceof PredictionListFragment ? (PredictionListFragment) fragment : null;
                    if (predictionListFragment != null) {
                        c0.t(MyApp.f6830c, null, null, new ad.a(predictionListFragment, objArr3 == true ? 1 : 0, 27), 3);
                        new cd.d().c("open_click_tg_bot", null);
                    }
                } else if (d2Var instanceof p) {
                    Fragment fragment2 = eVar2.f22131b;
                    PredictionListFragment predictionListFragment2 = fragment2 instanceof PredictionListFragment ? (PredictionListFragment) fragment2 : null;
                    if (predictionListFragment2 != null) {
                        s H = predictionListFragment2.H();
                        ((sc.b) H.f21864c.getValue()).getClass();
                        cd.g a7 = sc.b.a();
                        sc.a[] aVarArr = sc.a.f23428a;
                        Intrinsics.checkNotNullParameter("vip", "bannerType");
                        a7.w().c("banner_vip_click", null);
                        a7.n("clickBanner", "vip");
                        da.p pVar = new da.p();
                        pVar.f8341a.put("event", "vip");
                        Intrinsics.checkNotNullExpressionValue(pVar, "also(...)");
                        H.i(pVar);
                    }
                } else if ((d2Var instanceof re.h) || (d2Var instanceof re.i)) {
                    Fragment fragment3 = eVar2.f22131b;
                    PredictionListFragment predictionListFragment3 = fragment3 instanceof PredictionListFragment ? (PredictionListFragment) fragment3 : null;
                    if (predictionListFragment3 != null) {
                        s H2 = predictionListFragment3.H();
                        H2.getClass();
                        WeakReference weakReference = new WeakReference(new dd.a());
                        if (((dd.a) weakReference.get()) == null) {
                            weakReference = new WeakReference(new dd.a());
                        }
                        dd.a aVar = (dd.a) weakReference.get();
                        if (aVar != null) {
                            aVar.w().c("banner_live_click", null);
                            aVar.n("clickBanner", "live");
                            Unit unit = Unit.f19194a;
                        }
                        u1.a i13 = d1.i(H2);
                        lg.e eVar3 = m0.f9201a;
                        c0.t(i13, q.f18523a, null, new ad.a(H2, objArr2 == true ? 1 : 0, 29), 2);
                    }
                } else if (((d2Var instanceof re.g) || (d2Var instanceof re.k) || (d2Var instanceof re.c)) && (absoluteAdapterPosition = d2Var.getAbsoluteAdapterPosition()) != -1) {
                    hc.f fVar = (hc.f) eVar2.f22130a.get(absoluteAdapterPosition);
                    if (fVar instanceof ja.c) {
                        Fragment fragment4 = eVar2.f22131b;
                        pe.h hVar = c1.v(fragment4) ? (pe.h) fragment4 : null;
                        if (hVar != null) {
                            hVar.l((ja.c) fVar);
                        }
                    }
                }
                return Unit.f19194a;
            case 13:
                a0 a0Var = (a0) obj2;
                if (((eg.r) obj3).isCancelled()) {
                    a0Var.cancel();
                }
                return Unit.f19194a;
            case 14:
                sd.h hVar2 = (sd.h) obj2;
                int absoluteAdapterPosition2 = ((sd.g) obj3).getAbsoluteAdapterPosition();
                if (absoluteAdapterPosition2 != -1) {
                    lc.e eVar4 = (lc.e) hVar2.f23481a.get(absoluteAdapterPosition2);
                    com.android.billingclient.api.i iVar = hVar2.f23482b;
                    if (iVar != null) {
                        Uri uri = eVar4 != null ? eVar4.f19674b : null;
                        sd.f fVar2 = (sd.f) iVar.f4028b;
                        if (fVar2 != null) {
                            SupportChat supportChat2 = (SupportChat) fVar2;
                            supportChat2.I().j(uri);
                            if (uri != null) {
                                supportChat2.I().getClass();
                                c0.t(MyApp.f6830c, rc.b0.b(), null, new cd.s(new cd.d(), objArr4 == true ? 1 : 0, 6), 2);
                            }
                        }
                        iVar.a();
                    }
                }
                return Unit.f19194a;
            case 15:
                ka.a aVar2 = (ka.a) obj2;
                te.q qVar = (te.q) ((ge.i) obj3).f9976b;
                if (qVar != null) {
                    String str3 = aVar2.f18954k;
                    String str4 = aVar2.j;
                    qVar.getClass();
                    if (str3 != null && str4 != null && lc.d.f19672b.contains(str4) && (supportChat = (SupportChat) qVar.f23915c) != null) {
                        supportChat.getClass();
                        if (str3 != null && str4 != null && lc.d.f19672b.contains(str4)) {
                            x xVar = supportChat.f7047e;
                            if (xVar != null) {
                                List images = kotlin.collections.t.c(str3);
                                Intrinsics.checkNotNullParameter(images, "images");
                                ArrayList arrayList2 = xVar.f24915a;
                                arrayList2.clear();
                                arrayList2.addAll(images);
                            }
                            x xVar2 = supportChat.f7047e;
                            if (xVar2 != null) {
                                xVar2.a();
                            }
                            supportChat.I().getClass();
                            c0.t(MyApp.f6830c, rc.b0.b(), null, new cd.s(new cd.d(), objArr5 == true ? 1 : 0, i10), 2);
                        }
                    }
                }
                return Unit.f19194a;
            case 16:
                int i14 = 0;
                if (((jc.c) obj3).f18429d) {
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.sports.insider.ui.faq.adapters.FaqAdapter.FaqItemViewHolder");
                    ud.b bVar4 = (ud.b) obj2;
                    View v5 = bVar4.itemView.findViewById(R.id.faq_description_layout);
                    Intrinsics.checkNotNullExpressionValue(v5, "findViewById(...)");
                    Intrinsics.checkNotNullParameter(v5, "v");
                    we.b bVar5 = new we.b(v5, v5.getMeasuredHeight(), 0);
                    bVar5.setDuration((int) (r3 / v5.getContext().getResources().getDisplayMetrics().density));
                    v5.startAnimation(bVar5);
                    long duration3 = bVar5.getDuration();
                    AppCompatImageView appCompatImageView = (AppCompatImageView) bVar4.itemView.findViewById(R.id.arrow_view);
                    if (appCompatImageView != null && (animate2 = appCompatImageView.animate()) != null && (rotation2 = animate2.rotation(-360.0f)) != null && (listener2 = rotation2.setListener(new ud.f(i14, obj3, obj2))) != null && (duration2 = listener2.setDuration(duration3)) != null) {
                        duration2.start();
                    }
                } else {
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.sports.insider.ui.faq.adapters.FaqAdapter.FaqItemViewHolder");
                    ud.b bVar6 = (ud.b) obj2;
                    View v10 = bVar6.itemView.findViewById(R.id.faq_description_layout);
                    Intrinsics.checkNotNullExpressionValue(v10, "findViewById(...)");
                    Intrinsics.checkNotNullParameter(v10, "v");
                    v10.measure(-1, -2);
                    int measuredHeight = v10.getMeasuredHeight();
                    v10.getLayoutParams().height = 1;
                    v10.setVisibility(0);
                    we.b bVar7 = new we.b(v10, measuredHeight, 1);
                    bVar7.setDuration((int) (measuredHeight / v10.getContext().getResources().getDisplayMetrics().density));
                    v10.startAnimation(bVar7);
                    long duration4 = bVar7.getDuration();
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) bVar6.itemView.findViewById(R.id.arrow_view);
                    if (appCompatImageView2 != null && (animate = appCompatImageView2.animate()) != null && (rotation = animate.rotation(-180.0f)) != null && (listener = rotation.setListener(new ud.f(i11, obj3, obj2))) != null && (duration = listener.setDuration(duration4)) != null) {
                        duration.start();
                    }
                }
                return Unit.f19194a;
            case 17:
                FaqFragment faqFragment = (FaqFragment) ((te.q) obj3).f23915c;
                if (faqFragment != null) {
                    faqFragment.c(((jc.d) obj2).f18434c);
                }
                return Unit.f19194a;
            case 18:
                b0 b0Var = (b0) obj3;
                b2.j jVar3 = ((r) obj2).f25625b;
                j0 navOptions = (j0) obj;
                Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
                ub.b animBuilder = new ub.b(7);
                navOptions.getClass();
                Intrinsics.checkNotNullParameter(animBuilder, "animBuilder");
                y1.d dVar2 = new y1.d();
                dVar2.f25540a = -1;
                dVar2.f25541b = -1;
                animBuilder.invoke(dVar2);
                h0 h0Var = navOptions.f25573a;
                h0Var.f25558f = dVar2.f25540a;
                h0Var.f25559g = dVar2.f25541b;
                h0Var.f25560h = -1;
                h0Var.f25561i = -1;
                if (b0Var instanceof d0) {
                    int i15 = b0.f25532f;
                    Intrinsics.checkNotNullParameter(b0Var, "<this>");
                    Iterator it2 = n.b(new ub.b(12), b0Var).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            b0 b0Var2 = (b0) it2.next();
                            b0 f6 = jVar3.f();
                            if (Intrinsics.areEqual(b0Var2, f6 != null ? f6.f25535c : null)) {
                            }
                        } else {
                            int i16 = d0.f25542h;
                            int i17 = y4.a.t(jVar3.g()).f25534b.f3017e;
                            ub.b popUpToBuilder = new ub.b(8);
                            Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
                            navOptions.f25576d = i17;
                            v0 v0Var = new v0();
                            popUpToBuilder.invoke(v0Var);
                            navOptions.f25577e = v0Var.f25642a;
                        }
                    }
                }
                return Unit.f19194a;
            case 19:
                t0 t0Var = (t0) obj3;
                y1.i0 i0Var2 = (y1.i0) obj2;
                y1.l backStackEntry = (y1.l) obj;
                Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
                b0 b0Var3 = backStackEntry.f25583b;
                b2.d dVar3 = backStackEntry.f25589h;
                if (b0Var3 == null) {
                    b0Var3 = null;
                }
                if (b0Var3 == null || (c2 = t0Var.c(b0Var3, dVar3.a(), i0Var2)) == null) {
                    return null;
                }
                return Intrinsics.areEqual(c2, b0Var3) ? backStackEntry : t0Var.b().b(c2, c2.a(dVar3.a()));
            default:
                y8.g gVar = (y8.g) obj3;
                String str5 = (String) obj2;
                g1.a aVar3 = (g1.a) obj;
                gVar.getClass();
                aVar3.e(y8.g.f25733d, str5);
                gVar.h(aVar3, str5);
                return null;
        }
    }
}
