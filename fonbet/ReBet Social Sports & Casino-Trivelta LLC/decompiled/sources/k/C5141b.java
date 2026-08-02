package k;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import k.AbstractC5140a;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5141b extends AbstractC5140a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f53995d = new a(null);

    /* renamed from: k.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "<this>");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null && linkedHashSet.isEmpty()) {
                return CollectionsKt.emptyList();
            }
            if (clipData != null) {
                int itemCount = clipData.getItemCount();
                for (int i10 = 0; i10 < itemCount; i10++) {
                    Uri uri = clipData.getItemAt(i10).getUri();
                    if (uri != null) {
                        linkedHashSet.add(uri);
                    }
                }
            }
            return new ArrayList(linkedHashSet);
        }

        public a() {
        }
    }

    @Override // k.AbstractC5140a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, String input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
        return putExtra;
    }

    @Override // k.AbstractC5140a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC5140a.C0780a getSynchronousResult(Context context, String input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }

    @Override // k.AbstractC5140a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final List parseResult(int i10, Intent intent) {
        List a10;
        if (i10 != -1) {
            intent = null;
        }
        return (intent == null || (a10 = f53995d.a(intent)) == null) ? CollectionsKt.emptyList() : a10;
    }
}
