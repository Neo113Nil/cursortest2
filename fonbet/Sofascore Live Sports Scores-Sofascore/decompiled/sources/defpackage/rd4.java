package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.facebook.c0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.R;
import com.sofascore.results.league.LeagueActivity;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class rd4 implements o {
    public boolean a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public rd4(LeagueActivity leagueActivity, String str, Season season, List list, dr6 dr6Var) {
        leagueActivity.getClass();
        this.b = str;
        this.c = season;
        this.d = list;
        this.f = new ArrayList();
        this.g = new HashMap();
        int i = 1;
        this.a = true;
        View inflate = LayoutInflater.from(leagueActivity).inflate(R.layout.league_season_select_dialog_layout, (ViewGroup) null, false);
        int i2 = R.id.season_select_title;
        TextView textView = (TextView) nq8.B(R.id.season_select_title, inflate);
        if (textView != null) {
            i2 = R.id.season_spinner;
            Spinner spinner = (Spinner) nq8.B(R.id.season_spinner, inflate);
            if (spinner != null) {
                i2 = R.id.year_spinner;
                Spinner spinner2 = (Spinner) nq8.B(R.id.year_spinner, inflate);
                if (spinner2 != null) {
                    LinearLayout linearLayout = (LinearLayout) inflate;
                    this.e = new ez0(linearLayout, textView, spinner, spinner2, 21);
                    gph gphVar = new gph(leagueActivity, R.style.RedesignDialog);
                    gphVar.setView(linearLayout);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    String str2 = "";
                    while (it.hasNext()) {
                        Season season2 = (Season) it.next();
                        if (Intrinsics.c(str2, "")) {
                            ((ArrayList) this.f).add(season2.getYear());
                            str2 = season2.getYear();
                        } else if (!Intrinsics.c(str2, season2.getYear())) {
                            ((ArrayList) this.f).add(season2.getYear());
                            ((HashMap) this.g).put(str2, new ArrayList(arrayList));
                            arrayList.clear();
                            str2 = season2.getYear();
                        }
                        arrayList.add(season2);
                    }
                    ((HashMap) this.g).put(str2, new ArrayList(arrayList));
                    ((TextView) ((ez0) this.e).c).setText((String) this.b);
                    ArrayList arrayList2 = (ArrayList) this.f;
                    arrayList2.getClass();
                    lza lzaVar = new lza(leagueActivity, arrayList2);
                    ((Spinner) ((ez0) this.e).e).setAdapter((SpinnerAdapter) lzaVar);
                    int size = ((ArrayList) this.f).size();
                    for (int i3 = 0; i3 < size; i3++) {
                        if (Intrinsics.c(((ArrayList) this.f).get(i3), ((Season) this.c).getYear())) {
                            ((Spinner) ((ez0) this.e).e).setSelection(i3);
                        }
                    }
                    Object obj = ((HashMap) this.g).get(CollectionsKt.Y((ArrayList) this.f));
                    List list2 = (List) (obj == null ? km5.a : obj);
                    ((Spinner) ((ez0) this.e).d).setVisibility(list2.size() <= 1 ? 8 : 0);
                    lza lzaVar2 = new lza(leagueActivity, list2);
                    ((Spinner) ((ez0) this.e).d).setAdapter((SpinnerAdapter) lzaVar2);
                    Spinner spinner3 = (Spinner) ((ez0) this.e).e;
                    int i4 = 10;
                    spinner3.setOnItemSelectedListener(new vu1(spinner3, new c61(i4, lzaVar, this, lzaVar2), i));
                    Spinner spinner4 = (Spinner) ((ez0) this.e).d;
                    spinner4.setOnItemSelectedListener(new vu1(spinner4, new jw5(lzaVar2, i4), i));
                    gphVar.setButton(-1, leagueActivity.getString(R.string.ok), new h0(i4, dr6Var, this));
                    gphVar.setButton(-2, leagueActivity.getString(R.string.cancel), new pr9(gphVar, 1));
                    gphVar.show();
                    return;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    public static String a(Rect rect) {
        StringBuilder sb = new StringBuilder();
        sb.append(rect.left);
        sb.append(',');
        sb.append(rect.top);
        sb.append(',');
        sb.append(rect.width());
        sb.append(',');
        sb.append(rect.height());
        return sb.toString();
    }

    public static String f(Rect rect) {
        StringBuilder sb = new StringBuilder();
        sb.append(rect.width());
        sb.append(',');
        sb.append(rect.height());
        return sb.toString();
    }

    public void b(x xVar, String str) {
        xVar.getClass();
        g("mraidbridge.notifyErrorEvent(" + JSONObject.quote(xVar.a) + ", " + JSONObject.quote(str) + ')');
    }

    public void d(b0 b0Var) {
        b0Var.getClass();
        StringBuilder sb = new StringBuilder("\n                mraidbridge.setScreenSize(");
        sb.append(f((Rect) b0Var.c));
        sb.append(");\n                mraidbridge.setMaxSize(");
        sb.append(f((Rect) b0Var.e));
        sb.append(");\n                mraidbridge.setCurrentPosition(");
        Rect rect = (Rect) b0Var.g;
        sb.append(a(rect));
        sb.append(");\n                mraidbridge.setDefaultPosition(");
        sb.append(a((Rect) b0Var.i));
        sb.append(")\n            ");
        g(sb.toString());
        g("mraidbridge.notifySizeChangeEvent(" + f(rect) + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public void destroy() {
        ((h0) this.e).destroy();
    }

    public void e(Object obj) {
        if (this.a) {
            return;
        }
        ((CopyOnWriteArraySet) this.e).add(new tdb(obj));
    }

    public void g(String str) {
        ((h0) this.e).loadUrl("javascript:".concat(str));
    }

    public void h() {
        yqi yqiVar = (yqi) this.c;
        ArrayDeque arrayDeque = (ArrayDeque) this.f;
        ArrayDeque arrayDeque2 = (ArrayDeque) this.g;
        if (arrayDeque2.isEmpty()) {
            return;
        }
        Handler handler = yqiVar.a;
        Handler handler2 = yqiVar.a;
        if (!handler.hasMessages(0)) {
            wqi b = yqi.b();
            Message obtainMessage = handler2.obtainMessage(0);
            b.a = obtainMessage;
            obtainMessage.getClass();
            handler2.sendMessageAtFrontOfQueue(obtainMessage);
            b.a();
        }
        boolean isEmpty = arrayDeque.isEmpty();
        arrayDeque.addAll(arrayDeque2);
        arrayDeque2.clear();
        if (isEmpty) {
            while (!arrayDeque.isEmpty()) {
                ((Runnable) arrayDeque.peekFirst()).run();
                arrayDeque.removeFirst();
            }
        }
    }

    public synchronized boolean i() {
        boolean z;
        Boolean bool = (Boolean) this.g;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            try {
                z = ((r38) this.c).g();
            } catch (IllegalStateException unused) {
                z = false;
            }
        }
        return z;
    }

    public void j(int i, pdb pdbVar) {
        ((ArrayDeque) this.g).add(new uu1(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.e), i, pdbVar, 7));
    }

    public void k(int i, pdb pdbVar) {
        j(i, pdbVar);
        h();
    }

    public rd4(Context context, ku3 ku3Var, boolean z) {
        context.getClass();
        this.a = z;
        hs4 hs4Var = z45.a;
        this.b = s9a.F(ku3Var, rob.a);
        aeh b = beh.b(0, 0, null, 7);
        this.c = b;
        this.d = b;
        h0 h0Var = new h0(context, new c0(this, 9));
        this.e = h0Var;
        this.f = h0Var;
        this.g = h0Var.getUnrecoverableError();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rd4(r38 r38Var) {
        Boolean bool;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Object obj = new Object();
        this.d = obj;
        this.e = new TaskCompletionSource();
        this.a = false;
        this.f = new TaskCompletionSource();
        r38Var.a();
        Context context = r38Var.a;
        this.c = r38Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.b = sharedPreferences;
        Boolean valueOf = sharedPreferences.contains("firebase_crashlytics_collection_enabled") ? Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true)) : null;
        if (valueOf == null) {
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                bool = Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
                valueOf = bool != null ? null : Boolean.valueOf(Boolean.TRUE.equals(bool));
            }
            bool = null;
            if (bool != null) {
            }
        }
        this.g = valueOf;
        synchronized (obj) {
            try {
                if (i()) {
                    ((TaskCompletionSource) this.e).trySetResult(null);
                    this.a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public rd4(Looper looper, sqi sqiVar, rdb rdbVar) {
        this(new CopyOnWriteArraySet(), looper, sqiVar, rdbVar);
    }

    public rd4(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, sqi sqiVar, rdb rdbVar) {
        this.b = sqiVar;
        this.e = copyOnWriteArraySet;
        this.d = rdbVar;
        this.f = new ArrayDeque();
        this.g = new ArrayDeque();
        this.c = sqiVar.a(looper, new odb(this, 1));
    }

    public rd4(Context context) {
        this.b = context;
        this.c = jn0.f;
    }
}
