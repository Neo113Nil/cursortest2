package com.swmansion.enriched.markdown.renderer;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BlockStyleContext.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/swmansion/enriched/markdown/renderer/BlockType;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "PARAGRAPH", "HEADING", "BLOCKQUOTE", "UNORDERED_LIST", "ORDERED_LIST", "CODE_BLOCK", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BlockType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BlockType[] $VALUES;
    public static final BlockType NONE = new BlockType("NONE", 0);
    public static final BlockType PARAGRAPH = new BlockType("PARAGRAPH", 1);
    public static final BlockType HEADING = new BlockType("HEADING", 2);
    public static final BlockType BLOCKQUOTE = new BlockType("BLOCKQUOTE", 3);
    public static final BlockType UNORDERED_LIST = new BlockType("UNORDERED_LIST", 4);
    public static final BlockType ORDERED_LIST = new BlockType("ORDERED_LIST", 5);
    public static final BlockType CODE_BLOCK = new BlockType("CODE_BLOCK", 6);

    private static final /* synthetic */ BlockType[] $values() {
        return new BlockType[]{NONE, PARAGRAPH, HEADING, BLOCKQUOTE, UNORDERED_LIST, ORDERED_LIST, CODE_BLOCK};
    }

    public static EnumEntries<BlockType> getEntries() {
        return $ENTRIES;
    }

    private BlockType(String str, int i) {
    }

    static {
        BlockType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static BlockType valueOf(String str) {
        return (BlockType) Enum.valueOf(BlockType.class, str);
    }

    public static BlockType[] values() {
        return (BlockType[]) $VALUES.clone();
    }
}
