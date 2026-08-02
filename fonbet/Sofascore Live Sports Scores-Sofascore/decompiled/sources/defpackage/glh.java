package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class glh extends m2g implements Function2 {
    public final /* synthetic */ Iterator A;
    public Object s;
    public Iterator t;
    public int u;
    public int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glh(int i, int i2, Iterator it, rq3 rq3Var) {
        super(2, rq3Var);
        this.y = i;
        this.z = i2;
        this.A = it;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        glh glhVar = new glh(this.y, this.z, this.A, rq3Var);
        glhVar.x = obj;
        return glhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((glh) create((x4h) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b8  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        Iterator it;
        e5g e5gVar;
        ArrayList arrayList;
        int i4;
        Iterator it2;
        int i5;
        int i6;
        e5g e5gVar2;
        boolean z;
        x4h x4hVar = (x4h) this.x;
        lu3 lu3Var = lu3.a;
        int i7 = this.w;
        int i8 = this.z;
        boolean z2 = true;
        int i9 = this.y;
        if (i7 == 0) {
            y6a.M(obj);
            int i10 = i9 <= 1024 ? i9 : 1024;
            i = i8 - i9;
            Iterator it3 = this.A;
            if (i >= 0) {
                arrayList = new ArrayList(i10);
                i4 = i10;
                it2 = it3;
                i5 = 0;
                while (it2.hasNext()) {
                }
                if (!arrayList.isEmpty()) {
                }
            } else {
                e5g e5gVar3 = new e5g(new Object[i10], 0);
                i2 = i10;
                i3 = i;
                it = it3;
                e5gVar = e5gVar3;
                while (true) {
                    int i11 = e5gVar.b;
                    Object[] objArr = e5gVar.a;
                    if (it.hasNext()) {
                    }
                    z2 = z;
                }
            }
        } else if (i7 != 1) {
            if (i7 == 2) {
            } else if (i7 == 3) {
                i3 = this.v;
                i2 = this.u;
                it = this.t;
                e5gVar = (e5g) this.s;
                y6a.M(obj);
                e5gVar.c(i8);
                while (true) {
                    int i112 = e5gVar.b;
                    Object[] objArr2 = e5gVar.a;
                    if (it.hasNext()) {
                        i6 = i2;
                        e5gVar2 = e5gVar;
                        break;
                    }
                    Object next = it.next();
                    z = z2;
                    if (e5gVar.size() == i112) {
                        a70.r("ring buffer is full");
                        return null;
                    }
                    objArr2[(e5gVar.size() + e5gVar.c) % i112] = next;
                    e5gVar.d = e5gVar.size() + 1;
                    if (e5gVar.size() == i112) {
                        if (e5gVar.size() >= i9) {
                            ArrayList arrayList2 = new ArrayList(e5gVar);
                            this.x = x4hVar;
                            this.s = e5gVar;
                            this.t = it;
                            this.u = i2;
                            this.v = i3;
                            this.w = 3;
                            x4hVar.d(this, arrayList2);
                            lu3 lu3Var2 = lu3.a;
                            return lu3Var;
                        }
                        int i12 = i112 + (i112 >> 1) + 1;
                        if (i12 > i9) {
                            i12 = i9;
                        }
                        e5gVar = new e5g(e5gVar.c == 0 ? Arrays.copyOf(objArr2, i12) : e5gVar.toArray(new Object[i12]), e5gVar.size());
                    }
                    z2 = z;
                }
            } else if (i7 == 4) {
                i3 = this.v;
                i6 = this.u;
                e5gVar2 = (e5g) this.s;
                y6a.M(obj);
                e5gVar2.c(i8);
                if (e5gVar2.size() > i8) {
                    ArrayList arrayList3 = new ArrayList(e5gVar2);
                    this.x = x4hVar;
                    this.s = e5gVar2;
                    this.t = null;
                    this.u = i6;
                    this.v = i3;
                    this.w = 4;
                    x4hVar.d(this, arrayList3);
                    lu3 lu3Var3 = lu3.a;
                    return lu3Var;
                }
                if (!e5gVar2.isEmpty()) {
                    this.x = null;
                    this.s = null;
                    this.t = null;
                    this.u = i6;
                    this.v = i3;
                    this.w = 5;
                    x4hVar.d(this, e5gVar2);
                    lu3 lu3Var4 = lu3.a;
                    return lu3Var;
                }
            } else {
                if (i7 != 5) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            y6a.M(obj);
        } else {
            i5 = this.v;
            i4 = this.u;
            it2 = this.t;
            y6a.M(obj);
            arrayList = new ArrayList(i9);
            i = i5;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (i5 > 0) {
                    i5--;
                } else {
                    arrayList.add(next2);
                    if (arrayList.size() == i9) {
                        this.x = x4hVar;
                        this.s = arrayList;
                        this.t = it2;
                        this.u = i4;
                        this.v = i;
                        this.w = 1;
                        x4hVar.d(this, arrayList);
                        lu3 lu3Var5 = lu3.a;
                        return lu3Var;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.x = null;
                this.s = null;
                this.t = null;
                this.u = i4;
                this.v = i;
                this.w = 2;
                x4hVar.d(this, arrayList);
                lu3 lu3Var6 = lu3.a;
                return lu3Var;
            }
        }
        return Unit.a;
    }
}
