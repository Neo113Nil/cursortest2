package w5;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: w5.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10433e<T extends View> implements InterfaceC10439k<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final T f103579a;

    /* JADX WARN: Multi-variable type inference failed */
    public C10433e(@NotNull View view) {
        this.f103579a = view;
    }

    @Override // w5.InterfaceC10439k
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10433e) {
            return Intrinsics.d(this.f103579a, ((C10433e) obj).f103579a);
        }
        return false;
    }

    @Override // w5.InterfaceC10439k
    @NotNull
    public final T getView() {
        return this.f103579a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f103579a.hashCode() * 31);
    }
}
