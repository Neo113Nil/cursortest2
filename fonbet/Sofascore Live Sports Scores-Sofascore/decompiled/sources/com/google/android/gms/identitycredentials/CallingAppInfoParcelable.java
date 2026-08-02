package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;", "Landroid/os/Parcelable;", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CallingAppInfoParcelable implements Parcelable {
    public final String a;
    public final ArrayList b;
    public final String c;
    public static final Companion d = new Companion(0);

    @NotNull
    public static final Parcelable.Creator<CallingAppInfoParcelable> CREATOR = new Parcelable.Creator<CallingAppInfoParcelable>() { // from class: com.google.android.gms.identitycredentials.CallingAppInfoParcelable$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        public final CallingAppInfoParcelable createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String readString = parcel.readString();
            CallingAppInfoParcelable.d.getClass();
            int readInt = parcel.readInt();
            if (readInt < 0) {
                arrayList = null;
            } else if (readInt == 0) {
                arrayList = new ArrayList();
            } else {
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i < readInt; i++) {
                    byte[] bArr = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr);
                    arrayList2.add(bArr);
                }
                arrayList = arrayList2;
            }
            String readString2 = parcel.readString();
            if (readString == null || arrayList == null) {
                return null;
            }
            return new CallingAppInfoParcelable(arrayList, readString, readString2);
        }

        @Override // android.os.Parcelable.Creator
        public final CallingAppInfoParcelable[] newArray(int i) {
            return new CallingAppInfoParcelable[i];
        }
    };

    public CallingAppInfoParcelable(ArrayList arrayList, String str, String str2) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        ArrayList<byte[]> arrayList = this.b;
        parcel.writeInt(arrayList.size());
        for (byte[] bArr : arrayList) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        parcel.writeString(this.c);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable$Companion;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;", "CREATOR", "Landroid/os/Parcelable$Creator;", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i) {
            this();
        }
    }
}
