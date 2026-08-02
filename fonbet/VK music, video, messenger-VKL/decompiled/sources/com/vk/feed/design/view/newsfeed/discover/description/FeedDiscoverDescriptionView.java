package com.vk.feed.design.view.newsfeed.discover.description;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.cn70;
import xsna.f4m;
import xsna.zrp;

/* compiled from: FeedDiscoverDescriptionView.kt */
/* loaded from: classes18.dex */
public final class FeedDiscoverDescriptionView extends LinearLayout {
    public final VkText b;
    public final VkText c;
    public TextStyle d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FeedDiscoverDescriptionView.kt */
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

    /* compiled from: FeedDiscoverDescriptionView.kt */
    public static final /* synthetic */ class a {
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

    public FeedDiscoverDescriptionView(Context context) {
        super(context, null, 0);
        this.d = TextStyle.Medium;
        LayoutInflater.from(context).inflate(R.layout.feed_discover_description, (ViewGroup) this, true);
        setOrientation(1);
        this.b = (VkText) findViewById(R.id.discover_grid_item_title);
        this.c = (VkText) findViewById(R.id.discover_grid_item_subtitle);
        c(this.d);
    }

    public final void a(int i, TextUtils.TruncateAt truncateAt) {
        VkText vkText = this.c;
        vkText.setMaxLines(i);
        vkText.setEllipsize(truncateAt);
    }

    public final void b(int i, TextUtils.TruncateAt truncateAt) {
        VkText vkText = this.b;
        vkText.setMaxLines(i);
        vkText.setEllipsize(truncateAt);
    }

    public final void c(TextStyle textStyle) {
        int i = a.$EnumSwitchMapping$0[textStyle.ordinal()];
        VkText vkText = this.b;
        VkText vkText2 = this.c;
        if (i == 1) {
            vkText.setTextAppearance(R.style.VkUiTypography_SubheadSemiBold);
            vkText2.setTextAppearance(R.style.VkUiTypography_FootnoteNormal);
            vkText2.setAlpha(1.0f);
            f4m.t(cn70.b(4), vkText2);
            int b = cn70.b(16);
            setPadding(b, b, b, b);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        vkText.setTextAppearance(R.style.VkUiTypography_Caption3Normal);
        vkText2.setTextAppearance(R.style.VkUiTypography_Caption3Normal);
        vkText2.setAlpha(0.6f);
        f4m.t(cn70.b(0), vkText2);
        int b2 = cn70.b(8);
        setPadding(b2, b2, b2, b2);
    }

    public final void d(TextStyle textStyle) {
        if (this.d != textStyle) {
            setTextStyle(textStyle);
        }
    }

    public final TextStyle getTextStyle() {
        return this.d;
    }

    public final void setSubtitle(String str) {
        VkText vkText = this.c;
        if (str == null || str.length() == 0) {
            f4m.j(vkText);
        } else {
            vkText.setVisibility(0);
            vkText.setText(str);
        }
    }

    public final void setTextStyle(TextStyle textStyle) {
        this.d = textStyle;
        c(textStyle);
    }

    public final void setTitle(String str) {
        VkText vkText = this.b;
        if (str == null || str.length() == 0) {
            f4m.j(vkText);
        } else {
            vkText.setVisibility(0);
            vkText.setText(str);
        }
    }
}
