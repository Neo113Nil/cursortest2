package io.appmetrica.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import d9.e;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.impl.Ya;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class IdentifiersResult implements Parcelable {
    public static final Parcelable.Creator<IdentifiersResult> CREATOR = new Ya();
    public final String errorExplanation;

    /* renamed from: id, reason: collision with root package name */
    public final String f15009id;

    @NonNull
    public final IdentifierStatus status;

    public IdentifiersResult(String str, @NonNull IdentifierStatus identifierStatus, String str2) {
        this.f15009id = str;
        this.status = identifierStatus;
        this.errorExplanation = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            IdentifiersResult identifiersResult = (IdentifiersResult) obj;
            String str = this.f15009id;
            if (str == null ? identifiersResult.f15009id != null : !str.equals(identifiersResult.f15009id)) {
                return false;
            }
            if (this.status != identifiersResult.status) {
                return false;
            }
            String str2 = this.errorExplanation;
            if (str2 != null) {
                return str2.equals(identifiersResult.errorExplanation);
            }
            if (identifiersResult.errorExplanation == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f15009id;
        int hashCode = (this.status.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.errorExplanation;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("IdentifiersResult{id='");
        sb2.append(this.f15009id);
        sb2.append("', status=");
        sb2.append(this.status);
        sb2.append(", errorExplanation='");
        return e.l(sb2, this.errorExplanation, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f15009id);
        parcel.writeString(this.status.getValue());
        parcel.writeString(this.errorExplanation);
    }
}
