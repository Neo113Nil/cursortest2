package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import xsna.e601;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.1.0 */
/* loaded from: classes12.dex */
public final class zze implements Parcelable {
    public static final Parcelable.Creator<zze> CREATOR = new e601();
    public final Messenger b;

    public zze(IBinder iBinder) {
        this.b = new Messenger(iBinder);
    }

    public final void a(Message message) throws RemoteException {
        Messenger messenger = this.b;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.b;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((zze) obj).b;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.b;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.b;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
