package com.vk.catalog2.common.ui.holders.video;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.style.VerticalVideoCatalogViewStyle;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.subjects.b;
import java.util.HashSet;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.fnj;
import xsna.iah0;
import xsna.shy;
import xsna.zrp;

/* compiled from: VideoItemListSettings.kt */
/* loaded from: classes16.dex */
public final class VideoItemListSettings {
    public static final VideoItemListSettings i;
    public static final VideoItemListSettings j;
    public static final VideoItemListSettings k;
    public static final VideoItemListSettings l;
    public static final VideoItemListSettings m;
    public static final VideoItemListSettings n;
    public static final VideoItemListSettings o;
    public static final VideoItemListSettings p;
    public static final VideoItemListSettings q;
    public static final VideoItemListSettings r;
    public static final VideoItemListSettings s;
    public final int a;
    public final int b;
    public final float c;
    public final InfoViewType d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final CornerType h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoItemListSettings.kt */
    public static final class CornerType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CornerType[] $VALUES;
        public static final CornerType LARGE;
        public static final CornerType NONE;
        public static final CornerType NORMAL;
        private final float radius;

        static {
            CornerType cornerType = new CornerType("NONE", 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            NONE = cornerType;
            CornerType cornerType2 = new CornerType("NORMAL", 1, iah0.b(8.0f));
            NORMAL = cornerType2;
            CornerType cornerType3 = new CornerType("LARGE", 2, iah0.b(12.0f));
            LARGE = cornerType3;
            CornerType[] cornerTypeArr = {cornerType, cornerType2, cornerType3};
            $VALUES = cornerTypeArr;
            $ENTRIES = new asp(cornerTypeArr);
        }

        public CornerType(String str, int i, float f) {
            this.radius = f;
        }

        public static CornerType valueOf(String str) {
            return (CornerType) Enum.valueOf(CornerType.class, str);
        }

        public static CornerType[] values() {
            return (CornerType[]) $VALUES.clone();
        }

        public final float h() {
            return this.radius;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoItemListSettings.kt */
    public static final class InfoViewType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InfoViewType[] $VALUES;
        public static final InfoViewType BottomInfoView;
        public static final InfoViewType BottomInfoViewTablet;
        public static final InfoViewType ClearView;
        public static final InfoViewType ClipFullDescPubAuthor;
        public static final InfoViewType ClipFullDescViews;
        public static final InfoViewType ClipFullDescViewsAuthor;
        public static final InfoViewType ClipFullplay;
        public static final InfoViewType ClipTeaser;
        public static final InfoViewType ClipTeaserDescPubAuthor;
        public static final InfoViewType ClipTeaserDescViews;
        public static final InfoViewType ClipTeaserDescViewsAuthor;
        public static final InfoViewType ClipViewsCountView;
        public static final InfoViewType FullBottomInfoView;
        public static final InfoViewType FullInnerInfo;
        public static final InfoViewType InnerAuthorView;
        public static final InfoViewType InnerLikeableView;
        public static final InfoViewType MusicTemplateInfoView;
        public static final InfoViewType MusicTrendTemplateInfoView;

        static {
            InfoViewType infoViewType = new InfoViewType("BottomInfoView", 0);
            BottomInfoView = infoViewType;
            InfoViewType infoViewType2 = new InfoViewType("BottomInfoViewTablet", 1);
            BottomInfoViewTablet = infoViewType2;
            InfoViewType infoViewType3 = new InfoViewType("InnerAuthorView", 2);
            InnerAuthorView = infoViewType3;
            InfoViewType infoViewType4 = new InfoViewType("ClearView", 3);
            ClearView = infoViewType4;
            InfoViewType infoViewType5 = new InfoViewType("InnerLikeableView", 4);
            InnerLikeableView = infoViewType5;
            InfoViewType infoViewType6 = new InfoViewType("ClipViewsCountView", 5);
            ClipViewsCountView = infoViewType6;
            InfoViewType infoViewType7 = new InfoViewType("MusicTemplateInfoView", 6);
            MusicTemplateInfoView = infoViewType7;
            InfoViewType infoViewType8 = new InfoViewType("MusicTrendTemplateInfoView", 7);
            MusicTrendTemplateInfoView = infoViewType8;
            InfoViewType infoViewType9 = new InfoViewType("FullInnerInfo", 8);
            FullInnerInfo = infoViewType9;
            InfoViewType infoViewType10 = new InfoViewType("FullBottomInfoView", 9);
            FullBottomInfoView = infoViewType10;
            InfoViewType infoViewType11 = new InfoViewType("ClipFullplay", 10);
            ClipFullplay = infoViewType11;
            InfoViewType infoViewType12 = new InfoViewType("ClipFullDescViews", 11);
            ClipFullDescViews = infoViewType12;
            InfoViewType infoViewType13 = new InfoViewType("ClipFullDescViewsAuthor", 12);
            ClipFullDescViewsAuthor = infoViewType13;
            InfoViewType infoViewType14 = new InfoViewType("ClipFullDescPubAuthor", 13);
            ClipFullDescPubAuthor = infoViewType14;
            InfoViewType infoViewType15 = new InfoViewType("ClipTeaser", 14);
            ClipTeaser = infoViewType15;
            InfoViewType infoViewType16 = new InfoViewType("ClipTeaserDescViews", 15);
            ClipTeaserDescViews = infoViewType16;
            InfoViewType infoViewType17 = new InfoViewType("ClipTeaserDescViewsAuthor", 16);
            ClipTeaserDescViewsAuthor = infoViewType17;
            InfoViewType infoViewType18 = new InfoViewType("ClipTeaserDescPubAuthor", 17);
            ClipTeaserDescPubAuthor = infoViewType18;
            InfoViewType[] infoViewTypeArr = {infoViewType, infoViewType2, infoViewType3, infoViewType4, infoViewType5, infoViewType6, infoViewType7, infoViewType8, infoViewType9, infoViewType10, infoViewType11, infoViewType12, infoViewType13, infoViewType14, infoViewType15, infoViewType16, infoViewType17, infoViewType18};
            $VALUES = infoViewTypeArr;
            $ENTRIES = new asp(infoViewTypeArr);
        }

        public InfoViewType() {
            throw null;
        }

        public static InfoViewType valueOf(String str) {
            return (InfoViewType) Enum.valueOf(InfoViewType.class, str);
        }

        public static InfoViewType[] values() {
            return (InfoViewType[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoItemListSettings.kt */
    public static final class a {

        /* compiled from: VideoItemListSettings.kt */
        /* renamed from: com.vk.catalog2.common.ui.holders.video.VideoItemListSettings$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0489a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VerticalVideoCatalogViewStyle.Style.values().length];
                try {
                    iArr[VerticalVideoCatalogViewStyle.Style.None.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VerticalVideoCatalogViewStyle.Style.Search.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[VerticalVideoCatalogViewStyle.Style.FullPlay.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[VerticalVideoCatalogViewStyle.Style.FullPlayDescViews.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[VerticalVideoCatalogViewStyle.Style.FullPlayDescViewsAuthor.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[VerticalVideoCatalogViewStyle.Style.FullPlayDescPubdateAutor.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[VerticalVideoCatalogViewStyle.Style.TeaserPlay.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[VerticalVideoCatalogViewStyle.Style.TeaserPlayDescViews.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[VerticalVideoCatalogViewStyle.Style.TeaserPlayDescViewsAuthor.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[VerticalVideoCatalogViewStyle.Style.TeaserPlayDescPubdateAutor.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static int a(Context context) {
            HashSet hashSet = iah0.a;
            if (fnj.b(context)) {
                return iah0.s(context) ? 4 : 6;
            }
            return 2;
        }

        public static VideoItemListSettings b() {
            return VideoItemListSettings.l;
        }

        public static VideoItemListSettings c() {
            return VideoItemListSettings.m;
        }

        public static VideoItemListSettings d() {
            return VideoItemListSettings.n;
        }

        public static InfoViewType e(VerticalVideoCatalogViewStyle verticalVideoCatalogViewStyle) {
            InfoViewType infoViewType;
            if (verticalVideoCatalogViewStyle != null) {
                switch (C0489a.$EnumSwitchMapping$0[verticalVideoCatalogViewStyle.b.ordinal()]) {
                    case 1:
                        infoViewType = InfoViewType.ClearView;
                        break;
                    case 2:
                        infoViewType = InfoViewType.ClearView;
                        break;
                    case 3:
                        infoViewType = InfoViewType.ClipFullplay;
                        break;
                    case 4:
                        infoViewType = InfoViewType.ClipFullDescViews;
                        break;
                    case 5:
                        infoViewType = InfoViewType.ClipFullDescViewsAuthor;
                        break;
                    case 6:
                        infoViewType = InfoViewType.ClipFullDescPubAuthor;
                        break;
                    case 7:
                        infoViewType = InfoViewType.ClipTeaser;
                        break;
                    case 8:
                        infoViewType = InfoViewType.ClipTeaserDescViews;
                        break;
                    case 9:
                        infoViewType = InfoViewType.ClipTeaserDescViewsAuthor;
                        break;
                    case 10:
                        infoViewType = InfoViewType.ClipTeaserDescPubAuthor;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                if (infoViewType != null) {
                    return infoViewType;
                }
            }
            return InfoViewType.ClearView;
        }

        public static VideoItemListSettings f(VideoItemListSettings videoItemListSettings) {
            return VideoItemListSettings.a(VideoItemListSettings.i, 0, 0, videoItemListSettings.c, InfoViewType.FullBottomInfoView, 3);
        }
    }

    static {
        VideoItemListSettings videoItemListSettings = new VideoItemListSettings(-1, -2, 1.7777778f, InfoViewType.BottomInfoView);
        i = videoItemListSettings;
        j = a(videoItemListSettings, 0, 0, 1.0f, null, 11);
        k = a(videoItemListSettings, 0, 0, 0.8f, null, 11);
        float f = 264;
        l = new VideoItemListSettings(iah0.a(152), iah0.a(f), 0.5625f, InfoViewType.InnerAuthorView);
        m = new VideoItemListSettings(iah0.a(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE), iah0.a(234), 0.5625f, InfoViewType.ClipViewsCountView);
        n = a(videoItemListSettings, 0, 0, 0.5625f, InfoViewType.FullInnerInfo, 3);
        o = new VideoItemListSettings(iah0.a(266), iah0.a(466), 0.5625f, InfoViewType.MusicTrendTemplateInfoView);
        p = new VideoItemListSettings(iah0.a(150), iah0.a(f), 0.5625f, InfoViewType.MusicTemplateInfoView);
        VideoItemListSettings videoItemListSettings2 = new VideoItemListSettings(iah0.a(158), iah0.a(284), 0.5625f, InfoViewType.ClearView);
        q = videoItemListSettings2;
        r = a(videoItemListSettings2, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, InfoViewType.InnerLikeableView, 7);
        s = a(videoItemListSettings, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, InfoViewType.BottomInfoViewTablet, 7);
    }

    public VideoItemListSettings(int i2, int i3, float f, InfoViewType infoViewType) {
        this.a = i2;
        this.b = i3;
        this.c = f;
        this.d = infoViewType;
        InfoViewType infoViewType2 = InfoViewType.BottomInfoView;
        boolean z = infoViewType == infoViewType2 || infoViewType == InfoViewType.FullBottomInfoView;
        this.e = z;
        this.f = infoViewType == infoViewType2 || infoViewType == InfoViewType.FullBottomInfoView || infoViewType == InfoViewType.BottomInfoViewTablet;
        InfoViewType infoViewType3 = InfoViewType.BottomInfoViewTablet;
        this.g = infoViewType == infoViewType3;
        this.h = z ? CornerType.NONE : infoViewType == infoViewType3 ? CornerType.LARGE : CornerType.NORMAL;
    }

    public static VideoItemListSettings a(VideoItemListSettings videoItemListSettings, int i2, int i3, float f, InfoViewType infoViewType, int i4) {
        if ((i4 & 1) != 0) {
            i2 = videoItemListSettings.a;
        }
        if ((i4 & 2) != 0) {
            i3 = videoItemListSettings.b;
        }
        if ((i4 & 4) != 0) {
            f = videoItemListSettings.c;
        }
        if ((i4 & 8) != 0) {
            infoViewType = videoItemListSettings.d;
        }
        videoItemListSettings.getClass();
        return new VideoItemListSettings(i2, i3, f, infoViewType);
    }

    public final boolean b() {
        return this.a != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoItemListSettings)) {
            return false;
        }
        VideoItemListSettings videoItemListSettings = (VideoItemListSettings) obj;
        return this.a == videoItemListSettings.a && this.b == videoItemListSettings.b && Float.compare(this.c, videoItemListSettings.c) == 0 && this.d == videoItemListSettings.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + b.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "VideoItemListSettings(width=" + this.a + ", height=" + this.b + ", dimensionRatio=" + this.c + ", infoView=" + this.d + ')';
    }
}
