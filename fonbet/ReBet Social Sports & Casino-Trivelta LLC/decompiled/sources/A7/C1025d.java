package A7;

import java.util.LinkedHashSet;

/* renamed from: A7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1025d {

    /* renamed from: a, reason: collision with root package name */
    public final int f208a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f209b;

    public C1025d(int i10) {
        this.f208a = i10;
        this.f209b = new LinkedHashSet(i10);
    }

    public final synchronized boolean a(Object obj) {
        try {
            if (this.f209b.size() == this.f208a) {
                LinkedHashSet linkedHashSet = this.f209b;
                linkedHashSet.remove(linkedHashSet.iterator().next());
            }
            this.f209b.remove(obj);
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f209b.add(obj);
    }

    public final synchronized boolean b(Object obj) {
        return this.f209b.contains(obj);
    }
}
