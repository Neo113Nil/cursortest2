package ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.dateText;

import Sc.r;
import Sc.s;
import java.util.Locale;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.locale.app.di.AppLocaleComponentApi;
import ru.ozon.composer.compose.widget.scrollable.j;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Ljava/util/Locale;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/Locale;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DateTextWidgetKt$dateTextWidget$appLocale$2 extends AbstractC7737t implements Function0<Locale> {
    final /* synthetic */ j<Object, DateTextVO> $this_dateTextWidget;
    final /* synthetic */ C7475g $widgetStorage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DateTextWidgetKt$dateTextWidget$appLocale$2(j<Object, DateTextVO> jVar, C7475g c7475g) {
        super(0);
        this.$this_dateTextWidget = jVar;
        this.$widgetStorage = c7475g;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Locale invoke() {
        Object a11;
        C7475g c7475g = this.$widgetStorage;
        try {
            r.Companion companion = r.INSTANCE;
            a11 = ((AppLocaleComponentApi) c7475g.getComponent(AppLocaleComponentApi.class)).getAppLocaleRepository().getDisplayedLocale();
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        Object obj = Locale.getDefault();
        if (a11 instanceof r.b) {
            a11 = obj;
        }
        return (Locale) a11;
    }
}
