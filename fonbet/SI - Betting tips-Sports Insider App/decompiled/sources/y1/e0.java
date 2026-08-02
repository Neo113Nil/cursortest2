package y1;

import android.os.Bundle;
import androidx.appcompat.widget.c1;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ly1/e0;", "Ly1/t0;", "Ly1/d0;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@s0("navigation")
@SourceDebugExtension({"SMAP\nNavGraphNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphNavigator.kt\nandroidx/navigation/NavGraphNavigator\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n90#2:135\n106#2:156\n90#2:158\n27#3:136\n46#3:137\n32#3,4:138\n31#3,7:148\n126#4:142\n153#4,3:143\n37#5,2:146\n1#6:155\n1#6:157\n*S KotlinDebug\n*F\n+ 1 NavGraphNavigator.kt\nandroidx/navigation/NavGraphNavigator\n*L\n93#1:135\n94#1:156\n107#1:158\n94#1:136\n94#1:137\n94#1:138,4\n94#1:148,7\n94#1:142\n94#1:143,3\n94#1:146,2\n94#1:155\n*E\n"})
/* loaded from: classes.dex */
public class e0 extends t0 {

    /* renamed from: c, reason: collision with root package name */
    public final u0 f25545c;

    public e0(u0 navigatorProvider) {
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        Intrinsics.checkNotNullParameter("navigation", "name");
        this.f25545c = navigatorProvider;
    }

    @Override // y1.t0
    public final b0 a() {
        return new d0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, android.os.Bundle] */
    @Override // y1.t0
    public final void d(List entries, i0 i0Var) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            b0 b0Var = lVar.f25583b;
            Intrinsics.checkNotNull(b0Var, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            d0 d0Var = (d0) b0Var;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = lVar.f25589h.a();
            b6.p pVar = d0Var.f25543g;
            int i5 = pVar.f3078a;
            if (i5 == 0) {
                StringBuilder sb2 = new StringBuilder("no start destination defined via app:startDestination for ");
                b2.m mVar = d0Var.f25534b;
                String superName = mVar.f3014b;
                if (superName == null) {
                    superName = String.valueOf(mVar.f3017e);
                }
                Intrinsics.checkNotNullParameter(superName, "superName");
                if (((d0) pVar.f3079b).f25534b.f3017e == 0) {
                    superName = "the root navigation";
                }
                sb2.append(superName);
                throw new IllegalStateException(sb2.toString().toString());
            }
            b0 b0Var2 = (b0) ((s.o) pVar.f3080c).d(i5);
            if (b0Var2 == null) {
                if (((String) pVar.f3081d) == null) {
                    pVar.f3081d = String.valueOf(pVar.f3078a);
                }
                String str = (String) pVar.f3081d;
                Intrinsics.checkNotNull(str);
                throw new IllegalArgumentException(c1.n("navigation destination ", str, " is not a direct child of this NavGraph"));
            }
            this.f25545c.b(b0Var2.f25533a).d(kotlin.collections.t.c(b().b(b0Var2, b0Var2.a((Bundle) objectRef.element))), i0Var);
        }
    }
}
