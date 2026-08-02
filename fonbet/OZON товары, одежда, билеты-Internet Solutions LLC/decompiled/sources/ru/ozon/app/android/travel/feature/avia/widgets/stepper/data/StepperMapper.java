package ru.ozon.app.android.travel.feature.avia.widgets.stepper.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.stepper.presentation.StepperVO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u0003j\u0002`\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/stepper/data/StepperMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/stepper/data/StepperDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/stepper/presentation/StepperVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/stepper/data/StepperDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StepperMapper implements Function2<StepperDTO, d, List<? extends StepperVO>> {

    @NotNull
    private final Context context;

    public StepperMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<StepperVO> invoke(@NotNull StepperDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<String> backgroundColors = state.getBackgroundColors();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = backgroundColors.iterator();
        while (it.hasNext()) {
            Integer parseColor = StyleParser.INSTANCE.parseColor(this.context, (String) it.next());
            if (parseColor != null) {
                arrayList.add(parseColor);
            }
        }
        return C7714v.a0(new StepperVO(widgetInfo.d().hashCode(), arrayList, state.getTitle(), ResourceExtKt.toPx((121 - ((arrayList.size() - 1) * 4)) / arrayList.size(), this.context), state.getHideStepper()));
    }
}
