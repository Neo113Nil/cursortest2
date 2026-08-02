package com.blaze.blazesdk.style.players.videos;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerButtonStyle;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B\u001b\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0005J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/blaze/blazesdk/style/players/videos/BlazeVideosInlinePreviewPlayerStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "buttons", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosInlinePreviewPlayerButtonsStyle;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "", "<init>", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosInlinePreviewPlayerButtonsStyle;I)V", "getButtons", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosInlinePreviewPlayerButtonsStyle;", "setButtons", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosInlinePreviewPlayerButtonsStyle;)V", "getBackgroundColor", "()I", "setBackgroundColor", "(I)V", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeVideosInlinePreviewPlayerStyle implements BlazeParcelable {
    private int backgroundColor;

    @NotNull
    private BlazeVideosInlinePreviewPlayerButtonsStyle buttons;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeVideosInlinePreviewPlayerStyle> CREATOR = new a();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeVideosInlinePreviewPlayerStyle(BlazeVideosInlinePreviewPlayerButtonsStyle.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeVideosInlinePreviewPlayerStyle[i];
        }
    }

    public BlazeVideosInlinePreviewPlayerStyle(@NotNull BlazeVideosInlinePreviewPlayerButtonsStyle blazeVideosInlinePreviewPlayerButtonsStyle, int i) {
        blazeVideosInlinePreviewPlayerButtonsStyle.getClass();
        this.buttons = blazeVideosInlinePreviewPlayerButtonsStyle;
        this.backgroundColor = i;
    }

    public static /* synthetic */ BlazeVideosInlinePreviewPlayerStyle copy$default(BlazeVideosInlinePreviewPlayerStyle blazeVideosInlinePreviewPlayerStyle, BlazeVideosInlinePreviewPlayerButtonsStyle blazeVideosInlinePreviewPlayerButtonsStyle, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            blazeVideosInlinePreviewPlayerButtonsStyle = blazeVideosInlinePreviewPlayerStyle.buttons;
        }
        if ((i2 & 2) != 0) {
            i = blazeVideosInlinePreviewPlayerStyle.backgroundColor;
        }
        return blazeVideosInlinePreviewPlayerStyle.copy(blazeVideosInlinePreviewPlayerButtonsStyle, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeVideosInlinePreviewPlayerButtonsStyle getButtons() {
        return this.buttons;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final BlazeVideosInlinePreviewPlayerStyle copy(@NotNull BlazeVideosInlinePreviewPlayerButtonsStyle buttons, int backgroundColor) {
        buttons.getClass();
        return new BlazeVideosInlinePreviewPlayerStyle(buttons, backgroundColor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeVideosInlinePreviewPlayerStyle)) {
            return false;
        }
        BlazeVideosInlinePreviewPlayerStyle blazeVideosInlinePreviewPlayerStyle = (BlazeVideosInlinePreviewPlayerStyle) other;
        return Intrinsics.c(this.buttons, blazeVideosInlinePreviewPlayerStyle.buttons) && this.backgroundColor == blazeVideosInlinePreviewPlayerStyle.backgroundColor;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final BlazeVideosInlinePreviewPlayerButtonsStyle getButtons() {
        return this.buttons;
    }

    public int hashCode() {
        return Integer.hashCode(this.backgroundColor) + (this.buttons.hashCode() * 31);
    }

    public final void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public final void setButtons(@NotNull BlazeVideosInlinePreviewPlayerButtonsStyle blazeVideosInlinePreviewPlayerButtonsStyle) {
        blazeVideosInlinePreviewPlayerButtonsStyle.getClass();
        this.buttons = blazeVideosInlinePreviewPlayerButtonsStyle;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeVideosInlinePreviewPlayerStyle(buttons=");
        sb.append(this.buttons);
        sb.append(", backgroundColor=");
        return wv8.j(sb, this.backgroundColor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.buttons.writeToParcel(dest, flags);
        dest.writeInt(this.backgroundColor);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/style/players/videos/BlazeVideosInlinePreviewPlayerStyle$Companion;", "", "<init>", "()V", "base", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosInlinePreviewPlayerStyle;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BlazeVideosInlinePreviewPlayerStyle base() {
            BlazeVideosInlinePreviewPlayerButtonsStyle.INSTANCE.getClass();
            BlazeVideosPlayerButtonStyle.INSTANCE.getClass();
            return new BlazeVideosInlinePreviewPlayerStyle(new BlazeVideosInlinePreviewPlayerButtonsStyle(BlazeVideosPlayerButtonStyle.Companion.b(), BlazeVideosPlayerButtonStyle.Companion.b()), -16777216);
        }

        private Companion() {
        }
    }
}
