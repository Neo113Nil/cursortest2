package com.vk.catalog2.common.ui.holders.video.info_overlays;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.video.VideoItemListSettings;
import com.vk.catalog2.common.ui.holders.video.info_overlays.ClipInfoView;
import com.vk.core.tool.view.AspectRatioFrameLayout;
import com.vk.dto.common.VideoFile;
import kotlin.NoWhenBranchMatchedException;
import xsna.a58;
import xsna.ba50;
import xsna.e1x;
import xsna.gqs0;
import xsna.he50;
import xsna.izs;
import xsna.k7a;
import xsna.qic;
import xsna.x0x;
import xsna.y0x;
import xsna.zus;

/* compiled from: VideoInfoView.kt */
/* loaded from: classes16.dex */
public abstract class a {
    public AspectRatioFrameLayout b;
    public final int c = 16;

    /* compiled from: VideoInfoView.kt */
    /* renamed from: com.vk.catalog2.common.ui.holders.video.info_overlays.a$a, reason: collision with other inner class name */
    public static final class C0491a {

        /* compiled from: VideoInfoView.kt */
        /* renamed from: com.vk.catalog2.common.ui.holders.video.info_overlays.a$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0492a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VideoItemListSettings.InfoViewType.values().length];
                try {
                    iArr[VideoItemListSettings.InfoViewType.BottomInfoView.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VideoItemListSettings.InfoViewType.BottomInfoViewTablet.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[VideoItemListSettings.InfoViewType.FullBottomInfoView.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[VideoItemListSettings.InfoViewType.InnerAuthorView.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[VideoItemListSettings.InfoViewType.ClearView.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[VideoItemListSettings.InfoViewType.InnerLikeableView.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[VideoItemListSettings.InfoViewType.FullInnerInfo.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[VideoItemListSettings.InfoViewType.MusicTrendTemplateInfoView.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[VideoItemListSettings.InfoViewType.MusicTemplateInfoView.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[VideoItemListSettings.InfoViewType.ClipViewsCountView.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[VideoItemListSettings.InfoViewType.ClipFullplay.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[VideoItemListSettings.InfoViewType.ClipTeaser.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[VideoItemListSettings.InfoViewType.ClipFullDescViews.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[VideoItemListSettings.InfoViewType.ClipTeaserDescViews.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[VideoItemListSettings.InfoViewType.ClipFullDescViewsAuthor.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[VideoItemListSettings.InfoViewType.ClipTeaserDescViewsAuthor.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[VideoItemListSettings.InfoViewType.ClipFullDescPubAuthor.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[VideoItemListSettings.InfoViewType.ClipTeaserDescPubAuthor.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static a a(VideoItemListSettings videoItemListSettings, k7a k7aVar, boolean z) {
            switch (C0492a.$EnumSwitchMapping$0[videoItemListSettings.d.ordinal()]) {
                case 1:
                    return new a58(k7aVar, false, false);
                case 2:
                    return new a58(k7aVar, true, true);
                case 3:
                    return new a58(k7aVar, true, false);
                case 4:
                    return new x0x();
                case 5:
                    return new qic();
                case 6:
                    return new y0x();
                case 7:
                    return new zus(z);
                case 8:
                    return new he50();
                case 9:
                    return new ba50();
                case 10:
                    return new e1x();
                case 11:
                case 12:
                    return new ClipInfoView(false, false, false, ClipInfoView.SubtitleStyle.CREATION_DATE);
                case 13:
                case 14:
                    return new ClipInfoView(false, true, true, ClipInfoView.SubtitleStyle.VIEWS_COUNT);
                case 15:
                case 16:
                    return new ClipInfoView(true, true, true, ClipInfoView.SubtitleStyle.VIEWS_COUNT);
                case 17:
                case 18:
                    return new ClipInfoView(true, true, true, ClipInfoView.SubtitleStyle.CREATION_DATE);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    public abstract void a(VideoFile videoFile, UIBlock uIBlock, gqs0 gqs0Var);

    public abstract void b(LayoutInflater layoutInflater, LinearLayout linearLayout, AspectRatioFrameLayout aspectRatioFrameLayout, View.OnClickListener onClickListener, izs izsVar);

    public int c() {
        return this.c;
    }

    public abstract boolean d();

    public int e() {
        return 0;
    }
}
