package com.sofascore.model.mvvm.model;

import defpackage.a7a;
import defpackage.fc6;
import defpackage.gz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BABC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b$\u0010 J\u0015\u0010%\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0011J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0011J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u0011J\u0012\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b)\u0010*JX\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u00020\u00062\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0011\"\u0004\b8\u00109R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u00106\u001a\u0004\b:\u0010\u0011\"\u0004\b;\u00109R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00106\u001a\u0004\b<\u0010\u0011\"\u0004\b=\u00109R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010>\u001a\u0004\b\u0007\u0010*\"\u0004\b?\u0010@R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u00106R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00106¨\u0006C"}, d2 = {"Lcom/sofascore/model/mvvm/model/AmericanFootballDownDistance;", "Ljava/io/Serializable;", "", "currentYardsToFirstDown", "currentDown", "currentYardline", "", "isGoalPossession", "currentPossession", "currentTeamHalf", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "component5", "()Ljava/lang/Integer;", "component6", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/AmericanFootballDownDistance;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "shouldReverseSides", "Lcom/sofascore/model/mvvm/model/TeamSides;", "side", "getCurrentPossession", "(ZLcom/sofascore/model/mvvm/model/TeamSides;)Ljava/lang/Integer;", "possessionTeam", "setCurrentPossession", "(I)V", "getCurrentTeamHalf", "setCurrentTeamHalf", "component1", "component2", "component3", "component4", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/mvvm/model/AmericanFootballDownDistance;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getCurrentYardsToFirstDown", "setCurrentYardsToFirstDown", "(Ljava/lang/Integer;)V", "getCurrentDown", "setCurrentDown", "getCurrentYardline", "setCurrentYardline", "Ljava/lang/Boolean;", "setGoalPossession", "(Ljava/lang/Boolean;)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AmericanFootballDownDistance implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Integer currentDown;

    @Nullable
    private Integer currentPossession;

    @Nullable
    private Integer currentTeamHalf;

    @Nullable
    private Integer currentYardline;

    @Nullable
    private Integer currentYardsToFirstDown;

    @Nullable
    private Boolean isGoalPossession;

    public /* synthetic */ AmericanFootballDownDistance(int i, Integer num, Integer num2, Integer num3, Boolean bool, Integer num4, Integer num5, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, AmericanFootballDownDistance$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.currentYardsToFirstDown = num;
        this.currentDown = num2;
        this.currentYardline = num3;
        this.isGoalPossession = bool;
        this.currentPossession = num4;
        this.currentTeamHalf = num5;
    }

    /* renamed from: component5, reason: from getter */
    private final Integer getCurrentPossession() {
        return this.currentPossession;
    }

    /* renamed from: component6, reason: from getter */
    private final Integer getCurrentTeamHalf() {
        return this.currentTeamHalf;
    }

    public static /* synthetic */ AmericanFootballDownDistance copy$default(AmericanFootballDownDistance americanFootballDownDistance, Integer num, Integer num2, Integer num3, Boolean bool, Integer num4, Integer num5, int i, Object obj) {
        if ((i & 1) != 0) {
            num = americanFootballDownDistance.currentYardsToFirstDown;
        }
        if ((i & 2) != 0) {
            num2 = americanFootballDownDistance.currentDown;
        }
        if ((i & 4) != 0) {
            num3 = americanFootballDownDistance.currentYardline;
        }
        if ((i & 8) != 0) {
            bool = americanFootballDownDistance.isGoalPossession;
        }
        if ((i & 16) != 0) {
            num4 = americanFootballDownDistance.currentPossession;
        }
        if ((i & 32) != 0) {
            num5 = americanFootballDownDistance.currentTeamHalf;
        }
        Integer num6 = num4;
        Integer num7 = num5;
        return americanFootballDownDistance.copy(num, num2, num3, bool, num6, num7);
    }

    public static /* synthetic */ Integer getCurrentPossession$default(AmericanFootballDownDistance americanFootballDownDistance, boolean z, TeamSides teamSides, int i, Object obj) {
        if ((i & 2) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return americanFootballDownDistance.getCurrentPossession(z, teamSides);
    }

    public static /* synthetic */ Integer getCurrentTeamHalf$default(AmericanFootballDownDistance americanFootballDownDistance, boolean z, TeamSides teamSides, int i, Object obj) {
        if ((i & 2) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return americanFootballDownDistance.getCurrentTeamHalf(z, teamSides);
    }

    public static final /* synthetic */ void write$Self$model_release(AmericanFootballDownDistance self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.currentYardsToFirstDown);
        output.h(serialDesc, 1, a7aVar, self.currentDown);
        output.h(serialDesc, 2, a7aVar, self.currentYardline);
        output.h(serialDesc, 3, gz1.a, self.isGoalPossession);
        output.h(serialDesc, 4, a7aVar, self.currentPossession);
        output.h(serialDesc, 5, a7aVar, self.currentTeamHalf);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getCurrentYardsToFirstDown() {
        return this.currentYardsToFirstDown;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getCurrentDown() {
        return this.currentDown;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getCurrentYardline() {
        return this.currentYardline;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Boolean getIsGoalPossession() {
        return this.isGoalPossession;
    }

    @NotNull
    public final AmericanFootballDownDistance copy(@Nullable Integer currentYardsToFirstDown, @Nullable Integer currentDown, @Nullable Integer currentYardline, @Nullable Boolean isGoalPossession, @Nullable Integer currentPossession, @Nullable Integer currentTeamHalf) {
        return new AmericanFootballDownDistance(currentYardsToFirstDown, currentDown, currentYardline, isGoalPossession, currentPossession, currentTeamHalf);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmericanFootballDownDistance)) {
            return false;
        }
        AmericanFootballDownDistance americanFootballDownDistance = (AmericanFootballDownDistance) other;
        return Intrinsics.c(this.currentYardsToFirstDown, americanFootballDownDistance.currentYardsToFirstDown) && Intrinsics.c(this.currentDown, americanFootballDownDistance.currentDown) && Intrinsics.c(this.currentYardline, americanFootballDownDistance.currentYardline) && Intrinsics.c(this.isGoalPossession, americanFootballDownDistance.isGoalPossession) && Intrinsics.c(this.currentPossession, americanFootballDownDistance.currentPossession) && Intrinsics.c(this.currentTeamHalf, americanFootballDownDistance.currentTeamHalf);
    }

    @Nullable
    public final Integer getCurrentDown() {
        return this.currentDown;
    }

    @Nullable
    public final Integer getCurrentPossession(boolean shouldReverseSides, @NotNull TeamSides side) {
        Integer num;
        side.getClass();
        Integer num2 = this.currentPossession;
        if (num2 != null && num2.intValue() == 1) {
            num = (side == TeamSides.REVERSIBLE && shouldReverseSides) ? null : 1;
            return Integer.valueOf(num != null ? num.intValue() : 2);
        }
        if (num2 == null || num2.intValue() != 2) {
            return this.currentPossession;
        }
        num = (side == TeamSides.REVERSIBLE && shouldReverseSides) ? null : 2;
        return Integer.valueOf(num != null ? num.intValue() : 1);
    }

    @Nullable
    public final Integer getCurrentTeamHalf(boolean shouldReverseSides, @NotNull TeamSides side) {
        Integer num;
        side.getClass();
        Integer num2 = this.currentTeamHalf;
        if (num2 != null && num2.intValue() == 1) {
            num = (side == TeamSides.REVERSIBLE && shouldReverseSides) ? null : 1;
            return Integer.valueOf(num != null ? num.intValue() : 2);
        }
        if (num2 == null || num2.intValue() != 2) {
            return this.currentTeamHalf;
        }
        num = (side == TeamSides.REVERSIBLE && shouldReverseSides) ? null : 2;
        return Integer.valueOf(num != null ? num.intValue() : 1);
    }

    @Nullable
    public final Integer getCurrentYardline() {
        return this.currentYardline;
    }

    @Nullable
    public final Integer getCurrentYardsToFirstDown() {
        return this.currentYardsToFirstDown;
    }

    public int hashCode() {
        Integer num = this.currentYardsToFirstDown;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.currentDown;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.currentYardline;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.isGoalPossession;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num4 = this.currentPossession;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.currentTeamHalf;
        return hashCode5 + (num5 != null ? num5.hashCode() : 0);
    }

    @Nullable
    public final Boolean isGoalPossession() {
        return this.isGoalPossession;
    }

    public final void setCurrentDown(@Nullable Integer num) {
        this.currentDown = num;
    }

    public final void setCurrentPossession(int possessionTeam) {
        this.currentPossession = Integer.valueOf(possessionTeam);
    }

    public final void setCurrentTeamHalf(int currentTeamHalf) {
        this.currentTeamHalf = Integer.valueOf(currentTeamHalf);
    }

    public final void setCurrentYardline(@Nullable Integer num) {
        this.currentYardline = num;
    }

    public final void setCurrentYardsToFirstDown(@Nullable Integer num) {
        this.currentYardsToFirstDown = num;
    }

    public final void setGoalPossession(@Nullable Boolean bool) {
        this.isGoalPossession = bool;
    }

    @NotNull
    public String toString() {
        Integer num = this.currentYardsToFirstDown;
        Integer num2 = this.currentDown;
        Integer num3 = this.currentYardline;
        Boolean bool = this.isGoalPossession;
        Integer num4 = this.currentPossession;
        Integer num5 = this.currentTeamHalf;
        StringBuilder k = wv8.k(num, "AmericanFootballDownDistance(currentYardsToFirstDown=", ", currentDown=", ", currentYardline=", num2);
        vxd.v(k, num3, ", isGoalPossession=", bool, ", currentPossession=");
        return fc6.l(num4, num5, ", currentTeamHalf=", ")", k);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/AmericanFootballDownDistance$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/AmericanFootballDownDistance;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AmericanFootballDownDistance$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AmericanFootballDownDistance(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool, @Nullable Integer num4, @Nullable Integer num5) {
        this.currentYardsToFirstDown = num;
        this.currentDown = num2;
        this.currentYardline = num3;
        this.isGoalPossession = bool;
        this.currentPossession = num4;
        this.currentTeamHalf = num5;
    }
}
