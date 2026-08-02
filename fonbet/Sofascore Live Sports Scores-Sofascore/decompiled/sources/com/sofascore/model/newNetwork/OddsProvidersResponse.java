package com.sofascore.model.newNetwork;

import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.OddsCountryProvider$$serializer;
import defpackage.a7a;
import defpackage.ild;
import defpackage.joa;
import defpackage.km5;
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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bBI\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0007\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ,\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001d¨\u00060"}, d2 = {"Lcom/sofascore/model/newNetwork/OddsProvidersResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "", "Lcom/sofascore/model/odds/OddsCountryProvider;", "providers", "", "minimumRequiredProviders", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Ljava/util/List;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/OddsProvidersResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/util/List;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/OddsProvidersResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getProviders", "Ljava/lang/Integer;", "getMinimumRequiredProviders", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OddsProvidersResponse extends NetworkResponse {

    @Nullable
    private final Integer minimumRequiredProviders;

    @NotNull
    private final List<OddsCountryProvider> providers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, ypa.a(ysa.b, new ild(2)), null};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OddsProvidersResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, List list, Integer num, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (8 != (i & 8)) {
            oea.z(i, 8, OddsProvidersResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.providers = km5.a;
        } else {
            this.providers = list;
        }
        this.minimumRequiredProviders = num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(OddsCountryProvider$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OddsProvidersResponse copy$default(OddsProvidersResponse oddsProvidersResponse, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = oddsProvidersResponse.providers;
        }
        if ((i & 2) != 0) {
            num = oddsProvidersResponse.minimumRequiredProviders;
        }
        return oddsProvidersResponse.copy(list, num);
    }

    public static final void write$Self$model_release(OddsProvidersResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        if (output.o(serialDesc) || !Intrinsics.c(self.providers, km5.a)) {
            output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.providers);
        }
        output.h(serialDesc, 3, a7a.a, self.minimumRequiredProviders);
    }

    @NotNull
    public final List<OddsCountryProvider> component1() {
        return this.providers;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getMinimumRequiredProviders() {
        return this.minimumRequiredProviders;
    }

    @NotNull
    public final OddsProvidersResponse copy(@NotNull List<OddsCountryProvider> providers, @Nullable Integer minimumRequiredProviders) {
        providers.getClass();
        return new OddsProvidersResponse(providers, minimumRequiredProviders);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OddsProvidersResponse)) {
            return false;
        }
        OddsProvidersResponse oddsProvidersResponse = (OddsProvidersResponse) other;
        return Intrinsics.c(this.providers, oddsProvidersResponse.providers) && Intrinsics.c(this.minimumRequiredProviders, oddsProvidersResponse.minimumRequiredProviders);
    }

    @Nullable
    public final Integer getMinimumRequiredProviders() {
        return this.minimumRequiredProviders;
    }

    @NotNull
    public final List<OddsCountryProvider> getProviders() {
        return this.providers;
    }

    public int hashCode() {
        int hashCode = this.providers.hashCode() * 31;
        Integer num = this.minimumRequiredProviders;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "OddsProvidersResponse(providers=" + this.providers + ", minimumRequiredProviders=" + this.minimumRequiredProviders + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/OddsProvidersResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/OddsProvidersResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return OddsProvidersResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OddsProvidersResponse(@NotNull List<OddsCountryProvider> list, @Nullable Integer num) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        list.getClass();
        this.providers = list;
        this.minimumRequiredProviders = num;
    }

    public OddsProvidersResponse(List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? km5.a : list, num);
    }
}
