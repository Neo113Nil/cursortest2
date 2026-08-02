package com.vk.clips.coauthors.list.common.mvi.entity.state;

import android.content.Context;
import com.vk.clips.coauthors.domain.model.CoauthorType;
import com.vk.clips.coauthors.list.common.mvi.entity.state.ClipCoauthorListItem;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Image;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.c5g;
import xsna.e43;
import xsna.epx;
import xsna.fkq0;
import xsna.j5g;
import xsna.o25;

/* compiled from: ClipCoauthorListState.kt */
/* loaded from: classes16.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:72:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList a(ClipVideoFile clipVideoFile, boolean z) {
        Context context;
        ClipCoauthorListItem.SubscribeState subscribeState;
        Owner owner = clipVideoFile.v0;
        if (owner == null) {
            throw new IllegalStateException("Clip must have owner");
        }
        UserId userId = owner.b;
        String str = owner.c;
        VkCell.Left.Main.Size size = VkCell.Left.Main.Size.Medium;
        Serializer.c<Image> cVar = Image.CREATOR;
        Image a = Image.b.a(owner.d);
        Serializer.c<Owner> cVar2 = Owner.CREATOR;
        Context context2 = e43.a;
        Context context3 = null;
        if (context2 == null) {
            context2 = null;
        }
        String a2 = Owner.a.a(size.k(context2), a);
        if (a2 == null) {
            a2 = owner.e;
        }
        List singletonList = Collections.singletonList(new ClipCoauthorListItem(new ClipCoauthorListItem.OwnerMin(userId, str, a2), true, (z || clipVideoFile.G) ? ClipCoauthorListItem.SubscribeState.Gone.b : new ClipCoauthorListItem.SubscribeState.Visible(fkq0.d(owner.b) ? owner.i(512) || owner.i(4) : owner.i(4), false, 2, null), true, epx.f(owner.b, o25.a().L()) || owner.i(2), fkq0.b(owner.b) ? CoauthorType.Community : owner.l() ? CoauthorType.Female : CoauthorType.Male));
        List<CoOwnerItem> list = clipVideoFile.N1;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            CoOwnerItem coOwnerItem = (CoOwnerItem) obj;
            if (z || coOwnerItem.c == CoOwnerItem.StatusDto.APPROVED) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CoOwnerItem coOwnerItem2 = (CoOwnerItem) it.next();
            Owner owner2 = coOwnerItem2.d;
            UserId userId2 = owner2.b;
            String str2 = owner2.c;
            VkCell.Left.Main.Size size2 = VkCell.Left.Main.Size.Medium;
            Serializer.c<Image> cVar3 = Image.CREATOR;
            Image a3 = Image.b.a(owner2.d);
            Serializer.c<Owner> cVar4 = Owner.CREATOR;
            Context context4 = e43.a;
            if (context4 != null) {
                context3 = context4;
            }
            String a4 = Owner.a.a(size2.k(context3), a3);
            if (a4 == null) {
                a4 = owner2.e;
            }
            ClipCoauthorListItem.OwnerMin ownerMin = new ClipCoauthorListItem.OwnerMin(userId2, str2, a4);
            if (!z) {
                boolean z2 = coOwnerItem2.e;
                Owner owner3 = coOwnerItem2.d;
                if (!z2 && (owner3.i(4) || !owner3.i(2048))) {
                    context = null;
                    subscribeState = new ClipCoauthorListItem.SubscribeState.Visible(owner2.i(512) || owner2.i(4), false, 2, null);
                    arrayList2.add(new ClipCoauthorListItem(ownerMin, false, subscribeState, coOwnerItem2.c != CoOwnerItem.StatusDto.APPROVED, coOwnerItem2.e, !fkq0.b(owner2.b) ? CoauthorType.Community : owner2.l() ? CoauthorType.Female : CoauthorType.Male));
                    context3 = context;
                }
            }
            context = null;
            subscribeState = ClipCoauthorListItem.SubscribeState.Gone.b;
            arrayList2.add(new ClipCoauthorListItem(ownerMin, false, subscribeState, coOwnerItem2.c != CoOwnerItem.StatusDto.APPROVED, coOwnerItem2.e, !fkq0.b(owner2.b) ? CoauthorType.Community : owner2.l() ? CoauthorType.Female : CoauthorType.Male));
            context3 = context;
        }
        return j5g.u0(arrayList2, singletonList);
    }
}
