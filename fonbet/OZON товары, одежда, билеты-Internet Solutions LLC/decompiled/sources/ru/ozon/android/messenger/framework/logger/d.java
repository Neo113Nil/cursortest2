package ru.ozon.android.messenger.framework.logger;

import Lm0.a;
import Sc.InterfaceC4008j;
import Sc.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class d implements ru.ozon.android.messenger.framework.logger.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f89155a = k.b(a.f89156b);

    static final class a extends AbstractC7737t implements Function0<sj.d> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f89156b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final sj.d invoke() {
            try {
                return sj.e.f98817f.q(new sj.a("Messenger", "Messenger", null));
            } catch (Exception e11) {
                a.b bVar = Lm0.a.f17149a;
                bVar.b("Messenger");
                bVar.w("OzonLogger creation failed, cause = " + e11, new Object[0]);
                return null;
            }
        }
    }

    @Override // ru.ozon.android.messenger.framework.logger.a
    public final void a(@NotNull ru.ozon.android.ozonLogger.core.c level, @NotNull String message, xj.a aVar) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        InterfaceC4008j interfaceC4008j = this.f89155a;
        if (((sj.d) interfaceC4008j.getValue()) == null) {
            a.b bVar = Lm0.a.f17149a;
            bVar.b("Messenger");
            bVar.w("Try to log, but AndroidOzonLogger is null, log entry = [level = " + level + ", message = " + message + ", customFields = " + aVar + ", isLocal = false]", new Object[0]);
        }
        sj.d dVar = (sj.d) interfaceC4008j.getValue();
        if (dVar != null) {
            dVar.f(level, message, aVar, Boolean.FALSE);
        }
    }
}
