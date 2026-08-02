package com.sofascore.model.branding;

import defpackage.a7a;
import defpackage.dmi;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b'\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fB]\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b)\u0010\"J^\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b,\u0010\"J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001eJ\u001a\u0010/\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b=\u0010\"¨\u0006@"}, d2 = {"Lcom/sofascore/model/branding/ServerBrandingEvent;", "", "", "id", "Lcom/sofascore/model/branding/ServerBrand;", "brand", "", "url", "Lcom/sofascore/model/branding/ServerBrandingBoostedOdds;", "boostedOdds", "", "bettorsOnly", "oddsProviderId", "offerType", "<init>", "(ILcom/sofascore/model/branding/ServerBrand;Ljava/lang/String;Lcom/sofascore/model/branding/ServerBrandingBoostedOdds;ZLjava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/branding/ServerBrand;Ljava/lang/String;Lcom/sofascore/model/branding/ServerBrandingBoostedOdds;ZLjava/lang/Integer;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/branding/ServerBrandingEvent;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Lcom/sofascore/model/branding/ServerBrand;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/sofascore/model/branding/ServerBrandingBoostedOdds;", "component5", "()Z", "component6", "()Ljava/lang/Integer;", "component7", "copy", "(ILcom/sofascore/model/branding/ServerBrand;Ljava/lang/String;Lcom/sofascore/model/branding/ServerBrandingBoostedOdds;ZLjava/lang/Integer;Ljava/lang/String;)Lcom/sofascore/model/branding/ServerBrandingEvent;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lcom/sofascore/model/branding/ServerBrand;", "getBrand", "Ljava/lang/String;", "getUrl", "Lcom/sofascore/model/branding/ServerBrandingBoostedOdds;", "getBoostedOdds", "Z", "getBettorsOnly", "Ljava/lang/Integer;", "getOddsProviderId", "getOfferType", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ServerBrandingEvent {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean bettorsOnly;

    @Nullable
    private final ServerBrandingBoostedOdds boostedOdds;

    @NotNull
    private final ServerBrand brand;
    private final int id;

    @Nullable
    private final Integer oddsProviderId;

    @Nullable
    private final String offerType;

    @Nullable
    private final String url;

    public /* synthetic */ ServerBrandingEvent(int i, int i2, ServerBrand serverBrand, String str, ServerBrandingBoostedOdds serverBrandingBoostedOdds, boolean z, Integer num, String str2, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, ServerBrandingEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.brand = serverBrand;
        this.url = str;
        this.boostedOdds = serverBrandingBoostedOdds;
        this.bettorsOnly = z;
        this.oddsProviderId = num;
        if ((i & 64) == 0) {
            this.offerType = null;
        } else {
            this.offerType = str2;
        }
    }

    public static /* synthetic */ ServerBrandingEvent copy$default(ServerBrandingEvent serverBrandingEvent, int i, ServerBrand serverBrand, String str, ServerBrandingBoostedOdds serverBrandingBoostedOdds, boolean z, Integer num, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = serverBrandingEvent.id;
        }
        if ((i2 & 2) != 0) {
            serverBrand = serverBrandingEvent.brand;
        }
        if ((i2 & 4) != 0) {
            str = serverBrandingEvent.url;
        }
        if ((i2 & 8) != 0) {
            serverBrandingBoostedOdds = serverBrandingEvent.boostedOdds;
        }
        if ((i2 & 16) != 0) {
            z = serverBrandingEvent.bettorsOnly;
        }
        if ((i2 & 32) != 0) {
            num = serverBrandingEvent.oddsProviderId;
        }
        if ((i2 & 64) != 0) {
            str2 = serverBrandingEvent.offerType;
        }
        Integer num2 = num;
        String str3 = str2;
        boolean z2 = z;
        String str4 = str;
        return serverBrandingEvent.copy(i, serverBrand, str4, serverBrandingBoostedOdds, z2, num2, str3);
    }

    public static final /* synthetic */ void write$Self$model_release(ServerBrandingEvent self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.f(serialDesc, 1, ServerBrand$$serializer.INSTANCE, self.brand);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 2, uhiVar, self.url);
        output.h(serialDesc, 3, ServerBrandingBoostedOdds$$serializer.INSTANCE, self.boostedOdds);
        output.x(serialDesc, 4, self.bettorsOnly);
        output.h(serialDesc, 5, a7a.a, self.oddsProviderId);
        if (!output.o(serialDesc) && self.offerType == null) {
            return;
        }
        output.h(serialDesc, 6, uhiVar, self.offerType);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ServerBrand getBrand() {
        return this.brand;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final ServerBrandingBoostedOdds getBoostedOdds() {
        return this.boostedOdds;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getBettorsOnly() {
        return this.bettorsOnly;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getOddsProviderId() {
        return this.oddsProviderId;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getOfferType() {
        return this.offerType;
    }

    @NotNull
    public final ServerBrandingEvent copy(int id, @NotNull ServerBrand brand, @Nullable String url, @Nullable ServerBrandingBoostedOdds boostedOdds, boolean bettorsOnly, @Nullable Integer oddsProviderId, @Nullable String offerType) {
        brand.getClass();
        return new ServerBrandingEvent(id, brand, url, boostedOdds, bettorsOnly, oddsProviderId, offerType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerBrandingEvent)) {
            return false;
        }
        ServerBrandingEvent serverBrandingEvent = (ServerBrandingEvent) other;
        return this.id == serverBrandingEvent.id && Intrinsics.c(this.brand, serverBrandingEvent.brand) && Intrinsics.c(this.url, serverBrandingEvent.url) && Intrinsics.c(this.boostedOdds, serverBrandingEvent.boostedOdds) && this.bettorsOnly == serverBrandingEvent.bettorsOnly && Intrinsics.c(this.oddsProviderId, serverBrandingEvent.oddsProviderId) && Intrinsics.c(this.offerType, serverBrandingEvent.offerType);
    }

    public final boolean getBettorsOnly() {
        return this.bettorsOnly;
    }

    @Nullable
    public final ServerBrandingBoostedOdds getBoostedOdds() {
        return this.boostedOdds;
    }

    @NotNull
    public final ServerBrand getBrand() {
        return this.brand;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getOddsProviderId() {
        return this.oddsProviderId;
    }

    @Nullable
    public final String getOfferType() {
        return this.offerType;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = (this.brand.hashCode() + (Integer.hashCode(this.id) * 31)) * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ServerBrandingBoostedOdds serverBrandingBoostedOdds = this.boostedOdds;
        int e = dmi.e((hashCode2 + (serverBrandingBoostedOdds == null ? 0 : serverBrandingBoostedOdds.hashCode())) * 31, 31, this.bettorsOnly);
        Integer num = this.oddsProviderId;
        int hashCode3 = (e + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.offerType;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        ServerBrand serverBrand = this.brand;
        String str = this.url;
        ServerBrandingBoostedOdds serverBrandingBoostedOdds = this.boostedOdds;
        boolean z = this.bettorsOnly;
        Integer num = this.oddsProviderId;
        String str2 = this.offerType;
        StringBuilder sb = new StringBuilder("ServerBrandingEvent(id=");
        sb.append(i);
        sb.append(", brand=");
        sb.append(serverBrand);
        sb.append(", url=");
        sb.append(str);
        sb.append(", boostedOdds=");
        sb.append(serverBrandingBoostedOdds);
        sb.append(", bettorsOnly=");
        sb.append(z);
        sb.append(", oddsProviderId=");
        sb.append(num);
        sb.append(", offerType=");
        return mz1.o(sb, str2, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/branding/ServerBrandingEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/branding/ServerBrandingEvent;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ServerBrandingEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ServerBrandingEvent(int i, @NotNull ServerBrand serverBrand, @Nullable String str, @Nullable ServerBrandingBoostedOdds serverBrandingBoostedOdds, boolean z, @Nullable Integer num, @Nullable String str2) {
        serverBrand.getClass();
        this.id = i;
        this.brand = serverBrand;
        this.url = str;
        this.boostedOdds = serverBrandingBoostedOdds;
        this.bettorsOnly = z;
        this.oddsProviderId = num;
        this.offerType = str2;
    }

    public /* synthetic */ ServerBrandingEvent(int i, ServerBrand serverBrand, String str, ServerBrandingBoostedOdds serverBrandingBoostedOdds, boolean z, Integer num, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, serverBrand, str, serverBrandingBoostedOdds, z, num, (i2 & 64) != 0 ? null : str2);
    }
}
