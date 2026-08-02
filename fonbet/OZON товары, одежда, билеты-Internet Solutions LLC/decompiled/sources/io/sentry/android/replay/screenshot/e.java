package io.sentry.android.replay.screenshot;

import android.graphics.Matrix;
import io.sentry.android.replay.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class e extends AbstractC7737t implements Function0<Matrix> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f67633b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar) {
        super(0);
        this.f67633b = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Matrix invoke() {
        t tVar;
        t tVar2;
        Matrix matrix = new Matrix();
        f fVar = this.f67633b;
        tVar = fVar.f67636c;
        float e11 = tVar.e();
        tVar2 = fVar.f67636c;
        matrix.preScale(e11, tVar2.f());
        return matrix;
    }
}
