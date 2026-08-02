package zi;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: zi.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C11127d extends AbstractC7737t implements Function2<Hi.k, Hi.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11125b f109082b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C11127d(C11125b c11125b) {
        super(2);
        this.f109082b = c11125b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Hi.k kVar, Hi.a aVar) {
        Hi.k uri = kVar;
        Hi.a restorableState = aVar;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(restorableState, "restorableState");
        C11125b c11125b = this.f109082b;
        c11125b.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("media_arg", uri);
        bundle.putParcelable("CAMERA_RESTORABLE_STATE_ARG", restorableState);
        Unit unit = Unit.f71690a;
        c11125b.getParentFragmentManager().m1(bundle, "CAMERA_REQUEST_KEY");
        return Unit.f71690a;
    }
}
