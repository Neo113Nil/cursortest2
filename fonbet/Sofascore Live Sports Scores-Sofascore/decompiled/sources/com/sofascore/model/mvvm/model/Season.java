package com.sofascore.model.mvvm.model;

import com.ironsource.U3;
import defpackage.dtg;
import defpackage.gz8;
import defpackage.joa;
import defpackage.jp5;
import defpackage.km5;
import defpackage.oea;
import defpackage.qq3;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0007\u0018\u0000 /2\u00020\u0001:\u0003/01B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tBG\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0007\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\u00162\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b(\u0010'R0\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/sofascore/model/mvvm/model/Season;", "Ljava/io/Serializable;", "", "id", "", "name", "year", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "(I)V", "seen0", "", "Lcom/sofascore/model/mvvm/model/Season$SubSeasonType;", "subSeasonTypeList", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/Season;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "setSubSeasonTypeList", "(Ljava/util/List;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "getId", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getYear", U3.i.X, "Ljava/util/List;", "getSubSeasonTypeList", "()Ljava/util/List;", "isAllTimeSeason", "()Z", "Companion", "SubSeasonType", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Season implements Serializable {

    @NotNull
    public static final String YEAR_ALL_TIME = "all";
    private final int id;

    @NotNull
    private final String name;

    @NotNull
    private List<? extends SubSeasonType> subSeasonTypeList;

    @NotNull
    private final String year;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, ypa.a(ysa.b, new dtg(8))};

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/sofascore/model/mvvm/model/Season$SubSeasonType;", "", "label", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "OVERALL", "REGULAR_SEASON", "TOP16", "PLAYOFFS", "MAIN_DRAW", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SubSeasonType {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ SubSeasonType[] $VALUES;

        @NotNull
        private final String label;
        public static final SubSeasonType OVERALL = new SubSeasonType("OVERALL", 0, "overall");
        public static final SubSeasonType REGULAR_SEASON = new SubSeasonType("REGULAR_SEASON", 1, "regularSeason");
        public static final SubSeasonType TOP16 = new SubSeasonType("TOP16", 2, "top16");
        public static final SubSeasonType PLAYOFFS = new SubSeasonType("PLAYOFFS", 3, "playoffs");
        public static final SubSeasonType MAIN_DRAW = new SubSeasonType("MAIN_DRAW", 4, "mainDraw");

        private static final /* synthetic */ SubSeasonType[] $values() {
            return new SubSeasonType[]{OVERALL, REGULAR_SEASON, TOP16, PLAYOFFS, MAIN_DRAW};
        }

        static {
            SubSeasonType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private SubSeasonType(String str, int i, String str2) {
            this.label = str2;
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static SubSeasonType valueOf(String str) {
            return (SubSeasonType) Enum.valueOf(SubSeasonType.class, str);
        }

        public static SubSeasonType[] values() {
            return (SubSeasonType[]) $VALUES.clone();
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }
    }

    public Season(int i, int i2, String str, String str2, List list, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, Season$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.name = str;
        this.year = str2;
        if ((i & 8) == 0) {
            this.subSeasonTypeList = km5.a;
        } else {
            this.subSeasonTypeList = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_() {
        SubSeasonType[] values = SubSeasonType.values();
        values.getClass();
        return new xg0(new qq3("com.sofascore.model.mvvm.model.Season.SubSeasonType", (Enum[]) values), 0);
    }

    public static final void write$Self$model_release(Season self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        output.y(serialDesc, 1, self.name);
        output.y(serialDesc, 2, self.year);
        if (!output.o(serialDesc) && Intrinsics.c(self.subSeasonTypeList, km5.a)) {
            return;
        }
        output.f(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.subSeasonTypeList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Season.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        return this.id == ((Season) other).id;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<SubSeasonType> getSubSeasonTypeList() {
        return this.subSeasonTypeList;
    }

    @NotNull
    public final String getYear() {
        return this.year;
    }

    public int hashCode() {
        return this.id;
    }

    public final boolean isAllTimeSeason() {
        return Intrinsics.c(this.year, YEAR_ALL_TIME);
    }

    public final void setSubSeasonTypeList(@NotNull List<String> subSeasonTypeList) {
        subSeasonTypeList.getClass();
        this.subSeasonTypeList = SeasonKt.mapToSubSeasonType(subSeasonTypeList);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/sofascore/model/mvvm/model/Season$Companion;", "", "<init>", "()V", "YEAR_ALL_TIME", "", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Season;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Season$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Season(int i, @NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.id = i;
        this.name = str;
        this.year = str2;
        this.subSeasonTypeList = km5.a;
    }

    public Season(int i) {
        this(i, "", "");
    }
}
