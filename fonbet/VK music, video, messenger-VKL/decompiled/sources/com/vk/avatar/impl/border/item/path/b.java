package com.vk.avatar.impl.border.item.path;

import android.graphics.Path;
import com.vk.avatar.impl.border.item.path.VKAvatarBorderPathBuilder;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VKAvatarBorderSquarePathBuilder.kt */
/* loaded from: classes15.dex */
public final class b extends VKAvatarBorderPathBuilder {

    /* compiled from: VKAvatarBorderSquarePathBuilder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VKAvatarBorderPathBuilder.PathPurpose.values().length];
            try {
                iArr[VKAvatarBorderPathBuilder.PathPurpose.DRAW_BORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VKAvatarBorderPathBuilder.PathPurpose.CROP_AVATAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.vk.avatar.impl.border.item.path.VKAvatarBorderPathBuilder
    public final Path a(float f, float f2, float f3, VKAvatarBorderPathBuilder.PathPurpose pathPurpose) {
        float f4;
        Path path = new Path();
        float f5 = f - f3;
        float f6 = f2 - f3;
        float f7 = f + f3;
        float f8 = f2 + f3;
        int i = a.$EnumSwitchMapping$0[pathPurpose.ordinal()];
        if (i == 1) {
            f4 = 0.7f;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f4 = 0.65f;
        }
        float f9 = f3 * f4;
        path.addRoundRect(f5, f6, f7, f8, f9, f9, Path.Direction.CCW);
        return path;
    }
}
