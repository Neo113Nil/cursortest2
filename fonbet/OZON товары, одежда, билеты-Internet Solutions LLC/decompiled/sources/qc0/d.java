package qc0;

import Sc.InterfaceC4008j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.crossApp.data.api.CrossAppApi;
import ru.ozon.id.nativeauth.crossApp.data.api.CrossAppChallengeApi;
import ru.ozon.id.nativeauth.crossApp.dto.CrossAppChallengeRequestDto;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<CrossAppChallengeApi> f81824a;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull InterfaceC4008j<? extends CrossAppChallengeApi> crossAppChallengeApi) {
        Intrinsics.checkNotNullParameter(crossAppChallengeApi, "crossAppChallengeApi");
        this.f81824a = crossAppChallengeApi;
    }

    public final Object a(@NotNull String str, @NotNull CrossAppChallengeRequestDto crossAppChallengeRequestDto, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object challengeEntryMobile;
        challengeEntryMobile = this.f81824a.getValue().challengeEntryMobile("composer-api.bx/_action/" + str, crossAppChallengeRequestDto, CrossAppApi.a.f97223a, cVar);
        return challengeEntryMobile;
    }
}
