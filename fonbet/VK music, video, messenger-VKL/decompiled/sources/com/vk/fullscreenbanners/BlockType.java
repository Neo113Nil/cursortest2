package com.vk.fullscreenbanners;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BlockType.kt */
/* loaded from: classes16.dex */
public final class BlockType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BlockType[] $VALUES;
    public static final BlockType BUTTON;
    public static final a Companion;
    public static final BlockType IMAGE;
    public static final BlockType TEXT;
    public static final BlockType TITLE;
    public static final BlockType UNKNOWN;
    private final String type;

    /* compiled from: BlockType.kt */
    public static final class a {
        public static BlockType a(String str) {
            BlockType blockType = BlockType.TITLE;
            if (str.equals(blockType.h())) {
                return blockType;
            }
            BlockType blockType2 = BlockType.IMAGE;
            if (str.equals(blockType2.h())) {
                return blockType2;
            }
            BlockType blockType3 = BlockType.TEXT;
            if (str.equals(blockType3.h())) {
                return blockType3;
            }
            BlockType blockType4 = BlockType.BUTTON;
            return str.equals(blockType4.h()) ? blockType4 : BlockType.UNKNOWN;
        }
    }

    static {
        BlockType blockType = new BlockType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, "unknown");
        UNKNOWN = blockType;
        BlockType blockType2 = new BlockType(NativeAdContent.ViewTag.AD_TITLE, 1, "title");
        TITLE = blockType2;
        BlockType blockType3 = new BlockType("IMAGE", 2, "image");
        IMAGE = blockType3;
        BlockType blockType4 = new BlockType("BUTTON", 3, "button");
        BUTTON = blockType4;
        BlockType blockType5 = new BlockType("TEXT", 4, "text");
        TEXT = blockType5;
        BlockType[] blockTypeArr = {blockType, blockType2, blockType3, blockType4, blockType5};
        $VALUES = blockTypeArr;
        $ENTRIES = new asp(blockTypeArr);
        Companion = new a();
    }

    public BlockType(String str, int i, String str2) {
        this.type = str2;
    }

    public static BlockType valueOf(String str) {
        return (BlockType) Enum.valueOf(BlockType.class, str);
    }

    public static BlockType[] values() {
        return (BlockType[]) $VALUES.clone();
    }

    public final String h() {
        return this.type;
    }
}
