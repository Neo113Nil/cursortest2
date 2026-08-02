package com.vk.voip;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.catalog2.common.ui.holders.placeholder.OnboardingBannerVh;
import com.vk.common.links.LaunchContext;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.tool.view.onboarding.VkOnboardingBanner;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.VisibleStatus;
import com.vk.ecomm.orders.impl.order.presentation.mvi.OrderAction;
import com.vk.games.model.GamesCatalogScreenTab;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.b;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.bottomsheet.about.delegate.n;
import com.vk.libvideo.design.view.autoplay.seekbar.VideoAutoPlaySeekBarView2;
import com.vk.music.player.api.helper.AudioPlayer;
import com.vk.photos.legacy.EditAlbumFragment;
import com.vk.photos.ui.album.PhotoAlbumFragment;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchGroupsCatalogRootVh;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoDescriptionClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.superapp.api.dto.app.AppsGroupsContainer;
import com.vk.superapp.api.dto.group.WebGroup;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vk.webapp.community_picker.AppsCommunityPickerFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.single.d0;
import io.reactivex.rxjava3.internal.operators.single.o;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import xsna.ap9;
import xsna.arb0;
import xsna.asu0;
import xsna.bjc;
import xsna.bl;
import xsna.bp9;
import xsna.bpn0;
import xsna.bsd0;
import xsna.cih;
import xsna.cp9;
import xsna.dp9;
import xsna.drm0;
import xsna.e43;
import xsna.epx;
import xsna.et7;
import xsna.f4m;
import xsna.fpb;
import xsna.gj30;
import xsna.gpu;
import xsna.gzs;
import xsna.h8t;
import xsna.hxu;
import xsna.iai0;
import xsna.iz8;
import xsna.izs;
import xsna.jdf0;
import xsna.jy;
import xsna.k5q;
import xsna.kat;
import xsna.khw0;
import xsna.kq;
import xsna.lei0;
import xsna.lvk0;
import xsna.m0c;
import xsna.maz;
import xsna.mtk0;
import xsna.mxj0;
import xsna.n1i;
import xsna.nbf0;
import xsna.o9t;
import xsna.oaj;
import xsna.ov2;
import xsna.ov70;
import xsna.png;
import xsna.po5;
import xsna.q6q0;
import xsna.q9t;
import xsna.qlh;
import xsna.qod0;
import xsna.qrh0;
import xsna.qt;
import xsna.qw6;
import xsna.r1r0;
import xsna.r8a0;
import xsna.rlq0;
import xsna.rsg0;
import xsna.s3q0;
import xsna.sm0;
import xsna.t7;
import xsna.t8j;
import xsna.tfx;
import xsna.u7r;
import xsna.u9t;
import xsna.ufc;
import xsna.um0;
import xsna.uud;
import xsna.v20;
import xsna.v8v;
import xsna.vg20;
import xsna.w8v;
import xsna.w920;
import xsna.wh50;
import xsna.wo60;
import xsna.wq;
import xsna.wvk0;
import xsna.wzk0;
import xsna.x7;
import xsna.x7v;
import xsna.xh5;
import xsna.xmw0;
import xsna.xn60;
import xsna.xq;
import xsna.y7;
import xsna.y8g0;
import xsna.yfb;
import xsna.yg5;
import xsna.yjt;
import xsna.yo60;
import xsna.yq1;
import xsna.yzh0;
import xsna.za;
import xsna.zm30;
import xsna.zqk0;
import xsna.zt4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e7 A[Catch: all -> 0x021f, TryCatch #0 {all -> 0x021f, blocks: (B:46:0x01cb, B:48:0x01dd, B:53:0x01e7, B:54:0x01fe, B:61:0x01f7), top: B:45:0x01cb }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0215 A[DONT_GENERATE, LOOP:1: B:55:0x0213->B:56:0x0215, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f7 A[Catch: all -> 0x021f, TryCatch #0 {all -> 0x021f, blocks: (B:46:0x01cb, B:48:0x01dd, B:53:0x01e7, B:54:0x01fe, B:61:0x01f7), top: B:45:0x01cb }] */
    /* JADX WARN: Type inference failed for: r0v96, types: [T extends com.vk.dto.attaches.Attach & xsna.ftx0, com.vk.dto.attaches.Attach] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String, xsna.zcl] */
    /* JADX WARN: Type inference failed for: r7v6, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        ?? r14;
        x k;
        yg5 yg5Var;
        VideoFile A;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        boolean z;
        gj30 gj30Var;
        int i = 24;
        int i2 = 3;
        int i3 = 4;
        int i4 = 1;
        int i5 = 0;
        switch (this.b) {
            case 0:
                png pngVar = (png) this.c;
                khw0.a aVar = (khw0.a) this.d;
                dp9 dp9Var = (dp9) pngVar.f.getValue();
                yq1 yq1Var = new yq1(i2, pngVar, aVar);
                dp9Var.getClass();
                zqk0 zqk0Var = aVar.a;
                bp9 bp9Var = dp9Var.a;
                UserId userId = new UserId(zqk0Var.b);
                boolean z2 = zqk0Var.i;
                xmw0 xmw0Var = zqk0Var.m;
                bp9.a aVar2 = bp9Var.d.get(String.valueOf(userId.b));
                if (aVar2 != null) {
                    OnlineInfo a = aVar2.a().a();
                    if (a == null) {
                        a = VisibleStatus.f;
                    }
                    Contact.LastSeenStatus b = aVar2.a().b();
                    if (aVar2.a == null && (epx.f(a, VisibleStatus.f) ? !(b == null || m0c.a(b)) : !m0c.b(a))) {
                        r14 = true;
                        int i6 = 7;
                        if (!z2 || r14 == true) {
                            k = x.k(ap9.a.a);
                        } else {
                            int i7 = 16;
                            int i8 = 11;
                            if (xmw0Var != null) {
                                vg20 vg20Var = bp9Var.b;
                                List singletonList = Collections.singletonList(Integer.valueOf(xmw0Var.b));
                                vg20Var.getClass();
                                tfx tfxVar = new tfx("messages.getContactsById", new wq(23), new xq(i));
                                tfxVar.i("contact_ids", singletonList);
                                k = new o(rsg0.w0(yfb.x(tfxVar)).l(new bl(new sm0(i3), i8)), new um0(new jy(bp9Var, 21), 9)).l(new y7(new x7(bp9Var, i7), i3)).q(asu0.a.c());
                            } else {
                                k = new o(rsg0.w0(yfb.x(r1r0.a.b(bp9Var.a, Collections.singletonList(userId), e43.l(UsersFieldsDto.FIRST_NAME_DAT, UsersFieldsDto.FIRST_NAME_NOM, UsersFieldsDto.SEX, UsersFieldsDto.CAN_CALL, UsersFieldsDto.CAN_NOT_CALL_REASON, UsersFieldsDto.ONLINE_INFO), null, null, 58))).l(new v20(new qt(i8), i6)), new ov2(new zt4(bp9Var, 6), i2)).l(new t7(new za(bp9Var, i7), i3)).q(asu0.a.c());
                            }
                        }
                        dp9Var.d.setValue(dp9Var, dp9.g[0], io.reactivex.rxjava3.kotlin.c.h(new d0(k.m(asu0.a.d()), new kq(i6), null), null, new cp9(yq1Var, dp9Var, aVar, i5), 1));
                        return s3q0.a;
                    }
                }
                r14 = false;
                int i62 = 7;
                if (z2) {
                }
                k = x.k(ap9.a.a);
                dp9Var.d.setValue(dp9Var, dp9.g[0], io.reactivex.rxjava3.kotlin.c.h(new d0(k.m(asu0.a.d()), new kq(i62), null), null, new cp9(yq1Var, dp9Var, aVar, i5), 1));
                return s3q0.a;
            case 1:
                n.a aVar3 = (n.a) this.c;
                CharSequence charSequence = (CharSequence) this.d;
                TextView textView = aVar3.o;
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                xh5 xh5Var = b.C1208b.a().c;
                if (xh5Var != null && (yg5Var = xh5Var.a) != null && (A = yg5Var.A()) != null) {
                    UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
                    if (uiTrackingScreen == null || (mobileOfficialAppsCoreNavStat$EventScreen = uiTrackingScreen.a) == null) {
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_DISCOVERY;
                    }
                    new bjc(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, Long.valueOf(A.o0()), Long.valueOf(A.I0().b), null, null, null, 56, null), new MobileOfficialAppsVideoStat$TypeVideoDescriptionClick(new MobileOfficialAppsVideoStat$TypeVideoDescriptionClick(r7, i4, r7).a()), 2)).q();
                }
                textView.setMaxLines(Integer.MAX_VALUE);
                textView.setText(charSequence);
                return s3q0.a;
            case 2:
                AccessibilityEvents accessibilityEvents = (AccessibilityEvents) this.c;
                Collection<CallMemberId> collection = (Collection) this.d;
                accessibilityEvents.c("usersStartStreaming(" + collection.size() + ')');
                accessibilityEvents.b(AccessibilityEvents.Event.STREAMING_STARTED, AccessibilityEvents.Event.STREAMING_STOPPED, collection);
                return s3q0.a;
            case 3:
                AppsCommunityPickerFragment appsCommunityPickerFragment = (AppsCommunityPickerFragment) this.c;
                AppsGroupsContainer appsGroupsContainer = (AppsGroupsContainer) this.d;
                int i9 = AppsCommunityPickerFragment.U;
                WebGroup webGroup = appsGroupsContainer.b;
                Intent intent = new Intent();
                intent.putExtra("picked_group_id", webGroup.b);
                intent.putExtra("should_send_push", false);
                appsCommunityPickerFragment.setResult(-1, intent);
                appsCommunityPickerFragment.finish();
                return s3q0.a;
            case 4:
                wh50 wh50Var = (wh50) this.c;
                float max = (Math.max(Float.intBitsToFloat((int) (((mxj0) wh50Var.getValue()).a >> 32)), Float.intBitsToFloat((int) (((mxj0) wh50Var.getValue()).a & 4294967295L))) / 2) - ((Number) ((mtk0) this.d).getValue()).floatValue();
                if (max < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    max = 0.0f;
                }
                return new ov70(Float.intBitsToFloat((int) (((mxj0) wh50Var.getValue()).a >> 32)) > Float.intBitsToFloat((int) (((mxj0) wh50Var.getValue()).a & 4294967295L)) ? (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L) : (Float.floatToRawIntBits(max) & 4294967295L) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32));
            case 5:
                ((izs) this.c).invoke(((et7.b) ((et7) this.d)).c);
                return s3q0.a;
            case 6:
                CameraUIView cameraUIView = (CameraUIView) this.c;
                uud uudVar = (uud) this.d;
                float f = CameraUIView.w1;
                iz8 Q = cameraUIView.Q(false);
                int G = ((int) cameraUIView.G(Q)) + (y8g0.a(R.dimen.story_shutter_bottom_margin) * 2) + y8g0.a(R.dimen.story_shutter_tabs_height);
                int i10 = (int) Q.d;
                int i11 = Q.b;
                int i12 = (((i11 / 2) + i10) - (i11 / 4)) - uud.j;
                int i13 = i12 - G;
                int i14 = uud.k;
                if (i13 >= i14) {
                    LinearLayout linearLayout = uudVar.b;
                    f4m.q(i12 - i14, linearLayout != null ? linearLayout : null);
                } else {
                    LinearLayout linearLayout2 = uudVar.b;
                    f4m.q(G, linearLayout2 != null ? linearLayout2 : 0);
                }
                return s3q0.a;
            case 7:
                cih cihVar = (cih) this.c;
                return new qlh(cihVar.a, cihVar.b, cihVar.c, cihVar.d, (po5) this.d, cihVar.f);
            case 8:
                ((com.vk.profile.community.impl.ui.profile.actions.e) this.c).b.m(((d.b.a) ((d.b) this.d)).a);
                return s3q0.a;
            case 9:
                ((oaj) this.c).l.w((t8j) this.d, false);
                return s3q0.a;
            case 10:
                k5q k5qVar = (k5q) this.c;
                AudioPlayer.State state = (AudioPlayer.State) this.d;
                if (k5qVar.a != null) {
                    int i15 = k5q.b.$EnumSwitchMapping$0[state.ordinal()];
                    if (i15 == 1 || i15 == 2) {
                        k5qVar.d = true;
                        if (k5qVar.f) {
                            if (!k5qVar.e || k5qVar.b > 0) {
                                k5qVar.l();
                            }
                            k5qVar.f = false;
                        }
                        k5qVar.e = false;
                    } else if (i15 != 3) {
                        if (i15 != 4 && i15 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (k5qVar.d && !k5qVar.e) {
                        k5qVar.b = SystemClock.elapsedRealtime();
                        k5qVar.f = true;
                    }
                }
                return s3q0.a;
            case 11:
                u7r u7rVar = (u7r) this.c;
                File file = (File) this.d;
                return "Rename file " + u7rVar.a + " to " + file;
            case 12:
                GamesCatalogScreenTab gamesCatalogScreenTab = (GamesCatalogScreenTab) this.c;
                izs izsVar = (izs) this.d;
                int i16 = kat.a.$EnumSwitchMapping$0[gamesCatalogScreenTab.ordinal()];
                if (i16 == 1) {
                    izsVar.invoke(q9t.b);
                } else {
                    if (i16 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    izsVar.invoke(u9t.b);
                }
                return s3q0.a;
            case 13:
                ((izs) this.c).invoke(new o9t.a((h8t) this.d));
                return s3q0.a;
            case 14:
                yjt yjtVar = (yjt) this.c;
                Exception exc = (Exception) this.d;
                return "UPLOAD_TRACE Conversion failed for attach " + yjtVar.c.xb() + ": " + exc.getMessage() + ", errorType=" + exc.getClass().getSimpleName();
            case 15:
                yzh0 yzh0Var = (yzh0) this.c;
                GlobalSearchGroupsCatalogRootVh globalSearchGroupsCatalogRootVh = (GlobalSearchGroupsCatalogRootVh) this.d;
                if (yzh0Var != null) {
                    return new qrh0(new n1i(globalSearchGroupsCatalogRootVh, 13), globalSearchGroupsCatalogRootVh.v, yzh0Var);
                }
                return null;
            case 16:
                w920 w920Var = (w920) this.c;
                List list = (List) this.d;
                ReentrantReadWriteLock reentrantReadWriteLock = w920Var.t;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i17 = 0; i17 < readHoldCount; i17++) {
                    readLock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    gj30 c = w920Var.c();
                    c.getClass();
                    gj30 gj30Var2 = new gj30(c);
                    if (!gj30Var2.isEmpty() && !gj30Var2.e) {
                        z = false;
                        if (z) {
                            x7v.a(gj30Var2, list);
                            gj30Var = gj30Var2;
                        } else {
                            gj30Var = new gj30(list, EmptySet.b, true, true, false, false);
                        }
                        w920Var.h(new gj30(gj30Var));
                        w920Var.s = true;
                        return new v8v.a(new w8v.e(gj30Var2, gj30Var, true ^ z, list));
                    }
                    z = true;
                    if (z) {
                    }
                    w920Var.h(new gj30(gj30Var));
                    w920Var.s = true;
                    return new v8v.a(new w8v.e(gj30Var2, gj30Var, true ^ z, list));
                } finally {
                    while (i5 < readHoldCount) {
                        readLock.lock();
                        i5++;
                    }
                    writeLock.unlock();
                }
            case 17:
                return Boolean.valueOf(drm0.D((CharSequence) ((bpn0) this.d).getValue(), (String) this.c, false));
            case 18:
                ((zm30) this.c).a.a(new b.o((User) this.d));
                return s3q0.a;
            case 19:
                ((wo60) this.c).a.a(new xn60.b.f(((yo60.e.d) this.d).a));
                return s3q0.a;
            case 20:
                OnboardingBannerVh onboardingBannerVh = (OnboardingBannerVh) this.c;
                fpb fpbVar = (fpb) this.d;
                if (OnboardingBannerVh.a.$EnumSwitchMapping$0[onboardingBannerVh.b.ordinal()] == 1) {
                    maz e = onboardingBannerVh.e.e();
                    VkOnboardingBanner vkOnboardingBanner = onboardingBannerVh.f;
                    maz.c(e, (vkOnboardingBanner != null ? vkOnboardingBanner : null).getContext(), "https://vkvideo.ru/landings/video_faq", new LaunchContext(false, false, true, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67106811), null, null, 24);
                    fpbVar.invoke();
                }
                return s3q0.a;
            case 21:
                ((izs) this.c).invoke(new OrderAction.e(((hxu.a) this.d).b));
                return s3q0.a;
            case 22:
                PhotoAlbum photoAlbum = (PhotoAlbum) this.c;
                PhotoAlbumFragment photoAlbumFragment = (PhotoAlbumFragment) this.d;
                int i18 = PhotoAlbumFragment.r0;
                EditAlbumFragment.b bVar = new EditAlbumFragment.b();
                bVar.j.putParcelable("album", photoAlbum);
                bVar.g(8295, photoAlbumFragment);
                return s3q0.a;
            case 23:
                qod0 qod0Var = (qod0) this.c;
                qod0Var.l.invoke((wzk0) this.d, Integer.valueOf(qod0Var.getBindingAdapterPosition()));
                return s3q0.a;
            case 24:
                jdf0 jdf0Var = (jdf0) this.c;
                gpu.a aVar4 = (gpu.a) this.d;
                nbf0 nbf0Var = jdf0Var.K;
                if (nbf0Var != null) {
                    nbf0Var.c = null;
                }
                jdf0Var.G.B0(aVar4);
                jdf0Var.E.e(148, jdf0Var.b7());
                return s3q0.a;
            case 25:
                ((iai0) this.c).l.a(new bsd0.c(((lei0) this.d).b.a));
                return s3q0.a;
            case 26:
                com.vk.clips.sdk.shared.item.static_ads.c cVar = (com.vk.clips.sdk.shared.item.static_ads.c) this.c;
                Context context = (Context) this.d;
                lvk0 lvk0Var = cVar.m;
                return new wvk0(cVar, lvk0Var.j(), lvk0Var.a(), lvk0Var.q(), new ufc(new q6q0(context, new arb0(cVar, 18)), lvk0Var.r0(new qw6(cVar, 15), new r8a0(cVar, i))));
            case 27:
                rlq0 rlq0Var = (rlq0) this.c;
                rlq0Var.d((ExtendedUserProfile) this.d);
                rlq0Var.f.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNSUBSCRIBE_OUT);
                return s3q0.a;
            default:
                Context context2 = (Context) this.c;
                VideoAutoPlaySeekBarView2 videoAutoPlaySeekBarView2 = (VideoAutoPlaySeekBarView2) this.d;
                VideoAutoPlaySeekBarView2.a aVar5 = VideoAutoPlaySeekBarView2.r;
                return new GestureDetector(context2, videoAutoPlaySeekBarView2);
        }
    }
}
