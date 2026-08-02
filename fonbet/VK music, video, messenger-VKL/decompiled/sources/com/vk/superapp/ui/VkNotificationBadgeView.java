package com.vk.superapp.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* compiled from: VkNotificationBadgeView.kt */
/* loaded from: classes6.dex */
public final class VkNotificationBadgeView extends AppCompatImageView {
    public float b;
    public final Drawable c;
    public final Drawable d;
    public final Drawable e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkNotificationBadgeView.kt */
    public static final class BadgeType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BadgeType[] $VALUES;
        public static final BadgeType DISCOUNT;
        public static final BadgeType GIFT;
        public static final BadgeType UPDATE;

        static {
            BadgeType badgeType = new BadgeType("GIFT", 0);
            GIFT = badgeType;
            BadgeType badgeType2 = new BadgeType("DISCOUNT", 1);
            DISCOUNT = badgeType2;
            BadgeType badgeType3 = new BadgeType(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_UPDATE, 2);
            UPDATE = badgeType3;
            BadgeType[] badgeTypeArr = {badgeType, badgeType2, badgeType3};
            $VALUES = badgeTypeArr;
            $ENTRIES = new asp(badgeTypeArr);
        }

        public BadgeType() {
            throw null;
        }

        public static BadgeType valueOf(String str) {
            return (BadgeType) Enum.valueOf(BadgeType.class, str);
        }

        public static BadgeType[] values() {
            return (BadgeType[]) $VALUES.clone();
        }
    }

    /* compiled from: VkNotificationBadgeView.kt */
    public final class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            if (view == null || outline == null) {
                return;
            }
            VkNotificationBadgeView vkNotificationBadgeView = VkNotificationBadgeView.this;
            outline.setRoundRect(-((int) vkNotificationBadgeView.getTopRightCornerRadius()), 0, view.getWidth(), view.getHeight() + ((int) vkNotificationBadgeView.getTopRightCornerRadius()), vkNotificationBadgeView.getTopRightCornerRadius());
        }
    }

    /* compiled from: VkNotificationBadgeView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BadgeType.values().length];
            try {
                iArr[BadgeType.GIFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BadgeType.DISCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BadgeType.UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VkNotificationBadgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setClipToOutline(true);
        setOutlineProvider(new a());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
        try {
            setTopRightCornerRadius(obtainStyledAttributes.getDimension(3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            this.c = obtainStyledAttributes.getDrawable(1);
            this.d = obtainStyledAttributes.getDrawable(0);
            this.e = obtainStyledAttributes.getDrawable(2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final float getTopRightCornerRadius() {
        return this.b;
    }

    public final void setTopRightCornerRadius(float f) {
        if (this.b == f) {
            return;
        }
        this.b = f;
        invalidateOutline();
        invalidate();
    }
}
