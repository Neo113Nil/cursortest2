package k60;

import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.mpay.MirPayCardStatus;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.mpay.MirPayCardStatusRequest;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.mpay.MirPayCardStatusResult;
import ru.ozon.fintech.wallet.manager.domain.mpay.MirPayWalletException;
import ta0.InterfaceC9791a;

/* loaded from: classes3.dex */
public final class m extends V50.a<MirPayCardStatusRequest> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC9791a f70977b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f70978c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f70979d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@NotNull Moshi moshi, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull InterfaceC9791a mirPayWalletManager) {
        super(moshi);
        Intrinsics.checkNotNullParameter(mirPayWalletManager, "mirPayWalletManager");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f70977b = mirPayWalletManager;
        this.f70978c = fintechAnalyticInteractor;
        this.f70979d = "card_status";
    }

    public static Unit e(m mVar, MirPayCardStatusRequest mirPayCardStatusRequest, U50.j jVar) {
        String str;
        Object obj;
        try {
            try {
                ArrayList a11 = mVar.f70977b.a();
                List<String> cards = mirPayCardStatusRequest.getCards();
                int h11 = U.h(C7714v.z(cards, 10));
                if (h11 < 16) {
                    h11 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
                for (String str2 : cards) {
                    Iterator it = a11.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        sa0.b bVar = (sa0.b) obj;
                        if (Intrinsics.d(str2, bVar.b() + bVar.a())) {
                            break;
                        }
                    }
                    sa0.b bVar2 = (sa0.b) obj;
                    Pair pair = bVar2 != null ? new Pair(str2, new MirPayCardStatus(bVar2.d(), bVar2.c().name(), false, bVar2.b(), bVar2.a())) : new Pair(str2, new MirPayCardStatus("", "NOT_FOUND", true, "", ""));
                    linkedHashMap.put(pair.e(), pair.f());
                }
                InterfaceC6618a interfaceC6618a = mVar.f70978c;
                String bankId = mirPayCardStatusRequest.getBankId();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(U.h(linkedHashMap.size()));
                for (Object obj2 : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(((Map.Entry) obj2).getKey(), ((MirPayCardStatus) ((Map.Entry) obj2).getValue()).getMirCardStatus());
                }
                interfaceC6618a.C1(bankId, linkedHashMap2);
                try {
                    str = mVar.c().c(MirPayCardStatusResult.class).toJson(new MirPayCardStatusResult(linkedHashMap));
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    str = "";
                }
                jVar.invoke(new NativeResult.Success(str));
            } catch (Throwable th3) {
                mVar.f70977b.closeConnection();
                throw th3;
            }
        } catch (MirPayWalletException e11) {
            L80.a.c("MirPayAddCardBridgeInterface", null, e11);
            String str3 = "Ошибка при получении статуса карт, " + e11.getType().name() + " " + e11.getMessage();
            NativeResult.Error.a aVar = NativeResult.Error.a.IS_NOT_AVAILABLE;
            mVar.f70978c.k0(str3, aVar.name());
            jVar.invoke(new NativeResult.Error(str3, aVar));
        }
        mVar.f70977b.closeConnection();
        return Unit.f71690a;
    }

    public static Unit f(m mVar, U50.j jVar, sa0.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        L80.a.b("MirPayAddCardBridgeInterface", it.name());
        String str = "Ошибка установки соединения с SDK Mir Pay. Статус: " + it;
        NativeResult.Error.a aVar = NativeResult.Error.a.SDK_ERROR;
        mVar.f70978c.k0(str, aVar.name());
        jVar.invoke(new NativeResult.Error(str, aVar));
        return Unit.f71690a;
    }

    @Override // V50.a
    @NotNull
    public final Class<MirPayCardStatusRequest> b() {
        return MirPayCardStatusRequest.class;
    }

    @Override // V50.a
    public final void d(WeakReference weakReference, Object obj, final U50.j callback) {
        final MirPayCardStatusRequest value = (MirPayCardStatusRequest) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(callback, "callback");
        va0.b.a(this.f70977b, value.getBankId(), new Function0() { // from class: k60.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.e(m.this, value, callback);
            }
        }, new Function1() { // from class: k60.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return m.f(m.this, callback, (sa0.d) obj2);
            }
        });
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return this.f70979d;
    }
}
