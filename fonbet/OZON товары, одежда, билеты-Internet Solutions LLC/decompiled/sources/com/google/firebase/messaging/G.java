package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.collection.C5132a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Map;

@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes9.dex */
public final class G extends AbstractSafeParcelable {
    public static final Parcelable.Creator<G> CREATOR = new H();

    /* renamed from: a, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    Bundle f59613a;

    /* renamed from: b, reason: collision with root package name */
    private C5132a f59614b;

    @SafeParcelable.Constructor
    public G(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.f59613a = bundle;
    }

    @NonNull
    public final Map<String, String> getData() {
        if (this.f59614b == null) {
            C5132a c5132a = new C5132a();
            Bundle bundle = this.f59613a;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c5132a.put(str, str2);
                    }
                }
            }
            this.f59614b = c5132a;
        }
        return this.f59614b;
    }

    public final String getMessageId() {
        Bundle bundle = this.f59613a;
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    public final int getOriginalPriority() {
        Bundle bundle = this.f59613a;
        String string = bundle.getString("google.original_priority");
        if (string == null) {
            string = bundle.getString("google.priority");
        }
        if ("high".equals(string)) {
            return 1;
        }
        return "normal".equals(string) ? 2 : 0;
    }

    public final int getPriority() {
        Bundle bundle = this.f59613a;
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
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.f59613a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
