package com.sofascore.model.branding;

import defpackage.gz1;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J<\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001aJ\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010 ¨\u00062"}, d2 = {"Lcom/sofascore/model/branding/ServerBrandingOddsTab;", "", "", "id", "Lcom/sofascore/model/branding/ServerBrand;", "brand", "", "oddsTab", "", "url", "<init>", "(ILcom/sofascore/model/branding/ServerBrand;Ljava/lang/Boolean;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/branding/ServerBrand;Ljava/lang/Boolean;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/branding/ServerBrandingOddsTab;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Lcom/sofascore/model/branding/ServerBrand;", "component3", "()Ljava/lang/Boolean;", "component4", "()Ljava/lang/String;", "copy", "(ILcom/sofascore/model/branding/ServerBrand;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/sofascore/model/branding/ServerBrandingOddsTab;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lcom/sofascore/model/branding/ServerBrand;", "getBrand", "Ljava/lang/Boolean;", "getOddsTab", "Ljava/lang/String;", "getUrl", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ServerBrandingOddsTab {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ServerBrand brand;
    private final int id;

    @Nullable
    private final Boolean oddsTab;

    @Nullable
    private final String url;

    public /* synthetic */ ServerBrandingOddsTab(int i, int i2, ServerBrand serverBrand, Boolean bool, String str, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, ServerBrandingOddsTab$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.brand = serverBrand;
        this.oddsTab = bool;
        this.url = str;
    }

    public static /* synthetic */ ServerBrandingOddsTab copy$default(ServerBrandingOddsTab serverBrandingOddsTab, int i, ServerBrand serverBrand, Boolean bool, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = serverBrandingOddsTab.id;
        }
        if ((i2 & 2) != 0) {
            serverBrand = serverBrandingOddsTab.brand;
        }
        if ((i2 & 4) != 0) {
            bool = serverBrandingOddsTab.oddsTab;
        }
        if ((i2 & 8) != 0) {
            str = serverBrandingOddsTab.url;
        }
        return serverBrandingOddsTab.copy(i, serverBrand, bool, str);
    }

    public static final /* synthetic */ void write$Self$model_release(ServerBrandingOddsTab self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.f(serialDesc, 1, ServerBrand$$serializer.INSTANCE, self.brand);
        output.h(serialDesc, 2, gz1.a, self.oddsTab);
        output.h(serialDesc, 3, uhi.a, self.url);
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
    public final Boolean getOddsTab() {
        return this.oddsTab;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final ServerBrandingOddsTab copy(int id, @NotNull ServerBrand brand, @Nullable Boolean oddsTab, @Nullable String url) {
        brand.getClass();
        return new ServerBrandingOddsTab(id, brand, oddsTab, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerBrandingOddsTab)) {
            return false;
        }
        ServerBrandingOddsTab serverBrandingOddsTab = (ServerBrandingOddsTab) other;
        return this.id == serverBrandingOddsTab.id && Intrinsics.c(this.brand, serverBrandingOddsTab.brand) && Intrinsics.c(this.oddsTab, serverBrandingOddsTab.oddsTab) && Intrinsics.c(this.url, serverBrandingOddsTab.url);
    }

    @NotNull
    public final ServerBrand getBrand() {
        return this.brand;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Boolean getOddsTab() {
        return this.oddsTab;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = (this.brand.hashCode() + (Integer.hashCode(this.id) * 31)) * 31;
        Boolean bool = this.oddsTab;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.url;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ServerBrandingOddsTab(id=" + this.id + ", brand=" + this.brand + ", oddsTab=" + this.oddsTab + ", url=" + this.url + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/branding/ServerBrandingOddsTab$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/branding/ServerBrandingOddsTab;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ServerBrandingOddsTab$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ServerBrandingOddsTab(int i, @NotNull ServerBrand serverBrand, @Nullable Boolean bool, @Nullable String str) {
        serverBrand.getClass();
        this.id = i;
        this.brand = serverBrand;
        this.oddsTab = bool;
        this.url = str;
    }
}
