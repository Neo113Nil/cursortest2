package ya;

import b4.k;
import b4.l;
import gh.m0;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.v;
import kotlin.jvm.internal.Intrinsics;
import r3.e0;
import v3.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends ci.c {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r9 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q0(String str, String str2, String str3, mf.c cVar) {
        a aVar;
        int i5;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i10 = aVar.f25773d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f25773d = i10 - Integer.MIN_VALUE;
                Object obj = aVar.f25771b;
                Object obj2 = lf.a.f20034a;
                i5 = aVar.f25773d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    aVar.f25770a = str;
                    aVar.f25773d = 1;
                    obj = d(str2, str3, aVar);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return new Integer(((h) obj).getStatusCode());
                    }
                    str = aVar.f25770a;
                    h8.b.B(obj);
                }
                aVar.f25770a = null;
                aVar.f25773d = 2;
                obj = ((e0) obj).b(str, aVar);
            }
        }
        aVar = new a(this, cVar);
        Object obj3 = aVar.f25771b;
        Object obj22 = lf.a.f20034a;
        i5 = aVar.f25773d;
        if (i5 != 0) {
        }
        aVar.f25770a = null;
        aVar.f25773d = 2;
        obj3 = ((e0) obj3).b(str, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0051, code lost:
    
        if (r9 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0053, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0043, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable r0(String str, String str2, String str3, mf.c cVar) {
        b bVar;
        int i5;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i10 = bVar.f25777d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f25777d = i10 - Integer.MIN_VALUE;
                Object obj = bVar.f25775b;
                lf.a aVar = lf.a.f20034a;
                i5 = bVar.f25777d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    bVar.f25774a = str;
                    bVar.f25777d = 1;
                    obj = d(str2, str3, bVar);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        b4.e eVar = (b4.e) obj;
                        if (eVar.getStatusCode() != 200) {
                            return kotlin.collections.e0.f19204a;
                        }
                        List<b4.d> frequentQuestions = eVar.getFrequentQuestions();
                        if (frequentQuestions == null || frequentQuestions.isEmpty()) {
                            return kotlin.collections.e0.f19204a;
                        }
                        ArrayList arrayList = new ArrayList(v.k(frequentQuestions, 10));
                        for (b4.d dVar : frequentQuestions) {
                            arrayList.add(new lc.b(dVar.getId(), dVar.getQuestion(), dVar.getAnswer()));
                        }
                        return arrayList.isEmpty() ? kotlin.collections.e0.f19204a : arrayList;
                    }
                    str = bVar.f25774a;
                    h8.b.B(obj);
                }
                bVar.f25774a = null;
                bVar.f25777d = 2;
                obj = ((e0) obj).j(str, bVar);
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f25775b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = bVar.f25777d;
        if (i5 != 0) {
        }
        bVar.f25774a = null;
        bVar.f25777d = 2;
        obj2 = ((e0) obj2).j(str, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e A[Catch: Exception -> 0x00a3, TryCatch #3 {Exception -> 0x00a3, blocks: (B:22:0x0098, B:24:0x009e, B:25:0x00a5, B:27:0x00ad, B:28:0x00b6, B:30:0x00bc, B:33:0x00cf, B:38:0x00d3, B:39:0x00e0, B:41:0x00e6), top: B:21:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad A[Catch: Exception -> 0x00a3, TryCatch #3 {Exception -> 0x00a3, blocks: (B:22:0x0098, B:24:0x009e, B:25:0x00a5, B:27:0x00ad, B:28:0x00b6, B:30:0x00bc, B:33:0x00cf, B:38:0x00d3, B:39:0x00e0, B:41:0x00e6), top: B:21:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff A[Catch: Exception -> 0x012e, TryCatch #0 {Exception -> 0x012e, blocks: (B:43:0x00f9, B:45:0x00ff, B:46:0x0108, B:48:0x010e, B:51:0x0121, B:53:0x0127, B:57:0x0131, B:64:0x0135, B:65:0x0142, B:67:0x0148), top: B:42:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0161 A[Catch: Exception -> 0x01ed, TryCatch #1 {Exception -> 0x01ed, blocks: (B:69:0x015b, B:71:0x0161, B:72:0x016e, B:74:0x0174, B:76:0x019d, B:80:0x01c2, B:81:0x01a8, B:83:0x01ae, B:85:0x01b4, B:88:0x01bd, B:94:0x01e6), top: B:68:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e6 A[Catch: Exception -> 0x01ed, TRY_LEAVE, TryCatch #1 {Exception -> 0x01ed, blocks: (B:69:0x015b, B:71:0x0161, B:72:0x016e, B:74:0x0174, B:76:0x019d, B:80:0x01c2, B:81:0x01a8, B:83:0x01ae, B:85:0x01b4, B:88:0x01bd, B:94:0x01e6), top: B:68:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s0(Integer num, String str, String str2, String str3, mf.c cVar) {
        c cVar2;
        Object obj;
        lf.a aVar;
        int i5;
        String str4;
        Integer num2;
        Object d10;
        e eVar;
        e eVar2;
        boolean z5;
        int i10;
        String str5;
        ArrayList arrayList;
        ArrayList arrayList2;
        List messages;
        List messages2;
        List<k> messages3;
        String message;
        v3.a msg4xx;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i11 = cVar2.f25783f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar2.f25783f = i11 - Integer.MIN_VALUE;
                obj = cVar2.f25781d;
                aVar = lf.a.f20034a;
                i5 = cVar2.f25783f;
                kotlin.collections.e0 e0Var = null;
                if (i5 != 0) {
                    h8.b.B(obj);
                    str4 = str;
                    cVar2.f25778a = str4;
                    num2 = num;
                    cVar2.f25779b = num2;
                    cVar2.f25780c = this;
                    cVar2.f25783f = 1;
                    d10 = d(str2, str3, cVar2);
                    if (d10 != aVar) {
                        eVar = this;
                    }
                    return aVar;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar2 = cVar2.f25780c;
                    h8.b.B(obj);
                    l lVar = (l) obj;
                    eVar2.getClass();
                    try {
                        i10 = lVar.getStatusCode();
                    } catch (Exception unused) {
                        i10 = -1;
                    }
                    try {
                        v3.b httpException = lVar.getHttpException();
                        str5 = (httpException != null || (msg4xx = httpException.getMsg4xx()) == null) ? null : msg4xx.toJsonString();
                        try {
                            Boolean activeChat = lVar.getActiveChat();
                            z5 = activeChat != null ? activeChat.booleanValue() : false;
                            messages = lVar.getMessages();
                            if (messages == null) {
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj2 : messages) {
                                    if (Intrinsics.areEqual(((k) obj2).isPurchaseAttached(), Boolean.TRUE)) {
                                        arrayList3.add(obj2);
                                    }
                                }
                                arrayList = new ArrayList(v.k(arrayList3, 10));
                                Iterator it = arrayList3.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(Integer.valueOf(((k) it.next()).getMessageId()));
                                }
                            } else {
                                arrayList = null;
                            }
                            try {
                                messages2 = lVar.getMessages();
                                if (messages2 == null) {
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj3 : messages2) {
                                        k kVar = (k) obj3;
                                        if (!Intrinsics.areEqual(kVar.isPurchaseAttached(), Boolean.TRUE)) {
                                            if (kVar.getMime() == null && kVar.getContent() == null) {
                                            }
                                            arrayList4.add(obj3);
                                        }
                                    }
                                    arrayList2 = new ArrayList(v.k(arrayList4, 10));
                                    Iterator it2 = arrayList4.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(Integer.valueOf(((k) it2.next()).getMessageId()));
                                    }
                                } else {
                                    arrayList2 = null;
                                }
                                try {
                                    messages3 = lVar.getMessages();
                                    if (messages3 == null) {
                                        ArrayList arrayList5 = new ArrayList(v.k(messages3, 10));
                                        for (k kVar2 : messages3) {
                                            int epochSecond = (int) ZonedDateTime.parse(kVar2.getCreateAt(), DateTimeFormatter.ISO_DATE_TIME).withZoneSameInstant(ZoneId.systemDefault()).toEpochSecond();
                                            if (Intrinsics.areEqual(kVar2.isPurchaseAttached(), Boolean.TRUE)) {
                                                message = kVar2.getMessage();
                                                if (message == null) {
                                                    message = "Purchase information successfully provided for technical support";
                                                }
                                            } else if (kVar2.getMime() == null && kVar2.getContent() == null) {
                                                message = kVar2.getMessage();
                                                if (message == null) {
                                                    message = "Empty message";
                                                }
                                            } else {
                                                message = kVar2.getMessage();
                                            }
                                            arrayList5.add(new ka.a(kVar2.getMessageId(), epochSecond, epochSecond, 2, epochSecond, epochSecond, kVar2.getOperator(), message, 0, kVar2.getMime(), kVar2.getContent()));
                                        }
                                        e0Var = arrayList5;
                                    } else {
                                        e0Var = kotlin.collections.e0.f19204a;
                                    }
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                                arrayList2 = null;
                            }
                        } catch (Exception unused4) {
                            arrayList = null;
                            arrayList2 = arrayList;
                            Boolean valueOf = Boolean.valueOf(z5);
                            ka.b bVar = new ka.b();
                            bVar.f18956a = i10;
                            bVar.f18957b = e0Var;
                            bVar.f18958c = valueOf;
                            bVar.f18959d = arrayList;
                            bVar.f18960e = arrayList2;
                            bVar.f18961f = str5;
                            return bVar;
                        }
                    } catch (Exception unused5) {
                        str5 = null;
                        arrayList = null;
                        arrayList2 = arrayList;
                        Boolean valueOf2 = Boolean.valueOf(z5);
                        ka.b bVar2 = new ka.b();
                        bVar2.f18956a = i10;
                        bVar2.f18957b = e0Var;
                        bVar2.f18958c = valueOf2;
                        bVar2.f18959d = arrayList;
                        bVar2.f18960e = arrayList2;
                        bVar2.f18961f = str5;
                        return bVar2;
                    }
                    Boolean valueOf22 = Boolean.valueOf(z5);
                    ka.b bVar22 = new ka.b();
                    bVar22.f18956a = i10;
                    bVar22.f18957b = e0Var;
                    bVar22.f18958c = valueOf22;
                    bVar22.f18959d = arrayList;
                    bVar22.f18960e = arrayList2;
                    bVar22.f18961f = str5;
                    return bVar22;
                }
                e eVar3 = cVar2.f25780c;
                Integer num3 = cVar2.f25779b;
                String str6 = cVar2.f25778a;
                h8.b.B(obj);
                d10 = obj;
                str4 = str6;
                eVar = eVar3;
                num2 = num3;
                cVar2.f25778a = null;
                cVar2.f25779b = null;
                cVar2.f25780c = eVar;
                cVar2.f25783f = 2;
                obj = ((e0) d10).u(num2, str4, cVar2);
                if (obj != aVar) {
                    eVar2 = eVar;
                    l lVar2 = (l) obj;
                    eVar2.getClass();
                    i10 = lVar2.getStatusCode();
                    v3.b httpException2 = lVar2.getHttpException();
                    if (httpException2 != null) {
                    }
                    Boolean activeChat2 = lVar2.getActiveChat();
                    if (activeChat2 != null) {
                    }
                    messages = lVar2.getMessages();
                    if (messages == null) {
                    }
                    messages2 = lVar2.getMessages();
                    if (messages2 == null) {
                    }
                    messages3 = lVar2.getMessages();
                    if (messages3 == null) {
                    }
                    Boolean valueOf222 = Boolean.valueOf(z5);
                    ka.b bVar222 = new ka.b();
                    bVar222.f18956a = i10;
                    bVar222.f18957b = e0Var;
                    bVar222.f18958c = valueOf222;
                    bVar222.f18959d = arrayList;
                    bVar222.f18960e = arrayList2;
                    bVar222.f18961f = str5;
                    return bVar222;
                }
                return aVar;
            }
        }
        cVar2 = new c(this, cVar);
        obj = cVar2.f25781d;
        aVar = lf.a.f20034a;
        i5 = cVar2.f25783f;
        kotlin.collections.e0 e0Var2 = null;
        if (i5 != 0) {
        }
        cVar2.f25778a = null;
        cVar2.f25779b = null;
        cVar2.f25780c = eVar;
        cVar2.f25783f = 2;
        obj = ((e0) d10).u(num2, str4, cVar2);
        if (obj != aVar) {
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc A[Catch: Exception -> 0x0106, TRY_LEAVE, TryCatch #0 {Exception -> 0x0106, blocks: (B:22:0x00c6, B:24:0x00cc), top: B:21:0x00c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t0(String str, String str2, String str3, m0 m0Var, Boolean bool, int i5, String str4, String str5, mf.c cVar) {
        d dVar;
        Object obj;
        lf.a aVar;
        int i10;
        String str6;
        m0 m0Var2;
        Boolean bool2;
        String str7;
        int i11;
        String str8;
        e eVar;
        e eVar2;
        int i12;
        String str9;
        k message;
        v3.a msg4xx;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i13 = dVar.j;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.j = i13 - Integer.MIN_VALUE;
                obj = dVar.f25791h;
                aVar = lf.a.f20034a;
                i10 = dVar.j;
                ka.a aVar2 = null;
                if (i10 != 0) {
                    h8.b.B(obj);
                    dVar.f25784a = str;
                    dVar.f25785b = str2;
                    str6 = str3;
                    dVar.f25786c = str6;
                    m0Var2 = m0Var;
                    dVar.f25787d = m0Var2;
                    bool2 = bool;
                    dVar.f25788e = bool2;
                    dVar.f25789f = this;
                    dVar.f25790g = i5;
                    dVar.j = 1;
                    Object d10 = d(str4, str5, dVar);
                    if (d10 != aVar) {
                        str7 = str2;
                        i11 = i5;
                        str8 = str;
                        obj = d10;
                        eVar = this;
                    }
                    return aVar;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar2 = dVar.f25789f;
                    h8.b.B(obj);
                    b4.h hVar = (b4.h) obj;
                    eVar2.getClass();
                    try {
                        i12 = hVar.getStatusCode();
                    } catch (Exception unused) {
                        i12 = -1;
                    }
                    try {
                        v3.b httpException = hVar.getHttpException();
                        str9 = (httpException != null || (msg4xx = httpException.getMsg4xx()) == null) ? null : msg4xx.toJsonString();
                        try {
                            message = hVar.getMessage();
                            if (message != null) {
                                int epochSecond = (int) ZonedDateTime.parse(message.getCreateAt(), DateTimeFormatter.ISO_DATE_TIME).withZoneSameInstant(ZoneId.systemDefault()).toEpochSecond();
                                aVar2 = new ka.a(message.getMessageId(), epochSecond, epochSecond, 2, epochSecond, epochSecond, message.getOperator(), message.getMessage(), 0, message.getMime(), message.getContent());
                            }
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                        str9 = null;
                        ka.c cVar2 = new ka.c();
                        cVar2.f18962a = i12;
                        cVar2.f18963b = aVar2;
                        cVar2.f18964c = str9;
                        return cVar2;
                    }
                    ka.c cVar22 = new ka.c();
                    cVar22.f18962a = i12;
                    cVar22.f18963b = aVar2;
                    cVar22.f18964c = str9;
                    return cVar22;
                }
                i11 = dVar.f25790g;
                eVar = dVar.f25789f;
                Boolean bool3 = dVar.f25788e;
                m0Var2 = dVar.f25787d;
                String str10 = dVar.f25786c;
                str7 = dVar.f25785b;
                str8 = dVar.f25784a;
                h8.b.B(obj);
                bool2 = bool3;
                str6 = str10;
                dVar.f25784a = null;
                dVar.f25785b = null;
                dVar.f25786c = null;
                dVar.f25787d = null;
                dVar.f25788e = null;
                dVar.f25789f = eVar;
                dVar.f25790g = i11;
                dVar.j = 2;
                obj = ((e0) obj).t(str8, str7, str6, m0Var2, bool2, dVar);
                if (obj != aVar) {
                    eVar2 = eVar;
                    b4.h hVar2 = (b4.h) obj;
                    eVar2.getClass();
                    i12 = hVar2.getStatusCode();
                    v3.b httpException2 = hVar2.getHttpException();
                    if (httpException2 != null) {
                    }
                    message = hVar2.getMessage();
                    if (message != null) {
                    }
                    ka.c cVar222 = new ka.c();
                    cVar222.f18962a = i12;
                    cVar222.f18963b = aVar2;
                    cVar222.f18964c = str9;
                    return cVar222;
                }
                return aVar;
            }
        }
        dVar = new d(this, cVar);
        obj = dVar.f25791h;
        aVar = lf.a.f20034a;
        i10 = dVar.j;
        ka.a aVar22 = null;
        if (i10 != 0) {
        }
        dVar.f25784a = null;
        dVar.f25785b = null;
        dVar.f25786c = null;
        dVar.f25787d = null;
        dVar.f25788e = null;
        dVar.f25789f = eVar;
        dVar.f25790g = i11;
        dVar.j = 2;
        obj = ((e0) obj).t(str8, str7, str6, m0Var2, bool2, dVar);
        if (obj != aVar) {
        }
        return aVar;
    }
}
