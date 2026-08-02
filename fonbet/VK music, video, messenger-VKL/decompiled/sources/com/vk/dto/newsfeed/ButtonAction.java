package com.vk.dto.newsfeed;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.common.links.AwayLink;
import com.vk.core.serialize.Serializer;
import com.vk.dto.articles.AMP;
import org.json.JSONObject;

/* loaded from: classes18.dex */
public class ButtonAction extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ButtonAction> CREATOR = new a();
    public final String b;
    public final int c;
    public final String d;

    @NonNull
    public final AwayLink e;

    @Nullable
    public final AMP f;

    @Nullable
    public final ButtonActionModalPage g;

    public class a extends Serializer.c<ButtonAction> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ButtonAction a(@NonNull Serializer serializer) {
            return new ButtonAction(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ButtonAction[i];
        }
    }

    public ButtonAction(JSONObject jSONObject) {
        AMP amp;
        if (jSONObject.has("target")) {
            this.b = jSONObject.optString("target");
        } else {
            this.b = jSONObject.optString("link_url_target");
        }
        if (jSONObject.has("url")) {
            this.e = new AwayLink(jSONObject.optString("url"), AwayLink.a.a(jSONObject));
        } else {
            this.e = new AwayLink(jSONObject.optString("link_url"), AwayLink.a.a(jSONObject));
        }
        this.c = jSONObject.optInt("group_id");
        String optString = jSONObject.optString("type");
        this.d = optString;
        if (jSONObject.has("amp")) {
            Serializer.c<AMP> cVar = AMP.CREATOR;
            JSONObject optJSONObject = jSONObject.optJSONObject("amp");
            amp = new AMP(optJSONObject.optString("url"), optJSONObject.optInt("views"), optJSONObject.optBoolean("is_favorite"));
        } else {
            amp = null;
        }
        this.f = amp;
        if (!optString.equals("modal_page")) {
            this.g = null;
            return;
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("modal_page");
        if (optJSONObject2 != null) {
            this.g = new ButtonActionModalPage(optJSONObject2);
        } else {
            this.g = null;
        }
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.j0(this.b);
        serializer.S(this.c);
        serializer.j0(this.d);
        serializer.i0(this.e);
        serializer.i0(this.f);
        serializer.i0(this.g);
    }

    public ButtonAction(String str, int i, String str2, @NonNull AwayLink awayLink, @Nullable AMP amp, ButtonActionModalPage buttonActionModalPage) {
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = awayLink;
        this.f = amp;
        this.g = buttonActionModalPage;
    }

    public ButtonAction(Serializer serializer) {
        this.b = serializer.H();
        this.c = serializer.u();
        this.d = serializer.H();
        this.e = (AwayLink) serializer.G(AwayLink.class.getClassLoader());
        this.f = (AMP) serializer.G(AMP.class.getClassLoader());
        this.g = (ButtonActionModalPage) serializer.G(ButtonActionModalPage.class.getClassLoader());
    }
}
