package com.vk.clips.sdk.shared.item.clip.overlay.default_impl.mappers.helpers;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InlineNpsMappingHelper.kt */
/* loaded from: classes17.dex */
public final class InlineNpsMappingHelper$RenderType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ InlineNpsMappingHelper$RenderType[] $VALUES;
    public static final InlineNpsMappingHelper$RenderType None;
    public static final InlineNpsMappingHelper$RenderType Overlay;
    public static final InlineNpsMappingHelper$RenderType View;

    static {
        InlineNpsMappingHelper$RenderType inlineNpsMappingHelper$RenderType = new InlineNpsMappingHelper$RenderType("None", 0);
        None = inlineNpsMappingHelper$RenderType;
        InlineNpsMappingHelper$RenderType inlineNpsMappingHelper$RenderType2 = new InlineNpsMappingHelper$RenderType("View", 1);
        View = inlineNpsMappingHelper$RenderType2;
        InlineNpsMappingHelper$RenderType inlineNpsMappingHelper$RenderType3 = new InlineNpsMappingHelper$RenderType("Overlay", 2);
        Overlay = inlineNpsMappingHelper$RenderType3;
        InlineNpsMappingHelper$RenderType[] inlineNpsMappingHelper$RenderTypeArr = {inlineNpsMappingHelper$RenderType, inlineNpsMappingHelper$RenderType2, inlineNpsMappingHelper$RenderType3};
        $VALUES = inlineNpsMappingHelper$RenderTypeArr;
        $ENTRIES = new asp(inlineNpsMappingHelper$RenderTypeArr);
    }

    public InlineNpsMappingHelper$RenderType() {
        throw null;
    }

    public static InlineNpsMappingHelper$RenderType valueOf(String str) {
        return (InlineNpsMappingHelper$RenderType) Enum.valueOf(InlineNpsMappingHelper$RenderType.class, str);
    }

    public static InlineNpsMappingHelper$RenderType[] values() {
        return (InlineNpsMappingHelper$RenderType[]) $VALUES.clone();
    }
}
