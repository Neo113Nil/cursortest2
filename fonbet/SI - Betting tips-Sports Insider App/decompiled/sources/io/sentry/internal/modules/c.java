package io.sentry.internal.modules;

import com.google.android.gms.internal.measurement.d5;
import io.sentry.ILogger;
import io.sentry.b5;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: e, reason: collision with root package name */
    public final Pattern f16525e;

    /* renamed from: f, reason: collision with root package name */
    public final Pattern f16526f;

    /* renamed from: g, reason: collision with root package name */
    public final ClassLoader f16527g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ILogger iLogger) {
        super(iLogger);
        ClassLoader classLoader = c.class.getClassLoader();
        this.f16525e = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.f16526f = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.f16527g = d5.j(classLoader);
    }

    @Override // io.sentry.internal.modules.d
    public final Map b() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f16527g.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                Matcher matcher = this.f16525e.matcher(resources.nextElement().toString());
                b bVar = null;
                String group = (matcher.matches() && matcher.groupCount() == 1) ? matcher.group(1) : null;
                if (group != null) {
                    Matcher matcher2 = this.f16526f.matcher(group);
                    if (matcher2.matches() && matcher2.groupCount() == 2) {
                        bVar = new b(matcher2.group(1), matcher2.group(2));
                    }
                }
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
        } catch (Throwable th2) {
            this.f16529a.e(b5.ERROR, "Unable to detect modules via manifest files.", th2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            hashMap.put(bVar2.f16523a, bVar2.f16524b);
        }
        return hashMap;
    }
}
