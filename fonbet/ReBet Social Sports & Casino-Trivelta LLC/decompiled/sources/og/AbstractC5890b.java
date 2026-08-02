package og;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.Base64;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import java.io.ByteArrayOutputStream;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: og.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5890b {
    public static final Bitmap a(Bitmap bitmap, int i10) {
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        if (e10 != null) {
            return b(bitmap, e10, i10);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r5 > 25.0f) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Bitmap b(Bitmap bitmap, Context context, float f10) {
        if (bitmap == null) {
            return null;
        }
        Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        RenderScript create = RenderScript.create(context);
        float f11 = f10 >= 1.0f ? 25.0f : 1.0f;
        f10 = f11;
        Allocation createFromBitmap = Allocation.createFromBitmap(create, copy, Allocation.MipmapControl.MIPMAP_FULL, 128);
        Intrinsics.checkNotNull(createFromBitmap);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setInput(createFromBitmap);
        create2.setRadius(f10);
        create2.forEach(createTyped);
        if (createTyped != null) {
            createTyped.copyTo(copy);
        }
        if (create != null) {
            create.destroy();
        }
        createFromBitmap.destroy();
        createTyped.destroy();
        return copy;
    }

    public static final String c(Bitmap bitmap, Bitmap.CompressFormat format, int i10) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return "data:image/png;base64," + e(bitmap, format, i10);
    }

    public static /* synthetic */ String d(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            compressFormat = Bitmap.CompressFormat.PNG;
        }
        if ((i11 & 2) != 0) {
            i10 = 100;
        }
        return c(bitmap, compressFormat, i10);
    }

    public static final String e(Bitmap bitmap, Bitmap.CompressFormat format, int i10) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(format, i10, byteArrayOutputStream);
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    public static /* synthetic */ String f(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        if ((i11 & 2) != 0) {
            i10 = 100;
        }
        return e(bitmap, compressFormat, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Bitmap g(String str) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            byte[] decode = Base64.decode(str, 0);
            Intrinsics.checkNotNull(decode);
            bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            try {
                Result.m147constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion2 = Result.INSTANCE;
                Result.m147constructorimpl(ResultKt.createFailure(th));
                if (bitmap == null) {
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bitmap = null;
        }
        if (bitmap == null) {
            return bitmap;
        }
        byte[] decode2 = Base64.decode(str, 8);
        return BitmapFactory.decodeByteArray(decode2, 0, i.k(decode2 != null ? Integer.valueOf(decode2.length) : null));
    }
}
