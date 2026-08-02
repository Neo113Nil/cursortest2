package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.rv;

import android.view.View;
import jk0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.ObjectItemVO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/rv/BindableUwViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO;", "item", "", "position", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/rv/UwAdapterData;", "adapterData", "", "bind", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO;ILru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/rv/UwAdapterData;)V", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BindableUwViewHolder extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BindableUwViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public abstract void bind(@NotNull ObjectItemVO item, int position, @NotNull UwAdapterData adapterData);
}
