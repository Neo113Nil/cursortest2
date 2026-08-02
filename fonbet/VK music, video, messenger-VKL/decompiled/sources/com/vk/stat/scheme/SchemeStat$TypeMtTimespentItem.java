package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeMtTimespentItem implements SchemeStat$TypeAction.b {

    @pmi0("activity_id")
    private final int activityId;

    @pmi0("end_time")
    private final Long endTime;

    @pmi0("spent_type")
    private final SpentType spentType;

    @pmi0("start_time")
    private final Long startTime;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class SpentType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SpentType[] $VALUES;

        @pmi0("count")
        public static final SpentType COUNT;

        @pmi0("time")
        public static final SpentType TIME;

        static {
            SpentType spentType = new SpentType("TIME", 0);
            TIME = spentType;
            SpentType spentType2 = new SpentType("COUNT", 1);
            COUNT = spentType2;
            SpentType[] spentTypeArr = {spentType, spentType2};
            $VALUES = spentTypeArr;
            $ENTRIES = new asp(spentTypeArr);
        }

        private SpentType(String str, int i) {
        }

        public static SpentType valueOf(String str) {
            return (SpentType) Enum.valueOf(SpentType.class, str);
        }

        public static SpentType[] values() {
            return (SpentType[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeMtTimespentItem(int i, Long l, Long l2, SpentType spentType) {
        this.activityId = i;
        this.startTime = l;
        this.endTime = l2;
        this.spentType = spentType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeMtTimespentItem)) {
            return false;
        }
        SchemeStat$TypeMtTimespentItem schemeStat$TypeMtTimespentItem = (SchemeStat$TypeMtTimespentItem) obj;
        return this.activityId == schemeStat$TypeMtTimespentItem.activityId && epx.f(this.startTime, schemeStat$TypeMtTimespentItem.startTime) && epx.f(this.endTime, schemeStat$TypeMtTimespentItem.endTime) && this.spentType == schemeStat$TypeMtTimespentItem.spentType;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.activityId) * 31;
        Long l = this.startTime;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endTime;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        SpentType spentType = this.spentType;
        return hashCode3 + (spentType != null ? spentType.hashCode() : 0);
    }

    public final String toString() {
        return "TypeMtTimespentItem(activityId=" + this.activityId + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", spentType=" + this.spentType + ')';
    }

    public /* synthetic */ SchemeStat$TypeMtTimespentItem(int i, Long l, Long l2, SpentType spentType, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : l, (i2 & 4) != 0 ? null : l2, (i2 & 8) != 0 ? null : spentType);
    }
}
