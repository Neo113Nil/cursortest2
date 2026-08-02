package e1;

import a2.l;
import android.content.Context;
import android.content.SharedPreferences;
import f1.j;
import gf.k;
import gf.t;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ab.b f8460a;

    /* renamed from: b, reason: collision with root package name */
    public final j f8461b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f8462c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8463d;

    /* renamed from: e, reason: collision with root package name */
    public final t f8464e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f8465f;

    public b(Context context, String sharedPreferencesName, Set keysToMigrate, ab.b shouldRunMigration, j migrate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
        l lVar = new l(3, context, sharedPreferencesName);
        this.f8460a = shouldRunMigration;
        this.f8461b = migrate;
        this.f8462c = context;
        this.f8463d = sharedPreferencesName;
        this.f8464e = k.b(lVar);
        this.f8465f = keysToMigrate == c.f8466a ? null : CollectionsKt.Y(keysToMigrate);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (r5.isEmpty() == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, mf.c cVar) {
        a aVar;
        Object obj2;
        int i5;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i10 = aVar.f8459c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f8459c = i10 - Integer.MIN_VALUE;
                obj2 = aVar.f8457a;
                lf.a aVar2 = lf.a.f20034a;
                i5 = aVar.f8459c;
                boolean z5 = true;
                if (i5 != 0) {
                    h8.b.B(obj2);
                    aVar.f8459c = 1;
                    obj2 = this.f8460a.invoke(obj, aVar);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    return Boolean.FALSE;
                }
                t tVar = this.f8464e;
                LinkedHashSet linkedHashSet = this.f8465f;
                if (linkedHashSet != null) {
                    SharedPreferences sharedPreferences = (SharedPreferences) tVar.getValue();
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            if (sharedPreferences.contains((String) it.next())) {
                                break;
                            }
                        }
                    }
                    z5 = false;
                    return Boolean.valueOf(z5);
                }
                Map<String, ?> all = ((SharedPreferences) tVar.getValue()).getAll();
                Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
            }
        }
        aVar = new a(this, cVar);
        obj2 = aVar.f8457a;
        lf.a aVar22 = lf.a.f20034a;
        i5 = aVar.f8459c;
        boolean z52 = true;
        if (i5 != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}
