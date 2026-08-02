package k;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import k.AbstractC5140a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class j extends AbstractC5140a {
    @Override // k.AbstractC5140a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, Uri input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent putExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", input);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
        return putExtra;
    }

    @Override // k.AbstractC5140a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC5140a.C0780a getSynchronousResult(Context context, Uri input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }

    @Override // k.AbstractC5140a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Boolean parseResult(int i10, Intent intent) {
        return Boolean.valueOf(i10 == -1);
    }
}
