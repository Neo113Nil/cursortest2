package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;
import xsna.dq70;
import xsna.krz0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes12.dex */
public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new krz0();
    public final PendingIntent b;
    public final String c;
    public final String d;
    public final List e;

    @Nullable
    public final String f;
    public final int g;

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List list, @Nullable String str3, int i) {
        this.b = pendingIntent;
        this.c = str;
        this.d = str2;
        this.e = list;
        this.f = str3;
        this.g = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        List list = this.e;
        return list.size() == saveAccountLinkingTokenRequest.e.size() && list.containsAll(saveAccountLinkingTokenRequest.e) && dq70.b(this.b, saveAccountLinkingTokenRequest.b) && dq70.b(this.c, saveAccountLinkingTokenRequest.c) && dq70.b(this.d, saveAccountLinkingTokenRequest.d) && dq70.b(this.f, saveAccountLinkingTokenRequest.f) && this.g == saveAccountLinkingTokenRequest.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.b, i, false);
        ozg0.q(parcel, 2, this.c, false);
        ozg0.q(parcel, 3, this.d, false);
        ozg0.s(parcel, this.e, 4);
        ozg0.q(parcel, 5, this.f, false);
        ozg0.v(parcel, 6, 4);
        parcel.writeInt(this.g);
        ozg0.x(w, parcel);
    }
}
