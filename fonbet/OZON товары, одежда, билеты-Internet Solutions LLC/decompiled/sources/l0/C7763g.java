package l0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: l0.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7763g extends AbstractC7737t implements Function2<O, O, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.animation.s f72086b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7763g(androidx.compose.animation.s sVar) {
        super(2);
        this.f72086b = sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(O o11, O o12) {
        O o13 = o11;
        O o14 = o12;
        O o15 = O.PostExit;
        return Boolean.valueOf(o13 == o15 && o14 == o15 && !this.f72086b.b().d());
    }
}
