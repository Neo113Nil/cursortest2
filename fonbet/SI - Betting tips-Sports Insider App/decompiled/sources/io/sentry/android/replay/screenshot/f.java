package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import io.sentry.android.replay.v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends Lambda implements Function0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f16094f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, int i5) {
        super(0);
        this.f16093e = i5;
        this.f16094f = gVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [gf.i, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16093e) {
            case 0:
                Matrix matrix = new Matrix();
                v vVar = this.f16094f.f16097c;
                matrix.preScale(vVar.f16139c, vVar.f16140d);
                return matrix;
            default:
                return new Canvas((Bitmap) this.f16094f.f16100f.getValue());
        }
    }
}
