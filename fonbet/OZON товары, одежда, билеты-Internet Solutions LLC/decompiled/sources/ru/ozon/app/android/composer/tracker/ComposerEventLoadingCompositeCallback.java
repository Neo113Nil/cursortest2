package ru.ozon.app.android.composer.tracker;

import A00.a;
import A00.b;
import L00.g;
import P00.k;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0012\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/composer/tracker/ComposerEventLoadingCompositeCallback;", "LA00/b;", "", "callbacks", "<init>", "(Ljava/util/Set;)V", "LA00/a;", "event", "", "uuid", "", "onLoadCanceled", "(LA00/a;Ljava/lang/String;)V", "LP00/k;", "Ll20/a;", "response", "onLoadCompleted", "(LA00/a;Ljava/lang/String;LP00/k;)V", "onLoadFailed", "(LA00/a;)V", "", "throwable", "(LA00/a;Ljava/lang/Throwable;)V", "LL00/g;", "request", "onLoadStarted", "(LA00/a;LL00/g;)V", "Ljava/util/Set;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerEventLoadingCompositeCallback implements b {

    @NotNull
    private final Set<b> callbacks;

    public ComposerEventLoadingCompositeCallback(@NotNull Set<b> callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
    }

    @Override // A00.b
    public void onLoadCanceled(@NotNull a event, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Iterator<T> it = this.callbacks.iterator();
        while (it.hasNext()) {
            ((b) it.next()).onLoadCanceled(event, uuid);
        }
    }

    @Override // A00.b
    public void onLoadCompleted(@NotNull a event, @NotNull String uuid, @NotNull k<? extends C7854a> response) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(response, "response");
        Iterator<T> it = this.callbacks.iterator();
        while (it.hasNext()) {
            ((b) it.next()).onLoadCompleted(event, uuid, response);
        }
    }

    @Override // A00.b
    public void onLoadFailed(@NotNull a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Iterator<T> it = this.callbacks.iterator();
        while (it.hasNext()) {
            ((b) it.next()).onLoadFailed(event);
        }
    }

    @Override // A00.b
    public void onLoadStarted(@NotNull a event, @NotNull g request) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(request, "request");
        Iterator<T> it = this.callbacks.iterator();
        while (it.hasNext()) {
            ((b) it.next()).onLoadStarted(event, request);
        }
    }

    @Override // A00.b
    public void onLoadFailed(@NotNull a event, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Iterator<T> it = this.callbacks.iterator();
        while (it.hasNext()) {
            ((b) it.next()).onLoadFailed(event, throwable);
        }
    }
}
