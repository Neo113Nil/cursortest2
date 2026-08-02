package ru.ozon.app.android.storefront.stories.setContainer.presentation.p003switch;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.stories.setContainer.presentation.SetSwitch;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/stories/setContainer/presentation/switch/SetSwitchButtonsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/SetSwitch;", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/switch/SetSwitchButtonViewHolder;", "Lkotlin/Function1;", "", "", "onClick", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/storefront/stories/setContainer/presentation/switch/SetSwitchButtonViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/storefront/stories/setContainer/presentation/switch/SetSwitchButtonViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SetSwitchButtonsAdapter extends t<SetSwitch, SetSwitchButtonViewHolder> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int buttonHeight = ResourceExtKt.toPx(32);

    @NotNull
    private final Function1<Integer, Unit> onClick;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/stories/setContainer/presentation/switch/SetSwitchButtonsAdapter$Companion;", "", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SetSwitchButtonsAdapter(@NotNull Function1<? super Integer, Unit> onClick) {
        super(new SetSwitchItemCallback());
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.onClick = onClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull SetSwitchButtonViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        SetSwitch item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public SetSwitchButtonViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SetSwitchButton setSwitchButton = new SetSwitchButton(context, null, 0, 0, 14, null);
        setSwitchButton.setLayoutParams(new ViewGroup.LayoutParams(-2, buttonHeight));
        return new SetSwitchButtonViewHolder(setSwitchButton, this.onClick);
    }
}
