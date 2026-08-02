package h8;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.google.firebase.messaging.x;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;
import o8.p;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements a9.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10393a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10394b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10395c;

    public /* synthetic */ c(int i5, Object obj, Object obj2) {
        this.f10393a = i5;
        this.f10394b = obj;
        this.f10395c = obj2;
    }

    @Override // a9.a
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f10393a) {
            case 0:
                g gVar = (g) this.f10394b;
                Context context = (Context) this.f10395c;
                String d10 = gVar.d();
                f9.a aVar = new f9.a();
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 24) {
                    context = i5 >= 24 ? d0.a.a(context) : null;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + d10, 0);
                boolean z5 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z5 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z5 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                aVar.f9540a = z5;
                return aVar;
            case 1:
                o8.e eVar = (o8.e) this.f10394b;
                o8.b bVar = (o8.b) this.f10395c;
                o8.d dVar = bVar.f21107f;
                x xVar = new x();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<o8.h> set = bVar.f21104c;
                Set set2 = bVar.f21108g;
                for (o8.h hVar : set) {
                    int i10 = hVar.f21124c;
                    int i11 = hVar.f21123b;
                    boolean z7 = i10 == 0;
                    p pVar = hVar.f21122a;
                    if (z7) {
                        if (i11 == 2) {
                            hashSet4.add(pVar);
                        } else {
                            hashSet.add(pVar);
                        }
                    } else if (i10 == 2) {
                        hashSet3.add(pVar);
                    } else if (i11 == 2) {
                        hashSet5.add(pVar);
                    } else {
                        hashSet2.add(pVar);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(p.a(x8.b.class));
                }
                xVar.f6182a = DesugarCollections.unmodifiableSet(hashSet);
                xVar.f6183b = DesugarCollections.unmodifiableSet(hashSet2);
                DesugarCollections.unmodifiableSet(hashSet3);
                xVar.f6184c = DesugarCollections.unmodifiableSet(hashSet4);
                DesugarCollections.unmodifiableSet(hashSet5);
                xVar.f6185d = eVar;
                return dVar.h(xVar);
            default:
                return new y8.g((Context) this.f10395c, (String) this.f10394b);
        }
    }

    public /* synthetic */ c(Context context, String str) {
        this.f10393a = 2;
        this.f10395c = context;
        this.f10394b = str;
    }
}
