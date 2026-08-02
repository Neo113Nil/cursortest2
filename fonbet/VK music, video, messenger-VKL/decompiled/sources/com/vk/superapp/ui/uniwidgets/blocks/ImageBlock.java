package com.vk.superapp.ui.uniwidgets.blocks;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.api.dto.group.WebGroupShortInfo;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.uniwidgets.WidgetObjects;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.asp;
import xsna.f370;
import xsna.z6j;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ImageBlock.kt */
/* loaded from: classes6.dex */
public final class ImageBlock implements BaseBlock {
    public static final a CREATOR = new a();
    public final WebImage b;
    public final String c;
    public final Integer d;
    public final Style e;
    public final WebAction f;
    public final String g;

    /* compiled from: ImageBlock.kt */
    public static final class Style implements Parcelable {
        public static final a CREATOR = new a();
        public final Size b;
        public final Outline c;
        public final VerticalAlign d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ImageBlock.kt */
        public static final class Outline {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Outline[] $VALUES;
            public static final Outline APP;
            public static final Outline CIRCLE;
            public static final Outline POSTER;
            public static final Outline RAW;
            public static final Outline SQUARE;
            public static final Outline TV;

            static {
                Outline outline = new Outline("APP", 0);
                APP = outline;
                Outline outline2 = new Outline("SQUARE", 1);
                SQUARE = outline2;
                Outline outline3 = new Outline("CIRCLE", 2);
                CIRCLE = outline3;
                Outline outline4 = new Outline("POSTER", 3);
                POSTER = outline4;
                Outline outline5 = new Outline("TV", 4);
                TV = outline5;
                Outline outline6 = new Outline("RAW", 5);
                RAW = outline6;
                Outline[] outlineArr = {outline, outline2, outline3, outline4, outline5, outline6};
                $VALUES = outlineArr;
                $ENTRIES = new asp(outlineArr);
            }

            public Outline() {
                throw null;
            }

            public static Outline valueOf(String str) {
                return (Outline) Enum.valueOf(Outline.class, str);
            }

            public static Outline[] values() {
                return (Outline[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ImageBlock.kt */
        public static final class Size {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Size[] $VALUES;
            public static final Size EXTRA_LARGE;
            public static final Size LARGE;
            public static final Size MEDIUM;
            public static final Size NONE;
            public static final Size SMALL;

            static {
                Size size = new Size("NONE", 0);
                NONE = size;
                Size size2 = new Size("SMALL", 1);
                SMALL = size2;
                Size size3 = new Size("MEDIUM", 2);
                MEDIUM = size3;
                Size size4 = new Size("LARGE", 3);
                LARGE = size4;
                Size size5 = new Size("EXTRA_LARGE", 4);
                EXTRA_LARGE = size5;
                Size[] sizeArr = {size, size2, size3, size4, size5};
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

        /* compiled from: ImageBlock.kt */
        public static final class a implements Parcelable.Creator<Style> {
            public static Style a(String str, JSONObject jSONObject) {
                Object obj;
                Object obj2;
                String A;
                if (jSONObject != null && (A = f370.A("size", jSONObject)) != null) {
                    str = A;
                }
                Enum r0 = null;
                String A2 = jSONObject != null ? f370.A("type", jSONObject) : null;
                String A3 = jSONObject != null ? f370.A("vertical_align", jSONObject) : null;
                Object obj3 = Size.MEDIUM;
                if (str != null) {
                    try {
                        obj = Enum.valueOf(Size.class, str.toUpperCase(Locale.US));
                    } catch (IllegalArgumentException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        obj3 = obj;
                    }
                }
                Size size = (Size) obj3;
                Object obj4 = Outline.CIRCLE;
                if (A2 != null) {
                    try {
                        obj2 = Enum.valueOf(Outline.class, A2.toUpperCase(Locale.US));
                    } catch (IllegalArgumentException unused2) {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        obj4 = obj2;
                    }
                }
                Outline outline = (Outline) obj4;
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
                return new Style(size, outline, (VerticalAlign) r1);
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b.name());
            parcel.writeString(this.c.name());
            parcel.writeString(this.d.name());
        }

        public Style(Size size, Outline outline, VerticalAlign verticalAlign) {
            this.b = size;
            this.c = outline;
            this.d = verticalAlign;
        }

        public /* synthetic */ Style(Size size, Outline outline, VerticalAlign verticalAlign, int i, zcl zclVar) {
            this((i & 1) != 0 ? Size.MEDIUM : size, (i & 2) != 0 ? Outline.CIRCLE : outline, (i & 4) != 0 ? VerticalAlign.TOP : verticalAlign);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Style(Size size, String str) {
            this(size, (Outline) r0, null, 4, null);
            Object obj;
            Object obj2 = Outline.SQUARE;
            if (str != null) {
                try {
                    obj = Enum.valueOf(Outline.class, str.toUpperCase(Locale.US));
                } catch (IllegalArgumentException unused) {
                    obj = null;
                }
                if (obj != null) {
                    obj2 = obj;
                }
            }
        }

        public Style(Parcel parcel) {
            this(Size.valueOf(parcel.readString()), Outline.valueOf(parcel.readString()), VerticalAlign.valueOf(parcel.readString()));
        }
    }

    /* compiled from: ImageBlock.kt */
    public static final class a implements Parcelable.Creator<ImageBlock> {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static ImageBlock a(JSONObject jSONObject, WidgetObjects widgetObjects, Style style) {
            WebImage webImage;
            WebImage webImage2;
            if (style != null) {
                WebAction a = WebAction.a.a(jSONObject.optJSONObject("action"), null);
                String A = f370.A("overlay_text", jSONObject);
                String string = jSONObject.getString("type");
                if (string != null) {
                    switch (string.hashCode()) {
                        case -1359492551:
                            if (string.equals("mini_app")) {
                                WebApiApplication webApiApplication = widgetObjects.b.get(Long.valueOf(jSONObject.getLong("object_id")));
                                if (webApiApplication != null) {
                                    return new ImageBlock(webApiApplication.d.b, style, a, (String) null, 8, (zcl) null);
                                }
                            }
                            break;
                        case -1183997287:
                            if (string.equals("inline")) {
                                WebImage.a aVar = WebImage.CREATOR;
                                JSONArray jSONArray = jSONObject.getJSONArray("items");
                                aVar.getClass();
                                return new ImageBlock(WebImage.a.a(jSONArray), style, a, A);
                            }
                            break;
                        case -309425751:
                            if (string.equals(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)) {
                                WebUserShortInfo webUserShortInfo = widgetObjects.c.get(Long.valueOf(jSONObject.getLong("object_id")));
                                if (webUserShortInfo != null && (webImage = webUserShortInfo.h) != null) {
                                    return new ImageBlock(webImage, style, a, (String) null, 8, (zcl) null);
                                }
                            }
                            break;
                        case 98629247:
                            if (string.equals("group")) {
                                WebGroupShortInfo webGroupShortInfo = widgetObjects.d.get(Long.valueOf(jSONObject.getLong("object_id")));
                                if (webGroupShortInfo != null && (webImage2 = webGroupShortInfo.i) != null) {
                                    return new ImageBlock(webImage2, style, a, (String) null, 8, (zcl) null);
                                }
                            }
                            break;
                    }
                }
            }
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final ImageBlock createFromParcel(Parcel parcel) {
            return new ImageBlock(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageBlock[] newArray(int i) {
            return new ImageBlock[i];
        }
    }

    public ImageBlock(WebImage webImage, String str, Integer num, Style style, WebAction webAction, String str2) {
        this.b = webImage;
        this.c = str;
        this.d = num;
        this.e = style;
        this.f = webAction;
        this.g = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeValue(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeString(this.g);
    }

    public /* synthetic */ ImageBlock(WebImage webImage, String str, Integer num, Style style, WebAction webAction, String str2, int i, zcl zclVar) {
        this(webImage, str, num, style, webAction, (i & 32) != 0 ? null : str2);
    }

    public /* synthetic */ ImageBlock(WebImage webImage, Style style, WebAction webAction, String str, int i, zcl zclVar) {
        this(webImage, style, webAction, (i & 8) != 0 ? null : str);
    }

    public ImageBlock(WebImage webImage, Style style, WebAction webAction, String str) {
        this(webImage, (webImage == null || (r0 = webImage.e(z6j.f(style))) == null) ? null : r0.b, (Integer) null, style, webAction, str);
        WebImageSize e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ImageBlock(Parcel parcel) {
        this(r2, r3, r0 instanceof Integer ? (Integer) r0 : null, (Style) parcel.readParcelable(Style.class.getClassLoader()), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()), parcel.readString());
        WebImage webImage = (WebImage) parcel.readParcelable(WebImage.class.getClassLoader());
        String readString = parcel.readString();
        Object readValue = parcel.readValue(Integer.TYPE.getClassLoader());
    }
}
