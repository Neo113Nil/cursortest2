package D3;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.InterfaceC2933c;
import com.airbnb.lottie.N;
import com.airbnb.lottie.utils.g;
import com.airbnb.lottie.utils.z;
import com.plaid.internal.EnumC3631g;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f2530d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f2531a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2532b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f2533c;

    public b(Drawable.Callback callback, String str, InterfaceC2933c interfaceC2933c, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f2532b = str;
        } else {
            this.f2532b = str + '/';
        }
        this.f2533c = map;
        d(interfaceC2933c);
        if (callback instanceof View) {
            this.f2531a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f2531a = null;
        }
    }

    public Bitmap a(String str) {
        N n10 = (N) this.f2533c.get(str);
        if (n10 == null) {
            return null;
        }
        Bitmap b10 = n10.b();
        if (b10 != null) {
            return b10;
        }
        Context context = this.f2531a;
        if (context == null) {
            return null;
        }
        String c10 = n10.c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE;
        if (c10.startsWith("data:") && c10.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(c10.substring(c10.indexOf(44) + 1), 0);
                try {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                    if (decodeByteArray != null) {
                        return c(str, z.m(decodeByteArray, n10.f(), n10.d()));
                    }
                    g.c("Decoded image `" + str + "` is null.");
                    return null;
                } catch (IllegalArgumentException e10) {
                    g.d("Unable to decode image `" + str + "`.", e10);
                    return null;
                }
            } catch (IllegalArgumentException e11) {
                g.d("data URL did not have correct base64 format.", e11);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f2532b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.f2532b + c10), null, options);
                if (decodeStream != null) {
                    return c(str, z.m(decodeStream, n10.f(), n10.d()));
                }
                g.c("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e12) {
                g.d("Unable to decode image `" + str + "`.", e12);
                return null;
            }
        } catch (IOException e13) {
            g.d("Unable to open asset.", e13);
            return null;
        }
    }

    public boolean b(Context context) {
        if (context == null) {
            return this.f2531a == null;
        }
        if (this.f2531a instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.f2531a;
    }

    public final Bitmap c(String str, Bitmap bitmap) {
        synchronized (f2530d) {
            ((N) this.f2533c.get(str)).g(bitmap);
        }
        return bitmap;
    }

    public void d(InterfaceC2933c interfaceC2933c) {
    }
}
