package x0;

import com.google.android.gms.common.ConnectionResult;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* renamed from: x0.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10603h {

    /* renamed from: a, reason: collision with root package name */
    private static final float f104769a = 2500;

    /* renamed from: b, reason: collision with root package name */
    private static final float f104770b = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;

    /* renamed from: c, reason: collision with root package name */
    private static final float f104771c = 50;

    public static final Object d(@NotNull InterfaceC10604i interfaceC10604i, int i11, int i12, @NotNull Z1.d dVar, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        Object e11 = interfaceC10604i.e(new C10602g(i11, dVar, interfaceC10604i, i12, null), jVar);
        return e11 == Wc.a.COROUTINE_SUSPENDED ? e11 : Unit.f71690a;
    }

    public static final boolean e(@NotNull InterfaceC10604i interfaceC10604i, int i11) {
        return i11 <= interfaceC10604i.b() && interfaceC10604i.a() <= i11;
    }
}
