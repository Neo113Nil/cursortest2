package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class F1 {

    /* renamed from: a, reason: collision with root package name */
    public final C0020aa f12214a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12215b;

    public F1() {
        this(new C0020aa());
    }

    public final synchronized long a(Context context) {
        String a7;
        try {
            this.f12214a.getClass();
            a7 = Ja.a(FileUtils.getFileFromAppStorage(context, "metrica_service_settings.dat"));
        } catch (Throwable unused) {
        }
        return TextUtils.isEmpty(a7) ? 0L : new JSONObject(a7).optLong("delay");
    }

    public final void b(Context context) {
        synchronized (this) {
        }
        if (this.f12215b) {
            return;
        }
        long a7 = a(context);
        if (a7 > 0) {
            try {
                Thread.sleep(a7);
            } catch (Throwable unused) {
            }
        }
        this.f12215b = true;
    }

    public F1(C0020aa c0020aa) {
        this.f12215b = false;
        this.f12214a = c0020aa;
    }
}
