package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jx9 {
    public final Context a;

    public jx9(Context context) {
        this.a = context;
    }

    public static void a(oog oogVar, Boolean bool) {
        try {
            p2g p2gVar = w2g.b;
            oogVar.resumeWith(bool);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
    }

    public final void b(boolean z) {
        SharedPreferences d;
        Context context = this.a;
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        SharedPreferences.Editor i = dmi.i(sharedPreferences, "IN_APP_PURCHASE_AVAILABLE", z);
        Unit unit = Unit.a;
        i.apply();
    }
}
