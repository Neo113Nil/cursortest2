package c40;

import B0.d2;
import com.vk.id.onetap.compose.onetap.OneTapAnalytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: c40.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5744a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56492a;

    public /* synthetic */ C5744a(int i11) {
        this.f56492a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit sessionNotFound$lambda$1;
        switch (this.f56492a) {
            case 0:
                return new d2();
            default:
                sessionNotFound$lambda$1 = OneTapAnalytics.sessionNotFound$lambda$1();
                return sessionNotFound$lambda$1;
        }
    }
}
