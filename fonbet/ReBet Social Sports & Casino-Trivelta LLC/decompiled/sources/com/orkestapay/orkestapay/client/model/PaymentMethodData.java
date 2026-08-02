package com.orkestapay.orkestapay.client.model;

import Zh.InterfaceC1901b;
import Zh.n;
import bi.f;
import ci.d;
import com.orkestapay.orkestapay.client.enums.PaymentMethodType;
import di.F0;
import di.J;
import di.U0;
import di.Z0;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001c¨\u0006."}, d2 = {"Lcom/orkestapay/orkestapay/client/model/PaymentMethodData;", "", "Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;", "type", "", "name", "Lcom/orkestapay/orkestapay/client/model/PaymentMethodProperties;", "properties", "<init>", "(Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;Ljava/lang/String;Lcom/orkestapay/orkestapay/client/model/PaymentMethodProperties;)V", "", "seen1", "Ldi/U0;", "serializationConstructorMarker", "(ILcom/orkestapay/orkestapay/client/enums/PaymentMethodType;Ljava/lang/String;Lcom/orkestapay/orkestapay/client/model/PaymentMethodProperties;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "write$Self", "(Lcom/orkestapay/orkestapay/client/model/PaymentMethodData;Lci/d;Lbi/f;)V", "component1", "()Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/orkestapay/orkestapay/client/model/PaymentMethodProperties;", "copy", "(Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;Ljava/lang/String;Lcom/orkestapay/orkestapay/client/model/PaymentMethodProperties;)Lcom/orkestapay/orkestapay/client/model/PaymentMethodData;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;", "getType", "Ljava/lang/String;", "getName", "Lcom/orkestapay/orkestapay/client/model/PaymentMethodProperties;", "getProperties", "Companion", "$serializer", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentMethodData {

    @Nullable
    private final String name;

    @NotNull
    private final PaymentMethodProperties properties;

    @NotNull
    private final PaymentMethodType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final InterfaceC1901b[] $childSerializers = {J.a("com.orkestapay.orkestapay.client.enums.PaymentMethodType", PaymentMethodType.values()), null, null};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/PaymentMethodData$Companion;", "", "<init>", "()V", "LZh/b;", "Lcom/orkestapay/orkestapay/client/model/PaymentMethodData;", "serializer", "()LZh/b;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return PaymentMethodData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PaymentMethodData(int i10, PaymentMethodType paymentMethodType, String str, PaymentMethodProperties paymentMethodProperties, U0 u02) {
        if (5 != (i10 & 5)) {
            F0.a(i10, 5, PaymentMethodData$$serializer.INSTANCE.getDescriptor());
        }
        this.type = paymentMethodType;
        if ((i10 & 2) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        this.properties = paymentMethodProperties;
    }

    public static /* synthetic */ PaymentMethodData copy$default(PaymentMethodData paymentMethodData, PaymentMethodType paymentMethodType, String str, PaymentMethodProperties paymentMethodProperties, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            paymentMethodType = paymentMethodData.type;
        }
        if ((i10 & 2) != 0) {
            str = paymentMethodData.name;
        }
        if ((i10 & 4) != 0) {
            paymentMethodProperties = paymentMethodData.properties;
        }
        return paymentMethodData.copy(paymentMethodType, str, paymentMethodProperties);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(PaymentMethodData self, d output, f serialDesc) {
        output.B(serialDesc, 0, $childSerializers[0], self.type);
        if (output.m(serialDesc, 1) || self.name != null) {
            output.C(serialDesc, 1, Z0.f45341a, self.name);
        }
        output.B(serialDesc, 2, PaymentMethodProperties$$serializer.INSTANCE, self.properties);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final PaymentMethodType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PaymentMethodProperties getProperties() {
        return this.properties;
    }

    @NotNull
    public final PaymentMethodData copy(@NotNull PaymentMethodType type, @Nullable String name, @NotNull PaymentMethodProperties properties) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(properties, "properties");
        return new PaymentMethodData(type, name, properties);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodData)) {
            return false;
        }
        PaymentMethodData paymentMethodData = (PaymentMethodData) other;
        return this.type == paymentMethodData.type && Intrinsics.areEqual(this.name, paymentMethodData.name) && Intrinsics.areEqual(this.properties, paymentMethodData.properties);
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final PaymentMethodProperties getProperties() {
        return this.properties;
    }

    @NotNull
    public final PaymentMethodType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.name;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.properties.hashCode();
    }

    @NotNull
    public String toString() {
        return "PaymentMethodData(type=" + this.type + ", name=" + this.name + ", properties=" + this.properties + ')';
    }

    public PaymentMethodData(@NotNull PaymentMethodType type, @Nullable String str, @NotNull PaymentMethodProperties properties) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.type = type;
        this.name = str;
        this.properties = properties;
    }

    public /* synthetic */ PaymentMethodData(PaymentMethodType paymentMethodType, String str, PaymentMethodProperties paymentMethodProperties, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentMethodType, (i10 & 2) != 0 ? null : str, paymentMethodProperties);
    }
}
