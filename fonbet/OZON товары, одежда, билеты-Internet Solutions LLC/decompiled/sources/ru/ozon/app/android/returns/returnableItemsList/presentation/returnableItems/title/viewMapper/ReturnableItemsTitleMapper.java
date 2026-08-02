package ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.title.viewMapper;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.returnableItemsList.data.dto.ReturnableItemDTO;
import ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.title.viewObject.Title;
import ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.title.viewObject.TitleVO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewMapper/ReturnableItemsTitleMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$TitleDTO;", "Ll20/d;", "", "Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewObject/TitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVo", "(Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$TitleDTO;Ljava/lang/String;)Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewObject/TitleVO;", "Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Title;", "Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewObject/Title;", "(Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Title;)Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewObject/Title;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$TitleDTO;Ll20/d;)Ljava/util/List;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnableItemsTitleMapper implements Function2<ReturnableItemDTO.TitleDTO, d, List<? extends TitleVO>> {
    private final TitleVO toVo(ReturnableItemDTO.TitleDTO titleDTO, String str) {
        OzonSpannableString text = titleDTO.getTitle().getText().getText();
        return new TitleVO((str + "-" + ((Object) text)).hashCode(), toVo(titleDTO.getTitle()), toVo(titleDTO.getSubtitle()));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TitleVO> invoke(@NotNull ReturnableItemDTO.TitleDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d()));
    }

    private final Title toVo(ReturnableItemDTO.Title title) {
        return new Title(title.getText(), title.getIcon(), title.getAction());
    }
}
