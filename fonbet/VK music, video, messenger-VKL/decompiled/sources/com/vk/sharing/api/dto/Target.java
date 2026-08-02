package com.vk.sharing.api.dto;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.metrics.eventtracking.b;
import com.vk.sharing.api.di.SharingComponent;
import com.vkontakte.android.data.FriendsUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.bxx;
import xsna.dcj0;
import xsna.fkq0;
import xsna.j6i;
import xsna.m7m;
import xsna.o25;
import xsna.qtd0;
import xsna.w8i;
import xsna.wtw;
import xsna.y501;

/* loaded from: classes5.dex */
public final class Target extends Serializer.StreamParcelableAdapter implements wtw, bxx, w8i {
    public static final Serializer.c<Target> CREATOR = new a();
    public final Set<UserId> b;
    public UserId c;
    public String d;
    public final String e;
    public final String f;
    public boolean g;
    public final boolean h;

    @Nullable
    public final Dialog i;

    @NonNull
    public final ProfilesSimpleInfo j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final int o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final String t;
    public final String u;
    public final UserSex v;
    public final boolean w;

    public class a extends Serializer.c<Target> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Target a(@NonNull Serializer serializer) {
            return new Target(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Target[i];
        }
    }

    public Target(@NonNull Dialog dialog, @NonNull ProfilesSimpleInfo profilesSimpleInfo, int i) {
        qtd0 Ab;
        this.c = UserId.d;
        this.j = new ProfilesSimpleInfo();
        this.r = false;
        this.t = "";
        this.u = "";
        this.v = UserSex.UNKNOWN;
        this.c = new UserId(dialog.Sb().longValue());
        this.d = y501.a().i(dialog, profilesSimpleInfo);
        this.i = new Dialog(dialog);
        this.j = new ProfilesSimpleInfo(profilesSimpleInfo);
        this.h = dialog.Jc();
        this.e = this.d;
        this.f = y501.a().m(dialog, profilesSimpleInfo);
        this.k = (dialog.uc() || dialog.Va()) ? false : true;
        this.l = dialog.Va();
        this.n = dialog.Hb() != null && dialog.Hb().g;
        this.o = i;
        this.p = false;
        this.q = false;
        this.s = false;
        if (!dialog.uc() && (Ab = profilesSimpleInfo.Ab(dialog.Sb())) != null) {
            UserProfile f = y501.a().f(Ab);
            this.t = f.d;
            this.u = f.f;
            this.v = f.i;
            this.w = f.Y;
        }
        this.b = Ab().d();
    }

    public final dcj0 Ab() {
        return ((SharingComponent) j6i.b(m7m.f(this), SharingComponent.class)).c();
    }

    @Override // xsna.wtw
    public final boolean E3(String str) {
        for (String str2 : str.toLowerCase().split(" ")) {
            if (str2 != null && str2.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.e0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
        serializer.L(this.m ? (byte) 1 : (byte) 0);
        serializer.L(this.p ? (byte) 1 : (byte) 0);
        serializer.L(this.q ? (byte) 1 : (byte) 0);
        serializer.L(this.s ? (byte) 1 : (byte) 0);
        serializer.j0(this.t);
        serializer.j0(this.u);
        serializer.S(this.v.h());
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        Set<UserId> set = this.b;
        ArrayList arrayList = new ArrayList(set.size());
        for (UserId userId : set) {
            Objects.requireNonNull(userId);
            arrayList.add(userId);
        }
        serializer.f0(Collections.unmodifiableList(arrayList));
        serializer.L(this.w ? (byte) 1 : (byte) 0);
        serializer.L(this.r ? (byte) 1 : (byte) 0);
    }

    @Override // xsna.bxx
    @NonNull
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.k ? this.c : fkq0.e(this.c)).put("name", this.d).put("insName", this.e).put("photoUri", this.f).put("private", this.m).put("commentsAllowed", this.p).put("verified", this.q).put("donutAvailable", this.s).put("first_name", this.t).put("last_name", this.u).put("sex", this.v).put("photoIsNft", this.w);
            return jSONObject;
        } catch (JSONException e) {
            b.a.a(new IllegalArgumentException("Can not serialize Target to json", e));
            return jSONObject;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Target.class == obj.getClass()) {
            Target target = (Target) obj;
            if (Objects.equals(this.c, target.c) && this.k == target.k && this.l == target.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c.b);
    }

    public final String toString() {
        return this.d;
    }

    @Override // xsna.wtw
    public final char[] w7() {
        String str = this.d;
        if (str == null) {
            return new char[]{' '};
        }
        String[] split = str.split(" ");
        int length = split.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = TextUtils.isEmpty(split[i]) ? ' ' : Character.toLowerCase(split[i].charAt(0));
        }
        return cArr;
    }

    public final boolean zb() {
        return !this.b.contains(this.c);
    }

    public Target(@NonNull UserProfile userProfile) {
        this.c = UserId.d;
        this.j = new ProfilesSimpleInfo();
        this.r = false;
        this.t = "";
        this.u = "";
        this.v = UserSex.UNKNOWN;
        this.c = userProfile.c;
        this.d = userProfile.e;
        String b = FriendsUtils.b(userProfile, 4);
        if (b != null) {
            this.e = b;
        } else {
            this.e = this.d;
        }
        Dialog dialog = new Dialog();
        this.i = dialog;
        dialog.setId(userProfile.c.b);
        ProfilesSimpleInfo profilesSimpleInfo = new ProfilesSimpleInfo();
        this.j = profilesSimpleInfo;
        profilesSimpleInfo.Kb(y501.a().l(userProfile));
        this.f = userProfile.h;
        this.k = true;
        this.l = false;
        this.p = userProfile.c.equals(o25.a().c());
        this.q = userProfile.B.b;
        this.s = false;
        this.t = userProfile.d;
        this.u = userProfile.f;
        this.v = userProfile.i;
        this.w = userProfile.Y;
        this.b = Ab().d();
    }

    public Target(@NonNull Group group) {
        this.c = UserId.d;
        this.j = new ProfilesSimpleInfo();
        this.r = false;
        this.t = "";
        this.u = "";
        this.v = UserSex.UNKNOWN;
        this.c = group.c;
        this.d = group.d;
        Dialog dialog = new Dialog();
        this.i = dialog;
        dialog.setId(-group.c.b);
        ProfilesSimpleInfo profilesSimpleInfo = new ProfilesSimpleInfo();
        this.j = profilesSimpleInfo;
        profilesSimpleInfo.Kb(y501.a().c(group));
        this.e = group.d;
        this.f = group.e;
        this.k = false;
        this.l = true;
        this.m = group.C();
        int i = group.n;
        this.p = i == 1 || i == 2;
        this.q = group.y.b;
        this.s = group.P;
        this.w = group.n0;
        this.b = Ab().d();
        this.r = group.V;
    }

    public Target(@NonNull JSONObject jSONObject) {
        this.c = UserId.d;
        ProfilesSimpleInfo profilesSimpleInfo = new ProfilesSimpleInfo();
        this.j = profilesSimpleInfo;
        this.r = false;
        this.t = "";
        this.u = "";
        this.v = UserSex.UNKNOWN;
        long optLong = jSONObject.optLong("id");
        this.c = fkq0.a(new UserId(optLong));
        Dialog dialog = new Dialog();
        this.i = dialog;
        dialog.setId(this.c.b);
        this.d = jSONObject.optString("name");
        this.e = jSONObject.optString("insName");
        String optString = jSONObject.optString("photoUri");
        this.f = optString;
        boolean z = optLong > 0;
        this.k = z;
        this.l = optLong < 0;
        this.m = jSONObject.optBoolean("private");
        this.p = jSONObject.optBoolean("commentsAllowed");
        this.q = jSONObject.optBoolean("verified");
        this.s = jSONObject.optBoolean("donutAvailable");
        String optString2 = jSONObject.optString("first_name");
        this.t = optString2;
        String optString3 = jSONObject.optString("last_name");
        this.u = optString3;
        Integer valueOf = Integer.valueOf(jSONObject.optInt("sex"));
        UserSex.Companion.getClass();
        this.v = UserSex.a.a(valueOf);
        boolean optBoolean = jSONObject.optBoolean("photoIsNft", false);
        this.w = optBoolean;
        if (z) {
            UserProfile userProfile = new UserProfile();
            userProfile.c = this.c;
            userProfile.d = optString2;
            userProfile.f = optString3;
            userProfile.e = this.d;
            userProfile.h = optString;
            userProfile.Y = optBoolean;
            profilesSimpleInfo.Kb(y501.a().l(userProfile));
        } else {
            Group group = new Group();
            group.c = fkq0.e(this.c);
            group.d = this.d;
            group.e = optString;
            group.n0 = optBoolean;
            profilesSimpleInfo.Kb(y501.a().c(group));
        }
        this.b = Ab().d();
    }

    public Target(Serializer serializer) {
        this.c = UserId.d;
        this.j = new ProfilesSimpleInfo();
        this.r = false;
        this.t = "";
        this.u = "";
        this.v = UserSex.UNKNOWN;
        this.c = (UserId) serializer.A(UserId.class.getClassLoader());
        this.d = serializer.H();
        this.e = serializer.H();
        this.f = serializer.H();
        this.g = serializer.p() == 1;
        this.k = serializer.p() == 1;
        this.l = serializer.p() == 1;
        this.m = serializer.p() == 1;
        this.p = serializer.p() == 1;
        this.q = serializer.p() == 1;
        this.s = serializer.m();
        this.t = serializer.H();
        this.u = serializer.H();
        Integer valueOf = Integer.valueOf(serializer.u());
        UserSex.Companion.getClass();
        this.v = UserSex.a.a(valueOf);
        this.h = serializer.m();
        ArrayList B = serializer.B(UserId.class.getClassLoader());
        HashSet hashSet = new HashSet(B.size());
        Iterator it = B.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Objects.requireNonNull(next);
            hashSet.add(next);
        }
        this.b = Collections.unmodifiableSet(hashSet);
        this.w = serializer.m();
        this.r = serializer.m();
    }
}
