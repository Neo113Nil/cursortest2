package dV;

import UZ.d;
import WZ.e;
import WZ.g;
import java.util.Map;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.VideoEventDelegate;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.actionHandler.BaseSendReviewActionHandler;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61423a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f61424b;

    public /* synthetic */ c(Map map, int i11) {
        this.f61423a = i11;
        this.f61424b = map;
    }

    @Override // WZ.e
    public final g modifyParams(UZ.a aVar, g gVar) {
        g processVideoEvent$lambda$1;
        g sendSubmitEvent$lambda$3$lambda$2;
        switch (this.f61423a) {
            case 0:
                processVideoEvent$lambda$1 = VideoEventDelegate.processVideoEvent$lambda$1(this.f61424b, (d) aVar, gVar);
                return processVideoEvent$lambda$1;
            default:
                sendSubmitEvent$lambda$3$lambda$2 = BaseSendReviewActionHandler.sendSubmitEvent$lambda$3$lambda$2(this.f61424b, (d) aVar, gVar);
                return sendSubmitEvent$lambda$3$lambda$2;
        }
    }
}
