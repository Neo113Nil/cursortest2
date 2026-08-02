package defpackage;

import com.google.android.gms.internal.ads.zzguk;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vio implements Iterator {
    public static final vio a;
    public static final /* synthetic */ vio[] b;

    static {
        vio vioVar = new vio("INSTANCE", 0);
        a = vioVar;
        b = new vio[]{vioVar};
    }

    public static vio[] values() {
        return (vio[]) b.clone();
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
        zzguk.g("no calls to next() since the last call to remove()", false);
    }
}
