package com.vk.newsfeed.impl.helpers;

import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.movika.sdk.base.flow.binding.c;
import com.vk.movika.sdk.base.hooks.f;
import defpackage.q0;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.o1;
import java.util.List;
import xsna.dz2;
import xsna.e43;
import xsna.ehu;
import xsna.j2r0;
import xsna.ppu;
import xsna.rsg0;
import xsna.u1r0;
import xsna.yfb;
import xsna.zqu;

/* compiled from: GroupsGetBannedHelper.kt */
/* loaded from: classes4.dex */
public final class a {
    public final zqu a = new zqu();
    public final u1r0 b = new u1r0();
    public final j2r0 c = new j2r0();
    public final List<BaseUserGroupFieldsDto> d = e43.l(BaseUserGroupFieldsDto.FIRST_NAME_ACC, BaseUserGroupFieldsDto.LAST_NAME_ACC, BaseUserGroupFieldsDto.SEX, BaseUserGroupFieldsDto.PHOTO_BASE);
    public final List<UsersFieldsDto> e = e43.l(UsersFieldsDto.FIRST_NAME_ACC, UsersFieldsDto.LAST_NAME_ACC, UsersFieldsDto.SEX, UsersFieldsDto.PHOTO_BASE);

    /* compiled from: GroupsGetBannedHelper.kt */
    /* renamed from: com.vk.newsfeed.impl.helpers.a$a, reason: collision with other inner class name */
    public static final class C1382a {
        public final boolean a;
        public final boolean b;

        public C1382a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1382a)) {
                return false;
            }
            C1382a c1382a = (C1382a) obj;
            return this.a == c1382a.a && this.b == c1382a.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IsMemberResult(hasValue=");
            sb.append(this.a);
            sb.append(", value=");
            return q0.a(sb, this.b, ')');
        }
    }

    public static q b(dz2 dz2Var, boolean z) {
        return z ? rsg0.y0(dz2Var, null, null, 3) : rsg0.W(dz2Var, 7).w();
    }

    public final q<VKList<UserProfile>> a(UserId userId, UserId userId2, boolean z) {
        return new o1(b(yfb.x(this.a.s(userId, this.d, userId2)), z), new f(new ehu(2), 21)).L(new c(new ppu(this, z, userId, userId2), 20), false);
    }
}
