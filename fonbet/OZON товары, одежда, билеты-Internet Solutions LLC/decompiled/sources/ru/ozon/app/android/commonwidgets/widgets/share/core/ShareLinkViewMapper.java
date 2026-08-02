package ru.ozon.app.android.commonwidgets.widgets.share.core;

import Vg.d;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.R$layout;
import ru.ozon.app.android.commonwidgets.widgets.share.data.ShareLinkDTO;
import ru.ozon.app.android.commonwidgets.widgets.share.presentation.ShareLinkVO;
import ru.ozon.app.android.commonwidgets.widgets.share.presentation.ShareLinkViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\b\u0007\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R,\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/share/core/ShareLinkViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/commonwidgets/widgets/share/data/ShareLinkDTO;", "Lru/ozon/app/android/commonwidgets/widgets/share/presentation/ShareLinkVO;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "<init>", "(LVg/d;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "LVg/d;", "Lru/ozon/app/android/commonwidgets/widgets/share/core/ShareLinkMapper;", "mapper", "Lru/ozon/app/android/commonwidgets/widgets/share/core/ShareLinkMapper;", "getMapper", "()Lru/ozon/app/android/commonwidgets/widgets/share/core/ShareLinkMapper;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/commonwidgets/widgets/share/presentation/ShareLinkViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShareLinkViewMapper extends WidgetViewMapper<ShareLinkDTO, ShareLinkVO> {

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final Function2<View, ComposerReferences, ShareLinkViewHolder> holderProducer;
    private final int layout;

    @NotNull
    private final ShareLinkMapper mapper;

    public ShareLinkViewMapper(@NotNull d customActionHandlersStoreFactory, @NotNull HandlersInhibitor handlersInhibitor) {
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.mapper = new ShareLinkMapper();
        this.layout = R$layout.widget_modal_button_joint_share;
        this.holderProducer = new ShareLinkViewMapper$holderProducer$1(this, handlersInhibitor);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<ShareLinkVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<ShareLinkDTO, l20.d, List<ShareLinkVO>> getMapper() {
        return this.mapper;
    }
}
