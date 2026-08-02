package ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.data.PromoCarouselDTO;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.di.PromoCarouselComponent;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 +2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001+B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R,\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR(\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020 0\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R,\u0010%\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u001dR0\u0010*\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060'j\u0002`(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001e0\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001d¨\u0006,"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/di/PromoCarouselComponent;", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselDTO;", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "Ljava/lang/Void;", "getLayout", "()Ljava/lang/Void;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "LA00/a$J$a;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "updateConsumer", "getUpdateConsumer", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PromoCarouselViewMapper extends WidgetViewMapper2<PromoCarouselComponent, PromoCarouselDTO, PromoCarouselVO> {
    private static final int PADDING_VERTICAL = UiExtKt.toPx(6);
    private final Void layout;

    @NotNull
    private final Function2<View, ComposerReferences, PromoCarouselViewHolder> holderProducer = new PromoCarouselViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.a0(UpdateAnimationEvent.class);

    @NotNull
    private final Function2<a.J.InterfaceC0007a, PromoCarouselVO, PromoCarouselVO> updateConsumer = PromoCarouselViewMapper$updateConsumer$1.INSTANCE;

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PromoCarouselRecyclerView promoCarouselRecyclerView = new PromoCarouselRecyclerView(context);
        promoCarouselRecyclerView.setId(R$id.promoCarouselHorizontalRecyclerView);
        promoCarouselRecyclerView.setLayoutParams(new RecyclerView.p(-1, -2));
        promoCarouselRecyclerView.setBackgroundResource(UniColors.LAYER_FLOOR_1.getResId());
        promoCarouselRecyclerView.setNestedScrollingEnabled(false);
        int i11 = PADDING_VERTICAL;
        promoCarouselRecyclerView.setPadding(0, i11, 0, i11);
        return promoCarouselRecyclerView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, PromoCarouselViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Integer getLayout() {
        return (Integer) getLayout();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<PromoCarouselDTO, d, List<PromoCarouselVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<a.J.InterfaceC0007a, PromoCarouselVO, PromoCarouselVO> getUpdateConsumer() {
        return this.updateConsumer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<PromoCarouselComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return PromoCarouselComponent.INSTANCE.create(storage);
    }

    public Void getLayout() {
        return this.layout;
    }
}
