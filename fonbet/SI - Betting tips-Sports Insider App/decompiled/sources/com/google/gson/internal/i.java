package com.google.gson.internal;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f6326b;

    public /* synthetic */ i(k kVar, int i5) {
        this.f6325a = i5;
        this.f6326b = kVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f6325a) {
            case 0:
                this.f6326b.clear();
                break;
            default:
                this.f6326b.clear();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        j a7;
        switch (this.f6325a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                k kVar = this.f6326b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                j jVar = null;
                if (key != null) {
                    try {
                        a7 = kVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a7 != null && Objects.equals(a7.f6334h, entry.getValue())) {
                        jVar = a7;
                    }
                    return jVar == null;
                }
                a7 = null;
                if (a7 != null) {
                    jVar = a7;
                }
                if (jVar == null) {
                }
            default:
                return this.f6326b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f6325a) {
            case 0:
                return new h(this.f6326b, 0);
            default:
                return new h(this.f6326b, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        j a7;
        switch (this.f6325a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    k kVar = this.f6326b;
                    j jVar = null;
                    if (key != null) {
                        try {
                            a7 = kVar.a(key, false);
                        } catch (ClassCastException unused) {
                        }
                        if (a7 != null && Objects.equals(a7.f6334h, entry.getValue())) {
                            jVar = a7;
                        }
                        if (jVar == null) {
                            kVar.d(jVar, true);
                            break;
                        }
                    }
                    a7 = null;
                    if (a7 != null) {
                        jVar = a7;
                    }
                    if (jVar == null) {
                    }
                }
                break;
            default:
                k kVar2 = this.f6326b;
                j jVar2 = null;
                if (obj != null) {
                    try {
                        jVar2 = kVar2.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (jVar2 != null) {
                    kVar2.d(jVar2, true);
                }
                if (jVar2 != null) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f6325a) {
        }
        return this.f6326b.f6340d;
    }
}
