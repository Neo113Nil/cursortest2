package oi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: oi.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5906b implements J, Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final List f61287a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f61288b;

    public AbstractC5906b(boolean z10, w... wVarArr) {
        this(Arrays.asList(wVarArr), z10);
    }

    @Override // java.util.Comparator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(w wVar, w wVar2) {
        return Double.compare(wVar2.getLength(), wVar.getLength());
    }

    public AbstractC5906b(List list, boolean z10) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Missing units.");
        }
        Collections.sort(list, this);
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            w wVar = (w) list.get(i10);
            i10++;
            for (int i11 = i10; i11 < size; i11++) {
                if (wVar.equals(list.get(i11))) {
                    throw new IllegalArgumentException("Duplicate unit: " + wVar);
                }
            }
        }
        this.f61287a = Collections.unmodifiableList(list);
        this.f61288b = z10;
    }
}
