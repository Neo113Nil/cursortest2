package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.framework.media.internal.ResourceProvider;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.cast.zzhv;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import xsna.cc01;
import xsna.gp01;
import xsna.ozg0;
import xsna.y801;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public class NotificationOptions extends AbstractSafeParcelable {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;

    @Nullable
    public final cc01 G;
    public final boolean H;
    public final boolean I;
    public final ArrayList b;
    public final int[] c;
    public final long d;
    public final String e;
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
    public static final zzhv J = zzhv.zzi(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING);
    public static final int[] K = {0, 1};

    @NonNull
    public static final Parcelable.Creator<NotificationOptions> CREATOR = new gp01();

    /* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
    public static final class a {
        public String a;
        public final zzhv b = NotificationOptions.J;
        public final int[] c = NotificationOptions.K;
        public final int d = b("smallIconDrawableResId");
        public final int e = b("stopLiveStreamDrawableResId");
        public final int f = b("pauseDrawableResId");
        public final int g = b("playDrawableResId");
        public final int h = b("skipNextDrawableResId");
        public final int i = b("skipPrevDrawableResId");
        public final int j = b("forwardDrawableResId");
        public final int k = b("forward10DrawableResId");
        public final int l = b("forward30DrawableResId");
        public final int m = b("rewindDrawableResId");
        public final int n = b("rewind10DrawableResId");
        public final int o = b("rewind30DrawableResId");
        public final int p = b("disconnectDrawableResId");
        public final long q = 10000;

        public static int b(String str) {
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

        @NonNull
        public final NotificationOptions a() {
            return new NotificationOptions(this.b, this.c, this.q, this.a, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, b("notificationImageSizeDimenResId"), b("castingToDeviceStringResId"), b("stopLiveStreamStringResId"), b("pauseStringResId"), b("playStringResId"), b("skipNextStringResId"), b("skipPrevStringResId"), b("forwardStringResId"), b("forward10StringResId"), b("forward30StringResId"), b("rewindStringResId"), b("rewind10StringResId"), b("rewind30StringResId"), b("disconnectStringResId"), null, false, false);
        }
    }

    public NotificationOptions(@NonNull List list, @NonNull int[] iArr, long j, @NonNull String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, @Nullable IBinder iBinder, boolean z, boolean z2) {
        cc01 y801Var;
        this.b = new ArrayList(list);
        this.c = Arrays.copyOf(iArr, iArr.length);
        this.d = j;
        this.e = str;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = i8;
        this.n = i9;
        this.o = i10;
        this.p = i11;
        this.q = i12;
        this.r = i13;
        this.s = i14;
        this.t = i15;
        this.u = i16;
        this.v = i17;
        this.w = i18;
        this.x = i19;
        this.y = i20;
        this.z = i21;
        this.A = i22;
        this.B = i23;
        this.C = i24;
        this.D = i25;
        this.E = i26;
        this.F = i27;
        this.H = z;
        this.I = z2;
        if (iBinder == null) {
            y801Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            y801Var = queryLocalInterface instanceof cc01 ? (cc01) queryLocalInterface : new y801(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider");
        }
        this.G = y801Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.s(parcel, this.b, 2);
        int[] iArr = this.c;
        ozg0.i(parcel, 3, Arrays.copyOf(iArr, iArr.length), false);
        ozg0.v(parcel, 4, 8);
        parcel.writeLong(this.d);
        ozg0.q(parcel, 5, this.e, false);
        ozg0.v(parcel, 6, 4);
        parcel.writeInt(this.f);
        ozg0.v(parcel, 7, 4);
        parcel.writeInt(this.g);
        ozg0.v(parcel, 8, 4);
        parcel.writeInt(this.h);
        ozg0.v(parcel, 9, 4);
        parcel.writeInt(this.i);
        ozg0.v(parcel, 10, 4);
        parcel.writeInt(this.j);
        ozg0.v(parcel, 11, 4);
        parcel.writeInt(this.k);
        ozg0.v(parcel, 12, 4);
        parcel.writeInt(this.l);
        ozg0.v(parcel, 13, 4);
        parcel.writeInt(this.m);
        ozg0.v(parcel, 14, 4);
        parcel.writeInt(this.n);
        ozg0.v(parcel, 15, 4);
        parcel.writeInt(this.o);
        ozg0.v(parcel, 16, 4);
        parcel.writeInt(this.p);
        ozg0.v(parcel, 17, 4);
        parcel.writeInt(this.q);
        ozg0.v(parcel, 18, 4);
        parcel.writeInt(this.r);
        ozg0.v(parcel, 19, 4);
        parcel.writeInt(this.s);
        ozg0.v(parcel, 20, 4);
        parcel.writeInt(this.t);
        ozg0.v(parcel, 21, 4);
        parcel.writeInt(this.u);
        ozg0.v(parcel, 22, 4);
        parcel.writeInt(this.v);
        ozg0.v(parcel, 23, 4);
        parcel.writeInt(this.w);
        ozg0.v(parcel, 24, 4);
        parcel.writeInt(this.x);
        ozg0.v(parcel, 25, 4);
        parcel.writeInt(this.y);
        ozg0.v(parcel, 26, 4);
        parcel.writeInt(this.z);
        ozg0.v(parcel, 27, 4);
        parcel.writeInt(this.A);
        ozg0.v(parcel, 28, 4);
        parcel.writeInt(this.B);
        ozg0.v(parcel, 29, 4);
        parcel.writeInt(this.C);
        ozg0.v(parcel, 30, 4);
        parcel.writeInt(this.D);
        ozg0.v(parcel, 31, 4);
        parcel.writeInt(this.E);
        ozg0.v(parcel, 32, 4);
        parcel.writeInt(this.F);
        cc01 cc01Var = this.G;
        ozg0.h(parcel, 33, cc01Var == null ? null : cc01Var.asBinder());
        ozg0.v(parcel, 34, 4);
        parcel.writeInt(this.H ? 1 : 0);
        ozg0.v(parcel, 35, 4);
        parcel.writeInt(this.I ? 1 : 0);
        ozg0.x(w, parcel);
    }
}
