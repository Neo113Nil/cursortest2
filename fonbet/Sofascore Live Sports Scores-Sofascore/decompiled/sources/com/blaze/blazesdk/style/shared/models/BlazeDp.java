package com.blaze.blazesdk.style.shared.models;

import android.app.Application;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.ironsource.U3;
import defpackage.evl;
import defpackage.joa;
import defpackage.wv8;
import defpackage.yj1;
import defpackage.ypa;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0007J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0007J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\b\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR!\u0010#\u001a\u00020\u00028@X\u0080\u0084\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0007¨\u0006$"}, d2 = {"Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "", U3.i.X, "<init>", "(I)V", "component1", "()I", "other", "subtractNonNegative$blazesdk_release", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "subtractNonNegative", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "copy", "(I)Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "", "equals", "(Ljava/lang/Object;)Z", "I", "toPx$delegate", "Ljoa;", "getToPx$blazesdk_release", "getToPx$blazesdk_release$annotations", "()V", "toPx", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeDp implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeDp> CREATOR = new a();

    /* renamed from: toPx$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa toPx = ypa.b(new yj1(this, 5));
    private final int value;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeDp(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeDp[i];
        }
    }

    public BlazeDp(int i) {
        this.value = i;
    }

    /* renamed from: component1, reason: from getter */
    private final int getValue() {
        return this.value;
    }

    public static /* synthetic */ BlazeDp copy$default(BlazeDp blazeDp, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = blazeDp.value;
        }
        return blazeDp.copy(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toPx_delegate$lambda$0(BlazeDp blazeDp) {
        Application application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
        application$blazesdk_release.getClass();
        return evl.a(application$blazesdk_release, blazeDp.value);
    }

    @NotNull
    public final BlazeDp copy(int value) {
        return new BlazeDp(value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BlazeDp) && this.value == ((BlazeDp) other).value;
    }

    public final int getToPx$blazesdk_release() {
        return ((Number) this.toPx.getValue()).intValue();
    }

    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    @NotNull
    public final BlazeDp subtractNonNegative$blazesdk_release(@NotNull BlazeDp other) {
        other.getClass();
        int i = this.value - other.value;
        if (i < 0) {
            i = 0;
        }
        return new BlazeDp(i);
    }

    @NotNull
    public String toString() {
        return wv8.j(new StringBuilder("BlazeDp(value="), this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.value);
    }

    public static /* synthetic */ void getToPx$blazesdk_release$annotations() {
    }
}
