package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import io.sentry.android.core.w0;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new a3.a(19);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f6071a;

    /* renamed from: b, reason: collision with root package name */
    public s.e f6072b;

    /* renamed from: c, reason: collision with root package name */
    public w f6073c;

    public RemoteMessage(Bundle bundle) {
        this.f6071a = bundle;
    }

    public final Map c() {
        if (this.f6072b == null) {
            s.e eVar = new s.e(0);
            Bundle bundle = this.f6071a;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        eVar.put(str, str2);
                    }
                }
            }
            this.f6072b = eVar;
        }
        return this.f6072b;
    }

    public final String l0() {
        return this.f6071a.getString("from");
    }

    public final w o0() {
        if (this.f6073c == null) {
            Bundle bundle = this.f6071a;
            if (h9.c.x(bundle)) {
                this.f6073c = new w(new h9.c(bundle));
            }
        }
        return this.f6073c;
    }

    public final long s0() {
        Object obj = this.f6071a.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            w0.m("FirebaseMessaging", "Invalid sent time: " + obj);
            return 0L;
        }
    }

    public final int t0() {
        Object obj = this.f6071a.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            w0.m("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.F(parcel, 2, this.f6071a);
        h8.b.W(parcel, V);
    }
}
