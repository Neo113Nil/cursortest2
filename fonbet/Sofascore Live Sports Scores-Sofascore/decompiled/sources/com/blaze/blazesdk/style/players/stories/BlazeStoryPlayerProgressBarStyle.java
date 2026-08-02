package com.blaze.blazesdk.style.players.stories;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.wv8;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0003J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerProgressBarStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "", "progressColor", "<init>", "(II)V", "getBackgroundColor", "()I", "setBackgroundColor", "(I)V", "getProgressColor", "setProgressColor", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeStoryPlayerProgressBarStyle implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeStoryPlayerProgressBarStyle> CREATOR = new a();
    private int backgroundColor;
    private int progressColor;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeStoryPlayerProgressBarStyle(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeStoryPlayerProgressBarStyle[i];
        }
    }

    public BlazeStoryPlayerProgressBarStyle(int i, int i2) {
        this.backgroundColor = i;
        this.progressColor = i2;
    }

    public static /* synthetic */ BlazeStoryPlayerProgressBarStyle copy$default(BlazeStoryPlayerProgressBarStyle blazeStoryPlayerProgressBarStyle, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = blazeStoryPlayerProgressBarStyle.backgroundColor;
        }
        if ((i3 & 2) != 0) {
            i2 = blazeStoryPlayerProgressBarStyle.progressColor;
        }
        return blazeStoryPlayerProgressBarStyle.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final int getProgressColor() {
        return this.progressColor;
    }

    @NotNull
    public final BlazeStoryPlayerProgressBarStyle copy(int backgroundColor, int progressColor) {
        return new BlazeStoryPlayerProgressBarStyle(backgroundColor, progressColor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeStoryPlayerProgressBarStyle)) {
            return false;
        }
        BlazeStoryPlayerProgressBarStyle blazeStoryPlayerProgressBarStyle = (BlazeStoryPlayerProgressBarStyle) other;
        return this.backgroundColor == blazeStoryPlayerProgressBarStyle.backgroundColor && this.progressColor == blazeStoryPlayerProgressBarStyle.progressColor;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getProgressColor() {
        return this.progressColor;
    }

    public int hashCode() {
        return Integer.hashCode(this.progressColor) + (Integer.hashCode(this.backgroundColor) * 31);
    }

    public final void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public final void setProgressColor(int i) {
        this.progressColor = i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeStoryPlayerProgressBarStyle(backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", progressColor=");
        return wv8.j(sb, this.progressColor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.backgroundColor);
        dest.writeInt(this.progressColor);
    }
}
