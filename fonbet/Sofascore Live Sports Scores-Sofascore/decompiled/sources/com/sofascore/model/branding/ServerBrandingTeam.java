package com.sofascore.model.branding;

import com.appsflyer.internal.i;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.a7a;
import defpackage.gz1;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 _2\u00020\u0001:\u0002`_B£\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aB¹\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010(J\u0012\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b-\u0010$J\u0012\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b.\u0010$J\u0012\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b/\u0010$J\u0012\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b0\u0010$J\u0012\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b1\u0010$J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010(J\u0012\u00103\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b5\u00106JÌ\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b9\u0010&J\u0010\u0010:\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b:\u0010 J\u001a\u0010<\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b<\u0010=J'\u0010F\u001a\u00020C2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0001¢\u0006\u0004\bD\u0010ER\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010G\u001a\u0004\bH\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010I\u001a\u0004\bJ\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010K\u001a\u0004\bL\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010M\u001a\u0004\bN\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010O\u001a\u0004\bP\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010O\u001a\u0004\bQ\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010O\u001a\u0004\bR\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010S\u001a\u0004\bT\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010K\u001a\u0004\bU\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010K\u001a\u0004\bV\u0010$R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010K\u001a\u0004\bW\u0010$R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\bX\u0010$R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010K\u001a\u0004\bY\u0010$R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010O\u001a\u0004\bZ\u0010(R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010[\u001a\u0004\b\\\u00104R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010]\u001a\u0004\b^\u00106¨\u0006a"}, d2 = {"Lcom/sofascore/model/branding/ServerBrandingTeam;", "", "", "id", "Lcom/sofascore/model/branding/ServerBrand;", "brand", "", "banner", "", "url", "oddsProviderId", "bannerHeight", "adUnitHeight", "Lcom/sofascore/model/branding/ServerImageDisplayType;", "imageDisplayType", "header", "appHeader", "contentHeader", "background", "takeoverImage", "takeoverImageHeight", "Lcom/sofascore/model/branding/ServerBrandColors;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Lcom/sofascore/model/branding/ServerBrandingBackgroundColors;", "backgroundGradientColor", "<init>", "(ILcom/sofascore/model/branding/ServerBrand;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/branding/ServerImageDisplayType;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/sofascore/model/branding/ServerBrandColors;Lcom/sofascore/model/branding/ServerBrandingBackgroundColors;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/branding/ServerBrand;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/branding/ServerImageDisplayType;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/sofascore/model/branding/ServerBrandColors;Lcom/sofascore/model/branding/ServerBrandingBackgroundColors;Lt5h;)V", "component1", "()I", "component2", "()Lcom/sofascore/model/branding/ServerBrand;", "component3", "()Ljava/lang/Boolean;", "component4", "()Ljava/lang/String;", "component5", "()Ljava/lang/Integer;", "component6", "component7", "component8", "()Lcom/sofascore/model/branding/ServerImageDisplayType;", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "()Lcom/sofascore/model/branding/ServerBrandColors;", "component16", "()Lcom/sofascore/model/branding/ServerBrandingBackgroundColors;", "copy", "(ILcom/sofascore/model/branding/ServerBrand;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/branding/ServerImageDisplayType;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/sofascore/model/branding/ServerBrandColors;Lcom/sofascore/model/branding/ServerBrandingBackgroundColors;)Lcom/sofascore/model/branding/ServerBrandingTeam;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/branding/ServerBrandingTeam;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Lcom/sofascore/model/branding/ServerBrand;", "getBrand", "Ljava/lang/Boolean;", "getBanner", "Ljava/lang/String;", "getUrl", "Ljava/lang/Integer;", "getOddsProviderId", "getBannerHeight", "getAdUnitHeight", "Lcom/sofascore/model/branding/ServerImageDisplayType;", "getImageDisplayType", "getHeader", "getAppHeader", "getContentHeader", "getBackground", "getTakeoverImage", "getTakeoverImageHeight", "Lcom/sofascore/model/branding/ServerBrandColors;", "getBackgroundColor", "Lcom/sofascore/model/branding/ServerBrandingBackgroundColors;", "getBackgroundGradientColor", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ServerBrandingTeam {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer adUnitHeight;

    @Nullable
    private final Boolean appHeader;

    @Nullable
    private final Boolean background;

    @Nullable
    private final ServerBrandColors backgroundColor;

    @Nullable
    private final ServerBrandingBackgroundColors backgroundGradientColor;

    @Nullable
    private final Boolean banner;

    @Nullable
    private final Integer bannerHeight;

    @NotNull
    private final ServerBrand brand;

    @Nullable
    private final Boolean contentHeader;

    @Nullable
    private final Boolean header;
    private final int id;

    @Nullable
    private final ServerImageDisplayType imageDisplayType;

    @Nullable
    private final Integer oddsProviderId;

    @Nullable
    private final Boolean takeoverImage;

    @Nullable
    private final Integer takeoverImageHeight;

    @Nullable
    private final String url;

    public /* synthetic */ ServerBrandingTeam(int i, int i2, ServerBrand serverBrand, Boolean bool, String str, Integer num, Integer num2, Integer num3, ServerImageDisplayType serverImageDisplayType, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Integer num4, ServerBrandColors serverBrandColors, ServerBrandingBackgroundColors serverBrandingBackgroundColors, t5h t5hVar) {
        if (65535 != (i & 65535)) {
            oea.z(i, 65535, ServerBrandingTeam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.brand = serverBrand;
        this.banner = bool;
        this.url = str;
        this.oddsProviderId = num;
        this.bannerHeight = num2;
        this.adUnitHeight = num3;
        this.imageDisplayType = serverImageDisplayType;
        this.header = bool2;
        this.appHeader = bool3;
        this.contentHeader = bool4;
        this.background = bool5;
        this.takeoverImage = bool6;
        this.takeoverImageHeight = num4;
        this.backgroundColor = serverBrandColors;
        this.backgroundGradientColor = serverBrandingBackgroundColors;
    }

    public static final /* synthetic */ void write$Self$model_release(ServerBrandingTeam self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.f(serialDesc, 1, ServerBrand$$serializer.INSTANCE, self.brand);
        gz1 gz1Var = gz1.a;
        output.h(serialDesc, 2, gz1Var, self.banner);
        output.h(serialDesc, 3, uhi.a, self.url);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 4, a7aVar, self.oddsProviderId);
        output.h(serialDesc, 5, a7aVar, self.bannerHeight);
        output.h(serialDesc, 6, a7aVar, self.adUnitHeight);
        output.h(serialDesc, 7, ImageDisplayTypeSerializer.INSTANCE, self.imageDisplayType);
        output.h(serialDesc, 8, gz1Var, self.header);
        output.h(serialDesc, 9, gz1Var, self.appHeader);
        output.h(serialDesc, 10, gz1Var, self.contentHeader);
        output.h(serialDesc, 11, gz1Var, self.background);
        output.h(serialDesc, 12, gz1Var, self.takeoverImage);
        output.h(serialDesc, 13, a7aVar, self.takeoverImageHeight);
        output.h(serialDesc, 14, ServerBrandColors$$serializer.INSTANCE, self.backgroundColor);
        output.h(serialDesc, 15, ServerBrandingBackgroundColors$$serializer.INSTANCE, self.backgroundGradientColor);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Boolean getAppHeader() {
        return this.appHeader;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Boolean getContentHeader() {
        return this.contentHeader;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Boolean getBackground() {
        return this.background;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Boolean getTakeoverImage() {
        return this.takeoverImage;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getTakeoverImageHeight() {
        return this.takeoverImageHeight;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final ServerBrandColors getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final ServerBrandingBackgroundColors getBackgroundGradientColor() {
        return this.backgroundGradientColor;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ServerBrand getBrand() {
        return this.brand;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Boolean getBanner() {
        return this.banner;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getOddsProviderId() {
        return this.oddsProviderId;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getBannerHeight() {
        return this.bannerHeight;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getAdUnitHeight() {
        return this.adUnitHeight;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final ServerImageDisplayType getImageDisplayType() {
        return this.imageDisplayType;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Boolean getHeader() {
        return this.header;
    }

    @NotNull
    public final ServerBrandingTeam copy(int id, @NotNull ServerBrand brand, @Nullable Boolean banner, @Nullable String url, @Nullable Integer oddsProviderId, @Nullable Integer bannerHeight, @Nullable Integer adUnitHeight, @Nullable ServerImageDisplayType imageDisplayType, @Nullable Boolean header, @Nullable Boolean appHeader, @Nullable Boolean contentHeader, @Nullable Boolean background, @Nullable Boolean takeoverImage, @Nullable Integer takeoverImageHeight, @Nullable ServerBrandColors backgroundColor, @Nullable ServerBrandingBackgroundColors backgroundGradientColor) {
        brand.getClass();
        return new ServerBrandingTeam(id, brand, banner, url, oddsProviderId, bannerHeight, adUnitHeight, imageDisplayType, header, appHeader, contentHeader, background, takeoverImage, takeoverImageHeight, backgroundColor, backgroundGradientColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerBrandingTeam)) {
            return false;
        }
        ServerBrandingTeam serverBrandingTeam = (ServerBrandingTeam) other;
        return this.id == serverBrandingTeam.id && Intrinsics.c(this.brand, serverBrandingTeam.brand) && Intrinsics.c(this.banner, serverBrandingTeam.banner) && Intrinsics.c(this.url, serverBrandingTeam.url) && Intrinsics.c(this.oddsProviderId, serverBrandingTeam.oddsProviderId) && Intrinsics.c(this.bannerHeight, serverBrandingTeam.bannerHeight) && Intrinsics.c(this.adUnitHeight, serverBrandingTeam.adUnitHeight) && this.imageDisplayType == serverBrandingTeam.imageDisplayType && Intrinsics.c(this.header, serverBrandingTeam.header) && Intrinsics.c(this.appHeader, serverBrandingTeam.appHeader) && Intrinsics.c(this.contentHeader, serverBrandingTeam.contentHeader) && Intrinsics.c(this.background, serverBrandingTeam.background) && Intrinsics.c(this.takeoverImage, serverBrandingTeam.takeoverImage) && Intrinsics.c(this.takeoverImageHeight, serverBrandingTeam.takeoverImageHeight) && Intrinsics.c(this.backgroundColor, serverBrandingTeam.backgroundColor) && Intrinsics.c(this.backgroundGradientColor, serverBrandingTeam.backgroundGradientColor);
    }

    @Nullable
    public final Integer getAdUnitHeight() {
        return this.adUnitHeight;
    }

    @Nullable
    public final Boolean getAppHeader() {
        return this.appHeader;
    }

    @Nullable
    public final Boolean getBackground() {
        return this.background;
    }

    @Nullable
    public final ServerBrandColors getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final ServerBrandingBackgroundColors getBackgroundGradientColor() {
        return this.backgroundGradientColor;
    }

    @Nullable
    public final Boolean getBanner() {
        return this.banner;
    }

    @Nullable
    public final Integer getBannerHeight() {
        return this.bannerHeight;
    }

    @NotNull
    public final ServerBrand getBrand() {
        return this.brand;
    }

    @Nullable
    public final Boolean getContentHeader() {
        return this.contentHeader;
    }

    @Nullable
    public final Boolean getHeader() {
        return this.header;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final ServerImageDisplayType getImageDisplayType() {
        return this.imageDisplayType;
    }

    @Nullable
    public final Integer getOddsProviderId() {
        return this.oddsProviderId;
    }

    @Nullable
    public final Boolean getTakeoverImage() {
        return this.takeoverImage;
    }

    @Nullable
    public final Integer getTakeoverImageHeight() {
        return this.takeoverImageHeight;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = (this.brand.hashCode() + (Integer.hashCode(this.id) * 31)) * 31;
        Boolean bool = this.banner;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.url;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.oddsProviderId;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.bannerHeight;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.adUnitHeight;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        ServerImageDisplayType serverImageDisplayType = this.imageDisplayType;
        int hashCode7 = (hashCode6 + (serverImageDisplayType == null ? 0 : serverImageDisplayType.hashCode())) * 31;
        Boolean bool2 = this.header;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.appHeader;
        int hashCode9 = (hashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.contentHeader;
        int hashCode10 = (hashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.background;
        int hashCode11 = (hashCode10 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.takeoverImage;
        int hashCode12 = (hashCode11 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Integer num4 = this.takeoverImageHeight;
        int hashCode13 = (hashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        ServerBrandColors serverBrandColors = this.backgroundColor;
        int hashCode14 = (hashCode13 + (serverBrandColors == null ? 0 : serverBrandColors.hashCode())) * 31;
        ServerBrandingBackgroundColors serverBrandingBackgroundColors = this.backgroundGradientColor;
        return hashCode14 + (serverBrandingBackgroundColors != null ? serverBrandingBackgroundColors.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        ServerBrand serverBrand = this.brand;
        Boolean bool = this.banner;
        String str = this.url;
        Integer num = this.oddsProviderId;
        Integer num2 = this.bannerHeight;
        Integer num3 = this.adUnitHeight;
        ServerImageDisplayType serverImageDisplayType = this.imageDisplayType;
        Boolean bool2 = this.header;
        Boolean bool3 = this.appHeader;
        Boolean bool4 = this.contentHeader;
        Boolean bool5 = this.background;
        Boolean bool6 = this.takeoverImage;
        Integer num4 = this.takeoverImageHeight;
        ServerBrandColors serverBrandColors = this.backgroundColor;
        ServerBrandingBackgroundColors serverBrandingBackgroundColors = this.backgroundGradientColor;
        StringBuilder sb = new StringBuilder("ServerBrandingTeam(id=");
        sb.append(i);
        sb.append(", brand=");
        sb.append(serverBrand);
        sb.append(", banner=");
        sb.append(bool);
        sb.append(", url=");
        sb.append(str);
        sb.append(", oddsProviderId=");
        vxd.r(num, num2, ", bannerHeight=", ", adUnitHeight=", sb);
        sb.append(num3);
        sb.append(", imageDisplayType=");
        sb.append(serverImageDisplayType);
        sb.append(", header=");
        i.q(sb, bool2, ", appHeader=", bool3, ", contentHeader=");
        i.q(sb, bool4, ", background=", bool5, ", takeoverImage=");
        sb.append(bool6);
        sb.append(", takeoverImageHeight=");
        sb.append(num4);
        sb.append(", backgroundColor=");
        sb.append(serverBrandColors);
        sb.append(", backgroundGradientColor=");
        sb.append(serverBrandingBackgroundColors);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/branding/ServerBrandingTeam$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/branding/ServerBrandingTeam;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ServerBrandingTeam$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ServerBrandingTeam(int i, @NotNull ServerBrand serverBrand, @Nullable Boolean bool, @Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable ServerImageDisplayType serverImageDisplayType, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Integer num4, @Nullable ServerBrandColors serverBrandColors, @Nullable ServerBrandingBackgroundColors serverBrandingBackgroundColors) {
        serverBrand.getClass();
        this.id = i;
        this.brand = serverBrand;
        this.banner = bool;
        this.url = str;
        this.oddsProviderId = num;
        this.bannerHeight = num2;
        this.adUnitHeight = num3;
        this.imageDisplayType = serverImageDisplayType;
        this.header = bool2;
        this.appHeader = bool3;
        this.contentHeader = bool4;
        this.background = bool5;
        this.takeoverImage = bool6;
        this.takeoverImageHeight = num4;
        this.backgroundColor = serverBrandColors;
        this.backgroundGradientColor = serverBrandingBackgroundColors;
    }
}
