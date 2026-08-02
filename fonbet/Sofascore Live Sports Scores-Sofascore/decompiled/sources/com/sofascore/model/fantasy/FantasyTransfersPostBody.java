package com.sofascore.model.fantasy;

import com.sofascore.model.newNetwork.ErrorResponse;
import com.sofascore.model.newNetwork.HeadResponse;
import com.sofascore.model.newNetwork.NetworkResponse;
import defpackage.gz1;
import defpackage.jf7;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tBS\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\b\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ8\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b0\u0010\u001f¨\u00063"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyTransfersPostBody;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "", "Lcom/sofascore/model/fantasy/FantasyTransferPostModel;", "transfers", "", "wildcard", "freeHit", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyTransfersPostBody;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Boolean;", "component3", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/sofascore/model/fantasy/FantasyTransfersPostBody;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTransfers", "Ljava/lang/Boolean;", "getWildcard", "getFreeHit", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyTransfersPostBody extends NetworkResponse {

    @Nullable
    private final Boolean freeHit;

    @NotNull
    private final List<FantasyTransferPostModel> transfers;

    @Nullable
    private final Boolean wildcard;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, ypa.a(ysa.b, new jf7(23)), null, null};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FantasyTransfersPostBody(int i, HeadResponse headResponse, ErrorResponse errorResponse, List list, Boolean bool, Boolean bool2, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (4 != (i & 4)) {
            oea.z(i, 4, FantasyTransfersPostBody$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.transfers = list;
        if ((i & 8) == 0) {
            this.wildcard = null;
        } else {
            this.wildcard = bool;
        }
        if ((i & 16) == 0) {
            this.freeHit = null;
        } else {
            this.freeHit = bool2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(FantasyTransferPostModel$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FantasyTransfersPostBody copy$default(FantasyTransfersPostBody fantasyTransfersPostBody, List list, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fantasyTransfersPostBody.transfers;
        }
        if ((i & 2) != 0) {
            bool = fantasyTransfersPostBody.wildcard;
        }
        if ((i & 4) != 0) {
            bool2 = fantasyTransfersPostBody.freeHit;
        }
        return fantasyTransfersPostBody.copy(list, bool, bool2);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyTransfersPostBody self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        output.f(serialDesc, 2, (KSerializer) $childSerializers[2].getValue(), self.transfers);
        if (output.o(serialDesc) || self.wildcard != null) {
            output.h(serialDesc, 3, gz1.a, self.wildcard);
        }
        if (!output.o(serialDesc) && self.freeHit == null) {
            return;
        }
        output.h(serialDesc, 4, gz1.a, self.freeHit);
    }

    @NotNull
    public final List<FantasyTransferPostModel> component1() {
        return this.transfers;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Boolean getWildcard() {
        return this.wildcard;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Boolean getFreeHit() {
        return this.freeHit;
    }

    @NotNull
    public final FantasyTransfersPostBody copy(@NotNull List<FantasyTransferPostModel> transfers, @Nullable Boolean wildcard, @Nullable Boolean freeHit) {
        transfers.getClass();
        return new FantasyTransfersPostBody(transfers, wildcard, freeHit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyTransfersPostBody)) {
            return false;
        }
        FantasyTransfersPostBody fantasyTransfersPostBody = (FantasyTransfersPostBody) other;
        return Intrinsics.c(this.transfers, fantasyTransfersPostBody.transfers) && Intrinsics.c(this.wildcard, fantasyTransfersPostBody.wildcard) && Intrinsics.c(this.freeHit, fantasyTransfersPostBody.freeHit);
    }

    @Nullable
    public final Boolean getFreeHit() {
        return this.freeHit;
    }

    @NotNull
    public final List<FantasyTransferPostModel> getTransfers() {
        return this.transfers;
    }

    @Nullable
    public final Boolean getWildcard() {
        return this.wildcard;
    }

    public int hashCode() {
        int hashCode = this.transfers.hashCode() * 31;
        Boolean bool = this.wildcard;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.freeHit;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FantasyTransfersPostBody(transfers=" + this.transfers + ", wildcard=" + this.wildcard + ", freeHit=" + this.freeHit + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyTransfersPostBody$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyTransfersPostBody;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyTransfersPostBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FantasyTransfersPostBody(@NotNull List<FantasyTransferPostModel> list, @Nullable Boolean bool, @Nullable Boolean bool2) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        list.getClass();
        this.transfers = list;
        this.wildcard = bool;
        this.freeHit = bool2;
    }

    public /* synthetic */ FantasyTransfersPostBody(List list, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2);
    }
}
