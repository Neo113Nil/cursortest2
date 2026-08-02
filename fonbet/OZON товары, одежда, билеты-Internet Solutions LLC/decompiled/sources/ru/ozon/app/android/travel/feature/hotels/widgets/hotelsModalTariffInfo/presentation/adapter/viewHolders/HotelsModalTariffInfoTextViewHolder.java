package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.presentation.adapter.viewHolders;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.presentation.HotelsModalTariffInfoVI;
import ru.ozon.app.android.travel.utils.extensions.TextDTOExtensionsKt;
import ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/adapter/viewHolders/HotelsModalTariffInfoTextViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/adapter/viewHolders/HotelsModalTariffInfoViewHolder;", "text", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "<init>", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;)V", "bind", "", "item", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI$AtomWrapperVI;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsModalTariffInfoTextViewHolder extends HotelsModalTariffInfoViewHolder {
    public static final int $stable = TextAtomV2View.$stable;

    @NotNull
    private final TextAtomV2View text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsModalTariffInfoTextViewHolder(@NotNull TextAtomV2View text) {
        super(text, null);
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.presentation.adapter.viewHolders.HotelsModalTariffInfoViewHolder
    public void bind(@NotNull HotelsModalTariffInfoVI.AtomWrapperVI item, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof HotelsModalTariffInfoVI.TextAtomWrapper) {
            HotelsModalTariffInfoVI.TextAtomWrapper textAtomWrapper = (HotelsModalTariffInfoVI.TextAtomWrapper) item;
            TextHolderKt.bind(this.text, TextDTOExtensionsKt.withNavigationLinksHandling(textAtomWrapper.getAtom(), this.text, onAction), onAction);
            ViewExtensionsKt.safeUpdateMargins$default(this.text, Integer.valueOf(textAtomWrapper.getTopMargin()), null, Integer.valueOf(textAtomWrapper.getStartMargin()), Integer.valueOf(textAtomWrapper.getEndMargin()), 2, null);
        }
    }
}
