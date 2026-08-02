package com.sofascore.results.league.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.sofascore.results.R;
import com.sofascore.results.main.start.StartActivity;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.ajh;
import defpackage.apf;
import defpackage.ht9;
import defpackage.jdb;
import defpackage.k13;
import defpackage.laf;
import defpackage.ljg;
import defpackage.lu3;
import defpackage.n13;
import defpackage.nr9;
import defpackage.nt9;
import defpackage.pco;
import defpackage.rfh;
import defpackage.rfo;
import defpackage.rq3;
import defpackage.sfh;
import defpackage.sl6;
import defpackage.sq3;
import defpackage.vt9;
import defpackage.wt9;
import defpackage.y05;
import defpackage.y6a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/sofascore/results/league/service/ShortcutWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "q5a", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShortcutWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, int i2, sq3 sq3Var, String str) {
        rfh rfhVar;
        int i3;
        ShortcutManager shortcutManager;
        String j;
        String str2;
        Drawable drawable;
        String str3;
        String str4;
        Intent intent;
        ShortcutManager shortcutManager2;
        List<ShortcutInfo> list;
        nr9 b;
        Drawable drawable2;
        String str5 = str;
        if (sq3Var instanceof rfh) {
            rfhVar = (rfh) sq3Var;
            int i4 = rfhVar.z;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                rfhVar.z = i4 - Integer.MIN_VALUE;
                Object obj = rfhVar.x;
                lu3 lu3Var = lu3.a;
                i3 = rfhVar.z;
                if (i3 != 0) {
                    y6a.M(obj);
                    Context applicationContext = getApplicationContext();
                    applicationContext.getClass();
                    shortcutManager = (ShortcutManager) applicationContext.getSystemService(ShortcutManager.class);
                    if (shortcutManager == null) {
                        return Unit.a;
                    }
                    j = ljg.j(i2, "unique-tournament-id-");
                    List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
                    dynamicShortcuts.getClass();
                    Iterator<ShortcutInfo> it = dynamicShortcuts.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.c(it.next().getId(), j)) {
                            return Unit.a;
                        }
                    }
                    str2 = "id-search";
                    shortcutManager.removeDynamicShortcuts(a.c("id-search"));
                    List<ShortcutInfo> dynamicShortcuts2 = shortcutManager.getDynamicShortcuts();
                    dynamicShortcuts2.getClass();
                    drawable = null;
                    if (dynamicShortcuts2.size() >= 3) {
                        if (dynamicShortcuts2.size() > 1) {
                            n13.u(new laf(19), dynamicShortcuts2);
                        }
                        while (dynamicShortcuts2.size() >= 3) {
                            shortcutManager.removeDynamicShortcuts(a.c(((ShortcutInfo) CollectionsKt.Y(dynamicShortcuts2)).getId()));
                            dynamicShortcuts2.remove(0);
                        }
                        ArrayList arrayList = new ArrayList(k13.r(dynamicShortcuts2, 10));
                        int i5 = 0;
                        for (Iterator it2 = dynamicShortcuts2.iterator(); it2.hasNext(); it2 = it2) {
                            Object next = it2.next();
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                b.q();
                                throw null;
                            }
                            arrayList.add(new ShortcutInfo.Builder(getApplicationContext(), ((ShortcutInfo) next).getId()).setRank(i5).build());
                            i5 = i6;
                        }
                        shortcutManager.updateShortcuts(arrayList);
                    }
                    List<ShortcutInfo> dynamicShortcuts3 = shortcutManager.getDynamicShortcuts();
                    dynamicShortcuts3.getClass();
                    Intent intent2 = new Intent(getApplicationContext(), (Class<?>) StartActivity.class);
                    intent2.setAction("notification_click_action");
                    intent2.putExtra("open_action", "open_tournament");
                    intent2.putExtra("unique_tournament_id", i2);
                    if (str5 == null) {
                        str3 = "open_action";
                        str4 = "notification_click_action";
                        List<ShortcutInfo> dynamicShortcuts4 = shortcutManager.getDynamicShortcuts();
                        dynamicShortcuts4.getClass();
                        Intent intent3 = new Intent(getApplicationContext(), (Class<?>) StartActivity.class);
                        intent3.setAction(str4);
                        intent3.putExtra(str3, "open_search");
                        Icon createWithResource = Icon.createWithResource(getApplicationContext(), R.drawable.ic_search);
                        createWithResource.getClass();
                        ShortcutInfo build = new ShortcutInfo.Builder(getApplicationContext(), str2).setShortLabel(getApplicationContext().getString(R.string.search)).setLongLabel(getApplicationContext().getString(R.string.search)).setIcon(b(createWithResource.loadDrawable(getApplicationContext()), R.drawable.ic_search)).setRank(dynamicShortcuts4.size()).setIntent(intent3).build();
                        build.getClass();
                        shortcutManager.addDynamicShortcuts(a.c(build));
                        return Unit.a;
                    }
                    Context applicationContext2 = getApplicationContext();
                    applicationContext2.getClass();
                    apf a = ajh.a(applicationContext2);
                    Context applicationContext3 = getApplicationContext();
                    applicationContext3.getClass();
                    ht9 ht9Var = new ht9(applicationContext3);
                    Boolean bool = y05.a;
                    Context applicationContext4 = getApplicationContext();
                    applicationContext4.getClass();
                    if (y05.a(applicationContext4)) {
                        Bitmap.Config config = Bitmap.Config.ARGB_4444;
                        sl6 sl6Var = vt9.a;
                        str3 = "open_action";
                        str4 = "notification_click_action";
                        ht9Var.b().a(vt9.b, config);
                    } else {
                        str3 = "open_action";
                        str4 = "notification_click_action";
                    }
                    ht9Var.c = pco.I(i, new Integer(i2), false);
                    nt9 a2 = ht9Var.a();
                    rfhVar.r = str5;
                    rfhVar.s = shortcutManager;
                    rfhVar.t = j;
                    rfhVar.u = dynamicShortcuts3;
                    rfhVar.v = "id-search";
                    rfhVar.w = intent2;
                    rfhVar.z = 1;
                    Object c = a.c(a2, rfhVar);
                    if (c == lu3Var) {
                        return lu3Var;
                    }
                    obj = c;
                    intent = intent2;
                    shortcutManager2 = shortcutManager;
                    list = dynamicShortcuts3;
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    intent = rfhVar.w;
                    String str6 = rfhVar.v;
                    list = rfhVar.u;
                    j = rfhVar.t;
                    shortcutManager2 = rfhVar.s;
                    String str7 = rfhVar.r;
                    y6a.M(obj);
                    str2 = str6;
                    str5 = str7;
                    str3 = "open_action";
                    str4 = "notification_click_action";
                    drawable = null;
                }
                b = ((wt9) obj).b();
                if (b == null) {
                    Resources resources = getApplicationContext().getResources();
                    resources.getClass();
                    drawable2 = rfo.t(b, resources);
                } else {
                    drawable2 = drawable;
                }
                ShortcutInfo build2 = new ShortcutInfo.Builder(getApplicationContext(), j).setShortLabel(str5).setLongLabel(str5).setRank(list.size()).setIcon(b(drawable2, R.drawable.cup_logo_placeholder)).setIntent(intent).build();
                build2.getClass();
                shortcutManager2.addDynamicShortcuts(a.c(build2));
                shortcutManager = shortcutManager2;
                List<ShortcutInfo> dynamicShortcuts42 = shortcutManager.getDynamicShortcuts();
                dynamicShortcuts42.getClass();
                Intent intent32 = new Intent(getApplicationContext(), (Class<?>) StartActivity.class);
                intent32.setAction(str4);
                intent32.putExtra(str3, "open_search");
                Icon createWithResource2 = Icon.createWithResource(getApplicationContext(), R.drawable.ic_search);
                createWithResource2.getClass();
                ShortcutInfo build3 = new ShortcutInfo.Builder(getApplicationContext(), str2).setShortLabel(getApplicationContext().getString(R.string.search)).setLongLabel(getApplicationContext().getString(R.string.search)).setIcon(b(createWithResource2.loadDrawable(getApplicationContext()), R.drawable.ic_search)).setRank(dynamicShortcuts42.size()).setIntent(intent32).build();
                build3.getClass();
                shortcutManager.addDynamicShortcuts(a.c(build3));
                return Unit.a;
            }
        }
        rfhVar = new rfh(this, sq3Var);
        Object obj2 = rfhVar.x;
        lu3 lu3Var2 = lu3.a;
        i3 = rfhVar.z;
        if (i3 != 0) {
        }
        b = ((wt9) obj2).b();
        if (b == null) {
        }
        ShortcutInfo build22 = new ShortcutInfo.Builder(getApplicationContext(), j).setShortLabel(str5).setLongLabel(str5).setRank(list.size()).setIcon(b(drawable2, R.drawable.cup_logo_placeholder)).setIntent(intent).build();
        build22.getClass();
        shortcutManager2.addDynamicShortcuts(a.c(build22));
        shortcutManager = shortcutManager2;
        List<ShortcutInfo> dynamicShortcuts422 = shortcutManager.getDynamicShortcuts();
        dynamicShortcuts422.getClass();
        Intent intent322 = new Intent(getApplicationContext(), (Class<?>) StartActivity.class);
        intent322.setAction(str4);
        intent322.putExtra(str3, "open_search");
        Icon createWithResource22 = Icon.createWithResource(getApplicationContext(), R.drawable.ic_search);
        createWithResource22.getClass();
        ShortcutInfo build32 = new ShortcutInfo.Builder(getApplicationContext(), str2).setShortLabel(getApplicationContext().getString(R.string.search)).setLongLabel(getApplicationContext().getString(R.string.search)).setIcon(b(createWithResource22.loadDrawable(getApplicationContext()), R.drawable.ic_search)).setRank(dynamicShortcuts422.size()).setIntent(intent322).build();
        build32.getClass();
        shortcutManager.addDynamicShortcuts(a.c(build32));
        return Unit.a;
    }

    public final Icon b(Drawable drawable, int i) {
        if (!(drawable instanceof BitmapDrawable)) {
            Icon createWithResource = Icon.createWithResource(getApplicationContext(), i);
            createWithResource.getClass();
            return createWithResource;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(-1);
        canvas.drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
        Icon createWithBitmap = Icon.createWithBitmap(createBitmap);
        createWithBitmap.getClass();
        return createWithBitmap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b7, code lost:
    
        if (a(1, 17, r0, "Premier League") == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00eb, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        if (a(36, 8, r0, "Primera Division") == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        if (a(33, 23, r0, "Serie A") == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e9, code lost:
    
        if (a(r9, r2, r0, r3) == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(rq3 rq3Var) {
        sfh sfhVar;
        int i;
        if (rq3Var instanceof sfh) {
            sfhVar = (sfh) rq3Var;
            int i2 = sfhVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sfhVar.t = i2 - Integer.MIN_VALUE;
                Object obj = sfhVar.r;
                Object obj2 = lu3.a;
                i = sfhVar.t;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            sfhVar.t = 3;
                        } else if (i == 3) {
                            y6a.M(obj);
                            sfhVar.t = 4;
                        } else if (i != 4) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    y6a.M(obj);
                } else {
                    y6a.M(obj);
                    String e = getInputData().e("ACTION");
                    if (e != null) {
                        int hashCode = e.hashCode();
                        if (hashCode != -508005273) {
                            if (hashCode != 353523039) {
                                if (hashCode == 1226082613 && e.equals("LOCALE_CHANGE")) {
                                    Context applicationContext = getApplicationContext();
                                    applicationContext.getClass();
                                    ShortcutManager shortcutManager = (ShortcutManager) applicationContext.getSystemService(ShortcutManager.class);
                                    if (shortcutManager != null) {
                                        shortcutManager.removeAllDynamicShortcuts();
                                    }
                                }
                            } else if (e.equals("FIRST_INIT")) {
                                sfhVar.t = 2;
                            }
                        } else if (e.equals("ADD_TOURNAMENT")) {
                            int a = getInputData().a("TOURNAMENT_ID", 0);
                            int a2 = getInputData().a("TOURNAMENT_UNIQUE_ID", 0);
                            String e2 = getInputData().e("TOURNAMENT_NAME");
                            if (a2 > 0) {
                                sfhVar.t = 1;
                            }
                        }
                    }
                }
                return jdb.a();
            }
        }
        sfhVar = new sfh(this, (sq3) rq3Var);
        Object obj3 = sfhVar.r;
        Object obj22 = lu3.a;
        i = sfhVar.t;
        if (i == 0) {
        }
        return jdb.a();
    }
}
