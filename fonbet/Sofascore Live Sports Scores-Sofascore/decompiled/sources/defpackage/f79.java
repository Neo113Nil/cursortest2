package defpackage;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.U3;
import java.util.IllegalFormatException;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class f79 implements pjd, ol5 {
    public static final f79 c;
    public static final f79 d;
    public final /* synthetic */ int a;
    public String b;

    static {
        int i = 0;
        boolean z = false;
        c = new f79("FOLD", i, z);
        d = new f79("HINGE", i, z);
    }

    public f79(String str, int i) {
        this.a = i;
        switch (i) {
            case 7:
                this.b = lnb.j(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
                return;
            default:
                if (TextUtils.isEmpty(str)) {
                    ilg.c();
                    throw null;
                }
                this.b = str;
                return;
        }
    }

    public static f79 b(j9e j9eVar) {
        String str;
        int i = 2;
        j9eVar.O(2);
        int A = j9eVar.A();
        int i2 = A >> 1;
        int A2 = ((j9eVar.A() >> 3) & 31) | ((A & 1) << 5);
        if (i2 == 4 || i2 == 5 || i2 == 7 || i2 == 8) {
            str = "dvhe";
        } else if (i2 == 9) {
            str = "dvav";
        } else {
            if (i2 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(i2 < 10 ? ".0" : ".");
        sb.append(i2);
        return new f79(me4.g(A2, A2 < 10 ? ".0" : ".", sb), i, false);
    }

    public static String g(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = fc6.n(str2, " [", TextUtils.join(", ", objArr), U3.j.e);
            }
        }
        return lnb.o(str, " : ", str2);
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            g(this.b, str, objArr);
        }
    }

    @Override // defpackage.ol5
    public boolean d(CharSequence charSequence, int i, int i2, d6k d6kVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.b)) {
            return true;
        }
        d6kVar.c = (d6kVar.c & 3) | 4;
        return false;
    }

    public void e(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            g(this.b, str, objArr);
        }
    }

    public void f(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            g(this.b, str, objArr);
        }
    }

    @Override // defpackage.pjd
    public Object n() {
        throw new zfa(this.b);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ol5
    public Object a() {
        return this;
    }

    public /* synthetic */ f79(String str, int i, boolean z) {
        this.a = i;
        this.b = str;
    }
}
