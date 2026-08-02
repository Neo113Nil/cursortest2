package ru.ozon.app.android.fresh.feature.b2b.widgets.legaldocs.presentation.order;

import android.view.View;
import java.util.List;
import k20.C7471c;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.fresh.feature.b2b.R$layout;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legaldocs.data.LegalDocsDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legaldocs.presentation.order.LegalDocsOrderVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0013j\b\u0012\u0004\u0012\u00020\u0002`\u00142\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R2\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00190\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R2\u0010&\u001a\u001a\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040%0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001d¨\u0006("}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/presentation/order/LegalDocsOrderViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/data/LegalDocsDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/presentation/order/LegalDocsOrderVO;", "<init>", "()V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/data/LegalDocsDTO$OrderGroupsDTO$OrderDTO$StatusDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/presentation/order/LegalDocsOrderVO$Status;", "toVO", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/data/LegalDocsDTO$OrderGroupsDTO$OrderDTO$StatusDTO;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/presentation/order/LegalDocsOrderVO$Status;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "getHolderProducer", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LegalDocsOrderViewMapper extends WidgetViewMapper2 {

    @NotNull
    private final Function2<LegalDocsDTO, d, List<LegalDocsOrderVO>> mapper = new LegalDocsOrderViewMapper$mapper$1(this);
    private final int layout = R$layout.widget_legal_docs_order;

    @NotNull
    private final Function2<View, ComposerReferences, k<LegalDocsOrderVO>> holderProducer = LegalDocsOrderViewMapper$holderProducer$1.INSTANCE;

    /* JADX INFO: Access modifiers changed from: private */
    public final LegalDocsOrderVO.Status toVO(LegalDocsDTO.OrderGroupsDTO.OrderDTO.StatusDTO statusDTO) {
        TextDTO dsTextAtom = TextMapperKt.getDsTextAtom(statusDTO.getTitle());
        String stateIcon = statusDTO.getStateIcon();
        String stateDescription = statusDTO.getStateDescription();
        String stateTintColor = statusDTO.getStateTintColor();
        AtomActionDTO action = statusDTO.getAction();
        return new LegalDocsOrderVO.Status(dsTextAtom, stateIcon, stateDescription, stateTintColor, action != null ? AtomActionMapperKt.toAtomAction(action, statusDTO.getTrackingInfo()) : null);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        LegalDocsDTO legalDocsDTO = state instanceof LegalDocsDTO ? (LegalDocsDTO) state : null;
        List<LegalDocsDTO.OrderGroupsDTO> groups = legalDocsDTO != null ? legalDocsDTO.getGroups() : null;
        return true ^ (groups == null || groups.isEmpty());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<LegalDocsOrderVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<LegalDocsDTO, d, List<LegalDocsOrderVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return C7471c.f70357c;
    }
}
