package com.vk.api.base;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.wc6;

/* loaded from: classes14.dex */
public class Document extends Serializer.StreamParcelableAdapter implements Parcelable, wc6, bxx {
    public static final Serializer.c<Document> CREATOR = new a();
    public static final b u = new b();
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public long g;
    public UserId h;
    public int i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public byte[] r;

    @Nullable
    public String s;

    @Nullable
    public Image t;

    public class a extends Serializer.c<Document> {
        @Override // com.vk.core.serialize.Serializer.c
        @Nullable
        public final Document a(Serializer serializer) {
            return new Document(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Document[i];
        }
    }

    public class b extends aay<Document> {
        @Override // xsna.aay
        public final Document a(JSONObject jSONObject) throws JSONException {
            return new Document(jSONObject);
        }
    }

    public Document() {
        this.h = UserId.d;
    }

    @Override // xsna.wc6
    public final int D() {
        return this.c;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.e0(this.h);
        serializer.Y(this.g);
        serializer.j0(this.k);
        serializer.j0(this.l);
        serializer.j0(this.m);
        serializer.j0(this.n);
        serializer.j0(this.j);
        serializer.S(this.c);
        serializer.j0(this.s);
        serializer.S(this.d);
        serializer.S(this.e);
        serializer.j0(this.o);
        serializer.S(this.i);
        serializer.i0(this.t);
    }

    @Override // xsna.wc6
    public final String P7() {
        return this.m;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("owner_id", this.h).put("id", this.b).put("width", this.d).put("height", this.e).put("size", this.g).put("title", this.l).put("thumb", this.n).put("ext", this.m).put("video", this.s).put("url", this.k).put("web_preview_url", this.j).put("type", this.i).put("date", this.c);
            if (this.t == null) {
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("sizes", this.t.Gb());
            jSONObject2.put("photo", jSONObject3);
            jSONObject.put("preview", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            L.i(e);
            return jSONObject;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Document) {
            Document document = (Document) obj;
            if (Objects.equals(document.h, this.h) && document.b == this.b) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.wc6
    public final long getSize() {
        return this.g;
    }

    @Override // xsna.wc6
    public final String getTitle() {
        return this.l;
    }

    public Document(Serializer serializer) {
        this.h = UserId.d;
        this.b = serializer.u();
        this.h = (UserId) serializer.A(UserId.class.getClassLoader());
        this.g = serializer.w();
        this.k = serializer.H();
        this.l = serializer.H();
        this.m = serializer.H();
        this.n = serializer.H();
        this.j = serializer.H();
        this.c = serializer.u();
        this.s = serializer.H();
        this.d = serializer.u();
        this.e = serializer.u();
        this.o = serializer.H();
        this.i = serializer.u();
        this.t = (Image) serializer.G(Image.class.getClassLoader());
    }

    public Document(JSONObject jSONObject) {
        String str;
        this.h = UserId.d;
        try {
            this.i = jSONObject.optInt("type");
            this.b = jSONObject.optInt("id", jSONObject.optInt("did"));
            this.h = new UserId(jSONObject.getLong("owner_id"));
            this.l = jSONObject.getString("title");
            this.g = jSONObject.getLong("size");
            this.m = jSONObject.getString("ext");
            this.k = jSONObject.getString("url");
            this.j = jSONObject.optString("web_preview_url");
            this.o = jSONObject.optString("access_key");
            this.n = jSONObject.optString("thumb");
            JSONObject optJSONObject = jSONObject.optJSONObject("preview");
            if (optJSONObject != null) {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("video");
                String str2 = "o";
                if (optJSONObject2 != null) {
                    this.s = optJSONObject2.optString("src");
                    this.d = optJSONObject2.optInt("width");
                    this.e = optJSONObject2.optInt("height");
                    str = "o";
                } else {
                    str = InneractiveMediationDefs.GENDER_MALE;
                }
                JSONObject optJSONObject3 = optJSONObject.optJSONObject("graffiti");
                if (optJSONObject3 != null) {
                    this.d = optJSONObject3.optInt("width");
                    this.e = optJSONObject3.optInt("height");
                } else {
                    str2 = str;
                }
                JSONObject optJSONObject4 = optJSONObject.optJSONObject("photo");
                if (optJSONObject4 != null) {
                    Image image = new Image(optJSONObject4.optJSONArray("sizes"));
                    this.t = image;
                    if (!image.b.isEmpty()) {
                        ArrayList arrayList = this.t.b;
                        int size = arrayList.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            ImageSize imageSize = (ImageSize) arrayList.get(i);
                            if (str2.charAt(0) == imageSize.b) {
                                com.vk.dto.common.im.Image image2 = imageSize.d;
                                this.n = image2.d;
                                if (this.d == 0) {
                                    this.d = image2.b;
                                }
                                if (this.e == 0) {
                                    this.e = image2.c;
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                }
                JSONObject optJSONObject5 = optJSONObject.optJSONObject("audio_msg");
                if (optJSONObject5 != null) {
                    this.p = optJSONObject5.optString("link_ogg");
                    this.q = optJSONObject5.optString("link_mp3");
                    this.f = optJSONObject5.optInt("duration");
                    JSONArray jSONArray = optJSONObject5.getJSONArray("waveform");
                    if (jSONArray != null) {
                        this.r = new byte[jSONArray.length()];
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            this.r[i2] = (byte) jSONArray.optInt(i2);
                        }
                    }
                }
            }
            this.c = jSONObject.getInt("date");
        } catch (Exception e) {
            L.g("Error parsing doc", e);
        }
    }
}
