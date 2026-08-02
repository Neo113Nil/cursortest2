package com.vk.core.view.components.spinner;

import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.core.view.components.spinner.VkSpinner;

/* compiled from: Spinner.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[VkSpinner.SpinnerSize.values().length];
        try {
            iArr[VkSpinner.SpinnerSize.Size16.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VkSpinner.SpinnerSize.Size24.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VkSpinner.SpinnerSize.Size28.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[VkSpinner.SpinnerSize.Size36.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[VkSpinner.SpinnerSize.Size56.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[VkScreenSpinner.SpinnerMode.values().length];
        try {
            iArr2[VkScreenSpinner.SpinnerMode.Shadow.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[VkScreenSpinner.SpinnerMode.Overlay.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
