package wZ;

import M4.c;
import android.os.Bundle;
import androidx.lifecycle.w0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: wZ.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10460b extends w0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f103709a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private String f103710b;

    public C10460b(@NotNull M4.c savedStateRegistry) {
        String string;
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Bundle b11 = savedStateRegistry.b("ru.ozon.compass.fragment.vm.EXTRA");
        this.f103709a = b11 != null ? b11.getBoolean("ru.ozon.compass.fragment.vm.EXTRA_ADD_FRAGMENT_TO_BACKSTACK", true) : true;
        this.f103710b = (b11 == null || (string = b11.getString("ru.ozon.compass.fragment.vm.EXTRA_FRAGMENT_LINK")) == null) ? "" : string;
        savedStateRegistry.g("ru.ozon.compass.fragment.vm.EXTRA", new c.b() { // from class: wZ.a
            @Override // M4.c.b
            public final Bundle saveState() {
                return C10460b.d0(C10460b.this);
            }
        });
    }

    public static Bundle d0(C10460b c10460b) {
        return androidx.core.os.d.b(new Pair("ru.ozon.compass.fragment.vm.EXTRA_ADD_FRAGMENT_TO_BACKSTACK", Boolean.valueOf(c10460b.f103709a)), new Pair("ru.ozon.compass.fragment.vm.EXTRA_FRAGMENT_LINK", c10460b.f103710b));
    }

    public final boolean e0() {
        return this.f103709a;
    }

    @NotNull
    public final String f0() {
        return this.f103710b;
    }

    public final void g0(boolean z11) {
        this.f103709a = z11;
    }

    public final void h0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f103710b = str;
    }
}
