package defpackage;

import com.google.android.gms.internal.ads.zzgub;
import java.util.AbstractList;
import java.util.ListIterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class yio extends fwj implements ListIterator {
    public final /* synthetic */ int c;
    public final /* synthetic */ AbstractList d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yio(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator, 1);
        this.c = i;
        this.d = abstractList;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.fwj
    public final Object b(Object obj) {
        int i = this.c;
        AbstractList abstractList = this.d;
        switch (i) {
            case 0:
                return ((zzgub) ((aeb) abstractList).c).apply(obj);
            default:
                return ((zzgub) ((beb) abstractList).c).apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b(((ListIterator) this.b).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
