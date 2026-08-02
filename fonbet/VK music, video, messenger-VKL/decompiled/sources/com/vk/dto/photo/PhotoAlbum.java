package com.vk.dto.photo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.z230;

/* loaded from: classes18.dex */
public class PhotoAlbum extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PhotoAlbum> CREATOR = new a();
    public int b;
    public UserId c;
    public int d;
    public int e;
    public int f;
    public String g;
    public String h;
    public List<PrivacySetting.PrivacyRule> i;
    public List<PrivacySetting.PrivacyRule> j;
    public String k;
    public String l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public final String r;
    public PhotoRestriction s;
    public boolean t;

    @NonNull
    public Image u;

    @Nullable
    public final String v;
    public boolean w;
    public boolean x;
    public Image y;
    public int z;

    public class a extends Serializer.c<PhotoAlbum> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PhotoAlbum a(Serializer serializer) {
            return new PhotoAlbum(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PhotoAlbum[i];
        }
    }

    public PhotoAlbum() {
        this.c = UserId.d;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = "";
        this.l = "";
        this.u = Image.d;
        this.z = 0;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.e0(this.c);
        serializer.S(this.d);
        serializer.S(this.e);
        serializer.S(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.f0(this.i);
        serializer.f0(this.j);
        serializer.j0(this.k);
        serializer.S(this.n ? 1 : 0);
        serializer.S(this.o ? 1 : 0);
        serializer.S(this.p ? 1 : 0);
        serializer.S(this.q ? 1 : 0);
        serializer.j0(this.r);
        serializer.j0(this.l);
        serializer.i0(this.s);
        serializer.S(this.t ? 1 : 0);
        serializer.i0(this.u);
        serializer.L(this.w ? (byte) 1 : (byte) 0);
        serializer.i0(this.y);
        serializer.S(this.z);
        serializer.S(this.m);
        serializer.L(this.x ? (byte) 1 : (byte) 0);
        serializer.j0(this.v);
    }

    public final void m(String str) {
        this.g = str;
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (!Character.isWhitespace(codePointAt)) {
                return;
            } else {
                i += Character.charCount(codePointAt);
            }
        }
        this.g = z230.b.getContext().getResources().getString(R.string.album_unnamed);
    }

    public PhotoAlbum(JSONObject jSONObject) {
        this.c = UserId.d;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = "";
        this.l = "";
        this.u = Image.d;
        this.z = 0;
        try {
            this.e = jSONObject.optInt("created");
            this.d = jSONObject.optInt("updated");
            m(jSONObject.getString("title"));
            this.h = jSONObject.optString("description", "");
            this.b = jSONObject.getInt("id");
            this.c = new UserId(jSONObject.getLong("owner_id"));
            this.n = jSONObject.optInt("can_upload") > 0;
            this.f = jSONObject.getInt("size");
            this.o = jSONObject.optInt("upload_by_admins_only", 0) == 1;
            this.p = jSONObject.optInt("comments_disabled", 0) == 1;
            this.q = jSONObject.optInt("thumb_is_last", 0) == 1;
            JSONObject optJSONObject = jSONObject.optJSONObject("privacy_view");
            if (optJSONObject != null) {
                List<PrivacySetting.PrivacyRule> list = this.i;
                Serializer.c<PrivacySetting> cVar = PrivacySetting.CREATOR;
                list.addAll(z230.b.a(optJSONObject));
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("privacy_comment");
            if (optJSONObject2 != null) {
                List<PrivacySetting.PrivacyRule> list2 = this.j;
                Serializer.c<PrivacySetting> cVar2 = PrivacySetting.CREATOR;
                list2.addAll(z230.b.a(optJSONObject2));
            }
            this.k = jSONObject.optString("thumb_src");
            this.r = jSONObject.optString("type");
            this.m = jSONObject.optInt("thumb_id", 0);
            JSONObject optJSONObject3 = jSONObject.optJSONObject("restrictions");
            if (optJSONObject3 != null) {
                this.s = (PhotoRestriction) PhotoRestriction.f.a(optJSONObject3);
            }
            this.t = jSONObject.optBoolean("can_delete");
            if (jSONObject.has("sizes")) {
                JSONArray jSONArray = jSONObject.getJSONArray("sizes");
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(Photo.Jb(jSONArray.getJSONObject(i)));
                }
                this.u = new Image(arrayList);
            }
            this.v = jSONObject.optString("thumb_hash", null);
            this.w = jSONObject.optInt("feed_disabled") == 1;
            this.x = jSONObject.optInt("can_include_to_feed") == 1;
        } catch (Exception e) {
            L.B("vk", "Error parsing photo album", e);
        }
    }

    public PhotoAlbum(Serializer serializer) {
        this.c = UserId.d;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = "";
        this.l = "";
        Image image = Image.d;
        this.u = image;
        this.z = 0;
        this.b = serializer.u();
        this.c = (UserId) serializer.A(UserId.class.getClassLoader());
        this.d = serializer.u();
        this.e = serializer.u();
        this.f = serializer.u();
        this.g = serializer.H();
        this.h = serializer.H();
        this.i = serializer.B(PrivacySetting.PrivacyRule.class.getClassLoader());
        this.j = serializer.B(PrivacySetting.PrivacyRule.class.getClassLoader());
        this.k = serializer.H();
        this.n = serializer.u() == 1;
        this.o = serializer.u() == 1;
        this.p = serializer.u() == 1;
        this.q = serializer.u() == 1;
        this.r = serializer.H();
        String H = serializer.H();
        if (H != null) {
            this.l = H;
        }
        this.s = (PhotoRestriction) serializer.G(PhotoRestriction.class.getClassLoader());
        this.t = serializer.u() == 1;
        Image image2 = (Image) serializer.G(Image.class.getClassLoader());
        this.u = image2 != null ? image2 : image;
        this.w = serializer.m();
        this.y = (Image) serializer.G(Image.class.getClassLoader());
        this.z = serializer.u();
        this.m = serializer.u();
        this.x = serializer.m();
        this.v = serializer.H();
    }
}
