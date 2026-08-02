package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import f7.h;
import f7.j;
import g6.v;
import java.util.ArrayList;
import java.util.Arrays;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class RevokeAccessRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<RevokeAccessRequest> CREATOR = new q5.b(29);

    /* renamed from: a, reason: collision with root package name */
    public final j f4347a;

    /* renamed from: b, reason: collision with root package name */
    public final Account f4348b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4349c;

    public RevokeAccessRequest(ArrayList arrayList, Account account, String str) {
        h hVar = j.f9489b;
        Object[] array = arrayList.toArray();
        int length = array.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (array[i5] == null) {
                throw new NullPointerException(k.o(new StringBuilder(String.valueOf(i5).length() + 9), "at index ", i5));
            }
        }
        int length2 = array.length;
        this.f4347a = length2 == 0 ? f7.k.f9490e : new f7.k(length2, array);
        this.f4348b = account;
        this.f4349c = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RevokeAccessRequest) {
            RevokeAccessRequest revokeAccessRequest = (RevokeAccessRequest) obj;
            j jVar = this.f4347a;
            int size = jVar.size();
            j jVar2 = revokeAccessRequest.f4347a;
            if (size == jVar2.size() && jVar.containsAll(jVar2) && v.k(this.f4348b, revokeAccessRequest.f4348b) && v.k(this.f4349c, revokeAccessRequest.f4349c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4347a, this.f4348b, this.f4349c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.R(parcel, 1, this.f4347a, false);
        h8.b.N(parcel, 2, this.f4348b, i5, false);
        h8.b.O(parcel, 3, this.f4349c, false);
        h8.b.W(parcel, V);
    }
}
