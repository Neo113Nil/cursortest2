package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a70;
import defpackage.eoh;
import defpackage.f7a;
import defpackage.foh;
import defpackage.p4h;
import defpackage.wib;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "T", "Leoh;", "Landroid/os/Parcelable;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class ParcelableSnapshotMutableState<T> extends eoh implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        f7a f7aVar = f7a.k;
        foh fohVar = this.b;
        if (fohVar.equals(f7aVar)) {
            i2 = 0;
        } else if (fohVar.equals(wib.i)) {
            i2 = 1;
        } else {
            if (!fohVar.equals(p4h.g)) {
                a70.r("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
