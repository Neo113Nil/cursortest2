package defpackage;

import com.google.android.gms.internal.pal.zzzr;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mfp extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzzr b;

    public /* synthetic */ mfp(zzzr zzzrVar, int i) {
        this.a = i;
        this.b = zzzrVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        zzzr zzzrVar = this.b;
        switch (i) {
            case 0:
                zzzrVar.clear();
                break;
            default:
                zzzrVar.clear();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0035 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        xfp a;
        Object obj2;
        Object value;
        int i = this.a;
        zzzr zzzrVar = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                xfp xfpVar = null;
                if (key != null) {
                    try {
                        a = zzzrVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a != null && ((obj2 = a.g) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                        xfpVar = a;
                    }
                    return xfpVar == null;
                }
                a = null;
                if (a != null) {
                    xfpVar = a;
                }
                if (xfpVar == null) {
                }
            default:
                return zzzrVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        zzzr zzzrVar = this.b;
        switch (i) {
            case 0:
                return new kfp(zzzrVar, 0);
            default:
                return new kfp(zzzrVar, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        xfp a;
        Object obj2;
        Object value;
        int i = this.a;
        xfp xfpVar = null;
        zzzr zzzrVar = this.b;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    if (key != null) {
                        try {
                            a = zzzrVar.a(key, false);
                        } catch (ClassCastException unused) {
                        }
                        if (a != null && ((obj2 = a.g) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                            xfpVar = a;
                        }
                        if (xfpVar == null) {
                            zzzrVar.c(xfpVar, true);
                            break;
                        }
                    }
                    a = null;
                    if (a != null) {
                        xfpVar = a;
                    }
                    if (xfpVar == null) {
                    }
                }
                break;
            default:
                if (obj != null) {
                    try {
                        xfpVar = zzzrVar.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (xfpVar != null) {
                    zzzrVar.c(xfpVar, true);
                }
                if (xfpVar != null) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        zzzr zzzrVar = this.b;
        switch (i) {
        }
        return zzzrVar.c;
    }
}
