package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.cast.framework.media.internal.ResourceProvider;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.cast.zzhv;
import com.google.android.gms.internal.cast.zzib;
import com.ironsource.Ua;
import defpackage.sno;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class NotificationOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<NotificationOptions> CREATOR;
    public static final com.google.android.gms.internal.cast.a I;
    public static final int[] J;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final zzg F;
    public final boolean G;
    public final boolean H;
    public final ArrayList a;
    public final int[] b;
    public final long c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
        public final com.google.android.gms.internal.cast.a a = NotificationOptions.I;
        public final int[] b = NotificationOptions.J;
        public final int c = a("smallIconDrawableResId");
        public final int d = a("stopLiveStreamDrawableResId");
        public final int e = a("pauseDrawableResId");
        public final int f = a("playDrawableResId");
        public final int g = a("skipNextDrawableResId");
        public final int h = a("skipPrevDrawableResId");
        public final int i = a("forwardDrawableResId");
        public final int j = a("forward10DrawableResId");
        public final int k = a("forward30DrawableResId");
        public final int l = a("rewindDrawableResId");
        public final int m = a("rewind10DrawableResId");
        public final int n = a("rewind30DrawableResId");
        public final int o = a("disconnectDrawableResId");
        public final long p = Ua.s;

        public static int a(String str) {
            try {
                Map map = ResourceProvider.a;
                Integer num = (Integer) ResourceProvider.class.getMethod("findResourceByName", String.class).invoke(null, str);
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        }
    }

    static {
        sno snoVar = zzhv.b;
        Object[] objArr = {MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING};
        for (int i = 0; i < 2; i++) {
            zzib.a(i, objArr[i]);
        }
        I = zzhv.r(2, objArr);
        J = new int[]{0, 1};
        CREATOR = new zzs();
    }

    public NotificationOptions(List list, int[] iArr, long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, IBinder iBinder, boolean z, boolean z2) {
        zzg zzeVar;
        this.a = new ArrayList(list);
        this.b = Arrays.copyOf(iArr, iArr.length);
        this.c = j;
        this.d = str;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = i6;
        this.k = i7;
        this.l = i8;
        this.m = i9;
        this.n = i10;
        this.o = i11;
        this.p = i12;
        this.q = i13;
        this.r = i14;
        this.s = i15;
        this.t = i16;
        this.u = i17;
        this.v = i18;
        this.w = i19;
        this.x = i20;
        this.y = i21;
        this.z = i22;
        this.A = i23;
        this.B = i24;
        this.C = i25;
        this.D = i26;
        this.E = i27;
        this.G = z;
        this.H = z2;
        if (iBinder == null) {
            zzeVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            zzeVar = queryLocalInterface instanceof zzg ? (zzg) queryLocalInterface : new zze(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider");
        }
        this.F = zzeVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.o(parcel, 2, this.a);
        int[] iArr = this.b;
        SafeParcelWriter.g(parcel, 3, Arrays.copyOf(iArr, iArr.length));
        SafeParcelWriter.r(parcel, 4, 8);
        parcel.writeLong(this.c);
        SafeParcelWriter.m(parcel, 5, this.d, false);
        SafeParcelWriter.r(parcel, 6, 4);
        parcel.writeInt(this.e);
        SafeParcelWriter.r(parcel, 7, 4);
        parcel.writeInt(this.f);
        SafeParcelWriter.r(parcel, 8, 4);
        parcel.writeInt(this.g);
        SafeParcelWriter.r(parcel, 9, 4);
        parcel.writeInt(this.h);
        SafeParcelWriter.r(parcel, 10, 4);
        parcel.writeInt(this.i);
        SafeParcelWriter.r(parcel, 11, 4);
        parcel.writeInt(this.j);
        SafeParcelWriter.r(parcel, 12, 4);
        parcel.writeInt(this.k);
        SafeParcelWriter.r(parcel, 13, 4);
        parcel.writeInt(this.l);
        SafeParcelWriter.r(parcel, 14, 4);
        parcel.writeInt(this.m);
        SafeParcelWriter.r(parcel, 15, 4);
        parcel.writeInt(this.n);
        SafeParcelWriter.r(parcel, 16, 4);
        parcel.writeInt(this.o);
        SafeParcelWriter.r(parcel, 17, 4);
        parcel.writeInt(this.p);
        SafeParcelWriter.r(parcel, 18, 4);
        parcel.writeInt(this.q);
        SafeParcelWriter.r(parcel, 19, 4);
        parcel.writeInt(this.r);
        SafeParcelWriter.r(parcel, 20, 4);
        parcel.writeInt(this.s);
        SafeParcelWriter.r(parcel, 21, 4);
        parcel.writeInt(this.t);
        SafeParcelWriter.r(parcel, 22, 4);
        parcel.writeInt(this.u);
        SafeParcelWriter.r(parcel, 23, 4);
        parcel.writeInt(this.v);
        SafeParcelWriter.r(parcel, 24, 4);
        parcel.writeInt(this.w);
        SafeParcelWriter.r(parcel, 25, 4);
        parcel.writeInt(this.x);
        SafeParcelWriter.r(parcel, 26, 4);
        parcel.writeInt(this.y);
        SafeParcelWriter.r(parcel, 27, 4);
        parcel.writeInt(this.z);
        SafeParcelWriter.r(parcel, 28, 4);
        parcel.writeInt(this.A);
        SafeParcelWriter.r(parcel, 29, 4);
        parcel.writeInt(this.B);
        SafeParcelWriter.r(parcel, 30, 4);
        parcel.writeInt(this.C);
        SafeParcelWriter.r(parcel, 31, 4);
        parcel.writeInt(this.D);
        SafeParcelWriter.r(parcel, 32, 4);
        parcel.writeInt(this.E);
        zzg zzgVar = this.F;
        SafeParcelWriter.f(parcel, 33, zzgVar == null ? null : zzgVar.asBinder());
        SafeParcelWriter.r(parcel, 34, 4);
        parcel.writeInt(this.G ? 1 : 0);
        SafeParcelWriter.r(parcel, 35, 4);
        parcel.writeInt(this.H ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }
}
