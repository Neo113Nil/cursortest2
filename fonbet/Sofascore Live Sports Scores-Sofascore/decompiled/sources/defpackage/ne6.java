package defpackage;

import com.google.gson.Gson;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ne6 implements v4k, Cloneable {
    public static final ne6 g;
    public double a;
    public int b;
    public boolean c;
    public boolean d;
    public List e;
    public List f;

    static {
        ne6 ne6Var = new ne6();
        ne6Var.a = -1.0d;
        ne6Var.b = Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
        ne6Var.c = true;
        List list = Collections.EMPTY_LIST;
        ne6Var.e = list;
        ne6Var.f = list;
        g = ne6Var;
    }

    public static boolean e(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || (cls.getModifiers() & 8) != 0) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    @Override // defpackage.v4k
    public final u4k a(Gson gson, u5k u5kVar) {
        boolean z;
        boolean z2;
        boolean c = c(u5kVar.a);
        if (c) {
            z = true;
        } else {
            d(true);
            z = false;
        }
        if (c) {
            z2 = true;
        } else {
            d(false);
            z2 = false;
        }
        if (z || z2) {
            return new me6(this, z2, z, gson, u5kVar);
        }
        return null;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ne6 clone() {
        try {
            return (ne6) super.clone();
        } catch (CloneNotSupportedException e) {
            a70.j(e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r7.a < r2.value()) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r7.a >= r0.value()) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Class cls) {
        if (this.a != -1.0d) {
            shh shhVar = (shh) cls.getAnnotation(shh.class);
            ddk ddkVar = (ddk) cls.getAnnotation(ddk.class);
            if (shhVar != null) {
            }
            if (ddkVar != null) {
            }
        }
        if (!this.c && cls.isMemberClass() && (cls.getModifiers() & 8) == 0) {
            return true;
        }
        return e(cls);
    }

    public final void d(boolean z) {
        Iterator it = (z ? this.e : this.f).iterator();
        if (it.hasNext()) {
            throw lnb.i(it);
        }
    }

    public final ne6 f(boolean z, boolean z2) {
        ne6 clone = clone();
        if (z) {
            ArrayList arrayList = new ArrayList(this.e);
            clone.e = arrayList;
            arrayList.add(null);
        }
        if (z2) {
            ArrayList arrayList2 = new ArrayList(this.f);
            clone.f = arrayList2;
            arrayList2.add(null);
        }
        return clone;
    }
}
