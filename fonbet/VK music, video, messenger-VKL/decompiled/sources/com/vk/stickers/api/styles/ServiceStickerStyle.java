package com.vk.stickers.api.styles;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ServiceStickerStyle.kt */
/* loaded from: classes5.dex */
public final class ServiceStickerStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ServiceStickerStyle[] $VALUES;
    public static final ServiceStickerStyle Sticker;
    private final String value = "sticker";
    private final boolean isVisible = true;

    static {
        ServiceStickerStyle serviceStickerStyle = new ServiceStickerStyle();
        Sticker = serviceStickerStyle;
        ServiceStickerStyle[] serviceStickerStyleArr = {serviceStickerStyle};
        $VALUES = serviceStickerStyleArr;
        $ENTRIES = new asp(serviceStickerStyleArr);
    }

    public static zrp<ServiceStickerStyle> h() {
        return $ENTRIES;
    }

    public static ServiceStickerStyle valueOf(String str) {
        return (ServiceStickerStyle) Enum.valueOf(ServiceStickerStyle.class, str);
    }

    public static ServiceStickerStyle[] values() {
        return (ServiceStickerStyle[]) $VALUES.clone();
    }

    public final boolean i() {
        return this.isVisible;
    }
}
