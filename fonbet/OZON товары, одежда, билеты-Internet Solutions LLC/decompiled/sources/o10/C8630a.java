package o10;

import C10.e;
import I10.c;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p10.InterfaceC8831a;
import v10.C10183a;

/* renamed from: o10.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8630a {

    /* renamed from: a, reason: collision with root package name */
    private final e f77605a;

    /* renamed from: b, reason: collision with root package name */
    private final AppBarLayout f77606b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f77607c;

    /* renamed from: d, reason: collision with root package name */
    private c f77608d;

    /* renamed from: o10.a$a, reason: collision with other inner class name */
    static final class C1305a extends AbstractC7737t implements Function0<List<? extends InterfaceC8831a>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f77609b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1305a(ViewGroup viewGroup) {
            super(0);
            this.f77609b = viewGroup;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC8831a> invoke() {
            Tc.b builder = C7714v.B();
            ViewGroup viewGroup = this.f77609b;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getChildAt(i11).getLayoutParams();
                CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
                if (fVar != null) {
                    Object c11 = fVar.c();
                    InterfaceC8831a interfaceC8831a = c11 instanceof InterfaceC8831a ? (InterfaceC8831a) c11 : null;
                    if (interfaceC8831a != null) {
                        builder.add(interfaceC8831a);
                    }
                }
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            return builder.B();
        }
    }

    public C8630a(ViewGroup composerContainer, c cVar, e eVar) {
        Intrinsics.checkNotNullParameter(composerContainer, "composerContainer");
        this.f77605a = eVar;
        AppBarLayout a11 = C10183a.a(composerContainer);
        this.f77606b = a11;
        InterfaceC4008j a12 = k.a(n.NONE, new C1305a(composerContainer));
        this.f77607c = a12;
        this.f77608d = cVar;
        C8631b c8631b = new C8631b(a11, cVar != null ? cVar.b() : 0);
        Iterator it = ((List) a12.getValue()).iterator();
        while (it.hasNext()) {
            ((InterfaceC8831a) it.next()).a(c8631b);
        }
        e eVar2 = this.f77605a;
        if (eVar2 != null) {
            eVar2.d(c8631b.a());
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [Sc.j, java.lang.Object] */
    public final void a(int i11) {
        c cVar = this.f77608d;
        if (cVar != null && cVar.b() == i11) {
            return;
        }
        this.f77608d = c.a(i11);
        C8631b c8631b = new C8631b(this.f77606b, i11);
        Iterator it = ((List) this.f77607c.getValue()).iterator();
        while (it.hasNext()) {
            ((InterfaceC8831a) it.next()).a(c8631b);
        }
    }

    public final void b() {
        AppBarLayout appBarLayout;
        e eVar = this.f77605a;
        if (eVar == null || (appBarLayout = this.f77606b) == null) {
            return;
        }
        c cVar = this.f77608d;
        eVar.d(new C8631b(appBarLayout, cVar != null ? cVar.b() : 0).a());
    }
}
