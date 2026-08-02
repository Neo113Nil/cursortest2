package h5;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: h5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6803a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C6803a f64967a = new C6803a();

    @NotNull
    public final String a() {
        String processName = Application.getProcessName();
        Intrinsics.checkNotNullExpressionValue(processName, "getProcessName()");
        return processName;
    }
}
