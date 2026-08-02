package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzcek;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xrn {
    public final HashMap a = new HashMap();
    public final ArrayList b = new ArrayList();
    public final Context c;
    public final zzcek d;

    public xrn(Context context, zzcek zzcekVar) {
        this.c = context;
        this.d = zzcekVar;
    }

    public final synchronized void a(String str) {
        try {
            HashMap hashMap = this.a;
            if (hashMap.containsKey(str)) {
                return;
            }
            boolean equals = Objects.equals(str, "__default__");
            Context context = this.c;
            SharedPreferences defaultSharedPreferences = equals ? PreferenceManager.getDefaultSharedPreferences(context) : context.getSharedPreferences(str, 0);
            vrn vrnVar = new vrn(this, str);
            hashMap.put(str, vrnVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(vrnVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
