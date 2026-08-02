package com.sofascore.model.odds;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Stage$$serializer;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.mvvm.model.bettingtips.DroppingOddsKt;
import com.sofascore.model.network.response.serializers.EventSerializer;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.gz8;
import defpackage.joa;
import defpackage.jp5;
import defpackage.oea;
import defpackage.r5h;
import defpackage.s8f;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.w1l;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 c2\u00020\u0001:\u0003decB\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B£\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\"J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\"J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010$J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b/\u0010(J\u0010\u00100\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b0\u0010(J\u0012\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b3\u00104J¢\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b7\u0010(J\u0010\u00108\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b8\u0010\"J\u001a\u0010;\u001a\u00020\u00052\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003¢\u0006\u0004\b;\u0010<J'\u0010E\u001a\u00020B2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0001¢\u0006\u0004\bC\u0010DR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010\"\"\u0004\bH\u0010IR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010J\u001a\u0004\bK\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010L\u001a\u0004\b\u0006\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010M\u001a\u0004\bN\u0010(R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010M\u001a\u0004\bO\u0010(R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010F\u001a\u0004\bP\u0010\"R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010F\u001a\u0004\bQ\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010J\u001a\u0004\bR\u0010$R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010S\u001a\u0004\bT\u0010.R\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010M\u001a\u0004\bU\u0010(R\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010M\u001a\u0004\bV\u0010(R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010W\u001a\u0004\bX\u00102R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010Y\u001a\u0004\bZ\u00104R\"\u0010\u0019\u001a\u00020\u00058F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010L\u001a\u0004\b[\u0010&\"\u0004\b\\\u0010]R\u0017\u0010^\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010.R\u0011\u0010b\u001a\u00020_8F¢\u0006\u0006\u001a\u0004\b`\u0010a¨\u0006f"}, d2 = {"Lcom/sofascore/model/odds/ProviderOdds;", "Ljava/io/Serializable;", "", "id", "sourceId", "", "isLive", "", "choiceGroup", "marketName", "structureType", "marketId", "fid", "", "Lcom/sofascore/model/odds/OddsChoice;", "choices", "marketGroup", "marketPeriod", "Lcom/sofascore/model/mvvm/model/Event;", "event", "Lcom/sofascore/model/mvvm/model/Stage;", "stage", "<init>", "(ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Event;Lcom/sofascore/model/mvvm/model/Stage;)V", "seen0", "shouldReverseOdds", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Event;Lcom/sofascore/model/mvvm/model/Stage;ZLt5h;)V", "Lcom/sofascore/model/mvvm/model/TeamSides;", "sides", "getChoicesReversible", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Ljava/util/List;", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "()Z", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "component8", "component9", "()Ljava/util/List;", "component10", "component11", "component12", "()Lcom/sofascore/model/mvvm/model/Event;", "component13", "()Lcom/sofascore/model/mvvm/model/Stage;", "copy", "(ILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Event;Lcom/sofascore/model/mvvm/model/Stage;)Lcom/sofascore/model/odds/ProviderOdds;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/odds/ProviderOdds;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "setId", "(I)V", "Ljava/lang/Integer;", "getSourceId", "Z", "Ljava/lang/String;", "getChoiceGroup", "getMarketName", "getStructureType", "getMarketId", "getFid", "Ljava/util/List;", "getChoices", "getMarketGroup", "getMarketPeriod", "Lcom/sofascore/model/mvvm/model/Event;", "getEvent", "Lcom/sofascore/model/mvvm/model/Stage;", "getStage", "getShouldReverseOdds", "setShouldReverseOdds", "(Z)V", "choicesReversible", "Lcom/sofascore/model/odds/ProviderOdds$Type;", "getType", "()Lcom/sofascore/model/odds/ProviderOdds$Type;", "type", "Companion", "Type", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ProviderOdds implements Serializable {

    @Nullable
    private final String choiceGroup;

    @NotNull
    private final List<OddsChoice> choices;

    @Nullable
    private final Event event;

    @Nullable
    private final Integer fid;
    private int id;
    private final boolean isLive;

    @NotNull
    private final String marketGroup;
    private final int marketId;

    @NotNull
    private final String marketName;

    @NotNull
    private final String marketPeriod;
    private boolean shouldReverseOdds;

    @Nullable
    private final Integer sourceId;

    @Nullable
    private final Stage stage;
    private final int structureType;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, null, null, null, null, ypa.a(ysa.b, new s8f(12)), null, null, null, null, null};

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/odds/ProviderOdds$Type;", "", "<init>", "(Ljava/lang/String;I)V", "STANDARD", "HANDICAP", "MULTIPLE", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type STANDARD = new Type("STANDARD", 0);
        public static final Type HANDICAP = new Type("HANDICAP", 1);
        public static final Type MULTIPLE = new Type("MULTIPLE", 2);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{STANDARD, HANDICAP, MULTIPLE};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private Type(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ProviderOdds(int i, int i2, Integer num, boolean z, String str, String str2, int i3, int i4, Integer num2, List list, String str3, String str4, Event event, Stage stage, boolean z2, t5h t5hVar) {
        if (6654 != (i & 6654)) {
            oea.z(i, 6654, ProviderOdds$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.id = 0;
        } else {
            this.id = i2;
        }
        this.sourceId = num;
        this.isLive = z;
        this.choiceGroup = str;
        this.marketName = str2;
        this.structureType = i3;
        this.marketId = i4;
        this.fid = num2;
        this.choices = list;
        if ((i & 512) == 0) {
            this.marketGroup = "";
        } else {
            this.marketGroup = str3;
        }
        if ((i & 1024) == 0) {
            this.marketPeriod = "";
        } else {
            this.marketPeriod = str4;
        }
        this.event = event;
        this.stage = stage;
        if ((i & 8192) == 0) {
            this.shouldReverseOdds = false;
        } else {
            this.shouldReverseOdds = z2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(OddsChoice$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ ProviderOdds copy$default(ProviderOdds providerOdds, int i, Integer num, boolean z, String str, String str2, int i2, int i3, Integer num2, List list, String str3, String str4, Event event, Stage stage, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = providerOdds.id;
        }
        return providerOdds.copy(i, (i4 & 2) != 0 ? providerOdds.sourceId : num, (i4 & 4) != 0 ? providerOdds.isLive : z, (i4 & 8) != 0 ? providerOdds.choiceGroup : str, (i4 & 16) != 0 ? providerOdds.marketName : str2, (i4 & 32) != 0 ? providerOdds.structureType : i2, (i4 & 64) != 0 ? providerOdds.marketId : i3, (i4 & 128) != 0 ? providerOdds.fid : num2, (i4 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? providerOdds.choices : list, (i4 & 512) != 0 ? providerOdds.marketGroup : str3, (i4 & 1024) != 0 ? providerOdds.marketPeriod : str4, (i4 & a.o) != 0 ? providerOdds.event : event, (i4 & 4096) != 0 ? providerOdds.stage : stage);
    }

    public static final /* synthetic */ void write$Self$model_release(ProviderOdds self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        if (output.o(serialDesc) || self.id != 0) {
            output.u(0, self.id, serialDesc);
        }
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 1, a7aVar, self.sourceId);
        output.x(serialDesc, 2, self.isLive);
        output.h(serialDesc, 3, uhi.a, self.choiceGroup);
        output.y(serialDesc, 4, self.marketName);
        output.u(5, self.structureType, serialDesc);
        output.u(6, self.marketId, serialDesc);
        output.h(serialDesc, 7, a7aVar, self.fid);
        output.f(serialDesc, 8, (KSerializer) joaVarArr[8].getValue(), self.choices);
        if (output.o(serialDesc) || !Intrinsics.c(self.marketGroup, "")) {
            output.y(serialDesc, 9, self.marketGroup);
        }
        if (output.o(serialDesc) || !Intrinsics.c(self.marketPeriod, "")) {
            output.y(serialDesc, 10, self.marketPeriod);
        }
        output.h(serialDesc, 11, EventSerializer.INSTANCE, self.event);
        output.h(serialDesc, 12, Stage$$serializer.INSTANCE, self.stage);
        if (output.o(serialDesc) || self.getShouldReverseOdds()) {
            output.x(serialDesc, 13, self.getShouldReverseOdds());
        }
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getMarketGroup() {
        return this.marketGroup;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getMarketPeriod() {
        return this.marketPeriod;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Event getEvent() {
        return this.event;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Stage getStage() {
        return this.stage;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getSourceId() {
        return this.sourceId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLive() {
        return this.isLive;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getChoiceGroup() {
        return this.choiceGroup;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getMarketName() {
        return this.marketName;
    }

    /* renamed from: component6, reason: from getter */
    public final int getStructureType() {
        return this.structureType;
    }

    /* renamed from: component7, reason: from getter */
    public final int getMarketId() {
        return this.marketId;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getFid() {
        return this.fid;
    }

    @NotNull
    public final List<OddsChoice> component9() {
        return this.choices;
    }

    @NotNull
    public final ProviderOdds copy(int id, @Nullable Integer sourceId, boolean isLive, @Nullable String choiceGroup, @NotNull String marketName, int structureType, int marketId, @Nullable Integer fid, @NotNull List<OddsChoice> choices, @NotNull String marketGroup, @NotNull String marketPeriod, @Nullable Event event, @Nullable Stage stage) {
        marketName.getClass();
        choices.getClass();
        marketGroup.getClass();
        marketPeriod.getClass();
        return new ProviderOdds(id, sourceId, isLive, choiceGroup, marketName, structureType, marketId, fid, choices, marketGroup, marketPeriod, event, stage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProviderOdds)) {
            return false;
        }
        ProviderOdds providerOdds = (ProviderOdds) other;
        return this.id == providerOdds.id && Intrinsics.c(this.sourceId, providerOdds.sourceId) && this.isLive == providerOdds.isLive && Intrinsics.c(this.choiceGroup, providerOdds.choiceGroup) && Intrinsics.c(this.marketName, providerOdds.marketName) && this.structureType == providerOdds.structureType && this.marketId == providerOdds.marketId && Intrinsics.c(this.fid, providerOdds.fid) && Intrinsics.c(this.choices, providerOdds.choices) && Intrinsics.c(this.marketGroup, providerOdds.marketGroup) && Intrinsics.c(this.marketPeriod, providerOdds.marketPeriod) && Intrinsics.c(this.event, providerOdds.event) && Intrinsics.c(this.stage, providerOdds.stage);
    }

    @Nullable
    public final String getChoiceGroup() {
        return this.choiceGroup;
    }

    @NotNull
    public final List<OddsChoice> getChoices() {
        return this.choices;
    }

    @NotNull
    public final List<OddsChoice> getChoicesReversible(@NotNull TeamSides sides) {
        sides.getClass();
        if (!getShouldReverseOdds() || sides != TeamSides.REVERSIBLE) {
            return this.choices;
        }
        List<OddsChoice> B0 = CollectionsKt.B0(this.choices);
        for (OddsChoice oddsChoice : B0) {
            oddsChoice.setReversibleName(DroppingOddsKt.reverseName(oddsChoice.getReversibleName(TeamSides.ORIGINAL)));
        }
        return B0;
    }

    @Nullable
    public final Event getEvent() {
        return this.event;
    }

    @Nullable
    public final Integer getFid() {
        return this.fid;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getMarketGroup() {
        return this.marketGroup;
    }

    public final int getMarketId() {
        return this.marketId;
    }

    @NotNull
    public final String getMarketName() {
        return this.marketName;
    }

    @NotNull
    public final String getMarketPeriod() {
        return this.marketPeriod;
    }

    public final boolean getShouldReverseOdds() {
        Event event;
        return this.shouldReverseOdds || ((event = this.event) != null && event.shouldReverseTeams());
    }

    @Nullable
    public final Integer getSourceId() {
        return this.sourceId;
    }

    @Nullable
    public final Stage getStage() {
        return this.stage;
    }

    public final int getStructureType() {
        return this.structureType;
    }

    @NotNull
    public final Type getType() {
        int i = this.structureType;
        return i != 2 ? i != 3 ? Type.STANDARD : Type.MULTIPLE : Type.HANDICAP;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        Integer num = this.sourceId;
        int e = dmi.e((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.isLive);
        String str = this.choiceGroup;
        int a = wv8.a(this.marketId, wv8.a(this.structureType, dmi.c((e + (str == null ? 0 : str.hashCode())) * 31, 31, this.marketName), 31), 31);
        Integer num2 = this.fid;
        int c = dmi.c(dmi.c(dmi.d((a + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.choices), 31, this.marketGroup), 31, this.marketPeriod);
        Event event = this.event;
        int hashCode2 = (c + (event == null ? 0 : event.hashCode())) * 31;
        Stage stage = this.stage;
        return hashCode2 + (stage != null ? stage.hashCode() : 0);
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setShouldReverseOdds(boolean z) {
        this.shouldReverseOdds = z;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        Integer num = this.sourceId;
        boolean z = this.isLive;
        String str = this.choiceGroup;
        String str2 = this.marketName;
        int i2 = this.structureType;
        int i3 = this.marketId;
        Integer num2 = this.fid;
        List<OddsChoice> list = this.choices;
        String str3 = this.marketGroup;
        String str4 = this.marketPeriod;
        Event event = this.event;
        Stage stage = this.stage;
        StringBuilder r = fc6.r("ProviderOdds(id=", ", sourceId=", ", isLive=", num, i);
        r.append(z);
        r.append(", choiceGroup=");
        r.append(str);
        r.append(", marketName=");
        w1l.q(i2, str2, ", structureType=", ", marketId=", r);
        r.append(i3);
        r.append(", fid=");
        r.append(num2);
        r.append(", choices=");
        r.append(list);
        r.append(", marketGroup=");
        r.append(str3);
        r.append(", marketPeriod=");
        r.append(str4);
        r.append(", event=");
        r.append(event);
        r.append(", stage=");
        r.append(stage);
        r.append(")");
        return r.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/odds/ProviderOdds$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/odds/ProviderOdds;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ProviderOdds$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @NotNull
    public final List<OddsChoice> getChoicesReversible() {
        return getChoicesReversible(TeamSides.REVERSIBLE);
    }

    public ProviderOdds(int i, @Nullable Integer num, boolean z, @Nullable String str, @NotNull String str2, int i2, int i3, @Nullable Integer num2, @NotNull List<OddsChoice> list, @NotNull String str3, @NotNull String str4, @Nullable Event event, @Nullable Stage stage) {
        str2.getClass();
        list.getClass();
        str3.getClass();
        str4.getClass();
        this.id = i;
        this.sourceId = num;
        this.isLive = z;
        this.choiceGroup = str;
        this.marketName = str2;
        this.structureType = i2;
        this.marketId = i3;
        this.fid = num2;
        this.choices = list;
        this.marketGroup = str3;
        this.marketPeriod = str4;
        this.event = event;
        this.stage = stage;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ ProviderOdds(int r17, java.lang.Integer r18, boolean r19, java.lang.String r20, java.lang.String r21, int r22, int r23, java.lang.Integer r24, java.util.List r25, java.lang.String r26, java.lang.String r27, com.sofascore.model.mvvm.model.Event r28, com.sofascore.model.mvvm.model.Stage r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r16 = this;
            r0 = r30
            r1 = r0 & 1
            if (r1 == 0) goto L9
            r1 = 0
            r3 = r1
            goto Lb
        L9:
            r3 = r17
        Lb:
            r1 = r0 & 512(0x200, float:7.17E-43)
            java.lang.String r2 = ""
            if (r1 == 0) goto L13
            r12 = r2
            goto L15
        L13:
            r12 = r26
        L15:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L31
            r13 = r2
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r14 = r28
            r15 = r29
            r2 = r16
            goto L49
        L31:
            r13 = r27
            r2 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r14 = r28
            r15 = r29
        L49:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sofascore.model.odds.ProviderOdds.<init>(int, java.lang.Integer, boolean, java.lang.String, java.lang.String, int, int, java.lang.Integer, java.util.List, java.lang.String, java.lang.String, com.sofascore.model.mvvm.model.Event, com.sofascore.model.mvvm.model.Stage, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
