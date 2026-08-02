package com.vk.friends.requests.impl.allrequests.presentation;

import android.util.Size;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.friends.dto.FriendsAddResponseDto;
import com.vk.api.generated.friends.dto.FriendsDeleteResponseDto;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.component.group.header.g;
import com.vk.dto.user.RequestUserProfile;
import com.vk.dzenarticle.impl.ui.DzenArticleFragment;
import com.vk.friends.requests.impl.allrequests.presentation.FriendRequestsTabFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.data.FriendsUtils;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import ru.ok.gl.tf.Tensorflow;
import xsna.cq;
import xsna.cro;
import xsna.cw50;
import xsna.d370;
import xsna.fe0;
import xsna.gzs;
import xsna.ikv0;
import xsna.izs;
import xsna.lg90;
import xsna.ots;
import xsna.pg90;
import xsna.q630;
import xsna.qcy;
import xsna.rrv0;
import xsna.rsg0;
import xsna.s200;
import xsna.s3;
import xsna.s3q0;
import xsna.s890;
import xsna.tab0;
import xsna.txj0;
import xsna.tyq;
import xsna.wyb;
import xsna.xo9;
import xsna.yfb;
import xsna.ylu0;
import xsna.yzs;
import xsna.zu50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class a implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                final FriendRequestsTabFragment friendRequestsTabFragment = (FriendRequestsTabFragment) obj4;
                final RequestUserProfile requestUserProfile = (RequestUserProfile) obj;
                int i2 = FriendRequestsTabFragment.X0;
                final boolean booleanValue = ((Boolean) obj2).booleanValue();
                final int intValue = ((Integer) obj3).intValue();
                ots otsVar = friendRequestsTabFragment.M0;
                if (!booleanValue || friendRequestsTabFragment.S0) {
                    requestUserProfile.s.putInt("friend_request_status", -2);
                } else {
                    xo9.y(requestUserProfile, true);
                }
                friendRequestsTabFragment.Mo(requestUserProfile, intValue);
                friendRequestsTabFragment.V0.b(new c0(rsg0.y0(yfb.x((!booleanValue || friendRequestsTabFragment.S0) ? otsVar.b(requestUserProfile.c, null, null, requestUserProfile.J, null) : otsVar.l(requestUserProfile.c, null, null, null, null, requestUserProfile.J, null)), null, null, 3), io.reactivex.rxjava3.internal.functions.a.d, new wyb(requestUserProfile, r5)).subscribe(new f() { // from class: xsna.qjs
                    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // io.reactivex.rxjava3.functions.f
                    public final void accept(Object obj5) {
                        FriendRequestsTabFragment friendRequestsTabFragment2 = FriendRequestsTabFragment.this;
                        ((rj70) friendRequestsTabFragment2.L0.getValue()).a(false);
                        FriendsUtils.a(1);
                        int i3 = friendRequestsTabFragment2.U0;
                        if (i3 > 0) {
                            friendRequestsTabFragment2.U0 = i3 - 1;
                        }
                        RequestUserProfile requestUserProfile2 = requestUserProfile;
                        if (requestUserProfile2.m0) {
                            FriendsUtils.Request request = FriendsUtils.Request.IN;
                        } else if (requestUserProfile2.l0) {
                            FriendsUtils.Request request2 = FriendsUtils.Request.IN;
                        } else {
                            FriendsUtils.Request request3 = FriendsUtils.Request.IN;
                        }
                        FriendsUtils.c(friendRequestsTabFragment2.U0, FriendsUtils.Request.IN);
                        boolean z = obj5 instanceof FriendsAddResponseDto;
                        boolean z2 = booleanValue;
                        if (z) {
                            if (((FriendsAddResponseDto) obj5).i() != 0) {
                                requestUserProfile2.i0 = Boolean.valueOf(z2);
                            }
                        } else if ((obj5 instanceof FriendsDeleteResponseDto) && ((FriendsDeleteResponseDto) obj5).g() != 0) {
                            requestUserProfile2.i0 = Boolean.valueOf(z2);
                        }
                        xo9.y(requestUserProfile2, false);
                        friendRequestsTabFragment2.Mo(requestUserProfile2, intValue);
                    }
                }, new f() { // from class: xsna.rjs
                    @Override // io.reactivex.rxjava3.functions.f
                    public final void accept(Object obj5) {
                        Throwable th = (Throwable) obj5;
                        int i3 = FriendRequestsTabFragment.X0;
                        RequestUserProfile requestUserProfile2 = requestUserProfile;
                        xo9.y(requestUserProfile2, false);
                        FriendRequestsTabFragment friendRequestsTabFragment2 = FriendRequestsTabFragment.this;
                        friendRequestsTabFragment2.Mo(requestUserProfile2, intValue);
                        FragmentActivity activity = friendRequestsTabFragment2.getActivity();
                        String g = j03.g(activity, th, R.string.error);
                        ikv0.a aVar = new ikv0.a(activity);
                        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_24, Integer.valueOf(R.attr.vk_ui_background_negative), (Size) null);
                        aVar.u = new ikv0.d(g, (String) null, (ikv0.d.a) null);
                        ikv0 b = aVar.b();
                        pkv0.d(b, activity, g);
                        pkv0.b(b, friendRequestsTabFragment2);
                        com.vk.metrics.eventtracking.b.a.a(th);
                    }
                }));
                break;
            case 1:
                izs izsVar = (izs) obj4;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (b.d()) {
                        b.f(-601002076, intValue2, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditScreenMviView.addServicesTitle.<anonymous> (BookingEditScreenMviView.kt:259)");
                    }
                    com.vk.core.compose.component.group.header.f a = f.a.a(d370.N(R.string.services_title, 0, aVar), null, null, null, null, null, null, null, false, aVar, 805306368, 510);
                    if (b.d()) {
                        b.f(-672921252, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-EditOutline28> (VkSdkIcons.kt:772)");
                    }
                    lg90 a2 = pg90.a(R.drawable.vk_icon_edit_outline_28, 0, aVar);
                    if (b.d()) {
                        b.e();
                    }
                    if (b.d()) {
                        b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (b.d()) {
                        b.e();
                    }
                    long j = ylu0Var.getIcon().n;
                    String N = d370.N(R.string.booking_edit_accessibility_change_services, 0, aVar);
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new s3(izsVar, 1);
                        aVar.R(x);
                    }
                    g.b(a, s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), b.d.a, null, null, GroupHeader$Right.c.a(null, GroupHeader$Right.Icon.a.a(a2, j, N, (gzs) x, null, cq.b("edit_services", null, 3), null, aVar, 100663304, 164), null, null, aVar, 13), false, aVar, Tensorflow.FRAME_WIDTH, 88);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                qcy<Object>[] qcyVarArr = DzenArticleFragment.R;
                ((DzenArticleFragment) obj4).fo().b(new cro.s((zu50) obj2, (cw50) obj, (fe0) obj3));
                break;
            case 3:
                tyq tyqVar = (tyq) obj4;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1815524767, intValue3, -1, "com.vk.design.demo.presentation.screens.feed.FeedEnhancedLinkCardScreenContent.ItemList.<anonymous>.<anonymous>.<anonymous> (FeedEnhancedLinkCardScreenContent.kt:76)");
                    }
                    tyqVar.j("Image + ActionButtonWithTitle (Contrast)", aVar2, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                tab0 tab0Var = (tab0) obj4;
                s890 s890Var = (s890) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= aVar3.J(s890Var) ? 4 : 2;
                }
                if (aVar3.t(intValue4 & 1, (intValue4 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1738007708, intValue4, -1, "com.vk.music.playlist.framework.presentation.screen.PlaylistScreenContent.<anonymous> (PlaylistScreenContent.kt:66)");
                    }
                    if (tab0Var == null) {
                        aVar3.K(1156913755);
                    } else {
                        aVar3.K(-516869530);
                        tab0Var.a(txj0.d(s200.C(q630.a.a, s890Var), 1.0f), aVar3, 0);
                    }
                    aVar3.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }
}
