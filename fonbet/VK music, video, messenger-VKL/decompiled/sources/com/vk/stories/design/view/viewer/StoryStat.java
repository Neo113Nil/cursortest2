package com.vk.stories.design.view.viewer;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.story.viewer.impl.R$styleable;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bwt0;
import xsna.dhr0;
import xsna.iah0;
import xsna.y1z;
import xsna.zrp;

/* compiled from: StoryStat.kt */
/* loaded from: classes6.dex */
public final class StoryStat extends LinearLayout {
    public final VkText b;
    public final VkImageSimple c;
    public FeedbackIcon d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoryStat.kt */
    public static final class FeedbackIcon {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FeedbackIcon[] $VALUES;
        public static final FeedbackIcon ANSWERS;
        public static final FeedbackIcon LIKES;
        public static final FeedbackIcon VIEWERS;

        static {
            FeedbackIcon feedbackIcon = new FeedbackIcon("VIEWERS", 0);
            VIEWERS = feedbackIcon;
            FeedbackIcon feedbackIcon2 = new FeedbackIcon("LIKES", 1);
            LIKES = feedbackIcon2;
            FeedbackIcon feedbackIcon3 = new FeedbackIcon("ANSWERS", 2);
            ANSWERS = feedbackIcon3;
            FeedbackIcon[] feedbackIconArr = {feedbackIcon, feedbackIcon2, feedbackIcon3};
            $VALUES = feedbackIconArr;
            $ENTRIES = new asp(feedbackIconArr);
        }

        public FeedbackIcon() {
            throw null;
        }

        public static zrp<FeedbackIcon> h() {
            return $ENTRIES;
        }

        public static FeedbackIcon valueOf(String str) {
            return (FeedbackIcon) Enum.valueOf(FeedbackIcon.class, str);
        }

        public static FeedbackIcon[] values() {
            return (FeedbackIcon[]) $VALUES.clone();
        }
    }

    /* compiled from: StoryStat.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FeedbackIcon.values().length];
            try {
                iArr[FeedbackIcon.VIEWERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FeedbackIcon.LIKES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FeedbackIcon.ANSWERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoryStat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i = y1z.a;
        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        this.d = FeedbackIcon.VIEWERS;
        setOrientation(0);
        setGravity(17);
        VkImageSimple vkImageSimple = new VkImageSimple(context, null, 6, 0);
        vkImageSimple.setImportantForAccessibility(2);
        vkImageSimple.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        float f = 32;
        vkImageSimple.setLayoutParams(new LinearLayout.LayoutParams(iah0.a(f), iah0.a(f)));
        this.c = vkImageSimple;
        VkText vkText = new VkText(new ContextThemeWrapper(context, R.style.VkUiTypography_Caption1), null, 6, 0);
        vkText.setId(R.id.stats_count_text_view);
        vkText.setImportantForAccessibility(2);
        vkText.setTextColor(dhr0.Y(R.attr.vk_ui_text_primary_alpha, context));
        vkText.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.b = vkText;
        addView(vkImageSimple);
        addView(vkText);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.c, 0, 0);
        setIcon((FeedbackIcon) FeedbackIcon.h().get(obtainStyledAttributes.getInteger(0, 0)));
        obtainStyledAttributes.recycle();
    }

    public final FeedbackIcon getIcon() {
        return this.d;
    }

    public final void setIcon(FeedbackIcon feedbackIcon) {
        this.d = feedbackIcon;
        setIconFeedback(feedbackIcon);
    }

    public final void setIconFeedback(FeedbackIcon feedbackIcon) {
        int i;
        int i2 = a.$EnumSwitchMapping$0[feedbackIcon.ordinal()];
        if (i2 == 1) {
            i = R.drawable.vk_icon_eye_reaction_32;
        } else if (i2 == 2) {
            i = R.drawable.vk_icon_heart_reaction_32;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.vk_icon_bubble_reaction_32;
        }
        VkImageSimple vkImageSimple = this.c;
        vkImageSimple.setImageResource(i);
        vkImageSimple.invalidate();
    }

    public final void setText(String str) {
        this.b.setText(str);
        bwt0.p0(this, str.length() > 0);
    }
}
