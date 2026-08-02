package com.braze.ui.inappmessage;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InAppMessageOperation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/braze/ui/inappmessage/InAppMessageOperation;", "", "(Ljava/lang/String;I)V", "DISPLAY_NOW", "DISPLAY_LATER", "DISCARD", k.M, "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum InAppMessageOperation {
    DISPLAY_NOW,
    DISPLAY_LATER,
    DISCARD;


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final InAppMessageOperation fromValue(String str) {
        return INSTANCE.fromValue(str);
    }

    /* compiled from: InAppMessageOperation.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/braze/ui/inappmessage/InAppMessageOperation$Companion;", "", "()V", "fromValue", "Lcom/braze/ui/inappmessage/InAppMessageOperation;", "value", "", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InAppMessageOperation fromValue(String value) {
            String str;
            InAppMessageOperation inAppMessageOperation;
            String name;
            InAppMessageOperation[] values = InAppMessageOperation.values();
            int length = values.length;
            int i = 0;
            do {
                str = null;
                if (i >= length) {
                    return null;
                }
                inAppMessageOperation = values[i];
                i++;
                name = inAppMessageOperation.name();
                if (value != null) {
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    str = value.toUpperCase(US);
                    Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toUpperCase(locale)");
                }
            } while (!Intrinsics.areEqual(name, str));
            return inAppMessageOperation;
        }
    }
}
