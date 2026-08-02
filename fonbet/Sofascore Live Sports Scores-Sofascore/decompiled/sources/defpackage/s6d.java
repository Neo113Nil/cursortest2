package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class s6d {
    public static final /* synthetic */ int f = 0;
    public final String a;
    public final i3d b;
    public g7d c;
    public CharSequence d;
    public final zwh e;

    static {
        new LinkedHashMap();
    }

    public s6d(y8d y8dVar) {
        y8dVar.getClass();
        LinkedHashMap linkedHashMap = z8d.b;
        this.a = haa.o(y8dVar.getClass());
        this.b = new i3d(this);
        this.e = new zwh(0);
    }

    public final void a(p6d p6dVar) {
        p6dVar.getClass();
        i3d i3dVar = this.b;
        i3dVar.getClass();
        ArrayList D = i2a.D((LinkedHashMap) i3dVar.f, new u6d(p6dVar, 0));
        if (D.isEmpty()) {
            ((ArrayList) i3dVar.e).add(p6dVar);
        } else {
            i3c.l("Deep link ", p6dVar.a, " can't be used to open destination ", (s6d) i3dVar.c, ".\nFollowing required arguments are missing: ", D);
        }
    }

    public final Bundle c(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b.f;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        lm5.a.getClass();
        Bundle E = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            a6d a6dVar = (a6d) entry.getValue();
            a6dVar.getClass();
            str.getClass();
            if (a6dVar.c && (obj = a6dVar.e) != null) {
                a6dVar.a.e(E, str, obj);
            }
        }
        if (bundle != null) {
            E.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                a6d a6dVar2 = (a6d) entry2.getValue();
                boolean z = a6dVar2.d;
                b8d b8dVar = a6dVar2.a;
                if (!z) {
                    str2.getClass();
                    if (a6dVar2.b || !E.containsKey(str2) || !o3a.I(E, str2)) {
                        try {
                            b8dVar.a(E, str2);
                        } catch (IllegalStateException unused) {
                        }
                    }
                    i3c.o(wt3.q("Wrong argument type for '", str2, "' in argument savedState. "), b8dVar.b(), " expected.");
                    return null;
                }
            }
        }
        return E;
    }

    public final int[] d(s6d s6dVar) {
        vg0 vg0Var = new vg0();
        while (true) {
            i3d i3dVar = this.b;
            g7d g7dVar = this.c;
            if ((s6dVar != null ? s6dVar.c : null) != null) {
                g7d g7dVar2 = s6dVar.c;
                g7dVar2.getClass();
                if (g7dVar2.g.h(i3dVar.b) == this) {
                    vg0Var.addFirst(this);
                    break;
                }
            }
            if (g7dVar == null || g7dVar.g.b != i3dVar.b) {
                vg0Var.addFirst(this);
            }
            if (Intrinsics.c(g7dVar, s6dVar) || g7dVar == null) {
                break;
            }
            this = g7dVar;
        }
        List S0 = CollectionsKt.S0(vg0Var);
        ArrayList arrayList = new ArrayList(k13.r(S0, 10));
        Iterator it = S0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((s6d) it.next()).b.b));
        }
        return CollectionsKt.R0(arrayList);
    }

    public final y5d e(int i) {
        y5d y5dVar;
        zwh zwhVar = this.e;
        if (zwhVar.e() == 0) {
            y5dVar = null;
        } else {
            zwhVar.getClass();
            y5dVar = (y5d) gz8.C(zwhVar, i);
        }
        if (y5dVar != null) {
            return y5dVar;
        }
        g7d g7dVar = this.c;
        if (g7dVar != null) {
            return g7dVar.e(i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof s6d)) {
                i3d i3dVar = this.b;
                ArrayList arrayList = (ArrayList) i3dVar.e;
                s6d s6dVar = (s6d) obj;
                zwh zwhVar = s6dVar.e;
                i3d i3dVar2 = s6dVar.b;
                boolean equals = arrayList.equals((ArrayList) i3dVar2.e);
                zwh zwhVar2 = this.e;
                if (zwhVar2.e() == zwhVar.e()) {
                    Iterator it = e5h.b(new axh(zwhVar2)).iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (!Intrinsics.c(gz8.C(zwhVar2, intValue), gz8.C(zwhVar, intValue))) {
                        }
                    }
                    z = true;
                    if (m().size() == s6dVar.m().size()) {
                        for (Map.Entry entry : (Iterable) CollectionsKt.N(m().entrySet()).b) {
                            if (s6dVar.m().containsKey(entry.getKey()) && Intrinsics.c(s6dVar.m().get(entry.getKey()), entry.getValue())) {
                            }
                        }
                        z2 = true;
                        if (i3dVar.b == i3dVar2.b || !Intrinsics.c((String) i3dVar.g, (String) i3dVar2.g) || !equals || !z || !z2) {
                        }
                    }
                    z2 = false;
                    if (i3dVar.b == i3dVar2.b) {
                    }
                }
                z = false;
                if (m().size() == s6dVar.m().size()) {
                }
                z2 = false;
                if (i3dVar.b == i3dVar2.b) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        i3d i3dVar = this.b;
        int i = i3dVar.b * 31;
        String str = (String) i3dVar.g;
        int hashCode = i + (str != null ? str.hashCode() : 0);
        Iterator it = ((ArrayList) i3dVar.e).iterator();
        while (it.hasNext()) {
            p6d p6dVar = (p6d) it.next();
            int i2 = hashCode * 31;
            String str2 = p6dVar.a;
            int hashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = p6dVar.b;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = p6dVar.c;
            hashCode = hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        zwh zwhVar = this.e;
        zwhVar.getClass();
        int i3 = 0;
        while (true) {
            if (!(i3 < zwhVar.e())) {
                break;
            }
            int i4 = i3 + 1;
            y5d y5dVar = (y5d) zwhVar.f(i3);
            int i5 = ((hashCode * 31) + y5dVar.a) * 31;
            u7d u7dVar = y5dVar.b;
            hashCode = i5 + (u7dVar != null ? u7dVar.hashCode() : 0);
            Bundle bundle = y5dVar.c;
            if (bundle != null) {
                hashCode = l4a.m(bundle) + (hashCode * 31);
            }
            i3 = i4;
        }
        for (String str5 : m().keySet()) {
            int c = dmi.c(hashCode * 31, 31, str5);
            Object obj = m().get(str5);
            hashCode = c + (obj != null ? obj.hashCode() : 0);
        }
        return hashCode;
    }

    public final Map m() {
        return tub.p((LinkedHashMap) this.b.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r6d n(x6k x6kVar) {
        boolean z;
        boolean f2;
        boolean f3;
        int i;
        r6d r6dVar;
        Regex regex;
        txb e;
        List list;
        int i2;
        List list2;
        i3d i3dVar = this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) i3dVar.f;
        Uri uri = (Uri) x6kVar.b;
        ArrayList arrayList = (ArrayList) i3dVar.e;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        r6d r6dVar2 = null;
        while (it.hasNext()) {
            p6d p6dVar = (p6d) it.next();
            String str = (String) x6kVar.d;
            String str2 = (String) x6kVar.c;
            p6dVar.getClass();
            mqi mqiVar = p6dVar.o;
            mqi mqiVar2 = p6dVar.f;
            String str3 = p6dVar.c;
            String str4 = p6dVar.b;
            if (((Regex) mqiVar2.getValue()) == null) {
                f2 = true;
            } else if (uri == null) {
                f2 = false;
            } else {
                Regex regex2 = (Regex) mqiVar2.getValue();
                regex2.getClass();
                z = true;
                f2 = regex2.f(uri.toString());
                if (f2) {
                    if (str4 == null ? z : str2 == null ? false : str4.equals(str2)) {
                        if (str3 == null) {
                            f3 = z;
                        } else if (str == null) {
                            f3 = false;
                        } else {
                            Regex regex3 = (Regex) mqiVar.getValue();
                            regex3.getClass();
                            f3 = regex3.f(str);
                        }
                        if (f3) {
                            Bundle d = uri != null ? p6dVar.d(uri, linkedHashMap) : null;
                            int b = p6dVar.b(uri);
                            boolean z2 = (str2 == null || !str2.equals(str4)) ? false : z;
                            if (str != null && str3 != null) {
                                Regex regex4 = (Regex) mqiVar.getValue();
                                regex4.getClass();
                                if (regex4.f(str)) {
                                    List h = new Regex("/").h(str3);
                                    if (!h.isEmpty()) {
                                        ListIterator listIterator = h.listIterator(h.size());
                                        while (listIterator.hasPrevious()) {
                                            if (((String) listIterator.previous()).length() != 0) {
                                                list = CollectionsKt.L0(h, listIterator.nextIndex() + 1);
                                                break;
                                            }
                                        }
                                    }
                                    list = km5.a;
                                    String str5 = (String) list.get(0);
                                    String str6 = (String) list.get(z ? 1 : 0);
                                    List h2 = new Regex("/").h(str);
                                    if (!h2.isEmpty()) {
                                        ListIterator listIterator2 = h2.listIterator(h2.size());
                                        while (listIterator2.hasPrevious()) {
                                            if (((String) listIterator2.previous()).length() != 0) {
                                                i2 = 1;
                                                list2 = CollectionsKt.L0(h2, listIterator2.nextIndex() + 1);
                                                break;
                                            }
                                        }
                                    }
                                    i2 = 1;
                                    list2 = km5.a;
                                    String str7 = (String) list2.get(0);
                                    String str8 = (String) list2.get(i2);
                                    i = Intrinsics.c(str5, str7) ? 2 : 0;
                                    if (Intrinsics.c(str6, str8)) {
                                        i++;
                                    }
                                    if (d == null) {
                                        if (z2 || i > -1) {
                                            lm5.a.getClass();
                                            Bundle E = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
                                            if (uri != null && (regex = (Regex) mqiVar2.getValue()) != null && (e = regex.e(uri.toString())) != null) {
                                                p6dVar.e(e, E, linkedHashMap);
                                                if (((Boolean) p6dVar.g.getValue()).booleanValue()) {
                                                    p6dVar.f(uri, E, linkedHashMap);
                                                }
                                            }
                                            if (!i2a.D(linkedHashMap, new e0c(2, E)).isEmpty()) {
                                            }
                                        }
                                    }
                                    r6dVar = new r6d((s6d) i3dVar.c, d, p6dVar.p, b, z2, i);
                                    if (r6dVar2 != null || r6dVar.compareTo(r6dVar2) > 0) {
                                        r6dVar2 = r6dVar;
                                    }
                                }
                            }
                            i = -1;
                            if (d == null) {
                            }
                            r6dVar = new r6d((s6d) i3dVar.c, d, p6dVar.p, b, z2, i);
                            if (r6dVar2 != null) {
                            }
                            r6dVar2 = r6dVar;
                        }
                    }
                }
            }
            z = true;
            if (f2) {
            }
        }
        return r6dVar2;
    }

    public void o(Context context, AttributeSet attributeSet) {
        String valueOf;
        context.getClass();
        attributeSet.getClass();
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, ckf.e);
        obtainAttributes.getClass();
        q(obtainAttributes.getString(2));
        if (obtainAttributes.hasValue(1)) {
            int resourceId = obtainAttributes.getResourceId(1, 0);
            i3d i3dVar = this.b;
            i3dVar.b = resourceId;
            i3dVar.d = null;
            int i = i3dVar.b;
            if (i <= 16777215) {
                valueOf = String.valueOf(i);
            } else {
                try {
                    valueOf = context.getResources().getResourceName(i);
                    valueOf.getClass();
                } catch (Resources.NotFoundException unused) {
                    valueOf = String.valueOf(i);
                }
            }
            i3dVar.d = valueOf;
        }
        this.d = obtainAttributes.getText(0);
        Unit unit = Unit.a;
        obtainAttributes.recycle();
    }

    public final void p(int i, y5d y5dVar) {
        y5dVar.getClass();
        if (!(this instanceof qd)) {
            if (i != 0) {
                this.e.d(i, y5dVar);
                return;
            } else {
                a70.p("Cannot have an action with actionId 0");
                return;
            }
        }
        throw new UnsupportedOperationException("Cannot add action " + i + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    public final void q(String str) {
        i3d i3dVar = this.b;
        if (str == null) {
            i3dVar.b = 0;
            i3dVar.d = null;
        } else {
            i3dVar.getClass();
            if (StringsKt.R(str)) {
                a70.p("Cannot have an empty route");
                return;
            }
            String concat = "android-app://androidx.navigation/".concat(str);
            int i = 1;
            ArrayList D = i2a.D((LinkedHashMap) i3dVar.f, new u6d(new p6d(concat, null, null), i));
            if (!D.isEmpty()) {
                StringBuilder q = wt3.q("Cannot set route \"", str, "\" for destination ");
                q.append((s6d) i3dVar.c);
                q.append(". Following required arguments are missing: ");
                q.append(D);
                throw new IllegalArgumentException(q.toString().toString());
            }
            i3dVar.h = ypa.b(new o40(concat, i));
            i3dVar.b = concat.hashCode();
            i3dVar.d = null;
        }
        i3dVar.g = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("(");
        i3d i3dVar = this.b;
        String str = (String) i3dVar.d;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(i3dVar.b));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = (String) i3dVar.g;
        if (str2 != null && !StringsKt.R(str2)) {
            sb.append(" route=");
            sb.append((String) i3dVar.g);
        }
        if (this.d != null) {
            sb.append(" label=");
            sb.append(this.d);
        }
        return sb.toString();
    }
}
