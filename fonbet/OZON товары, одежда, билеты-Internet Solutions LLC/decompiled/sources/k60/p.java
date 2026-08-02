package k60;

import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.mpay.GetAllCardsRequest;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.mpay.GetAllCardsResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.mpay.MirPayCardStatus;
import ru.ozon.fintech.wallet.manager.domain.mpay.MirPayWalletException;
import ta0.InterfaceC9791a;

/* loaded from: classes3.dex */
public final class p extends V50.a<GetAllCardsRequest> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC9791a f70986b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f70987c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f70988d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@NotNull Moshi moshi, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull InterfaceC9791a mirPayWalletManager) {
        super(moshi);
        Intrinsics.checkNotNullParameter(mirPayWalletManager, "mirPayWalletManager");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f70986b = mirPayWalletManager;
        this.f70987c = fintechAnalyticInteractor;
        this.f70988d = "get_all_cards";
    }

    public static Unit e(p pVar, GetAllCardsRequest getAllCardsRequest, U50.j jVar, sa0.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        L80.a.b("MirPayGetAllCardsBridgeInterface", it.name());
        String str = "Ошибка установки соединения с SDK Mir Pay. Статус: " + it;
        NativeResult.Error.a aVar = NativeResult.Error.a.SDK_ERROR;
        pVar.f70987c.R0(getAllCardsRequest.getBankId(), str, aVar.name());
        jVar.invoke(new NativeResult.Error(str, aVar));
        return Unit.f71690a;
    }

    public static Unit f(p pVar, GetAllCardsRequest getAllCardsRequest, U50.j jVar) {
        String str;
        try {
            ArrayList<sa0.b> a11 = pVar.f70986b.a();
            ArrayList arrayList = new ArrayList(C7714v.z(a11, 10));
            for (sa0.b bVar : a11) {
                arrayList.add(new MirPayCardStatus(bVar.d(), bVar.c().name(), false, bVar.b(), bVar.a()));
            }
            InterfaceC6618a interfaceC6618a = pVar.f70987c;
            String bankId = getAllCardsRequest.getBankId();
            ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((MirPayCardStatus) it.next()).getReferenceId());
            }
            interfaceC6618a.E0(bankId, arrayList2);
            Moshi c11 = pVar.c();
            try {
                str = c11.c(GetAllCardsResult.class).toJson(new GetAllCardsResult(arrayList));
            } catch (Throwable th2) {
                th2.printStackTrace();
                str = "";
            }
            jVar.invoke(new NativeResult.Success(str));
        } catch (MirPayWalletException e11) {
            L80.a.g(e11);
            String c12 = Sh.b.c("Ошибка при получении списка карт, ", e11.getType().name(), " ", e11.getMessage());
            NativeResult.Error.a aVar = NativeResult.Error.a.IS_NOT_AVAILABLE;
            pVar.f70987c.R0(getAllCardsRequest.getBankId(), c12, aVar.name());
            jVar.invoke(new NativeResult.Error(c12, aVar));
        }
        return Unit.f71690a;
    }

    @Override // V50.a
    @NotNull
    public final Class<GetAllCardsRequest> b() {
        return GetAllCardsRequest.class;
    }

    @Override // V50.a
    public final void d(WeakReference weakReference, Object obj, final U50.j callback) {
        final GetAllCardsRequest value = (GetAllCardsRequest) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(callback, "callback");
        va0.b.a(this.f70986b, value.getBankId(), new Function0() { // from class: k60.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.f(p.this, value, callback);
            }
        }, new Function1() { // from class: k60.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                GetAllCardsRequest getAllCardsRequest = value;
                return p.e(p.this, getAllCardsRequest, callback, (sa0.d) obj2);
            }
        });
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return this.f70988d;
    }
}
