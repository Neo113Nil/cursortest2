package w5;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w5.AbstractC10429a;

/* renamed from: w5.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10430b implements InterfaceC10436h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f103577a;

    public C10430b(@NotNull Context context) {
        this.f103577a = context;
    }

    @Override // w5.InterfaceC10436h
    public final Object a(@NotNull kotlin.coroutines.d<? super C10435g> dVar) {
        DisplayMetrics displayMetrics = this.f103577a.getResources().getDisplayMetrics();
        AbstractC10429a.C2245a c2245a = new AbstractC10429a.C2245a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new C10435g(c2245a, c2245a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10430b) {
            return Intrinsics.d(this.f103577a, ((C10430b) obj).f103577a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f103577a.hashCode();
    }
}
