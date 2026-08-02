package com.sofascore.model.mvvm.model.bettingtips;

import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.model.odds.ProviderOdds$$serializer;
import defpackage.fc6;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J.\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b\u001c\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010#R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/sofascore/model/mvvm/model/bettingtips/DroppingOdds;", "Ljava/io/Serializable;", "", "choiceName", "", "percentage", "Lcom/sofascore/model/odds/ProviderOdds;", "odds", "<init>", "(Ljava/lang/String;FLcom/sofascore/model/odds/ProviderOdds;)V", "", "seen0", "", "shouldReverseTeams", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;FLcom/sofascore/model/odds/ProviderOdds;ZLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/bettingtips/DroppingOdds;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/TeamSides;", "side", "getChoiceName", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Ljava/lang/String;", "component1", "()Ljava/lang/String;", "component2", "()F", "component3", "()Lcom/sofascore/model/odds/ProviderOdds;", "copy", "(Ljava/lang/String;FLcom/sofascore/model/odds/ProviderOdds;)Lcom/sofascore/model/mvvm/model/bettingtips/DroppingOdds;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "F", "getPercentage", "Lcom/sofascore/model/odds/ProviderOdds;", "getOdds", "Z", "getShouldReverseTeams", "()Z", "setShouldReverseTeams", "(Z)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DroppingOdds implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String choiceName;

    @NotNull
    private final ProviderOdds odds;
    private final float percentage;
    private boolean shouldReverseTeams;

    public /* synthetic */ DroppingOdds(int i, String str, float f, ProviderOdds providerOdds, boolean z, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, DroppingOdds$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.choiceName = str;
        this.percentage = f;
        this.odds = providerOdds;
        if ((i & 8) == 0) {
            this.shouldReverseTeams = false;
        } else {
            this.shouldReverseTeams = z;
        }
    }

    public static /* synthetic */ DroppingOdds copy$default(DroppingOdds droppingOdds, String str, float f, ProviderOdds providerOdds, int i, Object obj) {
        if ((i & 1) != 0) {
            str = droppingOdds.choiceName;
        }
        if ((i & 2) != 0) {
            f = droppingOdds.percentage;
        }
        if ((i & 4) != 0) {
            providerOdds = droppingOdds.odds;
        }
        return droppingOdds.copy(str, f, providerOdds);
    }

    public static /* synthetic */ String getChoiceName$default(DroppingOdds droppingOdds, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return droppingOdds.getChoiceName(teamSides);
    }

    public static final /* synthetic */ void write$Self$model_release(DroppingOdds self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.choiceName);
        output.t(serialDesc, 1, self.percentage);
        output.f(serialDesc, 2, ProviderOdds$$serializer.INSTANCE, self.odds);
        if (output.o(serialDesc) || self.shouldReverseTeams) {
            output.x(serialDesc, 3, self.shouldReverseTeams);
        }
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getChoiceName() {
        return this.choiceName;
    }

    /* renamed from: component2, reason: from getter */
    public final float getPercentage() {
        return this.percentage;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ProviderOdds getOdds() {
        return this.odds;
    }

    @NotNull
    public final DroppingOdds copy(@NotNull String choiceName, float percentage, @NotNull ProviderOdds odds) {
        choiceName.getClass();
        odds.getClass();
        return new DroppingOdds(choiceName, percentage, odds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DroppingOdds)) {
            return false;
        }
        DroppingOdds droppingOdds = (DroppingOdds) other;
        return Intrinsics.c(this.choiceName, droppingOdds.choiceName) && Float.compare(this.percentage, droppingOdds.percentage) == 0 && Intrinsics.c(this.odds, droppingOdds.odds);
    }

    @Nullable
    public final String getChoiceName(@NotNull TeamSides side) {
        side.getClass();
        String str = this.choiceName;
        String str2 = (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? null : str;
        return str2 == null ? DroppingOddsKt.reverseName(str) : str2;
    }

    @NotNull
    public final ProviderOdds getOdds() {
        return this.odds;
    }

    public final float getPercentage() {
        return this.percentage;
    }

    public final boolean getShouldReverseTeams() {
        return this.shouldReverseTeams;
    }

    public int hashCode() {
        return this.odds.hashCode() + fc6.a(this.percentage, this.choiceName.hashCode() * 31, 31);
    }

    public final void setShouldReverseTeams(boolean z) {
        this.shouldReverseTeams = z;
    }

    @NotNull
    public String toString() {
        return "DroppingOdds(choiceName=" + this.choiceName + ", percentage=" + this.percentage + ", odds=" + this.odds + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/bettingtips/DroppingOdds$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/bettingtips/DroppingOdds;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DroppingOdds$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @NotNull
    public final String getChoiceName() {
        return this.choiceName;
    }

    public DroppingOdds(@NotNull String str, float f, @NotNull ProviderOdds providerOdds) {
        str.getClass();
        providerOdds.getClass();
        this.choiceName = str;
        this.percentage = f;
        this.odds = providerOdds;
    }
}
