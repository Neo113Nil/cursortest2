package defpackage;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.c0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class pth implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;

    public /* synthetic */ pth(float f, long j, long j2, int i) {
        this.b = f;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(this.e | 1);
                r4a.a(this.b, K, this.c, this.d, (of3) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                int i = this.e | 1;
                c0.b(this.b, i, this.c, this.d, (of3) obj);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ pth(long j, long j2, float f, int i) {
        this.c = j;
        this.d = j2;
        this.b = f;
        this.e = i;
    }
}
