package k70;

import com.vk.id.internal.auth.AuthActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.offline.presentation.select.OfflineSelectFragment;
import s60.C9605c;

/* renamed from: k70.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7600a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f71046b;

    public /* synthetic */ C7600a(Object obj, int i11) {
        this.f71045a = i11;
        this.f71046b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit onStop$lambda$1;
        switch (this.f71045a) {
            case 0:
                return OfflineSelectFragment.t((OfflineSelectFragment) this.f71046b);
            case 1:
                onStop$lambda$1 = AuthActivity.onStop$lambda$1((AuthActivity) this.f71046b);
                return onStop$lambda$1;
            default:
                return C9605c.b((C9605c) this.f71046b);
        }
    }
}
