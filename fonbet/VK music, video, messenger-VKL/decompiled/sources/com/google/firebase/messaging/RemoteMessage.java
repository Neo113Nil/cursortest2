package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;
import xsna.ovf0;
import xsna.ozg0;
import xsna.zk3;

/* loaded from: classes13.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new ovf0();
    public final Bundle b;
    public zk3 c;

    public RemoteMessage(Bundle bundle) {
        this.b = bundle;
    }

    @NonNull
    public final Map<String, String> i() {
        if (this.c == null) {
            zk3 zk3Var = new zk3();
            Bundle bundle = this.b;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        zk3Var.put(str, str2);
                    }
                }
            }
            this.c = zk3Var;
        }
        return this.c;
    }

    @Nullable
    public final String j() {
        return this.b.getString("from");
    }

    public final int k() {
        Bundle bundle = this.b;
        String string = bundle.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = bundle.getString("google.priority");
        }
        if ("high".equals(string)) {
            return 1;
        }
        return "normal".equals(string) ? 2 : 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.d(parcel, 2, this.b, false);
        ozg0.x(w, parcel);
    }
}
