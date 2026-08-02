package h;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import h.AbstractC6755a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6758d extends AbstractC6755a<String[], List<Uri>> {
    @Override // h.AbstractC6755a
    public final Intent a(Context context, String[] strArr) {
        String[] input = strArr;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
        Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
        return type;
    }

    @Override // h.AbstractC6755a
    public final AbstractC6755a.C1046a<List<Uri>> b(Context context, String[] strArr) {
        String[] input = strArr;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }

    @Override // h.AbstractC6755a
    public final List<Uri> c(int i11, Intent intent) {
        List<Uri> arrayList;
        if (i11 != -1) {
            intent = null;
        }
        if (intent != null) {
            Intrinsics.checkNotNullParameter(intent, "<this>");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null && linkedHashSet.isEmpty()) {
                arrayList = K.f71697a;
            } else {
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i12 = 0; i12 < itemCount; i12++) {
                        Uri uri = clipData.getItemAt(i12).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                arrayList = new ArrayList(linkedHashSet);
            }
            if (arrayList != null) {
                return arrayList;
            }
        }
        return K.f71697a;
    }
}
