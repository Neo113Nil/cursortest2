package m10;

import androidx.recyclerview.widget.i;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class k extends i.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ArrayList f74055a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList f74056b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j<Object> f74057c;

    k(ArrayList arrayList, ArrayList arrayList2, j jVar) {
        this.f74055a = arrayList;
        this.f74056b = arrayList2;
        this.f74057c = jVar;
    }

    @Override // androidx.recyclerview.widget.i.b
    public final boolean areContentsTheSame(int i11, int i12) {
        i.d dVar;
        Object obj = this.f74055a.get(i11);
        Object obj2 = this.f74056b.get(i12);
        dVar = ((j) this.f74057c).f74045a;
        return dVar.areContentsTheSame(obj, obj2);
    }

    @Override // androidx.recyclerview.widget.i.b
    public final boolean areItemsTheSame(int i11, int i12) {
        i.d dVar;
        Object obj = this.f74055a.get(i11);
        Object obj2 = this.f74056b.get(i12);
        dVar = ((j) this.f74057c).f74045a;
        return dVar.areItemsTheSame(obj, obj2);
    }

    @Override // androidx.recyclerview.widget.i.b
    public final Object getChangePayload(int i11, int i12) {
        i.d dVar;
        Object obj = this.f74055a.get(i11);
        Object obj2 = this.f74056b.get(i12);
        dVar = ((j) this.f74057c).f74045a;
        return dVar.getChangePayload(obj, obj2);
    }

    @Override // androidx.recyclerview.widget.i.b
    public final int getNewListSize() {
        return this.f74056b.size();
    }

    @Override // androidx.recyclerview.widget.i.b
    public final int getOldListSize() {
        return this.f74055a.size();
    }
}
