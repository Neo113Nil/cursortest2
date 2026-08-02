package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class a65 implements Sequence {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public a65(Sequence sequence, Function1 function1) {
        this.a = 3;
        sequence.getClass();
        function1.getClass();
        this.b = sequence;
        this.c = function1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return new z55(((Sequence) obj2).iterator(), (gfg) obj);
            case 1:
                return new kw8(this);
            case 2:
                ArrayList r = i5h.r((Sequence) obj2);
                n13.u((Comparator) obj, r);
                return r.iterator();
            default:
                return new c38(this);
        }
    }

    public /* synthetic */ a65(Sequence sequence, Object obj, int i) {
        this.a = i;
        this.b = sequence;
        this.c = obj;
    }

    public a65(Function0 function0, Function1 function1) {
        this.a = 1;
        function1.getClass();
        this.b = function0;
        this.c = function1;
    }
}
