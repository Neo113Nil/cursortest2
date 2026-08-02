package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kbb extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ nbb b;

    public /* synthetic */ kbb(nbb nbbVar, int i) {
        this.a = i;
        this.b = nbbVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        nbb nbbVar = this.b;
        switch (i) {
            case 0:
                nbbVar.clear();
                break;
            default:
                nbbVar.clear();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        mbb a;
        int i = this.a;
        nbb nbbVar = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                mbb mbbVar = null;
                if (key != null) {
                    try {
                        a = nbbVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a != null && Objects.equals(a.d, entry.getValue())) {
                        mbbVar = a;
                    }
                    return mbbVar == null;
                }
                a = null;
                if (a != null) {
                    mbbVar = a;
                }
                if (mbbVar == null) {
                }
            default:
                return nbbVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        nbb nbbVar = this.b;
        switch (i) {
            case 0:
                return new jbb(nbbVar, 0);
            default:
                return new jbb(nbbVar, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        mbb a;
        int i = this.a;
        mbb mbbVar = null;
        nbb nbbVar = this.b;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    if (key != null) {
                        try {
                            a = nbbVar.a(key, false);
                        } catch (ClassCastException unused) {
                        }
                        if (a != null && Objects.equals(a.d, entry.getValue())) {
                            mbbVar = a;
                        }
                        if (mbbVar == null) {
                            nbbVar.d(mbbVar, true);
                            break;
                        }
                    }
                    a = null;
                    if (a != null) {
                        mbbVar = a;
                    }
                    if (mbbVar == null) {
                    }
                }
                break;
            default:
                if (obj != null) {
                    try {
                        mbbVar = nbbVar.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (mbbVar != null) {
                    nbbVar.d(mbbVar, true);
                }
                if (mbbVar != null) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        nbb nbbVar = this.b;
        switch (i) {
        }
        return nbbVar.d;
    }
}
