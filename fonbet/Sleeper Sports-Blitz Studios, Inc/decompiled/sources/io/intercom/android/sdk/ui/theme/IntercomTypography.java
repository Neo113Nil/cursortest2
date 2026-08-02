package io.intercom.android.sdk.ui.theme;

import androidx.compose.ui.text.TextStyle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomTypography.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006#"}, d2 = {"Lio/intercom/android/sdk/ui/theme/IntercomTypography;", "", "type01", "Landroidx/compose/ui/text/TextStyle;", "type02", "type03", "type04", "type04SemiBold", "type04Point5", "type05", "<init>", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "getType01", "()Landroidx/compose/ui/text/TextStyle;", "getType02", "getType03", "getType04", "getType04SemiBold", "getType04Point5", "getType05", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class IntercomTypography {
    public static final int $stable = 0;
    private final TextStyle type01;
    private final TextStyle type02;
    private final TextStyle type03;
    private final TextStyle type04;
    private final TextStyle type04Point5;
    private final TextStyle type04SemiBold;
    private final TextStyle type05;

    public static /* synthetic */ IntercomTypography copy$default(IntercomTypography intercomTypography, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, int i, Object obj) {
        if ((i & 1) != 0) {
            textStyle = intercomTypography.type01;
        }
        if ((i & 2) != 0) {
            textStyle2 = intercomTypography.type02;
        }
        if ((i & 4) != 0) {
            textStyle3 = intercomTypography.type03;
        }
        if ((i & 8) != 0) {
            textStyle4 = intercomTypography.type04;
        }
        if ((i & 16) != 0) {
            textStyle5 = intercomTypography.type04SemiBold;
        }
        if ((i & 32) != 0) {
            textStyle6 = intercomTypography.type04Point5;
        }
        if ((i & 64) != 0) {
            textStyle7 = intercomTypography.type05;
        }
        TextStyle textStyle8 = textStyle6;
        TextStyle textStyle9 = textStyle7;
        TextStyle textStyle10 = textStyle5;
        TextStyle textStyle11 = textStyle3;
        return intercomTypography.copy(textStyle, textStyle2, textStyle11, textStyle4, textStyle10, textStyle8, textStyle9);
    }

    /* renamed from: component1, reason: from getter */
    public final TextStyle getType01() {
        return this.type01;
    }

    /* renamed from: component2, reason: from getter */
    public final TextStyle getType02() {
        return this.type02;
    }

    /* renamed from: component3, reason: from getter */
    public final TextStyle getType03() {
        return this.type03;
    }

    /* renamed from: component4, reason: from getter */
    public final TextStyle getType04() {
        return this.type04;
    }

    /* renamed from: component5, reason: from getter */
    public final TextStyle getType04SemiBold() {
        return this.type04SemiBold;
    }

    /* renamed from: component6, reason: from getter */
    public final TextStyle getType04Point5() {
        return this.type04Point5;
    }

    /* renamed from: component7, reason: from getter */
    public final TextStyle getType05() {
        return this.type05;
    }

    public final IntercomTypography copy(TextStyle type01, TextStyle type02, TextStyle type03, TextStyle type04, TextStyle type04SemiBold, TextStyle type04Point5, TextStyle type05) {
        Intrinsics.checkNotNullParameter(type01, "type01");
        Intrinsics.checkNotNullParameter(type02, "type02");
        Intrinsics.checkNotNullParameter(type03, "type03");
        Intrinsics.checkNotNullParameter(type04, "type04");
        Intrinsics.checkNotNullParameter(type04SemiBold, "type04SemiBold");
        Intrinsics.checkNotNullParameter(type04Point5, "type04Point5");
        Intrinsics.checkNotNullParameter(type05, "type05");
        return new IntercomTypography(type01, type02, type03, type04, type04SemiBold, type04Point5, type05);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntercomTypography)) {
            return false;
        }
        IntercomTypography intercomTypography = (IntercomTypography) other;
        return Intrinsics.areEqual(this.type01, intercomTypography.type01) && Intrinsics.areEqual(this.type02, intercomTypography.type02) && Intrinsics.areEqual(this.type03, intercomTypography.type03) && Intrinsics.areEqual(this.type04, intercomTypography.type04) && Intrinsics.areEqual(this.type04SemiBold, intercomTypography.type04SemiBold) && Intrinsics.areEqual(this.type04Point5, intercomTypography.type04Point5) && Intrinsics.areEqual(this.type05, intercomTypography.type05);
    }

    public int hashCode() {
        return (((((((((((this.type01.hashCode() * 31) + this.type02.hashCode()) * 31) + this.type03.hashCode()) * 31) + this.type04.hashCode()) * 31) + this.type04SemiBold.hashCode()) * 31) + this.type04Point5.hashCode()) * 31) + this.type05.hashCode();
    }

    public String toString() {
        return "IntercomTypography(type01=" + this.type01 + ", type02=" + this.type02 + ", type03=" + this.type03 + ", type04=" + this.type04 + ", type04SemiBold=" + this.type04SemiBold + ", type04Point5=" + this.type04Point5 + ", type05=" + this.type05 + ')';
    }

    public IntercomTypography(TextStyle type01, TextStyle type02, TextStyle type03, TextStyle type04, TextStyle type04SemiBold, TextStyle type04Point5, TextStyle type05) {
        Intrinsics.checkNotNullParameter(type01, "type01");
        Intrinsics.checkNotNullParameter(type02, "type02");
        Intrinsics.checkNotNullParameter(type03, "type03");
        Intrinsics.checkNotNullParameter(type04, "type04");
        Intrinsics.checkNotNullParameter(type04SemiBold, "type04SemiBold");
        Intrinsics.checkNotNullParameter(type04Point5, "type04Point5");
        Intrinsics.checkNotNullParameter(type05, "type05");
        this.type01 = type01;
        this.type02 = type02;
        this.type03 = type03;
        this.type04 = type04;
        this.type04SemiBold = type04SemiBold;
        this.type04Point5 = type04Point5;
        this.type05 = type05;
    }

    public final TextStyle getType01() {
        return this.type01;
    }

    public final TextStyle getType02() {
        return this.type02;
    }

    public final TextStyle getType03() {
        return this.type03;
    }

    public final TextStyle getType04() {
        return this.type04;
    }

    public final TextStyle getType04SemiBold() {
        return this.type04SemiBold;
    }

    public final TextStyle getType04Point5() {
        return this.type04Point5;
    }

    public final TextStyle getType05() {
        return this.type05;
    }
}
