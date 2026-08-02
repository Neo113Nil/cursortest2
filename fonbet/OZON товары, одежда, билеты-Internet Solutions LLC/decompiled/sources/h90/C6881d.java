package h90;

import Sc.s;
import T7.E;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import h90.k;
import j90.InterfaceC7310a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import k90.AbstractC7611a;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import retrofit2.HttpException;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.fintech.base.shared.FintechExportedContentProviderInteractor;
import ru.ozon.fintech.notifications.models.GetPushBodyResponse;
import ru.ozon.fintech.notifications.models.NotificationBody;
import ru.ozon.fintech.notifications.models.NotificationOtpBody;
import ru.ozon.fintech.notifications.models.NotificationSecureBody;
import ru.ozon.fintech.ui.input.CounterView;
import ve.EnumC10311b;
import xe.Y;

/* renamed from: h90.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6881d implements k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f65152a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f65153b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC7310a f65154c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f65155d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Moshi f65156e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final FintechExportedContentProviderInteractor f65157f;

    /* renamed from: g, reason: collision with root package name */
    private int f65158g;

    public C6881d(@NotNull f notificationInteractor, @NotNull InterfaceC6618a analyticsInteractor, @NotNull InterfaceC7310a repository, @NotNull ru.ozon.fintech.settings.domain.a settings, @NotNull Moshi moshi, @NotNull FintechExportedContentProviderInteractor fintechContentProvider) {
        Intrinsics.checkNotNullParameter(notificationInteractor, "notificationInteractor");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(fintechContentProvider, "fintechContentProvider");
        this.f65152a = notificationInteractor;
        this.f65153b = analyticsInteractor;
        this.f65154c = repository;
        this.f65155d = settings;
        this.f65156e = moshi;
        this.f65157f = fintechContentProvider;
    }

    private static String d(k90.b bVar) {
        String str = bVar.a().get("comm_id");
        return str == null ? "" : str;
    }

    private static String e(k90.b bVar) {
        return bVar.a().get("b");
    }

    private static String f(k90.b bVar) {
        String str = bVar.a().get("message_id");
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(k90.b bVar, String str, kotlin.coroutines.jvm.internal.c cVar) {
        C6878a c6878a;
        int i11;
        AbstractC7611a c1161a;
        C6881d c6881d;
        String str2;
        String str3;
        NotificationOtpBody notificationOtpBody;
        AbstractC7611a abstractC7611a;
        AbstractC7611a.b bVar2;
        JSONArray jSONArray;
        String str4;
        String str5;
        String id2;
        k90.b bVar3 = bVar;
        String str6 = str;
        if (cVar instanceof C6878a) {
            c6878a = (C6878a) cVar;
            int i12 = c6878a.f65132i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c6878a.f65132i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c6878a.f65130g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c6878a.f65132i;
                String str7 = "default";
                if (i11 != 0) {
                    s.b(obj);
                    String str8 = bVar3.a().get("extra");
                    if (str8 == null || str8.length() == 0) {
                        ru.ozon.fintech.settings.domain.a aVar2 = this.f65155d;
                        aVar2.j();
                        this.f65153b.N("default", k(bVar, str), null, null);
                        String d11 = d(bVar3);
                        String f7 = f(bVar3);
                        String str9 = bVar3.a().get(CommentV3DTO.HEADER_FIELD_NAME);
                        c1161a = new AbstractC7611a.C1161a(d11, f7, str9 == null ? "" : str9, j(bVar3), aVar2.getPushIcon(), k(bVar, str), h(bVar3), e(bVar3));
                    } else {
                        c1161a = null;
                    }
                    if (c1161a != null) {
                        c6881d = this;
                        String str10 = "finance_encrypted";
                        if (c1161a == null) {
                            c6881d.getClass();
                            String str11 = bVar3.a().get("extra");
                            if (str11 == null) {
                                str2 = "finance_encrypted";
                                str3 = null;
                                c1161a = null;
                            } else {
                                try {
                                    notificationOtpBody = (NotificationOtpBody) c6881d.f65156e.c(NotificationOtpBody.class).fromJson(str11);
                                } catch (Throwable unused) {
                                    notificationOtpBody = null;
                                }
                                if (Intrinsics.d(notificationOtpBody != null ? notificationOtpBody.getType() : null, "finance_encrypted")) {
                                    if (notificationOtpBody.getParentId() == null && (id2 = notificationOtpBody.getId()) != null) {
                                        c6881d.f65157f.putStringValue("PUSH_ID_KEY", id2);
                                    }
                                    ArrayList arrayList = new ArrayList();
                                    ru.ozon.fintech.settings.domain.a aVar3 = c6881d.f65155d;
                                    aVar3.j();
                                    str3 = null;
                                    c6881d.f65153b.N("finance_encrypted", k(bVar3, str6), notificationOtpBody.getId(), notificationOtpBody.getParentId());
                                    f fVar = c6881d.f65152a;
                                    if (fVar.f().length() == 0) {
                                        arrayList.add("Нет публичного ключа в кейчейн");
                                    }
                                    if (fVar.g().length() == 0) {
                                        arrayList.add("Нет jwt-токена в кейчейн");
                                    }
                                    if (fVar.j().length() == 0) {
                                        arrayList.add("Нет значения sub в jwt");
                                    }
                                    String c11 = fVar.c();
                                    if (c11 == null || c11.length() == 0) {
                                        arrayList.add("Не смогли скрафтить секрет для расшифровки");
                                    }
                                    String str12 = notificationOtpBody.getEncrypted().getMessages().get(fVar.i());
                                    if (str12 == null || str12.length() == 0) {
                                        arrayList.add("Нет зашифрованного сообщения по fingerprint");
                                    }
                                    String nonce = notificationOtpBody.getEncrypted().getNonce();
                                    NotificationOtpBody.Encrypted.Template template = notificationOtpBody.getEncrypted().getTemplate();
                                    String body = template != null ? template.getBody() : null;
                                    NotificationOtpBody.Encrypted.Template template2 = notificationOtpBody.getEncrypted().getTemplate();
                                    String title = template2 != null ? template2.getTitle() : null;
                                    if (str12 == null || str12.length() == 0 || c11 == null || c11.length() == 0 || nonce.length() <= 0) {
                                        str2 = "finance_encrypted";
                                    } else {
                                        try {
                                            jSONArray = new JSONArray(fVar.h(c11, str12, nonce));
                                        } catch (Throwable unused2) {
                                            arrayList.add("Не удалось расшифровать пуш-уведомление");
                                            jSONArray = null;
                                        }
                                        NotificationOtpBody.Encrypted.Copy copyAction = notificationOtpBody.getEncrypted().getCopyAction();
                                        int position = copyAction != null ? copyAction.getPosition() : 0;
                                        if ((jSONArray != null ? jSONArray.length() : 0) <= position) {
                                            arrayList.add("Не удалось найти ОТП код");
                                        } else if (jSONArray != null) {
                                            str4 = jSONArray.getString(position);
                                            NotificationOtpBody.Encrypted.Copy copyAction2 = notificationOtpBody.getEncrypted().getCopyAction();
                                            String action = copyAction2 == null ? copyAction2.getAction() : null;
                                            if (jSONArray == null) {
                                                if (body == null) {
                                                    body = "";
                                                }
                                                ArrayList arrayList2 = new ArrayList();
                                                int length = jSONArray.length();
                                                for (int i13 = 0; i13 < length; i13++) {
                                                    String string = jSONArray.getString(i13);
                                                    arrayList2.add(string == null ? "" : string);
                                                }
                                                Iterator it = arrayList2.iterator();
                                                String str13 = body;
                                                int i14 = 0;
                                                while (it.hasNext()) {
                                                    Object next = it.next();
                                                    int i15 = i14 + 1;
                                                    if (i14 < 0) {
                                                        C7714v.O0();
                                                        throw null;
                                                    }
                                                    str13 = kotlin.text.h.X(str13, E.a(i14, "{{ index . ", " }}"), (String) next, false);
                                                    it = it;
                                                    i14 = i15;
                                                    str10 = str10;
                                                }
                                                str5 = str13;
                                            } else {
                                                str5 = null;
                                            }
                                            str2 = str10;
                                            if (title != null || str5 == null) {
                                                arrayList.add("Не удалось заполнить шаблон пуш уведомления");
                                            } else {
                                                bVar2 = new AbstractC7611a.b(d(bVar3), f(bVar3), str4, action, title, str5, aVar3.getPushIcon(), k(bVar3, str6), h(bVar3), e(bVar3));
                                                if (bVar2 != null) {
                                                    String d12 = d(bVar3);
                                                    String f11 = f(bVar3);
                                                    String str14 = bVar3.a().get(CommentV3DTO.HEADER_FIELD_NAME);
                                                    abstractC7611a = new AbstractC7611a.C1161a(d12, f11, str14 == null ? "" : str14, j(bVar3), aVar3.getPushIcon(), k(bVar3, str6), h(bVar3), e(bVar3));
                                                } else {
                                                    abstractC7611a = bVar2;
                                                }
                                                if (arrayList.isEmpty()) {
                                                    String str15 = (String) C7714v.M(arrayList);
                                                    String d13 = abstractC7611a.d();
                                                    aVar3.j();
                                                    c6881d.f65153b.y("finance_encrypted", (r25 & 2) != 0 ? null : null, (r25 & 8) != 0 ? null : str15, (r25 & 16) != 0, (r25 & 32) != 0 ? null : str11, d13, (r25 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : Integer.valueOf(j(bVar3).length()), (r25 & 256) != 0 ? null : null, (r25 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : null, (r25 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : null);
                                                } else {
                                                    String g10 = fVar.g();
                                                    String d14 = abstractC7611a.d();
                                                    aVar3.j();
                                                    c6881d.f65153b.y("finance_encrypted", (r25 & 2) != 0 ? null : g10, (r25 & 8) != 0 ? null : null, (r25 & 16) != 0, (r25 & 32) != 0 ? null : null, d14, (r25 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : Integer.valueOf(j(bVar3).length()), (r25 & 256) != 0 ? null : null, (r25 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : null, (r25 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : null);
                                                }
                                            }
                                        }
                                        str4 = null;
                                        NotificationOtpBody.Encrypted.Copy copyAction22 = notificationOtpBody.getEncrypted().getCopyAction();
                                        if (copyAction22 == null) {
                                        }
                                        if (jSONArray == null) {
                                        }
                                        str2 = str10;
                                        if (title != null) {
                                        }
                                        arrayList.add("Не удалось заполнить шаблон пуш уведомления");
                                    }
                                    bVar2 = null;
                                    if (bVar2 != null) {
                                    }
                                    if (arrayList.isEmpty()) {
                                    }
                                } else {
                                    str2 = "finance_encrypted";
                                    str3 = null;
                                    abstractC7611a = null;
                                }
                                c1161a = abstractC7611a;
                            }
                        } else {
                            str2 = "finance_encrypted";
                            str3 = null;
                        }
                        if (c1161a == null) {
                            InterfaceC6618a interfaceC6618a = c6881d.f65153b;
                            if (!(c1161a instanceof AbstractC7611a.C1161a)) {
                                boolean z11 = c1161a instanceof AbstractC7611a.c;
                                str7 = (z11 && ((AbstractC7611a.c) c1161a).h()) ? "finance" : (!z11 || ((AbstractC7611a.c) c1161a).h()) ? c1161a instanceof AbstractC7611a.b ? str2 : "undefined" : "prefix";
                            }
                            c6881d.f65155d.j();
                            String k11 = k(bVar3, str6);
                            String str16 = str3;
                            interfaceC6618a.N(str7, k11, str16, str16);
                        }
                        return c1161a;
                    }
                    c6878a.f65127d = this;
                    c6878a.f65128e = bVar3;
                    c6878a.f65129f = str6;
                    c6878a.f65132i = 1;
                    obj = i(bVar3, str6, c6878a);
                    if (obj == aVar) {
                        return aVar;
                    }
                    c6881d = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str17 = c6878a.f65129f;
                    k90.b bVar4 = c6878a.f65128e;
                    c6881d = c6878a.f65127d;
                    s.b(obj);
                    str6 = str17;
                    bVar3 = bVar4;
                }
                c1161a = (AbstractC7611a) obj;
                String str102 = "finance_encrypted";
                if (c1161a == null) {
                }
                if (c1161a == null) {
                }
                return c1161a;
            }
        }
        c6878a = new C6878a(this, cVar);
        Object obj2 = c6878a.f65130g;
        Wc.a aVar4 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c6878a.f65132i;
        String str72 = "default";
        if (i11 != 0) {
        }
        c1161a = (AbstractC7611a) obj2;
        String str1022 = "finance_encrypted";
        if (c1161a == null) {
        }
        if (c1161a == null) {
        }
        return c1161a;
    }

    private static int h(k90.b bVar) {
        try {
            return Integer.parseInt(d(bVar));
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02cb A[Catch: all -> 0x02d6, TryCatch #14 {all -> 0x02d6, blocks: (B:17:0x02b0, B:19:0x02cb, B:21:0x02cf, B:22:0x02dc), top: B:16:0x02b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x0251 -> B:67:0x0098). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(k90.b bVar, String str, kotlin.coroutines.jvm.internal.c cVar) {
        C6879b c6879b;
        int i11;
        int i12;
        String str2;
        NotificationSecureBody notificationSecureBody;
        String str3;
        String str4;
        String str5;
        int i13;
        long currentTimeMillis;
        String str6;
        k90.b bVar2;
        String str7;
        String str8;
        String str9;
        int i14;
        C6881d c6881d;
        int i15;
        String str10;
        long j11;
        String str11;
        NotificationSecureBody notificationSecureBody2;
        C6879b c6879b2;
        String str12;
        int i16;
        String id2;
        int i17;
        int i18;
        String str13;
        long j12;
        Exception e11;
        k90.b bVar3;
        int i19;
        int i21;
        String str14;
        long j13;
        int i22;
        C6881d c6881d2;
        int i23;
        String str15;
        k90.b bVar4;
        String str16;
        long j14;
        C6881d c6881d3;
        String str17;
        long j15;
        int i24;
        long j16;
        AbstractC7611a.c cVar2;
        NotificationBody notificationBody;
        AbstractC7611a.c cVar3;
        NotificationBody notificationBody2;
        if (cVar instanceof C6879b) {
            c6879b = (C6879b) cVar;
            int i25 = c6879b.f65147r;
            if ((i25 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c6879b.f65147r = i25 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c6879b.f65145p;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c6879b.f65147r;
                String str18 = "";
                if (i11 != 0) {
                    i12 = 1;
                    str2 = null;
                    s.b(obj);
                    String str19 = bVar.a().get("extra");
                    if (str19 == null) {
                        return null;
                    }
                    try {
                        notificationSecureBody = (NotificationSecureBody) this.f65156e.c(NotificationSecureBody.class).fromJson(str19);
                    } catch (Throwable unused) {
                        notificationSecureBody = null;
                    }
                    if (notificationSecureBody == null || !Intrinsics.d(notificationSecureBody.getType(), "finance") || (id2 = notificationSecureBody.getId()) == null || id2.length() == 0) {
                        if (notificationSecureBody == null) {
                            str3 = "prefix";
                            str5 = str19;
                            str4 = null;
                        } else {
                            str3 = "";
                            str4 = null;
                            str5 = null;
                        }
                        i13 = 0;
                    } else {
                        str4 = notificationSecureBody.getParentId();
                        str5 = notificationSecureBody.getId();
                        str3 = "finance";
                        i13 = 1;
                    }
                    if (str5 == null) {
                        return null;
                    }
                    if (str4 == null) {
                        this.f65157f.putStringValue("PUSH_ID_KEY", str5);
                    }
                    this.f65155d.j();
                    this.f65153b.N(str3, k(bVar, str), notificationSecureBody != null ? notificationSecureBody.getId() : null, str4);
                    currentTimeMillis = System.currentTimeMillis();
                    try {
                        b.Companion companion = kotlin.time.b.INSTANCE;
                        long g10 = kotlin.time.c.g(CounterView.COUNTER_MAX_DEFAULT, EnumC10311b.MILLISECONDS);
                        i15 = 0;
                        this.f65158g = 0;
                        str10 = str19;
                        j11 = g10;
                        i14 = i13;
                        str11 = str3;
                        notificationSecureBody2 = notificationSecureBody;
                        c6881d = this;
                        c6879b2 = c6879b;
                        str12 = str5;
                        i16 = 2;
                        bVar2 = bVar;
                        str7 = str;
                        if (i15 < i16) {
                        }
                        return aVar;
                    } catch (Throwable th2) {
                        th = th2;
                        str6 = "";
                        bVar2 = bVar;
                        str7 = str;
                        str8 = str3;
                        str9 = str19;
                        i14 = i13;
                        c6881d = this;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j14 = c6879b.f65143n;
                            i23 = c6879b.f65140k;
                            str17 = c6879b.f65138i;
                            notificationSecureBody = c6879b.f65137h;
                            str15 = c6879b.f65136g;
                            str16 = c6879b.f65135f;
                            bVar4 = c6879b.f65134e;
                            c6881d3 = c6879b.f65133d;
                            try {
                                s.b(obj);
                                i12 = 1;
                                str6 = "";
                                str8 = str17;
                            } catch (Throwable th3) {
                                th = th3;
                                i12 = 1;
                                currentTimeMillis = j14;
                                str6 = "";
                                str8 = str17;
                                str9 = str15;
                                str7 = str16;
                                i14 = i23;
                                c6881d = c6881d3;
                                bVar2 = bVar4;
                                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                                cVar2 = null;
                                L80.a.c("NotificationServiceInteractorImpl", null, th);
                                if (!(th instanceof HttpException)) {
                                }
                                InterfaceC6618a interfaceC6618a = c6881d.f65153b;
                                if (notificationSecureBody == null) {
                                }
                                c6881d.f65155d.j();
                                interfaceC6618a.y(str8, (r25 & 2) != 0 ? null : null, (r25 & 8) != 0 ? null : th.getLocalizedMessage(), (r25 & 16) != 0, (r25 & 32) != 0 ? null : str9, r26, (r25 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : null, (r25 & 256) != 0 ? null : new Integer(r4), (r25 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : new Integer(c6881d.f65158g), (r25 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : new Long(currentTimeMillis2));
                                bVar4 = bVar2;
                                str16 = str7;
                                notificationBody = null;
                                c6881d3 = c6881d;
                                i23 = i14;
                                ru.ozon.fintech.settings.domain.a aVar2 = c6881d3.f65155d;
                                if (notificationBody == null) {
                                }
                                if (cVar3 == null) {
                                }
                            }
                            try {
                                long currentTimeMillis3 = System.currentTimeMillis() - j14;
                                notificationBody2 = (NotificationBody) c6881d3.f65156e.c(NotificationBody.class).fromJson(((GetPushBodyResponse) obj).getText());
                                if (notificationBody2 == null) {
                                    InterfaceC6618a interfaceC6618a2 = c6881d3.f65153b;
                                    String id3 = notificationSecureBody != null ? notificationSecureBody.getId() : null;
                                    c6881d3.f65155d.j();
                                    interfaceC6618a2.y(str8, (r25 & 2) != 0 ? null : null, (r25 & 8) != 0 ? null : null, (r25 & 16) != 0, (r25 & 32) != 0 ? null : null, id3, (r25 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : new Integer(notificationBody2.getBody().length()), (r25 & 256) != 0 ? null : null, (r25 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : new Integer(c6881d3.f65158g), (r25 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : new Long(currentTimeMillis3));
                                    notificationBody = notificationBody2;
                                } else {
                                    notificationBody = null;
                                }
                                cVar2 = null;
                            } catch (Throwable th4) {
                                th = th4;
                                currentTimeMillis = j14;
                                str9 = str15;
                                str7 = str16;
                                i14 = i23;
                                c6881d = c6881d3;
                                bVar2 = bVar4;
                                long currentTimeMillis22 = System.currentTimeMillis() - currentTimeMillis;
                                cVar2 = null;
                                L80.a.c("NotificationServiceInteractorImpl", null, th);
                                if (!(th instanceof HttpException)) {
                                }
                                InterfaceC6618a interfaceC6618a3 = c6881d.f65153b;
                                if (notificationSecureBody == null) {
                                }
                                c6881d.f65155d.j();
                                interfaceC6618a3.y(str8, (r25 & 2) != 0 ? null : null, (r25 & 8) != 0 ? null : th.getLocalizedMessage(), (r25 & 16) != 0, (r25 & 32) != 0 ? null : str9, r26, (r25 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : null, (r25 & 256) != 0 ? null : new Integer(r4), (r25 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : new Integer(c6881d.f65158g), (r25 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : new Long(currentTimeMillis22));
                                bVar4 = bVar2;
                                str16 = str7;
                                notificationBody = null;
                                c6881d3 = c6881d;
                                i23 = i14;
                                ru.ozon.fintech.settings.domain.a aVar22 = c6881d3.f65155d;
                                if (notificationBody == null) {
                                }
                                if (cVar3 == null) {
                                }
                            }
                            ru.ozon.fintech.settings.domain.a aVar222 = c6881d3.f65155d;
                            if (notificationBody == null) {
                                cVar3 = new AbstractC7611a.c(d(bVar4), f(bVar4), notificationBody.getTitle(), notificationBody.getBody(), aVar222.getPushIcon(), k(bVar4, str16), h(bVar4), i23 != 0 ? i12 : 0, e(bVar4));
                            } else {
                                cVar3 = cVar2;
                            }
                            if (cVar3 == null) {
                                return cVar3;
                            }
                            String d11 = d(bVar4);
                            String f7 = f(bVar4);
                            String str20 = bVar4.a().get(CommentV3DTO.HEADER_FIELD_NAME);
                            if (str20 == null) {
                                str20 = str6;
                            }
                            return new AbstractC7611a.C1161a(d11, f7, str20, j(bVar4), aVar222.getPushIcon(), k(bVar4, str16), h(bVar4), e(bVar4));
                        }
                        int i26 = c6879b.f65142m;
                        int i27 = c6879b.f65141l;
                        long j17 = c6879b.f65144o;
                        long j18 = c6879b.f65143n;
                        int i28 = c6879b.f65140k;
                        str2 = null;
                        String str21 = c6879b.f65139j;
                        String str22 = c6879b.f65138i;
                        i12 = 1;
                        NotificationSecureBody notificationSecureBody3 = c6879b.f65137h;
                        String str23 = c6879b.f65136g;
                        String str24 = c6879b.f65135f;
                        bVar3 = c6879b.f65134e;
                        C6881d c6881d4 = c6879b.f65133d;
                        try {
                            s.b(obj);
                            i16 = i26;
                            str6 = "";
                            str14 = str21;
                            j13 = j17;
                            str7 = str24;
                            i14 = i28;
                            str11 = str22;
                            c6881d = c6881d4;
                            c6879b2 = c6879b;
                            notificationSecureBody2 = notificationSecureBody3;
                            str10 = str23;
                            currentTimeMillis = j18;
                            bVar2 = bVar3;
                            i15 = i27 + 1;
                            str12 = str14;
                            str18 = str6;
                            j11 = j13;
                            i12 = 1;
                        } catch (Throwable th5) {
                            th = th5;
                            notificationSecureBody = notificationSecureBody3;
                            str7 = str24;
                            str6 = "";
                            i14 = i28;
                            str8 = str22;
                            str9 = str23;
                            currentTimeMillis = j18;
                            bVar2 = bVar3;
                            c6881d = c6881d4;
                        }
                        if (i15 < i16) {
                            try {
                                try {
                                } catch (Exception e12) {
                                    e11 = e12;
                                    i24 = i16;
                                    j15 = currentTimeMillis;
                                    j16 = j11;
                                }
                                c6881d.f65158g = i15 + 1;
                                InterfaceC7310a interfaceC7310a = c6881d.f65154c;
                                c6879b2.f65133d = c6881d;
                                c6879b2.f65134e = bVar2;
                                c6879b2.f65135f = str7;
                                c6879b2.f65136g = str10;
                                c6879b2.f65137h = notificationSecureBody2;
                                c6879b2.f65138i = str11;
                                c6879b2.f65139j = str12;
                                try {
                                    c6879b2.f65140k = i14;
                                    c6879b2.f65143n = currentTimeMillis;
                                    j15 = currentTimeMillis;
                                    j16 = j11;
                                    try {
                                        try {
                                        } catch (Throwable th6) {
                                            th = th6;
                                            currentTimeMillis = j15;
                                            str6 = str18;
                                            str8 = str11;
                                            notificationSecureBody = notificationSecureBody2;
                                            str9 = str10;
                                            i12 = 1;
                                            long currentTimeMillis222 = System.currentTimeMillis() - currentTimeMillis;
                                            cVar2 = null;
                                            L80.a.c("NotificationServiceInteractorImpl", null, th);
                                            if (!(th instanceof HttpException)) {
                                            }
                                            InterfaceC6618a interfaceC6618a32 = c6881d.f65153b;
                                            if (notificationSecureBody == null) {
                                            }
                                            c6881d.f65155d.j();
                                            interfaceC6618a32.y(str8, (r25 & 2) != 0 ? null : null, (r25 & 8) != 0 ? null : th.getLocalizedMessage(), (r25 & 16) != 0, (r25 & 32) != 0 ? null : str9, r26, (r25 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : null, (r25 & 256) != 0 ? null : new Integer(r4), (r25 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : new Integer(c6881d.f65158g), (r25 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : new Long(currentTimeMillis222));
                                            bVar4 = bVar2;
                                            str16 = str7;
                                            notificationBody = null;
                                            c6881d3 = c6881d;
                                            i23 = i14;
                                            ru.ozon.fintech.settings.domain.a aVar2222 = c6881d3.f65155d;
                                            if (notificationBody == null) {
                                            }
                                            if (cVar3 == null) {
                                            }
                                        }
                                    } catch (Exception e13) {
                                        e11 = e13;
                                        i24 = i16;
                                    }
                                    c6879b2.f65144o = j16;
                                    c6879b2.f65141l = i15;
                                    c6879b2.f65142m = i16;
                                    i24 = i16;
                                    try {
                                    } catch (Exception e14) {
                                        try {
                                            try {
                                                try {
                                                    e11 = e14;
                                                    int i29 = i24;
                                                    i18 = i15;
                                                    j12 = j16;
                                                    currentTimeMillis = j15;
                                                    i17 = i29;
                                                    str6 = str18;
                                                    str13 = str10;
                                                    c6879b2.f65147r = 2;
                                                    if (Y.c(j12, c6879b2) != aVar) {
                                                        String str25 = str12;
                                                        i27 = i19;
                                                        str14 = str25;
                                                        j13 = j12;
                                                        i16 = i21;
                                                        str10 = str13;
                                                        bVar2 = bVar3;
                                                        i15 = i27 + 1;
                                                        str12 = str14;
                                                        str18 = str6;
                                                        j11 = j13;
                                                        i12 = 1;
                                                        if (i15 < i16) {
                                                        }
                                                    }
                                                    return aVar;
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    str9 = str13;
                                                    str8 = str11;
                                                    notificationSecureBody = notificationSecureBody2;
                                                    bVar2 = bVar3;
                                                    i12 = 1;
                                                    long currentTimeMillis2222 = System.currentTimeMillis() - currentTimeMillis;
                                                    cVar2 = null;
                                                    L80.a.c("NotificationServiceInteractorImpl", null, th);
                                                    if (!(th instanceof HttpException)) {
                                                    }
                                                    InterfaceC6618a interfaceC6618a322 = c6881d.f65153b;
                                                    if (notificationSecureBody == null) {
                                                    }
                                                    c6881d.f65155d.j();
                                                    interfaceC6618a322.y(str8, (r25 & 2) != 0 ? null : null, (r25 & 8) != 0 ? null : th.getLocalizedMessage(), (r25 & 16) != 0, (r25 & 32) != 0 ? null : str9, r26, (r25 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : null, (r25 & 256) != 0 ? null : new Integer(r4), (r25 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : new Integer(c6881d.f65158g), (r25 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : new Long(currentTimeMillis2222));
                                                    bVar4 = bVar2;
                                                    str16 = str7;
                                                    notificationBody = null;
                                                    c6881d3 = c6881d;
                                                    i23 = i14;
                                                    ru.ozon.fintech.settings.domain.a aVar22222 = c6881d3.f65155d;
                                                    if (notificationBody == null) {
                                                    }
                                                    if (cVar3 == null) {
                                                    }
                                                }
                                                c6879b2.f65133d = c6881d;
                                                c6879b2.f65134e = bVar2;
                                                c6879b2.f65135f = str7;
                                                c6879b2.f65136g = str13;
                                                c6879b2.f65137h = notificationSecureBody2;
                                                c6879b2.f65138i = str11;
                                                c6879b2.f65139j = str12;
                                                c6879b2.f65140k = i14;
                                                c6879b2.f65143n = currentTimeMillis;
                                                c6879b2.f65144o = j12;
                                                i19 = i18;
                                                c6879b2.f65141l = i19;
                                                i21 = i17;
                                                c6879b2.f65142m = i21;
                                                bVar3 = bVar2;
                                            } catch (Throwable th8) {
                                                th = th8;
                                                bVar3 = bVar2;
                                            }
                                            if (!(e11 instanceof IOException)) {
                                                try {
                                                    if (!(e11 instanceof HttpException)) {
                                                        throw e11;
                                                    }
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    str9 = str13;
                                                    str8 = str11;
                                                    notificationSecureBody = notificationSecureBody2;
                                                    i12 = 1;
                                                    long currentTimeMillis22222 = System.currentTimeMillis() - currentTimeMillis;
                                                    cVar2 = null;
                                                    L80.a.c("NotificationServiceInteractorImpl", null, th);
                                                    if (!(th instanceof HttpException)) {
                                                    }
                                                    InterfaceC6618a interfaceC6618a3222 = c6881d.f65153b;
                                                    if (notificationSecureBody == null) {
                                                    }
                                                    c6881d.f65155d.j();
                                                    interfaceC6618a3222.y(str8, (r25 & 2) != 0 ? null : null, (r25 & 8) != 0 ? null : th.getLocalizedMessage(), (r25 & 16) != 0, (r25 & 32) != 0 ? null : str9, r26, (r25 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : null, (r25 & 256) != 0 ? null : new Integer(r4), (r25 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : new Integer(c6881d.f65158g), (r25 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : new Long(currentTimeMillis22222));
                                                    bVar4 = bVar2;
                                                    str16 = str7;
                                                    notificationBody = null;
                                                    c6881d3 = c6881d;
                                                    i23 = i14;
                                                    ru.ozon.fintech.settings.domain.a aVar222222 = c6881d3.f65155d;
                                                    if (notificationBody == null) {
                                                    }
                                                    if (cVar3 == null) {
                                                    }
                                                }
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
                                        }
                                    }
                                    c6879b2.f65147r = i12;
                                    obj = interfaceC7310a.getPushBody(str12, c6879b2);
                                } catch (Throwable th11) {
                                    th = th11;
                                    str6 = str18;
                                    str8 = str11;
                                    notificationSecureBody = notificationSecureBody2;
                                    str9 = str10;
                                    i12 = 1;
                                    long currentTimeMillis222222 = System.currentTimeMillis() - currentTimeMillis;
                                    cVar2 = null;
                                    L80.a.c("NotificationServiceInteractorImpl", null, th);
                                    if (!(th instanceof HttpException)) {
                                    }
                                    InterfaceC6618a interfaceC6618a32222 = c6881d.f65153b;
                                    if (notificationSecureBody == null) {
                                    }
                                    c6881d.f65155d.j();
                                    interfaceC6618a32222.y(str8, (r25 & 2) != 0 ? null : null, (r25 & 8) != 0 ? null : th.getLocalizedMessage(), (r25 & 16) != 0, (r25 & 32) != 0 ? null : str9, r26, (r25 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : null, (r25 & 256) != 0 ? null : new Integer(r4), (r25 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : new Integer(c6881d.f65158g), (r25 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : new Long(currentTimeMillis222222));
                                    bVar4 = bVar2;
                                    str16 = str7;
                                    notificationBody = null;
                                    c6881d3 = c6881d;
                                    i23 = i14;
                                    ru.ozon.fintech.settings.domain.a aVar2222222 = c6881d3.f65155d;
                                    if (notificationBody == null) {
                                    }
                                    if (cVar3 == null) {
                                    }
                                }
                            } catch (Throwable th12) {
                                th = th12;
                                j15 = currentTimeMillis;
                            }
                            if (obj != aVar) {
                                currentTimeMillis = j15;
                                c6881d2 = c6881d;
                                i22 = i14;
                                str6 = str18;
                                i23 = i22;
                                str8 = str11;
                                notificationSecureBody = notificationSecureBody2;
                                str15 = str10;
                                i12 = 1;
                                bVar4 = bVar2;
                                str16 = str7;
                                j14 = currentTimeMillis;
                                c6881d3 = c6881d2;
                                long currentTimeMillis32 = System.currentTimeMillis() - j14;
                                notificationBody2 = (NotificationBody) c6881d3.f65156e.c(NotificationBody.class).fromJson(((GetPushBodyResponse) obj).getText());
                                if (notificationBody2 == null) {
                                }
                                cVar2 = null;
                                ru.ozon.fintech.settings.domain.a aVar22222222 = c6881d3.f65155d;
                                if (notificationBody == null) {
                                }
                                if (cVar3 == null) {
                                }
                            }
                        } else {
                            str6 = str18;
                            long j19 = currentTimeMillis;
                            try {
                                i12 = 1;
                                try {
                                    c6881d.f65158g++;
                                    InterfaceC7310a interfaceC7310a2 = c6881d.f65154c;
                                    c6879b2.f65133d = c6881d;
                                    c6879b2.f65134e = bVar2;
                                    c6879b2.f65135f = str7;
                                    c6879b2.f65136g = str10;
                                    c6879b2.f65137h = notificationSecureBody2;
                                    c6879b2.f65138i = str11;
                                    c6879b2.f65139j = str2;
                                    c6879b2.f65140k = i14;
                                    currentTimeMillis = j19;
                                    try {
                                        c6879b2.f65143n = currentTimeMillis;
                                        c6879b2.f65147r = 3;
                                        obj = interfaceC7310a2.getPushBody(str12, c6879b2);
                                    } catch (Throwable th13) {
                                        th = th13;
                                        str8 = str11;
                                        notificationSecureBody = notificationSecureBody2;
                                        str9 = str10;
                                        long currentTimeMillis2222222 = System.currentTimeMillis() - currentTimeMillis;
                                        cVar2 = null;
                                        L80.a.c("NotificationServiceInteractorImpl", null, th);
                                        if (!(th instanceof HttpException)) {
                                        }
                                        InterfaceC6618a interfaceC6618a322222 = c6881d.f65153b;
                                        if (notificationSecureBody == null) {
                                        }
                                        c6881d.f65155d.j();
                                        interfaceC6618a322222.y(str8, (r25 & 2) != 0 ? null : null, (r25 & 8) != 0 ? null : th.getLocalizedMessage(), (r25 & 16) != 0, (r25 & 32) != 0 ? null : str9, r26, (r25 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : null, (r25 & 256) != 0 ? null : new Integer(r4), (r25 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : new Integer(c6881d.f65158g), (r25 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : new Long(currentTimeMillis2222222));
                                        bVar4 = bVar2;
                                        str16 = str7;
                                        notificationBody = null;
                                        c6881d3 = c6881d;
                                        i23 = i14;
                                        ru.ozon.fintech.settings.domain.a aVar222222222 = c6881d3.f65155d;
                                        if (notificationBody == null) {
                                        }
                                        if (cVar3 == null) {
                                        }
                                    }
                                } catch (Throwable th14) {
                                    th = th14;
                                    currentTimeMillis = j19;
                                }
                            } catch (Throwable th15) {
                                th = th15;
                                currentTimeMillis = j19;
                                i12 = 1;
                            }
                            if (obj != aVar) {
                                str17 = str11;
                                notificationSecureBody = notificationSecureBody2;
                                bVar4 = bVar2;
                                str16 = str7;
                                c6881d3 = c6881d;
                                j14 = currentTimeMillis;
                                i23 = i14;
                                str15 = str10;
                                str8 = str17;
                                long currentTimeMillis322 = System.currentTimeMillis() - j14;
                                notificationBody2 = (NotificationBody) c6881d3.f65156e.c(NotificationBody.class).fromJson(((GetPushBodyResponse) obj).getText());
                                if (notificationBody2 == null) {
                                }
                                cVar2 = null;
                                ru.ozon.fintech.settings.domain.a aVar2222222222 = c6881d3.f65155d;
                                if (notificationBody == null) {
                                }
                                if (cVar3 == null) {
                                }
                            }
                        }
                        return aVar;
                    }
                    i12 = 1;
                    str2 = null;
                    int i31 = c6879b.f65142m;
                    int i32 = c6879b.f65141l;
                    long j21 = c6879b.f65144o;
                    currentTimeMillis = c6879b.f65143n;
                    i22 = c6879b.f65140k;
                    String str26 = c6879b.f65139j;
                    str11 = c6879b.f65138i;
                    notificationSecureBody2 = c6879b.f65137h;
                    str10 = c6879b.f65136g;
                    String str27 = c6879b.f65135f;
                    k90.b bVar5 = c6879b.f65134e;
                    c6881d2 = c6879b.f65133d;
                    try {
                        s.b(obj);
                        str7 = str27;
                        bVar2 = bVar5;
                    } catch (Exception e15) {
                        e11 = e15;
                        str7 = str27;
                        i17 = i31;
                        i18 = i32;
                        c6881d = c6881d2;
                        j12 = j21;
                        i14 = i22;
                        str12 = str26;
                        c6879b2 = c6879b;
                        str6 = "";
                        str13 = str10;
                        bVar2 = bVar5;
                        if (!(e11 instanceof IOException)) {
                        }
                        c6879b2.f65133d = c6881d;
                        c6879b2.f65134e = bVar2;
                        c6879b2.f65135f = str7;
                        c6879b2.f65136g = str13;
                        c6879b2.f65137h = notificationSecureBody2;
                        c6879b2.f65138i = str11;
                        c6879b2.f65139j = str12;
                        c6879b2.f65140k = i14;
                        c6879b2.f65143n = currentTimeMillis;
                        c6879b2.f65144o = j12;
                        i19 = i18;
                        c6879b2.f65141l = i19;
                        i21 = i17;
                        c6879b2.f65142m = i21;
                        bVar3 = bVar2;
                        c6879b2.f65147r = 2;
                        if (Y.c(j12, c6879b2) != aVar) {
                        }
                        return aVar;
                    } catch (Throwable th16) {
                        th = th16;
                        str7 = str27;
                        bVar2 = bVar5;
                        c6881d = c6881d2;
                        str6 = "";
                        i14 = i22;
                        str8 = str11;
                        notificationSecureBody = notificationSecureBody2;
                        str9 = str10;
                        long currentTimeMillis22222222 = System.currentTimeMillis() - currentTimeMillis;
                        cVar2 = null;
                        L80.a.c("NotificationServiceInteractorImpl", null, th);
                        if (!(th instanceof HttpException)) {
                        }
                        InterfaceC6618a interfaceC6618a3222222 = c6881d.f65153b;
                        if (notificationSecureBody == null) {
                        }
                        c6881d.f65155d.j();
                        interfaceC6618a3222222.y(str8, (r25 & 2) != 0 ? null : null, (r25 & 8) != 0 ? null : th.getLocalizedMessage(), (r25 & 16) != 0, (r25 & 32) != 0 ? null : str9, r26, (r25 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : null, (r25 & 256) != 0 ? null : new Integer(r4), (r25 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : new Integer(c6881d.f65158g), (r25 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : new Long(currentTimeMillis22222222));
                        bVar4 = bVar2;
                        str16 = str7;
                        notificationBody = null;
                        c6881d3 = c6881d;
                        i23 = i14;
                        ru.ozon.fintech.settings.domain.a aVar22222222222 = c6881d3.f65155d;
                        if (notificationBody == null) {
                        }
                        if (cVar3 == null) {
                        }
                    }
                    str6 = str18;
                    i23 = i22;
                    str8 = str11;
                    notificationSecureBody = notificationSecureBody2;
                    str15 = str10;
                    i12 = 1;
                    bVar4 = bVar2;
                    str16 = str7;
                    j14 = currentTimeMillis;
                    c6881d3 = c6881d2;
                    long currentTimeMillis3222 = System.currentTimeMillis() - j14;
                    notificationBody2 = (NotificationBody) c6881d3.f65156e.c(NotificationBody.class).fromJson(((GetPushBodyResponse) obj).getText());
                    if (notificationBody2 == null) {
                    }
                    cVar2 = null;
                    ru.ozon.fintech.settings.domain.a aVar222222222222 = c6881d3.f65155d;
                    if (notificationBody == null) {
                    }
                    if (cVar3 == null) {
                    }
                }
                long currentTimeMillis222222222 = System.currentTimeMillis() - currentTimeMillis;
                cVar2 = null;
                L80.a.c("NotificationServiceInteractorImpl", null, th);
                int code = !(th instanceof HttpException) ? th.code() : th instanceof com.squareup.moshi.k ? 4865 : th.getClass().getName().hashCode();
                InterfaceC6618a interfaceC6618a32222222 = c6881d.f65153b;
                String id4 = notificationSecureBody == null ? notificationSecureBody.getId() : null;
                c6881d.f65155d.j();
                interfaceC6618a32222222.y(str8, (r25 & 2) != 0 ? null : null, (r25 & 8) != 0 ? null : th.getLocalizedMessage(), (r25 & 16) != 0, (r25 & 32) != 0 ? null : str9, id4, (r25 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : null, (r25 & 256) != 0 ? null : new Integer(code), (r25 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : new Integer(c6881d.f65158g), (r25 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : new Long(currentTimeMillis222222222));
                bVar4 = bVar2;
                str16 = str7;
                notificationBody = null;
                c6881d3 = c6881d;
                i23 = i14;
                ru.ozon.fintech.settings.domain.a aVar2222222222222 = c6881d3.f65155d;
                if (notificationBody == null) {
                }
                if (cVar3 == null) {
                }
            }
        }
        c6879b = new C6879b(this, cVar);
        Object obj2 = c6879b.f65145p;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c6879b.f65147r;
        String str182 = "";
        if (i11 != 0) {
        }
        long currentTimeMillis2222222222 = System.currentTimeMillis() - currentTimeMillis;
        cVar2 = null;
        L80.a.c("NotificationServiceInteractorImpl", null, th);
        if (!(th instanceof HttpException)) {
        }
        InterfaceC6618a interfaceC6618a322222222 = c6881d.f65153b;
        if (notificationSecureBody == null) {
        }
        c6881d.f65155d.j();
        interfaceC6618a322222222.y(str8, (r25 & 2) != 0 ? null : null, (r25 & 8) != 0 ? null : th.getLocalizedMessage(), (r25 & 16) != 0, (r25 & 32) != 0 ? null : str9, id4, (r25 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : null, (r25 & 256) != 0 ? null : new Integer(code), (r25 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : new Integer(c6881d.f65158g), (r25 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : new Long(currentTimeMillis2222222222));
        bVar4 = bVar2;
        str16 = str7;
        notificationBody = null;
        c6881d3 = c6881d;
        i23 = i14;
        ru.ozon.fintech.settings.domain.a aVar22222222222222 = c6881d3.f65155d;
        if (notificationBody == null) {
        }
        if (cVar3 == null) {
        }
    }

    private static String j(k90.b bVar) {
        String str = bVar.a().get(SelectionItemFormDTO.TITLE_FIELD_NAME);
        return str == null ? "" : str;
    }

    private static String k(k90.b bVar, String str) {
        String str2 = bVar.a().get("l");
        String X9 = str2 != null ? kotlin.text.h.X(str2, "ozon://", str, false) : null;
        return X9 == null ? "" : X9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // h90.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull k90.b bVar, @NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C6880c c6880c;
        int i11;
        AbstractC7611a abstractC7611a;
        boolean z11;
        int i12;
        int i13;
        NotificationSecureBody notificationSecureBody;
        NotificationOtpBody notificationOtpBody;
        String id2;
        String parentId;
        String id3;
        if (cVar instanceof C6880c) {
            c6880c = (C6880c) cVar;
            int i14 = c6880c.f65151g;
            if ((i14 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c6880c.f65151g = i14 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c6880c.f65149e;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c6880c.f65151g;
                if (i11 != 0) {
                    s.b(obj);
                    Moshi moshi = this.f65156e;
                    String str2 = bVar.a().get("extra");
                    abstractC7611a = null;
                    if (str2 != null) {
                        L80.a.a("NotificationServiceInteractorImpl", "checkIfExistPushIdInContentProvider ".concat(str2));
                        try {
                            notificationSecureBody = (NotificationSecureBody) moshi.c(NotificationSecureBody.class).fromJson(str2);
                        } catch (Throwable unused) {
                            notificationSecureBody = null;
                        }
                        if (notificationSecureBody == null) {
                            try {
                                notificationOtpBody = (NotificationOtpBody) moshi.c(NotificationOtpBody.class).fromJson(str2);
                            } catch (Throwable unused2) {
                            }
                            parentId = (notificationSecureBody != null || (id3 = notificationSecureBody.getId()) == null || id3.length() == 0) ? (notificationOtpBody != null || (id2 = notificationOtpBody.getId()) == null || id2.length() == 0) ? null : notificationOtpBody.getParentId() : notificationSecureBody.getParentId();
                            Ns.b.c("checkIfExistPushIdInContentProvider parentId ", parentId, "NotificationServiceInteractorImpl");
                            if (parentId != null && Intrinsics.d(this.f65157f.getStringValue("PUSH_ID_KEY"), parentId)) {
                                z11 = 1;
                                L80.a.a("NotificationServiceInteractorImpl", "checkIfExistPushIdInContentProvider result: " + z11);
                                i12 = z11 ^ 1;
                                if (z11 == 0) {
                                    c6880c.f65148d = i12;
                                    c6880c.f65151g = 1;
                                    obj = g(bVar, str, c6880c);
                                    if (obj == obj2) {
                                        return obj2;
                                    }
                                    i13 = i12;
                                }
                                return new k.a(abstractC7611a, i12 != 0);
                            }
                        }
                        notificationOtpBody = null;
                        if (notificationSecureBody != null) {
                        }
                        Ns.b.c("checkIfExistPushIdInContentProvider parentId ", parentId, "NotificationServiceInteractorImpl");
                        if (parentId != null) {
                            z11 = 1;
                            L80.a.a("NotificationServiceInteractorImpl", "checkIfExistPushIdInContentProvider result: " + z11);
                            i12 = z11 ^ 1;
                            if (z11 == 0) {
                            }
                            return new k.a(abstractC7611a, i12 != 0);
                        }
                    }
                    z11 = 0;
                    L80.a.a("NotificationServiceInteractorImpl", "checkIfExistPushIdInContentProvider result: " + z11);
                    i12 = z11 ^ 1;
                    if (z11 == 0) {
                    }
                    return new k.a(abstractC7611a, i12 != 0);
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = c6880c.f65148d;
                s.b(obj);
                abstractC7611a = (AbstractC7611a) obj;
                i12 = i13;
                return new k.a(abstractC7611a, i12 != 0);
            }
        }
        c6880c = new C6880c(this, cVar);
        Object obj3 = c6880c.f65149e;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c6880c.f65151g;
        if (i11 != 0) {
        }
        abstractC7611a = (AbstractC7611a) obj3;
        i12 = i13;
        return new k.a(abstractC7611a, i12 != 0);
    }
}
