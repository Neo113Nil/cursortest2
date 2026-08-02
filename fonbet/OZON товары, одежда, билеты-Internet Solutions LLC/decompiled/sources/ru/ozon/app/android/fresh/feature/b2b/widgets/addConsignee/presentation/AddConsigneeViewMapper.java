package ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation;

import android.view.View;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.fresh.feature.b2b.R$layout;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.data.AddConsigneeDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.data.AddConsigneeMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.di.AddConsigneeComponent;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\nj\b\u0012\u0004\u0012\u00020\u0002`\u000b2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R<\u0010\u0018\u001a$\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0016j\b\u0012\u0004\u0012\u00020\u0004`\u00170\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/di/AddConsigneeComponent;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO;", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeMapper;", "getMapper", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeMapper;", "mapper", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddConsigneeViewMapper extends WidgetViewMapper2<AddConsigneeComponent, AddConsigneeDTO, AddConsigneeVO> {
    private final int layout = R$layout.widget_add_consignee;

    @NotNull
    private final Function2<View, ComposerReferences, k<AddConsigneeVO>> holderProducer = new AddConsigneeViewMapper$holderProducer$1(this);

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<AddConsigneeVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<AddConsigneeComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return AddConsigneeComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public AddConsigneeMapper getMapper() {
        return component().getMapper();
    }
}
