package io.intercom.android.sdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfigModules.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010,\u001a\u00020\u000eHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\u0096\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000bHÇ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u00103\u001a\u000204H×\u0001J\t\u00105\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0016\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001c¨\u00066"}, d2 = {"Lio/intercom/android/sdk/models/HeaderBackgroundModel;", "", "color", "", "colorDark", "gradient", "", "gradientDark", "imageUrl", "imageDarkUrl", "fade", "", "fadeToDark", "type", "Lio/intercom/android/sdk/models/HeaderBackdropType;", "typeDark", "enabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Lio/intercom/android/sdk/models/HeaderBackdropType;Lio/intercom/android/sdk/models/HeaderBackdropType;Z)V", "getColor", "()Ljava/lang/String;", "getColorDark", "getGradient", "()Ljava/util/List;", "getGradientDark", "getImageUrl", "getImageDarkUrl", "getFade", "()Z", "getFadeToDark", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getType", "()Lio/intercom/android/sdk/models/HeaderBackdropType;", "getTypeDark", "getEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Lio/intercom/android/sdk/models/HeaderBackdropType;Lio/intercom/android/sdk/models/HeaderBackdropType;Z)Lio/intercom/android/sdk/models/HeaderBackgroundModel;", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class HeaderBackgroundModel {
    public static final int $stable = 8;

    @SerializedName("color")
    private final String color;

    @SerializedName("color_dark")
    private final String colorDark;

    @SerializedName("enabled")
    private final boolean enabled;

    @SerializedName("fade_to_white")
    private final boolean fade;

    @SerializedName("fade_to_dark")
    private final Boolean fadeToDark;

    @SerializedName("gradient")
    private final List<String> gradient;

    @SerializedName("gradient_dark")
    private final List<String> gradientDark;

    @SerializedName("image_dark_url")
    private final String imageDarkUrl;

    @SerializedName("image_url")
    private final String imageUrl;

    @SerializedName("type")
    private final HeaderBackdropType type;

    @SerializedName("type_dark")
    private final HeaderBackdropType typeDark;

    public HeaderBackgroundModel() {
        this(null, null, null, null, null, null, false, null, null, null, false, 2047, null);
    }

    public static /* synthetic */ HeaderBackgroundModel copy$default(HeaderBackgroundModel headerBackgroundModel, String str, String str2, List list, List list2, String str3, String str4, boolean z, Boolean bool, HeaderBackdropType headerBackdropType, HeaderBackdropType headerBackdropType2, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = headerBackgroundModel.color;
        }
        if ((i & 2) != 0) {
            str2 = headerBackgroundModel.colorDark;
        }
        if ((i & 4) != 0) {
            list = headerBackgroundModel.gradient;
        }
        if ((i & 8) != 0) {
            list2 = headerBackgroundModel.gradientDark;
        }
        if ((i & 16) != 0) {
            str3 = headerBackgroundModel.imageUrl;
        }
        if ((i & 32) != 0) {
            str4 = headerBackgroundModel.imageDarkUrl;
        }
        if ((i & 64) != 0) {
            z = headerBackgroundModel.fade;
        }
        if ((i & 128) != 0) {
            bool = headerBackgroundModel.fadeToDark;
        }
        if ((i & 256) != 0) {
            headerBackdropType = headerBackgroundModel.type;
        }
        if ((i & 512) != 0) {
            headerBackdropType2 = headerBackgroundModel.typeDark;
        }
        if ((i & 1024) != 0) {
            z2 = headerBackgroundModel.enabled;
        }
        HeaderBackdropType headerBackdropType3 = headerBackdropType2;
        boolean z3 = z2;
        Boolean bool2 = bool;
        HeaderBackdropType headerBackdropType4 = headerBackdropType;
        String str5 = str4;
        boolean z4 = z;
        String str6 = str3;
        List list3 = list;
        return headerBackgroundModel.copy(str, str2, list3, list2, str6, str5, z4, bool2, headerBackdropType4, headerBackdropType3, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* renamed from: component10, reason: from getter */
    public final HeaderBackdropType getTypeDark() {
        return this.typeDark;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component2, reason: from getter */
    public final String getColorDark() {
        return this.colorDark;
    }

    public final List<String> component3() {
        return this.gradient;
    }

    public final List<String> component4() {
        return this.gradientDark;
    }

    /* renamed from: component5, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getImageDarkUrl() {
        return this.imageDarkUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getFade() {
        return this.fade;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getFadeToDark() {
        return this.fadeToDark;
    }

    /* renamed from: component9, reason: from getter */
    public final HeaderBackdropType getType() {
        return this.type;
    }

    public final HeaderBackgroundModel copy(String color, String colorDark, List<String> gradient, List<String> gradientDark, String imageUrl, String imageDarkUrl, boolean fade, Boolean fadeToDark, HeaderBackdropType type, HeaderBackdropType typeDark, boolean enabled) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(type, "type");
        return new HeaderBackgroundModel(color, colorDark, gradient, gradientDark, imageUrl, imageDarkUrl, fade, fadeToDark, type, typeDark, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderBackgroundModel)) {
            return false;
        }
        HeaderBackgroundModel headerBackgroundModel = (HeaderBackgroundModel) other;
        return Intrinsics.areEqual(this.color, headerBackgroundModel.color) && Intrinsics.areEqual(this.colorDark, headerBackgroundModel.colorDark) && Intrinsics.areEqual(this.gradient, headerBackgroundModel.gradient) && Intrinsics.areEqual(this.gradientDark, headerBackgroundModel.gradientDark) && Intrinsics.areEqual(this.imageUrl, headerBackgroundModel.imageUrl) && Intrinsics.areEqual(this.imageDarkUrl, headerBackgroundModel.imageDarkUrl) && this.fade == headerBackgroundModel.fade && Intrinsics.areEqual(this.fadeToDark, headerBackgroundModel.fadeToDark) && this.type == headerBackgroundModel.type && this.typeDark == headerBackgroundModel.typeDark && this.enabled == headerBackgroundModel.enabled;
    }

    public int hashCode() {
        int hashCode = this.color.hashCode() * 31;
        String str = this.colorDark;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.gradient;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.gradientDark;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.imageUrl;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageDarkUrl;
        int hashCode6 = (((hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.fade)) * 31;
        Boolean bool = this.fadeToDark;
        int hashCode7 = (((hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31) + this.type.hashCode()) * 31;
        HeaderBackdropType headerBackdropType = this.typeDark;
        return ((hashCode7 + (headerBackdropType != null ? headerBackdropType.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled);
    }

    public String toString() {
        return "HeaderBackgroundModel(color=" + this.color + ", colorDark=" + this.colorDark + ", gradient=" + this.gradient + ", gradientDark=" + this.gradientDark + ", imageUrl=" + this.imageUrl + ", imageDarkUrl=" + this.imageDarkUrl + ", fade=" + this.fade + ", fadeToDark=" + this.fadeToDark + ", type=" + this.type + ", typeDark=" + this.typeDark + ", enabled=" + this.enabled + ')';
    }

    public HeaderBackgroundModel(String color, String str, List<String> list, List<String> list2, String str2, String str3, boolean z, Boolean bool, HeaderBackdropType type, HeaderBackdropType headerBackdropType, boolean z2) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(type, "type");
        this.color = color;
        this.colorDark = str;
        this.gradient = list;
        this.gradientDark = list2;
        this.imageUrl = str2;
        this.imageDarkUrl = str3;
        this.fade = z;
        this.fadeToDark = bool;
        this.type = type;
        this.typeDark = headerBackdropType;
        this.enabled = z2;
    }

    public /* synthetic */ HeaderBackgroundModel(String str, String str2, List list, List list2, String str3, String str4, boolean z, Boolean bool, HeaderBackdropType headerBackdropType, HeaderBackdropType headerBackdropType2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "#FFFFFF" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? true : z, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? HeaderBackdropType.SOLID : headerBackdropType, (i & 512) != 0 ? null : headerBackdropType2, (i & 1024) != 0 ? false : z2);
    }

    public final String getColor() {
        return this.color;
    }

    public final String getColorDark() {
        return this.colorDark;
    }

    public final List<String> getGradient() {
        return this.gradient;
    }

    public final List<String> getGradientDark() {
        return this.gradientDark;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getImageDarkUrl() {
        return this.imageDarkUrl;
    }

    public final boolean getFade() {
        return this.fade;
    }

    public final Boolean getFadeToDark() {
        return this.fadeToDark;
    }

    public final HeaderBackdropType getType() {
        return this.type;
    }

    public final HeaderBackdropType getTypeDark() {
        return this.typeDark;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }
}
