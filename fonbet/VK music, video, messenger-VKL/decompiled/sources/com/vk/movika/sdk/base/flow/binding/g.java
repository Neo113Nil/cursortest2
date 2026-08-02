package com.vk.movika.sdk.base.flow.binding;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.widget.LinearLayout;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.impl.gifts.ProfileGiftsFragment;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.impl.slider.SliderView;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.gift.GiftItem;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import com.vk.media.MediaUtils;
import com.vk.movika.sdk.base.ui.y;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.newsfeed.posting.impl.domain.model.attachment.LocalPhotoAttachment;
import com.vk.newsfeed.posting.impl.domain.model.attachment.LocalVideoAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.VideoDto;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$StickerEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem;
import com.vk.video.ui.discovery.minimizable.doc2doc.recycler.HorizontalRecyclerPaginationView;
import com.vkontakte.android.R;
import java.io.InvalidClassException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import xsna.a8a;
import xsna.ap7;
import xsna.bs;
import xsna.bzd;
import xsna.c8n;
import xsna.cne;
import xsna.cpo;
import xsna.d4h;
import xsna.df90;
import xsna.dpi;
import xsna.dw20;
import xsna.epi;
import xsna.epx;
import xsna.ewy;
import xsna.fo60;
import xsna.fq60;
import xsna.fvy;
import xsna.gne;
import xsna.gq60;
import xsna.gzs;
import xsna.h9x;
import xsna.ho60;
import xsna.i9g0;
import xsna.ix2;
import xsna.iyp;
import xsna.izs;
import xsna.jn60;
import xsna.kjw;
import xsna.ko50;
import xsna.l8c0;
import xsna.loi0;
import xsna.lvm;
import xsna.lzd;
import xsna.mat;
import xsna.mo60;
import xsna.mtk0;
import xsna.nsg;
import xsna.nzg;
import xsna.o25;
import xsna.o6a0;
import xsna.o9t;
import xsna.pk50;
import xsna.pmt0;
import xsna.qbm0;
import xsna.qcy;
import xsna.r2a;
import xsna.rs0;
import xsna.rw30;
import xsna.rye;
import xsna.s1c0;
import xsna.s200;
import xsna.s3q0;
import xsna.slq0;
import xsna.sxu;
import xsna.tho0;
import xsna.tzp0;
import xsna.u1j0;
import xsna.vo7;
import xsna.w7t;
import xsna.ww50;
import xsna.x7t;
import xsna.xuy;
import xsna.xvy;
import xsna.y2p0;
import xsna.yo60;
import xsna.yzo;
import xsna.znj0;
import xsna.zxu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v92, types: [T, android.graphics.Bitmap] */
    @Override // xsna.gzs
    public final Object invoke() {
        MeasurementManager measurementManager;
        Object obj;
        int i = this.b;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((com.vk.movika.sdk.player.base.observable.a) obj3).f((c) obj2);
                return s3q0.a;
            case 1:
                y yVar = (y) obj3;
                yVar.j = null;
                yVar.p = y.d.a(yVar.p, null, false, null, null, 55);
                ((com.vk.movika.sdk.base.ui.b) obj2).invoke();
                return s3q0.a;
            case 2:
                measurementManager = ((AndroidAttribution) obj3).getMeasurementManager((Context) obj2);
                return measurementManager;
            case 3:
                return "removeAnalyticsListener() - count= " + ((BaseVideoPlayer) obj3).o.a.size() + " listener= " + ((OneVideoPlayer.a) obj2);
            case 4:
                yzo yzoVar = (yzo) obj2;
                int i2 = vo7.a.$EnumSwitchMapping$2[((BookingEditScreenState.InfoBlock) ((mtk0) obj3).getValue()).g.ordinal()];
                if (i2 == 1) {
                    return null;
                }
                if (i2 == 2) {
                    return yzoVar.a;
                }
                throw new NoWhenBranchMatchedException();
            case 5:
                lzd.a aVar = (lzd.a) obj3;
                lzd lzdVar = (lzd) obj2;
                rye ryeVar = new rye(bzd.this.c.getCtx(), new rs0(5, aVar, lzdVar));
                aVar.c = ryeVar;
                ryeVar.o(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                rye ryeVar2 = aVar.c;
                if (ryeVar2 != null) {
                    ryeVar2.show();
                }
                return s3q0.a;
            case 6:
                gne gneVar = (gne) obj3;
                cne cneVar = (cne) obj2;
                ix2 ix2Var = gneVar.i1;
                (ix2Var != null ? ix2Var : null).invoke(cneVar);
                gneVar.dismiss();
                return s3q0.a;
            case 7:
                return Boolean.valueOf(((ArrayList) obj3).addAll((List) obj2));
            case 8:
                nzg.a.b bVar = (nzg.a.b) obj2;
                ww50 v = s200.v(((nzg) obj3).requireContext());
                if (v != null) {
                    v.H(bVar);
                }
                return s3q0.a;
            case 9:
                ((d4h) obj3).c.invoke();
                ((nsg) obj2).getClass();
                throw null;
            case 10:
                ((com.vk.profile.community.impl.ui.profile.c) obj3).f(((d.j.i0) obj2).a);
                return s3q0.a;
            case 11:
                ((iyp) obj3).a((pk50) obj2);
                return s3q0.a;
            case 12:
                rw30 rw30Var = (rw30) obj3;
                rw30Var.W0();
                rw30Var.H0();
                rw30Var.G0();
                ((lvm) obj2).w = null;
                return s3q0.a;
            case 13:
                c8n c8nVar = (c8n) obj3;
                fq60 fq60Var = (fq60) c8nVar.e.getValue();
                gq60 gq60Var = c8nVar.c;
                fq60Var.getClass();
                fq60.c((yo60.j) obj2, gq60Var);
                return s3q0.a;
            case 14:
                zxu zxuVar = (zxu) obj3;
                Context context = (Context) obj2;
                dw20.b m = new dw20.b(context, tzp0.a(null, 3)).w0(context.getString(R.string.post_author_title)).m(R.attr.vk_ui_background_content);
                LinearLayout linearLayout = zxuVar.g;
                if (linearLayout == null) {
                    linearLayout = null;
                }
                zxuVar.h = m.D0(linearLayout, false).c(new cpo(false, 0, 3)).q0(true).I0(null);
                sxu sxuVar = zxuVar.j;
                if (sxuVar != null) {
                    sxuVar.g();
                }
                return s3q0.a;
            case 15:
                ((epi) obj3).b(new dpi((UIBlockMusicPlaylist) obj2));
                return s3q0.a;
            case 16:
                ((izs) obj3).invoke(new mat.b(((ko50) obj2).b));
                return s3q0.a;
            case 17:
                mo60 mo60Var = (mo60) obj3;
                return new ho60((jn60) mo60Var.r.getValue(), (fo60) obj2, com.vk.mvi.core.internal.executors.a.b, (s1c0) mo60Var.g.getValue(), mo60Var.c.d);
            case 18:
                OnlineBookingInternalComponent onlineBookingInternalComponent = (OnlineBookingInternalComponent) obj3;
                OnlineBookingInternalComponent.a aVar2 = OnlineBookingInternalComponent.n;
                loi0 Ef = onlineBookingInternalComponent.Ef();
                ewy ewyVar = onlineBookingInternalComponent.c;
                qcy<Object> qcyVar = OnlineBookingInternalComponent.o[2];
                return new ap7(Ef, (bs) ewyVar.c(), ((AuthBridgeComponent) obj2).s());
            case 19:
                o6a0 o6a0Var = (o6a0) obj3;
                return new MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem(o6a0Var.c(), o6a0Var.b.a(), null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCorePhotoEditorStat$StickerEvent) obj2, null, null, null, null, 63480, null);
            case 20:
                ProfileGiftsFragment profileGiftsFragment = (ProfileGiftsFragment) obj3;
                GiftItem giftItem = (GiftItem) ((ProfileGiftsFragment.b) obj2).m;
                UserProfile userProfile = giftItem != null ? giftItem.f : null;
                if (userProfile == null) {
                    userProfile = o25.a().o().b();
                }
                profileGiftsFragment.Oo(userProfile, "limited_modal");
                return s3q0.a;
            case 21:
                ((izs) obj3).invoke(new o9t.m(x7t.a((w7t) obj2)));
                return s3q0.a;
            case 22:
                i9g0 i9g0Var = (i9g0) obj3;
                i9g0Var.a.b();
                i9g0Var.e = false;
                i9g0Var.c = null;
                i9g0.g(R.string.vkim_tooltip_snackbar_reset_success_title, (NavigationDelegateActivity) obj2, true);
                return s3q0.a;
            case 23:
                df90 df90Var = (df90) obj2;
                HorizontalRecyclerPaginationView a = ((znj0) obj3).h().a();
                if (a != null) {
                    a.Om(df90Var);
                }
                return s3q0.a;
            case 24:
                r2a r2aVar = (r2a) obj2;
                xvy xvyVar = ((SliderView.d) obj3).a.d;
                fvy j = xvyVar.j();
                Iterator<T> it = xvyVar.j().f().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (epx.f(((xuy) obj).getKey(), r2aVar.w())) {
                        }
                    } else {
                        obj = null;
                    }
                }
                xuy xuyVar = (xuy) obj;
                if (xuyVar != null) {
                    f = (Math.min(xuyVar.getSize() + xuyVar.getOffset(), j.h()) - Math.max(xuyVar.getOffset(), j.g())) / xuyVar.getSize();
                }
                long j2 = 0 & 4294967295L;
                return new a8a.a(f, (j.g() << 32) | j2, (j.h() << 32) | j2, null, xuyVar != null ? Integer.valueOf(xuyVar.getIndex()) : null, xuyVar != null ? new h9x((xuyVar.getOffset() << 32) | j2) : null, xvyVar.j.a(), 8);
            case 25:
                PostingAttachment postingAttachment = (PostingAttachment) obj3;
                qbm0 qbm0Var = (qbm0) obj2;
                if (!(postingAttachment instanceof VideoDto)) {
                    if (!(postingAttachment instanceof PhotoDto)) {
                        return null;
                    }
                    Attachment attachment = ((PhotoDto) postingAttachment).c;
                    if (!(attachment instanceof LocalPhotoAttachment)) {
                        throw new InvalidClassException("Failed to get local photo preview");
                    }
                    Uri f2 = ((LocalPhotoAttachment) attachment).y.ba().f();
                    LocalPhotoAttachment localPhotoAttachment = (LocalPhotoAttachment) attachment;
                    l8c0.a.getClass();
                    int i3 = l8c0.a.b;
                    return kjw.c(qbm0Var.a, f2, i3, (int) (i3 / (localPhotoAttachment.z / localPhotoAttachment.A)), true);
                }
                VideoDto videoDto = (VideoDto) postingAttachment;
                Attachment attachment2 = videoDto.c;
                VideoFile videoFile = videoDto.h;
                if (!(attachment2 instanceof LocalVideoAttachment)) {
                    throw new InvalidClassException("Failed to get local video preview");
                }
                String uri = ((LocalVideoAttachment) attachment2).p.b.k.toString();
                l8c0.a.getClass();
                int i4 = l8c0.a.b;
                MediaUtils.d dVar = new MediaUtils.d(i4, (int) (i4 / (videoFile.getWidth() / videoFile.getHeight())));
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(uri);
                    ref$ObjectRef.element = MediaUtils.a.i(0L, mediaMetadataRetriever, dVar);
                    s3q0 s3q0Var = s3q0.a;
                } catch (Exception unused) {
                } catch (Throwable th) {
                    mediaMetadataRetriever.release();
                    throw th;
                }
                mediaMetadataRetriever.release();
                return (Bitmap) ref$ObjectRef.element;
            case 26:
                ((y2p0) obj3).a.g2(((y2p0.a.d) ((y2p0.a) obj2)).a);
                return s3q0.a;
            case 27:
                ((slq0) obj3).a(new UserProfileAction.s.c.a.e(new u1j0((VkButton) obj2, 8)));
                return s3q0.a;
            case 28:
                ((izs) obj3).invoke(new pmt0((BlockId) obj2));
                return s3q0.a;
            default:
                ((izs) obj3).invoke(tho0.a((tho0) obj2, ""));
                return s3q0.a;
        }
    }
}
