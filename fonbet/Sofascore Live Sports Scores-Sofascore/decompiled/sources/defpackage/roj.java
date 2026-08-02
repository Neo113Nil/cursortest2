package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class roj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ roj(int i, float f, float f2) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                float f = this.c;
                wv8.v((f4g) obj, this.b, f, f);
                break;
            case 1:
                float f2 = this.c;
                wv8.v((f4g) obj, this.b, f2, f2);
                break;
            default:
                float f3 = this.c;
                wv8.v((f4g) obj, this.b, f3, f3);
                break;
        }
        return Unit.a;
    }
}
