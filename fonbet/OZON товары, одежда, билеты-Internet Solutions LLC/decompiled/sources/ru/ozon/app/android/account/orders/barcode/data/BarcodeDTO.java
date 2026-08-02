package ru.ozon.app.android.account.orders.barcode.data;

import G.g;
import N3.C3660k;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J@\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0005\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/data/BarcodeDTO;", "", "shipments", "", "Lru/ozon/app/android/account/orders/barcode/data/BarcodeDTO$Shipment;", "isExpanded", "", "cacheLifetime", "", "shouldCache", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Z)V", "getShipments", "()Ljava/util/List;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCacheLifetime", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShouldCache", "()Z", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Z)Lru/ozon/app/android/account/orders/barcode/data/BarcodeDTO;", "equals", "other", "hashCode", "toString", "", "Shipment", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BarcodeDTO {
    public static final int $stable = 8;
    private final Integer cacheLifetime;
    private final Boolean isExpanded;

    @NotNull
    private final List<Shipment> shipments;
    private final boolean shouldCache;

    public BarcodeDTO(@NotNull List<Shipment> shipments, Boolean bool, Integer num, boolean z11) {
        Intrinsics.checkNotNullParameter(shipments, "shipments");
        this.shipments = shipments;
        this.isExpanded = bool;
        this.cacheLifetime = num;
        this.shouldCache = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BarcodeDTO copy$default(BarcodeDTO barcodeDTO, List list, Boolean bool, Integer num, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = barcodeDTO.shipments;
        }
        if ((i11 & 2) != 0) {
            bool = barcodeDTO.isExpanded;
        }
        if ((i11 & 4) != 0) {
            num = barcodeDTO.cacheLifetime;
        }
        if ((i11 & 8) != 0) {
            z11 = barcodeDTO.shouldCache;
        }
        return barcodeDTO.copy(list, bool, num, z11);
    }

    @NotNull
    public final List<Shipment> component1() {
        return this.shipments;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getCacheLifetime() {
        return this.cacheLifetime;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShouldCache() {
        return this.shouldCache;
    }

    @NotNull
    public final BarcodeDTO copy(@NotNull List<Shipment> shipments, Boolean isExpanded, Integer cacheLifetime, boolean shouldCache) {
        Intrinsics.checkNotNullParameter(shipments, "shipments");
        return new BarcodeDTO(shipments, isExpanded, cacheLifetime, shouldCache);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarcodeDTO)) {
            return false;
        }
        BarcodeDTO barcodeDTO = (BarcodeDTO) other;
        return Intrinsics.d(this.shipments, barcodeDTO.shipments) && Intrinsics.d(this.isExpanded, barcodeDTO.isExpanded) && Intrinsics.d(this.cacheLifetime, barcodeDTO.cacheLifetime) && this.shouldCache == barcodeDTO.shouldCache;
    }

    public final Integer getCacheLifetime() {
        return this.cacheLifetime;
    }

    @NotNull
    public final List<Shipment> getShipments() {
        return this.shipments;
    }

    public final boolean getShouldCache() {
        return this.shouldCache;
    }

    public int hashCode() {
        int hashCode = this.shipments.hashCode() * 31;
        Boolean bool = this.isExpanded;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.cacheLifetime;
        return Boolean.hashCode(this.shouldCache) + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final Boolean isExpanded() {
        return this.isExpanded;
    }

    @NotNull
    public String toString() {
        return "BarcodeDTO(shipments=" + this.shipments + ", isExpanded=" + this.isExpanded + ", cacheLifetime=" + this.cacheLifetime + ", shouldCache=" + this.shouldCache + ")";
    }

    public /* synthetic */ BarcodeDTO(List list, Boolean bool, Integer num, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, bool, num, (i11 & 8) != 0 ? true : z11);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/account/orders/barcode/data/BarcodeDTO$Shipment;", "", "packageTitle", "", "hint", "code", "description", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "info", "annotation", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "getPackageTitle", "()Ljava/lang/String;", "getHint", "getCode", "getDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getInfo", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Shipment {
        public static final int $stable = 8;
        private final DisclaimerAtom annotation;

        @NotNull
        private final String code;
        private final TextAtom description;
        private final String hint;
        private final TextAtom info;
        private final OnBoardingDTO onboarding;

        @NotNull
        private final String packageTitle;

        public Shipment(@i(name = "package") @NotNull String packageTitle, String str, @NotNull String code, TextAtom textAtom, TextAtom textAtom2, DisclaimerAtom disclaimerAtom, OnBoardingDTO onBoardingDTO) {
            Intrinsics.checkNotNullParameter(packageTitle, "packageTitle");
            Intrinsics.checkNotNullParameter(code, "code");
            this.packageTitle = packageTitle;
            this.hint = str;
            this.code = code;
            this.description = textAtom;
            this.info = textAtom2;
            this.annotation = disclaimerAtom;
            this.onboarding = onBoardingDTO;
        }

        public static /* synthetic */ Shipment copy$default(Shipment shipment, String str, String str2, String str3, TextAtom textAtom, TextAtom textAtom2, DisclaimerAtom disclaimerAtom, OnBoardingDTO onBoardingDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = shipment.packageTitle;
            }
            if ((i11 & 2) != 0) {
                str2 = shipment.hint;
            }
            if ((i11 & 4) != 0) {
                str3 = shipment.code;
            }
            if ((i11 & 8) != 0) {
                textAtom = shipment.description;
            }
            if ((i11 & 16) != 0) {
                textAtom2 = shipment.info;
            }
            if ((i11 & 32) != 0) {
                disclaimerAtom = shipment.annotation;
            }
            if ((i11 & 64) != 0) {
                onBoardingDTO = shipment.onboarding;
            }
            DisclaimerAtom disclaimerAtom2 = disclaimerAtom;
            OnBoardingDTO onBoardingDTO2 = onBoardingDTO;
            TextAtom textAtom3 = textAtom2;
            String str4 = str3;
            return shipment.copy(str, str2, str4, textAtom, textAtom3, disclaimerAtom2, onBoardingDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPackageTitle() {
            return this.packageTitle;
        }

        /* renamed from: component2, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* renamed from: component4, reason: from getter */
        public final TextAtom getDescription() {
            return this.description;
        }

        /* renamed from: component5, reason: from getter */
        public final TextAtom getInfo() {
            return this.info;
        }

        /* renamed from: component6, reason: from getter */
        public final DisclaimerAtom getAnnotation() {
            return this.annotation;
        }

        /* renamed from: component7, reason: from getter */
        public final OnBoardingDTO getOnboarding() {
            return this.onboarding;
        }

        @NotNull
        public final Shipment copy(@i(name = "package") @NotNull String packageTitle, String hint, @NotNull String code, TextAtom description, TextAtom info, DisclaimerAtom annotation, OnBoardingDTO onboarding) {
            Intrinsics.checkNotNullParameter(packageTitle, "packageTitle");
            Intrinsics.checkNotNullParameter(code, "code");
            return new Shipment(packageTitle, hint, code, description, info, annotation, onboarding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Shipment)) {
                return false;
            }
            Shipment shipment = (Shipment) other;
            return Intrinsics.d(this.packageTitle, shipment.packageTitle) && Intrinsics.d(this.hint, shipment.hint) && Intrinsics.d(this.code, shipment.code) && Intrinsics.d(this.description, shipment.description) && Intrinsics.d(this.info, shipment.info) && Intrinsics.d(this.annotation, shipment.annotation) && Intrinsics.d(this.onboarding, shipment.onboarding);
        }

        public final DisclaimerAtom getAnnotation() {
            return this.annotation;
        }

        @NotNull
        public final String getCode() {
            return this.code;
        }

        public final TextAtom getDescription() {
            return this.description;
        }

        public final String getHint() {
            return this.hint;
        }

        public final TextAtom getInfo() {
            return this.info;
        }

        public final OnBoardingDTO getOnboarding() {
            return this.onboarding;
        }

        @NotNull
        public final String getPackageTitle() {
            return this.packageTitle;
        }

        public int hashCode() {
            int hashCode = this.packageTitle.hashCode() * 31;
            String str = this.hint;
            int a11 = g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.code);
            TextAtom textAtom = this.description;
            int hashCode2 = (a11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            TextAtom textAtom2 = this.info;
            int hashCode3 = (hashCode2 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
            DisclaimerAtom disclaimerAtom = this.annotation;
            int hashCode4 = (hashCode3 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
            OnBoardingDTO onBoardingDTO = this.onboarding;
            return hashCode4 + (onBoardingDTO != null ? onBoardingDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.packageTitle;
            String str2 = this.hint;
            String str3 = this.code;
            TextAtom textAtom = this.description;
            TextAtom textAtom2 = this.info;
            DisclaimerAtom disclaimerAtom = this.annotation;
            OnBoardingDTO onBoardingDTO = this.onboarding;
            StringBuilder d11 = C3660k.d("Shipment(packageTitle=", str, ", hint=", str2, ", code=");
            d11.append(str3);
            d11.append(", description=");
            d11.append(textAtom);
            d11.append(", info=");
            d11.append(textAtom2);
            d11.append(", annotation=");
            d11.append(disclaimerAtom);
            d11.append(", onboarding=");
            d11.append(onBoardingDTO);
            d11.append(")");
            return d11.toString();
        }

        public /* synthetic */ Shipment(String str, String str2, String str3, TextAtom textAtom, TextAtom textAtom2, DisclaimerAtom disclaimerAtom, OnBoardingDTO onBoardingDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, textAtom, textAtom2, disclaimerAtom, (i11 & 64) != 0 ? null : onBoardingDTO);
        }
    }
}
