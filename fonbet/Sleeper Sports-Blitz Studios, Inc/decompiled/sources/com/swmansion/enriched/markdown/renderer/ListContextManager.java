package com.swmansion.enriched.markdown.renderer;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.swmansion.enriched.markdown.renderer.BlockStyleContext;
import com.swmansion.enriched.markdown.styles.ListStyle;
import com.swmansion.enriched.markdown.styles.StyleConfig;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ListContextManager.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0001J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tJ\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/swmansion/enriched/markdown/renderer/ListContextManager;", "", "context", "Lcom/swmansion/enriched/markdown/renderer/BlockStyleContext;", "styleConfig", "Lcom/swmansion/enriched/markdown/styles/StyleConfig;", "<init>", "(Lcom/swmansion/enriched/markdown/renderer/BlockStyleContext;Lcom/swmansion/enriched/markdown/styles/StyleConfig;)V", "enterList", "Lcom/swmansion/enriched/markdown/renderer/ListContextManager$ListEntryState;", "listType", "Lcom/swmansion/enriched/markdown/renderer/BlockStyleContext$ListType;", "style", "exitList", "", "entryState", "restoreParentListContext", "parentListType", "ListEntryState", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ListContextManager {
    private final BlockStyleContext context;
    private final StyleConfig styleConfig;

    /* compiled from: ListContextManager.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockStyleContext.ListType.values().length];
            try {
                iArr[BlockStyleContext.ListType.ORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockStyleContext.ListType.UNORDERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ListContextManager(BlockStyleContext context, StyleConfig styleConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(styleConfig, "styleConfig");
        this.context = context;
        this.styleConfig = styleConfig;
    }

    /* compiled from: ListContextManager.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/swmansion/enriched/markdown/renderer/ListContextManager$ListEntryState;", "", "previousDepth", "", "parentListType", "Lcom/swmansion/enriched/markdown/renderer/BlockStyleContext$ListType;", "wasNestedInOrderedList", "", "<init>", "(ILcom/swmansion/enriched/markdown/renderer/BlockStyleContext$ListType;Z)V", "getPreviousDepth", "()I", "getParentListType", "()Lcom/swmansion/enriched/markdown/renderer/BlockStyleContext$ListType;", "getWasNestedInOrderedList", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ListEntryState {
        private final BlockStyleContext.ListType parentListType;
        private final int previousDepth;
        private final boolean wasNestedInOrderedList;

        public static /* synthetic */ ListEntryState copy$default(ListEntryState listEntryState, int i, BlockStyleContext.ListType listType, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = listEntryState.previousDepth;
            }
            if ((i2 & 2) != 0) {
                listType = listEntryState.parentListType;
            }
            if ((i2 & 4) != 0) {
                z = listEntryState.wasNestedInOrderedList;
            }
            return listEntryState.copy(i, listType, z);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPreviousDepth() {
            return this.previousDepth;
        }

        /* renamed from: component2, reason: from getter */
        public final BlockStyleContext.ListType getParentListType() {
            return this.parentListType;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getWasNestedInOrderedList() {
            return this.wasNestedInOrderedList;
        }

        public final ListEntryState copy(int previousDepth, BlockStyleContext.ListType parentListType, boolean wasNestedInOrderedList) {
            return new ListEntryState(previousDepth, parentListType, wasNestedInOrderedList);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ListEntryState)) {
                return false;
            }
            ListEntryState listEntryState = (ListEntryState) other;
            return this.previousDepth == listEntryState.previousDepth && this.parentListType == listEntryState.parentListType && this.wasNestedInOrderedList == listEntryState.wasNestedInOrderedList;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.previousDepth) * 31;
            BlockStyleContext.ListType listType = this.parentListType;
            return ((hashCode + (listType == null ? 0 : listType.hashCode())) * 31) + Boolean.hashCode(this.wasNestedInOrderedList);
        }

        public String toString() {
            return "ListEntryState(previousDepth=" + this.previousDepth + ", parentListType=" + this.parentListType + ", wasNestedInOrderedList=" + this.wasNestedInOrderedList + ")";
        }

        public ListEntryState(int i, BlockStyleContext.ListType listType, boolean z) {
            this.previousDepth = i;
            this.parentListType = listType;
            this.wasNestedInOrderedList = z;
        }

        public final int getPreviousDepth() {
            return this.previousDepth;
        }

        public final BlockStyleContext.ListType getParentListType() {
            return this.parentListType;
        }

        public final boolean getWasNestedInOrderedList() {
            return this.wasNestedInOrderedList;
        }
    }

    public final ListEntryState enterList(BlockStyleContext.ListType listType, Object style) {
        Intrinsics.checkNotNullParameter(listType, "listType");
        Intrinsics.checkNotNullParameter(style, "style");
        int listDepth = this.context.getListDepth();
        boolean z = false;
        boolean z2 = listDepth > 0;
        BlockStyleContext.ListType listType2 = z2 ? this.context.getListType() : null;
        boolean z3 = listType2 == BlockStyleContext.ListType.ORDERED;
        if (z2 && z3) {
            this.context.pushOrderedListItemNumber();
        }
        this.context.setListDepth(listDepth + 1);
        int i = WhenMappings.$EnumSwitchMapping$0[listType.ordinal()];
        if (i == 1) {
            this.context.setOrderedListStyle((ListStyle) style);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.context.setUnorderedListStyle((ListStyle) style);
        }
        this.context.resetListItemNumber();
        if (z2 && z3) {
            z = true;
        }
        return new ListEntryState(listDepth, listType2, z);
    }

    public final void exitList(ListEntryState entryState) {
        Intrinsics.checkNotNullParameter(entryState, "entryState");
        this.context.clearListStyle();
        this.context.setListDepth(entryState.getPreviousDepth());
        if (entryState.getWasNestedInOrderedList()) {
            this.context.popOrderedListItemNumber();
        }
        if (entryState.getPreviousDepth() > 0) {
            restoreParentListContext(entryState.getParentListType());
        }
    }

    private final void restoreParentListContext(BlockStyleContext.ListType parentListType) {
        int i = parentListType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[parentListType.ordinal()];
        if (i != -1) {
            if (i == 1) {
                this.context.setOrderedListStyle(this.styleConfig.getListStyle());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                this.context.setUnorderedListStyle(this.styleConfig.getListStyle());
            }
        }
    }
}
