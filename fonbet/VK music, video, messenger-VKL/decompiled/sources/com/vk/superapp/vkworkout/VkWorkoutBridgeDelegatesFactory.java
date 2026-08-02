package com.vk.superapp.vkworkout;

import xsna.asp;
import xsna.bfm;
import xsna.guq;
import xsna.xwv0;
import xsna.zrp;

/* compiled from: VkWorkoutBridgeDelegatesFactory.kt */
/* loaded from: classes11.dex */
public interface VkWorkoutBridgeDelegatesFactory {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkWorkoutBridgeDelegatesFactory.kt */
    /* loaded from: classes6.dex */
    public static final class DelegateType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DelegateType[] $VALUES;
        public static final DelegateType ASK_WORKOUT_PERMISSION_GF;
        public static final DelegateType ASK_WORKOUT_PERMISSION_HC;
        public static final DelegateType GET_WORKOUTS_GF;
        public static final DelegateType GET_WORKOUTS_HC;
        public static final DelegateType GET_WORKOUT_PERMISSION_GF;
        public static final DelegateType GET_WORKOUT_PERMISSION_HC;

        static {
            DelegateType delegateType = new DelegateType("ASK_WORKOUT_PERMISSION_GF", 0);
            ASK_WORKOUT_PERMISSION_GF = delegateType;
            DelegateType delegateType2 = new DelegateType("ASK_WORKOUT_PERMISSION_HC", 1);
            ASK_WORKOUT_PERMISSION_HC = delegateType2;
            DelegateType delegateType3 = new DelegateType("GET_WORKOUT_PERMISSION_GF", 2);
            GET_WORKOUT_PERMISSION_GF = delegateType3;
            DelegateType delegateType4 = new DelegateType("GET_WORKOUT_PERMISSION_HC", 3);
            GET_WORKOUT_PERMISSION_HC = delegateType4;
            DelegateType delegateType5 = new DelegateType("GET_WORKOUTS_GF", 4);
            GET_WORKOUTS_GF = delegateType5;
            DelegateType delegateType6 = new DelegateType("GET_WORKOUTS_HC", 5);
            GET_WORKOUTS_HC = delegateType6;
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

    /* compiled from: VkWorkoutBridgeDelegatesFactory.kt */
    public static final class a {
        private static final VkWorkoutBridgeDelegatesFactory STUB = new C1922a();

        /* compiled from: VkWorkoutBridgeDelegatesFactory.kt */
        /* renamed from: com.vk.superapp.vkworkout.VkWorkoutBridgeDelegatesFactory$a$a, reason: collision with other inner class name */
        public static final class C1922a implements VkWorkoutBridgeDelegatesFactory {
            @Override // com.vk.superapp.vkworkout.VkWorkoutBridgeDelegatesFactory
            public final guq a(DelegateType delegateType, com.vk.superapp.base.js.bridge.b bVar, xwv0 xwv0Var, bfm bfmVar) {
                return new com.vk.superapp.vkworkout.a();
            }
        }

        public static VkWorkoutBridgeDelegatesFactory a() {
            return STUB;
        }
    }

    guq a(DelegateType delegateType, com.vk.superapp.base.js.bridge.b bVar, xwv0 xwv0Var, bfm bfmVar);
}
