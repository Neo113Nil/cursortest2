package qc0;

import Sc.InterfaceC4008j;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.crossApp.data.AccountSignatureData;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C9022a> f81815a;

    /* loaded from: classes3.dex */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t2, T t11) {
            return Vc.a.b(Long.valueOf(((AccountSignatureData) t11).getCreatedAt()), Long.valueOf(((AccountSignatureData) t2).getCreatedAt()));
        }
    }

    /* renamed from: qc0.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C1382b extends AbstractC7737t implements Function1<AccountSignatureData, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<AccountSignatureData> f81816b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1382b(List<AccountSignatureData> list) {
            super(1);
            this.f81816b = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AccountSignatureData accountSignatureData) {
            Object obj;
            AccountSignatureData user = accountSignatureData;
            Intrinsics.checkNotNullParameter(user, "user");
            Iterator<T> it = this.f81816b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                AccountSignatureData accountSignatureData2 = (AccountSignatureData) obj;
                if (accountSignatureData2.getUserId() == user.getUserId() && Intrinsics.d(accountSignatureData2.getAppName(), user.getAppName())) {
                    break;
                }
            }
            return Boolean.valueOf(obj != null);
        }
    }

    /* loaded from: classes3.dex */
    static final class c extends AbstractC7737t implements Function1<AccountSignatureData, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<String> f81817b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<String> list) {
            super(1);
            this.f81817b = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AccountSignatureData accountSignatureData) {
            AccountSignatureData it = accountSignatureData;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(this.f81817b.contains(it.getPublicKey()));
        }
    }

    public b(@NotNull InterfaceC4008j<C9022a> accountSharedStoreDataSource) {
        Intrinsics.checkNotNullParameter(accountSharedStoreDataSource, "accountSharedStoreDataSource");
        this.f81815a = accountSharedStoreDataSource;
    }

    public final void a() {
        this.f81815a.getValue().c();
    }

    public final void b() {
        this.f81815a.getValue().d();
    }

    @NotNull
    public final List<AccountSignatureData> c() {
        return C7714v.I0(new a(), this.f81815a.getValue().e());
    }

    public final boolean d(long j11, @NotNull String appName) {
        Object obj;
        Intrinsics.checkNotNullParameter(appName, "appName");
        Iterator<T> it = this.f81815a.getValue().e().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            AccountSignatureData accountSignatureData = (AccountSignatureData) obj;
            if (accountSignatureData.getUserId() == j11 && Intrinsics.d(accountSignatureData.getAppName(), appName)) {
                break;
            }
        }
        return ((AccountSignatureData) obj) != null;
    }

    public final void e(@NotNull List<AccountSignatureData> keyData) {
        Intrinsics.checkNotNullParameter(keyData, "keyData");
        InterfaceC4008j<C9022a> interfaceC4008j = this.f81815a;
        ArrayList W02 = C7714v.W0(interfaceC4008j.getValue().e());
        C.h(W02, new C1382b(keyData));
        W02.addAll(keyData);
        interfaceC4008j.getValue().g(W02);
    }

    public final void f(@NotNull List<String> invalidPublicKeys) {
        Intrinsics.checkNotNullParameter(invalidPublicKeys, "invalidPublicKeys");
        InterfaceC4008j<C9022a> interfaceC4008j = this.f81815a;
        ArrayList W02 = C7714v.W0(interfaceC4008j.getValue().e());
        C.h(W02, new c(invalidPublicKeys));
        interfaceC4008j.getValue().g(W02);
    }
}
