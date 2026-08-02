package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Calendar;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ith {
    public final dhk a;
    public final SharedPreferences b;
    public final Context c;

    public ith(dhk dhkVar, Context context, SharedPreferences sharedPreferences) {
        dhkVar.getClass();
        sharedPreferences.getClass();
        this.a = dhkVar;
        this.b = sharedPreferences;
        this.c = context;
    }

    public final ehk a() {
        Object obj;
        x3f x3fVar = ehk.e;
        int i = this.b.getInt("SOFA_SEASON_ROLE_ORDINAL", -1);
        x3fVar.getClass();
        Iterator<E> it = ehk.h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ehk) obj).ordinal() == i) {
                break;
            }
        }
        return (ehk) obj;
    }

    public final Object b(hoi hoiVar) {
        String d;
        SharedPreferences sharedPreferences = this.b;
        boolean z = sharedPreferences.getBoolean("DEV_MODE_SHOW_SOFA_SEASON", false);
        if (z) {
            d = sharedPreferences.getString("DEV_MODE_SOFA_SEASON_ID", "10FBB22F-30DD-417D-9AFA-69A544B3B46C");
            if (d == null) {
                d = "";
            }
        } else {
            Calendar calendar = ke0.a;
            d = ke0.d(this.c);
        }
        yea yeaVar = j58.a;
        return (fn0.B("should_show_sofa_season_2025") || z) ? this.a.g(d, hoiVar) : Boolean.FALSE;
    }
}
