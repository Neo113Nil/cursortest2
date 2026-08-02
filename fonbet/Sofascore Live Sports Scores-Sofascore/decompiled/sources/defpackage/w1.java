package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import androidx.fragment.app.Fragment;
import com.sofascore.results.bettingtips.fragment.BetBoostFragment;
import com.sofascore.results.chat.addcountry.ChatCountryFlagBottomSheet;
import com.sofascore.results.chat.fragment.CommentsChatFragment;
import com.sofascore.results.dialog.AdditionalOddsModal;
import com.sofascore.results.event.commentary.baseball.BaseballCommentaryModal;
import com.sofascore.results.league.fragment.cuptree.BaseCupTreeFragment;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.player.statistics.compare.search.CompareSearchModal;
import com.sofascore.results.sharemodal.shared.BaseShareStandingsModal;
import com.unity3d.services.UnityAdsConstants;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class w1 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(Object obj, int i) {
        super(0);
        this.i = i;
        this.j = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x008b, code lost:
    
        if (defpackage.lf6.a.contains(r9) != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        xe6 xe6Var;
        Exception exc;
        int i;
        int min;
        double max;
        Bitmap createBitmap;
        int i2 = this.i;
        boolean z = false;
        int i3 = 1;
        Object obj = this.j;
        switch (i2) {
            case 0:
                return (ttk) ((v1) obj).invoke();
            case 1:
                return (AdditionalOddsModal) obj;
            case 2:
                return (ttk) ((w1) obj).invoke();
            case 3:
                s9a.o(((j20) obj).c, null);
                return Unit.a;
            case 4:
                return Unit.a;
            case 5:
                axj axjVar = (axj) obj;
                Object w = axjVar.a.w();
                po5 po5Var = po5.c;
                if (w == po5Var && ((eoh) axjVar.d).getValue() == po5Var) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                ((eoh) ((af0) obj).g).getValue();
                return Unit.a;
            case 7:
                return (AbstractFragment) obj;
            case 8:
                return (ttk) ((w1) obj).invoke();
            case 9:
                return (ot9) ((eoh) ((zj0) obj).r).getValue();
            case 10:
                return (BaseCupTreeFragment) obj;
            case 11:
                return (ttk) ((w1) obj).invoke();
            case 12:
                return (BaseShareStandingsModal) obj;
            case 13:
                return (ttk) ((w1) obj).invoke();
            case 14:
                return (BaseballCommentaryModal) obj;
            case 15:
                return (ttk) ((w1) obj).invoke();
            case 16:
                return (ttk) ((ga1) obj).invoke();
            case 17:
                return (Fragment) obj;
            case 18:
                return (ttk) ((w1) obj).invoke();
            case 19:
                return (BetBoostFragment) obj;
            case 20:
                return (ttk) ((w1) obj).invoke();
            case 21:
                vw1 vw1Var = (vw1) obj;
                BitmapFactory.Options options = new BitmapFactory.Options();
                xvd xvdVar = vw1Var.b;
                zt9 zt9Var = vw1Var.a;
                pw1 pw1Var = new pw1(zt9Var.source(), i3);
                lof lofVar = new lof(pw1Var);
                options.inJustDecodeBounds = true;
                int i4 = 4;
                BitmapFactory.decodeStream(new oy1(lofVar.h(), i4), null, options);
                Exception exc2 = pw1Var.c;
                if (exc2 != null) {
                    throw exc2;
                }
                options.inJustDecodeBounds = false;
                Paint paint = kf6.a;
                String str = options.outMimeType;
                int i5 = vw1Var.d;
                Set set = lf6.a;
                int C = wt3.C(i5);
                if (C != 0) {
                    if (C == 1) {
                        if (str != null) {
                            break;
                        }
                    } else if (C != 2) {
                        zzl.b();
                        return null;
                    }
                    ef6 ef6Var = new ef6(new gf6(new oy1(lofVar.h(), i4), 1));
                    int c = ef6Var.c();
                    xe6Var = new xe6(c == 2 || c == 7 || c == 4 || c == 5, ef6Var.l());
                    int i6 = xe6Var.b;
                    boolean z2 = xe6Var.a;
                    exc = pw1Var.c;
                    if (exc == null) {
                        throw exc;
                    }
                    options.inMutable = false;
                    xvdVar.getClass();
                    Context context = xvdVar.a;
                    jjh jjhVar = xvdVar.c;
                    options.inPremultiplied = true;
                    Bitmap.Config config = xvdVar.b;
                    if ((z2 || i6 > 0) && (config == null || config == Bitmap.Config.HARDWARE)) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    if (xvdVar.f && config == Bitmap.Config.ARGB_8888 && Intrinsics.c(options.outMimeType, "image/jpeg")) {
                        config = Bitmap.Config.RGB_565;
                    }
                    Bitmap.Config config2 = options.outConfig;
                    Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
                    if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                        config = config3;
                    }
                    options.inPreferredConfig = config;
                    n4o h = zt9Var.h();
                    try {
                        if ((h instanceof v1g) && Intrinsics.c(jjhVar, jjh.c)) {
                            options.inSampleSize = 1;
                            options.inScaled = true;
                            options.inDensity = ((v1g) h).m;
                            options.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
                        } else {
                            int i7 = options.outWidth;
                            if (i7 <= 0 || (i = options.outHeight) <= 0) {
                                options.inSampleSize = 1;
                                z = false;
                                options.inScaled = false;
                            } else {
                                int i8 = (i6 == 90 || i6 == 270) ? i : i7;
                                if (i6 != 90 && i6 != 270) {
                                    i7 = i;
                                }
                                int i9 = xvdVar.d;
                                jjh jjhVar2 = jjh.c;
                                int e = Intrinsics.c(jjhVar, jjhVar2) ? i8 : l.e(jjhVar.a, i9);
                                int e2 = Intrinsics.c(jjhVar, jjhVar2) ? i7 : l.e(jjhVar.b, i9);
                                int highestOneBit = Integer.highestOneBit(i8 / e);
                                int highestOneBit2 = Integer.highestOneBit(i7 / e2);
                                int C2 = wt3.C(i9);
                                if (C2 == 0) {
                                    min = Math.min(highestOneBit, highestOneBit2);
                                } else {
                                    if (C2 != 1) {
                                        zzl.b();
                                        return null;
                                    }
                                    min = Math.max(highestOneBit, highestOneBit2);
                                }
                                if (min < 1) {
                                    min = 1;
                                }
                                options.inSampleSize = min;
                                double d = min;
                                double d2 = i7 / d;
                                double d3 = e / (i8 / d);
                                double d4 = e2 / d2;
                                int C3 = wt3.C(i9);
                                if (C3 == 0) {
                                    max = Math.max(d3, d4);
                                } else {
                                    if (C3 != 1) {
                                        zzl.b();
                                        return null;
                                    }
                                    max = Math.min(d3, d4);
                                }
                                if (xvdVar.e && max > 1.0d) {
                                    max = 1.0d;
                                }
                                boolean z3 = max == 1.0d;
                                options.inScaled = !z3;
                                if (!z3) {
                                    if (max > 1.0d) {
                                        options.inDensity = wzb.a(2.147483647E9d / max);
                                        options.inTargetDensity = Integer.MAX_VALUE;
                                    } else {
                                        options.inDensity = Integer.MAX_VALUE;
                                        options.inTargetDensity = wzb.a(2.147483647E9d * max);
                                    }
                                }
                                z = false;
                            }
                        }
                        Bitmap decodeStream = BitmapFactory.decodeStream(new oy1(lofVar, 4), null, options);
                        lofVar.close();
                        Exception exc3 = pw1Var.c;
                        if (exc3 != null) {
                            throw exc3;
                        }
                        if (decodeStream == null) {
                            a70.r("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                            return null;
                        }
                        decodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                        if (z2 || i6 > 0) {
                            Matrix matrix = new Matrix();
                            float width = decodeStream.getWidth() / 2.0f;
                            float height = decodeStream.getHeight() / 2.0f;
                            if (z2) {
                                matrix.postScale(-1.0f, 1.0f, width, height);
                            }
                            if (i6 > 0) {
                                matrix.postRotate(i6, width, height);
                            }
                            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, decodeStream.getWidth(), decodeStream.getHeight());
                            matrix.mapRect(rectF);
                            float f = rectF.left;
                            if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || rectF.top != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                matrix.postTranslate(-f, -rectF.top);
                            }
                            if (i6 == 90 || i6 == 270) {
                                int height2 = decodeStream.getHeight();
                                int width2 = decodeStream.getWidth();
                                Bitmap.Config config4 = decodeStream.getConfig();
                                if (config4 == null) {
                                    config4 = Bitmap.Config.ARGB_8888;
                                }
                                createBitmap = Bitmap.createBitmap(height2, width2, config4);
                                createBitmap.getClass();
                            } else {
                                int width3 = decodeStream.getWidth();
                                int height3 = decodeStream.getHeight();
                                Bitmap.Config config5 = decodeStream.getConfig();
                                if (config5 == null) {
                                    config5 = Bitmap.Config.ARGB_8888;
                                }
                                createBitmap = Bitmap.createBitmap(width3, height3, config5);
                                createBitmap.getClass();
                            }
                            new Canvas(createBitmap).drawBitmap(decodeStream, matrix, kf6.a);
                            decodeStream.recycle();
                            decodeStream = createBitmap;
                        }
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), decodeStream);
                        if (options.inSampleSize > 1 || options.inScaled) {
                            z = true;
                        }
                        return new wl4(bitmapDrawable, z);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            n4o.x(lofVar, th);
                            throw th2;
                        }
                    }
                }
                xe6Var = xe6.d;
                int i62 = xe6Var.b;
                boolean z22 = xe6Var.a;
                exc = pw1Var.c;
                if (exc == null) {
                }
                break;
            case 22:
                return (oqf) obj;
            case 23:
                return (ChatCountryFlagBottomSheet) obj;
            case 24:
                return (ttk) ((w1) obj).invoke();
            case 25:
                return (ttk) ((bu2) obj).invoke();
            case 26:
                return (CommentsChatFragment) obj;
            case 27:
                return (ttk) ((w1) obj).invoke();
            case 28:
                return (ttk) ((f63) obj).invoke();
            default:
                return (CompareSearchModal) obj;
        }
    }
}
