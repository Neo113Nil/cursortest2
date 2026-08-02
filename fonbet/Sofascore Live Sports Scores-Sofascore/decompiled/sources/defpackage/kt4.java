package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingRegistrar;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplayRegistrar;
import com.inmobi.media.F1;
import com.ironsource.InterfaceC4060ee;
import com.sofascore.model.network.response.VotesResponse;
import com.sofascore.results.R;
import com.sofascore.results.crowdsourcing.EventContributeFragment;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.event.details.EventDetailsFragment;
import com.sofascore.results.fantasy.competition.chat.FantasyCompetitionChatFragment;
import com.sofascore.results.fantasy.welcome.FantasyWelcomeActivity;
import com.sofascore.results.feed.FeedFragment;
import com.sofascore.results.feedback.FeedbackActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class kt4 implements cu4, OnSuccessListener, xd, qdb, pdb, kpd, xn3, ec3, bw1, cw1, op8, azf, OnUserEarnedRewardListener, OnPaidEventListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kt4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.kpd
    public x9l L(View view, x9l x9lVar) {
        FantasyCompetitionChatFragment.R((FantasyCompetitionChatFragment) this.b, view, x9lVar);
        return x9lVar;
    }

    @Override // defpackage.bw1
    public long a(long j) {
        int i = this.a;
        g78 g78Var = (g78) this.b;
        switch (i) {
            case 23:
                return lik.i((j * g78Var.f) / 1000000, 0L, g78Var.k - 1);
            default:
                return nik.k((j * g78Var.f) / 1000000, 0L, g78Var.k - 1);
        }
    }

    @Override // defpackage.xn3
    public void accept(Object obj) {
        v38 v38Var = (v38) this.b;
        j1k j1kVar = (j1k) obj;
        o3 o3Var = v38Var.e;
        if (o3Var != null) {
            lw9 lw9Var = j1kVar.a;
            r18 r18Var = v38Var.a;
            o3Var.displayMessage(lw9Var, new d55((kw9) r18Var.a, (igf) r18Var.b, (qsg) r18Var.c, (zmf) r18Var.d, (wu0) r18Var.e, (mjc) r18Var.f, (z41) r18Var.g, lw9Var, j1kVar.b));
        }
    }

    @Override // defpackage.op8
    public void b(Bundle bundle, String str) {
        ((lqj) this.b).invoke(str, bundle);
    }

    @Override // defpackage.cu4
    public vvf c(int i, osj osjVar, int[] iArr) {
        wt4 wt4Var = (wt4) this.b;
        zu9 s = hv9.s();
        for (int i2 = 0; i2 < osjVar.a; i2++) {
            s.c(new qt4(i, osjVar, i2, wt4Var, iArr[i2]));
        }
        return s.g();
    }

    @Override // defpackage.azf
    public void e(long j, j9e j9eVar) {
        ao2.n(j, j9eVar, ((er8) this.b).K);
    }

    @Override // defpackage.qdb
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 4:
                int i2 = vg6.r0;
                ((wke) obj).onMediaMetadataChanged((q6c) obj2);
                break;
            case 5:
                ((vke) obj).b((p6c) obj2);
                break;
            case 6:
                ((vke) obj).q((dtj) obj2);
                break;
            case 7:
                ((wke) obj).onCues((o74) obj2);
                break;
            case 8:
                ((vke) obj).s((n74) obj2);
                break;
            case 9:
                ((wke) obj).onMediaMetadataChanged(((mg6) obj2).a.S);
                break;
            case 10:
                ((vke) obj).b(((lg6) obj2).a.P);
                break;
            case 11:
                ((wke) obj).onMetadata((ric) obj2);
                break;
            case 12:
                ((vke) obj).d((Metadata) obj2);
                break;
            default:
                ((vke) obj).l((v05) obj2);
                break;
        }
    }

    @Override // defpackage.ec3
    public Object l(vng vngVar) {
        b48 buildFirebaseInAppMessagingUI;
        v38 providesFirebaseInAppMessaging;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 21:
                buildFirebaseInAppMessagingUI = ((FirebaseInAppMessagingDisplayRegistrar) obj).buildFirebaseInAppMessagingUI(vngVar);
                return buildFirebaseInAppMessagingUI;
            default:
                providesFirebaseInAppMessaging = ((FirebaseInAppMessagingRegistrar) obj).providesFirebaseInAppMessaging(vngVar);
                return providesFirebaseInAppMessaging;
        }
    }

    @Override // defpackage.xd
    public void onActivityResult(Object obj) {
        iy5 iy5Var;
        VotesResponse votesResponse;
        Object value;
        Object value2;
        int i = this.a;
        rq3 rq3Var = null;
        int i2 = 1;
        Object obj2 = this.b;
        switch (i) {
            case 2:
                EventActivity eventActivity = (EventActivity) obj2;
                ActivityResult activityResult = (ActivityResult) obj;
                wxf wxfVar = EventActivity.h0;
                activityResult.getClass();
                if (activityResult.a == -1) {
                    Fragment F = eventActivity.k().F("f0");
                    EventDetailsFragment eventDetailsFragment = F instanceof EventDetailsFragment ? (EventDetailsFragment) F : null;
                    if (eventDetailsFragment != null && (iy5Var = (iy5) eventDetailsFragment.E().x.d()) != null && (votesResponse = iy5Var.f) != null) {
                        jqc jqcVar = (jqc) eventDetailsFragment.C.getValue();
                        xw3.L(un0.z(jqcVar), null, null, new iqc(jqcVar, eventDetailsFragment.F(), true, votesResponse, null), 3);
                        break;
                    }
                }
                break;
            case 3:
                EventContributeFragment eventContributeFragment = (EventContributeFragment) obj2;
                ActivityResult activityResult2 = (ActivityResult) obj;
                activityResult2.getClass();
                if (activityResult2.a == -1) {
                    tr3 D = eventContributeFragment.D();
                    fdi fdiVar = D.r;
                    do {
                        value = fdiVar.getValue();
                        ((Boolean) value).getClass();
                    } while (!fdiVar.k(value, Boolean.TRUE));
                    fdi fdiVar2 = D.p;
                    do {
                        value2 = fdiVar2.getValue();
                        ((Boolean) value2).getClass();
                    } while (!fdiVar2.k(value2, Boolean.TRUE));
                    D.v().n(new vq3(D, i2));
                    break;
                }
                break;
            case 17:
                FantasyWelcomeActivity fantasyWelcomeActivity = (FantasyWelcomeActivity) obj2;
                ActivityResult activityResult3 = (ActivityResult) obj;
                int i3 = FantasyWelcomeActivity.M;
                activityResult3.getClass();
                if (activityResult3.a == 1) {
                    int i4 = l94.C;
                    CoordinatorLayout coordinatorLayout = ((yrh) fantasyWelcomeActivity.J.getValue()).a;
                    coordinatorLayout.getClass();
                    String string = fantasyWelcomeActivity.getString(R.string.error_message_title);
                    string.getClass();
                    wxf.x(fantasyWelcomeActivity, coordinatorLayout, string, fantasyWelcomeActivity.getColor(R.color.on_color_primary), fantasyWelcomeActivity.getColor(R.color.error), null, 2000, null, InterfaceC4060ee.c.g).i();
                    break;
                }
                break;
            case 18:
                FeedFragment feedFragment = (FeedFragment) obj2;
                ActivityResult activityResult4 = (ActivityResult) obj;
                activityResult4.getClass();
                if (activityResult4.a == 1) {
                    int i5 = l94.C;
                    Context requireContext = feedFragment.requireContext();
                    requireContext.getClass();
                    krk krkVar = feedFragment.l;
                    krkVar.getClass();
                    View view = ((ko8) krkVar).c;
                    String string2 = feedFragment.getString(R.string.error_message_title);
                    string2.getClass();
                    l94 x = wxf.x(requireContext, view, string2, feedFragment.requireContext().getColor(R.color.on_color_primary), feedFragment.requireContext().getColor(R.color.error), null, 2000, null, 1376);
                    krk krkVar2 = feedFragment.l;
                    krkVar2.getClass();
                    x.h(((ko8) krkVar2).c);
                    x.i();
                    break;
                }
                break;
            default:
                FeedbackActivity feedbackActivity = (FeedbackActivity) obj2;
                ActivityResult activityResult5 = (ActivityResult) obj;
                int i6 = FeedbackActivity.M;
                activityResult5.getClass();
                if (activityResult5.a == -1) {
                    Intent intent = activityResult5.b;
                    Uri data = intent != null ? intent.getData() : null;
                    qy7 qy7Var = (qy7) feedbackActivity.J.getValue();
                    if (data != null) {
                        xw3.L(un0.z(qy7Var), null, null, new yp7(qy7Var, data, rq3Var, 6), 3);
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        t4g t4gVar = (t4g) this.b;
        adValue.getClass();
        t4gVar.onPaidEvent(adValue);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                ((kz3) obj2).invoke(obj);
                break;
            case 15:
                F1.a((au5) obj2, obj);
                break;
            default:
                ((l50) obj2).invoke(obj);
                break;
        }
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public void onUserEarnedReward(RewardItem rewardItem) {
        g19 g19Var = (g19) this.b;
        rewardItem.getClass();
        t4g t4gVar = g19Var.f;
        if (t4gVar != null) {
            t4gVar.a(new c19(rewardItem));
        }
    }
}
