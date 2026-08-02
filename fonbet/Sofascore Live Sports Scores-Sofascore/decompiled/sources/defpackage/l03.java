package defpackage;

import android.os.Build;
import android.os.Bundle;
import com.facebook.d0;
import com.facebook.h0;
import com.facebook.internal.c;
import com.facebook.internal.h;
import com.facebook.w;
import com.mbridge.msdk.config.component.common.file.a;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class l03 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ l03(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Locale locale;
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                if (!cw3.a.contains(m03.class)) {
                    try {
                        Bundle bundle = new Bundle();
                        c b = h.b(w.a());
                        JSONArray jSONArray = new JSONArray();
                        String str2 = Build.MODEL;
                        if (str2 == null) {
                            str2 = "";
                        }
                        jSONArray.put(str2);
                        if ((b != null ? b.a() : null) != null) {
                            jSONArray.put(b.a());
                        } else {
                            jSONArray.put("");
                        }
                        jSONArray.put("0");
                        jSONArray.put(pd0.B() ? "1" : "0");
                        try {
                            locale = w.a().getResources().getConfiguration().locale;
                        } catch (Exception unused) {
                            locale = null;
                        }
                        if (locale == null) {
                            locale = Locale.getDefault();
                            locale.getClass();
                        }
                        jSONArray.put(locale.getLanguage() + '_' + locale.getCountry());
                        String jSONArray2 = jSONArray.toString();
                        jSONArray2.getClass();
                        bundle.putString("device_session_id", m03.a());
                        bundle.putString("extinfo", jSONArray2);
                        String str3 = d0.j;
                        boolean z = true;
                        JSONObject jSONObject = new d0(null, String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1)), bundle, h0.b, null).c().b;
                        AtomicBoolean atomicBoolean = m03.g;
                        if (jSONObject == null || !jSONObject.optBoolean("is_app_indexing_enabled", false)) {
                            z = false;
                        }
                        atomicBoolean.set(z);
                        if (atomicBoolean.get()) {
                            atk atkVar = m03.d;
                            if (atkVar != null) {
                                atkVar.c();
                            }
                        } else {
                            m03.e = null;
                        }
                        m03.h = false;
                        break;
                    } catch (Throwable th) {
                        cw3.a(m03.class, th);
                        return;
                    }
                }
                break;
            default:
                a.k(str);
                break;
        }
    }
}
