package defpackage;

import com.sofascore.results.R;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k5d extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k5d(Object obj, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        Object obj = this.u;
        Object obj2 = this.t;
        Object obj3 = this.s;
        switch (i) {
            case 0:
                return new k5d((ku3) obj3, (qvd) obj2, (s5d) obj, rq3Var, 0);
            default:
                return new k5d((pae) obj3, (String) obj2, (Function1) obj, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((k5d) create(rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x007a, code lost:
    
        if ((r9 instanceof defpackage.u2g) != false) goto L15;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object u2gVar;
        Object u2gVar2;
        Object u2gVar3;
        int i = this.r;
        Object obj2 = this.u;
        Object obj3 = this.t;
        switch (i) {
            case 0:
                qvd qvdVar = (qvd) obj3;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                yea yeaVar = j58.a;
                e58 f = e58.f();
                f.getClass();
                String g = f.g("nats_ip_addresses");
                if (g.length() != 0) {
                    try {
                        p2g p2gVar = w2g.b;
                        yeaVar.getClass();
                        u2gVar = yeaVar.b(l98.W(new xg0(uhi.a, 0)), g);
                    } catch (Throwable th) {
                        p2g p2gVar2 = w2g.b;
                        u2gVar = new u2g(th);
                    }
                    Throwable a = w2g.a(u2gVar);
                    if (a != null) {
                        s38.a().c(a);
                    }
                    break;
                }
                u2gVar = null;
                Iterable iterable = (List) u2gVar;
                if (iterable == null) {
                    iterable = km5.a;
                }
                s5d s5dVar = (s5d) obj2;
                try {
                    p2g p2gVar3 = w2g.b;
                    u2gVar2 = s5dVar.a.getResources().getStringArray(R.array.ws_addresses);
                } catch (Throwable th2) {
                    p2g p2gVar4 = w2g.b;
                    u2gVar2 = new u2g(th2);
                }
                String[] strArr = new String[0];
                if (u2gVar2 instanceof u2g) {
                    u2gVar2 = strArr;
                }
                String[] strArr2 = (String[]) u2gVar2;
                String str = uaa.c;
                StringBuilder sb = new StringBuilder("https://");
                sb.append(str);
                try {
                    u2gVar3 = InetAddress.getAllByName(StringsKt.J(sb.toString(), "api.sofascore1.com/", false) ? c.r("ws.sofascore.com", "sofascore.com", "sofascore1.com", false) : "ws.sofascore.com");
                } catch (Throwable th3) {
                    p2g p2gVar5 = w2g.b;
                    u2gVar3 = new u2g(th3);
                }
                InetAddress[] inetAddressArr = new InetAddress[0];
                if (u2gVar3 instanceof u2g) {
                    u2gVar3 = inetAddressArr;
                }
                u2gVar3.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : (Object[]) u2gVar3) {
                    InetAddress inetAddress = (InetAddress) obj4;
                    String hostAddress = inetAddress instanceof Inet4Address ? ((Inet4Address) inetAddress).getHostAddress() : null;
                    if (hostAddress != null) {
                        arrayList.add(hostAddress);
                    }
                }
                List d = a.d(CollectionsKt.S0(CollectionsKt.V0(CollectionsKt.z0(CollectionsKt.w0(iterable, arrayList), strArr2))));
                ArrayList arrayList2 = new ArrayList();
                Iterator it = ((ArrayList) d).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    String str2 = (String) next;
                    str2.getClass();
                    if (!StringsKt.R(str2)) {
                        arrayList2.add(next);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    qvdVar.b("nats://none:none@" + ((String) it2.next()) + ":4222");
                }
                qvdVar.e = arrayList2.size();
                Duration ofSeconds = Duration.ofSeconds(5L);
                if (ofSeconds == null) {
                    ofSeconds = vvd.B;
                }
                qvdVar.i = ofSeconds;
                vvd a2 = qvdVar.a();
                String str3 = l4d.a;
                p4d p4dVar = new p4d(a2);
                AtomicBoolean atomicBoolean = p4dVar.H;
                if (atomicBoolean.compareAndSet(false, true)) {
                    try {
                        p4dVar.k();
                    } finally {
                        atomicBoolean.set(false);
                    }
                }
                return p4dVar;
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                nlg V0 = ((pae) this.s).b.V0((String) obj3);
                try {
                    Object invoke = ((Function1) obj2).invoke(V0);
                    o1j.t(V0, null);
                    return invoke;
                } finally {
                }
        }
    }
}
