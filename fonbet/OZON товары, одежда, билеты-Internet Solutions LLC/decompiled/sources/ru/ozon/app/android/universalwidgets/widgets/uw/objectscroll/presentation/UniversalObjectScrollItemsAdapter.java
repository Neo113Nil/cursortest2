package ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.C5470d;
import java.util.List;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle.LifecycleAdapter;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation.UniversalObjectScrollVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation.item.holders.ObjectScrollAdultItemViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation.item.holders.ObjectScrollItemViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation.item.views.UniversalObjectItemAdultView;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation.item.views.UniversalObjectItemView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 /2\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001:\u0001/B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u00020\b2\n\u0010\u001b\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010!\u001a\u00020\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\"\u0010&\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001a\"\u0004\b)\u0010*R\"\u0010-\u001a\u0010\u0012\f\u0012\n ,*\u0004\u0018\u00010\u001f0\u001f0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/UniversalObjectScrollItemsAdapter;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleAdapter;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/composer/ComposerReferences;Landroidx/lifecycle/J;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Ljk0/j;", "position", "getItemViewType", "(I)I", "getItemCount", "()I", "holder", "onBindViewHolder", "(Ljk0/j;I)V", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/UniversalObjectScrollVO$ObjectScrollNewItemVO;", "list", "submitList", "(Ljava/util/List;)V", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/composer/ComposerReferences;", "maxHeight", "I", "getMaxHeight", "setMaxHeight", "(I)V", "Landroidx/recyclerview/widget/d;", "kotlin.jvm.PlatformType", "asyncDiffer", "Landroidx/recyclerview/widget/d;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UniversalObjectScrollItemsAdapter extends LifecycleAdapter<j> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final C5470d<UniversalObjectScrollVO.ObjectScrollNewItemVO> asyncDiffer;
    private int maxHeight;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UniversalObjectScrollItemsAdapter(@NotNull AdultHandler adultHandler, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull ComposerReferences refs, @NotNull J lifecycleOwner) {
        super(lifecycleOwner, null, 2, null);
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.adultHandler = adultHandler;
        this.actionHandler = actionHandler;
        this.refs = refs;
        this.asyncDiffer = new C5470d<>(this, new UniversalObjectScrollDiffUtilItemCallback());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.asyncDiffer.b().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return this.asyncDiffer.b().get(position).getIsAdult() ? 1 : 2;
    }

    public final void setMaxHeight(int i11) {
        this.maxHeight = i11;
    }

    public final void submitList(@NotNull List<UniversalObjectScrollVO.ObjectScrollNewItemVO> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.asyncDiffer.e(list, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull j holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof ObjectScrollAdultItemViewHolder) {
            ObjectScrollAdultItemViewHolder objectScrollAdultItemViewHolder = (ObjectScrollAdultItemViewHolder) holder;
            objectScrollAdultItemViewHolder.setMaxTextHeight(this.maxHeight);
            UniversalObjectScrollVO.ObjectScrollNewItemVO objectScrollNewItemVO = this.asyncDiffer.b().get(position);
            Intrinsics.checkNotNullExpressionValue(objectScrollNewItemVO, "get(...)");
            objectScrollAdultItemViewHolder.bind(objectScrollNewItemVO);
            return;
        }
        if (holder instanceof ObjectScrollItemViewHolder) {
            ObjectScrollItemViewHolder objectScrollItemViewHolder = (ObjectScrollItemViewHolder) holder;
            objectScrollItemViewHolder.setMaxTextHeight(this.maxHeight);
            UniversalObjectScrollVO.ObjectScrollNewItemVO objectScrollNewItemVO2 = this.asyncDiffer.b().get(position);
            Intrinsics.checkNotNullExpressionValue(objectScrollNewItemVO2, "get(...)");
            objectScrollItemViewHolder.bind(objectScrollNewItemVO2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public j onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType != 1) {
            Function1<AtomAction, Unit> function1 = this.actionHandler;
            ComposerReferences composerReferences = this.refs;
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new ObjectScrollItemViewHolder(composerReferences, function1, new UniversalObjectItemView(context, null, 0, 0, 14, null));
        }
        AdultHandler adultHandler = this.adultHandler;
        Function1<AtomAction, Unit> function12 = this.actionHandler;
        ComposerReferences composerReferences2 = this.refs;
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return new ObjectScrollAdultItemViewHolder(composerReferences2, adultHandler, function12, new UniversalObjectItemAdultView(context2, null, 0, 0, 14, null));
    }
}
