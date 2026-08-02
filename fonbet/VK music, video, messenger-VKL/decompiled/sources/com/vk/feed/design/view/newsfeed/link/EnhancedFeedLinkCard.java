package com.vk.feed.design.view.newsfeed.link;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.dto.common.im.Image;
import com.vk.feed.design.view.newsfeed.link.FeedLinkCard;
import com.vk.toggle.b;
import com.vk.toggle.d;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.cn70;
import xsna.dhr0;
import xsna.dko;
import xsna.e3m;
import xsna.edg0;
import xsna.epx;
import xsna.gzs;
import xsna.iso0;
import xsna.kci;
import xsna.m33;
import xsna.tlo0;

/* compiled from: EnhancedFeedLinkCard.kt */
/* loaded from: classes18.dex */
public final class EnhancedFeedLinkCard extends LinearLayout {
    public FeedLinkCard.b b;
    public FeedLinkCard.OverlayContent c;
    public FeedLinkCard.a d;
    public FeedLinkCard.c e;
    public final ColorDrawable f;
    public Integer g;
    public final ConstraintLayout h;
    public final VkPlaceholder i;
    public final View j;
    public final VkEnhancedImageView k;
    public final VkText l;
    public final VkButton m;
    public final VkImageSimple n;
    public final VkCell o;

    /* compiled from: EnhancedFeedLinkCard.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FeedLinkCard.OverlayContent.ActionButtonWithTitle.Appearance.values().length];
            try {
                iArr[FeedLinkCard.OverlayContent.ActionButtonWithTitle.Appearance.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FeedLinkCard.OverlayContent.ActionButtonWithTitle.Appearance.Contrast.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EnhancedFeedLinkCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void a(int i) {
        FeedLinkCard.c cVar = this.e;
        if (cVar instanceof FeedLinkCard.c.a) {
            i -= cn70.b(58);
            if (i < 0) {
                i = 0;
            }
        } else if (cVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        VkEnhancedImageView vkEnhancedImageView = this.k;
        ViewGroup.LayoutParams layoutParams = vkEnhancedImageView.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar == null || bVar.Q == i) {
            return;
        }
        bVar.Q = i;
        vkEnhancedImageView.setLayoutParams(bVar);
    }

    public final FeedLinkCard.a getBadge() {
        return this.d;
    }

    public final FeedLinkCard.b getContent() {
        return this.b;
    }

    public final FeedLinkCard.c getFooter() {
        return this.e;
    }

    public final FeedLinkCard.OverlayContent getOverlayContent() {
        return this.c;
    }

    public final void setBadge(FeedLinkCard.a aVar) {
        this.d = aVar;
        VkImageSimple vkImageSimple = this.n;
        vkImageSimple.setVisibility(8);
        if (!epx.f(aVar, FeedLinkCard.a.C1053a.a)) {
            if (aVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        vkImageSimple.setVisibility(0);
        Context context = getContext();
        e3m.a aVar2 = e3m.a;
        vkImageSimple.setImageDrawable(m33.a(R.drawable.vk_icon_dismiss_dark_24, context));
        vkImageSimple.setContentDescription(getContext().getString(R.string.delete));
    }

    public final void setCardEnabledState(boolean z) {
        this.o.setEnabled(z);
    }

    public final void setCardMaxHeight(int i) {
        this.g = Integer.valueOf(i);
        a(i);
    }

    public final void setContent(FeedLinkCard.b bVar) {
        this.b = bVar;
        VkPlaceholder vkPlaceholder = this.i;
        vkPlaceholder.setVisibility(8);
        VkEnhancedImageView vkEnhancedImageView = this.k;
        vkEnhancedImageView.setVisibility(8);
        View view = this.j;
        boolean z = false;
        view.setVisibility(0);
        int f = e3m.f(R.attr.vk_ui_background_secondary, getContext());
        ConstraintLayout constraintLayout = this.h;
        constraintLayout.setBackgroundColor(f);
        if (bVar instanceof FeedLinkCard.b.C1054b) {
            FeedLinkCard.b.C1054b c1054b = (FeedLinkCard.b.C1054b) bVar;
            vkPlaceholder.setVisibility(0);
            tlo0 tlo0Var = c1054b.b;
            vkPlaceholder.setMiddle(tlo0Var != null ? new VkPlaceholder.b(new VkPlaceholder.b.c(2, (tlo0) null), new VkPlaceholder.b.C0859b(14, tlo0Var)) : null);
            dko dkoVar = c1054b.a;
            vkPlaceholder.setTop(dkoVar != null ? new VkPlaceholder.c.b(dkoVar, null, null, 14) : null);
            return;
        }
        if (!(bVar instanceof FeedLinkCard.b.a)) {
            if (bVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        FeedLinkCard.b.a aVar = (FeedLinkCard.b.a) bVar;
        vkEnhancedImageView.setVisibility(0);
        view.setVisibility(8);
        constraintLayout.setBackgroundColor(e3m.f(R.attr.vk_ui_background_content, getContext()));
        boolean z2 = aVar.c;
        String str = aVar.a;
        if (z2) {
            vkEnhancedImageView.setOverlayImage(this.f);
            kci.o(vkEnhancedImageView, edg0.a);
        } else {
            vkEnhancedImageView.setOverlayImage(null);
            vkEnhancedImageView.setVkPostprocessor(null);
        }
        String str2 = aVar.d;
        ViewGroup.LayoutParams layoutParams = vkEnhancedImageView.getLayoutParams();
        ConstraintLayout.b bVar2 = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar2 != null) {
            if (str2 == null) {
                str2 = "H,1.7777778:1";
            }
            if (!epx.f(bVar2.G, str2)) {
                bVar2.G = str2;
                vkEnhancedImageView.requestLayout();
            }
        }
        CoreFeatures coreFeatures = CoreFeatures.THUMB_HASH;
        coreFeatures.getClass();
        b bVar3 = b.A;
        if (!bVar3.a(coreFeatures) || !d.s().a) {
            vkEnhancedImageView.o0(str, null);
            return;
        }
        iso0 s = d.s();
        String str3 = aVar.b;
        if (bVar3.a(coreFeatures) && d.s().a) {
            z = true;
        }
        String b = s.b(str3, z);
        if (b != null) {
            vkEnhancedImageView.setThumbHash(b);
        }
        vkEnhancedImageView.setRemoteImage(new Image(String.valueOf(str)));
    }

    public final void setFooter(FeedLinkCard.c cVar) {
        VkCell.Middle.e eVar;
        this.e = cVar;
        VkCell vkCell = this.o;
        vkCell.setVisibility(8);
        if (cVar instanceof FeedLinkCard.c.a) {
            FeedLinkCard.c.a aVar = (FeedLinkCard.c.a) cVar;
            vkCell.setVisibility(0);
            VkCell.Middle.a aVar2 = VkCell.Middle.Companion;
            tlo0 tlo0Var = aVar.a;
            if (tlo0Var == null) {
                eVar = null;
            } else {
                eVar = new VkCell.Middle.e(tlo0Var, 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50);
            }
            vkCell.setMiddle(VkCell.Middle.a.a(aVar2, eVar, new VkCell.Middle.d(aVar.b, (gzs) null, 1, TextUtils.TruncateAt.END, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), null, 12));
        } else if (cVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        Integer num = this.g;
        if (num != null) {
            a(num.intValue());
        }
    }

    public final void setOnBadgeClickListener(View.OnClickListener onClickListener) {
        this.n.setOnClickListener(onClickListener);
    }

    public final void setOverlayContent(FeedLinkCard.OverlayContent overlayContent) {
        this.c = overlayContent;
        VkText vkText = this.l;
        vkText.setVisibility(8);
        VkButton vkButton = this.m;
        vkButton.setVisibility(8);
        if (!(overlayContent instanceof FeedLinkCard.OverlayContent.ActionButtonWithTitle)) {
            if (overlayContent != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        FeedLinkCard.OverlayContent.ActionButtonWithTitle actionButtonWithTitle = (FeedLinkCard.OverlayContent.ActionButtonWithTitle) overlayContent;
        vkText.setVisibility(0);
        vkButton.setVisibility(0);
        vkText.setText(actionButtonWithTitle.a);
        vkButton.setText(actionButtonWithTitle.b);
        int i = a.$EnumSwitchMapping$0[actionButtonWithTitle.c.ordinal()];
        if (i == 1) {
            vkText.setTextColor(e3m.f(R.attr.vk_ui_text_primary, getContext()));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            vkText.setTextColor(e3m.f(R.attr.vk_ui_text_contrast, getContext()));
        }
    }

    public EnhancedFeedLinkCard(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.f = new ColorDrawable(context.getColor(R.color.vk_black_alpha24));
        LayoutInflater.from(context).inflate(R.layout.feed_enhanced_article_link, this);
        this.h = (ConstraintLayout) findViewById(R.id.content_wrapper);
        this.i = (VkPlaceholder) findViewById(R.id.placeholder);
        this.j = findViewById(R.id.background_content);
        VkEnhancedImageView vkEnhancedImageView = (VkEnhancedImageView) findViewById(R.id.enhanced_image);
        this.k = vkEnhancedImageView;
        vkEnhancedImageView.setSimpleAspectRatio(true);
        vkEnhancedImageView.setScaleType(ScaleType.FIT_CENTER);
        this.l = (VkText) findViewById(R.id.action_title);
        this.m = (VkButton) findViewById(R.id.action_button);
        this.n = (VkImageSimple) findViewById(R.id.card_badge);
        this.o = (VkCell) findViewById(R.id.card_description);
        vkEnhancedImageView.setPlaceholderColor(dhr0.t.c(R.attr.vk_ui_background_secondary));
    }
}
