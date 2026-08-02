package defpackage;

import java.util.function.IntConsumer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class j90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntConsumer b;
    public final /* synthetic */ int c;

    public /* synthetic */ j90(IntConsumer intConsumer, int i, int i2) {
        this.a = i2;
        this.b = intConsumer;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.c;
        IntConsumer intConsumer = this.b;
        switch (i) {
            case 0:
                intConsumer.accept(i2);
                break;
            default:
                intConsumer.accept(i2);
                break;
        }
    }
}
