package com.blaze.blazesdk.style.players.stories;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.players.BlazeFirstTimeSlideCTAStyle;
import com.blaze.blazesdk.style.players.BlazeFirstTimeSlideTextStyle;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.ironsource.U3;
import defpackage.jxl;
import defpackage.l4a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B;\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\fHÆ\u0003¢\u0006\u0004\b \u0010!JL\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b'\u0010\u0017J\u001a\u0010*\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010\u0019\"\u0004\b.\u0010/R\"\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u00103R\"\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\u0017\"\u0004\b6\u00107R\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u00108\u001a\u0004\b9\u0010\u001e\"\u0004\b:\u0010;R\"\u0010\u000b\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u00108\u001a\u0004\b<\u0010\u001e\"\u0004\b=\u0010;R\"\u0010\r\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010!\"\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerFirstTimeSlideStyle;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "Ljxl;", "", "show", "Lcom/blaze/blazesdk/style/players/BlazeFirstTimeSlideCTAStyle;", U3.i.G0, "", "backgroundColorResId", "Lcom/blaze/blazesdk/style/players/BlazeFirstTimeSlideTextStyle;", "mainTitle", "subtitle", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerFirstTimeSlideInstructionsStyle;", "instructions", "<init>", "(ZLcom/blaze/blazesdk/style/players/BlazeFirstTimeSlideCTAStyle;ILcom/blaze/blazesdk/style/players/BlazeFirstTimeSlideTextStyle;Lcom/blaze/blazesdk/style/players/BlazeFirstTimeSlideTextStyle;Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerFirstTimeSlideInstructionsStyle;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "component2", "()Lcom/blaze/blazesdk/style/players/BlazeFirstTimeSlideCTAStyle;", "component3", "component4", "()Lcom/blaze/blazesdk/style/players/BlazeFirstTimeSlideTextStyle;", "component5", "component6", "()Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerFirstTimeSlideInstructionsStyle;", "copy", "(ZLcom/blaze/blazesdk/style/players/BlazeFirstTimeSlideCTAStyle;ILcom/blaze/blazesdk/style/players/BlazeFirstTimeSlideTextStyle;Lcom/blaze/blazesdk/style/players/BlazeFirstTimeSlideTextStyle;Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerFirstTimeSlideInstructionsStyle;)Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerFirstTimeSlideStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShow", "setShow", "(Z)V", "Lcom/blaze/blazesdk/style/players/BlazeFirstTimeSlideCTAStyle;", "getCta", "setCta", "(Lcom/blaze/blazesdk/style/players/BlazeFirstTimeSlideCTAStyle;)V", "I", "getBackgroundColorResId", "setBackgroundColorResId", "(I)V", "Lcom/blaze/blazesdk/style/players/BlazeFirstTimeSlideTextStyle;", "getMainTitle", "setMainTitle", "(Lcom/blaze/blazesdk/style/players/BlazeFirstTimeSlideTextStyle;)V", "getSubtitle", "setSubtitle", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerFirstTimeSlideInstructionsStyle;", "getInstructions", "setInstructions", "(Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerFirstTimeSlideInstructionsStyle;)V", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeStoryPlayerFirstTimeSlideStyle implements BlazeParcelable, jxl {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeStoryPlayerFirstTimeSlideStyle> CREATOR = new a();
    private int backgroundColorResId;

    @NotNull
    private BlazeFirstTimeSlideCTAStyle cta;

    @NotNull
    private BlazeStoryPlayerFirstTimeSlideInstructionsStyle instructions;

    @NotNull
    private BlazeFirstTimeSlideTextStyle mainTitle;
    private boolean show;

    @NotNull
    private BlazeFirstTimeSlideTextStyle subtitle;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            boolean z = parcel.readInt() != 0;
            BlazeFirstTimeSlideCTAStyle createFromParcel = BlazeFirstTimeSlideCTAStyle.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            Parcelable.Creator<BlazeFirstTimeSlideTextStyle> creator = BlazeFirstTimeSlideTextStyle.CREATOR;
            return new BlazeStoryPlayerFirstTimeSlideStyle(z, createFromParcel, readInt, creator.createFromParcel(parcel), creator.createFromParcel(parcel), BlazeStoryPlayerFirstTimeSlideInstructionsStyle.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeStoryPlayerFirstTimeSlideStyle[i];
        }
    }

    public BlazeStoryPlayerFirstTimeSlideStyle(boolean z, @NotNull BlazeFirstTimeSlideCTAStyle blazeFirstTimeSlideCTAStyle, int i, @NotNull BlazeFirstTimeSlideTextStyle blazeFirstTimeSlideTextStyle, @NotNull BlazeFirstTimeSlideTextStyle blazeFirstTimeSlideTextStyle2, @NotNull BlazeStoryPlayerFirstTimeSlideInstructionsStyle blazeStoryPlayerFirstTimeSlideInstructionsStyle) {
        blazeFirstTimeSlideCTAStyle.getClass();
        blazeFirstTimeSlideTextStyle.getClass();
        blazeFirstTimeSlideTextStyle2.getClass();
        blazeStoryPlayerFirstTimeSlideInstructionsStyle.getClass();
        this.show = z;
        this.cta = blazeFirstTimeSlideCTAStyle;
        this.backgroundColorResId = i;
        this.mainTitle = blazeFirstTimeSlideTextStyle;
        this.subtitle = blazeFirstTimeSlideTextStyle2;
        this.instructions = blazeStoryPlayerFirstTimeSlideInstructionsStyle;
    }

    public static /* synthetic */ BlazeStoryPlayerFirstTimeSlideStyle copy$default(BlazeStoryPlayerFirstTimeSlideStyle blazeStoryPlayerFirstTimeSlideStyle, boolean z, BlazeFirstTimeSlideCTAStyle blazeFirstTimeSlideCTAStyle, int i, BlazeFirstTimeSlideTextStyle blazeFirstTimeSlideTextStyle, BlazeFirstTimeSlideTextStyle blazeFirstTimeSlideTextStyle2, BlazeStoryPlayerFirstTimeSlideInstructionsStyle blazeStoryPlayerFirstTimeSlideInstructionsStyle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = blazeStoryPlayerFirstTimeSlideStyle.show;
        }
        if ((i2 & 2) != 0) {
            blazeFirstTimeSlideCTAStyle = blazeStoryPlayerFirstTimeSlideStyle.cta;
        }
        if ((i2 & 4) != 0) {
            i = blazeStoryPlayerFirstTimeSlideStyle.backgroundColorResId;
        }
        if ((i2 & 8) != 0) {
            blazeFirstTimeSlideTextStyle = blazeStoryPlayerFirstTimeSlideStyle.mainTitle;
        }
        if ((i2 & 16) != 0) {
            blazeFirstTimeSlideTextStyle2 = blazeStoryPlayerFirstTimeSlideStyle.subtitle;
        }
        if ((i2 & 32) != 0) {
            blazeStoryPlayerFirstTimeSlideInstructionsStyle = blazeStoryPlayerFirstTimeSlideStyle.instructions;
        }
        BlazeFirstTimeSlideTextStyle blazeFirstTimeSlideTextStyle3 = blazeFirstTimeSlideTextStyle2;
        BlazeStoryPlayerFirstTimeSlideInstructionsStyle blazeStoryPlayerFirstTimeSlideInstructionsStyle2 = blazeStoryPlayerFirstTimeSlideInstructionsStyle;
        return blazeStoryPlayerFirstTimeSlideStyle.copy(z, blazeFirstTimeSlideCTAStyle, i, blazeFirstTimeSlideTextStyle, blazeFirstTimeSlideTextStyle3, blazeStoryPlayerFirstTimeSlideInstructionsStyle2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShow() {
        return this.show;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeFirstTimeSlideCTAStyle getCta() {
        return this.cta;
    }

    /* renamed from: component3, reason: from getter */
    public final int getBackgroundColorResId() {
        return this.backgroundColorResId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BlazeFirstTimeSlideTextStyle getMainTitle() {
        return this.mainTitle;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final BlazeFirstTimeSlideTextStyle getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final BlazeStoryPlayerFirstTimeSlideInstructionsStyle getInstructions() {
        return this.instructions;
    }

    @NotNull
    public final BlazeStoryPlayerFirstTimeSlideStyle copy(boolean show, @NotNull BlazeFirstTimeSlideCTAStyle cta, int backgroundColorResId, @NotNull BlazeFirstTimeSlideTextStyle mainTitle, @NotNull BlazeFirstTimeSlideTextStyle subtitle, @NotNull BlazeStoryPlayerFirstTimeSlideInstructionsStyle instructions) {
        cta.getClass();
        mainTitle.getClass();
        subtitle.getClass();
        instructions.getClass();
        return new BlazeStoryPlayerFirstTimeSlideStyle(show, cta, backgroundColorResId, mainTitle, subtitle, instructions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeStoryPlayerFirstTimeSlideStyle)) {
            return false;
        }
        BlazeStoryPlayerFirstTimeSlideStyle blazeStoryPlayerFirstTimeSlideStyle = (BlazeStoryPlayerFirstTimeSlideStyle) other;
        return this.show == blazeStoryPlayerFirstTimeSlideStyle.show && Intrinsics.c(this.cta, blazeStoryPlayerFirstTimeSlideStyle.cta) && this.backgroundColorResId == blazeStoryPlayerFirstTimeSlideStyle.backgroundColorResId && Intrinsics.c(this.mainTitle, blazeStoryPlayerFirstTimeSlideStyle.mainTitle) && Intrinsics.c(this.subtitle, blazeStoryPlayerFirstTimeSlideStyle.subtitle) && Intrinsics.c(this.instructions, blazeStoryPlayerFirstTimeSlideStyle.instructions);
    }

    @Override // defpackage.jxl
    public int getBackgroundColorResId() {
        return this.backgroundColorResId;
    }

    @Override // defpackage.jxl
    @NotNull
    public BlazeFirstTimeSlideCTAStyle getCta() {
        return this.cta;
    }

    @Override // defpackage.jxl
    @NotNull
    public BlazeFirstTimeSlideTextStyle getMainTitle() {
        return this.mainTitle;
    }

    public boolean getShow() {
        return this.show;
    }

    @Override // defpackage.jxl
    @NotNull
    public BlazeFirstTimeSlideTextStyle getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        return this.instructions.hashCode() + ((this.subtitle.hashCode() + ((this.mainTitle.hashCode() + l4a.e(this.backgroundColorResId, (this.cta.hashCode() + (Boolean.hashCode(this.show) * 31)) * 31)) * 31)) * 31);
    }

    public void setBackgroundColorResId(int i) {
        this.backgroundColorResId = i;
    }

    public void setCta(@NotNull BlazeFirstTimeSlideCTAStyle blazeFirstTimeSlideCTAStyle) {
        blazeFirstTimeSlideCTAStyle.getClass();
        this.cta = blazeFirstTimeSlideCTAStyle;
    }

    public void setInstructions(@NotNull BlazeStoryPlayerFirstTimeSlideInstructionsStyle blazeStoryPlayerFirstTimeSlideInstructionsStyle) {
        blazeStoryPlayerFirstTimeSlideInstructionsStyle.getClass();
        this.instructions = blazeStoryPlayerFirstTimeSlideInstructionsStyle;
    }

    public void setMainTitle(@NotNull BlazeFirstTimeSlideTextStyle blazeFirstTimeSlideTextStyle) {
        blazeFirstTimeSlideTextStyle.getClass();
        this.mainTitle = blazeFirstTimeSlideTextStyle;
    }

    public void setShow(boolean z) {
        this.show = z;
    }

    public void setSubtitle(@NotNull BlazeFirstTimeSlideTextStyle blazeFirstTimeSlideTextStyle) {
        blazeFirstTimeSlideTextStyle.getClass();
        this.subtitle = blazeFirstTimeSlideTextStyle;
    }

    @NotNull
    public String toString() {
        return "BlazeStoryPlayerFirstTimeSlideStyle(show=" + this.show + ", cta=" + this.cta + ", backgroundColorResId=" + this.backgroundColorResId + ", mainTitle=" + this.mainTitle + ", subtitle=" + this.subtitle + ", instructions=" + this.instructions + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.show ? 1 : 0);
        this.cta.writeToParcel(dest, flags);
        dest.writeInt(this.backgroundColorResId);
        this.mainTitle.writeToParcel(dest, flags);
        this.subtitle.writeToParcel(dest, flags);
        this.instructions.writeToParcel(dest, flags);
    }

    @Override // defpackage.jxl
    @NotNull
    public BlazeStoryPlayerFirstTimeSlideInstructionsStyle getInstructions() {
        return this.instructions;
    }
}
