package com.vk.catalog2.common.dto.ui.market;

import com.unity3d.ads.BuildConfig;
import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UIBlockMarketItemStyle.kt */
/* loaded from: classes16.dex */
public final class UIBlockMarketItemStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UIBlockMarketItemStyle[] $VALUES;
    public static final a Companion;
    public static final UIBlockMarketItemStyle DEFAULT;
    public static final UIBlockMarketItemStyle MARKET_ITEM_ARTIST;
    public static final UIBlockMarketItemStyle MARKET_ITEM_COMMUNITY;
    private final boolean showOwner;
    private final String value;

    /* compiled from: UIBlockMarketItemStyle.kt */
    public static final class a {
        public static UIBlockMarketItemStyle a(String str) {
            Object obj;
            Iterator<E> it = UIBlockMarketItemStyle.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((UIBlockMarketItemStyle) obj).j(), str)) {
                    break;
                }
            }
            UIBlockMarketItemStyle uIBlockMarketItemStyle = (UIBlockMarketItemStyle) obj;
            return uIBlockMarketItemStyle == null ? UIBlockMarketItemStyle.DEFAULT : uIBlockMarketItemStyle;
        }
    }

    static {
        UIBlockMarketItemStyle uIBlockMarketItemStyle = new UIBlockMarketItemStyle("MARKET_ITEM_COMMUNITY", 0, "market_item_community", false);
        MARKET_ITEM_COMMUNITY = uIBlockMarketItemStyle;
        UIBlockMarketItemStyle uIBlockMarketItemStyle2 = new UIBlockMarketItemStyle("MARKET_ITEM_ARTIST", 1, "artist_merch", false);
        MARKET_ITEM_ARTIST = uIBlockMarketItemStyle2;
        UIBlockMarketItemStyle uIBlockMarketItemStyle3 = new UIBlockMarketItemStyle("DEFAULT", 2, BuildConfig.FLAVOR, true);
        DEFAULT = uIBlockMarketItemStyle3;
        UIBlockMarketItemStyle[] uIBlockMarketItemStyleArr = {uIBlockMarketItemStyle, uIBlockMarketItemStyle2, uIBlockMarketItemStyle3};
        $VALUES = uIBlockMarketItemStyleArr;
        $ENTRIES = new asp(uIBlockMarketItemStyleArr);
        Companion = new a();
    }

    public UIBlockMarketItemStyle(String str, int i, String str2, boolean z) {
        this.value = str2;
        this.showOwner = z;
    }

    public static zrp<UIBlockMarketItemStyle> h() {
        return $ENTRIES;
    }

    public static UIBlockMarketItemStyle valueOf(String str) {
        return (UIBlockMarketItemStyle) Enum.valueOf(UIBlockMarketItemStyle.class, str);
    }

    public static UIBlockMarketItemStyle[] values() {
        return (UIBlockMarketItemStyle[]) $VALUES.clone();
    }

    public final boolean i() {
        return this.showOwner;
    }

    public final String j() {
        return this.value;
    }
}
