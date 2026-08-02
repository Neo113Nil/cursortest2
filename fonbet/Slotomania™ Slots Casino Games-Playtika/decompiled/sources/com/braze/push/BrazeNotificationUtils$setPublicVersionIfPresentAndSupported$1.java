package com.braze.push;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: BrazeNotificationUtils.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
final class BrazeNotificationUtils$setPublicVersionIfPresentAndSupported$1 extends Lambda implements Function0<String> {
    public static final BrazeNotificationUtils$setPublicVersionIfPresentAndSupported$1 INSTANCE = new BrazeNotificationUtils$setPublicVersionIfPresentAndSupported$1();

    BrazeNotificationUtils$setPublicVersionIfPresentAndSupported$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return "Cannot set public version before Lollipop";
    }
}
