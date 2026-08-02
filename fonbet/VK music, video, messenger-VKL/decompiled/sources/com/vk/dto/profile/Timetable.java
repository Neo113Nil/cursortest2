package com.vk.dto.profile;

import com.vk.core.serialize.Serializer;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes18.dex */
public class Timetable extends Serializer.StreamParcelableAdapter {
    public WorkTime[] b;
    public static final String[] c = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};
    public static final Serializer.c<Timetable> CREATOR = new a();

    public class a extends Serializer.c<Timetable> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Timetable a(Serializer serializer) {
            Timetable timetable = new Timetable();
            timetable.b = new WorkTime[7];
            timetable.b = (WorkTime[]) serializer.i(WorkTime.CREATOR);
            return timetable;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Timetable[i];
        }
    }

    public Timetable(JSONObject jSONObject) {
        this.b = new WorkTime[7];
        for (int i = 0; i < 7; i++) {
            JSONObject optJSONObject = jSONObject.optJSONObject(c[i]);
            if (optJSONObject != null) {
                this.b[i] = new WorkTime(optJSONObject);
            }
        }
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.n0(this.b);
    }

    public Timetable(List<WorkTime> list) {
        this.b = new WorkTime[7];
        for (int i = 0; i < this.b.length && list.size() != i; i++) {
            this.b[i] = list.get(i);
        }
    }

    public static class WorkTime extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<WorkTime> CREATOR = new a();
        public int b;
        public int c;
        public int d;
        public int e;

        public class a extends Serializer.c<WorkTime> {
            @Override // com.vk.core.serialize.Serializer.c
            public final WorkTime a(Serializer serializer) {
                WorkTime workTime = new WorkTime();
                workTime.b = serializer.u();
                workTime.c = serializer.u();
                workTime.d = serializer.u();
                workTime.e = serializer.u();
                return workTime;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WorkTime[i];
            }
        }

        public WorkTime(int i, int i2, int i3, int i4) {
            this.b = i;
            if (i2 == 0) {
                this.c = 1440;
            } else {
                this.c = i2;
            }
            this.d = i3;
            this.e = i4;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b);
            serializer.S(this.c);
            serializer.S(this.d);
            serializer.S(this.e);
        }

        public WorkTime(JSONObject jSONObject) {
            this.b = jSONObject.optInt("open_time", -1);
            int optInt = jSONObject.optInt("close_time", -1);
            this.c = optInt;
            this.d = jSONObject.optInt("break_open_time", -1);
            this.e = jSONObject.optInt("break_close_time", -1);
            if (optInt == 0) {
                this.c = 1440;
            }
        }
    }
}
