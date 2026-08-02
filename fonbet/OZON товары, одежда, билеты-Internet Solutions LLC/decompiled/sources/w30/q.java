package w30;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f103547a;

    public q(@NotNull ru.ozon.fintech.settings.domain.a fintechSettings) {
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        this.f103547a = fintechSettings;
    }

    public final String a() {
        return this.f103547a.getOzonSessionId();
    }
}
