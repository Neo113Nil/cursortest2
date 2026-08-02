package ru.ozon.app.android.common.actionHandlers;

import Ci.C2779a;
import Ci.b;
import Ci.g;
import Ci.k;
import Ci.l;
import Hi.h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.R;
import ru.ozon.app.android.network.version.AppVersionService;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LCi/k;", "invoke", "()LCi/k;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class PickImageActionHandler$galleryConfig$2 extends AbstractC7737t implements Function0<k> {
    final /* synthetic */ PickImageActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PickImageActionHandler$galleryConfig$2(PickImageActionHandler pickImageActionHandler) {
        super(0);
        this.this$0 = pickImageActionHandler;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final k invoke() {
        AppVersionService appVersionService;
        k b11 = C2779a.b();
        PickImageActionHandler pickImageActionHandler = this.this$0;
        AppVersionService.Companion companion = AppVersionService.INSTANCE;
        appVersionService = pickImageActionHandler.appVersionService;
        return k.b(b11, companion.isSelect(appVersionService) ? R.style.OzonGallerySelectTheme : R.style.OzonGalleryTheme, h.d.f11018a, b.a(b11.d(), g.a(b11.d().f(), null, null, l.RESULT_API_ONLY, 31), null, 1, 1918), C2779a.a(), 242);
    }
}
