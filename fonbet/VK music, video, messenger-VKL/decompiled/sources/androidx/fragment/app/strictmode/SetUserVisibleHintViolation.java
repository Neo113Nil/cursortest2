package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;

/* compiled from: SetUserVisibleHintViolation.kt */
/* loaded from: classes12.dex */
public final class SetUserVisibleHintViolation extends Violation {
    private final boolean isVisibleToUser;

    public SetUserVisibleHintViolation(Fragment fragment, boolean z) {
        super(fragment, "Attempting to set user visible hint to " + z + " for fragment " + fragment);
        this.isVisibleToUser = z;
    }
}
