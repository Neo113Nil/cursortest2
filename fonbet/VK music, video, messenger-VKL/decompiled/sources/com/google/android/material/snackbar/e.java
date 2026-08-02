package com.google.android.material.snackbar;

import android.view.View;
import androidx.annotation.NonNull;

/* compiled from: BaseTransientBottomBar.java */
/* loaded from: classes13.dex */
public final class e {
    public final /* synthetic */ BaseTransientBottomBar a;

    public e(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    public final void a(@NonNull View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.a.b(0);
    }
}
