package com.sofascore.model;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournament$$serializer;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.bxe;
import defpackage.fc6;
import defpackage.gz8;
import defpackage.joa;
import defpackage.jp5;
import defpackage.qq3;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b+\b\u0007\u0018\u0000 J2\u00020\u0001:\u0005KLMNJBQ\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B]\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J%\u0010%\u001a\u0012\u0012\u0004\u0012\u00020#0\"j\b\u0012\u0004\u0012\u00020#`$2\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0006¢\u0006\u0004\b(\u0010)R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00104\u001a\u0004\b9\u00106\"\u0004\b:\u00108R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006O"}, d2 = {"Lcom/sofascore/model/PlayerTransferFilterData;", "Ljava/io/Serializable;", "Lcom/sofascore/model/Country;", "country", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", "tournament", "", "ageFrom", "ageTo", "Lcom/sofascore/model/PlayerTransferFilterData$FollowerCountSelection;", "minFollowers", "Lcom/sofascore/model/PlayerTransferFilterData$PlayerPositionSelection;", "position", "Lcom/sofascore/model/PlayerTransferFilterData$IncomingOutgoingSelection;", "incomingOutgoing", "<init>", "(Lcom/sofascore/model/Country;Lcom/sofascore/model/mvvm/model/UniqueTournament;IILcom/sofascore/model/PlayerTransferFilterData$FollowerCountSelection;Lcom/sofascore/model/PlayerTransferFilterData$PlayerPositionSelection;Lcom/sofascore/model/PlayerTransferFilterData$IncomingOutgoingSelection;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/Country;Lcom/sofascore/model/mvvm/model/UniqueTournament;IILcom/sofascore/model/PlayerTransferFilterData$FollowerCountSelection;Lcom/sofascore/model/PlayerTransferFilterData$PlayerPositionSelection;Lcom/sofascore/model/PlayerTransferFilterData$IncomingOutgoingSelection;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/PlayerTransferFilterData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "hasData", "()Z", "isRTL", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "filterToStringList", "(Z)Ljava/util/ArrayList;", "deletionPosition", "resetFilterAtPosition", "(I)Lcom/sofascore/model/PlayerTransferFilterData;", "Lcom/sofascore/model/Country;", "getCountry", "()Lcom/sofascore/model/Country;", "setCountry", "(Lcom/sofascore/model/Country;)V", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", "getTournament", "()Lcom/sofascore/model/mvvm/model/UniqueTournament;", "setTournament", "(Lcom/sofascore/model/mvvm/model/UniqueTournament;)V", "I", "getAgeFrom", "()I", "setAgeFrom", "(I)V", "getAgeTo", "setAgeTo", "Lcom/sofascore/model/PlayerTransferFilterData$FollowerCountSelection;", "getMinFollowers", "()Lcom/sofascore/model/PlayerTransferFilterData$FollowerCountSelection;", "setMinFollowers", "(Lcom/sofascore/model/PlayerTransferFilterData$FollowerCountSelection;)V", "Lcom/sofascore/model/PlayerTransferFilterData$PlayerPositionSelection;", "getPosition", "()Lcom/sofascore/model/PlayerTransferFilterData$PlayerPositionSelection;", "setPosition", "(Lcom/sofascore/model/PlayerTransferFilterData$PlayerPositionSelection;)V", "Lcom/sofascore/model/PlayerTransferFilterData$IncomingOutgoingSelection;", "getIncomingOutgoing", "()Lcom/sofascore/model/PlayerTransferFilterData$IncomingOutgoingSelection;", "setIncomingOutgoing", "(Lcom/sofascore/model/PlayerTransferFilterData$IncomingOutgoingSelection;)V", "Companion", "IncomingOutgoingSelection", "FollowerCountSelection", "PlayerPositionSelection", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PlayerTransferFilterData implements Serializable {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int ageFrom;
    private int ageTo;

    @Nullable
    private Country country;

    @NotNull
    private IncomingOutgoingSelection incomingOutgoing;

    @NotNull
    private FollowerCountSelection minFollowers;

    @NotNull
    private PlayerPositionSelection position;

    @Nullable
    private UniqueTournament tournament;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/sofascore/model/PlayerTransferFilterData$FollowerCountSelection;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "F0", "F10", "F100", "F1000", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FollowerCountSelection {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ FollowerCountSelection[] $VALUES;
        public static final FollowerCountSelection F0 = new FollowerCountSelection("F0", 0, "0");
        public static final FollowerCountSelection F10 = new FollowerCountSelection("F10", 1, "10");
        public static final FollowerCountSelection F100 = new FollowerCountSelection("F100", 2, StatisticData.ERROR_CODE_NOT_FOUND);
        public static final FollowerCountSelection F1000 = new FollowerCountSelection("F1000", 3, "1000");

        @NotNull
        private final String value;

        private static final /* synthetic */ FollowerCountSelection[] $values() {
            return new FollowerCountSelection[]{F0, F10, F100, F1000};
        }

        static {
            FollowerCountSelection[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private FollowerCountSelection(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static FollowerCountSelection valueOf(String str) {
            return (FollowerCountSelection) Enum.valueOf(FollowerCountSelection.class, str);
        }

        public static FollowerCountSelection[] values() {
            return (FollowerCountSelection[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/PlayerTransferFilterData$IncomingOutgoingSelection;", "", "<init>", "(Ljava/lang/String;I)V", "ALL", "INCOMING", "OUTGOING", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class IncomingOutgoingSelection {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ IncomingOutgoingSelection[] $VALUES;
        public static final IncomingOutgoingSelection ALL = new IncomingOutgoingSelection("ALL", 0);
        public static final IncomingOutgoingSelection INCOMING = new IncomingOutgoingSelection("INCOMING", 1);
        public static final IncomingOutgoingSelection OUTGOING = new IncomingOutgoingSelection("OUTGOING", 2);

        private static final /* synthetic */ IncomingOutgoingSelection[] $values() {
            return new IncomingOutgoingSelection[]{ALL, INCOMING, OUTGOING};
        }

        static {
            IncomingOutgoingSelection[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private IncomingOutgoingSelection(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static IncomingOutgoingSelection valueOf(String str) {
            return (IncomingOutgoingSelection) Enum.valueOf(IncomingOutgoingSelection.class, str);
        }

        public static IncomingOutgoingSelection[] values() {
            return (IncomingOutgoingSelection[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/sofascore/model/PlayerTransferFilterData$PlayerPositionSelection;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ALL", "FW", "MF", "DF", "GK", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PlayerPositionSelection {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ PlayerPositionSelection[] $VALUES;

        @NotNull
        private final String value;
        public static final PlayerPositionSelection ALL = new PlayerPositionSelection("ALL", 0, "All");
        public static final PlayerPositionSelection FW = new PlayerPositionSelection("FW", 1, "F");
        public static final PlayerPositionSelection MF = new PlayerPositionSelection("MF", 2, PlayerKt.FOOTBALL_MIDFIELDER);
        public static final PlayerPositionSelection DF = new PlayerPositionSelection("DF", 3, "D");
        public static final PlayerPositionSelection GK = new PlayerPositionSelection("GK", 4, "G");

        private static final /* synthetic */ PlayerPositionSelection[] $values() {
            return new PlayerPositionSelection[]{ALL, FW, MF, DF, GK};
        }

        static {
            PlayerPositionSelection[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private PlayerPositionSelection(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static PlayerPositionSelection valueOf(String str) {
            return (PlayerPositionSelection) Enum.valueOf(PlayerPositionSelection.class, str);
        }

        public static PlayerPositionSelection[] values() {
            return (PlayerPositionSelection[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, null, ypa.a(ysaVar, new bxe(1)), ypa.a(ysaVar, new bxe(2)), ypa.a(ysaVar, new bxe(3))};
    }

    public /* synthetic */ PlayerTransferFilterData(int i, Country country, UniqueTournament uniqueTournament, int i2, int i3, FollowerCountSelection followerCountSelection, PlayerPositionSelection playerPositionSelection, IncomingOutgoingSelection incomingOutgoingSelection, t5h t5hVar) {
        if ((i & 1) == 0) {
            this.country = null;
        } else {
            this.country = country;
        }
        if ((i & 2) == 0) {
            this.tournament = null;
        } else {
            this.tournament = uniqueTournament;
        }
        if ((i & 4) == 0) {
            this.ageFrom = 15;
        } else {
            this.ageFrom = i2;
        }
        if ((i & 8) == 0) {
            this.ageTo = 50;
        } else {
            this.ageTo = i3;
        }
        if ((i & 16) == 0) {
            this.minFollowers = FollowerCountSelection.F0;
        } else {
            this.minFollowers = followerCountSelection;
        }
        if ((i & 32) == 0) {
            this.position = PlayerPositionSelection.ALL;
        } else {
            this.position = playerPositionSelection;
        }
        if ((i & 64) == 0) {
            this.incomingOutgoing = IncomingOutgoingSelection.ALL;
        } else {
            this.incomingOutgoing = incomingOutgoingSelection;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_() {
        FollowerCountSelection[] values = FollowerCountSelection.values();
        values.getClass();
        return new qq3("com.sofascore.model.PlayerTransferFilterData.FollowerCountSelection", (Enum[]) values);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_$0() {
        PlayerPositionSelection[] values = PlayerPositionSelection.values();
        values.getClass();
        return new qq3("com.sofascore.model.PlayerTransferFilterData.PlayerPositionSelection", (Enum[]) values);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_$1() {
        IncomingOutgoingSelection[] values = IncomingOutgoingSelection.values();
        values.getClass();
        return new qq3("com.sofascore.model.PlayerTransferFilterData.IncomingOutgoingSelection", (Enum[]) values);
    }

    public static final /* synthetic */ void write$Self$model_release(PlayerTransferFilterData self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        if (output.o(serialDesc) || self.country != null) {
            output.h(serialDesc, 0, Country$$serializer.INSTANCE, self.country);
        }
        if (output.o(serialDesc) || self.tournament != null) {
            output.h(serialDesc, 1, UniqueTournament$$serializer.INSTANCE, self.tournament);
        }
        if (output.o(serialDesc) || self.ageFrom != 15) {
            output.u(2, self.ageFrom, serialDesc);
        }
        if (output.o(serialDesc) || self.ageTo != 50) {
            output.u(3, self.ageTo, serialDesc);
        }
        if (output.o(serialDesc) || self.minFollowers != FollowerCountSelection.F0) {
            output.f(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.minFollowers);
        }
        if (output.o(serialDesc) || self.position != PlayerPositionSelection.ALL) {
            output.f(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.position);
        }
        if (!output.o(serialDesc) && self.incomingOutgoing == IncomingOutgoingSelection.ALL) {
            return;
        }
        output.f(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.incomingOutgoing);
    }

    @NotNull
    public final ArrayList<String> filterToStringList(boolean isRTL) {
        ArrayList<String> arrayList = new ArrayList<>();
        Country country = this.country;
        if (country != null) {
            arrayList.add(country.getName());
        }
        UniqueTournament uniqueTournament = this.tournament;
        if (uniqueTournament != null) {
            String name = uniqueTournament.getName();
            if (name == null) {
                name = "";
            }
            arrayList.add(name);
        }
        IncomingOutgoingSelection incomingOutgoingSelection = this.incomingOutgoing;
        if (incomingOutgoingSelection != IncomingOutgoingSelection.ALL) {
            arrayList.add(incomingOutgoingSelection.name());
        }
        int i = this.ageFrom;
        if (i != 15 || this.ageTo != 50) {
            String g = fc6.g(this.ageTo, i, "-");
            if (!isRTL) {
                g = null;
            }
            if (g == null) {
                g = fc6.g(this.ageFrom, this.ageTo, "-");
            }
            arrayList.add(g);
        }
        FollowerCountSelection followerCountSelection = this.minFollowers;
        if (followerCountSelection != FollowerCountSelection.F0) {
            arrayList.add(followerCountSelection.getValue());
        }
        PlayerPositionSelection playerPositionSelection = this.position;
        if (playerPositionSelection != PlayerPositionSelection.ALL) {
            arrayList.add(playerPositionSelection.name());
        }
        return arrayList;
    }

    public final int getAgeFrom() {
        return this.ageFrom;
    }

    public final int getAgeTo() {
        return this.ageTo;
    }

    @Nullable
    public final Country getCountry() {
        return this.country;
    }

    @NotNull
    public final IncomingOutgoingSelection getIncomingOutgoing() {
        return this.incomingOutgoing;
    }

    @NotNull
    public final FollowerCountSelection getMinFollowers() {
        return this.minFollowers;
    }

    @NotNull
    public final PlayerPositionSelection getPosition() {
        return this.position;
    }

    @Nullable
    public final UniqueTournament getTournament() {
        return this.tournament;
    }

    public final boolean hasData() {
        return (this.country == null && this.tournament == null && this.ageFrom == 15 && this.ageTo == 50 && this.minFollowers == FollowerCountSelection.F0 && this.position == PlayerPositionSelection.ALL) ? false : true;
    }

    @NotNull
    public final PlayerTransferFilterData resetFilterAtPosition(int deletionPosition) {
        int i;
        if (this.country != null) {
            if (deletionPosition == 0) {
                this.country = null;
            }
            i = 1;
        } else {
            i = 0;
        }
        if (this.tournament != null) {
            if (deletionPosition == i) {
                this.tournament = null;
                this.incomingOutgoing = IncomingOutgoingSelection.ALL;
            }
            i++;
        }
        IncomingOutgoingSelection incomingOutgoingSelection = this.incomingOutgoing;
        IncomingOutgoingSelection incomingOutgoingSelection2 = IncomingOutgoingSelection.ALL;
        if (incomingOutgoingSelection != incomingOutgoingSelection2) {
            if (deletionPosition == i) {
                this.incomingOutgoing = incomingOutgoingSelection2;
            }
            i++;
        }
        if (this.ageFrom != 15 || this.ageTo != 50) {
            if (deletionPosition == i) {
                this.ageFrom = 15;
                this.ageTo = 50;
            }
            i++;
        }
        FollowerCountSelection followerCountSelection = this.minFollowers;
        FollowerCountSelection followerCountSelection2 = FollowerCountSelection.F0;
        if (followerCountSelection != followerCountSelection2) {
            if (deletionPosition == i) {
                this.minFollowers = followerCountSelection2;
            }
            i++;
        }
        PlayerPositionSelection playerPositionSelection = this.position;
        PlayerPositionSelection playerPositionSelection2 = PlayerPositionSelection.ALL;
        if (playerPositionSelection != playerPositionSelection2 && deletionPosition == i) {
            this.position = playerPositionSelection2;
        }
        return this;
    }

    public final void setAgeFrom(int i) {
        this.ageFrom = i;
    }

    public final void setAgeTo(int i) {
        this.ageTo = i;
    }

    public final void setCountry(@Nullable Country country) {
        this.country = country;
    }

    public final void setIncomingOutgoing(@NotNull IncomingOutgoingSelection incomingOutgoingSelection) {
        incomingOutgoingSelection.getClass();
        this.incomingOutgoing = incomingOutgoingSelection;
    }

    public final void setMinFollowers(@NotNull FollowerCountSelection followerCountSelection) {
        followerCountSelection.getClass();
        this.minFollowers = followerCountSelection;
    }

    public final void setPosition(@NotNull PlayerPositionSelection playerPositionSelection) {
        playerPositionSelection.getClass();
        this.position = playerPositionSelection;
    }

    public final void setTournament(@Nullable UniqueTournament uniqueTournament) {
        this.tournament = uniqueTournament;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/PlayerTransferFilterData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/PlayerTransferFilterData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PlayerTransferFilterData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PlayerTransferFilterData() {
        this((Country) null, (UniqueTournament) null, 0, 0, (FollowerCountSelection) null, (PlayerPositionSelection) null, (IncomingOutgoingSelection) null, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, (DefaultConstructorMarker) null);
    }

    public PlayerTransferFilterData(@Nullable Country country, @Nullable UniqueTournament uniqueTournament, int i, int i2, @NotNull FollowerCountSelection followerCountSelection, @NotNull PlayerPositionSelection playerPositionSelection, @NotNull IncomingOutgoingSelection incomingOutgoingSelection) {
        followerCountSelection.getClass();
        playerPositionSelection.getClass();
        incomingOutgoingSelection.getClass();
        this.country = country;
        this.tournament = uniqueTournament;
        this.ageFrom = i;
        this.ageTo = i2;
        this.minFollowers = followerCountSelection;
        this.position = playerPositionSelection;
        this.incomingOutgoing = incomingOutgoingSelection;
    }

    public /* synthetic */ PlayerTransferFilterData(Country country, UniqueTournament uniqueTournament, int i, int i2, FollowerCountSelection followerCountSelection, PlayerPositionSelection playerPositionSelection, IncomingOutgoingSelection incomingOutgoingSelection, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : country, (i3 & 2) != 0 ? null : uniqueTournament, (i3 & 4) != 0 ? 15 : i, (i3 & 8) != 0 ? 50 : i2, (i3 & 16) != 0 ? FollowerCountSelection.F0 : followerCountSelection, (i3 & 32) != 0 ? PlayerPositionSelection.ALL : playerPositionSelection, (i3 & 64) != 0 ? IncomingOutgoingSelection.ALL : incomingOutgoingSelection);
    }
}
