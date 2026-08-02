package com.sofascore.model.mvvm.model.bettingtips;

import defpackage.bf3;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.joa;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vs1;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Bk\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b(\u0010)Jf\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b-\u0010)J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b7\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b8\u0010\"R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b9\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b:\u0010\u001fR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010'R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b>\u0010)¨\u0006A"}, d2 = {"Lcom/sofascore/model/mvvm/model/bettingtips/BetBoost;", "Ljava/io/Serializable;", "", "name", "betSlipLink", "", "oddsDecimal", "unboostedOddsDecimal", "oddsFractional", "unboostedOddsFractional", "", "Lcom/sofascore/model/mvvm/model/bettingtips/BetBoostParticipant;", "betBoostParticipants", "", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;FFLjava/lang/String;Ljava/lang/String;Ljava/util/List;I)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;FFLjava/lang/String;Ljava/lang/String;Ljava/util/List;ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/bettingtips/BetBoost;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()F", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;FFLjava/lang/String;Ljava/lang/String;Ljava/util/List;I)Lcom/sofascore/model/mvvm/model/bettingtips/BetBoost;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getBetSlipLink", "F", "getOddsDecimal", "getUnboostedOddsDecimal", "getOddsFractional", "getUnboostedOddsFractional", "Ljava/util/List;", "getBetBoostParticipants", "I", "getId", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BetBoost implements Serializable {

    @NotNull
    private final List<BetBoostParticipant> betBoostParticipants;

    @NotNull
    private final String betSlipLink;
    private final int id;

    @NotNull
    private final String name;
    private final float oddsDecimal;

    @NotNull
    private final String oddsFractional;
    private final float unboostedOddsDecimal;

    @NotNull
    private final String unboostedOddsFractional;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, null, null, ypa.a(ysa.b, new vs1(11)), null};

    public /* synthetic */ BetBoost(int i, String str, String str2, float f, float f2, String str3, String str4, List list, int i2, t5h t5hVar) {
        if (255 != (i & 255)) {
            oea.z(i, 255, BetBoost$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.name = str;
        this.betSlipLink = str2;
        this.oddsDecimal = f;
        this.unboostedOddsDecimal = f2;
        this.oddsFractional = str3;
        this.unboostedOddsFractional = str4;
        this.betBoostParticipants = list;
        this.id = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(BetBoostParticipant$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ BetBoost copy$default(BetBoost betBoost, String str, String str2, float f, float f2, String str3, String str4, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = betBoost.name;
        }
        if ((i2 & 2) != 0) {
            str2 = betBoost.betSlipLink;
        }
        if ((i2 & 4) != 0) {
            f = betBoost.oddsDecimal;
        }
        if ((i2 & 8) != 0) {
            f2 = betBoost.unboostedOddsDecimal;
        }
        if ((i2 & 16) != 0) {
            str3 = betBoost.oddsFractional;
        }
        if ((i2 & 32) != 0) {
            str4 = betBoost.unboostedOddsFractional;
        }
        if ((i2 & 64) != 0) {
            list = betBoost.betBoostParticipants;
        }
        if ((i2 & 128) != 0) {
            i = betBoost.id;
        }
        List list2 = list;
        int i3 = i;
        String str5 = str3;
        String str6 = str4;
        return betBoost.copy(str, str2, f, f2, str5, str6, list2, i3);
    }

    public static final /* synthetic */ void write$Self$model_release(BetBoost self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.y(serialDesc, 0, self.name);
        output.y(serialDesc, 1, self.betSlipLink);
        output.t(serialDesc, 2, self.oddsDecimal);
        output.t(serialDesc, 3, self.unboostedOddsDecimal);
        output.y(serialDesc, 4, self.oddsFractional);
        output.y(serialDesc, 5, self.unboostedOddsFractional);
        output.f(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.betBoostParticipants);
        output.u(7, self.id, serialDesc);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBetSlipLink() {
        return this.betSlipLink;
    }

    /* renamed from: component3, reason: from getter */
    public final float getOddsDecimal() {
        return this.oddsDecimal;
    }

    /* renamed from: component4, reason: from getter */
    public final float getUnboostedOddsDecimal() {
        return this.unboostedOddsDecimal;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getOddsFractional() {
        return this.oddsFractional;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getUnboostedOddsFractional() {
        return this.unboostedOddsFractional;
    }

    @NotNull
    public final List<BetBoostParticipant> component7() {
        return this.betBoostParticipants;
    }

    /* renamed from: component8, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    public final BetBoost copy(@NotNull String name, @NotNull String betSlipLink, float oddsDecimal, float unboostedOddsDecimal, @NotNull String oddsFractional, @NotNull String unboostedOddsFractional, @NotNull List<BetBoostParticipant> betBoostParticipants, int id) {
        name.getClass();
        betSlipLink.getClass();
        oddsFractional.getClass();
        unboostedOddsFractional.getClass();
        betBoostParticipants.getClass();
        return new BetBoost(name, betSlipLink, oddsDecimal, unboostedOddsDecimal, oddsFractional, unboostedOddsFractional, betBoostParticipants, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetBoost)) {
            return false;
        }
        BetBoost betBoost = (BetBoost) other;
        return Intrinsics.c(this.name, betBoost.name) && Intrinsics.c(this.betSlipLink, betBoost.betSlipLink) && Float.compare(this.oddsDecimal, betBoost.oddsDecimal) == 0 && Float.compare(this.unboostedOddsDecimal, betBoost.unboostedOddsDecimal) == 0 && Intrinsics.c(this.oddsFractional, betBoost.oddsFractional) && Intrinsics.c(this.unboostedOddsFractional, betBoost.unboostedOddsFractional) && Intrinsics.c(this.betBoostParticipants, betBoost.betBoostParticipants) && this.id == betBoost.id;
    }

    @NotNull
    public final List<BetBoostParticipant> getBetBoostParticipants() {
        return this.betBoostParticipants;
    }

    @NotNull
    public final String getBetSlipLink() {
        return this.betSlipLink;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final float getOddsDecimal() {
        return this.oddsDecimal;
    }

    @NotNull
    public final String getOddsFractional() {
        return this.oddsFractional;
    }

    public final float getUnboostedOddsDecimal() {
        return this.unboostedOddsDecimal;
    }

    @NotNull
    public final String getUnboostedOddsFractional() {
        return this.unboostedOddsFractional;
    }

    public int hashCode() {
        return Integer.hashCode(this.id) + dmi.d(dmi.c(dmi.c(fc6.a(this.unboostedOddsDecimal, fc6.a(this.oddsDecimal, dmi.c(this.name.hashCode() * 31, 31, this.betSlipLink), 31), 31), 31, this.oddsFractional), 31, this.unboostedOddsFractional), 31, this.betBoostParticipants);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.betSlipLink;
        float f = this.oddsDecimal;
        float f2 = this.unboostedOddsDecimal;
        String str3 = this.oddsFractional;
        String str4 = this.unboostedOddsFractional;
        List<BetBoostParticipant> list = this.betBoostParticipants;
        int i = this.id;
        StringBuilder s = mz1.s("BetBoost(name=", str, ", betSlipLink=", str2, ", oddsDecimal=");
        s.append(f);
        s.append(", unboostedOddsDecimal=");
        s.append(f2);
        s.append(", oddsFractional=");
        bf3.v(s, str3, ", unboostedOddsFractional=", str4, ", betBoostParticipants=");
        s.append(list);
        s.append(", id=");
        s.append(i);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/bettingtips/BetBoost$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/bettingtips/BetBoost;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BetBoost$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BetBoost(@NotNull String str, @NotNull String str2, float f, float f2, @NotNull String str3, @NotNull String str4, @NotNull List<BetBoostParticipant> list, int i) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.name = str;
        this.betSlipLink = str2;
        this.oddsDecimal = f;
        this.unboostedOddsDecimal = f2;
        this.oddsFractional = str3;
        this.unboostedOddsFractional = str4;
        this.betBoostParticipants = list;
        this.id = i;
    }
}
