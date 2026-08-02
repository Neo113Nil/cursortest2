package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import androidx.room.d;
import java.util.LinkedHashMap;
import xsna.s3q0;

/* compiled from: MultiInstanceInvalidationService.android.kt */
/* loaded from: classes12.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final b d = new b();
    public final a e = new a();

    /* compiled from: MultiInstanceInvalidationService.android.kt */
    public static final class a extends d.a {
        public a() {
            attachInterface(this, d.d);
        }

        @Override // androidx.room.d
        public final int i0(c cVar, String str) {
            int i = 0;
            if (str == null) {
                return 0;
            }
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.d) {
                try {
                    int i2 = multiInstanceInvalidationService.b + 1;
                    multiInstanceInvalidationService.b = i2;
                    if (multiInstanceInvalidationService.d.register(cVar, Integer.valueOf(i2))) {
                        multiInstanceInvalidationService.c.put(Integer.valueOf(i2), str);
                        i = i2;
                    } else {
                        multiInstanceInvalidationService.b--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i;
        }

        @Override // androidx.room.d
        public final void o1(int i, String[] strArr) {
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.d) {
                try {
                    String str = (String) multiInstanceInvalidationService.c.get(Integer.valueOf(i));
                    if (str == null) {
                        return;
                    }
                    int beginBroadcast = multiInstanceInvalidationService.d.beginBroadcast();
                    for (int i2 = 0; i2 < beginBroadcast; i2++) {
                        try {
                            Integer num = (Integer) multiInstanceInvalidationService.d.getBroadcastCookie(i2);
                            int intValue = num.intValue();
                            String str2 = (String) multiInstanceInvalidationService.c.get(num);
                            if (i != intValue && str.equals(str2)) {
                                try {
                                    multiInstanceInvalidationService.d.getBroadcastItem(i2).x0(strArr);
                                    s3q0 s3q0Var = s3q0.a;
                                } catch (RemoteException unused) {
                                }
                            }
                        } catch (Throwable th) {
                            multiInstanceInvalidationService.d.finishBroadcast();
                            throw th;
                        }
                    }
                    multiInstanceInvalidationService.d.finishBroadcast();
                    s3q0 s3q0Var2 = s3q0.a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.room.d
        public final void s0(c cVar, int i) {
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.d) {
                multiInstanceInvalidationService.d.unregister(cVar);
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationService.android.kt */
    public static final class b extends RemoteCallbackList<c> {
        public b() {
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(c cVar, Object obj) {
            MultiInstanceInvalidationService.this.c.remove((Integer) obj);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.e;
    }
}
