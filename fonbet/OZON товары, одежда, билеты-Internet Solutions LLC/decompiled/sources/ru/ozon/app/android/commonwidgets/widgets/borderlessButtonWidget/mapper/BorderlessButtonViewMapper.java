package ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.mapper;

import CA.a;
import android.view.View;
import android.view.ViewGroup;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.data.BorderlessButtonDTO;
import ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.di.BorderlessButtonComponent;
import ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.di.DaggerBorderlessButtonComponent;
import ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.presentation.BorderlessButtonVO;
import ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.presentation.BorderlessButtonViewFactory;
import ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.presentation.BorderlessButtonWidgetViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R,\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/mapper/BorderlessButtonViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/di/BorderlessButtonComponent;", "Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/data/BorderlessButtonDTO;", "Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/presentation/BorderlessButtonVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "Ljava/lang/Void;", "getLayout", "()Ljava/lang/Void;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/presentation/BorderlessButtonWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/presentation/BorderlessButtonViewFactory;", "getViewFactory", "()Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/presentation/BorderlessButtonViewFactory;", "viewFactory", "Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/mapper/BorderlessButtonMapper;", "getMapper", "()Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/mapper/BorderlessButtonMapper;", "mapper", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BorderlessButtonViewMapper extends WidgetViewMapper2<BorderlessButtonComponent, BorderlessButtonDTO, BorderlessButtonVO> {

    @NotNull
    private final Function2<View, ComposerReferences, BorderlessButtonWidgetViewHolder> holderProducer = new BorderlessButtonViewMapper$holderProducer$1(this);
    private final Void layout;

    private final BorderlessButtonViewFactory getViewFactory() {
        return component().getViewFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BorderlessButtonComponent widgetComponent$lambda$0(C7475g c7475g) {
        return DaggerBorderlessButtonComponent.factory().create((CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class));
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return getViewFactory().create(parent);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, BorderlessButtonWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Integer getLayout() {
        return (Integer) getLayout();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<BorderlessButtonComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(BorderlessButtonComponent.class), new a(storage, 9));
    }

    public Void getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public BorderlessButtonMapper getMapper() {
        return component().getMapper();
    }
}
