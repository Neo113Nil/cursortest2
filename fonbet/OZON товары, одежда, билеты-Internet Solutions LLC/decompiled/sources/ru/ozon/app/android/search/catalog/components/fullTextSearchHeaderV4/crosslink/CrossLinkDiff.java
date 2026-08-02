package ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.crosslink;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.presentation.FullTextSearchHeaderV4VO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/crosslink/CrossLinkDiff;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/presentation/FullTextSearchHeaderV4VO$CrosslinksVO;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/presentation/FullTextSearchHeaderV4VO$CrosslinksVO;Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/presentation/FullTextSearchHeaderV4VO$CrosslinksVO;)Z", "areContentsTheSame", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CrossLinkDiff extends i.d<FullTextSearchHeaderV4VO.CrosslinksVO> {
    @Override // androidx.recyclerview.widget.i.d
    public boolean areContentsTheSame(@NotNull FullTextSearchHeaderV4VO.CrosslinksVO oldItem, @NotNull FullTextSearchHeaderV4VO.CrosslinksVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.i.d
    public boolean areItemsTheSame(@NotNull FullTextSearchHeaderV4VO.CrosslinksVO oldItem, @NotNull FullTextSearchHeaderV4VO.CrosslinksVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem.getText(), newItem.getText());
    }
}
