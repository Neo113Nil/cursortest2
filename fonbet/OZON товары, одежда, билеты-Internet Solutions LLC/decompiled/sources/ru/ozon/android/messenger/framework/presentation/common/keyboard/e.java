package ru.ozon.android.messenger.framework.presentation.common.keyboard;

import android.os.Build;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.common.keyboard.b;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f90775a = new e();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static b.c f90776b = b.c.a.f90771a;

    public final void a(b.c cVar) {
        if (cVar == null) {
            cVar = b.c.a.f90771a;
        }
        f90776b = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r5 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Bundle bundle) {
        b.c cVar;
        if (bundle != null) {
            Intrinsics.checkNotNullParameter(bundle, "<this>");
            Intrinsics.checkNotNullParameter(b.c.class, "clazz");
            cVar = (b.c) (Build.VERSION.SDK_INT >= 33 ? bundle.getParcelable("KEYBOARD_STATE_BUNDLE_KEY", b.c.class) : bundle.getParcelable("KEYBOARD_STATE_BUNDLE_KEY"));
        }
        cVar = f90776b;
        f90776b = cVar;
    }

    @NotNull
    public final b.c c() {
        return f90776b;
    }
}
