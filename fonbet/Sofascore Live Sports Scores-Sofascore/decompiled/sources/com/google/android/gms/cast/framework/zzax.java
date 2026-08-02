package com.google.android.gms.cast.framework;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.cast.zzb;
import com.google.android.gms.internal.cast.zzc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzax extends zzb implements zzay {
    public zzax() {
        super("com.google.android.gms.cast.framework.ISessionManagerListener");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        SessionManagerListener sessionManagerListener;
        SessionManagerListener sessionManagerListener2;
        SessionManagerListener sessionManagerListener3;
        SessionManagerListener sessionManagerListener4;
        SessionManagerListener sessionManagerListener5;
        SessionManagerListener sessionManagerListener6;
        SessionManagerListener sessionManagerListener7;
        SessionManagerListener sessionManagerListener8;
        SessionManagerListener sessionManagerListener9;
        switch (i) {
            case 1:
                ObjectWrapper objectWrapper = new ObjectWrapper(((zzbg) this).a);
                parcel2.writeNoException();
                zzc.c(parcel2, objectWrapper);
                return true;
            case 2:
                IObjectWrapper S1 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzc.d(parcel);
                zzbg zzbgVar = (zzbg) this;
                Session session = (Session) ObjectWrapper.Z1(S1);
                Class cls = zzbgVar.b;
                if (cls.isInstance(session) && (sessionManagerListener = zzbgVar.a) != null) {
                    sessionManagerListener.f((Session) cls.cast(session));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper S12 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                String readString = parcel.readString();
                zzc.d(parcel);
                zzbg zzbgVar2 = (zzbg) this;
                Session session2 = (Session) ObjectWrapper.Z1(S12);
                Class cls2 = zzbgVar2.b;
                if (cls2.isInstance(session2) && (sessionManagerListener2 = zzbgVar2.a) != null) {
                    sessionManagerListener2.k((Session) cls2.cast(session2), readString);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper S13 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzc.d(parcel);
                zzbg zzbgVar3 = (zzbg) this;
                Session session3 = (Session) ObjectWrapper.Z1(S13);
                Class cls3 = zzbgVar3.b;
                if (cls3.isInstance(session3) && (sessionManagerListener3 = zzbgVar3.a) != null) {
                    sessionManagerListener3.e((Session) cls3.cast(session3), readInt);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper S14 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzc.d(parcel);
                zzbg zzbgVar4 = (zzbg) this;
                Session session4 = (Session) ObjectWrapper.Z1(S14);
                Class cls4 = zzbgVar4.b;
                if (cls4.isInstance(session4) && (sessionManagerListener4 = zzbgVar4.a) != null) {
                    sessionManagerListener4.o((Session) cls4.cast(session4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper S15 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzc.d(parcel);
                zzbg zzbgVar5 = (zzbg) this;
                Session session5 = (Session) ObjectWrapper.Z1(S15);
                Class cls5 = zzbgVar5.b;
                if (cls5.isInstance(session5) && (sessionManagerListener5 = zzbgVar5.a) != null) {
                    sessionManagerListener5.d((Session) cls5.cast(session5), readInt2);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper S16 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                zzc.d(parcel);
                zzbg zzbgVar6 = (zzbg) this;
                Session session6 = (Session) ObjectWrapper.Z1(S16);
                Class cls6 = zzbgVar6.b;
                if (cls6.isInstance(session6) && (sessionManagerListener6 = zzbgVar6.a) != null) {
                    sessionManagerListener6.c((Session) cls6.cast(session6), readString2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper S17 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                int i2 = zzc.a;
                boolean z = parcel.readInt() != 0;
                zzc.d(parcel);
                zzbg zzbgVar7 = (zzbg) this;
                Session session7 = (Session) ObjectWrapper.Z1(S17);
                Class cls7 = zzbgVar7.b;
                if (cls7.isInstance(session7) && (sessionManagerListener7 = zzbgVar7.a) != null) {
                    sessionManagerListener7.m((Session) cls7.cast(session7), z);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper S18 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzc.d(parcel);
                zzbg zzbgVar8 = (zzbg) this;
                Session session8 = (Session) ObjectWrapper.Z1(S18);
                Class cls8 = zzbgVar8.b;
                if (cls8.isInstance(session8) && (sessionManagerListener8 = zzbgVar8.a) != null) {
                    sessionManagerListener8.n((Session) cls8.cast(session8), readInt3);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                IObjectWrapper S19 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzc.d(parcel);
                zzbg zzbgVar9 = (zzbg) this;
                Session session9 = (Session) ObjectWrapper.Z1(S19);
                Class cls9 = zzbgVar9.b;
                if (cls9.isInstance(session9) && (sessionManagerListener9 = zzbgVar9.a) != null) {
                    sessionManagerListener9.a((Session) cls9.cast(session9), readInt4);
                }
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            default:
                return false;
        }
    }
}
