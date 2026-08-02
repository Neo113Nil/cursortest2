package d4;

import android.content.res.AssetFileDescriptor;
import io.appmetrica.analytics.impl.C0617y0;
import io.appmetrica.analytics.impl.U;
import io.sentry.k0;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.InetAddress;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8169a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8170b;

    public /* synthetic */ z(int i5, Object obj) {
        this.f8169a = i5;
        this.f8170b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        j9.e eVar;
        FileInputStream fileInputStream;
        Throwable th2;
        switch (this.f8169a) {
            case 0:
                return (AssetFileDescriptor) this.f8170b;
            case 1:
                return ((i9.i) this.f8170b).c();
            case 2:
                return U.e((U) this.f8170b);
            case 3:
                return ((C0617y0) this.f8170b).p();
            case 4:
                k0 k0Var = (k0) this.f8170b;
                try {
                    k0Var.f16591e.getClass();
                    k0Var.f16588b = InetAddress.getLocalHost().getCanonicalHostName();
                    k0Var.f16589c = System.currentTimeMillis() + k0Var.f16587a;
                    k0Var.f16590d.set(false);
                    return null;
                } catch (Throwable th3) {
                    k0Var.f16590d.set(false);
                    throw th3;
                }
            default:
                j9.n nVar = (j9.n) this.f8170b;
                synchronized (nVar) {
                    eVar = null;
                    try {
                        fileInputStream = nVar.f18358a.openFileInput(nVar.f18359b);
                        try {
                            int available = fileInputStream.available();
                            byte[] bArr = new byte[available];
                            fileInputStream.read(bArr, 0, available);
                            eVar = j9.e.a(new JSONObject(new String(bArr, "UTF-8")));
                            fileInputStream.close();
                        } catch (FileNotFoundException | JSONException unused) {
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return eVar;
                        } catch (Throwable th4) {
                            th2 = th4;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            throw th2;
                        }
                    } catch (FileNotFoundException | JSONException unused2) {
                        fileInputStream = null;
                    } catch (Throwable th5) {
                        fileInputStream = null;
                        th2 = th5;
                    }
                }
                return eVar;
        }
    }
}
