package v;

import androidx.concurrent.futures.b;

/* renamed from: v.e1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C10093e1 implements b.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C10131r1 f101251a;

    public /* synthetic */ C10093e1(C10131r1 c10131r1) {
        this.f101251a = c10131r1;
    }

    @Override // androidx.concurrent.futures.b.c
    public final Object c(final b.a aVar) {
        final C10131r1 c10131r1 = this.f101251a;
        c10131r1.getClass();
        c10131r1.f101318b.execute(new Runnable() { // from class: v.i1
            @Override // java.lang.Runnable
            public final void run() {
                C10131r1.this.o(aVar);
            }
        });
        return "triggerAePrecapture";
    }
}
