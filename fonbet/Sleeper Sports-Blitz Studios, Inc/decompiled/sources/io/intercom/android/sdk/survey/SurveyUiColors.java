package io.intercom.android.sdk.survey;

import androidx.compose.ui.graphics.Color;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.modules.appstate.AppStateModule;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyViewModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u000bJ\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u000bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\b\u001dJD\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010$\u001a\u00020%H×\u0001J\t\u0010&\u001a\u00020'H×\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006("}, d2 = {"Lio/intercom/android/sdk/survey/SurveyUiColors;", "", AppStateModule.APP_STATE_BACKGROUND, "Landroidx/compose/ui/graphics/Color;", "onBackground", "button", "onButton", "dropDownSelectedColor", "<init>", "(JJJJLandroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackground-0d7_KjU", "()J", "J", "getOnBackground-0d7_KjU", "getButton-0d7_KjU", "getOnButton-0d7_KjU", "getDropDownSelectedColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getButtonBorder", "getButtonBorder-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component5-QN2ZGVo", "copy", "copy-qa9m3tE", "(JJJJLandroidx/compose/ui/graphics/Color;)Lio/intercom/android/sdk/survey/SurveyUiColors;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SurveyUiColors {
    public static final int $stable = 0;
    private final long background;
    private final long button;
    private final Color dropDownSelectedColor;
    private final long onBackground;
    private final long onButton;

    public /* synthetic */ SurveyUiColors(long j, long j2, long j3, long j4, Color color, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, color);
    }

    /* renamed from: copy-qa9m3tE$default, reason: not valid java name */
    public static /* synthetic */ SurveyUiColors m12620copyqa9m3tE$default(SurveyUiColors surveyUiColors, long j, long j2, long j3, long j4, Color color, int i, Object obj) {
        if ((i & 1) != 0) {
            j = surveyUiColors.background;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = surveyUiColors.onBackground;
        }
        return surveyUiColors.m12626copyqa9m3tE(j5, j2, (i & 4) != 0 ? surveyUiColors.button : j3, (i & 8) != 0 ? surveyUiColors.onButton : j4, (i & 16) != 0 ? surveyUiColors.dropDownSelectedColor : color);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackground() {
        return this.background;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnBackground() {
        return this.onBackground;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getButton() {
        return this.button;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnButton() {
        return this.onButton;
    }

    /* renamed from: component5-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getDropDownSelectedColor() {
        return this.dropDownSelectedColor;
    }

    /* renamed from: copy-qa9m3tE, reason: not valid java name */
    public final SurveyUiColors m12626copyqa9m3tE(long background, long onBackground, long button, long onButton, Color dropDownSelectedColor) {
        return new SurveyUiColors(background, onBackground, button, onButton, dropDownSelectedColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyUiColors)) {
            return false;
        }
        SurveyUiColors surveyUiColors = (SurveyUiColors) other;
        return Color.m6040equalsimpl0(this.background, surveyUiColors.background) && Color.m6040equalsimpl0(this.onBackground, surveyUiColors.onBackground) && Color.m6040equalsimpl0(this.button, surveyUiColors.button) && Color.m6040equalsimpl0(this.onButton, surveyUiColors.onButton) && Intrinsics.areEqual(this.dropDownSelectedColor, surveyUiColors.dropDownSelectedColor);
    }

    public int hashCode() {
        int m6046hashCodeimpl = ((((((Color.m6046hashCodeimpl(this.background) * 31) + Color.m6046hashCodeimpl(this.onBackground)) * 31) + Color.m6046hashCodeimpl(this.button)) * 31) + Color.m6046hashCodeimpl(this.onButton)) * 31;
        Color color = this.dropDownSelectedColor;
        return m6046hashCodeimpl + (color == null ? 0 : Color.m6046hashCodeimpl(color.m6049unboximpl()));
    }

    public String toString() {
        return "SurveyUiColors(background=" + ((Object) Color.m6047toStringimpl(this.background)) + ", onBackground=" + ((Object) Color.m6047toStringimpl(this.onBackground)) + ", button=" + ((Object) Color.m6047toStringimpl(this.button)) + ", onButton=" + ((Object) Color.m6047toStringimpl(this.onButton)) + ", dropDownSelectedColor=" + this.dropDownSelectedColor + ')';
    }

    private SurveyUiColors(long j, long j2, long j3, long j4, Color color) {
        this.background = j;
        this.onBackground = j2;
        this.button = j3;
        this.onButton = j4;
        this.dropDownSelectedColor = color;
    }

    public /* synthetic */ SurveyUiColors(long j, long j2, long j3, long j4, Color color, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, (i & 16) != 0 ? null : color, null);
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m12627getBackground0d7_KjU() {
        return this.background;
    }

    /* renamed from: getOnBackground-0d7_KjU, reason: not valid java name */
    public final long m12631getOnBackground0d7_KjU() {
        return this.onBackground;
    }

    /* renamed from: getButton-0d7_KjU, reason: not valid java name */
    public final long m12628getButton0d7_KjU() {
        return this.button;
    }

    /* renamed from: getOnButton-0d7_KjU, reason: not valid java name */
    public final long m12632getOnButton0d7_KjU() {
        return this.onButton;
    }

    /* renamed from: getDropDownSelectedColor-QN2ZGVo, reason: not valid java name */
    public final Color m12630getDropDownSelectedColorQN2ZGVo() {
        return this.dropDownSelectedColor;
    }

    /* renamed from: getButtonBorder-0d7_KjU, reason: not valid java name */
    public final long m12629getButtonBorder0d7_KjU() {
        if (ColorExtensionsKt.m13186isDarkColor8_81llA(this.button)) {
            return ColorExtensionsKt.m13189lighten8_81llA(this.button);
        }
        return ColorExtensionsKt.m13179darken8_81llA(this.button);
    }
}
