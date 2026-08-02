package defpackage;

import android.os.Bundle;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class k31 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fsf b;

    public /* synthetic */ k31(fsf fsfVar, int i) {
        this.a = i;
        this.b = fsfVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        fsf fsfVar = this.b;
        switch (i) {
            case 0:
                ((o55) obj).getClass();
                return new le(fsfVar, 4);
            case 1:
                String str = (String) obj;
                str.getClass();
                Object obj2 = fsfVar.a;
                boolean z = true;
                if (obj2 != null && ((Bundle) obj2).containsKey(str)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                jyj jyjVar = (jyj) obj;
                jyjVar.getClass();
                era eraVar = ((lyj) jyjVar).o;
                List list = (List) fsfVar.a;
                if (list != null) {
                    list.add(eraVar);
                } else {
                    list = b.l(eraVar);
                }
                fsfVar.a = list;
                return iyj.b;
            default:
                kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) obj;
                bVar.getClass();
                fsfVar.a = bVar;
                return Unit.a;
        }
    }
}
