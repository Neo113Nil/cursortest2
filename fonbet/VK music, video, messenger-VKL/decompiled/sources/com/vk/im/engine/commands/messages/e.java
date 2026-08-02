package com.vk.im.engine.commands.messages;

import android.util.SparseArray;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.NestedMsg;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.c5g;
import xsna.d040;
import xsna.le6;
import xsna.p980;
import xsna.vu5;
import xsna.w2w;

/* compiled from: MsgExpireLocallyCmd.kt */
/* loaded from: classes2.dex */
public final class e extends le6<Boolean> {
    public final int b;

    public e(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        NestedMsg pa;
        d040 o = w2wVar.I0().o();
        Msg L = o.L(this.b);
        if (L == 0) {
            return Boolean.FALSE;
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<Msg> A0 = o.A0(L.c, L.g);
        int size = A0.size();
        for (int i = 0; i < size; i++) {
            Msg valueAt = A0.valueAt(i);
            if (!valueAt.D && (valueAt instanceof MsgFromUser) && (pa = ((MsgFromUser) valueAt).pa()) != null && pa.d == L.d) {
                pa.o = true;
                pa.J5();
                arrayList.add(valueAt);
            }
        }
        if (L.D && arrayList.isEmpty()) {
            return Boolean.FALSE;
        }
        if (!L.D) {
            L.D = true;
            if (L instanceof com.vk.im.engine.models.messages.a) {
                ((com.vk.im.engine.models.messages.a) L).J5();
            }
            o.m(L);
            w2wVar.e1(this, new p980((Object) null, L.c, L.b));
            w2wVar.I0().b().e().F(L.d, L.c);
        }
        if (!arrayList.isEmpty()) {
            o.W(arrayList);
            long j = L.c;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((MsgFromUser) it.next()).b));
            }
            w2wVar.e1(this, new p980(j, (String) null, arrayList2));
        }
        w2wVar.S0().v(L.c, this);
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.b == ((e) obj).b;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return vu5.b(new StringBuilder("MsgExpireLocallyCmd(msgLocalId="), this.b, ')');
    }
}
