package ru.ozon.app.android.returns.cancels.cancelpostingsv2.core.mappers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.data.PostingModel;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.posting.PostingVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelpostingsv2/core/mappers/CancelPostingsV2PostingMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/data/PostingModel;", "Ll20/d;", "", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/posting/PostingVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/app/android/returns/cancels/cancelpostingsv2/data/PostingModel;J)Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/posting/PostingVO;", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/data/PostingModel$ItemModel;", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/posting/PostingVO$ItemVO;", "(Lru/ozon/app/android/returns/cancels/cancelpostingsv2/data/PostingModel$ItemModel;)Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/posting/PostingVO$ItemVO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "createTitleAtom", "(Ljava/lang/String;)Lru/ozon/uni/atoms/data/text/TextDTO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/returns/cancels/cancelpostingsv2/data/PostingModel;Ll20/d;)Ljava/util/List;", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CancelPostingsV2PostingMapper implements Function2<PostingModel, d, List<? extends PostingVO>> {
    private final TextDTO createTitleAtom(String title) {
        return new TextDTO(OzonSpannableStringKt.toOzonSpannableString(title), null, null, null, null, null, TextPreset.PRESET_CUSTOM, UniTextStyles.COMPACT_500_MEDIUM.getToken(), UniColors.TEXT_PRIMARY.getToken(), null, null, null, null, false, null, null, null, null, 1, 261694, null);
    }

    private final PostingVO toVo(PostingModel postingModel, long j11) {
        Boolean isSelected = postingModel.getIsSelected();
        boolean booleanValue = isSelected != null ? isSelected.booleanValue() : false;
        String title = postingModel.getTitle();
        List<PostingModel.ItemModel> items = postingModel.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVo((PostingModel.ItemModel) it.next()));
        }
        AtomActionDTO action = postingModel.getAction();
        return new PostingVO(j11, booleanValue, title, arrayList, action != null ? AtomActionMapperKt.toAtomAction(action, null) : null, postingModel.getSelectedIds(), postingModel.getTitleBadge(), createTitleAtom(postingModel.getTitle()));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PostingVO> invoke(@NotNull PostingModel state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String d11 = widgetInfo.d();
        AtomActionDTO action = state.getAction();
        return C7714v.a0(toVo(state, (d11 + "_" + action).hashCode()));
    }

    private final PostingVO.ItemVO toVo(PostingModel.ItemModel itemModel) {
        return new PostingVO.ItemVO(itemModel.getImage(), itemModel.getSubtitle());
    }
}
