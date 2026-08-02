package Tg;

import ah.AbstractC2026s;
import ch.C2924a;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2924a f11805a = new C2924a("UploadProgressListenerAttributeKey");

    /* renamed from: b, reason: collision with root package name */
    public static final C2924a f11806b = new C2924a("DownloadProgressListenerAttributeKey");

    public static final Xg.c c(Xg.c cVar, Function3 listener) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return Ug.b.a(cVar.r(), Yg.a.a(cVar.b(), cVar.getCoroutineContext(), AbstractC2026s.b(cVar), listener)).f();
    }
}
