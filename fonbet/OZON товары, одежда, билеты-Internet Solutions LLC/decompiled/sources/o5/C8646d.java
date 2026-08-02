package o5;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: o5.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8646d extends AbstractC7737t implements Function1<IOException, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8644b f77749b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8646d(C8644b c8644b) {
        super(1);
        this.f77749b = c8644b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(IOException iOException) {
        this.f77749b.f77726k = true;
        return Unit.f71690a;
    }
}
