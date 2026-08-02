package ru.ozon.app.android.commonwidgets.widgets.resultheader.domain;

import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.presentation.ShareListVO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/resultheader/domain/ResultsHeaderRepository;", "", "", "id", "", "permission", "", "shareAsManager", "Lio/reactivex/y;", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/presentation/ShareListVO;", "shareList", "(JLjava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/y;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ResultsHeaderRepository {
    @NotNull
    y<ShareListVO> shareList(long id2, String permission, Boolean shareAsManager);
}
