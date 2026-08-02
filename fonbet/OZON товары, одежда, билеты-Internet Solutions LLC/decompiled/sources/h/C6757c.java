package h;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import h.AbstractC6755a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6757c extends AbstractC6755a<String[], Uri> {
    @Override // h.AbstractC6755a
    public final Intent a(Context context, String[] strArr) {
        String[] input = strArr;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).setType("*/*");
        Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
        return type;
    }

    @Override // h.AbstractC6755a
    public final AbstractC6755a.C1046a<Uri> b(Context context, String[] strArr) {
        String[] input = strArr;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }

    @Override // h.AbstractC6755a
    public final Uri c(int i11, Intent intent) {
        if (i11 != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}
