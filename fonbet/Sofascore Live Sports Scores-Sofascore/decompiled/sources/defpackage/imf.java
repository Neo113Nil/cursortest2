package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResult;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.internal.CheckableImageButton;
import com.mbridge.msdk.config.activity.backdispatcher.b;
import com.mbridge.msdk.config.component.vc.VCCpt;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.results.R;
import com.sofascore.results.referee.RefereeActivity;
import com.sofascore.results.settings.SettingsFragment;
import com.sofascore.results.stagesport.StageConstructorActivity;
import com.sofascore.results.stagesport.StageDriverActivity;
import com.sofascore.results.team.TeamActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class imf implements wwg, dpi, qdb, yu4, azf, xd, at2, rk, PurchasesUpdatedListener, wn3, kpd, fei, OnSuccessListener, lqi, Continuation, b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ imf(vdb vdbVar, gvf gvfVar) {
        this.a = 2;
        this.b = vdbVar;
    }

    @Override // defpackage.kpd
    public x9l L(View view, x9l x9lVar) {
        pqi pqiVar = (pqi) this.b;
        ArrayList arrayList = pqiVar.b;
        u9l u9lVar = x9lVar.a;
        u4a b = u4a.b(u9lVar.i(519), u9lVar.i(64));
        u4a b2 = u4a.b(u9lVar.j(519), u9lVar.j(64));
        if (!b.equals(pqiVar.c) || !b2.equals(pqiVar.d)) {
            pqiVar.c = b;
            pqiVar.d = b2;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                vef vefVar = (vef) arrayList.get(size);
                vefVar.c = b;
                vefVar.d = b2;
                vefVar.c();
            }
        }
        return x9lVar;
    }

    @Override // com.mbridge.msdk.config.activity.backdispatcher.b
    public void a() {
        ((VCCpt) this.b).k();
    }

    @Override // defpackage.wn3
    public void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 18:
                sli sliVar = (sli) obj2;
                q74 q74Var = (q74) obj;
                rli rliVar = new rli(q74Var.b, uxf.A(q74Var.a, q74Var.c));
                sliVar.c.add(rliVar);
                long j = sliVar.j;
                if (j == C.TIME_UNSET || q74Var.d >= j) {
                    sliVar.f(rliVar);
                    break;
                }
                break;
            default:
                ((zu9) obj2).c((q74) obj);
                break;
        }
    }

    @Override // defpackage.yu4
    public void b(vff vffVar) {
        pw3 pw3Var = (pw3) this.b;
        g7h g7hVar = ((lxf) ((k58) vffVar.get())).b("firebase").k;
        ((Set) g7hVar.e).add(pw3Var);
        Task b = ((di3) g7hVar.b).b();
        b.addOnSuccessListener((Executor) g7hVar.d, new li3(13, g7hVar, b, pw3Var));
    }

    @Override // defpackage.rk
    public hr9 c() {
        return ((bhi) this.b).g;
    }

    @Override // defpackage.at2
    public void d() {
        CheckableImageButton checkableImageButton = ((xbi) this.b).d;
        fkf.P(checkableImageButton, checkableImageButton.getContentDescription());
    }

    @Override // defpackage.azf
    public void e(long j, j9e j9eVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 8:
                ao2.n(j, j9eVar, (vsj[]) ((sx2) obj).b);
                break;
            default:
                ao2.o(j, j9eVar, (vsj[]) ((ejg) obj).b);
                break;
        }
    }

    public void f() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 10:
                i20 i20Var = (i20) obj;
                synchronized (snh.c) {
                    snh.i = CollectionsKt.s0(snh.i, i20Var);
                    Unit unit = Unit.a;
                }
                snh.c();
                return;
            default:
                Function2 function2 = (Function2) obj;
                synchronized (snh.c) {
                    snh.h = CollectionsKt.s0(snh.h, function2);
                    Unit unit2 = Unit.a;
                }
                return;
        }
    }

    @Override // defpackage.dpi
    public void g() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                int i2 = RefereeActivity.R;
                ((RefereeActivity) obj).N();
                break;
            case 12:
                int i3 = StageConstructorActivity.R;
                ((StageConstructorActivity) obj).N();
                break;
            case 13:
                int i4 = StageDriverActivity.R;
                ((StageDriverActivity) obj).N();
                break;
            default:
                int i5 = TeamActivity.Z;
                ((TeamActivity) obj).N();
                break;
        }
    }

    public void h(byte[] bArr) {
        ((p03) this.b).x(new cu0(null, bArr, i7f.a, null), new ogj(15));
    }

    public float i(float f) {
        return ((zci) this.b).k.j() * f;
    }

    @Override // defpackage.qdb
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 3:
                ((wke) obj).onTimelineChanged((mij) obj2, 1);
                break;
            case 4:
                ((wke) obj).onPlaybackParametersChanged((hke) obj2);
                break;
            case 5:
                ((wke) obj).onTracksChanged((uuj) obj2);
                break;
            default:
                ((wke) obj).onMediaItemTransition((h6c) obj2, 2);
                break;
        }
    }

    @Override // defpackage.xd
    public void onActivityResult(Object obj) {
        SettingsFragment settingsFragment = (SettingsFragment) this.b;
        ActivityResult activityResult = (ActivityResult) obj;
        activityResult.getClass();
        if (activityResult.a == -1) {
            int i = l94.C;
            Context requireContext = settingsFragment.requireContext();
            requireContext.getClass();
            krk krkVar = settingsFragment.l;
            krkVar.getClass();
            FrameLayout frameLayout = ((qp8) krkVar).a;
            frameLayout.getClass();
            String string = settingsFragment.getString(R.string.delete_account_success_message);
            string.getClass();
            wxf.x(requireContext, frameLayout, string, 0, settingsFragment.requireContext().getColor(R.color.surface_T), null, 2000, null, 1512).i();
        }
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List list) {
        bli bliVar = (bli) this.b;
        billingResult.getClass();
        if (billingResult.getResponseCode() != 0 || list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            List<String> products = ((Purchase) obj).getProducts();
            products.getClass();
            if (!products.isEmpty()) {
                Iterator<T> it = products.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (fli.a.contains((String) it.next())) {
                            arrayList.add(obj);
                            break;
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((Purchase) obj2).getProducts().contains("ai_analysis_subscription")) {
                arrayList2.add(obj2);
            }
        }
        bliVar.i(arrayList2, false);
        bliVar.h(arrayList);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 24:
                ((ncj) obj2).invoke(obj);
                break;
            default:
                ((mwj) obj2).invoke(obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((CountDownLatch) this.b).countDown();
        return null;
    }

    @Override // defpackage.lqi
    public Object v() {
        mlg mlgVar = (mlg) ((ji3) this.b).i;
        SQLiteDatabase h = mlgVar.h();
        h.beginTransaction();
        try {
            h.compileStatement("DELETE FROM log_event_dropped").execute();
            h.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + mlgVar.b.getTime()).execute();
            h.setTransactionSuccessful();
            h.endTransaction();
            return null;
        } catch (Throwable th) {
            h.endTransaction();
            throw th;
        }
    }

    public /* synthetic */ imf(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
