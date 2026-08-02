package ru.ozon.app.android.travel.feature.general.common.preCreation.navBar;

import android.content.Context;
import gk0.n;
import gk0.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.precreation.PreCreateInfoProvider;
import ru.ozon.app.android.storefront.navBar.R$layout;
import ru.ozon.app.android.travel.utils.utils.TravelPreCreateUtilsKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/preCreation/navBar/TravelNavBarPreCreationInfoProvider;", "Lru/ozon/app/android/precreation/PreCreateInfoProvider;", "<init>", "()V", "Landroid/content/Context;", "context", "", "Lgk0/n;", "provide", "(Landroid/content/Context;)Ljava/util/List;", "", "widgetId", "Ljava/lang/String;", "getWidgetId", "()Ljava/lang/String;", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelNavBarPreCreationInfoProvider implements PreCreateInfoProvider {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String widgetId = TravelPreCreateUtilsKt.getPreCreateWidgetKey("travelNavBar", 1);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/preCreation/navBar/TravelNavBarPreCreationInfoProvider$Companion;", "", "<init>", "()V", "WIDGET_NAME", "", "WIDGET_VERSION", "", "WIDGET_COUNT", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // ru.ozon.app.android.precreation.PreCreateInfoProvider
    @NotNull
    public String getWidgetId() {
        return this.widgetId;
    }

    @Override // ru.ozon.app.android.precreation.PreCreateInfoProvider
    @NotNull
    public List<n> provide(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new o(R$layout.widget_navbar, 1, context));
    }
}
