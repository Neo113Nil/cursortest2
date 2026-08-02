package com.vk.dto.music.chart;

import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.chart.ChartIcon;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.asp;
import xsna.bxx;
import xsna.epx;
import xsna.ms9;
import xsna.s3q0;
import xsna.w9y;
import xsna.zrp;

/* compiled from: ChartInfo.kt */
/* loaded from: classes18.dex */
public final class ChartInfo extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<ChartInfo> CREATOR = new c();
    public final int b;
    public final ChartIconCode c;
    public final List<ChartIcon> d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChartInfo.kt */
    public static final class ChartIconCode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ChartIconCode[] $VALUES;
        public static final ChartIconCode CROWN;
        public static final ChartIconCode MOVED_DOWN;
        public static final ChartIconCode MOVED_UP;
        public static final ChartIconCode NEW_RELEASE;
        public static final ChartIconCode NONE;
        public static final ChartIconCode NO_CHANGES;
        private final int iconId;

        static {
            ChartIconCode chartIconCode = new ChartIconCode("NONE", 0, -1);
            NONE = chartIconCode;
            ChartIconCode chartIconCode2 = new ChartIconCode("NEW_RELEASE", 1, 0);
            NEW_RELEASE = chartIconCode2;
            ChartIconCode chartIconCode3 = new ChartIconCode("NO_CHANGES", 2, 1);
            NO_CHANGES = chartIconCode3;
            ChartIconCode chartIconCode4 = new ChartIconCode("MOVED_UP", 3, 2);
            MOVED_UP = chartIconCode4;
            ChartIconCode chartIconCode5 = new ChartIconCode("MOVED_DOWN", 4, 3);
            MOVED_DOWN = chartIconCode5;
            ChartIconCode chartIconCode6 = new ChartIconCode("CROWN", 5, 4);
            CROWN = chartIconCode6;
            ChartIconCode[] chartIconCodeArr = {chartIconCode, chartIconCode2, chartIconCode3, chartIconCode4, chartIconCode5, chartIconCode6};
            $VALUES = chartIconCodeArr;
            $ENTRIES = new asp(chartIconCodeArr);
        }

        public ChartIconCode(String str, int i, int i2) {
            this.iconId = i2;
        }

        public static ChartIconCode valueOf(String str) {
            return (ChartIconCode) Enum.valueOf(ChartIconCode.class, str);
        }

        public static ChartIconCode[] values() {
            return (ChartIconCode[]) $VALUES.clone();
        }

        public final int h() {
            return this.iconId;
        }
    }

    /* compiled from: ChartInfo.kt */
    public static final class a {
        public static final ChartIconCode a(int i) {
            Serializer.c<ChartInfo> cVar = ChartInfo.CREATOR;
            ChartIconCode chartIconCode = ChartIconCode.NONE;
            if (i != chartIconCode.h()) {
                ChartIconCode chartIconCode2 = ChartIconCode.NEW_RELEASE;
                if (i == chartIconCode2.h()) {
                    return chartIconCode2;
                }
                ChartIconCode chartIconCode3 = ChartIconCode.NO_CHANGES;
                if (i == chartIconCode3.h()) {
                    return chartIconCode3;
                }
                ChartIconCode chartIconCode4 = ChartIconCode.MOVED_UP;
                if (i == chartIconCode4.h()) {
                    return chartIconCode4;
                }
                ChartIconCode chartIconCode5 = ChartIconCode.MOVED_DOWN;
                if (i == chartIconCode5.h()) {
                    return chartIconCode5;
                }
                ChartIconCode chartIconCode6 = ChartIconCode.CROWN;
                if (i == chartIconCode6.h()) {
                    return chartIconCode6;
                }
            }
            return chartIconCode;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<ChartInfo> {
        @Override // xsna.aay
        public final ChartInfo a(JSONObject jSONObject) {
            return new ChartInfo(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<ChartInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ChartInfo a(Serializer serializer) {
            return new ChartInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChartInfo[i];
        }
    }

    static {
        new b();
    }

    public ChartInfo(int i, ChartIconCode chartIconCode, List<ChartIcon> list) {
        this.b = i;
        this.c = chartIconCode;
        this.d = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c.h());
        serializer.W(this.d);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.c(Integer.valueOf(this.b), X3.i.L);
        w9yVar.e(this.c, "state");
        w9yVar.e(this.d, "icon");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChartInfo)) {
            return false;
        }
        ChartInfo chartInfo = (ChartInfo) obj;
        return this.b == chartInfo.b && this.c == chartInfo.c && epx.f(this.d, chartInfo.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (Integer.hashCode(this.b) * 31)) * 31;
        List<ChartIcon> list = this.d;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChartInfo(position=");
        sb.append(this.b);
        sb.append(", stateIcon=");
        sb.append(this.c);
        sb.append(", icons=");
        return ms9.a(')', sb, this.d);
    }

    public ChartInfo(Serializer serializer) {
        this(serializer.u(), a.a(serializer.u()), serializer.k(ChartIcon.class));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChartInfo(JSONObject jSONObject) {
        this(r0, r1, r4);
        ArrayList arrayList;
        int optInt = jSONObject.optInt(X3.i.L);
        ChartIconCode a2 = a.a(jSONObject.optInt("state", ChartIconCode.NONE.h()));
        ChartIcon.a aVar = ChartIcon.e;
        JSONArray optJSONArray = jSONObject.optJSONArray("icon");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    try {
                        aVar.getClass();
                        arrayList.add(new ChartIcon(optJSONObject));
                    } catch (Exception e) {
                        L.i(e);
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
            }
        } else {
            arrayList = null;
        }
    }
}
