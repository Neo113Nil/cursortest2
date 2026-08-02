package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zed extends r9 {
    public IconCompat c;
    public IconCompat d;
    public boolean e;

    @Override // defpackage.r9
    public final void c(ujg ujgVar) {
        Bitmap bitmap;
        Notification.Builder builder = (Notification.Builder) ujgVar.c;
        Context context = (Context) ujgVar.b;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle((CharSequence) this.b);
        IconCompat iconCompat = this.c;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                yed.a(bigContentTitle, n9e.L(iconCompat, context));
            } else {
                int i = iconCompat.a;
                if (i == -1) {
                    i = n9e.B(iconCompat.b);
                }
                if (i == 1) {
                    IconCompat iconCompat2 = this.c;
                    int i2 = iconCompat2.a;
                    if (i2 == -1) {
                        Object obj = iconCompat2.b;
                        bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i2 == 1) {
                        bitmap = (Bitmap) iconCompat2.b;
                    } else {
                        if (i2 != 5) {
                            yhk.r(iconCompat2, "called getBitmap() on ");
                            return;
                        }
                        Bitmap bitmap2 = (Bitmap) iconCompat2.b;
                        int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint(3);
                        float f = min;
                        float f2 = 0.5f * f;
                        float f3 = 0.9166667f * f2;
                        float f4 = 0.010416667f * f;
                        paint.setColor(0);
                        paint.setShadowLayer(f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f * 0.020833334f, 1023410176);
                        canvas.drawCircle(f2, f2, f3, paint);
                        paint.setShadowLayer(f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 503316480);
                        canvas.drawCircle(f2, f2, f3, paint);
                        paint.clearShadowLayer();
                        paint.setColor(-16777216);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                        Matrix matrix = new Matrix();
                        matrix.setTranslate((-(bitmap2.getWidth() - min)) / 2.0f, (-(bitmap2.getHeight() - min)) / 2.0f);
                        bitmapShader.setLocalMatrix(matrix);
                        paint.setShader(bitmapShader);
                        canvas.drawCircle(f2, f2, f3, paint);
                        canvas.setBitmap(null);
                        bitmap = createBitmap;
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmap);
                }
            }
        }
        if (this.e) {
            IconCompat iconCompat3 = this.d;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(n9e.L(iconCompat3, context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            yed.c(bigContentTitle, false);
            yed.b(bigContentTitle, null);
        }
    }

    @Override // defpackage.r9
    public final String i() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
