package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class heh implements be4 {
    public final oy8 a;
    public final br3 b;
    public final Context c;
    public final String d;
    public final mqi e;
    public final LinkedHashSet f;

    public heh(Context context, String str, Set set, oy8 oy8Var, br3 br3Var) {
        set.getClass();
        feh fehVar = new feh(context, str, 0);
        this.a = oy8Var;
        this.b = br3Var;
        this.c = context;
        this.d = str;
        this.e = ypa.b(fehVar);
        this.f = set == jeh.a ? null : CollectionsKt.V0(set);
    }

    @Override // defpackage.be4
    public final Object cleanUp(rq3 rq3Var) {
        mqi mqiVar = this.e;
        SharedPreferences.Editor edit = ((SharedPreferences) mqiVar.getValue()).edit();
        LinkedHashSet linkedHashSet = this.f;
        if (linkedHashSet == null) {
            edit.clear();
        } else {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                edit.remove((String) it.next());
            }
        }
        if (!edit.commit()) {
            is8.e("Unable to delete migrated keys from SharedPreferences.");
            return null;
        }
        if (((SharedPreferences) mqiVar.getValue()).getAll().isEmpty()) {
            this.c.deleteSharedPreferences(this.d);
        }
        if (linkedHashSet != null) {
            linkedHashSet.clear();
        }
        return Unit.a;
    }

    @Override // defpackage.be4
    public final Object migrate(Object obj, rq3 rq3Var) {
        return this.b.invoke(new keh((SharedPreferences) this.e.getValue(), this.f), obj, rq3Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r4.isEmpty() == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.be4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object shouldMigrate(Object obj, rq3 rq3Var) {
        geh gehVar;
        Object obj2;
        int i;
        if (rq3Var instanceof geh) {
            gehVar = (geh) rq3Var;
            int i2 = gehVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gehVar.t = i2 - Integer.MIN_VALUE;
                obj2 = gehVar.r;
                lu3 lu3Var = lu3.a;
                i = gehVar.t;
                boolean z = true;
                if (i != 0) {
                    y6a.M(obj2);
                    gehVar.t = 1;
                    obj2 = this.a.invoke(obj, gehVar);
                    if (obj2 == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    return Boolean.FALSE;
                }
                LinkedHashSet linkedHashSet = this.f;
                mqi mqiVar = this.e;
                if (linkedHashSet != null) {
                    SharedPreferences sharedPreferences = (SharedPreferences) mqiVar.getValue();
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            if (sharedPreferences.contains((String) it.next())) {
                                break;
                            }
                        }
                    }
                    z = false;
                    return Boolean.valueOf(z);
                }
                Map<String, ?> all = ((SharedPreferences) mqiVar.getValue()).getAll();
                all.getClass();
            }
        }
        gehVar = new geh(this, (sq3) rq3Var);
        obj2 = gehVar.r;
        lu3 lu3Var2 = lu3.a;
        i = gehVar.t;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}
