package com.vk.core.view.components.rating;

import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.iah0;
import xsna.sxe0;

/* compiled from: VkRatingBarDefaults.kt */
/* loaded from: classes17.dex */
public final class b {

    /* compiled from: VkRatingBarDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RatingBar$Size.values().length];
            try {
                iArr[RatingBar$Size.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RatingBar$Size.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RatingBar$Size.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static sxe0 a(RatingBar$Size ratingBar$Size) {
        int i = a.$EnumSwitchMapping$0[ratingBar$Size.ordinal()];
        if (i == 1) {
            float f = 1;
            return new sxe0(iah0.a(16), R.drawable.vk_icon_favorite_16, iah0.a(f), iah0.a(f));
        }
        if (i == 2) {
            return new sxe0(iah0.a(20), R.drawable.vk_icon_favorite_20, iah0.a(1), iah0.a(2));
        }
        if (i == 3) {
            return new sxe0(iah0.a(36), R.drawable.vk_icon_favorite_36, iah0.a(4), iah0.a(10));
        }
        throw new NoWhenBranchMatchedException();
    }
}
