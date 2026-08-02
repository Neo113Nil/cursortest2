package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vkontakte.android.R;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import xsna.b33;
import xsna.bx10;
import xsna.ex10;
import xsna.fx10;
import xsna.h1u;
import xsna.m33;
import xsna.sg90;
import xsna.sx10;
import xsna.xw10;

/* compiled from: MediaRouteDynamicControllerDialog.java */
/* loaded from: classes12.dex */
public final class e extends b33 {
    public static final /* synthetic */ int V = 0;
    public boolean A;
    public boolean B;
    public boolean C;
    public ImageButton D;
    public Button E;
    public ImageView F;
    public View G;
    public ImageView H;
    public TextView I;
    public TextView J;
    public String K;
    public MediaControllerCompat L;
    public final C0075e M;
    public MediaDescriptionCompat N;
    public d O;
    public Bitmap P;
    public Uri Q;
    public boolean R;
    public Bitmap S;
    public int T;
    public final boolean U;
    public final fx10 h;
    public final g i;
    public ex10 j;
    public fx10.h k;
    public final ArrayList l;
    public final ArrayList m;
    public final ArrayList n;
    public final ArrayList o;
    public final Context p;
    public boolean q;
    public boolean r;
    public long s;
    public final a t;
    public RecyclerView u;
    public h v;
    public j w;
    public HashMap x;
    public fx10.h y;
    public HashMap z;

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            e eVar = e.this;
            if (i == 1) {
                eVar.v();
            } else if (i == 2 && eVar.y != null) {
                eVar.y = null;
                eVar.w();
            }
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            e.this.dismiss();
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            e eVar = e.this;
            if (eVar.k.g()) {
                eVar.h.getClass();
                fx10.k(2);
            }
            eVar.dismiss();
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    public class d extends AsyncTask<Void, Void, Bitmap> {
        public final Bitmap a;
        public final Uri b;
        public int c;

        public d() {
            MediaDescriptionCompat mediaDescriptionCompat = e.this.N;
            Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
            if (iconBitmap != null && iconBitmap.isRecycled()) {
                iconBitmap = null;
            }
            this.a = iconBitmap;
            MediaDescriptionCompat mediaDescriptionCompat2 = e.this.N;
            this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : null;
        }

        public final BufferedInputStream a(Uri uri) throws IOException {
            InputStream openInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(lowerCase) || X3.i.b.equals(lowerCase)) {
                openInputStream = e.this.p.getContentResolver().openInputStream(uri);
            } else {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                openConnection.setConnectTimeout(30000);
                openConnection.setReadTimeout(30000);
                openInputStream = openConnection.getInputStream();
            }
            if (openInputStream == null) {
                return null;
            }
            return new BufferedInputStream(openInputStream);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
        
            if (r3 != null) goto L11;
         */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x001f: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:32), block:B:59:0x001f */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Bitmap doInBackground(Void[] voidArr) {
            InputStream inputStream;
            BufferedInputStream bufferedInputStream;
            InputStream inputStream2 = null;
            Bitmap bitmap = this.a;
            if (bitmap == null) {
                Uri uri = this.b;
                try {
                    if (uri != null) {
                        try {
                            bufferedInputStream = a(uri);
                            try {
                                try {
                                    if (bufferedInputStream == null) {
                                        Objects.toString(uri);
                                    } else {
                                        BitmapFactory.Options options = new BitmapFactory.Options();
                                        options.inJustDecodeBounds = true;
                                        BitmapFactory.decodeStream(bufferedInputStream, null, options);
                                        if (options.outWidth != 0 && options.outHeight != 0) {
                                            try {
                                                bufferedInputStream.reset();
                                            } catch (IOException unused) {
                                                bufferedInputStream.close();
                                                bufferedInputStream = a(uri);
                                                if (bufferedInputStream == null) {
                                                    Objects.toString(uri);
                                                    if (bufferedInputStream == null) {
                                                        return null;
                                                    }
                                                }
                                            }
                                            options.inJustDecodeBounds = false;
                                            options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / e.this.p.getResources().getDimensionPixelSize(R.dimen.mr_cast_meta_art_size)));
                                            if (isCancelled()) {
                                                bufferedInputStream.close();
                                                return null;
                                            }
                                            bitmap = BitmapFactory.decodeStream(bufferedInputStream, null, options);
                                            try {
                                                bufferedInputStream.close();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                    }
                                    bufferedInputStream.close();
                                    return null;
                                } catch (IOException unused3) {
                                    return null;
                                }
                            } catch (IOException unused4) {
                                Objects.toString(uri);
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException unused5) {
                                    }
                                }
                                bitmap = null;
                                if (bitmap == null) {
                                }
                                if (bitmap != null) {
                                    sg90.b bVar = new sg90.b(bitmap);
                                    bVar.c = 1;
                                    List<sg90.d> list = bVar.b().a;
                                    this.c = Collections.unmodifiableList(list).isEmpty() ? 0 : ((sg90.d) Collections.unmodifiableList(list).get(0)).d;
                                }
                                return bitmap;
                            }
                        } catch (IOException unused6) {
                            bufferedInputStream = null;
                        } catch (Throwable th) {
                            th = th;
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (IOException unused7) {
                                }
                            }
                            throw th;
                        }
                    }
                    bitmap = null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                }
            }
            if (bitmap == null && bitmap.isRecycled()) {
                Objects.toString(bitmap);
                return null;
            }
            if (bitmap != null && bitmap.getWidth() < bitmap.getHeight()) {
                sg90.b bVar2 = new sg90.b(bitmap);
                bVar2.c = 1;
                List<sg90.d> list2 = bVar2.b().a;
                this.c = Collections.unmodifiableList(list2).isEmpty() ? 0 : ((sg90.d) Collections.unmodifiableList(list2).get(0)).d;
            }
            return bitmap;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            e eVar = e.this;
            eVar.O = null;
            Bitmap bitmap3 = eVar.P;
            Bitmap bitmap4 = this.a;
            boolean equals = Objects.equals(bitmap3, bitmap4);
            Uri uri = this.b;
            if (equals && Objects.equals(eVar.Q, uri)) {
                return;
            }
            eVar.P = bitmap4;
            eVar.S = bitmap2;
            eVar.Q = uri;
            eVar.T = this.c;
            eVar.R = true;
            eVar.t();
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            e eVar = e.this;
            eVar.R = false;
            eVar.S = null;
            eVar.T = 0;
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    /* renamed from: androidx.mediarouter.app.e$e, reason: collision with other inner class name */
    public final class C0075e extends MediaControllerCompat.Callback {
        public C0075e() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public final void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            MediaDescriptionCompat description = mediaMetadataCompat == null ? null : mediaMetadataCompat.getDescription();
            e eVar = e.this;
            eVar.N = description;
            eVar.o();
            eVar.t();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public final void onSessionDestroyed() {
            e eVar = e.this;
            MediaControllerCompat mediaControllerCompat = eVar.L;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.unregisterCallback(eVar.M);
                eVar.L = null;
            }
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    public abstract class f extends RecyclerView.e0 {
        public fx10.h l;
        public final ImageButton m;
        public final MediaRouteVolumeSlider n;

        /* compiled from: MediaRouteDynamicControllerDialog.java */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int max;
                f fVar = f.this;
                e eVar = e.this;
                if (eVar.y != null) {
                    eVar.t.removeMessages(2);
                }
                eVar.y = fVar.l;
                boolean isActivated = view.isActivated();
                boolean z = !isActivated;
                if (isActivated) {
                    Integer num = (Integer) eVar.z.get(fVar.l.c);
                    max = num == null ? 1 : Math.max(1, num.intValue());
                } else {
                    max = 0;
                }
                fVar.W5(z);
                fVar.n.setProgress(max);
                fVar.l.j(max);
                eVar.t.sendEmptyMessageDelayed(2, 500L);
            }
        }

        public f(View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
            super(view);
            int color;
            int color2;
            this.m = imageButton;
            this.n = mediaRouteVolumeSlider;
            Context context = e.this.p;
            Drawable a2 = m33.a(R.drawable.mr_cast_mute_button, context);
            if (sx10.h(context)) {
                a2.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
            }
            imageButton.setImageDrawable(a2);
            Context context2 = e.this.p;
            if (sx10.h(context2)) {
                color = context2.getColor(R.color.mr_cast_progressbar_progress_and_thumb_light);
                color2 = context2.getColor(R.color.mr_cast_progressbar_background_light);
            } else {
                color = context2.getColor(R.color.mr_cast_progressbar_progress_and_thumb_dark);
                color2 = context2.getColor(R.color.mr_cast_progressbar_background_dark);
            }
            mediaRouteVolumeSlider.a(color, color2);
        }

        public final void V5(fx10.h hVar) {
            this.l = hVar;
            int i = hVar.p;
            boolean z = i == 0;
            ImageButton imageButton = this.m;
            imageButton.setActivated(z);
            imageButton.setOnClickListener(new a());
            fx10.h hVar2 = this.l;
            MediaRouteVolumeSlider mediaRouteVolumeSlider = this.n;
            mediaRouteVolumeSlider.setTag(hVar2);
            mediaRouteVolumeSlider.setMax(hVar.q);
            mediaRouteVolumeSlider.setProgress(i);
            mediaRouteVolumeSlider.setOnSeekBarChangeListener(e.this.w);
        }

        public final void W5(boolean z) {
            ImageButton imageButton = this.m;
            if (imageButton.isActivated() == z) {
                return;
            }
            imageButton.setActivated(z);
            e eVar = e.this;
            if (z) {
                eVar.z.put(this.l.c, Integer.valueOf(this.n.getProgress()));
            } else {
                eVar.z.remove(this.l.c);
            }
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    public final class g extends fx10.a {
        public g() {
        }

        @Override // xsna.fx10.a
        public final void onRouteAdded(@NonNull fx10 fx10Var, @NonNull fx10.h hVar) {
            e.this.v();
        }

        @Override // xsna.fx10.a
        public final void onRouteChanged(@NonNull fx10 fx10Var, @NonNull fx10.h hVar) {
            fx10.d a;
            e eVar = e.this;
            if (hVar == eVar.k) {
                hVar.getClass();
                if (fx10.h.b() != null) {
                    fx10.g gVar = hVar.a;
                    gVar.getClass();
                    fx10.b();
                    for (fx10.h hVar2 : Collections.unmodifiableList(gVar.b)) {
                        if (!Collections.unmodifiableList(eVar.k.v).contains(hVar2) && (a = eVar.k.a()) != null && a.o(hVar2) && !eVar.m.contains(hVar2)) {
                            eVar.w();
                            eVar.u();
                            return;
                        }
                    }
                }
            }
            eVar.v();
        }

        @Override // xsna.fx10.a
        public final void onRouteRemoved(@NonNull fx10 fx10Var, @NonNull fx10.h hVar) {
            e.this.v();
        }

        @Override // xsna.fx10.a
        public final void onRouteSelected(@NonNull fx10 fx10Var, @NonNull fx10.h hVar) {
            e eVar = e.this;
            eVar.k = hVar;
            eVar.w();
            eVar.u();
        }

        @Override // xsna.fx10.a
        public final void onRouteUnselected(@NonNull fx10 fx10Var, @NonNull fx10.h hVar) {
            e.this.v();
        }

        @Override // xsna.fx10.a
        public final void onRouteVolumeChanged(@NonNull fx10 fx10Var, @NonNull fx10.h hVar) {
            f fVar;
            int i = hVar.p;
            int i2 = e.V;
            e eVar = e.this;
            if (eVar.y == hVar || (fVar = (f) eVar.x.get(hVar.c)) == null) {
                return;
            }
            int i3 = fVar.l.p;
            fVar.W5(i3 == 0);
            fVar.n.setProgress(i3);
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    public static final class i implements Comparator<fx10.h> {
        public static final i b = new i();

        @Override // java.util.Comparator
        public final int compare(fx10.h hVar, fx10.h hVar2) {
            return hVar.d.compareToIgnoreCase(hVar2.d);
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    public class j implements SeekBar.OnSeekBarChangeListener {
        public j() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                fx10.h hVar = (fx10.h) seekBar.getTag();
                f fVar = (f) e.this.x.get(hVar.c);
                if (fVar != null) {
                    fVar.W5(i == 0);
                }
                hVar.j(i);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            e eVar = e.this;
            if (eVar.y != null) {
                eVar.t.removeMessages(2);
            }
            eVar.y = (fx10.h) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            e.this.t.sendEmptyMessageDelayed(2, 500L);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(@NonNull Context context) {
        super(r2, r0 == 0 ? sx10.e(r2) : r0);
        ContextThemeWrapper a2 = sx10.a(context, false);
        int g2 = sx10.g(R.attr.mediaRouteTheme, a2);
        this.j = ex10.c;
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.t = new a();
        Context context2 = getContext();
        this.p = context2;
        this.h = fx10.d(context2);
        this.U = fx10.g();
        this.i = new g();
        this.k = fx10.f();
        this.M = new C0075e();
        p(fx10.e());
    }

    public final void n(@NonNull List<fx10.h> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            fx10.h hVar = list.get(size);
            if (hVar.d() || !hVar.g || !hVar.h(this.j) || this.k == hVar) {
                list.remove(size);
            }
        }
    }

    public final void o() {
        MediaDescriptionCompat mediaDescriptionCompat = this.N;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.N;
        Uri iconUri = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : null;
        d dVar = this.O;
        Bitmap bitmap = dVar == null ? this.P : dVar.a;
        Uri uri = dVar == null ? this.Q : dVar.b;
        if (bitmap != iconBitmap || (bitmap == null && !Objects.equals(uri, iconUri))) {
            d dVar2 = this.O;
            if (dVar2 != null) {
                dVar2.cancel(true);
            }
            d dVar3 = new d();
            this.O = dVar3;
            dVar3.execute(new Void[0]);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r = true;
        this.h.a(this.j, this.i, 1);
        u();
        p(fx10.e());
    }

    @Override // xsna.b33, xsna.y8i, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_cast_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.p;
        decorView.setBackgroundColor(context.getColor(sx10.h(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_cast_close_button);
        this.D = imageButton;
        imageButton.setColorFilter(-1);
        this.D.setOnClickListener(new b());
        Button button = (Button) findViewById(R.id.mr_cast_stop_button);
        this.E = button;
        button.setTextColor(-1);
        this.E.setOnClickListener(new c());
        this.v = new h();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_cast_list);
        this.u = recyclerView;
        recyclerView.setAdapter(this.v);
        this.u.setLayoutManager(new LinearLayoutManager());
        this.w = new j();
        this.x = new HashMap();
        this.z = new HashMap();
        this.F = (ImageView) findViewById(R.id.mr_cast_meta_background);
        this.G = findViewById(R.id.mr_cast_meta_black_scrim);
        this.H = (ImageView) findViewById(R.id.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(R.id.mr_cast_meta_title);
        this.I = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(R.id.mr_cast_meta_subtitle);
        this.J = textView2;
        textView2.setTextColor(-1);
        this.K = context.getResources().getString(R.string.mr_cast_dialog_title_view_placeholder);
        this.q = true;
        r();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r = false;
        this.h.h(this.i);
        this.t.removeCallbacksAndMessages(null);
        p(null);
    }

    public final void p(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.L;
        C0075e c0075e = this.M;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(c0075e);
            this.L = null;
        }
        if (token != null && this.r) {
            MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.p, token);
            this.L = mediaControllerCompat2;
            mediaControllerCompat2.registerCallback(c0075e);
            MediaMetadataCompat metadata = this.L.getMetadata();
            this.N = metadata != null ? metadata.getDescription() : null;
            o();
            t();
        }
    }

    public final void q(@NonNull ex10 ex10Var) {
        if (ex10Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.j.equals(ex10Var)) {
            return;
        }
        this.j = ex10Var;
        if (this.r) {
            fx10 fx10Var = this.h;
            g gVar = this.i;
            fx10Var.h(gVar);
            fx10Var.a(ex10Var, gVar, 1);
            u();
        }
    }

    public final void r() {
        Context context = this.p;
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : xw10.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        this.P = null;
        this.Q = null;
        o();
        t();
        v();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t() {
        boolean isEmpty;
        boolean isEmpty2;
        if ((this.y != null || this.A) ? true : !this.q) {
            this.C = true;
            return;
        }
        this.C = false;
        if (!this.k.g() || this.k.d()) {
            dismiss();
        }
        if (this.R) {
            Bitmap bitmap = this.S;
            if (!(bitmap != null && bitmap.isRecycled()) && this.S != null) {
                this.H.setVisibility(0);
                this.H.setImageBitmap(this.S);
                this.H.setBackgroundColor(this.T);
                this.G.setVisibility(0);
                Bitmap bitmap2 = this.S;
                RenderScript create = RenderScript.create(this.p);
                Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap2);
                Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
                ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                create2.setRadius(10.0f);
                create2.setInput(createFromBitmap);
                create2.forEach(createTyped);
                Bitmap copy = bitmap2.copy(bitmap2.getConfig(), true);
                createTyped.copyTo(copy);
                createFromBitmap.destroy();
                createTyped.destroy();
                create2.destroy();
                create.destroy();
                this.F.setImageBitmap(copy);
                this.R = false;
                this.S = null;
                this.T = 0;
                MediaDescriptionCompat mediaDescriptionCompat = this.N;
                CharSequence title = mediaDescriptionCompat != null ? null : mediaDescriptionCompat.getTitle();
                isEmpty = TextUtils.isEmpty(title);
                MediaDescriptionCompat mediaDescriptionCompat2 = this.N;
                CharSequence subtitle = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getSubtitle() : null;
                isEmpty2 = TextUtils.isEmpty(subtitle);
                if (isEmpty) {
                    this.I.setText(title);
                } else {
                    this.I.setText(this.K);
                }
                if (!isEmpty2) {
                    this.J.setVisibility(8);
                    return;
                } else {
                    this.J.setText(subtitle);
                    this.J.setVisibility(0);
                    return;
                }
            }
        }
        Bitmap bitmap3 = this.S;
        if (bitmap3 != null && bitmap3.isRecycled()) {
            Objects.toString(this.S);
        }
        this.H.setVisibility(8);
        this.G.setVisibility(8);
        this.F.setImageBitmap(null);
        this.R = false;
        this.S = null;
        this.T = 0;
        MediaDescriptionCompat mediaDescriptionCompat3 = this.N;
        if (mediaDescriptionCompat3 != null) {
        }
        isEmpty = TextUtils.isEmpty(title);
        MediaDescriptionCompat mediaDescriptionCompat22 = this.N;
        if (mediaDescriptionCompat22 != null) {
        }
        isEmpty2 = TextUtils.isEmpty(subtitle);
        if (isEmpty) {
        }
        if (!isEmpty2) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u() {
        ArrayList arrayList = this.l;
        arrayList.clear();
        ArrayList arrayList2 = this.m;
        arrayList2.clear();
        ArrayList arrayList3 = this.n;
        arrayList3.clear();
        arrayList.addAll(Collections.unmodifiableList(this.k.v));
        fx10.d a2 = this.k.a();
        if (a2 != null) {
            fx10.g gVar = this.k.a;
            gVar.getClass();
            fx10.b();
            for (fx10.h hVar : Collections.unmodifiableList(gVar.b)) {
                if (a2.o(hVar)) {
                    arrayList2.add(hVar);
                }
                bx10.b.a aVar = (bx10.b.a) a2.x.get(hVar.c);
                if (aVar != null && aVar.e) {
                    arrayList3.add(hVar);
                }
            }
        }
        n(arrayList2);
        n(arrayList3);
        i iVar = i.b;
        Collections.sort(arrayList, iVar);
        Collections.sort(arrayList2, iVar);
        Collections.sort(arrayList3, iVar);
        this.v.A0();
    }

    public final void v() {
        if (this.r) {
            if (SystemClock.uptimeMillis() - this.s < 300) {
                a aVar = this.t;
                aVar.removeMessages(1);
                aVar.sendEmptyMessageAtTime(1, this.s + 300);
                return;
            }
            if ((this.y != null || this.A) ? true : !this.q) {
                this.B = true;
                return;
            }
            this.B = false;
            if (!this.k.g() || this.k.d()) {
                dismiss();
            }
            this.s = SystemClock.uptimeMillis();
            this.v.z0();
        }
    }

    public final void w() {
        if (this.B) {
            v();
        }
        if (this.C) {
            t();
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    public final class h extends RecyclerView.Adapter<RecyclerView.e0> {
        public final ArrayList<f> c = new ArrayList<>();
        public final LayoutInflater d;
        public final Drawable e;
        public final Drawable f;
        public final Drawable g;
        public final Drawable h;
        public f i;
        public final int j;
        public final AccelerateDecelerateInterpolator k;

        /* compiled from: MediaRouteDynamicControllerDialog.java */
        public class a extends Animation {
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;
            public final /* synthetic */ View d;

            public a(int i, int i2, View view) {
                this.b = i;
                this.c = i2;
                this.d = view;
            }

            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                int i = this.b;
                int i2 = this.c + ((int) ((i - r0) * f));
                int i3 = e.V;
                View view = this.d;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i2;
                view.setLayoutParams(layoutParams);
            }
        }

        /* compiled from: MediaRouteDynamicControllerDialog.java */
        public class c extends RecyclerView.e0 {
            public final View l;
            public final ImageView m;
            public final ProgressBar n;
            public final TextView o;
            public final float p;
            public fx10.h q;

            public c(View view) {
                super(view);
                this.l = view;
                this.m = (ImageView) view.findViewById(R.id.mr_cast_group_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_group_progress_bar);
                this.n = progressBar;
                this.o = (TextView) view.findViewById(R.id.mr_cast_group_name);
                e eVar = e.this;
                this.p = sx10.c(eVar.p);
                sx10.i(eVar.p, progressBar);
            }
        }

        /* compiled from: MediaRouteDynamicControllerDialog.java */
        public class d extends f {
            public final TextView p;
            public final int q;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public d(View view) {
                super(view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
                e eVar = e.this;
                this.p = (TextView) view.findViewById(R.id.mr_group_volume_route_name);
                Resources resources = eVar.p.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(R.dimen.mr_dynamic_volume_group_list_item_height, typedValue, true);
                this.q = (int) typedValue.getDimension(displayMetrics);
            }
        }

        /* compiled from: MediaRouteDynamicControllerDialog.java */
        /* renamed from: androidx.mediarouter.app.e$h$e, reason: collision with other inner class name */
        public class C0076e extends RecyclerView.e0 {
            public final TextView l;

            public C0076e(View view) {
                super(view);
                this.l = (TextView) view.findViewById(R.id.mr_cast_header_name);
            }
        }

        /* compiled from: MediaRouteDynamicControllerDialog.java */
        public class f {
            public final Object a;
            public final int b;

            public f(Object obj, int i) {
                this.a = obj;
                this.b = i;
            }
        }

        /* compiled from: MediaRouteDynamicControllerDialog.java */
        public class g extends f {
            public final View p;
            public final ImageView q;
            public final ProgressBar r;
            public final TextView s;
            public final RelativeLayout t;
            public final CheckBox u;
            public final float v;
            public final int w;
            public final a x;

            /* compiled from: MediaRouteDynamicControllerDialog.java */
            public class a implements View.OnClickListener {
                public a() {
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g gVar = g.this;
                    h hVar = h.this;
                    boolean a6 = gVar.a6(gVar.l);
                    boolean z = !a6;
                    boolean e = gVar.l.e();
                    if (a6) {
                        fx10 fx10Var = e.this.h;
                        fx10.h hVar2 = gVar.l;
                        fx10Var.getClass();
                        if (hVar2 == null) {
                            throw new NullPointerException("route must not be null");
                        }
                        fx10.b();
                        h1u c = fx10.c();
                        fx10.d a = c.d.a();
                        if (a != null) {
                            bx10.b.a aVar = (bx10.b.a) a.x.get(hVar2.c);
                            if (aVar == null || !aVar.c) {
                                hVar2.toString();
                            } else if (!Collections.unmodifiableList(a.v).contains(hVar2)) {
                                hVar2.toString();
                            } else if (Collections.unmodifiableList(a.v).size() > 1) {
                                if (a.g()) {
                                    bx10.e eVar = c.e;
                                    if (!(eVar instanceof bx10.b)) {
                                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                                    }
                                    ((bx10.b) eVar).n(hVar2.b);
                                } else if (a.n()) {
                                    c.f(a);
                                    a.toString();
                                } else {
                                    a.toString();
                                }
                            }
                        }
                    } else {
                        fx10 fx10Var2 = e.this.h;
                        fx10.h hVar3 = gVar.l;
                        fx10Var2.getClass();
                        if (hVar3 == null) {
                            throw new NullPointerException("route must not be null");
                        }
                        fx10.b();
                        h1u c2 = fx10.c();
                        fx10.d a2 = c2.d.a();
                        if (a2 != null) {
                            if (!a2.o(hVar3)) {
                                hVar3.toString();
                            } else if (Collections.unmodifiableList(a2.v).contains(hVar3)) {
                                hVar3.toString();
                            } else if (a2.g()) {
                                bx10.e eVar2 = c2.e;
                                if (!(eVar2 instanceof bx10.b)) {
                                    throw new IllegalStateException("There is no currently selected dynamic group route.");
                                }
                                ((bx10.b) eVar2).m(hVar3.b);
                            } else if (a2.n()) {
                                c2.f(a2);
                                a2.toString();
                            } else {
                                a2.toString();
                            }
                        }
                    }
                    gVar.b6(z, !e);
                    if (e) {
                        List unmodifiableList = Collections.unmodifiableList(e.this.k.v);
                        for (fx10.h hVar4 : Collections.unmodifiableList(gVar.l.v)) {
                            if (unmodifiableList.contains(hVar4) != z) {
                                f fVar = (f) e.this.x.get(hVar4.c);
                                if (fVar instanceof g) {
                                    ((g) fVar).b6(z, true);
                                }
                            }
                        }
                    }
                    e eVar3 = e.this;
                    fx10.h hVar5 = gVar.l;
                    List unmodifiableList2 = Collections.unmodifiableList(eVar3.k.v);
                    int max = Math.max(1, unmodifiableList2.size());
                    if (hVar5.e()) {
                        Iterator it = Collections.unmodifiableList(hVar5.v).iterator();
                        while (it.hasNext()) {
                            if (unmodifiableList2.contains((fx10.h) it.next()) != z) {
                                max += !a6 ? 1 : -1;
                            }
                        }
                    } else {
                        max += a6 ? -1 : 1;
                    }
                    boolean z2 = eVar3.U && Collections.unmodifiableList(eVar3.k.v).size() > 1;
                    boolean z3 = eVar3.U && max >= 2;
                    if (z2 != z3) {
                        RecyclerView.e0 findViewHolderForAdapterPosition = eVar3.u.findViewHolderForAdapterPosition(0);
                        if (findViewHolderForAdapterPosition instanceof d) {
                            d dVar = (d) findViewHolderForAdapterPosition;
                            hVar.x0(z3 ? dVar.q : 0, dVar.itemView);
                        }
                    }
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public g(View view) {
                super(view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
                e eVar = e.this;
                this.x = new a();
                this.p = view;
                this.q = (ImageView) view.findViewById(R.id.mr_cast_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_route_progress_bar);
                this.r = progressBar;
                this.s = (TextView) view.findViewById(R.id.mr_cast_route_name);
                this.t = (RelativeLayout) view.findViewById(R.id.mr_cast_volume_layout);
                CheckBox checkBox = (CheckBox) view.findViewById(R.id.mr_cast_checkbox);
                this.u = checkBox;
                Context context = eVar.p;
                Drawable a2 = m33.a(R.drawable.mr_cast_checkbox, context);
                if (sx10.h(context)) {
                    a2.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
                }
                checkBox.setButtonDrawable(a2);
                sx10.i(eVar.p, progressBar);
                this.v = sx10.c(eVar.p);
                Resources resources = eVar.p.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(R.dimen.mr_dynamic_dialog_row_height, typedValue, true);
                this.w = (int) typedValue.getDimension(displayMetrics);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final boolean a6(fx10.h hVar) {
                if (hVar.g()) {
                    return true;
                }
                fx10.d a2 = e.this.k.a();
                if (a2 == null) {
                    return false;
                }
                bx10.b.a aVar = (bx10.b.a) a2.x.get(hVar.c);
                return (aVar != null ? aVar.b : 4) == 3;
            }

            public final void b6(boolean z, boolean z2) {
                CheckBox checkBox = this.u;
                checkBox.setEnabled(false);
                this.p.setEnabled(false);
                checkBox.setChecked(z);
                if (z) {
                    this.q.setVisibility(4);
                    this.r.setVisibility(0);
                }
                if (z2) {
                    h.this.x0(z ? this.w : 0, this.t);
                }
            }
        }

        public h() {
            this.d = LayoutInflater.from(e.this.p);
            Context context = e.this.p;
            this.e = sx10.d(R.attr.mediaRouteDefaultIconDrawable, context);
            this.f = sx10.d(R.attr.mediaRouteTvIconDrawable, context);
            this.g = sx10.d(R.attr.mediaRouteSpeakerIconDrawable, context);
            this.h = sx10.d(R.attr.mediaRouteSpeakerGroupIconDrawable, context);
            this.j = context.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
            this.k = new AccelerateDecelerateInterpolator();
            A0();
        }

        public final void A0() {
            ArrayList<f> arrayList = this.c;
            arrayList.clear();
            e eVar = e.this;
            ArrayList arrayList2 = eVar.n;
            ArrayList arrayList3 = eVar.m;
            this.i = new f(eVar.k, 1);
            ArrayList arrayList4 = eVar.l;
            if (arrayList4.isEmpty()) {
                arrayList.add(new f(eVar.k, 3));
            } else {
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    arrayList.add(new f((fx10.h) it.next(), 3));
                }
            }
            boolean z = false;
            if (!arrayList3.isEmpty()) {
                Iterator it2 = arrayList3.iterator();
                boolean z2 = false;
                while (it2.hasNext()) {
                    fx10.h hVar = (fx10.h) it2.next();
                    if (!arrayList4.contains(hVar)) {
                        if (!z2) {
                            eVar.k.getClass();
                            bx10.b b2 = fx10.h.b();
                            String j = b2 != null ? b2.j() : null;
                            if (TextUtils.isEmpty(j)) {
                                j = eVar.p.getString(R.string.mr_dialog_groupable_header);
                            }
                            arrayList.add(new f(j, 2));
                            z2 = true;
                        }
                        arrayList.add(new f(hVar, 3));
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    fx10.h hVar2 = (fx10.h) it3.next();
                    fx10.h hVar3 = eVar.k;
                    if (hVar3 != hVar2) {
                        if (!z) {
                            hVar3.getClass();
                            bx10.b b3 = fx10.h.b();
                            String k = b3 != null ? b3.k() : null;
                            if (TextUtils.isEmpty(k)) {
                                k = eVar.p.getString(R.string.mr_dialog_transferable_header);
                            }
                            arrayList.add(new f(k, 2));
                            z = true;
                        }
                        arrayList.add(new f(hVar2, 4));
                    }
                }
            }
            z0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.c.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            f fVar;
            if (i == 0) {
                fVar = this.i;
            } else {
                fVar = this.c.get(i - 1);
            }
            return fVar.b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(@NonNull RecyclerView.e0 e0Var, int i) {
            fx10.d a2;
            bx10.b.a aVar;
            ArrayList<f> arrayList = this.c;
            int i2 = (i == 0 ? this.i : arrayList.get(i - 1)).b;
            f fVar = i == 0 ? this.i : arrayList.get(i - 1);
            e eVar = e.this;
            int i3 = 0;
            if (i2 == 1) {
                eVar.x.put(((fx10.h) fVar.a).c, (f) e0Var);
                d dVar = (d) e0Var;
                View view = dVar.itemView;
                e eVar2 = e.this;
                if (eVar2.U && Collections.unmodifiableList(eVar2.k.v).size() > 1) {
                    i3 = dVar.q;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i3;
                view.setLayoutParams(layoutParams);
                fx10.h hVar = (fx10.h) fVar.a;
                dVar.V5(hVar);
                dVar.p.setText(hVar.d);
                return;
            }
            if (i2 == 2) {
                C0076e c0076e = (C0076e) e0Var;
                c0076e.getClass();
                c0076e.l.setText(fVar.a.toString());
                return;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException();
                }
                c cVar = (c) e0Var;
                View view2 = cVar.l;
                fx10.h hVar2 = (fx10.h) fVar.a;
                cVar.q = hVar2;
                ImageView imageView = cVar.m;
                imageView.setVisibility(0);
                cVar.n.setVisibility(4);
                h hVar3 = h.this;
                List unmodifiableList = Collections.unmodifiableList(e.this.k.v);
                view2.setAlpha((unmodifiableList.size() == 1 && unmodifiableList.get(0) == hVar2) ? cVar.p : 1.0f);
                view2.setOnClickListener(new androidx.mediarouter.app.f(cVar));
                imageView.setImageDrawable(hVar3.y0(hVar2));
                cVar.o.setText(hVar2.d);
                return;
            }
            eVar.x.put(((fx10.h) fVar.a).c, (f) e0Var);
            g gVar = (g) e0Var;
            float f2 = gVar.v;
            g.a aVar2 = gVar.x;
            ImageView imageView2 = gVar.q;
            View view3 = gVar.p;
            CheckBox checkBox = gVar.u;
            fx10.h hVar4 = (fx10.h) fVar.a;
            h hVar5 = h.this;
            e eVar3 = e.this;
            if (hVar4 == eVar3.k && Collections.unmodifiableList(hVar4.v).size() > 0) {
                Iterator it = Collections.unmodifiableList(hVar4.v).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    fx10.h hVar6 = (fx10.h) it.next();
                    if (!eVar3.m.contains(hVar6)) {
                        hVar4 = hVar6;
                        break;
                    }
                }
            }
            gVar.V5(hVar4);
            imageView2.setImageDrawable(hVar5.y0(hVar4));
            gVar.s.setText(hVar4.d);
            checkBox.setVisibility(0);
            boolean a6 = gVar.a6(hVar4);
            boolean z = !eVar3.o.contains(hVar4) && (!gVar.a6(hVar4) || Collections.unmodifiableList(eVar3.k.v).size() >= 2) && !(gVar.a6(hVar4) && ((a2 = eVar3.k.a()) == null || (aVar = (bx10.b.a) a2.x.get(hVar4.c)) == null || !aVar.c));
            checkBox.setChecked(a6);
            gVar.r.setVisibility(4);
            imageView2.setVisibility(0);
            view3.setEnabled(z);
            checkBox.setEnabled(z);
            gVar.m.setEnabled(z || a6);
            gVar.n.setEnabled(z || a6);
            view3.setOnClickListener(aVar2);
            checkBox.setOnClickListener(aVar2);
            RelativeLayout relativeLayout = gVar.t;
            if (a6 && !gVar.l.e()) {
                i3 = gVar.w;
            }
            ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
            layoutParams2.height = i3;
            relativeLayout.setLayoutParams(layoutParams2);
            view3.setAlpha((z || a6) ? 1.0f : f2);
            checkBox.setAlpha((z || !a6) ? 1.0f : f2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public final RecyclerView.e0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflater = this.d;
            if (i == 1) {
                return new d(layoutInflater.inflate(R.layout.mr_cast_group_volume_item, viewGroup, false));
            }
            if (i == 2) {
                return new C0076e(layoutInflater.inflate(R.layout.mr_cast_header_item, viewGroup, false));
            }
            if (i == 3) {
                return new g(layoutInflater.inflate(R.layout.mr_cast_route_item, viewGroup, false));
            }
            if (i == 4) {
                return new c(layoutInflater.inflate(R.layout.mr_cast_group_item, viewGroup, false));
            }
            throw new IllegalStateException();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewRecycled(@NonNull RecyclerView.e0 e0Var) {
            super.onViewRecycled(e0Var);
            e.this.x.values().remove(e0Var);
        }

        public final void x0(int i, View view) {
            a aVar = new a(i, view.getLayoutParams().height, view);
            aVar.setAnimationListener(new b());
            aVar.setDuration(this.j);
            aVar.setInterpolator(this.k);
            view.startAnimation(aVar);
        }

        public final Drawable y0(fx10.h hVar) {
            Uri uri = hVar.f;
            if (uri != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(e.this.p.getContentResolver().openInputStream(uri), null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException unused) {
                    uri.toString();
                }
            }
            int i = hVar.n;
            return i != 1 ? i != 2 ? hVar.e() ? this.h : this.e : this.g : this.f;
        }

        public final void z0() {
            e eVar = e.this;
            ArrayList arrayList = eVar.o;
            arrayList.clear();
            ArrayList arrayList2 = eVar.m;
            ArrayList arrayList3 = new ArrayList();
            fx10.d a2 = eVar.k.a();
            if (a2 != null) {
                fx10.g gVar = eVar.k.a;
                gVar.getClass();
                fx10.b();
                for (fx10.h hVar : Collections.unmodifiableList(gVar.b)) {
                    if (a2.o(hVar)) {
                        arrayList3.add(hVar);
                    }
                }
            }
            HashSet hashSet = new HashSet(arrayList2);
            hashSet.removeAll(arrayList3);
            arrayList.addAll(hashSet);
            notifyDataSetChanged();
        }

        /* compiled from: MediaRouteDynamicControllerDialog.java */
        public class b implements Animation.AnimationListener {
            public b() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                e eVar = e.this;
                eVar.A = false;
                eVar.w();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                e.this.A = true;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }
        }
    }
}
