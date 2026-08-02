package com.blaze.blazesdk.features.shared.models.ui_shared;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/features/shared/models/ui_shared/BlazeLinkActionHandleType;", "", "Companion", "WEB", "DEEPLINK", "HANDLED", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum BlazeLinkActionHandleType {
    WEB("Web"),
    DEEPLINK("Deeplink"),
    HANDLED("Handled"),
    UNKNOWN("Unknown");

    public static final Companion b = new Companion(null);
    public final String a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/blaze/blazesdk/features/shared/models/ui_shared/BlazeLinkActionHandleType$Companion;", "", "", "type", "Lcom/blaze/blazesdk/features/shared/models/ui_shared/BlazeLinkActionHandleType;", "typeFromString", "(Ljava/lang/String;)Lcom/blaze/blazesdk/features/shared/models/ui_shared/BlazeLinkActionHandleType;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @Keep
        @Nullable
        public final BlazeLinkActionHandleType typeFromString(@Nullable String type) {
            for (BlazeLinkActionHandleType blazeLinkActionHandleType : BlazeLinkActionHandleType.values()) {
                if (Intrinsics.c(blazeLinkActionHandleType.a, type)) {
                    return blazeLinkActionHandleType;
                }
            }
            return null;
        }
    }

    BlazeLinkActionHandleType(String str) {
        this.a = str;
    }
}
