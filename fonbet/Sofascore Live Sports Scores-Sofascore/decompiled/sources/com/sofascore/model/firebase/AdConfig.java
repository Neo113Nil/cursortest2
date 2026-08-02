package com.sofascore.model.firebase;

import defpackage.a7a;
import defpackage.dmi;
import defpackage.duf;
import defpackage.ffa;
import defpackage.fuf;
import defpackage.oea;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wt3;
import defpackage.wv8;
import defpackage.zvg;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ffa(discriminator = "configType")
@r5h
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u000b2\u00020\u0001:\u0006\u0006\u0007\b\t\n\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/sofascore/model/firebase/AdConfig;", "", "adUnit", "Lcom/sofascore/model/firebase/AdUnit;", "getAdUnit", "()Lcom/sofascore/model/firebase/AdUnit;", "Banner", "Interstitial", "RewardedInterstitial", "Preroll", "Native", "Companion", "Lcom/sofascore/model/firebase/AdConfig$Banner;", "Lcom/sofascore/model/firebase/AdConfig$Interstitial;", "Lcom/sofascore/model/firebase/AdConfig$Native;", "Lcom/sofascore/model/firebase/AdConfig$Preroll;", "Lcom/sofascore/model/firebase/AdConfig$RewardedInterstitial;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface AdConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/firebase/AdConfig$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/firebase/AdConfig;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            fuf fufVar = duf.a;
            return new zvg("com.sofascore.model.firebase.AdConfig", fufVar.getOrCreateKotlinClass(AdConfig.class), new KClass[]{fufVar.getOrCreateKotlinClass(Banner.class), fufVar.getOrCreateKotlinClass(Interstitial.class), fufVar.getOrCreateKotlinClass(Native.class), fufVar.getOrCreateKotlinClass(Preroll.class), fufVar.getOrCreateKotlinClass(RewardedInterstitial.class)}, new KSerializer[]{AdConfig$Banner$$serializer.INSTANCE, AdConfig$Interstitial$$serializer.INSTANCE, AdConfig$Native$$serializer.INSTANCE, AdConfig$Preroll$$serializer.INSTANCE, AdConfig$RewardedInterstitial$$serializer.INSTANCE}, new Annotation[]{new AdConfig$Banner$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("configType")});
        }
    }

    @NotNull
    AdUnit getAdUnit();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @q5h("Banner")
    @r5h
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b0\u0010\u001b¨\u00063"}, d2 = {"Lcom/sofascore/model/firebase/AdConfig$Banner;", "Lcom/sofascore/model/firebase/AdConfig;", "Lcom/sofascore/model/firebase/AdUnit;", "adUnit", "", "height", "Lcom/sofascore/model/firebase/BannerSize;", "size", "refreshSeconds", "<init>", "(Lcom/sofascore/model/firebase/AdUnit;ILcom/sofascore/model/firebase/BannerSize;I)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/firebase/AdUnit;ILcom/sofascore/model/firebase/BannerSize;ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/firebase/AdConfig$Banner;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/firebase/AdUnit;", "component2", "()I", "component3", "()Lcom/sofascore/model/firebase/BannerSize;", "component4", "copy", "(Lcom/sofascore/model/firebase/AdUnit;ILcom/sofascore/model/firebase/BannerSize;I)Lcom/sofascore/model/firebase/AdConfig$Banner;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/firebase/AdUnit;", "getAdUnit", "I", "getHeight", "Lcom/sofascore/model/firebase/BannerSize;", "getSize", "getRefreshSeconds", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Banner implements AdConfig {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final AdUnit adUnit;
        private final int height;
        private final int refreshSeconds;

        @NotNull
        private final BannerSize size;

        public /* synthetic */ Banner(int i, AdUnit adUnit, int i2, BannerSize bannerSize, int i3, t5h t5hVar) {
            if (15 != (i & 15)) {
                oea.z(i, 15, AdConfig$Banner$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.adUnit = adUnit;
            this.height = i2;
            this.size = bannerSize;
            this.refreshSeconds = i3;
        }

        public static /* synthetic */ Banner copy$default(Banner banner, AdUnit adUnit, int i, BannerSize bannerSize, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                adUnit = banner.adUnit;
            }
            if ((i3 & 2) != 0) {
                i = banner.height;
            }
            if ((i3 & 4) != 0) {
                bannerSize = banner.size;
            }
            if ((i3 & 8) != 0) {
                i2 = banner.refreshSeconds;
            }
            return banner.copy(adUnit, i, bannerSize, i2);
        }

        public static final /* synthetic */ void write$Self$model_release(Banner self, wf3 output, SerialDescriptor serialDesc) {
            output.f(serialDesc, 0, AdUnit$$serializer.INSTANCE, self.getAdUnit());
            output.u(1, self.height, serialDesc);
            output.f(serialDesc, 2, BannerSizeSerializer.INSTANCE, self.size);
            output.u(3, self.refreshSeconds, serialDesc);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AdUnit getAdUnit() {
            return this.adUnit;
        }

        /* renamed from: component2, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final BannerSize getSize() {
            return this.size;
        }

        /* renamed from: component4, reason: from getter */
        public final int getRefreshSeconds() {
            return this.refreshSeconds;
        }

        @NotNull
        public final Banner copy(@NotNull AdUnit adUnit, int height, @NotNull BannerSize size, int refreshSeconds) {
            adUnit.getClass();
            size.getClass();
            return new Banner(adUnit, height, size, refreshSeconds);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) other;
            return Intrinsics.c(this.adUnit, banner.adUnit) && this.height == banner.height && this.size == banner.size && this.refreshSeconds == banner.refreshSeconds;
        }

        @Override // com.sofascore.model.firebase.AdConfig
        @NotNull
        public AdUnit getAdUnit() {
            return this.adUnit;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getRefreshSeconds() {
            return this.refreshSeconds;
        }

        @NotNull
        public final BannerSize getSize() {
            return this.size;
        }

        public int hashCode() {
            return Integer.hashCode(this.refreshSeconds) + ((this.size.hashCode() + wv8.a(this.height, this.adUnit.hashCode() * 31, 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "Banner(adUnit=" + this.adUnit + ", height=" + this.height + ", size=" + this.size + ", refreshSeconds=" + this.refreshSeconds + ")";
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/firebase/AdConfig$Banner$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/firebase/AdConfig$Banner;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return AdConfig$Banner$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Banner(@NotNull AdUnit adUnit, int i, @NotNull BannerSize bannerSize, int i2) {
            adUnit.getClass();
            bannerSize.getClass();
            this.adUnit = adUnit;
            this.height = i;
            this.size = bannerSize;
            this.refreshSeconds = i2;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @q5h("Interstitial")
    @r5h
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006*"}, d2 = {"Lcom/sofascore/model/firebase/AdConfig$Interstitial;", "Lcom/sofascore/model/firebase/AdConfig;", "Lcom/sofascore/model/firebase/AdUnit;", "adUnit", "", "expirationSeconds", "<init>", "(Lcom/sofascore/model/firebase/AdUnit;I)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/firebase/AdUnit;ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/firebase/AdConfig$Interstitial;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/firebase/AdUnit;", "component2", "()I", "copy", "(Lcom/sofascore/model/firebase/AdUnit;I)Lcom/sofascore/model/firebase/AdConfig$Interstitial;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/firebase/AdUnit;", "getAdUnit", "I", "getExpirationSeconds", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Interstitial implements AdConfig {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final AdUnit adUnit;
        private final int expirationSeconds;

        public /* synthetic */ Interstitial(int i, AdUnit adUnit, int i2, t5h t5hVar) {
            if (3 != (i & 3)) {
                oea.z(i, 3, AdConfig$Interstitial$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.adUnit = adUnit;
            this.expirationSeconds = i2;
        }

        public static /* synthetic */ Interstitial copy$default(Interstitial interstitial, AdUnit adUnit, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                adUnit = interstitial.adUnit;
            }
            if ((i2 & 2) != 0) {
                i = interstitial.expirationSeconds;
            }
            return interstitial.copy(adUnit, i);
        }

        public static final /* synthetic */ void write$Self$model_release(Interstitial self, wf3 output, SerialDescriptor serialDesc) {
            output.f(serialDesc, 0, AdUnit$$serializer.INSTANCE, self.getAdUnit());
            output.u(1, self.expirationSeconds, serialDesc);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AdUnit getAdUnit() {
            return this.adUnit;
        }

        /* renamed from: component2, reason: from getter */
        public final int getExpirationSeconds() {
            return this.expirationSeconds;
        }

        @NotNull
        public final Interstitial copy(@NotNull AdUnit adUnit, int expirationSeconds) {
            adUnit.getClass();
            return new Interstitial(adUnit, expirationSeconds);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Interstitial)) {
                return false;
            }
            Interstitial interstitial = (Interstitial) other;
            return Intrinsics.c(this.adUnit, interstitial.adUnit) && this.expirationSeconds == interstitial.expirationSeconds;
        }

        @Override // com.sofascore.model.firebase.AdConfig
        @NotNull
        public AdUnit getAdUnit() {
            return this.adUnit;
        }

        public final int getExpirationSeconds() {
            return this.expirationSeconds;
        }

        public int hashCode() {
            return Integer.hashCode(this.expirationSeconds) + (this.adUnit.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Interstitial(adUnit=" + this.adUnit + ", expirationSeconds=" + this.expirationSeconds + ")";
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/firebase/AdConfig$Interstitial$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/firebase/AdConfig$Interstitial;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return AdConfig$Interstitial$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Interstitial(@NotNull AdUnit adUnit, int i) {
            adUnit.getClass();
            this.adUnit = adUnit;
            this.expirationSeconds = i;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @q5h("Native")
    @r5h
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006&"}, d2 = {"Lcom/sofascore/model/firebase/AdConfig$Native;", "Lcom/sofascore/model/firebase/AdConfig;", "Lcom/sofascore/model/firebase/AdUnit;", "adUnit", "<init>", "(Lcom/sofascore/model/firebase/AdUnit;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/firebase/AdUnit;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/firebase/AdConfig$Native;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/firebase/AdUnit;", "copy", "(Lcom/sofascore/model/firebase/AdUnit;)Lcom/sofascore/model/firebase/AdConfig$Native;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/firebase/AdUnit;", "getAdUnit", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Native implements AdConfig {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final AdUnit adUnit;

        public /* synthetic */ Native(int i, AdUnit adUnit, t5h t5hVar) {
            if (1 == (i & 1)) {
                this.adUnit = adUnit;
            } else {
                oea.z(i, 1, AdConfig$Native$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ Native copy$default(Native r0, AdUnit adUnit, int i, Object obj) {
            if ((i & 1) != 0) {
                adUnit = r0.adUnit;
            }
            return r0.copy(adUnit);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AdUnit getAdUnit() {
            return this.adUnit;
        }

        @NotNull
        public final Native copy(@NotNull AdUnit adUnit) {
            adUnit.getClass();
            return new Native(adUnit);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Native) && Intrinsics.c(this.adUnit, ((Native) other).adUnit);
        }

        @Override // com.sofascore.model.firebase.AdConfig
        @NotNull
        public AdUnit getAdUnit() {
            return this.adUnit;
        }

        public int hashCode() {
            return this.adUnit.hashCode();
        }

        @NotNull
        public String toString() {
            return "Native(adUnit=" + this.adUnit + ")";
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/firebase/AdConfig$Native$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/firebase/AdConfig$Native;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return AdConfig$Native$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Native(@NotNull AdUnit adUnit) {
            adUnit.getClass();
            this.adUnit = adUnit;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @q5h("Preroll")
    @r5h
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0018¨\u0006+"}, d2 = {"Lcom/sofascore/model/firebase/AdConfig$Preroll;", "Lcom/sofascore/model/firebase/AdConfig;", "Lcom/sofascore/model/firebase/AdUnit;", "adUnit", "", "delaySeconds", "<init>", "(Lcom/sofascore/model/firebase/AdUnit;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/firebase/AdUnit;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/firebase/AdConfig$Preroll;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/firebase/AdUnit;", "component2", "()Ljava/lang/Integer;", "copy", "(Lcom/sofascore/model/firebase/AdUnit;Ljava/lang/Integer;)Lcom/sofascore/model/firebase/AdConfig$Preroll;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/firebase/AdUnit;", "getAdUnit", "Ljava/lang/Integer;", "getDelaySeconds", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Preroll implements AdConfig {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final AdUnit adUnit;

        @Nullable
        private final Integer delaySeconds;

        public /* synthetic */ Preroll(int i, AdUnit adUnit, Integer num, t5h t5hVar) {
            if (3 != (i & 3)) {
                oea.z(i, 3, AdConfig$Preroll$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.adUnit = adUnit;
            this.delaySeconds = num;
        }

        public static /* synthetic */ Preroll copy$default(Preroll preroll, AdUnit adUnit, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                adUnit = preroll.adUnit;
            }
            if ((i & 2) != 0) {
                num = preroll.delaySeconds;
            }
            return preroll.copy(adUnit, num);
        }

        public static final /* synthetic */ void write$Self$model_release(Preroll self, wf3 output, SerialDescriptor serialDesc) {
            output.f(serialDesc, 0, AdUnit$$serializer.INSTANCE, self.getAdUnit());
            output.h(serialDesc, 1, a7a.a, self.delaySeconds);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AdUnit getAdUnit() {
            return this.adUnit;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Integer getDelaySeconds() {
            return this.delaySeconds;
        }

        @NotNull
        public final Preroll copy(@NotNull AdUnit adUnit, @Nullable Integer delaySeconds) {
            adUnit.getClass();
            return new Preroll(adUnit, delaySeconds);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Preroll)) {
                return false;
            }
            Preroll preroll = (Preroll) other;
            return Intrinsics.c(this.adUnit, preroll.adUnit) && Intrinsics.c(this.delaySeconds, preroll.delaySeconds);
        }

        @Override // com.sofascore.model.firebase.AdConfig
        @NotNull
        public AdUnit getAdUnit() {
            return this.adUnit;
        }

        @Nullable
        public final Integer getDelaySeconds() {
            return this.delaySeconds;
        }

        public int hashCode() {
            int hashCode = this.adUnit.hashCode() * 31;
            Integer num = this.delaySeconds;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            return "Preroll(adUnit=" + this.adUnit + ", delaySeconds=" + this.delaySeconds + ")";
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/firebase/AdConfig$Preroll$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/firebase/AdConfig$Preroll;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return AdConfig$Preroll$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Preroll(@NotNull AdUnit adUnit, @Nullable Integer num) {
            adUnit.getClass();
            this.adUnit = adUnit;
            this.delaySeconds = num;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @q5h("RewardedInterstitial")
    @r5h
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u001a¨\u0006."}, d2 = {"Lcom/sofascore/model/firebase/AdConfig$RewardedInterstitial;", "Lcom/sofascore/model/firebase/AdConfig;", "Lcom/sofascore/model/firebase/AdUnit;", "adUnit", "", "includePaidUsers", "shouldVerify", "<init>", "(Lcom/sofascore/model/firebase/AdUnit;ZZ)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/firebase/AdUnit;ZZLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/firebase/AdConfig$RewardedInterstitial;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/firebase/AdUnit;", "component2", "()Z", "component3", "copy", "(Lcom/sofascore/model/firebase/AdUnit;ZZ)Lcom/sofascore/model/firebase/AdConfig$RewardedInterstitial;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/firebase/AdUnit;", "getAdUnit", "Z", "getIncludePaidUsers", "getShouldVerify", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RewardedInterstitial implements AdConfig {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final AdUnit adUnit;
        private final boolean includePaidUsers;
        private final boolean shouldVerify;

        public /* synthetic */ RewardedInterstitial(int i, AdUnit adUnit, boolean z, boolean z2, t5h t5hVar) {
            if (7 != (i & 7)) {
                oea.z(i, 7, AdConfig$RewardedInterstitial$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.adUnit = adUnit;
            this.includePaidUsers = z;
            this.shouldVerify = z2;
        }

        public static /* synthetic */ RewardedInterstitial copy$default(RewardedInterstitial rewardedInterstitial, AdUnit adUnit, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                adUnit = rewardedInterstitial.adUnit;
            }
            if ((i & 2) != 0) {
                z = rewardedInterstitial.includePaidUsers;
            }
            if ((i & 4) != 0) {
                z2 = rewardedInterstitial.shouldVerify;
            }
            return rewardedInterstitial.copy(adUnit, z, z2);
        }

        public static final /* synthetic */ void write$Self$model_release(RewardedInterstitial self, wf3 output, SerialDescriptor serialDesc) {
            output.f(serialDesc, 0, AdUnit$$serializer.INSTANCE, self.getAdUnit());
            output.x(serialDesc, 1, self.includePaidUsers);
            output.x(serialDesc, 2, self.shouldVerify);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AdUnit getAdUnit() {
            return this.adUnit;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIncludePaidUsers() {
            return this.includePaidUsers;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldVerify() {
            return this.shouldVerify;
        }

        @NotNull
        public final RewardedInterstitial copy(@NotNull AdUnit adUnit, boolean includePaidUsers, boolean shouldVerify) {
            adUnit.getClass();
            return new RewardedInterstitial(adUnit, includePaidUsers, shouldVerify);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RewardedInterstitial)) {
                return false;
            }
            RewardedInterstitial rewardedInterstitial = (RewardedInterstitial) other;
            return Intrinsics.c(this.adUnit, rewardedInterstitial.adUnit) && this.includePaidUsers == rewardedInterstitial.includePaidUsers && this.shouldVerify == rewardedInterstitial.shouldVerify;
        }

        @Override // com.sofascore.model.firebase.AdConfig
        @NotNull
        public AdUnit getAdUnit() {
            return this.adUnit;
        }

        public final boolean getIncludePaidUsers() {
            return this.includePaidUsers;
        }

        public final boolean getShouldVerify() {
            return this.shouldVerify;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldVerify) + dmi.e(this.adUnit.hashCode() * 31, 31, this.includePaidUsers);
        }

        @NotNull
        public String toString() {
            AdUnit adUnit = this.adUnit;
            boolean z = this.includePaidUsers;
            boolean z2 = this.shouldVerify;
            StringBuilder sb = new StringBuilder("RewardedInterstitial(adUnit=");
            sb.append(adUnit);
            sb.append(", includePaidUsers=");
            sb.append(z);
            sb.append(", shouldVerify=");
            return wt3.p(sb, z2, ")");
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/firebase/AdConfig$RewardedInterstitial$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/firebase/AdConfig$RewardedInterstitial;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return AdConfig$RewardedInterstitial$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public RewardedInterstitial(@NotNull AdUnit adUnit, boolean z, boolean z2) {
            adUnit.getClass();
            this.adUnit = adUnit;
            this.includePaidUsers = z;
            this.shouldVerify = z2;
        }
    }
}
