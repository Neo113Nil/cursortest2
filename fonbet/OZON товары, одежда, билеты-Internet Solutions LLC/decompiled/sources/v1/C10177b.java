package v1;

import android.view.KeyEvent;
import ed.InterfaceC6346b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* renamed from: v1.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10177b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final KeyEvent f101644a;

    private /* synthetic */ C10177b(KeyEvent keyEvent) {
        this.f101644a = keyEvent;
    }

    public static final /* synthetic */ C10177b a(KeyEvent keyEvent) {
        return new C10177b(keyEvent);
    }

    public final /* synthetic */ KeyEvent b() {
        return this.f101644a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10177b) {
            return Intrinsics.d(this.f101644a, ((C10177b) obj).f101644a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f101644a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f101644a + ')';
    }
}
