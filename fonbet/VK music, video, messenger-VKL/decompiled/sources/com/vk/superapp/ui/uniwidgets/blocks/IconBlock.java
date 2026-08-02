package com.vk.superapp.ui.uniwidgets.blocks;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.asp;
import xsna.f370;
import xsna.xgx0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: IconBlock.kt */
/* loaded from: classes6.dex */
public final class IconBlock implements BaseBlock {
    public static final a CREATOR = new a();
    public final WebImage b;
    public final Style c;
    public final WebAction d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IconBlock.kt */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size MEDIUM;
        public static final Size SMALL;

        static {
            Size size = new Size("SMALL", 0);
            SMALL = size;
            Size size2 = new Size("MEDIUM", 1);
            MEDIUM = size2;
            Size[] sizeArr = {size, size2};
            $VALUES = sizeArr;
            $ENTRIES = new asp(sizeArr);
        }

        public Size() {
            throw null;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    /* compiled from: IconBlock.kt */
    public static final class Style implements Parcelable {
        public static final a CREATOR = new a();
        public final Size b;
        public final WidgetColor c;
        public final VerticalAlign d;

        /* compiled from: IconBlock.kt */
        public static final class a implements Parcelable.Creator<Style> {
            /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static Style a(String str, JSONObject jSONObject) {
                Object obj;
                Enum valueOf;
                String A;
                if (jSONObject != null && (A = f370.A("size", jSONObject)) != null) {
                    str = A;
                }
                Enum r0 = null;
                String A2 = jSONObject != null ? f370.A("color", jSONObject) : null;
                String A3 = jSONObject != null ? f370.A("vertical_align", jSONObject) : null;
                Object obj2 = Size.SMALL;
                if (str != null) {
                    try {
                        obj = Enum.valueOf(Size.class, str.toUpperCase(Locale.US));
                    } catch (IllegalArgumentException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        obj2 = obj;
                    }
                }
                Size size = (Size) obj2;
                if (A2 != null) {
                    try {
                        valueOf = Enum.valueOf(WidgetColor.class, A2.toUpperCase(Locale.US));
                    } catch (IllegalArgumentException unused2) {
                    }
                    WidgetColor widgetColor = (WidgetColor) valueOf;
                    Enum r1 = VerticalAlign.TOP;
                    if (A3 != null) {
                        try {
                            r0 = Enum.valueOf(VerticalAlign.class, A3.toUpperCase(Locale.US));
                        } catch (IllegalArgumentException unused3) {
                        }
                        if (r0 != null) {
                            r1 = r0;
                        }
                    }
                    return new Style(size, widgetColor, (VerticalAlign) r1);
                }
                valueOf = null;
                WidgetColor widgetColor2 = (WidgetColor) valueOf;
                Enum r12 = VerticalAlign.TOP;
                if (A3 != null) {
                }
                return new Style(size, widgetColor2, (VerticalAlign) r12);
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

        public Style() {
            this(null, null, null, 7, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Style)) {
                return false;
            }
            Style style = (Style) obj;
            return this.b == style.b && this.c == style.c && this.d == style.d;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            WidgetColor widgetColor = this.c;
            return this.d.hashCode() + ((hashCode + (widgetColor == null ? 0 : widgetColor.hashCode())) * 31);
        }

        public final String toString() {
            return "Style(size=" + this.b + ", color=" + this.c + ", verticalAlign=" + this.d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b.name());
            WidgetColor widgetColor = this.c;
            parcel.writeString(widgetColor != null ? widgetColor.name() : null);
            parcel.writeString(this.d.name());
        }

        public Style(Size size, WidgetColor widgetColor, VerticalAlign verticalAlign) {
            this.b = size;
            this.c = widgetColor;
            this.d = verticalAlign;
        }

        public /* synthetic */ Style(Size size, WidgetColor widgetColor, VerticalAlign verticalAlign, int i, zcl zclVar) {
            this((i & 1) != 0 ? Size.SMALL : size, (i & 2) != 0 ? null : widgetColor, (i & 4) != 0 ? VerticalAlign.TOP : verticalAlign);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Style(Parcel parcel) {
            this(r0, (WidgetColor) r2, VerticalAlign.valueOf(parcel.readString()));
            Size valueOf = Size.valueOf(parcel.readString());
            String readString = parcel.readString();
            Enum r2 = null;
            if (readString != null) {
                try {
                    r2 = Enum.valueOf(WidgetColor.class, readString.toUpperCase(Locale.US));
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    /* compiled from: IconBlock.kt */
    public static final class a implements Parcelable.Creator<IconBlock> {
        public static IconBlock a(JSONObject jSONObject, Style style) {
            Style style2;
            if (jSONObject == null) {
                xgx0.a.getClass();
                xgx0.a("IconBlock is not created, json is null!");
                return null;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(TtmlNode.TAG_STYLE);
            if (optJSONObject != null) {
                Style.CREATOR.getClass();
                style2 = Style.a.a(null, optJSONObject);
            } else {
                style2 = null;
            }
            if (style2 != null) {
                style = style2;
            }
            if (style == null) {
                xgx0.a.getClass();
                xgx0.a("IconBlock is not created, style is null!");
                return null;
            }
            WebImage.a aVar = WebImage.CREATOR;
            JSONArray jSONArray = jSONObject.getJSONArray("items");
            aVar.getClass();
            return new IconBlock(WebImage.a.a(jSONArray), style, WebAction.a.a(jSONObject.optJSONObject("action"), null));
        }

        @Override // android.os.Parcelable.Creator
        public final IconBlock createFromParcel(Parcel parcel) {
            return new IconBlock(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final IconBlock[] newArray(int i) {
            return new IconBlock[i];
        }
    }

    public IconBlock(WebImage webImage, Style style, WebAction webAction) {
        this.b = webImage;
        this.c = style;
        this.d = webAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
    }

    public IconBlock(Parcel parcel) {
        this((WebImage) parcel.readParcelable(WebImage.class.getClassLoader()), (Style) parcel.readParcelable(Style.class.getClassLoader()), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()));
    }
}
