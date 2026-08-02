package defpackage;

import android.content.Context;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class jda {
    public static final /* synthetic */ KProperty[] e = {duf.a.property2(new mef(jda.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"))};
    public final Context a;
    public final String b;
    public final ThreadLocal c;
    public final ye4 d;

    public jda(Context context, String str) {
        context.getClass();
        this.a = context;
        this.b = str;
        this.c = new ThreadLocal();
        this.d = (ye4) q5a.M(str, new e3c(new yo9(this), 10), new ida(this, 0), null, 8).getValue(context, e[0]);
    }

    public final void a(Function1 function1) {
    }

    public final Object b(e5f e5fVar, Long l) {
        e5fVar.getClass();
        return td4.t0(g.a, new zi7(this, e5fVar, l, (rq3) null, 15));
    }
}
