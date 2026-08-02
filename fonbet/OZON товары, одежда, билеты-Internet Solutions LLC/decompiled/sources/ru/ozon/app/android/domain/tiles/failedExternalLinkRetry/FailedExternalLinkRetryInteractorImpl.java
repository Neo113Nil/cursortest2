package ru.ozon.app.android.domain.tiles.failedExternalLinkRetry;

import Sc.InterfaceC4008j;
import Sc.k;
import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.domain.tiles.flags.ExternalLinkRetryLifeTimeHoursFlag;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.storage.failedExternalLink.FailedExternalLinkStorage;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\b\u0000\u0018\u0000 82\u00020\u0001:\u00018B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u000f*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\f2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\b018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/FailedExternalLinkRetryInteractorImpl;", "Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/FailedExternalLinkRetryInteractor;", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/storage/failedExternalLink/FailedExternalLinkStorage;", "storage", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/storage/failedExternalLink/FailedExternalLinkStorage;)V", "", "link", "", "time", "", "setDataToStorage", "(Ljava/lang/String;J)V", "", "isTimeExpired", "(J)Z", "Landroid/net/Uri;", "otherLink", "isPathEquals", "(Landroid/net/Uri;Ljava/lang/String;)Z", "removeScheme", "(Ljava/lang/String;)Ljava/lang/String;", "getFailedExternalLink", "()Ljava/lang/String;", "setSuccessLink", "(Ljava/lang/String;)V", "deeplink", "originLink", "setExternalLink", "(Landroid/net/Uri;Landroid/net/Uri;)V", "requestLink", "redirectLink", "modifyRedirectLink", "(Ljava/lang/String;Ljava/lang/String;)V", "markFailedLink", "()V", "clearData", "Lru/ozon/app/android/storage/failedExternalLink/FailedExternalLinkStorage;", "", "linkLifeTimeMillis", "I", "Lkotlin/text/Regex;", "schemeRegex$delegate", "LSc/j;", "getSchemeRegex", "()Lkotlin/text/Regex;", "schemeRegex", "", "externalLinkAuthoritiesBlackList", "Ljava/util/List;", "externalLinkWithoutScheme", "Landroid/net/Uri;", "lastNetworkRequestSuccess", "Z", "Companion", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FailedExternalLinkRetryInteractorImpl implements FailedExternalLinkRetryInteractor {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final List<String> externalLinkAuthoritiesBlackList;
    private Uri externalLinkWithoutScheme;
    private boolean lastNetworkRequestSuccess;
    private final int linkLifeTimeMillis;

    /* renamed from: schemeRegex$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j schemeRegex;

    @NotNull
    private final FailedExternalLinkStorage storage;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/FailedExternalLinkRetryInteractorImpl$Companion;", "", "<init>", "()V", "ONE_HOUR_MILLIS", "", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FailedExternalLinkRetryInteractorImpl(@NotNull FeatureService featureService, @NotNull FailedExternalLinkStorage storage) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.storage = storage;
        this.linkLifeTimeMillis = featureService.getIntKey(ExternalLinkRetryLifeTimeHoursFlag.INSTANCE) * 3600000;
        this.schemeRegex = k.b(FailedExternalLinkRetryInteractorImpl$schemeRegex$2.INSTANCE);
        this.externalLinkAuthoritiesBlackList = C7714v.b0("", "home", "web", "browser", "external", "debug", "gameapp");
    }

    private final Regex getSchemeRegex() {
        return (Regex) this.schemeRegex.getValue();
    }

    private final boolean isPathEquals(Uri uri, String str) {
        return Intrinsics.d(uri.getPath(), Uri.parse(str).getPath());
    }

    private final boolean isTimeExpired(long j11) {
        return System.currentTimeMillis() - j11 > ((long) this.linkLifeTimeMillis);
    }

    private final String removeScheme(String str) {
        if (Uri.parse(str).getScheme() == null) {
            return h.e0(str, "/", false) ? str : "/".concat(str);
        }
        String h11 = getSchemeRegex().h(str);
        return h11.length() == 0 ? "/" : h11;
    }

    private final void setDataToStorage(String link, long time) {
        FailedExternalLinkStorage failedExternalLinkStorage = this.storage;
        failedExternalLinkStorage.setLink(link);
        failedExternalLinkStorage.setLinkSavedTime(time);
    }

    @Override // ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.FailedExternalLinkRetryInteractor
    public void clearData() {
        setDataToStorage(null, 0L);
        this.externalLinkWithoutScheme = null;
    }

    @Override // ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.FailedExternalLinkRetryInteractor
    public String getFailedExternalLink() {
        if (this.storage.getLink() == null) {
            return null;
        }
        if (isTimeExpired(this.storage.getLinkSavedTime())) {
            clearData();
            return null;
        }
        if (this.lastNetworkRequestSuccess) {
            return this.storage.getLink();
        }
        return null;
    }

    @Override // ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.FailedExternalLinkRetryInteractor
    public void markFailedLink() {
        this.lastNetworkRequestSuccess = false;
    }

    @Override // ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.FailedExternalLinkRetryInteractor
    public void modifyRedirectLink(@NotNull String requestLink, @NotNull String redirectLink) {
        Intrinsics.checkNotNullParameter(requestLink, "requestLink");
        Intrinsics.checkNotNullParameter(redirectLink, "redirectLink");
        Uri uri = this.externalLinkWithoutScheme;
        if (uri == null || !isPathEquals(uri, requestLink)) {
            return;
        }
        setDataToStorage(redirectLink, System.currentTimeMillis());
        this.externalLinkWithoutScheme = Uri.parse(removeScheme(redirectLink));
    }

    @Override // ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.FailedExternalLinkRetryInteractor
    public void setExternalLink(@NotNull Uri deeplink, @NotNull Uri originLink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(originLink, "originLink");
        if (C7714v.A(this.externalLinkAuthoritiesBlackList, deeplink.getAuthority())) {
            return;
        }
        String uri = originLink.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        this.externalLinkWithoutScheme = Uri.parse(removeScheme(uri));
        setDataToStorage(uri, System.currentTimeMillis());
        this.lastNetworkRequestSuccess = false;
    }

    @Override // ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.FailedExternalLinkRetryInteractor
    public void setSuccessLink(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        Uri uri = this.externalLinkWithoutScheme;
        if (uri != null && isPathEquals(uri, link)) {
            clearData();
        }
        this.lastNetworkRequestSuccess = true;
    }
}
