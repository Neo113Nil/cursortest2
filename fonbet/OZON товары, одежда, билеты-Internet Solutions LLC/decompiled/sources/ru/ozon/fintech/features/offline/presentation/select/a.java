package ru.ozon.fintech.features.offline.presentation.select;

import Ae.C0;
import Ae.E0;
import Ae.O0;
import Ae.w0;
import Ae.x0;
import H30.k;
import H30.m;
import H30.s;
import Sc.o;
import T80.c;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import d40.InterfaceC6083a;
import g30.InterfaceC6618a;
import h3.C6788a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k70.C7601b;
import k70.C7602c;
import k70.C7604e;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l70.C7892a;
import n70.EnumC8449a;
import org.jetbrains.annotations.NotNull;
import r90.f;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.offline.data.model.transfer.BankInfo;
import ru.ozon.fintech.features.offline.data.model.transfer.TransferData;
import ru.ozon.fintech.features.offline.presentation.select.OfflineSelectFragment;
import t90.AbstractC9781a;
import t90.AbstractC9782b;
import u90.C9987a;
import xe.C10720e0;
import xe.C10727i;
import ze.EnumC11113a;

/* loaded from: classes3.dex */
public final class a extends E30.d implements f.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f95752a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S80.b f95753b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6083a f95754c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final r90.f f95755d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final V60.a f95756e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f95757f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f95758g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final x0<l70.c> f95759h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C0 f95760i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C0 f95761j;

    /* renamed from: k, reason: collision with root package name */
    private TransferData f95762k;

    /* renamed from: l, reason: collision with root package name */
    private Boolean f95763l;

    /* renamed from: m, reason: collision with root package name */
    private C7892a f95764m;

    /* renamed from: n, reason: collision with root package name */
    private C7892a f95765n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private List<C7892a> f95766o;

    /* renamed from: p, reason: collision with root package name */
    private C7892a f95767p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f95768q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final C0 f95769r;

    /* renamed from: s, reason: collision with root package name */
    private String f95770s;

    /* renamed from: t, reason: collision with root package name */
    private AbstractC9782b f95771t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private x0<C9987a> f95772u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private String f95773v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private String f95774w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f95775x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f95776y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private C0 f95777z;

    /* renamed from: ru.ozon.fintech.features.offline.presentation.select.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2043a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f95778a;

        static {
            int[] iArr = new int[C7892a.c.values().length];
            try {
                iArr[C7892a.c.RUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C7892a.c.OTHERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C7892a.c.BAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f95778a = iArr;
        }
    }

    /* synthetic */ class b extends C7719a implements Function1<AbstractC9781a, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AbstractC9781a abstractC9781a) {
            ((w0) this.receiver).tryEmit(abstractC9781a);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class c extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a.g0((a) this.receiver);
            return Unit.f71690a;
        }
    }

    public a(@NotNull Context context, @NotNull S80.b fintechNavigation, @NotNull InterfaceC6083a exchanger, @NotNull r90.f permissionsDelegate, @NotNull V60.a offlineRepository, @NotNull InterfaceC6618a fintechAnalyticInteractor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        Intrinsics.checkNotNullParameter(permissionsDelegate, "permissionsDelegate");
        Intrinsics.checkNotNullParameter(offlineRepository, "offlineRepository");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f95752a = context;
        this.f95753b = fintechNavigation;
        this.f95754c = exchanger;
        this.f95755d = permissionsDelegate;
        this.f95756e = offlineRepository;
        this.f95757f = fintechAnalyticInteractor;
        this.f95759h = O0.a(null);
        EnumC11113a enumC11113a = EnumC11113a.DROP_OLDEST;
        this.f95760i = E0.a(0, 1, enumC11113a);
        this.f95761j = E0.a(0, 1, enumC11113a);
        this.f95766o = K.f71697a;
        this.f95769r = E0.a(0, 1, enumC11113a);
        this.f95772u = O0.a(null);
        this.f95773v = "";
        this.f95774w = "";
        this.f95777z = E0.a(0, 1, EnumC11113a.DROP_LATEST);
        permissionsDelegate.s(this);
    }

    private final void F0() {
        C7892a c7892a = this.f95767p;
        InterfaceC6618a interfaceC6618a = this.f95757f;
        if (c7892a == null && !this.f95775x) {
            this.f95775x = true;
            interfaceC6618a.a2("offline_send_phone_number", false);
        } else {
            if (c7892a == null || this.f95776y) {
                return;
            }
            this.f95776y = true;
            interfaceC6618a.a2("offline_send_choose_bank", false);
        }
    }

    public static Unit d0(a aVar, BankInfo selectedBankInfoSafe, C7892a selectedOfflineContactSafe) {
        Intrinsics.checkNotNullParameter(selectedBankInfoSafe, "selectedBankInfoSafe");
        Intrinsics.checkNotNullParameter(selectedOfflineContactSafe, "selectedOfflineContactSafe");
        aVar.f95767p = null;
        aVar.f95773v = "";
        aVar.f95765n = null;
        aVar.f95776y = false;
        aVar.f95775x = false;
        aVar.f95768q = false;
        aVar.f95774w = "";
        aVar.handleState();
        aVar.f95753b.x0(selectedOfflineContactSafe, selectedBankInfoSafe.getId());
        return Unit.f71690a;
    }

    public static Unit e0(a aVar, e40.b phoneScannerResult) {
        Intrinsics.checkNotNullParameter(phoneScannerResult, "phoneScannerResult");
        aVar.f95769r.tryEmit(kotlin.text.h.X((String) C7714v.K(phoneScannerResult.a()), " ", "", false));
        return Unit.f71690a;
    }

    public static Unit f0(a aVar, EnumC8449a enumC8449a) {
        S80.b bVar = aVar.f95753b;
        String str = aVar.f95770s;
        if (str != null) {
            bVar.q(str, enumC8449a.name(), null);
            return Unit.f71690a;
        }
        Intrinsics.n("uuid");
        throw null;
    }

    public static final void g0(a aVar) {
        aVar.permissionUpdated(null);
        aVar.f95758g = false;
    }

    public static final /* synthetic */ C7892a h0(a aVar, String str, String str2, C7892a.b bVar) {
        aVar.getClass();
        return s0("CONTACT_MY", str, str2, "", bVar);
    }

    public static final void m0(a aVar) {
        aVar.f95758g = true;
        Activity c11 = aVar.f95753b.c();
        if (c11 != null) {
            aVar.f95755d.b(c11);
        }
    }

    private static C7892a s0(String str, String str2, String str3, String str4, C7892a.b bVar) {
        String valueOf;
        String sb2;
        String b11;
        String str5;
        int i11 = d70.c.f61218c;
        Intrinsics.checkNotNullParameter(str3, "<this>");
        List m11 = kotlin.text.h.m(str3, new String[]{" "}, 0, 6);
        if (m11.size() > 1) {
            char E11 = kotlin.text.h.E((CharSequence) m11.get(0));
            char E12 = kotlin.text.h.E((CharSequence) m11.get(1));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(E11);
            sb3.append(E12);
            valueOf = sb3.toString();
        } else {
            valueOf = String.valueOf(kotlin.text.h.E((CharSequence) m11.get(0)));
        }
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String a11 = d70.c.a(str2);
        C7892a.c cVar = d70.c.f(a11) ? C7892a.c.RUS : d70.c.e(a11) ? C7892a.c.OTHERS : C7892a.c.BAD;
        int[] iArr = C2043a.f95778a;
        int i12 = iArr[cVar.ordinal()];
        if (i12 == 1) {
            Intrinsics.checkNotNullParameter(str2, "<this>");
            String r02 = kotlin.text.h.r0(10, d70.c.a(str2));
            String substring = r02.substring(0, 3);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            Intrinsics.checkNotNullExpressionValue(r02.substring(3, 10), "substring(...)");
            String substring2 = r02.substring(3, 6);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            String substring3 = r02.substring(6, 8);
            Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
            String substring4 = r02.substring(8, 10);
            Intrinsics.checkNotNullExpressionValue(substring4, "substring(...)");
            StringBuilder sb4 = new StringBuilder("+7 (");
            sb4.append(substring);
            sb4.append(") ");
            Nh.a.h(sb4, substring2, "-", substring3, "-");
            sb4.append(substring4);
            sb2 = sb4.toString();
        } else if (i12 == 2) {
            Intrinsics.checkNotNullParameter(str2, "<this>");
            sb2 = Nk.a.b("+", d70.c.a(str2));
        } else {
            if (i12 != 3) {
                throw new o();
            }
            Intrinsics.checkNotNullParameter(str2, "<this>");
            sb2 = "";
        }
        int i13 = iArr[cVar.ordinal()];
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(str2, "<this>");
            b11 = Nk.a.b("+7", kotlin.text.h.r0(10, d70.c.a(str2)));
        } else {
            if (i13 != 2) {
                if (i13 != 3) {
                    throw new o();
                }
                Intrinsics.checkNotNullParameter(str2, "<this>");
                str5 = "";
                Intrinsics.checkNotNullParameter(str5, "<this>");
                return new C7892a(str, str2, str3, str4, sb2, a11, str5, kotlin.text.h.X(str5, "+", "", false), upperCase, cVar, bVar);
            }
            Intrinsics.checkNotNullParameter(str2, "<this>");
            b11 = Nk.a.b("+", d70.c.a(str2));
        }
        str5 = b11;
        Intrinsics.checkNotNullParameter(str5, "<this>");
        return new C7892a(str, str2, str3, str4, sb2, a11, str5, kotlin.text.h.X(str5, "+", "", false), upperCase, cVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<C7892a> t0() {
        try {
            Cursor query = this.f95752a.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
            try {
                List<C7892a> u02 = u0(query);
                Vd0.b.a(query, null);
                return u02;
            } finally {
            }
        } catch (Exception e11) {
            L80.a.g(e11);
            return K.f71697a;
        }
    }

    private static List u0(Cursor cursor) {
        if (cursor == null) {
            return K.f71697a;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (cursor.moveToNext()) {
            try {
                String b11 = s.b(cursor.getString(cursor.getColumnIndexOrThrow("data1")));
                String str = "";
                if (b11 == null) {
                    b11 = "";
                }
                s.b(cursor.getString(cursor.getColumnIndexOrThrow("data4")));
                String b12 = s.b(cursor.getString(cursor.getColumnIndexOrThrow("display_name")));
                if (b12 == null) {
                    b12 = "";
                }
                String b13 = s.b(cursor.getString(cursor.getColumnIndexOrThrow("photo_thumb_uri")));
                if (b13 != null) {
                    str = b13;
                }
                arrayList.add(s0("CONTACT:" + i11, b11, b12, str, C7892a.b.PHONE_BOOK));
                i11++;
            } catch (Exception unused) {
                L80.a.b("OFFLINER", "Ошибка при получении индекса имени или телефона контакта");
            }
        }
        return arrayList;
    }

    public final void A0(boolean z11) {
        if (z11 || !this.f95768q) {
            this.f95753b.pop();
            return;
        }
        this.f95768q = false;
        this.f95774w = "";
        handleState();
    }

    public final void B0(@NotNull String extractedSearch) {
        Intrinsics.checkNotNullParameter(extractedSearch, "extractedSearch");
        this.f95774w = extractedSearch;
        handleState();
        this.f95760i.tryEmit(Boolean.TRUE);
    }

    public final void C0(@NotNull String extractedSearch, @NotNull String formattedSearch, @NotNull OfflineSelectFragment.a maskMode) {
        Intrinsics.checkNotNullParameter(extractedSearch, "extractedSearch");
        Intrinsics.checkNotNullParameter(formattedSearch, "formattedSearch");
        Intrinsics.checkNotNullParameter(maskMode, "maskMode");
        C7892a c7892a = this.f95767p;
        C0 c02 = this.f95760i;
        Context context = this.f95752a;
        if (c7892a == null) {
            this.f95773v = extractedSearch;
            String string = context.getString(R.string.offline_transfer_by_number);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            this.f95765n = s0("CONTACT_ENTERED", extractedSearch, string, "", C7892a.b.ENTERED);
            handleState();
            c02.tryEmit(Boolean.TRUE);
            return;
        }
        if (this.f95773v.length() == 0) {
            this.f95773v = extractedSearch;
            return;
        }
        if (Intrinsics.d(this.f95773v, extractedSearch)) {
            return;
        }
        this.f95773v = extractedSearch;
        this.f95767p = null;
        String string2 = context.getString(R.string.offline_transfer_by_number);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.f95765n = s0("CONTACT_ENTERED", extractedSearch, string2, "", C7892a.b.ENTERED);
        handleState();
        c02.tryEmit(Boolean.TRUE);
    }

    public final void D0(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.f95770s = uuid;
        C6788a a11 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, He.b.f10879b, null, new ru.ozon.fintech.features.offline.presentation.select.b(this, null), 2);
    }

    public final void E0() {
        handleState();
        F0();
    }

    public final void G0(@NotNull String id2) {
        List<BankInfo> banks;
        Intrinsics.checkNotNullParameter(id2, "id");
        TransferData transferData = this.f95762k;
        Object obj = null;
        if (transferData != null && (banks = transferData.getBanks()) != null) {
            Iterator<T> it = banks.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.d(((BankInfo) next).getId(), id2)) {
                    obj = next;
                    break;
                }
            }
            obj = (BankInfo) obj;
        }
        E30.g.a(new C7601b(this, 0), obj, this.f95767p);
    }

    public final void H0(@NotNull C7892a offlineContact) {
        Intrinsics.checkNotNullParameter(offlineContact, "offlineContact");
        if (this.f95767p == null) {
            int i11 = C2043a.f95778a[offlineContact.j().ordinal()];
            S80.b bVar = this.f95753b;
            if (i11 == 1) {
                this.f95767p = offlineContact;
                this.f95773v = "";
                handleState();
                Activity c11 = bVar.c();
                if (c11 instanceof androidx.appcompat.app.g) {
                    m.a((androidx.appcompat.app.g) c11);
                }
            } else if (i11 == 2) {
                this.f95767p = offlineContact;
                this.f95773v = "";
                handleState();
                Activity c12 = bVar.c();
                if (c12 instanceof androidx.appcompat.app.g) {
                    m.a((androidx.appcompat.app.g) c12);
                }
            } else {
                if (i11 != 3) {
                    throw new o();
                }
                EnumC8449a offlineCbottomType = EnumC8449a.NOT_TRANSFER;
                Intrinsics.checkNotNullParameter(offlineCbottomType, "offlineCbottomType");
                Activity c13 = bVar.c();
                if (c13 instanceof androidx.appcompat.app.g) {
                    m.a((androidx.appcompat.app.g) c13);
                }
                k.a(new C7604e(this, offlineCbottomType));
            }
        }
        F0();
    }

    public final void I0(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        C7892a c7892a = this.f95765n;
        if (c7892a != null) {
            H0(c7892a);
        }
    }

    public final void J0(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        C7892a c7892a = this.f95764m;
        if (c7892a != null) {
            H0(c7892a);
        }
    }

    public final void K0(@NotNull String id2) {
        Object obj;
        Intrinsics.checkNotNullParameter(id2, "id");
        Iterator<T> it = this.f95766o.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.d(((C7892a) obj).getId(), id2)) {
                    break;
                }
            }
        }
        C7892a c7892a = (C7892a) obj;
        if (c7892a != null) {
            H0(c7892a);
        }
    }

    public final void L0(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        if (Intrinsics.d(this.f95763l, Boolean.FALSE)) {
            C7892a c7892a = this.f95767p;
            if ((c7892a != null ? c7892a.i() : null) == C7892a.b.f72948ME) {
                String str = this.f95770s;
                if (str != null) {
                    this.f95753b.q(str, "COMMON_ERROR", null);
                    return;
                } else {
                    Intrinsics.n("uuid");
                    throw null;
                }
            }
        }
        this.f95768q = true;
        handleState();
        this.f95761j.tryEmit(Boolean.TRUE);
    }

    public final void M0(@NotNull EnumC8449a offlineCbottomType) {
        Intrinsics.checkNotNullParameter(offlineCbottomType, "offlineCbottomType");
        Activity c11 = this.f95753b.c();
        if (c11 instanceof androidx.appcompat.app.g) {
            m.a((androidx.appcompat.app.g) c11);
        }
        k.a(new C7604e(this, offlineCbottomType));
    }

    @NotNull
    public final w0<AbstractC9781a> getPermissionAction() {
        return this.f95777z;
    }

    @NotNull
    public final x0<C9987a> getPermissionScreenState() {
        return this.f95772u;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public final void handleState() {
        /*
            Method dump skipped, instructions count: 1280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.fintech.features.offline.presentation.select.a.handleState():void");
    }

    public final void onPermissionResumeOrResult(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f95758g) {
            this.f95755d.b(activity);
        }
    }

    public final void onStart() {
        this.f95754c.e(e40.b.class, androidx.lifecycle.x0.a(this), false, new C7602c(this, 0));
    }

    public final void onStop() {
        this.f95754c.d(e40.b.class);
    }

    @Override // r90.f.a
    public final void permissionUpdated(AbstractC9782b abstractC9782b) {
        this.f95771t = abstractC9782b;
        if (abstractC9782b instanceof AbstractC9782b.a) {
            this.f95766o = t0();
        }
        handleState();
    }

    @NotNull
    public final x0<l70.c> v0() {
        return this.f95759h;
    }

    @NotNull
    public final C0 w0() {
        return this.f95769r;
    }

    @NotNull
    public final C0 x0() {
        return this.f95761j;
    }

    @NotNull
    public final C0 y0() {
        return this.f95760i;
    }

    public final void z0() {
        String str = this.f95770s;
        if (str != null) {
            c.a.a(this.f95753b, "TEXT", "CONFIRM", "RETURN_VALUE", false, str, false, true, "Наведите камеру на номер телефона", null, null, "((\\+7|7|8)\\D*)?\\(?[489][0-9]{2}\\)?\\D*[0-9]{3}\\D*[0-9]{2}\\D*[0-9]{2}", null, null, false, null, null, null, 129832);
        } else {
            Intrinsics.n("uuid");
            throw null;
        }
    }
}
