package com.vk.catalog2.common.dto.api;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogCustomAttributes.kt */
/* loaded from: classes16.dex */
public final class CatalogCustomAttributes$Keys {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogCustomAttributes$Keys[] $VALUES;
    public static final CatalogCustomAttributes$Keys STYLE;
    private final String key = TtmlNode.TAG_STYLE;

    static {
        CatalogCustomAttributes$Keys catalogCustomAttributes$Keys = new CatalogCustomAttributes$Keys();
        STYLE = catalogCustomAttributes$Keys;
        CatalogCustomAttributes$Keys[] catalogCustomAttributes$KeysArr = {catalogCustomAttributes$Keys};
        $VALUES = catalogCustomAttributes$KeysArr;
        $ENTRIES = new asp(catalogCustomAttributes$KeysArr);
    }

    public static CatalogCustomAttributes$Keys valueOf(String str) {
        return (CatalogCustomAttributes$Keys) Enum.valueOf(CatalogCustomAttributes$Keys.class, str);
    }

    public static CatalogCustomAttributes$Keys[] values() {
        return (CatalogCustomAttributes$Keys[]) $VALUES.clone();
    }

    public final String h() {
        return this.key;
    }
}
