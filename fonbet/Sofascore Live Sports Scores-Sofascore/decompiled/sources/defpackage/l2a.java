package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.WindowManager;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.internal.ads.zzagk;
import com.google.android.gms.internal.ads.zzaht;
import com.google.android.gms.internal.ads.zzarv;
import com.google.android.gms.internal.ads.zzbla;
import com.google.android.gms.internal.ads.zzbul;
import com.google.android.gms.internal.ads.zzbum;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzbxe;
import com.google.android.gms.internal.ads.zzbyg;
import com.google.android.gms.internal.ads.zzcce;
import com.google.android.gms.internal.ads.zzcgs;
import com.google.android.gms.internal.ads.zzddp;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfrj;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzhc;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zzv;
import com.ironsource.C4427z5;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.results.event.details.view.graph.AttackMomentumGraph;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l2a implements tti, et9, lad, qs3, zzcgs, MediationAdLoadCallback, zzdjm {
    public static final dw3 e = new dw3(0);
    public static final z f = new z(10);
    public static final yak g = new yak(2);
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public l2a(int i) {
        this.a = i;
        switch (i) {
            case 9:
                this.b = new x0d();
                break;
            case 12:
                this.b = new ArrayList();
                break;
            case 14:
                String C = fc6.C();
                gc2 gc2Var = gc2.d;
                this.b = q1f.o(C);
                this.c = ezc.g;
                this.d = new ArrayList();
                break;
            case 20:
                this.b = new AtomicReference(ao2.m);
                this.c = new Object();
                break;
            case 22:
                this.b = new WeakHashMap();
                this.c = new WeakHashMap();
                this.d = new WeakHashMap();
                break;
            case 23:
                List list = Collections.EMPTY_LIST;
                this.b = list;
                this.c = list;
                break;
        }
    }

    public static boolean i(Editable editable, KeyEvent keyEvent, boolean z) {
        e6k[] e6kVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (e6kVarArr = (e6k[]) editable.getSpans(selectionStart, selectionEnd, e6k.class)) != null && e6kVarArr.length > 0) {
                for (e6k e6kVar : e6kVarArr) {
                    int spanStart = editable.getSpanStart(e6kVar);
                    int spanEnd = editable.getSpanEnd(e6kVar);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static xoe u(PlayerData playerData, Team team, int i) {
        Double avgRating;
        Player player = playerData.getPlayer();
        PlayerEventStatistics statistics = playerData.getStatistics();
        return new xoe(player, null, Double.valueOf(((statistics == null || (avgRating = statistics.getRating()) == null) && (avgRating = playerData.getAvgRating()) == null) ? 0.0d : avgRating.doubleValue()), playerData.getPosition(), team, i, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean v(kl5 kl5Var, Editable editable, int i, int i2, boolean z) {
        int min;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int max = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z2) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z2 = true;
                                    }
                                } else if (!z2) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i2, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    min = Math.min(selectionEnd + i2, editable.length());
                }
                e6k[] e6kVarArr = (e6k[]) editable.getSpans(selectionStart, min, e6k.class);
                if (e6kVarArr != null && e6kVarArr.length > 0) {
                    for (e6k e6kVar : e6kVarArr) {
                        int spanStart = editable.getSpanStart(e6kVar);
                        int spanEnd = editable.getSpanEnd(e6kVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    kl5Var.beginBatchEdit();
                    editable.delete(max3, min2);
                    kl5Var.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static l2a y(int i, int i2, Context context, AttributeSet attributeSet, int[] iArr) {
        return new l2a(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    @Override // defpackage.tti
    public void A(nr9 nr9Var) {
        switch (this.a) {
            case 3:
                Function1 function1 = (Function1) this.d;
                Bitmap O = rfo.O(nr9Var);
                AttackMomentumGraph attackMomentumGraph = (AttackMomentumGraph) this.c;
                function1.invoke(oyn.P(O, attackMomentumGraph.v));
                attackMomentumGraph.invalidate();
                break;
            default:
                mnc mncVar = (mnc) this.d;
                Bitmap O2 = rfo.O(nr9Var);
                lae laeVar = (lae) this.c;
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(O2, laeVar.c, laeVar.b, true);
                createScaledBitmap.getClass();
                mncVar.invoke(createScaledBitmap);
                laeVar.invalidateSelf();
                break;
        }
    }

    @Override // defpackage.tti
    public void D(nr9 nr9Var) {
        int i = this.a;
    }

    public Object E(CharSequence charSequence, int i, int i2, int i3, boolean z, ol5 ol5Var) {
        int i4;
        char c;
        ql5 ql5Var = new ql5((bjc) ((g7h) this.c).d);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                bjc bjcVar = (bjc) ((bjc) ql5Var.f).a.get(codePointAt);
                if (ql5Var.b == 2) {
                    if (bjcVar != null) {
                        ql5Var.f = bjcVar;
                        ql5Var.d++;
                    } else {
                        if (codePointAt == 65038) {
                            ql5Var.b();
                        } else if (codePointAt != 65039) {
                            bjc bjcVar2 = (bjc) ql5Var.f;
                            if (bjcVar2.b != null) {
                                if (ql5Var.d != 1) {
                                    ql5Var.g = bjcVar2;
                                    ql5Var.b();
                                } else if (ql5Var.c()) {
                                    ql5Var.g = (bjc) ql5Var.f;
                                    ql5Var.b();
                                } else {
                                    ql5Var.b();
                                }
                                c = 3;
                            } else {
                                ql5Var.b();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (bjcVar == null) {
                    ql5Var.b();
                    c = 1;
                } else {
                    ql5Var.b = 2;
                    ql5Var.f = bjcVar;
                    ql5Var.d = 1;
                    c = 2;
                }
                ql5Var.c = codePointAt;
                if (c == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c == 3) {
                    if (z || !w(charSequence, i4, i6, ((bjc) ql5Var.g).b)) {
                        z2 = ol5Var.d(charSequence, i4, i6, ((bjc) ql5Var.g).b);
                        i5++;
                    }
                }
            }
        }
        if (ql5Var.b == 2 && ((bjc) ql5Var.f).b != null && ((ql5Var.d > 1 || ql5Var.c()) && i5 < i3 && z2 && (z || !w(charSequence, i4, i6, ((bjc) ql5Var.f).b)))) {
            ol5Var.d(charSequence, i4, i6, ((bjc) ql5Var.f).b);
        }
        return ol5Var.a();
    }

    public void F() {
        ((TypedArray) this.c).recycle();
    }

    public void G(ap apVar) {
        cse cseVar = (cse) ((HashMap) this.b).remove(apVar);
        cseVar.getClass();
        wq4 wq4Var = (wq4) ((yq4) this.d).q.get(cseVar);
        if (wq4Var != null) {
            synchronized (wq4Var) {
                wq4Var.d--;
            }
        }
    }

    public synchronized ArrayList H() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            dyc dycVar = (dyc) it.next();
            if (dycVar.a.isAssignableFrom(qz8.class) && dycVar.b.isAssignableFrom(InputStream.class)) {
                it.remove();
                arrayList.add(dycVar.c);
            }
        }
        return arrayList;
    }

    public void I(Object obj) {
        long v = waa.v();
        if (v == jgj.a) {
            this.d = obj;
            return;
        }
        synchronized (this.c) {
            fgj fgjVar = (fgj) ((AtomicReference) this.b).get();
            int a = fgjVar.a(v);
            if (a >= 0) {
                fgjVar.c[a] = obj;
            } else {
                ((AtomicReference) this.b).set(fgjVar.b(obj, v));
                Unit unit = Unit.a;
            }
        }
    }

    public void J(zzagk zzagkVar, zzarv zzarvVar) {
        int i = 0;
        while (true) {
            zzaht[] zzahtVarArr = (zzaht[]) this.c;
            if (i >= zzahtVarArr.length) {
                return;
            }
            zzarvVar.a();
            zzarvVar.b();
            zzaht b = zzagkVar.b(zzarvVar.d, 3);
            zzv zzvVar = (zzv) ((List) this.b).get(i);
            String str = zzvVar.o;
            boolean z = true;
            if (!MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str)) {
                z = false;
            }
            zzguk.e(str, "Invalid closed caption MIME type provided: %s", z);
            zzt zztVar = new zzt();
            zzarvVar.b();
            zztVar.a = zzarvVar.e;
            zztVar.c("video/mp2t");
            zztVar.d(str);
            zztVar.e = zzvVar.e;
            zztVar.d = zzvVar.d;
            zztVar.M = zzvVar.N;
            zztVar.q = zzvVar.r;
            b.e(new zzv(zztVar));
            zzahtVarArr[i] = b;
            i++;
        }
    }

    public void K(long j, zzeu zzeuVar) {
        if (zzeuVar.B() < 9) {
            return;
        }
        int b = zzeuVar.b();
        int b2 = zzeuVar.b();
        int I = zzeuVar.I();
        if (b == 434 && b2 == 1195456820 && I == 3) {
            ((zzhc) this.d).b(j, zzeuVar);
        }
    }

    public boolean L() {
        return (((Activity) this.b).getResources().getConfiguration().uiMode & 48) == 32;
    }

    public synchronized void a(Class cls, Class cls2, ptc ptcVar) {
        dyc dycVar = new dyc(cls, cls2, ptcVar);
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.add(arrayList.size(), dycVar);
    }

    public synchronized otc b(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) this.b).iterator();
            boolean z = false;
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                dyc dycVar = (dyc) it.next();
                if (((HashSet) this.c).contains(dycVar)) {
                    z = true;
                } else {
                    if (!dycVar.a.isAssignableFrom(cls) || !dycVar.b.isAssignableFrom(cls2)) {
                        z2 = false;
                    }
                    if (z2) {
                        ((HashSet) this.c).add(dycVar);
                        arrayList.add(dycVar.c.a(this));
                        ((HashSet) this.c).remove(dycVar);
                    }
                }
            }
            if (arrayList.size() > 1) {
                return new aj0(2, arrayList, (sx2) this.d);
            }
            if (arrayList.size() == 1) {
                return (otc) arrayList.get(0);
            }
            if (z) {
                return g;
            }
            throw new nvf("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            ((HashSet) this.c).clear();
            throw th;
        }
    }

    @Override // defpackage.lad
    public boolean c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.b;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qs3
    public Object convert(Object obj) {
        yia yiaVar = (yia) this.d;
        zdc zdcVar = (zdc) this.b;
        String c = ((yea) yiaVar.b).c((KSerializer) this.c, obj);
        yzf.Companion.getClass();
        return xzf.b(c, zdcVar);
    }

    public synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = ((ArrayList) this.b).iterator();
            while (it.hasNext()) {
                dyc dycVar = (dyc) it.next();
                if (!((HashSet) this.c).contains(dycVar) && dycVar.a.isAssignableFrom(cls)) {
                    ((HashSet) this.c).add(dycVar);
                    arrayList.add(dycVar.c.a(this));
                    ((HashSet) this.c).remove(dycVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r5 != null) goto L26;
     */
    @Override // defpackage.et9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bitmap e(BitmapFactory.Options options) {
        boolean z;
        FileDescriptor fileDescriptor = ((a) this.d).b().getFileDescriptor();
        int i = Build.VERSION.SDK_INT;
        Bitmap bitmap = null;
        if (i == 34) {
            if ((i == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) ? ((Boolean) o02.f.get()).booleanValue() : false) {
                try {
                    z = f();
                } catch (IOException unused) {
                    z = false;
                }
                if (z) {
                    Bitmap.Config config = options.inPreferredConfig;
                    Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                    w1a.k("", config == config2);
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    try {
                        Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                        if (decodeFileDescriptor != null) {
                            try {
                                bitmap = q9.C(decodeFileDescriptor);
                            } catch (Throwable th) {
                                th = th;
                                bitmap = decodeFileDescriptor;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                                throw th;
                            }
                        }
                        decodeFileDescriptor.recycle();
                        options.inPreferredConfig = config2;
                        return bitmap;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
    }

    @Override // defpackage.et9
    public boolean f() {
        uqf uqfVar;
        ArrayList arrayList = (ArrayList) this.c;
        a aVar = (a) this.d;
        kn4 kn4Var = (kn4) this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ds9 ds9Var = (ds9) arrayList.get(i);
            uqf uqfVar2 = null;
            try {
                uqfVar = new uqf(new FileInputStream(aVar.b().getFileDescriptor()), kn4Var);
            } catch (Throwable th) {
                th = th;
            }
            try {
                boolean d = ds9Var.d(uqfVar, kn4Var);
                uqfVar.release();
                aVar.b();
                if (d) {
                    return true;
                }
            } catch (Throwable th2) {
                th = th2;
                uqfVar2 = uqfVar;
                if (uqfVar2 != null) {
                    uqfVar2.release();
                }
                aVar.b();
                throw th;
            }
        }
        return false;
    }

    @Override // defpackage.et9
    public int h() {
        uqf uqfVar;
        ArrayList arrayList = (ArrayList) this.c;
        a aVar = (a) this.d;
        kn4 kn4Var = (kn4) this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ds9 ds9Var = (ds9) arrayList.get(i);
            uqf uqfVar2 = null;
            try {
                uqfVar = new uqf(new FileInputStream(aVar.b().getFileDescriptor()), kn4Var);
            } catch (Throwable th) {
                th = th;
            }
            try {
                int b = ds9Var.b(uqfVar, kn4Var);
                uqfVar.release();
                aVar.b();
                if (b != -1) {
                    return b;
                }
            } catch (Throwable th2) {
                th = th2;
                uqfVar2 = uqfVar;
                if (uqfVar2 != null) {
                    uqfVar2.release();
                }
                aVar.b();
                throw th;
            }
        }
        return -1;
    }

    public q4c j(UUID uuid, pf6 pf6Var) {
        String str = pf6Var.b;
        if (TextUtils.isEmpty(str)) {
            str = (String) this.c;
        }
        if (TextUtils.isEmpty(str)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            z1a.y(uri, "The uri must be set.");
            throw new r4c(new xe4(uri, 0L, 1, null, map, 0L, -1L, null, 0), uri, awf.g, 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = yc2.e;
        hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : yc2.c.equals(uuid) ? C4427z5.M : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.d)) {
            hashMap.putAll((HashMap) this.d);
        }
        return tgj.B(((up4) this.b).createDataSource(), str, pf6Var.a, hashMap);
    }

    public q4c k(qf6 qf6Var) {
        Charset charset = StandardCharsets.UTF_8;
        byte[][] bArr = {"{\"signedRequest\":\"".getBytes(charset), qf6Var.a, "\"}".getBytes(charset)};
        long j = 0;
        for (int i = 0; i < 3; i++) {
            j += bArr[i].length;
        }
        int i2 = (int) j;
        z1a.p(j, j == ((long) i2), "the total number of elements (%s) in the arrays must fit in an int");
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < 3; i4++) {
            byte[] bArr3 = bArr[i4];
            System.arraycopy(bArr3, 0, bArr2, i3, bArr3.length);
            i3 += bArr3.length;
        }
        re4 createDataSource = ((up4) this.b).createDataSource();
        String str = qf6Var.b;
        String ydcVar = ydc.i.toString();
        String valueOf = String.valueOf(i2);
        yqo.v("Content-Length", valueOf);
        return tgj.B(createDataSource, str, bArr2, awf.j(2, new Object[]{"Content-Type", ydcVar, "Content-Length", valueOf}, null));
    }

    public Object l() {
        long v = waa.v();
        if (v == jgj.a) {
            return this.d;
        }
        fgj fgjVar = (fgj) ((AtomicReference) this.b).get();
        int a = fgjVar.a(v);
        if (a >= 0) {
            return fgjVar.c[a];
        }
        return null;
    }

    public ColorStateList m(int i) {
        int resourceId;
        ColorStateList q;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (q = eq3.q(resourceId, (Context) this.b)) == null) ? typedArray.getColorStateList(i) : q;
    }

    public synchronized ArrayList o(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            dyc dycVar = (dyc) it.next();
            if (!arrayList.contains(dycVar.b) && dycVar.a.isAssignableFrom(cls)) {
                arrayList.add(dycVar.b);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(AdError adError) {
        try {
            ((zzbxe) this.b).a(adError.zza());
        } catch (RemoteException e2) {
            zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public /* synthetic */ Object onSuccess(Object obj) {
        zzbxe zzbxeVar = (zzbxe) this.b;
        MediationAppOpenAd mediationAppOpenAd = (MediationAppOpenAd) obj;
        if (mediationAppOpenAd != null) {
            try {
                ((zzbyg) this.d).e = mediationAppOpenAd;
                zzbxeVar.zze();
            } catch (RemoteException e2) {
                zzo.zzg("", e2);
            }
            return new fqn((zzbwa) this.c);
        }
        zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            zzbxeVar.zzf("Adapter returned null.");
            return null;
        } catch (RemoteException e3) {
            zzo.zzg("", e3);
            return null;
        }
    }

    @Override // defpackage.et9
    public ImageHeaderParser$ImageType p() {
        uqf uqfVar;
        ArrayList arrayList = (ArrayList) this.c;
        a aVar = (a) this.d;
        kn4 kn4Var = (kn4) this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ds9 ds9Var = (ds9) arrayList.get(i);
            uqf uqfVar2 = null;
            try {
                uqfVar = new uqf(new FileInputStream(aVar.b().getFileDescriptor()), kn4Var);
            } catch (Throwable th) {
                th = th;
            }
            try {
                ImageHeaderParser$ImageType f2 = ds9Var.f(uqfVar);
                uqfVar.release();
                aVar.b();
                if (f2 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return f2;
                }
            } catch (Throwable th2) {
                th = th2;
                uqfVar2 = uqfVar;
                if (uqfVar2 != null) {
                    uqfVar2.release();
                }
                aVar.b();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public Drawable q(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : td4.d0(resourceId, (Context) this.b);
    }

    public Drawable r(int i) {
        int resourceId;
        Drawable d;
        if (!((TypedArray) this.c).hasValue(i) || (resourceId = ((TypedArray) this.c).getResourceId(i, 0)) == 0) {
            return null;
        }
        xb0 a = xb0.a();
        Context context = (Context) this.b;
        synchronized (a) {
            d = a.a.d(resourceId, true, context);
        }
        return d;
    }

    public Typeface s(int i, int i2, sc0 sc0Var) {
        int resourceId = ((TypedArray) this.c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        TypedValue typedValue = (TypedValue) this.d;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.d = typedValue;
        }
        TypedValue typedValue2 = typedValue;
        Context context = (Context) this.b;
        ThreadLocal threadLocal = z1g.a;
        if (context.isRestricted()) {
            return null;
        }
        return z1g.b(context, resourceId, typedValue2, i2, sc0Var, true, false);
    }

    @Override // defpackage.lad
    public void shutdown() {
        ((ConnectivityManager) this.b).unregisterNetworkCallback((c2a) this.d);
    }

    @Override // defpackage.tti
    public void t(nr9 nr9Var) {
        Bitmap O;
        Bitmap O2;
        switch (this.a) {
            case 3:
                AttackMomentumGraph attackMomentumGraph = (AttackMomentumGraph) this.c;
                ((Function1) this.b).invoke((nr9Var == null || (O = rfo.O(nr9Var)) == null) ? null : oyn.P(O, attackMomentumGraph.v));
                attackMomentumGraph.invalidate();
                break;
            default:
                lae laeVar = (lae) this.c;
                if (nr9Var != null && (O2 = rfo.O(nr9Var)) != null) {
                    mnc mncVar = (mnc) this.b;
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(O2, laeVar.c, laeVar.b, true);
                    createScaledBitmap.getClass();
                    mncVar.invoke(createScaledBitmap);
                    laeVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    public boolean w(CharSequence charSequence, int i, int i2, d6k d6kVar) {
        if ((d6kVar.c & 3) == 0) {
            lp4 lp4Var = (lp4) this.d;
            xic b = d6kVar.b();
            int a = b.a(8);
            if (a != 0) {
                ((ByteBuffer) b.d).getShort(a + b.a);
            }
            lp4Var.getClass();
            ThreadLocal threadLocal = lp4.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = lp4Var.a.hasGlyph(sb.toString());
            int i3 = d6kVar.c & 4;
            d6kVar.c = hasGlyph ? i3 | 2 : i3 | 1;
        }
        return (d6kVar.c & 3) == 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x01da, code lost:
    
        if (r6.equals("video/mp2t") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0279, code lost:
    
        if (r2.d != r30) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x027c, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02a3, code lost:
    
        if (r2.d != r30) goto L196;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0223 A[Catch: all -> 0x0227, TRY_ENTER, TryCatch #0 {all -> 0x0227, blocks: (B:8:0x001c, B:10:0x0033, B:13:0x003a, B:19:0x0223, B:20:0x022a, B:23:0x0232, B:26:0x0238, B:29:0x023e, B:31:0x0241, B:35:0x0244, B:90:0x0048), top: B:7:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0230 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0238 A[Catch: all -> 0x0227, TryCatch #0 {all -> 0x0227, blocks: (B:8:0x001c, B:10:0x0033, B:13:0x003a, B:19:0x0223, B:20:0x022a, B:23:0x0232, B:26:0x0238, B:29:0x023e, B:31:0x0241, B:35:0x0244, B:90:0x0048), top: B:7:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0048 A[Catch: all -> 0x0227, TRY_LEAVE, TryCatch #0 {all -> 0x0227, blocks: (B:8:0x001c, B:10:0x0033, B:13:0x003a, B:19:0x0223, B:20:0x022a, B:23:0x0232, B:26:0x0238, B:29:0x023e, B:31:0x0241, B:35:0x0244, B:90:0x0048), top: B:7:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void x(qe4 qe4Var, Uri uri, Map map, long j, long j2, cdf cdfVar) {
        String str;
        boolean z;
        boolean z2;
        int i;
        int N;
        int i2;
        kl6[] kl6VarArr;
        kl6 kl6Var;
        ap4 ap4Var = new ap4(qe4Var, j, j2);
        this.d = ap4Var;
        if (((kl6) this.c) != null) {
            return;
        }
        synchronized (((gp4) this.b)) {
            try {
                int[] iArr = gp4.a;
                ArrayList arrayList = new ArrayList(16);
                List list = (List) map.get("Content-Type");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                    z = true;
                    if (str == null) {
                        ArrayList arrayList2 = rjc.a;
                        char c = 2;
                        switch (str.hashCode()) {
                            case -1007807498:
                                if (str.equals("audio/x-flac")) {
                                    z2 = false;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case -586683234:
                                if (str.equals("audio/x-wav")) {
                                    z2 = true;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 187090231:
                                if (str.equals("audio/mp3")) {
                                    z2 = 2;
                                    break;
                                }
                                z2 = -1;
                                break;
                            default:
                                z2 = -1;
                                break;
                        }
                        switch (z2) {
                            case false:
                                str = MimeTypes.AUDIO_FLAC;
                                break;
                            case true:
                                str = "audio/wav";
                                break;
                            case true:
                                str = MimeTypes.AUDIO_MPEG;
                                break;
                        }
                        i = 15;
                        switch (str.hashCode()) {
                            case -2123537834:
                                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1662384011:
                                if (str.equals("video/mp2p")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1662384007:
                                break;
                            case -1662095187:
                                if (str.equals("video/webm")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1606874997:
                                if (str.equals(MimeTypes.AUDIO_AMR_WB)) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1487394660:
                                if (str.equals("image/jpeg")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1248337486:
                                if (str.equals(MimeTypes.APPLICATION_MP4)) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1079884372:
                                if (str.equals("video/x-msvideo")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1004728940:
                                if (str.equals(MimeTypes.TEXT_VTT)) {
                                    c = '\b';
                                    break;
                                }
                                c = 65535;
                                break;
                            case -387023398:
                                if (str.equals("audio/x-matroska")) {
                                    c = '\t';
                                    break;
                                }
                                c = 65535;
                                break;
                            case -43467528:
                                if (str.equals(MimeTypes.APPLICATION_WEBM)) {
                                    c = '\n';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 13915911:
                                if (str.equals("video/x-flv")) {
                                    c = 11;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 187078296:
                                if (str.equals(MimeTypes.AUDIO_AC3)) {
                                    c = '\f';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 187078297:
                                if (str.equals("audio/ac4")) {
                                    c = '\r';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 187078669:
                                if (str.equals("audio/amr")) {
                                    c = 14;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 187090232:
                                if (str.equals(MimeTypes.AUDIO_MP4)) {
                                    c = 15;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 187091926:
                                if (str.equals("audio/ogg")) {
                                    c = 16;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 187099443:
                                if (str.equals("audio/wav")) {
                                    c = 17;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1331848029:
                                if (str.equals(MimeTypes.VIDEO_MP4)) {
                                    c = 18;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1503095341:
                                if (str.equals(MimeTypes.AUDIO_AMR_NB)) {
                                    c = 19;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1504578661:
                                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                                    c = 20;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1504619009:
                                if (str.equals(MimeTypes.AUDIO_FLAC)) {
                                    c = 21;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1504824762:
                                if (str.equals("audio/midi")) {
                                    c = 22;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1504831518:
                                if (str.equals(MimeTypes.AUDIO_MPEG)) {
                                    c = 23;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1505118770:
                                if (str.equals(MimeTypes.AUDIO_WEBM)) {
                                    c = 24;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2039520277:
                                if (str.equals("video/x-matroska")) {
                                    c = 25;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                            case '\f':
                            case 20:
                                i = 0;
                                break;
                            case 1:
                                i = 10;
                                break;
                            case 2:
                                i = 11;
                                break;
                            case 3:
                            case '\t':
                            case '\n':
                            case 24:
                            case 25:
                                i = 6;
                                break;
                            case 4:
                            case 14:
                            case 19:
                                i = 3;
                                break;
                            case 5:
                                i = 14;
                                break;
                            case 6:
                            case 15:
                            case 18:
                                i = 8;
                                break;
                            case 7:
                                i = 16;
                                break;
                            case '\b':
                                i = 13;
                                break;
                            case 11:
                                i = 5;
                                break;
                            case '\r':
                                i = 1;
                                break;
                            case 16:
                                i = 9;
                                break;
                            case 17:
                                i = 12;
                                break;
                            case 21:
                                i = 4;
                                break;
                            case 23:
                                i = 7;
                                break;
                        }
                        if (i != -1) {
                            gp4.a(arrayList, i);
                        }
                        N = u6h.N(uri);
                        if (N != -1 && N != i) {
                            gp4.a(arrayList, N);
                        }
                        for (i2 = 0; i2 < 16; i2++) {
                            int i3 = iArr[i2];
                            if (i3 != i && i3 != N) {
                                gp4.a(arrayList, i3);
                            }
                        }
                        kl6VarArr = (kl6[]) arrayList.toArray(new kl6[arrayList.size()]);
                    }
                    i = -1;
                    if (i != -1) {
                    }
                    N = u6h.N(uri);
                    if (N != -1) {
                        gp4.a(arrayList, N);
                    }
                    while (i2 < 16) {
                    }
                    kl6VarArr = (kl6[]) arrayList.toArray(new kl6[arrayList.size()]);
                }
                str = null;
                z = true;
                if (str == null) {
                }
                i = -1;
                if (i != -1) {
                }
                N = u6h.N(uri);
                if (N != -1) {
                }
                while (i2 < 16) {
                }
                kl6VarArr = (kl6[]) arrayList.toArray(new kl6[arrayList.size()]);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (kl6VarArr.length == 1) {
            kl6Var = kl6VarArr[0];
            this.c = kl6Var;
        } else {
            int length = kl6VarArr.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    kl6 kl6Var2 = kl6VarArr[i4];
                    try {
                    } catch (EOFException unused) {
                        if (((kl6) this.c) == null) {
                        }
                    } catch (Throwable th2) {
                        if (((kl6) this.c) == null && ap4Var.d != j) {
                            z = false;
                        }
                        qx9.t(z);
                        ap4Var.f = 0;
                        throw th2;
                    }
                    if (kl6Var2.d(ap4Var)) {
                        this.c = kl6Var2;
                        ap4Var.f = 0;
                    } else {
                        if (((kl6) this.c) == null) {
                        }
                        boolean z3 = true;
                        qx9.t(z3);
                        ap4Var.f = 0;
                        i4++;
                    }
                }
            }
            kl6 kl6Var3 = (kl6) this.c;
            if (kl6Var3 == null) {
                StringBuilder sb = new StringBuilder("None of the available extractors (");
                int i5 = lik.a;
                StringBuilder sb2 = new StringBuilder();
                for (int i6 = 0; i6 < kl6VarArr.length; i6++) {
                    sb2.append(kl6VarArr[i6].getClass().getSimpleName());
                    if (i6 < kl6VarArr.length - 1) {
                        sb2.append(", ");
                    }
                }
                sb.append(sb2.toString());
                sb.append(") could read the stream.");
                throw new eti(sb.toString(), null, false, 1);
            }
            kl6Var = kl6Var3;
        }
        kl6Var.c(cdfVar);
    }

    public void z(Network network, boolean z) {
        Unit unit;
        boolean z2;
        Network[] allNetworks = ((ConnectivityManager) this.b).getAllNetworks();
        int length = allNetworks.length;
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (Intrinsics.c(network2, network)) {
                z2 = z;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) this.b).getNetworkCapabilities(network2);
                z2 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z2) {
                z3 = true;
                break;
            }
            i++;
        }
        rqi rqiVar = (rqi) this.c;
        if (((bpf) rqiVar.b.get()) != null) {
            rqiVar.d = z3;
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            rqiVar.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgs, com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        zzfrj zzfrjVar;
        switch (this.a) {
            case 27:
                zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
                zzbum zzbumVar = (zzbum) this.d;
                synchronized (zzbumVar.a) {
                    try {
                        zze.zza("loadNewJavascriptEngine (success): Lock acquired");
                        zzbumVar.g = 0;
                        zzbul zzbulVar = zzbumVar.f;
                        if (zzbulVar != null && ((zzbul) this.b) != zzbulVar) {
                            zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                            zzbumVar.f.f();
                        }
                        zzbumVar.f = (zzbul) this.b;
                        if (((Boolean) zzbla.d.c()).booleanValue() && (zzfrjVar = zzbumVar.e) != null) {
                            zzfqw zzfqwVar = (zzfqw) this.c;
                            zzfqwVar.zzd(true);
                            zzfrjVar.b(zzfqwVar.zzm());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                zze.zza("loadNewJavascriptEngine (success): Lock released");
                return;
            default:
                ((zzddp) obj).n((zzcce) this.b, (String) this.c, (String) this.d);
                return;
        }
    }

    @Override // defpackage.et9
    public void g() {
    }

    private final void B(nr9 nr9Var) {
    }

    private final void C(nr9 nr9Var) {
    }

    public /* synthetic */ l2a(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.b = obj2;
        this.c = obj3;
        this.d = obj;
    }

    public l2a(Activity activity) {
        this.a = 26;
        this.d = null;
        this.b = activity;
        this.c = (WindowManager) activity.getSystemService("window");
    }

    public l2a(by9 by9Var, sz8 sz8Var) {
        this.a = 18;
        this.b = by9Var;
        this.c = sz8Var;
        this.d = e.d(tz9.o(), z45.a);
    }

    public l2a(List list, int i) {
        this.a = i;
        switch (i) {
            case 25:
                this.b = list;
                this.c = new zzaht[list.size()];
                zzhc zzhcVar = new zzhc(new e3c(this, 25));
                this.d = zzhcVar;
                zzhcVar.a(3);
                break;
            default:
                this.d = list;
                this.b = new ArrayList(list.size());
                this.c = new ArrayList(list.size());
                for (int i2 = 0; i2 < list.size(); i2++) {
                    ((ArrayList) this.b).add(new ibh((List) ((jvb) list.get(i2)).b.b));
                    ((ArrayList) this.c).add(((jvb) list.get(i2)).c.g());
                }
                break;
        }
    }

    public l2a(gqf gqfVar) {
        this.a = 15;
        this.b = new em0(0);
        this.c = new p03(3);
        this.d = new ixa(21, this, gqfVar);
    }

    public l2a(sx2 sx2Var) {
        this.a = 2;
        this.b = new ArrayList();
        this.c = new HashSet();
        this.d = sx2Var;
    }

    public l2a(r18 r18Var) {
        this.a = 1;
        this.c = null;
        this.d = null;
        this.b = r18Var;
    }

    public l2a(gp4 gp4Var) {
        this.a = 4;
        this.b = gp4Var;
    }

    public l2a(Context context, TypedArray typedArray) {
        this.a = 21;
        this.b = context;
        this.c = typedArray;
    }

    public l2a(ConnectivityManager connectivityManager, rqi rqiVar) {
        this.a = 17;
        this.b = connectivityManager;
        this.c = rqiVar;
        c2a c2aVar = new c2a(this, 3);
        this.d = c2aVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), c2aVar);
    }

    public l2a(String str, up4 up4Var) {
        this.a = 10;
        this.b = up4Var;
        this.c = str;
        this.d = new HashMap();
    }

    public l2a(g7h g7hVar, kpg kpgVar, lp4 lp4Var, Set set) {
        this.a = 8;
        this.b = kpgVar;
        this.c = g7hVar;
        this.d = lp4Var;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            E(str, 0, str.length(), 1, true, new f79(str, 3, false));
        }
    }

    public /* synthetic */ l2a(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public l2a(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, kn4 kn4Var) {
        this.a = 11;
        w1a.m(kn4Var, "Argument must not be null");
        this.b = kn4Var;
        this.c = arrayList;
        this.d = new a(parcelFileDescriptor);
    }

    public l2a(yq4 yq4Var, cse cseVar) {
        this.a = 7;
        this.d = yq4Var;
        this.b = new HashMap();
        this.c = cseVar;
    }
}
