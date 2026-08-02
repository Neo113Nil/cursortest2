package com.vk.feed.design.view.newsfeed.discover.photo;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.vk.core.tool.view.FlowLayout;
import com.vk.core.tool.view.RatioView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.feed.design.view.newsfeed.discover.description.FeedDiscoverDescriptionView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.cpy;
import xsna.epx;
import xsna.f4m;
import xsna.ho8;
import xsna.n6n;
import xsna.zrp;

/* compiled from: FeedPhotoDiscoverItemView.kt */
/* loaded from: classes18.dex */
public final class FeedPhotoDiscoverItemView extends FrameLayout {
    public FeedDiscoverDescriptionView.TextStyle b;
    public int c;
    public TextUtils.TruncateAt d;
    public int e;
    public TextUtils.TruncateAt f;
    public VkImage g;
    public FeedDiscoverDescriptionView h;
    public RatioView i;
    public FlowLayout j;
    public b k;
    public a l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FeedPhotoDiscoverItemView.kt */
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

    /* compiled from: FeedPhotoDiscoverItemView.kt */
    public interface a {

        /* compiled from: FeedPhotoDiscoverItemView.kt */
        /* renamed from: com.vk.feed.design.view.newsfeed.discover.photo.FeedPhotoDiscoverItemView$a$a, reason: collision with other inner class name */
        public static final class C1047a implements a {
            public final String a;
            public final String b;

            public C1047a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1047a)) {
                    return false;
                }
                C1047a c1047a = (C1047a) obj;
                return epx.f(this.a, c1047a.a) && epx.f(this.b, c1047a.b);
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

    /* compiled from: FeedPhotoDiscoverItemView.kt */
    public interface b {

        /* compiled from: FeedPhotoDiscoverItemView.kt */
        public static final class a implements b {
            public final String a;
            public final String b;

            public a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }
        }
    }

    /* compiled from: FeedPhotoDiscoverItemView.kt */
    public static final /* synthetic */ class c {
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

    @Override // android.view.View
    public final a getBottom() {
        return this.l;
    }

    public final b getContent() {
        return this.k;
    }

    public final void setBottom(a aVar) {
        this.l = aVar;
        if (aVar == null) {
            RatioView ratioView = this.i;
            if (ratioView != null) {
                f4m.j(ratioView);
            }
            FeedDiscoverDescriptionView feedDiscoverDescriptionView = this.h;
            if (feedDiscoverDescriptionView != null) {
                f4m.j(feedDiscoverDescriptionView);
                return;
            }
            return;
        }
        if (!(aVar instanceof a.C1047a)) {
            throw new NoWhenBranchMatchedException();
        }
        a.C1047a c1047a = (a.C1047a) aVar;
        RatioView ratioView2 = this.i;
        if (ratioView2 == null) {
            ratioView2 = new RatioView(getContext(), null, 6);
            FrameLayout.LayoutParams a2 = cpy.a(-1, -2, 0, 0, 0, 0, 60);
            a2.gravity = 80;
            ratioView2.setId(R.id.discover_grid_item_shadow);
            ratioView2.setRatio(1.6f);
            ratioView2.setOrientation(0);
            ratioView2.setBackground(new n6n());
            this.i = ratioView2;
            addView(ratioView2, a2);
        }
        FeedDiscoverDescriptionView feedDiscoverDescriptionView2 = this.h;
        if (feedDiscoverDescriptionView2 == null) {
            feedDiscoverDescriptionView2 = new FeedDiscoverDescriptionView(getContext());
            FrameLayout.LayoutParams a3 = cpy.a(-1, -2, 0, 0, 0, 0, 60);
            a3.gravity = 80;
            feedDiscoverDescriptionView2.setId(R.id.discover_grid_item_description);
            feedDiscoverDescriptionView2.setGravity(80);
            feedDiscoverDescriptionView2.d(this.b);
            feedDiscoverDescriptionView2.b(this.c, this.d);
            feedDiscoverDescriptionView2.a(this.e, this.f);
            this.h = feedDiscoverDescriptionView2;
            addView(feedDiscoverDescriptionView2, a3);
        }
        ratioView2.setVisibility(0);
        feedDiscoverDescriptionView2.setVisibility(0);
        feedDiscoverDescriptionView2.setTitle(c1047a.a);
        feedDiscoverDescriptionView2.setSubtitle(c1047a.b);
    }

    public final void setContent(b bVar) {
        this.k = bVar;
        if (!(bVar instanceof b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        this.g.o0(((b.a) bVar).a, null);
    }

    public final void setDontLoadAgainIfSameResource(boolean z) {
        this.g.setDontLoadAgainIfSameResource(z);
    }

    public final void setPlaceholder(Drawable drawable) {
        this.g.setPlaceholderImage(drawable);
    }

    public final void setTextStyle(TextStyle textStyle) {
        FeedDiscoverDescriptionView.TextStyle textStyle2;
        int i = c.$EnumSwitchMapping$0[textStyle.ordinal()];
        if (i == 1) {
            textStyle2 = FeedDiscoverDescriptionView.TextStyle.Medium;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textStyle2 = FeedDiscoverDescriptionView.TextStyle.Small;
        }
        this.b = textStyle2;
        FeedDiscoverDescriptionView feedDiscoverDescriptionView = this.h;
        if (feedDiscoverDescriptionView != null) {
            feedDiscoverDescriptionView.d(textStyle2);
        }
    }
}
