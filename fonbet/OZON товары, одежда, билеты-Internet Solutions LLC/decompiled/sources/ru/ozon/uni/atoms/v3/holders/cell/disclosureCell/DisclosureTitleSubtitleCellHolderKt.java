package ru.ozon.uni.atoms.v3.holders.cell.disclosureCell;

import Sc.InterfaceC3999a;
import android.content.Context;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.cell.disclosure.data.DisclosureCellApi;
import ru.ozon.uni.android.cell.disclosure.disclosureTitleSubtitleCell.DisclosureTitleSubtitleCellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.DisclosureTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.utils.BindExtKt;
import ru.ozon.uni.atoms.v3.holders.cell.titleSubtitle.TitleSubtitleCellHolderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\u000e\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/uni/android/cell/disclosure/disclosureTitleSubtitleCell/DisclosureTitleSubtitleCellView;", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subTitle", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "icon", "", "bindCellData", "(Lru/ozon/uni/android/cell/disclosure/disclosureTitleSubtitleCell/DisclosureTitleSubtitleCellView;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;)V", "Lru/ozon/uni/atoms/data/cell/DisclosureTitleSubtitleCellDTO;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bind", "(Lru/ozon/uni/android/cell/disclosure/disclosureTitleSubtitleCell/DisclosureTitleSubtitleCellView;Lru/ozon/uni/atoms/data/cell/DisclosureTitleSubtitleCellDTO;Lkotlin/jvm/functions/Function1;)V", "bindOrGone", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DisclosureTitleSubtitleCellHolderKt {
    @InterfaceC3999a
    public static final void bind(@NotNull DisclosureTitleSubtitleCellView disclosureTitleSubtitleCellView, @NotNull DisclosureTitleSubtitleCellDTO dto, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(disclosureTitleSubtitleCellView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(disclosureTitleSubtitleCellView, dto, new DisclosureTitleSubtitleCellHolderKt$bind$provider$1(disclosureTitleSubtitleCellView), function1);
    }

    @InterfaceC3999a
    public static final void bindCellData(@NotNull DisclosureTitleSubtitleCellView disclosureTitleSubtitleCellView, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomIconDTO commonAtomIconDTO) {
        Intrinsics.checkNotNullParameter(disclosureTitleSubtitleCellView, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        TitleSubtitleCellHolderKt.bindCellData(disclosureTitleSubtitleCellView.getMainView(), title, commonAtomLabelDTO);
        if (commonAtomIconDTO != null) {
            if (commonAtomIconDTO.getTintColor() == null) {
                disclosureTitleSubtitleCellView.clearDisclosureColor$uni_release();
            } else {
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context = disclosureTitleSubtitleCellView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Integer mapColor = styleParser.mapColor(context, commonAtomIconDTO.getTintColor());
                if (mapColor != null) {
                    DisclosureCellApi.DefaultImpls.setDisclosureIconColor$default(disclosureTitleSubtitleCellView, a.getColor(disclosureTitleSubtitleCellView.getContext(), mapColor.intValue()), 0.0f, 2, null);
                }
            }
            Context context2 = disclosureTitleSubtitleCellView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            disclosureTitleSubtitleCellView.setDisclosureIcon(TokensExtKt.getIconResByToken(context2, commonAtomIconDTO.getIcon()));
        }
        disclosureTitleSubtitleCellView.setDisclosureVisible(commonAtomIconDTO != null);
    }

    @InterfaceC3999a
    public static final void bindOrGone(@NotNull DisclosureTitleSubtitleCellView disclosureTitleSubtitleCellView, DisclosureTitleSubtitleCellDTO disclosureTitleSubtitleCellDTO, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(disclosureTitleSubtitleCellView, "<this>");
        if (disclosureTitleSubtitleCellDTO == null) {
            disclosureTitleSubtitleCellView.setVisibility(8);
        } else {
            disclosureTitleSubtitleCellView.setVisibility(0);
            bind(disclosureTitleSubtitleCellView, disclosureTitleSubtitleCellDTO, function1);
        }
    }
}
