package com.vk.clips.design.view.interests;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.vk.clips.interests.impl.ui.button.ButtonStyle;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.asp;
import xsna.bwt0;
import xsna.es00;
import xsna.iah0;
import xsna.tlo0;
import xsna.x2y;
import xsna.zrp;

/* compiled from: NextButton.kt */
/* loaded from: classes16.dex */
public final class NextButton extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    public final VkText b;
    public final VkText c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NextButton.kt */
    public static final class ClickType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClickType[] $VALUES;
        public static final ClickType NEXT;
        public static final ClickType SKIP;

        static {
            ClickType clickType = new ClickType("NEXT", 0);
            NEXT = clickType;
            ClickType clickType2 = new ClickType(BatchApiRequest.FIELD_VALUE_ON_ERROR_SKIP, 1);
            SKIP = clickType2;
            ClickType[] clickTypeArr = {clickType, clickType2};
            $VALUES = clickTypeArr;
            $ENTRIES = new asp(clickTypeArr);
        }

        public ClickType() {
            throw null;
        }

        public static ClickType valueOf(String str) {
            return (ClickType) Enum.valueOf(ClickType.class, str);
        }

        public static ClickType[] values() {
            return (ClickType[]) $VALUES.clone();
        }
    }

    /* compiled from: NextButton.kt */
    public interface a {
        void a(View view, ClickType clickType);
    }

    /* compiled from: NextButton.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonStyle.values().length];
            try {
                iArr[ButtonStyle.NEXT_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonStyle.NEXT_WITH_SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NextButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.clips_interests_next_button, this);
        this.b = (VkText) findViewById(R.id.clips_interests_next_button);
        this.c = (VkText) findViewById(R.id.clips_interests_skip_button);
        setPadding(0, 0, 0, iah0.a(24));
    }

    public final int getNextButtonArea() {
        return getPaddingBottom() + bwt0.u0(this.b);
    }

    public final int getSkipButtonArea() {
        if (bwt0.K(this.c)) {
            return iah0.a(76);
        }
        return 0;
    }

    public final void setButtonClickListener(a aVar) {
        bwt0.i0(this.b, new x2y(aVar, 21));
        bwt0.i0(this.c, new es00(aVar, 12));
    }

    public final void setButtonStyle(ButtonStyle buttonStyle) {
        int i = b.$EnumSwitchMapping$0[buttonStyle.ordinal()];
        VkText vkText = this.c;
        if (i == 1) {
            bwt0.p0(vkText, false);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bwt0.p0(vkText, true);
        }
    }

    public final void setButtonText(tlo0 tlo0Var) {
        VkText vkText = this.b;
        vkText.setText(tlo0Var.a(vkText.getContext()));
    }
}
