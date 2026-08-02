package defpackage;

import android.content.SharedPreferences;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sef {
    public final SharedPreferences a;
    public final j0j b;
    public final wve c;
    public final w3b d;

    public sef(SharedPreferences sharedPreferences, j0j j0jVar, wve wveVar, w3b w3bVar) {
        sharedPreferences.getClass();
        j0jVar.getClass();
        wveVar.getClass();
        w3bVar.getClass();
        this.a = sharedPreferences;
        this.b = j0jVar;
        this.c = wveVar;
        this.d = w3bVar;
    }

    public final void a(qef qefVar) {
        int ordinal = qefVar.ordinal();
        SharedPreferences sharedPreferences = this.a;
        if (ordinal == 0) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.getClass();
            edit.putLong("TEAM_LAST_DISMISS_TIMESTAMP", System.currentTimeMillis());
            edit.apply();
            return;
        }
        if (ordinal == 1) {
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.getClass();
            edit2.putLong("PLAYER_LAST_DISMISS_TIMESTAMP", System.currentTimeMillis());
            edit2.apply();
            return;
        }
        if (ordinal != 2) {
            zzl.b();
            return;
        }
        SharedPreferences.Editor edit3 = sharedPreferences.edit();
        edit3.getClass();
        edit3.putLong("LEAGUE_LAST_DISMISS_TIMESTAMP", System.currentTimeMillis());
        edit3.apply();
    }

    public final void b(int i, qef qefVar) {
        String str;
        List split$default;
        qefVar.getClass();
        int ordinal = qefVar.ordinal();
        if (ordinal == 0) {
            str = "TEAM_PROPOSE_FOLLOW_IDS";
        } else if (ordinal == 1) {
            str = "PLAYER_PROPOSE_FOLLOW_IDS";
        } else {
            if (ordinal != 2) {
                zzl.b();
                return;
            }
            str = "LEAGUE_PROPOSE_FOLLOW_IDS";
        }
        SharedPreferences sharedPreferences = this.a;
        String string = sharedPreferences.getString(str, null);
        if (string == null) {
            return;
        }
        split$default = StringsKt__StringsKt.split$default(string, new String[]{BlazeDataSourcePersonalizedType.STRING_SEPARATOR}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        Iterator it = split$default.iterator();
        while (it.hasNext()) {
            Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
            if (intOrNull != null) {
                arrayList.add(intOrNull);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((Number) next).intValue() != i) {
                arrayList2.add(next);
            }
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.getClass();
        edit.putString(str, CollectionsKt.f0(arrayList2, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62));
        edit.apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x01e9, code lost:
    
        if (r2 >= 2) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, qef qefVar, sq3 sq3Var) {
        ref refVar;
        int i2;
        SharedPreferences sharedPreferences;
        int i3;
        Pair pair;
        String str;
        String str2;
        List split$default;
        int i4;
        int i5;
        if (sq3Var instanceof ref) {
            refVar = (ref) sq3Var;
            int i6 = refVar.u;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                refVar.u = i6 - Integer.MIN_VALUE;
                Object obj = refVar.s;
                lu3 lu3Var = lu3.a;
                i2 = refVar.u;
                boolean z = true;
                sharedPreferences = this.a;
                if (i2 != 0) {
                    y6a.M(obj);
                    int ordinal = qefVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                zzl.b();
                                return null;
                            }
                            if (sharedPreferences.getBoolean("LEAGUE_DO_NOT_SHOW_AGAIN", false)) {
                                return Boolean.FALSE;
                            }
                            refVar.r = i;
                            refVar.u = 3;
                            obj = this.d.B(i, refVar);
                            if (obj != lu3Var) {
                                i3 = i;
                                if (!((Boolean) obj).booleanValue()) {
                                }
                            }
                        } else {
                            if (sharedPreferences.getBoolean("PLAYER_DO_NOT_SHOW_AGAIN", false)) {
                                return Boolean.FALSE;
                            }
                            refVar.r = i;
                            refVar.u = 2;
                            obj = this.c.o(i, refVar);
                            if (obj != lu3Var) {
                                i3 = i;
                                if (!((Boolean) obj).booleanValue()) {
                                }
                            }
                        }
                    } else {
                        if (sharedPreferences.getBoolean("TEAM_DO_NOT_SHOW_AGAIN", false)) {
                            return Boolean.FALSE;
                        }
                        refVar.r = i;
                        refVar.u = 1;
                        obj = this.b.y(i, refVar);
                        if (obj != lu3Var) {
                            i3 = i;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    }
                    return lu3Var;
                }
                if (i2 == 1) {
                    i3 = refVar.r;
                    y6a.M(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return Boolean.FALSE;
                    }
                    if (sharedPreferences.getLong("TEAM_LAST_DISMISS_TIMESTAMP", 0L) + 86400000 >= System.currentTimeMillis()) {
                        return Boolean.FALSE;
                    }
                    pair = new Pair(sharedPreferences.getString("TEAM_PROPOSE_FOLLOW_IDS", null), "TEAM_PROPOSE_FOLLOW_IDS");
                } else if (i2 == 2) {
                    i3 = refVar.r;
                    y6a.M(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return Boolean.FALSE;
                    }
                    if (sharedPreferences.getLong("PLAYER_LAST_DISMISS_TIMESTAMP", 0L) + 86400000 >= System.currentTimeMillis()) {
                        return Boolean.FALSE;
                    }
                    pair = new Pair(sharedPreferences.getString("PLAYER_PROPOSE_FOLLOW_IDS", null), "PLAYER_PROPOSE_FOLLOW_IDS");
                } else {
                    if (i2 != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = refVar.r;
                    y6a.M(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return Boolean.FALSE;
                    }
                    if (sharedPreferences.getLong("LEAGUE_LAST_DISMISS_TIMESTAMP", 0L) + 86400000 >= System.currentTimeMillis()) {
                        return Boolean.FALSE;
                    }
                    pair = new Pair(sharedPreferences.getString("LEAGUE_PROPOSE_FOLLOW_IDS", null), "LEAGUE_PROPOSE_FOLLOW_IDS");
                }
                str = (String) pair.a;
                str2 = (String) pair.b;
                if (str == null && str.length() != 0) {
                    split$default = StringsKt__StringsKt.split$default(str, new String[]{BlazeDataSourcePersonalizedType.STRING_SEPARATOR}, false, 0, 6, null);
                    ArrayList arrayList = new ArrayList(k13.r(split$default, 10));
                    Iterator it = split$default.iterator();
                    while (it.hasNext()) {
                        w1l.A(arrayList, Integer.parseInt((String) it.next()));
                    }
                    List M0 = CollectionsKt.M0(19, arrayList);
                    if (M0 == null || !M0.isEmpty()) {
                        Iterator it2 = M0.iterator();
                        i4 = 0;
                        while (it2.hasNext()) {
                            if (((Number) it2.next()).intValue() == i3 && (i4 = i4 + 1) < 0) {
                                b.p();
                                throw null;
                            }
                        }
                    } else {
                        i4 = 0;
                    }
                    if (i4 < 2) {
                        ArrayList U0 = CollectionsKt.U0(M0);
                        U0.add(new Integer(i3));
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.getClass();
                        edit.putString(str2, CollectionsKt.f0(U0, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62));
                        edit.apply();
                        if (U0.isEmpty()) {
                            i5 = 0;
                        } else {
                            Iterator it3 = U0.iterator();
                            i5 = 0;
                            while (it3.hasNext()) {
                                if (((Number) it3.next()).intValue() == i3 && (i5 = i5 + 1) < 0) {
                                    b.p();
                                    throw null;
                                }
                            }
                        }
                    }
                    return Boolean.valueOf(z);
                }
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                edit2.getClass();
                edit2.putString(str2, String.valueOf(i3));
                edit2.apply();
                z = false;
                return Boolean.valueOf(z);
            }
        }
        refVar = new ref(this, sq3Var);
        Object obj2 = refVar.s;
        lu3 lu3Var2 = lu3.a;
        i2 = refVar.u;
        boolean z2 = true;
        sharedPreferences = this.a;
        if (i2 != 0) {
        }
        str = (String) pair.a;
        str2 = (String) pair.b;
        if (str == null) {
        }
        SharedPreferences.Editor edit22 = sharedPreferences.edit();
        edit22.getClass();
        edit22.putString(str2, String.valueOf(i3));
        edit22.apply();
        z2 = false;
        return Boolean.valueOf(z2);
    }
}
