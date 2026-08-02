package com.vk.superapp.ui.uniwidgets.blocks;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.uniwidgets.blocks.IconBlock;
import java.util.Locale;
import org.json.JSONObject;
import xsna.asp;
import xsna.zrp;

/* compiled from: ButtonBlock.kt */
/* loaded from: classes6.dex */
public final class ButtonBlock implements BaseBlock {
    public static final a CREATOR = new a();
    public final String b;
    public final IconBlock c;
    public final WebAction d;
    public final Style e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ButtonBlock.kt */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style OUTLINE;
        public static final Style OUTLINE_ICON;
        public static final Style OUTLINE_TEXT;
        public static final Style OUTLINE_WITH_ICON;
        public static final Style PRIMARY;
        public static final Style SECONDARY;
        public static final Style TERTIARY;
        public static final Style TERTIARY_ICON;
        public static final Style TERTIARY_TEXT;
        public static final Style TERTIARY_WITH_ICON;

        static {
            Style style = new Style("PRIMARY", 0);
            PRIMARY = style;
            Style style2 = new Style("SECONDARY", 1);
            SECONDARY = style2;
            Style style3 = new Style("TERTIARY", 2);
            TERTIARY = style3;
            Style style4 = new Style("OUTLINE", 3);
            OUTLINE = style4;
            Style style5 = new Style("OUTLINE_WITH_ICON", 4);
            OUTLINE_WITH_ICON = style5;
            Style style6 = new Style("OUTLINE_TEXT", 5);
            OUTLINE_TEXT = style6;
            Style style7 = new Style("OUTLINE_ICON", 6);
            OUTLINE_ICON = style7;
            Style style8 = new Style("TERTIARY_TEXT", 7);
            TERTIARY_TEXT = style8;
            Style style9 = new Style("TERTIARY_WITH_ICON", 8);
            TERTIARY_WITH_ICON = style9;
            Style style10 = new Style("TERTIARY_ICON", 9);
            TERTIARY_ICON = style10;
            Style[] styleArr = {style, style2, style3, style4, style5, style6, style7, style8, style9, style10};
            $VALUES = styleArr;
            $ENTRIES = new asp(styleArr);
        }

        public Style() {
            throw null;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    /* compiled from: ButtonBlock.kt */
    public static final class a implements Parcelable.Creator<ButtonBlock> {
        public static ButtonBlock a(JSONObject jSONObject, Style style) {
            if (jSONObject == null || style == null) {
                return null;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("title");
            String string = optJSONObject != null ? optJSONObject.getString("value") : null;
            WebAction a = WebAction.a.a(jSONObject.optJSONObject("action"), null);
            IconBlock.a aVar = IconBlock.CREATOR;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("icon");
            IconBlock.Style style2 = new IconBlock.Style(null, WidgetColor.ACCENT, null, 5, null);
            aVar.getClass();
            return new ButtonBlock(string, IconBlock.a.a(optJSONObject2, style2), a, style);
        }

        public static Style b(JSONObject jSONObject) {
            Enum r0 = null;
            if (jSONObject == null) {
                return null;
            }
            String optString = jSONObject.optString("type");
            Enum r1 = Style.OUTLINE_TEXT;
            if (optString != null) {
                try {
                    r0 = Enum.valueOf(Style.class, optString.toUpperCase(Locale.US));
                } catch (IllegalArgumentException unused) {
                }
                if (r0 != null) {
                    r1 = r0;
                }
            }
            return (Style) r1;
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonBlock createFromParcel(Parcel parcel) {
            return new ButtonBlock(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonBlock[] newArray(int i) {
            return new ButtonBlock[i];
        }
    }

    public ButtonBlock(String str, IconBlock iconBlock, WebAction webAction, Style style) {
        this.b = str;
        this.c = iconBlock;
        this.d = webAction;
        this.e = style;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e.name());
    }

    public ButtonBlock(Parcel parcel) {
        this(parcel.readString(), (IconBlock) parcel.readParcelable(IconBlock.class.getClassLoader()), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()), Style.valueOf(parcel.readString()));
    }
}
