package com.facebook.react.modules.network;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/facebook/react/modules/network/HeaderUtil;", "", "<init>", "()V", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HeaderUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/modules/network/HeaderUtil$Companion;", "", "<init>", "()V", "stripHeaderName", "", "name", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String stripHeaderName(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            StringBuilder sb2 = new StringBuilder(name.length());
            int length = name.length();
            boolean z10 = false;
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = name.charAt(i10);
                if (Intrinsics.compare((int) charAt, 32) <= 0 || Intrinsics.compare((int) charAt, 127) >= 0) {
                    z10 = true;
                } else {
                    sb2.append(charAt);
                }
            }
            if (!z10) {
                return name;
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            return sb3;
        }

        private Companion() {
        }
    }

    @JvmStatic
    @NotNull
    public static final String stripHeaderName(@NotNull String str) {
        return INSTANCE.stripHeaderName(str);
    }
}
