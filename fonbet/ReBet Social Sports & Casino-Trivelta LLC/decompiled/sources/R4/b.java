package R4;

import Ch.c;
import I5.SpanDataStatus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rh.EnumC6296n;

/* loaded from: classes2.dex */
public abstract class b {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC6296n.values().length];
            try {
                iArr[EnumC6296n.UNSET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6296n.OK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6296n.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final SpanDataStatus a(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        EnumC6296n statusCode = cVar.getStatus().getStatusCode();
        int i10 = -1;
        int i11 = statusCode == null ? -1 : a.$EnumSwitchMapping$0[statusCode.ordinal()];
        if (i11 != -1) {
            i10 = 1;
            if (i11 == 1) {
                i10 = 0;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i10 = 2;
            }
        }
        return new SpanDataStatus(i10);
    }
}
