package xZ;

import B0.A0;
import M4.c;
import android.os.Build;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h<T> extends ArrayDeque<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f105200a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull M4.e owner) {
        super(10);
        Serializable serializable;
        Intrinsics.checkNotNullParameter(owner, "owner");
        String simpleName = owner.getClass().getSimpleName();
        String b11 = A0.b("ru.ozon.compass.", simpleName, ".EXTRA_BUNDLE");
        String b12 = A0.b("ru.ozon.compass.", simpleName, ".EXTRA_STACK_NAVIGATION");
        this.f105200a = b12;
        M4.c savedStateRegistry = owner.getSavedStateRegistry();
        Bundle b13 = savedStateRegistry.b(b11);
        if (b13 != null) {
            clear();
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = b13.getSerializable(b12, Serializable.class);
            } else {
                serializable = b13.getSerializable(b12);
                if (serializable == null) {
                    serializable = null;
                }
            }
            Intrinsics.g(serializable, "null cannot be cast to non-null type kotlin.collections.Collection<T of ru.ozon.compass.host.BackStackManager>");
            addAll((Collection) serializable);
        }
        savedStateRegistry.g(b11, new c.b() { // from class: xZ.g
            @Override // M4.c.b
            public final Bundle saveState() {
                return h.a(h.this);
            }
        });
    }

    public static Bundle a(h hVar) {
        return androidx.core.os.d.b(new Pair(hVar.f105200a, C7714v.U0(hVar)));
    }
}
