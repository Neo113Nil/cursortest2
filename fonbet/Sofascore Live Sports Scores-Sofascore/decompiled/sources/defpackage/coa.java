package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class coa extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Context j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ coa(Context context, String str, int i) {
        super(0);
        this.i = i;
        this.j = context;
        this.k = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        String str = this.k;
        Context context = this.j;
        switch (i) {
            case 0:
                return gvd.v(context, str);
            default:
                return b6a.y(context, str);
        }
    }
}
