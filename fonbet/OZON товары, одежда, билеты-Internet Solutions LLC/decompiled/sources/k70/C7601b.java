package k70;

import com.vk.id.AccessToken;
import com.vk.id.OAuth;
import com.vk.id.onetap.compose.onetap.OneTapKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l70.C7892a;
import ru.ozon.fintech.features.offline.data.model.transfer.BankInfo;

/* renamed from: k70.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7601b implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f71048b;

    public /* synthetic */ C7601b(Object obj, int i11) {
        this.f71047a = i11;
        this.f71048b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit OneTap$lambda$42$lambda$39$lambda$38;
        switch (this.f71047a) {
            case 0:
                return ru.ozon.fintech.features.offline.presentation.select.a.d0((ru.ozon.fintech.features.offline.presentation.select.a) this.f71048b, (BankInfo) obj, (C7892a) obj2);
            default:
                OneTap$lambda$42$lambda$39$lambda$38 = OneTapKt.OneTap$lambda$42$lambda$39$lambda$38((Function2) this.f71048b, (OAuth) obj, (AccessToken) obj2);
                return OneTap$lambda$42$lambda$39$lambda$38;
        }
    }
}
