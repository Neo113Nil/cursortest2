package com.vk.masks.dynamic;

import com.vk.dto.hints.HintId;
import kotlin.NoWhenBranchMatchedException;
import xsna.iqo;
import xsna.pla;

/* compiled from: DynamicMasksViewDelegate.kt */
/* loaded from: classes3.dex */
public final class a implements iqo<DynamicMasksUseCase> {

    /* compiled from: DynamicMasksViewDelegate.kt */
    /* renamed from: com.vk.masks.dynamic.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1261a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DynamicMasksUseCase.values().length];
            try {
                iArr[DynamicMasksUseCase.CameraInit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DynamicMasksUseCase.CameraInitAndMaskPreselected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DynamicMasksUseCase.MasksClicked.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.iqo
    public final void a(DynamicMasksUseCase dynamicMasksUseCase) {
        pla.e().b().b(HintId.INFO_DYNAMIC_MASK_EFFECTS.getId());
    }

    @Override // xsna.iqo
    public final boolean b(DynamicMasksUseCase dynamicMasksUseCase) {
        int i = C1261a.$EnumSwitchMapping$0[dynamicMasksUseCase.ordinal()];
        if (i == 1) {
            return pla.e().b().m(HintId.INFO_DYNAMIC_MASK_EFFECTS);
        }
        if (i == 2 || i == 3) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
