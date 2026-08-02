package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import xsna.h5s;

/* compiled from: WrongNestedHierarchyViolation.kt */
/* loaded from: classes12.dex */
public final class WrongNestedHierarchyViolation extends Violation {
    private final int containerId;
    private final Fragment expectedParentFragment;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WrongNestedHierarchyViolation(Fragment fragment, Fragment fragment2, int i) {
        super(fragment, h5s.c(i, " without using parent's childFragmentManager", r0));
        StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
        sb.append(fragment);
        sb.append(" within the view of parent fragment ");
        sb.append(fragment2);
        sb.append(" via container with ID ");
        this.expectedParentFragment = fragment2;
        this.containerId = i;
    }
}
