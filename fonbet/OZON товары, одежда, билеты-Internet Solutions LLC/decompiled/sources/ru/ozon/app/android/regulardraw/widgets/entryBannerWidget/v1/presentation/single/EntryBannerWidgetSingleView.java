package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.single;

import android.R;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.R$drawable;
import ru.ozon.app.android.regulardraw.R$id;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.EntryBannerWidgetVO;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.view.EntryBannerView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/single/EntryBannerWidgetSingleView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "backgroundColor", "", "setBackgroundColor", "(Ljava/lang/String;)V", "Lxe/M;", "lifecycleScope", "attachLifecycleScope", "(Lxe/M;)V", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/EntryBannerWidgetVO$Single;", "entryBannerWidgetVO", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/EntryBannerWidgetVO$Single;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/view/EntryBannerView;", "entryBannerView", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/view/EntryBannerView;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EntryBannerWidgetSingleView extends FrameLayout {

    @NotNull
    private final EntryBannerView entryBannerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntryBannerWidgetSingleView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        EntryBannerView entryBannerView = new EntryBannerView(context);
        entryBannerView.setId(R$id.entryBannerWidget_BannerView_Root);
        entryBannerView.setBackground(a.getDrawable(context, R$drawable.bg_entry_banner_widget));
        this.entryBannerView = entryBannerView;
        setId(R$id.entryBannerWidget_Single_Root);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(entryBannerView);
    }

    private final void setBackgroundColor(String backgroundColor) {
        if (backgroundColor != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            setBackgroundColor(styleParser.parseColor(context, backgroundColor, R.color.transparent));
        }
    }

    public final void attachLifecycleScope(@NotNull M lifecycleScope) {
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        this.entryBannerView.attachLifecycleScope(lifecycleScope);
    }

    public final void bind(@NotNull EntryBannerWidgetVO.Single entryBannerWidgetVO, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(entryBannerWidgetVO, "entryBannerWidgetVO");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.entryBannerView.bind(entryBannerWidgetVO.getBanner(), actionHandler);
        setBackgroundColor(entryBannerWidgetVO.getBackgroundColor());
    }
}
