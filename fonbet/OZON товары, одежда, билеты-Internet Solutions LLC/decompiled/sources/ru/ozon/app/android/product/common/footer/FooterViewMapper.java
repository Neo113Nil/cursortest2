package ru.ozon.app.android.product.common.footer;

import As.C2444a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.product.R$layout;
import ru.ozon.app.android.product.common.HasFooterDTO;
import ru.ozon.app.android.product.common.footer.di.DaggerFooterComponent;
import ru.ozon.app.android.product.common.footer.di.FooterComponent;
import ru.ozon.app.android.product.common.footer.model.FooterDTO;
import ru.ozon.app.android.product.common.footer.model.FooterVO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0014j\b\u0012\u0004\u0012\u00020\u0002`\u00152\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\u0004*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR6\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u001ej\u0002`\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040 0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010&\u001a\u0004\u0018\u00010%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R<\u0010-\u001a$\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020*\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040+j\b\u0012\u0004\u0012\u00020\u0004`,0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010$R\u0014\u0010/\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/product/common/footer/FooterViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/product/common/footer/di/FooterComponent;", "Lru/ozon/app/android/product/common/HasFooterDTO;", "Lru/ozon/app/android/product/common/footer/model/FooterVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lru/ozon/app/android/product/common/footer/model/FooterDTO;", "", "stateId", "toVO", "(Lru/ozon/app/android/product/common/footer/model/FooterDTO;Ljava/lang/String;)Lru/ozon/app/android/product/common/footer/model/FooterVO;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "layoutRes", "I", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FooterViewMapper extends WidgetViewMapper2<FooterComponent, HasFooterDTO, FooterVO> {
    private final Integer layout;

    @NotNull
    private final Function2<HasFooterDTO, d, List<FooterVO>> mapper = new FooterViewMapper$mapper$1(this);

    @NotNull
    private final Function2<View, ComposerReferences, k<FooterVO>> holderProducer = FooterViewMapper$holderProducer$1.INSTANCE;
    private final int layoutRes = R$layout.widget_footer_layout;

    /* JADX INFO: Access modifiers changed from: private */
    public static final FooterComponent widgetComponent$lambda$0(C7475g c7475g) {
        return DaggerFooterComponent.factory().create((NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class));
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof HasFooterDTO;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View h11 = q.f64554a.h(this.layoutRes);
        return h11 == null ? LayoutInflater.from(parent.getContext()).inflate(this.layoutRes, parent, false) : h11;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<FooterVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<HasFooterDTO, d, List<FooterVO>> getMapper() {
        return this.mapper;
    }

    @NotNull
    public final FooterVO toVO(@NotNull FooterDTO footerDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(footerDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        return new FooterVO(stateId.hashCode(), footerDTO.getButton());
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<FooterComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(FooterComponent.class), new C2444a(storage, 1));
    }
}
