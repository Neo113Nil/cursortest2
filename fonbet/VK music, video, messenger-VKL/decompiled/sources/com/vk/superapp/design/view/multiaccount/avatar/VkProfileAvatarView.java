package com.vk.superapp.design.view.multiaccount.avatar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.picture.c;
import com.vk.utils.vectordrawable.EnhancedVectorDrawable;
import com.vk.utils.vectordrawable.VectorPath;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.hnj;
import xsna.idu0;
import xsna.krv0;
import xsna.zrp;

/* compiled from: VkProfileAvatarView.kt */
/* loaded from: classes6.dex */
public final class VkProfileAvatarView extends FrameLayout {
    public ProtectionIndicatorType b;
    public final VkAvatar c;
    public final ImageView d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkProfileAvatarView.kt */
    public static final class ProtectionIndicatorType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ProtectionIndicatorType[] $VALUES;
        public static final ProtectionIndicatorType ORANGE;
        public static final ProtectionIndicatorType RED;

        static {
            ProtectionIndicatorType protectionIndicatorType = new ProtectionIndicatorType("ORANGE", 0);
            ORANGE = protectionIndicatorType;
            ProtectionIndicatorType protectionIndicatorType2 = new ProtectionIndicatorType("RED", 1);
            RED = protectionIndicatorType2;
            ProtectionIndicatorType[] protectionIndicatorTypeArr = {protectionIndicatorType, protectionIndicatorType2};
            $VALUES = protectionIndicatorTypeArr;
            $ENTRIES = new asp(protectionIndicatorTypeArr);
        }

        public ProtectionIndicatorType() {
            throw null;
        }

        public static ProtectionIndicatorType valueOf(String str) {
            return (ProtectionIndicatorType) Enum.valueOf(ProtectionIndicatorType.class, str);
        }

        public static ProtectionIndicatorType[] values() {
            return (ProtectionIndicatorType[]) $VALUES.clone();
        }
    }

    public VkProfileAvatarView(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), attributeSet, 0);
        LayoutInflater.from(getContext()).inflate(R.layout.vk_auth_ecostystem_avatar_view_layout, this);
        VkAvatar vkAvatar = (VkAvatar) findViewById(R.id.ecosystem_profile_avatar_view);
        this.c = vkAvatar;
        this.d = (ImageView) findViewById(R.id.notification_icon);
        vkAvatar.setContent(new c.a(R.drawable.vk_icon_user_28, R.attr.vk_ui_icon_tertiary));
        setClipChildren(false);
        setClipToPadding(false);
    }

    public final ProtectionIndicatorType getType() {
        return this.b;
    }

    public final void setType(ProtectionIndicatorType protectionIndicatorType) {
        int i;
        this.b = protectionIndicatorType;
        VkAvatar vkAvatar = this.c;
        ImageView imageView = this.d;
        if (protectionIndicatorType == null) {
            vkAvatar.setBorder(null);
            imageView.setVisibility(8);
            return;
        }
        Context context = getContext();
        int i2 = a.$EnumSwitchMapping$0[protectionIndicatorType.ordinal()];
        if (i2 == 1) {
            i = R.attr.vk_ui_accent_orange;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.attr.vk_ui_background_negative;
        }
        int m = krv0.m(i, context);
        vkAvatar.W0(new idu0(m, 4), false);
        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(getContext().getResources(), R.drawable.vk_icon_error_shield_20);
        VectorPath findPath = enhancedVectorDrawable.findPath("path_1");
        if (findPath != null) {
            findPath.setFillColor(m);
        }
        imageView.setImageDrawable(enhancedVectorDrawable);
        imageView.setColorFilter(m);
        imageView.setVisibility(0);
    }
}
