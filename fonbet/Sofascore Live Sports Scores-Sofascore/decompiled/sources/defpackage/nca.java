package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nca implements Iterator {
    public static final nca a;
    public static final /* synthetic */ nca[] b;

    static {
        nca ncaVar = new nca("INSTANCE", 0);
        a = ncaVar;
        b = new nca[]{ncaVar};
    }

    public static nca valueOf(String str) {
        return (nca) Enum.valueOf(nca.class, str);
    }

    public static nca[] values() {
        return (nca[]) b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        z1a.D("no calls to next() since the last call to remove()", false);
    }
}
