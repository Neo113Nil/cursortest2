package x1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.appcompat.app.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f25375f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static b f25376g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f25377a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f25378b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f25379c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f25380d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final h f25381e;

    public b(Context context) {
        this.f25377a = context;
        this.f25381e = new h(this, context.getMainLooper());
    }

    public static b a(Context context) {
        b bVar;
        synchronized (f25375f) {
            try {
                if (f25376g == null) {
                    f25376g = new b(context.getApplicationContext());
                }
                bVar = f25376g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public final void b(Intent intent) {
        ArrayList arrayList;
        synchronized (this.f25378b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f25377a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z5 = (intent.getFlags() & 8) != 0;
                if (z5) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList2 = (ArrayList) this.f25379c.get(intent.getAction());
                if (arrayList2 != null) {
                    if (z5) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i5 = 0;
                    while (i5 < arrayList2.size()) {
                        a aVar = (a) arrayList2.get(i5);
                        if (z5) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + aVar.f25371a);
                        }
                        if (aVar.f25373c) {
                            if (z5) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList2;
                        } else {
                            int match = aVar.f25371a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (z5) {
                                    StringBuilder sb2 = new StringBuilder();
                                    arrayList = arrayList2;
                                    sb2.append("  Filter matched!  match=0x");
                                    sb2.append(Integer.toHexString(match));
                                    Log.v("LocalBroadcastManager", sb2.toString());
                                } else {
                                    arrayList = arrayList2;
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(aVar);
                                aVar.f25373c = true;
                            } else {
                                arrayList = arrayList2;
                                if (z5) {
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                                }
                            }
                        }
                        i5++;
                        arrayList2 = arrayList;
                    }
                    if (arrayList3 != null) {
                        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                            ((a) arrayList3.get(i10)).f25373c = false;
                        }
                        this.f25380d.add(new io.sentry.util.network.b(14, intent, arrayList3));
                        if (!this.f25381e.hasMessages(1)) {
                            this.f25381e.sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
