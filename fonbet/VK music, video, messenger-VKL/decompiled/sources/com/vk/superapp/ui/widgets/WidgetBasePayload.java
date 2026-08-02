package com.vk.superapp.ui.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.widgets.WidgetUpdateLabel;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.epx;
import xsna.zjh0;

/* compiled from: WidgetBasePayload.kt */
/* loaded from: classes6.dex */
public final class WidgetBasePayload implements Parcelable {
    public static final a CREATOR = new a();
    public final String b;
    public final double c;
    public final WidgetUpdateLabel d;
    public final AdditionalHeaderIconBlock e;
    public final HeaderRightImageType f;

    /* compiled from: WidgetBasePayload.kt */
    public static final class a implements Parcelable.Creator<WidgetBasePayload> {
        public static WidgetBasePayload a(JSONObject jSONObject) {
            AdditionalHeaderIconBlock additionalHeaderIconBlock;
            String optString = jSONObject.optString("track_code");
            double optDouble = jSONObject.optDouble("weight", ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
            WidgetUpdateLabel.a aVar = WidgetUpdateLabel.CREATOR;
            JSONObject optJSONObject = jSONObject.optJSONObject("updated_time");
            aVar.getClass();
            Enum r0 = null;
            WidgetUpdateLabel widgetUpdateLabel = optJSONObject == null ? null : new WidgetUpdateLabel(optJSONObject.optBoolean("is_show"), optJSONObject.optString("updated_at"));
            AdditionalHeaderIconBlock.CREATOR.getClass();
            JSONObject optJSONObject2 = jSONObject.optJSONObject("additional_header_icon");
            JSONObject optJSONObject3 = optJSONObject2 != null ? optJSONObject2.optJSONObject("image") : null;
            WebAction a = WebAction.a.a(optJSONObject3 != null ? optJSONObject3.optJSONObject("action") : null, jSONObject);
            if (epx.f(optJSONObject3 != null ? optJSONObject3.getString("type") : null, "inline")) {
                WebImage.a aVar2 = WebImage.CREATOR;
                JSONArray jSONArray = optJSONObject3.getJSONArray("items");
                aVar2.getClass();
                additionalHeaderIconBlock = new AdditionalHeaderIconBlock(WebImage.a.a(jSONArray), a);
            } else {
                additionalHeaderIconBlock = null;
            }
            String optString2 = jSONObject.optString("header_right_type");
            Enum r1 = HeaderRightImageType.NONE;
            if (optString2 != null) {
                try {
                    r0 = Enum.valueOf(HeaderRightImageType.class, optString2.toUpperCase(Locale.US));
                } catch (IllegalArgumentException unused) {
                }
                if (r0 != null) {
                    r1 = r0;
                }
            }
            return new WidgetBasePayload(optString, optDouble, widgetUpdateLabel, additionalHeaderIconBlock, (HeaderRightImageType) r1);
        }

        @Override // android.os.Parcelable.Creator
        public final WidgetBasePayload createFromParcel(Parcel parcel) {
            return new WidgetBasePayload(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WidgetBasePayload[] newArray(int i) {
            return new WidgetBasePayload[i];
        }
    }

    public WidgetBasePayload(String str, double d, WidgetUpdateLabel widgetUpdateLabel, AdditionalHeaderIconBlock additionalHeaderIconBlock, HeaderRightImageType headerRightImageType) {
        this.b = str;
        this.c = d;
        this.d = widgetUpdateLabel;
        this.e = additionalHeaderIconBlock;
        this.f = headerRightImageType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetBasePayload)) {
            return false;
        }
        WidgetBasePayload widgetBasePayload = (WidgetBasePayload) obj;
        return epx.f(this.b, widgetBasePayload.b) && Double.compare(this.c, widgetBasePayload.c) == 0 && epx.f(this.d, widgetBasePayload.d) && epx.f(this.e, widgetBasePayload.e) && this.f == widgetBasePayload.f;
    }

    public final int hashCode() {
        int b = zjh0.b(this.c, this.b.hashCode() * 31, 31);
        WidgetUpdateLabel widgetUpdateLabel = this.d;
        int hashCode = (b + (widgetUpdateLabel == null ? 0 : widgetUpdateLabel.hashCode())) * 31;
        AdditionalHeaderIconBlock additionalHeaderIconBlock = this.e;
        return this.f.hashCode() + ((hashCode + (additionalHeaderIconBlock != null ? additionalHeaderIconBlock.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "WidgetBasePayload(trackCode=" + this.b + ", weight=" + this.c + ", updateLabel=" + this.d + ", additionalHeaderIcon=" + this.e + ", headerRightImageType=" + this.f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeDouble(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeString(this.f.name());
    }

    public WidgetBasePayload(Parcel parcel) {
        this(parcel.readString(), parcel.readDouble(), (WidgetUpdateLabel) parcel.readParcelable(WidgetUpdateLabel.class.getClassLoader()), (AdditionalHeaderIconBlock) parcel.readParcelable(AdditionalHeaderIconBlock.class.getClassLoader()), HeaderRightImageType.valueOf(parcel.readString()));
    }
}
