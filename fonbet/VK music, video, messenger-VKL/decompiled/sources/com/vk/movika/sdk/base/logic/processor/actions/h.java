package com.vk.movika.sdk.base.logic.processor.actions;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.vk.articles.authorpage.ui.ArticleAuthorPageFragment;
import com.vk.biometric.auth.api.di.BiometricAuthComponent;
import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.BiometricsLockSettingsFragment;
import com.vk.bridges.di.BridgeComponent;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.channels.impl.comments.a;
import com.vk.clips.design.view.editor.swap.SwapItemsView;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.a;
import com.vk.clips.tool.view.viewer.feed.list.clip.ClipFeedSideControlsView;
import com.vk.clips.viewer.api.di.ClipsViewerAdapterComponent;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.view.components.button.tool.VkToolButton;
import com.vk.dto.stories.model.clickable.ClickableApp;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.onlinebooking.impl.completed.pesentation.BookingRecordCompletedScreenFragment;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.im.engine.models.attaches.MediaType;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.upload.ResumableAttachUploadInfo;
import com.vk.libvideo.api.di.VideoClipsInteractionComponent;
import com.vk.movika.sdk.base.logic.processor.actions.j;
import com.vk.photo.editor.PhotoEditorView;
import com.vk.video.ui.upload.api.router.AttachedClipsArguments;
import com.vk.webapp.fragments.BannedFragment;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.l;
import io.reactivex.rxjava3.internal.operators.maybe.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;
import xsna.arg;
import xsna.azb;
import xsna.bre;
import xsna.byg0;
import xsna.bzb0;
import xsna.c5g;
import xsna.fe0;
import xsna.fnj;
import xsna.fpf0;
import xsna.g2v;
import xsna.gzs;
import xsna.iah0;
import xsna.isc;
import xsna.k0e;
import xsna.k7m;
import xsna.kew;
import xsna.m7e;
import xsna.m7m;
import xsna.mei0;
import xsna.n0v0;
import xsna.nwy;
import xsna.o8v;
import xsna.oew;
import xsna.qcy;
import xsna.qr6;
import xsna.qyg;
import xsna.r11;
import xsna.r46;
import xsna.r4c;
import xsna.rmb;
import xsna.s3q0;
import xsna.sxb;
import xsna.u48;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v111, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v49, types: [android.os.Parcelable] */
    @Override // xsna.gzs
    public final Object invoke() {
        List singletonList;
        Parcelable parcelable;
        Object parcelable2;
        boolean z = true;
        switch (this.b) {
            case 0:
                j.a aVar = (j.a) this.c;
                return aVar.d.a(aVar.a.b);
            case 1:
                Context context = ((com.vk.photos.root.albumdetails.presentation.c) this.c).b;
                HashSet hashSet = iah0.a;
                return Integer.valueOf((fnj.c(context) || iah0.s(context)) ? 3 : 6);
            case 2:
                f fVar = (f) this.c;
                int i = ArticleAuthorPageFragment.f0;
                fVar.invoke();
                return s3q0.a;
            case 3:
                AttachedClipsArguments attachedClipsArguments = (AttachedClipsArguments) this.c;
                Integer num = attachedClipsArguments.c;
                if (num != null) {
                    return r11.b(new StringBuilder(), attachedClipsArguments.b.b, '_', num.intValue());
                }
                return null;
            case 4:
                BannedFragment bannedFragment = (BannedFragment) this.c;
                int i2 = BannedFragment.c0;
                return bannedFragment.requireArguments().getString(CommonConstant.KEY_ACCESS_TOKEN);
            case 5:
                r46 r46Var = (r46) this.c;
                r46Var.g.getClass();
                n0v0 n0v0Var = n0v0.a;
                Dialog Cb = r46Var.c.Cb();
                if (Cb == null || !Cb.Jc()) {
                    r46Var.g.getClass();
                    boolean zb = r46Var.c.f.zb();
                    singletonList = !zb ? Collections.singletonList(new o8v(MediaType.APPS)) : zb ? Collections.singletonList(new o8v(MediaType.APPS)) : EmptyList.b;
                } else {
                    singletonList = EmptyList.b;
                }
                ArrayList b = n0v0Var.b(singletonList);
                ArrayList arrayList = new ArrayList(c5g.u(b, 10));
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    arrayList.add(new sxb(r46Var.i.a((MediaType) it.next(), r46Var.c.Bb())));
                }
                return arrayList;
            case 6:
                ((fe0) this.c).a();
                return s3q0.a;
            case 7:
                qr6 qr6Var = (qr6) this.c;
                StringBuilder sb = new StringBuilder("UPLOAD_TRACE continue video uploading for attach ");
                sb.append(qr6Var.o);
                sb.append(", uploaded ");
                ResumableAttachUploadInfo resumableAttachUploadInfo = qr6Var.p;
                if (resumableAttachUploadInfo == null) {
                    resumableAttachUploadInfo = null;
                }
                sb.append(resumableAttachUploadInfo.h() / (qr6Var.p != null ? r0 : null).g());
                return sb.toString();
            case 8:
                return Long.valueOf(((mei0) this.c).d());
            case 9:
                BiometricsLockSettingsFragment biometricsLockSettingsFragment = (BiometricsLockSettingsFragment) this.c;
                int i3 = BiometricsLockSettingsFragment.Y;
                return ((BiometricAuthComponent) ((k7m) m7m.f(biometricsLockSettingsFragment)).mo408a(fpf0.a(BiometricAuthComponent.class))).Y6();
            case 10:
                BookingRecordCompletedScreenFragment bookingRecordCompletedScreenFragment = (BookingRecordCompletedScreenFragment) this.c;
                qcy<Object>[] qcyVarArr = BookingRecordCompletedScreenFragment.Q;
                Bundle requireArguments = bookingRecordCompletedScreenFragment.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("initParams", BookingScreenParams.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    ?? parcelable3 = requireArguments.getParcelable("initParams");
                    parcelable = (BookingScreenParams) (parcelable3 instanceof BookingScreenParams ? parcelable3 : null);
                }
                if (parcelable != null) {
                    return (BookingScreenParams) parcelable;
                }
                throw new IllegalStateException("Required value was null.");
            case 11:
                return (VkToolButton) ((u48) this.c).findViewById(R.id.change_privacy);
            case 12:
                CameraUIView cameraUIView = (CameraUIView) this.c;
                cameraUIView.J0(cameraUIView.y0);
                return s3q0.a;
            case 13:
                ((com.vk.channels.impl.comments.e) this.c).O(a.k.b);
                return s3q0.a;
            case 14:
                ChannelFragment channelFragment = (ChannelFragment) this.c;
                int i4 = ChannelFragment.a1;
                g2v.c().getClass();
                return new oew(new kew(new AtomicBoolean(true)), channelFragment.wo());
            case 15:
                return ((rmb) this.c).c.getContext().getString(R.string.vkim_accessibility_icon_pause);
            case 16:
                return new bzb0(((azb) this.c).b);
            case 17:
                return ((MarketComponent) ((r4c) this.c).a.a(fpf0.a(MarketComponent.class))).U1();
            case 18:
                List<ClickableSticker> list = ((ClickableStickers) this.c).d;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((ClickableSticker) it2.next()) instanceof ClickableApp) {
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 19:
                isc iscVar = (isc) this.c;
                qcy<Object>[] qcyVarArr2 = isc.t1;
                return iscVar.eo().i();
            case 20:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.c;
                int i5 = ClipFeedListFragment.a2;
                return ((VideoClipsInteractionComponent) m7m.d(clipFeedListFragment).a(fpf0.a(VideoClipsInteractionComponent.class))).V8();
            case 21:
                ClipFeedSideControlsView clipFeedSideControlsView = (ClipFeedSideControlsView) this.c;
                m7e m7eVar = ClipFeedSideControlsView.r;
                nwy nwyVar = ((ClipsViewerComponentImpl) ((k7m) m7m.c(clipFeedSideControlsView)).a(fpf0.a(ClipsViewerComponent.class))).d0;
                qcy<Object> qcyVar = ClipsViewerComponentImpl.o0[42];
                return (byg0) nwyVar.c();
            case 22:
                return (SwapItemsView) ((ViewGroup) ((k0e) this.c).h.getValue()).findViewById(R.id.swap_items_view);
            case 23:
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) this.c;
                int i6 = ClipsFavoriteFolderContentListFragment.W;
                a.InterfaceC0586a.e eVar = a.InterfaceC0586a.e.b;
                clipsFavoriteFolderContentListFragment.getClass();
                xn50.a.c(clipsFavoriteFolderContentListFragment, eVar);
                return s3q0.a;
            case 24:
                c.a aVar2 = (c.a) ((l) this.c);
                if (!aVar2.h()) {
                    aVar2.d();
                }
                return s3q0.a;
            case 25:
                ClipsOwnerSwipeFragment clipsOwnerSwipeFragment = (ClipsOwnerSwipeFragment) this.c;
                Object obj = ClipsOwnerSwipeFragment.k0;
                return ((ClipsViewerComponentImpl) clipsOwnerSwipeFragment.Q.getValue()).Of();
            case 26:
                bre breVar = (bre) this.c;
                bre.b bVar = bre.s1;
                return (ClipsViewerAdapterComponent) m7m.d(breVar).a(fpf0.a(ClipsViewerAdapterComponent.class));
            case 27:
                ((PhotoEditorView) this.c).requestApplyInsets();
                return s3q0.a;
            case 28:
                return (LinearLayout) ((arg) this.c).a.findViewById(R.id.community_address_time_table_container);
            default:
                qyg qygVar = (qyg) this.c;
                int i7 = qyg.n1;
                return ((BridgeComponent) ((k7m) m7m.f(qygVar)).a(fpf0.a(BridgeComponent.class))).p().getBrowser();
        }
    }
}
