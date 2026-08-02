package com.google.android.gms.wallet.wobs;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ha.f;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class LabelValueRow extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LabelValueRow> CREATOR = new f();

    /* renamed from: a, reason: collision with root package name */
    public String f34648a;

    /* renamed from: b, reason: collision with root package name */
    public String f34649b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f34650c;

    public LabelValueRow(String str, String str2, ArrayList arrayList) {
        this.f34648a = str;
        this.f34649b = str2;
        this.f34650c = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 2, this.f34648a, false);
        b.F(parcel, 3, this.f34649b, false);
        b.J(parcel, 4, this.f34650c, false);
        b.b(parcel, a10);
    }
}
