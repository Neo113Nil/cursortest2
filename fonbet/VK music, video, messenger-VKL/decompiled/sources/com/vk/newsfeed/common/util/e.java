package com.vk.newsfeed.common.util;

import com.vk.dto.common.Attachment;
import com.vk.fave.entities.FaveEntry;
import com.vk.fave.entities.FaveType;
import com.vk.feed.core.models.attachment.EntryAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a2o;
import xsna.gmq;
import xsna.gnq;
import xsna.h170;
import xsna.i2c0;
import xsna.k2c0;
import xsna.owu;
import xsna.oy00;
import xsna.ph60;
import xsna.r74;
import xsna.s1c0;
import xsna.u1c0;
import xsna.vfe;
import xsna.w84;
import xsna.ydo0;

/* compiled from: FaveDisplayItemsBuilder.kt */
/* loaded from: classes4.dex */
public final class e {
    public final i2c0 c;
    public final vfe d;
    public final k2c0 a = new k2c0();
    public final owu b = new owu();
    public final ydo0 e = new ydo0();
    public final oy00 f = new oy00();

    public e(a2o a2oVar, h170 h170Var) {
        this.c = new i2c0(new ph60(a2oVar), a2oVar);
        this.d = new vfe(h170Var);
    }

    public static void b(FaveEntry faveEntry, ArrayList arrayList) {
        gnq gnqVar = gnq.a;
        gmq gmqVar = faveEntry.i.f;
        gnqVar.getClass();
        FaveType e = gnq.e(gmqVar);
        if (e == FaveType.POST || e == FaveType.PODCAST || !faveEntry.j) {
            arrayList.add(new u1c0(397, faveEntry));
        }
    }

    public static u1c0 c(FaveEntry faveEntry, int i) {
        List list = faveEntry.l;
        if (list == null) {
            list = new ArrayList();
        }
        Attachment R1 = faveEntry.R1();
        if (list.size() == 1 && R1 != null) {
            return new r74(i, R1, faveEntry, faveEntry);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((EntryAttachment) it.next()).b);
        }
        return new w84(faveEntry, faveEntry, i, arrayList);
    }

    public final void a(FaveEntry faveEntry, ArrayList arrayList, s1c0 s1c0Var) {
        arrayList.add(this.b.b(faveEntry, faveEntry, s1c0Var));
    }
}
