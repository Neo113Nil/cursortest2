package com.vk.superapp.vksteps;

import xsna.asp;
import xsna.bfm;
import xsna.guq;
import xsna.xwv0;
import xsna.zrp;

/* compiled from: VkStepsBridgeDelegatesFactory.kt */
/* loaded from: classes11.dex */
public interface VkStepsBridgeDelegatesFactory {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkStepsBridgeDelegatesFactory.kt */
    /* loaded from: classes6.dex */
    public static final class DelegateType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DelegateType[] $VALUES;
        public static final DelegateType GET_INFO_HC;
        public static final DelegateType GET_STEPS_GF;
        public static final DelegateType GET_STEPS_HC;
        public static final DelegateType GET_STEPS_PERMISSION_GF;
        public static final DelegateType GET_STEPS_PERMISSION_HC;
        public static final DelegateType STOP_STEPS_PERMISSION;

        static {
            DelegateType delegateType = new DelegateType("GET_INFO_HC", 0);
            GET_INFO_HC = delegateType;
            DelegateType delegateType2 = new DelegateType("GET_STEPS_GF", 1);
            GET_STEPS_GF = delegateType2;
            DelegateType delegateType3 = new DelegateType("GET_STEPS_HC", 2);
            GET_STEPS_HC = delegateType3;
            DelegateType delegateType4 = new DelegateType("GET_STEPS_PERMISSION_GF", 3);
            GET_STEPS_PERMISSION_GF = delegateType4;
            DelegateType delegateType5 = new DelegateType("GET_STEPS_PERMISSION_HC", 4);
            GET_STEPS_PERMISSION_HC = delegateType5;
            DelegateType delegateType6 = new DelegateType("STOP_STEPS_PERMISSION", 5);
            STOP_STEPS_PERMISSION = delegateType6;
            DelegateType[] delegateTypeArr = {delegateType, delegateType2, delegateType3, delegateType4, delegateType5, delegateType6};
            $VALUES = delegateTypeArr;
            $ENTRIES = new asp(delegateTypeArr);
        }

        public DelegateType() {
            throw null;
        }

        public static DelegateType valueOf(String str) {
            return (DelegateType) Enum.valueOf(DelegateType.class, str);
        }

        public static DelegateType[] values() {
            return (DelegateType[]) $VALUES.clone();
        }
    }

    /* compiled from: VkStepsBridgeDelegatesFactory.kt */
    public static final class a {
        private static final VkStepsBridgeDelegatesFactory STUB = new C1921a();

        /* compiled from: VkStepsBridgeDelegatesFactory.kt */
        /* renamed from: com.vk.superapp.vksteps.VkStepsBridgeDelegatesFactory$a$a, reason: collision with other inner class name */
        public static final class C1921a implements VkStepsBridgeDelegatesFactory {
            @Override // com.vk.superapp.vksteps.VkStepsBridgeDelegatesFactory
            public final guq a(DelegateType delegateType, com.vk.superapp.base.js.bridge.b bVar, xwv0 xwv0Var, bfm bfmVar) {
                return new com.vk.superapp.vksteps.a();
            }
        }

        public static VkStepsBridgeDelegatesFactory a() {
            return STUB;
        }
    }

    guq a(DelegateType delegateType, com.vk.superapp.base.js.bridge.b bVar, xwv0 xwv0Var, bfm bfmVar);
}
