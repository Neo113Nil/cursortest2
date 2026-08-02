package com.orkestapay.orkestapay.client.model.googlepay;

import Zh.InterfaceC1901b;
import Zh.n;
import bi.f;
import ci.d;
import com.orkestapay.orkestapay.client.enums.googlepay.TokenizationSpecificationType;
import di.F0;
import di.J;
import di.U0;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@n
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0018¨\u0006("}, d2 = {"Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentMethodDataTokenizationData;", "", "Lcom/orkestapay/orkestapay/client/enums/googlepay/TokenizationSpecificationType;", "type", "", "token", "<init>", "(Lcom/orkestapay/orkestapay/client/enums/googlepay/TokenizationSpecificationType;Ljava/lang/String;)V", "", "seen1", "Ldi/U0;", "serializationConstructorMarker", "(ILcom/orkestapay/orkestapay/client/enums/googlepay/TokenizationSpecificationType;Ljava/lang/String;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "write$Self", "(Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentMethodDataTokenizationData;Lci/d;Lbi/f;)V", "component1", "()Lcom/orkestapay/orkestapay/client/enums/googlepay/TokenizationSpecificationType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/orkestapay/orkestapay/client/enums/googlepay/TokenizationSpecificationType;Ljava/lang/String;)Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentMethodDataTokenizationData;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/orkestapay/orkestapay/client/enums/googlepay/TokenizationSpecificationType;", "getType", "Ljava/lang/String;", "getToken", "Companion", "$serializer", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GooglePayPaymentMethodDataTokenizationData {

    @NotNull
    private final String token;

    @NotNull
    private final TokenizationSpecificationType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final InterfaceC1901b[] $childSerializers = {J.a("com.orkestapay.orkestapay.client.enums.googlepay.TokenizationSpecificationType", TokenizationSpecificationType.values()), null};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentMethodDataTokenizationData$Companion;", "", "<init>", "()V", "LZh/b;", "Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentMethodDataTokenizationData;", "serializer", "()LZh/b;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return GooglePayPaymentMethodDataTokenizationData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ GooglePayPaymentMethodDataTokenizationData(int i10, TokenizationSpecificationType tokenizationSpecificationType, String str, U0 u02) {
        if (3 != (i10 & 3)) {
            F0.a(i10, 3, GooglePayPaymentMethodDataTokenizationData$$serializer.INSTANCE.getDescriptor());
        }
        this.type = tokenizationSpecificationType;
        this.token = str;
    }

    public static /* synthetic */ GooglePayPaymentMethodDataTokenizationData copy$default(GooglePayPaymentMethodDataTokenizationData googlePayPaymentMethodDataTokenizationData, TokenizationSpecificationType tokenizationSpecificationType, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            tokenizationSpecificationType = googlePayPaymentMethodDataTokenizationData.type;
        }
        if ((i10 & 2) != 0) {
            str = googlePayPaymentMethodDataTokenizationData.token;
        }
        return googlePayPaymentMethodDataTokenizationData.copy(tokenizationSpecificationType, str);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(GooglePayPaymentMethodDataTokenizationData self, d output, f serialDesc) {
        output.B(serialDesc, 0, $childSerializers[0], self.type);
        output.G(serialDesc, 1, self.token);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TokenizationSpecificationType getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final GooglePayPaymentMethodDataTokenizationData copy(@NotNull TokenizationSpecificationType type, @NotNull String token) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(token, "token");
        return new GooglePayPaymentMethodDataTokenizationData(type, token);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GooglePayPaymentMethodDataTokenizationData)) {
            return false;
        }
        GooglePayPaymentMethodDataTokenizationData googlePayPaymentMethodDataTokenizationData = (GooglePayPaymentMethodDataTokenizationData) other;
        return this.type == googlePayPaymentMethodDataTokenizationData.type && Intrinsics.areEqual(this.token, googlePayPaymentMethodDataTokenizationData.token);
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final TokenizationSpecificationType getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.token.hashCode();
    }

    @NotNull
    public String toString() {
        return "GooglePayPaymentMethodDataTokenizationData(type=" + this.type + ", token=" + this.token + ')';
    }

    public GooglePayPaymentMethodDataTokenizationData(@NotNull TokenizationSpecificationType type, @NotNull String token) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(token, "token");
        this.type = type;
        this.token = token;
    }
}
