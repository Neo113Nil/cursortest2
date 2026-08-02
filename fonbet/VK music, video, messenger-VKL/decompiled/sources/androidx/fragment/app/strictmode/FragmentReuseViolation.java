package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;

/* compiled from: FragmentReuseViolation.kt */
/* loaded from: classes12.dex */
public final class FragmentReuseViolation extends Violation {
    private final String previousFragmentId;

    public FragmentReuseViolation(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        this.previousFragmentId = str;
    }
}
