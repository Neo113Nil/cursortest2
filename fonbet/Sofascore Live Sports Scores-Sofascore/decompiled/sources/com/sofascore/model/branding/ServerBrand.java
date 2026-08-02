package com.sofascore.model.branding;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.dmi;
import defpackage.gz1;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eB_\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJZ\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010\u001fJ\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001dJ\u001a\u0010,\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b2\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b5\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b8\u0010\u001f¨\u0006;"}, d2 = {"Lcom/sofascore/model/branding/ServerBrand;", "", "", "id", "", "name", "slug", "Lcom/sofascore/model/branding/ServerBrandColors;", "color", "textColor", "", "showBettingAge", "url", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/branding/ServerBrandColors;Lcom/sofascore/model/branding/ServerBrandColors;Ljava/lang/Boolean;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/branding/ServerBrandColors;Lcom/sofascore/model/branding/ServerBrandColors;Ljava/lang/Boolean;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/branding/ServerBrand;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/sofascore/model/branding/ServerBrandColors;", "component5", "component6", "()Ljava/lang/Boolean;", "component7", "copy", "(ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/branding/ServerBrandColors;Lcom/sofascore/model/branding/ServerBrandColors;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/sofascore/model/branding/ServerBrand;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getName", "getSlug", "Lcom/sofascore/model/branding/ServerBrandColors;", "getColor", "getTextColor", "Ljava/lang/Boolean;", "getShowBettingAge", "getUrl", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ServerBrand {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ServerBrandColors color;
    private final int id;

    @NotNull
    private final String name;

    @Nullable
    private final Boolean showBettingAge;

    @NotNull
    private final String slug;

    @NotNull
    private final ServerBrandColors textColor;

    @Nullable
    private final String url;

    public /* synthetic */ ServerBrand(int i, int i2, String str, String str2, ServerBrandColors serverBrandColors, ServerBrandColors serverBrandColors2, Boolean bool, String str3, t5h t5hVar) {
        if (127 != (i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, ServerBrand$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.name = str;
        this.slug = str2;
        this.color = serverBrandColors;
        this.textColor = serverBrandColors2;
        this.showBettingAge = bool;
        this.url = str3;
    }

    public static /* synthetic */ ServerBrand copy$default(ServerBrand serverBrand, int i, String str, String str2, ServerBrandColors serverBrandColors, ServerBrandColors serverBrandColors2, Boolean bool, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = serverBrand.id;
        }
        if ((i2 & 2) != 0) {
            str = serverBrand.name;
        }
        if ((i2 & 4) != 0) {
            str2 = serverBrand.slug;
        }
        if ((i2 & 8) != 0) {
            serverBrandColors = serverBrand.color;
        }
        if ((i2 & 16) != 0) {
            serverBrandColors2 = serverBrand.textColor;
        }
        if ((i2 & 32) != 0) {
            bool = serverBrand.showBettingAge;
        }
        if ((i2 & 64) != 0) {
            str3 = serverBrand.url;
        }
        Boolean bool2 = bool;
        String str4 = str3;
        ServerBrandColors serverBrandColors3 = serverBrandColors2;
        String str5 = str2;
        return serverBrand.copy(i, str, str5, serverBrandColors, serverBrandColors3, bool2, str4);
    }

    public static final /* synthetic */ void write$Self$model_release(ServerBrand self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.y(serialDesc, 1, self.name);
        output.y(serialDesc, 2, self.slug);
        ServerBrandColors$$serializer serverBrandColors$$serializer = ServerBrandColors$$serializer.INSTANCE;
        output.f(serialDesc, 3, serverBrandColors$$serializer, self.color);
        output.f(serialDesc, 4, serverBrandColors$$serializer, self.textColor);
        output.h(serialDesc, 5, gz1.a, self.showBettingAge);
        output.h(serialDesc, 6, uhi.a, self.url);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ServerBrandColors getColor() {
        return this.color;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ServerBrandColors getTextColor() {
        return this.textColor;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Boolean getShowBettingAge() {
        return this.showBettingAge;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final ServerBrand copy(int id, @NotNull String name, @NotNull String slug, @NotNull ServerBrandColors color, @NotNull ServerBrandColors textColor, @Nullable Boolean showBettingAge, @Nullable String url) {
        name.getClass();
        slug.getClass();
        color.getClass();
        textColor.getClass();
        return new ServerBrand(id, name, slug, color, textColor, showBettingAge, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerBrand)) {
            return false;
        }
        ServerBrand serverBrand = (ServerBrand) other;
        return this.id == serverBrand.id && Intrinsics.c(this.name, serverBrand.name) && Intrinsics.c(this.slug, serverBrand.slug) && Intrinsics.c(this.color, serverBrand.color) && Intrinsics.c(this.textColor, serverBrand.textColor) && Intrinsics.c(this.showBettingAge, serverBrand.showBettingAge) && Intrinsics.c(this.url, serverBrand.url);
    }

    @NotNull
    public final ServerBrandColors getColor() {
        return this.color;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Boolean getShowBettingAge() {
        return this.showBettingAge;
    }

    @NotNull
    public final String getSlug() {
        return this.slug;
    }

    @NotNull
    public final ServerBrandColors getTextColor() {
        return this.textColor;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = (this.textColor.hashCode() + ((this.color.hashCode() + dmi.c(dmi.c(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.slug)) * 31)) * 31;
        Boolean bool = this.showBettingAge;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.url;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.name;
        String str2 = this.slug;
        ServerBrandColors serverBrandColors = this.color;
        ServerBrandColors serverBrandColors2 = this.textColor;
        Boolean bool = this.showBettingAge;
        String str3 = this.url;
        StringBuilder t = dmi.t(i, "ServerBrand(id=", ", name=", str, ", slug=");
        t.append(str2);
        t.append(", color=");
        t.append(serverBrandColors);
        t.append(", textColor=");
        t.append(serverBrandColors2);
        t.append(", showBettingAge=");
        t.append(bool);
        t.append(", url=");
        return mz1.o(t, str3, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/branding/ServerBrand$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/branding/ServerBrand;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ServerBrand$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ServerBrand(int i, @NotNull String str, @NotNull String str2, @NotNull ServerBrandColors serverBrandColors, @NotNull ServerBrandColors serverBrandColors2, @Nullable Boolean bool, @Nullable String str3) {
        str.getClass();
        str2.getClass();
        serverBrandColors.getClass();
        serverBrandColors2.getClass();
        this.id = i;
        this.name = str;
        this.slug = str2;
        this.color = serverBrandColors;
        this.textColor = serverBrandColors2;
        this.showBettingAge = bool;
        this.url = str3;
    }
}
