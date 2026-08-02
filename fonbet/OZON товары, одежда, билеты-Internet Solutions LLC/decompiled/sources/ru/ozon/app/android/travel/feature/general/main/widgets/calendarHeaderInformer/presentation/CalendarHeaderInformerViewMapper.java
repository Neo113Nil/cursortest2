package ru.ozon.app.android.travel.feature.general.main.widgets.calendarHeaderInformer.presentation;

import JL.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendarHeaderInformer.data.CalendarHeaderInformerDTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendarHeaderInformer.di.CalendarHeaderInformerComponent;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendarHeaderInformer.view.CalendarHeaderInformerView;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendarHeaderInformer/presentation/CalendarHeaderInformerViewMapper;", "Lc20/r;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendarHeaderInformer/data/CalendarHeaderInformerDTO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendarHeaderInformer/presentation/CalendarHeaderInformerVI;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendarHeaderInformer/di/CalendarHeaderInformerComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/main/widgets/calendarHeaderInformer/di/CalendarHeaderInformerComponent;)V", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/main/widgets/calendarHeaderInformer/data/CalendarHeaderInformerDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendarHeaderInformer/di/CalendarHeaderInformerComponent;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalendarHeaderInformerViewMapper extends r<CalendarHeaderInformerDTO, CalendarHeaderInformerVI> {

    @NotNull
    private final CalendarHeaderInformerComponent component;

    @NotNull
    private final r.a viewType;

    public CalendarHeaderInformerViewMapper(@NotNull CalendarHeaderInformerComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(LinearLayout composerTopContainer) {
        Intrinsics.checkNotNullParameter(composerTopContainer, "composerTopContainer");
        Context context = composerTopContainer.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CalendarHeaderInformerView calendarHeaderInformerView = new CalendarHeaderInformerView(context);
        calendarHeaderInformerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return calendarHeaderInformerView;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<CalendarHeaderInformerVI> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new CalendarHeaderInformerWidgetViewHolder(this.component.getTokenizedAnalytics(), container, new b(2));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<CalendarHeaderInformerVI> map(@NotNull CalendarHeaderInformerDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
