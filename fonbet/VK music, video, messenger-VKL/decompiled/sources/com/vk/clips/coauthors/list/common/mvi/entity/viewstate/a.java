package com.vk.clips.coauthors.list.common.mvi.entity.viewstate;

import com.vk.clips.coauthors.domain.model.CoauthorType;
import com.vk.clips.coauthors.list.common.mvi.entity.state.ClipCoauthorListItem;
import com.vk.clips.coauthors.list.common.mvi.entity.state.ClipCoauthorListState;
import com.vk.clips.coauthors.list.common.mvi.entity.viewstate.ClipCoauthorListVS;
import com.vk.dto.common.id.UserId;
import com.vk.toggle.b;
import com.vk.toggle.features.ClipsFeatures;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.c5g;

/* compiled from: ClipCoauthorListVS.kt */
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: ClipCoauthorListVS.kt */
    /* renamed from: com.vk.clips.coauthors.list.common.mvi.entity.viewstate.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0551a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CoauthorType.values().length];
            try {
                iArr[CoauthorType.Male.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoauthorType.Female.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoauthorType.Community.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ClipCoauthorListVS a(ClipCoauthorListState clipCoauthorListState) {
        ClipCoauthorListVS.Owner.a bVar;
        ClipCoauthorListVS.Owner.Type type;
        List<ClipCoauthorListItem> list = clipCoauthorListState.c;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (ClipCoauthorListItem clipCoauthorListItem : list) {
            ClipCoauthorListItem.OwnerMin ownerMin = clipCoauthorListItem.b;
            ClipCoauthorListItem.SubscribeState subscribeState = clipCoauthorListItem.d;
            UserId userId = ownerMin.b;
            String str = ownerMin.c;
            if (str == null) {
                str = "";
            }
            String str2 = ownerMin.d;
            if (str2 == null) {
                str2 = "";
            }
            if (subscribeState.equals(ClipCoauthorListItem.SubscribeState.Gone.b)) {
                bVar = ClipCoauthorListVS.Owner.a.C0550a.a;
            } else {
                if (!(subscribeState instanceof ClipCoauthorListItem.SubscribeState.Visible)) {
                    throw new NoWhenBranchMatchedException();
                }
                ClipCoauthorListItem.SubscribeState.Visible visible = (ClipCoauthorListItem.SubscribeState.Visible) subscribeState;
                bVar = new ClipCoauthorListVS.Owner.a.b(visible.b, visible.c);
            }
            boolean z = clipCoauthorListItem.c;
            boolean z2 = clipCoauthorListItem.f;
            boolean z3 = clipCoauthorListItem.e;
            int i = C0551a.$EnumSwitchMapping$0[clipCoauthorListItem.g.ordinal()];
            if (i == 1) {
                type = ClipCoauthorListVS.Owner.Type.Male;
            } else if (i == 2) {
                type = ClipCoauthorListVS.Owner.Type.Female;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                type = ClipCoauthorListVS.Owner.Type.Community;
            }
            arrayList.add(new ClipCoauthorListVS.Owner(userId, str, str2, bVar, z, z2, z3, type));
        }
        String str3 = clipCoauthorListState.b;
        boolean z4 = clipCoauthorListState.d;
        ClipsFeatures clipsFeatures = ClipsFeatures.COAUTHORS_REDESIGN;
        clipsFeatures.getClass();
        return new ClipCoauthorListVS(str3, arrayList, z4, b.A.a(clipsFeatures));
    }
}
