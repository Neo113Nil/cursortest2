package t1;

import androidx.appcompat.widget.c1;
import androidx.lifecycle.k1;
import androidx.lifecycle.m1;
import com.google.android.gms.internal.measurement.d5;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import u6.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final f[] f23741a;

    public d(f... initializers) {
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        this.f23741a = initializers;
    }

    @Override // androidx.lifecycle.m1
    public final k1 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // androidx.lifecycle.m1
    public final /* synthetic */ k1 b(ag.c cVar, e eVar) {
        return c1.a(this, cVar, eVar);
    }

    @Override // androidx.lifecycle.m1
    public final k1 c(Class modelClass, e extras) {
        f fVar;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        ag.c modelClass2 = h.m(modelClass);
        f[] fVarArr = this.f23741a;
        f[] initializers = (f[]) Arrays.copyOf(fVarArr, fVarArr.length);
        Intrinsics.checkNotNullParameter(modelClass2, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        int length = initializers.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                fVar = null;
                break;
            }
            fVar = initializers[i5];
            if (Intrinsics.areEqual(fVar.f23742a, modelClass2)) {
                break;
            }
            i5++;
        }
        k1 k1Var = fVar != null ? (k1) fVar.f23743b.invoke(extras) : null;
        if (k1Var != null) {
            return k1Var;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + d5.r(modelClass2)).toString());
    }
}
