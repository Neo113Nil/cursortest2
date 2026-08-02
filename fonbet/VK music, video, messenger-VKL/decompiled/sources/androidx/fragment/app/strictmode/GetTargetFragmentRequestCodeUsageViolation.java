package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;

/* compiled from: GetTargetFragmentRequestCodeUsageViolation.kt */
/* loaded from: classes12.dex */
public final class GetTargetFragmentRequestCodeUsageViolation extends TargetFragmentUsageViolation {
    public GetTargetFragmentRequestCodeUsageViolation(Fragment fragment) {
        super(fragment, "Attempting to get target request code from fragment " + fragment);
    }
}
