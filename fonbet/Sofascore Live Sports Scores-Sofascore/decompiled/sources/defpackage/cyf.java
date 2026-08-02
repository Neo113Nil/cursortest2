package defpackage;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.util.Base64;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.core.widget.RemoteViewsCompatService;
import com.sofascore.results.R;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cyf implements RemoteViewsService.RemoteViewsFactory {
    public static final a02 e = new a02(new long[0], new RemoteViews[0]);
    public final RemoteViewsCompatService a;
    public final int b;
    public final int c;
    public a02 d = e;

    public cyf(RemoteViewsCompatService remoteViewsCompatService, int i, int i2) {
        this.a = remoteViewsCompatService;
        this.b = i;
        this.c = i2;
    }

    public final void a() {
        Long l;
        RemoteViewsCompatService remoteViewsCompatService = this.a;
        SharedPreferences sharedPreferences = remoteViewsCompatService.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
        sharedPreferences.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(':');
        sb.append(this.c);
        a02 a02Var = null;
        String string = sharedPreferences.getString(sb.toString(), null);
        if (string != null) {
            byte[] decode = Base64.decode(string, 0);
            decode.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.getClass();
            try {
                obtain.unmarshall(decode, 0, decode.length);
                obtain.setDataPosition(0);
                int readInt = obtain.readInt();
                byte[] bArr = new byte[readInt];
                obtain.readByteArray(bArr);
                String readString = obtain.readString();
                readString.getClass();
                long readLong = obtain.readLong();
                obtain.recycle();
                if (Intrinsics.c(Build.VERSION.INCREMENTAL, readString)) {
                    try {
                        l = Long.valueOf(Build.VERSION.SDK_INT >= 28 ? c90.q(remoteViewsCompatService.getPackageManager().getPackageInfo(remoteViewsCompatService.getPackageName(), 0)) : r0.versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                        Objects.toString(remoteViewsCompatService.getPackageManager());
                        l = null;
                    }
                    if (l != null && l.longValue() == readLong) {
                        try {
                            obtain = Parcel.obtain();
                            obtain.getClass();
                            try {
                                obtain.unmarshall(bArr, 0, readInt);
                                obtain.setDataPosition(0);
                                a02 a02Var2 = new a02(obtain);
                                obtain.recycle();
                                a02Var = a02Var2;
                            } finally {
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            } finally {
            }
        }
        if (a02Var == null) {
            a02Var = e;
        }
        this.d = a02Var;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return ((long[]) this.d.d).length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        try {
            return ((long[]) this.d.d)[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        try {
            return ((RemoteViews[]) this.d.e)[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.a.getPackageName(), R.layout.invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return this.d.b;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return this.d.c;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
