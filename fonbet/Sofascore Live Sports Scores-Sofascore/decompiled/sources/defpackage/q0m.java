package defpackage;

import com.blaze.blazesdk.logger.local.BlazeLogLocal;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q0m implements Callable {
    public final /* synthetic */ BlazeLogLocal[] a;
    public final /* synthetic */ bam b;

    public q0m(bam bamVar, BlazeLogLocal[] blazeLogLocalArr) {
        this.b = bamVar;
        this.a = blazeLogLocalArr;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        bam bamVar = this.b;
        k6g k6gVar = bamVar.a;
        k6g k6gVar2 = bamVar.a;
        k6gVar.beginTransaction();
        try {
            xbb B = bamVar.b.B(this.a);
            k6gVar2.setTransactionSuccessful();
            return B;
        } finally {
            k6gVar2.endTransaction();
        }
    }
}
