package com.swmansion.enriched.markdown.renderer;

import com.swmansion.enriched.markdown.styles.BaseBlockStyle;
import com.swmansion.enriched.markdown.styles.BlockquoteStyle;
import com.swmansion.enriched.markdown.styles.CodeBlockStyle;
import com.swmansion.enriched.markdown.styles.HeadingStyle;
import com.swmansion.enriched.markdown.styles.ListStyle;
import com.swmansion.enriched.markdown.styles.ParagraphStyle;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlockStyleContext.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001?B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020\u000eH\u0002J\u000e\u0010(\u001a\u00020#2\u0006\u0010%\u001a\u00020)J\u0016\u0010*\u001a\u00020#2\u0006\u0010%\u001a\u00020+2\u0006\u0010,\u001a\u00020\u000eJ\u000e\u0010-\u001a\u00020#2\u0006\u0010%\u001a\u00020.J\u000e\u0010/\u001a\u00020#2\u0006\u0010%\u001a\u000200J\u000e\u00101\u001a\u00020#2\u0006\u0010%\u001a\u000200J\u000e\u00102\u001a\u00020#2\u0006\u0010%\u001a\u000203J\u0006\u00104\u001a\u000205J\u0006\u00106\u001a\u00020#J\u0006\u00107\u001a\u00020#J\u0006\u00108\u001a\u00020#J\u0006\u00109\u001a\u00020#J\u0006\u0010:\u001a\u00020#J\b\u0010;\u001a\u00020#H\u0002J\u0006\u0010<\u001a\u00020\fJ\u0006\u0010=\u001a\u00020#J\u0006\u0010>\u001a\u00020#R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0!X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/swmansion/enriched/markdown/renderer/BlockStyleContext;", "", "<init>", "()V", "value", "Lcom/swmansion/enriched/markdown/renderer/BlockType;", "currentBlockType", "getCurrentBlockType", "()Lcom/swmansion/enriched/markdown/renderer/BlockType;", "mutableBlockStyle", "Lcom/swmansion/enriched/markdown/renderer/MutableBlockStyle;", "cachedBlockStyle", "Lcom/swmansion/enriched/markdown/renderer/BlockStyle;", "currentHeadingLevel", "", "blockquoteDepth", "getBlockquoteDepth", "()I", "setBlockquoteDepth", "(I)V", "listDepth", "getListDepth", "setListDepth", "listType", "Lcom/swmansion/enriched/markdown/renderer/BlockStyleContext$ListType;", "getListType", "()Lcom/swmansion/enriched/markdown/renderer/BlockStyleContext$ListType;", "setListType", "(Lcom/swmansion/enriched/markdown/renderer/BlockStyleContext$ListType;)V", "listItemNumber", "getListItemNumber", "setListItemNumber", "orderedListItemNumbers", "Lkotlin/collections/ArrayDeque;", "updateBlockStyle", "", "type", "style", "Lcom/swmansion/enriched/markdown/styles/BaseBlockStyle;", "headingLevel", "setParagraphStyle", "Lcom/swmansion/enriched/markdown/styles/ParagraphStyle;", "setHeadingStyle", "Lcom/swmansion/enriched/markdown/styles/HeadingStyle;", "level", "setBlockquoteStyle", "Lcom/swmansion/enriched/markdown/styles/BlockquoteStyle;", "setUnorderedListStyle", "Lcom/swmansion/enriched/markdown/styles/ListStyle;", "setOrderedListStyle", "setCodeBlockStyle", "Lcom/swmansion/enriched/markdown/styles/CodeBlockStyle;", "isInsideBlockElement", "", "incrementListItemNumber", "resetListItemNumber", "pushOrderedListItemNumber", "popOrderedListItemNumber", "clearListStyle", MetricTracker.Object.RESET, "requireBlockStyle", "clearBlockStyle", "resetForNewRender", "ListType", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BlockStyleContext {
    private int blockquoteDepth;
    private BlockStyle cachedBlockStyle;
    private int currentHeadingLevel;
    private int listDepth;
    private int listItemNumber;
    private ListType listType;
    private BlockType currentBlockType = BlockType.NONE;
    private final MutableBlockStyle mutableBlockStyle = new MutableBlockStyle();
    private final ArrayDeque<Integer> orderedListItemNumbers = new ArrayDeque<>();

    public final BlockType getCurrentBlockType() {
        return this.currentBlockType;
    }

    public final int getBlockquoteDepth() {
        return this.blockquoteDepth;
    }

    public final void setBlockquoteDepth(int i) {
        this.blockquoteDepth = i;
    }

    public final int getListDepth() {
        return this.listDepth;
    }

    public final void setListDepth(int i) {
        this.listDepth = i;
    }

    public final ListType getListType() {
        return this.listType;
    }

    public final void setListType(ListType listType) {
        this.listType = listType;
    }

    public final int getListItemNumber() {
        return this.listItemNumber;
    }

    public final void setListItemNumber(int i) {
        this.listItemNumber = i;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BlockStyleContext.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/swmansion/enriched/markdown/renderer/BlockStyleContext$ListType;", "", "<init>", "(Ljava/lang/String;I)V", "UNORDERED", "ORDERED", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ListType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ListType[] $VALUES;
        public static final ListType UNORDERED = new ListType("UNORDERED", 0);
        public static final ListType ORDERED = new ListType("ORDERED", 1);

        private static final /* synthetic */ ListType[] $values() {
            return new ListType[]{UNORDERED, ORDERED};
        }

        public static EnumEntries<ListType> getEntries() {
            return $ENTRIES;
        }

        static {
            ListType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private ListType(String str, int i) {
        }

        public static ListType valueOf(String str) {
            return (ListType) Enum.valueOf(ListType.class, str);
        }

        public static ListType[] values() {
            return (ListType[]) $VALUES.clone();
        }
    }

    static /* synthetic */ void updateBlockStyle$default(BlockStyleContext blockStyleContext, BlockType blockType, BaseBlockStyle baseBlockStyle, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        blockStyleContext.updateBlockStyle(blockType, baseBlockStyle, i);
    }

    private final void updateBlockStyle(BlockType type, BaseBlockStyle style, int headingLevel) {
        this.currentBlockType = type;
        this.currentHeadingLevel = headingLevel;
        this.mutableBlockStyle.updateFrom(style);
        this.cachedBlockStyle = null;
    }

    public final void setParagraphStyle(ParagraphStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        updateBlockStyle$default(this, BlockType.PARAGRAPH, style, 0, 4, null);
    }

    public final void setHeadingStyle(HeadingStyle style, int level) {
        Intrinsics.checkNotNullParameter(style, "style");
        updateBlockStyle(BlockType.HEADING, style, level);
    }

    public final void setBlockquoteStyle(BlockquoteStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        updateBlockStyle$default(this, BlockType.BLOCKQUOTE, style, 0, 4, null);
    }

    public final void setUnorderedListStyle(ListStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.listType = ListType.UNORDERED;
        updateBlockStyle$default(this, BlockType.UNORDERED_LIST, style, 0, 4, null);
    }

    public final void setOrderedListStyle(ListStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.listType = ListType.ORDERED;
        updateBlockStyle$default(this, BlockType.ORDERED_LIST, style, 0, 4, null);
    }

    public final void setCodeBlockStyle(CodeBlockStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        updateBlockStyle$default(this, BlockType.CODE_BLOCK, style, 0, 4, null);
    }

    public final boolean isInsideBlockElement() {
        return this.blockquoteDepth > 0 || this.listDepth > 0;
    }

    public final void incrementListItemNumber() {
        this.listItemNumber++;
    }

    public final void resetListItemNumber() {
        this.listItemNumber = 0;
    }

    public final void pushOrderedListItemNumber() {
        this.orderedListItemNumbers.addLast(Integer.valueOf(this.listItemNumber));
    }

    public final void popOrderedListItemNumber() {
        if (this.orderedListItemNumbers.isEmpty()) {
            return;
        }
        this.listItemNumber = this.orderedListItemNumbers.removeLast().intValue();
    }

    public final void clearListStyle() {
        if (this.listDepth == 0) {
            reset();
        }
    }

    private final void reset() {
        clearBlockStyle();
        this.listType = null;
        this.listItemNumber = 0;
        this.orderedListItemNumbers.clear();
    }

    public final BlockStyle requireBlockStyle() {
        if (!this.mutableBlockStyle.getIsDirty()) {
            throw new IllegalStateException("BlockStyle is null. Inline renderers must be used within a block context.");
        }
        BlockStyle blockStyle = this.cachedBlockStyle;
        if (blockStyle != null) {
            return blockStyle;
        }
        BlockStyle immutable = this.mutableBlockStyle.toImmutable();
        this.cachedBlockStyle = immutable;
        return immutable;
    }

    public final void clearBlockStyle() {
        this.currentBlockType = BlockType.NONE;
        this.mutableBlockStyle.clear();
        this.cachedBlockStyle = null;
        this.currentHeadingLevel = 0;
    }

    public final void resetForNewRender() {
        this.currentBlockType = BlockType.NONE;
        this.mutableBlockStyle.clear();
        this.cachedBlockStyle = null;
        this.currentHeadingLevel = 0;
        this.blockquoteDepth = 0;
        this.listDepth = 0;
        this.listType = null;
        this.listItemNumber = 0;
        this.orderedListItemNumbers.clear();
    }
}
