package com.vk.superapp.catalog.api.v2.adapter;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogItem.kt */
/* loaded from: classes6.dex */
public final class BlockType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BlockType[] $VALUES;
    public static final BlockType BOTTOM;
    public static final BlockType MIDDLE;
    public static final BlockType TOP;

    static {
        BlockType blockType = new BlockType("TOP", 0);
        TOP = blockType;
        BlockType blockType2 = new BlockType("MIDDLE", 1);
        MIDDLE = blockType2;
        BlockType blockType3 = new BlockType("BOTTOM", 2);
        BOTTOM = blockType3;
        BlockType[] blockTypeArr = {blockType, blockType2, blockType3};
        $VALUES = blockTypeArr;
        $ENTRIES = new asp(blockTypeArr);
    }

    public BlockType() {
        throw null;
    }

    public static BlockType valueOf(String str) {
        return (BlockType) Enum.valueOf(BlockType.class, str);
    }

    public static BlockType[] values() {
        return (BlockType[]) $VALUES.clone();
    }
}
