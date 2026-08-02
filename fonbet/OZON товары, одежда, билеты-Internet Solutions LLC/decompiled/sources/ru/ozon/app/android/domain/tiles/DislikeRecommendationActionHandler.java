package ru.ozon.app.android.domain.tiles;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.domain.tiles.dislike.TileDislikeInteractor;
import ru.ozon.app.android.domain.tiles.dislike.model.TileDislikeId;
import ru.ozon.app.android.domain.tiles.dislike.model.TileDislikeInfo;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/domain/tiles/DislikeRecommendationActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "tileDislikeInteractor", "Lru/ozon/app/android/domain/tiles/dislike/TileDislikeInteractor;", "<init>", "(Lru/ozon/app/android/domain/tiles/dislike/TileDislikeInteractor;)V", "actionId", "", "getActionId", "()Ljava/lang/String;", "processAction", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handlerRefs", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "Companion", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DislikeRecommendationActionHandler extends CustomActionHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String actionId;

    @NotNull
    private final TileDislikeInteractor tileDislikeInteractor;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/domain/tiles/DislikeRecommendationActionHandler$Companion;", "", "<init>", "()V", "DISLIKE_SKU_KEY", "", "DISLIKE_WIDGET_ID_KEY", "DISLIKE_REASON_KEY", "DISLIKE_ALGORITHM_KEY", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DislikeRecommendationActionHandler(@NotNull TileDislikeInteractor tileDislikeInteractor) {
        Intrinsics.checkNotNullParameter(tileDislikeInteractor, "tileDislikeInteractor");
        this.tileDislikeInteractor = tileDislikeInteractor;
        this.actionId = "dislikeRecommendation";
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Map<String, String> params;
        String str;
        String str2;
        Long y02;
        Integer w02;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (!(action instanceof AtomAction.Click) || (params = ((AtomAction.Click) action).getParams()) == null || (str = params.get("sku")) == null || (str2 = params.get("widgetId")) == null || (y02 = h.y0(str2)) == null) {
            return;
        }
        long longValue = y02.longValue();
        String str3 = params.get("reason");
        if (str3 == null || (w02 = h.w0(str3)) == null) {
            return;
        }
        this.tileDislikeInteractor.dislike(new TileDislikeInfo(new TileDislikeId(str, longValue), w02.intValue(), params.get("algorithm"), null, 8, null));
    }
}
