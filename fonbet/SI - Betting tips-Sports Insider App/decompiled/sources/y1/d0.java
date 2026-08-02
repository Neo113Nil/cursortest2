package y1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d0 extends b0 implements Iterable, KMappedMarker {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f25542h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final b6.p f25543g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 navGraphNavigator) {
        super(navGraphNavigator);
        Intrinsics.checkNotNullParameter(navGraphNavigator, "navGraphNavigator");
        Intrinsics.checkNotNullParameter(this, "graph");
        b6.p pVar = new b6.p();
        pVar.f3079b = this;
        pVar.f3080c = new s.o(0);
        this.f25543g = pVar;
    }

    @Override // y1.b0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d0) || !super.equals(obj)) {
            return false;
        }
        b6.p pVar = this.f25543g;
        int g10 = ((s.o) pVar.f3080c).g();
        b6.p pVar2 = ((d0) obj).f25543g;
        if (g10 != ((s.o) pVar2.f3080c).g() || pVar.f3078a != pVar2.f3078a) {
            return false;
        }
        s.o oVar = (s.o) pVar.f3080c;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Iterator it = bg.n.a(new gf.x(6, oVar)).iterator();
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next();
            if (!Intrinsics.areEqual(b0Var, ((s.o) pVar2.f3080c).d(b0Var.f25534b.f3017e))) {
                return false;
            }
        }
        return true;
    }

    @Override // y1.b0
    public final a0 f(kh.g navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        a0 f6 = super.f(navDeepLinkRequest);
        b6.p pVar = this.f25543g;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        return pVar.e(f6, navDeepLinkRequest, false, (d0) pVar.f3079b);
    }

    @Override // y1.b0
    public final void g(Context context, AttributeSet attrs) {
        String valueOf;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.g(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, z1.a.f25881d);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "obtainAttributes(...)");
        int resourceId = obtainAttributes.getResourceId(0, 0);
        b6.p pVar = this.f25543g;
        pVar.f(resourceId);
        b2.e context2 = new b2.e(context, (char) 0);
        int i5 = pVar.f3078a;
        Intrinsics.checkNotNullParameter(context2, "context");
        if (i5 <= 16777215) {
            valueOf = String.valueOf(i5);
        } else {
            try {
                Intrinsics.checkNotNull(context);
                valueOf = context.getResources().getResourceName(i5);
                Intrinsics.checkNotNull(valueOf);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(i5);
            }
        }
        pVar.f3081d = valueOf;
        Unit unit = Unit.f19194a;
        obtainAttributes.recycle();
    }

    public final void h(b0 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        b6.p pVar = this.f25543g;
        s.o oVar = (s.o) pVar.f3080c;
        d0 d0Var = (d0) pVar.f3079b;
        Intrinsics.checkNotNullParameter(node, "node");
        b2.m mVar = node.f25534b;
        int i5 = mVar.f3017e;
        String str = mVar.f3018f;
        if (i5 == 0 && str == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        String str2 = d0Var.f25534b.f3018f;
        if (str2 != null && Intrinsics.areEqual(str, str2)) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + d0Var).toString());
        }
        if (i5 == d0Var.f25534b.f3017e) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + d0Var).toString());
        }
        b0 b0Var = (b0) oVar.d(i5);
        if (b0Var == node) {
            return;
        }
        if (node.f25535c != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (b0Var != null) {
            b0Var.f25535c = null;
        }
        node.f25535c = d0Var;
        oVar.f(node.f25534b.f3017e, node);
    }

    @Override // y1.b0
    public final int hashCode() {
        b6.p pVar = this.f25543g;
        int i5 = pVar.f3078a;
        s.o oVar = (s.o) pVar.f3080c;
        int g10 = oVar.g();
        for (int i10 = 0; i10 < g10; i10++) {
            i5 = (((i5 * 31) + oVar.e(i10)) * 31) + ((b0) oVar.h(i10)).hashCode();
        }
        return i5;
    }

    public final b0 i(int i5) {
        b6.p pVar = this.f25543g;
        return pVar.b(i5, (d0) pVar.f3079b, null, false);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b6.p pVar = this.f25543g;
        pVar.getClass();
        return new b2.n(pVar);
    }

    public final a0 j(kh.g navDeepLinkRequest, b0 lastVisited) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        Intrinsics.checkNotNullParameter(lastVisited, "lastVisited");
        return this.f25543g.e(super.f(navDeepLinkRequest), navDeepLinkRequest, true, lastVisited);
    }

    public final void l(int i5) {
        this.f25543g.f(i5);
    }

    @Override // y1.b0
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        b6.p pVar = this.f25543g;
        pVar.getClass();
        pVar.getClass();
        b0 i5 = i(pVar.f3078a);
        sb2.append(" startDestination=");
        if (i5 == null) {
            String str = (String) pVar.f3081d;
            if (str != null) {
                sb2.append(str);
            } else {
                sb2.append("0x" + Integer.toHexString(pVar.f3078a));
            }
        } else {
            sb2.append("{");
            sb2.append(i5.toString());
            sb2.append("}");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
