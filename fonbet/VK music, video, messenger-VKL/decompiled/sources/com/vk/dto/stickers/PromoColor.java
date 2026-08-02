package com.vk.dto.stickers;

import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PromoColor.kt */
/* loaded from: classes18.dex */
public final class PromoColor {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PromoColor[] $VALUES;
    public static final PromoColor BLUE;
    public static final a Companion;
    public static final PromoColor GRAY;
    public static final PromoColor RED;
    private final String value;

    /* compiled from: PromoColor.kt */
    public static final class a {
        public static PromoColor a(String str) {
            Object obj;
            Iterator<E> it = PromoColor.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((PromoColor) obj).i(), str)) {
                    break;
                }
            }
            return (PromoColor) obj;
        }
    }

    static {
        PromoColor promoColor = new PromoColor("BLUE", 0, "blue");
        BLUE = promoColor;
        PromoColor promoColor2 = new PromoColor("GRAY", 1, "gray");
        GRAY = promoColor2;
        PromoColor promoColor3 = new PromoColor("RED", 2, "red");
        RED = promoColor3;
        PromoColor[] promoColorArr = {promoColor, promoColor2, promoColor3};
        $VALUES = promoColorArr;
        $ENTRIES = new asp(promoColorArr);
        Companion = new a();
    }

    public PromoColor(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<PromoColor> h() {
        return $ENTRIES;
    }

    public static PromoColor valueOf(String str) {
        return (PromoColor) Enum.valueOf(PromoColor.class, str);
    }

    public static PromoColor[] values() {
        return (PromoColor[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }
}
