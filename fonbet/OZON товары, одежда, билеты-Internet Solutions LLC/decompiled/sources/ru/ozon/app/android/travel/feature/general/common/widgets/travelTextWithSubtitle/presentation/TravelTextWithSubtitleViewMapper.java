package ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithSubtitle.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import gk0.q;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithSubtitle.data.TravelTextWithSubtitleDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithSubtitle.di.TravelTextWithSubtitleComponent;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R,\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR0\u0010$\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060 j\u0002`!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\"0\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001f¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithSubtitle/presentation/TravelTextWithSubtitleViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithSubtitle/di/TravelTextWithSubtitleComponent;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithSubtitle/data/TravelTextWithSubtitleDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithSubtitle/presentation/TravelTextWithSubtitleVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/widget/LinearLayout;", "createView", "(Landroid/view/ViewGroup;)Landroid/widget/LinearLayout;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithSubtitle/presentation/TravelTextWithSubtitleWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "getMapper", "mapper", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelTextWithSubtitleViewMapper extends WidgetViewMapper2<TravelTextWithSubtitleComponent, TravelTextWithSubtitleDTO, TravelTextWithSubtitleVO> {

    @NotNull
    private final Function2<View, ComposerReferences, TravelTextWithSubtitleWidgetViewHolder> holderProducer = TravelTextWithSubtitleViewMapper$holderProducer$1.INSTANCE;
    private final Integer layout;

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, TravelTextWithSubtitleWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TravelTextWithSubtitleDTO, d, List<TravelTextWithSubtitleVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TravelTextWithSubtitleComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return TravelTextWithSubtitleComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public LinearLayout createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LinearLayout linearLayout = new LinearLayout(parent.getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(0);
        for (int i11 = 0; i11 < 2; i11++) {
            q qVar = q.f64554a;
            kotlin.reflect.d b11 = N.b(TextAtomView.class);
            Context context = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            linearLayout.addView((TextAtomView) qVar.g(b11, context));
        }
        return linearLayout;
    }
}
