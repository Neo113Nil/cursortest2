package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton implements SchemeStat$TypeAction.b {

    @pmi0("carousel_image_index")
    private final Integer carouselImageIndex;

    @pmi0("entry_point")
    private final EntryPoint entryPoint;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class EntryPoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        @pmi0("timer")
        public static final EntryPoint TIMER;

        static {
            EntryPoint entryPoint = new EntryPoint("TIMER", 0);
            TIMER = entryPoint;
            EntryPoint[] entryPointArr = {entryPoint};
            $VALUES = entryPointArr;
            $ENTRIES = new asp(entryPointArr);
        }

        private EntryPoint(String str, int i) {
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton mobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton = (MobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton) obj;
        return this.entryPoint == mobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton.entryPoint && epx.f(this.carouselImageIndex, mobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton.carouselImageIndex);
    }

    public final int hashCode() {
        EntryPoint entryPoint = this.entryPoint;
        int hashCode = (entryPoint == null ? 0 : entryPoint.hashCode()) * 31;
        Integer num = this.carouselImageIndex;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedShowMoreShopsButton(entryPoint=");
        sb.append(this.entryPoint);
        sb.append(", carouselImageIndex=");
        return uqi.b(sb, this.carouselImageIndex, ')');
    }

    public MobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton(EntryPoint entryPoint, Integer num) {
        this.entryPoint = entryPoint;
        this.carouselImageIndex = num;
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedShowMoreShopsButton(EntryPoint entryPoint, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : entryPoint, (i & 2) != 0 ? null : num);
    }
}
