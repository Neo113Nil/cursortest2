package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$LegalNoticeType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SchemeStat$LegalNoticeType[] $VALUES;

    @pmi0("recom_systems_usage")
    public static final SchemeStat$LegalNoticeType RECOM_SYSTEMS_USAGE;

    static {
        SchemeStat$LegalNoticeType schemeStat$LegalNoticeType = new SchemeStat$LegalNoticeType("RECOM_SYSTEMS_USAGE", 0);
        RECOM_SYSTEMS_USAGE = schemeStat$LegalNoticeType;
        SchemeStat$LegalNoticeType[] schemeStat$LegalNoticeTypeArr = {schemeStat$LegalNoticeType};
        $VALUES = schemeStat$LegalNoticeTypeArr;
        $ENTRIES = new asp(schemeStat$LegalNoticeTypeArr);
    }

    private SchemeStat$LegalNoticeType(String str, int i) {
    }

    public static SchemeStat$LegalNoticeType valueOf(String str) {
        return (SchemeStat$LegalNoticeType) Enum.valueOf(SchemeStat$LegalNoticeType.class, str);
    }

    public static SchemeStat$LegalNoticeType[] values() {
        return (SchemeStat$LegalNoticeType[]) $VALUES.clone();
    }
}
