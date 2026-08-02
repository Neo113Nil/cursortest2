package f1;

import Sc.p;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: f1.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6398b {
    public static final void a(@NotNull C6397a c6397a, @NotNull SparseArray<AutofillValue> sparseArray) {
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            int keyAt = sparseArray.keyAt(i11);
            AutofillValue autofillValue = sparseArray.get(keyAt);
            d dVar = d.f62431a;
            if (dVar.d(autofillValue)) {
                g b11 = c6397a.b();
                dVar.i(autofillValue).toString();
                b11.b(keyAt);
            } else {
                if (dVar.b(autofillValue)) {
                    Intrinsics.checkNotNullParameter("An operation is not implemented: b/138604541: Add onFill() callback for date", "message");
                    throw new p("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (dVar.c(autofillValue)) {
                    Intrinsics.checkNotNullParameter("An operation is not implemented: b/138604541: Add onFill() callback for list", "message");
                    throw new p("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (dVar.e(autofillValue)) {
                    Intrinsics.checkNotNullParameter("An operation is not implemented: b/138604541:  Add onFill() callback for toggle", "message");
                    throw new p("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final void b(@NotNull C6397a c6397a, @NotNull ViewStructure viewStructure) {
        C6399c c6399c = C6399c.f62430a;
        int a11 = c6399c.a(viewStructure, c6397a.b().a().size());
        for (Map.Entry entry : c6397a.b().a().entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            f fVar = (f) entry.getValue();
            int i11 = a11;
            ViewStructure b11 = c6399c.b(viewStructure, i11);
            if (b11 != null) {
                d dVar = d.f62431a;
                AutofillId a12 = dVar.a(viewStructure);
                Intrinsics.f(a12);
                dVar.g(b11, a12, intValue);
                c6399c.d(b11, intValue, c6397a.c().getContext().getPackageName(), null, null);
                dVar.h(b11, 1);
                fVar.getClass();
                throw null;
            }
            a11 = i11 + 1;
        }
    }
}
