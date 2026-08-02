package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.footer.FiltersFooterVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.header.FiltersHeaderVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.FiltersSectionVO;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionVO;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.HasAsyncAction;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/FiltersUpdateVO;", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/HasAsyncAction;", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;", "asyncAction", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/header/FiltersHeaderVO;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/footer/FiltersFooterVO;", CommentV3DTO.FOOTER_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionVO;", "sections", "<init>", "(Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/header/FiltersHeaderVO;Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/footer/FiltersFooterVO;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;", "getAsyncAction", "()Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/header/FiltersHeaderVO;", "getHeader", "()Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/header/FiltersHeaderVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/footer/FiltersFooterVO;", "getFooter", "()Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/footer/FiltersFooterVO;", "Ljava/util/List;", "getSections", "()Ljava/util/List;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FiltersUpdateVO implements HasAsyncAction {
    private final AsyncActionVO asyncAction;
    private final FiltersFooterVO footer;
    private final FiltersHeaderVO header;

    @NotNull
    private final List<FiltersSectionVO> sections;

    /* JADX WARN: Multi-variable type inference failed */
    public FiltersUpdateVO(AsyncActionVO asyncActionVO, FiltersHeaderVO filtersHeaderVO, FiltersFooterVO filtersFooterVO, @NotNull List<? extends FiltersSectionVO> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.asyncAction = asyncActionVO;
        this.header = filtersHeaderVO;
        this.footer = filtersFooterVO;
        this.sections = sections;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiltersUpdateVO)) {
            return false;
        }
        FiltersUpdateVO filtersUpdateVO = (FiltersUpdateVO) other;
        return Intrinsics.d(this.asyncAction, filtersUpdateVO.asyncAction) && Intrinsics.d(this.header, filtersUpdateVO.header) && Intrinsics.d(this.footer, filtersUpdateVO.footer) && Intrinsics.d(this.sections, filtersUpdateVO.sections);
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.HasAsyncAction
    public AsyncActionVO getAsyncAction() {
        return this.asyncAction;
    }

    public final FiltersFooterVO getFooter() {
        return this.footer;
    }

    public final FiltersHeaderVO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<FiltersSectionVO> getSections() {
        return this.sections;
    }

    public int hashCode() {
        AsyncActionVO asyncActionVO = this.asyncAction;
        int hashCode = (asyncActionVO == null ? 0 : asyncActionVO.hashCode()) * 31;
        FiltersHeaderVO filtersHeaderVO = this.header;
        int hashCode2 = (hashCode + (filtersHeaderVO == null ? 0 : filtersHeaderVO.hashCode())) * 31;
        FiltersFooterVO filtersFooterVO = this.footer;
        return this.sections.hashCode() + ((hashCode2 + (filtersFooterVO != null ? filtersFooterVO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "FiltersUpdateVO(asyncAction=" + this.asyncAction + ", header=" + this.header + ", footer=" + this.footer + ", sections=" + this.sections + ")";
    }
}
