package qc0;

import Fb0.f;
import Sc.InterfaceC4008j;
import Sc.k;
import android.accounts.Account;
import android.accounts.AccountManager;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import dc0.C6159e;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.crossApp.data.AccountSignatureData;

/* renamed from: qc0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9022a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f81807a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C6159e f81808b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<AccountManager> f81809c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Moshi> f81810d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f81811e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f81812f;

    /* renamed from: qc0.a$a, reason: collision with other inner class name */
    static final class C1381a extends AbstractC7737t implements Function0<JsonAdapter<List<? extends AccountSignatureData>>> {
        C1381a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final JsonAdapter<List<? extends AccountSignatureData>> invoke() {
            C9022a c9022a = C9022a.this;
            return ((Moshi) c9022a.f81810d.getValue()).d(C9022a.a(c9022a));
        }
    }

    /* renamed from: qc0.a$b */
    static final class b extends AbstractC7737t implements Function0<ParameterizedType> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f81814b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final ParameterizedType invoke() {
            return D.e(List.class, AccountSignatureData.class);
        }
    }

    public C9022a(@NotNull f ozonIdConfig, @NotNull InterfaceC4008j accountManager, @NotNull InterfaceC4008j moshi, @NotNull C6159e accountManagerHelper) {
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        Intrinsics.checkNotNullParameter(accountManagerHelper, "accountManagerHelper");
        Intrinsics.checkNotNullParameter(accountManager, "accountManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f81807a = ozonIdConfig;
        this.f81808b = accountManagerHelper;
        this.f81809c = accountManager;
        this.f81810d = moshi;
        this.f81811e = k.b(b.f81814b);
        this.f81812f = k.b(new C1381a());
    }

    public static final ParameterizedType a(C9022a c9022a) {
        return (ParameterizedType) c9022a.f81811e.getValue();
    }

    public final void c() {
        Account a11 = this.f81808b.a();
        if (a11 != null) {
            this.f81809c.getValue().setUserData(a11, "ru.ozon.id.account.challenge.keys", null);
        }
    }

    public final void d() {
        C6159e c6159e = this.f81808b;
        if (c6159e.a() != null) {
            List<AccountSignatureData> e11 = e();
            ArrayList arrayList = new ArrayList();
            for (Object obj : e11) {
                if (!Intrinsics.d(((AccountSignatureData) obj).getAppName(), this.f81807a.getAppName().a())) {
                    arrayList.add(obj);
                }
            }
            Account a11 = c6159e.a();
            if (a11 != null) {
                Object value = this.f81812f.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                this.f81809c.getValue().setUserData(a11, "ru.ozon.id.account.challenge.keys", ((JsonAdapter) value).toJson(arrayList));
            }
        }
    }

    @NotNull
    public final List<AccountSignatureData> e() {
        List<AccountSignatureData> list;
        Account a11 = this.f81808b.a();
        if (a11 != null) {
            String userData = this.f81809c.getValue().getUserData(a11, "ru.ozon.id.account.challenge.keys");
            if (userData == null || userData.length() == 0) {
                list = null;
            } else {
                Object value = this.f81812f.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                list = (List) ((JsonAdapter) value).fromJson(userData);
            }
            if (list != null) {
                return list;
            }
        }
        return K.f71697a;
    }

    public final AccountSignatureData f(@NotNull String publicKey) {
        Object obj;
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Iterator<T> it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((AccountSignatureData) obj).getPublicKey(), publicKey)) {
                break;
            }
        }
        return (AccountSignatureData) obj;
    }

    public final void g(@NotNull ArrayList keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Account a11 = this.f81808b.a();
        if (a11 != null) {
            Object value = this.f81812f.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            this.f81809c.getValue().setUserData(a11, "ru.ozon.id.account.challenge.keys", ((JsonAdapter) value).toJson(keys));
        }
    }
}
