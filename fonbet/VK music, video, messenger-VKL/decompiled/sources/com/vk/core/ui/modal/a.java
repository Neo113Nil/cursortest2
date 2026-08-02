package com.vk.core.ui.modal;

import com.vk.core.ui.modal.VkModal;
import xsna.iah0;

/* compiled from: Modal.kt */
/* loaded from: classes17.dex */
public final class a {
    public static final int a = iah0.a(8);
    public static final float b = iah0.b(20.0f);
    public static final float c = iah0.b(12.0f);

    /* compiled from: Modal.kt */
    /* renamed from: com.vk.core.ui.modal.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0788a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkModal.Mode.values().length];
            try {
                iArr[VkModal.Mode.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkModal.Mode.FullScreen.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkModal.Mode.DynamicHeight.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
