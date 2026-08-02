package ru.ozon.app.android.commonwidgets.widgets.share.data;

import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.actionHandlers.shareLink.ShareButtonRepository;
import ru.ozon.app.android.common.actionHandlers.shareLink.ShareRequestLink;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/share/data/ShareButtonRepositoryImpl;", "Lru/ozon/app/android/common/actionHandlers/shareLink/ShareButtonRepository;", "Lru/ozon/app/android/commonwidgets/widgets/share/data/ShareButtonApi;", "shareButtonApi", "<init>", "(Lru/ozon/app/android/commonwidgets/widgets/share/data/ShareButtonApi;)V", "Lru/ozon/app/android/common/actionHandlers/shareLink/ShareRequestLink;", "shareRequestLink", "", "fetchLinkShare", "(Lru/ozon/app/android/common/actionHandlers/shareLink/ShareRequestLink;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/commonwidgets/widgets/share/data/ShareButtonApi;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ShareButtonRepositoryImpl implements ShareButtonRepository {

    @NotNull
    private final ShareButtonApi shareButtonApi;

    public ShareButtonRepositoryImpl(@NotNull ShareButtonApi shareButtonApi) {
        Intrinsics.checkNotNullParameter(shareButtonApi, "shareButtonApi");
        this.shareButtonApi = shareButtonApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // ru.ozon.app.android.common.actionHandlers.shareLink.ShareButtonRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchLinkShare(@NotNull ShareRequestLink shareRequestLink, @NotNull d<? super String> dVar) {
        ShareButtonRepositoryImpl$fetchLinkShare$1 shareButtonRepositoryImpl$fetchLinkShare$1;
        int i11;
        try {
            if (dVar instanceof ShareButtonRepositoryImpl$fetchLinkShare$1) {
                shareButtonRepositoryImpl$fetchLinkShare$1 = (ShareButtonRepositoryImpl$fetchLinkShare$1) dVar;
                int i12 = shareButtonRepositoryImpl$fetchLinkShare$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    shareButtonRepositoryImpl$fetchLinkShare$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = shareButtonRepositoryImpl$fetchLinkShare$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = shareButtonRepositoryImpl$fetchLinkShare$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        ShareButtonApi shareButtonApi = this.shareButtonApi;
                        String action = shareRequestLink.getAction();
                        Map<String, String> params = shareRequestLink.getParams();
                        shareButtonRepositoryImpl$fetchLinkShare$1.label = 1;
                        obj = shareButtonApi.fetchLink(action, params, shareButtonRepositoryImpl$fetchLinkShare$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    return ((ResponseLinkDTO) obj).getShortURL();
                }
            }
            if (i11 != 0) {
            }
            return ((ResponseLinkDTO) obj).getShortURL();
        } catch (Exception e11) {
            Lm0.a.f17149a.e(e11);
            return null;
        }
        shareButtonRepositoryImpl$fetchLinkShare$1 = new ShareButtonRepositoryImpl$fetchLinkShare$1(this, dVar);
        Object obj2 = shareButtonRepositoryImpl$fetchLinkShare$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = shareButtonRepositoryImpl$fetchLinkShare$1.label;
    }
}
