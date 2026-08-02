package ru.ozon.app.android.video.domainreplacement.domain;

import ZY.a;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.player.CdnChooserSdkVideoService;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementServiceImpl;", "Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementService;", "cdnChooserSdkVideoService", "Lru/ozon/app/android/video/player/CdnChooserSdkVideoService;", "<init>", "(Lru/ozon/app/android/video/player/CdnChooserSdkVideoService;)V", "getUrlWithActualDomain", "", ImagesContract.URL, "getHostByVideoRules", "originalUri", "Landroid/net/Uri;", "Companion", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoDomainReplacementServiceImpl implements VideoDomainReplacementService {

    @NotNull
    private final CdnChooserSdkVideoService cdnChooserSdkVideoService;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementServiceImpl$Companion;", "", "<init>", "()V", "TYPE_QUERY_PARAM_NAME", "", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public VideoDomainReplacementServiceImpl(@NotNull CdnChooserSdkVideoService cdnChooserSdkVideoService) {
        Intrinsics.checkNotNullParameter(cdnChooserSdkVideoService, "cdnChooserSdkVideoService");
        this.cdnChooserSdkVideoService = cdnChooserSdkVideoService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    private final String getHostByVideoRules(Uri originalUri) {
        List<a.c> invoke;
        Object obj;
        a.c cVar;
        String c11;
        Object obj2;
        a.c cVar2;
        String c12;
        Function0<List<a.c>> cdnVideoRulesProvider = this.cdnChooserSdkVideoService.getCdnVideoRulesProvider();
        if (cdnVideoRulesProvider != null && (invoke = cdnVideoRulesProvider.invoke()) != null) {
            String queryParameter = originalUri.getQueryParameter("type");
            String host = originalUri.getHost();
            if (queryParameter == null || queryParameter.length() == 0) {
                Iterator it = invoke.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    a.c cVar3 = (a.c) obj;
                    if (Intrinsics.d(cVar3.a(), host) && ((c11 = cVar3.c()) == null || c11.length() == 0)) {
                        break;
                    }
                }
                cVar = (a.c) obj;
            } else {
                List<a.c> list = invoke;
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    a.c cVar4 = (a.c) obj2;
                    if (Intrinsics.d(cVar4.a(), host) && Intrinsics.d(cVar4.c(), queryParameter)) {
                        break;
                    }
                }
                cVar = (a.c) obj2;
                if (cVar == null) {
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            cVar2 = 0;
                            break;
                        }
                        cVar2 = it3.next();
                        a.c cVar5 = (a.c) cVar2;
                        if (Intrinsics.d(cVar5.a(), host) && ((c12 = cVar5.c()) == null || c12.length() == 0)) {
                            break;
                        }
                    }
                    cVar = cVar2;
                }
            }
            if (cVar != null) {
                return cVar.b();
            }
        }
        return null;
    }

    @Override // ru.ozon.app.android.video.domainreplacement.domain.VideoDomainReplacementService
    @NotNull
    public String getUrlWithActualDomain(@NotNull String url) {
        String uri;
        Intrinsics.checkNotNullParameter(url, "url");
        Uri parse = Uri.parse(url);
        String hostByVideoRules = getHostByVideoRules(parse);
        return (hostByVideoRules == null || (uri = parse.buildUpon().authority(hostByVideoRules).build().toString()) == null) ? url : uri;
    }
}
