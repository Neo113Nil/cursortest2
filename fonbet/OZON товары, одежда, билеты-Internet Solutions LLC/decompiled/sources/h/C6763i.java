package h;

import android.content.Context;
import android.content.Intent;
import h.AbstractC6755a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6763i extends AbstractC6755a<String, Boolean> {
    @Override // h.AbstractC6755a
    public final Intent a(Context context, String str) {
        String input = str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        String[] input2 = {input};
        Intrinsics.checkNotNullParameter(input2, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input2);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // h.AbstractC6755a
    public final AbstractC6755a.C1046a<Boolean> b(Context context, String str) {
        String input = str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        if (androidx.core.content.a.checkSelfPermission(context, input) == 0) {
            return new AbstractC6755a.C1046a<>(Boolean.TRUE);
        }
        return null;
    }

    @Override // h.AbstractC6755a
    public final Boolean c(int i11, Intent intent) {
        if (intent == null || i11 != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z11 = false;
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (intArrayExtra[i12] == 0) {
                    z11 = true;
                    break;
                }
                i12++;
            }
        }
        return Boolean.valueOf(z11);
    }
}
