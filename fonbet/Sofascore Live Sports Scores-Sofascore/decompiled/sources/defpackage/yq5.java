package defpackage;

import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.messaging.FirebaseMessaging;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.media.C3322bk;
import com.inmobi.media.H1;
import com.inmobi.media.Kc;
import com.inmobi.media.Kj;
import com.inmobi.media.N2;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import com.ironsource.EnumC4373w5;
import com.ironsource.InterfaceC4060ee;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.event.details.view.HorizontalBarView;
import com.sofascore.results.main.MainActivity;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
import com.vungle.ads.internal.persistence.FilePreferences;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class yq5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yq5(af9 af9Var, String str, HorizontalBarView horizontalBarView) {
        this.a = 10;
        this.b = af9Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        long j;
        boolean z;
        long j2;
        int i;
        boolean z2;
        int i2 = this.a;
        long j3 = C.TIME_UNSET;
        int i3 = -1;
        boolean z3 = true;
        switch (i2) {
            case 0:
                EventActivity eventActivity = (EventActivity) this.b;
                dsf dsfVar = (dsf) this.c;
                wxf wxfVar = EventActivity.h0;
                eventActivity.R().k.c(dsfVar.a, true);
                break;
            case 1:
                d66 d66Var = (d66) this.b;
                Event event = (Event) this.c;
                TextView textView = d66Var.d.b;
                switch (event.getStatus().getCode()) {
                    case 32:
                        string = d66Var.getContext().getString(R.string.status_awaiting_extra_time_short);
                        break;
                    case 33:
                        string = d66Var.getContext().getString(R.string.status_extra_time_halftime_short);
                        break;
                    case 34:
                        string = d66Var.getContext().getString(R.string.status_awaiting_penalties_short);
                        break;
                    default:
                        string = d66Var.getContext().getString(R.string.penalties);
                        break;
                }
                textView.setText(string);
                break;
            case 2:
                ug6 ug6Var = (ug6) this.b;
                ch6 ch6Var = (ch6) this.c;
                int i4 = ug6Var.H - ch6Var.c;
                ug6Var.H = i4;
                if (ch6Var.d) {
                    ug6Var.I = ch6Var.e;
                    ug6Var.J = true;
                }
                if (ch6Var.f) {
                    ug6Var.K = ch6Var.g;
                }
                if (i4 == 0) {
                    lij lijVar = ch6Var.b.a;
                    if (!ug6Var.i0.a.p() && lijVar.p()) {
                        ug6Var.j0 = -1;
                        ug6Var.k0 = 0L;
                    }
                    if (!lijVar.p()) {
                        List asList = Arrays.asList(((rye) lijVar).h);
                        qx9.t(asList.size() == ug6Var.o.size());
                        for (int i5 = 0; i5 < asList.size(); i5++) {
                            ((pg6) ug6Var.o.get(i5)).b = (lij) asList.get(i5);
                        }
                    }
                    if (ug6Var.J) {
                        if (ch6Var.b.b.equals(ug6Var.i0.b) && ch6Var.b.d == ug6Var.i0.r) {
                            z3 = false;
                        }
                        if (z3) {
                            if (lijVar.p() || ch6Var.b.b.a()) {
                                j3 = ch6Var.b.d;
                            } else {
                                eke ekeVar = ch6Var.b;
                                rcc rccVar = ekeVar.b;
                                long j4 = ekeVar.d;
                                Object obj = rccVar.a;
                                hij hijVar = ug6Var.n;
                                lijVar.g(obj, hijVar);
                                j3 = j4 + hijVar.e;
                            }
                        }
                        j = j3;
                        z = z3;
                    } else {
                        j = -9223372036854775807L;
                        z = false;
                    }
                    ug6Var.J = false;
                    ug6Var.R(ch6Var.b, 1, ug6Var.K, false, z, ug6Var.I, j, -1, false);
                    break;
                }
                break;
            case 3:
                vg6 vg6Var = (vg6) this.b;
                w2d w2dVar = (w2d) this.c;
                int i6 = vg6.r0;
                int i7 = vg6Var.J - w2dVar.b;
                vg6Var.J = i7;
                if (w2dVar.d) {
                    vg6Var.K = w2dVar.f;
                    vg6Var.L = true;
                }
                if (i7 == 0) {
                    mij mijVar = ((fke) w2dVar.e).a;
                    if (!vg6Var.o0.a.p() && mijVar.p()) {
                        vg6Var.p0 = -1;
                        vg6Var.q0 = 0L;
                    }
                    if (!mijVar.p()) {
                        List asList2 = Arrays.asList(((sye) mijVar).h);
                        z1a.E(asList2.size() == vg6Var.p.size());
                        for (int i8 = 0; i8 < asList2.size(); i8++) {
                            ((qg6) vg6Var.p.get(i8)).b = (mij) asList2.get(i8);
                        }
                    }
                    if (vg6Var.L) {
                        boolean z4 = ((fke) w2dVar.e).a.p() && vg6Var.o0.a.p();
                        boolean equals = ((fke) w2dVar.e).b.equals(vg6Var.o0.b);
                        boolean z5 = ((fke) w2dVar.e).d == vg6Var.o0.s;
                        if (z4 || (equals && z5)) {
                            z3 = false;
                        }
                        if (z3) {
                            i3 = vg6Var.y();
                            if (mijVar.p() || ((fke) w2dVar.e).b.b()) {
                                j3 = ((fke) w2dVar.e).d;
                            } else {
                                fke fkeVar = (fke) w2dVar.e;
                                scc sccVar = fkeVar.b;
                                long j5 = fkeVar.d;
                                Object obj2 = sccVar.a;
                                iij iijVar = vg6Var.o;
                                mijVar.g(obj2, iijVar);
                                j3 = j5 + iijVar.e;
                            }
                        }
                        j2 = j3;
                        i = i3;
                        z2 = z3;
                    } else {
                        j2 = -9223372036854775807L;
                        i = -1;
                        z2 = false;
                    }
                    vg6Var.L = false;
                    vg6Var.h0((fke) w2dVar.e, 1, z2, vg6Var.K, j2, i, false);
                    break;
                }
                break;
            case 4:
                FilePreferences.a((FilePreferences) this.b, (HashMap) this.c);
                break;
            case 5:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    break;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 6:
                fsf fsfVar = (fsf) this.b;
                Function0 function0 = (Function0) this.c;
                if (fsfVar.a == sl9.IDLE) {
                    fsfVar.a = sl9.LONG_CLICK;
                    function0.invoke();
                    break;
                }
                break;
            case 7:
                H1.a((Context) this.b, (H1) this.c);
                break;
            case 8:
                ((lj2) this.b).D((r69) this.c, Unit.a);
                break;
            case 9:
                pd9 pd9Var = (pd9) this.b;
                pc9 pc9Var = (pc9) this.c;
                j0l j0lVar = pd9Var.c;
                Uri uri = pc9Var.m;
                sp4 sp4Var = (sp4) ((qc9) j0lVar.b).b.d.get(uri);
                if (sp4Var != null) {
                    sp4Var.d(true, uri);
                    break;
                }
                break;
            case 10:
                af9 af9Var = (af9) this.b;
                String str = (String) this.c;
                TextView textView2 = af9Var.a;
                float measureText = textView2.getPaint().measureText(str);
                int width = (textView2.getWidth() - textView2.getPaddingLeft()) - textView2.getPaddingRight();
                if (measureText > width && width >= 0) {
                    str = "";
                }
                HorizontalBarView.j(textView2, str);
                break;
            case 11:
                vr9 vr9Var = (vr9) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource2.setResult(vr9Var.h());
                    break;
                } catch (Exception e2) {
                    taskCompletionSource2.setException(e2);
                    return;
                }
            case 12:
                InMobiBanner.a((InMobiBanner) this.b, (Function0) this.c);
                break;
            case 13:
                InMobiSdk.b((SdkInitializationListener) this.b, (String) this.c);
                break;
            case 14:
                InlineStoreActivity.a((Map) this.b, (EnumC4373w5) this.c);
                break;
            case 15:
                IronSourceThreadManager.a((Runnable) this.b, (CountDownLatch) this.c);
                break;
            case 16:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i9 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                break;
            case 17:
                Kc.a((N2) this.b, (Kc) this.c);
                break;
            case 18:
                Kj.a((C3322bk) this.b, (Bitmap) this.c);
                break;
            case 19:
                LevelPlayNativeAd.a((LevelPlayNativeAd) this.b, (IronSourceError) this.c);
                break;
            case 20:
                MainActivity mainActivity = (MainActivity) this.b;
                jqb jqbVar = (jqb) this.c;
                boolean z6 = MainActivity.n0;
                mainActivity.Q().j.c(mainActivity.W().D(jqbVar), false);
                break;
            case 21:
                MainActivity mainActivity2 = (MainActivity) this.b;
                String str2 = (String) this.c;
                boolean z7 = MainActivity.n0;
                int i10 = l94.C;
                CoordinatorLayout coordinatorLayout = mainActivity2.Q().e;
                coordinatorLayout.getClass();
                l94 x = wxf.x(mainActivity2, coordinatorLayout, str2, mainActivity2.getColor(R.color.on_color_primary), mainActivity2.getColor(R.color.error), null, 2000, null, InterfaceC4060ee.c.g);
                x.h(mainActivity2.Q().g);
                x.i();
                break;
            case 22:
                MaterialButton materialButton = (MaterialButton) this.b;
                Runnable runnable = (Runnable) this.c;
                int[] iArr = MaterialButton.N;
                runnable.run();
                LinearLayout.LayoutParams layoutParams = materialButton.C;
                if (layoutParams != null) {
                    materialButton.setLayoutParams(layoutParams);
                    materialButton.C = null;
                    materialButton.z = -2.1474836E9f;
                }
                materialButton.requestLayout();
                break;
            case 23:
                h3c h3cVar = (h3c) this.b;
                h3cVar.D.set(h3cVar.v((fp4) this.c, h3cVar.x, 0));
                break;
            case 24:
                ((s6c) this.b).i((TrackChangeEvent) this.c);
                break;
            case 25:
                ((s6c) this.b).f((NetworkEvent) this.c);
                break;
            case 26:
                ((s6c) this.b).g((PlaybackErrorEvent) this.c);
                break;
            case 27:
                ((s6c) this.b).e((PlaybackMetrics) this.c);
                break;
            case 28:
                ((s6c) this.b).h((PlaybackStateEvent) this.c);
                break;
            default:
                ((wn3) this.b).accept((edc) this.c);
                break;
        }
    }

    public /* synthetic */ yq5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
