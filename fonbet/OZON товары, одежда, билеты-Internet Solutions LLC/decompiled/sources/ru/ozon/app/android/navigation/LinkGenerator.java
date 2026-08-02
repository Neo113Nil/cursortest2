package ru.ozon.app.android.navigation;

import Sc.InterfaceC3999a;
import T7.C4029k;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@InterfaceC3999a
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b7\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0006J\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006J\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0006J5\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0006J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0006J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0006J\r\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u0006J\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0006J\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u0006J\u001f\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 J%\u0010$\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!¢\u0006\u0004\b$\u0010%J5\u0010*\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\r2\b\u0010'\u001a\u0004\u0018\u00010\r2\b\u0010(\u001a\u0004\u0018\u00010\r2\b\u0010)\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b*\u0010+J\u001d\u0010,\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b,\u0010\u0017J\u0015\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\r¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\r¢\u0006\u0004\b0\u0010/J\r\u00101\u001a\u00020\u0004¢\u0006\u0004\b1\u0010\u0006J\r\u00102\u001a\u00020\u0004¢\u0006\u0004\b2\u0010\u0006J\u0015\u00103\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\r¢\u0006\u0004\b3\u0010/J\r\u00104\u001a\u00020\u0004¢\u0006\u0004\b4\u0010\u0006J\r\u00105\u001a\u00020\u0004¢\u0006\u0004\b5\u0010\u0006J\u001f\u00107\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\r2\b\b\u0002\u00106\u001a\u00020\u0010¢\u0006\u0004\b7\u0010 J\r\u00108\u001a\u00020\u0004¢\u0006\u0004\b8\u0010\u0006J\r\u00109\u001a\u00020\u0004¢\u0006\u0004\b9\u0010\u0006J\r\u0010:\u001a\u00020\u0004¢\u0006\u0004\b:\u0010\u0006J\r\u0010;\u001a\u00020\u0004¢\u0006\u0004\b;\u0010\u0006J\u0015\u0010=\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0010¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0004¢\u0006\u0004\b?\u0010\u0006J\r\u0010@\u001a\u00020\u0004¢\u0006\u0004\b@\u0010\u0006J\r\u0010A\u001a\u00020\u0004¢\u0006\u0004\bA\u0010\u0006J\r\u0010B\u001a\u00020\u0004¢\u0006\u0004\bB\u0010\u0006J\r\u0010C\u001a\u00020\u0004¢\u0006\u0004\bC\u0010\u0006J\r\u0010D\u001a\u00020\u0004¢\u0006\u0004\bD\u0010\u0006J\r\u0010E\u001a\u00020\u0004¢\u0006\u0004\bE\u0010\u0006J\r\u0010F\u001a\u00020\u0004¢\u0006\u0004\bF\u0010\u0006J\r\u0010G\u001a\u00020\u0004¢\u0006\u0004\bG\u0010\u0006J\r\u0010H\u001a\u00020\u0004¢\u0006\u0004\bH\u0010\u0006J\r\u0010I\u001a\u00020\u0004¢\u0006\u0004\bI\u0010\u0006J\r\u0010J\u001a\u00020\u0004¢\u0006\u0004\bJ\u0010\u0006J!\u0010L\u001a\n K*\u0004\u0018\u00010\u00040\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\r¢\u0006\u0004\bL\u0010/J\r\u0010M\u001a\u00020\u0004¢\u0006\u0004\bM\u0010\u0006J\r\u0010N\u001a\u00020\u0004¢\u0006\u0004\bN\u0010\u0006J\r\u0010O\u001a\u00020\u0004¢\u0006\u0004\bO\u0010\u0006J\r\u0010P\u001a\u00020\u0004¢\u0006\u0004\bP\u0010\u0006J\r\u0010Q\u001a\u00020\u0004¢\u0006\u0004\bQ\u0010\u0006J\r\u0010R\u001a\u00020\u0004¢\u0006\u0004\bR\u0010\u0006J\r\u0010S\u001a\u00020\u0004¢\u0006\u0004\bS\u0010\u0006J\r\u0010T\u001a\u00020\u0004¢\u0006\u0004\bT\u0010\u0006J\r\u0010U\u001a\u00020\u0004¢\u0006\u0004\bU\u0010\u0006J\r\u0010V\u001a\u00020\u0004¢\u0006\u0004\bV\u0010\u0006J\r\u0010W\u001a\u00020\u0004¢\u0006\u0004\bW\u0010\u0006¨\u0006X"}, d2 = {"Lru/ozon/app/android/navigation/LinkGenerator;", "", "<init>", "()V", "Landroid/net/Uri;", "login", "()Landroid/net/Uri;", "home", "closeMiniApp", "category", "categoryClothes", "cart", "favorites", "", "externalUrl", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "authRequired", "isBackStackEnabled", "webView", "(Ljava/lang/String;Ljava/lang/String;ZZ)Landroid/net/Uri;", "cancelLink", "payment", "(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;", "scanItIntro", "seller", "cabinet", "cancelReasons", "auth", "createFavoritesList", "ignoreAuthoriseToken", "pdfViewer", "(Ljava/lang/String;Z)Landroid/net/Uri;", "", "latitude", "longitude", "mapSelector", "(Ljava/lang/String;DD)Landroid/net/Uri;", "searchText", "deeplink", "link", "hint", "searchSuggestions", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;", "listFavoriteWithTitle", AppMeasurementSdk.ConditionalUserProperty.VALUE, "debugScreenSetAbVariants", "(Ljava/lang/String;)Landroid/net/Uri;", "debugScreenSetMesh", "debugScreenDeleteAbVariants", "debugScreenDeleteMesh", "debugScreenSetInternalHeadersToken", "debugScreenDeleteInternalHeadersToken", "debugShowNotification", "newTask", "externalLink", "express", "expressMinimarket", "expressDeliveryTariff", "modal", "isEnabled", "trackerTestMode", "(Z)Landroid/net/Uri;", "clearBackStack", "newPvzOrderDetails", "social", "travelMain", "travelMainGeneral", "travelMainFlight", "travelMainHotel", "travelMainRailway", "travelMainTour", "travelTickets", "travelFavorites", "chat", "kotlin.jvm.PlatformType", "clearToRootTab", "socialFullView", "elevenNovember", "bankTab", "globalTab", "superEconom", "superEconomNew", "searchTab", "errorSummary", "boutiqueTab", "apparelMainTab", "apparelMainTabWithMiniappParam", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LinkGenerator {

    @NotNull
    public static final LinkGenerator INSTANCE = new LinkGenerator();

    private LinkGenerator() {
    }

    public static /* synthetic */ Uri clearToRootTab$default(LinkGenerator linkGenerator, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        return linkGenerator.clearToRootTab(str);
    }

    public static /* synthetic */ Uri externalLink$default(LinkGenerator linkGenerator, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return linkGenerator.externalLink(str, z11);
    }

    public static /* synthetic */ Uri payment$default(LinkGenerator linkGenerator, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        return linkGenerator.payment(str, str2);
    }

    public static /* synthetic */ Uri pdfViewer$default(LinkGenerator linkGenerator, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return linkGenerator.pdfViewer(str, z11);
    }

    public static /* synthetic */ Uri webView$default(LinkGenerator linkGenerator, String str, String str2, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        if ((i11 & 8) != 0) {
            z12 = false;
        }
        return linkGenerator.webView(str, str2, z11, z12);
    }

    @NotNull
    public final Uri apparelMainTab() {
        Uri build = new Uri.Builder().scheme("ozon").authority("fashion").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri apparelMainTabWithMiniappParam() {
        Uri build = new Uri.Builder().scheme("ozon").authority("fashion").appendQueryParameter("miniapp", "apparel").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri auth() {
        Uri build = new Uri.Builder().scheme("ozon").authority("my").appendPath("entry").appendPath("credentials-required").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri bankTab() {
        Uri build = new Uri.Builder().scheme("ozon").authority("banktab").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri boutiqueTab() {
        return C4029k.a("ozon", "highlight", "ozon-fashion-1322701", "build(...)");
    }

    @NotNull
    public final Uri cabinet() {
        Uri build = new Uri.Builder().scheme("ozon").authority("my").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri cancelReasons() {
        return C4029k.a("ozon", "my", "cancelReasons", "build(...)");
    }

    @NotNull
    public final Uri cart() {
        Uri build = new Uri.Builder().scheme("ozon").authority("cart").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri category() {
        Uri build = new Uri.Builder().scheme("ozon").authority("category").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri categoryClothes() {
        return C4029k.a("ozon", "category", "7501", "build(...)");
    }

    @NotNull
    public final Uri chat() {
        Uri build = new Uri.Builder().scheme("ozon").authority("communications").appendPath("chats").appendPath("chat").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri clearBackStack() {
        Uri build = new Uri.Builder().scheme("ozon").authority("navigation").appendQueryParameter("action", "clearBackStack").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public final Uri clearToRootTab(String deeplink) {
        Uri.Builder appendPath = new Uri.Builder().scheme("ozon").authority("navigation").appendPath("clearToRootTab");
        if (deeplink != null) {
            appendPath.appendQueryParameter("link", deeplink);
        }
        return appendPath.build();
    }

    @NotNull
    public final Uri closeMiniApp() {
        Uri build = new Uri.Builder().scheme("ozon").authority("closeMiniApp").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri createFavoritesList() {
        Uri build = new Uri.Builder().scheme("ozon").authority("my").appendPath("favorites").appendPath("create").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri debugScreenDeleteAbVariants() {
        Uri build = new Uri.Builder().scheme("ozontech").authority("abvariants").appendQueryParameter("delete", "").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri debugScreenDeleteInternalHeadersToken() {
        Uri build = new Uri.Builder().scheme("ozontech").authority("internal_headers_token").appendQueryParameter("delete", "").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri debugScreenDeleteMesh() {
        Uri build = new Uri.Builder().scheme("ozontech").authority("mesh").appendQueryParameter("delete", "").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri debugScreenSetAbVariants(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Uri build = new Uri.Builder().scheme("ozontech").authority("abvariants").appendQueryParameter("replace", value).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri debugScreenSetInternalHeadersToken(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Uri build = new Uri.Builder().scheme("ozontech").authority("internal_headers_token").appendQueryParameter(AppMeasurementSdk.ConditionalUserProperty.VALUE, value).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri debugScreenSetMesh(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Uri build = new Uri.Builder().scheme("ozontech").authority("mesh").appendQueryParameter("version", value).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri debugShowNotification() {
        return C4029k.a("ozontech", "debug", "widgets", "build(...)");
    }

    @NotNull
    public final Uri elevenNovember() {
        return C4029k.a("ozon", "info", "11-november-special", "build(...)");
    }

    @NotNull
    public final Uri errorSummary() {
        Uri build = new Uri.Builder().scheme("ozontech").authority("debug").path("errorsummary").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri express() {
        Uri build = new Uri.Builder().scheme("ozon").authority("category").appendEncodedPath("25000").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri expressDeliveryTariff() {
        Uri build = new Uri.Builder().scheme("ozon").authority("express").appendEncodedPath("deliveryTariff").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri expressMinimarket() {
        Uri build = new Uri.Builder().scheme("ozon").authority("category").appendEncodedPath("25001").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri externalLink(@NotNull String value, boolean newTask) {
        Intrinsics.checkNotNullParameter(value, "value");
        Uri build = new Uri.Builder().scheme("ozon").authority("external").appendQueryParameter(ImagesContract.URL, value).appendQueryParameter("new_task", String.valueOf(newTask)).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri favorites() {
        return C4029k.a("ozon", "my", "favorites", "build(...)");
    }

    @NotNull
    public final Uri globalTab() {
        return C4029k.a("ozon", "highlight", "ozon-global", "build(...)");
    }

    @NotNull
    public final Uri home() {
        Uri build = new Uri.Builder().scheme("ozon").authority("home").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri listFavoriteWithTitle(@NotNull String deeplink, @NotNull String title) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(title, "title");
        Uri build = Uri.parse(deeplink).buildUpon().appendQueryParameter("FavoriteDeeplinkParams_title", title).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri login() {
        Uri build = new Uri.Builder().scheme("ozon").authority("login").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri mapSelector(@NotNull String title, double latitude, double longitude) {
        Intrinsics.checkNotNullParameter(title, "title");
        Uri build = new Uri.Builder().scheme("ozon").authority("mapSelector").appendQueryParameter(SelectionItemFormDTO.TITLE_FIELD_NAME, title).appendQueryParameter("lat", String.valueOf(latitude)).appendQueryParameter("lng", String.valueOf(longitude)).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri modal() {
        Uri build = new Uri.Builder().scheme("ozon").authority("modal").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri newPvzOrderDetails() {
        Uri build = new Uri.Builder().scheme("ozon").authority("newPvzOrderDetails").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri payment(@NotNull String externalUrl, String cancelLink) {
        Intrinsics.checkNotNullParameter(externalUrl, "externalUrl");
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("ozon").authority("payment").appendQueryParameter(ImagesContract.URL, externalUrl);
        if (cancelLink != null) {
            appendQueryParameter.appendQueryParameter("cancelLink", cancelLink);
        }
        Uri build = appendQueryParameter.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri pdfViewer(@NotNull String externalUrl, boolean ignoreAuthoriseToken) {
        Intrinsics.checkNotNullParameter(externalUrl, "externalUrl");
        Uri build = new Uri.Builder().scheme("ozon").authority("pdf").appendQueryParameter(ImagesContract.URL, externalUrl).appendQueryParameter("ignoreAuthoriseToken", String.valueOf(ignoreAuthoriseToken)).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri scanItIntro() {
        Uri build = new Uri.Builder().scheme("ozon").authority("scanItIntro").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri searchSuggestions(String searchText, String deeplink, String link, String hint) {
        Uri parse;
        String queryParameter = (deeplink == null || (parse = Uri.parse(deeplink)) == null) ? null : parse.getQueryParameter("miniapp");
        Uri.Builder authority = new Uri.Builder().scheme("ozon").authority("searchSuggestions");
        if (searchText != null) {
            authority.appendQueryParameter("search_text", searchText);
        }
        if (deeplink != null) {
            authority.appendQueryParameter("search_screen_deeplink", deeplink);
        }
        if (link != null) {
            authority.appendQueryParameter("search_deeplink", link);
        }
        if (hint != null) {
            authority.appendQueryParameter("search_hint", hint);
        }
        if (queryParameter != null) {
            authority.appendQueryParameter("miniapp", queryParameter);
        }
        Uri build = authority.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri searchTab() {
        return C4029k.a("ozon", "info", "searchtab", "build(...)");
    }

    @NotNull
    public final Uri seller() {
        Uri build = new Uri.Builder().scheme("ozon").authority("seller").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri social() {
        Uri build = new Uri.Builder().scheme("ozon").authority("social").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri socialFullView() {
        return C4029k.a("ozon", "social", "feed", "build(...)");
    }

    @NotNull
    public final Uri superEconom() {
        return C4029k.a("ozon", "highlight", "populyarnye-tovary-1551703", "build(...)");
    }

    @NotNull
    public final Uri superEconomNew() {
        return C4029k.a("ozon", "highlight", "tovary-narashvat-1789580", "build(...)");
    }

    @NotNull
    public final Uri trackerTestMode(boolean isEnabled) {
        Uri build = new Uri.Builder().scheme("ozontech").authority("debug").appendPath("trackerTestMode").appendQueryParameter(AppMeasurementSdk.ConditionalUserProperty.VALUE, String.valueOf(isEnabled)).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri travelFavorites() {
        return C4029k.a("ozon", "travel", "favorites", "build(...)");
    }

    @NotNull
    public final Uri travelMain() {
        return C4029k.a("ozon", "travel", "main", "build(...)");
    }

    @NotNull
    public final Uri travelMainFlight() {
        return C4029k.a("ozon", "travel", "mainFlight", "build(...)");
    }

    @NotNull
    public final Uri travelMainGeneral() {
        return C4029k.a("ozon", "travel", "mainGeneral", "build(...)");
    }

    @NotNull
    public final Uri travelMainHotel() {
        return C4029k.a("ozon", "travel", "mainHotel", "build(...)");
    }

    @NotNull
    public final Uri travelMainRailway() {
        return C4029k.a("ozon", "travel", "mainRailway", "build(...)");
    }

    @NotNull
    public final Uri travelMainTour() {
        return C4029k.a("ozon", "travel", "mainTour", "build(...)");
    }

    @NotNull
    public final Uri travelTickets() {
        return C4029k.a("ozon", "travel", "orderList", "build(...)");
    }

    @NotNull
    public final Uri webView(@NotNull String externalUrl, String title, boolean authRequired, boolean isBackStackEnabled) {
        Intrinsics.checkNotNullParameter(externalUrl, "externalUrl");
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("ozon").authority("web").appendQueryParameter(ImagesContract.URL, externalUrl).appendQueryParameter("isBackStackEnabled", String.valueOf(isBackStackEnabled));
        if (authRequired) {
            appendQueryParameter = appendQueryParameter.appendPath("auth");
        }
        Uri build = appendQueryParameter.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
