package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import defpackage.dcc;
import defpackage.icc;
import defpackage.lm9;
import defpackage.mm9;
import defpackage.ogj;
import defpackage.om9;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d extends Binder implements om9 {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ dcc a;

    public d(dcc dccVar) {
        this.a = dccVar;
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
    }

    @Override // defpackage.om9
    public final void F3(mm9 mm9Var) {
        this.a.e.unregister(mm9Var);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (this.a.c) {
        }
    }

    @Override // defpackage.om9
    public final void W3(mm9 mm9Var) {
        if (this.a.d) {
            return;
        }
        this.a.e.register(mm9Var, new icc("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (this.a.c) {
        }
    }

    @Override // defpackage.om9
    public final PlaybackStateCompat getPlaybackState() {
        dcc dccVar = this.a;
        PlaybackStateCompat playbackStateCompat = dccVar.f;
        MediaMetadataCompat mediaMetadataCompat = dccVar.g;
        if (playbackStateCompat != null) {
            float f = playbackStateCompat.d;
            long j = playbackStateCompat.h;
            int i = playbackStateCompat.a;
            long j2 = playbackStateCompat.b;
            long j3 = -1;
            if (j2 != -1 && ((i == 3 || i == 4 || i == 5) && j > 0)) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j4 = ((long) (f * (elapsedRealtime - j))) + j2;
                if (mediaMetadataCompat != null) {
                    Bundle bundle = mediaMetadataCompat.a;
                    if (bundle.containsKey("android.media.metadata.DURATION")) {
                        j3 = bundle.getLong("android.media.metadata.DURATION", 0L);
                    }
                }
                long j5 = (j3 < 0 || j4 <= j3) ? j4 < 0 ? 0L : j4 : j3;
                ArrayList arrayList = new ArrayList();
                long j6 = playbackStateCompat.c;
                long j7 = playbackStateCompat.e;
                int i2 = playbackStateCompat.f;
                CharSequence charSequence = playbackStateCompat.g;
                ArrayList arrayList2 = playbackStateCompat.i;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                return new PlaybackStateCompat(playbackStateCompat.a, j5, j6, playbackStateCompat.d, j7, i2, charSequence, elapsedRealtime, arrayList, playbackStateCompat.j, playbackStateCompat.k);
            }
        }
        return playbackStateCompat;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        mm9 mm9Var = null;
        mm9 mm9Var2 = null;
        switch (i) {
            case 1:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                if (parcel.readInt() != 0) {
                    MediaSessionCompat$ResultReceiverWrapper.CREATOR.createFromParcel(parcel);
                }
                ogj.b();
                return false;
            case 2:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                }
                ogj.b();
                return false;
            case 3:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof mm9)) {
                        lm9 lm9Var = new lm9();
                        lm9Var.a = readStrongBinder;
                        mm9Var = lm9Var;
                    } else {
                        mm9Var = (mm9) queryLocalInterface;
                    }
                }
                W3(mm9Var);
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof mm9)) {
                        lm9 lm9Var2 = new lm9();
                        lm9Var2.a = readStrongBinder2;
                        mm9Var2 = lm9Var2;
                    } else {
                        mm9Var2 = (mm9) queryLocalInterface2;
                    }
                }
                F3(mm9Var2);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                ogj.b();
                return false;
            case 6:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                ogj.b();
                return false;
            case 7:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                ogj.b();
                return false;
            case 8:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                ogj.b();
                return false;
            case 9:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                ogj.b();
                return false;
            case 10:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                ogj.b();
                return false;
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                ogj.b();
                return false;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                ogj.b();
                return false;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                ogj.b();
                return false;
            case 14:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                ogj.b();
                return false;
            case 15:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                ogj.b();
                return false;
            case 16:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                }
                if (parcel.readInt() != 0) {
                }
                ogj.b();
                return false;
            case 17:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readLong();
                ogj.b();
                return false;
            case 18:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                ogj.b();
                return false;
            case 19:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                ogj.b();
                return false;
            case 20:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                ogj.b();
                return false;
            case 21:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                ogj.b();
                return false;
            case 22:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                ogj.b();
                return false;
            case 23:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                ogj.b();
                return false;
            case 24:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readLong();
                ogj.b();
                return false;
            case 25:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                    RatingCompat.CREATOR.createFromParcel(parcel);
                }
                ogj.b();
                return false;
            case 26:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                ogj.b();
                return false;
            case 27:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                ogj.b();
                return false;
            case 28:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                PlaybackStateCompat playbackState = getPlaybackState();
                parcel2.writeNoException();
                if (playbackState == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                playbackState.writeToParcel(parcel2, 1);
                return true;
            case 29:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.writeNoException();
                parcel2.writeTypedList(null);
                return true;
            case 30:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                ogj.b();
                return false;
            case 31:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                ogj.b();
                return false;
            case 32:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                ogj.b();
                return false;
            case 34:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                ogj.b();
                return false;
            case 35:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                ogj.b();
                return false;
            case 36:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                }
                if (parcel.readInt() != 0) {
                }
                ogj.b();
                return false;
            case 37:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 38:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                ogj.b();
                return false;
            case 40:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 41:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                    MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                }
                ogj.b();
                return false;
            case 42:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                    MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                }
                parcel.readInt();
                ogj.b();
                return false;
            case 43:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                    MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                }
                ogj.b();
                return false;
            case 44:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                ogj.b();
                return false;
            case 45:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 46:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                ogj.b();
                return false;
            case 47:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 48:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                ogj.b();
                return false;
            case 49:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readFloat();
                ogj.b();
                return false;
            case 50:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 51:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                    RatingCompat.CREATOR.createFromParcel(parcel);
                }
                if (parcel.readInt() != 0) {
                }
                ogj.b();
                return false;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
