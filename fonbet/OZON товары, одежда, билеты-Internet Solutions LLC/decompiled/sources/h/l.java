package h;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import h.AbstractC6755a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class l extends AbstractC6755a<Uri, Boolean> {
    @Override // h.AbstractC6755a
    public final Intent a(Context context, Uri uri) {
        Uri input = uri;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent putExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", input);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
        return putExtra;
    }

    @Override // h.AbstractC6755a
    public final AbstractC6755a.C1046a<Boolean> b(Context context, Uri uri) {
        Uri input = uri;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }

    @Override // h.AbstractC6755a
    public final Boolean c(int i11, Intent intent) {
        return Boolean.valueOf(i11 == -1);
    }
}
