package com.vk.dto.common.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.vk.core.serialize.Serializer;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.ms9;
import xsna.z230;

/* loaded from: classes18.dex */
public class PrivacySetting extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PrivacySetting> CREATOR = new a();
    public String b;
    public String c;
    public String d;
    public List<PrivacyRule> e = new ArrayList();
    public List<String> f = new ArrayList();

    public static abstract class PrivacyRule extends Serializer.StreamParcelableAdapter {
        public abstract String Ab();

        public abstract String Bb();

        public abstract List<String> zb();
    }

    public class a extends Serializer.c<PrivacySetting> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PrivacySetting a(@NonNull Serializer serializer) {
            PrivacySetting privacySetting = new PrivacySetting();
            privacySetting.e = new ArrayList();
            privacySetting.f = new ArrayList();
            privacySetting.b = serializer.H();
            privacySetting.c = serializer.H();
            privacySetting.d = serializer.H();
            privacySetting.e = serializer.l(PrivacyRule.class.getClassLoader());
            privacySetting.f = serializer.h();
            return privacySetting;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PrivacySetting[i];
        }
    }

    public PrivacySetting() {
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.W(this.e);
        serializer.l0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PrivacySetting privacySetting = (PrivacySetting) obj;
            if (Objects.equals(this.b, privacySetting.b) && Objects.equals(this.c, privacySetting.c) && Objects.equals(this.d, privacySetting.d) && Objects.equals(this.e, privacySetting.e) && Objects.equals(this.f, privacySetting.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, this.d, this.e, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrivacySetting{key='");
        sb.append(this.b);
        sb.append("', title='");
        sb.append(this.c);
        sb.append("', sectionKey='");
        sb.append(this.d);
        sb.append("', value=");
        sb.append(this.e);
        sb.append(", possibleRules=");
        return ms9.a('}', sb, this.f);
    }

    public final String zb() {
        ArrayList arrayList = new ArrayList();
        Iterator<PrivacyRule> it = this.e.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().zb());
        }
        return TextUtils.join(StringUtils.COMMA, arrayList);
    }

    public PrivacySetting(JSONObject jSONObject) throws JSONException {
        this.b = jSONObject.getString("key");
        this.c = jSONObject.getString("title");
        this.d = jSONObject.getString("section");
        this.e.addAll(z230.b.a(jSONObject.getJSONObject("value")));
        if (jSONObject.has("supported_categories")) {
            JSONArray jSONArray = jSONObject.getJSONArray("supported_categories");
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f.add(jSONArray.getString(i));
            }
        }
    }

    public PrivacySetting(PrivacySetting privacySetting) {
        this.b = privacySetting.b;
        this.c = privacySetting.c;
        this.d = privacySetting.d;
        this.e.addAll(privacySetting.e);
        this.f.addAll(privacySetting.f);
    }
}
