package ru.ozon.app.android.atoms.utils;

import android.os.Parcel;
import android.text.Spanned;
import androidx.core.text.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/atoms/utils/OzonSpannableStringParceler;", "", "Lru/ozon/app/android/atoms/utils/OzonSpannableString;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "create", "(Landroid/os/Parcel;)Lru/ozon/app/android/atoms/utils/OzonSpannableString;", "", "flags", "", "write", "(Lru/ozon/app/android/atoms/utils/OzonSpannableString;Landroid/os/Parcel;I)V", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OzonSpannableStringParceler {

    @NotNull
    public static final OzonSpannableStringParceler INSTANCE = new OzonSpannableStringParceler();

    private OzonSpannableStringParceler() {
    }

    public OzonSpannableString create(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (parcel.readInt() == 0) {
            return null;
        }
        String readString = parcel.readString();
        if (readString == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Spanned a11 = b.a(readString, 0);
        Intrinsics.checkNotNullExpressionValue(a11, "fromHtml(...)");
        return OzonSpannableStringKt.toOzonSpannableString(a11);
    }

    public void write(OzonSpannableString ozonSpannableString, @NotNull Parcel parcel, int i11) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (ozonSpannableString == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(b.c(ozonSpannableString));
        }
    }
}
