package defpackage;

import android.R;
import android.app.Notification;
import android.app.RemoteInput;
import android.content.ContentValues;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.SparseArray;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.widget.RemoteViews;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.viewpager2.widget.ViewPager2;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.internal.d;
import com.google.android.play.core.hsdp.service.HsdpShimActivity;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.ironsource.C4427z5;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.security.Key;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReferenceArray;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ujg implements mf2, kv0, ddc, dc5, pme, tti, qmk, eg9 {
    public static ujg f;
    public static final String[] g = {"id", U3.i.W, TtmlNode.TAG_METADATA};
    public static ujg h;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public ujg(efd efdVar) {
        String str;
        String str2;
        Bundle[] bundleArr;
        String str3;
        int i;
        int i2;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        int i3;
        this.a = 14;
        this.e = new Bundle();
        this.d = efdVar;
        Context context = efdVar.a;
        ArrayList arrayList3 = efdVar.x;
        ArrayList arrayList4 = efdVar.c;
        ArrayList arrayList5 = efdVar.d;
        this.b = context;
        Notification.Builder builder = new Notification.Builder(context, efdVar.s);
        this.c = builder;
        Notification notification = efdVar.v;
        Context context2 = null;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(efdVar.e).setContentText(efdVar.f).setContentInfo(null).setContentIntent(efdVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(efdVar.i).setProgress(0, 0, false);
        IconCompat iconCompat = efdVar.h;
        builder.setLargeIcon(iconCompat == null ? null : n9e.L(iconCompat, context));
        builder.setSubText(null).setUsesChronometer(false).setPriority(efdVar.j);
        Iterator it2 = efdVar.b.iterator();
        while (true) {
            str = "android.support.allowGeneratedReplies";
            str2 = "";
            if (!it2.hasNext()) {
                break;
            }
            wed wedVar = (wed) it2.next();
            IconCompat iconCompat2 = wedVar.b;
            if (iconCompat2 == null && (i3 = wedVar.j) != 0) {
                iconCompat2 = IconCompat.a(i3, "");
                wedVar.b = iconCompat2;
            }
            int i4 = wedVar.f;
            boolean z = wedVar.d;
            Bundle bundle = wedVar.a;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? n9e.L(iconCompat2, context2) : context2, wedVar.k, wedVar.l);
            sxf[] sxfVarArr = wedVar.c;
            if (sxfVarArr != null) {
                int length = sxfVarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                it = it2;
                arrayList2 = arrayList4;
                int i5 = 0;
                while (i5 < sxfVarArr.length) {
                    sxf sxfVar = sxfVarArr[i5];
                    int i6 = i5;
                    sxf[] sxfVarArr2 = sxfVarArr;
                    RemoteInput.Builder addExtras = new RemoteInput.Builder(sxfVar.a).setLabel(sxfVar.b).setChoices(sxfVar.c).setAllowFreeFormInput(sxfVar.d).addExtras(sxfVar.f);
                    if (sxfVar.g != null) {
                        for (Iterator it3 = r10.iterator(); it3.hasNext(); it3 = it3) {
                            addExtras.setAllowDataType((String) it3.next(), true);
                            remoteInputArr = remoteInputArr;
                        }
                    }
                    RemoteInput[] remoteInputArr2 = remoteInputArr;
                    if (Build.VERSION.SDK_INT >= 29) {
                        eq3.Q(addExtras, sxfVar.e);
                    }
                    remoteInputArr2[i6] = addExtras.build();
                    i5 = i6 + 1;
                    sxfVarArr = sxfVarArr2;
                    remoteInputArr = remoteInputArr2;
                }
                RemoteInput[] remoteInputArr3 = remoteInputArr;
                for (int i7 = 0; i7 < length; i7++) {
                    builder2.addRemoteInput(remoteInputArr3[i7]);
                }
            } else {
                it = it2;
                arrayList2 = arrayList4;
            }
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            builder2.setAllowGeneratedReplies(z);
            bundle2.putInt("android.support.action.semanticAction", i4);
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 28) {
                c90.S(builder2, i4);
            }
            if (i8 >= 29) {
                eq3.P(builder2, wedVar.g);
            }
            if (i8 >= 31) {
                qz.v(builder2, wedVar.m);
            }
            if (i8 >= 37) {
                ifd.a(builder2, wedVar.h);
                ifd.b(builder2, wedVar.i);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", wedVar.e);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.c).addAction(builder2.build());
            it2 = it;
            arrayList4 = arrayList2;
            context2 = null;
        }
        ArrayList arrayList6 = arrayList4;
        Bundle bundle3 = efdVar.n;
        if (bundle3 != null) {
            ((Bundle) this.e).putAll(bundle3);
        }
        ((Notification.Builder) this.c).setShowWhen(efdVar.k);
        ((Notification.Builder) this.c).setLocalOnly(efdVar.m);
        ((Notification.Builder) this.c).setGroup(null);
        ((Notification.Builder) this.c).setSortKey(null);
        ((Notification.Builder) this.c).setGroupSummary(false);
        ((Notification.Builder) this.c).setCategory(null);
        ((Notification.Builder) this.c).setColor(efdVar.o);
        ((Notification.Builder) this.c).setVisibility(efdVar.p);
        ((Notification.Builder) this.c).setPublicVersion(null);
        ((Notification.Builder) this.c).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList6 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList6.size());
                Iterator it4 = arrayList6.iterator();
                while (it4.hasNext()) {
                    nfe nfeVar = (nfe) it4.next();
                    CharSequence charSequence = nfeVar.a;
                    String str4 = nfeVar.c;
                    if (str4 == null) {
                        str4 = charSequence != null ? "name:" + ((Object) charSequence) : "";
                    }
                    arrayList.add(str4);
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    gh0 gh0Var = new gh0(arrayList3.size() + arrayList.size());
                    gh0Var.addAll(arrayList);
                    gh0Var.addAll(arrayList3);
                    arrayList3 = new ArrayList(gh0Var);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                ((Notification.Builder) this.c).addPerson((String) it5.next());
            }
        }
        if (arrayList5.size() > 0) {
            Bundle bundle4 = efdVar.n;
            if (bundle4 == null) {
                bundle4 = new Bundle();
                efdVar.n = bundle4;
            }
            Bundle bundle5 = bundle4.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i9 = 0;
            while (i9 < arrayList5.size()) {
                String num = Integer.toString(i9);
                wed wedVar2 = (wed) arrayList5.get(i9);
                Bundle bundle8 = new Bundle();
                IconCompat iconCompat3 = wedVar2.b;
                if (iconCompat3 == null && (i2 = wedVar2.j) != 0) {
                    iconCompat3 = IconCompat.a(i2, str2);
                    wedVar2.b = iconCompat3;
                }
                Bundle bundle9 = wedVar2.a;
                ArrayList arrayList7 = arrayList5;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.b() : 0);
                bundle8.putCharSequence("title", wedVar2.k);
                bundle8.putParcelable("actionIntent", wedVar2.l);
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean(str, wedVar2.d);
                bundle8.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, bundle10);
                sxf[] sxfVarArr3 = wedVar2.c;
                if (sxfVarArr3 == null) {
                    str3 = str;
                    i = i9;
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[sxfVarArr3.length];
                    str3 = str;
                    i = i9;
                    int i10 = 0;
                    while (i10 < sxfVarArr3.length) {
                        sxf sxfVar2 = sxfVarArr3[i10];
                        sxf[] sxfVarArr4 = sxfVarArr3;
                        Bundle bundle11 = new Bundle();
                        int i11 = i10;
                        String str5 = str2;
                        bundle11.putString("resultKey", sxfVar2.a);
                        bundle11.putCharSequence("label", sxfVar2.b);
                        bundle11.putCharSequenceArray("choices", sxfVar2.c);
                        bundle11.putBoolean("allowFreeFormInput", sxfVar2.d);
                        bundle11.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, sxfVar2.f);
                        Set set = sxfVar2.g;
                        if (set != null && !set.isEmpty()) {
                            ArrayList<String> arrayList8 = new ArrayList<>(set.size());
                            Iterator it6 = set.iterator();
                            while (it6.hasNext()) {
                                arrayList8.add((String) it6.next());
                            }
                            bundle11.putStringArrayList("allowedDataTypes", arrayList8);
                        }
                        bundleArr[i11] = bundle11;
                        i10 = i11 + 1;
                        sxfVarArr3 = sxfVarArr4;
                        str2 = str5;
                    }
                }
                String str6 = str2;
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", wedVar2.e);
                bundle8.putInt("semanticAction", wedVar2.f);
                bundle7.putBundle(num, bundle8);
                i9 = i + 1;
                arrayList5 = arrayList7;
                str = str3;
                str2 = str6;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            Bundle bundle12 = efdVar.n;
            if (bundle12 == null) {
                bundle12 = new Bundle();
                efdVar.n = bundle12;
            }
            bundle12.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.e).putBundle("android.car.EXTENSIONS", bundle6);
        }
        ((Notification.Builder) this.c).setExtras(efdVar.n);
        ((Notification.Builder) this.c).setRemoteInputHistory(null);
        RemoteViews remoteViews = efdVar.q;
        if (remoteViews != null) {
            ((Notification.Builder) this.c).setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = efdVar.r;
        if (remoteViews2 != null) {
            ((Notification.Builder) this.c).setCustomBigContentView(remoteViews2);
        }
        ((Notification.Builder) this.c).setBadgeIconType(0);
        ((Notification.Builder) this.c).setSettingsText(null);
        ((Notification.Builder) this.c).setShortcutId(null);
        ((Notification.Builder) this.c).setTimeoutAfter(efdVar.t);
        ((Notification.Builder) this.c).setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(efdVar.s)) {
            ((Notification.Builder) this.c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Iterator it7 = arrayList6.iterator();
            while (it7.hasNext()) {
                nfe nfeVar2 = (nfe) it7.next();
                Notification.Builder builder3 = (Notification.Builder) this.c;
                nfeVar2.getClass();
                c90.b(builder3, c90.V(nfeVar2));
            }
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            eq3.L((Notification.Builder) this.c, efdVar.u);
            eq3.O((Notification.Builder) this.c);
        }
        if (i12 >= 36) {
            aa.j((Notification.Builder) this.c);
        }
        if (efdVar.w) {
            ((efd) this.d).getClass();
            ((Notification.Builder) this.c).setVibrate(null);
            ((Notification.Builder) this.c).setSound(null);
            int i13 = notification.defaults & (-4);
            notification.defaults = i13;
            ((Notification.Builder) this.c).setDefaults(i13);
            ((efd) this.d).getClass();
            if (TextUtils.isEmpty(null)) {
                ((Notification.Builder) this.c).setGroup(NotificationCompat.GROUP_KEY_SILENT);
            }
            ((Notification.Builder) this.c).setGroupAlertBehavior(1);
        }
    }

    public static ujg O() {
        ujg ujgVar = h;
        if (ujgVar != null) {
            return ujgVar;
        }
        ujg ujgVar2 = new ujg(21);
        h = ujgVar2;
        return ujgVar2;
    }

    public static synchronized ujg P(Context context) {
        ujg ujgVar;
        synchronized (ujg.class) {
            if (context != null) {
                try {
                    ujg ujgVar2 = f;
                    if (ujgVar2 == null) {
                        jod V = hkg.V();
                        ujg ujgVar3 = new ujg(0);
                        ujgVar3.d = V;
                        ujgVar3.e = new ArrayList();
                        ujgVar3.F(context);
                        f = ujgVar3;
                    } else if (((Context) ujgVar2.b) == null) {
                        ujgVar2.F(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ujgVar = f;
            if (ujgVar == null) {
                throw new IllegalStateException("Pixel manager is null and was not properly initialized");
            }
        }
        return ujgVar;
    }

    public static void Z(long j, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            hashMap.remove(arrayList.get(i));
        }
    }

    @Override // defpackage.tti
    public void A(nr9 nr9Var) {
        TextView textView = (TextView) this.d;
        Resources resources = textView.getContext().getResources();
        resources.getClass();
        haa.M(textView, rfo.t(nr9Var, resources), (ua5) this.e);
    }

    public void B(SQLiteDatabase sQLiteDatabase, lf2 lf2Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        vng.v0(lf2Var.e, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(lf2Var.a));
        contentValues.put(U3.i.W, lf2Var.b);
        contentValues.put(TtmlNode.TAG_METADATA, byteArray);
        String str = (String) this.e;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }

    public void C(String str, String str2) {
        this.e = ((String) this.e) + (((String) this.e).length() == 0 ? "?" : U3.j.c) + str + C4427z5.U + str2;
    }

    public ArrayList E(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.b;
        Z(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.c;
        Z(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            o71 o71Var = (o71) list.get(i);
            if (!hashMap.containsKey(o71Var.b) && !hashMap2.containsKey(Integer.valueOf(o71Var.c))) {
                arrayList.add(o71Var);
            }
        }
        return arrayList;
    }

    public synchronized void F(Context context) {
        d dVar;
        Context applicationContext = context.getApplicationContext();
        Context context2 = (Context) this.b;
        if (applicationContext == context2) {
            return;
        }
        if (context2 != null && (dVar = (d) this.c) != null) {
            try {
                context2.unregisterReceiver(dVar);
                fjg c = fjg.c();
                Objects.toString((Context) this.b);
                c.f(1);
            } catch (IllegalArgumentException unused) {
            }
        }
        this.b = context.getApplicationContext();
        if (((d) this.c) == null) {
            this.c = new d(this, 8);
        }
        if (((Context) this.b) != null) {
            ((Context) this.b).registerReceiver((d) this.c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            fjg c2 = fjg.c();
            Objects.toString((Context) this.b);
            c2.f(1);
        }
    }

    public void G(String str) {
        Objects.requireNonNull(str, "baseUrl == null");
        il9 il9Var = new il9(0);
        il9Var.h(null, str);
        jl9 c = il9Var.c();
        if ("".equals(c.f.get(r0.size() - 1))) {
            this.b = c;
        } else {
            is8.c(c, "baseUrl must end in /: ");
        }
    }

    public ox9 H() {
        ArrayList arrayList = (ArrayList) this.e;
        if (((jl9) this.b) == null) {
            a70.r("Base URL required.");
            return null;
        }
        jod jodVar = (jod) this.d;
        if (jodVar == null) {
            jodVar = new jod();
        }
        jod jodVar2 = jodVar;
        m10 m10Var = hie.a;
        p4h p4hVar = hie.c;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.c);
        List o = p4hVar.o(m10Var);
        arrayList2.addAll(o);
        List p = p4hVar.p();
        ArrayList arrayList3 = new ArrayList(arrayList.size() + 1 + p.size());
        arrayList3.add(new u62(0));
        arrayList3.addAll(arrayList);
        arrayList3.addAll(p);
        jl9 jl9Var = (jl9) this.b;
        List unmodifiableList = Collections.unmodifiableList(arrayList3);
        List unmodifiableList2 = Collections.unmodifiableList(arrayList2);
        o.size();
        return new ox9(jodVar2, jl9Var, unmodifiableList, unmodifiableList2, m10Var);
    }

    public void I(tjg tjgVar) {
        String str = tjgVar.a;
        long j = tjgVar.b;
        if (j == -1 || j > System.currentTimeMillis()) {
            try {
                pzf pzfVar = new pzf();
                pzfVar.f(str);
                qzf qzfVar = new qzf(pzfVar);
                jod jodVar = (jod) this.d;
                jodVar.getClass();
                FirebasePerfOkHttpClient.enqueue(new pof(jodVar, qzfVar), new ou4(this, j, str, tjgVar));
            } catch (IllegalArgumentException unused) {
                fjg.c().f(1);
            }
        }
    }

    public synchronized void J(String str) {
        if (str == null) {
            return;
        }
        try {
            String replace = str.replace(U3.j.d, "%5B").replace(U3.j.e, "%5D");
            if (((Context) this.b) == null) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() + 86400000;
            tjg tjgVar = new tjg();
            tjgVar.a = replace;
            tjgVar.b = currentTimeMillis;
            if (Q()) {
                Y();
                I(tjgVar);
            } else {
                synchronized (this) {
                    ((ArrayList) this.e).add(tjgVar);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean K(jmh jmhVar, int i) {
        j71 j71Var = (j71) jmhVar.a.get();
        if (j71Var == null) {
            return false;
        }
        ((Handler) this.c).removeCallbacksAndMessages(jmhVar);
        Handler handler = n71.A;
        handler.sendMessage(handler.obtainMessage(1, i, 0, j71Var.a));
        return true;
    }

    public void L(rc rcVar) {
        e1g e1gVar;
        synchronized (this) {
            ((HashMap) this.c).remove(rcVar.a);
            if (rcVar.b && (e1gVar = rcVar.c) != null) {
                ((sn5) this.e).d(rcVar.a, new lo5(e1gVar, true, false, rcVar.a, (sn5) this.e));
            }
        }
    }

    public void M(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            cp4.h("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((fhh) this.c).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                M(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r8 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (r8 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object N(sq3 sq3Var) {
        af4 af4Var;
        int i;
        od4 od4Var;
        qf4 qf4Var = (qf4) this.e;
        if (sq3Var instanceof af4) {
            af4Var = (af4) sq3Var;
            int i2 = af4Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                af4Var.t = i2 - Integer.MIN_VALUE;
                Object obj = af4Var.r;
                lu3 lu3Var = lu3.a;
                i = af4Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    List list = (List) this.d;
                    if (list == null || list.isEmpty()) {
                        af4Var.t = 1;
                        obj = qf4Var.h(false, af4Var);
                    } else {
                        h7a c = qf4Var.c();
                        df4 df4Var = new df4(qf4Var, this, null);
                        af4Var.t = 2;
                        obj = c.e(df4Var, af4Var);
                    }
                    return lu3Var;
                }
                if (i == 1) {
                    y6a.M(obj);
                    od4Var = (od4) obj;
                } else {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    od4Var = (od4) obj;
                }
                qf4Var.h.B(od4Var);
                return Unit.a;
            }
        }
        af4Var = new af4(this, sq3Var);
        Object obj2 = af4Var.r;
        lu3 lu3Var2 = lu3.a;
        i = af4Var.t;
        if (i != 0) {
        }
        qf4Var.h.B(od4Var);
        return Unit.a;
    }

    public boolean Q() {
        Boolean bool;
        boolean z;
        Context context = (Context) this.b;
        context.getClass();
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        try {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities != null) {
                    if (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(0) && !networkCapabilities.hasTransport(3)) {
                        z = false;
                        bool = Boolean.valueOf(z);
                    }
                    z = true;
                    bool = Boolean.valueOf(z);
                } else {
                    bool = null;
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    public void R(SQLiteDatabase sQLiteDatabase) {
        String str = (String) this.d;
        str.getClass();
        jok.b(sQLiteDatabase, 1, str);
        String str2 = (String) this.e;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + ((String) this.e) + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    public boolean S(j71 j71Var) {
        jmh jmhVar = (jmh) this.d;
        return (jmhVar == null || j71Var == null || jmhVar.a.get() != j71Var) ? false : true;
    }

    public boolean T(int i, rcc rccVar) {
        tdc tdcVar = (tdc) this.e;
        rdc rdcVar = (rdc) this.b;
        rcc rccVar2 = null;
        if (rccVar != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= rdcVar.c.size()) {
                    break;
                }
                if (((rcc) rdcVar.c.get(i2)).d == rccVar.d) {
                    rccVar2 = rccVar.b(Pair.create(rdcVar.b, rccVar.a));
                    break;
                }
                i2++;
            }
            if (rccVar2 == null) {
                return false;
            }
        }
        int i3 = i + rdcVar.d;
        bc5 bc5Var = (bc5) this.c;
        if (bc5Var.a != i3 || !lik.a(bc5Var.b, rccVar2)) {
            this.c = new bc5(((bc5) tdcVar.j).c, i3, rccVar2);
        }
        bc5 bc5Var2 = (bc5) this.d;
        if (bc5Var2.a == i3 && lik.a(bc5Var2.b, rccVar2)) {
            return true;
        }
        this.d = new bc5(((bc5) tdcVar.k).c, i3, rccVar2);
        return true;
    }

    public boolean U(int i, rcc rccVar) {
        rcc rccVar2;
        Object obj = this.b;
        eg3 eg3Var = (eg3) this.e;
        if (rccVar != null) {
            rccVar2 = eg3Var.r(obj, rccVar);
            if (rccVar2 == null) {
                return false;
            }
        } else {
            rccVar2 = null;
        }
        int t = eg3Var.t(obj, i);
        bc5 bc5Var = (bc5) this.c;
        if (bc5Var.a != t || !lik.a(bc5Var.b, rccVar2)) {
            this.c = new bc5(eg3Var.c.c, t, rccVar2);
        }
        bc5 bc5Var2 = (bc5) this.d;
        if (bc5Var2.a == t && lik.a(bc5Var2.b, rccVar2)) {
            return true;
        }
        this.d = new bc5(eg3Var.d.c, t, rccVar2);
        return true;
    }

    public l6c V(l6c l6cVar) {
        eg3 eg3Var = (eg3) this.e;
        Object obj = this.b;
        long j = l6cVar.d;
        long s = eg3Var.s(obj, j);
        long j2 = l6cVar.e;
        long s2 = eg3Var.s(obj, j2);
        return (s == j && s2 == j2) ? l6cVar : new l6c(l6cVar.a, l6cVar.b, l6cVar.c, s, s2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0057 A[Catch: IOException -> 0x0047, TryCatch #0 {IOException -> 0x0047, blocks: (B:16:0x0022, B:18:0x0027, B:22:0x0031, B:24:0x003b, B:26:0x0043, B:31:0x0057, B:33:0x0061, B:37:0x0065, B:38:0x006a, B:39:0x008a, B:41:0x004a, B:43:0x008d), top: B:15:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065 A[Catch: IOException -> 0x0047, TryCatch #0 {IOException -> 0x0047, blocks: (B:16:0x0022, B:18:0x0027, B:22:0x0031, B:24:0x003b, B:26:0x0043, B:31:0x0057, B:33:0x0061, B:37:0x0065, B:38:0x006a, B:39:0x008a, B:41:0x004a, B:43:0x008d), top: B:15:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a A[Catch: IOException -> 0x0047, TryCatch #0 {IOException -> 0x0047, blocks: (B:16:0x0022, B:18:0x0027, B:22:0x0031, B:24:0x003b, B:26:0x0043, B:31:0x0057, B:33:0x0061, B:37:0x0065, B:38:0x006a, B:39:0x008a, B:41:0x004a, B:43:0x008d), top: B:15:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MessageLite W(InputStream inputStream) {
        byte[] bArr;
        int i;
        aff affVar = (aff) this.e;
        if ((inputStream instanceof zef) && ((zef) inputStream).b == affVar.a) {
            try {
                MessageLite messageLite = ((zef) inputStream).a;
                if (messageLite != null) {
                    return messageLite;
                }
                throw new IllegalStateException("message not available");
            } catch (IllegalStateException unused) {
            }
        }
        CodedInputStream codedInputStream = null;
        try {
            if (inputStream instanceof zja) {
                int available = inputStream.available();
                if (available > 0 && available <= 4194304) {
                    ThreadLocal threadLocal = aff.c;
                    Reference reference = (Reference) threadLocal.get();
                    if (reference != null) {
                        bArr = (byte[]) reference.get();
                        if (bArr != null) {
                            if (bArr.length < available) {
                            }
                            i = available;
                            while (i > 0) {
                                int read = inputStream.read(bArr, available - i, i);
                                if (read == -1) {
                                    break;
                                }
                                i -= read;
                            }
                            if (i == 0) {
                                throw new RuntimeException("size inaccurate: " + available + " != " + (available - i));
                            }
                            codedInputStream = CodedInputStream.newInstance(bArr, 0, available);
                        }
                    }
                    bArr = new byte[available];
                    threadLocal.set(new WeakReference(bArr));
                    i = available;
                    while (i > 0) {
                    }
                    if (i == 0) {
                    }
                } else if (available == 0) {
                    return affVar.b;
                }
            }
            if (codedInputStream == null) {
                codedInputStream = CodedInputStream.newInstance(inputStream);
            }
            codedInputStream.setSizeLimit(Integer.MAX_VALUE);
            try {
                MessageLite messageLite2 = (MessageLite) affVar.a.parseFrom(codedInputStream, bff.a);
                try {
                    codedInputStream.checkLastTagWas(0);
                    return messageLite2;
                } catch (InvalidProtocolBufferException e) {
                    e.setUnfinishedMessage(messageLite2);
                    throw e;
                }
            } catch (InvalidProtocolBufferException e2) {
                throw xei.l.h("Invalid protobuf byte sequence").g(e2).a();
            }
        } catch (IOException e3) {
            is8.h(e3);
            return null;
        }
    }

    public void X(j71 j71Var) {
        synchronized (this.b) {
            try {
                if (S(j71Var)) {
                    jmh jmhVar = (jmh) this.d;
                    if (!jmhVar.c) {
                        jmhVar.c = true;
                        ((Handler) this.c).removeCallbacksAndMessages(jmhVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void Y() {
        if (((Context) this.b) == null) {
            return;
        }
        while (Q()) {
            try {
                synchronized (this) {
                }
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        return;
        I((tjg) ((ArrayList) this.e).remove(0));
    }

    @Override // defpackage.ddc
    public void a(int i, rcc rccVar, kfb kfbVar, l6c l6cVar) {
        switch (this.a) {
            case 7:
                if (U(i, rccVar)) {
                    ((bc5) this.c).c(kfbVar, V(l6cVar));
                    break;
                }
                break;
            default:
                if (T(i, rccVar)) {
                    ((bc5) this.c).c(kfbVar, l6cVar);
                    break;
                }
                break;
        }
    }

    public void a0(j71 j71Var) {
        synchronized (this.b) {
            try {
                if (S(j71Var)) {
                    jmh jmhVar = (jmh) this.d;
                    if (jmhVar.c) {
                        jmhVar.c = false;
                        c0(jmhVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0058, code lost:
    
        if (r9.e(r1) == r2) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #1 {all -> 0x0067, blocks: (B:25:0x005b, B:27:0x0061, B:30:0x006c), top: B:24:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c A[Catch: all -> 0x0067, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0067, blocks: (B:25:0x005b, B:27:0x0061, B:30:0x006c), top: B:24:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r3v3, types: [h2d] */
    /* JADX WARN: Type inference failed for: r8v0, types: [ujg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b0(sq3 sq3Var) {
        z9g z9gVar;
        int i;
        j2d j2dVar;
        Throwable th;
        h2d h2dVar;
        qa3 qa3Var = (qa3) this.c;
        try {
            if (sq3Var instanceof z9g) {
                z9gVar = (z9g) sq3Var;
                int i2 = z9gVar.u;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    z9gVar.u = i2 - Integer.MIN_VALUE;
                    Object obj = z9gVar.s;
                    lu3 lu3Var = lu3.a;
                    i = z9gVar.u;
                    if (i != 0) {
                        y6a.M(obj);
                        if (qa3Var.t()) {
                            return Unit.a;
                        }
                        j2dVar = (j2d) this.b;
                        z9gVar.r = j2dVar;
                        z9gVar.u = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            h2dVar = z9gVar.r;
                            try {
                                y6a.M(obj);
                                Unit unit = Unit.a;
                                qa3Var.V(unit);
                                h2dVar.f(null);
                                return unit;
                            } catch (Throwable th2) {
                                th = th2;
                                h2dVar.f(null);
                                throw th;
                            }
                        }
                        ?? r3 = z9gVar.r;
                        y6a.M(obj);
                        j2dVar = r3;
                    }
                    if (!qa3Var.t()) {
                        Unit unit2 = Unit.a;
                        j2dVar.f(null);
                        return unit2;
                    }
                    z9gVar.r = j2dVar;
                    z9gVar.u = 2;
                    if (N(z9gVar) != lu3Var) {
                        h2dVar = j2dVar;
                        Unit unit3 = Unit.a;
                        qa3Var.V(unit3);
                        h2dVar.f(null);
                        return unit3;
                    }
                    return lu3Var;
                }
            }
            if (!qa3Var.t()) {
            }
        } catch (Throwable th3) {
            j2d j2dVar2 = j2dVar;
            th = th3;
            h2dVar = j2dVar2;
            h2dVar.f(null);
            throw th;
        }
        z9gVar = new z9g(this, sq3Var);
        Object obj2 = z9gVar.s;
        lu3 lu3Var2 = lu3.a;
        i = z9gVar.u;
        if (i != 0) {
        }
    }

    @Override // defpackage.ddc
    public void c(int i, rcc rccVar, kfb kfbVar, l6c l6cVar, IOException iOException, boolean z) {
        switch (this.a) {
            case 7:
                if (U(i, rccVar)) {
                    ((bc5) this.c).e(kfbVar, V(l6cVar), iOException, z);
                    break;
                }
                break;
            default:
                if (T(i, rccVar)) {
                    ((bc5) this.c).e(kfbVar, l6cVar, iOException, z);
                    break;
                }
                break;
        }
    }

    public void c0(jmh jmhVar) {
        Handler handler = (Handler) this.c;
        int i = jmhVar.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? TTAdConstant.STYLE_SIZE_RADIO_3_2 : 2750;
        }
        handler.removeCallbacksAndMessages(jmhVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, jmhVar), i);
    }

    @Override // defpackage.nmk
    public long d(j80 j80Var, j80 j80Var2, j80 j80Var3) {
        int b = j80Var.b();
        long j = 0;
        for (int i = 0; i < b; i++) {
            j = Math.max(j, ((k80) this.b).get(i).e(j80Var.a(i), j80Var2.a(i), j80Var3.a(i)));
        }
        return j;
    }

    public o71 d0(List list) {
        o71 o71Var;
        HashMap hashMap = (HashMap) this.d;
        ArrayList E = E(list);
        if (E.size() < 2) {
            return (o71) jca.F(E, null);
        }
        Collections.sort(E, new z(5));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((o71) E.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= E.size()) {
                break;
            }
            o71 o71Var2 = (o71) E.get(i3);
            if (i2 == o71Var2.c) {
                arrayList.add(new Pair(o71Var2.b, Integer.valueOf(o71Var2.d)));
                i3++;
            } else if (arrayList.size() == 1) {
                return (o71) E.get(0);
            }
        }
        o71 o71Var3 = (o71) hashMap.get(arrayList);
        if (o71Var3 != null) {
            return o71Var3;
        }
        List subList = E.subList(0, arrayList.size());
        int i4 = 0;
        for (int i5 = 0; i5 < subList.size(); i5++) {
            i4 += ((o71) subList.get(i5)).d;
        }
        int nextInt = ((Random) this.e).nextInt(i4);
        int i6 = 0;
        while (true) {
            if (i >= subList.size()) {
                o71Var = (o71) jca.H(subList);
                break;
            }
            o71Var = (o71) subList.get(i);
            i6 += o71Var.d;
            if (nextInt < i6) {
                break;
            }
            i++;
        }
        hashMap.put(arrayList, o71Var);
        return o71Var;
    }

    public Pair e(String str) {
        if (((u8f) this.c) == null) {
            return null;
        }
        SecretKey secretKey = (SecretKey) this.b;
        byte[] generateSeed = new SecureRandom().generateSeed(12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, secretKey, new GCMParameterSpec(128, generateSeed));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, cipher);
        cipherOutputStream.write(str.getBytes(C.UTF8_NAME));
        cipherOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return new Pair(Base64.encodeToString(generateSeed, 0), Base64.encodeToString(byteArray, 0));
    }

    public void e0() {
        jmh jmhVar = (jmh) this.e;
        if (jmhVar != null) {
            this.d = jmhVar;
            this.e = null;
            j71 j71Var = (j71) jmhVar.a.get();
            if (j71Var == null) {
                this.d = null;
            } else {
                Handler handler = n71.A;
                handler.sendMessage(handler.obtainMessage(0, j71Var.a));
            }
        }
    }

    @Override // defpackage.mf2
    public void f(lf2 lf2Var) {
        ((SparseArray) this.c).put(lf2Var.a, lf2Var);
    }

    public void f0() {
        int itemCount;
        cqa cqaVar = (cqa) this.c;
        by9 by9Var = (by9) this.b;
        ViewPager2 viewPager2 = (ViewPager2) this.e;
        int i = R.id.accessibilityActionPageLeft;
        bsk.n(R.id.accessibilityActionPageLeft, viewPager2);
        bsk.k(0, viewPager2);
        bsk.n(R.id.accessibilityActionPageRight, viewPager2);
        bsk.k(0, viewPager2);
        bsk.n(R.id.accessibilityActionPageUp, viewPager2);
        bsk.k(0, viewPager2);
        bsk.n(R.id.accessibilityActionPageDown, viewPager2);
        bsk.k(0, viewPager2);
        if (viewPager2.getAdapter() == null || (itemCount = viewPager2.getAdapter().getItemCount()) == 0 || !viewPager2.r) {
            return;
        }
        if (viewPager2.getOrientation() != 0) {
            if (viewPager2.d < itemCount - 1) {
                bsk.o(viewPager2, new x9(R.id.accessibilityActionPageDown, (String) null), by9Var);
            }
            if (viewPager2.d > 0) {
                bsk.o(viewPager2, new x9(R.id.accessibilityActionPageUp, (String) null), cqaVar);
                return;
            }
            return;
        }
        boolean z = viewPager2.g.getLayoutDirection() == 1;
        int i2 = z ? 16908360 : 16908361;
        if (z) {
            i = 16908361;
        }
        if (viewPager2.d < itemCount - 1) {
            bsk.o(viewPager2, new x9(i2, (String) null), by9Var);
        }
        if (viewPager2.d > 0) {
            bsk.o(viewPager2, new x9(i, (String) null), cqaVar);
        }
    }

    @Override // defpackage.ddc
    public void g(int i, rcc rccVar, l6c l6cVar) {
        switch (this.a) {
            case 7:
                if (U(i, rccVar)) {
                    ((bc5) this.c).b(V(l6cVar));
                    break;
                }
                break;
            default:
                if (T(i, rccVar)) {
                    ((bc5) this.c).b(l6cVar);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.mf2
    public boolean h() {
        try {
            SQLiteDatabase readableDatabase = ((h9i) this.b).getReadableDatabase();
            String str = (String) this.d;
            str.getClass();
            return jok.a(readableDatabase, 1, str) != -1;
        } catch (SQLException e) {
            throw new jz2(e);
        }
    }

    @Override // defpackage.mf2
    public void i(HashMap hashMap) {
        SparseArray sparseArray = (SparseArray) this.c;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = ((h9i) this.b).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < sparseArray.size(); i++) {
                try {
                    lf2 lf2Var = (lf2) sparseArray.valueAt(i);
                    if (lf2Var == null) {
                        int keyAt = sparseArray.keyAt(i);
                        String str = (String) this.e;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(keyAt)});
                    } else {
                        B(writableDatabase, lf2Var);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            sparseArray.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new jz2(e);
        }
    }

    @Override // defpackage.mf2
    public void j(long j) {
        String hexString = Long.toHexString(j);
        this.d = hexString;
        this.e = dmi.q("ExoPlayerCacheIndex", hexString);
    }

    @Override // defpackage.ddc
    public void k(int i, rcc rccVar, kfb kfbVar, l6c l6cVar) {
        switch (this.a) {
            case 7:
                if (U(i, rccVar)) {
                    ((bc5) this.c).d(kfbVar, V(l6cVar));
                    break;
                }
                break;
            default:
                if (T(i, rccVar)) {
                    ((bc5) this.c).d(kfbVar, l6cVar);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.nmk
    public j80 o(j80 j80Var, j80 j80Var2, j80 j80Var3) {
        j80 j80Var4 = (j80) this.e;
        if (j80Var4 == null) {
            j80Var4 = j80Var3.c();
            this.e = j80Var4;
        }
        int b = j80Var4.b();
        int i = 0;
        while (true) {
            j80 j80Var5 = (j80) this.e;
            if (i >= b) {
                if (j80Var5 != null) {
                    return j80Var5;
                }
                Intrinsics.i("endVelocityVector");
                throw null;
            }
            if (j80Var5 == null) {
                Intrinsics.i("endVelocityVector");
                throw null;
            }
            j80Var5.e(((k80) this.b).get(i).b(j80Var.a(i), j80Var2.a(i), j80Var3.a(i)), i);
            i++;
        }
    }

    @Override // defpackage.eg9
    public void onAffordanceEnded() {
        throw new UnsupportedOperationException("not supported when to call HSDP service from shim activity");
    }

    @Override // defpackage.eg9
    public void onAffordanceStarted() {
        throw new UnsupportedOperationException("not supported when to call HSDP service from shim activity");
    }

    @Override // defpackage.eg9
    public void onDeepLinkStarted() {
        throw new UnsupportedOperationException("not supported when to call HSDP service from shim activity");
    }

    @Override // defpackage.eg9
    public void onDismissed(Bundle bundle) {
        HsdpShimActivity hsdpShimActivity = (HsdpShimActivity) this.e;
        boolean z = bundle.getBoolean("dldpRedirect", false);
        if (hsdpShimActivity.b || z) {
            hsdpShimActivity.a = null;
            hsdpShimActivity.finish();
        }
    }

    @Override // defpackage.eg9
    public void onError(Bundle bundle) {
        String.valueOf(bundle);
        String str = (String) this.b;
        String str2 = (String) this.c;
        Map map = (Map) this.d;
        HsdpShimActivity hsdpShimActivity = (HsdpShimActivity) this.e;
        hsdpShimActivity.startActivityForResult(hda.V(str, str2, map), 0);
        hsdpShimActivity.a = null;
        hsdpShimActivity.b = false;
        hsdpShimActivity.finish();
    }

    @Override // defpackage.eg9
    public void onShown(Bundle bundle) {
        ((HsdpShimActivity) this.e).b = true;
    }

    @Override // defpackage.mf2
    public void p(HashMap hashMap) {
        try {
            SQLiteDatabase writableDatabase = ((h9i) this.b).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                R(writableDatabase);
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    B(writableDatabase, (lf2) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                ((SparseArray) this.c).clear();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e) {
            throw new jz2(e);
        }
    }

    @Override // defpackage.mf2
    public void q(lf2 lf2Var, boolean z) {
        SparseArray sparseArray = (SparseArray) this.c;
        int i = lf2Var.a;
        if (z) {
            sparseArray.delete(i);
        } else {
            sparseArray.put(i, null);
        }
    }

    @Override // defpackage.mf2
    public void r(HashMap hashMap, SparseArray sparseArray) {
        h9i h9iVar = (h9i) this.b;
        z1a.E(((SparseArray) this.c).size() == 0);
        try {
            SQLiteDatabase readableDatabase = h9iVar.getReadableDatabase();
            String str = (String) this.d;
            str.getClass();
            if (jok.a(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = h9iVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    R(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            SQLiteDatabase readableDatabase2 = h9iVar.getReadableDatabase();
            String str2 = (String) this.e;
            str2.getClass();
            Cursor query = readableDatabase2.query(str2, g, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    int i = query.getInt(0);
                    String string = query.getString(1);
                    string.getClass();
                    hashMap.put(string, new lf2(i, string, vng.b0(new DataInputStream(new ByteArrayInputStream(query.getBlob(2))))));
                    sparseArray.put(i, string);
                } finally {
                }
            }
            query.close();
        } catch (SQLiteException e) {
            hashMap.clear();
            sparseArray.clear();
            throw new jz2(e);
        }
    }

    @Override // defpackage.mf2
    public void s() {
        h9i h9iVar = (h9i) this.b;
        String str = (String) this.d;
        str.getClass();
        try {
            String concat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = h9iVar.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i = jok.a;
                try {
                    String str2 = nik.a;
                    if (DatabaseUtils.queryNumEntries(writableDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(concat));
                    writableDatabase.setTransactionSuccessful();
                } catch (SQLException e) {
                    throw new jz2(e);
                }
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new jz2(e2);
        }
    }

    @Override // defpackage.tti
    public void t(nr9 nr9Var) {
        Drawable drawable;
        TextView textView = (TextView) this.b;
        if (nr9Var != null) {
            Resources resources = textView.getContext().getResources();
            resources.getClass();
            drawable = rfo.t(nr9Var, resources);
        } else {
            drawable = null;
        }
        haa.M(textView, drawable, (ua5) this.c);
    }

    public String toString() {
        switch (this.a) {
            case 13:
                en0 I = qea.I(this);
                I.e((String) this.b, "fullMethodName");
                I.e(ijc.a, "type");
                I.d("idempotent", false);
                I.d("safe", false);
                I.d("sampledToLocalTracing", true);
                I.e((aff) this.d, "requestMarshaller");
                I.e((aff) this.e, "responseMarshaller");
                I.e(null, "schemaDescriptor");
                I.b = true;
                return I.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.nmk
    public j80 u(long j, j80 j80Var, j80 j80Var2, j80 j80Var3) {
        j80 j80Var4 = (j80) this.d;
        if (j80Var4 == null) {
            j80Var4 = j80Var3.c();
            this.d = j80Var4;
        }
        int b = j80Var4.b();
        int i = 0;
        while (true) {
            j80 j80Var5 = (j80) this.d;
            if (i >= b) {
                if (j80Var5 != null) {
                    return j80Var5;
                }
                Intrinsics.i("velocityVector");
                throw null;
            }
            if (j80Var5 == null) {
                Intrinsics.i("velocityVector");
                throw null;
            }
            long j2 = j;
            j80Var5.e(((k80) this.b).get(i).d(j2, j80Var.a(i), j80Var2.a(i), j80Var3.a(i)), i);
            i++;
            j = j2;
        }
    }

    @Override // defpackage.ddc
    public void v(int i, rcc rccVar, kfb kfbVar, l6c l6cVar) {
        switch (this.a) {
            case 7:
                if (U(i, rccVar)) {
                    ((bc5) this.c).f(kfbVar, V(l6cVar));
                    break;
                }
                break;
            default:
                if (T(i, rccVar)) {
                    ((bc5) this.c).f(kfbVar, l6cVar);
                    break;
                }
                break;
        }
    }

    public String w(String str, byte[] bArr) {
        if (((x3f) this.d) == null) {
            return null;
        }
        SecretKey secretKey = (SecretKey) this.b;
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, secretKey, new GCMParameterSpec(128, bArr));
        CipherInputStream cipherInputStream = new CipherInputStream(new ByteArrayInputStream(Base64.decode(str, 0)), cipher);
        ArrayList arrayList = new ArrayList();
        while (true) {
            int read = cipherInputStream.read();
            if (read == -1) {
                break;
            }
            arrayList.add(Byte.valueOf((byte) read));
        }
        byte[] bArr2 = new byte[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            bArr2[i] = ((Byte) arrayList.get(i)).byteValue();
        }
        return new String(bArr2, C.UTF8_NAME);
    }

    public void x() {
        hpo.a("%s : init", "EncryptionManager");
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias("dtx_ignite_service_storage")) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init((KeyGenParameterSpec) this.e);
            keyGenerator.generateKey();
        }
        Key key = keyStore.getKey("dtx_ignite_service_storage", null);
        if (key instanceof SecretKey) {
            this.b = (SecretKey) key;
            int i = 6;
            this.c = new u8f(i);
            this.d = new x3f(i);
        }
    }

    public synchronized void y(pia piaVar, lo5 lo5Var) {
        rc rcVar = (rc) ((HashMap) this.c).put(piaVar, new rc(piaVar, lo5Var, (ReferenceQueue) this.d));
        if (rcVar != null) {
            rcVar.c = null;
            rcVar.clear();
        }
    }

    @Override // defpackage.nmk
    public j80 z(long j, j80 j80Var, j80 j80Var2, j80 j80Var3) {
        j80 j80Var4 = (j80) this.c;
        if (j80Var4 == null) {
            j80Var4 = j80Var.c();
            this.c = j80Var4;
        }
        int b = j80Var4.b();
        int i = 0;
        while (true) {
            j80 j80Var5 = (j80) this.c;
            if (i >= b) {
                if (j80Var5 != null) {
                    return j80Var5;
                }
                Intrinsics.i("valueVector");
                throw null;
            }
            if (j80Var5 == null) {
                Intrinsics.i("valueVector");
                throw null;
            }
            long j2 = j;
            j80Var5.e(((k80) this.b).get(i).c(j2, j80Var.a(i), j80Var2.a(i), j80Var3.a(i)), i);
            i++;
            j = j2;
        }
    }

    @Override // defpackage.tti
    public void D(nr9 nr9Var) {
    }

    public /* synthetic */ ujg(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj;
    }

    public ujg(int i) {
        this.a = i;
        switch (i) {
            case 3:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new qc(0));
                this.c = new HashMap();
                this.d = new ReferenceQueue();
                this.b = newSingleThreadExecutor;
                newSingleThreadExecutor.execute(new b8(this, 1));
                break;
            case 6:
                Random random = new Random();
                this.d = new HashMap();
                this.e = random;
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            case 9:
                this.b = new s0f(10);
                this.c = new fhh(0);
                this.e = new ArrayList();
                this.d = new HashSet();
                break;
            case 18:
                this.e = new ArrayList();
                this.c = new ArrayList();
                break;
            case 21:
                this.b = new Object();
                this.c = new Handler(Looper.getMainLooper(), new cy8(this, 1));
                break;
            case 23:
                this.b = new dh0(0);
                this.c = new SparseArray();
                this.d = new nkb((Object) null);
                this.e = new dh0(0);
                break;
            case 27:
                this.b = null;
                hpo.a("%s : create specs", "KeyGeneratorSpecCreator");
                this.e = new KeyGenParameterSpec.Builder("dtx_ignite_service_storage", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).build();
                break;
        }
    }

    public ujg(xy xyVar, ov0 ov0Var) {
        this.a = 4;
        this.b = xyVar;
        this.c = ov0Var;
        AutofillManager autofillManager = (AutofillManager) xyVar.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.d = autofillManager;
            xyVar.setImportantForAutofill(1);
            AutofillId autofillId = xyVar.getAutofillId();
            if (autofillId != null) {
                this.e = autofillId;
                return;
            }
            throw wt3.j("Required value was null.");
        }
        a70.r("Autofill service could not be located.");
        throw null;
    }

    public ujg(KSerializer kSerializer) {
        this.a = 19;
        this.d = "";
        this.e = "";
        this.b = kSerializer;
        this.c = kSerializer.getDescriptor().h();
    }

    public /* synthetic */ ujg(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public ujg(Context context) {
        this.a = 5;
        this.b = context != null ? context.getApplicationContext() : null;
        this.d = wib.c;
        if (context == null) {
            this.e = jn0.f;
        }
    }

    public ujg(String str, aff affVar, aff affVar2) {
        this.a = 13;
        new AtomicReferenceArray(2);
        this.b = str;
        int lastIndexOf = str.lastIndexOf(47);
        this.c = lastIndexOf == -1 ? null : str.substring(0, lastIndexOf);
        this.d = affVar;
        this.e = affVar2;
    }

    public ujg(eg3 eg3Var, Object obj) {
        this.a = 7;
        this.e = eg3Var;
        int i = 0;
        rcc rccVar = null;
        this.c = new bc5(eg3Var.c.c, i, rccVar);
        this.d = new bc5(eg3Var.d.c, i, rccVar);
        this.b = obj;
    }

    public ujg(qf4 qf4Var, List list) {
        this.a = 8;
        list.getClass();
        this.e = qf4Var;
        this.b = new j2d();
        this.c = qx9.c();
        this.d = CollectionsKt.S0(list);
    }

    public ujg(tdc tdcVar, rdc rdcVar) {
        this.a = 12;
        this.e = tdcVar;
        this.c = (bc5) tdcVar.j;
        this.d = (bc5) tdcVar.k;
        this.b = rdcVar;
    }

    public ujg(h9i h9iVar) {
        this.a = 1;
        this.b = h9iVar;
        this.c = new SparseArray();
    }

    public ujg(k80 k80Var) {
        this.a = 24;
        this.b = k80Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ujg(u78 u78Var) {
        this(new by9(u78Var));
        this.a = 24;
    }

    public ujg(psj psjVar, boolean[] zArr) {
        this.a = 17;
        this.b = psjVar;
        this.c = zArr;
        int i = psjVar.a;
        this.d = new boolean[i];
        this.e = new boolean[i];
    }

    public ujg(ViewPager2 viewPager2) {
        this.a = 25;
        this.e = viewPager2;
        this.b = new by9(this);
        this.c = new cqa(this);
    }

    public ujg(qrb qrbVar) {
        this.a = 11;
        this.e = qrbVar;
        this.b = new Object();
        this.c = new HashSet();
    }
}
