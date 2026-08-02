package ru.ozon.app.android.minifyLink.data;

import B0.C2454a;
import Bc.r;
import DM.i;
import W10.c;
import com.google.android.gms.common.internal.ImagesContract;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/minifyLink/data/MinifyLinkRepositoryImpl;", "Lru/ozon/app/android/minifyLink/data/MinifyLinkRepository;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "", ImagesContract.URL, "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lio/reactivex/y;", "minifyLink", "(Ljava/lang/String;LW10/c;)Lio/reactivex/y;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Companion", "minify-link_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MinifyLinkRepositoryImpl implements MinifyLinkRepository {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/minifyLink/data/MinifyLinkRepositoryImpl$Companion;", "", "<init>", "()V", "URL_KEY", "", "MINIFY_ACTION_NAME", "minify-link_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MinifyLinkRepositoryImpl(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String minifyLink$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (String) function1.invoke(p02);
    }

    @Override // ru.ozon.app.android.minifyLink.data.MinifyLinkRepository
    @NotNull
    public y<String> minifyLink(@NotNull String url, c trackingData) {
        Intrinsics.checkNotNullParameter(url, "url");
        ActionV2Request actionV2Request = new ActionV2Request(C2454a.b(ImagesContract.URL, url), "minifyURL", false, 4, null);
        y callAction = trackingData == null ? this.actionV2Repository.callAction(actionV2Request, MinifyLinkDTO.class) : this.actionV2Repository.callActionWithTracking(actionV2Request, trackingData, MinifyLinkDTO.class);
        i iVar = new i(new MinifyLinkRepositoryImpl$minifyLink$1(url), 20);
        callAction.getClass();
        r rVar = new r(callAction, iVar);
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        return rVar;
    }
}
