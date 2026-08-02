package ru.ozon.app.android.pikazon.imagePathHandler;

import Sc.InterfaceC3999a;
import We.A;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.glide.loaders.CdnChooserUrlChecker;
import ru.ozon.app.android.pikazon.image.ImageSizeOptimizer;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\bJ \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\f\u0010\u0015\u001a\u00020\u000f*\u00020\u000fH\u0002J\f\u0010\u0016\u001a\u00020\u0017*\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0017H\u0002J\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J \u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\f\u0010\u001c\u001a\u00020\r*\u00020\u000fH\u0002J\f\u0010\u001d\u001a\u00020\u000f*\u00020\u0017H\u0002J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lru/ozon/app/android/pikazon/imagePathHandler/ImagePathHandlerImpl;", "Lru/ozon/app/android/pikazon/imagePathHandler/ImagePathHandler;", "cdnChooserUrlChecker", "Lru/ozon/app/android/pikazon/glide/loaders/CdnChooserUrlChecker;", "<init>", "(Lru/ozon/app/android/pikazon/glide/loaders/CdnChooserUrlChecker;)V", "imagePathHandlerConfig", "Lru/ozon/app/android/pikazon/imagePathHandler/ImagePathHandlerConfig;", "(Lru/ozon/app/android/pikazon/imagePathHandler/ImagePathHandlerConfig;Lru/ozon/app/android/pikazon/glide/loaders/CdnChooserUrlChecker;)V", "imageSizeOptimizer", "Lru/ozon/app/android/pikazon/image/ImageSizeOptimizer;", "isCdnChooserEnabled", "Lkotlin/Function0;", "", "getResizedImagePath", "", ImagesContract.URL, "width", "", "height", "isUrlContainsResize", "resolveRelativePathIfNeeded", "restoreSchemeIfNeeded", "Landroid/net/Uri;", "canResize", "uri", "isValidDimensions", "resizeUrl", "isDigital", "setupSizeAttribute", "clearServiceDataIfNeeded", "decodeUri", "Companion", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImagePathHandlerImpl implements ImagePathHandler {

    @NotNull
    private static final Regex manualResizeRegex = new Regex("/(w?[cbhw])[0-9]+/[^/]+\\.");

    @NotNull
    private static final Set<String> serviceQueryParams;

    @NotNull
    private final CdnChooserUrlChecker cdnChooserUrlChecker;

    @NotNull
    private final ImagePathHandlerConfig imagePathHandlerConfig;

    @NotNull
    private final ImageSizeOptimizer imageSizeOptimizer;

    @NotNull
    private final Function0<Boolean> isCdnChooserEnabled;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pikazon.imagePathHandler.ImagePathHandlerImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pikazon.imagePathHandler.ImagePathHandlerImpl$2, reason: invalid class name */
    /* loaded from: classes13.dex */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(Pikazon.INSTANCE.getInstance().getCdnChooserConfigFlow$lib_release() != null);
        }
    }

    static {
        String[] elements = {"ignore_resize", "set_square_size", "set_only_width", "set_only_height"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        serviceQueryParams = C7705l.j0(elements);
    }

    public ImagePathHandlerImpl(@NotNull CdnChooserUrlChecker cdnChooserUrlChecker) {
        Intrinsics.checkNotNullParameter(cdnChooserUrlChecker, "cdnChooserUrlChecker");
        this.imageSizeOptimizer = new ImageSizeOptimizer();
        this.imagePathHandlerConfig = new ImagePathHandlerConfig(K.f71697a, true);
        this.cdnChooserUrlChecker = cdnChooserUrlChecker;
        this.isCdnChooserEnabled = AnonymousClass1.INSTANCE;
    }

    private final boolean canResize(Uri uri) {
        if (this.isCdnChooserEnabled.invoke().booleanValue()) {
            return this.cdnChooserUrlChecker.canResizeImage(uri);
        }
        List<Regex> imageResizeWhiteList = this.imagePathHandlerConfig.getImageResizeWhiteList();
        if ((imageResizeWhiteList instanceof Collection) && imageResizeWhiteList.isEmpty()) {
            return false;
        }
        for (Regex regex : imageResizeWhiteList) {
            String host = uri.getHost();
            if (host == null) {
                host = "";
            }
            if (regex.f(host)) {
                return true;
            }
        }
        return false;
    }

    private final Uri clearServiceDataIfNeeded(Uri uri) {
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        for (String str : queryParameterNames) {
            Set<String> set = serviceQueryParams;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (h.D(str, (String) it.next(), true)) {
                        break;
                    }
                }
            }
            clearQuery.appendQueryParameter(str, uri.getQueryParameter(str));
        }
        Uri build = clearQuery.build();
        Intrinsics.checkNotNullExpressionValue(build, "with(...)");
        return build;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [We.A] */
    private final String decodeUri(Uri uri) {
        A.b bVar = A.f33515l;
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        bVar.getClass();
        ?? e11 = A.b.e(uri2);
        if (e11 != 0) {
            uri = e11;
        }
        return uri.toString();
    }

    private final boolean isDigital(String str) {
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (!Character.isDigit(str.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    private final boolean isValidDimensions(int width, int height) {
        return width > 0 && height > 0;
    }

    private final Uri resizeUrl(Uri uri, int width, int height) {
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        if (uri.getBooleanQueryParameter("ignore_resize", false) || h.A(uri2, ".gif", false) || isUrlContainsResize(uri2)) {
            return uri;
        }
        Uri.Builder path = uri.buildUpon().path("");
        ImageSizeOptimizer imageSizeOptimizer = this.imageSizeOptimizer;
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        String valueOf = String.valueOf(imageSizeOptimizer.alignSize(width, height, queryParameterNames));
        String str = setupSizeAttribute(uri);
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        ArrayList W02 = C7714v.W0(pathSegments);
        if (W02.contains("graphics")) {
            int indexOf = W02.indexOf("graphics") + 1;
            Object obj = W02.get(indexOf);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            if (!isDigital((String) obj)) {
                W02.add(indexOf, valueOf);
            }
        } else if (W02.contains("multimedia") | W02.contains("s3") | C7714v.s(W02)) {
            W02.add(C7714v.P(W02), str + valueOf);
        }
        Iterator it = W02.iterator();
        while (it.hasNext()) {
            path.appendPath((String) it.next());
        }
        Uri build = path.build();
        Intrinsics.checkNotNullExpressionValue(build, "with(...)");
        return build;
    }

    private final String resolveRelativePathIfNeeded(String str) {
        CharSequence charSequence;
        String concat;
        int i11 = 0;
        String str2 = !(h.e0(str, "http", false) | h.e0(str, "https", false)) ? str : null;
        if (str2 != null) {
            int length = str2.length();
            while (true) {
                if (i11 >= length) {
                    charSequence = "";
                    break;
                }
                if (str2.charAt(i11) != '/') {
                    charSequence = str2.subSequence(i11, str2.length());
                    break;
                }
                i11++;
            }
            String obj = charSequence.toString();
            if (obj != null && (concat = "//".concat(obj)) != null) {
                return concat;
            }
        }
        return str;
    }

    private final Uri restoreSchemeIfNeeded(Uri uri) {
        Uri.Builder buildUpon = uri.buildUpon();
        String scheme = uri.getScheme();
        Uri build = buildUpon.scheme((scheme == null || scheme.length() == 0) ? "https" : uri.getScheme()).encodedPath(uri.getPath()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final String setupSizeAttribute(Uri uri) {
        return "w".concat(uri.getBooleanQueryParameter("set_square_size", false) ? "b" : uri.getBooleanQueryParameter("set_only_width", false) ? "w" : uri.getBooleanQueryParameter("set_only_height", false) ? "h" : "c");
    }

    @Override // ru.ozon.app.android.pikazon.imagePathHandler.ImagePathHandler
    @NotNull
    public String getResizedImagePath(@NotNull String url, int width, int height) {
        Uri resizeUrl;
        Intrinsics.checkNotNullParameter(url, "url");
        if (url.length() == 0) {
            return url;
        }
        Uri parse = Uri.parse(resolveRelativePathIfNeeded(url));
        Intrinsics.checkNotNullExpressionValue(parse, "let(...)");
        Uri restoreSchemeIfNeeded = restoreSchemeIfNeeded(parse);
        Uri uri = (canResize(restoreSchemeIfNeeded) && isValidDimensions(width, height)) ? restoreSchemeIfNeeded : null;
        if (uri != null && (resizeUrl = resizeUrl(uri, width, height)) != null) {
            restoreSchemeIfNeeded = resizeUrl;
        }
        return decodeUri(clearServiceDataIfNeeded(restoreSchemeIfNeeded));
    }

    public boolean isUrlContainsResize(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return manualResizeRegex.a(url);
    }

    @InterfaceC3999a
    public ImagePathHandlerImpl(@NotNull ImagePathHandlerConfig imagePathHandlerConfig, @NotNull CdnChooserUrlChecker cdnChooserUrlChecker) {
        Intrinsics.checkNotNullParameter(imagePathHandlerConfig, "imagePathHandlerConfig");
        Intrinsics.checkNotNullParameter(cdnChooserUrlChecker, "cdnChooserUrlChecker");
        this.imageSizeOptimizer = new ImageSizeOptimizer();
        this.imagePathHandlerConfig = imagePathHandlerConfig;
        this.cdnChooserUrlChecker = cdnChooserUrlChecker;
        this.isCdnChooserEnabled = AnonymousClass2.INSTANCE;
    }
}
