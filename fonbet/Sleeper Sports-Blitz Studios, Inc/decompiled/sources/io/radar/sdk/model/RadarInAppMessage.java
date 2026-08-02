package io.radar.sdk.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RadarInAppMessage.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0005%&'()B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J?\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\u0006\u0010\"\u001a\u00020#J\t\u0010$\u001a\u00020#HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, d2 = {"Lio/radar/sdk/model/RadarInAppMessage;", "", "title", "Lio/radar/sdk/model/RadarInAppMessage$Title;", "body", "Lio/radar/sdk/model/RadarInAppMessage$Body;", RadarInAppMessage.KEY_BUTTON, "Lio/radar/sdk/model/RadarInAppMessage$Button;", "image", "Lio/radar/sdk/model/RadarInAppMessage$Image;", "metadata", "Lorg/json/JSONObject;", "(Lio/radar/sdk/model/RadarInAppMessage$Title;Lio/radar/sdk/model/RadarInAppMessage$Body;Lio/radar/sdk/model/RadarInAppMessage$Button;Lio/radar/sdk/model/RadarInAppMessage$Image;Lorg/json/JSONObject;)V", "getBody", "()Lio/radar/sdk/model/RadarInAppMessage$Body;", "getButton", "()Lio/radar/sdk/model/RadarInAppMessage$Button;", "getImage", "()Lio/radar/sdk/model/RadarInAppMessage$Image;", "getMetadata", "()Lorg/json/JSONObject;", "getTitle", "()Lio/radar/sdk/model/RadarInAppMessage$Title;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toJson", "", InAppPurchaseConstants.METHOD_TO_STRING, "Body", "Button", "Companion", "Image", "Title", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RadarInAppMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String KEY_BACKGROUND_COLOR = "backgroundColor";
    private static final String KEY_BODY = "body";
    private static final String KEY_BUTTON = "button";
    private static final String KEY_COLOR = "color";
    private static final String KEY_DEEPLINK = "deepLink";
    private static final String KEY_IMAGE = "image";
    private static final String KEY_METADATA = "metadata";
    private static final String KEY_NAME = "name";
    private static final String KEY_TEXT = "text";
    private static final String KEY_TITLE = "title";
    private static final String KEY_URL = "url";
    private final Body body;
    private final Button button;
    private final Image image;
    private final JSONObject metadata;
    private final Title title;

    public static /* synthetic */ RadarInAppMessage copy$default(RadarInAppMessage radarInAppMessage, Title title, Body body, Button button, Image image, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            title = radarInAppMessage.title;
        }
        if ((i & 2) != 0) {
            body = radarInAppMessage.body;
        }
        if ((i & 4) != 0) {
            button = radarInAppMessage.button;
        }
        if ((i & 8) != 0) {
            image = radarInAppMessage.image;
        }
        if ((i & 16) != 0) {
            jSONObject = radarInAppMessage.metadata;
        }
        JSONObject jSONObject2 = jSONObject;
        Button button2 = button;
        return radarInAppMessage.copy(title, body, button2, image, jSONObject2);
    }

    @JvmStatic
    public static final RadarInAppMessage fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    /* renamed from: component1, reason: from getter */
    public final Title getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final Body getBody() {
        return this.body;
    }

    /* renamed from: component3, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    /* renamed from: component4, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    /* renamed from: component5, reason: from getter */
    public final JSONObject getMetadata() {
        return this.metadata;
    }

    public final RadarInAppMessage copy(Title title, Body body, Button button, Image image, JSONObject metadata) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new RadarInAppMessage(title, body, button, image, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadarInAppMessage)) {
            return false;
        }
        RadarInAppMessage radarInAppMessage = (RadarInAppMessage) other;
        return Intrinsics.areEqual(this.title, radarInAppMessage.title) && Intrinsics.areEqual(this.body, radarInAppMessage.body) && Intrinsics.areEqual(this.button, radarInAppMessage.button) && Intrinsics.areEqual(this.image, radarInAppMessage.image) && Intrinsics.areEqual(this.metadata, radarInAppMessage.metadata);
    }

    public int hashCode() {
        int hashCode = ((this.title.hashCode() * 31) + this.body.hashCode()) * 31;
        Button button = this.button;
        int hashCode2 = (hashCode + (button == null ? 0 : button.hashCode())) * 31;
        Image image = this.image;
        return ((hashCode2 + (image != null ? image.hashCode() : 0)) * 31) + this.metadata.hashCode();
    }

    public String toString() {
        return "RadarInAppMessage(title=" + this.title + ", body=" + this.body + ", button=" + this.button + ", image=" + this.image + ", metadata=" + this.metadata + ')';
    }

    public RadarInAppMessage(Title title, Body body, Button button, Image image, JSONObject metadata) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.title = title;
        this.body = body;
        this.button = button;
        this.image = image;
        this.metadata = metadata;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ RadarInAppMessage(Title title, Body body, Button button, Image image, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(title, body, button, r6, r7);
        JSONObject jSONObject2;
        Image image2;
        button = (i & 4) != 0 ? null : button;
        if ((i & 8) != 0) {
            jSONObject2 = jSONObject;
            image2 = null;
        } else {
            jSONObject2 = jSONObject;
            image2 = image;
        }
    }

    public final Title getTitle() {
        return this.title;
    }

    public final Body getBody() {
        return this.body;
    }

    public final Button getButton() {
        return this.button;
    }

    public final Image getImage() {
        return this.image;
    }

    public final JSONObject getMetadata() {
        return this.metadata;
    }

    /* compiled from: RadarInAppMessage.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/radar/sdk/model/RadarInAppMessage$Title;", "", "text", "", "color", "(Ljava/lang/String;Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Title {
        private final String color;
        private final String text;

        public static /* synthetic */ Title copy$default(Title title, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = title.text;
            }
            if ((i & 2) != 0) {
                str2 = title.color;
            }
            return title.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        public final Title copy(String text, String color) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(color, "color");
            return new Title(text, color);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Title)) {
                return false;
            }
            Title title = (Title) other;
            return Intrinsics.areEqual(this.text, title.text) && Intrinsics.areEqual(this.color, title.color);
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.color.hashCode();
        }

        public String toString() {
            return "Title(text=" + this.text + ", color=" + this.color + ')';
        }

        public Title(String text, String color) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(color, "color");
            this.text = text;
            this.color = color;
        }

        public final String getText() {
            return this.text;
        }

        public final String getColor() {
            return this.color;
        }
    }

    /* compiled from: RadarInAppMessage.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/radar/sdk/model/RadarInAppMessage$Body;", "", "text", "", "color", "(Ljava/lang/String;Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Body {
        private final String color;
        private final String text;

        public static /* synthetic */ Body copy$default(Body body, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = body.text;
            }
            if ((i & 2) != 0) {
                str2 = body.color;
            }
            return body.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        public final Body copy(String text, String color) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(color, "color");
            return new Body(text, color);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Body)) {
                return false;
            }
            Body body = (Body) other;
            return Intrinsics.areEqual(this.text, body.text) && Intrinsics.areEqual(this.color, body.color);
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.color.hashCode();
        }

        public String toString() {
            return "Body(text=" + this.text + ", color=" + this.color + ')';
        }

        public Body(String text, String color) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(color, "color");
            this.text = text;
            this.color = color;
        }

        public final String getText() {
            return this.text;
        }

        public final String getColor() {
            return this.color;
        }
    }

    /* compiled from: RadarInAppMessage.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lio/radar/sdk/model/RadarInAppMessage$Button;", "", "text", "", "color", "backgroundColor", "deepLink", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getColor", "getDeepLink", "getText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button {
        private final String backgroundColor;
        private final String color;
        private final String deepLink;
        private final String text;

        public static /* synthetic */ Button copy$default(Button button, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = button.text;
            }
            if ((i & 2) != 0) {
                str2 = button.color;
            }
            if ((i & 4) != 0) {
                str3 = button.backgroundColor;
            }
            if ((i & 8) != 0) {
                str4 = button.deepLink;
            }
            return button.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDeepLink() {
            return this.deepLink;
        }

        public final Button copy(String text, String color, String backgroundColor, String deepLink) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(color, "color");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return new Button(text, color, backgroundColor, deepLink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return Intrinsics.areEqual(this.text, button.text) && Intrinsics.areEqual(this.color, button.color) && Intrinsics.areEqual(this.backgroundColor, button.backgroundColor) && Intrinsics.areEqual(this.deepLink, button.deepLink);
        }

        public int hashCode() {
            int hashCode = ((((this.text.hashCode() * 31) + this.color.hashCode()) * 31) + this.backgroundColor.hashCode()) * 31;
            String str = this.deepLink;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Button(text=" + this.text + ", color=" + this.color + ", backgroundColor=" + this.backgroundColor + ", deepLink=" + this.deepLink + ')';
        }

        public Button(String text, String color, String backgroundColor, String str) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(color, "color");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.text = text;
            this.color = color;
            this.backgroundColor = backgroundColor;
            this.deepLink = str;
        }

        public /* synthetic */ Button(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? null : str4);
        }

        public final String getText() {
            return this.text;
        }

        public final String getColor() {
            return this.color;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getDeepLink() {
            return this.deepLink;
        }
    }

    /* compiled from: RadarInAppMessage.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/radar/sdk/model/RadarInAppMessage$Image;", "", "name", "", "url", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Image {
        private final String name;
        private final String url;

        public static /* synthetic */ Image copy$default(Image image, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = image.name;
            }
            if ((i & 2) != 0) {
                str2 = image.url;
            }
            return image.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final Image copy(String name, String url) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Image(name, url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return Intrinsics.areEqual(this.name, image.name) && Intrinsics.areEqual(this.url, image.url);
        }

        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            String str = this.url;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Image(name=" + this.name + ", url=" + this.url + ')';
        }

        public Image(String name, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.url = str;
        }

        public /* synthetic */ Image(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final String getName() {
            return this.name;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    /* compiled from: RadarInAppMessage.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0007J\u0019\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lio/radar/sdk/model/RadarInAppMessage$Companion;", "", "()V", "KEY_BACKGROUND_COLOR", "", "KEY_BODY", "KEY_BUTTON", "KEY_COLOR", "KEY_DEEPLINK", "KEY_IMAGE", "KEY_METADATA", "KEY_NAME", "KEY_TEXT", "KEY_TITLE", "KEY_URL", "fromJson", "Lio/radar/sdk/model/RadarInAppMessage;", "jsonString", "fromJsonArray", "", "jsonArray", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)[Lio/radar/sdk/model/RadarInAppMessage;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RadarInAppMessage fromJson(String jsonString) {
            Button button;
            Image image;
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            try {
                JSONObject jSONObject = new JSONObject(jsonString);
                JSONObject jSONObject2 = jSONObject.getJSONObject("title");
                String string = jSONObject2.getString("text");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = jSONObject2.getString("color");
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                Title title = new Title(string, string2);
                JSONObject jSONObject3 = jSONObject.getJSONObject("body");
                String string3 = jSONObject3.getString("text");
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                String string4 = jSONObject3.getString("color");
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                Body body = new Body(string3, string4);
                JSONObject optJSONObject = jSONObject.optJSONObject(RadarInAppMessage.KEY_BUTTON);
                if (optJSONObject != null) {
                    String string5 = optJSONObject.getString("text");
                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                    String string6 = optJSONObject.getString("color");
                    Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                    String string7 = optJSONObject.getString("backgroundColor");
                    Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                    button = new Button(string5, string6, string7, optJSONObject.optString("deepLink"));
                } else {
                    button = null;
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("image");
                if (optJSONObject2 != null) {
                    String string8 = optJSONObject2.getString("name");
                    Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                    image = new Image(string8, optJSONObject2.optString("url"));
                } else {
                    image = null;
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject("metadata");
                if (optJSONObject3 == null) {
                    optJSONObject3 = new JSONObject();
                }
                return new RadarInAppMessage(title, body, button, image, optJSONObject3);
            } catch (Exception unused) {
                return null;
            }
        }

        public final RadarInAppMessage[] fromJsonArray(JSONArray jsonArray) {
            Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
            try {
                ArrayList arrayList = new ArrayList();
                int length = jsonArray.length();
                for (int i = 0; i < length; i++) {
                    String jSONObject = jsonArray.getJSONObject(i).toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
                    RadarInAppMessage fromJson = fromJson(jSONObject);
                    if (fromJson != null) {
                        arrayList.add(fromJson);
                    }
                }
                return (RadarInAppMessage[]) arrayList.toArray(new RadarInAppMessage[0]);
            } catch (Exception unused) {
                return new RadarInAppMessage[0];
            }
        }
    }

    public final String toJson() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("text", this.title.getText());
        jSONObject2.put("color", this.title.getColor());
        Unit unit = Unit.INSTANCE;
        jSONObject.put("title", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("text", this.body.getText());
        jSONObject3.put("color", this.body.getColor());
        Unit unit2 = Unit.INSTANCE;
        jSONObject.put("body", jSONObject3);
        if (this.button != null) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("text", this.button.getText());
            jSONObject4.put("color", this.button.getColor());
            jSONObject4.put("backgroundColor", this.button.getBackgroundColor());
            String deepLink = this.button.getDeepLink();
            if (deepLink != null) {
                jSONObject4.put("deepLink", deepLink);
            }
            Unit unit3 = Unit.INSTANCE;
            jSONObject.put(KEY_BUTTON, jSONObject4);
        }
        if (this.image != null) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("name", this.image.getName());
            String url = this.image.getUrl();
            if (url != null) {
                jSONObject5.put("url", url);
            }
            Unit unit4 = Unit.INSTANCE;
            jSONObject.put("image", jSONObject5);
        }
        jSONObject.put("metadata", this.metadata);
        String jSONObject6 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject6, "toString(...)");
        return jSONObject6;
    }
}
