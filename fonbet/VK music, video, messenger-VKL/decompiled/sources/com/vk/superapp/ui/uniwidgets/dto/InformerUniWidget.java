package com.vk.superapp.ui.uniwidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.api.dto.menu.QueueSettings;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.menu.WidgetSettings;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.uniwidgets.WidgetObjects;
import com.vk.superapp.ui.uniwidgets.blocks.AvatarStackBlock;
import com.vk.superapp.ui.uniwidgets.blocks.AvatarsBlock;
import com.vk.superapp.ui.uniwidgets.blocks.BadgeBlock;
import com.vk.superapp.ui.uniwidgets.blocks.BaseBlock;
import com.vk.superapp.ui.uniwidgets.blocks.ButtonBlock;
import com.vk.superapp.ui.uniwidgets.blocks.EmptyBlock;
import com.vk.superapp.ui.uniwidgets.blocks.HeaderBlock;
import com.vk.superapp.ui.uniwidgets.blocks.HorizontalAlignment;
import com.vk.superapp.ui.uniwidgets.blocks.IconBlock;
import com.vk.superapp.ui.uniwidgets.blocks.ImageBlock;
import com.vk.superapp.ui.uniwidgets.blocks.ImageStackBlock;
import com.vk.superapp.ui.uniwidgets.blocks.InformerRowBlock;
import com.vk.superapp.ui.uniwidgets.blocks.TextBlock;
import com.vk.superapp.ui.uniwidgets.blocks.VerticalAlign;
import com.vk.superapp.ui.uniwidgets.blocks.WidgetColor;
import com.vk.superapp.ui.uniwidgets.dto.UniversalWidget;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.WidgetBasePayload;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.asp;
import xsna.bpn0;
import xsna.bzk0;
import xsna.c5g;
import xsna.cqm0;
import xsna.drm0;
import xsna.epx;
import xsna.fw3;
import xsna.gq;
import xsna.iah0;
import xsna.j5g;
import xsna.urd0;
import xsna.xq;
import xsna.zcl;
import xsna.zrp;

/* compiled from: InformerUniWidget.kt */
/* loaded from: classes6.dex */
public final class InformerUniWidget extends UniversalWidget {
    public static final a CREATOR = new a();
    public final WidgetIds m;
    public final String n;
    public final QueueSettings o;
    public final WidgetSettings p;
    public final String q;
    public final Payload r;
    public final BaseBlock s;
    public final List<InformerRowBlock> t;
    public final BaseBlock u;
    public final ImageBlock v;

    /* compiled from: InformerUniWidget.kt */
    public static abstract class LeftData implements Parcelable {

        /* compiled from: InformerUniWidget.kt */
        public static final class Icon extends LeftData {
            public static final a CREATOR = new a();
            public final IconBlock b;
            public final BadgeBlock c;

            /* compiled from: InformerUniWidget.kt */
            public static final class a implements Parcelable.Creator<Icon> {
                @Override // android.os.Parcelable.Creator
                public final Icon createFromParcel(Parcel parcel) {
                    return new Icon(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final Icon[] newArray(int i) {
                    return new Icon[i];
                }
            }

            public Icon(IconBlock iconBlock, BadgeBlock badgeBlock) {
                super(null);
                this.b = iconBlock;
                this.c = badgeBlock;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) obj;
                return epx.f(this.b, icon.b) && epx.f(this.c, icon.c);
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                BadgeBlock badgeBlock = this.c;
                return hashCode + (badgeBlock == null ? 0 : badgeBlock.hashCode());
            }

            public final String toString() {
                return "Icon(iconBlock=" + this.b + ", badgeBlock=" + this.c + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
                parcel.writeParcelable(this.c, i);
            }

            public Icon(Parcel parcel) {
                this((IconBlock) parcel.readParcelable(IconBlock.class.getClassLoader()), (BadgeBlock) parcel.readParcelable(BadgeBlock.class.getClassLoader()));
            }
        }

        /* compiled from: InformerUniWidget.kt */
        public static final class Image extends LeftData {
            public static final a CREATOR = new a();
            public final ImageBlock b;
            public final BadgeBlock c;

            /* compiled from: InformerUniWidget.kt */
            public static final class a implements Parcelable.Creator<Image> {
                @Override // android.os.Parcelable.Creator
                public final Image createFromParcel(Parcel parcel) {
                    return new Image(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final Image[] newArray(int i) {
                    return new Image[i];
                }
            }

            public Image(ImageBlock imageBlock, BadgeBlock badgeBlock) {
                super(null);
                this.b = imageBlock;
                this.c = badgeBlock;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Image)) {
                    return false;
                }
                Image image = (Image) obj;
                return epx.f(this.b, image.b) && epx.f(this.c, image.c);
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                BadgeBlock badgeBlock = this.c;
                return hashCode + (badgeBlock == null ? 0 : badgeBlock.hashCode());
            }

            public final String toString() {
                return "Image(imageBlock=" + this.b + ", badgeBlock=" + this.c + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
                parcel.writeParcelable(this.c, i);
            }

            public Image(Parcel parcel) {
                this((ImageBlock) parcel.readParcelable(ImageBlock.class.getClassLoader()), (BadgeBlock) parcel.readParcelable(BadgeBlock.class.getClassLoader()));
            }
        }

        public /* synthetic */ LeftData(zcl zclVar) {
            this();
        }

        public LeftData() {
        }

        /* compiled from: InformerUniWidget.kt */
        public static final class Style implements Parcelable {
            public static final a CREATOR = new a();
            public final ImageBlock.Style b;
            public final IconBlock.Style c;
            public final HorizontalAlignment d;

            /* compiled from: InformerUniWidget.kt */
            public static final class a implements Parcelable.Creator<Style> {
                @Override // android.os.Parcelable.Creator
                public final Style createFromParcel(Parcel parcel) {
                    return new Style(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final Style[] newArray(int i) {
                    return new Style[i];
                }
            }

            public Style(ImageBlock.Style style, IconBlock.Style style2, HorizontalAlignment horizontalAlignment) {
                this.b = style;
                this.c = style2;
                this.d = horizontalAlignment;
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
                return epx.f(this.b, style.b) && epx.f(this.c, style.c) && this.d == style.d;
            }

            public final int hashCode() {
                ImageBlock.Style style = this.b;
                int hashCode = (style == null ? 0 : style.hashCode()) * 31;
                IconBlock.Style style2 = this.c;
                return this.d.hashCode() + ((hashCode + (style2 != null ? style2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                return "Style(imageStyle=" + this.b + ", iconStyle=" + this.c + ", badgeAlign=" + this.d + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
                parcel.writeParcelable(this.c, i);
                parcel.writeString(this.d.name());
            }

            public Style(Parcel parcel) {
                this((ImageBlock.Style) parcel.readParcelable(ImageBlock.Style.class.getClassLoader()), (IconBlock.Style) parcel.readParcelable(IconBlock.Style.class.getClassLoader()), HorizontalAlignment.valueOf(parcel.readString()));
            }
        }
    }

    /* compiled from: InformerUniWidget.kt */
    public static abstract class RightData implements Parcelable {

        /* compiled from: InformerUniWidget.kt */
        public static final class Avatars extends RightData {
            public static final a CREATOR = new a();
            public final AvatarStackBlock b;

            /* compiled from: InformerUniWidget.kt */
            public static final class a implements Parcelable.Creator<Avatars> {
                @Override // android.os.Parcelable.Creator
                public final Avatars createFromParcel(Parcel parcel) {
                    return new Avatars(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final Avatars[] newArray(int i) {
                    return new Avatars[i];
                }
            }

            public Avatars(AvatarStackBlock avatarStackBlock) {
                super(null);
                this.b = avatarStackBlock;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Avatars) && epx.f(this.b, ((Avatars) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Avatars(avatarStackBlock=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }

            public Avatars(Parcel parcel) {
                this((AvatarStackBlock) parcel.readParcelable(AvatarStackBlock.class.getClassLoader()));
            }
        }

        /* compiled from: InformerUniWidget.kt */
        public static final class Button extends RightData {
            public static final a CREATOR = new a();
            public final ButtonBlock b;

            /* compiled from: InformerUniWidget.kt */
            public static final class a implements Parcelable.Creator<Button> {
                @Override // android.os.Parcelable.Creator
                public final Button createFromParcel(Parcel parcel) {
                    return new Button(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final Button[] newArray(int i) {
                    return new Button[i];
                }
            }

            public Button(ButtonBlock buttonBlock) {
                super(null);
                this.b = buttonBlock;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Button) && epx.f(this.b, ((Button) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Button(buttonBlock=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }

            public Button(Parcel parcel) {
                this((ButtonBlock) parcel.readParcelable(ButtonBlock.class.getClassLoader()));
            }
        }

        /* compiled from: InformerUniWidget.kt */
        public static final class Counter extends RightData {
            public static final a CREATOR = new a();
            public final TextBlock b;
            public final Style.CounterSize c;

            /* compiled from: InformerUniWidget.kt */
            public static final class a implements Parcelable.Creator<Counter> {
                @Override // android.os.Parcelable.Creator
                public final Counter createFromParcel(Parcel parcel) {
                    return new Counter(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final Counter[] newArray(int i) {
                    return new Counter[i];
                }
            }

            public Counter(TextBlock textBlock, Style.CounterSize counterSize) {
                super(null);
                this.b = textBlock;
                this.c = counterSize;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Counter)) {
                    return false;
                }
                Counter counter = (Counter) obj;
                return epx.f(this.b, counter.b) && this.c == counter.c;
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "Counter(counterBlock=" + this.b + ", counterSize=" + this.c + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
                parcel.writeString(this.c.name());
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Counter(Parcel parcel) {
                this(r0, (Style.CounterSize) r1);
                TextBlock textBlock = (TextBlock) parcel.readParcelable(TextBlock.class.getClassLoader());
                String readString = parcel.readString();
                Enum r1 = null;
                if (readString != null) {
                    try {
                        r1 = Enum.valueOf(Style.CounterSize.class, readString.toUpperCase(Locale.US));
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
        }

        /* compiled from: InformerUniWidget.kt */
        public static final class Icon extends RightData {
            public static final a CREATOR = new a();
            public final IconBlock b;

            /* compiled from: InformerUniWidget.kt */
            public static final class a implements Parcelable.Creator<Icon> {
                @Override // android.os.Parcelable.Creator
                public final Icon createFromParcel(Parcel parcel) {
                    return new Icon(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final Icon[] newArray(int i) {
                    return new Icon[i];
                }
            }

            public Icon(IconBlock iconBlock) {
                super(null);
                this.b = iconBlock;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Icon) && epx.f(this.b, ((Icon) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Icon(iconBlock=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }

            public Icon(Parcel parcel) {
                this((IconBlock) parcel.readParcelable(IconBlock.class.getClassLoader()));
            }
        }

        /* compiled from: InformerUniWidget.kt */
        public static final class ImageStack extends RightData {
            public static final a CREATOR = new a();
            public final AvatarStackBlock b;

            /* compiled from: InformerUniWidget.kt */
            public static final class a implements Parcelable.Creator<ImageStack> {
                @Override // android.os.Parcelable.Creator
                public final ImageStack createFromParcel(Parcel parcel) {
                    return new ImageStack(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final ImageStack[] newArray(int i) {
                    return new ImageStack[i];
                }
            }

            public ImageStack(AvatarStackBlock avatarStackBlock) {
                super(null);
                this.b = avatarStackBlock;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ImageStack) && epx.f(this.b, ((ImageStack) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ImageStack(avatarStackBlock=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }

            public ImageStack(Parcel parcel) {
                this((AvatarStackBlock) parcel.readParcelable(AvatarStackBlock.class.getClassLoader()));
            }
        }

        public /* synthetic */ RightData(zcl zclVar) {
            this();
        }

        public RightData() {
        }

        /* compiled from: InformerUniWidget.kt */
        public static final class Style implements Parcelable {
            public static final a CREATOR = new a();
            public final CounterSize b;
            public final TextBlock.Style c;
            public final IconBlock.Style d;
            public final ButtonBlock.Style e;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: InformerUniWidget.kt */
            public static final class CounterSize {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ CounterSize[] $VALUES;
                public static final CounterSize LARGE;
                public static final CounterSize REGULAR;

                static {
                    CounterSize counterSize = new CounterSize("LARGE", 0);
                    LARGE = counterSize;
                    CounterSize counterSize2 = new CounterSize("REGULAR", 1);
                    REGULAR = counterSize2;
                    CounterSize[] counterSizeArr = {counterSize, counterSize2};
                    $VALUES = counterSizeArr;
                    $ENTRIES = new asp(counterSizeArr);
                }

                public CounterSize() {
                    throw null;
                }

                public static CounterSize valueOf(String str) {
                    return (CounterSize) Enum.valueOf(CounterSize.class, str);
                }

                public static CounterSize[] values() {
                    return (CounterSize[]) $VALUES.clone();
                }
            }

            /* compiled from: InformerUniWidget.kt */
            public static final class a implements Parcelable.Creator<Style> {
                @Override // android.os.Parcelable.Creator
                public final Style createFromParcel(Parcel parcel) {
                    return new Style(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final Style[] newArray(int i) {
                    return new Style[i];
                }
            }

            public Style(CounterSize counterSize, TextBlock.Style style, IconBlock.Style style2, ButtonBlock.Style style3) {
                this.b = counterSize;
                this.c = style;
                this.d = style2;
                this.e = style3;
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
                return this.b == style.b && epx.f(this.c, style.c) && epx.f(this.d, style.d) && this.e == style.e;
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                TextBlock.Style style = this.c;
                int hashCode2 = (hashCode + (style == null ? 0 : style.hashCode())) * 31;
                IconBlock.Style style2 = this.d;
                int hashCode3 = (hashCode2 + (style2 == null ? 0 : style2.hashCode())) * 31;
                ButtonBlock.Style style3 = this.e;
                return hashCode3 + (style3 != null ? style3.hashCode() : 0);
            }

            public final String toString() {
                return "Style(size=" + this.b + ", counterStyle=" + this.c + ", iconStyle=" + this.d + ", buttonStyle=" + this.e + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b.name());
                parcel.writeParcelable(this.c, i);
                parcel.writeParcelable(this.d, i);
                ButtonBlock.Style style = this.e;
                parcel.writeString(style != null ? style.name() : null);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Style(Parcel parcel) {
                this(r0, r2, r3, (ButtonBlock.Style) r1);
                Enum valueOf;
                String readString;
                String readString2 = parcel.readString();
                Enum r1 = null;
                if (readString2 != null) {
                    try {
                        valueOf = Enum.valueOf(CounterSize.class, readString2.toUpperCase(Locale.US));
                    } catch (IllegalArgumentException unused) {
                    }
                    CounterSize counterSize = (CounterSize) valueOf;
                    TextBlock.Style style = (TextBlock.Style) parcel.readParcelable(TextBlock.Style.class.getClassLoader());
                    IconBlock.Style style2 = (IconBlock.Style) parcel.readParcelable(IconBlock.Style.class.getClassLoader());
                    readString = parcel.readString();
                    if (readString != null) {
                        try {
                            r1 = Enum.valueOf(ButtonBlock.Style.class, readString.toUpperCase(Locale.US));
                        } catch (IllegalArgumentException unused2) {
                        }
                    }
                }
                valueOf = null;
                CounterSize counterSize2 = (CounterSize) valueOf;
                TextBlock.Style style3 = (TextBlock.Style) parcel.readParcelable(TextBlock.Style.class.getClassLoader());
                IconBlock.Style style22 = (IconBlock.Style) parcel.readParcelable(IconBlock.Style.class.getClassLoader());
                readString = parcel.readString();
                if (readString != null) {
                }
            }
        }
    }

    /* compiled from: InformerUniWidget.kt */
    public static final class a implements Parcelable.Creator<InformerUniWidget> {
        /* JADX WARN: Removed duplicated region for block: B:129:0x03b1 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:156:0x04c3  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x04f5  */
        /* JADX WARN: Removed duplicated region for block: B:179:0x069f A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:187:0x051f  */
        /* JADX WARN: Removed duplicated region for block: B:250:0x0503  */
        /* JADX WARN: Removed duplicated region for block: B:251:0x04fd  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static InformerUniWidget a(JSONObject jSONObject, WidgetObjects widgetObjects) throws Exception {
            JSONObject jSONObject2;
            String str;
            ArrayList arrayList;
            List list;
            ArrayList arrayList2;
            WidgetObjects widgetObjects2;
            JSONObject jSONObject3;
            JSONArray jSONArray;
            ArrayList arrayList3;
            String str2;
            List list2;
            int i;
            int i2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            JSONObject jSONObject4;
            String str10;
            ArrayList arrayList4;
            WidgetObjects widgetObjects3;
            LeftData leftData;
            String str11;
            JSONObject optJSONObject;
            LeftData leftData2;
            String str12;
            String str13;
            MiddleData middleData;
            JSONObject optJSONObject2;
            RightData rightData;
            int i3;
            ImageStackBlock imageStackBlock;
            RightData button;
            TextBlock textBlock;
            TextBlock textBlock2;
            TextBlock textBlock3;
            MiddleData.Style style;
            List<ButtonBlock.Style> list3;
            ArrayList arrayList5;
            List V;
            JSONArray jSONArray2;
            List list4;
            ArrayList arrayList6;
            List<ButtonBlock.Style> list5;
            TextBlock.Style style2;
            TextBlock.Style style3;
            TextBlock.Style style4;
            BadgeBlock badgeBlock;
            int i4;
            JSONArray jSONArray3;
            String str14;
            String str15;
            String str16;
            String str17;
            ArrayList arrayList7;
            String str18;
            ArrayList arrayList8;
            Object obj;
            Object obj2;
            Object obj3;
            LeftData.Style style5;
            ArrayList arrayList9;
            List V2;
            List list6;
            Object obj4;
            MiddleData.Style style6;
            Object obj5;
            ButtonBlock.Style style7;
            RightData.Style style8;
            String string = jSONObject.getString("type");
            WidgetIds.CREATOR.getClass();
            WidgetIds a = WidgetIds.a.a(jSONObject);
            WidgetSettings.CREATOR.getClass();
            WidgetSettings a2 = WidgetSettings.a.a(jSONObject);
            String optString = jSONObject.optString("action_title");
            QueueSettings.CREATOR.getClass();
            QueueSettings a3 = QueueSettings.a.a(jSONObject);
            Payload.a aVar = Payload.CREATOR;
            JSONObject jSONObject5 = jSONObject.getJSONObject("payload");
            aVar.getClass();
            JSONArray jSONArray4 = jSONObject5.getJSONArray("root_style");
            String optString2 = jSONObject5.optString("header_title");
            WebImage.a aVar2 = WebImage.CREATOR;
            JSONArray optJSONArray = jSONObject5.optJSONArray("header_icon");
            aVar2.getClass();
            WebImage a4 = WebImage.a.a(optJSONArray);
            String optString3 = jSONObject5.optString("additional_header");
            HeaderBlock.a aVar3 = HeaderBlock.CREATOR;
            WebImageSize f = a4.f(iah0.a(24));
            String str19 = f != null ? f.b : null;
            aVar3.getClass();
            BaseBlock a5 = HeaderBlock.a.a(str19, optString2, optString3);
            JSONObject optJSONObject3 = jSONObject5.optJSONObject("action");
            WebAction a6 = optJSONObject3 != null ? WebAction.a.a(optJSONObject3, null) : null;
            String str20 = "counter";
            String str21 = "title";
            String str22 = "buttons";
            String str23 = "middle";
            String str24 = "badge";
            String str25 = "image";
            String str26 = TtmlNode.LEFT;
            String str27 = "action";
            String str28 = "icon";
            String str29 = "button";
            String str30 = "payload";
            if (jSONArray4 != null) {
                str = "type";
                ArrayList arrayList10 = new ArrayList(jSONArray4.length());
                int length = jSONArray4.length();
                jSONObject2 = jSONObject5;
                int i5 = 0;
                while (i5 < length) {
                    int i6 = length;
                    JSONObject optJSONObject4 = jSONArray4.optJSONObject(i5);
                    if (optJSONObject4 != null) {
                        InformerRowBlock.Style.CREATOR.getClass();
                        LeftData.Style.a aVar4 = LeftData.Style.CREATOR;
                        i4 = i5;
                        JSONObject optJSONObject5 = optJSONObject4.optJSONObject(str26);
                        aVar4.getClass();
                        jSONArray3 = jSONArray4;
                        if (optJSONObject5 == null) {
                            str15 = str24;
                            str16 = str25;
                            str17 = str26;
                            arrayList8 = arrayList10;
                            style5 = null;
                        } else {
                            ImageBlock.Style.a aVar5 = ImageBlock.Style.CREATOR;
                            str17 = str26;
                            JSONObject optJSONObject6 = optJSONObject5.optJSONObject(str25);
                            str16 = str25;
                            String string2 = optJSONObject5.getString("size");
                            aVar5.getClass();
                            ImageBlock.Style a7 = ImageBlock.Style.a.a(string2, optJSONObject6);
                            IconBlock.Style.a aVar6 = IconBlock.Style.CREATOR;
                            JSONObject optJSONObject7 = optJSONObject5.optJSONObject("icon");
                            arrayList8 = arrayList10;
                            String string3 = optJSONObject5.getString("size");
                            aVar6.getClass();
                            IconBlock.Style a8 = IconBlock.Style.a.a(string3, optJSONObject7);
                            JSONObject optJSONObject8 = optJSONObject5.optJSONObject(str24);
                            String string4 = optJSONObject8 != null ? optJSONObject8.getString("align") : null;
                            Object obj6 = HorizontalAlignment.RIGHT;
                            if (string4 == null) {
                                str15 = str24;
                                obj = obj6;
                            } else {
                                obj = obj6;
                                str15 = str24;
                                try {
                                    obj2 = Enum.valueOf(HorizontalAlignment.class, string4.toUpperCase(Locale.US));
                                } catch (IllegalArgumentException unused) {
                                    obj2 = null;
                                }
                                if (obj2 != null) {
                                    obj3 = obj2;
                                    style5 = new LeftData.Style(a7, a8, (HorizontalAlignment) obj3);
                                }
                            }
                            obj3 = obj;
                            style5 = new LeftData.Style(a7, a8, (HorizontalAlignment) obj3);
                        }
                        MiddleData.Style.a aVar7 = MiddleData.Style.CREATOR;
                        JSONObject optJSONObject9 = optJSONObject4.optJSONObject(str23);
                        aVar7.getClass();
                        if (optJSONObject9 == null) {
                            str14 = str23;
                            str18 = str21;
                            style6 = null;
                        } else {
                            TextBlock.Style.a aVar8 = TextBlock.Style.CREATOR;
                            JSONObject optJSONObject10 = optJSONObject9.optJSONObject(str21);
                            str18 = str21;
                            str14 = str23;
                            TextBlock.Style style9 = new TextBlock.Style(WidgetColor.PRIMARY, null, 2, null);
                            aVar8.getClass();
                            TextBlock.Style a9 = TextBlock.Style.a.a(optJSONObject10, style9);
                            TextBlock.Style b = TextBlock.Style.a.b(optJSONObject9.optJSONObject("subtitle"));
                            TextBlock.Style b2 = TextBlock.Style.a.b(optJSONObject9.optJSONObject("second_subtitle"));
                            if (optJSONObject9.has("button")) {
                                ButtonBlock.a aVar9 = ButtonBlock.CREATOR;
                                JSONObject jSONObject6 = optJSONObject9.getJSONObject("button");
                                aVar9.getClass();
                                ButtonBlock.Style b3 = ButtonBlock.a.b(jSONObject6);
                                if (b3 != null) {
                                    V2 = Collections.singletonList(b3);
                                    list6 = V2;
                                }
                                list6 = null;
                            } else {
                                if (optJSONObject9.has("buttons")) {
                                    JSONArray jSONArray5 = optJSONObject9.getJSONArray("buttons");
                                    if (jSONArray5 != null) {
                                        arrayList9 = new ArrayList(jSONArray5.length());
                                        int length2 = jSONArray5.length();
                                        for (int i7 = 0; i7 < length2; i7++) {
                                            JSONObject optJSONObject11 = jSONArray5.optJSONObject(i7);
                                            if (optJSONObject11 != null) {
                                                ButtonBlock.CREATOR.getClass();
                                                arrayList9.add(ButtonBlock.a.b(optJSONObject11));
                                            }
                                        }
                                    } else {
                                        arrayList9 = null;
                                    }
                                    if (arrayList9 != null) {
                                        V2 = j5g.V(arrayList9);
                                        list6 = V2;
                                    }
                                }
                                list6 = null;
                            }
                            ImageBlock.Style style10 = new ImageBlock.Style(ImageBlock.Style.Size.NONE, ImageBlock.Style.Outline.CIRCLE, null, 4, null);
                            String optString4 = optJSONObject9.optString("vertical_align");
                            Object obj7 = VerticalAlign.CENTER;
                            if (optString4 != null) {
                                try {
                                    obj4 = Enum.valueOf(VerticalAlign.class, optString4.toUpperCase(Locale.US));
                                } catch (IllegalArgumentException unused2) {
                                    obj4 = null;
                                }
                                if (obj4 != null) {
                                    obj7 = obj4;
                                }
                            }
                            style6 = new MiddleData.Style(a9, b, b2, style10, list6, (VerticalAlign) obj7);
                        }
                        RightData.Style.a aVar10 = RightData.Style.CREATOR;
                        JSONObject optJSONObject12 = optJSONObject4.optJSONObject(TtmlNode.RIGHT);
                        aVar10.getClass();
                        if (optJSONObject12 == null) {
                            style8 = null;
                        } else {
                            JSONObject optJSONObject13 = optJSONObject12.optJSONObject("counter");
                            String optString5 = optJSONObject13 != null ? optJSONObject13.optString("size") : null;
                            Object obj8 = RightData.Style.CounterSize.REGULAR;
                            if (optString5 != null) {
                                try {
                                    obj5 = Enum.valueOf(RightData.Style.CounterSize.class, optString5.toUpperCase(Locale.US));
                                } catch (IllegalArgumentException unused3) {
                                    obj5 = null;
                                }
                                if (obj5 != null) {
                                    obj8 = obj5;
                                }
                            }
                            RightData.Style.CounterSize counterSize = (RightData.Style.CounterSize) obj8;
                            TextBlock.Style.a aVar11 = TextBlock.Style.CREATOR;
                            TextBlock.Style style11 = new TextBlock.Style(WidgetColor.PRIMARY, null, 2, null);
                            aVar11.getClass();
                            TextBlock.Style a10 = TextBlock.Style.a.a(optJSONObject13, style11);
                            IconBlock.Style.a aVar12 = IconBlock.Style.CREATOR;
                            JSONObject optJSONObject14 = optJSONObject12.optJSONObject("icon");
                            aVar12.getClass();
                            IconBlock.Style a11 = IconBlock.Style.a.a(null, optJSONObject14);
                            JSONObject optJSONObject15 = optJSONObject12.optJSONObject("button");
                            if (optJSONObject15 != null) {
                                ButtonBlock.CREATOR.getClass();
                                style7 = ButtonBlock.a.b(optJSONObject15);
                            } else {
                                style7 = null;
                            }
                            style8 = new RightData.Style(counterSize, a10, a11, style7);
                        }
                        InformerRowBlock.Style style12 = (style5 == null && style6 == null && style8 == null) ? null : new InformerRowBlock.Style(style5, style6, style8);
                        arrayList7 = arrayList8;
                        arrayList7.add(style12);
                    } else {
                        i4 = i5;
                        jSONArray3 = jSONArray4;
                        str14 = str23;
                        str15 = str24;
                        str16 = str25;
                        str17 = str26;
                        arrayList7 = arrayList10;
                        str18 = str21;
                    }
                    arrayList10 = arrayList7;
                    i5 = i4 + 1;
                    length = i6;
                    jSONArray4 = jSONArray3;
                    str26 = str17;
                    str25 = str16;
                    str24 = str15;
                    str21 = str18;
                    str23 = str14;
                }
                arrayList = arrayList10;
            } else {
                jSONObject2 = jSONObject5;
                str = "type";
                arrayList = null;
            }
            String str31 = str23;
            String str32 = str24;
            String str33 = str25;
            String str34 = str26;
            String str35 = str21;
            List V3 = arrayList != null ? j5g.V(arrayList) : null;
            JSONObject jSONObject7 = jSONObject2;
            JSONArray jSONArray6 = jSONObject7.getJSONArray("rows");
            if (jSONArray6 != null) {
                ArrayList arrayList11 = new ArrayList(jSONArray6.length());
                int length3 = jSONArray6.length();
                int i8 = 0;
                while (i8 < length3) {
                    JSONObject optJSONObject16 = jSONArray6.optJSONObject(i8);
                    if (optJSONObject16 != null) {
                        int i9 = i8 < V3.size() ? i8 : 0;
                        InformerRowBlock.a aVar13 = InformerRowBlock.CREATOR;
                        InformerRowBlock.Style style13 = (InformerRowBlock.Style) V3.get(i9);
                        aVar13.getClass();
                        jSONArray = jSONArray6;
                        String str36 = str34;
                        JSONObject optJSONObject17 = optJSONObject16.optJSONObject(str36);
                        list2 = V3;
                        LeftData.Style style14 = style13.b;
                        if (optJSONObject17 == null || style14 == null) {
                            i = length3;
                            i2 = i8;
                            str34 = str36;
                            str6 = str;
                            jSONObject4 = jSONObject7;
                            str10 = str30;
                            arrayList4 = arrayList11;
                            widgetObjects3 = widgetObjects;
                        } else {
                            i = length3;
                            i2 = i8;
                            String str37 = str32;
                            JSONObject optJSONObject18 = optJSONObject17.optJSONObject(str37);
                            if (optJSONObject18 != null) {
                                BadgeBlock.a aVar14 = BadgeBlock.CREATOR;
                                str32 = str37;
                                HorizontalAlignment horizontalAlignment = style14.d;
                                aVar14.getClass();
                                badgeBlock = BadgeBlock.a.a(optJSONObject18, horizontalAlignment);
                            } else {
                                str32 = str37;
                                badgeBlock = null;
                            }
                            str34 = str36;
                            str6 = str;
                            String string5 = optJSONObject17.getString(str6);
                            jSONObject4 = jSONObject7;
                            String str38 = str33;
                            if (epx.f(string5, str38)) {
                                ImageBlock.a aVar15 = ImageBlock.CREATOR;
                                str33 = str38;
                                str10 = str30;
                                JSONObject jSONObject8 = optJSONObject17.getJSONObject(str10);
                                ImageBlock.Style style15 = style14.b;
                                aVar15.getClass();
                                ImageBlock a12 = ImageBlock.a.a(jSONObject8, widgetObjects, style15);
                                if (a12 != null) {
                                    leftData = new LeftData.Image(a12, badgeBlock);
                                    arrayList4 = arrayList11;
                                    widgetObjects3 = widgetObjects;
                                    MiddleData.a aVar16 = MiddleData.CREATOR;
                                    str11 = str31;
                                    optJSONObject = optJSONObject16.optJSONObject(str11);
                                    MiddleData.Style style16 = style13.c;
                                    aVar16.getClass();
                                    if (optJSONObject != null || style16 == null) {
                                        str2 = str22;
                                        leftData2 = leftData;
                                        str8 = str11;
                                        str12 = str28;
                                        str7 = str35;
                                        str13 = str20;
                                    } else {
                                        str8 = str11;
                                        ImageBlock.Style style17 = style16.e;
                                        leftData2 = leftData;
                                        List<ButtonBlock.Style> list7 = style16.f;
                                        str12 = str28;
                                        String str39 = str35;
                                        str13 = str20;
                                        JSONObject optJSONObject19 = optJSONObject.optJSONObject(str39);
                                        str7 = str39;
                                        if (optJSONObject19 == null || (style4 = style16.b) == null) {
                                            textBlock = null;
                                        } else {
                                            TextBlock.CREATOR.getClass();
                                            textBlock = TextBlock.a.a(optJSONObject19, style4);
                                        }
                                        JSONObject optJSONObject20 = optJSONObject.optJSONObject("subtitle");
                                        if (optJSONObject20 == null || (style3 = style16.c) == null) {
                                            textBlock2 = null;
                                        } else {
                                            TextBlock.CREATOR.getClass();
                                            textBlock2 = TextBlock.a.a(optJSONObject20, style3);
                                        }
                                        JSONObject optJSONObject21 = optJSONObject.optJSONObject("second_subtitle");
                                        if (optJSONObject21 == null || (style2 = style16.d) == null) {
                                            textBlock3 = null;
                                        } else {
                                            TextBlock.CREATOR.getClass();
                                            textBlock3 = TextBlock.a.a(optJSONObject21, style2);
                                        }
                                        if (!optJSONObject.has(str29) || (list5 = list7) == null || list5.isEmpty()) {
                                            style = style16;
                                            if (optJSONObject.has(str22) && (list3 = list7) != null && !list3.isEmpty()) {
                                                JSONArray jSONArray7 = optJSONObject.getJSONArray(str22);
                                                if (jSONArray7 != null) {
                                                    arrayList5 = new ArrayList(jSONArray7.length());
                                                    int length4 = jSONArray7.length();
                                                    str2 = str22;
                                                    int i10 = 0;
                                                    while (i10 < length4) {
                                                        int i11 = length4;
                                                        JSONObject optJSONObject22 = jSONArray7.optJSONObject(i10);
                                                        if (optJSONObject22 != null) {
                                                            jSONArray2 = jSONArray7;
                                                            int min = Math.min(i10, list7.size() - 1);
                                                            ButtonBlock.a aVar17 = ButtonBlock.CREATOR;
                                                            ButtonBlock.Style style18 = list7.get(min);
                                                            aVar17.getClass();
                                                            arrayList5.add(ButtonBlock.a.a(optJSONObject22, style18));
                                                        } else {
                                                            jSONArray2 = jSONArray7;
                                                        }
                                                        i10++;
                                                        length4 = i11;
                                                        jSONArray7 = jSONArray2;
                                                    }
                                                } else {
                                                    str2 = str22;
                                                    arrayList5 = null;
                                                }
                                                if (arrayList5 != null) {
                                                    V = j5g.V(arrayList5);
                                                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("avatars");
                                                    if (style17 != null) {
                                                        if (optJSONArray2 != null) {
                                                            arrayList6 = new ArrayList(optJSONArray2.length());
                                                            int length5 = optJSONArray2.length();
                                                            for (int i12 = 0; i12 < length5; i12++) {
                                                                JSONObject optJSONObject23 = optJSONArray2.optJSONObject(i12);
                                                                if (optJSONObject23 != null) {
                                                                    ImageBlock.CREATOR.getClass();
                                                                    arrayList6.add(ImageBlock.a.a(optJSONObject23, widgetObjects3, style17));
                                                                }
                                                            }
                                                        } else {
                                                            arrayList6 = null;
                                                        }
                                                        if (arrayList6 != null) {
                                                            list4 = j5g.V(arrayList6);
                                                            AvatarsBlock avatarsBlock = list4 == null ? new AvatarsBlock((List<ImageBlock>) list4) : null;
                                                            if (textBlock != null) {
                                                                middleData = new MiddleData(textBlock, textBlock2, textBlock3, avatarsBlock, V, style);
                                                                optJSONObject2 = optJSONObject16.optJSONObject(TtmlNode.RIGHT);
                                                                RightData.Style style19 = style13.d;
                                                                if (optJSONObject2 != null) {
                                                                    String string6 = optJSONObject2.getString(str6);
                                                                    if (string6 != null) {
                                                                        switch (string6.hashCode()) {
                                                                            case -1776935260:
                                                                                str3 = str13;
                                                                                str28 = str12;
                                                                                if (string6.equals("image_stack")) {
                                                                                    ImageStackBlock.a aVar18 = ImageStackBlock.CREATOR;
                                                                                    JSONObject optJSONObject24 = optJSONObject2.optJSONObject(str10);
                                                                                    aVar18.getClass();
                                                                                    if (optJSONObject24 == null) {
                                                                                        str5 = str10;
                                                                                        str4 = str27;
                                                                                        str9 = str29;
                                                                                        imageStackBlock = null;
                                                                                    } else {
                                                                                        str4 = str27;
                                                                                        WebAction a13 = WebAction.a.a(optJSONObject24.optJSONObject(str4), null);
                                                                                        JSONArray jSONArray8 = optJSONObject24.getJSONArray("items");
                                                                                        ArrayList arrayList12 = new ArrayList(jSONArray8.length());
                                                                                        int length6 = jSONArray8.length();
                                                                                        str9 = str29;
                                                                                        int i13 = 0;
                                                                                        while (i13 < length6) {
                                                                                            String str40 = str10;
                                                                                            JSONObject jSONObject9 = jSONArray8.getJSONObject(i13);
                                                                                            WebImage.a aVar19 = WebImage.CREATOR;
                                                                                            int i14 = i13;
                                                                                            JSONArray jSONArray9 = jSONObject9.getJSONArray("sizes");
                                                                                            aVar19.getClass();
                                                                                            arrayList12.add(new ImageBlock(WebImage.a.a(jSONArray9), new ImageBlock.Style(ImageBlock.Style.Size.MEDIUM, ImageBlock.Style.Outline.SQUARE, null, 4, null), a13, (String) null, 8, (zcl) null));
                                                                                            i13 = i14 + 1;
                                                                                            str10 = str40;
                                                                                        }
                                                                                        str5 = str10;
                                                                                        String U = drm0.U(optJSONObject24.optString("last_image_text"), "+");
                                                                                        bpn0 bpn0Var = cqm0.a;
                                                                                        try {
                                                                                            i3 = Integer.parseInt(U);
                                                                                        } catch (Throwable unused4) {
                                                                                            i3 = 0;
                                                                                        }
                                                                                        imageStackBlock = new ImageStackBlock(arrayList12, i3);
                                                                                    }
                                                                                    if (imageStackBlock != null) {
                                                                                        rightData = new RightData.ImageStack(new AvatarStackBlock(imageStackBlock.b, imageStackBlock.c));
                                                                                        break;
                                                                                    }
                                                                                    rightData = null;
                                                                                    break;
                                                                                }
                                                                                str5 = str10;
                                                                                str4 = str27;
                                                                                str9 = str29;
                                                                                rightData = null;
                                                                            case -1377687758:
                                                                                str3 = str13;
                                                                                str28 = str12;
                                                                                if (string6.equals(str29)) {
                                                                                    ButtonBlock.a aVar20 = ButtonBlock.CREATOR;
                                                                                    JSONObject optJSONObject25 = optJSONObject2.optJSONObject(str10);
                                                                                    ButtonBlock.Style style20 = style19 != null ? style19.e : null;
                                                                                    aVar20.getClass();
                                                                                    ButtonBlock a14 = ButtonBlock.a.a(optJSONObject25, style20);
                                                                                    if (a14 != null) {
                                                                                        button = new RightData.Button(a14);
                                                                                        str5 = str10;
                                                                                        rightData = button;
                                                                                        str4 = str27;
                                                                                        str9 = str29;
                                                                                        break;
                                                                                    }
                                                                                    str5 = str10;
                                                                                    str4 = str27;
                                                                                    rightData = null;
                                                                                    str9 = str29;
                                                                                }
                                                                                str5 = str10;
                                                                                str4 = str27;
                                                                                str9 = str29;
                                                                                rightData = null;
                                                                                break;
                                                                            case 3226745:
                                                                                str3 = str13;
                                                                                str28 = str12;
                                                                                if (string6.equals(str28)) {
                                                                                    IconBlock.a aVar21 = IconBlock.CREATOR;
                                                                                    JSONObject optJSONObject26 = optJSONObject2.optJSONObject(str10);
                                                                                    IconBlock.Style style21 = style19 != null ? style19.d : null;
                                                                                    aVar21.getClass();
                                                                                    IconBlock a15 = IconBlock.a.a(optJSONObject26, style21);
                                                                                    if (a15 != null) {
                                                                                        button = new RightData.Icon(a15);
                                                                                        str5 = str10;
                                                                                        rightData = button;
                                                                                        str4 = str27;
                                                                                        str9 = str29;
                                                                                        break;
                                                                                    }
                                                                                    str5 = str10;
                                                                                    str4 = str27;
                                                                                    rightData = null;
                                                                                    str9 = str29;
                                                                                }
                                                                                str5 = str10;
                                                                                str4 = str27;
                                                                                str9 = str29;
                                                                                rightData = null;
                                                                                break;
                                                                            case 957830652:
                                                                                str3 = str13;
                                                                                if (!string6.equals(str3)) {
                                                                                    str5 = str10;
                                                                                    str4 = str27;
                                                                                    str28 = str12;
                                                                                    str9 = str29;
                                                                                    rightData = null;
                                                                                    break;
                                                                                } else {
                                                                                    TextBlock.a aVar22 = TextBlock.CREATOR;
                                                                                    JSONObject optJSONObject27 = optJSONObject2.optJSONObject(str10);
                                                                                    TextBlock.Style style22 = style19 != null ? style19.c : null;
                                                                                    aVar22.getClass();
                                                                                    TextBlock a16 = TextBlock.a.a(optJSONObject27, style22);
                                                                                    if (a16 != null) {
                                                                                        str5 = str10;
                                                                                        rightData = new RightData.Counter(a16, style19.b);
                                                                                        str4 = str27;
                                                                                        str28 = str12;
                                                                                        str9 = str29;
                                                                                        break;
                                                                                    } else {
                                                                                        str5 = str10;
                                                                                        str4 = str27;
                                                                                        str28 = str12;
                                                                                        rightData = null;
                                                                                        str9 = str29;
                                                                                    }
                                                                                }
                                                                            case 1934806292:
                                                                                if (string6.equals("user_stack")) {
                                                                                    AvatarStackBlock.a aVar23 = AvatarStackBlock.CREATOR;
                                                                                    JSONObject optJSONObject28 = optJSONObject2.optJSONObject(str10);
                                                                                    aVar23.getClass();
                                                                                    AvatarStackBlock a17 = AvatarStackBlock.a.a(optJSONObject28, widgetObjects3);
                                                                                    if (a17 != null) {
                                                                                        str5 = str10;
                                                                                        rightData = new RightData.Avatars(a17);
                                                                                        str4 = str27;
                                                                                        str3 = str13;
                                                                                        str28 = str12;
                                                                                        str9 = str29;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            default:
                                                                                str5 = str10;
                                                                                str4 = str27;
                                                                                str3 = str13;
                                                                                str28 = str12;
                                                                                str9 = str29;
                                                                                rightData = null;
                                                                                break;
                                                                        }
                                                                        InformerRowBlock informerRowBlock = (leftData2 != null && middleData == null && rightData == null) ? null : new InformerRowBlock(leftData2, middleData, rightData, WebAction.a.a(optJSONObject16.optJSONObject(str4), null));
                                                                        arrayList3 = arrayList4;
                                                                        arrayList3.add(informerRowBlock);
                                                                    }
                                                                    str5 = str10;
                                                                    str4 = str27;
                                                                    str3 = str13;
                                                                    str28 = str12;
                                                                    str9 = str29;
                                                                    rightData = null;
                                                                    if (leftData2 != null) {
                                                                    }
                                                                    arrayList3 = arrayList4;
                                                                    arrayList3.add(informerRowBlock);
                                                                }
                                                                str5 = str10;
                                                                str4 = str27;
                                                                str3 = str13;
                                                                str28 = str12;
                                                                rightData = null;
                                                                str9 = str29;
                                                                if (leftData2 != null) {
                                                                }
                                                                arrayList3 = arrayList4;
                                                                arrayList3.add(informerRowBlock);
                                                            }
                                                        }
                                                    }
                                                    list4 = null;
                                                    if (list4 == null) {
                                                    }
                                                    if (textBlock != null) {
                                                    }
                                                }
                                                V = null;
                                                JSONArray optJSONArray22 = optJSONObject.optJSONArray("avatars");
                                                if (style17 != null) {
                                                }
                                                list4 = null;
                                                if (list4 == null) {
                                                }
                                                if (textBlock != null) {
                                                }
                                            }
                                            str2 = str22;
                                            V = null;
                                            JSONArray optJSONArray222 = optJSONObject.optJSONArray("avatars");
                                            if (style17 != null) {
                                            }
                                            list4 = null;
                                            if (list4 == null) {
                                            }
                                            if (textBlock != null) {
                                            }
                                        } else {
                                            ButtonBlock.a aVar24 = ButtonBlock.CREATOR;
                                            JSONObject jSONObject10 = optJSONObject.getJSONObject(str29);
                                            style = style16;
                                            ButtonBlock.Style style23 = list7.get(0);
                                            aVar24.getClass();
                                            ButtonBlock a18 = ButtonBlock.a.a(jSONObject10, style23);
                                            if (a18 != null) {
                                                str2 = str22;
                                                V = Collections.singletonList(a18);
                                                JSONArray optJSONArray2222 = optJSONObject.optJSONArray("avatars");
                                                if (style17 != null) {
                                                }
                                                list4 = null;
                                                if (list4 == null) {
                                                }
                                                if (textBlock != null) {
                                                }
                                            }
                                            str2 = str22;
                                            V = null;
                                            JSONArray optJSONArray22222 = optJSONObject.optJSONArray("avatars");
                                            if (style17 != null) {
                                            }
                                            list4 = null;
                                            if (list4 == null) {
                                            }
                                            if (textBlock != null) {
                                            }
                                        }
                                    }
                                    middleData = null;
                                    optJSONObject2 = optJSONObject16.optJSONObject(TtmlNode.RIGHT);
                                    RightData.Style style192 = style13.d;
                                    if (optJSONObject2 != null) {
                                    }
                                    str5 = str10;
                                    str4 = str27;
                                    str3 = str13;
                                    str28 = str12;
                                    rightData = null;
                                    str9 = str29;
                                    if (leftData2 != null) {
                                    }
                                    arrayList3 = arrayList4;
                                    arrayList3.add(informerRowBlock);
                                } else {
                                    arrayList4 = arrayList11;
                                    widgetObjects3 = widgetObjects;
                                }
                            } else {
                                str33 = str38;
                                str10 = str30;
                                arrayList4 = arrayList11;
                                widgetObjects3 = widgetObjects;
                                if (epx.f(string5, str28)) {
                                    IconBlock.a aVar25 = IconBlock.CREATOR;
                                    JSONObject jSONObject11 = optJSONObject17.getJSONObject(str10);
                                    IconBlock.Style style24 = style14.c;
                                    aVar25.getClass();
                                    IconBlock a19 = IconBlock.a.a(jSONObject11, style24);
                                    if (a19 != null) {
                                        leftData = new LeftData.Icon(a19, badgeBlock);
                                        MiddleData.a aVar162 = MiddleData.CREATOR;
                                        str11 = str31;
                                        optJSONObject = optJSONObject16.optJSONObject(str11);
                                        MiddleData.Style style162 = style13.c;
                                        aVar162.getClass();
                                        if (optJSONObject != null) {
                                        }
                                        str2 = str22;
                                        leftData2 = leftData;
                                        str8 = str11;
                                        str12 = str28;
                                        str7 = str35;
                                        str13 = str20;
                                        middleData = null;
                                        optJSONObject2 = optJSONObject16.optJSONObject(TtmlNode.RIGHT);
                                        RightData.Style style1922 = style13.d;
                                        if (optJSONObject2 != null) {
                                        }
                                        str5 = str10;
                                        str4 = str27;
                                        str3 = str13;
                                        str28 = str12;
                                        rightData = null;
                                        str9 = str29;
                                        if (leftData2 != null) {
                                        }
                                        arrayList3 = arrayList4;
                                        arrayList3.add(informerRowBlock);
                                    }
                                }
                            }
                        }
                        leftData = null;
                        MiddleData.a aVar1622 = MiddleData.CREATOR;
                        str11 = str31;
                        optJSONObject = optJSONObject16.optJSONObject(str11);
                        MiddleData.Style style1622 = style13.c;
                        aVar1622.getClass();
                        if (optJSONObject != null) {
                        }
                        str2 = str22;
                        leftData2 = leftData;
                        str8 = str11;
                        str12 = str28;
                        str7 = str35;
                        str13 = str20;
                        middleData = null;
                        optJSONObject2 = optJSONObject16.optJSONObject(TtmlNode.RIGHT);
                        RightData.Style style19222 = style13.d;
                        if (optJSONObject2 != null) {
                        }
                        str5 = str10;
                        str4 = str27;
                        str3 = str13;
                        str28 = str12;
                        rightData = null;
                        str9 = str29;
                        if (leftData2 != null) {
                        }
                        arrayList3 = arrayList4;
                        arrayList3.add(informerRowBlock);
                    } else {
                        jSONArray = jSONArray6;
                        arrayList3 = arrayList11;
                        str2 = str22;
                        list2 = V3;
                        i = length3;
                        i2 = i8;
                        str3 = str20;
                        str4 = str27;
                        str5 = str30;
                        str6 = str;
                        str7 = str35;
                        str8 = str31;
                        str9 = str29;
                        jSONObject4 = jSONObject7;
                    }
                    arrayList11 = arrayList3;
                    str20 = str3;
                    jSONObject7 = jSONObject4;
                    jSONArray6 = jSONArray;
                    V3 = list2;
                    length3 = i;
                    str31 = str8;
                    str30 = str5;
                    str35 = str7;
                    str = str6;
                    i8 = i2 + 1;
                    str29 = str9;
                    str27 = str4;
                    str22 = str2;
                }
                list = null;
                arrayList2 = arrayList11;
                jSONObject3 = jSONObject7;
                widgetObjects2 = widgetObjects;
            } else {
                list = null;
                arrayList2 = null;
                widgetObjects2 = widgetObjects;
                jSONObject3 = jSONObject7;
            }
            List V4 = arrayList2 != null ? j5g.V(arrayList2) : list;
            if (V4 == null || V4.isEmpty()) {
                throw new NullPointerException("Failed to parse rows");
            }
            JSONObject jSONObject12 = jSONObject3;
            BaseBlock c = UniversalWidget.a.c(jSONObject12, widgetObjects2);
            if (c == null) {
                c = EmptyBlock.b;
            }
            BaseBlock baseBlock = c;
            WidgetBasePayload.CREATOR.getClass();
            return new InformerUniWidget(a, string, a3, a2, optString, new Payload(a6, a5, V4, baseBlock, WidgetBasePayload.a.a(jSONObject12)));
        }

        @Override // android.os.Parcelable.Creator
        public final InformerUniWidget createFromParcel(Parcel parcel) {
            return new InformerUniWidget(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final InformerUniWidget[] newArray(int i) {
            return new InformerUniWidget[i];
        }
    }

    public InformerUniWidget(Parcel parcel) {
        this((WidgetIds) parcel.readParcelable(WidgetIds.class.getClassLoader()), parcel.readString(), (QueueSettings) parcel.readParcelable(QueueSettings.class.getClassLoader()), (WidgetSettings) parcel.readParcelable(WidgetSettings.class.getClassLoader()), parcel.readString(), (Payload) parcel.readParcelable(Payload.class.getClassLoader()));
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final SuperAppWidget b(boolean z) {
        return new InformerUniWidget(this.m, this.n, this.o, new WidgetSettings(z, this.p.c, false, false, 12, null), this.q, this.r);
    }

    @Override // com.vk.superapp.ui.uniwidgets.dto.UniversalWidget, com.vk.superapp.ui.widgets.SuperAppWidget
    public final WidgetIds d() {
        return this.m;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final WidgetSettings e() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InformerUniWidget)) {
            return false;
        }
        InformerUniWidget informerUniWidget = (InformerUniWidget) obj;
        return epx.f(this.m, informerUniWidget.m) && epx.f(this.n, informerUniWidget.n) && epx.f(this.o, informerUniWidget.o) && epx.f(this.p, informerUniWidget.p) && epx.f(this.q, informerUniWidget.q) && epx.f(this.r, informerUniWidget.r);
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget
    public final String getType() {
        return this.n;
    }

    public final int hashCode() {
        return this.r.hashCode() + urd0.a(xq.b(this.p, bzk0.a(this.o, urd0.a(this.m.hashCode() * 31, 31, this.n), 31), 31), 31, this.q);
    }

    public final String toString() {
        return "InformerUniWidget(ids=" + this.m + ", type=" + this.n + ", queueSettings=" + this.o + ", settings=" + this.p + ", actionTitle=" + this.q + ", payload=" + this.r + ')';
    }

    @Override // com.vk.superapp.ui.widgets.SuperAppWidget, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.m, i);
        parcel.writeString(this.n);
        parcel.writeParcelable(this.o, i);
        parcel.writeParcelable(this.p, i);
        parcel.writeString(this.q);
        parcel.writeParcelable(this.r, i);
    }

    /* compiled from: InformerUniWidget.kt */
    public static final class MiddleData implements Parcelable {
        public static final a CREATOR = new a();
        public final TextBlock b;
        public final TextBlock c;
        public final TextBlock d;
        public final AvatarsBlock e;
        public final List<ButtonBlock> f;
        public final Style g;

        /* compiled from: InformerUniWidget.kt */
        public static final class a implements Parcelable.Creator<MiddleData> {
            @Override // android.os.Parcelable.Creator
            public final MiddleData createFromParcel(Parcel parcel) {
                return new MiddleData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final MiddleData[] newArray(int i) {
                return new MiddleData[i];
            }
        }

        public MiddleData(TextBlock textBlock, TextBlock textBlock2, TextBlock textBlock3, AvatarsBlock avatarsBlock, List<ButtonBlock> list, Style style) {
            this.b = textBlock;
            this.c = textBlock2;
            this.d = textBlock3;
            this.e = avatarsBlock;
            this.f = list;
            this.g = style;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MiddleData)) {
                return false;
            }
            MiddleData middleData = (MiddleData) obj;
            return epx.f(this.b, middleData.b) && epx.f(this.c, middleData.c) && epx.f(this.d, middleData.d) && epx.f(this.e, middleData.e) && epx.f(this.f, middleData.f) && epx.f(this.g, middleData.g);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            TextBlock textBlock = this.c;
            int hashCode2 = (hashCode + (textBlock == null ? 0 : textBlock.hashCode())) * 31;
            TextBlock textBlock2 = this.d;
            int hashCode3 = (hashCode2 + (textBlock2 == null ? 0 : textBlock2.hashCode())) * 31;
            AvatarsBlock avatarsBlock = this.e;
            int hashCode4 = (hashCode3 + (avatarsBlock == null ? 0 : avatarsBlock.hashCode())) * 31;
            List<ButtonBlock> list = this.f;
            int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            Style style = this.g;
            return hashCode5 + (style != null ? style.hashCode() : 0);
        }

        public final String toString() {
            return "MiddleData(titleBlock=" + this.b + ", subtitleBlock=" + this.c + ", secondSubtitleBlock=" + this.d + ", avatarsBlock=" + this.e + ", buttonBlocks=" + this.f + ", style=" + this.g + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
            parcel.writeParcelable(this.e, i);
            parcel.writeTypedList(this.f);
            parcel.writeParcelable(this.g, i);
        }

        /* compiled from: InformerUniWidget.kt */
        public static final class Style implements Parcelable {
            public static final a CREATOR = new a();
            public final TextBlock.Style b;
            public final TextBlock.Style c;
            public final TextBlock.Style d;
            public final ImageBlock.Style e;
            public final List<ButtonBlock.Style> f;
            public final VerticalAlign g;

            /* compiled from: InformerUniWidget.kt */
            public static final class a implements Parcelable.Creator<Style> {
                @Override // android.os.Parcelable.Creator
                public final Style createFromParcel(Parcel parcel) {
                    return new Style(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final Style[] newArray(int i) {
                    return new Style[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Style(TextBlock.Style style, TextBlock.Style style2, TextBlock.Style style3, ImageBlock.Style style4, List<? extends ButtonBlock.Style> list, VerticalAlign verticalAlign) {
                this.b = style;
                this.c = style2;
                this.d = style3;
                this.e = style4;
                this.f = list;
                this.g = verticalAlign;
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
                return epx.f(this.b, style.b) && epx.f(this.c, style.c) && epx.f(this.d, style.d) && epx.f(this.e, style.e) && epx.f(this.f, style.f) && this.g == style.g;
            }

            public final int hashCode() {
                TextBlock.Style style = this.b;
                int hashCode = (style == null ? 0 : style.hashCode()) * 31;
                TextBlock.Style style2 = this.c;
                int hashCode2 = (hashCode + (style2 == null ? 0 : style2.hashCode())) * 31;
                TextBlock.Style style3 = this.d;
                int hashCode3 = (hashCode2 + (style3 == null ? 0 : style3.hashCode())) * 31;
                ImageBlock.Style style4 = this.e;
                int hashCode4 = (hashCode3 + (style4 == null ? 0 : style4.hashCode())) * 31;
                List<ButtonBlock.Style> list = this.f;
                return this.g.hashCode() + ((hashCode4 + (list != null ? list.hashCode() : 0)) * 31);
            }

            public final String toString() {
                return "Style(title=" + this.b + ", subtitle=" + this.c + ", secondSubtitle=" + this.d + ", avatars=" + this.e + ", buttons=" + this.f + ", verticalAlign=" + this.g + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                ArrayList arrayList;
                parcel.writeParcelable(this.b, i);
                parcel.writeParcelable(this.c, i);
                parcel.writeParcelable(this.d, i);
                parcel.writeParcelable(this.e, i);
                List<ButtonBlock.Style> list = this.f;
                if (list != null) {
                    List<ButtonBlock.Style> list2 = list;
                    arrayList = new ArrayList(c5g.u(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ButtonBlock.Style) it.next()).name());
                    }
                } else {
                    arrayList = null;
                }
                parcel.writeStringList(arrayList);
                parcel.writeString(this.g.name());
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Style(Parcel parcel) {
                this(r3, r4, r5, r6, r1, VerticalAlign.valueOf(parcel.readString()));
                ArrayList arrayList;
                TextBlock.Style style = (TextBlock.Style) parcel.readParcelable(TextBlock.Style.class.getClassLoader());
                TextBlock.Style style2 = (TextBlock.Style) parcel.readParcelable(TextBlock.Style.class.getClassLoader());
                TextBlock.Style style3 = (TextBlock.Style) parcel.readParcelable(TextBlock.Style.class.getClassLoader());
                ImageBlock.Style style4 = (ImageBlock.Style) parcel.readParcelable(ImageBlock.Style.class.getClassLoader());
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                if (createStringArrayList != null) {
                    arrayList = new ArrayList(c5g.u(createStringArrayList, 10));
                    Iterator<T> it = createStringArrayList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ButtonBlock.Style.valueOf((String) it.next()));
                    }
                } else {
                    arrayList = null;
                }
            }
        }

        public MiddleData(Parcel parcel) {
            this((TextBlock) parcel.readParcelable(TextBlock.class.getClassLoader()), (TextBlock) parcel.readParcelable(TextBlock.class.getClassLoader()), (TextBlock) parcel.readParcelable(TextBlock.class.getClassLoader()), (AvatarsBlock) parcel.readParcelable(AvatarsBlock.class.getClassLoader()), parcel.createTypedArrayList(ButtonBlock.CREATOR), (Style) parcel.readParcelable(Style.class.getClassLoader()));
        }
    }

    /* compiled from: InformerUniWidget.kt */
    public static final class Payload implements Parcelable {
        public static final a CREATOR = new a();
        public final WebAction b;
        public final BaseBlock c;
        public final List<InformerRowBlock> d;
        public final BaseBlock e;
        public final WidgetBasePayload f;

        /* compiled from: InformerUniWidget.kt */
        public static final class a implements Parcelable.Creator<Payload> {
            @Override // android.os.Parcelable.Creator
            public final Payload createFromParcel(Parcel parcel) {
                return new Payload(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Payload[] newArray(int i) {
                return new Payload[i];
            }
        }

        public Payload(WebAction webAction, BaseBlock baseBlock, List<InformerRowBlock> list, BaseBlock baseBlock2, WidgetBasePayload widgetBasePayload) {
            this.b = webAction;
            this.c = baseBlock;
            this.d = list;
            this.e = baseBlock2;
            this.f = widgetBasePayload;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) obj;
            return epx.f(this.b, payload.b) && epx.f(this.c, payload.c) && epx.f(this.d, payload.d) && epx.f(this.e, payload.e) && epx.f(this.f, payload.f);
        }

        public final int hashCode() {
            WebAction webAction = this.b;
            return this.f.hashCode() + ((this.e.hashCode() + fw3.a((this.c.hashCode() + ((webAction == null ? 0 : webAction.hashCode()) * 31)) * 31, 31, this.d)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Payload(action=");
            sb.append(this.b);
            sb.append(", header=");
            sb.append(this.c);
            sb.append(", data=");
            sb.append(this.d);
            sb.append(", footer=");
            sb.append(this.e);
            sb.append(", basePayload=");
            return gq.f(sb, this.f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeTypedList(this.d);
            parcel.writeParcelable(this.e, i);
            parcel.writeParcelable(this.f, i);
        }

        public Payload(Parcel parcel) {
            this((WebAction) parcel.readParcelable(WebAction.class.getClassLoader()), (BaseBlock) parcel.readParcelable(BaseBlock.class.getClassLoader()), parcel.createTypedArrayList(InformerRowBlock.CREATOR), (BaseBlock) parcel.readParcelable(BaseBlock.class.getClassLoader()), (WidgetBasePayload) parcel.readParcelable(WidgetBasePayload.class.getClassLoader()));
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public InformerUniWidget(com.vk.superapp.api.dto.menu.WidgetIds r15, java.lang.String r16, com.vk.superapp.api.dto.menu.QueueSettings r17, com.vk.superapp.api.dto.menu.WidgetSettings r18, java.lang.String r19, com.vk.superapp.ui.uniwidgets.dto.InformerUniWidget.Payload r20) {
        /*
            r14 = this;
            r0 = r20
            com.vk.superapp.ui.widgets.WidgetBasePayload r1 = r0.f
            java.lang.String r5 = r1.b
            double r8 = r1.c
            com.vk.superapp.api.dto.widgets.actions.WebAction r10 = r0.b
            com.vk.superapp.ui.widgets.AdditionalHeaderIconBlock r2 = r1.e
            r13 = 0
            if (r2 == 0) goto L1d
            com.vk.superapp.api.dto.widgets.actions.WebAction r2 = r2.c
            r11 = r2
            r3 = r15
            r4 = r16
            r6 = r17
            r7 = r18
            r12 = r19
            r2 = r14
            goto L28
        L1d:
            r11 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r17
            r7 = r18
            r12 = r19
        L28:
            r2.<init>(r3, r4, r5, r6, r7, r8, r10, r11, r12)
            r14.m = r15
            r4 = r16
            r14.n = r4
            r6 = r17
            r14.o = r6
            r7 = r18
            r14.p = r7
            r12 = r19
            r14.q = r12
            r14.r = r0
            com.vk.superapp.ui.uniwidgets.blocks.BaseBlock r15 = r0.c
            r14.s = r15
            java.util.List<com.vk.superapp.ui.uniwidgets.blocks.InformerRowBlock> r15 = r0.d
            r14.t = r15
            com.vk.superapp.ui.uniwidgets.blocks.BaseBlock r15 = r0.e
            r14.u = r15
            com.vk.superapp.ui.uniwidgets.blocks.ImageBlock r3 = new com.vk.superapp.ui.uniwidgets.blocks.ImageBlock
            com.vk.superapp.ui.widgets.AdditionalHeaderIconBlock r15 = r1.e
            if (r15 == 0) goto L55
            com.vk.external.miniapp.net.app.WebImage r15 = r15.b
            r4 = r15
            goto L56
        L55:
            r4 = r13
        L56:
            com.vk.superapp.ui.uniwidgets.blocks.ImageBlock$Style r15 = new com.vk.superapp.ui.uniwidgets.blocks.ImageBlock$Style
            com.vk.superapp.ui.uniwidgets.blocks.ImageBlock$Style$Size r0 = com.vk.superapp.ui.uniwidgets.blocks.ImageBlock.Style.Size.SMALL
            r5 = 6
            r6 = 0
            r7 = 0
            r8 = 0
            r16 = r0
            r19 = r5
            r20 = r6
            r17 = r7
            r18 = r8
            r15.<init>(r16, r17, r18, r19, r20)
            com.vk.superapp.ui.widgets.AdditionalHeaderIconBlock r0 = r1.e
            if (r0 == 0) goto L71
            com.vk.superapp.api.dto.widgets.actions.WebAction r13 = r0.c
        L71:
            r6 = r13
            r8 = 8
            r9 = 0
            r7 = 0
            r5 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r14.v = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.superapp.ui.uniwidgets.dto.InformerUniWidget.<init>(com.vk.superapp.api.dto.menu.WidgetIds, java.lang.String, com.vk.superapp.api.dto.menu.QueueSettings, com.vk.superapp.api.dto.menu.WidgetSettings, java.lang.String, com.vk.superapp.ui.uniwidgets.dto.InformerUniWidget$Payload):void");
    }
}
