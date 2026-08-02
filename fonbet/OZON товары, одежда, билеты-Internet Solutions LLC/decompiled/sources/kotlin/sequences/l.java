package kotlin.sequences;

import com.vk.id.internal.auth.app.SilentAuthServicesProvider$getSilentAuthServices$$inlined$sortedByDescending$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C7747g;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class l extends D {
    @NotNull
    public static C A(@NotNull C7747g c7747g, @NotNull SilentAuthServicesProvider$getSilentAuthServices$$inlined$sortedByDescending$1 comparator) {
        Intrinsics.checkNotNullParameter(c7747g, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new C(c7747g, comparator);
    }

    @NotNull
    public static Sequence B(@NotNull Sequence sequence, int i11) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (i11 >= 0) {
            return i11 == 0 ? C7746f.f71907a : sequence instanceof InterfaceC7745e ? ((InterfaceC7745e) sequence).a(i11) : new F(sequence, i11);
        }
        throw new IllegalArgumentException(T7.E.a(i11, "Requested element count ", " is less than zero.").toString());
    }

    @NotNull
    public static List C(@NotNull Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return K.f71697a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return C7714v.a0(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @NotNull
    public static ArrayList D(@NotNull Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        ArrayList destination = new ArrayList();
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator it = sequence.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    @NotNull
    public static Set E(@NotNull Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return M.f71699a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return e0.h(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    @NotNull
    public static C7741a b(@NotNull Iterator it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return c(new p(it));
    }

    @NotNull
    public static C7741a c(@NotNull Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (!(sequence instanceof C7741a)) {
            sequence = new C7741a(sequence);
        }
        return (C7741a) sequence;
    }

    public static int d(@NotNull Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            it.next();
            i11++;
            if (i11 < 0) {
                C7714v.N0();
                throw null;
            }
        }
        return i11;
    }

    @NotNull
    public static Sequence e(@NotNull Sequence sequence, int i11) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (i11 >= 0) {
            return i11 == 0 ? sequence : sequence instanceof InterfaceC7745e ? ((InterfaceC7745e) sequence).drop(i11) : new C7744d(sequence, i11);
        }
        throw new IllegalArgumentException(T7.E.a(i11, "Requested element count ", " is less than zero.").toString());
    }

    public static Object f(@NotNull Sequence sequence, int i11) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        y defaultValue = new y(i11);
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i11 < 0) {
            return defaultValue.invoke(Integer.valueOf(i11));
        }
        int i12 = 0;
        for (Object obj : sequence) {
            int i13 = i12 + 1;
            if (i11 == i12) {
                return obj;
            }
            i12 = i13;
        }
        return defaultValue.invoke(Integer.valueOf(i11));
    }

    @NotNull
    public static Sequence g() {
        return C7746f.f71907a;
    }

    @NotNull
    public static C7747g h(@NotNull Sequence sequence, @NotNull Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new C7747g(sequence, true, predicate);
    }

    @NotNull
    public static C7747g i(@NotNull Sequence sequence, @NotNull Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new C7747g(sequence, false, predicate);
    }

    @NotNull
    public static C7747g j(@NotNull Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return i(sequence, z.f71940b);
    }

    public static Object k(@NotNull C7747g c7747g) {
        Intrinsics.checkNotNullParameter(c7747g, "<this>");
        C7747g.a aVar = new C7747g.a(c7747g);
        if (aVar.hasNext()) {
            return aVar.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static Object l(@NotNull Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @NotNull
    public static C7748h m(@NotNull Sequence sequence, @NotNull Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new C7748h(sequence, transform, B.f71869a);
    }

    @NotNull
    public static C7748h n(@NotNull kotlin.collections.F f7, @NotNull Function1 transform) {
        Intrinsics.checkNotNullParameter(f7, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new C7748h(f7, transform, A.f71868a);
    }

    @NotNull
    public static C7748h o(@NotNull I i11) {
        Intrinsics.checkNotNullParameter(i11, "<this>");
        return i11.d(r.f71934b);
    }

    @NotNull
    public static C7741a p(@NotNull Function0 nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return c(new C7749i(nextFunction, new t(nextFunction)));
    }

    @NotNull
    public static Sequence q(Object obj, @NotNull Function1 nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return obj == null ? C7746f.f71907a : new C7749i(new u(obj), nextFunction);
    }

    @NotNull
    public static Sequence r(@NotNull Function0 seedFunction, @NotNull Function1 nextFunction) {
        Intrinsics.checkNotNullParameter(seedFunction, "seedFunction");
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return new C7749i(seedFunction, nextFunction);
    }

    @NotNull
    public static Iterator s(@NotNull Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        j jVar = new j();
        jVar.h(Wc.b.a(jVar, jVar, block));
        return jVar;
    }

    public static String t(Sequence sequence, String separator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append((CharSequence) "");
        int i11 = 0;
        for (Object obj : sequence) {
            i11++;
            if (i11 > 1) {
                buffer.append((CharSequence) separator);
            }
            kotlin.text.h.p(buffer, obj, null);
        }
        buffer.append((CharSequence) "");
        String sb2 = buffer.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static Object u(@NotNull Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    @NotNull
    public static I v(@NotNull Sequence sequence, @NotNull Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new I(sequence, transform);
    }

    @NotNull
    public static C7747g w(@NotNull Sequence sequence, @NotNull Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return j(new I(sequence, transform));
    }

    @NotNull
    public static C7748h x(@NotNull C7748h c7748h, @NotNull Iterable elements) {
        Intrinsics.checkNotNullParameter(c7748h, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Sequence[] elements2 = {c7748h, C7714v.w(elements)};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return v.a(C7705l.g(elements2));
    }

    @NotNull
    public static C7748h y(@NotNull Sequence sequence, @NotNull C7748h elements) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Sequence[] elements2 = {sequence, elements};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return v.a(C7705l.g(elements2));
    }

    @NotNull
    public static C7748h z(@NotNull I i11, Object obj) {
        Intrinsics.checkNotNullParameter(i11, "<this>");
        Object[] elements = {obj};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Sequence[] elements2 = {i11, C7705l.g(elements)};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return v.a(C7705l.g(elements2));
    }
}
