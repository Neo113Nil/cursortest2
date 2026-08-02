package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class e5h extends c5h {
    public static ml3 b(Iterator it) {
        it.getClass();
        return new ml3(new oh0(it, 4));
    }

    public static final n78 c(Sequence sequence) {
        sequence.getClass();
        z1h z1hVar = new z1h(3);
        if (!(sequence instanceof lwj)) {
            return new n78(sequence, new gfg(11), z1hVar);
        }
        lwj lwjVar = (lwj) sequence;
        return new n78(lwjVar.a, lwjVar.b, z1hVar);
    }

    public static ml3 d(Function0 function0) {
        return new ml3(new a65(function0, new ma0(18, function0)));
    }

    public static Sequence e(Object obj, Function1 function1) {
        function1.getClass();
        return obj == null ? qm5.a : new a65(new e6g(obj, 14), function1);
    }
}
