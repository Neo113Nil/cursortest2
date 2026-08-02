package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.view;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.common.ext.Dimens;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/view/ParcelPhotoAddView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParcelPhotoAddView extends RecyclerView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParcelPhotoAddView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new RecyclerView.p(-1, -2));
        setLayoutManager(new LinearLayoutManager(context) { // from class: ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.view.ParcelPhotoAddView.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
            public boolean canScrollHorizontally() {
                return false;
            }
        });
        setNestedScrollingEnabled(false);
        Dimens dimens = Dimens.INSTANCE;
        addItemDecoration(new MarginItemDecoration(dimens.getDp4(), dimens.getDp16(), dimens.getDp16()));
        setItemAnimator(null);
        StyleParser styleParser = StyleParser.INSTANCE;
        UniColors uniColors = UniColors.LAYER_FLOOR_1;
        setBackgroundColor(styleParser.parseColor(context, uniColors.getToken(), uniColors.getResId()));
    }
}
