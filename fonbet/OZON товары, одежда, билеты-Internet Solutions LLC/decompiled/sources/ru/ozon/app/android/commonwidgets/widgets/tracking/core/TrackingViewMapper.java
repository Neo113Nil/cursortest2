package ru.ozon.app.android.commonwidgets.widgets.tracking.core;

import WZ.t;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.commonwidgets.widgets.tracking.data.TrackingDTO;
import ru.ozon.app.android.commonwidgets.widgets.tracking.presentation.TrackingVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR6\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00130\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/tracking/core/TrackingViewMapper;", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/SingleNoUiViewMapper;", "Lru/ozon/app/android/commonwidgets/widgets/tracking/data/TrackingDTO;", "Lru/ozon/app/android/commonwidgets/widgets/tracking/presentation/TrackingVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "", "bind", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TrackingViewMapper extends SingleNoUiViewMapper<TrackingDTO, TrackingVO> {

    @NotNull
    private final Function2<TrackingDTO, d, List<TrackingVO>> mapper = TrackingViewMapper$mapper$1.INSTANCE;

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void bind(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        c d11 = viewObject.d();
        Intrinsics.g(d11, "null cannot be cast to non-null type ru.ozon.app.android.commonwidgets.widgets.tracking.presentation.TrackingVO");
        t tokenizedEvent = ((TrackingVO) d11).getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(references.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<TrackingDTO, d, List<TrackingVO>> getMapper() {
        return this.mapper;
    }
}
