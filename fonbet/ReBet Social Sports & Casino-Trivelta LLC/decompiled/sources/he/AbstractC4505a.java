package he;

import ie.EnumC4544a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: he.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4505a {

    /* renamed from: he.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0719a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC4544a.values().length];
            try {
                iArr[EnumC4544a.Online.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4544a.Offline.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4544a.CallOnline.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4544a.CallOffline.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String a(EnumC4544a enumC4544a) {
        Intrinsics.checkNotNullParameter(enumC4544a, "<this>");
        int i10 = C0719a.$EnumSwitchMapping$0[enumC4544a.ordinal()];
        if (i10 == 1) {
            return "online";
        }
        if (i10 == 2) {
            return "offline";
        }
        if (i10 == 3) {
            return "call_online";
        }
        if (i10 == 4) {
            return "call_offline";
        }
        throw new NoWhenBranchMatchedException();
    }
}
