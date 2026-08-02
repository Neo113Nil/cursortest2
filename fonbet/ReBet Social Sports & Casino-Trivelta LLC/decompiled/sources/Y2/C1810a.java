package Y2;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Y2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1810a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1810a f13943a = new C1810a();

    public final String a() {
        String processName = Application.getProcessName();
        Intrinsics.checkNotNullExpressionValue(processName, "getProcessName()");
        return processName;
    }
}
