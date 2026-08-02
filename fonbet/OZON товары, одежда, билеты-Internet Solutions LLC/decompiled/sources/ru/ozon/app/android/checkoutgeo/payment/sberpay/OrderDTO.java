package ru.ozon.app.android.checkoutgeo.payment.sberpay;

import C.o0;
import G.g;
import I0.C3173b;
import N3.C3660k;
import Nh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u00045678Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0081\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00069"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO;", "", "link", "", "redirectLink", "cancelLink", "error", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$Error;", "authorizePaymentUrl", "nativePaymentInfo", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$NativePaymentInfo;", "fastPayInfo", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$FastPayInfo;", "sberPayInfo", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$SberPayInfo;", "authorizeComposerActionName", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$Error;Ljava/lang/String;Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$NativePaymentInfo;Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$FastPayInfo;Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$SberPayInfo;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getLink", "()Ljava/lang/String;", "getRedirectLink", "getCancelLink", "getError", "()Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$Error;", "getAuthorizePaymentUrl", "getNativePaymentInfo", "()Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$NativePaymentInfo;", "getFastPayInfo", "()Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$FastPayInfo;", "getSberPayInfo", "()Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$SberPayInfo;", "getAuthorizeComposerActionName", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "NativePaymentInfo", "FastPayInfo", "SberPayInfo", "Error", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderDTO {
    private final AtomActionDTO action;
    private final String authorizeComposerActionName;
    private final String authorizePaymentUrl;
    private final String cancelLink;
    private final Error error;
    private final FastPayInfo fastPayInfo;
    private final String link;
    private final NativePaymentInfo nativePaymentInfo;
    private final String redirectLink;
    private final SberPayInfo sberPayInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$Error;", "", "type", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "message", "lifetime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getTitle", "getMessage", "getLifetime", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error {
        private final String lifetime;

        @NotNull
        private final String message;
        private final String title;

        @NotNull
        private final String type;

        public Error(@NotNull String type, String str, @NotNull String message, String str2) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(message, "message");
            this.type = type;
            this.title = str;
            this.message = message;
            this.lifetime = str2;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = error.type;
            }
            if ((i11 & 2) != 0) {
                str2 = error.title;
            }
            if ((i11 & 4) != 0) {
                str3 = error.message;
            }
            if ((i11 & 8) != 0) {
                str4 = error.lifetime;
            }
            return error.copy(str, str2, str3, str4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component4, reason: from getter */
        public final String getLifetime() {
            return this.lifetime;
        }

        @NotNull
        public final Error copy(@NotNull String type, String title, @NotNull String message, String lifetime) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(message, "message");
            return new Error(type, title, message, lifetime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.d(this.type, error.type) && Intrinsics.d(this.title, error.title) && Intrinsics.d(this.message, error.message) && Intrinsics.d(this.lifetime, error.lifetime);
        }

        public final String getLifetime() {
            return this.lifetime;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            String str = this.title;
            int a11 = g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.message);
            String str2 = this.lifetime;
            return a11 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.type;
            String str2 = this.title;
            return C3173b.c(C3660k.d("Error(type=", str, ", title=", str2, ", message="), this.message, ", lifetime=", this.lifetime, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$FastPayInfo;", "", "link", "", "isRedirectBank", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getLink", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$FastPayInfo;", "equals", "other", "hashCode", "", "toString", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FastPayInfo {
        private final Boolean isRedirectBank;

        @NotNull
        private final String link;

        public FastPayInfo(@NotNull String link, Boolean bool) {
            Intrinsics.checkNotNullParameter(link, "link");
            this.link = link;
            this.isRedirectBank = bool;
        }

        public static /* synthetic */ FastPayInfo copy$default(FastPayInfo fastPayInfo, String str, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = fastPayInfo.link;
            }
            if ((i11 & 2) != 0) {
                bool = fastPayInfo.isRedirectBank;
            }
            return fastPayInfo.copy(str, bool);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsRedirectBank() {
            return this.isRedirectBank;
        }

        @NotNull
        public final FastPayInfo copy(@NotNull String link, Boolean isRedirectBank) {
            Intrinsics.checkNotNullParameter(link, "link");
            return new FastPayInfo(link, isRedirectBank);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FastPayInfo)) {
                return false;
            }
            FastPayInfo fastPayInfo = (FastPayInfo) other;
            return Intrinsics.d(this.link, fastPayInfo.link) && Intrinsics.d(this.isRedirectBank, fastPayInfo.isRedirectBank);
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        public int hashCode() {
            int hashCode = this.link.hashCode() * 31;
            Boolean bool = this.isRedirectBank;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final Boolean isRedirectBank() {
            return this.isRedirectBank;
        }

        @NotNull
        public String toString() {
            return "FastPayInfo(link=" + this.link + ", isRedirectBank=" + this.isRedirectBank + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$NativePaymentInfo;", "", "orderNumber", "", "fullOrderSum", "Ljava/math/BigDecimal;", "orderSum", "paymentToken", "provider", "merchant", "gateway", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrderNumber", "()Ljava/lang/String;", "getFullOrderSum", "()Ljava/math/BigDecimal;", "getOrderSum", "getPaymentToken", "getProvider", "getMerchant", "getGateway", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NativePaymentInfo {

        @NotNull
        private final BigDecimal fullOrderSum;

        @NotNull
        private final String gateway;

        @NotNull
        private final String merchant;

        @NotNull
        private final String orderNumber;

        @NotNull
        private final BigDecimal orderSum;

        @NotNull
        private final String paymentToken;

        @NotNull
        private final String provider;

        public NativePaymentInfo(@NotNull String orderNumber, @NotNull BigDecimal fullOrderSum, @NotNull BigDecimal orderSum, @NotNull String paymentToken, @NotNull String provider, @NotNull String merchant, @NotNull String gateway) {
            Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
            Intrinsics.checkNotNullParameter(fullOrderSum, "fullOrderSum");
            Intrinsics.checkNotNullParameter(orderSum, "orderSum");
            Intrinsics.checkNotNullParameter(paymentToken, "paymentToken");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(merchant, "merchant");
            Intrinsics.checkNotNullParameter(gateway, "gateway");
            this.orderNumber = orderNumber;
            this.fullOrderSum = fullOrderSum;
            this.orderSum = orderSum;
            this.paymentToken = paymentToken;
            this.provider = provider;
            this.merchant = merchant;
            this.gateway = gateway;
        }

        public static /* synthetic */ NativePaymentInfo copy$default(NativePaymentInfo nativePaymentInfo, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, String str3, String str4, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = nativePaymentInfo.orderNumber;
            }
            if ((i11 & 2) != 0) {
                bigDecimal = nativePaymentInfo.fullOrderSum;
            }
            if ((i11 & 4) != 0) {
                bigDecimal2 = nativePaymentInfo.orderSum;
            }
            if ((i11 & 8) != 0) {
                str2 = nativePaymentInfo.paymentToken;
            }
            if ((i11 & 16) != 0) {
                str3 = nativePaymentInfo.provider;
            }
            if ((i11 & 32) != 0) {
                str4 = nativePaymentInfo.merchant;
            }
            if ((i11 & 64) != 0) {
                str5 = nativePaymentInfo.gateway;
            }
            String str6 = str4;
            String str7 = str5;
            String str8 = str3;
            BigDecimal bigDecimal3 = bigDecimal2;
            return nativePaymentInfo.copy(str, bigDecimal, bigDecimal3, str2, str8, str6, str7);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getOrderNumber() {
            return this.orderNumber;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final BigDecimal getFullOrderSum() {
            return this.fullOrderSum;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final BigDecimal getOrderSum() {
            return this.orderSum;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getPaymentToken() {
            return this.paymentToken;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getProvider() {
            return this.provider;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final String getMerchant() {
            return this.merchant;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final String getGateway() {
            return this.gateway;
        }

        @NotNull
        public final NativePaymentInfo copy(@NotNull String orderNumber, @NotNull BigDecimal fullOrderSum, @NotNull BigDecimal orderSum, @NotNull String paymentToken, @NotNull String provider, @NotNull String merchant, @NotNull String gateway) {
            Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
            Intrinsics.checkNotNullParameter(fullOrderSum, "fullOrderSum");
            Intrinsics.checkNotNullParameter(orderSum, "orderSum");
            Intrinsics.checkNotNullParameter(paymentToken, "paymentToken");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(merchant, "merchant");
            Intrinsics.checkNotNullParameter(gateway, "gateway");
            return new NativePaymentInfo(orderNumber, fullOrderSum, orderSum, paymentToken, provider, merchant, gateway);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NativePaymentInfo)) {
                return false;
            }
            NativePaymentInfo nativePaymentInfo = (NativePaymentInfo) other;
            return Intrinsics.d(this.orderNumber, nativePaymentInfo.orderNumber) && Intrinsics.d(this.fullOrderSum, nativePaymentInfo.fullOrderSum) && Intrinsics.d(this.orderSum, nativePaymentInfo.orderSum) && Intrinsics.d(this.paymentToken, nativePaymentInfo.paymentToken) && Intrinsics.d(this.provider, nativePaymentInfo.provider) && Intrinsics.d(this.merchant, nativePaymentInfo.merchant) && Intrinsics.d(this.gateway, nativePaymentInfo.gateway);
        }

        @NotNull
        public final BigDecimal getFullOrderSum() {
            return this.fullOrderSum;
        }

        @NotNull
        public final String getGateway() {
            return this.gateway;
        }

        @NotNull
        public final String getMerchant() {
            return this.merchant;
        }

        @NotNull
        public final String getOrderNumber() {
            return this.orderNumber;
        }

        @NotNull
        public final BigDecimal getOrderSum() {
            return this.orderSum;
        }

        @NotNull
        public final String getPaymentToken() {
            return this.paymentToken;
        }

        @NotNull
        public final String getProvider() {
            return this.provider;
        }

        public int hashCode() {
            return this.gateway.hashCode() + g.a(g.a(g.a((this.orderSum.hashCode() + ((this.fullOrderSum.hashCode() + (this.orderNumber.hashCode() * 31)) * 31)) * 31, 31, this.paymentToken), 31, this.provider), 31, this.merchant);
        }

        @NotNull
        public String toString() {
            String str = this.orderNumber;
            BigDecimal bigDecimal = this.fullOrderSum;
            BigDecimal bigDecimal2 = this.orderSum;
            String str2 = this.paymentToken;
            String str3 = this.provider;
            String str4 = this.merchant;
            String str5 = this.gateway;
            StringBuilder sb2 = new StringBuilder("NativePaymentInfo(orderNumber=");
            sb2.append(str);
            sb2.append(", fullOrderSum=");
            sb2.append(bigDecimal);
            sb2.append(", orderSum=");
            sb2.append(bigDecimal2);
            sb2.append(", paymentToken=");
            sb2.append(str2);
            sb2.append(", provider=");
            a.h(sb2, str3, ", merchant=", str4, ", gateway=");
            return o0.c(sb2, str5, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$SberPayInfo;", "", "apiKey", "", "merchant", "bankInvoiceId", "orderNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiKey", "()Ljava/lang/String;", "getMerchant", "getBankInvoiceId", "getOrderNumber", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SberPayInfo {

        @NotNull
        private final String apiKey;

        @NotNull
        private final String bankInvoiceId;

        @NotNull
        private final String merchant;

        @NotNull
        private final String orderNumber;

        public SberPayInfo(@NotNull String apiKey, @NotNull String merchant, @NotNull String bankInvoiceId, @NotNull String orderNumber) {
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            Intrinsics.checkNotNullParameter(merchant, "merchant");
            Intrinsics.checkNotNullParameter(bankInvoiceId, "bankInvoiceId");
            Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
            this.apiKey = apiKey;
            this.merchant = merchant;
            this.bankInvoiceId = bankInvoiceId;
            this.orderNumber = orderNumber;
        }

        public static /* synthetic */ SberPayInfo copy$default(SberPayInfo sberPayInfo, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = sberPayInfo.apiKey;
            }
            if ((i11 & 2) != 0) {
                str2 = sberPayInfo.merchant;
            }
            if ((i11 & 4) != 0) {
                str3 = sberPayInfo.bankInvoiceId;
            }
            if ((i11 & 8) != 0) {
                str4 = sberPayInfo.orderNumber;
            }
            return sberPayInfo.copy(str, str2, str3, str4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getApiKey() {
            return this.apiKey;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getMerchant() {
            return this.merchant;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getBankInvoiceId() {
            return this.bankInvoiceId;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getOrderNumber() {
            return this.orderNumber;
        }

        @NotNull
        public final SberPayInfo copy(@NotNull String apiKey, @NotNull String merchant, @NotNull String bankInvoiceId, @NotNull String orderNumber) {
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            Intrinsics.checkNotNullParameter(merchant, "merchant");
            Intrinsics.checkNotNullParameter(bankInvoiceId, "bankInvoiceId");
            Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
            return new SberPayInfo(apiKey, merchant, bankInvoiceId, orderNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SberPayInfo)) {
                return false;
            }
            SberPayInfo sberPayInfo = (SberPayInfo) other;
            return Intrinsics.d(this.apiKey, sberPayInfo.apiKey) && Intrinsics.d(this.merchant, sberPayInfo.merchant) && Intrinsics.d(this.bankInvoiceId, sberPayInfo.bankInvoiceId) && Intrinsics.d(this.orderNumber, sberPayInfo.orderNumber);
        }

        @NotNull
        public final String getApiKey() {
            return this.apiKey;
        }

        @NotNull
        public final String getBankInvoiceId() {
            return this.bankInvoiceId;
        }

        @NotNull
        public final String getMerchant() {
            return this.merchant;
        }

        @NotNull
        public final String getOrderNumber() {
            return this.orderNumber;
        }

        public int hashCode() {
            return this.orderNumber.hashCode() + g.a(g.a(this.apiKey.hashCode() * 31, 31, this.merchant), 31, this.bankInvoiceId);
        }

        @NotNull
        public String toString() {
            String str = this.apiKey;
            String str2 = this.merchant;
            return C3173b.c(C3660k.d("SberPayInfo(apiKey=", str, ", merchant=", str2, ", bankInvoiceId="), this.bankInvoiceId, ", orderNumber=", this.orderNumber, ")");
        }
    }

    public OrderDTO(String str, String str2, String str3, Error error, String str4, NativePaymentInfo nativePaymentInfo, FastPayInfo fastPayInfo, SberPayInfo sberPayInfo, String str5, AtomActionDTO atomActionDTO) {
        this.link = str;
        this.redirectLink = str2;
        this.cancelLink = str3;
        this.error = error;
        this.authorizePaymentUrl = str4;
        this.nativePaymentInfo = nativePaymentInfo;
        this.fastPayInfo = fastPayInfo;
        this.sberPayInfo = sberPayInfo;
        this.authorizeComposerActionName = str5;
        this.action = atomActionDTO;
    }

    public static /* synthetic */ OrderDTO copy$default(OrderDTO orderDTO, String str, String str2, String str3, Error error, String str4, NativePaymentInfo nativePaymentInfo, FastPayInfo fastPayInfo, SberPayInfo sberPayInfo, String str5, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderDTO.link;
        }
        if ((i11 & 2) != 0) {
            str2 = orderDTO.redirectLink;
        }
        if ((i11 & 4) != 0) {
            str3 = orderDTO.cancelLink;
        }
        if ((i11 & 8) != 0) {
            error = orderDTO.error;
        }
        if ((i11 & 16) != 0) {
            str4 = orderDTO.authorizePaymentUrl;
        }
        if ((i11 & 32) != 0) {
            nativePaymentInfo = orderDTO.nativePaymentInfo;
        }
        if ((i11 & 64) != 0) {
            fastPayInfo = orderDTO.fastPayInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            sberPayInfo = orderDTO.sberPayInfo;
        }
        if ((i11 & 256) != 0) {
            str5 = orderDTO.authorizeComposerActionName;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            atomActionDTO = orderDTO.action;
        }
        String str6 = str5;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        FastPayInfo fastPayInfo2 = fastPayInfo;
        SberPayInfo sberPayInfo2 = sberPayInfo;
        String str7 = str4;
        NativePaymentInfo nativePaymentInfo2 = nativePaymentInfo;
        return orderDTO.copy(str, str2, str3, error, str7, nativePaymentInfo2, fastPayInfo2, sberPayInfo2, str6, atomActionDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    /* renamed from: component10, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRedirectLink() {
        return this.redirectLink;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCancelLink() {
        return this.cancelLink;
    }

    /* renamed from: component4, reason: from getter */
    public final Error getError() {
        return this.error;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAuthorizePaymentUrl() {
        return this.authorizePaymentUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final NativePaymentInfo getNativePaymentInfo() {
        return this.nativePaymentInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final FastPayInfo getFastPayInfo() {
        return this.fastPayInfo;
    }

    /* renamed from: component8, reason: from getter */
    public final SberPayInfo getSberPayInfo() {
        return this.sberPayInfo;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAuthorizeComposerActionName() {
        return this.authorizeComposerActionName;
    }

    @NotNull
    public final OrderDTO copy(String link, String redirectLink, String cancelLink, Error error, String authorizePaymentUrl, NativePaymentInfo nativePaymentInfo, FastPayInfo fastPayInfo, SberPayInfo sberPayInfo, String authorizeComposerActionName, AtomActionDTO action) {
        return new OrderDTO(link, redirectLink, cancelLink, error, authorizePaymentUrl, nativePaymentInfo, fastPayInfo, sberPayInfo, authorizeComposerActionName, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDTO)) {
            return false;
        }
        OrderDTO orderDTO = (OrderDTO) other;
        return Intrinsics.d(this.link, orderDTO.link) && Intrinsics.d(this.redirectLink, orderDTO.redirectLink) && Intrinsics.d(this.cancelLink, orderDTO.cancelLink) && Intrinsics.d(this.error, orderDTO.error) && Intrinsics.d(this.authorizePaymentUrl, orderDTO.authorizePaymentUrl) && Intrinsics.d(this.nativePaymentInfo, orderDTO.nativePaymentInfo) && Intrinsics.d(this.fastPayInfo, orderDTO.fastPayInfo) && Intrinsics.d(this.sberPayInfo, orderDTO.sberPayInfo) && Intrinsics.d(this.authorizeComposerActionName, orderDTO.authorizeComposerActionName) && Intrinsics.d(this.action, orderDTO.action);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getAuthorizeComposerActionName() {
        return this.authorizeComposerActionName;
    }

    public final String getAuthorizePaymentUrl() {
        return this.authorizePaymentUrl;
    }

    public final String getCancelLink() {
        return this.cancelLink;
    }

    public final Error getError() {
        return this.error;
    }

    public final FastPayInfo getFastPayInfo() {
        return this.fastPayInfo;
    }

    public final String getLink() {
        return this.link;
    }

    public final NativePaymentInfo getNativePaymentInfo() {
        return this.nativePaymentInfo;
    }

    public final String getRedirectLink() {
        return this.redirectLink;
    }

    public final SberPayInfo getSberPayInfo() {
        return this.sberPayInfo;
    }

    public int hashCode() {
        String str = this.link;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.redirectLink;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cancelLink;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Error error = this.error;
        int hashCode4 = (hashCode3 + (error == null ? 0 : error.hashCode())) * 31;
        String str4 = this.authorizePaymentUrl;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        NativePaymentInfo nativePaymentInfo = this.nativePaymentInfo;
        int hashCode6 = (hashCode5 + (nativePaymentInfo == null ? 0 : nativePaymentInfo.hashCode())) * 31;
        FastPayInfo fastPayInfo = this.fastPayInfo;
        int hashCode7 = (hashCode6 + (fastPayInfo == null ? 0 : fastPayInfo.hashCode())) * 31;
        SberPayInfo sberPayInfo = this.sberPayInfo;
        int hashCode8 = (hashCode7 + (sberPayInfo == null ? 0 : sberPayInfo.hashCode())) * 31;
        String str5 = this.authorizeComposerActionName;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        return hashCode9 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.link;
        String str2 = this.redirectLink;
        String str3 = this.cancelLink;
        Error error = this.error;
        String str4 = this.authorizePaymentUrl;
        NativePaymentInfo nativePaymentInfo = this.nativePaymentInfo;
        FastPayInfo fastPayInfo = this.fastPayInfo;
        SberPayInfo sberPayInfo = this.sberPayInfo;
        String str5 = this.authorizeComposerActionName;
        AtomActionDTO atomActionDTO = this.action;
        StringBuilder d11 = C3660k.d("OrderDTO(link=", str, ", redirectLink=", str2, ", cancelLink=");
        d11.append(str3);
        d11.append(", error=");
        d11.append(error);
        d11.append(", authorizePaymentUrl=");
        d11.append(str4);
        d11.append(", nativePaymentInfo=");
        d11.append(nativePaymentInfo);
        d11.append(", fastPayInfo=");
        d11.append(fastPayInfo);
        d11.append(", sberPayInfo=");
        d11.append(sberPayInfo);
        d11.append(", authorizeComposerActionName=");
        d11.append(str5);
        d11.append(", action=");
        d11.append(atomActionDTO);
        d11.append(")");
        return d11.toString();
    }
}
