package androidx.activity;

import android.view.Window;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class A implements B {
    @Override // androidx.activity.B
    public void a(Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
    }
}
