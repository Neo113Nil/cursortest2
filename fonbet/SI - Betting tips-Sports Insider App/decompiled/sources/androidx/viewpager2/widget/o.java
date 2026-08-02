package androidx.viewpager2.widget;

import androidx.recyclerview.widget.RecyclerView;
import e6.p;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2911a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2912b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2913c;

    public /* synthetic */ o(int i5, int i10, Object obj) {
        this.f2911a = i10;
        this.f2912b = i5;
        this.f2913c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2911a) {
            case 0:
                ((RecyclerView) this.f2913c).smoothScrollToPosition(this.f2912b);
                break;
            case 1:
                ((p) this.f2913c).c(this.f2912b);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) this.f2913c;
                int size = arrayList.size();
                int i5 = 0;
                if (this.f2912b == 1) {
                    while (i5 < size) {
                        ((j1.h) arrayList.get(i5)).b();
                        i5++;
                    }
                    break;
                } else {
                    while (i5 < size) {
                        ((j1.h) arrayList.get(i5)).a();
                        i5++;
                    }
                    break;
                }
            default:
                f0.j jVar = (f0.j) ((h9.c) this.f2913c).f10430b;
                if (jVar != null) {
                    jVar.onFontRetrievalFailed(this.f2912b);
                    break;
                }
                break;
        }
    }

    public o(int i5, m mVar) {
        this.f2911a = 0;
        this.f2912b = i5;
        this.f2913c = mVar;
    }

    public o(List list, int i5, Throwable th2) {
        this.f2911a = 2;
        rh.g.e(list, "initCallbacks cannot be null");
        this.f2913c = new ArrayList(list);
        this.f2912b = i5;
    }
}
