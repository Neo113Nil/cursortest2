package ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.presentation;

import C.C2702w;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.payment.ui.createorder.highload.HighLoadProgressBar;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0013J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/presentation/FreshProgressBarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/payment/ui/createorder/highload/HighLoadProgressBar;", "", "id", "duration", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "<init>", "(JJLru/ozon/uni/atoms/data/texts/TextAtom;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "getDuration", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FreshProgressBarVO implements c, HighLoadProgressBar {
    public static final int $stable = TextAtom.$stable;

    @NotNull
    public static final Parcelable.Creator<FreshProgressBarVO> CREATOR = new Creator();
    private final long duration;
    private final long id;
    private final TextAtom text;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FreshProgressBarVO> {
        @Override // android.os.Parcelable.Creator
        public final FreshProgressBarVO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreshProgressBarVO(parcel.readLong(), parcel.readLong(), (TextAtom) parcel.readParcelable(FreshProgressBarVO.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FreshProgressBarVO[] newArray(int i11) {
            return new FreshProgressBarVO[i11];
        }
    }

    public FreshProgressBarVO(long j11, long j12, TextAtom textAtom) {
        this.id = j11;
        this.duration = j12;
        this.text = textAtom;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FreshProgressBarVO)) {
            return false;
        }
        FreshProgressBarVO freshProgressBarVO = (FreshProgressBarVO) other;
        return this.id == freshProgressBarVO.id && this.duration == freshProgressBarVO.duration && Intrinsics.d(this.text, freshProgressBarVO.text);
    }

    @Override // ru.ozon.app.android.payment.ui.createorder.highload.HighLoadProgressBar
    public long getDuration() {
        return this.duration;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextAtom getText() {
        return this.text;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = Pk0.c.a(Long.hashCode(this.id) * 31, 31, this.duration);
        TextAtom textAtom = this.text;
        return a11 + (textAtom == null ? 0 : textAtom.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        long j12 = this.duration;
        TextAtom textAtom = this.text;
        StringBuilder d11 = C2702w.d(j11, "FreshProgressBarVO(id=", ", duration=");
        d11.append(j12);
        d11.append(", text=");
        d11.append(textAtom);
        d11.append(")");
        return d11.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.id);
        dest.writeLong(this.duration);
        dest.writeParcelable(this.text, flags);
    }
}
