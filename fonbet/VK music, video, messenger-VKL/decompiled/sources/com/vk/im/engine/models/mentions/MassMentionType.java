package com.vk.im.engine.models.mentions;

import java.util.List;
import xsna.asp;
import xsna.e43;
import xsna.eok;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MassMentionType.kt */
/* loaded from: classes2.dex */
public final class MassMentionType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MassMentionType[] $VALUES;
    public static final MassMentionType ALL;
    public static final MassMentionType ONLINE;
    private final List<String> alias;

    static {
        MassMentionType massMentionType = new MassMentionType("ALL", 0, e43.l("all", "everyone", "все"));
        ALL = massMentionType;
        MassMentionType massMentionType2 = new MassMentionType("ONLINE", 1, e43.l(eok.ONLINE_EXTRAS_KEY, "here", "тут", "здесь"));
        ONLINE = massMentionType2;
        MassMentionType[] massMentionTypeArr = {massMentionType, massMentionType2};
        $VALUES = massMentionTypeArr;
        $ENTRIES = new asp(massMentionTypeArr);
    }

    public MassMentionType(String str, int i, List list) {
        this.alias = list;
    }

    public static MassMentionType valueOf(String str) {
        return (MassMentionType) Enum.valueOf(MassMentionType.class, str);
    }

    public static MassMentionType[] values() {
        return (MassMentionType[]) $VALUES.clone();
    }

    public final List<String> h() {
        return this.alias;
    }
}
