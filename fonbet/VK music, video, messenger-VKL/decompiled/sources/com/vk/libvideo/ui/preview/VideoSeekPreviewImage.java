package com.vk.libvideo.ui.preview;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.vk.core.utils.newtork.b;
import com.vk.dto.common.TimelineThumbs;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.observable.o1;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import kotlin.Pair;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.asu0;
import xsna.eni0;
import xsna.epx;
import xsna.fk5;
import xsna.fnj;
import xsna.gzs;
import xsna.iah0;
import xsna.izs;
import xsna.j3z;
import xsna.j6l0;
import xsna.l4d0;
import xsna.m33;
import xsna.m6j0;
import xsna.mlh0;
import xsna.ow40;
import xsna.qca0;
import xsna.s0w0;
import xsna.s3q0;
import xsna.sxl0;
import xsna.xvl0;
import xsna.yo80;
import xsna.yzt;

/* compiled from: VideoSeekPreviewImage.kt */
/* loaded from: classes3.dex */
public final class VideoSeekPreviewImage extends m6j0 {
    public static final /* synthetic */ int G = 0;
    public boolean A;
    public gzs<s3q0> B;
    public Integer C;
    public int D;
    public TimelineThumbs E;
    public izs<? super Integer, ? extends x<Uri>> F;
    public final l4d0 u;
    public c v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* compiled from: VideoSeekPreviewImage.kt */
    public static final class a extends IOException {
    }

    public VideoSeekPreviewImage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.u = new l4d0();
        this.y = -1;
        this.z = -1;
        this.B = new yo80(14);
        setBackgroundResource(R.color.vk_black);
        Drawable a2 = m33.a(R.drawable.video_preview_foreground, getContext());
        setClipToOutline(true);
        setOutlineProvider(new s0w0(getResources().getDimension(R.dimen.video_collage_view_corners), 6));
        setForeground(a2);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private final void setCurrentImageIndex(int i) {
        List<String> list;
        TimelineThumbs timelineThumbs = this.E;
        int min = Math.min(i, ((timelineThumbs == null || (list = timelineThumbs.i) == null) ? 1 : list.size()) - 1);
        if (min != this.D || this.A) {
            this.D = min;
            TimelineThumbs timelineThumbs2 = this.E;
            if (timelineThumbs2 == null || timelineThumbs2.i.isEmpty()) {
                return;
            }
            b0(min);
        }
    }

    public final void W() {
        int i;
        TimelineThumbs timelineThumbs = this.E;
        if (timelineThumbs != null) {
            int i2 = timelineThumbs.b;
            int i3 = timelineThumbs.d;
            int i4 = timelineThumbs.e;
            int i5 = timelineThumbs.c;
            int i6 = timelineThumbs.f;
            if (i2 == 0 || i5 == 0 || getWidth() == 0 || getHeight() == 0) {
                return;
            }
            double min = (!timelineThumbs.h || (i = timelineThumbs.g) <= 0) ? Math.min(Math.max(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, Math.floor((i6 * (this.w / this.x)) - 0.5d)), i6 - 1) : Math.min(this.w / i, i6 - 1);
            if (getDrawable() == null && this.A) {
                setCurrentImageIndex((int) (min / i4));
                return;
            }
            if (getDrawable() == null) {
                return;
            }
            int size = timelineThumbs.i.size();
            if (this.y == -1 || this.z == -1) {
                float ceil = ((size == 1 ? (int) Math.ceil(i6 / i3) : i4 / i3) * i5) / getDrawable().getIntrinsicHeight();
                this.y = (int) (i2 / ceil);
                this.z = (int) (i5 / ceil);
            }
            int i7 = this.D;
            if (min >= (i7 + 1) * i4 || min < i7 * i4) {
                setCurrentImageIndex((int) (min / i4));
                return;
            }
            double d = min % i4;
            int min2 = Math.min(i3, i6);
            float width = getWidth() / this.y;
            float height = getHeight() / this.z;
            double d2 = min2;
            int floor = (int) Math.floor(d % d2);
            int floor2 = (int) Math.floor(d / d2);
            Matrix matrix = new Matrix();
            matrix.setScale(width, height);
            matrix.postTranslate((-width) * this.y * floor, (-height) * this.z * floor2);
            setImageMatrix(matrix);
        }
    }

    public final void b0(int i) {
        x<Uri> invoke;
        q<R> L;
        b.a.getClass();
        q L2 = q.T(Boolean.valueOf(b.d())).L(new mlh0(new fk5(this, i, 3), 7), false);
        izs<? super Integer, ? extends x<Uri>> izsVar = this.F;
        o1 o1Var = (izsVar == null || (invoke = izsVar.invoke(Integer.valueOf(i))) == null || (L = invoke.w().L(new qca0(new eni0(12), 13), false)) == 0) ? null : new o1(L, new yzt(new j6l0(L2, 21), 22));
        if (o1Var != null) {
            L2 = o1Var;
        }
        c cVar = this.v;
        if (cVar != null) {
            cVar.dispose();
        }
        this.v = L2.r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new j3z(new xvl0(this, 15), 23), new ow40(new sxl0(this, 11), 27));
    }

    public final izs<Integer, x<Uri>> getTimelineThumbProvider() {
        return this.F;
    }

    public final TimelineThumbs getTimelineThumbs() {
        return this.E;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        boolean z;
        super.onConfigurationChanged(configuration);
        TimelineThumbs timelineThumbs = this.E;
        Context context = getContext();
        if (context != null) {
            HashSet hashSet = iah0.a;
            if (fnj.d(context)) {
                z = true;
                Pair<Integer, Integer> a2 = this.u.a(timelineThumbs, z, configuration == null && configuration.orientation == 2, this.C);
                getLayoutParams().width = a2.i().intValue();
                getLayoutParams().height = a2.j().intValue();
            }
        }
        z = false;
        if (configuration == null) {
        }
        Pair<Integer, Integer> a22 = this.u.a(timelineThumbs, z, configuration == null && configuration.orientation == 2, this.C);
        getLayoutParams().width = a22.i().intValue();
        getLayoutParams().height = a22.j().intValue();
    }

    @Override // xsna.m6j0, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return;
        }
        W();
        super.onSizeChanged(i, i2, i3, i4);
    }

    public final void setExactlyHeight(int i) {
        this.C = Integer.valueOf(i);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        W();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        W();
    }

    public final void setLostConnectionCallback(gzs<s3q0> gzsVar) {
        this.B = gzsVar;
    }

    public final void setTimelineThumbProvider(izs<? super Integer, ? extends x<Uri>> izsVar) {
        this.F = izsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTimelineThumbs(TimelineThumbs timelineThumbs) {
        boolean z;
        Pair<Integer, Integer> a2;
        if (epx.f(timelineThumbs, this.E) && !this.A) {
            return;
        }
        this.E = timelineThumbs;
        if (timelineThumbs == null) {
            c cVar = this.v;
            if (cVar != null) {
                cVar.dispose();
            }
            setImageDrawable(null);
            return;
        }
        boolean z2 = false;
        if (this.D != 0) {
            setCurrentImageIndex(0);
            return;
        }
        Context context = getContext();
        if (context != null) {
            HashSet hashSet = iah0.a;
            if (fnj.d(context)) {
                z = true;
                if (getContext() != null && (!iah0.s(r3))) {
                    z2 = true;
                }
                a2 = this.u.a(timelineThumbs, z, z2, this.C);
                if (getWidth() == a2.i().intValue() || getHeight() != a2.j().intValue()) {
                    getLayoutParams().width = a2.i().intValue();
                    getLayoutParams().height = a2.j().intValue();
                }
                if (timelineThumbs.i.isEmpty()) {
                    this.y = -1;
                    this.z = -1;
                    b0(this.D);
                    return;
                }
                return;
            }
        }
        z = false;
        if (getContext() != null) {
            z2 = true;
        }
        a2 = this.u.a(timelineThumbs, z, z2, this.C);
        if (getWidth() == a2.i().intValue()) {
        }
        getLayoutParams().width = a2.i().intValue();
        getLayoutParams().height = a2.j().intValue();
        if (timelineThumbs.i.isEmpty()) {
        }
    }
}
