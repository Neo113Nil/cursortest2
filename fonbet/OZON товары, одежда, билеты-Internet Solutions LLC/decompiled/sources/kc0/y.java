package kc0;

import com.vk.id.auth.AuthCodeData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class y extends AbstractC7737t implements Function2<AuthCodeData, Boolean, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7645c f71415b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(C7645c c7645c) {
        super(2);
        this.f71415b = c7645c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(AuthCodeData authCodeData, Boolean bool) {
        AuthCodeData data = authCodeData;
        bool.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        this.f71415b.C().M1(data);
        return Unit.f71690a;
    }
}
