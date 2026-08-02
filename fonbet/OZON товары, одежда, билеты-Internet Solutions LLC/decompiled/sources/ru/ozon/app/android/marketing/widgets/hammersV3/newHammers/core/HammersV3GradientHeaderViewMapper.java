package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core;

import Nk.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import gk0.q;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3GradientHeaderDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.di.HammersV3Component;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.HammersV3GradientHeaderViewHolder;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.model.HammersV3GradientHeaderVO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.view.HammersV3GradientHeaderView;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0019j\b\u0012\u0004\u0012\u00020\u0002`\u001a2\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R,\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/core/HammersV3GradientHeaderViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/di/HammersV3Component;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3GradientHeaderDTO;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3GradientHeaderVO;", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/view/HammersV3GradientHeaderView;", "createHammersV3GradientHeaderView", "(Landroid/content/Context;)Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/view/HammersV3GradientHeaderView;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/HammersV3GradientHeaderViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/core/HammersV3GradientHeaderMapper;", "getMapper", "()Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/core/HammersV3GradientHeaderMapper;", "mapper", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HammersV3GradientHeaderViewMapper extends WidgetViewMapper2<HammersV3Component, HammersV3GradientHeaderDTO, HammersV3GradientHeaderVO> {

    @NotNull
    private final Function2<View, ComposerReferences, HammersV3GradientHeaderViewHolder> holderProducer = new HammersV3GradientHeaderViewMapper$holderProducer$1(this);
    private final Integer layout;

    private final HammersV3GradientHeaderView createHammersV3GradientHeaderView(Context context) {
        HammersV3GradientHeaderView hammersV3GradientHeaderView = (HammersV3GradientHeaderView) q.f64554a.i(N.b(HammersV3GradientHeaderView.class), context);
        return hammersV3GradientHeaderView == null ? new HammersV3GradientHeaderView(context, null, 0, 0, 14, null) : hammersV3GradientHeaderView;
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof HammersV3GradientHeaderDTO;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        return createHammersV3GradientHeaderView(a.a(parent, "parent", "getContext(...)"));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, HammersV3GradientHeaderViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<HammersV3Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return HammersV3Component.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public HammersV3GradientHeaderMapper getMapper() {
        return component().getGradientHeaderMapper();
    }
}
