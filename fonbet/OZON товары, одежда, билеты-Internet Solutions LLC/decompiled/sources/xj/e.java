package xj;

import Dj.EnumC2873a;
import Dj.InterfaceC2874b;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.c;

/* loaded from: classes6.dex */
public final class e implements InterfaceC2874b {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final sj.d f105606c;

    public e(@NotNull sj.a config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f105606c = sj.e.f98817f.q(config);
    }

    @Override // Dj.InterfaceC2874b
    public final void a(@NotNull String str) {
        InterfaceC2874b.a.d(this, str);
    }

    @Override // Dj.InterfaceC2874b
    public final void b(@NotNull EnumC2873a level, @NotNull String message, LinkedHashMap fields, Boolean bool) {
        a aVar;
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        c.a aVar2 = ru.ozon.android.ozonLogger.core.c.Companion;
        int a11 = level.a();
        aVar2.getClass();
        ru.ozon.android.ozonLogger.core.c a12 = c.a.a(a11);
        if (fields != null) {
            Intrinsics.checkNotNullParameter(fields, "fields");
            aVar = new a(fields);
        } else {
            aVar = null;
        }
        this.f105606c.f(a12, message, aVar, bool);
    }
}
