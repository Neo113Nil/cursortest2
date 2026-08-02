package com.vk.dto.user;

import androidx.annotation.Keep;
import java.util.Locale;
import xsna.asp;
import xsna.cqm0;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SocialButtonType.kt */
@Keep
/* loaded from: classes18.dex */
public final class SocialButtonType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SocialButtonType[] $VALUES;
    public static final a Companion;
    public static final SocialButtonType ADD = new SocialButtonType("ADD", 0);
    public static final SocialButtonType FOLLOW = new SocialButtonType("FOLLOW", 1);

    /* compiled from: SocialButtonType.kt */
    public static final class a {
        public static SocialButtonType a(String str) {
            String a = cqm0.a(str);
            if (a == null) {
                return null;
            }
            String upperCase = a.toUpperCase(Locale.ROOT);
            for (SocialButtonType socialButtonType : SocialButtonType.values()) {
                if (epx.f(socialButtonType.name(), upperCase)) {
                    return socialButtonType;
                }
            }
            return null;
        }
    }

    private static final /* synthetic */ SocialButtonType[] $values() {
        return new SocialButtonType[]{ADD, FOLLOW};
    }

    static {
        SocialButtonType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
        Companion = new a();
    }

    private SocialButtonType(String str, int i) {
    }

    public static zrp<SocialButtonType> getEntries() {
        return $ENTRIES;
    }

    public static final SocialButtonType parse(String str) {
        Companion.getClass();
        return a.a(str);
    }

    public static SocialButtonType valueOf(String str) {
        return (SocialButtonType) Enum.valueOf(SocialButtonType.class, str);
    }

    public static SocialButtonType[] values() {
        return (SocialButtonType[]) $VALUES.clone();
    }
}
