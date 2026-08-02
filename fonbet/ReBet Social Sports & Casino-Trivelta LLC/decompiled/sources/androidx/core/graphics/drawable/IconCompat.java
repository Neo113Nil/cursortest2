package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
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
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import lb.C5444x;
import x0.AbstractC6773b;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f19087j = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f19088a;

    /* renamed from: b, reason: collision with root package name */
    public Object f19089b;

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f19090c;

    /* renamed from: d, reason: collision with root package name */
    public int f19091d;

    /* renamed from: e, reason: collision with root package name */
    public int f19092e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f19093f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f19094g;

    /* renamed from: h, reason: collision with root package name */
    public String f19095h;

    /* renamed from: i, reason: collision with root package name */
    public String f19096i;
    public byte[] mData;

    public static class a {
        public static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        public static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        public static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            }
        }

        public static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        public static Icon e(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.f19088a) {
                case -1:
                    return (Icon) iconCompat.f19089b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f19089b);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.f(), iconCompat.f19091d);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.f19089b, iconCompat.f19091d, iconCompat.f19092e);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.f19089b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.f19089b, false));
                        break;
                    } else {
                        createWithBitmap = b.a((Bitmap) iconCompat.f19089b);
                        break;
                    }
                case 6:
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        createWithBitmap = d.a(iconCompat.h());
                        break;
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.h());
                        }
                        InputStream i11 = iconCompat.i(context);
                        if (i11 == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.h());
                        }
                        if (i10 < 26) {
                            createWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(i11), false));
                            break;
                        } else {
                            createWithBitmap = b.a(BitmapFactory.decodeStream(i11));
                            break;
                        }
                    }
            }
            ColorStateList colorStateList = iconCompat.f19093f;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f19094g;
            if (mode != IconCompat.f19087j) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    public static class b {
        public static Icon a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    public static class c {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    public static class d {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f19088a = -1;
        this.mData = null;
        this.f19090c = null;
        this.f19091d = 0;
        this.f19092e = 0;
        this.f19093f = null;
        this.f19094g = f19087j;
        this.f19095h = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z10) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(Bitmap bitmap) {
        AbstractC6773b.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f19089b = bitmap;
        return iconCompat;
    }

    public static IconCompat c(Resources resources, String str, int i10) {
        AbstractC6773b.c(str);
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f19091d = i10;
        if (resources != null) {
            try {
                iconCompat.f19089b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f19089b = str;
        }
        iconCompat.f19096i = str;
        return iconCompat;
    }

    public static String o(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap d() {
        int i10 = this.f19088a;
        if (i10 == -1) {
            Object obj = this.f19089b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.f19089b;
        }
        if (i10 == 5) {
            return a((Bitmap) this.f19089b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int e() {
        int i10 = this.f19088a;
        if (i10 == -1) {
            return a.a(this.f19089b);
        }
        if (i10 == 2) {
            return this.f19091d;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String f() {
        int i10 = this.f19088a;
        if (i10 == -1) {
            return a.b(this.f19089b);
        }
        if (i10 == 2) {
            String str = this.f19096i;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f19089b).split(":", -1)[0] : this.f19096i;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int g() {
        int i10 = this.f19088a;
        return i10 == -1 ? a.c(this.f19089b) : i10;
    }

    public Uri h() {
        int i10 = this.f19088a;
        if (i10 == -1) {
            return a.d(this.f19089b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f19089b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream i(Context context) {
        Uri h10 = h();
        String scheme = h10.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(h10);
            } catch (Exception e10) {
                Log.w("IconCompat", "Unable to load image from URI: " + h10, e10);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f19089b));
        } catch (FileNotFoundException e11) {
            Log.w("IconCompat", "Unable to load image from path: " + h10, e11);
            return null;
        }
    }

    public void j() {
        this.f19094g = PorterDuff.Mode.valueOf(this.f19095h);
        switch (this.f19088a) {
            case -1:
                Parcelable parcelable = this.f19090c;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f19089b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f19090c;
                if (parcelable2 != null) {
                    this.f19089b = parcelable2;
                    return;
                }
                byte[] bArr = this.mData;
                this.f19089b = bArr;
                this.f19088a = 3;
                this.f19091d = 0;
                this.f19092e = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.mData, Charset.forName("UTF-16"));
                this.f19089b = str;
                if (this.f19088a == 2 && this.f19096i == null) {
                    this.f19096i = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f19089b = this.mData;
                return;
        }
    }

    public void k(boolean z10) {
        this.f19095h = this.f19094g.name();
        switch (this.f19088a) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f19090c = (Parcelable) this.f19089b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z10) {
                    this.f19090c = (Parcelable) this.f19089b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f19089b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.mData = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.mData = ((String) this.f19089b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.mData = (byte[]) this.f19089b;
                return;
            case 4:
            case 6:
                this.mData = this.f19089b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public Bundle l() {
        Bundle bundle = new Bundle();
        switch (this.f19088a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f19089b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f19089b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f19089b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f19089b);
                break;
        }
        bundle.putInt("type", this.f19088a);
        bundle.putInt("int1", this.f19091d);
        bundle.putInt("int2", this.f19092e);
        bundle.putString("string1", this.f19096i);
        ColorStateList colorStateList = this.f19093f;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f19094g;
        if (mode != f19087j) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public Icon m() {
        return n(null);
    }

    public Icon n(Context context) {
        return a.e(this, context);
    }

    public String toString() {
        if (this.f19088a == -1) {
            return String.valueOf(this.f19089b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(o(this.f19088a));
        switch (this.f19088a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f19089b).getWidth());
                sb2.append(C5444x.f55808b);
                sb2.append(((Bitmap) this.f19089b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f19096i);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(e())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f19091d);
                if (this.f19092e != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f19092e);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f19089b);
                break;
        }
        if (this.f19093f != null) {
            sb2.append(" tint=");
            sb2.append(this.f19093f);
        }
        if (this.f19094g != f19087j) {
            sb2.append(" mode=");
            sb2.append(this.f19094g);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i10) {
        this.mData = null;
        this.f19090c = null;
        this.f19091d = 0;
        this.f19092e = 0;
        this.f19093f = null;
        this.f19094g = f19087j;
        this.f19095h = null;
        this.f19088a = i10;
    }
}
