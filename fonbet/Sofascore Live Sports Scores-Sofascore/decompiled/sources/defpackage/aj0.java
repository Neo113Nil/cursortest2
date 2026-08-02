package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import com.ironsource.U3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class aj0 implements otc {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public aj0(Context context, j35 j35Var) {
        this.a = 1;
        this.b = context.getApplicationContext();
        this.c = j35Var;
    }

    @Override // defpackage.otc
    public final ntc a(Object obj, int i, int i2, uvd uvdVar) {
        s08 s08Var;
        ntc a;
        Uri uri;
        int i3 = this.a;
        ntc ntcVar = null;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i3) {
            case 0:
                Uri uri2 = (Uri) obj;
                String substring = uri2.toString().substring(22);
                wjd wjdVar = new wjd(uri2);
                AssetManager assetManager = (AssetManager) obj2;
                switch (((zi0) obj3).a) {
                    case 0:
                        s08Var = new s08(assetManager, substring, 0);
                        break;
                    default:
                        s08Var = new s08(assetManager, substring, 1);
                        break;
                }
                return new ntc(wjdVar, s08Var);
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) uvdVar.c(l1g.b);
                return new ntc(new wjd(num), new k35(theme, theme != null ? theme.getResources() : ((Context) obj2).getResources(), (j35) obj3, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                pia piaVar = null;
                for (int i4 = 0; i4 < size; i4++) {
                    otc otcVar = (otc) arrayList.get(i4);
                    if (otcVar.b(obj) && (a = otcVar.a(obj, i, i2, uvdVar)) != null) {
                        piaVar = a.a;
                        arrayList2.add(a.c);
                    }
                }
                if (arrayList2.isEmpty() || piaVar == null) {
                    return null;
                }
                return new ntc(piaVar, new cyc(arrayList2, (sx2) obj3));
            case 3:
                Integer num2 = (Integer) obj;
                try {
                    uri = Uri.parse("android.resource://" + ((Resources) obj3).getResourcePackageName(num2.intValue()) + '/' + num2);
                } catch (Resources.NotFoundException unused) {
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((otc) obj2).a(uri, i, i2, uvdVar);
            default:
                Uri uri3 = (Uri) obj;
                otc otcVar2 = (otc) obj3;
                List<String> pathSegments = uri3.getPathSegments();
                if (pathSegments.size() == 1) {
                    try {
                        int parseInt = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (parseInt != 0) {
                            ntcVar = otcVar2.a(Integer.valueOf(parseInt), i, i2, uvdVar);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            uri3.toString();
                        }
                        return ntcVar;
                    } catch (NumberFormatException unused2) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return ntcVar;
                        }
                        Objects.toString(uri3);
                        return ntcVar;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    uri3.toString();
                    return null;
                }
                List<String> pathSegments2 = uri3.getPathSegments();
                Context context = (Context) obj2;
                int identifier = context.getResources().getIdentifier(pathSegments2.get(1), pathSegments2.get(0), context.getPackageName());
                if (identifier != 0) {
                    return otcVar2.a(Integer.valueOf(identifier), i, i2, uvdVar);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                uri3.toString();
                return null;
        }
    }

    @Override // defpackage.otc
    public final boolean b(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Uri uri = (Uri) obj;
                if (U3.i.b.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0))) {
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                Iterator it = ((ArrayList) obj2).iterator();
                while (it.hasNext()) {
                    if (((otc) it.next()).b(obj)) {
                        break;
                    }
                }
                break;
            case 3:
                break;
            default:
                Uri uri2 = (Uri) obj;
                if ("android.resource".equals(uri2.getScheme()) && ((Context) obj2).getPackageName().equals(uri2.getAuthority())) {
                    break;
                }
                break;
        }
        return true;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.b).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public aj0(Resources resources, otc otcVar) {
        this.a = 3;
        this.c = resources;
        this.b = otcVar;
    }

    public /* synthetic */ aj0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public aj0(Context context, otc otcVar) {
        this.a = 4;
        this.b = context.getApplicationContext();
        this.c = otcVar;
    }
}
