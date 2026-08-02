package j$.util;

import j$.util.stream.n5;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class h0 implements IntConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f17733b;

    public /* synthetic */ h0(Consumer consumer, int i5) {
        this.f17732a = i5;
        this.f17733b = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i5) {
        switch (this.f17732a) {
            case 0:
                this.f17733b.accept(Integer.valueOf(i5));
                break;
            default:
                ((n5) this.f17733b).accept(i5);
                break;
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f17732a) {
        }
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }
}
