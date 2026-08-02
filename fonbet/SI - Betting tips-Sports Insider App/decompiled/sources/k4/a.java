package k4;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import c4.b0;
import c4.p;
import java.io.File;
import okio.Path;
import q4.n;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18808a;

    public /* synthetic */ a(int i5) {
        this.f18808a = i5;
    }

    public final b0 a(Object obj, n nVar) {
        switch (this.f18808a) {
            case 0:
                return p.j(((Uri) obj).toString());
            case 1:
                return p.a(((File) obj).getPath());
            case 2:
                return p.a(((Path) obj).toString());
            case 3:
                int intValue = ((Number) obj).intValue();
                Context context = nVar.f22007a;
                try {
                    if (context.getResources().getResourceEntryName(intValue) != null) {
                        return p.j("android.resource://" + context.getPackageName() + '/' + intValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            default:
                return p.j((String) obj);
        }
    }
}
