package com.vk.stickers.utils;

import android.content.Context;
import android.widget.TextView;
import com.vk.dto.stickers.Price;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vk.stickers.views.sticker.StickerPackPrice;
import com.vk.vas.design.view.VkDiscountTextView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bhu;
import xsna.enj;
import xsna.epx;
import xsna.f4m;
import xsna.ho8;
import xsna.zrp;

/* compiled from: StickerPackButtonUtils.kt */
/* loaded from: classes6.dex */
public final class StickerPackButtonUtils {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StickerPackButtonUtils.kt */
    public static final class ButtonState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ButtonState[] $VALUES;
        public static final ButtonState ADDED;
        public static final ButtonState CAN_BUY;
        public static final ButtonState CAN_GET_FREE;
        public static final ButtonState CAN_GET_FREE_BY_GIFT;
        public static final ButtonState DETAILED;

        static {
            ButtonState buttonState = new ButtonState("ADDED", 0);
            ADDED = buttonState;
            ButtonState buttonState2 = new ButtonState("CAN_BUY", 1);
            CAN_BUY = buttonState2;
            ButtonState buttonState3 = new ButtonState("CAN_GET_FREE", 2);
            CAN_GET_FREE = buttonState3;
            ButtonState buttonState4 = new ButtonState("CAN_GET_FREE_BY_GIFT", 3);
            CAN_GET_FREE_BY_GIFT = buttonState4;
            ButtonState buttonState5 = new ButtonState("DETAILED", 4);
            DETAILED = buttonState5;
            ButtonState[] buttonStateArr = {buttonState, buttonState2, buttonState3, buttonState4, buttonState5};
            $VALUES = buttonStateArr;
            $ENTRIES = new asp(buttonStateArr);
        }

        public ButtonState() {
            throw null;
        }

        public static ButtonState valueOf(String str) {
            return (ButtonState) Enum.valueOf(ButtonState.class, str);
        }

        public static ButtonState[] values() {
            return (ButtonState[]) $VALUES.clone();
        }
    }

    /* compiled from: StickerPackButtonUtils.kt */
    public static final class a {
        public final boolean a;
        public final String b;
        public final String c;

        public a(boolean z, String str, String str2) {
            this.a = z;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PriceInfo(hasDiscount=");
            sb.append(this.a);
            sb.append(", currentPrice=");
            sb.append(this.b);
            sb.append(", oldPrice=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: StickerPackButtonUtils.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonState.values().length];
            try {
                iArr[ButtonState.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonState.CAN_BUY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonState.CAN_GET_FREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonState.CAN_GET_FREE_BY_GIFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonState.DETAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(Context context, ButtonState buttonState, VkDiscountTextView vkDiscountTextView, TextView textView, a aVar) {
        int i = b.$EnumSwitchMapping$0[buttonState.ordinal()];
        if (i == 1) {
            f4m.j(textView);
            vkDiscountTextView.setButtonStyle(VkDiscountTextView.ButtonStyle.MUTED);
            vkDiscountTextView.setText(context.getString(R.string.sticker_added));
            vkDiscountTextView.setEnabled(false);
            return;
        }
        if (i == 2) {
            vkDiscountTextView.setButtonStyle(VkDiscountTextView.ButtonStyle.COMMERCE);
            boolean z = aVar.a;
            String str = aVar.b;
            if (z) {
                textView.setVisibility(0);
                String str2 = aVar.c;
                if (str != null && str2 != null) {
                    vkDiscountTextView.e(str, str2);
                }
            } else {
                f4m.j(textView);
                if (str == null) {
                    str = "";
                }
                vkDiscountTextView.e(str, "");
            }
            vkDiscountTextView.setEnabled(true);
            return;
        }
        if (i == 3) {
            f4m.j(textView);
            vkDiscountTextView.setButtonStyle(VkDiscountTextView.ButtonStyle.PRIMARY);
            vkDiscountTextView.setText(context.getString(R.string.sticker_add));
            vkDiscountTextView.setEnabled(true);
            return;
        }
        if (i == 4) {
            f4m.j(textView);
            vkDiscountTextView.setButtonStyle(VkDiscountTextView.ButtonStyle.COMMERCE);
            vkDiscountTextView.setText(context.getString(R.string.price_free));
            vkDiscountTextView.setEnabled(true);
            return;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        f4m.j(textView);
        if (vkDiscountTextView != null) {
            vkDiscountTextView.setButtonStyle(VkDiscountTextView.ButtonStyle.MUTED);
        }
        vkDiscountTextView.setText(context.getString(R.string.sticker_detailed));
        vkDiscountTextView.setEnabled(true);
    }

    public static boolean b(StickerStockItem stickerStockItem) {
        return !(stickerStockItem.Ib() || stickerStockItem.Hb()) || stickerStockItem.b == 10101;
    }

    public static void c(Context context, StickerStockItem stickerStockItem, VkDiscountTextView vkDiscountTextView, TextView textView) {
        Price.PriceInfo Eb;
        Price price = stickerStockItem.n;
        boolean b2 = b(stickerStockItem);
        boolean z = stickerStockItem.i;
        boolean z2 = stickerStockItem.m;
        boolean z3 = stickerStockItem.h;
        ButtonState buttonState = (!b2 || z3) ? z3 ? ButtonState.ADDED : (z2 || (Eb = price.Eb()) == null || Eb.zb() != 0 || !z) ? (!z || z2) ? ButtonState.CAN_GET_FREE : ButtonState.CAN_BUY : ButtonState.CAN_GET_FREE_BY_GIFT : ButtonState.DETAILED;
        boolean Fb = stickerStockItem.Fb();
        Price.PriceInfo Eb2 = price.Eb();
        String Ab = Eb2 != null ? Eb2.Ab() : null;
        Price.PriceInfo Bb = price.Bb();
        a(context, buttonState, vkDiscountTextView, textView, new a(Fb, Ab, Bb != null ? Integer.valueOf(Bb.zb()).toString() : null));
    }

    public static void d(Context context, StickerPackPreview stickerPackPreview, VkDiscountTextView vkDiscountTextView, TextView textView) {
        Integer num;
        StickerPackPrice stickerPackPrice = stickerPackPreview.o;
        boolean g = bhu.g(stickerPackPreview);
        boolean z = stickerPackPreview.h;
        boolean z2 = stickerPackPreview.g;
        ButtonState buttonState = (g || z2) ? z2 ? ButtonState.ADDED : (bhu.f(stickerPackPreview) || stickerPackPrice == null || stickerPackPrice.b != 0 || !z) ? (!z || bhu.f(stickerPackPreview)) ? ButtonState.CAN_GET_FREE : ButtonState.CAN_BUY : ButtonState.CAN_GET_FREE_BY_GIFT : ButtonState.DETAILED;
        boolean e = bhu.e(stickerPackPreview);
        String str = null;
        String f = stickerPackPrice != null ? enj.f(R.plurals.pack_price, stickerPackPrice.b, context) : null;
        if (stickerPackPrice != null && (num = stickerPackPrice.c) != null) {
            str = num.toString();
        }
        a(context, buttonState, vkDiscountTextView, textView, new a(e, f, str));
    }
}
