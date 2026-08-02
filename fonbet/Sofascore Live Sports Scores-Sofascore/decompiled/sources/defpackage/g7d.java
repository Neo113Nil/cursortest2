package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class g7d extends s6d implements Iterable, eia {
    public static final /* synthetic */ int h = 0;
    public final gtj g;

    public g7d(j7d j7dVar) {
        super(j7dVar);
        this.g = new gtj(this);
    }

    @Override // defpackage.s6d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g7d) || !super.equals(obj)) {
            return false;
        }
        gtj gtjVar = this.g;
        int e = ((zwh) gtjVar.e).e();
        gtj gtjVar2 = ((g7d) obj).g;
        if (e != ((zwh) gtjVar2.e).e() || gtjVar.b != gtjVar2.b) {
            return false;
        }
        Iterator it = e5h.b(new r4((zwh) gtjVar.e, 3)).iterator();
        while (it.hasNext()) {
            s6d s6dVar = (s6d) it.next();
            if (!s6dVar.equals(gz8.C((zwh) gtjVar2.e, s6dVar.b.b))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.s6d
    public final int hashCode() {
        gtj gtjVar = this.g;
        int i = gtjVar.b;
        zwh zwhVar = (zwh) gtjVar.e;
        int e = zwhVar.e();
        for (int i2 = 0; i2 < e; i2++) {
            i = (((i * 31) + zwhVar.c(i2)) * 31) + ((s6d) zwhVar.f(i2)).hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        gtj gtjVar = this.g;
        gtjVar.getClass();
        return new i7d(gtjVar);
    }

    @Override // defpackage.s6d
    public final r6d n(x6k x6kVar) {
        r6d n = super.n(x6kVar);
        gtj gtjVar = this.g;
        gtjVar.getClass();
        return gtjVar.s(n, x6kVar, false, (g7d) gtjVar.d);
    }

    @Override // defpackage.s6d
    public final void o(Context context, AttributeSet attributeSet) {
        String valueOf;
        context.getClass();
        attributeSet.getClass();
        super.o(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, ckf.d);
        obtainAttributes.getClass();
        int resourceId = obtainAttributes.getResourceId(0, 0);
        gtj gtjVar = this.g;
        g7d g7dVar = (g7d) gtjVar.d;
        if (resourceId != g7dVar.b.b) {
            if (((String) gtjVar.c) != null) {
                gtjVar.A(null);
            }
            gtjVar.b = resourceId;
            gtjVar.f = null;
        } else {
            i3c.h(resourceId, " cannot use the same id as the graph ", g7dVar, "Start destination ");
        }
        int i = gtjVar.b;
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
        gtjVar.f = valueOf;
        Unit unit = Unit.a;
        obtainAttributes.recycle();
    }

    public final r6d r(x6k x6kVar, s6d s6dVar) {
        s6dVar.getClass();
        return this.g.s(super.n(x6kVar), x6kVar, true, s6dVar);
    }

    public final r6d s(String str, boolean z, s6d s6dVar) {
        r6d r6dVar;
        s6dVar.getClass();
        gtj gtjVar = this.g;
        gtjVar.getClass();
        g7d g7dVar = (g7d) gtjVar.d;
        r6d a = g7dVar.b.a(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = g7dVar.iterator();
        while (true) {
            i7d i7dVar = (i7d) it;
            r6dVar = null;
            if (!i7dVar.hasNext()) {
                break;
            }
            s6d s6dVar2 = (s6d) i7dVar.next();
            if (!Intrinsics.c(s6dVar2, s6dVar)) {
                if (s6dVar2 instanceof g7d) {
                    r6dVar = ((g7d) s6dVar2).s(str, false, g7dVar);
                } else {
                    s6dVar2.getClass();
                    r6dVar = s6dVar2.b.a(str);
                }
            }
            if (r6dVar != null) {
                arrayList.add(r6dVar);
            }
        }
        r6d r6dVar2 = (r6d) CollectionsKt.k0(arrayList);
        g7d g7dVar2 = g7dVar.c;
        if (g7dVar2 != null && z && !g7dVar2.equals(s6dVar)) {
            r6dVar = g7dVar2.s(str, true, g7dVar);
        }
        return (r6d) CollectionsKt.k0(ph0.x(new r6d[]{a, r6dVar2, r6dVar}));
    }

    @Override // defpackage.s6d
    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        gtj gtjVar = this.g;
        String str = (String) gtjVar.c;
        gtjVar.getClass();
        s6d k = (str == null || StringsKt.R(str)) ? null : gtjVar.k(str, true);
        if (k == null) {
            k = gtjVar.h(gtjVar.b);
        }
        sb.append(" startDestination=");
        if (k == null) {
            String str2 = (String) gtjVar.c;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = (String) gtjVar.f;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(gtjVar.b));
                }
            }
        } else {
            sb.append("{");
            sb.append(k.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
