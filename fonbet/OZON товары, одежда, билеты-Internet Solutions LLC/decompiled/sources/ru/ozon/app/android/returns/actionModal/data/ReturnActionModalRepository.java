package ru.ozon.app.android.returns.actionModal.data;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.actionModal.data.dto.processReturnAction.ProcessReturnActionRequestDto;
import ru.ozon.app.android.returns.actionModal.data.dto.processReturnAction.ProcessReturnActionResponseDto;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/returns/actionModal/data/ReturnActionModalRepository;", "", "Lru/ozon/app/android/returns/actionModal/data/ReturnActionModalApi;", "api", "<init>", "(Lru/ozon/app/android/returns/actionModal/data/ReturnActionModalApi;)V", "", "action", "Lru/ozon/app/android/returns/actionModal/data/dto/processReturnAction/ProcessReturnActionRequestDto;", "request", "Lru/ozon/app/android/returns/actionModal/data/dto/processReturnAction/ProcessReturnActionResponseDto;", "processAction", "(Ljava/lang/String;Lru/ozon/app/android/returns/actionModal/data/dto/processReturnAction/ProcessReturnActionRequestDto;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/returns/actionModal/data/ReturnActionModalApi;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnActionModalRepository {

    @NotNull
    private final ReturnActionModalApi api;

    public ReturnActionModalRepository(@NotNull ReturnActionModalApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    public final Object processAction(@NotNull String str, @NotNull ProcessReturnActionRequestDto processReturnActionRequestDto, @NotNull d<? super ProcessReturnActionResponseDto> dVar) {
        return this.api.processReturnAction(str, processReturnActionRequestDto, dVar);
    }
}
