package ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.presentation.adapter;

import android.view.View;
import jk0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.presentation.BadgeListVO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/adapter/ItemViewHolder;", "Ljk0/j;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO$Item;", "item", "", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO$Item;)V", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ItemViewHolder extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public abstract void bind(@NotNull BadgeListVO.Item item);
}
