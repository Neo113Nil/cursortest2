package com.google.android.gms.cloudmessaging;

import D9.i;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    public Messenger f32210a;

    public zzd(IBinder iBinder) {
        this.f32210a = new Messenger(iBinder);
    }

    public final IBinder a() {
        Messenger messenger = this.f32210a;
        messenger.getClass();
        return messenger.getBinder();
    }

    public final void b(Message message) {
        Messenger messenger = this.f32210a;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((zzd) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f32210a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
