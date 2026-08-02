package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.app.AlertDialog;
import android.content.Context;
import android.text.format.DateFormat;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer;
import com.blaze.blazesdk.players.ui.BackToLiveButtonView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.results.dialog.BaseSuggestChangesDialog;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.team.TeamActivity;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.vungle.ads.internal.protos.Sdk;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class j4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MeasurementManager measurementManager;
        DateTimeFormatter a;
        cvl binding_delegate$lambda$0;
        Object[] objArr = 0;
        int i = 1;
        int i2 = 0;
        switch (this.a) {
            case 0:
                l4 l4Var = (l4) this.b;
                RecyclerView recyclerView = (RecyclerView) this.c;
                Context context = recyclerView.getContext();
                context.getClass();
                krk g = l4Var.g(context);
                g.getRoot().setLayoutDirection(recyclerView.getLayoutDirection());
                return g;
            case 1:
                return k6.j((Context) this.b, (k6) this.c);
            case 2:
                s8 s8Var = (s8) this.b;
                return new osi(s8Var.p, (ViewPager2) this.c, new l1(s8Var, i));
            case 3:
                ((ndb) this.b).f((AccessibilityManager) this.c);
                return Unit.a;
            case 4:
                AlertDialog alertDialog = (AlertDialog) this.b;
                fsf fsfVar = (fsf) this.c;
                alertDialog.getButton(-1).setEnabled(false);
                fsfVar.a = null;
                return Unit.a;
            case 5:
                measurementManager = ((AndroidAttribution) this.b).getMeasurementManager((Context) this.c);
                return measurementManager;
            case 6:
                ((fsf) this.b).a = ((Function0) this.c).invoke();
                return Unit.a;
            case 7:
                ((ln2) this.b).d(this.c);
                return Unit.a;
            case 8:
                return d70.b((d70) this.b, (asf) this.c);
            case 9:
                Function1 function1 = (Function1) this.b;
                y80 y80Var = (y80) this.c;
                bx7 bx7Var = y80Var.l;
                Integer valueOf = bx7Var != null ? Integer.valueOf(bx7Var.a) : null;
                iy7 iy7Var = y80Var.m;
                Integer num = iy7Var != null ? iy7Var.a : null;
                hy7 hy7Var = y80Var.n;
                function1.invoke(new vv7(valueOf, num, hy7Var != null ? Integer.valueOf(hy7Var.a) : null));
                return Unit.a;
            case 10:
                Context context2 = (Context) this.b;
                Long l = ((y80) this.c).l.l;
                long longValue = l != null ? l.longValue() : 0L;
                context2.getClass();
                if (fc6.B(fc6.t(Instant.ofEpochSecond(longValue)))) {
                    String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context2) ? "Hm" : "hm");
                    bestPattern.getClass();
                    a = hk4.a(bestPattern);
                } else {
                    bi4 bi4Var = bi4.PATTERN_DM;
                    ConcurrentHashMap concurrentHashMap = hk4.a;
                    a = hk4.a(bi4Var.d());
                }
                return fc6.i(longValue, a);
            case 11:
                ((zd3) this.b).c = (Function0) this.c;
                return Unit.a;
            case 12:
                binding_delegate$lambda$0 = BackToLiveButtonView.binding_delegate$lambda$0((Context) this.b, (BackToLiveButtonView) this.c);
                return binding_delegate$lambda$0;
            case 13:
                hy0 hy0Var = (hy0) this.b;
                yma ymaVar = (yma) this.c;
                hy0Var.w = hy0Var.r.a(ymaVar.a.n(), ymaVar.getLayoutDirection(), ymaVar);
                return Unit.a;
            case 14:
                g21 g21Var = (g21) this.b;
                f21 f21Var = (f21) this.c;
                um3 um3Var = g21Var.a;
                um3Var.getClass();
                synchronized (um3Var.c) {
                    if (um3Var.d.remove(f21Var) && um3Var.d.isEmpty()) {
                        um3Var.d();
                    }
                }
                return Unit.a;
            case 15:
                ((e1d) this.c).setValue(this.b);
                return Unit.a;
            case 16:
                e1d e1dVar = (e1d) this.b;
                znh znhVar = (znh) this.c;
                e1dVar.setValue(Boolean.FALSE);
                znhVar.i(Integer.MAX_VALUE);
                return Unit.a;
            case 17:
                c25 c25Var = (c25) this.b;
                BaseSuggestChangesDialog baseSuggestChangesDialog = (BaseSuggestChangesDialog) this.c;
                c25Var.a.clearFocus();
                CoordinatorLayout coordinatorLayout = c25Var.a;
                coordinatorLayout.getClass();
                Context context3 = coordinatorLayout.getContext();
                context3.getClass();
                InputMethodManager inputMethodManager = (InputMethodManager) context3.getSystemService(InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(coordinatorLayout.getWindowToken(), 0);
                }
                if (!baseSuggestChangesDialog.w()) {
                    baseSuggestChangesDialog.z();
                }
                return Unit.a;
            case 18:
                Context context4 = (Context) this.b;
                pl0 pl0Var = (pl0) this.c;
                int i3 = TeamActivity.Z;
                jle.r(context4, pl0Var.a, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return Unit.a;
            case 19:
                Context context5 = (Context) this.b;
                p91 p91Var = (p91) this.c;
                int i4 = PlayerActivity.Z;
                jle.q(context5, p91Var.a, 0, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                return Unit.a;
            case 20:
                ((Function1) this.b).invoke((ml1) this.c);
                return Unit.a;
            case 21:
                ((Function1) this.b).invoke((kl1) this.c);
                return Unit.a;
            case 22:
                ((Function1) this.b).invoke(Integer.valueOf(((lm1) this.c).a));
                return Unit.a;
            case 23:
                ((Function1) this.b).invoke(Integer.valueOf(((tm1) this.c).a));
                return Unit.a;
            case 24:
                wcj wcjVar = (wcj) this.b;
                e1d e1dVar2 = (e1d) this.c;
                if (!pej.c(wcjVar.b, ((wcj) e1dVar2.getValue()).b) || !Intrinsics.c(wcjVar.c, ((wcj) e1dVar2.getValue()).c)) {
                    e1dVar2.setValue(wcjVar);
                }
                return Unit.a;
            case 25:
                hej hejVar = (hej) this.b;
                q80 q80Var = (q80) this.c;
                if (hejVar == null) {
                    return q80Var;
                }
                SnapshotStateList snapshotStateList = hejVar.c;
                boolean isEmpty = snapshotStateList.isEmpty();
                q80 q80Var2 = hejVar.b;
                if (!isEmpty) {
                    w7j w7jVar = new w7j(q80Var2);
                    int size = snapshotStateList.size();
                    while (i2 < size) {
                        ((Function1) snapshotStateList.get(i2)).invoke(w7jVar);
                        i2++;
                    }
                    q80Var2 = w7jVar.b;
                }
                hejVar.b = q80Var2;
                return q80Var2 == null ? q80Var : q80Var2;
            case 26:
                xw3.L((ku3) this.b, null, null, new lp1((ykj) this.c, objArr == true ? 1 : 0, i2), 3);
                return Boolean.TRUE;
            case 27:
                Context context6 = (Context) this.b;
                coe coeVar = (coe) this.c;
                int i5 = PlayerActivity.Z;
                jle.q(context6, coeVar.a, 0, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                return Unit.a;
            case 28:
                ((ir1) this.b).p((y21) this.c, true, true);
                return Unit.a;
            default:
                return BlazeBaseInlinePlayerContainer.a((AtomicBoolean) this.b, (BlazeBaseInlinePlayerContainer) this.c);
        }
    }
}
