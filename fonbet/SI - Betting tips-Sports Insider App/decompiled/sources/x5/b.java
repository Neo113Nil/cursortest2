package x5;

import androidx.transition.n0;
import com.google.android.gms.common.api.Status;
import e6.l;
import g6.v;
import io.sentry.android.core.w0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final n0 f25392c = new n0("RevokeAccessOperation", new String[0]);

    /* renamed from: a, reason: collision with root package name */
    public final String f25393a;

    /* renamed from: b, reason: collision with root package name */
    public final l f25394b;

    public b(String str) {
        v.e(str);
        this.f25393a = str;
        this.f25394b = new l(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        n0 n0Var = f25392c;
        Status status = Status.f4463g;
        try {
            String str = this.f25393a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 50);
            sb2.append("https://accounts.google.com/o/oauth2/revoke?token=");
            sb2.append(str);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb2.toString()).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f4461e;
            } else {
                w0.d((String) n0Var.f2734c, ((String) n0Var.f2735d).concat("Unable to revoke access!"));
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(responseCode).length() + 15);
            sb3.append("Response Code: ");
            sb3.append(responseCode);
            n0Var.c(sb3.toString(), new Object[0]);
        } catch (IOException e7) {
            w0.d((String) n0Var.f2734c, ((String) n0Var.f2735d).concat("IOException when revoking access: ".concat(String.valueOf(e7.toString()))));
        } catch (Exception e9) {
            w0.d((String) n0Var.f2734c, ((String) n0Var.f2735d).concat("Exception when revoking access: ".concat(String.valueOf(e9.toString()))));
        }
        this.f25394b.u0(status);
    }
}
