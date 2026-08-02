package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class fx4 implements Sequence {
    public final CharSequence a;
    public final int b;
    public final Function2 c;

    public fx4(CharSequence charSequence, int i, Function2 function2) {
        charSequence.getClass();
        this.a = charSequence;
        this.b = i;
        this.c = function2;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new ex4(this);
    }
}
