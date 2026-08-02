package ru.ozon.app.android.travel.molecules.view.textInfoCells.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.travel.molecules.view.textInfoCells.TextInfoCellVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/textInfoCells/adapter/TextInfoCellsAdapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/travel/molecules/view/textInfoCells/TextInfoCellVO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextInfoCellsAdapter extends AsyncListDifferDelegationAdapter<TextInfoCellVO> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInfoCellsAdapter(@NotNull Function1<? super AtomAction, Unit> onAction) {
        super(new TextInfoCellDiffUtilItemCallback());
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.delegatesManager.addDelegate(TextInfoCellsAdapterDelegateKt.getTextInfoCellsAdapterDelegate(onAction));
    }
}
