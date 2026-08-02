package com.vk.catalog2.common.ui.mvp.auto;

import android.app.Application;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.Process;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.lifecycle.n;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media.g;
import com.vk.toggle.features.CatalogFeatures;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.a1z;
import xsna.b25;
import xsna.bn40;
import xsna.bpn0;
import xsna.d890;
import xsna.epx;
import xsna.f22;
import xsna.j5g;
import xsna.msy;
import xsna.os9;
import xsna.r6m;
import xsna.tfm0;
import xsna.w6r0;
import xsna.x6r0;
import xsna.xy6;
import xsna.ye80;

/* compiled from: VKAndroidAutoCatalogMediaService.kt */
/* loaded from: classes16.dex */
public abstract class VKAndroidAutoCatalogMediaService extends MediaBrowserServiceCompat {
    public static boolean o;
    public MediaSessionCompat i;
    public d890 j;
    public boolean k;
    public w6r0 l;
    public final Object m = msy.a(LazyThreadSafetyMode.NONE, new tfm0(this, 12));
    public final bpn0 n = new bpn0(new ye80(this, 29));

    /* compiled from: VKAndroidAutoCatalogMediaService.kt */
    public static final class a {
        static {
            new a();
        }
    }

    @Override // androidx.media.MediaBrowserServiceCompat
    public final void b(String str, Bundle bundle, androidx.media.d dVar) {
        bn40.f("action:" + str + "  extras:" + bundle + " result:" + dVar);
        i().a(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0156 A[RETURN] */
    @Override // androidx.media.MediaBrowserServiceCompat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MediaBrowserServiceCompat.a c(String str, int i, Bundle bundle) {
        boolean z;
        ApplicationInfo applicationInfo;
        d890.a aVar;
        StringBuilder b = xy6.b(i, "onGetRoot clientPackageName=", str, " clientUid=", " rootHints=");
        b.append(bundle);
        bn40.f(b.toString());
        if (this.g != null) {
            d890 d890Var = this.j;
            d890 d890Var2 = d890Var == null ? null : d890Var;
            LinkedHashMap linkedHashMap = d890Var2.d;
            PackageManager packageManager = d890Var2.a;
            Pair pair = (Pair) linkedHashMap.get(str);
            if (pair == null) {
                pair = new Pair(0, Boolean.FALSE);
            }
            int intValue = ((Number) pair.d()).intValue();
            boolean booleanValue = ((Boolean) pair.g()).booleanValue();
            if (intValue != i) {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 4160);
                if (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) {
                    aVar = null;
                } else {
                    String obj = applicationInfo.loadLabel(packageManager).toString();
                    int i2 = applicationInfo.uid;
                    Signature[] signatureArr = packageInfo.signatures;
                    String a2 = (signatureArr == null || signatureArr.length != 1) ? null : d890.a(signatureArr[0].toByteArray());
                    String[] strArr = packageInfo.requestedPermissions;
                    int[] iArr = packageInfo.requestedPermissionsFlags;
                    if (iArr == null) {
                        iArr = new int[0];
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    if (strArr != null) {
                        int length = strArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            String str2 = strArr[i3];
                            int i5 = i4 + 1;
                            if ((iArr[i4] & 2) != 0) {
                                linkedHashSet.add(str2);
                            }
                            i3++;
                            i4 = i5;
                        }
                    }
                    aVar = new d890.a(obj, str, i2, a2, j5g.S0(linkedHashSet));
                }
                if (aVar == null) {
                    throw new IllegalStateException("Caller wasn't found in the system?");
                }
                Set<String> set = aVar.e;
                if (aVar.c != i) {
                    throw new IllegalStateException("Caller's package UID doesn't match caller's actual UID?");
                }
                String str3 = aVar.d;
                d890.b bVar = (d890.b) d890Var2.b.get(str);
                if (bVar != null) {
                    for (d890.c cVar : bVar.c) {
                        if (epx.f(cVar.a, str3)) {
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                cVar = null;
                booleanValue = i == Process.myUid() || (cVar != null) || i == 1000 || epx.f(str3, d890Var2.c) || set.contains("android.permission.MEDIA_CONTENT_CONTROL") || set.contains("android.permission.BIND_NOTIFICATION_LISTENER_SERVICE");
                linkedHashMap.put(str, new Pair(Integer.valueOf(i), Boolean.valueOf(booleanValue)));
            }
            if (booleanValue) {
                z = true;
                if (z) {
                    return null;
                }
                return i().f();
            }
        }
        z = false;
        if (z) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.media.MediaBrowserServiceCompat
    public final void d(String str, MediaBrowserServiceCompat.g<List<MediaBrowserCompat.MediaItem>> gVar) {
        bn40.f("onLoadChildren parentId=" + str + " result=" + gVar);
        if (((b25) this.m.getValue()).b()) {
            i().e(str, gVar);
            return;
        }
        gVar.f(null);
        f22 c = i().c();
        if (c != null) {
            c.c(getApplicationContext(), str);
        }
    }

    @Override // androidx.media.MediaBrowserServiceCompat
    public final void e(String str, Bundle bundle, androidx.media.c cVar) {
        bn40.f("onSearch(query:", str, "extras:", String.valueOf(bundle), "result:", cVar, ")");
        i().d(str, cVar);
    }

    public final w6r0 h(boolean z) {
        if (z) {
            bn40.f("init delegate");
            return new x6r0(this, this.n);
        }
        bn40.f("init legacy delegate");
        return new a1z(this);
    }

    public final w6r0 i() {
        w6r0 w6r0Var = this.l;
        if (w6r0Var == null) {
            w6r0Var = h(this.k);
            w6r0 w6r0Var2 = this.l;
            if (w6r0Var2 != null) {
                w6r0Var2.onDestroy();
            }
            this.l = w6r0Var;
        }
        return w6r0Var;
    }

    public final void j(MediaSessionCompat mediaSessionCompat) {
        f22 c = i().c();
        if (c != null) {
            c.b();
        }
        i().b(mediaSessionCompat);
        mediaSessionCompat.setCallback(i().c());
        f22 c2 = i().c();
        mediaSessionCompat.setPlaybackState(c2 != null ? c2.a() : null);
    }

    @Override // androidx.media.MediaBrowserServiceCompat, android.app.Service
    public final void onCreate() {
        try {
            bn40.f("onCreate");
            r6m.a.getClass();
            os9 os9Var = new os9(this);
            ((n) os9Var.c).f(r6m.d);
            r6m.c = os9Var;
            this.j = new d890((Application) getApplicationContext());
            CatalogFeatures catalogFeatures = CatalogFeatures.NEW_ANDROID_AUTO;
            catalogFeatures.getClass();
            this.k = com.vk.toggle.b.A.a(catalogFeatures);
            super.onCreate();
            MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(this, getClass().getSimpleName());
            mediaSessionCompat.setFlags(4);
            j(mediaSessionCompat);
            this.i = mediaSessionCompat;
            g(mediaSessionCompat.getSessionToken());
            o = true;
        } catch (Throwable th) {
            bn40.c(th, new Object[0]);
            com.vk.metrics.eventtracking.b.a.q(th);
        }
    }

    @Override // androidx.media.MediaBrowserServiceCompat, android.app.Service
    public final void onDestroy() {
        n nVar;
        super.onDestroy();
        bn40.f(new Object[0]);
        r6m.a.getClass();
        os9 os9Var = r6m.c;
        if (os9Var != null && (nVar = (n) os9Var.c) != null) {
            nVar.j(r6m.d);
        }
        i().onDestroy();
        MediaSessionCompat mediaSessionCompat = this.i;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.setActive(false);
        }
        MediaSessionCompat mediaSessionCompat2 = this.i;
        if (mediaSessionCompat2 != null) {
            mediaSessionCompat2.release();
        }
        this.i = null;
        o = false;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String action = intent != null ? intent.getAction() : null;
        if (action == null || action.hashCode() != 1855906702 || !action.equals("com.vk.catalog2.action_content_changed")) {
            return super.onStartCommand(intent, i, i2);
        }
        bn40.f("Content change command received");
        CatalogFeatures catalogFeatures = CatalogFeatures.NEW_ANDROID_AUTO;
        catalogFeatures.getClass();
        boolean a2 = com.vk.toggle.b.A.a(catalogFeatures);
        if (this.k != a2) {
            w6r0 h = h(a2);
            w6r0 w6r0Var = this.l;
            if (w6r0Var != null) {
                w6r0Var.onDestroy();
            }
            this.l = h;
            MediaSessionCompat mediaSessionCompat = this.i;
            if (mediaSessionCompat != null) {
                j(mediaSessionCompat);
            }
            this.k = a2;
        }
        MediaBrowserServiceCompat.f fVar = this.b;
        fVar.b.notifyChildrenChanged(DomExceptionUtils.SEPARATOR);
        MediaBrowserServiceCompat.this.f.post(new g(fVar));
        return 2;
    }
}
