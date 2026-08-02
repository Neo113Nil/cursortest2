package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeMarketService implements SchemeStat$TypeNavgo.b, SchemeStat$NavigationScreenInfoItem.b {

    @pmi0("album_id")
    private final Integer albumId;

    @pmi0("section_id")
    private final String sectionId;

    @pmi0("subtype")
    private final Subtype subtype;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Subtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Subtype[] $VALUES;

        @pmi0("transition_to_services")
        public static final Subtype TRANSITION_TO_SERVICES;

        @pmi0("transition_to_services_album")
        public static final Subtype TRANSITION_TO_SERVICES_ALBUM;

        @pmi0("transition_to_services_item")
        public static final Subtype TRANSITION_TO_SERVICES_ITEM;

        @pmi0("transition_to_services_section")
        public static final Subtype TRANSITION_TO_SERVICES_SECTION;

        static {
            Subtype subtype = new Subtype("TRANSITION_TO_SERVICES", 0);
            TRANSITION_TO_SERVICES = subtype;
            Subtype subtype2 = new Subtype("TRANSITION_TO_SERVICES_ALBUM", 1);
            TRANSITION_TO_SERVICES_ALBUM = subtype2;
            Subtype subtype3 = new Subtype("TRANSITION_TO_SERVICES_ITEM", 2);
            TRANSITION_TO_SERVICES_ITEM = subtype3;
            Subtype subtype4 = new Subtype("TRANSITION_TO_SERVICES_SECTION", 3);
            TRANSITION_TO_SERVICES_SECTION = subtype4;
            Subtype[] subtypeArr = {subtype, subtype2, subtype3, subtype4};
            $VALUES = subtypeArr;
            $ENTRIES = new asp(subtypeArr);
        }

        private Subtype(String str, int i) {
        }

        public static Subtype valueOf(String str) {
            return (Subtype) Enum.valueOf(Subtype.class, str);
        }

        public static Subtype[] values() {
            return (Subtype[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeMarketService() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeMarketService)) {
            return false;
        }
        SchemeStat$TypeMarketService schemeStat$TypeMarketService = (SchemeStat$TypeMarketService) obj;
        return this.subtype == schemeStat$TypeMarketService.subtype && epx.f(this.albumId, schemeStat$TypeMarketService.albumId) && epx.f(this.sectionId, schemeStat$TypeMarketService.sectionId);
    }

    public final int hashCode() {
        Subtype subtype = this.subtype;
        int hashCode = (subtype == null ? 0 : subtype.hashCode()) * 31;
        Integer num = this.albumId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.sectionId;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketService(subtype=");
        sb.append(this.subtype);
        sb.append(", albumId=");
        sb.append(this.albumId);
        sb.append(", sectionId=");
        return ho8.a(sb, this.sectionId, ')');
    }

    public SchemeStat$TypeMarketService(Subtype subtype, Integer num, String str) {
        this.subtype = subtype;
        this.albumId = num;
        this.sectionId = str;
    }

    public /* synthetic */ SchemeStat$TypeMarketService(Subtype subtype, Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : subtype, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str);
    }
}
