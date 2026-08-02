package defpackage;

import android.content.Context;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class rf4 {
    public static final /* synthetic */ KProperty[] a = {new kef(rf4.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1), new kef(rf4.class, "brandingDataStore", "getBrandingDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1), new kef(rf4.class, "userAccountDataStore", "getUserAccountDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1)};
    public static final dg4 b;
    public static final dg4 c;
    public static final dg4 d;

    static {
        hs4 hs4Var = z45.a;
        b = q5a.M("sofascore", null, null, s9a.c(hq4.c.plus(tz9.o())), 6);
        c = s9a.s("branding_prefs.pb", q1f.b);
        d = s9a.s("user_prefs.pb", cfk.a);
    }

    public static final ye4 a(Context context) {
        return (ye4) d.getValue(context, a[2]);
    }
}
