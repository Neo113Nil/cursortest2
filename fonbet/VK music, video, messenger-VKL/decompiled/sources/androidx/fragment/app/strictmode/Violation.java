package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;

/* compiled from: Violation.kt */
/* loaded from: classes.dex */
public abstract class Violation extends RuntimeException {
    private final Fragment fragment;

    public Violation(Fragment fragment, String str) {
        super(str);
        this.fragment = fragment;
    }

    public final Fragment d() {
        return this.fragment;
    }
}
