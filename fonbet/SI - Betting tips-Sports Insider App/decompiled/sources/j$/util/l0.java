package j$.util;

import j$.util.stream.n5;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class l0 implements LongConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17754a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f17755b;

    public /* synthetic */ l0(Consumer consumer, int i5) {
        this.f17754a = i5;
        this.f17755b = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        switch (this.f17754a) {
            case 0:
                this.f17755b.accept(Long.valueOf(j));
                break;
            default:
                ((n5) this.f17755b).accept(j);
                break;
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f17754a) {
        }
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }
}
