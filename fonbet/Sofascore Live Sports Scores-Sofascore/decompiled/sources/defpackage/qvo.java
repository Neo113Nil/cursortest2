package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.view.View;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class qvo extends xkn implements svo {
    public qvo() {
        super("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    @Override // defpackage.xkn
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        int i2 = 0;
        switch (i) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeString("ms");
                return true;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                avo.c(parcel);
                utn utnVar = ((jvo) this).c;
                utnVar.b = readString;
                utnVar.c = readString2;
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper S1 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                avo.c(parcel);
                Uri uri = (Uri) ObjectWrapper.Z1(S1);
                utn utnVar2 = ((jvo) this).c;
                utnVar2.getClass();
                uri.getClass();
                try {
                    if (uri.getHost().equals((String) utnVar2.b)) {
                        if (uri.getPath().equals((String) utnVar2.c)) {
                            i2 = 1;
                        }
                    }
                } catch (NullPointerException unused) {
                }
                parcel2.writeNoException();
                parcel2.writeInt(i2);
                return true;
            case 4:
                IObjectWrapper S12 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                avo.c(parcel);
                Uri uri2 = (Uri) ObjectWrapper.Z1(S12);
                utn utnVar3 = ((jvo) this).c;
                utnVar3.getClass();
                uri2.getClass();
                try {
                    String host = uri2.getHost();
                    String[] strArr = (String[]) utnVar3.d;
                    int length = strArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            if (host.endsWith(strArr[i3])) {
                                i2 = 1;
                            } else {
                                i3++;
                            }
                        }
                    }
                } catch (NullPointerException unused2) {
                }
                parcel2.writeNoException();
                parcel2.writeInt(i2);
                return true;
            case 5:
                String readString3 = parcel.readString();
                avo.c(parcel);
                utn utnVar4 = ((jvo) this).c;
                utnVar4.getClass();
                utnVar4.d = readString3.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper S13 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IObjectWrapper S14 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                avo.c(parcel);
                ObjectWrapper S15 = ((jvo) this).S1(S13, S14, true);
                parcel2.writeNoException();
                avo.b(parcel2, S15);
                return true;
            case 7:
                IObjectWrapper S16 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                avo.c(parcel);
                String g = ((jvo) this).b.g((Context) ObjectWrapper.Z1(S16));
                parcel2.writeNoException();
                parcel2.writeString(g);
                return true;
            case 8:
                IObjectWrapper S17 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                String readString4 = parcel.readString();
                avo.c(parcel);
                String d = ((jvo) this).b.d((Context) ObjectWrapper.Z1(S17), readString4, null, null);
                parcel2.writeNoException();
                parcel2.writeString(d);
                return true;
            case 9:
                IObjectWrapper S18 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                avo.c(parcel);
                ((jvo) this).t(S18);
                parcel2.writeNoException();
                return true;
            case 10:
                IObjectWrapper S19 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IObjectWrapper S110 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                avo.c(parcel);
                ObjectWrapper S111 = ((jvo) this).S1(S19, S110, false);
                parcel2.writeNoException();
                avo.b(parcel2, S111);
                return true;
            case 11:
                parcel.readString();
                int i4 = avo.a;
                parcel.readInt();
                avo.c(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 12:
                IObjectWrapper S112 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                parcel.createByteArray();
                avo.c(parcel);
                String g2 = ((jvo) this).b.g((Context) ObjectWrapper.Z1(S112));
                parcel2.writeNoException();
                parcel2.writeString(g2);
                return true;
            case 13:
                IObjectWrapper S113 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                avo.c(parcel);
                String s = ((jvo) this).s(S113);
                parcel2.writeNoException();
                parcel2.writeString(s);
                return true;
            case 14:
                IObjectWrapper S114 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IObjectWrapper S115 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IObjectWrapper S116 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                avo.c(parcel);
                String q0 = ((jvo) this).q0(S114, S115, S116);
                parcel2.writeNoException();
                parcel2.writeString(q0);
                return true;
            case 15:
                IObjectWrapper S117 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                avo.c(parcel);
                ((jvo) this).b.c((View) ObjectWrapper.Z1(S117));
                parcel2.writeNoException();
                return true;
            case 16:
            default:
                return false;
            case 17:
                IObjectWrapper S118 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IObjectWrapper S119 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IObjectWrapper S120 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IObjectWrapper S121 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                avo.c(parcel);
                String R = ((jvo) this).R(S118, S119, S120, S121);
                parcel2.writeNoException();
                parcel2.writeString(R);
                return true;
            case 18:
                boolean zze = ((jvo) this).b.zze();
                parcel2.writeNoException();
                int i5 = avo.a;
                parcel2.writeInt(zze ? 1 : 0);
                return true;
            case 19:
                boolean zzf = ((jvo) this).b.zzf();
                parcel2.writeNoException();
                int i6 = avo.a;
                parcel2.writeInt(zzf ? 1 : 0);
                return true;
            case 20:
                int i7 = -1;
                uno unoVar = ((jvo) this).b;
                if (unoVar != null) {
                    pno pnoVar = (pno) unoVar.a.get();
                    if (pnoVar instanceof yno) {
                        i7 = 1;
                    } else if (pnoVar instanceof smo) {
                        i7 = 2;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i7);
                return true;
        }
    }
}
