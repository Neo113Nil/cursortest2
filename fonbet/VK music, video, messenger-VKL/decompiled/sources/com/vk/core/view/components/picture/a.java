package com.vk.core.view.components.picture;

import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.picture.VkPictureOverlay;

/* compiled from: Picture.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[VkPicture.CornerRadius.values().length];
        try {
            iArr[VkPicture.CornerRadius.Small.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VkPicture.CornerRadius.Medium.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VkPicture.CornerRadius.Large.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[VkPictureOverlay.Tint.values().length];
        try {
            iArr2[VkPictureOverlay.Tint.Dark.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[VkPictureOverlay.Tint.Light.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[VkPictureOverlay.Tint.MatchAppTheme.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
