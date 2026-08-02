package ru.ozon.app.android.button.presentation;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.button.actions.BaseActionConfig;
import ru.ozon.app.android.button.databinding.WidgetButtonBlockLayoutBinding;
import ru.ozon.app.android.button.presentation.adapter.ButtonsAdapter;
import ru.ozon.app.android.button.presentation.adapter.SpacesItemDecoration;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/button/presentation/ActionButtonWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/button/presentation/ActionButtonVO;", "Lru/ozon/app/android/button/databinding/WidgetButtonBlockLayoutBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "reference", "", "", "Lru/ozon/app/android/button/actions/BaseActionConfig;", "actions", "<init>", "(Lru/ozon/app/android/button/databinding/WidgetButtonBlockLayoutBinding;Lru/ozon/app/android/composer/ComposerReferences;Ljava/util/Map;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/button/presentation/ActionButtonVO;Ll20/d;)V", "Lru/ozon/app/android/button/presentation/adapter/ButtonsAdapter;", "adapter", "Lru/ozon/app/android/button/presentation/adapter/ButtonsAdapter;", "button_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActionButtonWidgetViewHolder extends k<ActionButtonVO> {

    @NotNull
    private final ButtonsAdapter adapter;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ActionButtonWidgetViewHolder(@NotNull WidgetButtonBlockLayoutBinding binding, @NotNull ComposerReferences reference, @NotNull Map<String, ? extends BaseActionConfig<?>> actions) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(actions, "actions");
        RecyclerView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ButtonsAdapter buttonsAdapter = new ButtonsAdapter(reference.getViewModelOwnerProvider(), actions, new ActionButtonWidgetViewHolder$adapter$1(this));
        this.adapter = buttonsAdapter;
        RecyclerView recyclerView = binding.buttonsRv;
        recyclerView.setAdapter(buttonsAdapter);
        recyclerView.addItemDecoration(new SpacesItemDecoration(16));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ActionButtonVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.adapter.setItems(item.getButtons());
    }
}
