package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.title;

import android.content.Context;
import android.text.SpannableStringBuilder;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.utils.CharSequenceExtensionKt;
import ru.ozon.app.android.atoms.v3.containers.VerticalRecyclerContainer;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.orderdetails.databinding.ItemOrderShipmentLayoutTitleBinding;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.data.OrderShipmentItemDTO;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.ChunksMapperKt;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.OrderShipmentItemVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeBorderlessButtonHolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\t*\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00170\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/title/TitleOrderShipmentViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$TitleVO;", "Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentLayoutTitleBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentLayoutTitleBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$Line;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "toColoredLines", "(Ljava/util/List;)Ljava/util/List;", "lines", "Landroid/content/Context;", "context", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "generateColoredStringsFromLines", "(Ljava/util/List;Landroid/content/Context;)Ljava/util/List;", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$TitleVO;Ll20/d;)V", "Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentLayoutTitleBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onButtonClickedAction", "Lkotlin/jvm/functions/Function1;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TitleOrderShipmentViewHolder extends k<OrderShipmentItemVO.TitleVO> {

    @NotNull
    private final ItemOrderShipmentLayoutTitleBinding binding;

    @NotNull
    private final Function1<AtomAction, Unit> onButtonClickedAction;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TitleOrderShipmentViewHolder(@NotNull ItemOrderShipmentLayoutTitleBinding binding, @NotNull ComposerReferences references) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.onButtonClickedAction = new ActionHandler.Builder(references, this).buildHandler();
    }

    private final List<OzonSpannableString> generateColoredStringsFromLines(List<OrderShipmentItemDTO.Line> lines, Context context) {
        List<OrderShipmentItemDTO.Line> list = lines;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (OrderShipmentItemDTO.Line line : list) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            List<OrderShipmentItemDTO.TextChunk> chunks = line.getChunks();
            ArrayList arrayList2 = new ArrayList(C7714v.z(chunks, 10));
            Iterator<T> it = chunks.iterator();
            while (it.hasNext()) {
                arrayList2.add(spannableStringBuilder.append(CharSequenceExtensionKt.setColor(((OrderShipmentItemDTO.TextChunk) it.next()).getText(), ThemeExtKt.themeColor(context, R$attr.textPrimary))));
            }
            arrayList.add(OzonSpannableStringKt.toOzonSpannableString(spannableStringBuilder));
        }
        return arrayList;
    }

    private final List<TextAtom> toColoredLines(List<OrderShipmentItemDTO.Line> list) {
        List<OzonSpannableString> generateColoredStringsFromLines = generateColoredStringsFromLines(list, getContext());
        ArrayList arrayList = new ArrayList(C7714v.z(generateColoredStringsFromLines, 10));
        Iterator<T> it = generateColoredStringsFromLines.iterator();
        while (it.hasNext()) {
            arrayList.add(new TextAtom(OzonSpannableStringKt.toOzonSpannableString((OzonSpannableString) it.next()), StyleParser.TextStyle.BODY_L.getStyleName(), null, null, null, null, null, 124, null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderShipmentItemVO.TitleVO item, @NotNull d info) {
        List<TextAtom> coloredLines;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ItemOrderShipmentLayoutTitleBinding itemOrderShipmentLayoutTitleBinding = this.binding;
        itemOrderShipmentLayoutTitleBinding.textTv.setText(ChunksMapperKt.extractColoredSpannableText$default(item.getText(), getContext(), 0, 2, null));
        AppCompatImageView iconIv = itemOrderShipmentLayoutTitleBinding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        ImageViewExtKt.loadImageOrGone(iconIv, item.getIcon());
        List<OrderShipmentItemDTO.Line> lines = item.getLines();
        if (lines == null || (coloredLines = toColoredLines(lines)) == null) {
            VerticalRecyclerContainer linesContainerVRC = itemOrderShipmentLayoutTitleBinding.linesContainerVRC;
            Intrinsics.checkNotNullExpressionValue(linesContainerVRC, "linesContainerVRC");
            ViewExtKt.gone(linesContainerVRC);
        } else {
            VerticalRecyclerContainer linesContainerVRC2 = itemOrderShipmentLayoutTitleBinding.linesContainerVRC;
            Intrinsics.checkNotNullExpressionValue(linesContainerVRC2, "linesContainerVRC");
            ViewExtKt.show(linesContainerVRC2);
            itemOrderShipmentLayoutTitleBinding.linesContainerVRC.bind(coloredLines);
        }
        LargeBorderlessButtonView buttonSBA = itemOrderShipmentLayoutTitleBinding.buttonSBA;
        Intrinsics.checkNotNullExpressionValue(buttonSBA, "buttonSBA");
        LargeBorderlessButtonHolderKt.bindOrGone(buttonSBA, item.getButton(), this.onButtonClickedAction);
    }
}
