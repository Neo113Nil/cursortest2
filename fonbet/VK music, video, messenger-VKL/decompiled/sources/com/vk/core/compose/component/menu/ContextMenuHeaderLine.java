package com.vk.core.compose.component.menu;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkContextMenu.kt */
/* loaded from: classes17.dex */
public final class ContextMenuHeaderLine {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ContextMenuHeaderLine[] $VALUES;
    public static final ContextMenuHeaderLine Multiline;
    public static final ContextMenuHeaderLine Oneline;
    private final int maxLines;

    static {
        ContextMenuHeaderLine contextMenuHeaderLine = new ContextMenuHeaderLine("Oneline", 0, 1);
        Oneline = contextMenuHeaderLine;
        ContextMenuHeaderLine contextMenuHeaderLine2 = new ContextMenuHeaderLine("Multiline", 1, 3);
        Multiline = contextMenuHeaderLine2;
        ContextMenuHeaderLine[] contextMenuHeaderLineArr = {contextMenuHeaderLine, contextMenuHeaderLine2};
        $VALUES = contextMenuHeaderLineArr;
        $ENTRIES = new asp(contextMenuHeaderLineArr);
    }

    public ContextMenuHeaderLine(String str, int i, int i2) {
        this.maxLines = i2;
    }

    public static ContextMenuHeaderLine valueOf(String str) {
        return (ContextMenuHeaderLine) Enum.valueOf(ContextMenuHeaderLine.class, str);
    }

    public static ContextMenuHeaderLine[] values() {
        return (ContextMenuHeaderLine[]) $VALUES.clone();
    }
}
