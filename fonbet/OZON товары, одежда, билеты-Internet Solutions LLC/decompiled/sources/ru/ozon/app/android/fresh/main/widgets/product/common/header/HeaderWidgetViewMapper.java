package ru.ozon.app.android.fresh.main.widgets.product.common.header;

import android.view.View;
import java.util.List;
import java.util.Map;
import k20.C7471c;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.fresh.main.R$layout;
import ru.ozon.app.android.fresh.main.widgets.product.common.HasHeaderDTO;
import ru.ozon.app.android.fresh.main.widgets.product.common.header.model.HeaderDTO;
import ru.ozon.app.android.fresh.main.widgets.product.common.header.model.HeaderVO;
import ru.ozon.app.android.fresh.main.widgets.product.common.header.model.MultilineLinkDTO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000ej\b\u0012\u0004\u0012\u00020\u0002`\u000f2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u0004*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R6\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0018j\u0002`\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001a0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R<\u0010(\u001a$\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040&j\b\u0012\u0004\u0012\u00020\u0004`'0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u001e¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/common/header/HeaderWidgetViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "", "Lru/ozon/app/android/fresh/main/widgets/product/common/HasHeaderDTO;", "Lru/ozon/app/android/fresh/main/widgets/product/common/header/model/HeaderVO;", "<init>", "()V", "Lru/ozon/app/android/fresh/main/widgets/product/common/header/model/MultilineLinkDTO;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "mapButton", "(Lru/ozon/app/android/fresh/main/widgets/product/common/header/model/MultilineLinkDTO;)Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lru/ozon/app/android/fresh/main/widgets/product/common/header/model/HeaderDTO;", "", "stateId", "toVO", "(Lru/ozon/app/android/fresh/main/widgets/product/common/header/model/HeaderDTO;Ljava/lang/String;)Lru/ozon/app/android/fresh/main/widgets/product/common/header/model/HeaderVO;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HeaderWidgetViewMapper extends WidgetViewMapper2 {

    @NotNull
    private final Function2<HasHeaderDTO, d, List<HeaderVO>> mapper = new HeaderWidgetViewMapper$mapper$1(this);
    private final int layout = R$layout.item_product_header_express;

    @NotNull
    private final Function2<View, ComposerReferences, k<HeaderVO>> holderProducer = HeaderWidgetViewMapper$holderProducer$1.INSTANCE;

    private final ButtonV3Atom.SmallBorderlessButton mapButton(MultilineLinkDTO multilineLinkDTO) {
        return new ButtonV3Atom.SmallBorderlessButton(OzonSpannableStringKt.toOzonSpannableString(multilineLinkDTO.getTitle()), multilineLinkDTO.getAction(), null, null, null, multilineLinkDTO.getTrackingInfo(), false, 92, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<HeaderVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<HasHeaderDTO, d, List<HeaderVO>> getMapper() {
        return this.mapper;
    }

    @NotNull
    public final HeaderVO toVO(@NotNull HeaderDTO headerDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(headerDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = stateId.hashCode();
        String title = headerDTO.getTitle();
        String subtitle = headerDTO.getSubtitle();
        AtomActionDTO action = headerDTO.getAction();
        Map<String, TokenizedTrackingInfo> trackingInfo = headerDTO.getTrackingInfo();
        TestInfo testInfo = headerDTO.getTestInfo();
        MultilineLinkDTO multilineLink = headerDTO.getMultilineLink();
        return new HeaderVO(hashCode, title, subtitle, action, trackingInfo, testInfo, multilineLink != null ? mapButton(multilineLink) : null, headerDTO.getDisclosure());
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return C7471c.f70357c;
    }
}
