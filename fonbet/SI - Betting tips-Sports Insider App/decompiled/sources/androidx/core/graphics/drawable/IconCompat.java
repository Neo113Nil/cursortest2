package androidx.core.graphics.drawable;

import aa.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.view.k;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.sports.insider.data.repository.room.metric.EventsTable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.android.core.w0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import s6.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f1268k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f1269a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1270b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f1271c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f1272d;

    /* renamed from: e, reason: collision with root package name */
    public int f1273e;

    /* renamed from: f, reason: collision with root package name */
    public int f1274f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1275g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1276h;

    /* renamed from: i, reason: collision with root package name */
    public String f1277i;
    public String j;

    public IconCompat() {
        this.f1269a = -1;
        this.f1271c = null;
        this.f1272d = null;
        this.f1273e = 0;
        this.f1274f = 0;
        this.f1275g = null;
        this.f1276h = f1268k;
        this.f1277i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z5) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f6 = min;
        float f10 = 0.5f * f6;
        float f11 = 0.9166667f * f10;
        if (z5) {
            float f12 = 0.010416667f * f6;
            paint.setColor(0);
            paint.setShadowLayer(f12, 0.0f, f6 * 0.020833334f, 1023410176);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.setShadowLayer(f12, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f10, f10, f11, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(int i5) {
        if (i5 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f1273e = i5;
        iconCompat.f1270b = "";
        iconCompat.j = "";
        return iconCompat;
    }

    public final int c() {
        int i5 = this.f1269a;
        if (i5 != -1) {
            if (i5 == 2) {
                return this.f1273e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.f1270b;
        if (i10 >= 28) {
            return k.g(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e7) {
            w0.e("IconCompat", "Unable to get icon resource", e7);
            return 0;
        } catch (NoSuchMethodException e9) {
            w0.e("IconCompat", "Unable to get icon resource", e9);
            return 0;
        } catch (InvocationTargetException e10) {
            w0.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        }
    }

    public final int d() {
        int i5 = this.f1269a;
        if (i5 != -1) {
            return i5;
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.f1270b;
        if (i10 >= 28) {
            return k.o(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e7) {
            w0.e("IconCompat", "Unable to get icon type " + obj, e7);
            return -1;
        } catch (NoSuchMethodException e9) {
            w0.e("IconCompat", "Unable to get icon type " + obj, e9);
            return -1;
        } catch (InvocationTargetException e10) {
            w0.e("IconCompat", "Unable to get icon type " + obj, e10);
            return -1;
        }
    }

    public final Uri e() {
        int i5 = this.f1269a;
        if (i5 != -1) {
            if (i5 == 4 || i5 == 6) {
                return Uri.parse((String) this.f1270b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.f1270b;
        if (i10 >= 28) {
            return k.p(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e7) {
            w0.e("IconCompat", "Unable to get icon uri", e7);
            return null;
        } catch (NoSuchMethodException e9) {
            w0.e("IconCompat", "Unable to get icon uri", e9);
            return null;
        } catch (InvocationTargetException e10) {
            w0.e("IconCompat", "Unable to get icon uri", e10);
            return null;
        }
    }

    public final Icon f(Context context) {
        Icon createWithBitmap;
        int i5 = Build.VERSION.SDK_INT;
        int i10 = this.f1269a;
        String str = null;
        r3 = null;
        InputStream openInputStream = null;
        str = null;
        str = null;
        switch (i10) {
            case -1:
                return (Icon) this.f1270b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.f1270b);
                break;
            case 2:
                if (i10 == -1) {
                    Object obj = this.f1270b;
                    if (i5 >= 28) {
                        str = k.h(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e7) {
                            w0.e("IconCompat", "Unable to get icon package", e7);
                        } catch (NoSuchMethodException e9) {
                            w0.e("IconCompat", "Unable to get icon package", e9);
                        } catch (InvocationTargetException e10) {
                            w0.e("IconCompat", "Unable to get icon package", e10);
                        }
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + this);
                    }
                    String str2 = this.j;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) this.f1270b).split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0] : this.j;
                }
                createWithBitmap = Icon.createWithResource(str, this.f1273e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.f1270b, this.f1273e, this.f1274f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.f1270b);
                break;
            case 5:
                if (i5 < 26) {
                    createWithBitmap = Icon.createWithBitmap(a((Bitmap) this.f1270b, false));
                    break;
                } else {
                    createWithBitmap = a.d((Bitmap) this.f1270b);
                    break;
                }
            case 6:
                if (i5 >= 30) {
                    createWithBitmap = b.a(e());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + e());
                    }
                    Uri e11 = e();
                    String scheme = e11.getScheme();
                    if (EventsTable.contentColumn.equals(scheme) || "file".equals(scheme)) {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(e11);
                        } catch (Exception e12) {
                            w0.n("IconCompat", "Unable to load image from URI: " + e11, e12);
                        }
                    } else {
                        try {
                            File file = new File((String) this.f1270b);
                            openInputStream = y4.a.m(new FileInputStream(file), file);
                        } catch (FileNotFoundException e13) {
                            w0.n("IconCompat", "Unable to load image from path: " + e11, e13);
                        }
                    }
                    if (openInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + e());
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(a(BitmapFactory.decodeStream(openInputStream), false));
                        break;
                    } else {
                        createWithBitmap = a.d(BitmapFactory.decodeStream(openInputStream));
                        break;
                    }
                }
                break;
        }
        ColorStateList colorStateList = this.f1275g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f1276h;
        if (mode != f1268k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f1269a == -1) {
            return String.valueOf(this.f1270b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f1269a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f1269a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f1270b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f1270b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f1273e);
                if (this.f1274f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f1274f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f1270b);
                break;
        }
        if (this.f1275g != null) {
            sb2.append(" tint=");
            sb2.append(this.f1275g);
        }
        if (this.f1276h != f1268k) {
            sb2.append(" mode=");
            sb2.append(this.f1276h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i5) {
        this.f1271c = null;
        this.f1272d = null;
        this.f1273e = 0;
        this.f1274f = 0;
        this.f1275g = null;
        this.f1276h = f1268k;
        this.f1277i = null;
        this.f1269a = i5;
    }
}
