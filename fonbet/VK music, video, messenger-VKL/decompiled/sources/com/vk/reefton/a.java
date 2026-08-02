package com.vk.reefton;

import com.vk.reefton.Reef;
import com.vk.reefton.literx.sbjects.PublishSubject;
import com.vk.reefton.trackers.l;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;
import xsna.s3q0;
import xsna.snf0;
import xsna.xmf0;

/* compiled from: Reef.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Reef.State, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(Reef.State state) {
        Reef reef = (Reef) this.receiver;
        PublishSubject<ReefEvent> publishSubject = reef.e;
        ArrayList arrayList = reef.b;
        xmf0 xmf0Var = reef.a;
        ArrayList arrayList2 = reef.c;
        int i = Reef.b.$EnumSwitchMapping$0[state.ordinal()];
        if (i != 1) {
            if (i == 2) {
                Reef.State state2 = reef.f;
                if (state2 == Reef.State.SETUP || state2 == Reef.State.PAUSED) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((l) it.next()).f(xmf0Var);
                    }
                    reef.f = Reef.State.STARTED;
                }
            } else if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (reef.f == Reef.State.PAUSED) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((l) it2.next()).d();
                    }
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        ((snf0) it3.next()).release();
                    }
                    reef.f = Reef.State.RELEASED;
                }
            } else if (reef.f == Reef.State.STARTED) {
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    ((l) it4.next()).c();
                }
                reef.f = Reef.State.PAUSED;
            }
        } else if (reef.f == Reef.State.RELEASED) {
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                ((snf0) it5.next()).a(publishSubject, publishSubject);
            }
            Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                ((l) it6.next()).e(publishSubject);
            }
            reef.f = Reef.State.SETUP;
        }
        return s3q0.a;
    }
}
