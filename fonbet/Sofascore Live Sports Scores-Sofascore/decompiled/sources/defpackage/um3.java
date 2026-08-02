package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class um3 {
    public final zbl a;
    public final Context b;
    public final Object c;
    public final LinkedHashSet d;
    public Object e;

    public um3(Context context, zbl zblVar) {
        this.a = zblVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
        this.c = new Object();
        this.d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.e = obj;
                this.a.d.execute(new mc3(1, CollectionsKt.S0(this.d), this));
                Unit unit = Unit.a;
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
