package com.vk.dto.common.clips;

import com.vk.api.generated.shortVideo.dto.ShortVideoCoOwnerDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoMainTabStateDto;
import com.vk.dto.common.clips.ClipMainTabState;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.UserProfile;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import xsna.fkq0;
import xsna.tsj;

/* compiled from: CoOwnerItem.kt */
/* loaded from: classes18.dex */
public final class a {

    /* compiled from: CoOwnerItem.kt */
    /* renamed from: com.vk.dto.common.clips.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0908a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShortVideoCoOwnerDto.StatusDto.values().length];
            try {
                iArr[ShortVideoCoOwnerDto.StatusDto.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShortVideoCoOwnerDto.StatusDto.APPROVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShortVideoCoOwnerDto.StatusDto.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final CoOwnerItem a(ShortVideoCoOwnerDto shortVideoCoOwnerDto, Map<UserId, ? extends UserProfile> map, Map<UserId, ? extends Group> map2, Map<UserId, Owner> map3) {
        Group group;
        Owner a;
        CoOwnerItem.StatusDto statusDto;
        UserProfile userProfile;
        ClipMainTabState clipMainTabState = null;
        if (fkq0.d(shortVideoCoOwnerDto.q())) {
            if (map != null && (userProfile = map.get(shortVideoCoOwnerDto.q())) != null) {
                a = userProfile.l0();
            }
            a = null;
        } else {
            if (map2 != null && (group = map2.get(fkq0.a(shortVideoCoOwnerDto.q()))) != null) {
                a = tsj.a(group);
            }
            a = null;
        }
        if (a == null) {
            a = map3 != null ? map3.get(shortVideoCoOwnerDto.q()) : null;
            if (a == null) {
                return null;
            }
        }
        Owner owner = a;
        UserId q = shortVideoCoOwnerDto.q();
        int i = C0908a.$EnumSwitchMapping$0[shortVideoCoOwnerDto.f().ordinal()];
        if (i == 1) {
            statusDto = CoOwnerItem.StatusDto.PENDING;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new NotImplementedError("An operation is not implemented: To be removed, already removed on test domain");
            }
            statusDto = CoOwnerItem.StatusDto.APPROVED;
        }
        CoOwnerItem.StatusDto statusDto2 = statusDto;
        boolean d = shortVideoCoOwnerDto.d();
        ShortVideoMainTabStateDto e = shortVideoCoOwnerDto.e();
        if (e != null) {
            int i2 = e.i();
            ClipMainTabState.a aVar = ClipMainTabState.Companion;
            Integer valueOf = Integer.valueOf(i2);
            aVar.getClass();
            clipMainTabState = ClipMainTabState.a.a(valueOf);
        }
        return new CoOwnerItem(q, statusDto2, owner, d, clipMainTabState);
    }
}
