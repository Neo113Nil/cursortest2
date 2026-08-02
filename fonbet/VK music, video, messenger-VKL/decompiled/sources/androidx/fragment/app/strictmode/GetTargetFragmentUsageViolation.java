package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;

/* compiled from: GetTargetFragmentUsageViolation.kt */
/* loaded from: classes12.dex */
public final class GetTargetFragmentUsageViolation extends TargetFragmentUsageViolation {
    public GetTargetFragmentUsageViolation(Fragment fragment) {
        super(fragment, "Attempting to get target fragment from fragment " + fragment);
    }
}
