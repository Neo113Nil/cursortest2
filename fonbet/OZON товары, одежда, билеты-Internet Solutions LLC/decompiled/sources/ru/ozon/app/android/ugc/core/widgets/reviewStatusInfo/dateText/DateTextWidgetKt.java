package ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.dateText;

import Sc.InterfaceC4008j;
import Sc.k;
import java.util.Locale;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.compose.widget.scrollable.j;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t²\u0006\u0014\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/ugc/core/widgets/reviewStatusInfo/dateText/DateTextVO;", "", "dateTextWidget", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "Ljava/util/Locale;", "kotlin.jvm.PlatformType", "appLocale", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DateTextWidgetKt {
    public static final void dateTextWidget(@NotNull j<Object, DateTextVO> jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        C7475g widgetComponentStorage = jVar.getWidgetComponentStorage();
        InterfaceC4008j b11 = k.b(new DateTextWidgetKt$dateTextWidget$appLocale$2(jVar, widgetComponentStorage));
        jVar.i(DateTextWidgetKt$dateTextWidget$1.INSTANCE, DateTextWidgetKt$dateTextWidget$2.INSTANCE);
        jVar.G(new DateTextWidgetKt$dateTextWidget$3(widgetComponentStorage, b11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Locale dateTextWidget$lambda$0(InterfaceC4008j<Locale> interfaceC4008j) {
        return interfaceC4008j.getValue();
    }
}
