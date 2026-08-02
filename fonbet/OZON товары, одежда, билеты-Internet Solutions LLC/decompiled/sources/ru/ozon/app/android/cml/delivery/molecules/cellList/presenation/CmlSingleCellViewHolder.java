package ru.ozon.app.android.cml.delivery.molecules.cellList.presenation;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.content.a;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.molecules.cellList.presenation.CellItem;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonViewApi;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R$\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CmlSingleCellViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "singleAtom", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/uni/atoms/v3/containers/SingleAtom;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "padding", "", "getDimension", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)I", "", "hasSeparator", "setSeparator", "(Z)V", "Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CellItem;", "item", "", "corners", "setIsland", "(Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CellItem;[F)V", "", "colorToken", "defaultColor", "getColorByDsToken", "(Ljava/lang/String;I)I", "bind", "(Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CellItem;)V", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "Lkotlin/Pair;", "originalVerticalPadding", "Lkotlin/Pair;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CmlSingleCellViewHolder extends RecyclerView.C {
    private Pair<Integer, Integer> originalVerticalPadding;

    @NotNull
    private final SingleAtom singleAtom;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CmlSingleCellViewHolder(@NotNull SingleAtom singleAtom, Function1<? super AtomAction, Unit> function1) {
        super(singleAtom);
        Intrinsics.checkNotNullParameter(singleAtom, "singleAtom");
        this.singleAtom = singleAtom;
        singleAtom.setOnAction(function1);
    }

    private final int getColorByDsToken(String colorToken, int defaultColor) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer mapColor = styleParser.mapColor(context, colorToken);
        Context context2 = this.itemView.getContext();
        if (mapColor != null) {
            defaultColor = mapColor.intValue();
        }
        return a.getColor(context2, defaultColor);
    }

    private final int getDimension(CommonCellSettings.LayoutPadding padding) {
        return (int) this.itemView.getResources().getDimension(padding.getCellLayoutPadding());
    }

    private final void setIsland(CellItem item, float[] corners) {
        CornerRadius cornerRadius;
        int colorByDsToken = getColorByDsToken(item.getIslandColor(), R$color.transparent);
        this.singleAtom.setBackgroundColor(getColorByDsToken(item.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()));
        for (View view : ViewGroupExtKt.children(this.singleAtom)) {
            if (this.originalVerticalPadding == null) {
                this.originalVerticalPadding = new Pair<>(Integer.valueOf(view.getPaddingTop()), Integer.valueOf(view.getPaddingBottom()));
            }
            Pair<Integer, Integer> pair = this.originalVerticalPadding;
            if (pair == null) {
                pair = new Pair<>(0, 0);
            }
            view.setPadding(getDimension(item.getLeftPadding()), item.getLayoutModel().getPaddingTop() + pair.a().intValue(), getDimension(item.getRightPadding()), item.getLayoutModel().getPaddingBottom() + pair.b().intValue());
            CellDTO cell = item.getCell();
            CellDTO.Settings settings = cell.getSettings();
            int colorByDsToken2 = getColorByDsToken(settings != null ? settings.getBackgroundColor() : null, R$color.transparent);
            float[] fArr = new float[8];
            for (int i11 = 0; i11 < 8; i11++) {
                CellDTO.Settings settings2 = cell.getSettings();
                fArr[i11] = UiExtKt.toPxF((settings2 == null || (cornerRadius = settings2.getCornerRadius()) == null) ? 0 : cornerRadius.getPx());
            }
            view.setClipToOutline(true);
            view.setBackground(new CellDrawable(colorByDsToken, colorByDsToken2, corners, fArr, item.getLayoutModel().getPaddingTop(), item.getLayoutModel().getPaddingBottom()));
        }
    }

    private final void setSeparator(boolean hasSeparator) {
        KeyEvent.Callback childAt = this.singleAtom.getChildAt(0);
        if (childAt instanceof MainAddonViewApi) {
            ((MainAddonViewApi) childAt).setHasSeparator(hasSeparator);
        } else if (childAt instanceof CellView) {
            ((CellView) childAt).setHasSeparator(hasSeparator);
        }
    }

    public final void bind(@NotNull CellItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.singleAtom.bind(item.getCell(), true);
        CellItem.LayoutModel layoutModel = item.getLayoutModel();
        this.singleAtom.setPadding(getDimension(item.getLeftMargin()), getDimension(layoutModel.getTopMargin()), getDimension(item.getRightMargin()), getDimension(layoutModel.getBottomMargin()));
        setIsland(item, new float[]{layoutModel.getTopCornerRadius(), layoutModel.getTopCornerRadius(), layoutModel.getTopCornerRadius(), layoutModel.getTopCornerRadius(), layoutModel.getBottomCornerRadius(), layoutModel.getBottomCornerRadius(), layoutModel.getBottomCornerRadius(), layoutModel.getBottomCornerRadius()});
        setSeparator(layoutModel.getHasSeparator());
    }
}
