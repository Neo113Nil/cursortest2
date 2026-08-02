package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class IsReadyToPayRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<IsReadyToPayRequest> CREATOR = new C();

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f34531a;

    /* renamed from: b, reason: collision with root package name */
    public String f34532b;

    /* renamed from: c, reason: collision with root package name */
    public String f34533c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f34534d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f34535e;

    /* renamed from: f, reason: collision with root package name */
    public String f34536f;

    public final class a {
        public /* synthetic */ a(B b10) {
        }

        public IsReadyToPayRequest a() {
            return IsReadyToPayRequest.this;
        }
    }

    public IsReadyToPayRequest() {
    }

    public static IsReadyToPayRequest g(String str) {
        a h10 = h();
        IsReadyToPayRequest.this.f34536f = (String) AbstractC3191o.n(str, "isReadyToPayRequestJson cannot be null!");
        return h10.a();
    }

    public static a h() {
        return new IsReadyToPayRequest().new a(null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.w(parcel, 2, this.f34531a, false);
        E9.b.F(parcel, 4, this.f34532b, false);
        E9.b.F(parcel, 5, this.f34533c, false);
        E9.b.w(parcel, 6, this.f34534d, false);
        E9.b.g(parcel, 7, this.f34535e);
        E9.b.F(parcel, 8, this.f34536f, false);
        E9.b.b(parcel, a10);
    }

    public IsReadyToPayRequest(ArrayList arrayList, String str, String str2, ArrayList arrayList2, boolean z10, String str3) {
        this.f34531a = arrayList;
        this.f34532b = str;
        this.f34533c = str2;
        this.f34534d = arrayList2;
        this.f34535e = z10;
        this.f34536f = str3;
    }
}
