package jc0;

import Sc.InterfaceC4008j;
import Sc.k;
import Tc.d;
import Tc.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: jc0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7338a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Fb0.e f69671a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f69672b;

    /* renamed from: jc0.a$a, reason: collision with other inner class name */
    static final class C1137a extends AbstractC7737t implements Function0<List<? extends String>> {
        C1137a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends String> invoke() {
            C7338a c7338a = C7338a.this;
            j c11 = c7338a.f69671a.n() ? C7339b.c() : C7339b.b();
            ArrayList arrayList = new ArrayList();
            Object it = c11.iterator();
            while (((d.C0541d) it).hasNext()) {
                Object next = ((d.e) it).next();
                if (!kotlin.text.h.A((String) next, c7338a.f69671a.j(), false)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
    }

    public C7338a(@NotNull Fb0.e primaryDomain) {
        Intrinsics.checkNotNullParameter(primaryDomain, "primaryDomain");
        this.f69671a = primaryDomain;
        this.f69672b = k.b(new C1137a());
    }

    @NotNull
    public final List<String> b() {
        return (List) this.f69672b.getValue();
    }
}
