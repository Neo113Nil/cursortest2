package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class zv4 implements Iterator, eia {
    public final /* synthetic */ int a;
    public Iterator b;
    public final Object c;

    public zv4(aw4 aw4Var) {
        this.a = 0;
        this.c = aw4Var;
        this.b = aw4Var.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((aw4) obj).b.invoke(this.b.next());
            case 1:
                return ((lwj) obj).b.invoke(this.b.next());
            default:
                Object next = this.b.next();
                ArrayList arrayList = (ArrayList) obj;
                View view = (View) next;
                view.getClass();
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                usk B = viewGroup != null ? wca.B(viewGroup) : null;
                if (B == null || !B.hasNext()) {
                    while (!this.b.hasNext() && !arrayList.isEmpty()) {
                        this.b = (Iterator) CollectionsKt.h0(arrayList);
                        o13.D(arrayList);
                    }
                } else {
                    arrayList.add(this.b);
                    this.b = B;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                this.b.remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public zv4(usk uskVar) {
        this.a = 2;
        this.c = new ArrayList();
        this.b = uskVar;
    }

    public zv4(lwj lwjVar) {
        this.a = 1;
        this.c = lwjVar;
        this.b = lwjVar.a.iterator();
    }
}
