package la;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19591b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f19592c;

    /* renamed from: d, reason: collision with root package name */
    public int f19593d;

    /* renamed from: e, reason: collision with root package name */
    public int f19594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f19595f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(w wVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19591b = i5;
        this.f19595f = wVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19591b) {
            case 0:
                return new u(this.f19595f, continuation, 0);
            default:
                return new u(this.f19595f, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19591b) {
        }
        return ((u) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e9  */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b10;
        ArrayList arrayList;
        Object J0;
        int intValue;
        Object b11;
        ArrayList arrayList2;
        Object y02;
        int intValue2;
        int i5 = this.f19591b;
        w wVar = this.f19595f;
        lf.a aVar = lf.a.f20034a;
        switch (i5) {
            case 0:
                int i10 = this.f19594e;
                if (i10 == 0) {
                    h8.b.B(obj);
                    this.f19594e = 1;
                    b10 = wVar.b(this);
                    if (b10 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            intValue = this.f19593d;
                            h8.b.B(obj);
                            return new Integer(intValue);
                        }
                        ArrayList arrayList3 = this.f19592c;
                        h8.b.B(obj);
                        arrayList = arrayList3;
                        J0 = obj;
                        intValue = ((Number) J0).intValue();
                        if (intValue != 401) {
                            this.f19592c = null;
                            this.f19593d = intValue;
                            this.f19594e = 3;
                            if (wVar.c(this) == aVar) {
                                return aVar;
                            }
                        } else if (200 <= intValue && intValue < 300) {
                            new Integer(fb.b.M0(arrayList));
                        }
                        return new Integer(intValue);
                    }
                    h8.b.B(obj);
                    b10 = obj;
                }
                String str = (String) b10;
                if (str == null) {
                    return new Integer(401);
                }
                List O0 = fb.b.O0();
                if (O0.isEmpty()) {
                    return new Integer(204);
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : O0) {
                    if (Intrinsics.areEqual(((hb.a) obj2).f10468b, "LiveViewed")) {
                        arrayList4.add(obj2);
                    }
                }
                if (arrayList4.isEmpty()) {
                    return new Integer(204);
                }
                arrayList = new ArrayList();
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    String str2 = ((hb.a) it.next()).f10469c;
                    Integer intOrNull = str2 != null ? StringsKt.toIntOrNull(str2) : null;
                    if (intOrNull != null) {
                        arrayList.add(intOrNull);
                    }
                }
                if (arrayList.isEmpty()) {
                    return new Integer(204);
                }
                na.b bVar = new na.b();
                String str3 = gc.d.f9945a;
                String c2 = d2.i.c();
                String d10 = d2.i.d();
                this.f19592c = arrayList;
                this.f19594e = 2;
                J0 = bVar.J0(arrayList, c2, d10, str, this);
                if (J0 == aVar) {
                    return aVar;
                }
                intValue = ((Number) J0).intValue();
                if (intValue != 401) {
                }
                return new Integer(intValue);
            default:
                int i11 = this.f19594e;
                if (i11 == 0) {
                    h8.b.B(obj);
                    this.f19594e = 1;
                    b11 = wVar.b(this);
                    if (b11 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            intValue2 = this.f19593d;
                            h8.b.B(obj);
                            return new Integer(intValue2);
                        }
                        ArrayList arrayList5 = this.f19592c;
                        h8.b.B(obj);
                        arrayList2 = arrayList5;
                        y02 = obj;
                        intValue2 = ((Number) y02).intValue();
                        if (intValue2 != 401) {
                            this.f19592c = null;
                            this.f19593d = intValue2;
                            this.f19594e = 3;
                            if (wVar.c(this) == aVar) {
                                return aVar;
                            }
                        } else if (200 <= intValue2 && intValue2 < 300) {
                            ArrayList arrayList6 = new ArrayList(kotlin.collections.v.k(arrayList2, 10));
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                arrayList6.add(new Integer(((hb.a) it2.next()).f10467a));
                            }
                            new Integer(fb.b.M0(arrayList6));
                        }
                        return new Integer(intValue2);
                    }
                    h8.b.B(obj);
                    b11 = obj;
                }
                String str4 = (String) b11;
                if (str4 == null) {
                    return new Integer(401);
                }
                List O02 = fb.b.O0();
                if (O02.isEmpty()) {
                    return new Integer(204);
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj3 : O02) {
                    if (!Intrinsics.areEqual(((hb.a) obj3).f10468b, "LiveViewed")) {
                        arrayList7.add(obj3);
                    }
                }
                if (arrayList7.isEmpty()) {
                    return new Integer(204);
                }
                na.b bVar2 = new na.b();
                String str5 = gc.d.f9945a;
                String c8 = d2.i.c();
                String d11 = d2.i.d();
                this.f19592c = arrayList7;
                this.f19594e = 2;
                arrayList2 = arrayList7;
                y02 = bVar2.y0(arrayList2, c8, d11, str4, this);
                if (y02 == aVar) {
                    return aVar;
                }
                intValue2 = ((Number) y02).intValue();
                if (intValue2 != 401) {
                }
                return new Integer(intValue2);
        }
    }
}
