package ru.ozon.app.android.account.orders.barcode.presentation;

import G.g;
import Kk.C3532b;
import Lh.b;
import N3.C3660k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\b\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeVO;", "Ll20/c;", "", "id", "", "Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeVO$Shipment;", "shipments", "", "isExpanded", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "<init>", "(JLjava/util/List;ZLru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getShipments", "()Ljava/util/List;", "Z", "()Z", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Shipment", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BarcodeVO implements c {
    private final long id;
    private final boolean isExpanded;
    private final OnBoardingDTO onboarding;

    @NotNull
    private final List<Shipment> shipments;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b\f\u0010%R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeVO$Shipment;", "", "", "packageTitle", "hint", "code", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "description", "info", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "annotation", "", "isSingle", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "shareButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;ZLru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPackageTitle", "getHint", "getCode", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getInfo", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "Z", "()Z", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getShareButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Shipment {
        private final DisclaimerAtom annotation;

        @NotNull
        private final String code;
        private final TextAtom description;
        private final String hint;
        private final TextAtom info;
        private final boolean isSingle;

        @NotNull
        private final String packageTitle;
        private final IconButtonV3DTO shareButton;

        public Shipment(@NotNull String packageTitle, String str, @NotNull String code, TextAtom textAtom, TextAtom textAtom2, DisclaimerAtom disclaimerAtom, boolean z11, IconButtonV3DTO iconButtonV3DTO) {
            Intrinsics.checkNotNullParameter(packageTitle, "packageTitle");
            Intrinsics.checkNotNullParameter(code, "code");
            this.packageTitle = packageTitle;
            this.hint = str;
            this.code = code;
            this.description = textAtom;
            this.info = textAtom2;
            this.annotation = disclaimerAtom;
            this.isSingle = z11;
            this.shareButton = iconButtonV3DTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Shipment)) {
                return false;
            }
            Shipment shipment = (Shipment) other;
            return Intrinsics.d(this.packageTitle, shipment.packageTitle) && Intrinsics.d(this.hint, shipment.hint) && Intrinsics.d(this.code, shipment.code) && Intrinsics.d(this.description, shipment.description) && Intrinsics.d(this.info, shipment.info) && Intrinsics.d(this.annotation, shipment.annotation) && this.isSingle == shipment.isSingle && Intrinsics.d(this.shareButton, shipment.shareButton);
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

        @NotNull
        public final String getPackageTitle() {
            return this.packageTitle;
        }

        public final IconButtonV3DTO getShareButton() {
            return this.shareButton;
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
            int a12 = C3532b.a((hashCode3 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31, 31, this.isSingle);
            IconButtonV3DTO iconButtonV3DTO = this.shareButton;
            return a12 + (iconButtonV3DTO != null ? iconButtonV3DTO.hashCode() : 0);
        }

        /* renamed from: isSingle, reason: from getter */
        public final boolean getIsSingle() {
            return this.isSingle;
        }

        @NotNull
        public String toString() {
            String str = this.packageTitle;
            String str2 = this.hint;
            String str3 = this.code;
            TextAtom textAtom = this.description;
            TextAtom textAtom2 = this.info;
            DisclaimerAtom disclaimerAtom = this.annotation;
            boolean z11 = this.isSingle;
            IconButtonV3DTO iconButtonV3DTO = this.shareButton;
            StringBuilder d11 = C3660k.d("Shipment(packageTitle=", str, ", hint=", str2, ", code=");
            d11.append(str3);
            d11.append(", description=");
            d11.append(textAtom);
            d11.append(", info=");
            d11.append(textAtom2);
            d11.append(", annotation=");
            d11.append(disclaimerAtom);
            d11.append(", isSingle=");
            d11.append(z11);
            d11.append(", shareButton=");
            d11.append(iconButtonV3DTO);
            d11.append(")");
            return d11.toString();
        }
    }

    public BarcodeVO(long j11, @NotNull List<Shipment> shipments, boolean z11, OnBoardingDTO onBoardingDTO) {
        Intrinsics.checkNotNullParameter(shipments, "shipments");
        this.id = j11;
        this.shipments = shipments;
        this.isExpanded = z11;
        this.onboarding = onBoardingDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarcodeVO)) {
            return false;
        }
        BarcodeVO barcodeVO = (BarcodeVO) other;
        return this.id == barcodeVO.id && Intrinsics.d(this.shipments, barcodeVO.shipments) && this.isExpanded == barcodeVO.isExpanded && Intrinsics.d(this.onboarding, barcodeVO.onboarding);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<Shipment> getShipments() {
        return this.shipments;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a(g.b(Long.hashCode(this.id) * 31, 31, this.shipments), 31, this.isExpanded);
        OnBoardingDTO onBoardingDTO = this.onboarding;
        return a11 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode());
    }

    /* renamed from: isExpanded, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<Shipment> list = this.shipments;
        boolean z11 = this.isExpanded;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        StringBuilder b11 = b.b(j11, "BarcodeVO(id=", ", shipments=", list);
        b11.append(", isExpanded=");
        b11.append(z11);
        b11.append(", onboarding=");
        b11.append(onBoardingDTO);
        b11.append(")");
        return b11.toString();
    }
}
