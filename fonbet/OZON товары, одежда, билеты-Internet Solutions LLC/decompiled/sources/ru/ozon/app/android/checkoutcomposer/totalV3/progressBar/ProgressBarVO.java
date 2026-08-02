package ru.ozon.app.android.checkoutcomposer.totalV3.progressBar;

import C.C2702w;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.payment.ui.createorder.highload.HighLoadProgressBar;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\r\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u001a\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b\n\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/payment/ui/createorder/highload/HighLoadProgressBar;", "", "id", "duration", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "isInfinite", "<init>", "(JJLru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "getDuration", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProgressBarVO implements c, HighLoadProgressBar {

    @NotNull
    public static final Parcelable.Creator<ProgressBarVO> CREATOR = new Creator();
    private final long duration;
    private final long id;
    private final Boolean isInfinite;
    private final TextDTO title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProgressBarVO> {
        @Override // android.os.Parcelable.Creator
        public final ProgressBarVO createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            TextDTO textDTO = (TextDTO) parcel.readParcelable(ProgressBarVO.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ProgressBarVO(readLong, readLong2, textDTO, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ProgressBarVO[] newArray(int i11) {
            return new ProgressBarVO[i11];
        }
    }

    public ProgressBarVO(long j11, long j12, TextDTO textDTO, Boolean bool) {
        this.id = j11;
        this.duration = j12;
        this.title = textDTO;
        this.isInfinite = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressBarVO)) {
            return false;
        }
        ProgressBarVO progressBarVO = (ProgressBarVO) other;
        return this.id == progressBarVO.id && this.duration == progressBarVO.duration && Intrinsics.d(this.title, progressBarVO.title) && Intrinsics.d(this.isInfinite, progressBarVO.isInfinite);
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

    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = Pk0.c.a(Long.hashCode(this.id) * 31, 31, this.duration);
        TextDTO textDTO = this.title;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        Boolean bool = this.isInfinite;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        long j12 = this.duration;
        TextDTO textDTO = this.title;
        Boolean bool = this.isInfinite;
        StringBuilder d11 = C2702w.d(j11, "ProgressBarVO(id=", ", duration=");
        d11.append(j12);
        d11.append(", title=");
        d11.append(textDTO);
        d11.append(", isInfinite=");
        d11.append(bool);
        d11.append(")");
        return d11.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.id);
        dest.writeLong(this.duration);
        dest.writeParcelable(this.title, flags);
        Boolean bool = this.isInfinite;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool);
        }
    }
}
