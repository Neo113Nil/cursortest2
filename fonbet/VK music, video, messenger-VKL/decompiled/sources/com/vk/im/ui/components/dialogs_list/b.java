package com.vk.im.ui.components.dialogs_list;

import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.debug.ui.dev.DebugFileManagerFragment;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.ui.components.dialogs_list.d;
import com.vk.im.ui.components.dialogs_list.e;
import com.vk.notifications.GroupedNotificationsFragment;
import com.vk.voip.ui.settings.CallParticipantsFragment;
import java.util.HashMap;
import java.util.LinkedHashMap;
import xsna.cbm;
import xsna.d2h;
import xsna.dh8;
import xsna.dn3;
import xsna.dsb;
import xsna.eb20;
import xsna.fh1;
import xsna.fxs;
import xsna.g5l;
import xsna.g60;
import xsna.iou;
import xsna.jr3;
import xsna.k9u0;
import xsna.l8j;
import xsna.leq;
import xsna.ltm;
import xsna.mu0;
import xsna.nt;
import xsna.p4f;
import xsna.qp3;
import xsna.x0s;
import xsna.x50;
import xsna.zqh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                c cVar = (c) obj2;
                d.a aVar = (d.a) obj;
                e eVar = cVar.h;
                eVar.f = aVar.a;
                DialogsHistory dialogsHistory = eVar.g;
                DialogsHistory dialogsHistory2 = aVar.b;
                dialogsHistory.v(dialogsHistory2);
                eVar.h.Mb(aVar.c);
                HashMap hashMap = eVar.t;
                hashMap.clear();
                hashMap.putAll(aVar.e);
                LinkedHashMap linkedHashMap = eVar.i;
                linkedHashMap.clear();
                linkedHashMap.putAll(aVar.d);
                eVar.j = new LinkedHashMap(aVar.f);
                eVar.k = new LinkedHashMap(aVar.g);
                eVar.r = aVar.j;
                eVar.s = aVar.k;
                eVar.p = aVar.h;
                eVar.q = aVar.i;
                eVar.u = aVar.l;
                eVar.v = aVar.m;
                cVar.j.getClass();
                eVar.D = k9u0.a.b(cVar.f);
                eVar.y = false;
                eVar.z = true;
                eVar.A = false;
                eVar.B = false;
                e.a aVar2 = eVar.F;
                cbm.a aVar3 = aVar.n;
                eVar.F = e.a.a(aVar2, false, aVar3.a, aVar3.b, aVar3.c, aVar3.d, aVar3.e, 1);
                e.d dVar = eVar.E;
                eb20.a aVar4 = aVar.o;
                eVar.E = e.d.a(dVar, false, aVar4.a, aVar4.b, aVar4.c, aVar4.d, aVar4.e, 1);
                ltm ltmVar = cVar.g;
                if (ltmVar.isEnabled()) {
                    ltmVar.d(dialogsHistory2.p());
                }
                cVar.B(cVar);
                cVar.r(cVar);
                break;
            case 1:
                ((x50) obj2).invoke(obj);
                break;
            case 2:
                ((dn3) obj2).invoke(obj);
                break;
            case 3:
                ((qp3) obj2).invoke(obj);
                break;
            case 4:
                ((g60) obj2).invoke(obj);
                break;
            case 5:
                ((nt) obj2).invoke(obj);
                break;
            case 6:
                ((nt) obj2).invoke(obj);
                break;
            case 7:
                ((g60) obj2).invoke(obj);
                break;
            case 8:
                int i2 = CallParticipantsFragment.W;
                ((CallParticipantsFragment.f) obj2).invoke(obj);
                break;
            case 9:
                ((g60) obj2).invoke(obj);
                break;
            case 10:
                ((g60) obj2).invoke(obj);
                break;
            case 11:
                ((fh1) obj2).invoke(obj);
                break;
            case 12:
                ((g60) obj2).invoke(obj);
                break;
            case 13:
                int i3 = ChannelFragment.a1;
                ((jr3) obj2).invoke(obj);
                break;
            case 14:
                ((dsb) obj2).invoke(obj);
                break;
            case 15:
                int i4 = d2h.p1;
                ((p4f) obj2).invoke(obj);
                break;
            case 16:
                ((zqh) obj2).invoke(obj);
                break;
            case 17:
                ((l8j.n) obj2).invoke(obj);
                break;
            case 18:
                ((fh1) obj2).invoke(obj);
                break;
            case 19:
                int i5 = DebugFileManagerFragment.R;
                ((g5l) obj2).invoke(obj);
                break;
            case 20:
                ((dh8) obj2).invoke(obj);
                break;
            case 21:
                ((p4f) obj2).invoke(obj);
                break;
            case 22:
                ((leq) obj2).invoke(obj);
                break;
            case 23:
                ((x0s) obj2).invoke(obj);
                break;
            case 24:
                ((fxs.b) obj2).invoke(obj);
                break;
            case 25:
                ((leq) obj2).invoke(obj);
                break;
            case 26:
                ((p4f) obj2).invoke(obj);
                break;
            case 27:
                int i6 = GroupedNotificationsFragment.f0;
                ((mu0) obj2).invoke(obj);
                break;
            case 28:
                ((iou) obj2).invoke(obj);
                break;
            default:
                ((iou) obj2).invoke(obj);
                break;
        }
    }
}
