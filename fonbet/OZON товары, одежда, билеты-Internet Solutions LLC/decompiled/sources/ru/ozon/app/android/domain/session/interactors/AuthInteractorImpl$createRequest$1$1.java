package ru.ozon.app.android.domain.session.interactors;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class AuthInteractorImpl$createRequest$1$1 extends C7719a implements Function2<String, Object, Unit> {
    AuthInteractorImpl$createRequest$1$1(Object obj) {
        super(2, obj, Map.class, "putIfAbsent", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 8);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Object obj) {
        invoke2(str, obj);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p02, Object p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        ((Map) this.receiver).putIfAbsent(p02, p12);
    }
}
