package ru.ozon.app.android.pikazon.glide.loaders;

import Ud0.a;
import We.A;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.util.CdnChooserUtilsKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pikazon/glide/loaders/CdnChooserUrlChecker;", "", "imageRulesProvider", "Lru/ozon/app/android/pikazon/glide/loaders/CdnChooserUrlChecker$ImageRulesProvider;", "<init>", "(Lru/ozon/app/android/pikazon/glide/loaders/CdnChooserUrlChecker$ImageRulesProvider;)V", "checkAndTransformUrl", "", ImagesContract.URL, "canResizeImage", "", "uri", "Landroid/net/Uri;", "ImageRulesProvider", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CdnChooserUrlChecker {

    @NotNull
    private final ImageRulesProvider imageRulesProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pikazon/glide/loaders/CdnChooserUrlChecker$ImageRulesProvider;", "", "", "LUd0/a$a;", "provide", "()Ljava/util/List;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ImageRulesProvider {
        List<a.AbstractC0559a> provide();
    }

    public CdnChooserUrlChecker(@NotNull ImageRulesProvider imageRulesProvider) {
        Intrinsics.checkNotNullParameter(imageRulesProvider, "imageRulesProvider");
        this.imageRulesProvider = imageRulesProvider;
    }

    public final boolean canResizeImage(@NotNull Uri uri) {
        List<a.AbstractC0559a> provide;
        a.AbstractC0559a findRuleForHostOrNull;
        Boolean a11;
        Intrinsics.checkNotNullParameter(uri, "uri");
        String host = uri.getHost();
        if (host == null || (provide = this.imageRulesProvider.provide()) == null || (findRuleForHostOrNull = CdnChooserUtilsKt.findRuleForHostOrNull(provide, host)) == null || (a11 = findRuleForHostOrNull.a()) == null) {
            return false;
        }
        return a11.booleanValue();
    }

    @NotNull
    public final String checkAndTransformUrl(@NotNull String url) {
        List<a.AbstractC0559a> provide;
        a.AbstractC0559a findRuleForHostOrNull;
        String c11;
        Intrinsics.checkNotNullParameter(url, "url");
        A.f33515l.getClass();
        A e11 = A.b.e(url);
        if (e11 != null && (provide = this.imageRulesProvider.provide()) != null && (findRuleForHostOrNull = CdnChooserUtilsKt.findRuleForHostOrNull(provide, e11.h())) != null) {
            String p11 = e11.p("ignore_resize");
            boolean parseBoolean = p11 != null ? Boolean.parseBoolean(p11) : false;
            if (!Intrinsics.d(findRuleForHostOrNull.a(), Boolean.TRUE) || parseBoolean) {
                String d11 = findRuleForHostOrNull.d();
                c11 = d11 == null ? findRuleForHostOrNull.c() : d11;
            } else {
                c11 = findRuleForHostOrNull.c();
            }
            if (c11 != null) {
                A.a j11 = e11.j();
                j11.j(c11);
                return j11.e().toString();
            }
        }
        return url;
    }
}
