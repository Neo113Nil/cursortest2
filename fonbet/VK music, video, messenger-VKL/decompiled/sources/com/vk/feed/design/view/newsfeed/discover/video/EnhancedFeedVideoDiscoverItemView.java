package com.vk.feed.design.view.newsfeed.discover.video;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.tool.view.FlowLayout;
import com.vk.core.tool.view.RatioView;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.feed.design.view.newsfeed.discover.description.FeedDiscoverDescriptionView;
import com.vk.feed.design.view.newsfeed.discover.video.FeedVideoDiscoverItemView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.bwt0;
import xsna.cpy;
import xsna.f4m;
import xsna.n6n;

/* compiled from: EnhancedFeedVideoDiscoverItemView.kt */
/* loaded from: classes18.dex */
public final class EnhancedFeedVideoDiscoverItemView extends FrameLayout {
    public boolean b;
    public FeedDiscoverDescriptionView.TextStyle c;
    public int d;
    public TextUtils.TruncateAt e;
    public int f;
    public TextUtils.TruncateAt g;
    public final VkEnhancedImageView h;
    public final VideoTextureView i;
    public final VkImageSimple j;
    public FeedDiscoverDescriptionView k;
    public RatioView l;
    public FlowLayout m;
    public VkSpinner n;
    public boolean o;
    public boolean p;
    public FeedVideoDiscoverItemView.a q;

    /* compiled from: EnhancedFeedVideoDiscoverItemView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FeedVideoDiscoverItemView.TextStyle.values().length];
            try {
                iArr[FeedVideoDiscoverItemView.TextStyle.Medium.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FeedVideoDiscoverItemView.TextStyle.Small.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EnhancedFeedVideoDiscoverItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = FeedDiscoverDescriptionView.TextStyle.Medium;
        this.d = 1;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        this.e = truncateAt;
        this.f = 2;
        this.g = truncateAt;
        LayoutInflater.from(context).inflate(R.layout.feed_discover_enhanced_video, (ViewGroup) this, true);
        VkEnhancedImageView vkEnhancedImageView = (VkEnhancedImageView) findViewById(R.id.discover_enhanced_video_preview);
        this.h = vkEnhancedImageView;
        vkEnhancedImageView.setSimpleAspectRatio(true);
        vkEnhancedImageView.setScaleType(ScaleType.CENTER_CROP);
        this.i = (VideoTextureView) findViewById(R.id.discover_video_display);
        this.j = (VkImageSimple) findViewById(R.id.discover_video_error);
    }

    @Override // android.view.View
    public final FeedVideoDiscoverItemView.a getBottom() {
        return this.q;
    }

    public final boolean getUseThumbHash() {
        return this.b;
    }

    public final void setBottom(FeedVideoDiscoverItemView.a aVar) {
        this.q = aVar;
        if (aVar == null) {
            RatioView ratioView = this.l;
            if (ratioView != null) {
                f4m.j(ratioView);
            }
            FeedDiscoverDescriptionView feedDiscoverDescriptionView = this.k;
            if (feedDiscoverDescriptionView != null) {
                f4m.j(feedDiscoverDescriptionView);
                return;
            }
            return;
        }
        if (!(aVar instanceof FeedVideoDiscoverItemView.a.C1049a)) {
            throw new NoWhenBranchMatchedException();
        }
        FeedVideoDiscoverItemView.a.C1049a c1049a = (FeedVideoDiscoverItemView.a.C1049a) aVar;
        RatioView ratioView2 = this.l;
        if (ratioView2 == null) {
            ratioView2 = new RatioView(getContext(), null, 6);
            FrameLayout.LayoutParams a2 = cpy.a(-1, -2, 0, 0, 0, 0, 60);
            a2.gravity = 80;
            ratioView2.setId(R.id.discover_grid_item_shadow);
            ratioView2.setRatio(1.6f);
            ratioView2.setOrientation(0);
            ratioView2.setBackground(new n6n());
            this.l = ratioView2;
            addView(ratioView2, a2);
        }
        FeedDiscoverDescriptionView feedDiscoverDescriptionView2 = this.k;
        if (feedDiscoverDescriptionView2 == null) {
            feedDiscoverDescriptionView2 = new FeedDiscoverDescriptionView(getContext());
            FrameLayout.LayoutParams a3 = cpy.a(-1, -2, 0, 0, 0, 0, 60);
            a3.gravity = 80;
            feedDiscoverDescriptionView2.setId(R.id.discover_grid_item_description);
            feedDiscoverDescriptionView2.setGravity(80);
            feedDiscoverDescriptionView2.d(this.c);
            feedDiscoverDescriptionView2.b(this.d, this.e);
            feedDiscoverDescriptionView2.a(this.f, this.g);
            this.k = feedDiscoverDescriptionView2;
            addView(feedDiscoverDescriptionView2, a3);
        }
        ratioView2.setVisibility(0);
        feedDiscoverDescriptionView2.setVisibility(0);
        feedDiscoverDescriptionView2.setTitle(c1049a.a);
        feedDiscoverDescriptionView2.setSubtitle(c1049a.b);
    }

    public final void setDontLoadAgainIfSameResource(boolean z) {
        this.h.setDontLoadAgainIfSameResource(z);
    }

    public final void setErrorState(boolean z) {
        this.p = z;
        bwt0.p0(this.j, z);
    }

    public final void setLoadingState(boolean z) {
        this.o = z;
        VkSpinner vkSpinner = this.n;
        if (vkSpinner == null) {
            vkSpinner = new VkSpinner(getContext(), null, 6, 0);
            FrameLayout.LayoutParams a2 = cpy.a(-2, -2, 0, 0, 0, 0, 60);
            a2.gravity = 17;
            vkSpinner.setLayoutParams(a2);
            vkSpinner.setSpinnerSize(VkSpinner.SpinnerSize.Size24);
            this.n = vkSpinner;
            addView(vkSpinner);
        }
        bwt0.p0(vkSpinner, z);
    }

    public final void setOnErrorViewClickListener(View.OnClickListener onClickListener) {
        this.j.setOnClickListener(onClickListener);
    }

    public final void setPreviewPlaceholder(Drawable drawable) {
        this.h.setPlaceholderImage(drawable);
    }

    public final void setTextStyle(FeedVideoDiscoverItemView.TextStyle textStyle) {
        FeedDiscoverDescriptionView.TextStyle textStyle2;
        int i = a.$EnumSwitchMapping$0[textStyle.ordinal()];
        if (i == 1) {
            textStyle2 = FeedDiscoverDescriptionView.TextStyle.Medium;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textStyle2 = FeedDiscoverDescriptionView.TextStyle.Small;
        }
        this.c = textStyle2;
        FeedDiscoverDescriptionView feedDiscoverDescriptionView = this.k;
        if (feedDiscoverDescriptionView != null) {
            feedDiscoverDescriptionView.d(textStyle2);
        }
    }

    public final void setUseThumbHash(boolean z) {
        this.b = z;
    }
}
