package com.blaze.blazesdk.widgets.contracts;

import androidx.annotation.Keep;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemTextStyle;
import com.ironsource.C4018c8;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\ba\u0018\u00002\u00020\u0001J\n\u0010*\u001a\u0004\u0018\u00010+H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u00020\u000eX¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u000eX¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u00020\u0019X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u001fX¦\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0018\u0010$\u001a\u00020\u000eX¦\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012R\u0018\u0010'\u001a\u00020\u0019X¦\u000e¢\u0006\f\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006,À\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/widgets/contracts/BlazeWidgetTimeElementStateStyle;", "", "textStyle", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;", "getTextStyle", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;", "setTextStyle", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTextStyle;)V", C4018c8.k, "", "()Z", "setVisible", "(Z)V", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "", "getBackgroundColor", "()I", "setBackgroundColor", "(I)V", "backgroundImageResId", "getBackgroundImageResId", "()Ljava/lang/Integer;", "setBackgroundImageResId", "(Ljava/lang/Integer;)V", "cornerRadius", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "getCornerRadius", "()Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "setCornerRadius", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "cornerRadiusRatio", "", "getCornerRadiusRatio", "()Ljava/lang/Float;", "setCornerRadiusRatio", "(Ljava/lang/Float;)V", "borderColor", "getBorderColor", "setBorderColor", "borderWidth", "getBorderWidth", "setBorderWidth", "getBackgroundImageUrl", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface BlazeWidgetTimeElementStateStyle {
    int getBackgroundColor();

    @Nullable
    Integer getBackgroundImageResId();

    @Nullable
    String getBackgroundImageUrl();

    int getBorderColor();

    @NotNull
    BlazeDp getBorderWidth();

    @NotNull
    BlazeDp getCornerRadius();

    @Nullable
    Float getCornerRadiusRatio();

    @NotNull
    BlazeWidgetItemTextStyle getTextStyle();

    boolean isVisible();

    void setBackgroundColor(int i);

    void setBackgroundImageResId(@Nullable Integer num);

    void setBorderColor(int i);

    void setBorderWidth(@NotNull BlazeDp blazeDp);

    void setCornerRadius(@NotNull BlazeDp blazeDp);

    void setCornerRadiusRatio(@Nullable Float f);

    void setTextStyle(@NotNull BlazeWidgetItemTextStyle blazeWidgetItemTextStyle);

    void setVisible(boolean z);
}
