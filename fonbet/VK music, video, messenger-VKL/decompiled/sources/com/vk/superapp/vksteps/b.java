package com.vk.superapp.vksteps;

import com.vk.superapp.vksteps.VkStepsBridgeDelegatesFactory;
import kotlin.NoWhenBranchMatchedException;
import xsna.ayu0;
import xsna.bfm;
import xsna.env0;
import xsna.fgl0;
import xsna.gmv0;
import xsna.guq;
import xsna.hmv0;
import xsna.ist;
import xsna.kvt;
import xsna.tvt;
import xsna.uut;
import xsna.vvt;
import xsna.wvp;
import xsna.xwv0;

/* compiled from: VkStepsBridgeDelegatesFactoryImpl.kt */
/* loaded from: classes6.dex */
public final class b implements VkStepsBridgeDelegatesFactory {
    public final hmv0 a;
    public final ayu0 b;

    /* compiled from: VkStepsBridgeDelegatesFactoryImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkStepsBridgeDelegatesFactory.DelegateType.values().length];
            try {
                iArr[VkStepsBridgeDelegatesFactory.DelegateType.GET_INFO_HC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkStepsBridgeDelegatesFactory.DelegateType.GET_STEPS_GF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkStepsBridgeDelegatesFactory.DelegateType.GET_STEPS_HC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkStepsBridgeDelegatesFactory.DelegateType.GET_STEPS_PERMISSION_GF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VkStepsBridgeDelegatesFactory.DelegateType.GET_STEPS_PERMISSION_HC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VkStepsBridgeDelegatesFactory.DelegateType.STOP_STEPS_PERMISSION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(ayu0 ayu0Var, hmv0 hmv0Var) {
        this.a = hmv0Var;
        this.b = ayu0Var;
    }

    @Override // com.vk.superapp.vksteps.VkStepsBridgeDelegatesFactory
    public final guq a(VkStepsBridgeDelegatesFactory.DelegateType delegateType, com.vk.superapp.base.js.bridge.b bVar, xwv0 xwv0Var, bfm bfmVar) {
        wvp wvpVar = new wvp(bVar);
        int i = a.$EnumSwitchMapping$0[delegateType.ordinal()];
        ayu0 ayu0Var = this.b;
        switch (i) {
            case 1:
                return new ist(bVar, bfmVar, wvpVar, ayu0Var);
            case 2:
                return new uut(bVar, bfmVar, wvpVar, this.b, this.a, new gmv0(), new env0());
            case 3:
                return new kvt(bVar, xwv0Var, bfmVar, wvpVar, this.b, this.a, new gmv0(), new env0());
            case 4:
                return new tvt(bVar, bfmVar, wvpVar, this.b, this.a);
            case 5:
                return new vvt(bVar, bfmVar, wvpVar, this.b, this.a);
            case 6:
                return new fgl0(bVar, bfmVar, wvpVar, ayu0Var);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
