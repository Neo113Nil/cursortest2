package d;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import d.InterfaceC5980a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes8.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    InterfaceC5980a f60771a;

    final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            InterfaceC5980a c0934a;
            b bVar = new b();
            IBinder readStrongBinder = parcel.readStrongBinder();
            int i11 = InterfaceC5980a.AbstractBinderC0933a.f60769e;
            if (readStrongBinder == null) {
                c0934a = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(InterfaceC5980a.f60768d);
                c0934a = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC5980a)) ? new InterfaceC5980a.AbstractBinderC0933a.C0934a(readStrongBinder) : (InterfaceC5980a) queryLocalInterface;
            }
            bVar.f60771a = c0934a;
            return bVar;
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i11) {
            return new b[i11];
        }
    }

    /* renamed from: d.b$b, reason: collision with other inner class name */
    class BinderC0935b extends InterfaceC5980a.AbstractBinderC0933a {
        BinderC0935b() {
            attachInterface(this, InterfaceC5980a.f60768d);
        }
    }

    protected void a(int i11, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        synchronized (this) {
            try {
                if (this.f60771a == null) {
                    this.f60771a = new BinderC0935b();
                }
                parcel.writeStrongBinder(this.f60771a.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
