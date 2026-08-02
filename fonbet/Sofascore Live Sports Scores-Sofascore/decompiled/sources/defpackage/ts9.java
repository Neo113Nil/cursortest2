package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Base64;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ts9 extends p41 {
    public final ska D;
    public final Rect E;
    public final Rect F;
    public final RectF G;
    public final lmb H;
    public gkk I;
    public gkk J;
    public final xc5 K;
    public cnd L;
    public yz1 M;

    public ts9(gmb gmbVar, mla mlaVar) {
        super(gmbVar, mlaVar);
        this.D = new ska(3, 0);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
        String str = mlaVar.g;
        plb plbVar = gmbVar.a;
        this.H = plbVar == null ? null : (lmb) ((HashMap) plbVar.c()).get(str);
        p03 p03Var = this.p.x;
        if (p03Var != null) {
            this.K = new xc5(this, this, p03Var);
        }
    }

    @Override // defpackage.p41, defpackage.bja
    public final void d(wj9 wj9Var, Object obj) {
        super.d(wj9Var, obj);
        if (obj == nmb.I) {
            if (wj9Var == null) {
                this.I = null;
                return;
            } else {
                this.I = new gkk(wj9Var, null);
                return;
            }
        }
        if (obj == nmb.L) {
            if (wj9Var == null) {
                this.J = null;
                return;
            } else {
                this.J = new gkk(wj9Var, null);
                return;
            }
        }
        xc5 xc5Var = this.K;
        if (obj == 5 && xc5Var != null) {
            xc5Var.c.j(wj9Var);
            return;
        }
        if (obj == nmb.E && xc5Var != null) {
            xc5Var.c(wj9Var);
            return;
        }
        if (obj == nmb.F && xc5Var != null) {
            xc5Var.e.j(wj9Var);
            return;
        }
        if (obj == nmb.G && xc5Var != null) {
            xc5Var.f.j(wj9Var);
        } else {
            if (obj != nmb.H || xc5Var == null) {
                return;
            }
            xc5Var.g.j(wj9Var);
        }
    }

    @Override // defpackage.p41, defpackage.jb5
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        lmb lmbVar = this.H;
        if (lmbVar != null) {
            int i = lmbVar.b;
            int i2 = lmbVar.a;
            float c = vik.c();
            if (this.o.m) {
                rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2 * c, i * c);
            } else {
                if (s() != null) {
                    rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r1.getWidth() * c, r1.getHeight() * c);
                } else {
                    rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2 * c, i * c);
                }
            }
            this.n.mapRect(rectF);
        }
    }

    @Override // defpackage.p41
    public final void j(Canvas canvas, Matrix matrix, int i, uc5 uc5Var) {
        lmb lmbVar;
        Bitmap s = s();
        if (s == null || s.isRecycled() || (lmbVar = this.H) == null) {
            return;
        }
        float c = vik.c();
        ska skaVar = this.D;
        skaVar.setAlpha(i);
        gkk gkkVar = this.I;
        if (gkkVar != null) {
            skaVar.setColorFilter((ColorFilter) gkkVar.e());
        }
        xc5 xc5Var = this.K;
        if (xc5Var != null) {
            uc5Var = xc5Var.b(matrix, i);
        }
        int width = s.getWidth();
        int height = s.getHeight();
        Rect rect = this.E;
        rect.set(0, 0, width, height);
        boolean z = this.o.m;
        Rect rect2 = this.F;
        if (z) {
            rect2.set(0, 0, (int) (lmbVar.a * c), (int) (lmbVar.b * c));
        } else {
            rect2.set(0, 0, (int) (s.getWidth() * c), (int) (s.getHeight() * c));
        }
        boolean z2 = uc5Var != null;
        if (z2) {
            if (this.L == null) {
                this.L = new cnd();
            }
            yz1 yz1Var = this.M;
            if (yz1Var == null) {
                yz1Var = new yz1(8);
                this.M = yz1Var;
            }
            yz1 yz1Var2 = yz1Var;
            yz1Var.b = 255;
            yz1Var.c = null;
            uc5Var.getClass();
            uc5 uc5Var2 = new uc5(uc5Var);
            yz1Var2.c = uc5Var2;
            uc5Var2.b(i);
            float f = rect2.left;
            float f2 = rect2.top;
            float f3 = rect2.right;
            float f4 = rect2.bottom;
            RectF rectF = this.G;
            rectF.set(f, f2, f3, f4);
            matrix.mapRect(rectF);
            canvas = this.L.e(canvas, rectF, this.M);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(s, rect, rect2, skaVar);
        if (z2) {
            this.L.c();
            if (this.L.c == 4) {
                return;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r2 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        r1.g = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r4 == r2) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0162 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap s() {
        Bitmap bitmap;
        Bitmap bitmap2;
        gkk gkkVar = this.J;
        if (gkkVar != null && (bitmap2 = (Bitmap) gkkVar.e()) != null) {
            return bitmap2;
        }
        String str = this.p.g;
        gmb gmbVar = this.o;
        ejg ejgVar = gmbVar.g;
        if (ejgVar != null) {
            Context h = gmbVar.h();
            Context context = (Context) ejgVar.c;
            if (h != null) {
                if (context instanceof Application) {
                    h = h.getApplicationContext();
                }
            }
        }
        ejg ejgVar2 = gmbVar.g;
        if (ejgVar2 == null) {
            ejgVar2 = new ejg(gmbVar.getCallback(), gmbVar.h, gmbVar.a.c());
            gmbVar.g = ejgVar2;
        }
        String str2 = (String) ejgVar2.b;
        lmb lmbVar = (lmb) ((Map) ejgVar2.d).get(str);
        if (lmbVar != null) {
            int i = lmbVar.b;
            int i2 = lmbVar.a;
            bitmap = lmbVar.f;
            if (bitmap == null) {
                Context context2 = (Context) ejgVar2.c;
                if (context2 != null) {
                    String str3 = lmbVar.d;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (!str3.startsWith("data:") || str3.indexOf("base64,") <= 0) {
                        try {
                            if (TextUtils.isEmpty(str2)) {
                                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                            }
                            try {
                                Bitmap decodeStream = BitmapFactory.decodeStream(context2.getAssets().open(str2 + str3), null, options);
                                if (decodeStream == null) {
                                    ajb.b("Decoded image `" + str + "` is null.");
                                } else {
                                    bitmap = vik.d(decodeStream, i2, i);
                                    synchronized (ejg.f) {
                                        ((lmb) ((Map) ejgVar2.d).get(str)).f = bitmap;
                                    }
                                }
                            } catch (IllegalArgumentException unused) {
                                ajb.c("Unable to decode image `" + str + "`.");
                            }
                        } catch (IOException unused2) {
                            ajb.c("Unable to open asset.");
                        }
                    } else {
                        try {
                            byte[] decode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                            try {
                                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                                if (decodeByteArray == null) {
                                    ajb.b("Decoded image `" + str + "` is null.");
                                } else {
                                    bitmap = vik.d(decodeByteArray, i2, i);
                                    synchronized (ejg.f) {
                                        ((lmb) ((Map) ejgVar2.d).get(str)).f = bitmap;
                                    }
                                }
                            } catch (IllegalArgumentException unused3) {
                                ajb.c("Unable to decode image `" + str + "`.");
                            }
                        } catch (IllegalArgumentException unused4) {
                            ajb.c("data URL did not have correct base64 format.");
                        }
                    }
                }
            }
            if (bitmap == null) {
                return bitmap;
            }
            lmb lmbVar2 = this.H;
            if (lmbVar2 != null) {
                return lmbVar2.f;
            }
            return null;
        }
        bitmap = null;
        if (bitmap == null) {
        }
    }
}
