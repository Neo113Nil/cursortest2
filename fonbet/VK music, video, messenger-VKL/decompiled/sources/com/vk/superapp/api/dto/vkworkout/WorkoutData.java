package com.vk.superapp.api.dto.vkworkout;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.asp;
import xsna.bh10;
import xsna.c5g;
import xsna.e43;
import xsna.epx;
import xsna.rl3;
import xsna.shy;
import xsna.uqi;
import xsna.urd0;
import xsna.zrp;

/* compiled from: WorkoutData.kt */
/* loaded from: classes6.dex */
public final class WorkoutData {
    public final String a;
    public final String b;
    public final long c;
    public final Long d;
    public final WorkoutType e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final a j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WorkoutData.kt */
    public static final class GoogleFitActivityTypes {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ GoogleFitActivityTypes[] $VALUES;
        public static final GoogleFitActivityTypes BackCountrySkiing;
        public static final GoogleFitActivityTypes Biking;
        public static final GoogleFitActivityTypes CrossCountrySkiing;
        public static final GoogleFitActivityTypes Handbiking;
        public static final GoogleFitActivityTypes Jogging;
        public static final GoogleFitActivityTypes MountainBiking;
        public static final GoogleFitActivityTypes RoadBiking;
        public static final GoogleFitActivityTypes Running;
        public static final GoogleFitActivityTypes RunningOnSand;
        public static final GoogleFitActivityTypes RunningOnTreadmill;
        public static final GoogleFitActivityTypes StationaryBiking;
        public static final GoogleFitActivityTypes Swimming;
        public static final GoogleFitActivityTypes SwimmingInSwimmingPool;
        public static final GoogleFitActivityTypes SwimmingOpenWater;
        public static final GoogleFitActivityTypes UtilityBiking;
        public static final GoogleFitActivityTypes WalkingOnTreadmill;
        private final String code;

        static {
            GoogleFitActivityTypes googleFitActivityTypes = new GoogleFitActivityTypes("Running", 0, "8");
            Running = googleFitActivityTypes;
            GoogleFitActivityTypes googleFitActivityTypes2 = new GoogleFitActivityTypes("Jogging", 1, "56");
            Jogging = googleFitActivityTypes2;
            GoogleFitActivityTypes googleFitActivityTypes3 = new GoogleFitActivityTypes("RunningOnSand", 2, "57");
            RunningOnSand = googleFitActivityTypes3;
            GoogleFitActivityTypes googleFitActivityTypes4 = new GoogleFitActivityTypes("RunningOnTreadmill", 3, "58");
            RunningOnTreadmill = googleFitActivityTypes4;
            GoogleFitActivityTypes googleFitActivityTypes5 = new GoogleFitActivityTypes("BackCountrySkiing", 4, "66");
            BackCountrySkiing = googleFitActivityTypes5;
            GoogleFitActivityTypes googleFitActivityTypes6 = new GoogleFitActivityTypes("CrossCountrySkiing", 5, "67");
            CrossCountrySkiing = googleFitActivityTypes6;
            GoogleFitActivityTypes googleFitActivityTypes7 = new GoogleFitActivityTypes("WalkingOnTreadmill", 6, "95");
            WalkingOnTreadmill = googleFitActivityTypes7;
            GoogleFitActivityTypes googleFitActivityTypes8 = new GoogleFitActivityTypes("Swimming", 7, "82");
            Swimming = googleFitActivityTypes8;
            GoogleFitActivityTypes googleFitActivityTypes9 = new GoogleFitActivityTypes("SwimmingInSwimmingPool", 8, "83");
            SwimmingInSwimmingPool = googleFitActivityTypes9;
            GoogleFitActivityTypes googleFitActivityTypes10 = new GoogleFitActivityTypes("SwimmingOpenWater", 9, "84");
            SwimmingOpenWater = googleFitActivityTypes10;
            GoogleFitActivityTypes googleFitActivityTypes11 = new GoogleFitActivityTypes("Biking", 10, "1");
            Biking = googleFitActivityTypes11;
            GoogleFitActivityTypes googleFitActivityTypes12 = new GoogleFitActivityTypes("Handbiking", 11, "14");
            Handbiking = googleFitActivityTypes12;
            GoogleFitActivityTypes googleFitActivityTypes13 = new GoogleFitActivityTypes("MountainBiking", 12, "15");
            MountainBiking = googleFitActivityTypes13;
            GoogleFitActivityTypes googleFitActivityTypes14 = new GoogleFitActivityTypes("RoadBiking", 13, "16");
            RoadBiking = googleFitActivityTypes14;
            GoogleFitActivityTypes googleFitActivityTypes15 = new GoogleFitActivityTypes("StationaryBiking", 14, "18");
            StationaryBiking = googleFitActivityTypes15;
            GoogleFitActivityTypes googleFitActivityTypes16 = new GoogleFitActivityTypes("UtilityBiking", 15, "19");
            UtilityBiking = googleFitActivityTypes16;
            GoogleFitActivityTypes[] googleFitActivityTypesArr = {googleFitActivityTypes, googleFitActivityTypes2, googleFitActivityTypes3, googleFitActivityTypes4, googleFitActivityTypes5, googleFitActivityTypes6, googleFitActivityTypes7, googleFitActivityTypes8, googleFitActivityTypes9, googleFitActivityTypes10, googleFitActivityTypes11, googleFitActivityTypes12, googleFitActivityTypes13, googleFitActivityTypes14, googleFitActivityTypes15, googleFitActivityTypes16};
            $VALUES = googleFitActivityTypesArr;
            $ENTRIES = new asp(googleFitActivityTypesArr);
        }

        public GoogleFitActivityTypes(String str, int i, String str2) {
            this.code = str2;
        }

        public static GoogleFitActivityTypes valueOf(String str) {
            return (GoogleFitActivityTypes) Enum.valueOf(GoogleFitActivityTypes.class, str);
        }

        public static GoogleFitActivityTypes[] values() {
            return (GoogleFitActivityTypes[]) $VALUES.clone();
        }

        public final String h() {
            return this.code;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WorkoutData.kt */
    public static final class HealthConnectActivityTypes {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HealthConnectActivityTypes[] $VALUES;
        public static final HealthConnectActivityTypes Biking;
        public static final HealthConnectActivityTypes BikingStationary;
        public static final HealthConnectActivityTypes Running;
        public static final HealthConnectActivityTypes RunningTreadmill;
        public static final HealthConnectActivityTypes SwimmingOpenWater;
        public static final HealthConnectActivityTypes SwimmingPool;
        private final int code;

        static {
            HealthConnectActivityTypes healthConnectActivityTypes = new HealthConnectActivityTypes("Running", 0, 56);
            Running = healthConnectActivityTypes;
            HealthConnectActivityTypes healthConnectActivityTypes2 = new HealthConnectActivityTypes("RunningTreadmill", 1, 57);
            RunningTreadmill = healthConnectActivityTypes2;
            HealthConnectActivityTypes healthConnectActivityTypes3 = new HealthConnectActivityTypes("SwimmingOpenWater", 2, 73);
            SwimmingOpenWater = healthConnectActivityTypes3;
            HealthConnectActivityTypes healthConnectActivityTypes4 = new HealthConnectActivityTypes("SwimmingPool", 3, 74);
            SwimmingPool = healthConnectActivityTypes4;
            HealthConnectActivityTypes healthConnectActivityTypes5 = new HealthConnectActivityTypes("Biking", 4, 8);
            Biking = healthConnectActivityTypes5;
            HealthConnectActivityTypes healthConnectActivityTypes6 = new HealthConnectActivityTypes("BikingStationary", 5, 9);
            BikingStationary = healthConnectActivityTypes6;
            HealthConnectActivityTypes[] healthConnectActivityTypesArr = {healthConnectActivityTypes, healthConnectActivityTypes2, healthConnectActivityTypes3, healthConnectActivityTypes4, healthConnectActivityTypes5, healthConnectActivityTypes6};
            $VALUES = healthConnectActivityTypesArr;
            $ENTRIES = new asp(healthConnectActivityTypesArr);
        }

        public HealthConnectActivityTypes(String str, int i, int i2) {
            this.code = i2;
        }

        public static HealthConnectActivityTypes valueOf(String str) {
            return (HealthConnectActivityTypes) Enum.valueOf(HealthConnectActivityTypes.class, str);
        }

        public static HealthConnectActivityTypes[] values() {
            return (HealthConnectActivityTypes[]) $VALUES.clone();
        }

        public final int h() {
            return this.code;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: WorkoutData.kt */
    public static final class WorkoutType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ WorkoutType[] $VALUES;
        public static final WorkoutType BIKING;
        public static final WorkoutType OTHER;
        public static final WorkoutType RUNNING;
        public static final WorkoutType SWIMMING;
        private final List<String> associatedValues;
        private final Set<Integer> associatedValuesHC;

        static {
            List l = e43.l(GoogleFitActivityTypes.Running, GoogleFitActivityTypes.Jogging, GoogleFitActivityTypes.RunningOnSand, GoogleFitActivityTypes.RunningOnTreadmill, GoogleFitActivityTypes.BackCountrySkiing, GoogleFitActivityTypes.CrossCountrySkiing, GoogleFitActivityTypes.WalkingOnTreadmill);
            ArrayList arrayList = new ArrayList(c5g.u(l, 10));
            Iterator it = l.iterator();
            while (it.hasNext()) {
                arrayList.add(((GoogleFitActivityTypes) it.next()).h());
            }
            RUNNING = new WorkoutType("RUNNING", 0, arrayList, rl3.y0(new Integer[]{Integer.valueOf(HealthConnectActivityTypes.Running.h()), Integer.valueOf(HealthConnectActivityTypes.RunningTreadmill.h())}));
            List l2 = e43.l(GoogleFitActivityTypes.Swimming, GoogleFitActivityTypes.SwimmingInSwimmingPool, GoogleFitActivityTypes.SwimmingOpenWater);
            ArrayList arrayList2 = new ArrayList(c5g.u(l2, 10));
            Iterator it2 = l2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((GoogleFitActivityTypes) it2.next()).h());
            }
            SWIMMING = new WorkoutType("SWIMMING", 1, arrayList2, rl3.y0(new Integer[]{Integer.valueOf(HealthConnectActivityTypes.SwimmingOpenWater.h()), Integer.valueOf(HealthConnectActivityTypes.SwimmingPool.h())}));
            List l3 = e43.l(GoogleFitActivityTypes.Biking, GoogleFitActivityTypes.Handbiking, GoogleFitActivityTypes.MountainBiking, GoogleFitActivityTypes.RoadBiking, GoogleFitActivityTypes.StationaryBiking, GoogleFitActivityTypes.UtilityBiking);
            ArrayList arrayList3 = new ArrayList(c5g.u(l3, 10));
            Iterator it3 = l3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((GoogleFitActivityTypes) it3.next()).h());
            }
            WorkoutType workoutType = new WorkoutType("BIKING", 2, arrayList3, rl3.y0(new Integer[]{Integer.valueOf(HealthConnectActivityTypes.Biking.h()), Integer.valueOf(HealthConnectActivityTypes.BikingStationary.h())}));
            BIKING = workoutType;
            WorkoutType workoutType2 = new WorkoutType(NativeAdContent.ViewTag.OTHER, 3, EmptyList.b, EmptySet.b);
            OTHER = workoutType2;
            WorkoutType[] workoutTypeArr = {RUNNING, SWIMMING, workoutType, workoutType2};
            $VALUES = workoutTypeArr;
            $ENTRIES = new asp(workoutTypeArr);
        }

        public WorkoutType(String str, int i, List list, Set set) {
            this.associatedValues = list;
            this.associatedValuesHC = set;
        }

        public static WorkoutType valueOf(String str) {
            return (WorkoutType) Enum.valueOf(WorkoutType.class, str);
        }

        public static WorkoutType[] values() {
            return (WorkoutType[]) $VALUES.clone();
        }

        public final List<String> h() {
            return this.associatedValues;
        }

        public final Set<Integer> i() {
            return this.associatedValuesHC;
        }
    }

    /* compiled from: WorkoutData.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final long c;
        public final int d;
        public final Integer e;
        public final Integer f;

        public a(int i, int i2, long j, int i3, Integer num, Integer num2) {
            this.a = i;
            this.b = i2;
            this.c = j;
            this.d = i3;
            this.e = num;
            this.f = num2;
        }

        public final int a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e.equals(aVar.e) && this.f.equals(aVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + shy.a(this.d, bh10.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31)) * 29791);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WorkoutDetails(distance=");
            sb.append(this.a);
            sb.append(", activeTimeSeconds=");
            sb.append(this.b);
            sb.append(", activeTimeMs=");
            sb.append(this.c);
            sb.append(", calories=");
            sb.append(this.d);
            sb.append(", paceSeconds=");
            sb.append(this.e);
            sb.append(", avgPulse=null, altitudeGainMeters=null, cadenceSteps=");
            return uqi.b(sb, this.f, ')');
        }
    }

    public WorkoutData(String str, String str2, long j, Long l, WorkoutType workoutType, String str3, String str4, String str5, String str6, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = l;
        this.e = workoutType;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = aVar;
    }

    public final a a() {
        return this.j;
    }

    public final Long b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkoutData)) {
            return false;
        }
        WorkoutData workoutData = (WorkoutData) obj;
        return epx.f(this.a, workoutData.a) && epx.f(this.b, workoutData.b) && this.c == workoutData.c && epx.f(this.d, workoutData.d) && this.e == workoutData.e && epx.f(this.f, workoutData.f) && epx.f(this.g, workoutData.g) && epx.f(this.h, workoutData.h) && epx.f(this.i, workoutData.i) && epx.f(this.j, workoutData.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int a2 = bh10.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        Long l = this.d;
        int a3 = urd0.a(urd0.a(urd0.a((this.e.hashCode() + ((a2 + (l == null ? 0 : l.hashCode())) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h);
        String str2 = this.i;
        return this.j.hashCode() + ((a3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "WorkoutData(id=" + this.a + ", title=" + this.b + ", startTime=" + this.c + ", endTime=" + this.d + ", type=" + this.e + ", subType=" + this.f + ", description=" + this.g + ", source=" + this.h + ", dataSource=" + this.i + ", details=" + this.j + ')';
    }
}
