package com.vk.core.view.components.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.too0;

/* compiled from: VkTabsIndicator.kt */
/* loaded from: classes17.dex */
public final class VkTabsIndicator extends View implements too0 {
    public Tab$Mode b;

    /* compiled from: VkTabsIndicator.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Tab$Mode.values().length];
            try {
                iArr[Tab$Mode.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Tab$Mode.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Tab$Mode.Accent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VkTabsIndicator(Context context) {
        this(context, null, 0, 14, 0);
    }

    @Override // xsna.too0
    public final void Ng() {
        setMode(this.b);
    }

    public final void setMode(Tab$Mode tab$Mode) {
        int i;
        getContext();
        int i2 = a.$EnumSwitchMapping$0[tab$Mode.ordinal()];
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (i2 == 1) {
            i = R.drawable.ds_internal_tabs_default_indicator;
        } else if (i2 == 2) {
            i = R.drawable.ds_internal_tabs_secondary_indicator;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f = getContext().getResources().getDimension(R.dimen.vk_ui_elevation_one);
            i = R.drawable.ds_internal_tabs_accent_indicator;
        }
        setBackground(getContext().getDrawable(i));
        setElevation(f);
        this.b = tab$Mode;
    }

    public VkTabsIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public VkTabsIndicator(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ VkTabsIndicator(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public VkTabsIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = Tab$Mode.Default;
    }
}
