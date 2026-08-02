package ru.ozon.app.android.ads.widgets.advBanner.v4.data;

import android.content.Context;
import com.google.android.gms.common.internal.ImagesContract;
import hd.C6915b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.flags.AdvBannerV4LoadOptimizationFlag;
import ru.ozon.app.android.ads.widgets.advBanner.v4.data.AdvBannerV4DTO;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.AdvBannerV4PlainView;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.rv.AdvBannerV4PlainItemAdapter;
import ru.ozon.app.android.csma.flags.AdvBannerV4ImagePrefetchFlag;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.image.ImageSize;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0014\u001a\u00020\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001c\u001a\u00020\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4ImagePrefetcher;", "", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Landroid/content/Context;", "context", "Lxe/M;", "scope", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/network/abtool/FeatureChecker;Landroid/content/Context;Lxe/M;)V", "", "Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$ItemDTO;", "items", "", "aspectRatio", "", ImagesContract.URL, "", "prefetchInternal", "(Ljava/util/List;Ljava/lang/Float;Ljava/lang/String;)V", "Lru/ozon/app/android/pikazon/image/ImageSize;", "getSize", "(Ljava/lang/Float;)Lru/ozon/app/android/pikazon/image/ImageSize;", "", "shouldPrefetch", "(Ljava/lang/String;)Z", "prefetch", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Landroid/content/Context;", "Lxe/M;", "", "width", "I", "Companion", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvBannerV4ImagePrefetcher {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Context context;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final M scope;
    private final int width;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4ImagePrefetcher$Companion;", "", "<init>", "()V", "ALL", "", "PATH_DELIMITER", "", "DEFAULT_ASPECT_RATIO", "", "VISIBLE_ITEMS_COUNT", "", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AdvBannerV4ImagePrefetcher(@NotNull FeatureService featureService, @NotNull FeatureChecker featureChecker, @NotNull Context context, @NotNull M scope) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.featureService = featureService;
        this.featureChecker = featureChecker;
        this.context = context;
        this.scope = scope;
        this.width = context.getResources().getDisplayMetrics().widthPixels - ((AdvBannerV4PlainView.INSTANCE.getRV_PADDINGS_PX() + AdvBannerV4PlainItemAdapter.INSTANCE.getVIEW_MARGIN_PX()) * 2);
    }

    private final ImageSize getSize(Float aspectRatio) {
        return new ImageSize(this.width, C6915b.c(this.width * (aspectRatio != null ? aspectRatio.floatValue() : 1.0f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prefetchInternal(List<AdvBannerV4DTO.ItemDTO> items, Float aspectRatio, String url) {
        if (shouldPrefetch(url)) {
            if (items.size() >= 3) {
                items = C7714v.b0(items.get(0), items.get(1), items.get(C7714v.P(items)));
            }
            ImageSize size = getSize(aspectRatio);
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                ContextExtKt.load(this.context, ((AdvBannerV4DTO.ItemDTO) it.next()).getImage(), (r15 & 2) != 0 ? K.f71697a : null, (r15 & 4) != 0 ? null : null, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? LoadPriority.NORMAL : null, (r15 & 32) != 0 ? false : false, (r15 & 64) != 0 ? null : size);
            }
        }
    }

    private final boolean shouldPrefetch(String url) {
        String stringKey = this.featureService.getStringKey(AdvBannerV4ImagePrefetchFlag.INSTANCE);
        if (stringKey.length() != 0) {
            if (!stringKey.equals("all")) {
                List l11 = h.l(stringKey, new char[]{','}, 0, 6);
                if (!(l11 instanceof Collection) || !l11.isEmpty()) {
                    Iterator it = l11.iterator();
                    while (it.hasNext()) {
                        if (url != null ? h.e0(url, (String) it.next(), false) : false) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void prefetch(@NotNull List<AdvBannerV4DTO.ItemDTO> items, Float aspectRatio, String url) {
        Intrinsics.checkNotNullParameter(items, "items");
        if (items.isEmpty()) {
            return;
        }
        if (this.featureChecker.isEnabled(AdvBannerV4LoadOptimizationFlag.INSTANCE)) {
            C10727i.c(this.scope, null, null, new AdvBannerV4ImagePrefetcher$prefetch$1(this, items, aspectRatio, url, null), 3);
        } else {
            prefetchInternal(items, aspectRatio, url);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdvBannerV4ImagePrefetcher(FeatureService featureService, FeatureChecker featureChecker, Context context, M m11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(featureService, featureChecker, context, m11);
        if ((i11 & 8) != 0) {
            m11 = N.a(CoroutineContext.Element.a.d(C10720e0.a(), (H0) X0.b()));
        }
    }
}
