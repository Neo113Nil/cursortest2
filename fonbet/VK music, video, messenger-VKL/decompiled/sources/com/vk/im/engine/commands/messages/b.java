package com.vk.im.engine.commands.messages;

import android.util.SparseArray;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.NestedMsg;
import java.util.ArrayList;
import java.util.Collections;
import xsna.b5w;
import xsna.d040;
import xsna.f140;
import xsna.gv30;
import xsna.le6;
import xsna.r680;
import xsna.utb;
import xsna.vu5;
import xsna.w2w;
import xsna.zd20;

/* compiled from: MsgDeleteLocallyCmd.kt */
/* loaded from: classes2.dex */
public final class b extends le6<Boolean> {
    public final int b;

    public b(int i) {
        this.b = i;
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        NestedMsg pa;
        d040 o = w2wVar.I0().o();
        Msg L = o.L(this.b);
        if (L == null) {
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
        new f140(arrayList).o(w2wVar);
        long j = L.c;
        int i2 = L.b;
        gv30.a aVar = new gv30.a();
        aVar.a = j;
        aVar.a();
        aVar.b();
        aVar.c();
        aVar.b = Integer.valueOf(i2);
        new zd20(new gv30(aVar), new utb(w2wVar.I0(), w2wVar.getExperiments()), false, false).a(w2wVar);
        w2wVar.e1(this, new OnCacheInvalidateEvent(null, OnCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE));
        w2wVar.e1(this, new r680(null, Collections.singleton(new b5w(L.c, ImItemType.DIALOG))));
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.b == ((b) obj).b;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return vu5.b(new StringBuilder("MsgDeleteLocallyCmd(msgLocalId="), this.b, ')');
    }
}
