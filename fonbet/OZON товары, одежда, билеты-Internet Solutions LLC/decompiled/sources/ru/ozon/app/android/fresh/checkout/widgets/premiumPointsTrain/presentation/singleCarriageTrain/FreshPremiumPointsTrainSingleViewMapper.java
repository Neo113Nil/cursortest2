package ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.singleCarriageTrain;

import CQ.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
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
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.data.FreshPremiumPointsTrainDTO;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.di.DaggerFreshPremiumPointsTrainComponent;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.di.FreshPremiumPointsTrainComponent;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR6\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u001dj\u0002`\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001f0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010%\u001a\u0004\u0018\u00010$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R<\u0010,\u001a$\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020)\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040*j\b\u0012\u0004\u0012\u00020\u0004`+0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b-\u0010#¨\u0006."}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/singleCarriageTrain/FreshPremiumPointsTrainSingleViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/di/FreshPremiumPointsTrainComponent;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/singleCarriageTrain/FreshPremiumPointsTrainSingleVO;", "<init>", "()V", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$SingleCarriageTrainFresh;", "", "stateId", "toVO", "(Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$SingleCarriageTrainFresh;Ljava/lang/String;)Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/singleCarriageTrain/FreshPremiumPointsTrainSingleVO;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FreshPremiumPointsTrainSingleViewMapper extends WidgetViewMapper2<FreshPremiumPointsTrainComponent, FreshPremiumPointsTrainDTO, FreshPremiumPointsTrainSingleVO> {
    private final Integer layout;

    @NotNull
    private final Function2<FreshPremiumPointsTrainDTO, d, List<FreshPremiumPointsTrainSingleVO>> mapper = new FreshPremiumPointsTrainSingleViewMapper$mapper$1(this);

    @NotNull
    private final Function2<View, ComposerReferences, k<FreshPremiumPointsTrainSingleVO>> holderProducer = FreshPremiumPointsTrainSingleViewMapper$holderProducer$1.INSTANCE;

    /* JADX INFO: Access modifiers changed from: private */
    public final FreshPremiumPointsTrainSingleVO toVO(FreshPremiumPointsTrainDTO.SingleCarriageTrainFresh singleCarriageTrainFresh, String str) {
        long hashCode = str.hashCode();
        TextDTO title = singleCarriageTrainFresh.getTitle();
        String statusIcon = singleCarriageTrainFresh.getStatusIcon();
        String statusIconTint = singleCarriageTrainFresh.getStatusIconTint();
        AtomActionDTO action = singleCarriageTrainFresh.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, singleCarriageTrainFresh.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = singleCarriageTrainFresh.getTrackingInfo();
        return new FreshPremiumPointsTrainSingleVO(hashCode, title, statusIcon, statusIconTint, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FreshPremiumPointsTrainComponent widgetComponent$lambda$0(C7475g c7475g) {
        return DaggerFreshPremiumPointsTrainComponent.factory().create((NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class));
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof FreshPremiumPointsTrainDTO.SingleCarriageTrainFresh;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new FreshPremiumPointsTrainSingleView(context, null, 0, 0, 14, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<FreshPremiumPointsTrainSingleVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<FreshPremiumPointsTrainDTO, d, List<FreshPremiumPointsTrainSingleVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<FreshPremiumPointsTrainComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(FreshPremiumPointsTrainComponent.class), new a(storage, 11));
    }
}
