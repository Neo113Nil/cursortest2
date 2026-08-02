package ru.ozon.app.android.product.common.header;

import AM.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import gk0.q;
import java.util.List;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.product.R$layout;
import ru.ozon.app.android.product.common.HasHeaderDTO;
import ru.ozon.app.android.product.common.ProductWidgetDTO;
import ru.ozon.app.android.product.common.header.di.DaggerHeaderComponent;
import ru.ozon.app.android.product.common.header.di.HeaderComponent;
import ru.ozon.app.android.product.common.header.model.HeaderDTO;
import ru.ozon.app.android.product.common.header.model.HeaderVO;
import ru.ozon.app.android.product.common.header.model.MultilineLink;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0018j\b\u0012\u0004\u0012\u00020\u0002`\u00192\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001f\u001a\u00020\u0004*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R6\u0010%\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\"j\u0002`#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040$0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010*\u001a\u0004\u0018\u00010)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R<\u00101\u001a$\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020.\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040/j\b\u0012\u0004\u0012\u00020\u0004`00!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010(R\u0014\u00103\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/ozon/app/android/product/common/header/HeaderWidgetViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/product/common/header/di/HeaderComponent;", "Lru/ozon/app/android/product/common/ProductWidgetDTO;", "Lru/ozon/app/android/product/common/header/model/HeaderVO;", "<init>", "()V", "Lru/ozon/app/android/product/common/header/model/MultilineLink;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "mapButton", "(Lru/ozon/app/android/product/common/header/model/MultilineLink;)Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lru/ozon/app/android/product/common/header/model/HeaderDTO;", "", "id", "toVO", "(Lru/ozon/app/android/product/common/header/model/HeaderDTO;Ljava/lang/String;)Lru/ozon/app/android/product/common/header/model/HeaderVO;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "layoutRes", "I", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HeaderWidgetViewMapper extends WidgetViewMapper2<HeaderComponent, ProductWidgetDTO, HeaderVO> {
    private final Integer layout;

    @NotNull
    private final Function2<ProductWidgetDTO, d, List<HeaderVO>> mapper = new HeaderWidgetViewMapper$mapper$1(this);

    @NotNull
    private final Function2<View, ComposerReferences, k<HeaderVO>> holderProducer = HeaderWidgetViewMapper$holderProducer$1.INSTANCE;
    private final int layoutRes = R$layout.item_product_header;

    private final ButtonV3Atom.SmallBorderlessButton mapButton(MultilineLink multilineLink) {
        return new ButtonV3Atom.SmallBorderlessButton(OzonSpannableStringKt.toOzonSpannableString(multilineLink.getTitle()), multilineLink.getAction(), null, null, null, multilineLink.getTrackingInfo(), false, 92, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HeaderComponent widgetComponent$lambda$0(C7475g c7475g) {
        return DaggerHeaderComponent.factory().create((NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class));
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof HasHeaderDTO;
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
    public Function2<View, ComposerReferences, k<HeaderVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<ProductWidgetDTO, d, List<HeaderVO>> getMapper() {
        return this.mapper;
    }

    @NotNull
    public final HeaderVO toVO(@NotNull HeaderDTO headerDTO, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(headerDTO, "<this>");
        Intrinsics.checkNotNullParameter(id2, "id");
        long hashCode = id2.hashCode();
        String title = headerDTO.getTitle();
        String subtitle = headerDTO.getSubtitle();
        AtomActionDTO action = headerDTO.getAction();
        Map<String, TokenizedTrackingInfo> trackingInfo = headerDTO.getTrackingInfo();
        TestInfo testInfo = headerDTO.getTestInfo();
        MultilineLink multilineLink = headerDTO.getMultilineLink();
        return new HeaderVO(hashCode, title, subtitle, action, trackingInfo, testInfo, multilineLink != null ? mapButton(multilineLink) : null, headerDTO.getBadge() == null ? headerDTO.getDisclosure() : null, headerDTO.getBadge());
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<HeaderComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(HeaderComponent.class), new a(storage, 3));
    }
}
