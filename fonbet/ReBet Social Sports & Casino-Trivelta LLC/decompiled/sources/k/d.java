package k;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.provider.MediaStore;
import java.util.List;
import k.AbstractC5140a;
import k.f;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class d extends AbstractC5140a {

    /* renamed from: e, reason: collision with root package name */
    public static final a f53996e = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f53997d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            int pickImagesMaxLimit;
            if (!f.f53998d.d()) {
                return Integer.MAX_VALUE;
            }
            pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
            return pickImagesMaxLimit;
        }

        public a() {
        }
    }

    public d() {
        this(0, 1, null);
    }

    @Override // k.AbstractC5140a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, j.f input) {
        int pickImagesMaxLimit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        f.a aVar = f.f53998d;
        if (aVar.d()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(aVar.b(input.d()));
            int min = Math.min(this.f53997d, input.c());
            if (min > 1) {
                pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                if (min <= pickImagesMaxLimit) {
                    intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", min);
                    intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", input.b().a());
                    intent.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", input.f());
                    if (input.e()) {
                        intent.putExtra("android.provider.extra.PICK_IMAGES_ACCENT_COLOR", input.a());
                    }
                    return intent;
                }
            }
            throw new IllegalArgumentException("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
        }
        if (!aVar.c(context)) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(aVar.b(input.d()));
            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        ResolveInfo a10 = aVar.a(context);
        if (a10 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo = a10.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(aVar.b(input.d()));
        int min2 = Math.min(this.f53997d, input.c());
        if (min2 <= 1) {
            throw new IllegalArgumentException("Max items must be greater than 1");
        }
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", min2);
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", input.b().a());
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER", input.f());
        if (input.e()) {
            intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_ACCENT_COLOR", input.a());
        }
        return intent3;
    }

    @Override // k.AbstractC5140a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC5140a.C0780a getSynchronousResult(Context context, j.f input) {
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
        return (intent == null || (a10 = C5141b.f53995d.a(intent)) == null) ? CollectionsKt.emptyList() : a10;
    }

    public /* synthetic */ d(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? f53996e.a() : i10);
    }

    public d(int i10) {
        this.f53997d = i10;
        if (i10 <= 1) {
            throw new IllegalArgumentException("Max items must be higher than 1");
        }
    }
}
