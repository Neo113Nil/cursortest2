package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.blaze.blazesdk.custom_views.BlazeDefaultTimeBar;
import com.blaze.blazesdk.custom_views.BlazeTextView;
import com.blaze.blazesdk.custom_views.BlazeTextWithIconButton;
import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamStatus;
import com.blaze.blazesdk.features.shared.models.ui_shared.i;
import com.blaze.blazesdk.features.videos.models.ui.VideoModel;
import com.blaze.blazesdk.features.videos.models.ui.a;
import com.blaze.blazesdk.features.videos.models.ui.h;
import com.blaze.blazesdk.players.ui.BackToLiveButtonView;
import com.blaze.blazesdk.players.ui.StatusIndicatorView;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerButtonStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerButtonsStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerCtaStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerHeadingTextStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerSeekBarStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
import com.sofascore.model.Sports;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.mvvm.IRecent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.dialog.ProposeFollowEntityDialog;
import com.sofascore.results.event.commentary.EventCommentaryFragment;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import defpackage.gim;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class gk implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gk(Object obj, gv9 gv9Var, boolean z, int i) {
        this.a = i;
        this.d = obj;
        this.b = gv9Var;
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0434  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object[] objArr;
        boolean z;
        SharedPreferences sharedPreferences;
        SharedPreferences d;
        m2d m2dVar;
        long j;
        m2d m2dVar2;
        BlazeVideosPlayerStyle a;
        BlazeVideosPlayerStyle a2;
        BlazeVideosPlayerStyle a3;
        BlazeVideosPlayerStyle a4;
        BlazeVideosPlayerCtaStyle cta;
        n4m n4mVar;
        i iVar;
        a aVar;
        BlazeVideosPlayerButtonsStyle buttons;
        BlazeVideosPlayerButtonStyle replay;
        BlazeVideosPlayerButtonsStyle buttons2;
        BlazeVideosPlayerButtonStyle seekBackward;
        BlazeVideosPlayerButtonsStyle buttons3;
        BlazeVideosPlayerButtonStyle seekForward;
        BlazeVideosPlayerButtonsStyle buttons4;
        BlazeVideosPlayerButtonStyle playPause;
        BlazeVideosPlayerSeekBarStyle seekBar;
        VideoModel videoModel;
        BlazeVideosPlayerHeadingTextStyle headingText;
        BlazeVideosPlayerButtonsStyle buttons5;
        BlazeVideosPlayerButtonStyle next;
        BlazeVideosPlayerButtonsStyle buttons6;
        BlazeVideosPlayerButtonStyle previous;
        final int i = 3;
        final int i2 = 2;
        r7 = null;
        r7 = null;
        BlazeLiveStreamStatus blazeLiveStreamStatus = null;
        boolean z2 = false;
        r8 = false;
        boolean z3 = false;
        z2 = false;
        z2 = false;
        boolean z4 = true;
        char c = 1;
        char c2 = 1;
        switch (this.a) {
            case 0:
                gv9 gv9Var = (gv9) this.b;
                gv9 gv9Var2 = (gv9) this.d;
                boolean z5 = this.c;
                ek ekVar = (ek) obj;
                OddsEventUIModel oddsEventUIModel = ekVar.a;
                old oldVar = ekVar.b;
                w22 w22Var = ekVar.e;
                oldVar.getClass();
                gv9Var.getClass();
                gv9Var2.getClass();
                return new ek(oddsEventUIModel, oldVar, gv9Var, gv9Var2, w22Var, z5);
            case 1:
                IRecent iRecent = (IRecent) this.d;
                gv9 gv9Var3 = (gv9) this.b;
                boolean z6 = this.c;
                zbc zbcVar = (zbc) obj;
                int id = iRecent.getId();
                gec gecVar = (gec) CollectionsKt.firstOrNull(gv9Var3);
                if (gecVar == null) {
                    gecVar = gec.c;
                }
                return zbc.a(zbcVar, id, gv9Var3, null, gecVar, null, z6, 20);
            case 2:
                ai4 ai4Var = (ai4) this.b;
                boolean z7 = this.c;
                Map map = (Map) this.d;
                Event event = (Event) obj;
                long startTimestamp = event.getStartTimestamp();
                Long endTimestamp = event.getEndTimestamp();
                boolean J = aba.J(startTimestamp, endTimestamp != null ? endTimestamp.longValue() : 0L, ai4Var.h);
                Object[] objArr2 = Intrinsics.c(ok3.s(event), Sports.TENNIS) && Intrinsics.c(event.getTournament().getQualificationOrPreliminary(), Boolean.TRUE);
                if (z7) {
                    Set set = (Set) map.get(Integer.valueOf(event.getTournament().getCategory().getId()));
                    if (set == null) {
                        set = rm5.a;
                    }
                    if (!set.contains(Integer.valueOf(event.getId()))) {
                        objArr = false;
                        if (J && objArr != false && objArr2 == false) {
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    }
                }
                objArr = true;
                if (J) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 3:
                final d6d d6dVar = (d6d) this.b;
                final boolean z8 = this.c;
                final List list = (List) this.d;
                p6b p6bVar = new p6b() { // from class: v15
                    @Override // defpackage.p6b
                    public final void onStateChanged(u6b u6bVar, d6b d6bVar) {
                        boolean z9 = z8;
                        List list2 = list;
                        d6d d6dVar2 = d6dVar;
                        if (z9 && !list2.contains(d6dVar2)) {
                            list2.add(d6dVar2);
                        }
                        if (d6bVar == d6b.ON_START && !list2.contains(d6dVar2)) {
                            list2.add(d6dVar2);
                        }
                        if (d6bVar == d6b.ON_STOP) {
                            list2.remove(d6dVar2);
                        }
                    }
                };
                d6dVar.h.j.a(p6bVar);
                return new vx0(i2, d6dVar, p6bVar);
            case 4:
                boolean z9 = this.c;
                ov5 ov5Var = (ov5) this.b;
                r9k r9kVar = (r9k) this.d;
                fv5 fv5Var = (fv5) obj;
                fv5Var.getClass();
                TeamSelection teamSelection = fv5Var.a;
                return fv5.a(fv5Var, null, z9, n4o.Q(ov5Var.u(teamSelection), fv5Var.e, z9), n4o.N(teamSelection, ov5Var.p, ov5Var.q), r9kVar, 11);
            case 5:
                EventCommentaryFragment eventCommentaryFragment = (EventCommentaryFragment) this.b;
                boolean z10 = this.c;
                Object obj2 = this.d;
                ((View) obj).getClass();
                EventCommentaryFragment.I(eventCommentaryFragment, false, z10 ? (z33) obj2 : null, 1);
                return Unit.a;
            case 6:
                re7 re7Var = (re7) this.b;
                Function2 function2 = (Function2) this.d;
                boolean z11 = this.c;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                gv9 gv9Var4 = re7Var.b;
                esaVar.a(gv9Var4.size(), new j87(8, new e87(15), gv9Var4), new j87(9, new e87(r4), gv9Var4), new tc3(802480018, new q34(gv9Var4, re7Var, function2, z11), true));
                return Unit.a;
            case 7:
                BaseActivity baseActivity = (BaseActivity) this.b;
                boolean z12 = this.c;
                Function1 function1 = (Function1) this.d;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                Context applicationContext = baseActivity.getApplicationContext();
                applicationContext.getClass();
                nv.k0(applicationContext, bv.SYSTEM_NOTIFICATIONS, av.CTA_CLICK, dv.OTHER, booleanValue ? cv.ALLOW : cv.DENY, null, 32);
                if ((booleanValue || z12) && function1 != null) {
                    function1.invoke(bool);
                }
                ia0 ia0Var = ia0.q;
                Context applicationContext2 = baseActivity.getApplicationContext();
                applicationContext2.getClass();
                ok3.i(applicationContext2);
                return Unit.a;
            case 8:
                final hhd hhdVar = (hhd) this.b;
                boolean z13 = this.c;
                final Function1 function12 = (Function1) this.d;
                esa esaVar2 = (esa) obj;
                esaVar2.getClass();
                if (hhdVar.a) {
                    final int i3 = z2 ? 1 : 0;
                    esa.d(esaVar2, "notification_sounds_mute_notifications", null, new tc3(1755804741, new ct8() { // from class: dhd
                        @Override // defpackage.ct8
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i4 = i3;
                            Function1 function13 = function12;
                            hhd hhdVar2 = hhdVar;
                            xpa xpaVar = (xpa) obj3;
                            of3 of3Var = (of3) obj4;
                            int intValue = ((Integer) obj5).intValue();
                            switch (i4) {
                                case 0:
                                    xpaVar.getClass();
                                    av8 av8Var = (av8) of3Var;
                                    if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                                        ehd.c(hhdVar2.b, function13, av8Var, 0);
                                    } else {
                                        av8Var.W();
                                    }
                                    break;
                                default:
                                    xpaVar.getClass();
                                    av8 av8Var2 = (av8) of3Var;
                                    if (av8Var2.T(intValue & 1, (intValue & 17) != 16)) {
                                        boolean z14 = hhdVar2.d;
                                        boolean z15 = hhdVar2.e;
                                        boolean g = av8Var2.g(function13);
                                        Object O = av8Var2.O();
                                        if (g || O == nf3.a) {
                                            O = new vbc(6, function13);
                                            av8Var2.n0(O);
                                        }
                                        ehd.a(z14, z15, (Function0) O, av8Var2, 0);
                                    } else {
                                        av8Var2.W();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, true), 2);
                    gv9 gv9Var5 = hhdVar.c;
                    esaVar2.a(gv9Var5.size(), new j87(28, new mpa(14), gv9Var5), new xo(gv9Var5, 24), new tc3(2039820996, new l46(gv9Var5, hhdVar, function12, 5), true));
                    if (Build.VERSION.SDK_INT < 29 || z13) {
                        final char c3 = c == true ? 1 : 0;
                        esa.d(esaVar2, "import_sounds_button", null, new tc3(1915813130, new ct8() { // from class: dhd
                            @Override // defpackage.ct8
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                int i4 = c3;
                                Function1 function13 = function12;
                                hhd hhdVar2 = hhdVar;
                                xpa xpaVar = (xpa) obj3;
                                of3 of3Var = (of3) obj4;
                                int intValue = ((Integer) obj5).intValue();
                                switch (i4) {
                                    case 0:
                                        xpaVar.getClass();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                                            ehd.c(hhdVar2.b, function13, av8Var, 0);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                    default:
                                        xpaVar.getClass();
                                        av8 av8Var2 = (av8) of3Var;
                                        if (av8Var2.T(intValue & 1, (intValue & 17) != 16)) {
                                            boolean z14 = hhdVar2.d;
                                            boolean z15 = hhdVar2.e;
                                            boolean g = av8Var2.g(function13);
                                            Object O = av8Var2.O();
                                            if (g || O == nf3.a) {
                                                O = new vbc(6, function13);
                                                av8Var2.n0(O);
                                            }
                                            ehd.a(z14, z15, (Function0) O, av8Var2, 0);
                                        } else {
                                            av8Var2.W();
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        }, true), 2);
                    }
                    esa.d(esaVar2, "reset_notifications_button", null, new tc3(2107066798, new y47(18, function12), true), 2);
                } else {
                    esa.d(esaVar2, "allow_notifications", null, new tc3(1938419502, new y47(19, function12), true), 2);
                }
                return Unit.a;
            case 9:
                khd khdVar = (khd) this.d;
                gv9 gv9Var6 = (gv9) this.b;
                boolean z14 = this.c;
                hhd hhdVar2 = (hhd) obj;
                boolean z15 = hhdVar2.a;
                Context i4 = khdVar.i();
                if (Build.VERSION.SDK_INT < 33) {
                    z4 = new fgd(i4).b.areNotificationsEnabled();
                } else if (eq3.b(i4, "android.permission.POST_NOTIFICATIONS") != 0) {
                    z = false;
                    if (!z15 && z && !khdVar.m) {
                        khdVar.k(new ahd(R.string.notifications_enabled));
                    }
                    khdVar.m = false;
                    Context i5 = khdVar.i();
                    sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext3 = i5.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext3);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    return hhd.a(hhdVar2, z, sharedPreferences.getLong("PREF_DISABLE_NOTIFICATION_TIME", 0L), gv9Var6, z14, false, 16);
                }
                z = z4;
                if (!z15) {
                    khdVar.k(new ahd(R.string.notifications_enabled));
                }
                khdVar.m = false;
                Context i52 = khdVar.i();
                sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                }
                return hhd.a(hhdVar2, z, sharedPreferences.getLong("PREF_DISABLE_NOTIFICATION_TIME", 0L), gv9Var6, z14, false, 16);
            case 10:
                boolean z16 = this.c;
                final a6e a6eVar = (a6e) this.b;
                final ku3 ku3Var = (ku3) this.d;
                b4h b4hVar = (b4h) obj;
                if (z16) {
                    final int i6 = z2 ? 1 : 0;
                    Function0 function0 = new Function0() { // from class: m5e
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i7 = i6;
                            ku3 ku3Var2 = ku3Var;
                            a6e a6eVar2 = a6eVar;
                            boolean z17 = false;
                            switch (i7) {
                                case 0:
                                    if (a6eVar2.c()) {
                                        xw3.L(ku3Var2, null, null, new n5e(a6eVar2, null, 0), 3);
                                        z17 = true;
                                    }
                                    return Boolean.valueOf(z17);
                                case 1:
                                    if (a6eVar2.d()) {
                                        xw3.L(ku3Var2, null, null, new n5e(a6eVar2, null, 1), 3);
                                        z17 = true;
                                    }
                                    return Boolean.valueOf(z17);
                                case 2:
                                    if (a6eVar2.c()) {
                                        xw3.L(ku3Var2, null, null, new n5e(a6eVar2, null, 0), 3);
                                        z17 = true;
                                    }
                                    return Boolean.valueOf(z17);
                                default:
                                    if (a6eVar2.d()) {
                                        xw3.L(ku3Var2, null, null, new n5e(a6eVar2, null, 1), 3);
                                        z17 = true;
                                    }
                                    return Boolean.valueOf(z17);
                            }
                        }
                    };
                    KProperty[] kPropertyArr = y3h.a;
                    b4hVar.a(k3h.y, new m9(null, function0));
                    final char c4 = c2 == true ? 1 : 0;
                    b4hVar.a(k3h.A, new m9(null, new Function0() { // from class: m5e
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i7 = c4;
                            ku3 ku3Var2 = ku3Var;
                            a6e a6eVar2 = a6eVar;
                            boolean z17 = false;
                            switch (i7) {
                                case 0:
                                    if (a6eVar2.c()) {
                                        xw3.L(ku3Var2, null, null, new n5e(a6eVar2, null, 0), 3);
                                        z17 = true;
                                    }
                                    return Boolean.valueOf(z17);
                                case 1:
                                    if (a6eVar2.d()) {
                                        xw3.L(ku3Var2, null, null, new n5e(a6eVar2, null, 1), 3);
                                        z17 = true;
                                    }
                                    return Boolean.valueOf(z17);
                                case 2:
                                    if (a6eVar2.c()) {
                                        xw3.L(ku3Var2, null, null, new n5e(a6eVar2, null, 0), 3);
                                        z17 = true;
                                    }
                                    return Boolean.valueOf(z17);
                                default:
                                    if (a6eVar2.d()) {
                                        xw3.L(ku3Var2, null, null, new n5e(a6eVar2, null, 1), 3);
                                        z17 = true;
                                    }
                                    return Boolean.valueOf(z17);
                            }
                        }
                    }));
                } else {
                    Function0 function02 = new Function0() { // from class: m5e
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i7 = i2;
                            ku3 ku3Var2 = ku3Var;
                            a6e a6eVar2 = a6eVar;
                            boolean z17 = false;
                            switch (i7) {
                                case 0:
                                    if (a6eVar2.c()) {
                                        xw3.L(ku3Var2, null, null, new n5e(a6eVar2, null, 0), 3);
                                        z17 = true;
                                    }
                                    return Boolean.valueOf(z17);
                                case 1:
                                    if (a6eVar2.d()) {
                                        xw3.L(ku3Var2, null, null, new n5e(a6eVar2, null, 1), 3);
                                        z17 = true;
                                    }
                                    return Boolean.valueOf(z17);
                                case 2:
                                    if (a6eVar2.c()) {
                                        xw3.L(ku3Var2, null, null, new n5e(a6eVar2, null, 0), 3);
                                        z17 = true;
                                    }
                                    return Boolean.valueOf(z17);
                                default:
                                    if (a6eVar2.d()) {
                                        xw3.L(ku3Var2, null, null, new n5e(a6eVar2, null, 1), 3);
                                        z17 = true;
                                    }
                                    return Boolean.valueOf(z17);
                            }
                        }
                    };
                    KProperty[] kPropertyArr2 = y3h.a;
                    b4hVar.a(k3h.z, new m9(null, function02));
                    b4hVar.a(k3h.B, new m9(null, new Function0() { // from class: m5e
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i7 = i;
                            ku3 ku3Var2 = ku3Var;
                            a6e a6eVar2 = a6eVar;
                            boolean z17 = false;
                            switch (i7) {
                                case 0:
                                    if (a6eVar2.c()) {
                                        xw3.L(ku3Var2, null, null, new n5e(a6eVar2, null, 0), 3);
                                        z17 = true;
                                    }
                                    return Boolean.valueOf(z17);
                                case 1:
                                    if (a6eVar2.d()) {
                                        xw3.L(ku3Var2, null, null, new n5e(a6eVar2, null, 1), 3);
                                        z17 = true;
                                    }
                                    return Boolean.valueOf(z17);
                                case 2:
                                    if (a6eVar2.c()) {
                                        xw3.L(ku3Var2, null, null, new n5e(a6eVar2, null, 0), 3);
                                        z17 = true;
                                    }
                                    return Boolean.valueOf(z17);
                                default:
                                    if (a6eVar2.d()) {
                                        xw3.L(ku3Var2, null, null, new n5e(a6eVar2, null, 1), 3);
                                        z17 = true;
                                    }
                                    return Boolean.valueOf(z17);
                            }
                        }
                    }));
                }
                return Unit.a;
            case 11:
                ProposeFollowEntityDialog proposeFollowEntityDialog = (ProposeFollowEntityDialog) this.b;
                qef qefVar = (qef) this.d;
                boolean z17 = this.c;
                ((Boolean) obj).getClass();
                proposeFollowEntityDialog.u(qefVar, true, z17);
                return Unit.a;
            case 12:
                pyg pygVar = (pyg) this.b;
                boolean z18 = this.c;
                List list2 = (List) this.d;
                ((vnb) obj).getClass();
                e73 e73Var = pygVar.l;
                String str = pygVar.m;
                int c5 = sub.c(k13.r(list2, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(c5 >= 16 ? c5 : 16);
                for (Object obj3 : list2) {
                    linkedHashMap.put(obj3, new i73(pygVar.B((e93) obj3), pygVar.o, pygVar.p));
                }
                tee b0 = l6g.b0(linkedHashMap);
                uee ueeVar = uee.g;
                ueeVar.getClass();
                rlh rlhVar = rlh.b;
                return new unb(new gyg(e73Var, str, z18, b0, ueeVar, rlhVar, rlhVar, null));
            case 13:
                boolean z19 = this.c;
                String str2 = (String) this.b;
                gmh gmhVar = (gmh) this.d;
                b4h b4hVar2 = (b4h) obj;
                if (z19) {
                    y3h.g(b4hVar2, 0);
                }
                e6g e6gVar = new e6g(gmhVar, 21);
                KProperty[] kPropertyArr3 = y3h.a;
                b4hVar2.a(k3h.v, new m9(null, e6gVar));
                y3h.h(b4hVar2, str2);
                return Unit.a;
            case 14:
                boolean z20 = this.c;
                TextView textView = (TextView) this.b;
                csi csiVar = (csi) this.d;
                TvChannel tvChannel = (TvChannel) obj;
                tvChannel.getClass();
                if (z20) {
                    String countryCode = tvChannel.getCountryCode();
                    countryCode.getClass();
                    String n = fc6.n((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "country/", countryCode, "/flag");
                    ua5 ua5Var = ua5.a;
                    int i7 = csiVar.l;
                    t25.a(i7);
                    haa.q(textView, n, ua5Var, new t25(i7));
                }
                return tvChannel.getName();
            default:
                wpm wpmVar = (wpm) this.b;
                e0n e0nVar = (e0n) this.d;
                boolean z21 = this.c;
                uxm uxmVar = (uxm) obj;
                boolean z22 = e0n.n;
                uxmVar.getClass();
                BlazeTextView blazeTextView = uxmVar.v;
                Application application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
                boolean f = application$blazesdk_release != null ? f6a.f(application$blazesdk_release) : false;
                boolean z23 = wpmVar.a || f;
                boolean z24 = wpmVar.b || f;
                boolean z25 = wpmVar.c;
                e0nVar.j = wpmVar;
                Interpolator accelerateInterpolator = z23 ? new AccelerateInterpolator() : new DecelerateInterpolator();
                View view = uxmVar.f;
                ProgressBar progressBar = uxmVar.w;
                view.getClass();
                evl.fadeInOrOut$default(view, z23, 200L, accelerateInterpolator, null, 8, null);
                LinearLayout linearLayout = uxmVar.J;
                linearLayout.getClass();
                evl.fadeInOrOut$default(linearLayout, z23, 200L, accelerateInterpolator, null, 8, null);
                LinearLayout linearLayout2 = uxmVar.h;
                linearLayout2.getClass();
                m2d m2dVar3 = m2d.HIDE;
                evl.j(linearLayout2, z23, 200L, accelerateInterpolator, m2dVar3);
                blazeTextView.getClass();
                boolean z26 = z23;
                evl.fadeInOrOut$default(blazeTextView, z26, 200L, accelerateInterpolator, null, 8, null);
                Interpolator interpolator = accelerateInterpolator;
                BlazeVideosPlayerStyle a5 = e0nVar.a();
                if (a5 == null || (buttons6 = a5.getButtons()) == null || (previous = buttons6.getPrevious()) == null || !previous.isVisible()) {
                    m2dVar = m2dVar3;
                } else {
                    ImageView imageView = uxmVar.G;
                    imageView.getClass();
                    m2dVar = m2dVar3;
                    evl.j(imageView, z26, 200L, interpolator, m2dVar);
                }
                BlazeVideosPlayerStyle a6 = e0nVar.a();
                if (a6 != null && (buttons5 = a6.getButtons()) != null && (next = buttons5.getNext()) != null && next.isVisible()) {
                    ImageView imageView2 = uxmVar.F;
                    imageView2.getClass();
                    evl.j(imageView2, z26, 200L, interpolator, m2dVar);
                }
                m2d m2dVar4 = m2dVar;
                BlazeVideosPlayerStyle a7 = e0nVar.a();
                if (a7 != null && (headingText = a7.getHeadingText()) != null && headingText.isVisible()) {
                    BlazeTextView blazeTextView2 = uxmVar.q;
                    blazeTextView2.getClass();
                    evl.fadeInOrOut$default(blazeTextView2, z26, 200L, interpolator, null, 8, null);
                }
                if (e0nVar.k) {
                    StatusIndicatorView statusIndicatorView = uxmVar.I;
                    statusIndicatorView.getClass();
                    evl.fadeInOrOut$default(statusIndicatorView, z26, 200L, interpolator, null, 8, null);
                }
                n4m n4mVar2 = e0nVar.d;
                if (n4mVar2 != null) {
                    gim gimVar = n4mVar2.b;
                    gim.e eVar = gimVar instanceof gim.e ? (gim.e) gimVar : null;
                    if (eVar != null && (videoModel = eVar.a) != null) {
                        blazeLiveStreamStatus = videoModel.s;
                    }
                }
                if (blazeLiveStreamStatus == BlazeLiveStreamStatus.LIVE) {
                    BackToLiveButtonView backToLiveButtonView = uxmVar.g;
                    backToLiveButtonView.getClass();
                    j = 200;
                    evl.fadeInOrOut$default(backToLiveButtonView, z26, 200L, interpolator, null, 8, null);
                } else {
                    j = 200;
                }
                BlazeVideosPlayerStyle a8 = e0nVar.a();
                if (a8 != null && (seekBar = a8.getSeekBar()) != null && seekBar.isVisible()) {
                    long j2 = j;
                    BlazeDefaultTimeBar blazeDefaultTimeBar = uxmVar.z;
                    blazeDefaultTimeBar.getClass();
                    evl.fadeInOrOut$default(blazeDefaultTimeBar, z24, j2, interpolator, null, 8, null);
                    j = j2;
                    interpolator = interpolator;
                }
                BlazeVideosPlayerStyle a9 = e0nVar.a();
                if (a9 != null && (buttons4 = a9.getButtons()) != null && (playPause = buttons4.getPlayPause()) != null && playPause.isVisible()) {
                    progressBar.getClass();
                    if (progressBar.getVisibility() != 0) {
                        Interpolator interpolator2 = interpolator;
                        long j3 = j;
                        ImageView imageView3 = uxmVar.u;
                        imageView3.getClass();
                        m2dVar2 = m2dVar4;
                        evl.j(imageView3, z26 && !z25, j3, interpolator2, m2dVar2);
                        j = j3;
                        interpolator = interpolator2;
                        a = e0nVar.a();
                        if (a != null && (buttons3 = a.getButtons()) != null && (seekForward = buttons3.getSeekForward()) != null && seekForward.isVisible() && e0nVar.f) {
                            ImageView imageView4 = uxmVar.A;
                            imageView4.getClass();
                            evl.j(imageView4, z26, j, interpolator, m2d.GONE);
                        }
                        a2 = e0nVar.a();
                        if (a2 != null && (buttons2 = a2.getButtons()) != null && (seekBackward = buttons2.getSeekBackward()) != null && seekBackward.isVisible() && e0nVar.f) {
                            ImageView imageView5 = uxmVar.x;
                            imageView5.getClass();
                            evl.j(imageView5, z26, j, interpolator, m2d.GONE);
                        }
                        a3 = e0nVar.a();
                        if (a3 != null && (buttons = a3.getButtons()) != null && (replay = buttons.getReplay()) != null && replay.isVisible()) {
                            progressBar.getClass();
                            if (progressBar.getVisibility() != 0) {
                                Interpolator interpolator3 = interpolator;
                                long j4 = j;
                                ImageView imageView6 = uxmVar.l;
                                imageView6.getClass();
                                evl.j(imageView6, z26 && z25, j4, interpolator3, m2dVar2);
                                j = j4;
                                interpolator = interpolator3;
                            }
                        }
                        a4 = e0nVar.a();
                        if (a4 != null && (cta = a4.getCta()) != null && cta.isVisible() && (n4mVar = e0nVar.d) != null && (iVar = n4mVar.i) != null && nq8.s(iVar) && (aVar = e0nVar.h) != null && h.c(aVar)) {
                            BlazeTextWithIconButton blazeTextWithIconButton = uxmVar.m;
                            blazeTextWithIconButton.getClass();
                            evl.fadeInOrOut$default(blazeTextWithIconButton, z26, j, interpolator, null, 8, null);
                            if (z26) {
                                uxm uxmVar2 = e0nVar.b;
                                mm3 mm3Var = new mm3();
                                mm3Var.e(uxmVar2.a);
                                mm3Var.f(uxmVar2.m.getId(), 4, uxmVar2.v.getId(), 3);
                                mm3Var.a(uxmVar2.a);
                            }
                        }
                        if (z24 && !z26) {
                            z3 = true;
                        }
                        BlazeTextView blazeTextView3 = uxmVar.C;
                        blazeTextView3.getClass();
                        evl.fadeInOrOut$default(blazeTextView3, z3, j, interpolator, null, 8, null);
                        if (z21) {
                            blazeTextView.setText("");
                        }
                        return Unit.a;
                    }
                }
                m2dVar2 = m2dVar4;
                a = e0nVar.a();
                if (a != null) {
                    ImageView imageView42 = uxmVar.A;
                    imageView42.getClass();
                    evl.j(imageView42, z26, j, interpolator, m2d.GONE);
                }
                a2 = e0nVar.a();
                if (a2 != null) {
                    ImageView imageView52 = uxmVar.x;
                    imageView52.getClass();
                    evl.j(imageView52, z26, j, interpolator, m2d.GONE);
                }
                a3 = e0nVar.a();
                if (a3 != null) {
                    progressBar.getClass();
                    if (progressBar.getVisibility() != 0) {
                    }
                }
                a4 = e0nVar.a();
                if (a4 != null) {
                    BlazeTextWithIconButton blazeTextWithIconButton2 = uxmVar.m;
                    blazeTextWithIconButton2.getClass();
                    evl.fadeInOrOut$default(blazeTextWithIconButton2, z26, j, interpolator, null, 8, null);
                    if (z26) {
                    }
                }
                if (z24) {
                    z3 = true;
                }
                BlazeTextView blazeTextView32 = uxmVar.C;
                blazeTextView32.getClass();
                evl.fadeInOrOut$default(blazeTextView32, z3, j, interpolator, null, 8, null);
                if (z21) {
                }
                return Unit.a;
        }
    }

    public /* synthetic */ gk(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.d = obj2;
        this.c = z;
    }

    public /* synthetic */ gk(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = z;
        this.d = obj2;
    }

    public /* synthetic */ gk(boolean z, Object obj, Object obj2, int i) {
        this.a = i;
        this.c = z;
        this.b = obj;
        this.d = obj2;
    }
}
