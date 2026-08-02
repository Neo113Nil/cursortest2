package ru.ozon.app.android.error.summary.domain;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.error.summary.presentation.ErrorSummaryState;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.storage.debug.DebugToolsService;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/error/summary/presentation/ErrorSummaryState;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/error/summary/presentation/ErrorSummaryState;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.error.summary.domain.ErrorSummaryInteractor$fetch$2", f = "ErrorSummaryInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ErrorSummaryInteractor$fetch$2 extends j implements Function2<M, d<? super ErrorSummaryState>, Object> {
    int label;
    final /* synthetic */ ErrorSummaryInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ErrorSummaryInteractor$fetch$2(ErrorSummaryInteractor errorSummaryInteractor, d<? super ErrorSummaryInteractor$fetch$2> dVar) {
        super(2, dVar);
        this.this$0 = errorSummaryInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ErrorSummaryInteractor$fetch$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AppVersionStorage appVersionStorage;
        DebugToolsService debugToolsService;
        UserManager userManager;
        ScreenState.ServerIssue serverIssue;
        DebugToolsService debugToolsService2;
        DebugToolsService debugToolsService3;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        appVersionStorage = this.this$0.appVersionStorage;
        String versionNameWithoutSuffix = appVersionStorage.getVersionNameWithoutSuffix();
        debugToolsService = this.this$0.debugToolsService;
        String commitHash = debugToolsService.getCommitHash();
        if (commitHash == null) {
            commitHash = "";
        }
        String str = commitHash;
        userManager = this.this$0.userManager;
        Long l11 = new Long(userManager.getUserId());
        serverIssue = this.this$0.serverIssue;
        debugToolsService2 = this.this$0.debugToolsService;
        String meshValue = debugToolsService2.getMeshValue();
        debugToolsService3 = this.this$0.debugToolsService;
        return new ErrorSummaryState("android", versionNameWithoutSuffix, str, l11, serverIssue, meshValue, debugToolsService3.getAbVariant());
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super ErrorSummaryState> dVar) {
        return ((ErrorSummaryInteractor$fetch$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
