package ru.ozon.app.android.account.orders.emptyscreen;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.emptyscreen.fintech.data.OfflineFintechBannerDTO;
import ru.ozon.app.android.csma.flags.FintechMaketplaceObDisabledFlag;
import ru.ozon.app.android.csma.flags.FintechShowOfflineBannerFlag;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.utils.UriExtKt;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;
import z00.e;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u0000 #2\u00020\u0001:\u0001#B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/OzonBankOfflineInfoWidgetFactory;", "", "Lru/ozon/app/android/network/version/AppVersionService;", "appVersionService", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lru/ozon/app/android/network/version/AppVersionService;Lru/ozon/app/android/network/abtool/FeatureChecker;Lcom/squareup/moshi/Moshi;)V", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "createImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "createTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "createSubtitle", "Lz00/e;", "builder", "", "appendWidget", "(Lz00/e;)V", "Lru/ozon/app/android/network/version/AppVersionService;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lkotlin/text/Regex;", "tagRegex", "Lkotlin/text/Regex;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/account/orders/emptyscreen/fintech/data/OfflineFintechBannerDTO;", "offlineFintechBannerJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "getImageName", "()Ljava/lang/String;", "imageName", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OzonBankOfflineInfoWidgetFactory {

    @NotNull
    private final AppVersionService appVersionService;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final JsonAdapter<OfflineFintechBannerDTO> offlineFintechBannerJsonAdapter;

    @NotNull
    private final Regex tagRegex;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final String TITLE_STRING_DECODED = UriExtKt.base64Decode("T3pvbiDQkdCw0L3QutCw");

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/OzonBankOfflineInfoWidgetFactory$Companion;", "", "<init>", "()V", "", "IMAGE_NAME", "Ljava/lang/String;", "IMAGE_SELECT_NAME", "TITLE_STRING", "SUBTITLE_STRING", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OzonBankOfflineInfoWidgetFactory(@NotNull AppVersionService appVersionService, @NotNull FeatureChecker featureChecker, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(appVersionService, "appVersionService");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.appVersionService = appVersionService;
        this.featureChecker = featureChecker;
        this.tagRegex = new Regex("<.*?>");
        this.offlineFintechBannerJsonAdapter = moshi.c(OfflineFintechBannerDTO.class);
    }

    private final ImageDTO createImage() {
        return new ImageDTO(getImageName(), null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 65534, null);
    }

    private final TextDTO createSubtitle() {
        return new TextDTO(OzonSpannableStringKt.toOzonSpannableString("Проверяйте баланс и переводите деньги"), TextDTO.TextAlignment.LEADING, null, null, null, null, TextPreset.PRESET_CUSTOM, UniTextStyles.BODY_400_SMALL.getToken(), UniColors.TEXT_SECONDARY.getToken(), null, null, null, null, false, null, null, null, null, Integer.MAX_VALUE, 261692, null);
    }

    private final TextDTO createTitle() {
        return new TextDTO(OzonSpannableStringKt.toOzonSpannableString("Приложение " + TITLE_STRING_DECODED + " работает без интернета"), TextDTO.TextAlignment.LEADING, null, null, null, null, TextPreset.PRESET_CUSTOM, UniTextStyles.COMPACT_500_MEDIUM.getToken(), UniColors.TEXT_PRIMARY.getToken(), null, null, null, null, false, null, null, null, null, Integer.MAX_VALUE, 261692, null);
    }

    private final String getImageName() {
        return AppVersionService.INSTANCE.isSelect(this.appVersionService) ? "ic_ozon_finance_select" : "ic_ozon_finance";
    }

    public final void appendWidget(@NotNull e builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (!this.featureChecker.isEnabled(FintechShowOfflineBannerFlag.INSTANCE) || this.featureChecker.isEnabled(FintechMaketplaceObDisabledFlag.INSTANCE)) {
            return;
        }
        builder.a(1L, "ozonfintech", "offlineBanner", h.X(this.tagRegex.replace(this.offlineFintechBannerJsonAdapter.toJson(new OfflineFintechBannerDTO(createImage(), createTitle(), createSubtitle())), ""), "\\n\"", "\"", false));
    }
}
