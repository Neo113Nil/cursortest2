package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p1c extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Context j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1c(Context context, int i) {
        super(1);
        this.i = i;
        this.j = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.i) {
            case 0:
                ((Context) obj).getClass();
                return new q1c(this.j, 0);
            case 1:
                ((Context) obj).getClass();
                throw new RuntimeException("Stub!");
            default:
                ((Context) obj).getClass();
                throw new RuntimeException("Stub!");
        }
    }
}
