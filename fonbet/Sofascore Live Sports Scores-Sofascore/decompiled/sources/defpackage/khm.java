package defpackage;

import com.inmobi.media.AbstractC3587m1;
import com.inmobi.media.C3484i1;
import com.inmobi.media.C3535k1;
import com.inmobi.media.EnumC3489i6;
import com.inmobi.media.W;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class khm implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractC3587m1 b;

    public /* synthetic */ khm(AbstractC3587m1 abstractC3587m1, int i) {
        this.a = i;
        this.b = abstractC3587m1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        AbstractC3587m1 abstractC3587m1 = this.b;
        switch (i) {
            case 0:
                return C3484i1.a(abstractC3587m1, (W) obj);
            case 1:
                return C3535k1.a(abstractC3587m1, (W) obj);
            default:
                return AbstractC3587m1.a(abstractC3587m1, (EnumC3489i6) obj);
        }
    }
}
