package ru.ozon.uni.android.uikitsdk.resources;

import kotlin.Metadata;
import kotlin.text.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u001a\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "", "isMulticolor", "(Ljava/lang/String;)Z", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DrawableResourceKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isMulticolor(String str) {
        return str != null && (h.t(str, "_multicolor_", false) || h.t(str, "_flag_", false));
    }
}
