package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class PaymentDataRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PaymentDataRequest> CREATOR = new C3419g();

    /* renamed from: a, reason: collision with root package name */
    public boolean f34581a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f34582b;

    /* renamed from: c, reason: collision with root package name */
    public CardRequirements f34583c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f34584d;

    /* renamed from: e, reason: collision with root package name */
    public ShippingAddressRequirements f34585e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f34586f;

    /* renamed from: g, reason: collision with root package name */
    public PaymentMethodTokenizationParameters f34587g;

    /* renamed from: h, reason: collision with root package name */
    public TransactionInfo f34588h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f34589i;

    /* renamed from: j, reason: collision with root package name */
    public String f34590j;

    /* renamed from: k, reason: collision with root package name */
    public Bundle f34591k;
    byte[] zzk;

    public final class a {
        public /* synthetic */ a(AbstractC3418f abstractC3418f) {
        }

        public PaymentDataRequest a() {
            PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
            if (paymentDataRequest.f34590j == null && paymentDataRequest.zzk == null) {
                AbstractC3191o.n(paymentDataRequest.f34586f, "Allowed payment methods must be set! You can set it through addAllowedPaymentMethod() or addAllowedPaymentMethods() in the PaymentDataRequest Builder.");
                AbstractC3191o.n(PaymentDataRequest.this.f34583c, "Card requirements must be set!");
                PaymentDataRequest paymentDataRequest2 = PaymentDataRequest.this;
                if (paymentDataRequest2.f34587g != null) {
                    AbstractC3191o.n(paymentDataRequest2.f34588h, "Transaction info must be set if paymentMethodTokenizationParameters is set!");
                }
            }
            return PaymentDataRequest.this;
        }
    }

    public PaymentDataRequest() {
        this.f34589i = true;
    }

    public static PaymentDataRequest g(String str) {
        a h10 = h();
        PaymentDataRequest.this.f34590j = (String) AbstractC3191o.n(str, "paymentDataRequestJson cannot be null!");
        return h10.a();
    }

    public static a h() {
        return new PaymentDataRequest().new a(null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.g(parcel, 1, this.f34581a);
        E9.b.g(parcel, 2, this.f34582b);
        E9.b.D(parcel, 3, this.f34583c, i10, false);
        E9.b.g(parcel, 4, this.f34584d);
        E9.b.D(parcel, 5, this.f34585e, i10, false);
        E9.b.w(parcel, 6, this.f34586f, false);
        E9.b.D(parcel, 7, this.f34587g, i10, false);
        E9.b.D(parcel, 8, this.f34588h, i10, false);
        E9.b.g(parcel, 9, this.f34589i);
        E9.b.F(parcel, 10, this.f34590j, false);
        E9.b.j(parcel, 11, this.f34591k, false);
        E9.b.l(parcel, 12, this.zzk, false);
        E9.b.b(parcel, a10);
    }

    public PaymentDataRequest(boolean z10, boolean z11, CardRequirements cardRequirements, boolean z12, ShippingAddressRequirements shippingAddressRequirements, ArrayList arrayList, PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, TransactionInfo transactionInfo, boolean z13, String str, byte[] bArr, Bundle bundle) {
        this.f34581a = z10;
        this.f34582b = z11;
        this.f34583c = cardRequirements;
        this.f34584d = z12;
        this.f34585e = shippingAddressRequirements;
        this.f34586f = arrayList;
        this.f34587g = paymentMethodTokenizationParameters;
        this.f34588h = transactionInfo;
        this.f34589i = z13;
        this.f34590j = str;
        this.zzk = bArr;
        this.f34591k = bundle;
    }
}
