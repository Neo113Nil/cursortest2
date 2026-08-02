package com.vk.settings;

import com.ironsource.X3;
import com.vk.api.comments.CommentsOrder;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.user.UserNameType;
import com.vk.toggle.b;
import com.vk.toggle.features.VkcFeatures;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import java.util.Collections;
import java.util.List;
import xsna.a0u;
import xsna.b4r;
import xsna.bs;
import xsna.ept;
import xsna.epx;
import xsna.np1;
import xsna.odi;
import xsna.ox0;
import xsna.qoy;
import xsna.rsg0;
import xsna.rx0;
import xsna.s1r0;
import xsna.yfb;

/* compiled from: GetAccountSettingsRequest.kt */
/* loaded from: classes5.dex */
public final class GetAccountSettingsRequest {

    /* compiled from: GetAccountSettingsRequest.kt */
    public static final class Result extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Result> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final boolean g;
        public final boolean h;
        public final CommentsOrder i;
        public final UserNameType j;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Result> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Result a(Serializer serializer) {
                return new Result(serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.m(), serializer.m(), (CommentsOrder) serializer.G(CommentsOrder.class.getClassLoader()), UserNameType.values()[serializer.u()]);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Result[i];
            }
        }

        public Result(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, CommentsOrder commentsOrder, UserNameType userNameType) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = z;
            this.h = z2;
            this.i = commentsOrder;
            this.j = userNameType;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.j0(this.e);
            serializer.j0(this.f);
            serializer.L(this.g ? (byte) 1 : (byte) 0);
            serializer.L(this.h ? (byte) 1 : (byte) 0);
            serializer.i0(this.i);
            serializer.S(this.j.ordinal());
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return epx.f(this.b, result.b) && epx.f(this.c, result.c) && epx.f(this.d, result.d) && epx.f(this.e, result.e) && epx.f(this.f, result.f) && this.g == result.g && this.h == result.h && epx.f(this.i, result.i) && this.j == result.j;
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.e;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f;
            int b = qoy.b(qoy.b((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.g), 31, this.h);
            CommentsOrder commentsOrder = this.i;
            return this.j.hashCode() + ((b + (commentsOrder != null ? commentsOrder.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Result(email=" + this.b + ", emailLink=" + this.c + ", phone=" + this.d + ", phoneLink=" + this.e + ", domain=" + this.f + ", ownPostsDefault=" + this.g + ", noWallReplies=" + this.h + ", commentOrder=" + this.i + ", imUserNameType=" + this.j + ')';
        }
    }

    public static q a() {
        j1 U;
        VkcFeatures vkcFeatures = VkcFeatures.MIGRATION_USERS_GET_TO_ACC_GET;
        vkcFeatures.getClass();
        if (b.A.a(vkcFeatures)) {
            U = rsg0.l0(yfb.x(bs.a.a((13 & 4) != 0 ? null : "nom", null, Collections.singletonList(X3.j.D))), null, 3).U(new ox0(new b4r(5), 20));
        } else {
            List singletonList = Collections.singletonList(UsersFieldsDto.DOMAIN);
            if ((59 & 4) != 0) {
                singletonList = null;
            }
            U = rsg0.l0(yfb.x(s1r0.a.b(null, null, singletonList, null, null)), null, 3).U(new rx0(new ept(0), 25));
        }
        return q.J0(rsg0.l0(yfb.x(bs.a.b(null)), null, 3), U, rsg0.l0(new a0u(), null, 3), new np1(new odi(4), 20));
    }
}
