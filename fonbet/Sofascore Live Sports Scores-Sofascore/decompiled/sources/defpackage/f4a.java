package defpackage;

import android.R;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class f4a implements fu, tti, o2c {
    public static hbl h;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public static final int[] d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public static final String[] e = {"name", "length", "last_touch_timestamp"};
    public static final f4a f = new f4a((byte) 0, 3);
    public static final Object g = new Object();
    public static final uxf i = new uxf(27);

    public f4a(byte b, int i2) {
        this.a = i2;
        switch (i2) {
            case 16:
                this.b = Choreographer.getInstance();
                this.c = Looper.myLooper();
                break;
            case 17:
                this.b = new Rect();
                this.c = new Rect();
                break;
            case 28:
                this.b = ByteBuffer.allocateDirect(500);
                break;
            default:
                this.b = "spread";
                this.c = null;
                break;
        }
    }

    public static Task a(Context context, Intent intent, boolean z) {
        hbl hblVar;
        synchronized (g) {
            try {
                hblVar = h;
                if (hblVar == null) {
                    hblVar = new hbl(context);
                    h = hblVar;
                }
            } finally {
            }
        }
        if (!z) {
            return hblVar.m(intent).continueWith(new hg0(1), new hg6(5));
        }
        if (g7h.s().w(context)) {
            synchronized (t62.o) {
                try {
                    t62.y(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        t62.p.a();
                    }
                    hblVar.m(intent).addOnCompleteListener(new bnk(intent, 2));
                } finally {
                }
            }
        } else {
            hblVar.m(intent);
        }
        return Tasks.forResult(-1);
    }

    public static g6b h(nt9 nt9Var) {
        tti ttiVar = nt9Var.c;
        Object context = ttiVar instanceof sw8 ? ((sw8) ttiVar).getView().getContext() : nt9Var.a;
        while (!(context instanceof u6b)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((u6b) context).getLifecycle();
    }

    public static boolean m(nt9 nt9Var, Bitmap.Config config) {
        if (!pco.H(config)) {
            return true;
        }
        if (!((Boolean) fqj.w(nt9Var, vt9.f)).booleanValue()) {
            return false;
        }
        tti ttiVar = nt9Var.c;
        if (!(ttiVar instanceof sw8)) {
            return true;
        }
        View view = ((sw8) ttiVar).getView();
        return !view.isAttachedToWindow() || view.isHardwareAccelerated();
    }

    public Drawable B(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.c) == null) {
                this.c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            int id = layerDrawable.getId(i2);
            drawableArr[i2] = B(layerDrawable.getDrawable(i2), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i3 = 0; i3 < numberOfLayers; i3++) {
            layerDrawable2.setId(i3, layerDrawable.getId(i3));
            layerDrawable2.setLayerGravity(i3, layerDrawable.getLayerGravity(i3));
            layerDrawable2.setLayerWidth(i3, layerDrawable.getLayerWidth(i3));
            layerDrawable2.setLayerHeight(i3, layerDrawable.getLayerHeight(i3));
            layerDrawable2.setLayerInsetLeft(i3, layerDrawable.getLayerInsetLeft(i3));
            layerDrawable2.setLayerInsetRight(i3, layerDrawable.getLayerInsetRight(i3));
            layerDrawable2.setLayerInsetTop(i3, layerDrawable.getLayerInsetTop(i3));
            layerDrawable2.setLayerInsetBottom(i3, layerDrawable.getLayerInsetBottom(i3));
            layerDrawable2.setLayerInsetStart(i3, layerDrawable.getLayerInsetStart(i3));
            layerDrawable2.setLayerInsetEnd(i3, layerDrawable.getLayerInsetEnd(i3));
        }
        return layerDrawable2;
    }

    public tvd C(tvd tvdVar) {
        boolean z;
        tl6 tl6Var = tvdVar.j;
        sl6 sl6Var = vt9.b;
        if (!pco.H((Bitmap.Config) fqj.x(tvdVar, sl6Var)) || ((b79) this.c).e()) {
            z = false;
        } else {
            tl6Var.getClass();
            LinkedHashMap q = tub.q(tl6Var.a);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (config != null) {
                q.put(sl6Var, config);
            } else {
                q.remove(sl6Var);
            }
            tl6Var = new tl6(fcp.o0(q));
            z = true;
        }
        return z ? new tvd(tvdVar.a, tvdVar.b, tvdVar.c, tvdVar.d, tvdVar.e, tvdVar.f, tvdVar.g, tvdVar.h, tvdVar.i, tl6Var) : tvdVar;
    }

    public void E(ArrayList arrayList) {
        ykd ykdVar;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((xkd) arrayList.get(i2)).a == 1) {
                try {
                    ykdVar = new ykd((xkd) arrayList.get(i2));
                } catch (wkd unused) {
                    ykdVar = null;
                }
                this.c = ykdVar;
            }
        }
    }

    @Override // defpackage.fu
    public void b(Set set) {
        ConcurrentHashMap concurrentHashMap = ((ju) this.c).b;
        String str = (String) this.b;
        if (str.isEmpty() || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null || !str.equals("fiam") || set == null || set.isEmpty()) {
            return;
        }
        ((a4n) concurrentHashMap.get(str)).a(set);
    }

    public sm0 c() {
        if (((IdentityHashMap) this.c) != null) {
            for (Map.Entry entry : ((sm0) this.b).a.entrySet()) {
                if (!((IdentityHashMap) this.c).containsKey(entry.getKey())) {
                    ((IdentityHashMap) this.c).put((rm0) entry.getKey(), entry.getValue());
                }
            }
            this.b = new sm0((IdentityHashMap) this.c);
            this.c = null;
        }
        return (sm0) this.b;
    }

    public boolean e(int i2) {
        switch (this.a) {
            case 10:
                return ((i78) this.b).a.get(i2);
            default:
                return ((j78) this.b).a.get(i2);
        }
    }

    @Override // defpackage.o2c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public nbd d(n2c n2cVar) {
        MediaCodec mediaCodec;
        String str = n2cVar.a.a;
        nbd nbdVar = null;
        try {
            q5a.y("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                nbd nbdVar2 = new nbd(mediaCodec, (HandlerThread) ((el0) this.b).get(), (HandlerThread) ((el0) this.c).get());
                try {
                    q5a.B();
                    nbdVar2.g(n2cVar.b, n2cVar.d, n2cVar.e);
                    return nbdVar2;
                } catch (Exception e2) {
                    e = e2;
                    nbdVar = nbdVar2;
                    if (nbdVar != null) {
                        nbdVar.release();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Exception e4) {
            e = e4;
            mediaCodec = null;
        }
    }

    public Boolean g(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return null;
        }
        View.OnClickListener onClickListener = (View.OnClickListener) this.c;
        if (onClickListener == null) {
            return Boolean.FALSE;
        }
        onClickListener.onClick((ViewGroup) this.b);
        return Boolean.TRUE;
    }

    public HashMap i() {
        try {
            ((String) this.c).getClass();
            Cursor query = ((h9i) this.b).getReadableDatabase().query((String) this.c, e, null, null, null, null, null);
            try {
                HashMap hashMap = new HashMap(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(0);
                    string.getClass();
                    hashMap.put(string, new ve2(query.getLong(1), query.getLong(2)));
                }
                query.close();
                return hashMap;
            } finally {
            }
        } catch (SQLException e2) {
            throw new jz2(e2);
        }
    }

    public InputMethodManager j() {
        return (InputMethodManager) ((joa) this.c).getValue();
    }

    public KeyListener k(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        if (keyListener instanceof nl5) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new nl5(keyListener);
    }

    public void l(long j) {
        h9i h9iVar = (h9i) this.b;
        try {
            String hexString = Long.toHexString(j);
            this.c = "ExoPlayerCacheFileMetadata" + hexString;
            if (jok.a(h9iVar.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = h9iVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    jok.b(writableDatabase, 2, hexString);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.c));
                    writableDatabase.execSQL("CREATE TABLE " + ((String) this.c) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e2) {
            throw new jz2(e2);
        }
    }

    public void o(AttributeSet attributeSet, int i2) {
        switch (this.a) {
            case 1:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.b;
                l2a y = l2a.y(i2, 0, absSeekBar.getContext(), attributeSet, d);
                Drawable r = y.r(0);
                if (r != null) {
                    if (r instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) r;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i3 = 0; i3 < numberOfFrames; i3++) {
                            Drawable B = B(animationDrawable.getFrame(i3), true);
                            B.setLevel(10000);
                            animationDrawable2.addFrame(B, animationDrawable.getDuration(i3));
                        }
                        animationDrawable2.setLevel(10000);
                        r = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(r);
                }
                Drawable r2 = y.r(1);
                if (r2 != null) {
                    absSeekBar.setProgressDrawable(B(r2, false));
                }
                y.F();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, dkf.i, i2, 0);
                try {
                    boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    y(z);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public kl5 p(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        t9d t9dVar = (t9d) this.c;
        if (inputConnection == null) {
            inputConnection2 = null;
        } else {
            fp4 fp4Var = (fp4) t9dVar.a;
            if (!(inputConnection instanceof kl5)) {
                inputConnection = new kl5(editorInfo, inputConnection, (EditText) fp4Var.b);
            }
            inputConnection2 = inputConnection;
        }
        return (kl5) inputConnection2;
    }

    public void q(hc hcVar) {
        g7h g7hVar = (g7h) this.b;
        ((ActionMode.Callback) g7hVar.b).onDestroyActionMode(g7hVar.q(hcVar));
        ub0 ub0Var = (ub0) this.c;
        if (ub0Var.v != null) {
            ub0Var.l.getDecorView().removeCallbacks(ub0Var.w);
        }
        if (ub0Var.u != null) {
            tuk tukVar = ub0Var.x;
            if (tukVar != null) {
                tukVar.b();
            }
            tuk b = bsk.b(ub0Var.u);
            b.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ub0Var.x = b;
            b.d(new mb0(this, 2));
        }
        ub0Var.t = null;
        ViewGroup viewGroup = ub0Var.A;
        WeakHashMap weakHashMap = bsk.a;
        viewGroup.requestApplyInsets();
        ub0Var.N();
    }

    public boolean r(hc hcVar, Menu menu) {
        ViewGroup viewGroup = ((ub0) this.c).A;
        WeakHashMap weakHashMap = bsk.a;
        viewGroup.requestApplyInsets();
        g7h g7hVar = (g7h) this.b;
        ActionMode.Callback callback = (ActionMode.Callback) g7hVar.b;
        xmi q = g7hVar.q(hcVar);
        fhh fhhVar = (fhh) g7hVar.e;
        Menu menu2 = (Menu) fhhVar.get(menu);
        if (menu2 == null) {
            menu2 = new dgc((Context) g7hVar.c, (vec) menu);
            fhhVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(q, menu2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007b, code lost:
    
        if (((defpackage.b79) r20.c).g(r1) != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tvd s(nt9 nt9Var, kjh kjhVar) {
        Context context;
        boolean z;
        boolean z2;
        kjh kjhVar2;
        boolean z3;
        boolean z4;
        Context context2 = nt9Var.a;
        jrg jrgVar = nt9Var.t;
        e3f e3fVar = nt9Var.u;
        String str = nt9Var.g;
        s18 s18Var = nt9Var.h;
        ze2 ze2Var = nt9Var.l;
        ze2 ze2Var2 = nt9Var.m;
        ze2 ze2Var3 = nt9Var.n;
        sl6 sl6Var = vt9.b;
        Bitmap.Config config = (Bitmap.Config) fqj.w(nt9Var, sl6Var);
        sl6 sl6Var2 = vt9.g;
        boolean booleanValue = ((Boolean) fqj.w(nt9Var, sl6Var2)).booleanValue();
        sl6 sl6Var3 = st9.a;
        if (((List) fqj.w(nt9Var, sl6Var3)).isEmpty()) {
            context = context2;
        } else {
            context = context2;
            if (!ph0.v(gjk.a, (Bitmap.Config) fqj.w(nt9Var, sl6Var))) {
                z = false;
                if (!pco.H((Bitmap.Config) fqj.w(nt9Var, sl6Var))) {
                    if (m(nt9Var, (Bitmap.Config) fqj.w(nt9Var, sl6Var))) {
                        z2 = z;
                        kjhVar2 = kjhVar;
                    } else {
                        z2 = z;
                        kjhVar2 = kjhVar;
                    }
                    z3 = false;
                    if (z2 || !z3) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    z4 = (booleanValue || !((List) fqj.w(nt9Var, sl6Var3)).isEmpty() || config == Bitmap.Config.ALPHA_8) ? false : true;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(tub.k(nt9Var.x.n.a, nt9Var.v.a));
                    if (config != ((Bitmap.Config) fqj.w(nt9Var, sl6Var))) {
                        if (config != null) {
                            linkedHashMap.put(sl6Var, config);
                        } else {
                            linkedHashMap.remove(sl6Var);
                        }
                    }
                    if (z4 != ((Boolean) fqj.w(nt9Var, sl6Var2)).booleanValue()) {
                        linkedHashMap.put(sl6Var2, Boolean.valueOf(z4));
                    }
                    return new tvd(context, kjhVar2, jrgVar, e3fVar, str, s18Var, ze2Var, ze2Var2, ze2Var3, new tl6(fcp.o0(linkedHashMap)));
                }
                z2 = z;
                kjhVar2 = kjhVar;
                z3 = true;
                if (z2) {
                }
                config = Bitmap.Config.ARGB_8888;
                if (booleanValue) {
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(tub.k(nt9Var.x.n.a, nt9Var.v.a));
                if (config != ((Bitmap.Config) fqj.w(nt9Var, sl6Var))) {
                }
                if (z4 != ((Boolean) fqj.w(nt9Var, sl6Var2)).booleanValue()) {
                }
                return new tvd(context, kjhVar2, jrgVar, e3fVar, str, s18Var, ze2Var, ze2Var2, ze2Var3, new tl6(fcp.o0(linkedHashMap2)));
            }
        }
        z = true;
        if (!pco.H((Bitmap.Config) fqj.w(nt9Var, sl6Var))) {
        }
        z3 = true;
        if (z2) {
        }
        config = Bitmap.Config.ARGB_8888;
        if (booleanValue) {
        }
        LinkedHashMap linkedHashMap22 = new LinkedHashMap(tub.k(nt9Var.x.n.a, nt9Var.v.a));
        if (config != ((Bitmap.Config) fqj.w(nt9Var, sl6Var))) {
        }
        if (z4 != ((Boolean) fqj.w(nt9Var, sl6Var2)).booleanValue()) {
        }
        return new tvd(context, kjhVar2, jrgVar, e3fVar, str, s18Var, ze2Var, ze2Var2, ze2Var3, new tl6(fcp.o0(linkedHashMap22)));
    }

    @Override // defpackage.tti
    public void t(nr9 nr9Var) {
        d7e k;
        nt9 nt9Var = (nt9) this.b;
        yj0 yj0Var = (yj0) this.c;
        d7e w = nr9Var != null ? wnn.w(nr9Var, nt9Var.a, yj0Var.p) : null;
        if (w == null && ((Boolean) fqj.w(nt9Var, tt9.a)).booleanValue() && (k = yj0Var.k()) != null) {
            w = k;
        }
        yj0Var.o(new nj0(w));
    }

    public Task u(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.b;
        hg0 hg0Var = (hg0) this.c;
        boolean z = context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? Tasks.call(hg0Var, new c00(2, context, intent)).continueWithTask(hg0Var, new lt4(context, intent, z2)) : a(context, intent, z2);
    }

    public void v(Set set) {
        ((String) this.c).getClass();
        try {
            SQLiteDatabase writableDatabase = ((h9i) this.b).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete((String) this.c, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e2) {
            throw new jz2(e2);
        }
    }

    public void w(long j, long j2, String str) {
        ((String) this.c).getClass();
        try {
            SQLiteDatabase writableDatabase = ((h9i) this.b).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow((String) this.c, null, contentValues);
        } catch (SQLException e2) {
            throw new jz2(e2);
        }
    }

    public void x(rm0 rm0Var, Object obj) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.c;
        if (identityHashMap == null) {
            identityHashMap = new IdentityHashMap(1);
            this.c = identityHashMap;
        }
        identityHashMap.put(rm0Var, obj);
    }

    public void y(boolean z) {
        vl5 vl5Var = (vl5) ((fp4) ((t9d) this.c).a).c;
        if (vl5Var.c != z) {
            if (vl5Var.b != null) {
                cl5 a = cl5.a();
                ul5 ul5Var = vl5Var.b;
                a.getClass();
                l4a.j(ul5Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a.b.remove(ul5Var);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            vl5Var.c = z;
            if (z) {
                vl5.a(vl5Var.a, cl5.a().c());
            }
        }
    }

    public cm0 z() {
        File file = (File) this.c;
        File file2 = (File) this.b;
        if (file2.exists()) {
            if (file.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file)) {
                tgj.d0("Couldn't rename file " + file2 + " to backup file " + file);
            }
        }
        try {
            return new cm0(file2);
        } catch (FileNotFoundException e2) {
            File parentFile = file2.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                cp4.i(fc6.k(file2, "Couldn't create "), e2);
                return null;
            }
            try {
                return new cm0(file2);
            } catch (FileNotFoundException e3) {
                cp4.i(fc6.k(file2, "Couldn't create "), e3);
                return null;
            }
        }
    }

    @Override // defpackage.tti
    public void A(nr9 nr9Var) {
    }

    @Override // defpackage.tti
    public void D(nr9 nr9Var) {
    }

    public /* synthetic */ f4a(int i2, Object obj, Object obj2) {
        this.a = i2;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ f4a(Object obj, int i2) {
        this.a = i2;
        this.b = obj;
    }

    public /* synthetic */ f4a(Object obj, Object obj2, boolean z, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }

    public f4a(hcd hcdVar, List list) {
        this.a = 7;
        hcdVar.getClass();
        list.getClass();
        this.b = list;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            this.c = hcdVar;
        } else {
            wt3.z(it.next());
            throw null;
        }
    }

    public f4a(r18 r18Var) {
        this.a = 5;
        this.b = r18Var;
        this.c = i;
    }

    public f4a(apf apfVar) {
        Object hjgVar;
        this.a = 13;
        this.b = apfVar;
        int i2 = 4;
        if (d79.a) {
            hjgVar = new r0a(false, i2);
        } else {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 != 26 && i3 != 27) {
                hjgVar = new r0a(true, i2);
            } else {
                hjgVar = new hjg();
            }
        }
        this.c = hjgVar;
    }

    public f4a(nvd nvdVar, hki hkiVar) {
        this.a = 21;
        hgf hgfVar = new hgf();
        hgfVar.a = nvdVar;
        nvdVar.a(new kr9(hgfVar, 29));
        this.b = hgfVar;
        this.c = hkiVar;
    }

    public f4a(EditText editText) {
        this.a = 19;
        this.b = editText;
        t9d t9dVar = new t9d();
        t9dVar.a = new fp4(editText);
        this.c = t9dVar;
    }

    public f4a(File file) {
        this.a = 25;
        this.b = file;
        this.c = new File(file.getPath() + ".bak");
    }

    public f4a(String str) {
        this.a = 27;
        hfb a = hfb.a();
        z1a.y(a, "registry");
        this.b = a;
        z1a.y(str, "defaultPolicy");
        this.c = str;
    }

    public f4a(Context context) {
        this.a = 4;
        this.b = context;
        this.c = new hg0(1);
    }

    public f4a(View view) {
        this.a = 0;
        this.b = view;
        this.c = ypa.a(ysa.c, new sr8(this, 12));
    }

    public f4a(int i2) {
        this.a = 24;
        el0 el0Var = new el0(i2, 0);
        el0 el0Var2 = new el0(i2, 2);
        this.b = el0Var;
        this.c = el0Var2;
    }

    public f4a(i78 i78Var, SparseArray sparseArray) {
        this.a = 10;
        this.b = i78Var;
        SparseBooleanArray sparseBooleanArray = i78Var.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            int a = i78Var.a(i2);
            pv pvVar = (pv) sparseArray.get(a);
            pvVar.getClass();
            sparseArray2.append(a, pvVar);
        }
        this.c = sparseArray2;
    }

    public f4a(j78 j78Var, SparseArray sparseArray) {
        this.a = 11;
        this.b = j78Var;
        SparseBooleanArray sparseBooleanArray = j78Var.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            z1a.v(i2, sparseBooleanArray.size());
            int keyAt = sparseBooleanArray.keyAt(i2);
            qv qvVar = (qv) sparseArray.get(keyAt);
            qvVar.getClass();
            sparseArray2.append(keyAt, qvVar);
        }
        this.c = sparseArray2;
    }

    public f4a(dx dxVar) {
        this.a = 12;
        this.c = dxVar;
        this.b = new cx(dxVar);
    }

    public /* synthetic */ f4a(char c, int i2) {
        this.a = i2;
    }
}
