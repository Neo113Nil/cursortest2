package com.vk.id.onetap.compose.icon;

import Sc.o;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.vk.id.onetap.common.icon.style.InternalVKIconSizeStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/vk/id/onetap/common/icon/style/InternalVKIconSizeStyle;", "", "asIconSize", "(Lcom/vk/id/onetap/common/icon/style/InternalVKIconSizeStyle;)I", "Landroidx/compose/ui/e;", "style", "size", "(Landroidx/compose/ui/e;Lcom/vk/id/onetap/common/icon/style/InternalVKIconSizeStyle;)Landroidx/compose/ui/e;", "onetap-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VKIconSizeStyleKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InternalVKIconSizeStyle.values().length];
            try {
                iArr[InternalVKIconSizeStyle.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InternalVKIconSizeStyle.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int asIconSize(@NotNull InternalVKIconSizeStyle internalVKIconSizeStyle) {
        Intrinsics.checkNotNullParameter(internalVKIconSizeStyle, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[internalVKIconSizeStyle.ordinal()];
        if (i11 == 1) {
            return 24;
        }
        if (i11 == 2) {
            return 28;
        }
        throw new o();
    }

    @NotNull
    public static final e size(@NotNull e eVar, @NotNull InternalVKIconSizeStyle style) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        return a0.n(eVar, asIconSize(style));
    }
}
