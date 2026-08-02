package com.vk.profile.community.details.impl.invitelink;

import com.vk.api.generated.groups.dto.GroupsInviteLinkPreviewFieldsDto;
import io.reactivex.rxjava3.internal.operators.single.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bk1;
import xsna.c5g;
import xsna.e43;
import xsna.fq;
import xsna.nk;
import xsna.rsg0;
import xsna.tfx;
import xsna.yfb;
import xsna.zqu;

/* compiled from: CommunityInviteLinkPreviewInteractor.kt */
/* loaded from: classes5.dex */
public final class b {
    public static final List<GroupsInviteLinkPreviewFieldsDto> b = e43.l(GroupsInviteLinkPreviewFieldsDto.GROUP, GroupsInviteLinkPreviewFieldsDto.PROFILES);
    public final zqu a;

    public b() {
        this(0);
    }

    public final y a(String str) {
        ArrayList arrayList;
        this.a.getClass();
        tfx tfxVar = new tfx("groups.getInviteLinkPreview", new com.vk.movika.sdk.base.model.history.b(13), new fq(14));
        tfx.o(tfxVar, "link", str, 0, 0, 12);
        List<GroupsInviteLinkPreviewFieldsDto> list = b;
        if (list != null) {
            List<GroupsInviteLinkPreviewFieldsDto> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((GroupsInviteLinkPreviewFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        return rsg0.D0(yfb.x(tfxVar)).l(new bk1(new nk(this), 8));
    }

    public b(int i) {
        this.a = new zqu();
    }
}
