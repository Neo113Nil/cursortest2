package defpackage;

import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class kpm {
    public static final /* synthetic */ KProperty[] a;
    public static final dg4 b;
    public static final dg4 c;

    static {
        kef kefVar = new kef(kpm.class, "blazeProdDataStore", "getBlazeProdDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1);
        fuf fufVar = duf.a;
        a = new KProperty[]{fufVar.property1(kefVar), fufVar.property1(new kef(kpm.class, "blazeUatDataStore", "getBlazeUatDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
        b = q5a.M("blaze_data_store_prod", null, null, null, 14);
        c = q5a.M("blaze_data_store_uat", null, null, null, 14);
    }
}
