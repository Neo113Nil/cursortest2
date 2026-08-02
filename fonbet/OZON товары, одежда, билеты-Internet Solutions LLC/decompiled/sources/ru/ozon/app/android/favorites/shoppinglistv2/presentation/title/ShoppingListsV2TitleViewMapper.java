package ru.ozon.app.android.favorites.shoppinglistv2.presentation.title;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;
import k20.C7471c;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.favorites.feature.R$id;
import ru.ozon.app.android.favorites.shoppinglistv2.data.ShoppingListsV2DTO;
import ru.ozon.app.android.favorites.shoppinglistv2.presentation.ShoppingListsV2TitleMapper;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001f2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001fB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R6\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0013j\u0002`\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00150\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R,\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019¨\u0006 "}, d2 = {"Lru/ozon/app/android/favorites/shoppinglistv2/presentation/title/ShoppingListsV2TitleViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "", "Lru/ozon/app/android/favorites/shoppinglistv2/data/ShoppingListsV2DTO;", "Lru/ozon/app/android/favorites/shoppinglistv2/presentation/title/ShoppingListsV2TitleVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroidx/appcompat/widget/AppCompatTextView;", "createView", "(Landroid/view/ViewGroup;)Landroidx/appcompat/widget/AppCompatTextView;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/c;", "widgetComponent", "(Lk20/g;)Lk20/c;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/favorites/shoppinglistv2/presentation/title/ShoppingListsV2TitleViewHolder;", "holderProducer", "getHolderProducer", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShoppingListsV2TitleViewMapper extends WidgetViewMapper2 {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int DP_8 = UiExtKt.toPx(8);
    private static final int DP_16 = UiExtKt.toPx(16);

    @NotNull
    private final Function2<ShoppingListsV2DTO, d, List<ShoppingListsV2TitleVO>> mapper = new ShoppingListsV2TitleMapper();

    @NotNull
    private final Function2<View, ComposerReferences, ShoppingListsV2TitleViewHolder> holderProducer = ShoppingListsV2TitleViewMapper$holderProducer$1.INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/favorites/shoppinglistv2/presentation/title/ShoppingListsV2TitleViewMapper$Companion;", "", "<init>", "()V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, ShoppingListsV2TitleViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<ShoppingListsV2DTO, d, List<ShoppingListsV2TitleVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public AppCompatTextView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        AppCompatTextView appCompatTextView = new AppCompatTextView(parent.getContext());
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        int i11 = DP_16;
        appCompatTextView.setPadding(i11, i11, i11, DP_8);
        appCompatTextView.setId(R$id.titleTv);
        Context context = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextViewExtKt.applyStyle(appCompatTextView, context, R$style.TextStyle_Body_L_Bold);
        appCompatTextView.setBackgroundColor(appCompatTextView.getResources().getColor(R$color.layer_floor_1, appCompatTextView.getContext().getTheme()));
        return appCompatTextView;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7471c widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return C7471c.f70357c;
    }
}
