package com.vk.feed.design.view.newsfeed.discover.photo;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.vk.core.tool.view.FlowLayout;
import com.vk.core.tool.view.RatioView;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.dto.common.im.Image;
import com.vk.feed.design.view.newsfeed.discover.description.FeedDiscoverDescriptionView;
import com.vk.feed.design.view.newsfeed.discover.photo.FeedPhotoDiscoverItemView;
import com.vk.toggle.d;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.cpy;
import xsna.f4m;
import xsna.n6n;

/* compiled from: EnhancedFeedPhotoDiscoverItemView.kt */
/* loaded from: classes18.dex */
public final class a extends FrameLayout {
    public boolean b;
    public FeedDiscoverDescriptionView.TextStyle c;
    public int d;
    public TextUtils.TruncateAt e;
    public int f;
    public TextUtils.TruncateAt g;
    public VkEnhancedImageView h;
    public FeedDiscoverDescriptionView i;
    public RatioView j;
    public FlowLayout k;
    public FeedPhotoDiscoverItemView.b l;
    public FeedPhotoDiscoverItemView.a m;

    /* compiled from: EnhancedFeedPhotoDiscoverItemView.kt */
    /* renamed from: com.vk.feed.design.view.newsfeed.discover.photo.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1048a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FeedPhotoDiscoverItemView.TextStyle.values().length];
            try {
                iArr[FeedPhotoDiscoverItemView.TextStyle.Medium.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FeedPhotoDiscoverItemView.TextStyle.Small.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // android.view.View
    public final FeedPhotoDiscoverItemView.a getBottom() {
        return this.m;
    }

    public final FeedPhotoDiscoverItemView.b getContent() {
        return this.l;
    }

    public final boolean getUseThumbHash() {
        return this.b;
    }

    public final void setBottom(FeedPhotoDiscoverItemView.a aVar) {
        this.m = aVar;
        if (aVar == null) {
            RatioView ratioView = this.j;
            if (ratioView != null) {
                f4m.j(ratioView);
            }
            FeedDiscoverDescriptionView feedDiscoverDescriptionView = this.i;
            if (feedDiscoverDescriptionView != null) {
                f4m.j(feedDiscoverDescriptionView);
                return;
            }
            return;
        }
        if (!(aVar instanceof FeedPhotoDiscoverItemView.a.C1047a)) {
            throw new NoWhenBranchMatchedException();
        }
        FeedPhotoDiscoverItemView.a.C1047a c1047a = (FeedPhotoDiscoverItemView.a.C1047a) aVar;
        RatioView ratioView2 = this.j;
        if (ratioView2 == null) {
            ratioView2 = new RatioView(getContext(), null, 6);
            FrameLayout.LayoutParams a = cpy.a(-1, -2, 0, 0, 0, 0, 60);
            a.gravity = 80;
            ratioView2.setId(R.id.discover_grid_item_shadow);
            ratioView2.setRatio(1.6f);
            ratioView2.setOrientation(0);
            ratioView2.setBackground(new n6n());
            this.j = ratioView2;
            addView(ratioView2, a);
        }
        FeedDiscoverDescriptionView feedDiscoverDescriptionView2 = this.i;
        if (feedDiscoverDescriptionView2 == null) {
            feedDiscoverDescriptionView2 = new FeedDiscoverDescriptionView(getContext());
            FrameLayout.LayoutParams a2 = cpy.a(-1, -2, 0, 0, 0, 0, 60);
            a2.gravity = 80;
            feedDiscoverDescriptionView2.setId(R.id.discover_grid_item_description);
            feedDiscoverDescriptionView2.setGravity(80);
            feedDiscoverDescriptionView2.d(this.c);
            feedDiscoverDescriptionView2.b(this.d, this.e);
            feedDiscoverDescriptionView2.a(this.f, this.g);
            this.i = feedDiscoverDescriptionView2;
            addView(feedDiscoverDescriptionView2, a2);
        }
        ratioView2.setVisibility(0);
        feedDiscoverDescriptionView2.setVisibility(0);
        feedDiscoverDescriptionView2.setTitle(c1047a.a);
        feedDiscoverDescriptionView2.setSubtitle(c1047a.b);
    }

    public final void setContent(FeedPhotoDiscoverItemView.b bVar) {
        this.l = bVar;
        VkEnhancedImageView vkEnhancedImageView = this.h;
        if (!(bVar instanceof FeedPhotoDiscoverItemView.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!this.b) {
            vkEnhancedImageView.o0(((FeedPhotoDiscoverItemView.b.a) bVar).a, null);
            return;
        }
        FeedPhotoDiscoverItemView.b.a aVar = (FeedPhotoDiscoverItemView.b.a) bVar;
        String b = d.s().b(aVar.b, this.b);
        if (b != null) {
            vkEnhancedImageView.setThumbHash(b);
        }
        vkEnhancedImageView.setRemoteImage(new Image(String.valueOf(aVar.a)));
    }

    public final void setDontLoadAgainIfSameResource(boolean z) {
        this.h.setDontLoadAgainIfSameResource(z);
    }

    public final void setPlaceholder(Drawable drawable) {
        this.h.setPlaceholderImage(drawable);
    }

    public final void setTextStyle(FeedPhotoDiscoverItemView.TextStyle textStyle) {
        FeedDiscoverDescriptionView.TextStyle textStyle2;
        int i = C1048a.$EnumSwitchMapping$0[textStyle.ordinal()];
        if (i == 1) {
            textStyle2 = FeedDiscoverDescriptionView.TextStyle.Medium;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textStyle2 = FeedDiscoverDescriptionView.TextStyle.Small;
        }
        this.c = textStyle2;
        FeedDiscoverDescriptionView feedDiscoverDescriptionView = this.i;
        if (feedDiscoverDescriptionView != null) {
            feedDiscoverDescriptionView.d(textStyle2);
        }
    }

    public final void setUseThumbHash(boolean z) {
        this.b = z;
    }
}
