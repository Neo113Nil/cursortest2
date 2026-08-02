package I4;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;
import java.io.ByteArrayOutputStream;

/* loaded from: classes2.dex */
public class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap.CompressFormat f5339a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5340b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // I4.e
    public v a(v vVar, j jVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) vVar.get()).compress(this.f5339a, this.f5340b, byteArrayOutputStream);
        vVar.recycle();
        return new E4.b(byteArrayOutputStream.toByteArray());
    }

    public a(Bitmap.CompressFormat compressFormat, int i10) {
        this.f5339a = compressFormat;
        this.f5340b = i10;
    }
}
