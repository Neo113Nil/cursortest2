package h;

import android.content.Context;
import android.content.Intent;
import g.C6589a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends AbstractC6755a<Intent, C6589a> {
    @Override // h.AbstractC6755a
    public final Intent a(Context context, Intent intent) {
        Intent input = intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return input;
    }

    @Override // h.AbstractC6755a
    public final C6589a c(int i11, Intent intent) {
        return new C6589a(i11, intent);
    }
}
