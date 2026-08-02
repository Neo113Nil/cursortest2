package ru.ozon.app.android.common.taglist.taglistv2.presentation.scrollingtaglist;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.taglist.TagListViewType;
import ru.ozon.app.android.common.taglist.taglistv2.data.TagListDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\f\u0010\u0004\u001a\u00020\u0002*\u00020\u0003H\u0002¨\u0006\u0005"}, d2 = {"toScrollVO", "", "Lru/ozon/app/android/common/taglist/taglistv2/presentation/scrollingtaglist/ScrollingTagListVO;", "Lru/ozon/app/android/common/taglist/taglistv2/data/TagListDTO;", "toScrollTagListItem", "taglist_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ScrollingTagListVOKt {
    private static final ScrollingTagListVO toScrollTagListItem(TagListDTO tagListDTO) {
        return new ScrollingTagListVO(tagListDTO.getTags(), tagListDTO.hashCode());
    }

    @NotNull
    public static final List<ScrollingTagListVO> toScrollVO(@NotNull TagListDTO tagListDTO) {
        Intrinsics.checkNotNullParameter(tagListDTO, "<this>");
        return tagListDTO.getView() == TagListViewType.VIEW_TYPE_SCROLL ? C7714v.a0(toScrollTagListItem(tagListDTO)) : K.f71697a;
    }
}
