package ru.ozon.app.android.storefront.stories.setContainer.presentation.p003switch;

import AD.b;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.stories.setContainer.presentation.SetSwitch;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/stories/setContainer/presentation/switch/SetSwitchButtonViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/switch/SetSwitchButton;", "view", "Lkotlin/Function1;", "", "", "onClick", "<init>", "(Lru/ozon/app/android/storefront/stories/setContainer/presentation/switch/SetSwitchButton;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/SetSwitch;", "item", "bind", "(Lru/ozon/app/android/storefront/stories/setContainer/presentation/SetSwitch;)V", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/switch/SetSwitchButton;", "Lkotlin/jvm/functions/Function1;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SetSwitchButtonViewHolder extends RecyclerView.C {

    @NotNull
    private final Function1<Integer, Unit> onClick;

    @NotNull
    private final SetSwitchButton view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SetSwitchButtonViewHolder(@NotNull SetSwitchButton view, @NotNull Function1<? super Integer, Unit> onClick) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.view = view;
        this.onClick = onClick;
        view.setOnClickListener(new b(this, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(SetSwitchButtonViewHolder setSwitchButtonViewHolder, View view) {
        Integer valueOf = Integer.valueOf(setSwitchButtonViewHolder.getAdapterPosition());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            setSwitchButtonViewHolder.onClick.invoke(valueOf);
        }
    }

    public final void bind(@NotNull SetSwitch item) {
        Intrinsics.checkNotNullParameter(item, "item");
        SetSwitchButton setSwitchButton = this.view;
        setSwitchButton.setActivated(item.getIsSelected());
        setSwitchButton.setTitle(item.getVo().getTitle());
        setSwitchButton.setSubtitle(item.getVo().getSubtitle());
    }
}
