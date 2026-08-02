package q0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt", f = "ContextMenuGestures.android.kt", l = {66}, m = "awaitFirstRightClickDown")
/* renamed from: q0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8951f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    InterfaceC10628c f81310d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f81311e;

    /* renamed from: f, reason: collision with root package name */
    int f81312f;

    C8951f() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f81311e = obj;
        this.f81312f |= LinearLayoutManager.INVALID_OFFSET;
        return C8954i.a(null, this);
    }
}
