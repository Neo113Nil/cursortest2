package j$.util;

import j$.util.stream.n5;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class d0 implements DoubleConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17700a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f17701b;

    public /* synthetic */ d0(Consumer consumer, int i5) {
        this.f17700a = i5;
        this.f17701b = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        switch (this.f17700a) {
            case 0:
                this.f17701b.accept(Double.valueOf(d10));
                break;
            default:
                ((n5) this.f17701b).accept(d10);
                break;
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f17700a) {
        }
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }
}
