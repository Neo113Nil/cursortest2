package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.precreate;

import android.content.Context;
import gk0.n;
import gk0.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.precreation.PreCreateInfoProvider;
import ru.ozon.app.android.universalwidgets.flags.PrecreateViewsTileGrid2Flag;
import ru.ozon.app.android.universalwidgets.flags.TileGrid2PreCreateBadgesFlag;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/precreate/TileGrid2PreCreateProvider;", "Lru/ozon/app/android/precreation/PreCreateInfoProvider;", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;)V", "Landroid/content/Context;", "context", "", "Lgk0/n;", "provide", "(Landroid/content/Context;)Ljava/util/List;", "Lru/ozon/app/android/network/abtool/FeatureService;", "", "preCreateEnabled", "Z", "", "widgetId", "Ljava/lang/String;", "getWidgetId", "()Ljava/lang/String;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2PreCreateProvider implements PreCreateInfoProvider {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final FeatureService featureService;
    private final boolean preCreateEnabled;

    @NotNull
    private final String widgetId;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/precreate/TileGrid2PreCreateProvider$Companion;", "", "<init>", "()V", "VIDEO_TILE_VIEW_COUNT", "", "ADULT_IMAGE_VIEW_COUNT", "FAVORITE_MOLECULE_VIEW_COUNT", "STOCKBAR_VIEW_COUNT", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TileGrid2PreCreateProvider(@NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.featureService = featureService;
        this.preCreateEnabled = featureService.getBooleanKey(PrecreateViewsTileGrid2Flag.INSTANCE);
        this.widgetId = "tileGrid2";
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
        return this.preCreateEnabled ? C7714v.b0(new p(10, new TileGrid2PreCreateProvider$provide$1(context)), new p(15, new TileGrid2PreCreateProvider$provide$2(context)), new p(10, new TileGrid2PreCreateProvider$provide$3(context)), new p(6, new TileGrid2PreCreateProvider$provide$4(context)), new p(this.featureService.getIntKey(TileGrid2PreCreateBadgesFlag.INSTANCE), new TileGrid2PreCreateProvider$provide$5(context))) : K.f71697a;
    }
}
