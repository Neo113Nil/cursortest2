package com.vk.superapp.ui.uniwidgets.blocks;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.superapp.ui.uniwidgets.config.SuperappTextStylesBridge;
import java.util.Locale;
import org.json.JSONObject;
import xsna.zcl;

/* compiled from: TextBlock.kt */
/* loaded from: classes6.dex */
public final class TextBlock implements BaseBlock {
    public static final a CREATOR = new a();
    public final String b;
    public final Style c;

    /* compiled from: TextBlock.kt */
    public static final class a implements Parcelable.Creator<TextBlock> {
        public static TextBlock a(JSONObject jSONObject, Style style) {
            if (jSONObject == null || style == null) {
                return null;
            }
            String string = jSONObject.getString("value");
            Style.a aVar = Style.CREATOR;
            JSONObject optJSONObject = jSONObject.optJSONObject(TtmlNode.TAG_STYLE);
            aVar.getClass();
            return new TextBlock(string, Style.a.a(optJSONObject, style));
        }

        @Override // android.os.Parcelable.Creator
        public final TextBlock createFromParcel(Parcel parcel) {
            return new TextBlock(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TextBlock[] newArray(int i) {
            return new TextBlock[i];
        }
    }

    public TextBlock(String str, Style style) {
        this.b = str;
        this.c = style;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }

    public TextBlock(Parcel parcel) {
        this(parcel.readString(), (Style) parcel.readParcelable(Style.class.getClassLoader()));
    }

    /* compiled from: TextBlock.kt */
    public static final class Style implements Parcelable {
        public static final a CREATOR = new a();
        public final WidgetColor b;
        public final SuperappTextStylesBridge.FontWeight c;

        /* compiled from: TextBlock.kt */
        public static final class a implements Parcelable.Creator<Style> {
            public static Style a(JSONObject jSONObject, Style style) {
                Object obj;
                if (jSONObject == null) {
                    return style;
                }
                WidgetColor widgetColor = style.b;
                SuperappTextStylesBridge.FontWeight fontWeight = style.c;
                String optString = jSONObject.optString("color");
                Object obj2 = null;
                if (optString.length() > 0) {
                    Object obj3 = WidgetColor.TEXT_PRIMARY;
                    try {
                        obj = Enum.valueOf(WidgetColor.class, optString.toUpperCase(Locale.US));
                    } catch (IllegalArgumentException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        obj3 = obj;
                    }
                    widgetColor = (WidgetColor) obj3;
                }
                String optString2 = jSONObject.optString("weight");
                if (optString2.length() > 0) {
                    Object obj4 = SuperappTextStylesBridge.FontWeight.REGULAR;
                    try {
                        obj2 = Enum.valueOf(SuperappTextStylesBridge.FontWeight.class, optString2.toUpperCase(Locale.US));
                    } catch (IllegalArgumentException unused2) {
                    }
                    if (obj2 != null) {
                        obj4 = obj2;
                    }
                    fontWeight = (SuperappTextStylesBridge.FontWeight) obj4;
                }
                return new Style(widgetColor, fontWeight);
            }

            public static Style b(JSONObject jSONObject) {
                Object obj;
                Enum r0 = null;
                String optString = jSONObject != null ? jSONObject.optString("color") : null;
                String optString2 = jSONObject != null ? jSONObject.optString("weight") : null;
                Object obj2 = WidgetColor.TEXT_PRIMARY;
                if (optString != null) {
                    try {
                        obj = Enum.valueOf(WidgetColor.class, optString.toUpperCase(Locale.US));
                    } catch (IllegalArgumentException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        obj2 = obj;
                    }
                }
                WidgetColor widgetColor = (WidgetColor) obj2;
                if (optString2 != null) {
                    try {
                        r0 = Enum.valueOf(SuperappTextStylesBridge.FontWeight.class, optString2.toUpperCase(Locale.US));
                    } catch (IllegalArgumentException unused2) {
                    }
                }
                return new Style(widgetColor, (SuperappTextStylesBridge.FontWeight) r0);
            }

            @Override // android.os.Parcelable.Creator
            public final Style createFromParcel(Parcel parcel) {
                return new Style(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Style[] newArray(int i) {
                return new Style[i];
            }
        }

        public Style(WidgetColor widgetColor, SuperappTextStylesBridge.FontWeight fontWeight) {
            this.b = widgetColor;
            this.c = fontWeight;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b.name());
            SuperappTextStylesBridge.FontWeight fontWeight = this.c;
            parcel.writeString(fontWeight != null ? fontWeight.name() : null);
        }

        public /* synthetic */ Style(WidgetColor widgetColor, SuperappTextStylesBridge.FontWeight fontWeight, int i, zcl zclVar) {
            this(widgetColor, (i & 2) != 0 ? null : fontWeight);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Style(Parcel parcel) {
            this(r0, r2 != null ? SuperappTextStylesBridge.FontWeight.valueOf(r2) : null);
            WidgetColor valueOf = WidgetColor.valueOf(parcel.readString());
            String readString = parcel.readString();
        }
    }
}
