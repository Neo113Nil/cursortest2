package g1;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ze.j;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.contentcapture.AndroidContentCaptureManager", f = "AndroidContentCaptureManager.android.kt", l = {186, 196}, m = "boundsUpdatesEventLoop$ui_release")
/* renamed from: g1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6613e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    ViewOnAttachStateChangeListenerC6609a f63709d;

    /* renamed from: e, reason: collision with root package name */
    j f63710e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f63711f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ViewOnAttachStateChangeListenerC6609a f63712g;

    /* renamed from: h, reason: collision with root package name */
    int f63713h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6613e(ViewOnAttachStateChangeListenerC6609a viewOnAttachStateChangeListenerC6609a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f63712g = viewOnAttachStateChangeListenerC6609a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f63711f = obj;
        this.f63713h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f63712g.b(this);
    }
}
