package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d4c extends Binder implements mm9 {
    public final WeakReference a;

    public d4c(jac jacVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(jacVar);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i) {
            case 1:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                String readString = parcel.readString();
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                jac jacVar = (jac) this.a.get();
                if (jacVar != null) {
                    jacVar.e(1, readString, bundle);
                }
                return true;
            case 2:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                ogj.b();
                return false;
            case 3:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                z4(parcel.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 4:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                    MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                }
                ogj.b();
                return false;
            case 5:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
                ogj.b();
                return false;
            case 6:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                }
                ogj.b();
                return false;
            case 7:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                }
                ogj.b();
                return false;
            case 8:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                    ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                }
                ogj.b();
                return false;
            case 9:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                int readInt = parcel.readInt();
                jac jacVar2 = (jac) this.a.get();
                if (jacVar2 != null) {
                    jacVar2.e(9, Integer.valueOf(readInt), null);
                }
                return true;
            case 10:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readInt();
                return true;
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                boolean z = parcel.readInt() != 0;
                jac jacVar3 = (jac) this.a.get();
                if (jacVar3 != null) {
                    jacVar3.e(11, Boolean.valueOf(z), null);
                }
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                int readInt2 = parcel.readInt();
                jac jacVar4 = (jac) this.a.get();
                if (jacVar4 != null) {
                    jacVar4.e(12, Integer.valueOf(readInt2), null);
                }
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                jac jacVar5 = (jac) this.a.get();
                if (jacVar5 != null) {
                    jacVar5.e(13, null, null);
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // defpackage.mm9
    public final void z4(PlaybackStateCompat playbackStateCompat) {
        jac jacVar = (jac) this.a.get();
        if (jacVar != null) {
            jacVar.e(2, playbackStateCompat, null);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
