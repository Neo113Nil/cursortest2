package ru.ozon.fintech.wallet.manager.domain.mpay;

import Sc.o;
import Sc.s;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pg.C8926b;
import qg.C9054a;
import ru.ozon.app.android.R;
import ru.ozon.fintech.wallet.manager.domain.mpay.MirPayWalletException;
import sa0.C9646a;
import sa0.c;
import sa0.d;
import sa0.e;
import t6.C9770e;
import t6.C9772g;
import t6.InterfaceC9767b;
import ta0.InterfaceC9791a;
import u6.C9975a;

/* loaded from: classes3.dex */
public final class a implements InterfaceC9791a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f97117a;

    /* renamed from: b, reason: collision with root package name */
    private volatile InterfaceC9767b f97118b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f97119c;

    /* renamed from: ru.ozon.fintech.wallet.manager.domain.mpay.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2129a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97120a;

        static {
            int[] iArr = new int[C9772g.b.values().length];
            try {
                iArr[C9772g.b.APP_UPDATE_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C9772g.b.SDK_UPDATE_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C9772g.b.SDK_WRONG_VERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C9772g.b.CARD_EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C9772g.b.REJECTED_BY_ISSUER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C9772g.b.DISCONNECTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C9772g.b.NOT_SUPPORTED_CARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C9772g.b.SETUP_NOT_COMPLETE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[C9772g.b.SECURITY_ISSUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[C9772g.b.ACCESS_DENIED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[C9772g.b.INTERNAL_ERROR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[C9772g.b.INVALID_DATA.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[C9772g.b.CONFLICT_DATA.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f97120a = iArr;
        }
    }

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ WeakReference<Function1<d, Unit>> f97122b;

        b(WeakReference<Function1<d, Unit>> weakReference) {
            this.f97122b = weakReference;
        }

        public final void a(InterfaceC9767b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            a.this.f97118b = connection;
            Function1<d, Unit> function1 = this.f97122b.get();
            if (function1 != null) {
                function1.invoke(d.SUCCESS);
            }
        }

        public final void b(C9772g c9772g) {
            L80.a.b("MirPayWalletManagerImpl", "Ошибка при подключении к Mir Pay");
            d dVar = d.ERROR;
            L80.a.b("MirPayWalletManagerImpl", String.valueOf(c9772g.a()));
            L80.a.b("MirPayWalletManagerImpl", "Сообщение: " + c9772g.getMessage());
            L80.a.g(c9772g);
            if (c9772g.a() == C9772g.b.APP_UPDATE_REQUIRED) {
                dVar = d.NEED_UPDATE;
            }
            Function1<d, Unit> function1 = this.f97122b.get();
            if (function1 != null) {
                function1.invoke(dVar);
            }
            a.this.f97118b = null;
        }
    }

    public a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f97117a = context;
    }

    private final InterfaceC9767b m() throws MirPayWalletException {
        InterfaceC9767b interfaceC9767b = this.f97118b;
        if (interfaceC9767b != null) {
            return interfaceC9767b;
        }
        throw new MirPayWalletException(MirPayWalletException.a.NO_CONNECTION, "Соединение не установлено. Перед тем как вызывать метод необходимо установить соединение MirPayWalletManager.openConnection(..)", null, 4, null);
    }

    private static MirPayWalletException.a n(C9772g.b bVar) {
        switch (C2129a.f97120a[bVar.ordinal()]) {
            case 1:
                return MirPayWalletException.a.MIR_PAY_UPDATE_REQUIRED;
            case 2:
            case 3:
                return MirPayWalletException.a.SDK_NEED_UPDATE;
            case 4:
                return MirPayWalletException.a.MIR_PAY_CARD_EXPIRED;
            case 5:
                return MirPayWalletException.a.MIR_PAY_REJECTED_BY_ISSUER;
            case 6:
                return MirPayWalletException.a.NO_CONNECTION;
            case 7:
                return MirPayWalletException.a.MIR_PAY_NOT_SUPPORTED_CARD;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return MirPayWalletException.a.MIR_PAY_INTERNAL_ERROR;
            default:
                throw new o();
        }
    }

    private static MirPayWalletException o(Exception exc) {
        if (!(exc instanceof C9772g)) {
            return new MirPayWalletException(MirPayWalletException.a.MIR_PAY_INTERNAL_ERROR, exc.getMessage(), exc.getCause());
        }
        C9772g.b a11 = ((C9772g) exc).a();
        Intrinsics.checkNotNullExpressionValue(a11, "getType(...)");
        return new MirPayWalletException(n(a11), exc.getMessage(), exc.getCause());
    }

    @Override // ta0.InterfaceC9791a
    @NotNull
    public final ArrayList a() throws MirPayWalletException {
        try {
            List<C9975a> a11 = m().a();
            Intrinsics.checkNotNullExpressionValue(a11, "getAllCards(...)");
            List<C9975a> list = a11;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            for (C9975a c9975a : list) {
                Intrinsics.f(c9975a);
                arrayList.add(c.a(c9975a));
            }
            return arrayList;
        } catch (Exception e11) {
            throw o(e11);
        }
    }

    @Override // ta0.InterfaceC9791a
    public final void b(@NotNull r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Context context = this.f97117a;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(context.getString(R.string.market_web_link, context.getString(R.string.remote_app_id))));
        intent.setFlags(268435456);
        activity.startActivity(intent);
    }

    @Override // ta0.InterfaceC9791a
    public final void c(boolean z11) {
        this.f97119c = z11;
    }

    @Override // ta0.InterfaceC9791a
    public final void closeConnection() {
        L80.a.a("MirPayWalletManagerImpl", "closeConnection isActiveTokenizeFlow: " + this.f97119c);
        try {
            InterfaceC9767b interfaceC9767b = this.f97118b;
            if (interfaceC9767b != null) {
                interfaceC9767b.disconnect();
            }
        } catch (Exception e11) {
            L80.a.c("MirPayWalletManagerImpl", null, e11);
            L80.a.g(e11);
        }
        this.f97118b = null;
    }

    @Override // ta0.InterfaceC9791a
    public final void d(@NotNull String bankId, @NotNull Function1<? super d, Unit> resultListener) {
        Intrinsics.checkNotNullParameter(bankId, "bankId");
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        if (this.f97118b != null) {
            resultListener.invoke(d.SUCCESS);
        } else {
            C9770e.b(this.f97117a, bankId, new b(new WeakReference(resultListener)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c A[Catch: g -> 0x0029, LOOP:0: B:13:0x0056->B:15:0x005c, LOOP_END, TRY_LEAVE, TryCatch #1 {g -> 0x0029, blocks: (B:11:0x0025, B:12:0x0045, B:13:0x0056, B:15:0x005c), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ta0.InterfaceC9791a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(@NotNull kotlin.coroutines.jvm.internal.c cVar) throws MirPayWalletException {
        ru.ozon.fintech.wallet.manager.domain.mpay.b bVar;
        int i11;
        C9772g c9772g;
        a aVar;
        if (cVar instanceof ru.ozon.fintech.wallet.manager.domain.mpay.b) {
            bVar = (ru.ozon.fintech.wallet.manager.domain.mpay.b) cVar;
            int i12 = bVar.f97126g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f97126g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f97124e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f97126g;
                if (i11 != 0) {
                    s.b(obj);
                    try {
                        Context context = this.f97117a;
                        bVar.f97123d = this;
                        bVar.f97126g = 1;
                        obj = C9054a.b(context, bVar);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        aVar = this;
                    } catch (C9772g e11) {
                        c9772g = e11;
                        aVar = this;
                        L80.a.c("MirPayWalletManagerImpl", "getUpdateSores", c9772g);
                        C9772g.b a11 = c9772g.a();
                        Intrinsics.checkNotNullExpressionValue(a11, "getType(...)");
                        aVar.getClass();
                        throw new MirPayWalletException(n(a11), "Ошибка при получении сторов для обновления", null, 4, null);
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = bVar.f97123d;
                    try {
                        s.b(obj);
                    } catch (C9772g e12) {
                        c9772g = e12;
                        L80.a.c("MirPayWalletManagerImpl", "getUpdateSores", c9772g);
                        C9772g.b a112 = c9772g.a();
                        Intrinsics.checkNotNullExpressionValue(a112, "getType(...)");
                        aVar.getClass();
                        throw new MirPayWalletException(n(a112), "Ошибка при получении сторов для обновления", null, 4, null);
                    }
                }
                Iterable<C8926b> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(C7714v.z(iterable, 10));
                for (C8926b c8926b : iterable) {
                    arrayList.add(new Pair(c8926b.a(), c8926b.b().toString()));
                }
                return arrayList;
            }
        }
        bVar = new ru.ozon.fintech.wallet.manager.domain.mpay.b(this, cVar);
        Object obj2 = bVar.f97124e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f97126g;
        if (i11 != 0) {
        }
        Iterable<C8926b> iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(C7714v.z(iterable2, 10));
        while (r10.hasNext()) {
        }
        return arrayList2;
    }

    @Override // ta0.InterfaceC9791a
    public final boolean f() {
        return this.f97118b != null;
    }

    @Override // ta0.InterfaceC9791a
    @NotNull
    public final e g() {
        InterfaceC9767b.a b11 = m().b();
        Intrinsics.checkNotNullExpressionValue(b11, "getHostInfo(...)");
        Intrinsics.checkNotNullParameter(b11, "<this>");
        String b12 = b11.b();
        Intrinsics.checkNotNullExpressionValue(b12, "getWalletId(...)");
        String a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getDeviceId(...)");
        return new e(b12, a11);
    }

    @Override // ta0.InterfaceC9791a
    public final void h(@NotNull r activity, int i11, @NotNull String encryptedCardData) throws MirPayWalletException {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(encryptedCardData, "encryptedCardData");
        try {
            activity.startActivityForResult(m().c(encryptedCardData), i11);
        } catch (Exception e11) {
            throw o(e11);
        }
    }

    @Override // ta0.InterfaceC9791a
    public final boolean i() {
        return this.f97119c;
    }

    @Override // ta0.InterfaceC9791a
    public final boolean j() {
        Context context = this.f97117a;
        try {
            context.getPackageManager().getApplicationInfo(context.getString(R.string.remote_app_id), 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // ta0.InterfaceC9791a
    @NotNull
    public final C9646a k(@NotNull Intent intent) throws MirPayWalletException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            C9770e.b d11 = C9770e.d(intent);
            if (d11 == null) {
                throw new MirPayWalletException(MirPayWalletException.a.NO_CONNECTION, "Ошибка MirApp.unpackEnrollmentResult(intent) = null", null, 4, null);
            }
            String b11 = d11.b();
            C9772g.b a11 = d11.a();
            return new C9646a(b11, a11 != null ? a11.name() : null);
        } catch (Exception e11) {
            throw o(e11);
        }
    }
}
