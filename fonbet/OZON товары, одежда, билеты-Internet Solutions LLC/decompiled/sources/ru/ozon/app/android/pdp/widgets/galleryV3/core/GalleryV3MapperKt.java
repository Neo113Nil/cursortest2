package ru.ozon.app.android.pdp.widgets.galleryV3.core;

import kotlin.Metadata;
import kotlin.text.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"", "", "getCanShowApparelTheme", "(Ljava/lang/String;)Z", "canShowApparelTheme", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV3MapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getCanShowApparelTheme(String str) {
        return h.t(str, "miniapp=apparel", true);
    }
}
