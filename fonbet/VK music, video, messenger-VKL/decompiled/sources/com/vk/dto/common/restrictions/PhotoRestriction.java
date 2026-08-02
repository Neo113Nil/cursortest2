package com.vk.dto.common.restrictions;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;

/* compiled from: PhotoRestriction.kt */
/* loaded from: classes18.dex */
public final class PhotoRestriction extends Restriction implements bxx {
    public static final Serializer.c<PhotoRestriction> CREATOR = new b();
    public static final a f = new a();

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<PhotoRestriction> {
        @Override // xsna.aay
        public final PhotoRestriction a(JSONObject jSONObject) {
            try {
                String string = jSONObject.getString("title");
                String string2 = jSONObject.getString("text");
                boolean z = true;
                if (jSONObject.optInt("blur") != 1) {
                    z = false;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("button");
                return new PhotoRestriction(string, string2, z, optJSONObject != null ? (RestrictionButton) RestrictionButton.e.a(optJSONObject) : null);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<PhotoRestriction> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PhotoRestriction a(Serializer serializer) {
            return new PhotoRestriction(serializer.H(), serializer.H(), serializer.m(), (RestrictionButton) serializer.G(RestrictionButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PhotoRestriction[i];
        }
    }

    public PhotoRestriction(String str, String str2, boolean z, RestrictionButton restrictionButton) {
        super(str, str2, z, restrictionButton);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.i0(this.e);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("title", this.b);
        jSONObject.put("text", this.c);
        jSONObject.put("blur", this.d ? 1 : 0);
        RestrictionButton restrictionButton = this.e;
        if (restrictionButton != null) {
            jSONObject.put("button", restrictionButton.e5());
        }
        return jSONObject;
    }

    @Override // com.vk.dto.common.restrictions.Restriction
    public final String toString() {
        return "PhotoRestriction(title='" + this.b + "', text='" + this.c + "', isBlurred=" + this.d + ", button=" + this.e + ')';
    }
}
