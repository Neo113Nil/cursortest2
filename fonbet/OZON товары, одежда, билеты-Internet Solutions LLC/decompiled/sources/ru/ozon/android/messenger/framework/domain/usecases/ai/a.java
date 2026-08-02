package ru.ozon.android.messenger.framework.domain.usecases.ai;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.requests.ai.a;
import ru.ozon.android.messenger.utils.i;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f89047a;

    public a(@NotNull ru.ozon.android.messenger.framework.domain.repository.b chatRepository) {
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        this.f89047a = chatRepository;
    }

    public final Object a(@NotNull a.EnumC1632a enumC1632a, Map<String, String> map, @NotNull kotlin.coroutines.d<? super i<? extends Object>> dVar) {
        return this.f89047a.q(new ru.ozon.android.messenger.framework.data.requests.ai.a(enumC1632a, map), dVar);
    }
}
