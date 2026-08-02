package ru.ozon.app.android.search.widgets.tapTags.v2.presentation;

import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.search.widgets.commonTapTags.TapTagsRequestDTO;
import ru.ozon.app.android.search.widgets.tapTags.v2.core.TapTagsV2DTO;
import ru.ozon.app.android.search.widgets.tapTags.v2.core.TapTagsV2MapperKt;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "", "onCleared", "()V", "Lru/ozon/app/android/search/widgets/commonTapTags/TapTagsRequestDTO;", "request", "updateTapTags", "(Lru/ozon/app/android/search/widgets/commonTapTags/TapTagsRequestDTO;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2VO;", "_tapTags", "Landroidx/lifecycle/V;", "Lxe/B0;", "fetchTapTagsJob", "Lxe/B0;", "Landroidx/lifecycle/P;", "getTapTags", "()Landroidx/lifecycle/P;", "tapTags", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TapTagsV2ViewModel extends w0 {

    @NotNull
    private final V<TapTagsV2VO> _tapTags;

    @NotNull
    private final ActionV2Repository actionV2Repository;
    private B0 fetchTapTagsJob;
    public static final int $stable = 8;

    public TapTagsV2ViewModel(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        this._tapTags = new V<>();
    }

    @NotNull
    public final P<TapTagsV2VO> getTapTags() {
        return this._tapTags;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        B0 b02 = this.fetchTapTagsJob;
        if (b02 != null) {
            b02.j(null);
        }
    }

    public final void updateTapTags(@NotNull TapTagsRequestDTO request) {
        String searchText;
        TapTagsV2VO value;
        List<TagButtonDTO> items;
        TapTagsV2VO vo;
        Intrinsics.checkNotNullParameter(request, "request");
        B0 b02 = this.fetchTapTagsJob;
        if (b02 != null) {
            b02.j(null);
        }
        if (request.getQuery().length() == 0) {
            TapTagsV2VO value2 = this._tapTags.getValue();
            if (value2 == null || (vo = TapTagsV2VO.copy$default(value2, value2.getId(), K.f71697a, value2.getMaxRows(), value2.getShowSeparator(), null, 16, null)) == null) {
                vo = TapTagsV2MapperKt.toVO(TapTagsV2DTO.INSTANCE.createEmptyDTO());
            }
            this._tapTags.setValue(vo);
            return;
        }
        TapTagsV2VO value3 = this._tapTags.getValue();
        if (value3 == null || (searchText = value3.getSearchText()) == null || !searchText.equals(request.getQuery()) || (value = this._tapTags.getValue()) == null || (items = value.getItems()) == null || !(!items.isEmpty())) {
            this.fetchTapTagsJob = C10727i.c(x0.a(this), null, null, new TapTagsV2ViewModel$updateTapTags$1(this, request, null), 3);
        }
    }
}
