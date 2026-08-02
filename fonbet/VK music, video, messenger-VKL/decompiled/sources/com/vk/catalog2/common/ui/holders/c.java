package com.vk.catalog2.common.ui.holders;

import android.app.Activity;
import android.content.Context;
import com.vk.api.generated.video.dto.VideoSetNotificationsStatusStatusDto;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.ui.core.analytics.tracking.SearchAuthorAnalyticsInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.libvideo.bottomsheet.notifications.SubscriptionAction;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.single.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.agh;
import xsna.amt;
import xsna.baf0;
import xsna.cvk;
import xsna.dhr0;
import xsna.e3m;
import xsna.epx;
import xsna.fkq0;
import xsna.gk70;
import xsna.gqb;
import xsna.izs;
import xsna.kym0;
import xsna.l8w;
import xsna.mcc0;
import xsna.p30;
import xsna.q3a;
import xsna.rsg0;
import xsna.s3q0;
import xsna.t6g0;
import xsna.tfx;
import xsna.uft0;
import xsna.x620;
import xsna.xwk;
import xsna.yfb;
import xsna.zqu;

/* compiled from: ProfileNotificationDelegate.kt */
/* loaded from: classes16.dex */
public final class c {
    public final q3a a;
    public final mcc0 b;
    public final FunctionReferenceImpl c;
    public io.reactivex.rxjava3.disposables.c d;
    public final uft0 e = new uft0();
    public final zqu f = new zqu();
    public boolean g;

    /* compiled from: ProfileNotificationDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SubscriptionAction.values().length];
            try {
                iArr[SubscriptionAction.FULLY_ENABLED_NOTIFICATIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscriptionAction.PREFERRED_VIDEOS_NOTIFICATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SubscriptionAction.DISABLED_NOTIFICATIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SubscriptionAction.NOTIFICATIONS_PERMISSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SubscriptionAction.HIDE_AUTHOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SubscriptionAction.UNSUBSCRIBE_AUTHOR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VideoNotificationsStatus.values().length];
            try {
                iArr2[VideoNotificationsStatus.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[VideoNotificationsStatus.PREFERRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[VideoNotificationsStatus.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(q3a q3aVar, mcc0 mcc0Var, izs<? super SearchAuthorAnalyticsInfo.ClickTarget, s3q0> izsVar) {
        this.a = q3aVar;
        this.b = mcc0Var;
        this.c = (FunctionReferenceImpl) izsVar;
    }

    public static baf0 c(Group group) {
        String str = group.k0;
        return dhr0.t.b(epx.f(str, VideoNotificationsStatus.PREFERRED.i()) ? R.drawable.vk_icon_notifications_28 : epx.f(str, VideoNotificationsStatus.NONE.i()) ? R.drawable.vk_icon_notification_disable_outline_28 : R.drawable.vk_icon_notification_waves_28, R.attr.vk_ui_icon_accent_themed);
    }

    public static void d(UserId userId) {
        t6g0 t6g0Var = t6g0.b;
        t6g0.b().a();
        xwk.e().T().m().b(new kym0(SubscribeStatus.MEMBER_STATUS_NOT_MEMBER, userId, null, null, 12));
    }

    public final void a(UserId userId, VideoNotificationsStatus videoNotificationsStatus) {
        tfx n;
        com.vk.core.utils.newtork.b.a.getClass();
        if (!com.vk.core.utils.newtork.b.d()) {
            cvk.u(R.string.error_network, false);
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.d;
        if (cVar != null) {
            cVar.dispose();
        }
        int i = a.$EnumSwitchMapping$1[videoNotificationsStatus.ordinal()];
        uft0 uft0Var = this.e;
        if (i == 1) {
            n = uft0Var.n(fkq0.e(userId), VideoSetNotificationsStatusStatusDto.ALL);
        } else if (i == 2) {
            n = uft0Var.n(fkq0.e(userId), VideoSetNotificationsStatusStatusDto.PREFERRED);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            n = uft0Var.n(fkq0.e(userId), VideoSetNotificationsStatusStatusDto.NONE);
        }
        io.reactivex.rxjava3.disposables.c subscribe = rsg0.Z(yfb.x(n)).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new p30(this, userId, videoNotificationsStatus, 1), new amt(new x620(19), 25));
        this.b.a(subscribe);
        this.d = subscribe;
    }

    public final void b(Context context, Group group, NotificationsPermission notificationsPermission, UIBlockSearchAuthor uIBlockSearchAuthor) {
        SubscriptionAction subscriptionAction;
        Activity h = e3m.h(context);
        if (h == null) {
            return;
        }
        String str = group.k0;
        if (epx.f(str, VideoNotificationsStatus.ALL.i())) {
            subscriptionAction = SubscriptionAction.FULLY_ENABLED_NOTIFICATIONS;
        } else if (epx.f(str, VideoNotificationsStatus.PREFERRED.i())) {
            subscriptionAction = SubscriptionAction.PREFERRED_VIDEOS_NOTIFICATIONS;
        } else if (!epx.f(str, VideoNotificationsStatus.NONE.i())) {
            return;
        } else {
            subscriptionAction = SubscriptionAction.DISABLED_NOTIFICATIONS;
        }
        SubscriptionAction subscriptionAction2 = subscriptionAction;
        gk70 gk70Var = new gk70(notificationsPermission);
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_HIDE_CREATOR_FROM_SUBSCRIPTIONS;
        videoFeatures.getClass();
        new o(notificationsPermission.a(h), new l8w(new agh(gk70Var, h, subscriptionAction2, (!com.vk.toggle.b.A.a(videoFeatures) || group.v0 || this.g) ? false : true, new gqb(this, group, h, context, uIBlockSearchAuthor, 1)), 12)).subscribe();
    }
}
