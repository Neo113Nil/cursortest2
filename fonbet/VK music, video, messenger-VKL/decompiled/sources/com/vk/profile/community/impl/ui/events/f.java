package com.vk.profile.community.impl.ui.events;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.ui.j;
import io.reactivex.rxjava3.internal.operators.single.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.c5g;
import xsna.fj1;
import xsna.gq;
import xsna.hq;
import xsna.rsg0;
import xsna.tfx;
import xsna.yfb;
import xsna.zqu;

/* compiled from: CommunityEventsRepository.kt */
/* loaded from: classes5.dex */
public final class f {
    public final zqu a;

    public f(zqu zquVar) {
        this.a = zquVar;
    }

    public static y a(f fVar, UserId userId, int i, int i2) {
        ArrayList arrayList;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        zqu zquVar = fVar.a;
        List singletonList = Collections.singletonList(GroupsFieldsDto.PHOTO_BASE);
        Integer valueOf = Integer.valueOf(i);
        Integer num = 20;
        zquVar.getClass();
        tfx tfxVar = new tfx("groups.getEvents", new gq(19), new hq(15));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        if (singletonList != null) {
            List list = singletonList;
            arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((GroupsFieldsDto) it.next()).k());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, valueOf.intValue(), 0, 0, 8);
        tfx.l(tfxVar, "count", num.intValue(), 0, 0, 8);
        return rsg0.w0(yfb.x(tfxVar)).l(new j(new fj1(16), 10));
    }
}
