package io.sentry.android.replay.screenshot;

import android.graphics.Matrix;
import io.sentry.android.replay.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function0<Matrix> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f67616b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar) {
        super(0);
        this.f67616b = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Matrix invoke() {
        t tVar;
        t tVar2;
        Matrix matrix = new Matrix();
        c cVar = this.f67616b;
        tVar = cVar.f67620d;
        float e11 = tVar.e();
        tVar2 = cVar.f67620d;
        matrix.preScale(e11, tVar2.f());
        return matrix;
    }
}
