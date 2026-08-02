package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Paint;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: f, reason: collision with root package name */
    public static final e f16090f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f16091g;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16092e;

    static {
        int i5 = 0;
        f16090f = new e(i5, 0);
        f16091g = new e(i5, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i5, int i10) {
        super(i5);
        this.f16092e = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16092e) {
            case 0:
                return new Paint();
            default:
                Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
                return createBitmap;
        }
    }
}
