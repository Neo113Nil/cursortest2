package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lioi;", "Lbuc;", "Looi;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ioi extends buc {
    public final Object a;
    public final Object b;
    public final PointerInputEventHandler c;

    public ioi(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj2 = (i & 2) != 0 ? null : obj2;
        this.a = obj;
        this.b = obj2;
        this.c = pointerInputEventHandler;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new ooi(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ioi)) {
            return false;
        }
        ioi ioiVar = (ioi) obj;
        return Intrinsics.c(this.a, ioiVar.a) && Intrinsics.c(this.b, ioiVar.b) && this.c == ioiVar.c;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        ooi ooiVar = (ooi) wtcVar;
        Object obj = ooiVar.o;
        Object obj2 = this.a;
        boolean z = !Intrinsics.c(obj, obj2);
        ooiVar.o = obj2;
        Object obj3 = ooiVar.p;
        Object obj4 = this.b;
        if (!Intrinsics.c(obj3, obj4)) {
            z = true;
        }
        ooiVar.p = obj4;
        Class<?> cls = ooiVar.q.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.c;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            ooiVar.m1();
        }
        ooiVar.q = pointerInputEventHandler;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return this.c.hashCode() + ((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}
