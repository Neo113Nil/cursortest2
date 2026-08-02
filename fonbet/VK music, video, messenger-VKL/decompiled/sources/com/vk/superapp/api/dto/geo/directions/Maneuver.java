package com.vk.superapp.api.dto.geo.directions;

import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.reactivex.rxjava3.subjects.b;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: Maneuver.kt */
/* loaded from: classes6.dex */
public final class Maneuver {

    @pmi0("begin_shape_index")
    private final int beginShapeIndex;

    @pmi0("end_shape_index")
    private final int endShapeIndex;

    @pmi0("instruction")
    private final String instruction;

    @pmi0("length")
    private final float length;

    @pmi0("street_names")
    private final List<String> streetNames;

    @pmi0("time")
    private final float time;

    @pmi0("toll")
    private final boolean toll;

    @pmi0("travel_mode")
    private final TravelMode travelMode;

    @pmi0("travel_type")
    private final TravelType travelType;

    @pmi0("type")
    private final Type type;

    @pmi0("verbal_pre_transition_instruction")
    private final String verbalPreTransitionInstruction;

    @pmi0("verbal_transition_alert_instruction")
    private final String verbalTransitionAlertInstruction;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Maneuver.kt */
    public static final class TravelMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TravelMode[] $VALUES;

        @pmi0("bicycle")
        public static final TravelMode BICYCLE;

        @pmi0("drive")
        public static final TravelMode DRIVE;

        @pmi0("pedestrian")
        public static final TravelMode PEDESTRIAN;

        static {
            TravelMode travelMode = new TravelMode("DRIVE", 0);
            DRIVE = travelMode;
            TravelMode travelMode2 = new TravelMode("PEDESTRIAN", 1);
            PEDESTRIAN = travelMode2;
            TravelMode travelMode3 = new TravelMode("BICYCLE", 2);
            BICYCLE = travelMode3;
            TravelMode[] travelModeArr = {travelMode, travelMode2, travelMode3};
            $VALUES = travelModeArr;
            $ENTRIES = new asp(travelModeArr);
        }

        private TravelMode(String str, int i) {
        }

        public static TravelMode valueOf(String str) {
            return (TravelMode) Enum.valueOf(TravelMode.class, str);
        }

        public static TravelMode[] values() {
            return (TravelMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Maneuver.kt */
    public static final class TravelType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TravelType[] $VALUES;

        @pmi0("car")
        public static final TravelType CAR;

        @pmi0("foot")
        public static final TravelType FOOT;

        @pmi0("road")
        public static final TravelType ROAD;

        @pmi0("tractor_trailer")
        public static final TravelType TRACTOR_TRAILER;

        static {
            TravelType travelType = new TravelType("CAR", 0);
            CAR = travelType;
            TravelType travelType2 = new TravelType("TRACTOR_TRAILER", 1);
            TRACTOR_TRAILER = travelType2;
            TravelType travelType3 = new TravelType("FOOT", 2);
            FOOT = travelType3;
            TravelType travelType4 = new TravelType("ROAD", 3);
            ROAD = travelType4;
            TravelType[] travelTypeArr = {travelType, travelType2, travelType3, travelType4};
            $VALUES = travelTypeArr;
            $ENTRIES = new asp(travelTypeArr);
        }

        private TravelType(String str, int i) {
        }

        public static TravelType valueOf(String str) {
            return (TravelType) Enum.valueOf(TravelType.class, str);
        }

        public static TravelType[] values() {
            return (TravelType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Maneuver.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0(Gc.e)
        public static final Type BECOMES;

        @pmi0("8")
        public static final Type CONTINUE;

        @pmi0("4")
        public static final Type DESTINATION;

        @pmi0("6")
        public static final Type DESTINATION_LEFT;

        @pmi0(CampaignEx.CLICKMODE_ON)
        public static final Type DESTINATION_RIGHT;

        @pmi0("21")
        public static final Type EXIT_LEFT;

        @pmi0("20")
        public static final Type EXIT_RIGHT;

        @pmi0("28")
        public static final Type FERRY_ENTER;

        @pmi0("29")
        public static final Type FERRY_EXIT;

        @pmi0("15")
        public static final Type LEFT;

        @pmi0("25")
        public static final Type MERGE;

        @pmi0("0")
        public static final Type NONE;

        @pmi0("36")
        public static final Type POST_TRANSIT_CONNECTION_DESTINATION;

        @pmi0("19")
        public static final Type RAMP_LEFT;

        @pmi0("18")
        public static final Type RAMP_RIGHT;

        @pmi0("17")
        public static final Type RAMP_STRAIGHT;

        @pmi0("10")
        public static final Type RIGHT;

        @pmi0("26")
        public static final Type ROUNDABOUT_ENTER;

        @pmi0("27")
        public static final Type ROUNDABOUT_EXIT;

        @pmi0("14")
        public static final Type SHARP_LEFT;

        @pmi0("11")
        public static final Type SHARP_RIGHT;

        @pmi0("16")
        public static final Type SLIGHT_LEFT;

        @pmi0("9")
        public static final Type SLIGHT_RIGHT;

        @pmi0("1")
        public static final Type START;

        @pmi0("3")
        public static final Type START_LEFT;

        @pmi0("2")
        public static final Type START_RIGHT;

        @pmi0("24")
        public static final Type STAY_LEFT;

        @pmi0("23")
        public static final Type STAY_RIGHT;

        @pmi0("22")
        public static final Type STAY_STRAIGHT;

        @pmi0("30")
        public static final Type TRANSIT;

        @pmi0("35")
        public static final Type TRANSIT_CONNECTION_DESTINATION;

        @pmi0("33")
        public static final Type TRANSIT_CONNECTION_START;

        @pmi0("34")
        public static final Type TRANSIT_CONNECTION_TRANSFER;

        @pmi0("32")
        public static final Type TRANSIT_REMAIN_ON;

        @pmi0("31")
        public static final Type TRANSIT_TRANSFER;

        @pmi0("13")
        public static final Type U_TURN_LEFT;

        @pmi0("12")
        public static final Type U_TURN_RIGHT;

        static {
            Type type = new Type("NONE", 0);
            NONE = type;
            Type type2 = new Type("START", 1);
            START = type2;
            Type type3 = new Type("START_RIGHT", 2);
            START_RIGHT = type3;
            Type type4 = new Type("START_LEFT", 3);
            START_LEFT = type4;
            Type type5 = new Type("DESTINATION", 4);
            DESTINATION = type5;
            Type type6 = new Type("DESTINATION_RIGHT", 5);
            DESTINATION_RIGHT = type6;
            Type type7 = new Type("DESTINATION_LEFT", 6);
            DESTINATION_LEFT = type7;
            Type type8 = new Type("BECOMES", 7);
            BECOMES = type8;
            Type type9 = new Type("CONTINUE", 8);
            CONTINUE = type9;
            Type type10 = new Type("SLIGHT_RIGHT", 9);
            SLIGHT_RIGHT = type10;
            Type type11 = new Type("RIGHT", 10);
            RIGHT = type11;
            Type type12 = new Type("SHARP_RIGHT", 11);
            SHARP_RIGHT = type12;
            Type type13 = new Type("U_TURN_RIGHT", 12);
            U_TURN_RIGHT = type13;
            Type type14 = new Type("U_TURN_LEFT", 13);
            U_TURN_LEFT = type14;
            Type type15 = new Type("SHARP_LEFT", 14);
            SHARP_LEFT = type15;
            Type type16 = new Type("LEFT", 15);
            LEFT = type16;
            Type type17 = new Type("SLIGHT_LEFT", 16);
            SLIGHT_LEFT = type17;
            Type type18 = new Type("RAMP_STRAIGHT", 17);
            RAMP_STRAIGHT = type18;
            Type type19 = new Type("RAMP_RIGHT", 18);
            RAMP_RIGHT = type19;
            Type type20 = new Type("RAMP_LEFT", 19);
            RAMP_LEFT = type20;
            Type type21 = new Type("EXIT_RIGHT", 20);
            EXIT_RIGHT = type21;
            Type type22 = new Type("EXIT_LEFT", 21);
            EXIT_LEFT = type22;
            Type type23 = new Type("STAY_STRAIGHT", 22);
            STAY_STRAIGHT = type23;
            Type type24 = new Type("STAY_RIGHT", 23);
            STAY_RIGHT = type24;
            Type type25 = new Type("STAY_LEFT", 24);
            STAY_LEFT = type25;
            Type type26 = new Type("MERGE", 25);
            MERGE = type26;
            Type type27 = new Type("ROUNDABOUT_ENTER", 26);
            ROUNDABOUT_ENTER = type27;
            Type type28 = new Type("ROUNDABOUT_EXIT", 27);
            ROUNDABOUT_EXIT = type28;
            Type type29 = new Type("FERRY_ENTER", 28);
            FERRY_ENTER = type29;
            Type type30 = new Type("FERRY_EXIT", 29);
            FERRY_EXIT = type30;
            Type type31 = new Type("TRANSIT", 30);
            TRANSIT = type31;
            Type type32 = new Type("TRANSIT_TRANSFER", 31);
            TRANSIT_TRANSFER = type32;
            Type type33 = new Type("TRANSIT_REMAIN_ON", 32);
            TRANSIT_REMAIN_ON = type33;
            Type type34 = new Type("TRANSIT_CONNECTION_START", 33);
            TRANSIT_CONNECTION_START = type34;
            Type type35 = new Type("TRANSIT_CONNECTION_TRANSFER", 34);
            TRANSIT_CONNECTION_TRANSFER = type35;
            Type type36 = new Type("TRANSIT_CONNECTION_DESTINATION", 35);
            TRANSIT_CONNECTION_DESTINATION = type36;
            Type type37 = new Type("POST_TRANSIT_CONNECTION_DESTINATION", 36);
            POST_TRANSIT_CONNECTION_DESTINATION = type37;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20, type21, type22, type23, type24, type25, type26, type27, type28, type29, type30, type31, type32, type33, type34, type35, type36, type37};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public Maneuver(TravelType travelType, TravelMode travelMode, String str, String str2, float f, boolean z, String str3, int i, int i2, float f2, List<String> list, Type type) {
        this.travelType = travelType;
        this.travelMode = travelMode;
        this.verbalPreTransitionInstruction = str;
        this.verbalTransitionAlertInstruction = str2;
        this.length = f;
        this.toll = z;
        this.instruction = str3;
        this.beginShapeIndex = i;
        this.endShapeIndex = i2;
        this.time = f2;
        this.streetNames = list;
        this.type = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Maneuver)) {
            return false;
        }
        Maneuver maneuver = (Maneuver) obj;
        return this.travelType == maneuver.travelType && this.travelMode == maneuver.travelMode && epx.f(this.verbalPreTransitionInstruction, maneuver.verbalPreTransitionInstruction) && epx.f(this.verbalTransitionAlertInstruction, maneuver.verbalTransitionAlertInstruction) && Float.compare(this.length, maneuver.length) == 0 && this.toll == maneuver.toll && epx.f(this.instruction, maneuver.instruction) && this.beginShapeIndex == maneuver.beginShapeIndex && this.endShapeIndex == maneuver.endShapeIndex && Float.compare(this.time, maneuver.time) == 0 && epx.f(this.streetNames, maneuver.streetNames) && this.type == maneuver.type;
    }

    public final int hashCode() {
        return this.type.hashCode() + fw3.a(b.a(this.time, shy.a(this.endShapeIndex, shy.a(this.beginShapeIndex, urd0.a(qoy.b(b.a(this.length, urd0.a(urd0.a((this.travelMode.hashCode() + (this.travelType.hashCode() * 31)) * 31, 31, this.verbalPreTransitionInstruction), 31, this.verbalTransitionAlertInstruction), 31), 31, this.toll), 31, this.instruction), 31), 31), 31), 31, this.streetNames);
    }

    public final String toString() {
        return "Maneuver(travelType=" + this.travelType + ", travelMode=" + this.travelMode + ", verbalPreTransitionInstruction=" + this.verbalPreTransitionInstruction + ", verbalTransitionAlertInstruction=" + this.verbalTransitionAlertInstruction + ", length=" + this.length + ", toll=" + this.toll + ", instruction=" + this.instruction + ", beginShapeIndex=" + this.beginShapeIndex + ", endShapeIndex=" + this.endShapeIndex + ", time=" + this.time + ", streetNames=" + this.streetNames + ", type=" + this.type + ')';
    }
}
