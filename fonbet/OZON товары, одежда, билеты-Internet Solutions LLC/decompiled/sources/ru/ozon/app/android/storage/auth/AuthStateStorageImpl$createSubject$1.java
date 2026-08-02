package ru.ozon.app.android.storage.auth;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import zb0.f;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzb0/f;", "Lkotlin/jvm/internal/EnhancedNullability;", "it", "", "invoke", "(Lzb0/f;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class AuthStateStorageImpl$createSubject$1 extends AbstractC7737t implements Function1<f, Boolean> {
    public static final AuthStateStorageImpl$createSubject$1 INSTANCE = new AuthStateStorageImpl$createSubject$1();

    AuthStateStorageImpl$createSubject$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.a().a() != f.b.TokenUpdate);
    }
}
