package ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.ui;

import Ih.a;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.R$layout;
import ru.ozon.app.android.commonwidgets.di.ff.CommonCurtainDisabled;
import ru.ozon.app.android.commonwidgets.widgets.curtain.data.CurtainDTO;
import ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.ui.CurtainVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u0004\u0018\u00010\u0003*\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R6\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0013j\u0002`\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00150\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R,\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/ui/CurtainViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO;", "Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/ui/CurtainVO;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "stateId", "toVO", "(Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO;Ljava/lang/String;)Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/ui/CurtainVO;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/ui/CurtainWidgetViewHolder;", "holderProducer", "getHolderProducer", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CurtainViewMapper extends WidgetViewMapper<CurtainDTO, CurtainVO> {

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final Function2<View, ComposerReferences, CurtainWidgetViewHolder> holderProducer;
    private final int layout;

    @NotNull
    private final Function2<CurtainDTO, d, List<CurtainVO>> mapper;

    public CurtainViewMapper(@NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.featureChecker = featureChecker;
        this.mapper = new CurtainViewMapper$mapper$1(this);
        this.holderProducer = CurtainViewMapper$holderProducer$1.INSTANCE;
        this.layout = R$layout.widget_curtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CurtainVO toVO(CurtainDTO curtainDTO, String str) {
        if (((curtainDTO.getShowCondition().getType() != CurtainDTO.ShowCondition.Type.VIEW_PORT || curtainDTO.getShowCondition().getViewport() == null) ? null : curtainDTO) != null) {
            return new CurtainVO(a.a("CurtainVO ", str), false, CurtainVO.Condition.ViewPort.INSTANCE, curtainDTO.getAction(), curtainDTO.getTrackingInfo());
        }
        return null;
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return !this.featureChecker.isEnabled(CommonCurtainDisabled.INSTANCE);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<CurtainVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<CurtainDTO, d, List<CurtainVO>> getMapper() {
        return this.mapper;
    }
}
