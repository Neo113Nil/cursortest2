package com.vk.superapp.vkhealth.permissions.api.type;

import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.gzs;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PermissionsResult.kt */
/* loaded from: classes6.dex */
public final class PermissionsResult {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PermissionsResult[] $VALUES;
    public static final a Companion;
    public static final PermissionsResult DENIED;
    public static final PermissionsResult GRANTED;

    /* compiled from: PermissionsResult.kt */
    public static final class a {

        /* compiled from: PermissionsResult.kt */
        /* renamed from: com.vk.superapp.vkhealth.permissions.api.type.PermissionsResult$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1915a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PermissionsResult.values().length];
                try {
                    iArr[PermissionsResult.GRANTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PermissionsResult.DENIED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static void a(PermissionsResult permissionsResult, gzs gzsVar, gzs gzsVar2) {
            int i = C1915a.$EnumSwitchMapping$0[permissionsResult.ordinal()];
            if (i == 1) {
                gzsVar.invoke();
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                gzsVar2.invoke();
            }
        }
    }

    static {
        PermissionsResult permissionsResult = new PermissionsResult("GRANTED", 0);
        GRANTED = permissionsResult;
        PermissionsResult permissionsResult2 = new PermissionsResult("DENIED", 1);
        DENIED = permissionsResult2;
        PermissionsResult[] permissionsResultArr = {permissionsResult, permissionsResult2};
        $VALUES = permissionsResultArr;
        $ENTRIES = new asp(permissionsResultArr);
        Companion = new a();
    }

    public PermissionsResult() {
        throw null;
    }

    public static PermissionsResult valueOf(String str) {
        return (PermissionsResult) Enum.valueOf(PermissionsResult.class, str);
    }

    public static PermissionsResult[] values() {
        return (PermissionsResult[]) $VALUES.clone();
    }
}
