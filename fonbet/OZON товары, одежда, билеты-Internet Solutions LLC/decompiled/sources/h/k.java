package h;

import android.content.Context;
import android.content.Intent;
import g.C6589a;
import g.C6600l;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class k extends AbstractC6755a<C6600l, C6589a> {
    @Override // h.AbstractC6755a
    public final Intent a(Context context, C6600l c6600l) {
        C6600l input = c6600l;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        return putExtra;
    }

    @Override // h.AbstractC6755a
    public final C6589a c(int i11, Intent intent) {
        return new C6589a(i11, intent);
    }
}
