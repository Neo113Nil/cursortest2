package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new u5.b(0);

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f4350a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4351b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4352c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4353d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4354e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4355f;

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, ArrayList arrayList, String str3, int i5) {
        this.f4350a = pendingIntent;
        this.f4351b = str;
        this.f4352c = str2;
        this.f4353d = arrayList;
        this.f4354e = str3;
        this.f4355f = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        List list = this.f4353d;
        int size = list.size();
        List list2 = saveAccountLinkingTokenRequest.f4353d;
        return size == list2.size() && list.containsAll(list2) && v.k(this.f4350a, saveAccountLinkingTokenRequest.f4350a) && v.k(this.f4351b, saveAccountLinkingTokenRequest.f4351b) && v.k(this.f4352c, saveAccountLinkingTokenRequest.f4352c) && v.k(this.f4354e, saveAccountLinkingTokenRequest.f4354e) && this.f4355f == saveAccountLinkingTokenRequest.f4355f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4350a, this.f4351b, this.f4352c, this.f4353d, this.f4354e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.N(parcel, 1, this.f4350a, i5, false);
        h8.b.O(parcel, 2, this.f4351b, false);
        h8.b.O(parcel, 3, this.f4352c, false);
        h8.b.P(parcel, 4, this.f4353d);
        h8.b.O(parcel, 5, this.f4354e, false);
        h8.b.U(parcel, 6, 4);
        parcel.writeInt(this.f4355f);
        h8.b.W(parcel, V);
    }
}
