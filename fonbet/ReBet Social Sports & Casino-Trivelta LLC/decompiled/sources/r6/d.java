package r6;

import T7.A;
import T7.C1682w;
import T7.Y;
import android.os.Bundle;
import com.twilio.voice.PublisherMetadata;
import h6.C4478e;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m6.C5562a;
import org.json.JSONArray;
import r6.e;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f64046a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final String f64047b = e.class.getSimpleName();

    public static final Bundle a(e.a eventType, String applicationId, List appEvents) {
        if (Y7.a.d(d.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString("event", eventType.toString());
            bundle.putString(PublisherMetadata.APP_ID, applicationId);
            if (e.a.CUSTOM_APP_EVENTS != eventType) {
                return bundle;
            }
            JSONArray b10 = f64046a.b(appEvents, applicationId);
            if (b10.length() == 0) {
                return null;
            }
            bundle.putString("custom_events", b10.toString());
            return bundle;
        } catch (Throwable th2) {
            Y7.a.b(th2, d.class);
            return null;
        }
    }

    public final JSONArray b(List list, String str) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            List<C4478e> mutableList = CollectionsKt.toMutableList((Collection) list);
            C5562a.d(mutableList);
            boolean c10 = c(str);
            for (C4478e c4478e : mutableList) {
                if (c4478e.g()) {
                    if (c4478e.h()) {
                        if (c4478e.h() && c10) {
                        }
                    }
                    jSONArray.put(c4478e.e());
                } else {
                    Y y10 = Y.f11042a;
                    Y.k0(f64047b, Intrinsics.stringPlus("Event with invalid checksum: ", c4478e));
                }
            }
            return jSONArray;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final boolean c(String str) {
        if (Y7.a.d(this)) {
            return false;
        }
        try {
            C1682w q10 = A.q(str, false);
            if (q10 != null) {
                return q10.q();
            }
            return false;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }
}
