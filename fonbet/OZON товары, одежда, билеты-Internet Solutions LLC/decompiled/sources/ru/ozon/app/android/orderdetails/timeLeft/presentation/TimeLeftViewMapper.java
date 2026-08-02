package ru.ozon.app.android.orderdetails.timeLeft.presentation;

import CS.a;
import android.content.Context;
import android.view.View;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.orderdetails.R$layout;
import ru.ozon.app.android.orderdetails.timeLeft.data.TimeLeftDTO;
import ru.ozon.app.android.orderdetails.timeLeft.data.TimerDTO;
import ru.ozon.app.android.orderdetails.timeLeft.di.TimeLeftWidgetComponent;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\t\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\t\u0010\rJ!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R2\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00160\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR2\u0010#\u001a\u001a\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\"0\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001a¨\u0006%"}, d2 = {"Lru/ozon/app/android/orderdetails/timeLeft/presentation/TimeLeftViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/orderdetails/timeLeft/di/TimeLeftWidgetComponent;", "Lru/ozon/app/android/orderdetails/timeLeft/data/TimeLeftDTO;", "Lru/ozon/app/android/orderdetails/timeLeft/presentation/TimeLeftVO;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/orderdetails/timeLeft/data/TimeLeftDTO;Ljava/lang/String;)Lru/ozon/app/android/orderdetails/timeLeft/presentation/TimeLeftVO;", "Lru/ozon/app/android/orderdetails/timeLeft/data/TimerDTO;", "Lru/ozon/app/android/orderdetails/timeLeft/presentation/TimerVO;", "(Lru/ozon/app/android/orderdetails/timeLeft/data/TimerDTO;)Lru/ozon/app/android/orderdetails/timeLeft/presentation/TimerVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "getHolderProducer", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimeLeftViewMapper extends WidgetViewMapper2<TimeLeftWidgetComponent, TimeLeftDTO, TimeLeftVO> {

    @NotNull
    private final Function2<TimeLeftDTO, d, List<TimeLeftVO>> mapper = new TimeLeftViewMapper$mapper$1(this);
    private final int layout = R$layout.widget_time_left_layout;

    @NotNull
    private final Function2<View, ComposerReferences, k<TimeLeftVO>> holderProducer = new TimeLeftViewMapper$holderProducer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final TimeLeftVO toVO(TimeLeftDTO timeLeftDTO, String str) {
        return new TimeLeftVO(str.hashCode(), timeLeftDTO.getButtons(), toVO(timeLeftDTO.getTimer()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TimeLeftWidgetComponent widgetComponent$lambda$0(C7475g c7475g) {
        return TimeLeftWidgetComponent.INSTANCE.create(c7475g);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<TimeLeftVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TimeLeftDTO, d, List<TimeLeftVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TimeLeftWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(TimeLeftWidgetComponent.class), new a(storage, 15));
    }

    private final TimerVO toVO(TimerDTO timerDTO) {
        DateTime dateTime;
        String title = timerDTO.getTitle();
        Integer timeLeft = timerDTO.getTimeLeft();
        if (timeLeft != null) {
            dateTime = new DateTime().m(timeLeft.intValue());
        } else {
            dateTime = null;
        }
        DateTime dateTime2 = dateTime;
        StyleParser styleParser = StyleParser.INSTANCE;
        int parseColor = styleParser.parseColor(component().getContext(), timerDTO.getBackgroundColor(), UniColors.GRAPHIC_ACTIVE_ACCENT_PRIMARY.getResId());
        String icon = timerDTO.getIcon();
        if (icon == null) {
            icon = "ic_m_danger";
        }
        Context context = component().getContext();
        String iconColor = timerDTO.getIconColor();
        UniColors uniColors = UniColors.LAYER_FLOOR_1;
        return new TimerVO(parseColor, icon, styleParser.parseColor(context, iconColor, uniColors.getResId()), styleParser.parseColor(component().getContext(), timerDTO.getTextColor(), uniColors.getResId()), dateTime2, title);
    }
}
