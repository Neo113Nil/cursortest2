package ru.ozon.app.android.commonwidgets.widgets.resultheader.domain;

import AF.d;
import Bc.r;
import Bc.v;
import Fn.C3055d;
import io.reactivex.C;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.model.ShareListResponseDTO;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.presentation.ShareListVO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/resultheader/domain/ResultsHeaderRepositoryImpl;", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/domain/ResultsHeaderRepository;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/domain/ResultsHeaderApi;", "api", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/commonwidgets/widgets/resultheader/domain/ResultsHeaderApi;)V", "", "id", "", "permission", "", "shareAsManager", "Lio/reactivex/y;", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/presentation/ShareListVO;", "shareList", "(JLjava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/y;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/domain/ResultsHeaderApi;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResultsHeaderRepositoryImpl implements ResultsHeaderRepository {

    @NotNull
    private final ResultsHeaderApi api;

    @NotNull
    private final JsonParser jsonDeserializer;

    public ResultsHeaderRepositoryImpl(@NotNull JsonParser jsonDeserializer, @NotNull ResultsHeaderApi api) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(api, "api");
        this.jsonDeserializer = jsonDeserializer;
        this.api = api;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShareListVO shareList$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (ShareListVO) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C shareList$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    @Override // ru.ozon.app.android.commonwidgets.widgets.resultheader.domain.ResultsHeaderRepository
    @NotNull
    public y<ShareListVO> shareList(long id2, String permission, Boolean shareAsManager) {
        y<ShareListResponseDTO> shareList = this.api.shareList(new ShareListRequest(id2, permission, shareAsManager));
        C3055d c3055d = new C3055d(ResultsHeaderRepositoryImpl$shareList$1.INSTANCE, 16);
        shareList.getClass();
        v vVar = new v(new r(shareList, c3055d), new d(new ResultsHeaderRepositoryImpl$shareList$2(this), 14));
        Intrinsics.checkNotNullExpressionValue(vVar, "onErrorResumeNext(...)");
        return vVar;
    }
}
