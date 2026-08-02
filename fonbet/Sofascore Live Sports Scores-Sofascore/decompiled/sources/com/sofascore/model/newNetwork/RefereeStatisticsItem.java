package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournament$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.fc6;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJV\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b2\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b3\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b4\u0010\u001dR\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010/\u001a\u0004\b5\u0010\u001d\"\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/sofascore/model/newNetwork/RefereeStatisticsItem;", "", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", SearchResponseKt.LEAGUE_ENTITY, "", "appearances", "yellowCards", "redCards", "yellowRedCards", "penalty", "selectedOrd", "<init>", "(Lcom/sofascore/model/mvvm/model/UniqueTournament;IIIIII)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/UniqueTournament;IIIIIILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/RefereeStatisticsItem;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/UniqueTournament;", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/sofascore/model/mvvm/model/UniqueTournament;IIIIII)Lcom/sofascore/model/newNetwork/RefereeStatisticsItem;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", "getUniqueTournament", "I", "getAppearances", "getYellowCards", "getRedCards", "getYellowRedCards", "getPenalty", "getSelectedOrd", "setSelectedOrd", "(I)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RefereeStatisticsItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int appearances;
    private final int penalty;
    private final int redCards;
    private int selectedOrd;

    @NotNull
    private final UniqueTournament uniqueTournament;
    private final int yellowCards;
    private final int yellowRedCards;

    public /* synthetic */ RefereeStatisticsItem(int i, UniqueTournament uniqueTournament, int i2, int i3, int i4, int i5, int i6, int i7, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, RefereeStatisticsItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.uniqueTournament = uniqueTournament;
        this.appearances = i2;
        this.yellowCards = i3;
        this.redCards = i4;
        this.yellowRedCards = i5;
        this.penalty = i6;
        if ((i & 64) == 0) {
            this.selectedOrd = 0;
        } else {
            this.selectedOrd = i7;
        }
    }

    public static /* synthetic */ RefereeStatisticsItem copy$default(RefereeStatisticsItem refereeStatisticsItem, UniqueTournament uniqueTournament, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            uniqueTournament = refereeStatisticsItem.uniqueTournament;
        }
        if ((i7 & 2) != 0) {
            i = refereeStatisticsItem.appearances;
        }
        if ((i7 & 4) != 0) {
            i2 = refereeStatisticsItem.yellowCards;
        }
        if ((i7 & 8) != 0) {
            i3 = refereeStatisticsItem.redCards;
        }
        if ((i7 & 16) != 0) {
            i4 = refereeStatisticsItem.yellowRedCards;
        }
        if ((i7 & 32) != 0) {
            i5 = refereeStatisticsItem.penalty;
        }
        if ((i7 & 64) != 0) {
            i6 = refereeStatisticsItem.selectedOrd;
        }
        int i8 = i5;
        int i9 = i6;
        int i10 = i4;
        int i11 = i2;
        return refereeStatisticsItem.copy(uniqueTournament, i, i11, i3, i10, i8, i9);
    }

    public static final /* synthetic */ void write$Self$model_release(RefereeStatisticsItem self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, UniqueTournament$$serializer.INSTANCE, self.uniqueTournament);
        output.u(1, self.appearances, serialDesc);
        output.u(2, self.yellowCards, serialDesc);
        output.u(3, self.redCards, serialDesc);
        output.u(4, self.yellowRedCards, serialDesc);
        output.u(5, self.penalty, serialDesc);
        if (!output.o(serialDesc) && self.selectedOrd == 0) {
            return;
        }
        output.u(6, self.selectedOrd, serialDesc);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAppearances() {
        return this.appearances;
    }

    /* renamed from: component3, reason: from getter */
    public final int getYellowCards() {
        return this.yellowCards;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRedCards() {
        return this.redCards;
    }

    /* renamed from: component5, reason: from getter */
    public final int getYellowRedCards() {
        return this.yellowRedCards;
    }

    /* renamed from: component6, reason: from getter */
    public final int getPenalty() {
        return this.penalty;
    }

    /* renamed from: component7, reason: from getter */
    public final int getSelectedOrd() {
        return this.selectedOrd;
    }

    @NotNull
    public final RefereeStatisticsItem copy(@NotNull UniqueTournament uniqueTournament, int appearances, int yellowCards, int redCards, int yellowRedCards, int penalty, int selectedOrd) {
        uniqueTournament.getClass();
        return new RefereeStatisticsItem(uniqueTournament, appearances, yellowCards, redCards, yellowRedCards, penalty, selectedOrd);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RefereeStatisticsItem)) {
            return false;
        }
        RefereeStatisticsItem refereeStatisticsItem = (RefereeStatisticsItem) other;
        return Intrinsics.c(this.uniqueTournament, refereeStatisticsItem.uniqueTournament) && this.appearances == refereeStatisticsItem.appearances && this.yellowCards == refereeStatisticsItem.yellowCards && this.redCards == refereeStatisticsItem.redCards && this.yellowRedCards == refereeStatisticsItem.yellowRedCards && this.penalty == refereeStatisticsItem.penalty && this.selectedOrd == refereeStatisticsItem.selectedOrd;
    }

    public final int getAppearances() {
        return this.appearances;
    }

    public final int getPenalty() {
        return this.penalty;
    }

    public final int getRedCards() {
        return this.redCards;
    }

    public final int getSelectedOrd() {
        return this.selectedOrd;
    }

    @NotNull
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    public final int getYellowCards() {
        return this.yellowCards;
    }

    public final int getYellowRedCards() {
        return this.yellowRedCards;
    }

    public int hashCode() {
        return Integer.hashCode(this.selectedOrd) + wv8.a(this.penalty, wv8.a(this.yellowRedCards, wv8.a(this.redCards, wv8.a(this.yellowCards, wv8.a(this.appearances, this.uniqueTournament.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final void setSelectedOrd(int i) {
        this.selectedOrd = i;
    }

    @NotNull
    public String toString() {
        UniqueTournament uniqueTournament = this.uniqueTournament;
        int i = this.appearances;
        int i2 = this.yellowCards;
        int i3 = this.redCards;
        int i4 = this.yellowRedCards;
        int i5 = this.penalty;
        int i6 = this.selectedOrd;
        StringBuilder sb = new StringBuilder("RefereeStatisticsItem(uniqueTournament=");
        sb.append(uniqueTournament);
        sb.append(", appearances=");
        sb.append(i);
        sb.append(", yellowCards=");
        me4.q(sb, i2, ", redCards=", i3, ", yellowRedCards=");
        me4.q(sb, i4, ", penalty=", i5, ", selectedOrd=");
        return fc6.h(i6, ")", sb);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/RefereeStatisticsItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/RefereeStatisticsItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return RefereeStatisticsItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public RefereeStatisticsItem(@NotNull UniqueTournament uniqueTournament, int i, int i2, int i3, int i4, int i5, int i6) {
        uniqueTournament.getClass();
        this.uniqueTournament = uniqueTournament;
        this.appearances = i;
        this.yellowCards = i2;
        this.redCards = i3;
        this.yellowRedCards = i4;
        this.penalty = i5;
        this.selectedOrd = i6;
    }

    public /* synthetic */ RefereeStatisticsItem(UniqueTournament uniqueTournament, int i, int i2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(uniqueTournament, i, i2, i3, i4, i5, (i7 & 64) != 0 ? 0 : i6);
    }
}
