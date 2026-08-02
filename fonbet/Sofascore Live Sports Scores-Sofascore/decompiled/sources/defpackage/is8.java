package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.unity3d.ads.adplayer.FullScreenWebViewDisplay;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class is8 implements xd, pz8, Continuation, h72, uq9, vq9, bt8, xn3, k3f {
    public final /* synthetic */ int a;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(int i, Object obj, String str) {
        throw new IllegalArgumentException(str + obj + ((char) i));
    }

    public static /* synthetic */ void b(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void c(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void d(Object obj, String str, int i, int i2) {
        throw new IllegalArgumentException((str + i + obj + i2).toString());
    }

    public static /* synthetic */ void e(String str) {
        throw new IOException(str);
    }

    public static /* synthetic */ void f(String str, double d) {
        throw new IllegalArgumentException(str + d);
    }

    public static /* synthetic */ void h(Throwable th) {
        throw new RuntimeException(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i(int i, Object obj, String str) {
        throw new IllegalArgumentException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void j(Object obj, String str, int i, int i2) {
        throw new IndexOutOfBoundsException(str + i + obj + i2);
    }

    @Override // defpackage.xn3
    public void accept(Object obj) {
        switch (this.a) {
            case 18:
                break;
            case 19:
            case 21:
            case 22:
            case 26:
            default:
                break;
            case 20:
                break;
            case 23:
                Locale locale = Locale.US;
                ((wy7) obj).j().size();
                break;
            case 24:
                ((Throwable) obj).getMessage();
                break;
            case 25:
                ((Throwable) obj).getMessage();
                break;
            case 27:
                ((Throwable) obj).getMessage();
                break;
        }
    }

    @Override // defpackage.bt8
    public Object apply(Object obj) {
        switch (this.a) {
            case 15:
                return ((ri2) obj).i();
            case 16:
                List list = (List) obj;
                rha.x(list, "source is null");
                return new jkd(list);
            case 17:
                return ((oi2) obj).h();
            default:
                return ra3.a;
        }
    }

    @Override // defpackage.uq9, defpackage.vq9
    public boolean evaluate(int i, int i2, int i3, int i4, int i5) {
        switch (this.a) {
        }
        return false;
    }

    @Override // defpackage.h72
    public i72 g(Bundle bundle) {
        qx9.r(bundle.getInt(Integer.toString(0, 36), -1) == 0);
        return bundle.getBoolean(Integer.toString(1, 36), false) ? new e99(bundle.getBoolean(Integer.toString(2, 36), false)) : new e99();
    }

    @Override // defpackage.pz8
    public Object get() {
        if (Build.VERSION.SDK_INT == 34) {
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
            Bitmap copy = createBitmap.copy(Bitmap.Config.HARDWARE, false);
            createBitmap.recycle();
            r1 = copy == null;
            if (copy != null) {
                copy.recycle();
            }
        }
        return Boolean.valueOf(r1);
    }

    @Override // defpackage.xd
    public void onActivityResult(Object obj) {
        FullScreenWebViewDisplay.startForResult$lambda$12((ActivityResult) obj);
    }

    @Override // defpackage.k3f
    public boolean test(Object obj) {
        boolean booleanValue;
        switch (this.a) {
            case 21:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 22:
                ku0 ku0Var = (ku0) obj;
                return (TextUtils.isEmpty(ku0Var.a) || TextUtils.isEmpty(ku0Var.b.a)) ? false : true;
            default:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !booleanValue;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle == null) {
            e("SERVICE_NOT_AVAILABLE");
            return null;
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            e("INSTANCE_ID_RESET");
            return null;
        }
        if (string3 != null) {
            e(string3);
            return null;
        }
        bundle.toString();
        new Throwable();
        e("SERVICE_NOT_AVAILABLE");
        return null;
    }

    public /* synthetic */ is8(int i) {
        this.a = i;
    }
}
