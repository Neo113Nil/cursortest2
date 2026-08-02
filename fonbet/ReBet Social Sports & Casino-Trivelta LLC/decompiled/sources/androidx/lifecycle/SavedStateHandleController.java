package androidx.lifecycle;

import androidx.lifecycle.AbstractC2185j;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010%\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/p;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "", "key", "Landroidx/lifecycle/J;", "handle", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/J;)V", "Landroidx/savedstate/a;", "registry", "Landroidx/lifecycle/j;", "lifecycle", "", W9.d.f13160a, "(Landroidx/savedstate/a;Landroidx/lifecycle/j;)V", "Landroidx/lifecycle/s;", "source", "Landroidx/lifecycle/j$a;", "event", "k", "(Landroidx/lifecycle/s;Landroidx/lifecycle/j$a;)V", "close", "()V", "a", "Ljava/lang/String;", com.google.crypto.tink.integration.android.b.f37029b, "Landroidx/lifecycle/J;", "r", "()Landroidx/lifecycle/J;", "", EventKeys.VALUE_KEY, "c", "Z", "B", "()Z", "isAttached", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSavedStateHandleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleController.kt\nandroidx/lifecycle/SavedStateHandleController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
/* loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC2191p, AutoCloseable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final J handle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean isAttached;

    public SavedStateHandleController(String key, J handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.key = key;
        this.handle = handle;
    }

    /* renamed from: B, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }

    public final void d(androidx.savedstate.a registry, AbstractC2185j lifecycle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.isAttached) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.isAttached = true;
        lifecycle.a(this);
        registry.c(this.key, this.handle.b());
    }

    @Override // androidx.lifecycle.InterfaceC2191p
    public void k(InterfaceC2193s source, AbstractC2185j.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC2185j.a.ON_DESTROY) {
            this.isAttached = false;
            source.getLifecycle().d(this);
        }
    }

    /* renamed from: r, reason: from getter */
    public final J getHandle() {
        return this.handle;
    }
}
