package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import com.vk.stat.scheme.SchemeStat$TypeView;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeGameCatalogItem implements SchemeStat$TypeNavgo.b, SchemeStat$NavigationScreenInfoItem.b, SchemeStat$TypeView.b {

    @pmi0("section_array")
    private final List<Long> sectionArray;

    @pmi0("section_inner_index")
    private final Integer sectionInnerIndex;

    @pmi0("section_track_code")
    private final String sectionTrackCode;

    @pmi0("subtype")
    private final Subtype subtype;

    @pmi0("target_section_id")
    private final Integer targetSectionId;

    @pmi0("track_code")
    private final CommonStat$TypeTrackCodeItem trackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Subtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Subtype[] $VALUES;

        @pmi0("app_view")
        public static final Subtype APP_VIEW;

        @pmi0("section_view")
        public static final Subtype SECTION_VIEW;

        static {
            Subtype subtype = new Subtype("SECTION_VIEW", 0);
            SECTION_VIEW = subtype;
            Subtype subtype2 = new Subtype("APP_VIEW", 1);
            APP_VIEW = subtype2;
            Subtype[] subtypeArr = {subtype, subtype2};
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

    public SchemeStat$TypeGameCatalogItem(String str, Subtype subtype, CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, Integer num, Integer num2, List<Long> list) {
        this.sectionTrackCode = str;
        this.subtype = subtype;
        this.trackCode = commonStat$TypeTrackCodeItem;
        this.sectionInnerIndex = num;
        this.targetSectionId = num2;
        this.sectionArray = list;
    }

    public final Integer a() {
        return this.sectionInnerIndex;
    }

    public final String b() {
        return this.sectionTrackCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeGameCatalogItem)) {
            return false;
        }
        SchemeStat$TypeGameCatalogItem schemeStat$TypeGameCatalogItem = (SchemeStat$TypeGameCatalogItem) obj;
        return epx.f(this.sectionTrackCode, schemeStat$TypeGameCatalogItem.sectionTrackCode) && this.subtype == schemeStat$TypeGameCatalogItem.subtype && epx.f(this.trackCode, schemeStat$TypeGameCatalogItem.trackCode) && epx.f(this.sectionInnerIndex, schemeStat$TypeGameCatalogItem.sectionInnerIndex) && epx.f(this.targetSectionId, schemeStat$TypeGameCatalogItem.targetSectionId) && epx.f(this.sectionArray, schemeStat$TypeGameCatalogItem.sectionArray);
    }

    public final int hashCode() {
        int hashCode = this.sectionTrackCode.hashCode() * 31;
        Subtype subtype = this.subtype;
        int hashCode2 = (hashCode + (subtype == null ? 0 : subtype.hashCode())) * 31;
        CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = this.trackCode;
        int hashCode3 = (hashCode2 + (commonStat$TypeTrackCodeItem == null ? 0 : commonStat$TypeTrackCodeItem.a.hashCode())) * 31;
        Integer num = this.sectionInnerIndex;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.targetSectionId;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Long> list = this.sectionArray;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeGameCatalogItem(sectionTrackCode=");
        sb.append(this.sectionTrackCode);
        sb.append(", subtype=");
        sb.append(this.subtype);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", sectionInnerIndex=");
        sb.append(this.sectionInnerIndex);
        sb.append(", targetSectionId=");
        sb.append(this.targetSectionId);
        sb.append(", sectionArray=");
        return ms9.a(')', sb, this.sectionArray);
    }

    public /* synthetic */ SchemeStat$TypeGameCatalogItem(String str, Subtype subtype, CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, Integer num, Integer num2, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : subtype, (i & 4) != 0 ? null : commonStat$TypeTrackCodeItem, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : list);
    }
}
