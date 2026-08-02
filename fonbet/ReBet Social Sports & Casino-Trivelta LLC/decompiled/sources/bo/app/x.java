package bo.app;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f26211a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f26212b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26213c;

    public x(String placementId, WeakReference view, boolean z10) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f26211a = placementId;
        this.f26212b = view;
        this.f26213c = z10;
    }
}
