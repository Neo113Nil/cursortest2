package com.vk.feed.design.view.newsfeed.dzen.storyitem;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.epx;
import xsna.f4m;
import xsna.gzs;
import xsna.hn2;
import xsna.ho8;
import xsna.krv0;
import xsna.m33;
import xsna.s3q0;
import xsna.tlo0;
import xsna.zrp;

/* compiled from: DzenStoryItemView.kt */
/* loaded from: classes18.dex */
public final class DzenStoryItemView extends LinearLayout {
    public static final /* synthetic */ int i = 0;
    public a b;
    public tlo0 c;
    public tlo0 d;
    public final VkPicture e;
    public final VkImage f;
    public final VkText g;
    public final VkText h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DzenStoryItemView.kt */
    public static final class TitleStyle {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TitleStyle[] $VALUES;
        public static final TitleStyle Large;
        public static final TitleStyle Medium;

        static {
            TitleStyle titleStyle = new TitleStyle("Medium", 0);
            Medium = titleStyle;
            TitleStyle titleStyle2 = new TitleStyle("Large", 1);
            Large = titleStyle2;
            TitleStyle[] titleStyleArr = {titleStyle, titleStyle2};
            $VALUES = titleStyleArr;
            $ENTRIES = new asp(titleStyleArr);
        }

        public TitleStyle() {
            throw null;
        }

        public static TitleStyle valueOf(String str) {
            return (TitleStyle) Enum.valueOf(TitleStyle.class, str);
        }

        public static TitleStyle[] values() {
            return (TitleStyle[]) $VALUES.clone();
        }
    }

    /* compiled from: DzenStoryItemView.kt */
    public interface a {

        /* compiled from: DzenStoryItemView.kt */
        /* renamed from: com.vk.feed.design.view.newsfeed.dzen.storyitem.DzenStoryItemView$a$a, reason: collision with other inner class name */
        public static final class C1052a implements a {
            public final String a;

            public C1052a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1052a) && epx.f(this.a, ((C1052a) obj).a);
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Image(url="), this.a, ')');
            }
        }
    }

    /* compiled from: DzenStoryItemView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TitleStyle.values().length];
            try {
                iArr[TitleStyle.Medium.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TitleStyle.Large.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DzenStoryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.dzen_story_item_view, this);
        VkPicture vkPicture = (VkPicture) findViewById(R.id.dzen_story_picture);
        this.e = vkPicture;
        VkImage vkImage = (VkImage) findViewById(R.id.dzen_story_image);
        this.f = vkImage;
        this.g = (VkText) findViewById(R.id.dzen_story_item_title);
        this.h = (VkText) findViewById(R.id.dzen_story_item_subtitle);
        if (vkPicture != null) {
            setUpPicture(vkPicture);
        }
        if (vkImage != null) {
            setUpImage(vkImage);
        }
    }

    private final void setUpImage(VkImage vkImage) {
        vkImage.setPlaceholderImage(new ColorDrawable(krv0.m(R.attr.vk_ui_image_placeholder, getContext())));
    }

    private final void setUpPicture(VkPicture vkPicture) {
        ColorDrawable colorDrawable = new ColorDrawable(krv0.m(R.attr.vk_ui_image_placeholder, getContext()));
        vkPicture.setCornerRadius(VkPicture.CornerRadius.Medium);
        vkPicture.setPlaceholderImage(colorDrawable);
    }

    public final a getContent() {
        return this.b;
    }

    public final tlo0 getSubtitle() {
        return this.d;
    }

    public final tlo0 getTitle() {
        return this.c;
    }

    public final void setContent(a aVar) {
        this.b = aVar;
        VkImage vkImage = this.f;
        VkPicture vkPicture = this.e;
        if (aVar == null) {
            if (vkPicture != null) {
                f4m.j(vkPicture);
            }
            if (vkImage != null) {
                f4m.j(vkImage);
                return;
            }
            return;
        }
        if (!(aVar instanceof a.C1052a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (vkPicture != null) {
            vkPicture.setVisibility(0);
        }
        if (vkPicture != null) {
            vkPicture.o0(((a.C1052a) aVar).a, null);
        }
        if (vkImage != null) {
            vkImage.setVisibility(0);
        }
        if (vkImage != null) {
            vkImage.o0(((a.C1052a) aVar).a, null);
        }
    }

    public final void setOnSubtitleClickListener(gzs<s3q0> gzsVar) {
        hn2 hn2Var = new hn2(gzsVar, 3);
        VkText vkText = this.h;
        vkText.setOnClickListener(hn2Var);
        vkText.setBackground(m33.a(R.drawable.highlight, getContext()));
    }

    public final void setSubtitle(tlo0 tlo0Var) {
        this.d = tlo0Var;
        VkText vkText = this.h;
        if (tlo0Var == null) {
            f4m.j(vkText);
        } else {
            vkText.setVisibility(0);
            vkText.setText(tlo0Var.a(getContext()));
        }
    }

    public final void setTitle(tlo0 tlo0Var) {
        this.c = tlo0Var;
        VkText vkText = this.g;
        if (tlo0Var == null) {
            f4m.j(vkText);
        } else {
            vkText.setVisibility(0);
            vkText.setText(tlo0Var.a(getContext()));
        }
    }

    public final void setTitleStyle(TitleStyle titleStyle) {
        int i2 = b.$EnumSwitchMapping$0[titleStyle.ordinal()];
        VkText vkText = this.g;
        if (i2 == 1) {
            vkText.setTextAppearance(R.style.VkUiTypography_ParagraphNormal);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            vkText.setTextAppearance(R.style.VkUiTypography_DisplayTitle3SemiBold);
        }
    }
}
