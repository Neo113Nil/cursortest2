package com.blaze.blazesdk.style.players;

import androidx.annotation.Keep;
import com.blaze.blazesdk.style.shared.models.BlazePlayerCustomActionButtonParams;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u000e\u001a\u00020\u000fH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/style/players/IPlayerCustomActionButton;", "", "customParams", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams;", "getCustomParams", "()Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams;", "setCustomParams", "(Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams;)V", TtmlNode.TAG_STYLE, "Lcom/blaze/blazesdk/style/players/IPlayerItemButtonStyle;", "getStyle", "()Lcom/blaze/blazesdk/style/players/IPlayerItemButtonStyle;", "setStyle", "(Lcom/blaze/blazesdk/style/players/IPlayerItemButtonStyle;)V", "asPlayerCustomStackButton", "Lcom/blaze/blazesdk/style/players/IPlayerCustomStackButton;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface IPlayerCustomActionButton {
    @NotNull
    IPlayerCustomStackButton asPlayerCustomStackButton();

    @NotNull
    BlazePlayerCustomActionButtonParams getCustomParams();

    @NotNull
    IPlayerItemButtonStyle getStyle();

    void setCustomParams(@NotNull BlazePlayerCustomActionButtonParams blazePlayerCustomActionButtonParams);

    void setStyle(@NotNull IPlayerItemButtonStyle iPlayerItemButtonStyle);
}
