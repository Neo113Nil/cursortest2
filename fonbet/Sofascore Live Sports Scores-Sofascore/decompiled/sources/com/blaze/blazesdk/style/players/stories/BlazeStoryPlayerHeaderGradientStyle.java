package com.blaze.blazesdk.style.players.stories;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.players.IPlayerGradientStyle;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.ironsource.C4018c8;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0013\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0006R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerHeaderGradientStyle;", "Lcom/blaze/blazesdk/style/players/IPlayerGradientStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", C4018c8.k, "", "startColor", "", "endColor", "<init>", "(ZII)V", "()Z", "setVisible", "(Z)V", "getStartColor", "()I", "setStartColor", "(I)V", "getEndColor", "setEndColor", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BlazeStoryPlayerHeaderGradientStyle implements IPlayerGradientStyle, BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeStoryPlayerHeaderGradientStyle> CREATOR = new a();
    private int endColor;
    private boolean isVisible;
    private int startColor;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeStoryPlayerHeaderGradientStyle(parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeStoryPlayerHeaderGradientStyle[i];
        }
    }

    public BlazeStoryPlayerHeaderGradientStyle(boolean z, int i, int i2) {
        this.isVisible = z;
        this.startColor = i;
        this.endColor = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerGradientStyle
    public int getEndColor() {
        return this.endColor;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerGradientStyle
    public int getStartColor() {
        return this.startColor;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerGradientStyle
    /* renamed from: isVisible, reason: from getter */
    public boolean getIsVisible() {
        return this.isVisible;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerGradientStyle
    public void setEndColor(int i) {
        this.endColor = i;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerGradientStyle
    public void setStartColor(int i) {
        this.startColor = i;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerGradientStyle
    public void setVisible(boolean z) {
        this.isVisible = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.isVisible ? 1 : 0);
        dest.writeInt(this.startColor);
        dest.writeInt(this.endColor);
    }
}
