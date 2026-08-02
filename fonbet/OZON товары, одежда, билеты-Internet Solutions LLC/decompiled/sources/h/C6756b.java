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
import org.jetbrains.annotations.NotNull;

/* renamed from: h.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6756b extends AbstractC6755a<String, List<Uri>> {

    /* renamed from: h.b$a */
    public static final class a {
        @NotNull
        public static List a(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "<this>");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null && linkedHashSet.isEmpty()) {
                return K.f71697a;
            }
            if (clipData != null) {
                int itemCount = clipData.getItemCount();
                for (int i11 = 0; i11 < itemCount; i11++) {
                    Uri uri = clipData.getItemAt(i11).getUri();
                    if (uri != null) {
                        linkedHashSet.add(uri);
                    }
                }
            }
            return new ArrayList(linkedHashSet);
        }
    }

    @Override // h.AbstractC6755a
    public final Intent a(Context context, String str) {
        String input = str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
        return putExtra;
    }

    @Override // h.AbstractC6755a
    public final AbstractC6755a.C1046a<List<Uri>> b(Context context, String str) {
        String input = str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }

    @Override // h.AbstractC6755a
    public final List<Uri> c(int i11, Intent intent) {
        List<Uri> a11;
        if (i11 != -1) {
            intent = null;
        }
        return (intent == null || (a11 = a.a(intent)) == null) ? K.f71697a : a11;
    }
}
