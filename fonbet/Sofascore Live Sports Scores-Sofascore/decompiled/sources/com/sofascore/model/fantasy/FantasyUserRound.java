package com.sofascore.model.fantasy;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wt3;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010#JX\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010 J\u001a\u0010-\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010 R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b5\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010#R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b8\u0010#R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b9\u0010#¨\u0006<"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyUserRound;", "", "Lcom/sofascore/model/fantasy/FantasyRound;", "fantasyRound", "", "score", "freeTransfers", "transferPenalty", "", "tripleCaptainActive", "wildcardActive", "freeHitActive", "<init>", "(Lcom/sofascore/model/fantasy/FantasyRound;Ljava/lang/Integer;IIZZZ)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/fantasy/FantasyRound;Ljava/lang/Integer;IIZZZLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyUserRound;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/fantasy/FantasyRound;", "component2", "()Ljava/lang/Integer;", "component3", "()I", "component4", "component5", "()Z", "component6", "component7", "copy", "(Lcom/sofascore/model/fantasy/FantasyRound;Ljava/lang/Integer;IIZZZ)Lcom/sofascore/model/fantasy/FantasyUserRound;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/fantasy/FantasyRound;", "getFantasyRound", "Ljava/lang/Integer;", "getScore", "I", "getFreeTransfers", "getTransferPenalty", "Z", "getTripleCaptainActive", "getWildcardActive", "getFreeHitActive", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyUserRound {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final FantasyRound fantasyRound;
    private final boolean freeHitActive;
    private final int freeTransfers;

    @Nullable
    private final Integer score;
    private final int transferPenalty;
    private final boolean tripleCaptainActive;
    private final boolean wildcardActive;

    public /* synthetic */ FantasyUserRound(int i, FantasyRound fantasyRound, Integer num, int i2, int i3, boolean z, boolean z2, boolean z3, t5h t5hVar) {
        if (127 != (i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, FantasyUserRound$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.fantasyRound = fantasyRound;
        this.score = num;
        this.freeTransfers = i2;
        this.transferPenalty = i3;
        this.tripleCaptainActive = z;
        this.wildcardActive = z2;
        this.freeHitActive = z3;
    }

    public static /* synthetic */ FantasyUserRound copy$default(FantasyUserRound fantasyUserRound, FantasyRound fantasyRound, Integer num, int i, int i2, boolean z, boolean z2, boolean z3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            fantasyRound = fantasyUserRound.fantasyRound;
        }
        if ((i3 & 2) != 0) {
            num = fantasyUserRound.score;
        }
        if ((i3 & 4) != 0) {
            i = fantasyUserRound.freeTransfers;
        }
        if ((i3 & 8) != 0) {
            i2 = fantasyUserRound.transferPenalty;
        }
        if ((i3 & 16) != 0) {
            z = fantasyUserRound.tripleCaptainActive;
        }
        if ((i3 & 32) != 0) {
            z2 = fantasyUserRound.wildcardActive;
        }
        if ((i3 & 64) != 0) {
            z3 = fantasyUserRound.freeHitActive;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        boolean z6 = z;
        int i4 = i;
        return fantasyUserRound.copy(fantasyRound, num, i4, i2, z6, z4, z5);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyUserRound self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, FantasyRound$$serializer.INSTANCE, self.fantasyRound);
        output.h(serialDesc, 1, a7a.a, self.score);
        output.u(2, self.freeTransfers, serialDesc);
        output.u(3, self.transferPenalty, serialDesc);
        output.x(serialDesc, 4, self.tripleCaptainActive);
        output.x(serialDesc, 5, self.wildcardActive);
        output.x(serialDesc, 6, self.freeHitActive);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final FantasyRound getFantasyRound() {
        return this.fantasyRound;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getScore() {
        return this.score;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFreeTransfers() {
        return this.freeTransfers;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTransferPenalty() {
        return this.transferPenalty;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getTripleCaptainActive() {
        return this.tripleCaptainActive;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getWildcardActive() {
        return this.wildcardActive;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getFreeHitActive() {
        return this.freeHitActive;
    }

    @NotNull
    public final FantasyUserRound copy(@NotNull FantasyRound fantasyRound, @Nullable Integer score, int freeTransfers, int transferPenalty, boolean tripleCaptainActive, boolean wildcardActive, boolean freeHitActive) {
        fantasyRound.getClass();
        return new FantasyUserRound(fantasyRound, score, freeTransfers, transferPenalty, tripleCaptainActive, wildcardActive, freeHitActive);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyUserRound)) {
            return false;
        }
        FantasyUserRound fantasyUserRound = (FantasyUserRound) other;
        return Intrinsics.c(this.fantasyRound, fantasyUserRound.fantasyRound) && Intrinsics.c(this.score, fantasyUserRound.score) && this.freeTransfers == fantasyUserRound.freeTransfers && this.transferPenalty == fantasyUserRound.transferPenalty && this.tripleCaptainActive == fantasyUserRound.tripleCaptainActive && this.wildcardActive == fantasyUserRound.wildcardActive && this.freeHitActive == fantasyUserRound.freeHitActive;
    }

    @NotNull
    public final FantasyRound getFantasyRound() {
        return this.fantasyRound;
    }

    public final boolean getFreeHitActive() {
        return this.freeHitActive;
    }

    public final int getFreeTransfers() {
        return this.freeTransfers;
    }

    @Nullable
    public final Integer getScore() {
        return this.score;
    }

    public final int getTransferPenalty() {
        return this.transferPenalty;
    }

    public final boolean getTripleCaptainActive() {
        return this.tripleCaptainActive;
    }

    public final boolean getWildcardActive() {
        return this.wildcardActive;
    }

    public int hashCode() {
        int hashCode = this.fantasyRound.hashCode() * 31;
        Integer num = this.score;
        return Boolean.hashCode(this.freeHitActive) + dmi.e(dmi.e(wv8.a(this.transferPenalty, wv8.a(this.freeTransfers, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31, this.tripleCaptainActive), 31, this.wildcardActive);
    }

    @NotNull
    public String toString() {
        FantasyRound fantasyRound = this.fantasyRound;
        Integer num = this.score;
        int i = this.freeTransfers;
        int i2 = this.transferPenalty;
        boolean z = this.tripleCaptainActive;
        boolean z2 = this.wildcardActive;
        boolean z3 = this.freeHitActive;
        StringBuilder sb = new StringBuilder("FantasyUserRound(fantasyRound=");
        sb.append(fantasyRound);
        sb.append(", score=");
        sb.append(num);
        sb.append(", freeTransfers=");
        me4.q(sb, i, ", transferPenalty=", i2, ", tripleCaptainActive=");
        vxd.t(", wildcardActive=", ", freeHitActive=", sb, z, z2);
        return wt3.p(sb, z3, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyUserRound$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyUserRound;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyUserRound$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyUserRound(@NotNull FantasyRound fantasyRound, @Nullable Integer num, int i, int i2, boolean z, boolean z2, boolean z3) {
        fantasyRound.getClass();
        this.fantasyRound = fantasyRound;
        this.score = num;
        this.freeTransfers = i;
        this.transferPenalty = i2;
        this.tripleCaptainActive = z;
        this.wildcardActive = z2;
        this.freeHitActive = z3;
    }
}
