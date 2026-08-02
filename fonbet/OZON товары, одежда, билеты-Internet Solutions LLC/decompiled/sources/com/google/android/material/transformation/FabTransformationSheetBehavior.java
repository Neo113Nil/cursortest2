package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Y;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.google.mlkit.common.sdkinternal.C;
import j7.C7299h;
import java.util.HashMap;
import ru.ozon.app.android.R;

@Deprecated
/* loaded from: classes9.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i, reason: collision with root package name */
    private HashMap f58857i;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    protected final void c(@NonNull View view, @NonNull View view2, boolean z11, boolean z12) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z11) {
                this.f58857i = new HashMap(childCount);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                boolean z13 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).c() instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z13) {
                    if (z11) {
                        this.f58857i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        int i12 = Y.f42258g;
                        childAt.setImportantForAccessibility(4);
                    } else {
                        HashMap hashMap = this.f58857i;
                        if (hashMap != null && hashMap.containsKey(childAt)) {
                            int intValue = ((Integer) this.f58857i.get(childAt)).intValue();
                            int i13 = Y.f42258g;
                            childAt.setImportantForAccessibility(intValue);
                        }
                    }
                }
            }
            if (!z11) {
                this.f58857i = null;
            }
        }
        super.c(view, view2, z11, z12);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    @NonNull
    protected final FabTransformationBehavior.b k(Context context, boolean z11) {
        int i11 = z11 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.b bVar = new FabTransformationBehavior.b();
        bVar.f58851a = C7299h.b(i11, context);
        bVar.f58852b = new C();
        return bVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
