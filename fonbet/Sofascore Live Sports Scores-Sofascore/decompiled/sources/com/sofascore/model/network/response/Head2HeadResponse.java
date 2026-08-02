package com.sofascore.model.network.response;

import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006BC\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0005\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J(\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019¨\u0006,"}, d2 = {"Lcom/sofascore/model/network/response/Head2HeadResponse;", "Lcom/sofascore/model/network/response/AbstractNetworkResponse;", "Lcom/sofascore/model/network/response/Duel;", "teamDuel", "managerDuel", "<init>", "(Lcom/sofascore/model/network/response/Duel;Lcom/sofascore/model/network/response/Duel;)V", "", "seen0", "Lcom/sofascore/model/network/response/HeadResponse;", "head", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/network/response/HeadResponse;Lcom/sofascore/model/network/response/HeadResponse;Lcom/sofascore/model/network/response/Duel;Lcom/sofascore/model/network/response/Duel;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/Head2HeadResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/network/response/Duel;", "component2", "copy", "(Lcom/sofascore/model/network/response/Duel;Lcom/sofascore/model/network/response/Duel;)Lcom/sofascore/model/network/response/Head2HeadResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/network/response/Duel;", "getTeamDuel", "getManagerDuel", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Head2HeadResponse extends AbstractNetworkResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Duel managerDuel;

    @Nullable
    private final Duel teamDuel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Head2HeadResponse(int i, HeadResponse headResponse, HeadResponse headResponse2, Duel duel, Duel duel2, t5h t5hVar) {
        super(i, headResponse, headResponse2, t5hVar);
        if (12 != (i & 12)) {
            oea.z(i, 12, Head2HeadResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.teamDuel = duel;
        this.managerDuel = duel2;
    }

    public static /* synthetic */ Head2HeadResponse copy$default(Head2HeadResponse head2HeadResponse, Duel duel, Duel duel2, int i, Object obj) {
        if ((i & 1) != 0) {
            duel = head2HeadResponse.teamDuel;
        }
        if ((i & 2) != 0) {
            duel2 = head2HeadResponse.managerDuel;
        }
        return head2HeadResponse.copy(duel, duel2);
    }

    public static final /* synthetic */ void write$Self$model_release(Head2HeadResponse self, wf3 output, SerialDescriptor serialDesc) {
        AbstractNetworkResponse.write$Self(self, output, serialDesc);
        Duel$$serializer duel$$serializer = Duel$$serializer.INSTANCE;
        output.h(serialDesc, 2, duel$$serializer, self.teamDuel);
        output.h(serialDesc, 3, duel$$serializer, self.managerDuel);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Duel getTeamDuel() {
        return this.teamDuel;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Duel getManagerDuel() {
        return this.managerDuel;
    }

    @NotNull
    public final Head2HeadResponse copy(@Nullable Duel teamDuel, @Nullable Duel managerDuel) {
        return new Head2HeadResponse(teamDuel, managerDuel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Head2HeadResponse)) {
            return false;
        }
        Head2HeadResponse head2HeadResponse = (Head2HeadResponse) other;
        return Intrinsics.c(this.teamDuel, head2HeadResponse.teamDuel) && Intrinsics.c(this.managerDuel, head2HeadResponse.managerDuel);
    }

    @Nullable
    public final Duel getManagerDuel() {
        return this.managerDuel;
    }

    @Nullable
    public final Duel getTeamDuel() {
        return this.teamDuel;
    }

    public int hashCode() {
        Duel duel = this.teamDuel;
        int hashCode = (duel == null ? 0 : duel.hashCode()) * 31;
        Duel duel2 = this.managerDuel;
        return hashCode + (duel2 != null ? duel2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Head2HeadResponse(teamDuel=" + this.teamDuel + ", managerDuel=" + this.managerDuel + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/Head2HeadResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/Head2HeadResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Head2HeadResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Head2HeadResponse(@Nullable Duel duel, @Nullable Duel duel2) {
        super((HeadResponse) null, (HeadResponse) null, 3, (DefaultConstructorMarker) null);
        this.teamDuel = duel;
        this.managerDuel = duel2;
    }
}
