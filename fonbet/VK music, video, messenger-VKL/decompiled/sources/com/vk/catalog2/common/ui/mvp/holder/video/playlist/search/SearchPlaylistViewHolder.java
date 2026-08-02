package com.vk.catalog2.common.ui.mvp.holder.video.playlist.search;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.k;
import androidx.compose.ui.platform.ComposeView;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.bridges.ProfileType;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.ui.core.analytics.tracking.VideoAlbumAnalyticsInfo;
import com.vk.catalog2.common.ui.core.analytics.tracking.VideoAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.d;
import com.vk.catalog2.common.ui.mvp.video.VideoCatalogAlbumBottomSheet;
import com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoCatalogAlbumBottomSheetRedesign;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.video.VideoAlbum;
import com.vk.dto.video.VideoAlbumExtendedInfo;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b25;
import xsna.b5a;
import xsna.baf0;
import xsna.bpn0;
import xsna.c5g;
import xsna.cfp0;
import xsna.e3m;
import xsna.ejf0;
import xsna.epx;
import xsna.f870;
import xsna.fxc0;
import xsna.fyd0;
import xsna.g7s0;
import xsna.gzs;
import xsna.hxh0;
import xsna.iah0;
import xsna.izs;
import xsna.jai;
import xsna.jhq;
import xsna.l7m;
import xsna.m7m;
import xsna.msy;
import xsna.mto0;
import xsna.qni0;
import xsna.s3q0;
import xsna.tni;
import xsna.u4a;
import xsna.vqs0;
import xsna.w8s0;
import xsna.wh50;
import xsna.ydt0;
import xsna.yjo;
import xsna.z260;
import xsna.z8s;
import xsna.zak0;

/* compiled from: SearchPlaylistViewHolder.kt */
/* loaded from: classes16.dex */
public final class SearchPlaylistViewHolder implements CatalogViewHolder {
    public final u4a c;
    public UIBlockVideoAlbum e;
    public Context f;
    public l7m g;
    public final Object i;
    public final Object j;
    public final g7s0 b = fxc0.B();
    public final wh50 d = k.b(null);
    public final bpn0 h = new bpn0(new z260(this, 24));

    /* compiled from: SearchPlaylistViewHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            SearchPlaylistViewHolder searchPlaylistViewHolder = (SearchPlaylistViewHolder) this.receiver;
            u4a u4aVar = searchPlaylistViewHolder.c;
            Context context = searchPlaylistViewHolder.f;
            if (context == null) {
                context = null;
            }
            Activity h = e3m.h(context);
            if (h != null) {
                b5a b5aVar = u4aVar.b.f;
                UIBlockVideoAlbum uIBlockVideoAlbum = searchPlaylistViewHolder.e;
                if (uIBlockVideoAlbum == null) {
                    uIBlockVideoAlbum = null;
                }
                b5aVar.a(new cfp0(uIBlockVideoAlbum, new VideoAlbumAnalyticsInfo(VideoAlbumAnalyticsInfo.ClickTarget.Open, null)));
                SearchStatInfoProvider searchStatInfoProvider = u4aVar.b.m;
                SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.VIDEO_PLAYLIST;
                UIBlockVideoAlbum uIBlockVideoAlbum2 = searchPlaylistViewHolder.e;
                String str = (uIBlockVideoAlbum2 == null ? null : uIBlockVideoAlbum2).y.n;
                if (str == null) {
                    if (uIBlockVideoAlbum2 == null) {
                        uIBlockVideoAlbum2 = null;
                    }
                    str = uIBlockVideoAlbum2.f;
                }
                SearchStatsLoggingInfo b = searchStatInfoProvider.b(type, str, false);
                ydt0 Y = searchPlaylistViewHolder.b.Y();
                UIBlockVideoAlbum uIBlockVideoAlbum3 = searchPlaylistViewHolder.e;
                ydt0.e(Y, h, (uIBlockVideoAlbum3 == null ? null : uIBlockVideoAlbum3).y, (uIBlockVideoAlbum3 != null ? uIBlockVideoAlbum3 : null).f, b, 8);
            }
            return s3q0.a;
        }
    }

    /* compiled from: SearchPlaylistViewHolder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VideoShareComponent value;
            ImageSize Cb;
            SearchPlaylistViewHolder searchPlaylistViewHolder = (SearchPlaylistViewHolder) this.receiver;
            u4a u4aVar = searchPlaylistViewHolder.c;
            Context context = searchPlaylistViewHolder.f;
            if (context == null) {
                context = null;
            }
            Activity h = e3m.h(context);
            if (h != null) {
                Context context2 = searchPlaylistViewHolder.f;
                if (context2 == null) {
                    context2 = null;
                }
                int a = e3m.a(R.dimen.catalog_video_album_owner_avatar_small_size, context2);
                UIBlockVideoAlbum uIBlockVideoAlbum = searchPlaylistViewHolder.e;
                if (uIBlockVideoAlbum == null) {
                    uIBlockVideoAlbum = null;
                }
                Image image = uIBlockVideoAlbum.C;
                String str = (image == null || (Cb = image.Cb(a, false, true)) == null) ? null : Cb.d.d;
                b5a b5aVar = u4aVar.b.f;
                UIBlockVideoAlbum uIBlockVideoAlbum2 = searchPlaylistViewHolder.e;
                w8s0 w8s0Var = new w8s0(b5aVar, uIBlockVideoAlbum2 == null ? null : uIBlockVideoAlbum2);
                if (uIBlockVideoAlbum2 == null) {
                    uIBlockVideoAlbum2 = null;
                }
                VideoAlbum Ab = VideoAlbum.Ab(uIBlockVideoAlbum2.y, false, null, 262143);
                Lazy<VideoShareComponent> lazy = u4aVar.b.S;
                com.vk.video.ui.share.api.b S = (lazy == null || (value = lazy.getValue()) == null) ? null : value.S();
                if (((Boolean) searchPlaylistViewHolder.j.getValue()).booleanValue()) {
                    UIBlockVideoAlbum uIBlockVideoAlbum3 = searchPlaylistViewHolder.e;
                    new VideoCatalogAlbumBottomSheetRedesign(new VideoCatalogAlbumBottomSheetRedesign.a(Ab, searchPlaylistViewHolder.a(), (uIBlockVideoAlbum3 != null ? uIBlockVideoAlbum3 : null).f, str, w8s0Var, null, S)).c(h);
                } else {
                    UIBlockVideoAlbum uIBlockVideoAlbum4 = searchPlaylistViewHolder.e;
                    VideoCatalogAlbumBottomSheet.a.a.a(h, Ab, new VideoCatalogAlbumBottomSheet.b(str), S, (uIBlockVideoAlbum4 != null ? uIBlockVideoAlbum4 : null).f, w8s0Var, null, searchPlaylistViewHolder.a());
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: SearchPlaylistViewHolder.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<String, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(String str) {
            List<VideoFile> list;
            Object obj;
            String str2 = str;
            SearchPlaylistViewHolder searchPlaylistViewHolder = (SearchPlaylistViewHolder) this.receiver;
            UIBlockVideoAlbum uIBlockVideoAlbum = searchPlaylistViewHolder.e;
            if (uIBlockVideoAlbum == null) {
                uIBlockVideoAlbum = null;
            }
            VideoAlbumExtendedInfo videoAlbumExtendedInfo = uIBlockVideoAlbum.y.t;
            if (videoAlbumExtendedInfo != null && (list = videoAlbumExtendedInfo.e) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((VideoFile) obj).a1(), str2)) {
                        break;
                    }
                }
                VideoFile videoFile = (VideoFile) obj;
                if (videoFile != null) {
                    CatalogViewType catalogViewType = CatalogViewType.VIDEO_SLIDER;
                    CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_VIDEO_VIDEOS;
                    UIBlockVideoAlbum uIBlockVideoAlbum2 = searchPlaylistViewHolder.e;
                    String str3 = (uIBlockVideoAlbum2 == null ? null : uIBlockVideoAlbum2).f;
                    if (uIBlockVideoAlbum2 == null) {
                        uIBlockVideoAlbum2 = null;
                    }
                    searchPlaylistViewHolder.c.b.f.a(new cfp0(new UIBlockVideo("dummy", catalogViewType, catalogDataType, str3, uIBlockVideoAlbum2.g, EmptyList.b, EmptySet.b, null, new UIBlockVideo.a(videoFile.getTitle(), videoFile, false, null, false, null, null, null, 32764), null, 512, null), new VideoAnalyticsInfo(VideoAnalyticsInfo.ClickTarget.Open)));
                    ydt0 Y = searchPlaylistViewHolder.b.Y();
                    Context context = searchPlaylistViewHolder.f;
                    Context context2 = context == null ? null : context;
                    UIBlockVideoAlbum uIBlockVideoAlbum3 = searchPlaylistViewHolder.e;
                    Y.k(context2, videoFile, (r43 & 4) != 0 ? null : (uIBlockVideoAlbum3 == null ? null : uIBlockVideoAlbum3).f, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : (uIBlockVideoAlbum3 != null ? uIBlockVideoAlbum3 : null).y.n, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: SearchPlaylistViewHolder.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VideoFile videoFile;
            SearchPlaylistViewHolder searchPlaylistViewHolder = (SearchPlaylistViewHolder) this.receiver;
            u4a u4aVar = searchPlaylistViewHolder.c;
            u4aVar.b.getClass();
            Context context = searchPlaylistViewHolder.f;
            if (context == null) {
                context = null;
            }
            Activity h = e3m.h(context);
            if (h != null) {
                UIBlockVideoAlbum uIBlockVideoAlbum = searchPlaylistViewHolder.e;
                if (uIBlockVideoAlbum == null) {
                    uIBlockVideoAlbum = null;
                }
                VideoAlbumExtendedInfo videoAlbumExtendedInfo = uIBlockVideoAlbum.y.t;
                if (videoAlbumExtendedInfo != null && (videoFile = videoAlbumExtendedInfo.c) != null) {
                    ydt0 Y = searchPlaylistViewHolder.b.Y();
                    UIBlockVideoAlbum uIBlockVideoAlbum2 = searchPlaylistViewHolder.e;
                    ydt0.f(Y, h, videoFile, (uIBlockVideoAlbum2 == null ? null : uIBlockVideoAlbum2).f, u4aVar.b.m.b(SchemeStat$EventItem.Type.SEARCH_AUTHOR, (uIBlockVideoAlbum2 != null ? uIBlockVideoAlbum2 : null).f, false), null, 16);
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: SearchPlaylistViewHolder.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            VideoAlbumAnalyticsInfo.ClickTarget clickTarget;
            boolean booleanValue = bool.booleanValue();
            SearchPlaylistViewHolder searchPlaylistViewHolder = (SearchPlaylistViewHolder) this.receiver;
            searchPlaylistViewHolder.getClass();
            if (booleanValue) {
                clickTarget = VideoAlbumAnalyticsInfo.ClickTarget.ExpandVideos;
            } else {
                if (booleanValue) {
                    throw new NoWhenBranchMatchedException();
                }
                clickTarget = VideoAlbumAnalyticsInfo.ClickTarget.CollapseVideos;
            }
            b5a b5aVar = searchPlaylistViewHolder.c.b.f;
            UIBlockVideoAlbum uIBlockVideoAlbum = searchPlaylistViewHolder.e;
            UIBlockVideoAlbum uIBlockVideoAlbum2 = uIBlockVideoAlbum == null ? null : uIBlockVideoAlbum;
            if (uIBlockVideoAlbum == null) {
                uIBlockVideoAlbum = null;
            }
            VideoAlbumExtendedInfo videoAlbumExtendedInfo = uIBlockVideoAlbum.y.t;
            b5aVar.a(new cfp0(uIBlockVideoAlbum2, new VideoAlbumAnalyticsInfo(clickTarget, videoAlbumExtendedInfo != null ? videoAlbumExtendedInfo.g : null)));
            return s3q0.a;
        }
    }

    public SearchPlaylistViewHolder(u4a u4aVar) {
        this.c = u4aVar;
        ejf0 ejf0Var = new ejf0(this, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i = msy.a(lazyThreadSafetyMode, ejf0Var);
        this.j = msy.a(lazyThreadSafetyMode, new fyd0(this, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007c  */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        UIBlockVideoAlbum uIBlockVideoAlbum;
        VideoAlbum videoAlbum;
        VideoAlbumExtendedInfo videoAlbumExtendedInfo;
        String str;
        yjo yjoVar;
        long millis;
        String string;
        String str2;
        ImageSize Cb;
        if ((uIBlock instanceof UIBlockVideoAlbum) && (videoAlbumExtendedInfo = (videoAlbum = (uIBlockVideoAlbum = (UIBlockVideoAlbum) uIBlock).y).t) != null) {
            this.e = uIBlockVideoAlbum;
            String str3 = videoAlbum.d;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = uIBlockVideoAlbum.B;
            if (str4 == null) {
                str4 = "";
            }
            Image image = uIBlockVideoAlbum.C;
            if (image == null || (Cb = image.Cb(iah0.a(40), true, false)) == null || (str = Cb.d.d) == null) {
                str = "";
            }
            VerifyInfo verifyInfo = uIBlockVideoAlbum.D;
            if (verifyInfo != null) {
                VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
                Context context = this.f;
                if (context == null) {
                    context = null;
                }
                baf0 f = VerifyInfoHelper.f(context, VerifyInfoHelper.ColorTheme.normal, verifyInfo);
                if (f != null) {
                    yjoVar = new yjo(f);
                    d.a aVar = new d.a(str4, str, yjoVar);
                    millis = TimeUnit.SECONDS.toMillis(videoAlbum.g);
                    if (qni0.a() - millis >= tni.l()) {
                        Context context2 = this.f;
                        if (context2 == null) {
                            context2 = null;
                        }
                        string = context2.getString(R.string.video_album_updated_right_now);
                    } else {
                        StringBuffer stringBuffer = new StringBuffer();
                        mto0.a(millis, stringBuffer, mto0.a.C3369a.g);
                        Context context3 = this.f;
                        if (context3 == null) {
                            context3 = null;
                        }
                        string = context3.getString(R.string.video_album_updated, stringBuffer);
                    }
                    d.b bVar = new d.b(str3, aVar, string);
                    List<VideoFile> list = videoAlbumExtendedInfo.e;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    for (VideoFile videoFile : list) {
                        String a1 = videoFile.a1();
                        Image image2 = videoFile.getImage();
                        String title = videoFile.getTitle();
                        String a2 = z8s.a(videoFile.getDuration());
                        String P = videoFile.P();
                        if (P == null) {
                            P = "";
                        }
                        Owner s = videoFile.s();
                        if (s == null || (str2 = s.d) == null) {
                            str2 = "";
                        }
                        VerifyInfoHelper verifyInfoHelper2 = VerifyInfoHelper.a;
                        VerifyInfo Y = videoFile.Y();
                        Context context4 = this.f;
                        if (context4 == null) {
                            context4 = null;
                        }
                        baf0 f2 = VerifyInfoHelper.f(context4, VerifyInfoHelper.ColorTheme.normal, Y);
                        arrayList.add(new d.c(a1, image2, title, a2, new d.a(P, str2, f2 != null ? new yjo(f2) : null)));
                    }
                    ((zak0) this.d).setValue(new com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.d(bVar, videoAlbum.h, f870.c(Color.parseColor(videoAlbumExtendedInfo.d)), videoAlbum.f, videoAlbumExtendedInfo.f, arrayList));
                }
            }
            yjoVar = null;
            d.a aVar2 = new d.a(str4, str, yjoVar);
            millis = TimeUnit.SECONDS.toMillis(videoAlbum.g);
            if (qni0.a() - millis >= tni.l()) {
            }
            d.b bVar2 = new d.b(str3, aVar2, string);
            List<VideoFile> list2 = videoAlbumExtendedInfo.e;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            while (r1.hasNext()) {
            }
            ((zak0) this.d).setValue(new com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.d(bVar2, videoAlbum.h, f870.c(Color.parseColor(videoAlbumExtendedInfo.d)), videoAlbum.f, videoAlbumExtendedInfo.f, arrayList2));
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean a() {
        if (((b25) this.h.getValue()).c0() == ProfileType.RELATED) {
            return true;
        }
        ((vqs0) this.i.getValue()).getClass();
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        hxh0 hxh0Var = new hxh0(new a(0, this, SearchPlaylistViewHolder.class, "openAlbum", "openAlbum()V", 0), new b(0, this, SearchPlaylistViewHolder.class, "openMenuSheet", "openMenuSheet()V", 0), new c(1, this, SearchPlaylistViewHolder.class, "openVideo", "openVideo(Ljava/lang/String;)V", 0), new d(0, this, SearchPlaylistViewHolder.class, "openAuthor", "openAuthor()V", 0), new e(1, this, SearchPlaylistViewHolder.class, "onVideosExpanded", "onVideosExpanded(Z)V", 0));
        ComposeView composeView = new ComposeView(layoutInflater.getContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f = layoutInflater.getContext();
        this.g = m7m.c(composeView);
        composeView.setContent(new jai(1824062913, new jhq(2, this, hxh0Var), true));
        return composeView;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
