package io.intercom.android.sdk.ui.common;

import androidx.compose.ui.graphics.Color;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomTopBarState.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\b\u001bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\b\u001dJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\b\u001fJX\u0010 \u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÇ\u0001¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010&\u001a\u00020\u0003H×\u0001J\t\u0010'\u001a\u00020\u0005H×\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006("}, d2 = {"Lio/intercom/android/sdk/ui/common/IntercomTopBarState;", "", "navIcon", "", "title", "", "subTitle", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "subTitleColor", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getNavIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "()Ljava/lang/String;", "getSubTitle", "getBackgroundColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getContentColor-QN2ZGVo", "getSubTitleColor-QN2ZGVo", "component1", "component2", "component3", "component4", "component4-QN2ZGVo", "component5", "component5-QN2ZGVo", "component6", "component6-QN2ZGVo", "copy", "copy-K74yeK8", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;)Lio/intercom/android/sdk/ui/common/IntercomTopBarState;", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class IntercomTopBarState {
    public static final int $stable = 0;
    private final Color backgroundColor;
    private final Color contentColor;
    private final Integer navIcon;
    private final String subTitle;
    private final Color subTitleColor;
    private final String title;

    public /* synthetic */ IntercomTopBarState(Integer num, String str, String str2, Color color, Color color2, Color color3, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, str2, color, color2, color3);
    }

    /* renamed from: copy-K74yeK8$default, reason: not valid java name */
    public static /* synthetic */ IntercomTopBarState m12881copyK74yeK8$default(IntercomTopBarState intercomTopBarState, Integer num, String str, String str2, Color color, Color color2, Color color3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = intercomTopBarState.navIcon;
        }
        if ((i & 2) != 0) {
            str = intercomTopBarState.title;
        }
        if ((i & 4) != 0) {
            str2 = intercomTopBarState.subTitle;
        }
        if ((i & 8) != 0) {
            color = intercomTopBarState.backgroundColor;
        }
        if ((i & 16) != 0) {
            color2 = intercomTopBarState.contentColor;
        }
        if ((i & 32) != 0) {
            color3 = intercomTopBarState.subTitleColor;
        }
        Color color4 = color2;
        Color color5 = color3;
        return intercomTopBarState.m12885copyK74yeK8(num, str, str2, color, color4, color5);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getNavIcon() {
        return this.navIcon;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: component4-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getContentColor() {
        return this.contentColor;
    }

    /* renamed from: component6-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getSubTitleColor() {
        return this.subTitleColor;
    }

    /* renamed from: copy-K74yeK8, reason: not valid java name */
    public final IntercomTopBarState m12885copyK74yeK8(Integer navIcon, String title, String subTitle, Color backgroundColor, Color contentColor, Color subTitleColor) {
        return new IntercomTopBarState(navIcon, title, subTitle, backgroundColor, contentColor, subTitleColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntercomTopBarState)) {
            return false;
        }
        IntercomTopBarState intercomTopBarState = (IntercomTopBarState) other;
        return Intrinsics.areEqual(this.navIcon, intercomTopBarState.navIcon) && Intrinsics.areEqual(this.title, intercomTopBarState.title) && Intrinsics.areEqual(this.subTitle, intercomTopBarState.subTitle) && Intrinsics.areEqual(this.backgroundColor, intercomTopBarState.backgroundColor) && Intrinsics.areEqual(this.contentColor, intercomTopBarState.contentColor) && Intrinsics.areEqual(this.subTitleColor, intercomTopBarState.subTitleColor);
    }

    public int hashCode() {
        Integer num = this.navIcon;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subTitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Color color = this.backgroundColor;
        int m6046hashCodeimpl = (hashCode3 + (color == null ? 0 : Color.m6046hashCodeimpl(color.m6049unboximpl()))) * 31;
        Color color2 = this.contentColor;
        int m6046hashCodeimpl2 = (m6046hashCodeimpl + (color2 == null ? 0 : Color.m6046hashCodeimpl(color2.m6049unboximpl()))) * 31;
        Color color3 = this.subTitleColor;
        return m6046hashCodeimpl2 + (color3 != null ? Color.m6046hashCodeimpl(color3.m6049unboximpl()) : 0);
    }

    public String toString() {
        return "IntercomTopBarState(navIcon=" + this.navIcon + ", title=" + this.title + ", subTitle=" + this.subTitle + ", backgroundColor=" + this.backgroundColor + ", contentColor=" + this.contentColor + ", subTitleColor=" + this.subTitleColor + ')';
    }

    private IntercomTopBarState(Integer num, String str, String str2, Color color, Color color2, Color color3) {
        this.navIcon = num;
        this.title = str;
        this.subTitle = str2;
        this.backgroundColor = color;
        this.contentColor = color2;
        this.subTitleColor = color3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ IntercomTopBarState(Integer num, String str, String str2, Color color, Color color2, Color color3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r0, r2, r3, r4, r5, (i & 32) == 0 ? color3 : null, null);
        Integer num2 = (i & 1) != 0 ? null : num;
        String str3 = (i & 2) != 0 ? null : str;
        String str4 = (i & 4) != 0 ? null : str2;
        Color color4 = (i & 8) != 0 ? null : color;
        Color color5 = (i & 16) != 0 ? null : color2;
    }

    public final Integer getNavIcon() {
        return this.navIcon;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: getBackgroundColor-QN2ZGVo, reason: not valid java name */
    public final Color m12886getBackgroundColorQN2ZGVo() {
        return this.backgroundColor;
    }

    /* renamed from: getContentColor-QN2ZGVo, reason: not valid java name */
    public final Color m12887getContentColorQN2ZGVo() {
        return this.contentColor;
    }

    /* renamed from: getSubTitleColor-QN2ZGVo, reason: not valid java name */
    public final Color m12888getSubTitleColorQN2ZGVo() {
        return this.subTitleColor;
    }
}
