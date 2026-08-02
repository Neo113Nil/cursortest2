package com.vk.superapp.vkworkout;

import com.vk.superapp.vkworkout.VkWorkoutBridgeDelegatesFactory;
import kotlin.NoWhenBranchMatchedException;
import xsna.ayu0;
import xsna.bfm;
import xsna.d2w0;
import xsna.f2w0;
import xsna.fu3;
import xsna.guq;
import xsna.ixt;
import xsna.ju3;
import xsna.kxt;
import xsna.mxt;
import xsna.wvp;
import xsna.x1w0;
import xsna.xwv0;
import xsna.xxt;

/* compiled from: VkWorkoutBridgeDelegatesFactoryImpl.kt */
/* loaded from: classes6.dex */
public final class b implements VkWorkoutBridgeDelegatesFactory {
    public final f2w0 a;
    public final ayu0 b;

    /* compiled from: VkWorkoutBridgeDelegatesFactoryImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkWorkoutBridgeDelegatesFactory.DelegateType.values().length];
            try {
                iArr[VkWorkoutBridgeDelegatesFactory.DelegateType.ASK_WORKOUT_PERMISSION_GF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkWorkoutBridgeDelegatesFactory.DelegateType.ASK_WORKOUT_PERMISSION_HC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkWorkoutBridgeDelegatesFactory.DelegateType.GET_WORKOUT_PERMISSION_GF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkWorkoutBridgeDelegatesFactory.DelegateType.GET_WORKOUT_PERMISSION_HC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VkWorkoutBridgeDelegatesFactory.DelegateType.GET_WORKOUTS_GF.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VkWorkoutBridgeDelegatesFactory.DelegateType.GET_WORKOUTS_HC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(ayu0 ayu0Var, f2w0 f2w0Var) {
        this.a = f2w0Var;
        this.b = ayu0Var;
    }

    @Override // com.vk.superapp.vkworkout.VkWorkoutBridgeDelegatesFactory
    public final guq a(VkWorkoutBridgeDelegatesFactory.DelegateType delegateType, com.vk.superapp.base.js.bridge.b bVar, xwv0 xwv0Var, bfm bfmVar) {
        wvp wvpVar = new wvp(bVar);
        int i = a.$EnumSwitchMapping$0[delegateType.ordinal()];
        ayu0 ayu0Var = this.b;
        switch (i) {
            case 1:
                return new fu3(bVar, bfmVar, wvpVar, ayu0Var);
            case 2:
                return new ju3(bVar, bfmVar, xwv0Var, wvpVar, this.b);
            case 3:
                return new ixt(bVar, bfmVar, wvpVar, ayu0Var);
            case 4:
                return new kxt(bVar, bfmVar, wvpVar, ayu0Var);
            case 5:
                return new mxt(bVar, bfmVar, wvpVar, this.a, this.b, new x1w0(), new d2w0());
            case 6:
                return new xxt(bVar, bfmVar, xwv0Var, wvpVar, this.a, this.b, new x1w0(), new d2w0());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
