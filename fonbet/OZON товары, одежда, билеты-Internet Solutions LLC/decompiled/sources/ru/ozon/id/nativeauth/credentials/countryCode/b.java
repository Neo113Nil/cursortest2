package ru.ozon.id.nativeauth.credentials.countryCode;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes3.dex */
final class b extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<String, Unit> f97200b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    b(Function1<? super String, Unit> function1) {
        super(1);
        this.f97200b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomAction.Click click) {
        AtomAction.Click it = click;
        Intrinsics.checkNotNullParameter(it, "it");
        String link = it.getLink();
        if (link == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f97200b.invoke(link);
        return Unit.f71690a;
    }
}
