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
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.feed.design.view.newsfeed.discover.description.FeedDiscoverDescriptionView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bwt0;
import xsna.cn70;
import xsna.cpy;
import xsna.epx;
import xsna.f4m;
import xsna.fan;
import xsna.ho8;
import xsna.n6n;
import xsna.zrp;

/* compiled from: FeedVideoDiscoverItemView.kt */
/* loaded from: classes18.dex */
public final class FeedVideoDiscoverItemView extends FrameLayout {
    public FeedDiscoverDescriptionView.TextStyle b;
    public int c;
    public TextUtils.TruncateAt d;
    public int e;
    public TextUtils.TruncateAt f;
    public final VkImage g;
    public final VideoTextureView h;
    public final VkImageSimple i;
    public FeedDiscoverDescriptionView j;
    public RatioView k;
    public FlowLayout l;
    public VkSpinner m;
    public a n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FeedVideoDiscoverItemView.kt */
    public static final class TextStyle {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TextStyle[] $VALUES;
        public static final TextStyle Medium;
        public static final TextStyle Small;

        static {
            TextStyle textStyle = new TextStyle("Small", 0);
            Small = textStyle;
            TextStyle textStyle2 = new TextStyle("Medium", 1);
            Medium = textStyle2;
            TextStyle[] textStyleArr = {textStyle, textStyle2};
            $VALUES = textStyleArr;
            $ENTRIES = new asp(textStyleArr);
        }

        public TextStyle() {
            throw null;
        }

        public static TextStyle valueOf(String str) {
            return (TextStyle) Enum.valueOf(TextStyle.class, str);
        }

        public static TextStyle[] values() {
            return (TextStyle[]) $VALUES.clone();
        }
    }

    /* compiled from: FeedVideoDiscoverItemView.kt */
    public interface a {

        /* compiled from: FeedVideoDiscoverItemView.kt */
        /* renamed from: com.vk.feed.design.view.newsfeed.discover.video.FeedVideoDiscoverItemView$a$a, reason: collision with other inner class name */
        public static final class C1049a implements a {
            public final String a;
            public final String b;

            public C1049a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1049a)) {
                    return false;
                }
                C1049a c1049a = (C1049a) obj;
                return epx.f(this.a, c1049a.a) && epx.f(this.b, c1049a.b);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Description(title=");
                sb.append(this.a);
                sb.append(", subtitle=");
                return ho8.a(sb, this.b, ')');
            }
        }
    }

    /* compiled from: FeedVideoDiscoverItemView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextStyle.values().length];
            try {
                iArr[TextStyle.Medium.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextStyle.Small.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FeedVideoDiscoverItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void a(fan fanVar) {
        FlowLayout flowLayout = this.l;
        if (flowLayout == null) {
            flowLayout = new FlowLayout(getContext());
            flowLayout.setId(R.id.discover_grid_item_tags);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 8388691;
            layoutParams.leftMargin = cn70.b(8);
            layoutParams.topMargin = cn70.b(2);
            layoutParams.rightMargin = cn70.b(8);
            layoutParams.bottomMargin = cn70.b(2);
            flowLayout.setLayoutParams(layoutParams);
            flowLayout.setRowsStartFromBottom(true);
            this.l = flowLayout;
            addView(flowLayout);
        }
        flowLayout.setVisibility(0);
        int tagsCount = fanVar.getTagsCount();
        for (int i = 0; i < tagsCount; i++) {
            flowLayout.addView(fanVar.a(i, flowLayout));
        }
    }

    @Override // android.view.View
    public final a getBottom() {
        return this.n;
    }

    public final VideoTextureView getVideoTextureView() {
        return this.h;
    }

    public final void setBottom(a aVar) {
        this.n = aVar;
        if (aVar == null) {
            RatioView ratioView = this.k;
            if (ratioView != null) {
                f4m.j(ratioView);
            }
            FeedDiscoverDescriptionView feedDiscoverDescriptionView = this.j;
            if (feedDiscoverDescriptionView != null) {
                f4m.j(feedDiscoverDescriptionView);
                return;
            }
            return;
        }
        if (!(aVar instanceof a.C1049a)) {
            throw new NoWhenBranchMatchedException();
        }
        a.C1049a c1049a = (a.C1049a) aVar;
        RatioView ratioView2 = this.k;
        if (ratioView2 == null) {
            ratioView2 = new RatioView(getContext(), null, 6);
            FrameLayout.LayoutParams a2 = cpy.a(-1, -2, 0, 0, 0, 0, 60);
            a2.gravity = 80;
            ratioView2.setId(R.id.discover_grid_item_shadow);
            ratioView2.setRatio(1.6f);
            ratioView2.setOrientation(0);
            ratioView2.setBackground(new n6n());
            this.k = ratioView2;
            addView(ratioView2, a2);
        }
        FeedDiscoverDescriptionView feedDiscoverDescriptionView2 = this.j;
        if (feedDiscoverDescriptionView2 == null) {
            feedDiscoverDescriptionView2 = new FeedDiscoverDescriptionView(getContext());
            FrameLayout.LayoutParams a3 = cpy.a(-1, -2, 0, 0, 0, 0, 60);
            a3.gravity = 80;
            feedDiscoverDescriptionView2.setId(R.id.discover_grid_item_description);
            feedDiscoverDescriptionView2.setGravity(80);
            feedDiscoverDescriptionView2.d(this.b);
            feedDiscoverDescriptionView2.b(this.c, this.d);
            feedDiscoverDescriptionView2.a(this.e, this.f);
            this.j = feedDiscoverDescriptionView2;
            addView(feedDiscoverDescriptionView2, a3);
        }
        ratioView2.setVisibility(0);
        feedDiscoverDescriptionView2.setVisibility(0);
        feedDiscoverDescriptionView2.setTitle(c1049a.a);
        feedDiscoverDescriptionView2.setSubtitle(c1049a.b);
    }

    public final void setDontLoadAgainIfSameResource(boolean z) {
        this.g.setDontLoadAgainIfSameResource(z);
    }

    public final void setErrorState(boolean z) {
        bwt0.p0(this.i, z);
    }

    public final void setLoadingState(boolean z) {
        VkSpinner vkSpinner = this.m;
        if (vkSpinner == null) {
            vkSpinner = new VkSpinner(getContext(), null, 6, 0);
            FrameLayout.LayoutParams a2 = cpy.a(-2, -2, 0, 0, 0, 0, 60);
            a2.gravity = 17;
            vkSpinner.setLayoutParams(a2);
            vkSpinner.setSpinnerSize(VkSpinner.SpinnerSize.Size24);
            this.m = vkSpinner;
            addView(vkSpinner);
        }
        bwt0.p0(vkSpinner, z);
    }

    public final void setOnErrorViewClickListener(View.OnClickListener onClickListener) {
        this.i.setOnClickListener(onClickListener);
    }

    public final void setPreviewImageVisible(boolean z) {
        bwt0.p0(this.g, z);
    }

    public final void setPreviewPlaceholder(Drawable drawable) {
        this.g.setPlaceholderImage(drawable);
    }

    public final void setTextStyle(TextStyle textStyle) {
        FeedDiscoverDescriptionView.TextStyle textStyle2;
        int i = b.$EnumSwitchMapping$0[textStyle.ordinal()];
        if (i == 1) {
            textStyle2 = FeedDiscoverDescriptionView.TextStyle.Medium;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textStyle2 = FeedDiscoverDescriptionView.TextStyle.Small;
        }
        this.b = textStyle2;
        FeedDiscoverDescriptionView feedDiscoverDescriptionView = this.j;
        if (feedDiscoverDescriptionView != null) {
            feedDiscoverDescriptionView.d(textStyle2);
        }
    }

    public FeedVideoDiscoverItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.b = FeedDiscoverDescriptionView.TextStyle.Medium;
        this.c = 1;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        this.d = truncateAt;
        this.e = 2;
        this.f = truncateAt;
        LayoutInflater.from(context).inflate(R.layout.feed_discover_video, (ViewGroup) this, true);
        this.g = (VkImage) findViewById(R.id.discover_video_preview);
        this.h = (VideoTextureView) findViewById(R.id.discover_video_display);
        this.i = (VkImageSimple) findViewById(R.id.discover_video_error);
    }
}
