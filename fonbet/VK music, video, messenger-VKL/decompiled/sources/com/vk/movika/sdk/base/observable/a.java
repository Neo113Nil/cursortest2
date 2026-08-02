package com.vk.movika.sdk.base.observable;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.os.Bundle;
import android.util.Size;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.c;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.market.dto.MarketGetCartResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.channels.impl.donut.ChannelDonutSupportFragment;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.ui.components.chat_profile.ProfileLinkActionChooser;
import com.vk.im.ui.components.chat_profile.a;
import com.vk.im.ui.views.settings.CheckboxSettingsView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.api.data.NewsfeedGetResponse;
import com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.features.ImFeatures;
import com.vk.voip.ui.VoipViewModelState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.aa2;
import xsna.ah;
import xsna.aog0;
import xsna.aw9;
import xsna.ayr0;
import xsna.azl;
import xsna.b2b;
import xsna.b70;
import xsna.b7k0;
import xsna.bgw;
import xsna.bij;
import xsna.bl60;
import xsna.bm9;
import xsna.bwr0;
import xsna.d4c0;
import xsna.d52;
import xsna.du;
import xsna.dw20;
import xsna.dya;
import xsna.ea6;
import xsna.edb;
import xsna.elm0;
import xsna.eno;
import xsna.epx;
import xsna.er9;
import xsna.f4z;
import xsna.f870;
import xsna.fgc;
import xsna.fjw0;
import xsna.frm0;
import xsna.fsk;
import xsna.fxc0;
import xsna.fyr0;
import xsna.gg1;
import xsna.h03;
import xsna.hb;
import xsna.hcd;
import xsna.id9;
import xsna.ik7;
import xsna.ikv0;
import xsna.it80;
import xsna.izs;
import xsna.j5g;
import xsna.k0d0;
import xsna.k6s0;
import xsna.ktb;
import xsna.kw8;
import xsna.l18;
import xsna.l5g;
import xsna.lx9;
import xsna.mat0;
import xsna.mh;
import xsna.ml1;
import xsna.mqd;
import xsna.mxj0;
import xsna.ne7;
import xsna.nk60;
import xsna.noj0;
import xsna.nzl;
import xsna.o25;
import xsna.o43;
import xsna.oe7;
import xsna.oio;
import xsna.ok1;
import xsna.ol;
import xsna.oxr0;
import xsna.p30;
import xsna.pco;
import xsna.pd9;
import xsna.pli;
import xsna.pwb;
import xsna.px9;
import xsna.q30;
import xsna.q6x;
import xsna.qbr;
import xsna.qio;
import xsna.qjg;
import xsna.r18;
import xsna.r4g0;
import xsna.r60;
import xsna.re7;
import xsna.rek0;
import xsna.rte0;
import xsna.rz2;
import xsna.s1c0;
import xsna.s3q0;
import xsna.se7;
import xsna.srr0;
import xsna.tlo0;
import xsna.tq;
import xsna.trr0;
import xsna.u18;
import xsna.v30;
import xsna.vw9;
import xsna.w43;
import xsna.wxr0;
import xsna.x50;
import xsna.x60;
import xsna.xdw;
import xsna.yk8;
import xsna.yq9;
import xsna.ysg0;
import xsna.z42;
import xsna.z4c;
import xsna.zhf0;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04a0  */
    /* JADX WARN: Type inference failed for: r0v226, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v4, types: [androidx.compose.ui.graphics.Path, androidx.compose.ui.graphics.a] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r1v64, types: [T, xsna.aa2] */
    /* JADX WARN: Type inference failed for: r3v43, types: [androidx.compose.ui.graphics.Path, androidx.compose.ui.graphics.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.util.Size, com.vk.core.view.components.button.VkButton$Appearance, xsna.ikv0$d$b] */
    /* JADX WARN: Type inference failed for: r8v13, types: [android.widget.CompoundButton] */
    /* JADX WARN: Type inference failed for: r8v14 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        io.reactivex.rxjava3.internal.operators.completable.y a;
        oe7 oe7Var;
        int i2;
        boolean z;
        yk8 yk8Var;
        oe7 oe7Var2;
        d52 b;
        er9 er9Var;
        er9.b bVar;
        float f;
        float f2;
        long d;
        ColorFilter porterDuffColorFilter;
        zxd0 zxd0Var;
        int i3 = this.b;
        int i4 = 2;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                ((com.vk.movika.sdk.base.listener.b) obj).x((com.vk.movika.sdk.base.model.f) obj2);
                return s3q0.a;
            case 1:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj2;
                bwr0 bwr0Var = (bwr0) obj;
                if (bwr0Var instanceof fyr0) {
                    fyr0 fyr0Var = (fyr0) bwr0Var;
                    VideoFile videoFile = fyr0Var.a;
                    VideoFile videoFile2 = fyr0Var.a;
                    AboutVideoItem.v vVar = (AboutVideoItem.v) linkedHashMap.get(videoFile.r1());
                    if (vVar == null) {
                        return g0.b;
                    }
                    String r1 = videoFile2.r1();
                    noj0 noj0Var = vVar.b;
                    linkedHashMap.put(r1, AboutVideoItem.v.a(vVar, new noj0(videoFile2, noj0Var.b, noj0Var.c, null), false, false, 14));
                    return io.reactivex.rxjava3.core.q.T(j5g.O0(linkedHashMap.values()));
                }
                if (bwr0Var instanceof oxr0) {
                    oxr0 oxr0Var = (oxr0) bwr0Var;
                    AboutVideoItem.v vVar2 = (AboutVideoItem.v) linkedHashMap.get(oxr0Var.a.r1());
                    if (vVar2 == null) {
                        return g0.b;
                    }
                    linkedHashMap.put(oxr0Var.a.r1(), AboutVideoItem.v.a(vVar2, null, oxr0Var.b, false, 13));
                    return io.reactivex.rxjava3.core.q.T(j5g.O0(linkedHashMap.values()));
                }
                if (!(bwr0Var instanceof ayr0)) {
                    if (!(bwr0Var instanceof wxr0)) {
                        return g0.b;
                    }
                    wxr0 wxr0Var = (wxr0) bwr0Var;
                    String str = wxr0Var.b;
                    VideoFile videoFile3 = wxr0Var.a;
                    return (epx.f(str, "videos_remove") && o25.a().a(videoFile3.I0()) && linkedHashMap.remove(videoFile3.r1()) != null) ? io.reactivex.rxjava3.core.q.T(j5g.O0(linkedHashMap.values())) : g0.b;
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    AboutVideoItem.v vVar3 = (AboutVideoItem.v) entry.getValue();
                    linkedHashMap.put(str2, AboutVideoItem.v.a(vVar3, null, false, fxc0.B().c(vVar3.b.a), 7));
                }
                return io.reactivex.rxjava3.core.q.T(j5g.O0(linkedHashMap.values()));
            case 2:
                du duVar = (du) obj;
                v30 v30Var = ((r60) obj2).a;
                if (duVar instanceof du.b) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.i, new Object[]{"Offline:ActionSynchronizerInteractorImpl", "Mark action " + ((Object) b70.c(((du.b) duVar).a.a)) + " successfully synced."});
                    }
                    du.b bVar2 = (du.b) duVar;
                    x60 x60Var = bVar2.a;
                    d4c0.a aVar = bVar2.b;
                    v30Var.getClass();
                    a = io.reactivex.rxjava3.core.a.l(new q30(v30Var, x60Var, aVar, 0)).q(v30Var.d);
                } else {
                    if (!(duVar instanceof du.a)) {
                        if (!(duVar instanceof du.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = 1;
                        L.n("Offline:ActionSynchronizerInteractorImpl", new mh(duVar, i));
                        a = v30Var.a(((du.c) duVar).a);
                        return new io.reactivex.rxjava3.internal.operators.completable.v(a.i(new com.vk.im.ui.components.dialogs_list.b(new x50(0), i)), io.reactivex.rxjava3.internal.functions.a.g);
                    }
                    du.a aVar2 = (du.a) duVar;
                    aVar2.getClass();
                    x60 x60Var2 = aVar2.a;
                    if (7 <= x60Var2.e + 1) {
                        L l2 = L.a;
                        l2.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l2, L.LogType.i, new Object[]{"Offline:ActionSynchronizerInteractorImpl", "Delete action " + ((Object) b70.c(x60Var2.a)) + " due to exceeding max number of sync attempts."});
                        }
                        a = v30Var.a(x60Var2);
                    } else {
                        L.n("Offline:ActionSynchronizerInteractorImpl", new ah(duVar, 1));
                        v30Var.getClass();
                        a = io.reactivex.rxjava3.core.a.l(new p30(v30Var, x60Var2, null, 0)).q(v30Var.d);
                    }
                }
                i = 1;
                return new io.reactivex.rxjava3.internal.operators.completable.v(a.i(new com.vk.im.ui.components.dialogs_list.b(new x50(0), i)), io.reactivex.rxjava3.internal.functions.a.g);
            case 3:
                gg1 gg1Var = (gg1) obj2;
                f4z f4zVar = gg1Var.p;
                Throwable th = (Throwable) obj;
                if (th instanceof AlbumsRepository.PermissionException) {
                    int i5 = gg1Var.o;
                    if (i5 != -15) {
                        tlo0.Companion.getClass();
                        gg1Var.Z(null, null, new tlo0.f(R.string.access_error));
                    } else {
                        ysg0.b.a(new ok1(i5, gg1Var.k));
                    }
                    f4zVar.b(i.a.a);
                } else {
                    if (th instanceof VKApiExecutionException) {
                        VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                        if (vKApiExecutionException.T() && SakFeatures.Type.NEW_GEOBLOCK_ERROR.h()) {
                            Bundle w = vKApiExecutionException.w();
                            long j = w != null ? w.getLong("owner_id") : 0L;
                            if (j != 0) {
                                f4zVar.b(new i.d(new UserId(j)));
                                s3q0 s3q0Var = s3q0.a;
                            }
                        }
                    }
                    String b2 = gg1Var.g.b(th);
                    tlo0.Companion.getClass();
                    gg1Var.Z(null, null, new tlo0.h(b2));
                }
                return s3q0.a;
            case 4:
                rz2 rz2Var = (rz2) obj2;
                nk60 nk60Var = (nk60) obj;
                com.vk.newsfeed.common.util.j jVar = new com.vk.newsfeed.common.util.j();
                NewsfeedGetResponse newsfeedGetResponse = nk60Var.a;
                String str3 = newsfeedGetResponse.j() ? rz2Var.c : rz2Var.d;
                HashMap hashMap = new HashMap();
                Iterator<NewsEntry> it = newsfeedGetResponse.iterator();
                while (it.hasNext()) {
                    NewsEntry next = it.next();
                    ArrayList arrayList = new ArrayList();
                    try {
                        com.vk.newsfeed.common.util.j.h(jVar, next, (s1c0) rz2Var.f.getValue(), "news", str3, arrayList, null, 96);
                    } catch (Throwable th2) {
                        L.i(th2);
                    }
                    hashMap.put(next, new k0d0(arrayList));
                }
                NewsfeedGetResponse newsfeedGetResponse2 = nk60Var.a;
                return new bl60(newsfeedGetResponse2, newsfeedGetResponse2.i(), newsfeedGetResponse.isSmartNews, newsfeedGetResponse.lists, hashMap, newsfeedGetResponse.reactionSets);
            case 5:
                w43 w43Var = (w43) obj2;
                if (!w43Var.f) {
                    if (w43Var.p1()) {
                        w43Var.g.b.f(fsk.O(w43Var.getStoriesContainer()));
                    }
                    elm0 elm0Var = w43Var.c;
                    if (elm0Var != null) {
                        elm0Var.finish();
                    }
                    StoryViewAction storyViewAction = StoryViewAction.CLOSE_TAP;
                    w43Var.f1(storyViewAction, new o43(0, w43Var, storyViewAction));
                }
                return s3q0.a;
            case 6:
                ((ea6.a) obj2).d.d((Throwable) obj);
                return s3q0.a;
            case 7:
                ((ik7) obj2).l.io();
                return s3q0.a;
            case 8:
                return ((BookingCalendarScreenState.TimeSlotSelector.b) ((ArrayList) obj2).get(((Integer) obj).intValue())).c.b;
            case 9:
                u18 u18Var = (u18) obj2;
                kw8 kw8Var = (kw8) obj;
                int i6 = 5;
                if (kw8Var.getDensity() * u18Var.s < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || mxj0.c(kw8Var.b.d()) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    return kw8Var.e(new ol(i6));
                }
                float f3 = 2;
                final float min = Math.min(pco.b(u18Var.s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 1.0f : (float) Math.ceil(kw8Var.getDensity() * u18Var.s), (float) Math.ceil(mxj0.c(kw8Var.b.d()) / f3));
                final float f4 = min / f3;
                final long floatToRawIntBits = (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
                final long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (kw8Var.b.d() >> 32)) - min) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (kw8Var.b.d() & 4294967295L)) - min) & 4294967295L);
                float f5 = min * f3;
                boolean z2 = f5 > mxj0.c(kw8Var.b.d());
                androidx.compose.ui.graphics.c a2 = u18Var.u.a(kw8Var.b.d(), kw8Var.b.getLayoutDirection(), kw8Var);
                if (!(a2 instanceof c.a)) {
                    if (!(a2 instanceof c.C0013c)) {
                        boolean z3 = z2;
                        if (!(a2 instanceof c.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        final yk8 yk8Var2 = u18Var.t;
                        final long j2 = z3 ? 0L : floatToRawIntBits;
                        if (z3) {
                            floatToRawIntBits2 = kw8Var.b.d();
                        }
                        final long j3 = floatToRawIntBits2;
                        final qio frm0Var = z3 ? qbr.a : new frm0(min, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30);
                        return kw8Var.e(new izs() { // from class: xsna.q18
                            @Override // xsna.izs
                            public final Object invoke(Object obj3) {
                                ggj ggjVar = (ggj) obj3;
                                ggjVar.s1();
                                oio.x1(ggjVar, yk8.this, j2, j3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, frm0Var, null, 0, 104);
                                return s3q0.a;
                            }
                        });
                    }
                    final yk8 yk8Var3 = u18Var.t;
                    aog0 aog0Var = ((c.C0013c) a2).a;
                    if (ne7.z(aog0Var)) {
                        final long j4 = aog0Var.e;
                        final frm0 frm0Var2 = new frm0(min, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30);
                        final boolean z4 = z2;
                        return kw8Var.e(new izs() { // from class: xsna.s18
                            @Override // xsna.izs
                            public final Object invoke(Object obj3) {
                                er9.b bVar3;
                                long j5;
                                ggj ggjVar = (ggj) obj3;
                                ggjVar.s1();
                                boolean z5 = z4;
                                yk8 yk8Var4 = yk8Var3;
                                long j6 = j4;
                                if (z5) {
                                    oio.r1(ggjVar, yk8Var4, 0L, 0L, j6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 246);
                                } else {
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
                                    float f6 = f4;
                                    if (intBitsToFloat < f6) {
                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (ggjVar.d() >> 32));
                                        float f7 = min;
                                        float f8 = intBitsToFloat2 - f7;
                                        float intBitsToFloat3 = Float.intBitsToFloat((int) (ggjVar.d() & 4294967295L)) - f7;
                                        er9.b a0 = ggjVar.a0();
                                        long d2 = a0.d();
                                        a0.a().e();
                                        try {
                                            a0.a.c(f7, f7, f8, intBitsToFloat3, 0);
                                            bVar3 = a0;
                                            try {
                                                oio.r1(ggjVar, yk8Var4, 0L, 0L, j6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 246);
                                                nq.b(bVar3, d2);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                j5 = d2;
                                                nq.b(bVar3, j5);
                                                throw th;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            bVar3 = a0;
                                            j5 = d2;
                                        }
                                    } else {
                                        oio.r1(ggjVar, yk8Var4, floatToRawIntBits, floatToRawIntBits2, r18.c(f6, j6), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, frm0Var2, null, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE);
                                    }
                                }
                                return s3q0.a;
                            }
                        });
                    }
                    boolean z5 = z2;
                    if (u18Var.r == null) {
                        u18Var.r = new l18(0);
                    }
                    l18 l18Var = u18Var.r;
                    androidx.compose.ui.graphics.a aVar3 = l18Var.d;
                    ?? r3 = aVar3;
                    if (aVar3 == null) {
                        androidx.compose.ui.graphics.a a3 = androidx.compose.ui.graphics.b.a();
                        l18Var.d = a3;
                        r3 = a3;
                    }
                    r3.reset();
                    r3.q(aog0Var, Path.Direction.CounterClockwise);
                    if (!z5) {
                        androidx.compose.ui.graphics.a a4 = androidx.compose.ui.graphics.b.a();
                        a4.q(new aog0(min, min, aog0Var.b() - min, aog0Var.a() - min, r18.c(min, aog0Var.e), r18.c(min, aog0Var.f), r18.c(min, aog0Var.g), r18.c(min, aog0Var.h)), Path.Direction.CounterClockwise);
                        r3.x(r3, a4, 0);
                    }
                    return kw8Var.e(new ml1(4, r3, yk8Var3));
                }
                yk8 yk8Var4 = u18Var.t;
                c.a aVar4 = (c.a) a2;
                if (z2) {
                    return kw8Var.e(new com.vk.libvideo.b(6, aVar4, yk8Var4));
                }
                if (yk8Var4 instanceof rek0) {
                    long c = l5g.c(14, ((rek0) yk8Var4).b, 1.0f);
                    if (Build.VERSION.SDK_INT >= 29) {
                        se7.b();
                        porterDuffColorFilter = re7.b(f870.H(c), z42.a(5));
                    } else {
                        porterDuffColorFilter = new PorterDuffColorFilter(f870.H(c), z42.b(5));
                    }
                    oe7Var = new oe7(c, 5, porterDuffColorFilter);
                    i2 = 1;
                } else {
                    oe7Var = null;
                    i2 = 0;
                }
                final zhf0 bounds = aVar4.a.getBounds();
                if (u18Var.r == null) {
                    u18Var.r = new l18(0);
                }
                l18 l18Var2 = u18Var.r;
                androidx.compose.ui.graphics.a aVar5 = l18Var2.d;
                ?? r12 = aVar5;
                if (aVar5 == null) {
                    androidx.compose.ui.graphics.a a5 = androidx.compose.ui.graphics.b.a();
                    l18Var2.d = a5;
                    r12 = a5;
                }
                r12.reset();
                r12.g(bounds, Path.Direction.CounterClockwise);
                r12.x(r12, aVar4.a, 0);
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                float f6 = bounds.c;
                float f7 = bounds.b;
                float f8 = bounds.a;
                final long ceil = (((int) Math.ceil(f6 - f8)) << 32) | (((int) Math.ceil(bounds.d - f7)) & 4294967295L);
                l18 l18Var3 = u18Var.r;
                aa2 aa2Var = l18Var3.a;
                d52 d52Var = l18Var3.b;
                bgw bgwVar = aa2Var != null ? new bgw(aa2Var.a()) : null;
                try {
                    try {
                        if (bgwVar == null || bgwVar.a != 0) {
                            bgw bgwVar2 = aa2Var != null ? new bgw(aa2Var.a()) : null;
                            if (bgwVar2 == null || i2 != bgwVar2.a) {
                                z = false;
                                if (aa2Var != null) {
                                    Bitmap bitmap = aa2Var.a;
                                    if (d52Var != null) {
                                        yk8Var = yk8Var4;
                                        if (Float.intBitsToFloat((int) (kw8Var.b.d() >> 32)) <= bitmap.getWidth() && Float.intBitsToFloat((int) (kw8Var.b.d() & 4294967295L)) <= bitmap.getHeight() && z) {
                                            b = d52Var;
                                            oe7Var2 = oe7Var;
                                            er9Var = l18Var3.c;
                                            if (er9Var == null) {
                                                er9Var = new er9();
                                                l18Var3.c = er9Var;
                                            }
                                            bVar = er9Var.c;
                                            er9.a aVar6 = er9Var.b;
                                            long w2 = pli.w(ceil);
                                            LayoutDirection layoutDirection = kw8Var.b.getLayoutDirection();
                                            er9 er9Var2 = er9Var;
                                            azl azlVar = aVar6.a;
                                            LayoutDirection layoutDirection2 = aVar6.b;
                                            Path path = r12;
                                            yq9 yq9Var = aVar6.c;
                                            final oe7 oe7Var3 = oe7Var2;
                                            yk8 yk8Var5 = yk8Var;
                                            long j5 = aVar6.d;
                                            aVar6.a = kw8Var;
                                            aVar6.b = layoutDirection;
                                            aVar6.c = b;
                                            aVar6.d = w2;
                                            b.e();
                                            oio.P(er9Var2, l5g.b, 0L, w2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 58);
                                            f = -f8;
                                            f2 = -f7;
                                            bVar.a.l(f, f2);
                                            oio.u1(er9Var2, aVar4.a, yk8Var5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new frm0(f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30), null, 52);
                                            d52 d52Var2 = b;
                                            float f9 = 1;
                                            float intBitsToFloat = (Float.intBitsToFloat((int) (er9Var2.d() >> 32)) + f9) / Float.intBitsToFloat((int) (er9Var2.d() >> 32));
                                            ?? r13 = aa2Var;
                                            float intBitsToFloat2 = (Float.intBitsToFloat((int) (er9Var2.d() & 4294967295L)) + f9) / Float.intBitsToFloat((int) (er9Var2.d() & 4294967295L));
                                            long n1 = er9Var2.n1();
                                            d = bVar.d();
                                            bVar.a().e();
                                            bVar.a.i(n1, intBitsToFloat, intBitsToFloat2);
                                            oio.u1(er9Var2, path, yk8Var5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 28);
                                            bVar.a.l(-f, -f2);
                                            d52Var2.a();
                                            aVar6.a = azlVar;
                                            aVar6.b = layoutDirection2;
                                            aVar6.c = yq9Var;
                                            aVar6.d = j5;
                                            r13.b();
                                            ref$ObjectRef.element = r13;
                                            return kw8Var.e(new izs() { // from class: xsna.t18
                                                @Override // xsna.izs
                                                public final Object invoke(Object obj3) {
                                                    float f10;
                                                    Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                                                    long j6 = ceil;
                                                    d6g d6gVar = oe7Var3;
                                                    ggj ggjVar = (ggj) obj3;
                                                    ggjVar.s1();
                                                    zhf0 zhf0Var = zhf0.this;
                                                    float f11 = zhf0Var.a;
                                                    float f12 = zhf0Var.b;
                                                    ggjVar.a0().a.l(f11, f12);
                                                    try {
                                                        f10 = f11;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        f10 = f11;
                                                    }
                                                    try {
                                                        oio.B0(ggjVar, (agw) ref$ObjectRef2.element, 0L, j6, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, d6gVar, 0, 0, 890);
                                                        ggjVar.a0().a.l(-f10, -f12);
                                                        return s3q0.a;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        f12 = f12;
                                                        ggjVar.a0().a.l(-f10, -f12);
                                                        throw th;
                                                    }
                                                }
                                            });
                                        }
                                        oe7Var2 = oe7Var;
                                        aa2Var = q6x.n((int) (ceil >> 32), (int) (ceil & 4294967295L), i2);
                                        l18Var3.a = aa2Var;
                                        b = rte0.b(aa2Var);
                                        l18Var3.b = b;
                                        er9Var = l18Var3.c;
                                        if (er9Var == null) {
                                        }
                                        bVar = er9Var.c;
                                        er9.a aVar62 = er9Var.b;
                                        long w22 = pli.w(ceil);
                                        LayoutDirection layoutDirection3 = kw8Var.b.getLayoutDirection();
                                        er9 er9Var22 = er9Var;
                                        azl azlVar2 = aVar62.a;
                                        LayoutDirection layoutDirection22 = aVar62.b;
                                        Path path2 = r12;
                                        yq9 yq9Var2 = aVar62.c;
                                        final oe7 oe7Var32 = oe7Var2;
                                        yk8 yk8Var52 = yk8Var;
                                        long j52 = aVar62.d;
                                        aVar62.a = kw8Var;
                                        aVar62.b = layoutDirection3;
                                        aVar62.c = b;
                                        aVar62.d = w22;
                                        b.e();
                                        oio.P(er9Var22, l5g.b, 0L, w22, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 58);
                                        f = -f8;
                                        f2 = -f7;
                                        bVar.a.l(f, f2);
                                        oio.u1(er9Var22, aVar4.a, yk8Var52, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new frm0(f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30), null, 52);
                                        d52 d52Var22 = b;
                                        float f92 = 1;
                                        float intBitsToFloat3 = (Float.intBitsToFloat((int) (er9Var22.d() >> 32)) + f92) / Float.intBitsToFloat((int) (er9Var22.d() >> 32));
                                        ?? r132 = aa2Var;
                                        float intBitsToFloat22 = (Float.intBitsToFloat((int) (er9Var22.d() & 4294967295L)) + f92) / Float.intBitsToFloat((int) (er9Var22.d() & 4294967295L));
                                        long n12 = er9Var22.n1();
                                        d = bVar.d();
                                        bVar.a().e();
                                        bVar.a.i(n12, intBitsToFloat3, intBitsToFloat22);
                                        oio.u1(er9Var22, path2, yk8Var52, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 28);
                                        bVar.a.l(-f, -f2);
                                        d52Var22.a();
                                        aVar62.a = azlVar2;
                                        aVar62.b = layoutDirection22;
                                        aVar62.c = yq9Var2;
                                        aVar62.d = j52;
                                        r132.b();
                                        ref$ObjectRef.element = r132;
                                        return kw8Var.e(new izs() { // from class: xsna.t18
                                            @Override // xsna.izs
                                            public final Object invoke(Object obj3) {
                                                float f10;
                                                Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                                                long j6 = ceil;
                                                d6g d6gVar = oe7Var32;
                                                ggj ggjVar = (ggj) obj3;
                                                ggjVar.s1();
                                                zhf0 zhf0Var = zhf0.this;
                                                float f11 = zhf0Var.a;
                                                float f12 = zhf0Var.b;
                                                ggjVar.a0().a.l(f11, f12);
                                                try {
                                                    f10 = f11;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    f10 = f11;
                                                }
                                                try {
                                                    oio.B0(ggjVar, (agw) ref$ObjectRef2.element, 0L, j6, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, d6gVar, 0, 0, 890);
                                                    ggjVar.a0().a.l(-f10, -f12);
                                                    return s3q0.a;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    f12 = f12;
                                                    ggjVar.a0().a.l(-f10, -f12);
                                                    throw th;
                                                }
                                            }
                                        });
                                    }
                                }
                                yk8Var = yk8Var4;
                                oe7Var2 = oe7Var;
                                aa2Var = q6x.n((int) (ceil >> 32), (int) (ceil & 4294967295L), i2);
                                l18Var3.a = aa2Var;
                                b = rte0.b(aa2Var);
                                l18Var3.b = b;
                                er9Var = l18Var3.c;
                                if (er9Var == null) {
                                }
                                bVar = er9Var.c;
                                er9.a aVar622 = er9Var.b;
                                long w222 = pli.w(ceil);
                                LayoutDirection layoutDirection32 = kw8Var.b.getLayoutDirection();
                                er9 er9Var222 = er9Var;
                                azl azlVar22 = aVar622.a;
                                LayoutDirection layoutDirection222 = aVar622.b;
                                Path path22 = r12;
                                yq9 yq9Var22 = aVar622.c;
                                final oe7 oe7Var322 = oe7Var2;
                                yk8 yk8Var522 = yk8Var;
                                long j522 = aVar622.d;
                                aVar622.a = kw8Var;
                                aVar622.b = layoutDirection32;
                                aVar622.c = b;
                                aVar622.d = w222;
                                b.e();
                                oio.P(er9Var222, l5g.b, 0L, w222, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 58);
                                f = -f8;
                                f2 = -f7;
                                bVar.a.l(f, f2);
                                oio.u1(er9Var222, aVar4.a, yk8Var522, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new frm0(f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30), null, 52);
                                d52 d52Var222 = b;
                                float f922 = 1;
                                float intBitsToFloat32 = (Float.intBitsToFloat((int) (er9Var222.d() >> 32)) + f922) / Float.intBitsToFloat((int) (er9Var222.d() >> 32));
                                ?? r1322 = aa2Var;
                                float intBitsToFloat222 = (Float.intBitsToFloat((int) (er9Var222.d() & 4294967295L)) + f922) / Float.intBitsToFloat((int) (er9Var222.d() & 4294967295L));
                                long n122 = er9Var222.n1();
                                d = bVar.d();
                                bVar.a().e();
                                bVar.a.i(n122, intBitsToFloat32, intBitsToFloat222);
                                oio.u1(er9Var222, path22, yk8Var522, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 28);
                                bVar.a.l(-f, -f2);
                                d52Var222.a();
                                aVar622.a = azlVar22;
                                aVar622.b = layoutDirection222;
                                aVar622.c = yq9Var22;
                                aVar622.d = j522;
                                r1322.b();
                                ref$ObjectRef.element = r1322;
                                return kw8Var.e(new izs() { // from class: xsna.t18
                                    @Override // xsna.izs
                                    public final Object invoke(Object obj3) {
                                        float f10;
                                        Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                                        long j6 = ceil;
                                        d6g d6gVar = oe7Var322;
                                        ggj ggjVar = (ggj) obj3;
                                        ggjVar.s1();
                                        zhf0 zhf0Var = zhf0.this;
                                        float f11 = zhf0Var.a;
                                        float f12 = zhf0Var.b;
                                        ggjVar.a0().a.l(f11, f12);
                                        try {
                                            f10 = f11;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            f10 = f11;
                                        }
                                        try {
                                            oio.B0(ggjVar, (agw) ref$ObjectRef2.element, 0L, j6, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, d6gVar, 0, 0, 890);
                                            ggjVar.a0().a.l(-f10, -f12);
                                            return s3q0.a;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            f12 = f12;
                                            ggjVar.a0().a.l(-f10, -f12);
                                            throw th;
                                        }
                                    }
                                });
                            }
                        }
                        bVar.a.i(n122, intBitsToFloat32, intBitsToFloat222);
                        oio.u1(er9Var222, path22, yk8Var522, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 28);
                        bVar.a.l(-f, -f2);
                        d52Var222.a();
                        aVar622.a = azlVar22;
                        aVar622.b = layoutDirection222;
                        aVar622.c = yq9Var22;
                        aVar622.d = j522;
                        r1322.b();
                        ref$ObjectRef.element = r1322;
                        return kw8Var.e(new izs() { // from class: xsna.t18
                            @Override // xsna.izs
                            public final Object invoke(Object obj3) {
                                float f10;
                                Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                                long j6 = ceil;
                                d6g d6gVar = oe7Var322;
                                ggj ggjVar = (ggj) obj3;
                                ggjVar.s1();
                                zhf0 zhf0Var = zhf0.this;
                                float f11 = zhf0Var.a;
                                float f12 = zhf0Var.b;
                                ggjVar.a0().a.l(f11, f12);
                                try {
                                    f10 = f11;
                                } catch (Throwable th3) {
                                    th = th3;
                                    f10 = f11;
                                }
                                try {
                                    oio.B0(ggjVar, (agw) ref$ObjectRef2.element, 0L, j6, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, d6gVar, 0, 0, 890);
                                    ggjVar.a0().a.l(-f10, -f12);
                                    return s3q0.a;
                                } catch (Throwable th4) {
                                    th = th4;
                                    f12 = f12;
                                    ggjVar.a0().a.l(-f10, -f12);
                                    throw th;
                                }
                            }
                        });
                    } finally {
                        bVar.a().a();
                        bVar.h(d);
                    }
                    oio.u1(er9Var222, aVar4.a, yk8Var522, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new frm0(f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30), null, 52);
                    d52 d52Var2222 = b;
                    float f9222 = 1;
                    float intBitsToFloat322 = (Float.intBitsToFloat((int) (er9Var222.d() >> 32)) + f9222) / Float.intBitsToFloat((int) (er9Var222.d() >> 32));
                    ?? r13222 = aa2Var;
                    float intBitsToFloat2222 = (Float.intBitsToFloat((int) (er9Var222.d() & 4294967295L)) + f9222) / Float.intBitsToFloat((int) (er9Var222.d() & 4294967295L));
                    long n1222 = er9Var222.n1();
                    d = bVar.d();
                    bVar.a().e();
                } catch (Throwable th3) {
                    bVar.a.l(-f, -f2);
                    throw th3;
                }
                z = true;
                if (aa2Var != null) {
                }
                yk8Var = yk8Var4;
                oe7Var2 = oe7Var;
                aa2Var = q6x.n((int) (ceil >> 32), (int) (ceil & 4294967295L), i2);
                l18Var3.a = aa2Var;
                b = rte0.b(aa2Var);
                l18Var3.b = b;
                er9Var = l18Var3.c;
                if (er9Var == null) {
                }
                bVar = er9Var.c;
                er9.a aVar6222 = er9Var.b;
                long w2222 = pli.w(ceil);
                LayoutDirection layoutDirection322 = kw8Var.b.getLayoutDirection();
                er9 er9Var2222 = er9Var;
                azl azlVar222 = aVar6222.a;
                LayoutDirection layoutDirection2222 = aVar6222.b;
                Path path222 = r12;
                yq9 yq9Var222 = aVar6222.c;
                final oe7 oe7Var3222 = oe7Var2;
                yk8 yk8Var5222 = yk8Var;
                long j5222 = aVar6222.d;
                aVar6222.a = kw8Var;
                aVar6222.b = layoutDirection322;
                aVar6222.c = b;
                aVar6222.d = w2222;
                b.e();
                oio.P(er9Var2222, l5g.b, 0L, w2222, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 58);
                f = -f8;
                f2 = -f7;
                bVar.a.l(f, f2);
                break;
            case 10:
                BottomSheetCommentsFragment bottomSheetCommentsFragment = (BottomSheetCommentsFragment) obj2;
                nzl.a aVar7 = BottomSheetCommentsFragment.f1;
                k6s0 Y4 = bottomSheetCommentsFragment.Ro().Y4();
                if (Y4 != null) {
                    Y4.e();
                }
                bottomSheetCommentsFragment.a0();
                return s3q0.a;
            case 11:
                ((com.vk.voip.ui.settings.participants_view.c) obj2).a((com.vk.voip.ui.settings.participants_view.j) obj);
                return s3q0.a;
            case 12:
                id9 id9Var = (id9) obj2;
                pd9 pd9Var = id9Var.a;
                fjw0 fjw0Var = (fjw0) obj;
                if (fjw0Var.a == VoipViewModelState.InCall) {
                    id9Var.b(pd9Var.a.a());
                }
                VoipViewModelState voipViewModelState = fjw0Var.a;
                voipViewModelState.getClass();
                if (voipViewModelState == VoipViewModelState.FinishedTransient || voipViewModelState == VoipViewModelState.DeclinedTransient) {
                    id9Var.b(pd9Var.a.a());
                }
                return s3q0.a;
            case 13:
                r4g0 r4g0Var = (r4g0) obj2;
                r4g0Var.getVideo().setVideoRawData((mat0) ((it80) obj).a);
                r4g0Var.setLoadingVisible(false);
                r4g0Var.getVideo().setShowOnlyFirstFrame(false);
                r4g0Var.v.set(true);
                CopyOnWriteArrayList<bij.a> copyOnWriteArrayList = r4g0Var.w;
                Iterator<bij.a> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().invoke();
                }
                copyOnWriteArrayList.clear();
                return s3q0.a;
            case 14:
                float f10 = CameraUIView.w1;
                bm9 presenter = ((CameraUIView) obj2).getPresenter();
                if (presenter != null) {
                    presenter.k4();
                }
                return s3q0.a;
            case 15:
                vw9 vw9Var = (vw9) obj2;
                vw9Var.T(px9.a.C3534a.b);
                vw9Var.g.b(new lx9.l(new b7k0.a(tq.h(tlo0.Companion, h03.a((Throwable) obj) ? R.string.ecomm_cart_open_checkout_internet_error : R.string.ecomm_cart_open_checkout_error))));
                return s3q0.a;
            case 16:
                return eno.c((UserId) obj2, ((MarketGetCartResponseDto) obj).d());
            case 17:
                dya dyaVar = (dya) obj;
                com.vk.channels.impl.donut.b bVar3 = ((ChannelDonutSupportFragment) obj2).T;
                if (bVar3 != null) {
                    if (!(dyaVar instanceof dya.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context context = bVar3.a;
                    if (bVar3.c == null) {
                        ikv0.a aVar8 = new ikv0.a(context);
                        aVar8.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_background_negative), (Size) r8, 12);
                        aVar8.u = new ikv0.d(new ikv0.d.c(context.getString(R.string.vkim_channels_monetization_error_title)), (ikv0.d.b) r8, new ikv0.d.a(context.getString(R.string.vkim_network_error_retry), r8, new hb(bVar3, 18), Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), i4);
                        aVar8.i = FloatingViewGesturesHelper.SwipeDirection.None;
                        aVar8.e = -1L;
                        aVar8.h = new c(bVar3, 20);
                        bVar3.c = aVar8.n();
                    }
                }
                return s3q0.a;
            case 18:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i7 = ChannelFragment.a1;
                ((Ref$BooleanRef) obj2).element = booleanValue;
                return s3q0.a;
            case 19:
                ((b2b) obj2).e.d(R.string.vkim_channels_cannot_delete_message);
                return s3q0.a;
            case 20:
                ((edb) obj2).a.onNext((Integer) obj);
                return s3q0.a;
            case 21:
                ((ktb) obj2).i.Le((Throwable) obj);
                return s3q0.a;
            case 22:
                pwb pwbVar = (pwb) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                xdw xdwVar = pwbVar.k;
                pwb.a aVar9 = pwbVar.l;
                ImFeatures imFeatures = ImFeatures.IM_CHAT_PROFILE_MEMBERS_COMPONENT_REDESIGN;
                imFeatures.getClass();
                int i8 = com.vk.toggle.b.A.a(imFeatures) ? R.layout.vkim_chat_members_item_with_actions_v2 : R.layout.vkim_chat_members_item_with_actions;
                xdwVar.getClass();
                ImFeatures imFeatures2 = ImFeatures.IM_CHAT_PROFILE_MEMBERS_COMPONENT_REDESIGN;
                imFeatures2.getClass();
                return com.vk.toggle.b.A.a(imFeatures2) ? new trr0(aVar9, viewGroup, i8) : new srr0(aVar9, viewGroup, i8);
            case 23:
                com.vk.im.ui.components.chat_profile.a aVar10 = (com.vk.im.ui.components.chat_profile.a) obj2;
                int i9 = a.C1143a.$EnumSwitchMapping$3[((ProfileLinkActionChooser.LinkAction) obj).ordinal()];
                if (i9 == 1) {
                    zxd0Var = zxd0.s.a.a;
                } else {
                    if (i9 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zxd0Var = zxd0.s.b.a;
                }
                aVar10.t(zxd0Var);
                return s3q0.a;
            case 24:
                CheckBox checkBox = ((CheckboxSettingsView) obj2).d;
                (checkBox == null ? null : checkBox).setChecked(!(checkBox != null ? checkBox : 0).isChecked());
                return s3q0.a;
            case 25:
                ((z4c) obj2).T(new aw9.c.a((Throwable) obj));
                return s3q0.a;
            case 26:
                fgc fgcVar = (fgc) obj2;
                dw20 dw20Var = fgcVar.a.c;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                fgcVar.b.d.invoke();
                return s3q0.a;
            case 27:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) obj2;
                int i10 = ClipFeedListFragment.a2;
                StringBuilder sb = new StringBuilder("clipsFeedListFragment success  showAsDialog = ");
                sb.append(clipFeedListFragment.o);
                sb.append(" activity = ");
                FragmentActivity activity = clipFeedListFragment.getActivity();
                sb.append(activity != null ? qjg.a(activity) : null);
                L.e("TemplateFlow", sb.toString());
                if (!clipFeedListFragment.o) {
                    clipFeedListFragment.vo().finish();
                }
                return s3q0.a;
            case 28:
                ((VkImageSimple) ((hcd.a) obj2).b.getValue()).setImageDrawable(null);
                return s3q0.a;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                FrameLayout frameLayout = ((mqd) obj2).D;
                if (frameLayout != null) {
                    frameLayout.setVisibility(booleanValue2 ? 0 : 8);
                }
                return s3q0.a;
        }
    }
}
