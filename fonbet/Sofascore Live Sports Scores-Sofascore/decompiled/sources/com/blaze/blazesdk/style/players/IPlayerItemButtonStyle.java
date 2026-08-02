package com.blaze.blazesdk.style.players;

import android.widget.ImageView;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.ironsource.C4018c8;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\fX¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u00020\u0012X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u00020\u0017X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001dX¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0018\u0010\"\u001a\u00020\u0012X¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006$À\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/style/players/IPlayerItemButtonStyle;", "", "width", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "getWidth", "()Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "setWidth", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "height", "getHeight", "setHeight", "color", "", "getColor", "()I", "setColor", "(I)V", C4018c8.k, "", "()Z", "setVisible", "(Z)V", "scaleType", "Landroid/widget/ImageView$ScaleType;", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "setScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "customImage", "Lcom/blaze/blazesdk/style/players/BlazePlayerButtonCustomImageStates;", "getCustomImage", "()Lcom/blaze/blazesdk/style/players/BlazePlayerButtonCustomImageStates;", "setCustomImage", "(Lcom/blaze/blazesdk/style/players/BlazePlayerButtonCustomImageStates;)V", "isVisibleForAds", "setVisibleForAds", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface IPlayerItemButtonStyle {
    int getColor();

    @Nullable
    BlazePlayerButtonCustomImageStates getCustomImage();

    @NotNull
    BlazeDp getHeight();

    @NotNull
    ImageView.ScaleType getScaleType();

    @NotNull
    BlazeDp getWidth();

    boolean isVisible();

    boolean isVisibleForAds();

    void setColor(int i);

    void setCustomImage(@Nullable BlazePlayerButtonCustomImageStates blazePlayerButtonCustomImageStates);

    void setHeight(@NotNull BlazeDp blazeDp);

    void setScaleType(@NotNull ImageView.ScaleType scaleType);

    void setVisible(boolean z);

    void setVisibleForAds(boolean z);

    void setWidth(@NotNull BlazeDp blazeDp);
}
