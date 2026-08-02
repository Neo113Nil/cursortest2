package k20;

import ed.C6345a;
import hi.InterfaceC6958a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerModule$Companion$provideComposerWidgetComponentStorage$$inlined$WidgetComponentReader$1;

/* renamed from: k20.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7475g implements InterfaceC7474f {

    /* renamed from: a, reason: collision with root package name */
    private final RetainComposerModule$Companion$provideComposerWidgetComponentStorage$$inlined$WidgetComponentReader$1 f70361a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<Class<? extends InterfaceC6958a>, Future<? extends InterfaceC6958a>> f70362b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<Class<? extends InterfaceC6958a>, InterfaceC7469a<? extends InterfaceC6958a>> f70363c;

    public C7475g() {
        this.f70362b = new ConcurrentHashMap<>();
        this.f70363c = new ConcurrentHashMap<>();
        this.f70361a = null;
    }

    public final void a(@NotNull C7473e<? extends InterfaceC6958a> component) {
        Intrinsics.checkNotNullParameter(component, "component");
        if (component == C7471c.f70357c) {
            return;
        }
        b(C6345a.b(component.a()), component.b());
    }

    public final void b(@NotNull Class<? extends InterfaceC6958a> key, @NotNull InterfaceC7469a<? extends InterfaceC6958a> provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (key == C6345a.b(C7472d.a())) {
            return;
        }
        this.f70363c.putIfAbsent(key, provider);
    }

    @Override // k20.InterfaceC7474f
    @NotNull
    public final <C extends InterfaceC6958a> C getComponent(@NotNull Class<? extends C> key) {
        C c11;
        Intrinsics.checkNotNullParameter(key, "key");
        InterfaceC7469a<? extends InterfaceC6958a> interfaceC7469a = this.f70363c.get(key);
        InterfaceC7469a<? extends InterfaceC6958a> interfaceC7469a2 = interfaceC7469a instanceof InterfaceC7469a ? interfaceC7469a : null;
        if (interfaceC7469a2 == null) {
            RetainComposerModule$Companion$provideComposerWidgetComponentStorage$$inlined$WidgetComponentReader$1 retainComposerModule$Companion$provideComposerWidgetComponentStorage$$inlined$WidgetComponentReader$1 = this.f70361a;
            if (retainComposerModule$Companion$provideComposerWidgetComponentStorage$$inlined$WidgetComponentReader$1 == null || (c11 = (C) retainComposerModule$Companion$provideComposerWidgetComponentStorage$$inlined$WidgetComponentReader$1.getComponent(key)) == null) {
                throw new IllegalStateException("Widget component not found for ".concat(key.getSimpleName()));
            }
            return c11;
        }
        while (true) {
            ConcurrentHashMap<Class<? extends InterfaceC6958a>, Future<? extends InterfaceC6958a>> concurrentHashMap = this.f70362b;
            Future<? extends InterfaceC6958a> future = concurrentHashMap.get(key);
            Future<? extends InterfaceC6958a> future2 = future;
            if (future == null) {
                FutureTask futureTask = new FutureTask(new Kr.a(interfaceC7469a2, 1));
                Future<? extends InterfaceC6958a> putIfAbsent = concurrentHashMap.putIfAbsent(key, futureTask);
                if (putIfAbsent == null) {
                    futureTask.run();
                    future2 = futureTask;
                } else {
                    future2 = putIfAbsent;
                }
            }
            try {
                continue;
                Object obj = future2.get();
                Intrinsics.g(obj, "null cannot be cast to non-null type C of ru.ozon.composer.widget.di.WidgetComponentStorage.getComponent");
                return (C) obj;
            } catch (CancellationException unused) {
                concurrentHashMap.remove(key, future2);
            }
        }
    }

    @Override // k20.InterfaceC7474f
    public final <C extends InterfaceC6958a> boolean hasComponent(@NotNull Class<? extends C> key) {
        RetainComposerModule$Companion$provideComposerWidgetComponentStorage$$inlined$WidgetComponentReader$1 retainComposerModule$Companion$provideComposerWidgetComponentStorage$$inlined$WidgetComponentReader$1;
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f70363c.containsKey(key) || ((retainComposerModule$Companion$provideComposerWidgetComponentStorage$$inlined$WidgetComponentReader$1 = this.f70361a) != null && retainComposerModule$Companion$provideComposerWidgetComponentStorage$$inlined$WidgetComponentReader$1.hasComponent(key));
    }

    public C7475g(@NotNull RetainComposerModule$Companion$provideComposerWidgetComponentStorage$$inlined$WidgetComponentReader$1 next) {
        Intrinsics.checkNotNullParameter(next, "next");
        this.f70362b = new ConcurrentHashMap<>();
        this.f70363c = new ConcurrentHashMap<>();
        this.f70361a = next;
    }
}
