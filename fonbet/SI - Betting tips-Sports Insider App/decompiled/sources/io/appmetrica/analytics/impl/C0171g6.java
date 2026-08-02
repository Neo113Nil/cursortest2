package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.g6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0171g6 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f13806a;

    /* renamed from: b, reason: collision with root package name */
    public final Ug f13807b;

    public C0171g6(@NotNull Context context, @NotNull InterfaceC0094d6 interfaceC0094d6, @NotNull EnumC0047bb enumC0047bb, @NotNull InterfaceC0031al interfaceC0031al, @NotNull Executor executor, @NotNull String str) {
        this.f13806a = executor;
        this.f13807b = new Ug(context, interfaceC0094d6, enumC0047bb, interfaceC0031al);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(@Nullable File file) {
        if (file == null) {
            return;
        }
        Executor executor = this.f13806a;
        Ug ug2 = this.f13807b;
        C0354nb c0354nb = ug2.f12979c;
        Consumer consumer = ug2.f12981e;
        Context context = ug2.f12977a;
        if (Z9.f13281c == null) {
            synchronized (Reflection.getOrCreateKotlinClass(Z9.class)) {
                try {
                    if (Z9.f13281c == null) {
                        Z9.f13281c = new Z9(context);
                    }
                    Unit unit = Unit.f19194a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        Z9 z92 = Z9.f13281c;
        if (z92 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
            z92 = null;
        }
        executor.execute(new Tf(file, c0354nb, c0354nb, consumer, z92, ug2.f12978b));
    }
}
