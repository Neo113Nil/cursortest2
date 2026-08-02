package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha02 */
/* loaded from: classes7.dex */
public final class RegistrationRequestCreator implements Parcelable.Creator<RegistrationRequest> {
    static void writeToParcel(RegistrationRequest registrationRequest, Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, registrationRequest.getCredentials(), false);
        SafeParcelWriter.writeByteArray(parcel, 2, registrationRequest.getMatcher(), false);
        SafeParcelWriter.writeString(parcel, 3, registrationRequest.getType(), false);
        SafeParcelWriter.writeString(parcel, 4, registrationRequest.getRequestType(), false);
        SafeParcelWriter.writeStringList(parcel, 5, registrationRequest.getProtocolTypes(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public RegistrationRequest createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        List list = Collections.EMPTY_LIST;
        String str = "";
        String str2 = str;
        byte[] bArr = null;
        byte[] bArr2 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                bArr = SafeParcelReader.createByteArray(parcel, readHeader);
            } else if (fieldId == 2) {
                bArr2 = SafeParcelReader.createByteArray(parcel, readHeader);
            } else if (fieldId == 3) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 4) {
                str2 = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                list = SafeParcelReader.createStringList(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new RegistrationRequest(bArr, bArr2, str, str2, list);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public RegistrationRequest[] newArray(int i) {
        return new RegistrationRequest[i];
    }
}
