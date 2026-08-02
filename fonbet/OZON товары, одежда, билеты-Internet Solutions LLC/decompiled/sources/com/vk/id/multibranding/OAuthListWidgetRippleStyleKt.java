package com.vk.id.multibranding;

import Sc.o;
import com.vk.id.multibranding.common.style.InternalVKIDOAuthListWidgetRippleStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/id/multibranding/common/style/InternalVKIDOAuthListWidgetRippleStyle;", "Ll1/Z;", "asColor", "(Lcom/vk/id/multibranding/common/style/InternalVKIDOAuthListWidgetRippleStyle;)J", "multibranding-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OAuthListWidgetRippleStyleKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InternalVKIDOAuthListWidgetRippleStyle.values().length];
            try {
                iArr[InternalVKIDOAuthListWidgetRippleStyle.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InternalVKIDOAuthListWidgetRippleStyle.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final long asColor(@NotNull InternalVKIDOAuthListWidgetRippleStyle internalVKIDOAuthListWidgetRippleStyle) {
        long j11;
        long j12;
        Intrinsics.checkNotNullParameter(internalVKIDOAuthListWidgetRippleStyle, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[internalVKIDOAuthListWidgetRippleStyle.ordinal()];
        if (i11 == 1) {
            int i12 = C7807Z.f72260n;
            j11 = C7807Z.f72248b;
            return j11;
        }
        if (i11 != 2) {
            throw new o();
        }
        int i13 = C7807Z.f72260n;
        j12 = C7807Z.f72251e;
        return j12;
    }
}
