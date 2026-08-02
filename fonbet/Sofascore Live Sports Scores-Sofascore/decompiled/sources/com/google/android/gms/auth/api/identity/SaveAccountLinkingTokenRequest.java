package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new zbq();
    public final PendingIntent a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final int f;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
        public Builder() {
            new ArrayList();
        }
    }

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, ArrayList arrayList, String str3, int i) {
        this.a = pendingIntent;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
        this.e = str3;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        List list = saveAccountLinkingTokenRequest.d;
        List list2 = this.d;
        return list2.size() == list.size() && list2.containsAll(list) && Objects.a(this.a, saveAccountLinkingTokenRequest.a) && Objects.a(this.b, saveAccountLinkingTokenRequest.b) && Objects.a(this.c, saveAccountLinkingTokenRequest.c) && Objects.a(this.e, saveAccountLinkingTokenRequest.e) && this.f == saveAccountLinkingTokenRequest.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.l(parcel, 1, this.a, i, false);
        SafeParcelWriter.m(parcel, 2, this.b, false);
        SafeParcelWriter.m(parcel, 3, this.c, false);
        SafeParcelWriter.o(parcel, 4, this.d);
        SafeParcelWriter.m(parcel, 5, this.e, false);
        SafeParcelWriter.r(parcel, 6, 4);
        parcel.writeInt(this.f);
        SafeParcelWriter.t(parcel, s);
    }
}
