package ru.ozon.app.android.regulardraw.widgets.daily.core;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.R$layout;
import ru.ozon.app.android.regulardraw.databinding.WidgetDailyBinding;
import ru.ozon.app.android.regulardraw.flags.DailyRewardsComposeFlag;
import ru.ozon.app.android.regulardraw.widgets.daily.data.DailyDTO;
import ru.ozon.app.android.regulardraw.widgets.daily.data.DailyVO;
import ru.ozon.app.android.regulardraw.widgets.daily.di.DailyComponent;
import ru.ozon.app.android.regulardraw.widgets.daily.presentation.DailyViewHolder;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/daily/core/DailyViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyDTO;", "Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyVO;", "Lru/ozon/app/android/regulardraw/widgets/daily/di/DailyComponent;", "component", "<init>", "(Lru/ozon/app/android/regulardraw/widgets/daily/di/DailyComponent;)V", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyDTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/regulardraw/widgets/daily/di/DailyComponent;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DailyViewMapper extends g<DailyDTO, DailyVO> {

    @NotNull
    private final DailyComponent component;
    private final int layout;

    public DailyViewMapper(@NotNull DailyComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.layout = R$layout.widget_daily;
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof DailyDTO) && !this.component.getFeatureChecker().isEnabled(DailyRewardsComposeFlag.INSTANCE);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<DailyVO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        WidgetDailyBinding bind = WidgetDailyBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new DailyViewHolder(container, bind, this.component.getTokenizedAnalytics(), this.component.getDefaultActionHandlers(), this.component.getStartupArgsService());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<DailyVO> map(@NotNull DailyDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
