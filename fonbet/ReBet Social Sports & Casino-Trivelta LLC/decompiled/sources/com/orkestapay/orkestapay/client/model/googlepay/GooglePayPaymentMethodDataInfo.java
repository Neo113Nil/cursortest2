package com.orkestapay.orkestapay.client.model.googlepay;

import Zh.InterfaceC1901b;
import Zh.n;
import bi.f;
import ci.d;
import di.F0;
import di.U0;
import ei.y;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@n
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0015R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006("}, d2 = {"Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentMethodDataInfo;", "", "", "cardNetwork", "cardDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "write$Self", "(Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentMethodDataInfo;Lci/d;Lbi/f;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentMethodDataInfo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCardNetwork", "getCardNetwork$annotations", "()V", "getCardDetails", "getCardDetails$annotations", "Companion", "$serializer", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GooglePayPaymentMethodDataInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String cardDetails;

    @NotNull
    private final String cardNetwork;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentMethodDataInfo$Companion;", "", "<init>", "()V", "LZh/b;", "Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentMethodDataInfo;", "serializer", "()LZh/b;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return GooglePayPaymentMethodDataInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ GooglePayPaymentMethodDataInfo(int i10, @y(names = {"cardNetwork"}) String str, @y(names = {"cardDetails"}) String str2, U0 u02) {
        if (3 != (i10 & 3)) {
            F0.a(i10, 3, GooglePayPaymentMethodDataInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.cardNetwork = str;
        this.cardDetails = str2;
    }

    public static /* synthetic */ GooglePayPaymentMethodDataInfo copy$default(GooglePayPaymentMethodDataInfo googlePayPaymentMethodDataInfo, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = googlePayPaymentMethodDataInfo.cardNetwork;
        }
        if ((i10 & 2) != 0) {
            str2 = googlePayPaymentMethodDataInfo.cardDetails;
        }
        return googlePayPaymentMethodDataInfo.copy(str, str2);
    }

    @y(names = {"cardDetails"})
    public static /* synthetic */ void getCardDetails$annotations() {
    }

    @y(names = {"cardNetwork"})
    public static /* synthetic */ void getCardNetwork$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(GooglePayPaymentMethodDataInfo self, d output, f serialDesc) {
        output.G(serialDesc, 0, self.cardNetwork);
        output.G(serialDesc, 1, self.cardDetails);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCardNetwork() {
        return this.cardNetwork;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCardDetails() {
        return this.cardDetails;
    }

    @NotNull
    public final GooglePayPaymentMethodDataInfo copy(@NotNull String cardNetwork, @NotNull String cardDetails) {
        Intrinsics.checkNotNullParameter(cardNetwork, "cardNetwork");
        Intrinsics.checkNotNullParameter(cardDetails, "cardDetails");
        return new GooglePayPaymentMethodDataInfo(cardNetwork, cardDetails);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GooglePayPaymentMethodDataInfo)) {
            return false;
        }
        GooglePayPaymentMethodDataInfo googlePayPaymentMethodDataInfo = (GooglePayPaymentMethodDataInfo) other;
        return Intrinsics.areEqual(this.cardNetwork, googlePayPaymentMethodDataInfo.cardNetwork) && Intrinsics.areEqual(this.cardDetails, googlePayPaymentMethodDataInfo.cardDetails);
    }

    @NotNull
    public final String getCardDetails() {
        return this.cardDetails;
    }

    @NotNull
    public final String getCardNetwork() {
        return this.cardNetwork;
    }

    public int hashCode() {
        return (this.cardNetwork.hashCode() * 31) + this.cardDetails.hashCode();
    }

    @NotNull
    public String toString() {
        return "GooglePayPaymentMethodDataInfo(cardNetwork=" + this.cardNetwork + ", cardDetails=" + this.cardDetails + ')';
    }

    public GooglePayPaymentMethodDataInfo(@NotNull String cardNetwork, @NotNull String cardDetails) {
        Intrinsics.checkNotNullParameter(cardNetwork, "cardNetwork");
        Intrinsics.checkNotNullParameter(cardDetails, "cardDetails");
        this.cardNetwork = cardNetwork;
        this.cardDetails = cardDetails;
    }
}
