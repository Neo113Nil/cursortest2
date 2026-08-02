package com.sofascore.model.mvvm.model;

import defpackage.a7a;
import defpackage.b1i;
import defpackage.c88;
import defpackage.gz1;
import defpackage.hz8;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b \b\u0007\u0018\u0000 @2\u00020\u0001:\u0002A@B§\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018B»\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ'\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b)\u0010(R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b*\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b1\u00100R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b2\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b3\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b4\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b5\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b6\u00100R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b:\u0010(R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b;\u0010(R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010&\u001a\u0004\b?\u0010(¨\u0006B"}, d2 = {"Lcom/sofascore/model/mvvm/model/StageInfo;", "Ljava/io/Serializable;", "", "circuit", "circuitCity", "circuitCountry", "", "circuitLength", "", "laps", "stages", "raceDistance", "lapRecord", "weather", "note", "formulaOneSprintShootoutRound", "", "formulaOneSprintRace", "arrivalCity", "departureCity", "Lcom/sofascore/model/mvvm/model/CyclingStageType;", "stageType", "borderColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/CyclingStageType;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/CyclingStageType;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/StageInfo;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getCircuit", "()Ljava/lang/String;", "getCircuitCity", "getCircuitCountry", "Ljava/lang/Float;", "getCircuitLength", "()Ljava/lang/Float;", "Ljava/lang/Integer;", "getLaps", "()Ljava/lang/Integer;", "getStages", "getRaceDistance", "getLapRecord", "getWeather", "getNote", "getFormulaOneSprintShootoutRound", "Ljava/lang/Boolean;", "getFormulaOneSprintRace", "()Ljava/lang/Boolean;", "getArrivalCity", "getDepartureCity", "Lcom/sofascore/model/mvvm/model/CyclingStageType;", "getStageType", "()Lcom/sofascore/model/mvvm/model/CyclingStageType;", "getBorderColor", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StageInfo implements Serializable {

    @Nullable
    private final String arrivalCity;

    @Nullable
    private final String borderColor;

    @Nullable
    private final String circuit;

    @Nullable
    private final String circuitCity;

    @Nullable
    private final String circuitCountry;

    @Nullable
    private final Float circuitLength;

    @Nullable
    private final String departureCity;

    @Nullable
    private final Boolean formulaOneSprintRace;

    @Nullable
    private final Integer formulaOneSprintShootoutRound;

    @Nullable
    private final String lapRecord;

    @Nullable
    private final Integer laps;

    @Nullable
    private final String note;

    @Nullable
    private final Float raceDistance;

    @Nullable
    private final CyclingStageType stageType;

    @Nullable
    private final Integer stages;

    @Nullable
    private final String weather;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysa.b, new b1i(12)), null};

    public /* synthetic */ StageInfo(int i, String str, String str2, String str3, Float f, Integer num, Integer num2, Float f2, String str4, String str5, String str6, Integer num3, Boolean bool, String str7, String str8, CyclingStageType cyclingStageType, String str9, t5h t5hVar) {
        if (65535 != (i & 65535)) {
            oea.z(i, 65535, StageInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.circuit = str;
        this.circuitCity = str2;
        this.circuitCountry = str3;
        this.circuitLength = f;
        this.laps = num;
        this.stages = num2;
        this.raceDistance = f2;
        this.lapRecord = str4;
        this.weather = str5;
        this.note = str6;
        this.formulaOneSprintShootoutRound = num3;
        this.formulaOneSprintRace = bool;
        this.arrivalCity = str7;
        this.departureCity = str8;
        this.stageType = cyclingStageType;
        this.borderColor = str9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return hz8.F("com.sofascore.model.mvvm.model.CyclingStageType", CyclingStageType.values(), new String[]{"flat", "intermediate", "timetrial", "highmountain"}, new Annotation[][]{null, null, null, null});
    }

    public static final /* synthetic */ void write$Self$model_release(StageInfo self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 0, uhiVar, self.circuit);
        output.h(serialDesc, 1, uhiVar, self.circuitCity);
        output.h(serialDesc, 2, uhiVar, self.circuitCountry);
        c88 c88Var = c88.a;
        output.h(serialDesc, 3, c88Var, self.circuitLength);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 4, a7aVar, self.laps);
        output.h(serialDesc, 5, a7aVar, self.stages);
        output.h(serialDesc, 6, c88Var, self.raceDistance);
        output.h(serialDesc, 7, uhiVar, self.lapRecord);
        output.h(serialDesc, 8, uhiVar, self.weather);
        output.h(serialDesc, 9, uhiVar, self.note);
        output.h(serialDesc, 10, a7aVar, self.formulaOneSprintShootoutRound);
        output.h(serialDesc, 11, gz1.a, self.formulaOneSprintRace);
        output.h(serialDesc, 12, uhiVar, self.arrivalCity);
        output.h(serialDesc, 13, uhiVar, self.departureCity);
        output.h(serialDesc, 14, (KSerializer) joaVarArr[14].getValue(), self.stageType);
        output.h(serialDesc, 15, uhiVar, self.borderColor);
    }

    @Nullable
    public final String getArrivalCity() {
        return this.arrivalCity;
    }

    @Nullable
    public final String getBorderColor() {
        return this.borderColor;
    }

    @Nullable
    public final String getCircuit() {
        return this.circuit;
    }

    @Nullable
    public final String getCircuitCity() {
        return this.circuitCity;
    }

    @Nullable
    public final String getCircuitCountry() {
        return this.circuitCountry;
    }

    @Nullable
    public final Float getCircuitLength() {
        return this.circuitLength;
    }

    @Nullable
    public final String getDepartureCity() {
        return this.departureCity;
    }

    @Nullable
    public final Boolean getFormulaOneSprintRace() {
        return this.formulaOneSprintRace;
    }

    @Nullable
    public final Integer getFormulaOneSprintShootoutRound() {
        return this.formulaOneSprintShootoutRound;
    }

    @Nullable
    public final String getLapRecord() {
        return this.lapRecord;
    }

    @Nullable
    public final Integer getLaps() {
        return this.laps;
    }

    @Nullable
    public final String getNote() {
        return this.note;
    }

    @Nullable
    public final Float getRaceDistance() {
        return this.raceDistance;
    }

    @Nullable
    public final CyclingStageType getStageType() {
        return this.stageType;
    }

    @Nullable
    public final Integer getStages() {
        return this.stages;
    }

    @Nullable
    public final String getWeather() {
        return this.weather;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/StageInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/StageInfo;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StageInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public StageInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Float f, @Nullable Integer num, @Nullable Integer num2, @Nullable Float f2, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num3, @Nullable Boolean bool, @Nullable String str7, @Nullable String str8, @Nullable CyclingStageType cyclingStageType, @Nullable String str9) {
        this.circuit = str;
        this.circuitCity = str2;
        this.circuitCountry = str3;
        this.circuitLength = f;
        this.laps = num;
        this.stages = num2;
        this.raceDistance = f2;
        this.lapRecord = str4;
        this.weather = str5;
        this.note = str6;
        this.formulaOneSprintShootoutRound = num3;
        this.formulaOneSprintRace = bool;
        this.arrivalCity = str7;
        this.departureCity = str8;
        this.stageType = cyclingStageType;
        this.borderColor = str9;
    }
}
