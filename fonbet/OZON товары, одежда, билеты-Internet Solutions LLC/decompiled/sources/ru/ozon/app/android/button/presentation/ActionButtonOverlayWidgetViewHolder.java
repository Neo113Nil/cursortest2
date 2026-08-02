package ru.ozon.app.android.button.presentation;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.button.actions.BaseActionConfig;
import ru.ozon.app.android.button.databinding.WidgetButtonBlockLayoutBinding;
import ru.ozon.app.android.button.presentation.adapter.ButtonsAdapter;
import ru.ozon.app.android.button.presentation.adapter.SpacesItemDecoration;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/button/presentation/ActionButtonOverlayWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/button/presentation/ActionButtonVO;", "Lru/ozon/app/android/button/databinding/WidgetButtonBlockLayoutBinding;", "binding", "", "", "Lru/ozon/app/android/button/actions/BaseActionConfig;", "actions", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/app/android/button/databinding/WidgetButtonBlockLayoutBinding;Ljava/util/Map;Ll10/i;Ld20/e;)V", "item", "", "bind", "(Lru/ozon/app/android/button/presentation/ActionButtonVO;)V", "Lru/ozon/app/android/button/presentation/adapter/ButtonsAdapter;", "buttonsAdapter", "Lru/ozon/app/android/button/presentation/adapter/ButtonsAdapter;", "button_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActionButtonOverlayWidgetViewHolder extends AbstractC6064a<ActionButtonVO> {

    @NotNull
    private final ButtonsAdapter buttonsAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionButtonOverlayWidgetViewHolder(@NotNull WidgetButtonBlockLayoutBinding binding, @NotNull Map<String, ? extends BaseActionConfig<?>> actions, @NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        ButtonsAdapter buttonsAdapter = new ButtonsAdapter(container.b0(), actions, new ActionButtonOverlayWidgetViewHolder$buttonsAdapter$1(this));
        this.buttonsAdapter = buttonsAdapter;
        RecyclerView recyclerView = binding.buttonsRv;
        recyclerView.setAdapter(buttonsAdapter);
        recyclerView.addItemDecoration(new SpacesItemDecoration(16));
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ActionButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.buttonsAdapter.setItems(item.getButtons());
    }
}
