package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class j7 extends k7 implements Consumer {

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f17944b;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public j7(int i5) {
        this.f17944b = new Object[i5];
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i5 = this.f17955a;
        this.f17955a = i5 + 1;
        this.f17944b[i5] = obj;
    }
}
