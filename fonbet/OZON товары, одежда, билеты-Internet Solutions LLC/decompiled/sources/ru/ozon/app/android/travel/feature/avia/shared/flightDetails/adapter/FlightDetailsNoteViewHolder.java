package ru.ozon.app.android.travel.feature.avia.shared.flightDetails.adapter;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitle24IconCounterHolderKt;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.AviaDetailsItem;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle24IconCounterView;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/adapter/FlightDetailsNoteViewHolder;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem;", "cellView", "Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitle24IconCounterView;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitle24IconCounterView;Lkotlin/jvm/functions/Function1;)V", "dpf16", "", "background", "Landroid/graphics/drawable/ShapeDrawable;", "bind", "item", "payloads", "", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightDetailsNoteViewHolder extends BaseViewHolder<AviaDetailsItem> {

    @NotNull
    private final ShapeDrawable background;

    @NotNull
    private final CellWithSubtitle24IconCounterView cellView;
    private final float dpf16;
    private final Function1<AtomAction, Unit> onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlightDetailsNoteViewHolder(@NotNull CellWithSubtitle24IconCounterView cellView, Function1<? super AtomAction, Unit> function1) {
        super(cellView);
        Intrinsics.checkNotNullParameter(cellView, "cellView");
        this.cellView = cellView;
        this.onAction = function1;
        Context context = cellView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float pxF = ResourceExtKt.toPxF(16, context);
        this.dpf16 = pxF;
        ShapeDrawable produce = new RoundedBackgroundProducer().produce(UniColors.BG_ACCENT_PRIMARY.getResId(), pxF);
        this.background = produce;
        cellView.setBackground(produce);
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder
    public /* bridge */ /* synthetic */ void bind(AviaDetailsItem aviaDetailsItem, List list) {
        bind2(aviaDetailsItem, (List<? extends Object>) list);
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull AviaDetailsItem item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        AviaDetailsItem.NoteVO noteVO = item instanceof AviaDetailsItem.NoteVO ? (AviaDetailsItem.NoteVO) item : null;
        if (noteVO != null) {
            CellWithSubtitle24IconCounterHolderKt.bind(this.cellView, noteVO.getCell(), this.onAction);
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = this.cellView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int parseColor = styleParser.parseColor(context, noteVO.getBackgroundColor(), UniColors.BG_SECONDARY.getResId());
            CellWithSubtitle24IconCounterView cellWithSubtitle24IconCounterView = this.cellView;
            ShapeDrawable shapeDrawable = this.background;
            shapeDrawable.getPaint().setColor(parseColor);
            cellWithSubtitle24IconCounterView.setBackground(shapeDrawable);
        }
    }
}
