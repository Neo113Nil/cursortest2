package com.blaze.blazesdk.style.players.stories;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.players.IPlayerCustomActionButton;
import com.blaze.blazesdk.style.players.IPlayerItemButtonStyle;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerButtonStyle;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerButtonsStyle;
import com.blaze.blazesdk.style.shared.models.BlazePlayerCustomActionButtonParams;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0014J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010'R\"\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerCustomActionButton;", "Lcom/blaze/blazesdk/style/players/IPlayerCustomActionButton;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams;", "customParams", "Lcom/blaze/blazesdk/style/players/IPlayerItemButtonStyle;", TtmlNode.TAG_STYLE, "<init>", "(Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams;Lcom/blaze/blazesdk/style/players/IPlayerItemButtonStyle;)V", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonsStyle$TopStackButtons$Custom;", "asPlayerCustomStackButton", "()Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerButtonsStyle$TopStackButtons$Custom;", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams;", "component2", "()Lcom/blaze/blazesdk/style/players/IPlayerItemButtonStyle;", "copy", "(Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams;Lcom/blaze/blazesdk/style/players/IPlayerItemButtonStyle;)Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerCustomActionButton;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams;", "getCustomParams", "setCustomParams", "(Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams;)V", "Lcom/blaze/blazesdk/style/players/IPlayerItemButtonStyle;", "getStyle", "setStyle", "(Lcom/blaze/blazesdk/style/players/IPlayerItemButtonStyle;)V", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeStoryPlayerCustomActionButton implements IPlayerCustomActionButton, BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeStoryPlayerCustomActionButton> CREATOR = new a();

    @NotNull
    private BlazePlayerCustomActionButtonParams customParams;

    @NotNull
    private IPlayerItemButtonStyle style;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeStoryPlayerCustomActionButton(BlazePlayerCustomActionButtonParams.CREATOR.createFromParcel(parcel), (IPlayerItemButtonStyle) parcel.readValue(BlazeStoryPlayerCustomActionButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeStoryPlayerCustomActionButton[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BlazeStoryPlayerCustomActionButton(BlazePlayerCustomActionButtonParams blazePlayerCustomActionButtonParams, IPlayerItemButtonStyle iPlayerItemButtonStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(blazePlayerCustomActionButtonParams, iPlayerItemButtonStyle);
        if ((i & 2) != 0) {
            BlazeStoryPlayerButtonStyle.INSTANCE.getClass();
            iPlayerItemButtonStyle = BlazeStoryPlayerButtonStyle.Companion.a();
            iPlayerItemButtonStyle.setVisibleForAds(false);
        }
    }

    public static /* synthetic */ BlazeStoryPlayerCustomActionButton copy$default(BlazeStoryPlayerCustomActionButton blazeStoryPlayerCustomActionButton, BlazePlayerCustomActionButtonParams blazePlayerCustomActionButtonParams, IPlayerItemButtonStyle iPlayerItemButtonStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            blazePlayerCustomActionButtonParams = blazeStoryPlayerCustomActionButton.customParams;
        }
        if ((i & 2) != 0) {
            iPlayerItemButtonStyle = blazeStoryPlayerCustomActionButton.style;
        }
        return blazeStoryPlayerCustomActionButton.copy(blazePlayerCustomActionButtonParams, iPlayerItemButtonStyle);
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerCustomActionButton
    @NotNull
    public BlazeStoryPlayerButtonsStyle.TopStackButtons.Custom asPlayerCustomStackButton() {
        return new BlazeStoryPlayerButtonsStyle.TopStackButtons.Custom(getCustomParams().getId());
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazePlayerCustomActionButtonParams getCustomParams() {
        return this.customParams;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final IPlayerItemButtonStyle getStyle() {
        return this.style;
    }

    @NotNull
    public final BlazeStoryPlayerCustomActionButton copy(@NotNull BlazePlayerCustomActionButtonParams customParams, @NotNull IPlayerItemButtonStyle style) {
        customParams.getClass();
        style.getClass();
        return new BlazeStoryPlayerCustomActionButton(customParams, style);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeStoryPlayerCustomActionButton)) {
            return false;
        }
        BlazeStoryPlayerCustomActionButton blazeStoryPlayerCustomActionButton = (BlazeStoryPlayerCustomActionButton) other;
        return Intrinsics.c(this.customParams, blazeStoryPlayerCustomActionButton.customParams) && Intrinsics.c(this.style, blazeStoryPlayerCustomActionButton.style);
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerCustomActionButton
    @NotNull
    public BlazePlayerCustomActionButtonParams getCustomParams() {
        return this.customParams;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerCustomActionButton
    @NotNull
    public IPlayerItemButtonStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        return this.style.hashCode() + (this.customParams.hashCode() * 31);
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerCustomActionButton
    public void setCustomParams(@NotNull BlazePlayerCustomActionButtonParams blazePlayerCustomActionButtonParams) {
        blazePlayerCustomActionButtonParams.getClass();
        this.customParams = blazePlayerCustomActionButtonParams;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerCustomActionButton
    public void setStyle(@NotNull IPlayerItemButtonStyle iPlayerItemButtonStyle) {
        iPlayerItemButtonStyle.getClass();
        this.style = iPlayerItemButtonStyle;
    }

    @NotNull
    public String toString() {
        return "BlazeStoryPlayerCustomActionButton(customParams=" + this.customParams + ", style=" + this.style + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.customParams.writeToParcel(dest, flags);
        dest.writeValue(this.style);
    }

    public BlazeStoryPlayerCustomActionButton(@NotNull BlazePlayerCustomActionButtonParams blazePlayerCustomActionButtonParams, @NotNull IPlayerItemButtonStyle iPlayerItemButtonStyle) {
        blazePlayerCustomActionButtonParams.getClass();
        iPlayerItemButtonStyle.getClass();
        this.customParams = blazePlayerCustomActionButtonParams;
        this.style = iPlayerItemButtonStyle;
    }
}
