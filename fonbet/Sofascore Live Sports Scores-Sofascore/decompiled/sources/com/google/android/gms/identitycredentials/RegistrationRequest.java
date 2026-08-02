package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.bf3;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/android/gms/identitycredentials/RegistrationRequest;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class RegistrationRequest extends AbstractSafeParcelable {

    @NotNull
    public static final Parcelable.Creator<RegistrationRequest> CREATOR;
    public final byte[] a;
    public final byte[] b;
    public final String c;
    public final String d;
    public final List e;
    public final String f;
    public final String g;

    static {
        new Companion(0);
        CREATOR = new RegistrationRequestCreator();
    }

    public RegistrationRequest(byte[] bArr, byte[] bArr2, String str, String str2, List list, String str3, String str4) {
        boolean z;
        bArr.getClass();
        bArr2.getClass();
        str.getClass();
        str2.getClass();
        list.getClass();
        str3.getClass();
        str4.getClass();
        this.a = bArr;
        this.b = bArr2;
        this.c = str;
        this.d = str2;
        this.e = list;
        this.f = str3;
        this.g = str4;
        if (!StringsKt.R(str2) && !list.isEmpty() && (list == null || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!StringsKt.R((String) it.next())) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z2 = !StringsKt.R(this.c) && this.d.length() == 0 && this.e.isEmpty();
        if (z || z2) {
            return;
        }
        String str5 = this.c;
        String str6 = this.d;
        List list2 = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(list2).length() + String.valueOf(str5).length() + 31 + String.valueOf(str6).length() + 20 + 94);
        bf3.v(sb, "Either type: ", str5, ", or requestType: ", str6);
        sb.append(" and protocolTypes: ");
        sb.append(list2);
        sb.append(" must be specified, but all were blank, or for protocolTypes, empty or full of blank elements.");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.c(parcel, 1, this.a, false);
        SafeParcelWriter.c(parcel, 2, this.b, false);
        SafeParcelWriter.m(parcel, 3, this.c, false);
        SafeParcelWriter.m(parcel, 4, this.d, false);
        SafeParcelWriter.o(parcel, 5, this.e);
        SafeParcelWriter.m(parcel, 6, this.f, false);
        SafeParcelWriter.m(parcel, 7, this.g, false);
        SafeParcelWriter.t(parcel, s);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/google/android/gms/identitycredentials/RegistrationRequest$Companion;", "", "<init>", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/google/android/gms/identitycredentials/RegistrationRequest;", "TAG", "", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i) {
            this();
        }
    }
}
