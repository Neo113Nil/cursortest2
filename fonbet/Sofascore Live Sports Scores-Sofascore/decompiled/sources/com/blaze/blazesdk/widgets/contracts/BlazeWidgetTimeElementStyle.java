package com.blaze.blazesdk.widgets.contracts;

import androidx.annotation.Keep;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.blaze.blazesdk.style.shared.models.BlazeObjectPositioning;
import com.ironsource.C4018c8;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\bX¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u00020\u000eX¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00020\u000eX¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/widgets/contracts/BlazeWidgetTimeElementStyle;", "", C4018c8.k, "", "()Z", "setVisible", "(Z)V", "position", "Lcom/blaze/blazesdk/style/shared/models/BlazeObjectPositioning;", "getPosition", "()Lcom/blaze/blazesdk/style/shared/models/BlazeObjectPositioning;", "setPosition", "(Lcom/blaze/blazesdk/style/shared/models/BlazeObjectPositioning;)V", "margins", "Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "getMargins", "()Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "setMargins", "(Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;)V", "padding", "getPadding", "setPadding", "icon", "Lcom/blaze/blazesdk/widgets/contracts/TimeElementIconStyle;", "getIcon", "()Lcom/blaze/blazesdk/widgets/contracts/TimeElementIconStyle;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface BlazeWidgetTimeElementStyle {
    @Nullable
    TimeElementIconStyle getIcon();

    @NotNull
    BlazeInsets getMargins();

    @NotNull
    BlazeInsets getPadding();

    @NotNull
    BlazeObjectPositioning getPosition();

    boolean isVisible();

    void setMargins(@NotNull BlazeInsets blazeInsets);

    void setPadding(@NotNull BlazeInsets blazeInsets);

    void setPosition(@NotNull BlazeObjectPositioning blazeObjectPositioning);

    void setVisible(boolean z);
}
