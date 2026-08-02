package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.viewModelDelegate;

import androidx.lifecycle.P;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.TagsWithTitleFilterVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.TagsWithTitleSectionInTabVO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/viewModelDelegate/TagWithTitleSectionViewModel;", "", "Landroidx/lifecycle/P;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/TagsWithTitleSectionInTabVO;", "onTagsBindLiveData", "()Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/TagsWithTitleFilterVO;", "tagsWithTitle", "", "setTagsModel", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/TagsWithTitleFilterVO;)V", "", "tabIndex", "onTabSelect", "(I)V", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TagWithTitleSectionViewModel {
    void onTabSelect(int tabIndex);

    @NotNull
    P<List<TagsWithTitleSectionInTabVO>> onTagsBindLiveData();

    void setTagsModel(@NotNull TagsWithTitleFilterVO tagsWithTitle);
}
