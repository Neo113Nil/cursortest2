package com.vk.catalog2.common.ui.mvp.holder.video;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionProfileVideoButton;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoProfileHorizontalScrollItemVh;
import com.vk.common.links.LaunchContext;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoOpenAuthorCabinetClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.toggle.d;
import com.vkontakte.android.R;
import xsna.atv0;
import xsna.bjc;
import xsna.c98;
import xsna.dhr0;
import xsna.drm0;
import xsna.fxc0;
import xsna.g7s0;
import xsna.hav0;
import xsna.l7v;
import xsna.m8v0;
import xsna.maz;
import xsna.o25;
import xsna.p1s0;
import xsna.s1v;
import xsna.s75;
import xsna.uzp0;
import xsna.wvw;
import xsna.xwk;
import xsna.ydt0;

/* compiled from: VideoProfileHorizontalScrollItemVh.kt */
/* loaded from: classes16.dex */
public final class VideoProfileHorizontalScrollItemVh implements CatalogViewHolder, View.OnClickListener {
    public final CatalogViewType b;
    public final wvw c;
    public View d;
    public VkSimpleButton e;

    /* compiled from: VideoProfileHorizontalScrollItemVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.VIDEO_OWNER_GROUPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.VIDEO_BECOME_AUTHOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.VIDEO_AUTHOR_CABINET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogViewType.VIDEO_CHILD_MODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoProfileHorizontalScrollItemVh(CatalogViewType catalogViewType, wvw wvwVar) {
        this.b = catalogViewType;
        this.c = wvwVar;
    }

    public static void a(final VideoProfileHorizontalScrollItemVh videoProfileHorizontalScrollItemVh, final VkSimpleButton vkSimpleButton, final HintId hintId, VkTooltip$MarkerSize vkTooltip$MarkerSize, VkTooltip$BalloonTilt vkTooltip$BalloonTilt, boolean z, int i) {
        if ((i & 4) != 0) {
            vkTooltip$MarkerSize = VkTooltip$MarkerSize.Size72;
        }
        final VkTooltip$MarkerSize vkTooltip$MarkerSize2 = vkTooltip$MarkerSize;
        if ((i & 8) != 0) {
            vkTooltip$BalloonTilt = VkTooltip$BalloonTilt.Left;
        }
        final VkTooltip$BalloonTilt vkTooltip$BalloonTilt2 = vkTooltip$BalloonTilt;
        final int i2 = (i & 16) != 0 ? atv0.b : 175;
        if ((i & 32) != 0) {
            z = false;
        }
        final boolean z2 = z;
        vkSimpleButton.post(new Runnable() { // from class: xsna.g8t0
            @Override // java.lang.Runnable
            public final void run() {
                l7v b = VideoProfileHorizontalScrollItemVh.this.c.b();
                HintId hintId2 = hintId;
                Hint p = b.p(hintId2.getId());
                if (p != null) {
                    int i3 = m8v0.M;
                    String str = p.c;
                    if (str == null) {
                        str = "";
                    }
                    m8v0.a.a(vkSimpleButton, str, null, VkTooltip$MarkerStyle.Style6, vkTooltip$MarkerSize2, VkOnboarding$TintColor.Azure, VkTooltip$BalloonPosition.BottomRight, vkTooltip$BalloonTilt2, new y160(19), new d230(23), null, null, null, new dnh0(13, b, hintId2), null, i2, false, null, null, false, null, z2, 8346628);
                }
            }
        });
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockActionProfileVideoButton uIBlockActionProfileVideoButton = uIBlock instanceof UIBlockActionProfileVideoButton ? (UIBlockActionProfileVideoButton) uIBlock : null;
        if (uIBlockActionProfileVideoButton == null) {
            return;
        }
        VkSimpleButton vkSimpleButton = this.e;
        if (vkSimpleButton == null) {
            vkSimpleButton = null;
        }
        vkSimpleButton.setText(uIBlockActionProfileVideoButton.z);
        l7v b = this.c.b();
        CatalogViewType catalogViewType = CatalogViewType.VIDEO_OWNER_GROUPS;
        CatalogViewType catalogViewType2 = this.b;
        if (catalogViewType2 != catalogViewType) {
            if (catalogViewType2 == CatalogViewType.VIDEO_AUTHOR_CABINET) {
                HintId hintId = HintId.CREATORS_DASHBOARD_WEBVIEW;
                if (b.m(hintId)) {
                    VkSimpleButton vkSimpleButton2 = this.e;
                    if (vkSimpleButton2 == null) {
                        vkSimpleButton2 = null;
                    }
                    a(this, vkSimpleButton2, hintId, VkTooltip$MarkerSize.Size96, null, dhr0.C().b, 24);
                    return;
                }
                return;
            }
            return;
        }
        HintId hintId2 = HintId.INFO_CJM_GROUP;
        if (b.m(hintId2)) {
            VkSimpleButton vkSimpleButton3 = this.e;
            if (vkSimpleButton3 == null) {
                vkSimpleButton3 = null;
            }
            a(this, vkSimpleButton3, hintId2, null, null, false, 60);
            return;
        }
        HintId hintId3 = HintId.INFO_CHANNEL_ONBOARDING;
        if (b.m(hintId3)) {
            VkSimpleButton vkSimpleButton4 = this.e;
            if (vkSimpleButton4 == null) {
                vkSimpleButton4 = null;
            }
            a(this, vkSimpleButton4, hintId3, null, VkTooltip$BalloonTilt.Right, false, 36);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog2_video_profile_horizontal_item_vh, viewGroup, false);
        this.d = inflate;
        VkSimpleButton vkSimpleButton = (VkSimpleButton) inflate.findViewById(R.id.title);
        this.e = vkSimpleButton;
        vkSimpleButton.setClipToOutline(true);
        vkSimpleButton.setOutlineProvider(hav0.a);
        vkSimpleButton.setBackgroundTint(R.attr.vk_ui_background_secondary_alpha);
        vkSimpleButton.setTextTint(R.attr.vk_ui_text_primary);
        VkSimpleButton vkSimpleButton2 = this.e;
        if (vkSimpleButton2 == null) {
            vkSimpleButton2 = null;
        }
        vkSimpleButton2.setOnClickListener(new c98(this, 1));
        inflate.setOnClickListener(new c98(this, 1));
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null) {
            return;
        }
        int i = a.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            g7s0 B = fxc0.B();
            view.getContext();
            o25.a().c();
            B.getClass();
            return;
        }
        if (i == 2) {
            maz e = xwk.d().e();
            ?? r1 = this.d;
            maz.c(e, (r1 != 0 ? r1 : null).getContext(), "https://vkvideo.ru/landings/video_faq", new LaunchContext(false, false, true, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67106811), null, null, 24);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            Context context = view.getContext();
            StringBuilder sb = new StringBuilder("Нажал на конпку ");
            VkSimpleButton vkSimpleButton = this.e;
            sb.append((Object) (vkSimpleButton != null ? vkSimpleButton : null).getText());
            Toast.makeText(context, sb.toString(), 0).show();
            return;
        }
        s75 c = d.c();
        String str = c != null ? c.b : null;
        if (str == null || drm0.N(str)) {
            return;
        }
        ydt0 Y = fxc0.B().Y();
        view.getContext();
        Y.getClass();
        s1v s1vVar = p1s0.a;
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, null, null, 62, null);
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.CATALOG;
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new MobileOfficialAppsVideoStat$TypeVideoOpenAuthorCabinetClick(null, 1, null), 2);
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(mobileOfficialAppsCoreNavStat$EventScreen, b, uzp0Var.a).q();
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
