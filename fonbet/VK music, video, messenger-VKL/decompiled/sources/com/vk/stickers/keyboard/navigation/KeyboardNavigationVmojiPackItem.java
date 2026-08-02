package com.vk.stickers.keyboard.navigation;

import com.vk.dto.common.NotificationImage;
import com.vk.dto.stickers.PromoColor;
import com.vk.dto.stickers.StickerStockItem;
import xsna.asp;
import xsna.epx;
import xsna.jgy;
import xsna.ngy;
import xsna.qoy;
import xsna.zrp;

/* compiled from: KeyboardNavigationItems.kt */
/* loaded from: classes6.dex */
public final class KeyboardNavigationVmojiPackItem extends ngy {
    public final StickerStockItem b;
    public final NotificationImage c;
    public final boolean d;
    public final boolean e;
    public final AnimationState f;
    public final PromoColor g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: KeyboardNavigationItems.kt */
    public static final class AnimationState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AnimationState[] $VALUES;
        public static final AnimationState BACKWARD;
        public static final AnimationState FORWARD;
        public static final AnimationState NONE;

        static {
            AnimationState animationState = new AnimationState("NONE", 0);
            NONE = animationState;
            AnimationState animationState2 = new AnimationState("FORWARD", 1);
            FORWARD = animationState2;
            AnimationState animationState3 = new AnimationState("BACKWARD", 2);
            BACKWARD = animationState3;
            AnimationState[] animationStateArr = {animationState, animationState2, animationState3};
            $VALUES = animationStateArr;
            $ENTRIES = new asp(animationStateArr);
        }

        public AnimationState() {
            throw null;
        }

        public static AnimationState valueOf(String str) {
            return (AnimationState) Enum.valueOf(AnimationState.class, str);
        }

        public static AnimationState[] values() {
            return (AnimationState[]) $VALUES.clone();
        }
    }

    public /* synthetic */ KeyboardNavigationVmojiPackItem(StickerStockItem stickerStockItem, NotificationImage notificationImage, boolean z, PromoColor promoColor) {
        this(stickerStockItem, notificationImage, z, false, AnimationState.NONE, promoColor);
    }

    public static KeyboardNavigationVmojiPackItem f(KeyboardNavigationVmojiPackItem keyboardNavigationVmojiPackItem, StickerStockItem stickerStockItem, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            stickerStockItem = keyboardNavigationVmojiPackItem.b;
        }
        StickerStockItem stickerStockItem2 = stickerStockItem;
        NotificationImage notificationImage = keyboardNavigationVmojiPackItem.c;
        keyboardNavigationVmojiPackItem.getClass();
        keyboardNavigationVmojiPackItem.getClass();
        keyboardNavigationVmojiPackItem.getClass();
        if ((i & 32) != 0) {
            z = keyboardNavigationVmojiPackItem.d;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            z2 = keyboardNavigationVmojiPackItem.e;
        }
        AnimationState animationState = keyboardNavigationVmojiPackItem.f;
        PromoColor promoColor = keyboardNavigationVmojiPackItem.g;
        keyboardNavigationVmojiPackItem.getClass();
        return new KeyboardNavigationVmojiPackItem(stickerStockItem2, notificationImage, z3, z2, animationState, promoColor);
    }

    @Override // xsna.jgy
    public final jgy a(boolean z) {
        return f(this, null, false, z, 447);
    }

    @Override // xsna.jgy
    public final boolean b() {
        return this.e;
    }

    @Override // xsna.ngy
    public final ngy c(boolean z) {
        return f(this, null, z, false, 479);
    }

    @Override // xsna.ngy
    public final boolean d() {
        return this.d;
    }

    @Override // xsna.ngy
    public final StickerStockItem e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardNavigationVmojiPackItem)) {
            return false;
        }
        KeyboardNavigationVmojiPackItem keyboardNavigationVmojiPackItem = (KeyboardNavigationVmojiPackItem) obj;
        return epx.f(this.b, keyboardNavigationVmojiPackItem.b) && epx.f(this.c, keyboardNavigationVmojiPackItem.c) && this.d == keyboardNavigationVmojiPackItem.d && this.e == keyboardNavigationVmojiPackItem.e && this.f == keyboardNavigationVmojiPackItem.f && this.g == keyboardNavigationVmojiPackItem.g;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        NotificationImage notificationImage = this.c;
        int hashCode2 = (this.f.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((hashCode + (notificationImage == null ? 0 : notificationImage.hashCode())) * 31, 31, false), 31, false), 31, false), 31, this.d), 31, this.e)) * 31;
        PromoColor promoColor = this.g;
        return hashCode2 + (promoColor != null ? promoColor.hashCode() : 0);
    }

    public final String toString() {
        return "KeyboardNavigationVmojiPackItem(pack=" + this.b + ", previews=" + this.c + ", isExpanded=false, isFirstVmoji=false, isLastVmoji=false, hasNotViewed=" + this.d + ", selected=" + this.e + ", selectionAnimationState=" + this.f + ", promoDotColor=" + this.g + ')';
    }

    public KeyboardNavigationVmojiPackItem(StickerStockItem stickerStockItem, NotificationImage notificationImage, boolean z, boolean z2, AnimationState animationState, PromoColor promoColor) {
        this.b = stickerStockItem;
        this.c = notificationImage;
        this.d = z;
        this.e = z2;
        this.f = animationState;
        this.g = promoColor;
    }
}
