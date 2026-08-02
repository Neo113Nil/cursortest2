package com.blaze.blazesdk.style.players.stories;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.style.players.BlazeFirstTimeSlideInstructionStyle;
import com.blaze.blazesdk.style.players.IPlayerFirstTimeSlideInstructions;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import defpackage.fc6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\tHÆ\u0003JA\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tHÆ\u0001J\u0006\u0010 \u001a\u00020!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020!HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020!R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006."}, d2 = {"Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerFirstTimeSlideInstructionsStyle;", "Lcom/blaze/blazesdk/style/players/IPlayerFirstTimeSlideInstructions;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", ToolBar.FORWARD, "Lcom/blaze/blazesdk/style/players/BlazeFirstTimeSlideInstructionStyle;", ToolBar.BACKWARD, CampaignEx.JSON_NATIVE_VIDEO_PAUSE, "transition", "customs", "", "<init>", "(Lcom/blaze/blazesdk/style/players/BlazeFirstTimeSlideInstructionStyle;Lcom/blaze/blazesdk/style/players/BlazeFirstTimeSlideInstructionStyle;Lcom/blaze/blazesdk/style/players/BlazeFirstTimeSlideInstructionStyle;Lcom/blaze/blazesdk/style/players/BlazeFirstTimeSlideInstructionStyle;Ljava/util/List;)V", "getForward", "()Lcom/blaze/blazesdk/style/players/BlazeFirstTimeSlideInstructionStyle;", "setForward", "(Lcom/blaze/blazesdk/style/players/BlazeFirstTimeSlideInstructionStyle;)V", "getBackward", "setBackward", "getPause", "setPause", "getTransition", "setTransition", "getCustoms", "()Ljava/util/List;", "setCustoms", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeStoryPlayerFirstTimeSlideInstructionsStyle implements IPlayerFirstTimeSlideInstructions, BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeStoryPlayerFirstTimeSlideInstructionsStyle> CREATOR = new a();

    @NotNull
    private BlazeFirstTimeSlideInstructionStyle backward;

    @NotNull
    private List<BlazeFirstTimeSlideInstructionStyle> customs;

    @NotNull
    private BlazeFirstTimeSlideInstructionStyle forward;

    @NotNull
    private BlazeFirstTimeSlideInstructionStyle pause;

    @NotNull
    private BlazeFirstTimeSlideInstructionStyle transition;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable.Creator<BlazeFirstTimeSlideInstructionStyle> creator = BlazeFirstTimeSlideInstructionStyle.CREATOR;
            BlazeFirstTimeSlideInstructionStyle createFromParcel = creator.createFromParcel(parcel);
            BlazeFirstTimeSlideInstructionStyle createFromParcel2 = creator.createFromParcel(parcel);
            BlazeFirstTimeSlideInstructionStyle createFromParcel3 = creator.createFromParcel(parcel);
            BlazeFirstTimeSlideInstructionStyle createFromParcel4 = creator.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(BlazeFirstTimeSlideInstructionStyle.CREATOR.createFromParcel(parcel));
            }
            return new BlazeStoryPlayerFirstTimeSlideInstructionsStyle(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeStoryPlayerFirstTimeSlideInstructionsStyle[i];
        }
    }

    public BlazeStoryPlayerFirstTimeSlideInstructionsStyle(@NotNull BlazeFirstTimeSlideInstructionStyle blazeFirstTimeSlideInstructionStyle, @NotNull BlazeFirstTimeSlideInstructionStyle blazeFirstTimeSlideInstructionStyle2, @NotNull BlazeFirstTimeSlideInstructionStyle blazeFirstTimeSlideInstructionStyle3, @NotNull BlazeFirstTimeSlideInstructionStyle blazeFirstTimeSlideInstructionStyle4, @NotNull List<BlazeFirstTimeSlideInstructionStyle> list) {
        blazeFirstTimeSlideInstructionStyle.getClass();
        blazeFirstTimeSlideInstructionStyle2.getClass();
        blazeFirstTimeSlideInstructionStyle3.getClass();
        blazeFirstTimeSlideInstructionStyle4.getClass();
        list.getClass();
        this.forward = blazeFirstTimeSlideInstructionStyle;
        this.backward = blazeFirstTimeSlideInstructionStyle2;
        this.pause = blazeFirstTimeSlideInstructionStyle3;
        this.transition = blazeFirstTimeSlideInstructionStyle4;
        this.customs = list;
    }

    public static /* synthetic */ BlazeStoryPlayerFirstTimeSlideInstructionsStyle copy$default(BlazeStoryPlayerFirstTimeSlideInstructionsStyle blazeStoryPlayerFirstTimeSlideInstructionsStyle, BlazeFirstTimeSlideInstructionStyle blazeFirstTimeSlideInstructionStyle, BlazeFirstTimeSlideInstructionStyle blazeFirstTimeSlideInstructionStyle2, BlazeFirstTimeSlideInstructionStyle blazeFirstTimeSlideInstructionStyle3, BlazeFirstTimeSlideInstructionStyle blazeFirstTimeSlideInstructionStyle4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeFirstTimeSlideInstructionStyle = blazeStoryPlayerFirstTimeSlideInstructionsStyle.forward;
        }
        if ((i & 2) != 0) {
            blazeFirstTimeSlideInstructionStyle2 = blazeStoryPlayerFirstTimeSlideInstructionsStyle.backward;
        }
        if ((i & 4) != 0) {
            blazeFirstTimeSlideInstructionStyle3 = blazeStoryPlayerFirstTimeSlideInstructionsStyle.pause;
        }
        if ((i & 8) != 0) {
            blazeFirstTimeSlideInstructionStyle4 = blazeStoryPlayerFirstTimeSlideInstructionsStyle.transition;
        }
        if ((i & 16) != 0) {
            list = blazeStoryPlayerFirstTimeSlideInstructionsStyle.customs;
        }
        List list2 = list;
        BlazeFirstTimeSlideInstructionStyle blazeFirstTimeSlideInstructionStyle5 = blazeFirstTimeSlideInstructionStyle3;
        return blazeStoryPlayerFirstTimeSlideInstructionsStyle.copy(blazeFirstTimeSlideInstructionStyle, blazeFirstTimeSlideInstructionStyle2, blazeFirstTimeSlideInstructionStyle5, blazeFirstTimeSlideInstructionStyle4, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeFirstTimeSlideInstructionStyle getForward() {
        return this.forward;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeFirstTimeSlideInstructionStyle getBackward() {
        return this.backward;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BlazeFirstTimeSlideInstructionStyle getPause() {
        return this.pause;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BlazeFirstTimeSlideInstructionStyle getTransition() {
        return this.transition;
    }

    @NotNull
    public final List<BlazeFirstTimeSlideInstructionStyle> component5() {
        return this.customs;
    }

    @NotNull
    public final BlazeStoryPlayerFirstTimeSlideInstructionsStyle copy(@NotNull BlazeFirstTimeSlideInstructionStyle forward, @NotNull BlazeFirstTimeSlideInstructionStyle backward, @NotNull BlazeFirstTimeSlideInstructionStyle pause, @NotNull BlazeFirstTimeSlideInstructionStyle transition, @NotNull List<BlazeFirstTimeSlideInstructionStyle> customs) {
        forward.getClass();
        backward.getClass();
        pause.getClass();
        transition.getClass();
        customs.getClass();
        return new BlazeStoryPlayerFirstTimeSlideInstructionsStyle(forward, backward, pause, transition, customs);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeStoryPlayerFirstTimeSlideInstructionsStyle)) {
            return false;
        }
        BlazeStoryPlayerFirstTimeSlideInstructionsStyle blazeStoryPlayerFirstTimeSlideInstructionsStyle = (BlazeStoryPlayerFirstTimeSlideInstructionsStyle) other;
        return Intrinsics.c(this.forward, blazeStoryPlayerFirstTimeSlideInstructionsStyle.forward) && Intrinsics.c(this.backward, blazeStoryPlayerFirstTimeSlideInstructionsStyle.backward) && Intrinsics.c(this.pause, blazeStoryPlayerFirstTimeSlideInstructionsStyle.pause) && Intrinsics.c(this.transition, blazeStoryPlayerFirstTimeSlideInstructionsStyle.transition) && Intrinsics.c(this.customs, blazeStoryPlayerFirstTimeSlideInstructionsStyle.customs);
    }

    @NotNull
    public final BlazeFirstTimeSlideInstructionStyle getBackward() {
        return this.backward;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerFirstTimeSlideInstructions
    @NotNull
    public List<BlazeFirstTimeSlideInstructionStyle> getCustoms() {
        return this.customs;
    }

    @NotNull
    public final BlazeFirstTimeSlideInstructionStyle getForward() {
        return this.forward;
    }

    @NotNull
    public final BlazeFirstTimeSlideInstructionStyle getPause() {
        return this.pause;
    }

    @NotNull
    public final BlazeFirstTimeSlideInstructionStyle getTransition() {
        return this.transition;
    }

    public int hashCode() {
        return this.customs.hashCode() + ((this.transition.hashCode() + ((this.pause.hashCode() + ((this.backward.hashCode() + (this.forward.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final void setBackward(@NotNull BlazeFirstTimeSlideInstructionStyle blazeFirstTimeSlideInstructionStyle) {
        blazeFirstTimeSlideInstructionStyle.getClass();
        this.backward = blazeFirstTimeSlideInstructionStyle;
    }

    @Override // com.blaze.blazesdk.style.players.IPlayerFirstTimeSlideInstructions
    public void setCustoms(@NotNull List<BlazeFirstTimeSlideInstructionStyle> list) {
        list.getClass();
        this.customs = list;
    }

    public final void setForward(@NotNull BlazeFirstTimeSlideInstructionStyle blazeFirstTimeSlideInstructionStyle) {
        blazeFirstTimeSlideInstructionStyle.getClass();
        this.forward = blazeFirstTimeSlideInstructionStyle;
    }

    public final void setPause(@NotNull BlazeFirstTimeSlideInstructionStyle blazeFirstTimeSlideInstructionStyle) {
        blazeFirstTimeSlideInstructionStyle.getClass();
        this.pause = blazeFirstTimeSlideInstructionStyle;
    }

    public final void setTransition(@NotNull BlazeFirstTimeSlideInstructionStyle blazeFirstTimeSlideInstructionStyle) {
        blazeFirstTimeSlideInstructionStyle.getClass();
        this.transition = blazeFirstTimeSlideInstructionStyle;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeStoryPlayerFirstTimeSlideInstructionsStyle(forward=");
        sb.append(this.forward);
        sb.append(", backward=");
        sb.append(this.backward);
        sb.append(", pause=");
        sb.append(this.pause);
        sb.append(", transition=");
        sb.append(this.transition);
        sb.append(", customs=");
        return fc6.p(sb, this.customs, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.forward.writeToParcel(dest, flags);
        this.backward.writeToParcel(dest, flags);
        this.pause.writeToParcel(dest, flags);
        this.transition.writeToParcel(dest, flags);
        List<BlazeFirstTimeSlideInstructionStyle> list = this.customs;
        dest.writeInt(list.size());
        Iterator<BlazeFirstTimeSlideInstructionStyle> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }
}
