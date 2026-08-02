package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ms2 extends q8 {
    public final SharedPreferences e;
    public final Set f;
    public final yzc g;
    public final yzc h;
    public String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms2(@NotNull Application application) {
        super(application);
        SharedPreferences d;
        application.getClass();
        Context i = i();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = i.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        this.e = sharedPreferences;
        Set<String> stringSet = sharedPreferences.getStringSet("EXCLUDED_LIST", new HashSet());
        stringSet = stringSet == null ? new HashSet<>() : stringSet;
        this.f = stringSet;
        yzc yzcVar = new yzc(stringSet);
        this.g = yzcVar;
        this.h = yzcVar;
        this.i = sharedPreferences.getString("LANGUAGE", null);
    }

    public final void k() {
        SharedPreferences.Editor edit = this.e.edit();
        edit.getClass();
        edit.putStringSet("EXCLUDED_LIST", this.f);
        edit.apply();
    }
}
