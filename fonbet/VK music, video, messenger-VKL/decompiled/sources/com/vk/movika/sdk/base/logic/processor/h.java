package com.vk.movika.sdk.base.logic.processor;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.fresco.animation.bitmap.BitmapAnimationBackend;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.catalog2.feature.music.ui.holder.AudioBookPersonGenreCatalogRootVh;
import com.vk.clips.attachments.api.di.ClipsAttachmentsComponent;
import com.vk.clips.attachments.impl.views.video.ClipsVideoAttachmentPickerFragment;
import com.vk.clips.editor.aspectratio.impl.FormatAspectRatio;
import com.vk.clips.playlists.ClipsPlaylistContentLaunchParams;
import com.vk.clips.tool.view.viewer.feed.list.clip.ClipFeedSideControlsView;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.dto.stories.model.clickable.ClickablePoll;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsCatalogBaseRootVh;
import com.vk.im.engine.models.attaches.AttachWithVideo;
import com.vk.music.mix.MixSettingsComponent;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vk.narratives.impl.highlights.AllHighlightsFragment;
import com.vk.profile.community.impl.ui.profile.scheduled_clips.CommunityScheduledClipsGridFragment;
import com.vk.stat.scheme.SchemeStat$TypeQuestionItem;
import com.vk.topics.api.di.TopicsComponent;
import com.vk.topics.impl.fragments.BoardTopicViewFragment;
import com.vk.video.channel.common.di.VideoChannelComponent;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import xsna.ad0;
import xsna.azb;
import xsna.b11;
import xsna.b25;
import xsna.bre;
import xsna.c4b;
import xsna.cn70;
import xsna.dw20;
import xsna.e43;
import xsna.f2j;
import xsna.fpf0;
import xsna.go9;
import xsna.gzs;
import xsna.ixd;
import xsna.k7;
import xsna.k7m;
import xsna.kld;
import xsna.ksh;
import xsna.lw0;
import xsna.m7m;
import xsna.o84;
import xsna.osh;
import xsna.p16;
import xsna.p9k;
import xsna.qdh;
import xsna.qr6;
import xsna.qsg;
import xsna.qu3;
import xsna.rmp;
import xsna.rru;
import xsna.rwd;
import xsna.s3q0;
import xsna.sdl;
import xsna.swe0;
import xsna.tim;
import xsna.tsu;
import xsna.u1j;
import xsna.v0h;
import xsna.x6p0;
import xsna.xyb;

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
    /* JADX WARN: Type inference failed for: r0v63, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        s3q0 preloadAnimation$lambda$1;
        io.reactivex.rxjava3.disposables.c cVar;
        Parcelable parcelable;
        Object parcelable2;
        int i = this.b;
        boolean z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                return go9.b("Can not find processor for action type ", fpf0.a(((com.vk.movika.sdk.base.model.actions.a) obj).getClass()).h());
            case 1:
                com.vk.clips.sdk.shared.item.ads.c cVar2 = (com.vk.clips.sdk.shared.item.ads.c) obj;
                int i2 = cVar2.o;
                lw0 lw0Var = cVar2.g;
                lw0Var.getClass();
                return new b11(cVar2, i2, sdl.a, cVar2.B, lw0Var.e());
            case 2:
                int i3 = AllHighlightsFragment.g0;
                return ((NarrativeComponent) m7m.d((AllHighlightsFragment) obj).a(fpf0.a(NarrativeComponent.class))).n4();
            case 3:
                com.vk.profile.questions.impl.a aVar = (com.vk.profile.questions.impl.a) obj;
                int i4 = com.vk.profile.questions.impl.a.o1;
                aVar.hide();
                aVar.bo(SchemeStat$TypeQuestionItem.Type.CLOSE);
                return s3q0.a;
            case 4:
                return new com.vk.core.simplescreen.a(((o84) obj).a, false, false);
            case 5:
                ((AudioBookPersonGenreCatalogRootVh) obj).p.d();
                return s3q0.a;
            case 6:
                return "UPLOAD_TRACE getLocalFileUri: localFileUri=" + ((AttachWithVideo) ((qr6) obj).c).b5();
            case 7:
                preloadAnimation$lambda$1 = BitmapAnimationBackend.preloadAnimation$lambda$1((BitmapAnimationBackend) obj);
                return preloadAnimation$lambda$1;
            case 8:
                Pattern pattern = BoardTopicViewFragment.H0;
                return ((TopicsComponent) m7m.d((BoardTopicViewFragment) obj).a(fpf0.a(TopicsComponent.class))).fe().a();
            case 9:
                return ((MixSettingsComponent) ((k7m) m7m.f((com.vk.catalog2.common.ui.mvp.util.a) obj)).a(fpf0.a(MixSettingsComponent.class))).af();
            case 10:
                dw20 dw20Var = ((c4b) obj).d;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 11:
                tsu tsuVar = ((azb) obj).k;
                if (tsuVar != null && (cVar = ((xyb) tsuVar.b).t) != null) {
                    cVar.dispose();
                }
                return s3q0.a;
            case 12:
                return ((ClassifiedsCatalogBaseRootVh) obj).s.Y4();
            case 13:
                List<ClickableSticker> list = ((ClickableStickers) obj).d;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((ClickableSticker) it.next()) instanceof ClickablePoll) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 14:
                int i5 = ClipFeedListFragment.a2;
                return new p16((b25) ((ClipFeedListFragment) obj).Q1.getValue());
            case 15:
                return ((ClipFeedSideControlsView) obj).q;
            case 16:
                return ((CameraClipsComponent) ((k7m) m7m.f((com.vk.clips.upload.vk.impl.uploader.b) obj)).a(fpf0.a(CameraClipsComponent.class))).c4();
            case 17:
                return ((VideoChannelComponent) ((kld) obj).b.mo408a(fpf0.a(VideoChannelComponent.class))).h4();
            case 18:
                Context context = ((rwd) obj).d().getContext();
                FormatAspectRatio formatAspectRatio = FormatAspectRatio.ORIGINAL;
                ixd ixdVar = ad0.g;
                if (ixdVar == null) {
                    ixdVar = null;
                }
                ixd.b bVar = ixdVar.a;
                qu3 qu3Var = new qu3(formatAspectRatio, R.drawable.vk_icon_fullscreen_24, context.getString(R.string.clips_editor_aspect_ratio_original), true);
                FormatAspectRatio formatAspectRatio2 = FormatAspectRatio.SQUARE;
                ixd ixdVar2 = ad0.g;
                if (ixdVar2 == null) {
                    ixdVar2 = null;
                }
                ixd.b bVar2 = ixdVar2.a;
                qu3 qu3Var2 = new qu3(formatAspectRatio2, R.drawable.vk_icon_square_outline_24, context.getString(R.string.clips_editor_aspect_ratio_square), false);
                FormatAspectRatio formatAspectRatio3 = FormatAspectRatio.RATIO9x16;
                ixd ixdVar3 = ad0.g;
                if (ixdVar3 == null) {
                    ixdVar3 = null;
                }
                ixd.b bVar3 = ixdVar3.a;
                qu3 qu3Var3 = new qu3(formatAspectRatio3, R.drawable.vk_icon_vertical_rectangle_9x16_outline_24, context.getString(R.string.clips_editor_aspect_ratio_9x16), false);
                FormatAspectRatio formatAspectRatio4 = FormatAspectRatio.RATIO16x9;
                ixd ixdVar4 = ad0.g;
                if (ixdVar4 == null) {
                    ixdVar4 = null;
                }
                ixd.b bVar4 = ixdVar4.a;
                qu3 qu3Var4 = new qu3(formatAspectRatio4, R.drawable.vk_icon_horizontal_rectangle_16x9_outline_24, context.getString(R.string.clips_editor_aspect_ratio_16x9), false);
                FormatAspectRatio formatAspectRatio5 = FormatAspectRatio.RATIO4x5;
                ixd ixdVar5 = ad0.g;
                if (ixdVar5 == null) {
                    ixdVar5 = null;
                }
                ixd.b bVar5 = ixdVar5.a;
                qu3 qu3Var5 = new qu3(formatAspectRatio5, R.drawable.vk_icon_vertical_rectangle_outline_24, context.getString(R.string.clips_editor_aspect_ratio_4x5), false);
                FormatAspectRatio formatAspectRatio6 = FormatAspectRatio.RATIO3x4;
                ixd ixdVar6 = ad0.g;
                if (ixdVar6 == null) {
                    ixdVar6 = null;
                }
                ixd.b bVar6 = ixdVar6.a;
                qu3 qu3Var6 = new qu3(formatAspectRatio6, R.drawable.vk_icon_vertical_rectangle_outline_24, context.getString(R.string.clips_editor_aspect_ratio_3x4), false);
                FormatAspectRatio formatAspectRatio7 = FormatAspectRatio.RATIO4x3;
                ixd ixdVar7 = ad0.g;
                ixd.b bVar7 = (ixdVar7 != null ? ixdVar7 : null).a;
                return e43.l(qu3Var, qu3Var2, qu3Var3, qu3Var4, qu3Var5, qu3Var6, new qu3(formatAspectRatio7, R.drawable.vk_icon_horizontal_rectangle_outline_24, context.getString(R.string.clips_editor_aspect_ratio_4x3), false));
            case 19:
                bre.b bVar8 = bre.s1;
                Bundle requireArguments = ((bre) obj).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("input_params", ClipsPlaylistContentLaunchParams.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    ?? parcelable3 = requireArguments.getParcelable("input_params");
                    parcelable = (ClipsPlaylistContentLaunchParams) (parcelable3 instanceof ClipsPlaylistContentLaunchParams ? parcelable3 : null);
                }
                ClipsPlaylistContentLaunchParams clipsPlaylistContentLaunchParams = (ClipsPlaylistContentLaunchParams) parcelable;
                if (clipsPlaylistContentLaunchParams != null) {
                    return clipsPlaylistContentLaunchParams;
                }
                throw new IllegalArgumentException("You must provide input params via bundle. See ClipsPlaylistContentLaunchParams.kt");
            case 20:
                int i6 = ClipsVideoAttachmentPickerFragment.W;
                return ((ClipsAttachmentsComponent) m7m.d((ClipsVideoAttachmentPickerFragment) obj).a(fpf0.a(ClipsAttachmentsComponent.class))).Hd().a();
            case 21:
                x6p0 x6p0Var = ((rmp) obj).a;
                float c = x6p0Var.c();
                float b = x6p0Var.b();
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float f2 = swe0.f(b, c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (c != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f = swe0.f(f2 / c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                }
                return Float.valueOf(f);
            case 22:
                ((qsg) obj).k.b();
                return s3q0.a;
            case 23:
                return ((v0h.a) obj).n;
            case 24:
                ksh kshVar = (ksh) obj;
                return new osh(kshVar.a, kshVar.b, kshVar.c, kshVar.d, (qdh) kshVar.h.getValue(), kshVar.e, kshVar.f, kshVar.g);
            case 25:
                int i7 = CommunityScheduledClipsGridFragment.W;
                return Boolean.valueOf(((CommunityScheduledClipsGridFragment) obj).requireArguments().getBoolean("CommunityScheduledClipsGridFragment.force_dark_theme", true));
            case 26:
                u1j u1jVar = (u1j) obj;
                RecyclerView recyclerView = (RecyclerView) u1jVar.findViewById(R.id.session_rooms);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
                recyclerView.setItemAnimator(null);
                recyclerView.addItemDecoration(new f2j(recyclerView.getContext(), new k7(u1jVar, 12), cn70.b(6), 0, 8));
                recyclerView.setRecycledViewPool(new rru());
                recyclerView.setHasFixedSize(false);
                return recyclerView;
            case 27:
                ((io.reactivex.rxjava3.disposables.c) obj).dispose();
                return s3q0.a;
            case 28:
                ((p9k) obj).e.onError(new CancellationException());
                return s3q0.a;
            default:
                return new com.vk.im.ui.formatters.a(((tim) obj).a);
        }
    }
}
