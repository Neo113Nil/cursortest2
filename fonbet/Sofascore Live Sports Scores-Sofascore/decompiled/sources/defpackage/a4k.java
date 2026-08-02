package defpackage;

import android.content.SharedPreferences;
import com.sofascore.model.mvvm.model.TvChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a4k {
    public final SharedPreferences a;
    public final yea b;

    public a4k(SharedPreferences sharedPreferences, yea yeaVar) {
        sharedPreferences.getClass();
        yeaVar.getClass();
        this.a = sharedPreferences;
        this.b = yeaVar;
    }

    public final Map a() {
        String string = this.a.getString("PREF_TV_SCHEDULE_LAST_CHANNELS", null);
        if (string == null) {
            return new LinkedHashMap();
        }
        yea yeaVar = this.b;
        yeaVar.getClass();
        return (Map) yeaVar.b(new q79(uhi.a, new xg0(a7a.a, 2), 1), string);
    }

    public final void b(Map map) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.getClass();
        edit.putLong("PREF_TV_SCHEDULE_LAST_UPDATE", System.currentTimeMillis());
        yea yeaVar = this.b;
        yeaVar.getClass();
        edit.putString("PREF_TV_SCHEDULE_LAST_CHANNELS", yeaVar.c(new q79(uhi.a, new xg0(a7a.a, 2), 1), map));
        edit.apply();
    }

    public final void c(String str, ArrayList arrayList) {
        arrayList.getClass();
        str.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(Integer.valueOf(((TvChannel) it.next()).getId()));
        }
        Map a = a();
        a.put(str, linkedHashSet);
        b(a);
    }
}
