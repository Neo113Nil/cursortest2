package androidx.mediarouter.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.mediarouter.app.OverlayListView;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import xsna.ex10;
import xsna.fx10;
import xsna.n8g;
import xsna.rw10;
import xsna.sg90;
import xsna.sx10;
import xsna.tf3;
import xsna.tw10;
import xsna.uq;
import xsna.xw10;

/* compiled from: MediaRouteControllerDialog.java */
/* loaded from: classes12.dex */
public final class b extends androidx.appcompat.app.d {
    public static final int r0 = (int) TimeUnit.SECONDS.toMillis(30);
    public final boolean A;
    public final boolean B;
    public LinearLayout C;
    public RelativeLayout D;
    public LinearLayout E;
    public View F;
    public OverlayListView G;
    public l H;
    public ArrayList I;
    public HashSet J;
    public HashSet K;
    public HashSet L;
    public SeekBar M;
    public k N;
    public fx10.h O;
    public int P;
    public int Q;
    public int R;
    public final int S;
    public HashMap T;
    public MediaControllerCompat U;
    public final i V;
    public PlaybackStateCompat W;
    public MediaDescriptionCompat X;
    public h Y;
    public Bitmap Z;
    public Uri a0;
    public boolean b0;
    public Bitmap c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public final fx10 i;
    public boolean i0;
    public final j j;
    public int j0;
    public final fx10.h k;
    public int k0;
    public final Context l;
    public int l0;
    public boolean m;
    public Interpolator m0;
    public boolean n;
    public final Interpolator n0;
    public int o;
    public final Interpolator o0;
    public Button p;
    public final AccessibilityManager p0;
    public Button q;
    public final a q0;
    public ImageButton r;
    public MediaRouteExpandCollapseButton s;
    public FrameLayout t;
    public LinearLayout u;
    public FrameLayout v;
    public ImageView w;
    public TextView x;
    public TextView y;
    public TextView z;

    /* compiled from: MediaRouteControllerDialog.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.q(true);
            bVar.G.requestLayout();
            bVar.G.getViewTreeObserver().addOnGlobalLayoutListener(new rw10(bVar));
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* renamed from: androidx.mediarouter.app.b$b, reason: collision with other inner class name */
    public class ViewOnClickListenerC0074b implements View.OnClickListener {
        public ViewOnClickListenerC0074b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.this.dismiss();
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PendingIntent sessionActivity;
            b bVar = b.this;
            MediaControllerCompat mediaControllerCompat = bVar.U;
            if (mediaControllerCompat == null || (sessionActivity = mediaControllerCompat.getSessionActivity()) == null) {
                return;
            }
            try {
                sessionActivity.send();
                bVar.dismiss();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
            }
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b bVar = b.this;
            boolean z = bVar.g0;
            bVar.g0 = !z;
            if (!z) {
                bVar.G.setVisibility(0);
            }
            bVar.m0 = bVar.g0 ? bVar.n0 : bVar.o0;
            bVar.C(true);
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    public class f implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ boolean b;

        public f(boolean z) {
            this.b = z;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            int i;
            HashMap hashMap;
            HashMap hashMap2;
            Bitmap bitmap;
            b bVar = b.this;
            bVar.v.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            if (bVar.h0) {
                bVar.i0 = true;
                return;
            }
            fx10.h hVar = bVar.k;
            int i2 = bVar.C.getLayoutParams().height;
            b.w(-1, bVar.C);
            bVar.D(bVar.p());
            View decorView = bVar.getWindow().getDecorView();
            decorView.measure(View.MeasureSpec.makeMeasureSpec(bVar.getWindow().getAttributes().width, 1073741824), 0);
            b.w(i2, bVar.C);
            if (!(bVar.w.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) bVar.w.getDrawable()).getBitmap()) == null) {
                i = 0;
            } else {
                i = bVar.t(bitmap.getWidth(), bitmap.getHeight());
                bVar.w.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
            }
            int u = bVar.u(bVar.p());
            int size = bVar.I.size();
            int size2 = bVar.v() ? Collections.unmodifiableList(hVar.v).size() * bVar.Q : 0;
            if (size > 0) {
                size2 += bVar.S;
            }
            int min = Math.min(size2, bVar.R);
            if (!bVar.g0) {
                min = 0;
            }
            int max = Math.max(i, min) + u;
            Rect rect = new Rect();
            decorView.getWindowVisibleDisplayFrame(rect);
            int height = rect.height() - (bVar.u.getMeasuredHeight() - bVar.v.getMeasuredHeight());
            if (i <= 0 || max > height) {
                if (bVar.C.getMeasuredHeight() + bVar.G.getLayoutParams().height >= bVar.v.getMeasuredHeight()) {
                    bVar.w.setVisibility(8);
                }
                max = min + u;
                i = 0;
            } else {
                bVar.w.setVisibility(0);
                b.w(i, bVar.w);
            }
            if (!bVar.p() || max > height) {
                bVar.D.setVisibility(8);
            } else {
                bVar.D.setVisibility(0);
            }
            bVar.D(bVar.D.getVisibility() == 0);
            int u2 = bVar.u(bVar.D.getVisibility() == 0);
            int max2 = Math.max(i, min) + u2;
            if (max2 > height) {
                min -= max2 - height;
            } else {
                height = max2;
            }
            bVar.C.clearAnimation();
            bVar.G.clearAnimation();
            bVar.v.clearAnimation();
            boolean z = this.b;
            if (z) {
                bVar.o(u2, bVar.C);
                bVar.o(min, bVar.G);
                bVar.o(height, bVar.v);
            } else {
                b.w(u2, bVar.C);
                b.w(min, bVar.G);
                b.w(height, bVar.v);
            }
            b.w(rect.height(), bVar.t);
            List unmodifiableList = Collections.unmodifiableList(hVar.v);
            if (unmodifiableList.isEmpty()) {
                bVar.I.clear();
                bVar.H.notifyDataSetChanged();
                return;
            }
            if (new HashSet(bVar.I).equals(new HashSet(unmodifiableList))) {
                bVar.H.notifyDataSetChanged();
                return;
            }
            if (z) {
                OverlayListView overlayListView = bVar.G;
                l lVar = bVar.H;
                hashMap = new HashMap();
                int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
                for (int i3 = 0; i3 < overlayListView.getChildCount(); i3++) {
                    fx10.h item = lVar.getItem(firstVisiblePosition + i3);
                    View childAt = overlayListView.getChildAt(i3);
                    hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
                }
            } else {
                hashMap = null;
            }
            if (z) {
                Context context = bVar.l;
                OverlayListView overlayListView2 = bVar.G;
                l lVar2 = bVar.H;
                hashMap2 = new HashMap();
                int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
                for (int i4 = 0; i4 < overlayListView2.getChildCount(); i4++) {
                    fx10.h item2 = lVar2.getItem(firstVisiblePosition2 + i4);
                    View childAt2 = overlayListView2.getChildAt(i4);
                    Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                    childAt2.draw(new Canvas(createBitmap));
                    hashMap2.put(item2, new BitmapDrawable(context.getResources(), createBitmap));
                }
            } else {
                hashMap2 = null;
            }
            ArrayList arrayList = bVar.I;
            HashSet hashSet = new HashSet(unmodifiableList);
            hashSet.removeAll(arrayList);
            bVar.J = hashSet;
            HashSet hashSet2 = new HashSet(bVar.I);
            hashSet2.removeAll(unmodifiableList);
            bVar.K = hashSet2;
            bVar.I.addAll(0, bVar.J);
            bVar.I.removeAll(bVar.K);
            bVar.H.notifyDataSetChanged();
            if (z && bVar.g0) {
                if (bVar.K.size() + bVar.J.size() > 0) {
                    bVar.G.setEnabled(false);
                    bVar.G.requestLayout();
                    bVar.h0 = true;
                    bVar.G.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.c(bVar, hashMap, hashMap2));
                    return;
                }
            }
            bVar.J = null;
            bVar.K = null;
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    public final class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i;
            PlaybackStateCompat playbackStateCompat;
            b bVar = b.this;
            AccessibilityManager accessibilityManager = bVar.p0;
            int id = view.getId();
            if (id == 16908313 || id == 16908314) {
                if (bVar.k.g()) {
                    fx10 fx10Var = bVar.i;
                    i = id == 16908313 ? 2 : 1;
                    fx10Var.getClass();
                    fx10.k(i);
                }
                bVar.dismiss();
                return;
            }
            if (id != R.id.mr_control_playback_ctrl) {
                if (id == R.id.mr_close) {
                    bVar.dismiss();
                    return;
                }
                return;
            }
            if (bVar.U == null || (playbackStateCompat = bVar.W) == null) {
                return;
            }
            int i2 = 0;
            i = playbackStateCompat.getState() != 3 ? 0 : 1;
            if (i != 0 && (bVar.W.getActions() & 514) != 0) {
                bVar.U.getTransportControls().pause();
                i2 = R.string.mr_controller_pause;
            } else if (i != 0 && (bVar.W.getActions() & 1) != 0) {
                bVar.U.getTransportControls().stop();
                i2 = R.string.mr_controller_stop;
            } else if (i == 0 && (bVar.W.getActions() & 516) != 0) {
                bVar.U.getTransportControls().play();
                i2 = R.string.mr_controller_play;
            }
            if (accessibilityManager == null || !accessibilityManager.isEnabled() || i2 == 0) {
                return;
            }
            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
            obtain.setPackageName(bVar.l.getPackageName());
            obtain.setClassName(g.class.getName());
            obtain.getText().add(bVar.l.getString(i2));
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    public class h extends AsyncTask<Void, Void, Bitmap> {
        public final Bitmap a;
        public final Uri b;
        public int c;
        public long d;

        public h() {
            MediaDescriptionCompat mediaDescriptionCompat = b.this.X;
            Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
            if (iconBitmap != null && iconBitmap.isRecycled()) {
                iconBitmap = null;
            }
            this.a = iconBitmap;
            MediaDescriptionCompat mediaDescriptionCompat2 = b.this.X;
            this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : null;
        }

        public final BufferedInputStream a(Uri uri) throws IOException {
            InputStream openInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(lowerCase) || X3.i.b.equals(lowerCase)) {
                openInputStream = b.this.l.getContentResolver().openInputStream(uri);
            } else {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                int i = b.r0;
                openConnection.setConnectTimeout(i);
                openConnection.setReadTimeout(i);
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
        /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
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
                                            options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / b.this.t(options.outWidth, options.outHeight)));
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
            b bVar = b.this;
            bVar.Y = null;
            Bitmap bitmap3 = bVar.Z;
            Bitmap bitmap4 = this.a;
            boolean equals = Objects.equals(bitmap3, bitmap4);
            Uri uri = this.b;
            if (equals && Objects.equals(bVar.a0, uri)) {
                return;
            }
            bVar.Z = bitmap4;
            bVar.c0 = bitmap2;
            bVar.a0 = uri;
            bVar.d0 = this.c;
            bVar.b0 = true;
            bVar.z(SystemClock.uptimeMillis() - this.d > 120);
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            this.d = SystemClock.uptimeMillis();
            b bVar = b.this;
            bVar.b0 = false;
            bVar.c0 = null;
            bVar.d0 = 0;
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    public final class i extends MediaControllerCompat.Callback {
        public i() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public final void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            MediaDescriptionCompat description = mediaMetadataCompat == null ? null : mediaMetadataCompat.getDescription();
            b bVar = b.this;
            bVar.X = description;
            bVar.A();
            bVar.z(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public final void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
            b bVar = b.this;
            bVar.W = playbackStateCompat;
            bVar.z(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public final void onSessionDestroyed() {
            b bVar = b.this;
            MediaControllerCompat mediaControllerCompat = bVar.U;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.unregisterCallback(bVar.V);
                bVar.U = null;
            }
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    public final class j extends fx10.a {
        public j() {
        }

        @Override // xsna.fx10.a
        public final void onRouteChanged(@NonNull fx10 fx10Var, @NonNull fx10.h hVar) {
            b.this.z(true);
        }

        @Override // xsna.fx10.a
        public final void onRouteUnselected(@NonNull fx10 fx10Var, @NonNull fx10.h hVar) {
            b.this.z(false);
        }

        @Override // xsna.fx10.a
        public final void onRouteVolumeChanged(@NonNull fx10 fx10Var, @NonNull fx10.h hVar) {
            b bVar = b.this;
            SeekBar seekBar = (SeekBar) bVar.T.get(hVar);
            int i = hVar.p;
            int i2 = b.r0;
            if (seekBar == null || bVar.O == hVar) {
                return;
            }
            seekBar.setProgress(i);
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    public class k implements SeekBar.OnSeekBarChangeListener {
        public final a b = new a();

        /* compiled from: MediaRouteControllerDialog.java */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                if (bVar.O != null) {
                    bVar.O = null;
                    if (bVar.e0) {
                        bVar.z(bVar.f0);
                    }
                }
            }
        }

        public k() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                fx10.h hVar = (fx10.h) seekBar.getTag();
                int i2 = b.r0;
                hVar.j(i);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            b bVar = b.this;
            if (bVar.O != null) {
                bVar.M.removeCallbacks(this.b);
            }
            bVar.O = (fx10.h) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            b.this.M.postDelayed(this.b, 500L);
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    public class l extends ArrayAdapter<fx10.h> {
        public final float b;

        public l(Context context, ArrayList arrayList) {
            super(context, 0, arrayList);
            this.b = sx10.c(context);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b4  */
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final View getView(int i, View view, ViewGroup viewGroup) {
            boolean z;
            b bVar = b.this;
            if (view == null) {
                view = tf3.b(viewGroup, R.layout.mr_controller_volume_item, viewGroup, false);
            } else {
                b.w(bVar.Q, (LinearLayout) view.findViewById(R.id.volume_item_container));
                View findViewById = view.findViewById(R.id.mr_volume_item_icon);
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                int i2 = bVar.P;
                layoutParams.width = i2;
                layoutParams.height = i2;
                findViewById.setLayoutParams(layoutParams);
            }
            fx10.h item = getItem(i);
            if (item != null) {
                boolean z2 = item.g;
                TextView textView = (TextView) view.findViewById(R.id.mr_name);
                textView.setEnabled(z2);
                textView.setText(item.d);
                MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
                Context context = viewGroup.getContext();
                OverlayListView overlayListView = bVar.G;
                int b = sx10.b(context);
                if (Color.alpha(b) != 255) {
                    b = n8g.i(b, ((Integer) overlayListView.getTag()).intValue());
                }
                mediaRouteVolumeSlider.a(b, b);
                mediaRouteVolumeSlider.setTag(item);
                bVar.T.put(item, mediaRouteVolumeSlider);
                mediaRouteVolumeSlider.b(!z2);
                mediaRouteVolumeSlider.setEnabled(z2);
                if (z2) {
                    if (bVar.A) {
                        if (((!item.e() || fx10.g()) ? item.o : 0) == 1) {
                            z = true;
                            if (z) {
                                mediaRouteVolumeSlider.setMax(100);
                                mediaRouteVolumeSlider.setProgress(100);
                                mediaRouteVolumeSlider.setEnabled(false);
                            } else {
                                mediaRouteVolumeSlider.setMax(item.q);
                                mediaRouteVolumeSlider.setProgress(item.p);
                                mediaRouteVolumeSlider.setOnSeekBarChangeListener(bVar.N);
                            }
                        }
                    }
                    z = false;
                    if (z) {
                    }
                }
                ((ImageView) view.findViewById(R.id.mr_volume_item_icon)).setAlpha(z2 ? 255 : (int) (this.b * 255.0f));
                ((LinearLayout) view.findViewById(R.id.volume_item_container)).setVisibility(bVar.L.contains(item) ? 4 : 0);
                HashSet hashSet = bVar.J;
                if (hashSet != null && hashSet.contains(item)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    alphaAnimation.setDuration(0L);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setFillAfter(true);
                    view.clearAnimation();
                    view.startAnimation(alphaAnimation);
                }
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(@NonNull Context context) {
        super(r4, r1 == 0 ? sx10.e(r4) : r1);
        ContextThemeWrapper a2 = sx10.a(context, true);
        int g2 = sx10.g(R.attr.mediaRouteTheme, a2);
        this.A = true;
        this.q0 = new a();
        Context context2 = getContext();
        this.l = context2;
        this.V = new i();
        this.i = fx10.d(context2);
        this.B = fx10.g();
        this.j = new j();
        this.k = fx10.f();
        x(fx10.e());
        this.S = context2.getResources().getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_padding_top);
        this.p0 = (AccessibilityManager) context2.getSystemService("accessibility");
        this.n0 = AnimationUtils.loadInterpolator(a2, R.interpolator.mr_linear_out_slow_in);
        this.o0 = AnimationUtils.loadInterpolator(a2, R.interpolator.mr_fast_out_slow_in);
    }

    public static void w(int i2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    public final void A() {
        MediaDescriptionCompat mediaDescriptionCompat = this.X;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.X;
        Uri iconUri = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : null;
        h hVar = this.Y;
        Bitmap bitmap = hVar == null ? this.Z : hVar.a;
        Uri uri = hVar == null ? this.a0 : hVar.b;
        if (bitmap == iconBitmap) {
            if (bitmap != null) {
                return;
            }
            if (uri != null && uri.equals(iconUri)) {
                return;
            }
            if (uri == null && iconUri == null) {
                return;
            }
        }
        if (!v() || this.B) {
            h hVar2 = this.Y;
            if (hVar2 != null) {
                hVar2.cancel(true);
            }
            h hVar3 = new h();
            this.Y = hVar3;
            hVar3.execute(new Void[0]);
        }
    }

    public final void B() {
        Context context = this.l;
        int a2 = xw10.a(context);
        getWindow().setLayout(a2, -2);
        View decorView = getWindow().getDecorView();
        this.o = (a2 - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = context.getResources();
        this.P = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.Q = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.R = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.Z = null;
        this.a0 = null;
        A();
        z(false);
    }

    public final void C(boolean z) {
        this.v.requestLayout();
        this.v.getViewTreeObserver().addOnGlobalLayoutListener(new f(z));
    }

    public final void D(boolean z) {
        int i2 = 0;
        this.F.setVisibility((this.E.getVisibility() == 0 && z) ? 0 : 8);
        LinearLayout linearLayout = this.C;
        if (this.E.getVisibility() == 8 && !z) {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
    }

    public final void o(int i2, View view) {
        tw10 tw10Var = new tw10(view.getLayoutParams().height, i2, view);
        tw10Var.setDuration(this.j0);
        tw10Var.setInterpolator(this.m0);
        view.startAnimation(tw10Var);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
        this.i.a(ex10.c, this.j, 2);
        x(fx10.e());
    }

    @Override // androidx.appcompat.app.d, xsna.b33, xsna.y8i, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setContentView(R.layout.mr_controller_material_dialog_b);
        findViewById(android.R.id.button3).setVisibility(8);
        g gVar = new g();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mr_expandable_area);
        this.t = frameLayout;
        frameLayout.setOnClickListener(new ViewOnClickListenerC0074b());
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mr_dialog_area);
        this.u = linearLayout;
        linearLayout.setOnClickListener(new c());
        Context context = this.l;
        int f2 = sx10.f(R.attr.colorPrimary, context);
        if (n8g.e(f2, sx10.f(android.R.attr.colorBackground, context)) < 3.0d) {
            f2 = sx10.f(R.attr.colorAccent, context);
        }
        Button button = (Button) findViewById(android.R.id.button2);
        this.p = button;
        button.setText(R.string.mr_controller_disconnect);
        this.p.setTextColor(f2);
        this.p.setOnClickListener(gVar);
        Button button2 = (Button) findViewById(android.R.id.button1);
        this.q = button2;
        button2.setText(R.string.mr_controller_stop_casting);
        this.q.setTextColor(f2);
        this.q.setOnClickListener(gVar);
        this.z = (TextView) findViewById(R.id.mr_name);
        ((ImageButton) findViewById(R.id.mr_close)).setOnClickListener(gVar);
        this.v = (FrameLayout) findViewById(R.id.mr_default_control);
        d dVar = new d();
        ImageView imageView = (ImageView) findViewById(R.id.mr_art);
        this.w = imageView;
        imageView.setOnClickListener(dVar);
        findViewById(R.id.mr_control_title_container).setOnClickListener(dVar);
        this.C = (LinearLayout) findViewById(R.id.mr_media_main_control);
        this.F = findViewById(R.id.mr_control_divider);
        this.D = (RelativeLayout) findViewById(R.id.mr_playback_control);
        this.x = (TextView) findViewById(R.id.mr_control_title);
        this.y = (TextView) findViewById(R.id.mr_control_subtitle);
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_control_playback_ctrl);
        this.r = imageButton;
        imageButton.setOnClickListener(gVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.mr_volume_control);
        this.E = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(R.id.mr_volume_slider);
        this.M = seekBar;
        fx10.h hVar = this.k;
        seekBar.setTag(hVar);
        k kVar = new k();
        this.N = kVar;
        this.M.setOnSeekBarChangeListener(kVar);
        this.G = (OverlayListView) findViewById(R.id.mr_volume_group_list);
        this.I = new ArrayList();
        l lVar = new l(this.G.getContext(), this.I);
        this.H = lVar;
        this.G.setAdapter((ListAdapter) lVar);
        this.L = new HashSet();
        LinearLayout linearLayout3 = this.C;
        OverlayListView overlayListView = this.G;
        boolean v = v();
        int f3 = sx10.f(R.attr.colorPrimary, context);
        int f4 = sx10.f(R.attr.colorPrimaryDark, context);
        if (v && sx10.b(context) == -570425344) {
            f4 = f3;
            f3 = -1;
        }
        linearLayout3.setBackgroundColor(f3);
        overlayListView.setBackgroundColor(f4);
        linearLayout3.setTag(Integer.valueOf(f3));
        overlayListView.setTag(Integer.valueOf(f4));
        MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) this.M;
        LinearLayout linearLayout4 = this.C;
        int b = sx10.b(context);
        if (Color.alpha(b) != 255) {
            b = n8g.i(b, ((Integer) linearLayout4.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(b, b);
        HashMap hashMap = new HashMap();
        this.T = hashMap;
        hashMap.put(hVar, this.M);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(R.id.mr_group_expand_collapse);
        this.s = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.j = new e();
        this.m0 = this.g0 ? this.n0 : this.o0;
        this.j0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.k0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.l0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
        this.m = true;
        B();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.i.h(this.j);
        x(null);
        this.n = false;
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.app.d, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, @NonNull KeyEvent keyEvent) {
        if (i2 != 25 && i2 != 24) {
            return super.onKeyDown(i2, keyEvent);
        }
        if (this.B || !this.g0) {
            this.k.k(i2 == 25 ? -1 : 1);
        }
        return true;
    }

    @Override // androidx.appcompat.app.d, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i2, @NonNull KeyEvent keyEvent) {
        if (i2 == 25 || i2 == 24) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    public final boolean p() {
        return (this.X == null && this.W == null) ? false : true;
    }

    public final void q(boolean z) {
        HashSet hashSet;
        int firstVisiblePosition = this.G.getFirstVisiblePosition();
        for (int i2 = 0; i2 < this.G.getChildCount(); i2++) {
            View childAt = this.G.getChildAt(i2);
            fx10.h item = this.H.getItem(firstVisiblePosition + i2);
            if (!z || (hashSet = this.J) == null || !hashSet.contains(item)) {
                ((LinearLayout) childAt.findViewById(R.id.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        Iterator it = this.G.b.iterator();
        while (it.hasNext()) {
            OverlayListView.a aVar = (OverlayListView.a) it.next();
            aVar.j = true;
            aVar.k = true;
            androidx.mediarouter.app.a aVar2 = aVar.l;
            if (aVar2 != null) {
                b bVar = aVar2.b;
                bVar.L.remove(aVar2.a);
                bVar.H.notifyDataSetChanged();
            }
        }
        if (z) {
            return;
        }
        r(false);
    }

    public final void r(boolean z) {
        this.J = null;
        this.K = null;
        this.h0 = false;
        if (this.i0) {
            this.i0 = false;
            C(z);
        }
        this.G.setEnabled(true);
    }

    public final int t(int i2, int i3) {
        return i2 >= i3 ? (int) (((this.o * i3) / i2) + 0.5f) : (int) uq.a(this.o, 9.0f, 16.0f, 0.5f);
    }

    public final int u(boolean z) {
        if (!z && this.E.getVisibility() != 0) {
            return 0;
        }
        int paddingBottom = this.C.getPaddingBottom() + this.C.getPaddingTop();
        if (z) {
            paddingBottom += this.D.getMeasuredHeight();
        }
        if (this.E.getVisibility() == 0) {
            paddingBottom += this.E.getMeasuredHeight();
        }
        return (z && this.E.getVisibility() == 0) ? this.F.getMeasuredHeight() + paddingBottom : paddingBottom;
    }

    public final boolean v() {
        fx10.h hVar = this.k;
        return hVar.e() && Collections.unmodifiableList(hVar.v).size() > 1;
    }

    public final void x(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.U;
        i iVar = this.V;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(iVar);
            this.U = null;
        }
        if (token != null && this.n) {
            MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.l, token);
            this.U = mediaControllerCompat2;
            mediaControllerCompat2.registerCallback(iVar);
            MediaMetadataCompat metadata = this.U.getMetadata();
            this.X = metadata != null ? metadata.getDescription() : null;
            this.W = this.U.getPlaybackState();
            A();
            z(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        PlaybackStateCompat playbackStateCompat;
        int i2;
        int i3;
        boolean z5 = true;
        if (this.O != null) {
            this.e0 = true;
            this.f0 = z | this.f0;
            return;
        }
        this.e0 = false;
        this.f0 = false;
        fx10.h hVar = this.k;
        if (!hVar.g() || hVar.d()) {
            dismiss();
            return;
        }
        if (this.m) {
            this.z.setText(hVar.d);
            this.p.setVisibility(hVar.j ? 0 : 8);
            if (this.b0) {
                Bitmap bitmap = this.c0;
                if (bitmap == null || !bitmap.isRecycled()) {
                    this.w.setImageBitmap(this.c0);
                    this.w.setBackgroundColor(this.d0);
                } else {
                    Objects.toString(this.c0);
                }
                this.b0 = false;
                this.c0 = null;
                this.d0 = 0;
            }
            boolean z6 = this.B;
            if (z6 || !v()) {
                if (!this.g0 || z6) {
                    if (this.A) {
                        if (((!hVar.e() || fx10.g()) ? hVar.o : 0) == 1) {
                            z2 = true;
                            if (z2) {
                                if (this.E.getVisibility() == 8) {
                                    this.E.setVisibility(0);
                                    this.M.setMax(hVar.q);
                                    this.M.setProgress(hVar.p);
                                    this.s.setVisibility(v() ? 0 : 8);
                                }
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                }
                this.E.setVisibility(8);
            } else {
                this.E.setVisibility(8);
                this.g0 = true;
                this.G.setVisibility(0);
                this.m0 = this.g0 ? this.n0 : this.o0;
                C(false);
            }
            if (p()) {
                MediaDescriptionCompat mediaDescriptionCompat = this.X;
                CharSequence title = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getTitle();
                boolean isEmpty = TextUtils.isEmpty(title);
                MediaDescriptionCompat mediaDescriptionCompat2 = this.X;
                CharSequence subtitle = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getSubtitle() : null;
                boolean isEmpty2 = TextUtils.isEmpty(subtitle);
                if (hVar.r != -1) {
                    this.x.setText(R.string.mr_controller_casting_screen);
                } else {
                    PlaybackStateCompat playbackStateCompat2 = this.W;
                    if (playbackStateCompat2 == null || playbackStateCompat2.getState() == 0) {
                        this.x.setText(R.string.mr_controller_no_media_selected);
                    } else if (isEmpty && isEmpty2) {
                        this.x.setText(R.string.mr_controller_no_info_available);
                    } else {
                        if (isEmpty) {
                            z3 = false;
                        } else {
                            this.x.setText(title);
                            z3 = true;
                        }
                        if (isEmpty2) {
                            z4 = false;
                        } else {
                            this.y.setText(subtitle);
                            z4 = true;
                        }
                        this.x.setVisibility(!z3 ? 0 : 8);
                        this.y.setVisibility(!z4 ? 0 : 8);
                        playbackStateCompat = this.W;
                        if (playbackStateCompat != null) {
                            boolean z7 = playbackStateCompat.getState() == 6 || this.W.getState() == 3;
                            Context context = this.r.getContext();
                            if (z7) {
                                if ((this.W.getActions() & 514) != 0) {
                                    i2 = R.attr.mediaRoutePauseDrawable;
                                    i3 = R.string.mr_controller_pause;
                                    this.r.setVisibility(z5 ? 0 : 8);
                                    if (z5) {
                                        this.r.setImageResource(sx10.g(i2, context));
                                        this.r.setContentDescription(context.getResources().getText(i3));
                                    }
                                }
                            }
                            if (z7) {
                                if ((this.W.getActions() & 1) != 0) {
                                    i2 = R.attr.mediaRouteStopDrawable;
                                    i3 = R.string.mr_controller_stop;
                                    this.r.setVisibility(z5 ? 0 : 8);
                                    if (z5) {
                                    }
                                }
                            }
                            if (!z7) {
                                if ((this.W.getActions() & 516) != 0) {
                                    i2 = R.attr.mediaRoutePlayDrawable;
                                    i3 = R.string.mr_controller_play;
                                    this.r.setVisibility(z5 ? 0 : 8);
                                    if (z5) {
                                    }
                                }
                            }
                            z5 = false;
                            i2 = 0;
                            i3 = 0;
                            this.r.setVisibility(z5 ? 0 : 8);
                            if (z5) {
                            }
                        }
                    }
                }
                z4 = false;
                z3 = true;
                this.x.setVisibility(!z3 ? 0 : 8);
                this.y.setVisibility(!z4 ? 0 : 8);
                playbackStateCompat = this.W;
                if (playbackStateCompat != null) {
                }
            }
            C(z);
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    public class c implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }
}
