package io.intercom.android.sdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfigModules.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JK\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001c\u001a\u00020\u001dH×\u0001J\t\u0010\u001e\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lio/intercom/android/sdk/models/CustomizationColorsModel;", "", "backgroundColor", "", ViewProps.FOREGROUND_COLOR, "foregroundLowContrastColor", "backgroundColorDark", "foregroundColorDark", "foregroundLowContrastColorDark", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getForegroundColor", "getForegroundLowContrastColor", "getBackgroundColorDark", "getForegroundColorDark", "getForegroundLowContrastColorDark", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CustomizationColorsModel {
    public static final int $stable = 0;

    @SerializedName("background_color")
    private final String backgroundColor;

    @SerializedName("background_color_dark")
    private final String backgroundColorDark;

    @SerializedName("foreground_color")
    private final String foregroundColor;

    @SerializedName("foreground_color_dark")
    private final String foregroundColorDark;

    @SerializedName("foreground_color_low_contrast")
    private final String foregroundLowContrastColor;

    @SerializedName("foreground_color_low_contrast_dark")
    private final String foregroundLowContrastColorDark;

    public CustomizationColorsModel() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ CustomizationColorsModel copy$default(CustomizationColorsModel customizationColorsModel, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customizationColorsModel.backgroundColor;
        }
        if ((i & 2) != 0) {
            str2 = customizationColorsModel.foregroundColor;
        }
        if ((i & 4) != 0) {
            str3 = customizationColorsModel.foregroundLowContrastColor;
        }
        if ((i & 8) != 0) {
            str4 = customizationColorsModel.backgroundColorDark;
        }
        if ((i & 16) != 0) {
            str5 = customizationColorsModel.foregroundColorDark;
        }
        if ((i & 32) != 0) {
            str6 = customizationColorsModel.foregroundLowContrastColorDark;
        }
        String str7 = str5;
        String str8 = str6;
        return customizationColorsModel.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final String getForegroundColor() {
        return this.foregroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getForegroundLowContrastColor() {
        return this.foregroundLowContrastColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColorDark() {
        return this.backgroundColorDark;
    }

    /* renamed from: component5, reason: from getter */
    public final String getForegroundColorDark() {
        return this.foregroundColorDark;
    }

    /* renamed from: component6, reason: from getter */
    public final String getForegroundLowContrastColorDark() {
        return this.foregroundLowContrastColorDark;
    }

    public final CustomizationColorsModel copy(String backgroundColor, String foregroundColor, String foregroundLowContrastColor, String backgroundColorDark, String foregroundColorDark, String foregroundLowContrastColorDark) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
        Intrinsics.checkNotNullParameter(foregroundLowContrastColor, "foregroundLowContrastColor");
        return new CustomizationColorsModel(backgroundColor, foregroundColor, foregroundLowContrastColor, backgroundColorDark, foregroundColorDark, foregroundLowContrastColorDark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomizationColorsModel)) {
            return false;
        }
        CustomizationColorsModel customizationColorsModel = (CustomizationColorsModel) other;
        return Intrinsics.areEqual(this.backgroundColor, customizationColorsModel.backgroundColor) && Intrinsics.areEqual(this.foregroundColor, customizationColorsModel.foregroundColor) && Intrinsics.areEqual(this.foregroundLowContrastColor, customizationColorsModel.foregroundLowContrastColor) && Intrinsics.areEqual(this.backgroundColorDark, customizationColorsModel.backgroundColorDark) && Intrinsics.areEqual(this.foregroundColorDark, customizationColorsModel.foregroundColorDark) && Intrinsics.areEqual(this.foregroundLowContrastColorDark, customizationColorsModel.foregroundLowContrastColorDark);
    }

    public int hashCode() {
        int hashCode = ((((this.backgroundColor.hashCode() * 31) + this.foregroundColor.hashCode()) * 31) + this.foregroundLowContrastColor.hashCode()) * 31;
        String str = this.backgroundColorDark;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.foregroundColorDark;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.foregroundLowContrastColorDark;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "CustomizationColorsModel(backgroundColor=" + this.backgroundColor + ", foregroundColor=" + this.foregroundColor + ", foregroundLowContrastColor=" + this.foregroundLowContrastColor + ", backgroundColorDark=" + this.backgroundColorDark + ", foregroundColorDark=" + this.foregroundColorDark + ", foregroundLowContrastColorDark=" + this.foregroundLowContrastColorDark + ')';
    }

    public CustomizationColorsModel(String backgroundColor, String foregroundColor, String foregroundLowContrastColor, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
        Intrinsics.checkNotNullParameter(foregroundLowContrastColor, "foregroundLowContrastColor");
        this.backgroundColor = backgroundColor;
        this.foregroundColor = foregroundColor;
        this.foregroundLowContrastColor = foregroundLowContrastColor;
        this.backgroundColorDark = str;
        this.foregroundColorDark = str2;
        this.foregroundLowContrastColorDark = str3;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ CustomizationColorsModel(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            java.lang.String r2 = "#FFFFFF"
        L6:
            r9 = r8 & 2
            if (r9 == 0) goto Lc
            java.lang.String r3 = "#000000"
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L11
            r4 = r3
        L11:
            r9 = r8 & 8
            r0 = 0
            if (r9 == 0) goto L17
            r5 = r0
        L17:
            r9 = r8 & 16
            if (r9 == 0) goto L1c
            r6 = r0
        L1c:
            r8 = r8 & 32
            if (r8 == 0) goto L28
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2f
        L28:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2f:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.models.CustomizationColorsModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getForegroundColor() {
        return this.foregroundColor;
    }

    public final String getForegroundLowContrastColor() {
        return this.foregroundLowContrastColor;
    }

    public final String getBackgroundColorDark() {
        return this.backgroundColorDark;
    }

    public final String getForegroundColorDark() {
        return this.foregroundColorDark;
    }

    public final String getForegroundLowContrastColorDark() {
        return this.foregroundLowContrastColorDark;
    }
}
