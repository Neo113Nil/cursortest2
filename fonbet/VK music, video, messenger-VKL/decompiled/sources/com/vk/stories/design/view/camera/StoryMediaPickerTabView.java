package com.vk.stories.design.view.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.bwt0;
import xsna.d8k;
import xsna.egt;
import xsna.isn0;
import xsna.izs;
import xsna.jjc;
import xsna.s3q0;

/* compiled from: StoryMediaPickerTabView.kt */
/* loaded from: classes6.dex */
public final class StoryMediaPickerTabView extends FrameLayout {
    public static final /* synthetic */ int i = 0;
    public final VkText b;
    public final View c;
    public final VkText d;
    public final View e;
    public final View f;
    public final VkCounter g;
    public izs<? super StoryTabType, s3q0> h;

    /* compiled from: StoryMediaPickerTabView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryTabType.values().length];
            try {
                iArr[StoryTabType.GALLERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryTabType.TEMPLATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoryTabType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StoryMediaPickerTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(bwt0.u(context), R.layout.view_story_media_picker_tabs, this);
        this.f = findViewById(R.id.story_placeholder_tab_container);
        this.b = (VkText) findViewById(R.id.story_gallery_tab);
        View findViewById = findViewById(R.id.story_gallery_indicator);
        this.c = findViewById;
        b(findViewById, true);
        this.d = (VkText) findViewById(R.id.story_template_tab);
        View findViewById2 = findViewById(R.id.story_template_indicator);
        this.e = findViewById2;
        b(findViewById2, false);
        VkCounter vkCounter = (VkCounter) findViewById(R.id.story_template_counter);
        vkCounter.setAppearance(new VkCounter.CounterAppearance.a(R.attr.vk_ui_accent_orange_fire, R.attr.vk_ui_text_contrast));
        this.g = vkCounter;
    }

    public static void b(View view, boolean z) {
        view.setBackground(new isn0(view.getContext().getColor(R.color.vk_azure_A100), z ? 8 : 4));
    }

    public final void a(StoryTabType storyTabType) {
        int i2 = a.$EnumSwitchMapping$0[storyTabType.ordinal()];
        VkText vkText = this.d;
        VkText vkText2 = this.b;
        View view = this.e;
        View view2 = this.c;
        if (i2 == 1) {
            view2.setVisibility(0);
            view.setVisibility(8);
            vkText2.setSelected(true);
            vkText.setSelected(false);
            return;
        }
        if (i2 == 2) {
            view2.setVisibility(8);
            view.setVisibility(0);
            vkText2.setSelected(false);
            vkText.setSelected(true);
            return;
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        view2.setVisibility(8);
        view.setVisibility(8);
        vkText2.setSelected(false);
        vkText.setSelected(false);
    }

    public final void setCountNewTemplate(int i2) {
        boolean z = i2 != 0;
        VkCounter vkCounter = this.g;
        bwt0.p0(vkCounter, z);
        vkCounter.setCounterWithoutAnimation(i2);
    }

    public final void setOnClick(izs<? super StoryTabType, s3q0> izsVar) {
        this.h = izsVar;
        jjc.g(this.b, new d8k(izsVar, 5));
        jjc.g(this.d, new egt(izsVar, 3));
    }
}
