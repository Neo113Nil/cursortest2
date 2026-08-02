package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class hzg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e9i b;

    public /* synthetic */ hzg(e9i e9iVar, int i) {
        this.a = i;
        this.b = e9iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        utc utcVar = utc.a;
        e9i e9iVar = this.b;
        int intValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                return s02.M(utcVar, new s81(e9iVar.a((intValue * 150) + 1000, 500), 6));
            default:
                float a = e9iVar.a((intValue * 300) + 2000, 500);
                return s02.M(utcVar, new n28(14, a, (0.1f * a) + 0.9f));
        }
    }
}
