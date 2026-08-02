package com.vk.music.notifications.restriction;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetFragment;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.dto.music.MusicTrack;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioModal;
import com.vk.superapp.api.dto.auth.validatephonecheck.AuthValidatePhoneCheckResponse;
import com.vkontakte.android.R;
import com.vkontakte.android.VKActivity;
import io.appmetrica.analytics.impl.L2;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.disposables.g;
import io.reactivex.rxjava3.internal.operators.single.j;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.ai6;
import xsna.am0;
import xsna.b60;
import xsna.bn40;
import xsna.bpn0;
import xsna.c63;
import xsna.c940;
import xsna.cm4;
import xsna.cv3;
import xsna.e370;
import xsna.e43;
import xsna.ep40;
import xsna.epx;
import xsna.ezb0;
import xsna.gzs;
import xsna.hp40;
import xsna.i0q0;
import xsna.ic40;
import xsna.izs;
import xsna.j50;
import xsna.k840;
import xsna.lyd;
import xsna.m950;
import xsna.mw4;
import xsna.n950;
import xsna.o25;
import xsna.p950;
import xsna.q55;
import xsna.r55;
import xsna.r5v0;
import xsna.rj40;
import xsna.s3q0;
import xsna.s750;
import xsna.sj40;
import xsna.sw1;
import xsna.vdx0;
import xsna.vx2;
import xsna.xb3;
import xsna.xh6;
import xsna.xij0;
import xsna.zh6;
import xsna.zl0;

/* compiled from: BaseMusicRestrictionPopupDisplayer.kt */
/* loaded from: classes.dex */
public abstract class a implements MusicRestrictionPopupDisplayer, ep40 {
    public final /* synthetic */ hp40 a;
    public final s750 b;
    public final c940 c;
    public final g d;
    public String e;
    public boolean f;
    public io.reactivex.rxjava3.disposables.c g;
    public io.reactivex.rxjava3.disposables.c h;
    public final bpn0 i;
    public final bpn0 j;

    /* compiled from: BaseMusicRestrictionPopupDisplayer.kt */
    /* renamed from: com.vk.music.notifications.restriction.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class C1326a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MusicRestrictionPopupDisplayer.SubscriptionPopupType.values().length];
            try {
                iArr[MusicRestrictionPopupDisplayer.SubscriptionPopupType.WINK_UPGRADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicRestrictionPopupDisplayer.SubscriptionPopupType.COMBO_UPGRADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: BaseMusicRestrictionPopupDisplayer.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<AuthValidatePhoneCheckResponse, s3q0> {
        public b(a aVar) {
            super(1, aVar, a.class, "showSubscriptionWasBought", "showSubscriptionWasBought(Lcom/vk/superapp/api/dto/auth/validatephonecheck/AuthValidatePhoneCheckResponse;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(AuthValidatePhoneCheckResponse authValidatePhoneCheckResponse) {
            AuthValidatePhoneCheckResponse authValidatePhoneCheckResponse2 = authValidatePhoneCheckResponse;
            ((a) this.receiver).getClass();
            r55 r55Var = r55.a;
            bn40.b("Phone validation check " + authValidatePhoneCheckResponse2);
            if (authValidatePhoneCheckResponse2.b != 4) {
                c63 c63Var = c63.a;
                Activity b = c63.b();
                VKActivity vKActivity = b instanceof VKActivity ? (VKActivity) b : null;
                if (vKActivity != null) {
                    q55 q55Var = q55.a;
                    n950 n950Var = new n950(vKActivity, new p950(vKActivity, authValidatePhoneCheckResponse2), authValidatePhoneCheckResponse2);
                    if (vKActivity.getResources().getBoolean(R.bool.music_buy_music_suscription_tabled_layout_allowed)) {
                        com.vk.music.notifications.inapp.b.f(n950Var.b, null, new m950(n950Var, 0), 10);
                    } else {
                        int i = MusicSubscriptionWasBoughtFragment.T;
                        int i2 = CustomisableBottomSheetFragment.S;
                        MusicSubscriptionWasBoughtFragment musicSubscriptionWasBoughtFragment = new MusicSubscriptionWasBoughtFragment();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("AUTH_CHECK_RESPONSE_ARG", n950Var.c);
                        musicSubscriptionWasBoughtFragment.setArguments(bundle);
                        s3q0 s3q0Var = s3q0.a;
                        CustomisableBottomSheetFragment.b.a(vKActivity, musicSubscriptionWasBoughtFragment, null);
                    }
                }
            }
            return s3q0.a;
        }
    }

    public a(s750 s750Var, c940 c940Var, hp40 hp40Var) {
        r55 r55Var = r55.a;
        q55 q55Var = q55.a;
        this.a = hp40Var;
        this.b = s750Var;
        this.c = c940Var;
        this.d = new g();
        this.i = new bpn0(new xb3(1));
        this.j = new bpn0(new xh6(0));
    }

    @Override // com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer
    public final void a(MusicDynamicRestriction musicDynamicRestriction, ezb0 ezb0Var) {
        bn40.f(musicDynamicRestriction);
        this.b.K(13);
        i0q0.f(new cv3(musicDynamicRestriction, new rj40(musicDynamicRestriction.zb(), musicDynamicRestriction.Ab(), null, 4), ezb0Var, 1));
    }

    @Override // com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer
    public final void c(MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        MusicRestrictionPopupDisplayer.d(this, L2.g, musicPlaybackLaunchContext, null, null, 12);
        s750 s750Var = k840.a.e;
        if (s750Var == null) {
            s750Var = null;
        }
        s750Var.H0(CommonAudioStat$TypeAudioModal.ModalId.OFFLINE_PLAYBACK_PAYWALL);
    }

    @Override // com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer
    public final void f() {
        x l;
        bn40.f(new Object[0]);
        if (o25.a().i().F) {
            io.reactivex.rxjava3.disposables.c cVar = this.g;
            if (cVar != null) {
                cVar.dispose();
            }
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            l = vdx0Var.e().l(null);
            this.g = l.q(io.reactivex.rxjava3.schedulers.a.b()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new zl0(new b(this), 4), new j50(new am0(7), 4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    @Override // com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(MusicTrack musicTrack) {
        boolean z;
        r5v0 r5v0Var;
        if (musicTrack.Pb()) {
            com.vk.core.utils.newtork.b.a.getClass();
            if (!com.vk.core.utils.newtork.b.d()) {
                z = true;
                if (!musicTrack.B() || z) {
                    bn40.f(new Object[0]);
                    r5v0Var = k840.a.h;
                    if (r5v0Var == null) {
                        r5v0Var = null;
                    }
                    r5v0Var.b(xij0.a);
                    if (musicTrack.Db() != 8) {
                        c63 c63Var = c63.a;
                        Activity b2 = c63.b();
                        if (b2 == null) {
                            return;
                        }
                        if (k840.a.i.c() || !epx.f(musicTrack.J, DownloadingState.Downloaded.b) || this.f) {
                            ic40.r(lyd.g().w(), b2, MusicBottomSheetLaunchPoint.App.b, musicTrack, null, null, false, false, null, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
                            return;
                        }
                        return;
                    }
                    if (!musicTrack.B()) {
                        if (z) {
                            j();
                            return;
                        }
                        return;
                    }
                    this.d.b(new j(((mw4) this.i.getValue()).a(musicTrack.Db(), musicTrack.Ib(), musicTrack.y).q(vx2.d.m()).m(io.reactivex.rxjava3.android.schedulers.a.b()), new cm4(this, 2)).subscribe(new b60(new ai6(this), 4)));
                    if (musicTrack.Db() == 2) {
                        this.b.o0(musicTrack.b, musicTrack.c);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z = false;
        if (musicTrack.B()) {
        }
        bn40.f(new Object[0]);
        r5v0Var = k840.a.h;
        if (r5v0Var == null) {
        }
        r5v0Var.b(xij0.a);
        if (musicTrack.Db() != 8) {
        }
    }

    @Override // xsna.ep40
    public final void h(Context context, gzs<s3q0> gzsVar) {
        this.a.h(context, gzsVar);
    }

    @Override // com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer
    public final void i(String str, MusicPlaybackLaunchContext musicPlaybackLaunchContext, String str2, MusicRestrictionPopupDisplayer.SubscriptionPopupType subscriptionPopupType) {
        bn40.f(new Object[0]);
        this.c.a(new zh6(this, str, musicPlaybackLaunchContext, str2, subscriptionPopupType));
    }

    public final void j() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        l(13, context.getString(R.string.music_restriction_offline_play_title), R.drawable.vk_icon_illustration_music_no_network_72, context.getString(R.string.music_restriction_offline_play_description), null, null);
    }

    public final void k(final String str) {
        if (str == null) {
            String str2 = this.e;
            if (str2 != null) {
                k(str2);
            }
            this.e = null;
            return;
        }
        c63 c63Var = c63.a;
        if (!c63.f) {
            this.e = str;
            return;
        }
        final Activity b2 = c63.b();
        if (b2 != null) {
            bn40.f("deviceName=", str);
            final rj40 rj40Var = new rj40(b2.getString(R.string.music_device_restriction_alert_more), null, new sw1(3), 2);
            i0q0.f(new gzs() { // from class: xsna.qh6
                @Override // xsna.gzs
                public final Object invoke() {
                    Activity activity = b2;
                    com.vk.music.notifications.inapp.b.d(activity, sj40.a.b(R.drawable.ic_smile_72, activity.getString(R.string.music_device_restriction_alert_title), activity.getString(R.string.music_device_restriction_alert_text, str), rj40Var, 48), null, null);
                    return s3q0.a;
                }
            });
        }
    }

    public final void l(int i, final String str, final int i2, final String str2, final String str3, final String str4) {
        this.b.K(i);
        i0q0.f(new gzs() { // from class: xsna.yh6
            @Override // xsna.gzs
            public final Object invoke() {
                com.vk.music.notifications.inapp.b.f(sj40.a.b(i2, str, str2, new rj40(str3, str4, null, 4), 80), null, null, 14);
                return s3q0.a;
            }
        });
    }
}
