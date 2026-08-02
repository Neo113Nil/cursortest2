package com.vk.video.profile.presentation;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullAgeMarkDto;
import com.vk.channelrestrictions.WarningNotification;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.libvideo.api.Subscription;
import com.vk.sharing.api.dto.Target;
import com.vk.stat.scheme.CommonVideoStat$AgeMarkNotificationBlockType;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoAgeMarkClick;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoChannelOnboardingClick;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$TypeGroupsEventItem;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$VideoSubscribeEvent;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.t0;
import com.vk.video.profile.exceptions.UserNotAuthorizedException;
import com.vk.video.profile.presentation.VideoProfileSource;
import com.vk.video.profile.presentation.a;
import com.vk.video.profile.presentation.f;
import com.vk.video.profile.presentation.h;
import com.vk.video.profile.presentation.models.StateSubscribeNotification;
import com.vk.video.profile.presentation.views.creatoronboarding.items.VideoProfileCreatorOnboardingItemType;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.q;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.internal.operators.single.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.a7f0;
import xsna.acc0;
import xsna.ahn;
import xsna.aoq0;
import xsna.asu0;
import xsna.b25;
import xsna.bjc;
import xsna.bkh;
import xsna.bpn0;
import xsna.bwr0;
import xsna.c5g;
import xsna.c9m0;
import xsna.c9t0;
import xsna.chr0;
import xsna.cis0;
import xsna.dz2;
import xsna.e1s0;
import xsna.e43;
import xsna.e4t;
import xsna.e8t0;
import xsna.epx;
import xsna.f0o0;
import xsna.f4z;
import xsna.fkq0;
import xsna.fxc0;
import xsna.fzd0;
import xsna.g6g;
import xsna.g8n0;
import xsna.gib0;
import xsna.gsq0;
import xsna.h7v;
import xsna.h8t0;
import xsna.h9t0;
import xsna.he40;
import xsna.hqf;
import xsna.i3u;
import xsna.i8t0;
import xsna.itg0;
import xsna.ivs0;
import xsna.j9t0;
import xsna.jds0;
import xsna.k8t0;
import xsna.lfa;
import xsna.lwp0;
import xsna.lzh0;
import xsna.lzl0;
import xsna.m7a;
import xsna.m9t0;
import xsna.msy;
import xsna.n7b0;
import xsna.nh40;
import xsna.o0r0;
import xsna.o25;
import xsna.o7j0;
import xsna.o7t0;
import xsna.ofd;
import xsna.onm0;
import xsna.ouq0;
import xsna.p7t0;
import xsna.p9t0;
import xsna.q7a0;
import xsna.qlq0;
import xsna.qtk0;
import xsna.r0e0;
import xsna.r1r0;
import xsna.r2v;
import xsna.rcl;
import xsna.rsg0;
import xsna.s75;
import xsna.t6c0;
import xsna.t7t0;
import xsna.tk40;
import xsna.u490;
import xsna.u5p0;
import xsna.uk40;
import xsna.uxr0;
import xsna.v8t0;
import xsna.vge;
import xsna.vit0;
import xsna.vlg;
import xsna.vtg0;
import xsna.wd8;
import xsna.wjs0;
import xsna.wk50;
import xsna.wqu;
import xsna.x150;
import xsna.x7t0;
import xsna.x8t0;
import xsna.xd8;
import xsna.xep0;
import xsna.xwk;
import xsna.y3l0;
import xsna.y7t0;
import xsna.y8t0;
import xsna.yfb;
import xsna.yyq0;
import xsna.z6w;
import xsna.z7t0;
import xsna.z8l0;
import xsna.z8t0;
import xsna.znk0;
import xsna.zog;
import xsna.zqu;
import xsna.zvr0;

/* compiled from: VideoProfileFeature.kt */
/* loaded from: classes6.dex */
public final class c extends wk50<m9t0, c9t0, com.vk.video.profile.presentation.a, f> {
    public final f4z<h> A;
    public final b B;
    public final ofd C;
    public final x8t0 f;
    public final ouq0 g;
    public final k8t0 h;
    public final i8t0 i;
    public final vit0 j;
    public final lzh0 k;
    public final t7t0 l;
    public final h7v m;
    public final zvr0 n;
    public final r0e0 o;
    public final fzd0 p;
    public final m7a q;
    public final boolean r;
    public final com.vk.clips.viewer.vk.a s;
    public final Object t;
    public final y7t0 u;
    public final Object v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    /* compiled from: VideoProfileFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Subscription.Subscribed.Notifications.values().length];
            try {
                iArr[Subscription.Subscribed.Notifications.All.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Subscription.Subscribed.Notifications.Preferred.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Subscription.Subscribed.Notifications.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [xsna.b25$a, xsna.y7t0] */
    public c(x8t0 x8t0Var, ouq0 ouq0Var, k8t0 k8t0Var, i8t0 i8t0Var, vit0 vit0Var, lzh0 lzh0Var, t7t0 t7t0Var, h7v h7vVar, zvr0 zvr0Var, r0e0 r0e0Var, fzd0 fzd0Var, m7a m7aVar, boolean z, g gVar, com.vk.clips.viewer.vk.a aVar) {
        super(a.o.b, gVar);
        this.f = x8t0Var;
        this.g = ouq0Var;
        this.h = k8t0Var;
        this.i = i8t0Var;
        this.j = vit0Var;
        this.k = lzh0Var;
        this.l = t7t0Var;
        this.m = h7vVar;
        this.n = zvr0Var;
        this.o = r0e0Var;
        this.p = fzd0Var;
        this.q = m7aVar;
        this.r = z;
        this.s = aVar;
        chr0 chr0Var = new chr0(3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.t = msy.a(lazyThreadSafetyMode, chr0Var);
        ?? r2 = new b25.a() { // from class: xsna.y7t0
            @Override // xsna.b25.a
            public final void d(tbu0 tbu0Var) {
                f.i iVar = f.i.b;
                com.vk.video.profile.presentation.c cVar = com.vk.video.profile.presentation.c.this;
                cVar.T(iVar);
                cVar.C(a.o.b);
            }
        };
        this.u = r2;
        this.v = msy.a(lazyThreadSafetyMode, new g8n0(this, 14));
        this.w = msy.a(lazyThreadSafetyMode, new y3l0(this, 21));
        this.x = msy.a(lazyThreadSafetyMode, new c9m0(this, 14));
        this.y = msy.a(lazyThreadSafetyMode, new ivs0(this, 3));
        this.z = msy.a(lazyThreadSafetyMode, new jds0(this, 5));
        this.A = new f4z<>();
        ofd ofdVar = new ofd(new e1s0(this, 6));
        this.C = ofdVar;
        bpn0 bpn0Var = o25.a;
        ((b25) (bpn0Var == null ? null : bpn0Var).getValue()).b0(r2);
        bpn0 bpn0Var2 = xwk.b;
        a7f0.a.e(this, ((o0r0) (bpn0Var2 != null ? bpn0Var2 : null).getValue()).T().m().d, null, new n7b0(this, 26), null, null, 13);
        if (fxc0.B().J().e0().a) {
            this.B = new b(this);
        }
        io.reactivex.rxjava3.subjects.f<bwr0> fVar = wjs0.b;
        a7f0.a.e(this, fVar.a0(io.reactivex.rxjava3.android.schedulers.a.b()).b0(uxr0.class), null, new lzl0(this, 8), null, null, 13);
        a7f0.a.e(this, new i0(fVar.a0(io.reactivex.rxjava3.android.schedulers.a.b()), new vtg0(new o7j0(12), 10)).y(300L, TimeUnit.MILLISECONDS), null, new z8l0(this, 13), null, null, 13);
        a7f0.a.e(this, new y(new q(new vge(EmptyCoroutineContext.b, m7aVar.b())), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), null, new z7t0(this, 0), null, null, 13);
        aVar.c(ofdVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v95, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wk50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(c9t0 c9t0Var, com.vk.video.profile.presentation.a aVar) {
        CommonVideoStat$TypeVideoChannelOnboardingClick.EventType eventType;
        h aVar2;
        s75 c;
        final UserId userId;
        Object obj;
        UserId userId2;
        Object parcelableExtra;
        WarningNotification warningNotification;
        u490 u490Var;
        WarningNotification warningNotification2;
        String str;
        c9t0 c9t0Var2 = c9t0Var;
        com.vk.video.profile.presentation.a aVar3 = aVar;
        boolean z = aVar3 instanceof a.o;
        int i = 3;
        int i2 = 0;
        int i3 = 1;
        f4z<h> f4zVar = this.A;
        if (z) {
            f4zVar.b(h.c.a);
            T(f.e.b.b);
            UserId Y = Y(c9t0Var2);
            a7f0.a.e(this, new i0(this.j.b(Y), new he40(new lwp0(6), 17)), null, new gsq0(this, 3), null, null, 13);
            VideoProfileSource videoProfileSource = c9t0Var2.b;
            a7f0.a.f(this, znk0.Q(x.B(Z(Y, videoProfileSource), W().a(videoProfileSource), new nh40(new g6g(i), 23)), this.B), new x7t0(i2, this, c9t0Var2), new cis0(i3, this, Y), 1);
            return;
        }
        if (aVar3 instanceof a.z) {
            U(c9t0Var2, true);
            return;
        }
        boolean z2 = aVar3 instanceof a.a0;
        ?? r4 = this.w;
        CommonVideoStat$TypeVideoChannelOnboardingClick.EventType eventType2 = null;
        UserId userId3 = null;
        UserId userId4 = null;
        CommonVideoStat$AgeMarkNotificationBlockType commonVideoStat$AgeMarkNotificationBlockType = null;
        if (!z2) {
            if (aVar3 instanceof a.d0) {
                j9t0 j9t0Var = (j9t0) r4.getValue();
                j9t0Var.getClass();
                if (c9t0Var2 instanceof c9t0.e) {
                    qtk0<u490> qtk0Var = ((c9t0.e) c9t0Var2).e;
                    qtk0.a aVar4 = qtk0Var instanceof qtk0.a ? (qtk0.a) qtk0Var : null;
                    u490 u490Var2 = aVar4 != null ? (u490) aVar4.a : null;
                    UserId userId5 = u490Var2 != null ? u490Var2.a.b : null;
                    str = u490Var2 != null ? u490Var2.c : null;
                    userId4 = userId5;
                } else if (c9t0Var2 instanceof c9t0.c) {
                    userId4 = ((c9t0.c) c9t0Var2).e;
                    str = null;
                } else {
                    str = null;
                }
                if (userId4 == null) {
                    return;
                }
                j9t0Var.a.b(new h.r(str, userId4));
                return;
            }
            if (aVar3 instanceof a.b0) {
                ((j9t0) r4.getValue()).a.b(new h.l(Y(c9t0Var2)));
                return;
            }
            if (aVar3 instanceof a.p) {
                T(f.b.c.b);
                return;
            }
            if (aVar3 instanceof a.c0) {
                ((j9t0) r4.getValue()).a.b(h.j.a);
                return;
            }
            if (aVar3 instanceof a.e) {
                T(f.a.c.b);
                return;
            }
            if (aVar3 instanceof a.f) {
                T(f.b.C1959b.b);
                return;
            }
            if (aVar3 instanceof a.e0) {
                if (c9t0Var2 instanceof c9t0.e) {
                    T(f.b.a.b);
                    return;
                }
                return;
            }
            int i4 = 12;
            if (aVar3 instanceof a.c) {
                e8t0 W = W();
                a.c cVar = (a.c) aVar3;
                v8t0 v8t0Var = W.c;
                cVar.getClass();
                if (c9t0Var2 instanceof c9t0.e) {
                    qtk0<u490> qtk0Var2 = ((c9t0.e) c9t0Var2).e;
                    if (qtk0Var2 instanceof qtk0.a) {
                        UserId userId6 = ((u490) ((qtk0.a) qtk0Var2).a).a.b;
                        com.vk.core.utils.newtork.b.a.getClass();
                        W.f.b((!com.vk.core.utils.newtork.b.d() ? io.reactivex.rxjava3.core.a.k(new IOException("Network is not connected")) : fkq0.d(userId6) ? v8t0Var.c() : v8t0Var.g(userId6)).q(io.reactivex.rxjava3.schedulers.a.b()).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new vlg(i3, W, cVar), new onm0(new q7a0(i4, W, cVar), 9)));
                        return;
                    }
                    return;
                }
                return;
            }
            int i5 = 10;
            if (aVar3 instanceof a.f0) {
                e8t0 W2 = W();
                W2.getClass();
                if (c9t0Var2 instanceof c9t0.e) {
                    c9t0.e eVar = (c9t0.e) c9t0Var2;
                    qtk0<u490> qtk0Var3 = eVar.e;
                    qtk0<List<u490>> qtk0Var4 = eVar.d;
                    if ((qtk0Var4 instanceof qtk0.a) && (qtk0Var3 instanceof qtk0.a)) {
                        f4z<h> f4zVar2 = W2.a;
                        Iterable iterable = (Iterable) ((qtk0.a) qtk0Var4).a;
                        ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((u490) it.next()).a);
                        }
                        f4zVar2.b(new h.i(((u490) ((qtk0.a) qtk0Var3).a).a.b, arrayList));
                        W2.e.invoke(f.AbstractC1960f.b.b);
                        return;
                    }
                    return;
                }
                return;
            }
            if (aVar3 instanceof a.b) {
                e8t0 W3 = W();
                W3.getClass();
                if (c9t0Var2 instanceof c9t0.e) {
                    c9t0.e eVar2 = (c9t0.e) c9t0Var2;
                    qtk0<u490> qtk0Var5 = eVar2.e;
                    if ((eVar2.d instanceof qtk0.a) && (qtk0Var5 instanceof qtk0.a)) {
                        T t = ((qtk0.a) qtk0Var5).a;
                        Integer num = ((u490) t).t;
                        if (num == null) {
                            return;
                        }
                        int intValue = num.intValue();
                        u490 u490Var3 = (u490) t;
                        long j = u490Var3.a.b.b;
                        if (intValue == GroupsGroupFullAgeMarkDto.OVER_18.i()) {
                            commonVideoStat$AgeMarkNotificationBlockType = CommonVideoStat$AgeMarkNotificationBlockType.ADULT;
                        } else if (intValue == GroupsGroupFullAgeMarkDto.OVER_16.i()) {
                            commonVideoStat$AgeMarkNotificationBlockType = CommonVideoStat$AgeMarkNotificationBlockType.TEEN;
                        }
                        if (commonVideoStat$AgeMarkNotificationBlockType != null) {
                            UiTracker uiTracker = UiTracker.a;
                            new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.BADGES, null, null, null, null, null, 62, null), new CommonVideoStat$TypeVideoAgeMarkClick(CommonVideoStat$TypeVideoAgeMarkClick.EventType.ADULT_MARK_INFO_VIEW, commonVideoStat$AgeMarkNotificationBlockType, j), 2)).q();
                        }
                        W3.a.b(new h.s(u490Var3.t.intValue()));
                        return;
                    }
                    return;
                }
                return;
            }
            if (aVar3 instanceof a.g0) {
                e8t0 W4 = W();
                W4.getClass();
                if (c9t0Var2 instanceof c9t0.e) {
                    c9t0.e eVar3 = (c9t0.e) c9t0Var2;
                    if (eVar3.d instanceof qtk0.a) {
                        qtk0<u490> qtk0Var6 = eVar3.e;
                        if ((qtk0Var6 instanceof qtk0.a) && (warningNotification2 = (u490Var = (u490) ((qtk0.a) qtk0Var6).a).v) != null) {
                            W4.a.b(new h.a0(u490Var.a.b, warningNotification2));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (aVar3 instanceof a.n) {
                if (c9t0Var2 instanceof c9t0.e) {
                    qtk0<u490> qtk0Var7 = ((c9t0.e) c9t0Var2).e;
                    if ((qtk0Var7 instanceof qtk0.a) && (warningNotification = ((u490) ((qtk0.a) qtk0Var7).a).v) != null) {
                        T(new f.j(warningNotification));
                    }
                }
                p9t0 p9t0Var = (p9t0) this.y.getValue();
                a.n nVar = (a.n) aVar3;
                UserId userId7 = nVar.b;
                int i6 = nVar.c;
                p9t0Var.getClass();
                p9t0Var.a.b(itg0.l(rsg0.Z(yfb.x(new zqu().v(i6, new UserId(Math.abs(userId7.b))))).q(asu0.a.c())));
                U(c9t0Var2, false);
                return;
            }
            if (aVar3 instanceof a.C1957a) {
                a.C1957a c1957a = (a.C1957a) aVar3;
                int i7 = c1957a.b;
                if (c9t0Var2 instanceof c9t0.e) {
                    if (i7 != 1001) {
                        if (i7 == 3901 || i7 == 3912) {
                            this.o.b(Y(c9t0Var2));
                            fzd0.b(this.p, 3901, c1957a.c, c1957a.d, new d(this), i7 == 3912 ? "video_onboarding" : null, null, 96);
                            return;
                        }
                        return;
                    }
                    T(f.AbstractC1960f.a.b);
                    Intent intent = c1957a.d;
                    if (intent == null) {
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelableExtra = intent.getParcelableExtra("result_target", Target.class);
                        obj = (Parcelable) parcelableExtra;
                    } else {
                        Object parcelableExtra2 = intent.getParcelableExtra("result_target");
                        obj = (Target) (parcelableExtra2 instanceof Target ? parcelableExtra2 : null);
                    }
                    Target target = (Target) obj;
                    if (target == null || (userId2 = target.c) == null) {
                        return;
                    }
                    V(userId2, c9t0Var2);
                    return;
                }
                return;
            }
            if (aVar3 instanceof a.j0) {
                h9t0 X = X();
                boolean z3 = ((a.j0) aVar3).b;
                u490 u490Var4 = (u490) X.a.invoke(c9t0Var2);
                if (u490Var4 == null) {
                    return;
                }
                X.a(u490Var4, z3);
                return;
            }
            if (aVar3 instanceof a.d) {
                final h9t0 X2 = X();
                final a.d dVar = (a.d) aVar3;
                xd8 xd8Var = X2.e;
                VideoNotificationsStatus videoNotificationsStatus = dVar.b;
                wd8 wd8Var = X2.a;
                u490 u490Var5 = (u490) wd8Var.invoke(c9t0Var2);
                VideoNotificationsStatus videoNotificationsStatus2 = u490Var5 != null ? u490Var5.j : null;
                if (videoNotificationsStatus2 == null || videoNotificationsStatus == videoNotificationsStatus2) {
                    xd8Var.invoke(f.h.g.b);
                    return;
                }
                xd8Var.invoke(new f.h.a(videoNotificationsStatus));
                u490 u490Var6 = (u490) wd8Var.invoke(c9t0Var2);
                if (u490Var6 == null || (userId = u490Var6.a.b) == null) {
                    userId = UserId.d;
                }
                X2.g.b(X2.d.a(userId, videoNotificationsStatus).q(io.reactivex.rxjava3.schedulers.a.b()).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.g9t0
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        h9t0 h9t0Var = h9t0.this;
                        lzh0 lzh0Var = h9t0Var.c;
                        b8t0 b8t0Var = h9t0Var.h;
                        a.d dVar2 = dVar;
                        int i8 = h9t0.a.$EnumSwitchMapping$0[dVar2.b.ordinal()];
                        UserId userId8 = userId;
                        if (i8 == 1) {
                            b8t0Var.invoke(StateSubscribeNotification.ALL_NOTIFICATIONS, userId8, Boolean.FALSE);
                            lzh0Var.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_ALL_OUT);
                        } else if (i8 == 2) {
                            b8t0Var.invoke(StateSubscribeNotification.PREFER_NOTIFICATIONS, userId8, Boolean.FALSE);
                            lzh0Var.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_USEFUL_OUT);
                        } else {
                            if (i8 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            b8t0Var.invoke(StateSubscribeNotification.NONE_NOTIFICATIONS, userId8, Boolean.FALSE);
                            lzh0Var.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_NO_NOTIFY_OUT);
                        }
                        h9t0Var.e.invoke(f.h.g.b);
                        new bjc(MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_PROFILE, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), MobileOfficialAppsGroupsStat$TypeGroupsEventItem.a.a(userId8.b, null, null, new MobileOfficialAppsGroupsStat$VideoSubscribeEvent(kk70.a(dVar2.b)), 30), 2)).q();
                    }
                }, new x150(new lfa(26, X2, videoNotificationsStatus2), 19)));
                return;
            }
            if (aVar3 instanceof a.l0) {
                h9t0 X3 = X();
                a.l0 l0Var = (a.l0) aVar3;
                u490 u490Var7 = (u490) X3.a.invoke(c9t0Var2);
                VideoNotificationsStatus videoNotificationsStatus3 = u490Var7 != null ? u490Var7.j : null;
                VideoNotificationsStatus videoNotificationsStatus4 = l0Var.b;
                if (videoNotificationsStatus3 != videoNotificationsStatus4) {
                    X3.e.invoke(new f.h.a(videoNotificationsStatus4));
                    return;
                }
                return;
            }
            if (aVar3 instanceof a.q) {
                e8t0 W5 = W();
                lzh0 lzh0Var = W5.b;
                f4z<h> f4zVar3 = W5.a;
                if (c9t0Var2 instanceof c9t0.e) {
                    qtk0<u490> qtk0Var8 = ((c9t0.e) c9t0Var2).e;
                    if (qtk0Var8 instanceof qtk0.a) {
                        T t2 = ((qtk0.a) qtk0Var8).a;
                        if (fkq0.d(((u490) t2).a.b)) {
                            f4zVar3.b(new h.o(((u490) t2).a));
                            lzh0Var.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_OWNER_OUT);
                            return;
                        }
                        u490 u490Var8 = (u490) t2;
                        if (fkq0.b(u490Var8.a.b)) {
                            zog zogVar = u490Var8.b;
                            Owner owner = u490Var8.a;
                            boolean z4 = zogVar.a;
                            boolean z5 = zogVar.b;
                            if (z4 || z5) {
                                f4zVar3.b(new h.a(owner, false));
                            } else {
                                f4zVar3.b(new h.o(owner));
                            }
                            lzh0Var.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_OWNER_OUT);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (aVar3 instanceof a.k0) {
                h9t0 X4 = X();
                u490 u490Var9 = (u490) X4.a.invoke(c9t0Var2);
                if (u490Var9 == null) {
                    return;
                }
                X4.e.invoke(f.h.e.b);
                X4.g.b(v8t0.f(X4.d, u490Var9.a.b, null, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_PROFILE), 2).q(io.reactivex.rxjava3.schedulers.a.b()).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new z6w(i, u490Var9, X4), new uk40(new u5p0(X4, i5), 25)));
                return;
            }
            if (aVar3 instanceof a.k) {
                e8t0 W6 = W();
                UserId Y2 = Y(c9t0Var2);
                if (((a.k) aVar3).b) {
                    W6.getClass();
                    o7t0.a(CommonVideoStat$TypeVideoChannelOnboardingClick.EventType.CLICK_ONBOARDING_EDIT, Y2);
                }
                W6.a.b(new h.f(Y2, null));
                return;
            }
            if (aVar3 instanceof a.h0) {
                f4zVar.b(h.d.a);
                return;
            }
            if (aVar3 instanceof a.w) {
                f4zVar.b(h.C1963h.a);
                return;
            }
            if (aVar3 instanceof a.i0) {
                h9t0 X5 = X();
                a.i0 i0Var = (a.i0) aVar3;
                X5.getClass();
                if (c9t0Var2 instanceof c9t0.e) {
                    qtk0<u490> qtk0Var9 = ((c9t0.e) c9t0Var2).e;
                    if ((qtk0Var9 instanceof qtk0.a) && epx.f(((u490) ((qtk0.a) qtk0Var9).a).a.b, i0Var.b)) {
                        X5.e.invoke(new f.h.b(i0Var.c));
                        return;
                    }
                    return;
                }
                return;
            }
            if (aVar3 instanceof a.l) {
                h9t0 X6 = X();
                a.l lVar = (a.l) aVar3;
                X6.getClass();
                if (c9t0Var2 instanceof c9t0.e) {
                    qtk0<u490> qtk0Var10 = ((c9t0.e) c9t0Var2).e;
                    if (qtk0Var10 instanceof qtk0.a) {
                        UserId userId8 = ((u490) ((qtk0.a) qtk0Var10).a).a.b;
                        if (fkq0.b(userId8)) {
                            X6.b.b(new h.v(userId8));
                            return;
                        } else {
                            X6.g.b(v8t0.f(X6.d, userId8, lVar.b, null, 12).q(io.reactivex.rxjava3.schedulers.a.b()).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new rcl(X6, i), new tk40(new gib0(X6, 24), 24)));
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (aVar3 instanceof a.g) {
                if (c9t0Var2 instanceof c9t0.e) {
                    T(f.d.b);
                    return;
                }
                return;
            }
            if (aVar3 instanceof a.x) {
                f4zVar.b(h.m.a);
                return;
            }
            if (aVar3 instanceof a.y) {
                e8t0 W7 = W();
                W7.getClass();
                if (c9t0Var2 instanceof c9t0.e) {
                    qtk0<u490> qtk0Var11 = ((c9t0.e) c9t0Var2).e;
                    if (qtk0Var11 instanceof qtk0.a) {
                        qtk0.a aVar5 = (qtk0.a) qtk0Var11;
                        u490 u490Var10 = (u490) aVar5.a;
                        p7t0 p7t0Var = u490Var10.s;
                        if (p7t0Var != null) {
                            int i8 = p7t0Var.e;
                            if (i8 == 0) {
                                eventType2 = CommonVideoStat$TypeVideoChannelOnboardingClick.EventType.CLICK_ONBOARDING_UPLOAD_1;
                            } else if (i8 == 1) {
                                eventType2 = CommonVideoStat$TypeVideoChannelOnboardingClick.EventType.CLICK_ONBOARDING_UPLOAD_2;
                            } else if (i8 == 2) {
                                eventType2 = CommonVideoStat$TypeVideoChannelOnboardingClick.EventType.CLICK_ONBOARDING_UPLOAD_3;
                            }
                            if (eventType2 != null) {
                                o7t0.a(eventType2, u490Var10.a.b);
                            }
                        }
                        W7.a.b(new h.n(((u490) aVar5.a).a));
                        return;
                    }
                    return;
                }
                return;
            }
            if (aVar3 instanceof a.u) {
                e8t0 W8 = W();
                W8.getClass();
                if (c9t0Var2 instanceof c9t0.e) {
                    qtk0<u490> qtk0Var12 = ((c9t0.e) c9t0Var2).e;
                    if (qtk0Var12 instanceof qtk0.a) {
                        qtk0.a aVar6 = (qtk0.a) qtk0Var12;
                        if (fkq0.d(((u490) aVar6.a).a.b) || (c = com.vk.toggle.d.c()) == null) {
                            return;
                        }
                        String str2 = c.c;
                        u490 u490Var11 = (u490) aVar6.a;
                        String str3 = u490Var11.c;
                        if (str3 == null) {
                            str3 = "club" + fkq0.e(u490Var11.a.b).b;
                        }
                        W8.a.b(new h.e(String.format(str2, Arrays.copyOf(new Object[]{str3}, 1))));
                        return;
                    }
                    return;
                }
                return;
            }
            if (aVar3 instanceof a.v) {
                ((a.v) aVar3).getClass();
                if (c9t0Var2 instanceof c9t0.e) {
                    qtk0<u490> qtk0Var13 = ((c9t0.e) c9t0Var2).e;
                    if (qtk0Var13 instanceof qtk0.a) {
                        if (epx.f(((u490) ((qtk0.a) qtk0Var13).a).a.b, null)) {
                            f4zVar.b(h.g.a);
                            return;
                        } else {
                            V(null, c9t0Var2);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (aVar3 instanceof a.m) {
                return;
            }
            boolean equals = aVar3.equals(a.r.b);
            h7v h7vVar = this.m;
            if (equals) {
                h7vVar.b(HintId.CHANNEL_DONUT_BUTTON_TOOLTIP.getId());
                return;
            }
            if (aVar3.equals(a.t.b)) {
                h7vVar.b(HintId.CREATORS_DASHBOARD_WEBVIEW.getId());
                return;
            }
            if (aVar3 instanceof a.i) {
                e8t0 W9 = W();
                VideoProfileCreatorOnboardingItemType videoProfileCreatorOnboardingItemType = ((a.i) aVar3).b;
                UserId Y3 = Y(c9t0Var2);
                W9.getClass();
                if (c9t0Var2 instanceof c9t0.e) {
                    qtk0<u490> qtk0Var14 = ((c9t0.e) c9t0Var2).e;
                    if (qtk0Var14 instanceof qtk0.a) {
                        int[] iArr = e8t0.a.$EnumSwitchMapping$0;
                        int i9 = iArr[videoProfileCreatorOnboardingItemType.ordinal()];
                        if (i9 == 1) {
                            eventType = CommonVideoStat$TypeVideoChannelOnboardingClick.EventType.CLICK_ONBOARDING_AVATAR;
                        } else if (i9 == 2) {
                            eventType = CommonVideoStat$TypeVideoChannelOnboardingClick.EventType.CLICK_ONBOARDING_COVER;
                        } else {
                            if (i9 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            eventType = CommonVideoStat$TypeVideoChannelOnboardingClick.EventType.CLICK_ONBOARDING_DESCRIPTION;
                        }
                        o7t0.a(eventType, Y3);
                        int i10 = iArr[videoProfileCreatorOnboardingItemType.ordinal()];
                        if (i10 == 1) {
                            aVar2 = new h.a(((u490) ((qtk0.a) qtk0Var14).a).a, true);
                        } else if (i10 == 2) {
                            aVar2 = new h.f(Y3, "video_onboarding");
                        } else {
                            if (i10 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar2 = new h.f(Y3, "video_onboarding");
                        }
                        W9.a.b(aVar2);
                        return;
                    }
                    return;
                }
                return;
            }
            if (aVar3 instanceof a.j) {
                e8t0 W10 = W();
                W10.getClass();
                if (c9t0Var2 instanceof c9t0.e) {
                    qtk0<u490> qtk0Var15 = ((c9t0.e) c9t0Var2).e;
                    if (qtk0Var15 instanceof qtk0.a) {
                        Owner owner2 = ((u490) ((qtk0.a) qtk0Var15).a).a;
                        W10.d.getClass();
                        return;
                    }
                    return;
                }
                return;
            }
            if (aVar3 instanceof a.s) {
                W().d.getClass();
                return;
            }
            if (!(aVar3 instanceof a.h)) {
                if (!(aVar3 instanceof a.m0)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (Y(c9t0Var2).equals(((a.m0) aVar3).b)) {
                    U(c9t0Var2, false);
                    return;
                }
                return;
            }
            e8t0 W11 = W();
            UserId Y4 = Y(c9t0Var2);
            W11.getClass();
            if ((c9t0Var2 instanceof c9t0.e) && (((c9t0.e) c9t0Var2).e instanceof qtk0.a)) {
                W11.a.b(new h.f(Y4, null));
                return;
            }
            return;
        }
        j9t0 j9t0Var2 = (j9t0) r4.getValue();
        j9t0Var2.getClass();
        if (c9t0Var2 instanceof c9t0.e) {
            qtk0<u490> qtk0Var16 = ((c9t0.e) c9t0Var2).e;
            if (qtk0Var16 instanceof qtk0.a) {
                userId3 = ((u490) ((qtk0.a) qtk0Var16).a).a.b;
                if (userId3 != null) {
                    return;
                }
                j9t0Var2.a.b(new h.k(userId3));
                return;
            }
        }
        if (c9t0Var2 instanceof c9t0.c) {
            userId3 = ((c9t0.c) c9t0Var2).e;
        }
        if (userId3 != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(c9t0 c9t0Var, boolean z) {
        UserId userId;
        if (c9t0Var instanceof c9t0.e) {
            qtk0<u490> qtk0Var = ((c9t0.e) c9t0Var).e;
            if (qtk0Var instanceof qtk0.a) {
                userId = ((u490) ((qtk0.a) qtk0Var).a).a.b;
                if (userId != null) {
                    return;
                }
                T(f.g.b.b);
                if (z) {
                    this.A.b(h.p.a);
                }
                int i = 2;
                a7f0.a.f(this, znk0.Q(x.B(Z(userId, c9t0Var.b), W().a(c9t0Var.b), new i3u(new bkh(12), 20)), this.B), new yyq0(i, this, c9t0Var), new qlq0(i, this, userId), 1);
                return;
            }
        }
        if (c9t0Var instanceof c9t0.c) {
            userId = ((c9t0.c) c9t0Var).e;
        } else {
            if (c9t0Var instanceof c9t0.a) {
                bpn0 bpn0Var = o25.a;
                userId = ((b25) (bpn0Var != null ? bpn0Var : null).getValue()).c();
            } else {
                userId = null;
            }
        }
        if (userId != null) {
        }
    }

    public final void V(UserId userId, c9t0 c9t0Var) {
        Object obj;
        if (c9t0Var instanceof c9t0.e) {
            c9t0.e eVar = (c9t0.e) c9t0Var;
            qtk0<List<u490>> qtk0Var = eVar.d;
            if (qtk0Var instanceof qtk0.a) {
                Iterator it = ((Iterable) ((qtk0.a) qtk0Var).a).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (epx.f(((u490) obj).a.b, userId)) {
                            break;
                        }
                    }
                }
                u490 u490Var = (u490) obj;
                if (u490Var == null) {
                    return;
                }
                Owner owner = u490Var.a;
                this.n.getClass();
                this.h.a(new h8t0(owner.i(16), userId, eVar.c instanceof VideoProfileSource.OwnProfile));
                C(a.o.b);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final e8t0 W() {
        return (e8t0) this.v.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final h9t0 X() {
        return (h9t0) this.x.getValue();
    }

    public final UserId Y(c9t0 c9t0Var) {
        UserId userId;
        VideoProfileSource videoProfileSource = c9t0Var.b;
        if (videoProfileSource instanceof VideoProfileSource.ForeignProfile) {
            return ((VideoProfileSource.ForeignProfile) videoProfileSource).b;
        }
        if (!(videoProfileSource instanceof VideoProfileSource.OwnProfile)) {
            throw new NoWhenBranchMatchedException();
        }
        h8t0 value = this.i.getValue();
        return (value == null || (userId = value.a) == null) ? ((VideoProfileSource.OwnProfile) c9t0Var.b).b : userId;
    }

    public final x<u490> Z(UserId userId, VideoProfileSource videoProfileSource) {
        com.vk.core.utils.newtork.b.a.getClass();
        if (!com.vk.core.utils.newtork.b.d()) {
            return x.i(new IOException());
        }
        if (videoProfileSource instanceof VideoProfileSource.OwnProfile) {
            bpn0 bpn0Var = o25.a;
            if (bpn0Var == null) {
                bpn0Var = null;
            }
            if (!((b25) bpn0Var.getValue()).b()) {
                return x.i(new UserNotAuthorizedException());
            }
        }
        boolean d = fkq0.d(userId);
        x8t0 x8t0Var = this.f;
        if (d) {
            dz2 x = yfb.x(r1r0.a.b(x8t0Var.a, Collections.singletonList(userId), x8t0.f, null, null, 58));
            ahn.D(x);
            return rsg0.w0(x).l(new r2v(new xep0(5), 22)).l(new e4t(z8t0.b, 19));
        }
        x8t0Var.getClass();
        ListBuilder e = e43.e();
        e.addAll(x8t0.g);
        if (fxc0.B().J().x()) {
            e.addAll(x8t0.j);
        }
        if (fxc0.B().J().W1()) {
            e.add(GroupsFieldsDto.WARNING_NOTIFICATION);
        }
        if (fxc0.B().J().b1()) {
            e.add(GroupsFieldsDto.AGE_MARK);
        }
        dz2 x2 = yfb.x(wqu.a.b(x8t0Var.b, Collections.singletonList(fkq0.a(userId)), e.g(), null, 4));
        ahn.D(x2);
        return new o(rsg0.w0(x2).l(new aoq0(new t6c0(13), 2)).l(new vtg0(new o7j0(13), 11)), new f0o0(new acc0(17), 5)).l(new hqf(y8t0.b, 1));
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        bpn0 bpn0Var = o25.a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        ((b25) bpn0Var.getValue()).B(this.u);
        this.s.a(this.C);
        this.h.a(null);
        super.onDestroy();
    }
}
