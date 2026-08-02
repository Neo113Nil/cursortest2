package com.vk.video.polls.nav;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.uxpolls.PollAnswer;
import com.vk.video.polls.entrypoint.model.UxPollEntryPoint;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.asp;
import xsna.epx;
import xsna.v11;
import xsna.vu5;
import xsna.zrp;

/* compiled from: PollNavParams.kt */
/* loaded from: classes6.dex */
public final class PollNavParams implements Parcelable {
    public static final Parcelable.Creator<PollNavParams> CREATOR = new b();
    public final UxPollEntryPoint b;
    public final Strategy c;
    public final Map<Integer, PollAnswer> d;
    public final int e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PollNavParams.kt */
    public static final class Strategy {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Strategy[] $VALUES;
        public static final Strategy ALL_IN_ONE;
        public static final Strategy ONE_BY_ONE_GROUPED;
        public static final Strategy ONE_IN_ONE;

        static {
            Strategy strategy = new Strategy("ALL_IN_ONE", 0);
            ALL_IN_ONE = strategy;
            Strategy strategy2 = new Strategy("ONE_BY_ONE_GROUPED", 1);
            ONE_BY_ONE_GROUPED = strategy2;
            Strategy strategy3 = new Strategy("ONE_IN_ONE", 2);
            ONE_IN_ONE = strategy3;
            Strategy[] strategyArr = {strategy, strategy2, strategy3};
            $VALUES = strategyArr;
            $ENTRIES = new asp(strategyArr);
        }

        public Strategy() {
            throw null;
        }

        public static Strategy valueOf(String str) {
            return (Strategy) Enum.valueOf(Strategy.class, str);
        }

        public static Strategy[] values() {
            return (Strategy[]) $VALUES.clone();
        }
    }

    /* compiled from: PollNavParams.kt */
    public interface a {
        com.vk.video.polls.nav.a a(Strategy strategy);

        com.vk.video.polls.nav.a b(UxPollEntryPoint uxPollEntryPoint);
    }

    /* compiled from: PollNavParams.kt */
    public static final class b implements Parcelable.Creator<PollNavParams> {
        @Override // android.os.Parcelable.Creator
        public final PollNavParams createFromParcel(Parcel parcel) {
            UxPollEntryPoint createFromParcel = UxPollEntryPoint.CREATOR.createFromParcel(parcel);
            Strategy valueOf = Strategy.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(Integer.valueOf(parcel.readInt()), parcel.readParcelable(PollNavParams.class.getClassLoader()));
            }
            return new PollNavParams(createFromParcel, valueOf, linkedHashMap, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PollNavParams[] newArray(int i) {
            return new PollNavParams[i];
        }
    }

    public PollNavParams(UxPollEntryPoint uxPollEntryPoint, Strategy strategy, Map<Integer, PollAnswer> map, int i) {
        this.b = uxPollEntryPoint;
        this.c = strategy;
        this.d = map;
        this.e = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollNavParams)) {
            return false;
        }
        PollNavParams pollNavParams = (PollNavParams) obj;
        return epx.f(this.b, pollNavParams.b) && this.c == pollNavParams.c && epx.f(this.d, pollNavParams.d) && this.e == pollNavParams.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + v11.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PollNavParams(entrypoint=");
        sb.append(this.b);
        sb.append(", strategy=");
        sb.append(this.c);
        sb.append(", answers=");
        sb.append(this.d);
        sb.append(", themeId=");
        return vu5.b(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        parcel.writeString(this.c.name());
        Map<Integer, PollAnswer> map = this.d;
        parcel.writeInt(map.size());
        for (Map.Entry<Integer, PollAnswer> entry : map.entrySet()) {
            parcel.writeInt(entry.getKey().intValue());
            parcel.writeParcelable(entry.getValue(), i);
        }
        parcel.writeInt(this.e);
    }
}
