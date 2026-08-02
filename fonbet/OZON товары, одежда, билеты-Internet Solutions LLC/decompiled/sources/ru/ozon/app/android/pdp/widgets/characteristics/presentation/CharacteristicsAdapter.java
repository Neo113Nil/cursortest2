package ru.ozon.app.android.pdp.widgets.characteristics.presentation;

import WZ.l;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.widgets.characteristics.presentation.characteristics.CharacteristicsValueVH;
import ru.ozon.app.android.pdp.widgets.characteristics.presentation.characteristics.CharacteristicsValueView;
import ru.ozon.app.android.pdp.widgets.characteristics.presentation.simpleCharacteristics.CharacteristicsSimpleValueVH;
import ru.ozon.app.android.pdp.widgets.characteristics.presentation.simpleCharacteristics.CharacteristicsSimpleValueView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsItem;", "Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsVH;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lkotlin/jvm/functions/Function1;LWZ/l;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsVH;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsVH;I)V", "getItemViewType", "(I)I", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CharacteristicsAdapter extends t<CharacteristicsItem, CharacteristicsVH> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CharacteristicsAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics) {
        super(new i.d<CharacteristicsItem>() { // from class: ru.ozon.app.android.pdp.widgets.characteristics.presentation.CharacteristicsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(CharacteristicsItem oldItem, CharacteristicsItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(CharacteristicsItem oldItem, CharacteristicsItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return getCurrentList().get(position).getViewType().getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull CharacteristicsVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        CharacteristicsItem characteristicsItem = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(characteristicsItem, "get(...)");
        holder.bind(characteristicsItem);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public CharacteristicsVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == CharacteristicsType.HEADER.getValue()) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
            textAtomV2View.setId(R$id.headerTitleTav);
            return new CharacteristicsHeaderVH(textAtomV2View);
        }
        if (viewType == CharacteristicsType.SIMPLE_VALUE.getValue()) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            return new CharacteristicsSimpleValueVH(new CharacteristicsSimpleValueView(context2), this.actionHandler, this.tokenizedAnalytics);
        }
        Context context3 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        return new CharacteristicsValueVH(new CharacteristicsValueView(context3), this.actionHandler, this.tokenizedAnalytics);
    }
}
