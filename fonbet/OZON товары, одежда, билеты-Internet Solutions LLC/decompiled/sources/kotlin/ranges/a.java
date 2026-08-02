package kotlin.ranges;

import gd.InterfaceC6712a;
import java.util.Iterator;
import kd.C7662a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/ranges/a;", "", "", "d", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public class a implements Iterable<Character>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    private final char f71833a;

    /* renamed from: b, reason: collision with root package name */
    private final char f71834b;

    /* renamed from: c, reason: collision with root package name */
    private final int f71835c = 1;

    public a(char c11, char c12) {
        this.f71833a = c11;
        this.f71834b = (char) S8.b.b(c11, c12, 1);
    }

    /* renamed from: h, reason: from getter */
    public final char getF71833a() {
        return this.f71833a;
    }

    /* renamed from: i, reason: from getter */
    public final char getF71834b() {
        return this.f71834b;
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new C7662a(this.f71833a, this.f71834b, this.f71835c);
    }
}
