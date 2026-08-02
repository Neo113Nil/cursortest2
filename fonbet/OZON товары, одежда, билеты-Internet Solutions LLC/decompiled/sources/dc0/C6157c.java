package dc0;

import Sc.InterfaceC4008j;
import android.accounts.Account;
import android.accounts.AccountManager;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.account.CrossAppCredentials;

/* renamed from: dc0.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6157c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Fb0.f f61531a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Moshi> f61532b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C6159e f61533c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<AccountManager> f61534d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f61535e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f61536f;

    /* renamed from: dc0.c$a */
    static final class a extends AbstractC7737t implements Function0<JsonAdapter<List<? extends CrossAppCredentials>>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final JsonAdapter<List<? extends CrossAppCredentials>> invoke() {
            C6157c c6157c = C6157c.this;
            return ((Moshi) c6157c.f61532b.getValue()).d(C6157c.a(c6157c));
        }
    }

    /* renamed from: dc0.c$b */
    static final class b extends AbstractC7737t implements Function0<ParameterizedType> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f61538b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final ParameterizedType invoke() {
            return com.squareup.moshi.D.e(List.class, CrossAppCredentials.class);
        }
    }

    public C6157c(@NotNull Fb0.f ozonIdConfig, @NotNull InterfaceC4008j moshi, @NotNull InterfaceC4008j accountManager, @NotNull C6159e accountManagerHelper) {
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(accountManagerHelper, "accountManagerHelper");
        Intrinsics.checkNotNullParameter(accountManager, "accountManager");
        this.f61531a = ozonIdConfig;
        this.f61532b = moshi;
        this.f61533c = accountManagerHelper;
        this.f61534d = accountManager;
        this.f61535e = Sc.k.b(b.f61538b);
        this.f61536f = Sc.k.b(new a());
    }

    public static final ParameterizedType a(C6157c c6157c) {
        return (ParameterizedType) c6157c.f61535e.getValue();
    }

    private final String f() {
        String userData;
        C6159e c6159e = this.f61533c;
        if (c6159e.a() == null || (userData = this.f61534d.getValue().getUserData(c6159e.a(), "ru.ozon.id.account.cookies")) == null) {
            return null;
        }
        C6156b.a(userData);
        return userData;
    }

    private final List<CrossAppCredentials> g(Account account) {
        List<CrossAppCredentials> list;
        if (account != null) {
            String userData = this.f61534d.getValue().getUserData(account, "ru.ozon.id.account.cookie.source.cross.app.data");
            if (userData == null || userData.length() == 0) {
                list = null;
            } else {
                Object value = this.f61536f.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                list = (List) ((JsonAdapter) value).fromJson(userData);
            }
            if (list != null) {
                return list;
            }
        }
        return kotlin.collections.K.f71697a;
    }

    private final void j(List<CrossAppCredentials> list) {
        C6159e c6159e = this.f61533c;
        if (c6159e.a() == null) {
            return;
        }
        Object value = this.f61536f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        this.f61534d.getValue().setUserData(c6159e.a(), "ru.ozon.id.account.cookie.source.cross.app.data", ((JsonAdapter) value).toJson(list));
    }

    public final void c() {
        C6159e c6159e = this.f61533c;
        if (c6159e.a() == null || c6159e.a() == null) {
            return;
        }
        j(kotlin.collections.K.f71697a);
    }

    public final void d() {
        List list;
        C6159e c6159e = this.f61533c;
        if (c6159e.a() == null) {
            return;
        }
        String a11 = this.f61531a.getAppName().a();
        AccountManager value = this.f61534d.getValue();
        if (c6159e.a() == null) {
            return;
        }
        String userData = value.getUserData(c6159e.a(), "ru.ozon.id.account.cookie.source.cross.app.data");
        if (userData == null || userData.length() == 0) {
            list = null;
        } else {
            Object value2 = this.f61536f.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            list = (List) ((JsonAdapter) value2).fromJson(userData);
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!Intrinsics.d(((CrossAppCredentials) obj).getAppName(), a11)) {
                    arrayList.add(obj);
                }
            }
            j(arrayList);
        }
    }

    @NotNull
    public final ArrayList e() {
        C6146J c6146j;
        Fb0.f fVar;
        Object obj;
        C6159e c6159e = this.f61533c;
        List I02 = C7714v.I0(new C6158d(), g(c6159e.a()));
        Iterator it = I02.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c6146j = null;
            fVar = this.f61531a;
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((CrossAppCredentials) obj).getAppName(), fVar.getAppName().a())) {
                break;
            }
        }
        CrossAppCredentials crossAppCredentials = (CrossAppCredentials) obj;
        C6146J c6146j2 = crossAppCredentials != null ? new C6146J(crossAppCredentials.getAppName(), crossAppCredentials.getAppPackage(), C6171q.D(C6171q.y(crossAppCredentials.m1647getAccountCookies2C5OJKw())), crossAppCredentials.getFromOldFormat()) : null;
        Account a11 = c6159e.a();
        InterfaceC4008j<AccountManager> interfaceC4008j = this.f61534d;
        String userData = a11 == null ? null : interfaceC4008j.getValue().getUserData(c6159e.a(), "ru.ozon.id.account.cookie.source.app.name");
        if (userData != null) {
            if (!(I02 instanceof Collection) || !I02.isEmpty()) {
                Iterator it2 = I02.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.d(((CrossAppCredentials) it2.next()).getAppName(), userData)) {
                        break;
                    }
                }
            }
            String userData2 = c6159e.a() == null ? null : interfaceC4008j.getValue().getUserData(c6159e.a(), "ru.ozon.id.account.cookie.source.app.package");
            String f7 = f();
            if (f7 != null) {
                c6146j = new C6146J(userData, userData2, C6171q.D(C6171q.y(f7)), true);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : I02) {
            if (!Intrinsics.d(((CrossAppCredentials) obj2).getAppName(), fVar.getAppName().a())) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            CrossAppCredentials crossAppCredentials2 = (CrossAppCredentials) it3.next();
            arrayList2.add(new C6146J(crossAppCredentials2.getAppName(), crossAppCredentials2.getAppPackage(), C6171q.D(C6171q.y(crossAppCredentials2.m1647getAccountCookies2C5OJKw())), crossAppCredentials2.getFromOldFormat()));
        }
        C6146J[] elements = {c6146j2, c6146j};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7714v.p0(arrayList2, C7705l.B(elements));
    }

    @NotNull
    public final ArrayList h() {
        C6159e c6159e = this.f61533c;
        List<CrossAppCredentials> g10 = g(c6159e.a());
        ArrayList arrayList = new ArrayList();
        for (CrossAppCredentials crossAppCredentials : g10) {
            arrayList.add(new C6146J(crossAppCredentials.getAppName(), crossAppCredentials.getAppPackage(), C6171q.D(C6171q.y(crossAppCredentials.m1647getAccountCookies2C5OJKw())), crossAppCredentials.getFromOldFormat()));
        }
        String f7 = f();
        C6146J c6146j = null;
        if (f7 != null) {
            Account a11 = c6159e.a();
            InterfaceC4008j<AccountManager> interfaceC4008j = this.f61534d;
            String userData = a11 == null ? null : interfaceC4008j.getValue().getUserData(c6159e.a(), "ru.ozon.id.account.cookie.source.app.name");
            if (userData != null) {
                String userData2 = c6159e.a() == null ? null : interfaceC4008j.getValue().getUserData(c6159e.a(), "ru.ozon.id.account.cookie.source.app.package");
                if (userData2 != null) {
                    c6146j = new C6146J(userData, userData2, C6171q.D(C6171q.y(f7)), true);
                }
            }
        }
        return C7714v.I(C7714v.q0(c6146j, arrayList));
    }

    public final void i(@NotNull String newCookiesAppName, @NotNull String appPackage, @NotNull ArrayList authorizationCookies) {
        List<CrossAppCredentials> list;
        Intrinsics.checkNotNullParameter(newCookiesAppName, "newCookiesAppName");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(authorizationCookies, "authorizationCookies");
        C6159e c6159e = this.f61533c;
        if (c6159e.a() == null) {
            return;
        }
        List<CrossAppCredentials> g10 = g(c6159e.a());
        CrossAppCredentials value = new CrossAppCredentials(0L, newCookiesAppName, appPackage, C6171q.w(authorizationCookies), false, 1, null);
        Intrinsics.checkNotNullParameter(g10, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        if (g10.isEmpty()) {
            list = C7714v.a0(value);
        } else {
            List<CrossAppCredentials> list2 = g10;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.d(((CrossAppCredentials) it.next()).getAppName(), value.getAppName())) {
                        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
                        for (CrossAppCredentials crossAppCredentials : list2) {
                            if (Intrinsics.d(crossAppCredentials.getAppName(), value.getAppName())) {
                                String oldAccountCookies = crossAppCredentials.m1647getAccountCookies2C5OJKw();
                                String newAccountCookies = value.m1647getAccountCookies2C5OJKw();
                                Intrinsics.checkNotNullParameter(oldAccountCookies, "oldAccountCookies");
                                Intrinsics.checkNotNullParameter(newAccountCookies, "newAccountCookies");
                                ArrayList y11 = C6171q.y(newAccountCookies);
                                ArrayList W02 = C7714v.W0(C6171q.y(oldAccountCookies));
                                Iterator it2 = y11.iterator();
                                while (it2.hasNext()) {
                                    String b11 = ((C6179y) it2.next()).b();
                                    kotlin.collections.C.h(W02, new C6174t(kotlin.text.h.z0(kotlin.text.h.m0(b11, "=")).toString()));
                                    W02.add(C6179y.a(b11));
                                }
                                crossAppCredentials = CrossAppCredentials.copy$default(crossAppCredentials, value.getCreatedAt(), null, null, C6171q.w(W02), false, 22, null);
                            }
                            arrayList.add(crossAppCredentials);
                        }
                        list = arrayList;
                    }
                }
            }
            list = C7714v.q0(value, g10);
        }
        j(list);
    }
}
