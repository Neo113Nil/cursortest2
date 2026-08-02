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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bBI\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0007\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, d2 = {"Lcom/sofascore/model/fantasy/FantasySubstitutionsPostBody;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "", "Lcom/sofascore/model/fantasy/FantasyPlayerPostModel;", "players", "", "tripleCaptain", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Ljava/util/List;Ljava/lang/Boolean;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasySubstitutionsPostBody;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/util/List;Ljava/lang/Boolean;)Lcom/sofascore/model/fantasy/FantasySubstitutionsPostBody;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPlayers", "Ljava/lang/Boolean;", "getTripleCaptain", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasySubstitutionsPostBody extends NetworkResponse {

    @NotNull
    private final List<FantasyPlayerPostModel> players;

    @Nullable
    private final Boolean tripleCaptain;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, ypa.a(ysa.b, new jf7(17)), null};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FantasySubstitutionsPostBody(int i, HeadResponse headResponse, ErrorResponse errorResponse, List list, Boolean bool, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (4 != (i & 4)) {
            oea.z(i, 4, FantasySubstitutionsPostBody$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.players = list;
        if ((i & 8) == 0) {
            this.tripleCaptain = null;
        } else {
            this.tripleCaptain = bool;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(FantasyPlayerPostModel$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FantasySubstitutionsPostBody copy$default(FantasySubstitutionsPostBody fantasySubstitutionsPostBody, List list, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fantasySubstitutionsPostBody.players;
        }
        if ((i & 2) != 0) {
            bool = fantasySubstitutionsPostBody.tripleCaptain;
        }
        return fantasySubstitutionsPostBody.copy(list, bool);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasySubstitutionsPostBody self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        output.f(serialDesc, 2, (KSerializer) $childSerializers[2].getValue(), self.players);
        if (!output.o(serialDesc) && self.tripleCaptain == null) {
            return;
        }
        output.h(serialDesc, 3, gz1.a, self.tripleCaptain);
    }

    @NotNull
    public final List<FantasyPlayerPostModel> component1() {
        return this.players;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Boolean getTripleCaptain() {
        return this.tripleCaptain;
    }

    @NotNull
    public final FantasySubstitutionsPostBody copy(@NotNull List<FantasyPlayerPostModel> players, @Nullable Boolean tripleCaptain) {
        players.getClass();
        return new FantasySubstitutionsPostBody(players, tripleCaptain);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasySubstitutionsPostBody)) {
            return false;
        }
        FantasySubstitutionsPostBody fantasySubstitutionsPostBody = (FantasySubstitutionsPostBody) other;
        return Intrinsics.c(this.players, fantasySubstitutionsPostBody.players) && Intrinsics.c(this.tripleCaptain, fantasySubstitutionsPostBody.tripleCaptain);
    }

    @NotNull
    public final List<FantasyPlayerPostModel> getPlayers() {
        return this.players;
    }

    @Nullable
    public final Boolean getTripleCaptain() {
        return this.tripleCaptain;
    }

    public int hashCode() {
        int hashCode = this.players.hashCode() * 31;
        Boolean bool = this.tripleCaptain;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public String toString() {
        return "FantasySubstitutionsPostBody(players=" + this.players + ", tripleCaptain=" + this.tripleCaptain + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasySubstitutionsPostBody$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasySubstitutionsPostBody;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasySubstitutionsPostBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FantasySubstitutionsPostBody(@NotNull List<FantasyPlayerPostModel> list, @Nullable Boolean bool) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        list.getClass();
        this.players = list;
        this.tripleCaptain = bool;
    }

    public /* synthetic */ FantasySubstitutionsPostBody(List list, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : bool);
    }
}
