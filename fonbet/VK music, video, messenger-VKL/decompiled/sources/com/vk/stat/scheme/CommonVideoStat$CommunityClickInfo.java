package com.vk.stat.scheme;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$CommunityClickInfo {

    @pmi0(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)
    private final Direction direction;

    @pmi0("has_live")
    private final boolean hasLive;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class Direction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;

        @pmi0("to_author")
        public static final Direction TO_AUTHOR;

        @pmi0("to_player_live")
        public static final Direction TO_PLAYER_LIVE;

        static {
            Direction direction = new Direction("TO_AUTHOR", 0);
            TO_AUTHOR = direction;
            Direction direction2 = new Direction("TO_PLAYER_LIVE", 1);
            TO_PLAYER_LIVE = direction2;
            Direction[] directionArr = {direction, direction2};
            $VALUES = directionArr;
            $ENTRIES = new asp(directionArr);
        }

        private Direction(String str, int i) {
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    public CommonVideoStat$CommunityClickInfo(boolean z, Direction direction) {
        this.hasLive = z;
        this.direction = direction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$CommunityClickInfo)) {
            return false;
        }
        CommonVideoStat$CommunityClickInfo commonVideoStat$CommunityClickInfo = (CommonVideoStat$CommunityClickInfo) obj;
        return this.hasLive == commonVideoStat$CommunityClickInfo.hasLive && this.direction == commonVideoStat$CommunityClickInfo.direction;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.hasLive) * 31;
        Direction direction = this.direction;
        return hashCode + (direction == null ? 0 : direction.hashCode());
    }

    public final String toString() {
        return "CommunityClickInfo(hasLive=" + this.hasLive + ", direction=" + this.direction + ')';
    }

    public /* synthetic */ CommonVideoStat$CommunityClickInfo(boolean z, Direction direction, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : direction);
    }
}
