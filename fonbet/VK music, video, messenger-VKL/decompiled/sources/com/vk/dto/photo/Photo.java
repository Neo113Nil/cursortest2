package com.vk.dto.photo;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.O6;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.nft.Nft;
import com.vk.dto.nft.NftMediaType;
import com.vk.dto.nft.NftMeta;
import com.vk.dto.photo.PhotoScaleType;
import com.vk.dto.photo.PhotoTag;
import com.vk.dto.tags.Tag;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.fkq0;
import xsna.ixj0;

/* loaded from: classes18.dex */
public class Photo extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<Photo> CREATOR = new a();
    public static final b R = new b();
    public final double A;

    @Nullable
    public UserProfile B;
    public int C;
    public final boolean D;
    public transient boolean E;
    public final Rect F;
    public final int G;
    public final int H;
    public boolean I;

    @Nullable
    public ImageSize J;

    @Nullable
    public final ImageSize K;

    @Nullable
    public PhotoRestriction L;

    @NonNull
    public final PhotoScaleType M;

    @Nullable
    public NftMeta N;

    @Nullable
    public Boolean O;

    @Nullable
    public final String P;

    @Nullable
    public final ArrayList Q;
    public List<PhotoTag> b;
    public int c;
    public int d;
    public UserId e;
    public UserId f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final boolean p;
    public boolean q;
    public boolean r;
    public String s;

    @Nullable
    public String t;
    public String u;
    public String v;
    public String w;
    public List<Tag> x;

    @NonNull
    public final Image y;
    public final double z;

    public class a extends Serializer.c<Photo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Photo a(Serializer serializer) {
            return new Photo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Photo[i];
        }
    }

    public class b extends aay<Photo> {
        @Override // xsna.aay
        @Nullable
        public final Photo a(JSONObject jSONObject) throws JSONException {
            try {
                return new Photo(jSONObject);
            } catch (JSONException e) {
                L.C("Can't correct parse Photo", e);
                return null;
            }
        }
    }

    public Photo(int i, int i2, UserId userId, UserId userId2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, String str2, String str3, String str4, @NonNull Image image, double d, double d2, int i8, boolean z7, int i9, boolean z8, @Nullable ImageSize imageSize, @Nullable ImageSize imageSize2, @Nullable PhotoRestriction photoRestriction, @NonNull PhotoScaleType photoScaleType, @Nullable Boolean bool, @Nullable String str5) {
        this.b = Collections.EMPTY_LIST;
        UserId userId3 = UserId.d;
        this.e = userId3;
        this.f = userId3;
        this.l = false;
        this.m = false;
        this.o = true;
        this.p = true;
        this.q = true;
        this.r = false;
        this.x = new ArrayList();
        this.z = -9000.0d;
        this.A = -9000.0d;
        this.E = false;
        this.H = -1;
        PhotoScaleType.a aVar = PhotoScaleType.Companion;
        this.c = i;
        this.d = i2;
        this.e = userId;
        this.f = userId2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = i6;
        this.k = i7;
        this.l = z;
        this.n = z2;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.r = z6;
        this.t = str;
        this.u = str2;
        this.v = str3;
        this.w = str4;
        this.y = image;
        this.z = d;
        this.A = d2;
        this.C = i8;
        this.D = z7;
        this.H = i9;
        this.I = z8;
        this.J = imageSize;
        this.K = imageSize2;
        this.L = photoRestriction;
        this.M = photoScaleType;
        this.O = bool;
        this.P = str5;
    }

    public static UserId Bb(JSONObject jSONObject, String str, boolean z) {
        Object opt = jSONObject.opt(str);
        if (opt == null) {
            return UserId.d;
        }
        if ((opt instanceof JSONObject) && !z) {
            return Bb((JSONObject) opt, "value", true);
        }
        if (opt instanceof Long) {
            return new UserId(((Long) opt).longValue());
        }
        if (opt instanceof Integer) {
            return new UserId(((Integer) opt).longValue());
        }
        if (opt instanceof String) {
            try {
                return new UserId(Long.parseLong((String) opt));
            } catch (NumberFormatException unused) {
            }
        }
        return opt instanceof UserId ? (UserId) opt : UserId.d;
    }

    public static ImageSize Jb(JSONObject jSONObject) {
        char d;
        int optInt = jSONObject.optInt("height");
        int optInt2 = jSONObject.optInt("width");
        String optString = jSONObject.optString("url", jSONObject.optString("src", ""));
        boolean optBoolean = jSONObject.optBoolean("is_base");
        if (optBoolean) {
            d = ImageSizeKey.SIZE_KEY_BASE;
        } else {
            char i = ImageSizeKey.SIZE_M_0130.i();
            ImageSizeKey.Companion.getClass();
            d = ImageSizeKey.a.d(jSONObject, i);
        }
        char c = d;
        if (optInt2 == 0) {
            Character valueOf = Character.valueOf(c);
            ImageSizeKey.Companion.getClass();
            optInt2 = ImageSizeKey.a.f(valueOf);
        }
        int i2 = optInt2;
        if (optInt == 0) {
            ImageSizeKey.Companion.getClass();
            ImageSizeKey b2 = ImageSizeKey.a.b(c);
            optInt = b2 != null ? b2.getHeight() : ImageSizeKey.SIZE_M_0130.getHeight();
        }
        return new ImageSize(optString, i2, optInt, Boolean.valueOf(optBoolean), c);
    }

    @NonNull
    public final ImageSize Ab(int i, int i2) {
        ImageSize imageSize = (ImageSize) ixj0.c(this.y.b, i, i2);
        return imageSize != null ? imageSize : ImageSize.f;
    }

    public final String Cb() {
        return this.e.b + BundleUtil.UNDERLINE_TAG + this.c;
    }

    @NonNull
    public final ImageSize Db(int i, boolean z) {
        Image image = this.y;
        ImageSize Bb = !image.b.isEmpty() ? z ? Image.Bb(i, image.b, false, false, true) : image.Cb(i, false, false) : null;
        return Bb == null ? ImageSize.f : Bb;
    }

    @NonNull
    public final ImageSize Eb(char[] cArr) {
        ImageSize imageSize;
        ArrayList arrayList = this.y.b;
        ImageSize imageSize2 = (ImageSize) ixj0.o(arrayList);
        if (imageSize2 != null) {
            char c = cArr[0];
            ImageSizeKey.Companion.getClass();
            ImageSizeKey b2 = ImageSizeKey.a.b(c);
            if (b2 != null && (imageSize = (ImageSize) ixj0.f(imageSize2, b2.getWidth(), b2.getHeight())) != null) {
                return imageSize;
            }
        }
        if (cArr != null) {
            for (char c2 : cArr) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ImageSize imageSize3 = (ImageSize) it.next();
                    if (imageSize3 != null && imageSize3.b == c2) {
                        return imageSize3;
                    }
                }
            }
        }
        return Fb(ImageSizeKey.SIZE_X_0604.getWidth(), false);
    }

    @NonNull
    public final ImageSize Fb(int i, boolean z) {
        Image image = this.y;
        ImageSize Ab = !image.b.isEmpty() ? z ? image.Ab(i, false) : image.Cb(i, true, false) : null;
        return Ab == null ? ImageSize.f : Ab;
    }

    @Nullable
    public final ImageCropData Gb() {
        ArrayList arrayList = this.Q;
        if (arrayList == null || arrayList.size() < 4) {
            return null;
        }
        return new ImageCropData(String.format("%d_%d", Long.valueOf(this.e.b), Integer.valueOf(this.c)), ((Integer) this.Q.get(0)).intValue(), ((Integer) this.Q.get(1)).intValue(), ((Integer) this.Q.get(2)).intValue(), ((Integer) this.Q.get(3)).intValue());
    }

    public final boolean Hb() {
        PhotoRestriction photoRestriction = this.L;
        return photoRestriction != null && photoRestriction.d;
    }

    public final boolean Ib() {
        return this.L != null;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        serializer.S(this.c);
        serializer.S(this.d);
        serializer.e0(this.e);
        serializer.e0(this.f);
        serializer.S(this.g);
        serializer.S(this.h);
        serializer.S(this.i);
        serializer.S(this.j);
        serializer.S(this.k);
        serializer.S(this.l ? 1 : 0);
        serializer.S(this.n ? 1 : 0);
        serializer.S(this.o ? 1 : 0);
        serializer.S(this.p ? 1 : 0);
        serializer.L(this.q ? (byte) 1 : (byte) 0);
        serializer.L(this.r ? (byte) 1 : (byte) 0);
        serializer.j0(this.s);
        serializer.j0(this.t);
        serializer.j0(this.w);
        serializer.j0(this.u);
        serializer.O(this.z);
        serializer.O(this.A);
        serializer.j0(this.v);
        Rect rect = this.F;
        if (rect == null) {
            serializer.L((byte) 0);
        } else {
            serializer.L((byte) 1);
            serializer.S(rect.left);
            serializer.S(rect.top);
            serializer.S(rect.right);
            serializer.S(rect.bottom);
        }
        serializer.S(this.G);
        serializer.S(this.C);
        serializer.L(this.D ? (byte) 1 : (byte) 0);
        serializer.S(this.H);
        serializer.i0(this.y);
        serializer.i0(this.B);
        serializer.i0(this.L);
        serializer.W(this.b);
        serializer.L(this.I ? (byte) 1 : (byte) 0);
        serializer.i0(this.J);
        serializer.j0(this.M.h());
        serializer.i0(this.N);
        serializer.J(this.O);
        serializer.m0(this.P);
        serializer.U(this.Q);
        serializer.i0(this.K);
    }

    @NonNull
    public final JSONObject Q3() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.c).put("owner_id", this.e).put("access_key", this.v).put("album_id", this.d).put("user_id", this.f).put("sizes", this.y.Gb()).put("geo_address", this.w).put(O6.s, this.z).put("long", this.A).put("text", this.u);
            ImageSize imageSize = this.J;
            if (imageSize != null) {
                jSONObject.put("orig_photo", imageSize.e5());
            }
            PhotoRestriction photoRestriction = this.L;
            if (photoRestriction != null) {
                jSONObject.put("restrictions", photoRestriction.e5());
            }
            return jSONObject;
        } catch (JSONException e) {
            L.i(e);
            return jSONObject;
        }
    }

    @Override // xsna.bxx
    @NonNull
    public final JSONObject e5() {
        return Q3();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Photo photo = (Photo) obj;
            if (this.c == photo.c && Objects.equals(this.e, photo.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), this.e);
    }

    @Nullable
    public final Nft zb() {
        if (this.N == null) {
            return null;
        }
        UserId userId = this.e;
        NftMeta nftMeta = this.N;
        return new Nft(userId, nftMeta.c, nftMeta.d, this, nftMeta.e, nftMeta.f, nftMeta.n, nftMeta.o, nftMeta.p, nftMeta.q, null, NftMediaType.IMAGE, null);
    }

    public Photo(@NonNull Image image) {
        this.b = Collections.EMPTY_LIST;
        UserId userId = UserId.d;
        this.e = userId;
        this.f = userId;
        this.l = false;
        this.m = false;
        this.o = true;
        this.p = true;
        this.q = true;
        this.r = false;
        this.x = new ArrayList();
        this.z = -9000.0d;
        this.A = -9000.0d;
        this.E = false;
        this.H = -1;
        this.M = PhotoScaleType.CENTER_CROP;
        this.y = image;
        this.t = ixj0.h(image.b);
    }

    public Photo(Serializer serializer) {
        this.b = Collections.EMPTY_LIST;
        UserId userId = UserId.d;
        this.e = userId;
        this.f = userId;
        this.l = false;
        this.m = false;
        this.o = true;
        this.p = true;
        this.q = true;
        this.r = false;
        this.x = new ArrayList();
        this.z = -9000.0d;
        this.A = -9000.0d;
        this.E = false;
        this.H = -1;
        this.M = PhotoScaleType.CENTER_CROP;
        this.c = serializer.u();
        this.d = serializer.u();
        this.e = (UserId) serializer.A(UserId.class.getClassLoader());
        this.f = (UserId) serializer.A(UserId.class.getClassLoader());
        this.g = serializer.u();
        this.h = serializer.u();
        this.i = serializer.u();
        this.j = serializer.u();
        this.k = serializer.u();
        this.l = serializer.u() == 1;
        this.n = serializer.u() == 1;
        this.o = serializer.u() == 1;
        this.p = serializer.u() == 1;
        this.q = serializer.p() == 1;
        this.r = serializer.m();
        this.s = serializer.H();
        this.t = serializer.H();
        this.w = serializer.H();
        this.u = serializer.H();
        this.z = serializer.r();
        this.A = serializer.r();
        this.v = serializer.H();
        if (serializer.p() != 0) {
            this.F = new Rect(serializer.u(), serializer.u(), serializer.u(), serializer.u());
        } else {
            this.F = null;
        }
        this.G = serializer.u();
        this.C = serializer.u();
        this.D = serializer.p() == 1;
        this.H = serializer.u();
        Image image = (Image) serializer.G(Image.class.getClassLoader());
        this.y = image == null ? Image.d : image;
        this.B = (UserProfile) serializer.G(UserProfile.class.getClassLoader());
        this.L = (PhotoRestriction) serializer.G(PhotoRestriction.class.getClassLoader());
        this.b = serializer.l(PhotoTag.class.getClassLoader());
        this.I = serializer.m();
        this.J = (ImageSize) serializer.G(ImageSize.class.getClassLoader());
        this.M = PhotoScaleType.a(serializer.H());
        this.N = (NftMeta) serializer.G(NftMeta.class.getClassLoader());
        this.O = serializer.n();
        this.P = serializer.I();
        this.Q = serializer.d();
        this.K = (ImageSize) serializer.G(ImageSize.class.getClassLoader());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List<com.vk.dto.photo.PhotoTag>] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    public Photo(JSONObject jSONObject) throws JSONException {
        ?? r9;
        this.b = Collections.EMPTY_LIST;
        UserId userId = UserId.d;
        this.e = userId;
        this.f = userId;
        this.l = false;
        this.m = false;
        this.o = true;
        this.p = true;
        this.q = true;
        this.r = false;
        this.x = new ArrayList();
        this.z = -9000.0d;
        this.A = -9000.0d;
        this.E = false;
        this.H = -1;
        this.M = PhotoScaleType.CENTER_CROP;
        Image image = Image.d;
        this.c = jSONObject.optInt("id", jSONObject.optInt("pid"));
        this.e = Bb(jSONObject, "owner_id", false);
        UserId Bb = Bb(jSONObject, "user_id", false);
        this.f = Bb;
        if (Bb.b == 100 || !fkq0.c(Bb)) {
            this.f = this.e;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("crop_data");
        if (optJSONArray != null) {
            this.Q = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.Q.add(Integer.valueOf(optJSONArray.getInt(i)));
            }
        }
        this.d = jSONObject.optInt("album_id");
        this.u = jSONObject.optString("text", "");
        this.v = jSONObject.optString("access_key");
        this.g = jSONObject.optInt("date", jSONObject.optInt("created"));
        if (jSONObject.has("comments")) {
            this.j = jSONObject.getJSONObject("comments").getInt("count");
        }
        if (jSONObject.has("tags")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("tags");
            this.k = jSONObject2.optInt("count");
            JSONArray optJSONArray2 = jSONObject2.optJSONArray("items");
            if (optJSONArray2 != null) {
                r9 = new ArrayList(optJSONArray2.length());
                int length = optJSONArray2.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject3 = optJSONArray2.getJSONObject(i2);
                    Serializer.c<PhotoTag> cVar = PhotoTag.CREATOR;
                    r9.add(PhotoTag.a.a(jSONObject3));
                }
            } else {
                r9 = Collections.EMPTY_LIST;
            }
            this.b = r9;
        }
        this.l = jSONObject.has("comments") && jSONObject.has("tags") && jSONObject.has("can_be_owner_photo") && jSONObject.has("orig_photo");
        if (jSONObject.has("likes")) {
            this.h = jSONObject.getJSONObject("likes").getInt("count");
            this.n = jSONObject.getJSONObject("likes").getInt("user_likes") == 1;
        }
        if (jSONObject.has("reposts")) {
            this.i = jSONObject.getJSONObject("reposts").getInt("count");
        }
        this.o = jSONObject.optInt("can_comment", 1) == 1;
        this.p = jSONObject.optInt("can_like", 1) == 1;
        this.q = jSONObject.optInt("can_repost", 1) == 1;
        this.r = jSONObject.optBoolean("has_tags", false);
        if (jSONObject.has("sizes")) {
            JSONArray jSONArray = jSONObject.getJSONArray("sizes");
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                arrayList.add(Jb(jSONArray.getJSONObject(i3)));
            }
            image = new Image(arrayList);
        }
        if (jSONObject.has(O6.s) && jSONObject.has("long")) {
            this.z = jSONObject.getDouble(O6.s);
            this.A = jSONObject.getDouble("long");
        }
        if (jSONObject.has("can_be_owner_photo")) {
            this.I = jSONObject.getInt("can_be_owner_photo") == 1;
        }
        if (jSONObject.has("orig_photo")) {
            this.J = Jb(jSONObject.getJSONObject("orig_photo"));
        }
        if (jSONObject.has("photo_before_crop")) {
            this.K = Jb(jSONObject.getJSONObject("photo_before_crop"));
        }
        this.v = jSONObject.optString("access_key");
        this.C = jSONObject.optInt("post_id");
        this.D = jSONObject.optInt("hidden", 0) == 1;
        this.H = jSONObject.optInt("real_offset", -1);
        this.w = jSONObject.optString("geo_address", null);
        this.y = image;
        this.t = ixj0.h(image.b);
        JSONObject optJSONObject = jSONObject.optJSONObject("restrictions");
        if (optJSONObject != null) {
            this.L = (PhotoRestriction) PhotoRestriction.f.a(optJSONObject);
        }
        this.M = PhotoScaleType.a(jSONObject.optString("vertical_align"));
        if (jSONObject.has("nft")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("nft");
            Serializer.c<NftMeta> cVar2 = NftMeta.CREATOR;
            this.N = NftMeta.a.a(jSONObject4);
        }
        this.O = Boolean.valueOf(jSONObject.optBoolean("feed_pinned"));
        this.P = jSONObject.optString("thumb_hash");
    }
}
