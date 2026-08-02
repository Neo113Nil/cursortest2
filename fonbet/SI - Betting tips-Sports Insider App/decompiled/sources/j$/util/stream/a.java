package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17788b;

    public /* synthetic */ a(int i5, Object obj) {
        this.f17787a = i5;
        this.f17788b = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f17787a) {
            case 0:
                return ((b) this.f17788b).P0(0);
            default:
                return (Spliterator) this.f17788b;
        }
    }
}
