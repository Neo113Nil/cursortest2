package h;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.MediaStore;
import g.C6601m;
import h.AbstractC6755a;
import h.C6756b;
import h.C6761g;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6760f extends AbstractC6755a<C6601m, List<Uri>> {

    /* renamed from: a, reason: collision with root package name */
    private final int f64578a;

    public C6760f(int i11) {
        this.f64578a = i11;
        if (i11 <= 1) {
            throw new IllegalArgumentException("Max items must be higher than 1");
        }
    }

    @Override // h.AbstractC6755a
    public final Intent a(Context context, C6601m c6601m) {
        int pickImagesMaxLimit;
        C6601m input = c6601m;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        boolean d11 = C6761g.a.d();
        int i11 = this.f64578a;
        if (d11) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(C6761g.a.c(input.a()));
            pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
            if (i11 > pickImagesMaxLimit) {
                throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()");
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", i11);
            return intent;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        if (C6761g.a.b(context) != null) {
            ResolveInfo b11 = C6761g.a.b(context);
            if (b11 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = b11.activityInfo;
            Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setType(C6761g.a.c(input.a()));
            intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", i11);
            return intent2;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        if (C6761g.a.a(context) == null) {
            Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent3.setType(C6761g.a.c(input.a()));
            intent3.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if (intent3.getType() == null) {
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent3;
        }
        ResolveInfo a11 = C6761g.a.a(context);
        if (a11 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo2 = a11.activityInfo;
        Intent intent4 = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
        intent4.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
        intent4.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", i11);
        return intent4;
    }

    @Override // h.AbstractC6755a
    public final AbstractC6755a.C1046a<List<Uri>> b(Context context, C6601m c6601m) {
        C6601m input = c6601m;
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
        return (intent == null || (a11 = C6756b.a.a(intent)) == null) ? K.f71697a : a11;
    }
}
