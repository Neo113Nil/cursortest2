package f4;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.media.MediaDataSource;
import c4.p;
import com.google.android.gms.internal.measurement.d5;
import d4.t;
import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;
import okio.Buffer;
import okio.Okio;
import q4.n;
import v4.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9445a;

    /* renamed from: b, reason: collision with root package name */
    public final n f9446b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9447c;

    public /* synthetic */ c(Object obj, n nVar, int i5) {
        this.f9445a = i5;
        this.f9447c = obj;
        this.f9446b = nVar;
    }

    @Override // f4.h
    public final Object a(Continuation continuation) {
        int i5 = this.f9445a;
        n nVar = this.f9446b;
        Object obj = this.f9447c;
        switch (i5) {
            case 0:
                return new j(p.c(new BitmapDrawable(nVar.f22007a.getResources(), (Bitmap) obj)), false, d4.h.f8129b);
            case 1:
                Buffer buffer = new Buffer();
                buffer.write((byte[]) obj);
                return new l(ci.c.b(buffer, nVar.f22012f), null, d4.h.f8129b);
            case 2:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new l(new t(Okio.buffer(new d(byteBuffer)), nVar.f22012f, new d4.f(byteBuffer)), null, d4.h.f8129b);
            case 3:
                Drawable drawable = (Drawable) obj;
                Bitmap.Config[] configArr = r.f24431a;
                boolean z5 = (drawable instanceof VectorDrawable) || (drawable instanceof androidx.vectordrawable.graphics.drawable.t);
                if (z5) {
                    drawable = new BitmapDrawable(nVar.f22007a.getResources(), d5.l(drawable, q4.j.a(nVar), nVar.f22008b, nVar.f22009c, nVar.f22010d == r4.d.f22294b));
                }
                return new j(p.c(drawable), z5, d4.h.f8129b);
            default:
                MediaDataSource mediaDataSource = (MediaDataSource) obj;
                return new l(new t(Okio.buffer(new w4.b(mediaDataSource)), nVar.f22012f, new w4.c(mediaDataSource)), null, d4.h.f8130c);
        }
    }
}
