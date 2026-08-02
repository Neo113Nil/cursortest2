package ru.ozon.app.android.search.widgets.feedbackTile.presentation.adapter;

import Nk.a;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.t;
import com.google.android.flexbox.FlexboxLayoutManager;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.feedbackTile.presentation.FeedbackTileView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackTile/presentation/adapter/FeedbackTileAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/app/android/search/widgets/feedbackTile/presentation/adapter/FeedbackButtonViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "createButtonV3View", "(Landroid/content/Context;)Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/search/widgets/feedbackTile/presentation/adapter/FeedbackButtonViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/search/widgets/feedbackTile/presentation/adapter/FeedbackButtonViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FeedbackTileAdapter extends t<ButtonV3DTO, FeedbackButtonViewHolder> {
    private final Function1<AtomAction, Unit> actionHandler;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedbackTileAdapter(Function1<? super AtomAction, Unit> function1) {
        super(new FeedbackTileCallback());
        this.actionHandler = function1;
    }

    private final ButtonV3View createButtonV3View(Context context) {
        ButtonV3View buttonV3View = (ButtonV3View) q.f64554a.i(N.b(ButtonV3View.class), context);
        return buttonV3View == null ? new ButtonV3View(context, null, 0, 0, 14, null) : buttonV3View;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull FeedbackButtonViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ButtonV3DTO item = getItem(position);
        Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO");
        holder.bind(item, this.actionHandler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public FeedbackButtonViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        ButtonV3View createButtonV3View = createButtonV3View(a.a(parent, "parent", "getContext(...)"));
        FlexboxLayoutManager.b bVar = new FlexboxLayoutManager.b(-2, -2);
        FeedbackTileView.Companion companion = FeedbackTileView.INSTANCE;
        bVar.setMarginStart(companion.getITEM_PADDING());
        bVar.setMarginEnd(companion.getITEM_PADDING());
        bVar.d();
        createButtonV3View.setLayoutParams(bVar);
        return new FeedbackButtonViewHolder(createButtonV3View);
    }
}
