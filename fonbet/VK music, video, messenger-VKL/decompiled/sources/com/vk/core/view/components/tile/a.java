package com.vk.core.view.components.tile;

import com.vk.core.view.components.tile.VkTile;

/* compiled from: TileDefaults.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;
    public static final /* synthetic */ int[] $EnumSwitchMapping$3;
    public static final /* synthetic */ int[] $EnumSwitchMapping$4;

    static {
        int[] iArr = new int[VkTile.VisualContentType.values().length];
        try {
            iArr[VkTile.VisualContentType.Avatar.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VkTile.VisualContentType.Other.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[VkTile.BottomPaddingPreset.values().length];
        try {
            iArr2[VkTile.BottomPaddingPreset.Default.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[VkTile.BottomPaddingPreset.Grid3Columns.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[VkTile.BottomPaddingPreset.Grid2Columns.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[VkTile.VisualAndTextGap.values().length];
        try {
            iArr3[VkTile.VisualAndTextGap.Default.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[VkTile.VisualAndTextGap.Grid2Or3Columns.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        $EnumSwitchMapping$2 = iArr3;
        int[] iArr4 = new int[VkTile.TextSize.values().length];
        try {
            iArr4[VkTile.TextSize.Small.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[VkTile.TextSize.Medium.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        $EnumSwitchMapping$3 = iArr4;
        int[] iArr5 = new int[VkTile.TextAlignment.values().length];
        try {
            iArr5[VkTile.TextAlignment.Start.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr5[VkTile.TextAlignment.Center.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        $EnumSwitchMapping$4 = iArr5;
    }
}
