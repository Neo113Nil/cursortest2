package com.vk.core.view.components.userstack;

import com.vk.core.view.components.userstack.VkDiagonalUserStack;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DiagonalUserStackParams.kt */
/* loaded from: classes17.dex */
public final class a {

    /* compiled from: DiagonalUserStackParams.kt */
    /* renamed from: com.vk.core.view.components.userstack.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0887a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkDiagonalUserStack.Size.values().length];
            try {
                iArr[VkDiagonalUserStack.Size.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkDiagonalUserStack.Size.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkDiagonalUserStack.Size.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkDiagonalUserStack.Size.ExtraLarge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static float a(VkDiagonalUserStack.Size size) {
        int i = C0887a.$EnumSwitchMapping$0[size.ordinal()];
        if (i == 1) {
            return 8.0f;
        }
        if (i == 2) {
            return 10.0f;
        }
        if (i == 3) {
            return 12.0f;
        }
        if (i == 4) {
            return 16.0f;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static float b(VkDiagonalUserStack.Size size) {
        int i = C0887a.$EnumSwitchMapping$0[size.ordinal()];
        if (i == 1) {
            return 16.0f;
        }
        if (i == 2) {
            return 20.0f;
        }
        if (i == 3) {
            return 24.0f;
        }
        if (i == 4) {
            return 32.0f;
        }
        throw new NoWhenBranchMatchedException();
    }
}
