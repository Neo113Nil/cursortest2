package com.vk.dto.user;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.ironsource.X3;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.MutualInfo;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.CropPhoto;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.InvisibleLastSeenStatus;
import com.vk.dto.user.ProfileActionButton;
import com.vk.dto.user.ProfileDescription;
import com.vk.dto.user.UserSex;
import com.vk.dto.user.deactivation.Deactivation;
import com.vk.dto.user.deactivation.DeactivationWithMessage;
import com.vk.log.L;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.cqm0;
import xsna.f370;
import xsna.fw3;
import xsna.h5s;
import xsna.ho8;
import xsna.iah0;
import xsna.ixj0;
import xsna.js5;
import xsna.t230;
import xsna.u590;
import xsna.we7;
import xsna.wtw;
import xsna.z230;

/* loaded from: classes18.dex */
public class UserProfile extends t230 implements Serializer.StreamParcelable, wtw {
    public boolean A;

    @NonNull
    public final VerifyInfo B;
    public String C;
    public Deactivation D;

    @Nullable
    public List<ProfileDescription> E;

    @Nullable
    public ProfileActionButton F;
    public boolean G;
    public boolean H;
    public boolean I;
    public String J;
    public int K;

    @Nullable
    public final String L;

    @Nullable
    public String M;

    @Nullable
    public ObjectType N;

    @Nullable
    @Deprecated
    public Image O;

    @Nullable
    public String P;

    @Nullable
    public CropPhoto Q;

    @Nullable
    public ImageStatus R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public UserId c;

    @Nullable
    public String c0;
    public String d;

    @Nullable
    public MutualInfo d0;
    public String e;

    @Nullable
    public SocialButtonType e0;
    public String f;
    public String g;

    @Deprecated
    public String h;

    @NonNull
    public UserSex i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public OnlineInfo n;
    public String o;
    public String p;

    @Nullable
    public String q;
    public String r;

    @NonNull
    public final Bundle s;

    @Nullable
    public final String t;
    public final boolean u;
    public int v;
    public boolean w;
    public boolean x;

    @Nullable
    public Boolean y;
    public boolean z;
    public static final UserProfile f0 = new UserProfile();
    public static final Serializer.c<UserProfile> CREATOR = new a();
    public static final b g0 = new b();

    public enum ObjectType {
        PROFILE,
        USER,
        GROUP,
        APP,
        LINK,
        UNKNOWN;

        public String type = name().toLowerCase(Locale.US);

        ObjectType() {
        }
    }

    public class a extends Serializer.c<UserProfile> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UserProfile a(@NonNull Serializer serializer) {
            return new UserProfile(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserProfile[i];
        }
    }

    public class b extends aay<UserProfile> {
        @Override // xsna.aay
        public final UserProfile a(JSONObject jSONObject) throws JSONException {
            return new UserProfile(jSONObject, ObjectType.UNKNOWN);
        }
    }

    public UserProfile() {
        this.c = UserId.d;
        this.d = "DELETED";
        this.e = "DELETED";
        this.f = "DELETED";
        this.g = null;
        this.h = "http://vkontakte.ru/images/question_c.gif";
        this.i = UserSex.UNKNOWN;
        this.m = false;
        this.n = VisibleStatus.f;
        this.o = "";
        this.p = null;
        this.v = -1;
        this.z = false;
        this.A = false;
        this.B = new VerifyInfo();
        this.T = false;
        this.U = false;
        this.V = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.a0 = false;
        this.b0 = false;
        this.s = new Bundle();
    }

    public static OnlineInfo T(JSONObject jSONObject) {
        VisibleStatus visibleStatus = VisibleStatus.f;
        if (!jSONObject.has("online_info")) {
            return visibleStatus;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("online_info");
            boolean optBoolean = jSONObject2.optBoolean("visible");
            long optLong = jSONObject2.optLong("last_seen") * 1000;
            boolean optBoolean2 = jSONObject2.optBoolean("is_online");
            int optInt = jSONObject2.optInt("app_id");
            boolean optBoolean3 = jSONObject2.optBoolean("is_mobile");
            Platform platform = Platform.WEB;
            if (optBoolean3) {
                platform = Platform.MOBILE;
            }
            Platform platform2 = platform;
            String optString = jSONObject2.optString("status");
            InvisibleLastSeenStatus.Companion.getClass();
            return optBoolean ? new VisibleStatus(optLong, optBoolean2, optInt, platform2) : new InvisibleStatus(InvisibleLastSeenStatus.a.b(optString));
        } catch (JSONException e) {
            L.i(e);
            return visibleStatus;
        }
    }

    public static int e(UserProfile userProfile) {
        if (TextUtils.isEmpty(userProfile.p)) {
            return -1;
        }
        return f(userProfile.p);
    }

    public static int f(String str) {
        String[] split = str.split("\\.");
        int parseInt = Integer.parseInt(split[0]);
        int parseInt2 = Integer.parseInt(split[1]);
        int parseInt3 = split.length > 2 ? Integer.parseInt(split[2]) : 0;
        if (parseInt <= 0 || parseInt2 <= 0 || parseInt3 <= 0) {
            return -1;
        }
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.set(5, parseInt);
        calendar2.set(2, parseInt2 - 1);
        int i2 = i - parseInt3;
        return calendar2.after(calendar) ? i2 - 1 : i2;
    }

    public static char g(String str) {
        if (str == null || str.length() == 0) {
            return ' ';
        }
        return Character.toLowerCase(str.charAt(0));
    }

    public final boolean C() {
        return this.c.b < 0;
    }

    @Nullable
    public final String D() {
        return this.s.getString("name_gen");
    }

    @Override // xsna.wtw
    public final boolean E3(String str) {
        if (this.c.b > 2000000000) {
            String str2 = this.e;
            if (str2 != null) {
                for (String str3 : str2.toLowerCase().split(" ")) {
                    if (str3 != null && str3.startsWith(str)) {
                        return true;
                    }
                }
            }
        } else if (this.e.toLowerCase().startsWith(str) || this.d.toLowerCase().startsWith(str) || this.f.toLowerCase().startsWith(str)) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        return !TextUtils.isEmpty(this.C);
    }

    public final Boolean K() {
        return Boolean.valueOf(this.i == UserSex.FEMALE);
    }

    public final boolean M() {
        int i = this.v;
        return i == 1 || i == 3;
    }

    public void O7(@NonNull Serializer serializer) {
        serializer.e0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.f);
        serializer.j0(this.e);
        serializer.j0(this.q);
        serializer.j0(this.r);
        serializer.j0(this.h);
        serializer.i0(this.n);
        serializer.S(this.i.h());
        serializer.S(this.j ? 1 : 0);
        serializer.S(this.k ? 1 : 0);
        serializer.K(this.s);
        this.B.O7(serializer);
        serializer.S(this.v);
        serializer.S(this.w ? 1 : 0);
        serializer.S(this.x ? 1 : 0);
        serializer.j0(this.C);
        serializer.W(this.E);
        serializer.i0(this.F);
        serializer.L(this.G ? (byte) 1 : (byte) 0);
        serializer.L(this.H ? (byte) 1 : (byte) 0);
        serializer.L(this.I ? (byte) 1 : (byte) 0);
        serializer.j0(this.J);
        serializer.S(this.K);
        serializer.j0(this.M);
        serializer.i0(this.D);
        ObjectType objectType = this.N;
        if (objectType == null) {
            objectType = ObjectType.UNKNOWN;
        }
        serializer.j0(objectType.name());
        serializer.L(this.m ? (byte) 1 : (byte) 0);
        serializer.i0(this.O);
        serializer.j0(this.P);
        serializer.i0(this.R);
        serializer.L(this.S ? (byte) 1 : (byte) 0);
        serializer.L(this.A ? (byte) 1 : (byte) 0);
        serializer.j0(this.p);
        serializer.L(this.T ? (byte) 1 : (byte) 0);
        serializer.L(this.U ? (byte) 1 : (byte) 0);
        serializer.L(this.V ? (byte) 1 : (byte) 0);
        serializer.S(this.W);
        serializer.i0(this.Q);
        serializer.J(this.y);
        serializer.i0(this.d0);
        serializer.L(this.Y ? (byte) 1 : (byte) 0);
        serializer.L(this.Z ? (byte) 1 : (byte) 0);
        serializer.L(this.X ? (byte) 1 : (byte) 0);
        serializer.L(this.a0 ? (byte) 1 : (byte) 0);
        serializer.L(this.b0 ? (byte) 1 : (byte) 0);
        SocialButtonType socialButtonType = this.e0;
        serializer.j0(socialButtonType == null ? null : socialButtonType.name());
        serializer.L(this.u ? (byte) 1 : (byte) 0);
        serializer.j0(this.g);
        serializer.j0(this.c0);
    }

    public void R(JSONObject jSONObject) throws JSONException {
        this.c = new UserId(jSONObject.getLong("id"));
    }

    public final void a0(boolean z) {
        this.s.putBoolean("can_message", z);
    }

    public final boolean d() {
        return this.s.getBoolean("can_message", false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof UserProfile) {
            return Objects.equals(this.c, ((UserProfile) obj).c);
        }
        return false;
    }

    public int hashCode() {
        return Long.hashCode(this.c.b);
    }

    @NonNull
    public final Owner l0() {
        String str;
        UserId userId = this.c;
        if (!BuildInfo.t() || (str = this.L) == null || str.length() == 0) {
            str = this.e;
        }
        Owner owner = new Owner(userId, str, this.g, this.h, this.B, this.O, null, null, null, this.R, this.i, null, null, d(), false, false, false, null, 0, null, null, false, 4184512, null);
        owner.B(this.Y);
        owner.g(4, M());
        Deactivation deactivation = this.D;
        owner.o((deactivation != null ? deactivation.getReason() : null) != null ? true : G());
        owner.n(this.z);
        owner.t = this.K;
        return owner;
    }

    @Nullable
    public final String n() {
        return this.s.getString("first_name_gen");
    }

    @NonNull
    public final String o(int i) {
        return u(iah0.a(i));
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("User {id=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.e);
        sb.append(" [");
        sb.append(this.d);
        sb.append(DomExceptionUtils.SEPARATOR);
        sb.append(this.f);
        sb.append("], photo=");
        sb.append(this.h);
        sb.append(", extra=");
        sb.append(this.s);
        sb.append(", gender=");
        sb.append(this.i.name());
        sb.append(", friend_status=");
        return h5s.c(this.v, "}", sb);
    }

    @NonNull
    public final String u(int i) {
        ImageSize Cb;
        String a2 = js5.a(i, this.g);
        if (a2 != null) {
            return a2;
        }
        Image image = this.O;
        return (image == null || (Cb = image.Cb(i, true, false)) == null) ? this.h : Cb.d.d;
    }

    @Override // xsna.wtw
    public final char[] w7() {
        if (this.c.b <= 2000000000) {
            return new char[]{g(this.d), g(this.f)};
        }
        String str = this.e;
        if (str == null) {
            return new char[]{' '};
        }
        String[] split = str.split(" ");
        int length = split.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = g(split[i]);
        }
        return cArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        Serializer.b.h(this, parcel);
    }

    public UserProfile(UserProfile userProfile) {
        this.c = UserId.d;
        this.d = "DELETED";
        this.e = "DELETED";
        this.f = "DELETED";
        this.g = null;
        this.h = "http://vkontakte.ru/images/question_c.gif";
        this.i = UserSex.UNKNOWN;
        this.m = false;
        this.n = VisibleStatus.f;
        this.o = "";
        this.p = null;
        this.v = -1;
        this.z = false;
        this.A = false;
        VerifyInfo verifyInfo = new VerifyInfo();
        this.B = verifyInfo;
        this.T = false;
        this.U = false;
        this.V = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.a0 = false;
        this.b0 = false;
        this.c = userProfile.c;
        this.d = userProfile.d;
        this.e = userProfile.e;
        this.f = userProfile.f;
        this.g = userProfile.g;
        this.h = userProfile.h;
        this.i = userProfile.i;
        this.j = userProfile.j;
        this.l = userProfile.l;
        this.n = userProfile.n;
        this.o = userProfile.o;
        this.p = userProfile.p;
        this.q = userProfile.q;
        this.r = userProfile.r;
        this.s = userProfile.s;
        verifyInfo.Ab(userProfile.B);
        this.v = userProfile.v;
        this.w = userProfile.w;
        this.x = userProfile.x;
        this.C = userProfile.C;
        this.E = userProfile.E;
        this.F = userProfile.F;
        this.G = userProfile.G;
        this.H = userProfile.H;
        this.I = userProfile.I;
        this.J = userProfile.J;
        this.K = userProfile.K;
        this.M = userProfile.M;
        this.D = userProfile.D;
        this.N = userProfile.N;
        this.k = userProfile.k;
        this.O = userProfile.O;
        this.P = userProfile.P;
        this.R = userProfile.R;
        this.S = userProfile.S;
        this.A = userProfile.A;
        this.T = userProfile.T;
        this.V = userProfile.V;
        this.U = userProfile.U;
        this.W = userProfile.W;
        this.Q = userProfile.Q;
        this.y = userProfile.y;
        a0(userProfile.d());
        this.d0 = userProfile.d0;
        this.Y = userProfile.Y;
        this.Z = userProfile.Z;
        this.X = userProfile.X;
        this.a0 = userProfile.a0;
        this.b0 = userProfile.b0;
        this.e0 = userProfile.e0;
        this.u = userProfile.u;
        this.c0 = userProfile.c0;
    }

    public UserProfile(Serializer serializer) {
        ObjectType valueOf;
        this.c = UserId.d;
        this.d = "DELETED";
        this.e = "DELETED";
        this.f = "DELETED";
        this.g = null;
        this.h = "http://vkontakte.ru/images/question_c.gif";
        this.i = UserSex.UNKNOWN;
        this.m = false;
        this.n = VisibleStatus.f;
        this.o = "";
        this.p = null;
        this.v = -1;
        this.z = false;
        this.A = false;
        VerifyInfo verifyInfo = new VerifyInfo();
        this.B = verifyInfo;
        this.T = false;
        this.U = false;
        this.V = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.a0 = false;
        this.b0 = false;
        this.c = (UserId) serializer.A(UserId.class.getClassLoader());
        this.d = serializer.H();
        this.f = serializer.H();
        this.e = serializer.H();
        this.q = serializer.H();
        this.r = serializer.H();
        this.h = serializer.H();
        this.n = (OnlineInfo) serializer.G(OnlineInfo.class.getClassLoader());
        Integer valueOf2 = Integer.valueOf(serializer.u());
        UserSex.Companion.getClass();
        this.i = UserSex.a.a(valueOf2);
        this.j = serializer.u() == 1;
        this.k = serializer.u() == 1;
        Bundle o = serializer.o(UserProfile.class.getClassLoader());
        this.s = o == null ? new Bundle() : o;
        verifyInfo.zb(serializer);
        this.v = serializer.u();
        this.w = serializer.u() == 1;
        this.x = serializer.u() == 1;
        this.C = serializer.H();
        this.E = serializer.l(ProfileDescription.class.getClassLoader());
        this.F = (ProfileActionButton) serializer.G(ProfileActionButton.class.getClassLoader());
        this.G = serializer.m();
        this.H = serializer.m();
        this.I = serializer.m();
        this.J = serializer.H();
        this.K = serializer.u();
        this.M = serializer.H();
        this.D = (Deactivation) serializer.G(Deactivation.class.getClassLoader());
        String H = serializer.H();
        if (H == null) {
            valueOf = ObjectType.UNKNOWN;
        } else {
            valueOf = ObjectType.valueOf(H);
        }
        this.N = valueOf;
        this.m = serializer.m();
        this.O = (Image) serializer.G(Image.class.getClassLoader());
        this.P = serializer.H();
        this.R = (ImageStatus) serializer.G(ImageStatus.class.getClassLoader());
        this.S = serializer.m();
        this.A = serializer.m();
        this.p = serializer.H();
        this.T = serializer.m();
        this.U = serializer.m();
        this.V = serializer.m();
        this.W = serializer.u();
        this.Q = (CropPhoto) serializer.G(CropPhoto.class.getClassLoader());
        this.y = serializer.n();
        this.d0 = (MutualInfo) serializer.G(MutualInfo.class.getClassLoader());
        this.Y = serializer.m();
        this.Z = serializer.m();
        this.X = serializer.m();
        this.a0 = serializer.m();
        this.b0 = serializer.m();
        this.e0 = SocialButtonType.parse(serializer.H());
        this.u = serializer.m();
        this.g = serializer.H();
        this.c0 = serializer.H();
    }

    public UserProfile(JSONObject jSONObject) throws JSONException {
        this(jSONObject, ObjectType.UNKNOWN);
    }

    public UserProfile(JSONObject jSONObject, ObjectType objectType) throws JSONException {
        VerifyInfo verifyInfo;
        String str;
        CropPhoto.Crop crop;
        Image image;
        ProfileActionButton.Action action;
        ProfileActionButton.ActionType valueOf;
        int i;
        String str2;
        this.c = UserId.d;
        this.d = "DELETED";
        this.e = "DELETED";
        this.f = "DELETED";
        this.g = null;
        this.h = "http://vkontakte.ru/images/question_c.gif";
        UserSex userSex = UserSex.UNKNOWN;
        this.i = userSex;
        this.m = false;
        this.n = VisibleStatus.f;
        this.o = "";
        this.p = null;
        this.v = -1;
        this.z = false;
        this.A = false;
        VerifyInfo verifyInfo2 = new VerifyInfo();
        this.B = verifyInfo2;
        this.T = false;
        this.U = false;
        this.V = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.a0 = false;
        this.b0 = false;
        float b2 = z230.b.b();
        boolean z = z230.a;
        Bundle bundle = new Bundle();
        this.s = bundle;
        if (jSONObject == null) {
            return;
        }
        R(jSONObject);
        if (jSONObject.has("photo_id")) {
            this.t = jSONObject.getString("photo_id");
        }
        this.d = jSONObject.optString("first_name", this.d);
        this.f = jSONObject.optString("last_name", this.f);
        this.q = jSONObject.optString(X3.j.D);
        jSONObject.optInt("country", 0);
        if (jSONObject.has("city")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("city");
            optJSONObject.optInt("id", 0);
            bundle.putString("city_name", optJSONObject.optString("title"));
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("career");
        if (!TextUtils.isEmpty(jSONObject.optString("university_name"))) {
            str = jSONObject.getString("university_name").replace("\r\n", "").trim();
            if (jSONObject.optInt("graduation", 0) > 0) {
                StringBuilder e = fw3.e(str);
                e.append(String.format(" '%02d", Integer.valueOf(jSONObject.getInt("graduation") % 100)));
                str = e.toString();
            }
            verifyInfo = verifyInfo2;
        } else {
            verifyInfo = verifyInfo2;
            if (optJSONObject2 != null && optJSONObject2.has("company")) {
                str = jSONObject.getJSONObject("career").getString("company").replace("\r\n", "").trim();
            } else if (jSONObject.has("country")) {
                str = jSONObject.getJSONObject("country").getString("title");
                if (jSONObject.has("city")) {
                    StringBuilder b3 = ho8.b(str, ", ");
                    b3.append(jSONObject.getJSONObject("city").getString("title"));
                    str = b3.toString();
                }
            } else {
                str = null;
            }
        }
        this.r = str;
        this.e = this.d + " " + this.f;
        if (jSONObject.has("contact")) {
            JSONObject optJSONObject3 = jSONObject.optJSONObject("contact");
            if (optJSONObject3 == null) {
                str2 = "";
            } else {
                str2 = optJSONObject3.optString("name");
            }
            this.L = TextUtils.isEmpty(str2) ? null : str2;
        }
        this.h = we7.q(jSONObject, b2, z);
        Serializer.c<Image> cVar = Image.CREATOR;
        this.O = Image.b.b(jSONObject);
        Integer valueOf2 = Integer.valueOf(jSONObject.optInt("sex", userSex.h()));
        UserSex.Companion.getClass();
        this.i = UserSex.a.a(valueOf2);
        this.n = T(jSONObject);
        if (jSONObject.has("first_name_gen")) {
            bundle.putString("first_name_gen", jSONObject.getString("first_name_gen"));
            if (jSONObject.has("last_name_gen")) {
                bundle.putString("name_gen", jSONObject.getString("first_name_gen") + " " + jSONObject.getString("last_name_gen"));
            }
        }
        if (jSONObject.has("first_name_dat")) {
            bundle.putString("first_name_dat", jSONObject.getString("first_name_dat"));
            if (jSONObject.has("last_name_dat")) {
                bundle.putString("name_dat", jSONObject.getString("first_name_dat") + " " + jSONObject.getString("last_name_dat"));
            }
        }
        if (jSONObject.has("first_name_acc")) {
            bundle.putString("first_name_acc", jSONObject.getString("first_name_acc"));
            if (jSONObject.has("last_name_acc")) {
                bundle.putString("name_acc", jSONObject.getString("first_name_acc") + " " + jSONObject.getString("last_name_acc"));
            }
        }
        if (jSONObject.has("first_name_ins") && jSONObject.has("last_name_ins")) {
            bundle.putString("first_name_ins", jSONObject.getString("first_name_ins"));
            if (jSONObject.has("last_name_ins")) {
                bundle.putString("name_ins", jSONObject.getString("first_name_ins") + " " + jSONObject.getString("last_name_ins"));
            }
        }
        if (jSONObject.has("first_name_abl") && jSONObject.has("last_name_abl")) {
            bundle.putString("first_name_abl", jSONObject.getString("first_name_abl"));
            if (jSONObject.has("last_name_abl")) {
                bundle.putString("name_abl", jSONObject.getString("first_name_abl") + " " + jSONObject.getString("last_name_abl"));
            }
        }
        if (jSONObject.has("university_name") && jSONObject.getString("university_name").length() > 0) {
            this.o = jSONObject.getString("university_name").trim();
            if (jSONObject.has("graduation") && (i = jSONObject.getInt("graduation")) > 0) {
                this.o += String.format(" '%02d", Integer.valueOf(i % 100));
            }
        } else if (jSONObject.has("city")) {
            this.o = jSONObject.getJSONObject("city").getString("title");
        }
        if (jSONObject.has("can_subscribe_stories")) {
            this.U = jSONObject.optBoolean("can_subscribe_stories");
        }
        if (jSONObject.has("is_subscribed_stories")) {
            this.V = jSONObject.optBoolean("is_subscribed_stories");
        }
        if (jSONObject.has("is_government_organization")) {
            bundle.putBoolean("is_government_organization", jSONObject.optBoolean("is_government_organization"));
        }
        verifyInfo.Bb(jSONObject);
        if (jSONObject.has("is_friend")) {
            this.j = jSONObject.getInt("is_friend") == 1;
        }
        if (jSONObject.has("is_favorite")) {
            this.k = jSONObject.getInt("is_favorite") == 1;
        }
        if (jSONObject.has("is_messages_blocked")) {
            bundle.putBoolean("is_messages_blocked", jSONObject.getInt("is_messages_blocked") == 1);
        }
        if (jSONObject.has("friend_status")) {
            this.v = jSONObject.getInt("friend_status");
        }
        if (jSONObject.has("is_video_live_notifications_blocked")) {
            this.w = jSONObject.getInt("is_video_live_notifications_blocked") == 1;
        }
        if (jSONObject.has("can_send_friend_request")) {
            this.x = jSONObject.getInt("can_send_friend_request") == 1;
        }
        if (jSONObject.has("can_call")) {
            this.y = Boolean.valueOf(jSONObject.getBoolean("can_call"));
        }
        if (jSONObject.has("bdate")) {
            this.p = jSONObject.getString("bdate");
        }
        if (jSONObject.has("descriptions")) {
            JSONArray jSONArray = jSONObject.getJSONArray("descriptions");
            Serializer.c<ProfileDescription> cVar2 = ProfileDescription.CREATOR;
            this.E = ProfileDescription.a.b(jSONArray);
        } else if (jSONObject.has("description")) {
            Serializer.c<ProfileDescription> cVar3 = ProfileDescription.CREATOR;
            this.E = Collections.singletonList(ProfileDescription.a.a(jSONObject.get("description")));
        }
        if (jSONObject.has("button")) {
            Serializer.c<ProfileActionButton> cVar4 = ProfileActionButton.CREATOR;
            JSONObject jSONObject2 = jSONObject.getJSONObject("button");
            String a2 = cqm0.a(jSONObject2.optString("type"));
            ProfileActionButton.Type type = (a2 == null || (type = ProfileActionButton.Type.valueOf(a2.toUpperCase(Locale.ROOT))) == null) ? ProfileActionButton.Type.ADD : type;
            String a3 = cqm0.a(jSONObject2.optString("icon"));
            ProfileActionButton.Icon valueOf3 = a3 != null ? ProfileActionButton.Icon.valueOf(a3.toUpperCase(Locale.ROOT)) : null;
            JSONObject optJSONObject4 = jSONObject2.optJSONObject("action");
            if (optJSONObject4 != null) {
                Serializer.c<ProfileActionButton.Action> cVar5 = ProfileActionButton.Action.CREATOR;
                String a4 = cqm0.a(optJSONObject4.optString("type"));
                action = new ProfileActionButton.Action((a4 == null || (valueOf = ProfileActionButton.ActionType.valueOf(a4.toUpperCase(Locale.ROOT))) == null) ? ProfileActionButton.ActionType.ADD_FRIEND : valueOf, new UserId(optJSONObject4.optLong("user_id")));
            } else {
                action = null;
            }
            this.F = new ProfileActionButton(type, valueOf3, action);
        }
        bundle.putBoolean("can_message", jSONObject.optInt("can_write_private_message", 1) == 1);
        this.C = jSONObject.optString("deactivated");
        this.G = jSONObject.optInt("blacklisted") != 0;
        this.H = jSONObject.optInt("blacklisted_by_me") != 0;
        this.J = jSONObject.optString("track_code");
        this.K = jSONObject.optInt("followers_count");
        this.M = jSONObject.optString("status", null);
        this.z = jSONObject.optBoolean("is_closed", false);
        String D = f370.D(jSONObject, "photo_max_orig");
        this.P = D;
        if (D == null && (image = this.O) != null) {
            this.P = ixj0.h(image.b);
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("owner_state");
        if (optJSONObject5 != null) {
            this.D = new DeactivationWithMessage.a(new u590(optJSONObject5, this.P)).a();
        } else {
            String optString = jSONObject.optString("deactivated");
            if (optString != null && !optString.isEmpty()) {
                DeactivationWithMessage.a aVar = new DeactivationWithMessage.a();
                aVar.b(optString);
                this.D = aVar.a();
            } else {
                this.D = null;
            }
        }
        this.N = objectType;
        this.R = com.vk.dto.user.a.b(jSONObject);
        this.S = jSONObject.optInt("has_photo", 1) == 1;
        this.A = jSONObject.optBoolean("is_dead");
        this.T = jSONObject.optBoolean("has_unseen_stories");
        this.W = jSONObject.optInt("clips_count", 0);
        if (jSONObject.has("crop_photo")) {
            Serializer.c<CropPhoto> cVar6 = CropPhoto.CREATOR;
            JSONObject jSONObject3 = jSONObject.getJSONObject("crop_photo");
            JSONObject optJSONObject6 = jSONObject3.optJSONObject("photo");
            Photo photo = (optJSONObject6 == null || (photo = (Photo) Photo.R.a(optJSONObject6)) == null) ? new Photo(Image.d) : photo;
            JSONObject optJSONObject7 = jSONObject3.optJSONObject("crop");
            if (optJSONObject7 != null) {
                crop = new CropPhoto.Crop((float) optJSONObject7.optDouble("x"), (float) optJSONObject7.optDouble("y"), (float) optJSONObject7.optDouble("x2"), (float) optJSONObject7.optDouble("y2"));
            } else {
                crop = new CropPhoto.Crop();
            }
            this.Q = new CropPhoto(photo, crop);
        }
        JSONObject optJSONObject8 = jSONObject.optJSONObject("mutual");
        if (optJSONObject8 != null) {
            this.d0 = new MutualInfo(optJSONObject8);
        }
        this.Y = jSONObject.optBoolean("is_nft", false);
        this.Z = jSONObject.optBoolean("can_ban", false);
        this.X = jSONObject.optBoolean("is_verified");
        this.a0 = jSONObject.optBoolean("is_followers_mode_on", false);
        this.b0 = jSONObject.has("is_followers_mode_on");
        this.e0 = SocialButtonType.parse(jSONObject.optString("social_button_type"));
        this.u = jSONObject.optBoolean("co_ownership_enabled", false);
        this.g = jSONObject.optString("photo_base", "");
        this.c0 = jSONObject.optString("thumb_hash", null);
    }

    public UserProfile(Group group) {
        this.c = UserId.d;
        this.d = "DELETED";
        this.e = "DELETED";
        this.f = "DELETED";
        this.g = null;
        this.h = "http://vkontakte.ru/images/question_c.gif";
        this.i = UserSex.UNKNOWN;
        this.m = false;
        this.n = VisibleStatus.f;
        this.o = "";
        this.p = null;
        this.v = -1;
        this.z = false;
        this.A = false;
        VerifyInfo verifyInfo = new VerifyInfo();
        this.B = verifyInfo;
        this.T = false;
        this.U = false;
        this.V = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.a0 = false;
        this.b0 = false;
        String str = group.d;
        this.d = str;
        this.f = str;
        this.e = str;
        this.j = group.j;
        this.g = group.f;
        this.h = group.e;
        this.O = group.g;
        this.c = new UserId(-group.c.b);
        this.q = group.h;
        this.w = group.D;
        verifyInfo.Ab(group.y);
        this.N = ObjectType.GROUP;
        this.J = group.O;
        Bundle bundle = new Bundle();
        this.s = bundle;
        bundle.putBoolean("can_message", group.t);
        bundle.putParcelable("group_likes", group.T);
        bundle.putString("group_members_formatted", group.x);
        bundle.putString("group_activity", group.z);
        bundle.putBoolean("is_government_organization", group.V);
        this.T = group.U;
        this.W = group.d0;
        this.Y = group.n0;
        this.u = false;
    }

    public UserProfile(@NonNull Owner owner) {
        this.c = UserId.d;
        this.d = "DELETED";
        this.e = "DELETED";
        this.f = "DELETED";
        this.g = null;
        this.h = "http://vkontakte.ru/images/question_c.gif";
        this.i = UserSex.UNKNOWN;
        this.m = false;
        this.n = VisibleStatus.f;
        this.o = "";
        this.p = null;
        this.v = -1;
        this.z = false;
        this.A = false;
        VerifyInfo verifyInfo = new VerifyInfo();
        this.B = verifyInfo;
        this.T = false;
        this.U = false;
        this.V = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.a0 = false;
        this.b0 = false;
        this.c = owner.b;
        this.e = owner.c;
        this.d = owner.m;
        this.f = owner.n;
        verifyInfo.Ab(owner.f);
        this.g = owner.d;
        this.h = owner.e;
        this.O = owner.g;
        this.R = owner.k;
        this.i = owner.l;
        this.Y = owner.i(1024);
        this.s = new Bundle();
        if (owner.i(4) && !owner.i(512)) {
            this.v = 1;
        } else if (owner.i(512)) {
            this.j = true;
            this.v = 3;
        } else {
            this.v = 0;
        }
        this.z = owner.i(16);
    }
}
