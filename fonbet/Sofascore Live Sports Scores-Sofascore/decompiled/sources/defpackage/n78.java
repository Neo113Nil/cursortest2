package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class n78 implements Sequence {
    public final Sequence a;
    public final Function1 b;
    public final Function1 c;

    public n78(Sequence sequence, Function1 function1, Function1 function12) {
        sequence.getClass();
        function1.getClass();
        this.a = sequence;
        this.b = function1;
        this.c = function12;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new c38(this);
    }
}
