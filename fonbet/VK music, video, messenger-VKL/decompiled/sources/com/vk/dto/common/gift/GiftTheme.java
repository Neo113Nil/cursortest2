package com.vk.dto.common.gift;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GiftTheme.kt */
/* loaded from: classes18.dex */
public final class GiftTheme {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GiftTheme[] $VALUES;
    public static final a Companion;
    public static final GiftTheme DARK;
    public static final GiftTheme LIGHT;
    public static final GiftTheme UNKNOWN;
    private final String value;

    /* compiled from: GiftTheme.kt */
    public static final class a {
        public static GiftTheme a(String str) {
            Object obj;
            Iterator<E> it = GiftTheme.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((GiftTheme) obj).i(), str)) {
                    break;
                }
            }
            GiftTheme giftTheme = (GiftTheme) obj;
            return giftTheme == null ? GiftTheme.UNKNOWN : giftTheme;
        }
    }

    static {
        GiftTheme giftTheme = new GiftTheme(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, "");
        UNKNOWN = giftTheme;
        GiftTheme giftTheme2 = new GiftTheme("LIGHT", 1, "light");
        LIGHT = giftTheme2;
        GiftTheme giftTheme3 = new GiftTheme("DARK", 2, "dark");
        DARK = giftTheme3;
        GiftTheme[] giftThemeArr = {giftTheme, giftTheme2, giftTheme3};
        $VALUES = giftThemeArr;
        $ENTRIES = new asp(giftThemeArr);
        Companion = new a();
    }

    public GiftTheme(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<GiftTheme> h() {
        return $ENTRIES;
    }

    public static GiftTheme valueOf(String str) {
        return (GiftTheme) Enum.valueOf(GiftTheme.class, str);
    }

    public static GiftTheme[] values() {
        return (GiftTheme[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }
}
