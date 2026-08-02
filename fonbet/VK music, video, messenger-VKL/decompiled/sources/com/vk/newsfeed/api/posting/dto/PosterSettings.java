package com.vk.newsfeed.api.posting.dto;

import android.graphics.Color;
import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintCategories;
import com.vk.dto.newsfeed.entries.Poster;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: PosterSettings.kt */
/* loaded from: classes3.dex */
public final class PosterSettings extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PosterSettings> CREATOR = new b();
    public final List<PosterConfigCategory> b;
    public final Poster.Constants c;
    public final String d;
    public final boolean e;

    /* compiled from: PosterSettings.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static PosterSettings a(JSONObject jSONObject) {
            JSONArray jSONArray;
            int i;
            int i2;
            PosterBackground posterBackground;
            JSONArray optJSONArray;
            ArrayList arrayList = new ArrayList();
            String optString = jSONObject.optString("base_path");
            String optString2 = jSONObject.optString("custom_layer_placeholder");
            boolean optBoolean = jSONObject.optBoolean("custom_enabled", true);
            JSONArray optJSONArray2 = jSONObject.optJSONArray(HintCategories.PARAM_NAME);
            if (optJSONArray2 != null) {
                int length = optJSONArray2.length();
                int i3 = 0;
                while (i3 < length) {
                    JSONObject jSONObject2 = optJSONArray2.getJSONObject(i3);
                    Serializer.c<PosterConfigCategory> cVar = PosterConfigCategory.CREATOR;
                    ArrayList arrayList2 = new ArrayList();
                    JSONArray optJSONArray3 = jSONObject2.optJSONArray("bkgs");
                    if (optJSONArray3 != null) {
                        int length2 = optJSONArray3.length();
                        int i4 = 0;
                        while (i4 < length2) {
                            JSONObject jSONObject3 = optJSONArray3.getJSONObject(i4);
                            UserId userId = PosterBackground.j;
                            try {
                                int i5 = jSONObject3.getInt("id");
                                jSONArray = optJSONArray2;
                                StringBuilder sb = new StringBuilder("#");
                                i = length;
                                sb.append(jSONObject3.optString("main_color"));
                                int parseColor = Color.parseColor(sb.toString());
                                int parseColor2 = Color.parseColor("#" + jSONObject3.optString("text_color"));
                                JSONArray optJSONArray4 = jSONObject3.optJSONArray("preview");
                                Image image = optJSONArray4 != null ? new Image(optJSONArray4, optString) : null;
                                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                                JSONObject optJSONObject = jSONObject3.optJSONObject("urls");
                                i2 = i3;
                                if (optJSONObject != null) {
                                    JSONArray optJSONArray5 = optJSONObject.has("back") ? optJSONObject.optJSONArray("back") : optJSONObject.optJSONArray(X3.i.Z);
                                    ref$ObjectRef.element = optJSONArray5 != null ? new Image(optJSONArray5, optString) : 0;
                                }
                                JSONObject optJSONObject2 = jSONObject3.optJSONObject("urls");
                                posterBackground = new PosterBackground(i5, UserId.d, parseColor2, parseColor, image, (Image) ref$ObjectRef.element, (optJSONObject2 == null || (optJSONArray = optJSONObject2.optJSONArray("front")) == null) ? null : new Image(optJSONArray, optString), jSONObject3.optString("background_name"));
                            } catch (Exception unused) {
                                jSONArray = optJSONArray2;
                                i = length;
                                i2 = i3;
                                posterBackground = null;
                            }
                            if (posterBackground != null) {
                                arrayList2.add(posterBackground);
                            }
                            i4++;
                            optJSONArray2 = jSONArray;
                            length = i;
                            i3 = i2;
                        }
                    }
                    arrayList.add(new PosterConfigCategory(jSONObject2.optString("id"), jSONObject2.optString("name"), arrayList2));
                    i3++;
                    optJSONArray2 = optJSONArray2;
                    length = length;
                }
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("constants");
            return new PosterSettings(arrayList, new Poster.Constants(optJSONObject3.optInt("max_symbols", 160), optJSONObject3.optInt("range_threshold", 104), (float) optJSONObject3.optDouble("font_size_ratio_range_1", 0.0666700005531311d), (float) optJSONObject3.optDouble("line_height_ratio_range_1", 0.07777000218629837d), (float) optJSONObject3.optDouble("font_size_ratio_range_2", 0.0611100010573864d), (float) optJSONObject3.optDouble("line_height_ratio_range_2", 0.07221999764442444d), optJSONObject3.optInt("upload_gen_timeout", 5)), optString2, optBoolean);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<PosterSettings> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PosterSettings a(Serializer serializer) {
            List k = serializer.k(PosterConfigCategory.class);
            if (k == null) {
                k = EmptyList.b;
            }
            Poster.Constants constants = (Poster.Constants) serializer.G(Poster.Constants.class.getClassLoader());
            if (constants == null) {
                constants = Poster.Constants.i;
            }
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new PosterSettings(k, constants, H, serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PosterSettings[i];
        }
    }

    public PosterSettings(List<PosterConfigCategory> list, Poster.Constants constants, String str, boolean z) {
        this.b = list;
        this.c = constants;
        this.d = str;
        this.e = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.W(this.b);
        serializer.i0(this.c);
        serializer.j0(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PosterSettings)) {
            return false;
        }
        PosterSettings posterSettings = (PosterSettings) obj;
        return epx.f(this.c, posterSettings.c) && epx.f(this.b, posterSettings.b) && this.e == posterSettings.e;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c);
    }
}
