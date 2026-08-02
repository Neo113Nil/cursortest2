package com.vk.catalog2.common.ui.holders.vkui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.drawee.generic.RoundingParams;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ContentType;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.common.links.LaunchContext;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.hints.HintId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.tooltips.VideoTooltip;
import com.vk.libvideo.tooltips.WatchLaterTooltip;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import xsna.b5a;
import xsna.bwt0;
import xsna.cfp0;
import xsna.cu1;
import xsna.dhr0;
import xsna.epx;
import xsna.g5g;
import xsna.iah0;
import xsna.j6b;
import xsna.k7a;
import xsna.maz;
import xsna.msy;
import xsna.njt;
import xsna.u8z;
import xsna.v8z;
import xsna.w8z;
import xsna.xwk;
import xsna.y4h;
import xsna.zfh;

/* compiled from: LinkBaseVh.kt */
/* loaded from: classes16.dex */
public abstract class LinkBaseVh<ViewT extends View> implements CatalogViewHolder, View.OnClickListener {
    public final b5a b;
    public final k7a c;
    public final SearchStatInfoProvider d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final a h;
    public UIBlockLink i;
    public VKImageView j;
    public VkImage k;
    public final Object l = msy.a(LazyThreadSafetyMode.NONE, new cu1(18));

    /* compiled from: LinkBaseVh.kt */
    public static final class a {
        public final boolean a;
        public final Integer b;

        public /* synthetic */ a() {
            this(true, null);
        }

        public a(boolean z, Integer num) {
            this.a = z;
            this.b = num;
        }
    }

    /* compiled from: LinkBaseVh.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HintId.values().length];
            try {
                iArr[HintId.INFO_CLIPS_ONBOARDING_SETTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HintId.INFO_VIDEO_WATCH_LATER_MENU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LinkBaseVh(b5a b5aVar, k7a k7aVar, SearchStatInfoProvider searchStatInfoProvider, boolean z, boolean z2, boolean z3, a aVar) {
        this.b = b5aVar;
        this.c = k7aVar;
        this.d = searchStatInfoProvider;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = aVar;
    }

    public static void e(LinkBaseVh linkBaseVh, String str, VideoTooltip.Type type, j6b j6bVar, int i) {
        Object obj = null;
        Integer num = (i & 2) != 0 ? 80 : null;
        long j = (i & 4) != 0 ? 350L : 10L;
        if ((i & 8) != 0) {
            type = VideoTooltip.Type.SCROLLABLE;
        }
        VideoTooltip.Type type2 = type;
        if ((i & 16) != 0) {
            j6bVar = null;
        }
        View b2 = linkBaseVh.b();
        if (b2 == null) {
            return;
        }
        Iterator<E> it = HintId.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (epx.f(((HintId) next).getId(), str)) {
                obj = next;
                break;
            }
        }
        HintId hintId = (HintId) obj;
        if (hintId == null) {
            return;
        }
        VideoTooltip.b(new VideoTooltip(b2), hintId, new w8z(j6bVar), new VideoTooltip.b(j, num, new VideoTooltip.c(iah0.a(10), iah0.a(8)), type2, new zfh(2), 4));
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        VKImageView vKImageView;
        njt hierarchy;
        RoundingParams roundingParams;
        float[] fArr;
        njt hierarchy2;
        RoundingParams roundingParams2;
        float[] fArr2;
        RoundingParams roundingParams3;
        Object obj;
        ViewT b2;
        VkImage vkImage;
        Resources resources;
        UIBlockLink uIBlockLink = uIBlock instanceof UIBlockLink ? (UIBlockLink) uIBlock : null;
        if (uIBlockLink == null) {
            return;
        }
        CatalogViewType catalogViewType = uIBlockLink.d;
        CatalogDataType catalogDataType = uIBlockLink.e;
        ViewT b3 = b();
        if (b3 == null || b3.getContext() == null) {
            return;
        }
        CatalogLink catalogLink = uIBlockLink.y;
        this.i = uIBlockLink;
        Meta meta = catalogLink.g;
        Meta meta2 = catalogLink.g;
        Image image = catalogLink.f;
        ContentType contentType = meta != null ? meta.c : null;
        boolean z = contentType == ContentType.MINIAPP || contentType == ContentType.SEARCH_ADS;
        boolean booleanValue = ((Boolean) this.l.getValue()).booleanValue();
        k7a k7aVar = this.c;
        boolean z2 = this.e;
        a aVar = this.h;
        boolean z3 = this.f;
        if (booleanValue) {
            VkImage vkImage2 = this.k;
            if (vkImage2 != null) {
                if (z3 || !z) {
                    d(true);
                } else {
                    d(false);
                    VkImage vkImage3 = this.k;
                    if (vkImage3 != null) {
                        VKImageView vKImageView2 = this.j;
                        vkImage3.setCornerRadius((vKImageView2 == null || (resources = vKImageView2.getResources()) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : resources.getDimension(R.dimen.catalog_app_corner_radius));
                    }
                }
                if (aVar != null) {
                    Integer num = aVar.b;
                    VkImage vkImage4 = this.k;
                    if (vkImage4 != null) {
                        d(false);
                        if (num != null) {
                            vkImage4.setCornerRadius(vkImage4.getResources().getDimension(num.intValue()));
                        }
                    }
                }
                vkImage2.setVkPostprocessor(null);
                if (contentType == ContentType.URL) {
                    VkImage vkImage5 = this.k;
                    if (vkImage5 != null) {
                        vkImage5.setBackgroundResource(R.drawable.vk_button_muted_background_circle);
                    }
                    VkImage vkImage6 = this.k;
                    if (vkImage6 != null) {
                        vkImage6.F0(dhr0.t.b(R.drawable.vk_icon_link_outline_28, R.attr.vk_ui_icon_secondary), ImageView.ScaleType.CENTER);
                    }
                    VkImage vkImage7 = this.k;
                    if (vkImage7 != null) {
                        vkImage7.o0(null, null);
                    }
                } else {
                    VkImage vkImage8 = this.k;
                    if (vkImage8 != null) {
                        vkImage8.setEmptyImagePlaceholder((Drawable) null);
                        if (z2) {
                            this.c.a(vkImage8, meta2 != null ? meta2.c : null, uIBlockLink.e, uIBlockLink.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            vkImage = vkImage8;
                            k7aVar.getClass();
                            vkImage.setPlaceholderImage(k7aVar.f(vkImage.getContext(), catalogDataType, catalogViewType, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                        } else {
                            vkImage = vkImage8;
                            vkImage.setBackgroundImage(null);
                            vkImage.setPlaceholderImage(R.drawable.user_placeholder);
                        }
                        ArrayList arrayList = image.c;
                        if (arrayList.size() > 1) {
                            g5g.L(arrayList, new u8z());
                        }
                        ImageSize Cb = image.Cb(a(vkImage.getContext()), true, false);
                        vkImage.s0(Cb != null ? Cb.d.d : null);
                        if (BuildInfo.q()) {
                            bwt0.o0(vkImage, R.attr.vk_ui_icon_accent_themed);
                        }
                    }
                }
            }
        } else {
            VKImageView vKImageView3 = this.j;
            if (vKImageView3 != null) {
                if (z3 || !z) {
                    d(true);
                } else {
                    d(false);
                    VKImageView vKImageView4 = this.j;
                    if (vKImageView4 != null) {
                        Resources resources2 = vKImageView4.getResources();
                        vKImageView4.setCornerRadius(resources2 != null ? resources2.getDimension(R.dimen.catalog_app_corner_radius) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                }
                if (aVar != null) {
                    Integer num2 = aVar.b;
                    VKImageView vKImageView5 = this.j;
                    if (vKImageView5 != null) {
                        d(false);
                        if (num2 != null) {
                            vKImageView5.setCornerRadius(vKImageView5.getResources().getDimension(num2.intValue()));
                        }
                        RoundingParams roundingParams4 = vKImageView5.getHierarchy().c;
                        if (roundingParams4 != null) {
                            roundingParams4.i = aVar.a;
                        }
                    }
                }
                njt hierarchy3 = vKImageView3.getHierarchy();
                if (hierarchy3 != null && (roundingParams3 = hierarchy3.c) != null) {
                    roundingParams3.d(0.5f);
                }
                vKImageView3.setPostprocessor(null);
                if (contentType == ContentType.URL) {
                    VKImageView vKImageView6 = this.j;
                    if (vKImageView6 != null) {
                        vKImageView6.setBackgroundResource(R.drawable.vk_button_muted_background_circle);
                    }
                    VKImageView vKImageView7 = this.j;
                    if (vKImageView7 != null) {
                        vKImageView7.F0(dhr0.t.b(R.drawable.vk_icon_link_outline_28, R.attr.vk_ui_icon_secondary), ImageView.ScaleType.CENTER);
                    }
                    VKImageView vKImageView8 = this.j;
                    if (vKImageView8 != null) {
                        vKImageView8.o0(null, null);
                    }
                } else {
                    VKImageView vKImageView9 = this.j;
                    if (vKImageView9 != null) {
                        vKImageView9.setEmptyImagePlaceholder((Drawable) null);
                        if (z2) {
                            ContentType contentType2 = meta2 != null ? meta2.c : null;
                            CatalogDataType catalogDataType2 = uIBlockLink.e;
                            CatalogViewType catalogViewType2 = uIBlockLink.d;
                            VKImageView vKImageView10 = this.j;
                            float f = -1.0f;
                            this.c.b(vKImageView9, contentType2, catalogDataType2, catalogViewType2, (vKImageView10 == null || (hierarchy2 = vKImageView10.getHierarchy()) == null || (roundingParams2 = hierarchy2.c) == null || (fArr2 = roundingParams2.c) == null) ? -1.0f : fArr2[0]);
                            vKImageView = vKImageView9;
                            VKImageView vKImageView11 = this.j;
                            if (vKImageView11 != null && (hierarchy = vKImageView11.getHierarchy()) != null && (roundingParams = hierarchy.c) != null && (fArr = roundingParams.c) != null) {
                                f = fArr[0];
                            }
                            k7aVar.d(vKImageView, catalogDataType, catalogViewType, f);
                        } else {
                            vKImageView = vKImageView9;
                            vKImageView.setBackgroundImage(null);
                            vKImageView.setPlaceholderImage(R.drawable.user_placeholder);
                        }
                        ArrayList arrayList2 = image.c;
                        if (arrayList2.size() > 1) {
                            g5g.L(arrayList2, new y4h(1));
                        }
                        ImageSize Cb2 = image.Cb(a(vKImageView.getContext()), true, false);
                        vKImageView.s0(Cb2 != null ? Cb2.d.d : null);
                        if (BuildInfo.q()) {
                            bwt0.o0(vKImageView, R.attr.vk_ui_icon_accent_themed);
                        }
                    }
                }
            }
        }
        UIBlockHint uIBlockHint = uIBlock.j;
        if (uIBlockHint != null) {
            Iterator<E> it = HintId.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (epx.f(((HintId) obj).getId(), uIBlockHint.y)) {
                        break;
                    }
                }
            }
            HintId hintId = (HintId) obj;
            if (hintId == null || (b2 = b()) == null) {
                return;
            }
            if (!b2.isAttachedToWindow()) {
                b2.addOnAttachStateChangeListener(new v8z(b2, hintId, this));
                return;
            }
            int i = b.$EnumSwitchMapping$0[hintId.ordinal()];
            if (i == 1) {
                e(this, hintId.getId(), VideoTooltip.Type.NOT_SCROLLABLE, new j6b(this, 3), 2);
                return;
            }
            if (i != 2) {
                e(this, hintId.getId(), null, null, 28);
                return;
            }
            VKImageView vKImageView12 = this.j;
            if (vKImageView12 != null) {
                new WatchLaterTooltip(vKImageView12).a(WatchLaterTooltip.Hint.MENU);
            }
            VkImage vkImage9 = this.k;
            if (vkImage9 != null) {
                new WatchLaterTooltip(vkImage9).a(WatchLaterTooltip.Hint.MENU);
            }
        }
    }

    public abstract int a(Context context);

    public abstract ViewT b();

    public final void c(Context context) {
        UIBlockLink uIBlockLink = this.i;
        CatalogLink catalogLink = uIBlockLink != null ? uIBlockLink.y : null;
        if (uIBlockLink == null || catalogLink == null) {
            return;
        }
        Meta meta = catalogLink.g;
        this.b.a(new cfp0(uIBlockLink, meta != null ? meta.c : null));
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.LINK;
        String r = uIBlockLink.r();
        if (r == null) {
            r = "";
        }
        SearchStatsLoggingInfo b2 = this.d.b(type, r, false);
        LaunchContext.a aVar = new LaunchContext.a();
        aVar.d = uIBlockLink.f;
        aVar.e = uIBlockLink.p.h();
        if (b2 != null) {
            aVar.m = b2;
        }
        maz.c(xwk.d().e(), context, catalogLink.e, aVar.a(), null, null, 24);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public void d(boolean z) {
        if (((Boolean) this.l.getValue()).booleanValue()) {
            VkImage vkImage = this.k;
            if (vkImage != null) {
                vkImage.setRound(z);
                return;
            }
            return;
        }
        VKImageView vKImageView = this.j;
        if (vKImageView != null) {
            vKImageView.setRound(z);
        }
    }

    public void onClick(View view) {
        if (view == null) {
            return;
        }
        c(view.getContext());
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
