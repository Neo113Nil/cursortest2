package com.sofascore.model.branding;

import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import defpackage.a7a;
import defpackage.gz1;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KJBq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u0087\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0090\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b+\u0010(J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u0019J\u001a\u0010.\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\b@\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\bA\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\bB\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\bC\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\bD\u0010\u001fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bF\u0010%R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bG\u0010%R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010H\u001a\u0004\bI\u0010(¨\u0006L"}, d2 = {"Lcom/sofascore/model/branding/ServerBrandingFeaturedTournament;", "", "", "id", "Lcom/sofascore/model/branding/ServerBrand;", "brand", "Lcom/sofascore/model/branding/ServerImageDisplayType;", "upperImageDisplayType", "upperBannerHeight", "upperAdUnitHeight", "lowerImageDisplayType", "lowerBannerHeight", "lowerAdUnitHeight", "", "playerOfTheMatch", "timerImage", "", "url", "<init>", "(ILcom/sofascore/model/branding/ServerBrand;Lcom/sofascore/model/branding/ServerImageDisplayType;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/branding/ServerImageDisplayType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/branding/ServerBrand;Lcom/sofascore/model/branding/ServerImageDisplayType;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/branding/ServerImageDisplayType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lt5h;)V", "component1", "()I", "component2", "()Lcom/sofascore/model/branding/ServerBrand;", "component3", "()Lcom/sofascore/model/branding/ServerImageDisplayType;", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "component8", "component9", "()Ljava/lang/Boolean;", "component10", "component11", "()Ljava/lang/String;", "copy", "(ILcom/sofascore/model/branding/ServerBrand;Lcom/sofascore/model/branding/ServerImageDisplayType;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/branding/ServerImageDisplayType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/sofascore/model/branding/ServerBrandingFeaturedTournament;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/branding/ServerBrandingFeaturedTournament;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Lcom/sofascore/model/branding/ServerBrand;", "getBrand", "Lcom/sofascore/model/branding/ServerImageDisplayType;", "getUpperImageDisplayType", "Ljava/lang/Integer;", "getUpperBannerHeight", "getUpperAdUnitHeight", "getLowerImageDisplayType", "getLowerBannerHeight", "getLowerAdUnitHeight", "Ljava/lang/Boolean;", "getPlayerOfTheMatch", "getTimerImage", "Ljava/lang/String;", "getUrl", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ServerBrandingFeaturedTournament {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ServerBrand brand;
    private final int id;

    @Nullable
    private final Integer lowerAdUnitHeight;

    @Nullable
    private final Integer lowerBannerHeight;

    @Nullable
    private final ServerImageDisplayType lowerImageDisplayType;

    @Nullable
    private final Boolean playerOfTheMatch;

    @Nullable
    private final Boolean timerImage;

    @Nullable
    private final Integer upperAdUnitHeight;

    @Nullable
    private final Integer upperBannerHeight;

    @Nullable
    private final ServerImageDisplayType upperImageDisplayType;

    @Nullable
    private final String url;

    public /* synthetic */ ServerBrandingFeaturedTournament(int i, int i2, ServerBrand serverBrand, ServerImageDisplayType serverImageDisplayType, Integer num, Integer num2, ServerImageDisplayType serverImageDisplayType2, Integer num3, Integer num4, Boolean bool, Boolean bool2, String str, t5h t5hVar) {
        if (2047 != (i & 2047)) {
            oea.z(i, 2047, ServerBrandingFeaturedTournament$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.brand = serverBrand;
        this.upperImageDisplayType = serverImageDisplayType;
        this.upperBannerHeight = num;
        this.upperAdUnitHeight = num2;
        this.lowerImageDisplayType = serverImageDisplayType2;
        this.lowerBannerHeight = num3;
        this.lowerAdUnitHeight = num4;
        this.playerOfTheMatch = bool;
        this.timerImage = bool2;
        this.url = str;
    }

    public static /* synthetic */ ServerBrandingFeaturedTournament copy$default(ServerBrandingFeaturedTournament serverBrandingFeaturedTournament, int i, ServerBrand serverBrand, ServerImageDisplayType serverImageDisplayType, Integer num, Integer num2, ServerImageDisplayType serverImageDisplayType2, Integer num3, Integer num4, Boolean bool, Boolean bool2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = serverBrandingFeaturedTournament.id;
        }
        if ((i2 & 2) != 0) {
            serverBrand = serverBrandingFeaturedTournament.brand;
        }
        if ((i2 & 4) != 0) {
            serverImageDisplayType = serverBrandingFeaturedTournament.upperImageDisplayType;
        }
        if ((i2 & 8) != 0) {
            num = serverBrandingFeaturedTournament.upperBannerHeight;
        }
        if ((i2 & 16) != 0) {
            num2 = serverBrandingFeaturedTournament.upperAdUnitHeight;
        }
        if ((i2 & 32) != 0) {
            serverImageDisplayType2 = serverBrandingFeaturedTournament.lowerImageDisplayType;
        }
        if ((i2 & 64) != 0) {
            num3 = serverBrandingFeaturedTournament.lowerBannerHeight;
        }
        if ((i2 & 128) != 0) {
            num4 = serverBrandingFeaturedTournament.lowerAdUnitHeight;
        }
        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            bool = serverBrandingFeaturedTournament.playerOfTheMatch;
        }
        if ((i2 & 512) != 0) {
            bool2 = serverBrandingFeaturedTournament.timerImage;
        }
        if ((i2 & 1024) != 0) {
            str = serverBrandingFeaturedTournament.url;
        }
        Boolean bool3 = bool2;
        String str2 = str;
        Integer num5 = num4;
        Boolean bool4 = bool;
        ServerImageDisplayType serverImageDisplayType3 = serverImageDisplayType2;
        Integer num6 = num3;
        Integer num7 = num2;
        ServerImageDisplayType serverImageDisplayType4 = serverImageDisplayType;
        return serverBrandingFeaturedTournament.copy(i, serverBrand, serverImageDisplayType4, num, num7, serverImageDisplayType3, num6, num5, bool4, bool3, str2);
    }

    public static final /* synthetic */ void write$Self$model_release(ServerBrandingFeaturedTournament self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.f(serialDesc, 1, ServerBrand$$serializer.INSTANCE, self.brand);
        ImageDisplayTypeSerializer imageDisplayTypeSerializer = ImageDisplayTypeSerializer.INSTANCE;
        output.h(serialDesc, 2, imageDisplayTypeSerializer, self.upperImageDisplayType);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 3, a7aVar, self.upperBannerHeight);
        output.h(serialDesc, 4, a7aVar, self.upperAdUnitHeight);
        output.h(serialDesc, 5, imageDisplayTypeSerializer, self.lowerImageDisplayType);
        output.h(serialDesc, 6, a7aVar, self.lowerBannerHeight);
        output.h(serialDesc, 7, a7aVar, self.lowerAdUnitHeight);
        gz1 gz1Var = gz1.a;
        output.h(serialDesc, 8, gz1Var, self.playerOfTheMatch);
        output.h(serialDesc, 9, gz1Var, self.timerImage);
        output.h(serialDesc, 10, uhi.a, self.url);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Boolean getTimerImage() {
        return this.timerImage;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ServerBrand getBrand() {
        return this.brand;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final ServerImageDisplayType getUpperImageDisplayType() {
        return this.upperImageDisplayType;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getUpperBannerHeight() {
        return this.upperBannerHeight;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getUpperAdUnitHeight() {
        return this.upperAdUnitHeight;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final ServerImageDisplayType getLowerImageDisplayType() {
        return this.lowerImageDisplayType;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getLowerBannerHeight() {
        return this.lowerBannerHeight;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getLowerAdUnitHeight() {
        return this.lowerAdUnitHeight;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Boolean getPlayerOfTheMatch() {
        return this.playerOfTheMatch;
    }

    @NotNull
    public final ServerBrandingFeaturedTournament copy(int id, @NotNull ServerBrand brand, @Nullable ServerImageDisplayType upperImageDisplayType, @Nullable Integer upperBannerHeight, @Nullable Integer upperAdUnitHeight, @Nullable ServerImageDisplayType lowerImageDisplayType, @Nullable Integer lowerBannerHeight, @Nullable Integer lowerAdUnitHeight, @Nullable Boolean playerOfTheMatch, @Nullable Boolean timerImage, @Nullable String url) {
        brand.getClass();
        return new ServerBrandingFeaturedTournament(id, brand, upperImageDisplayType, upperBannerHeight, upperAdUnitHeight, lowerImageDisplayType, lowerBannerHeight, lowerAdUnitHeight, playerOfTheMatch, timerImage, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerBrandingFeaturedTournament)) {
            return false;
        }
        ServerBrandingFeaturedTournament serverBrandingFeaturedTournament = (ServerBrandingFeaturedTournament) other;
        return this.id == serverBrandingFeaturedTournament.id && Intrinsics.c(this.brand, serverBrandingFeaturedTournament.brand) && this.upperImageDisplayType == serverBrandingFeaturedTournament.upperImageDisplayType && Intrinsics.c(this.upperBannerHeight, serverBrandingFeaturedTournament.upperBannerHeight) && Intrinsics.c(this.upperAdUnitHeight, serverBrandingFeaturedTournament.upperAdUnitHeight) && this.lowerImageDisplayType == serverBrandingFeaturedTournament.lowerImageDisplayType && Intrinsics.c(this.lowerBannerHeight, serverBrandingFeaturedTournament.lowerBannerHeight) && Intrinsics.c(this.lowerAdUnitHeight, serverBrandingFeaturedTournament.lowerAdUnitHeight) && Intrinsics.c(this.playerOfTheMatch, serverBrandingFeaturedTournament.playerOfTheMatch) && Intrinsics.c(this.timerImage, serverBrandingFeaturedTournament.timerImage) && Intrinsics.c(this.url, serverBrandingFeaturedTournament.url);
    }

    @NotNull
    public final ServerBrand getBrand() {
        return this.brand;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getLowerAdUnitHeight() {
        return this.lowerAdUnitHeight;
    }

    @Nullable
    public final Integer getLowerBannerHeight() {
        return this.lowerBannerHeight;
    }

    @Nullable
    public final ServerImageDisplayType getLowerImageDisplayType() {
        return this.lowerImageDisplayType;
    }

    @Nullable
    public final Boolean getPlayerOfTheMatch() {
        return this.playerOfTheMatch;
    }

    @Nullable
    public final Boolean getTimerImage() {
        return this.timerImage;
    }

    @Nullable
    public final Integer getUpperAdUnitHeight() {
        return this.upperAdUnitHeight;
    }

    @Nullable
    public final Integer getUpperBannerHeight() {
        return this.upperBannerHeight;
    }

    @Nullable
    public final ServerImageDisplayType getUpperImageDisplayType() {
        return this.upperImageDisplayType;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = (this.brand.hashCode() + (Integer.hashCode(this.id) * 31)) * 31;
        ServerImageDisplayType serverImageDisplayType = this.upperImageDisplayType;
        int hashCode2 = (hashCode + (serverImageDisplayType == null ? 0 : serverImageDisplayType.hashCode())) * 31;
        Integer num = this.upperBannerHeight;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.upperAdUnitHeight;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ServerImageDisplayType serverImageDisplayType2 = this.lowerImageDisplayType;
        int hashCode5 = (hashCode4 + (serverImageDisplayType2 == null ? 0 : serverImageDisplayType2.hashCode())) * 31;
        Integer num3 = this.lowerBannerHeight;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.lowerAdUnitHeight;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.playerOfTheMatch;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.timerImage;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.url;
        return hashCode9 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        ServerBrand serverBrand = this.brand;
        ServerImageDisplayType serverImageDisplayType = this.upperImageDisplayType;
        Integer num = this.upperBannerHeight;
        Integer num2 = this.upperAdUnitHeight;
        ServerImageDisplayType serverImageDisplayType2 = this.lowerImageDisplayType;
        Integer num3 = this.lowerBannerHeight;
        Integer num4 = this.lowerAdUnitHeight;
        Boolean bool = this.playerOfTheMatch;
        Boolean bool2 = this.timerImage;
        String str = this.url;
        StringBuilder sb = new StringBuilder("ServerBrandingFeaturedTournament(id=");
        sb.append(i);
        sb.append(", brand=");
        sb.append(serverBrand);
        sb.append(", upperImageDisplayType=");
        sb.append(serverImageDisplayType);
        sb.append(", upperBannerHeight=");
        sb.append(num);
        sb.append(", upperAdUnitHeight=");
        sb.append(num2);
        sb.append(", lowerImageDisplayType=");
        sb.append(serverImageDisplayType2);
        sb.append(", lowerBannerHeight=");
        vxd.r(num3, num4, ", lowerAdUnitHeight=", ", playerOfTheMatch=", sb);
        i.q(sb, bool, ", timerImage=", bool2, ", url=");
        return mz1.o(sb, str, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/branding/ServerBrandingFeaturedTournament$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/branding/ServerBrandingFeaturedTournament;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ServerBrandingFeaturedTournament$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ServerBrandingFeaturedTournament(int i, @NotNull ServerBrand serverBrand, @Nullable ServerImageDisplayType serverImageDisplayType, @Nullable Integer num, @Nullable Integer num2, @Nullable ServerImageDisplayType serverImageDisplayType2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str) {
        serverBrand.getClass();
        this.id = i;
        this.brand = serverBrand;
        this.upperImageDisplayType = serverImageDisplayType;
        this.upperBannerHeight = num;
        this.upperAdUnitHeight = num2;
        this.lowerImageDisplayType = serverImageDisplayType2;
        this.lowerBannerHeight = num3;
        this.lowerAdUnitHeight = num4;
        this.playerOfTheMatch = bool;
        this.timerImage = bool2;
        this.url = str;
    }
}
