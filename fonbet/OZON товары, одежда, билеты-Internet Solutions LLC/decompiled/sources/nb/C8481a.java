package nb;

import Sc.s;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import io.sentry.W2;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.text.h;
import xe.M;

@e(c = "com.vk.push.core.data.imageloader.ImageDownloaderImpl$download$2", f = "ImageDownloaderImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: nb.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C8481a extends j implements Function2<M, kotlin.coroutines.d<? super Bitmap>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f76718d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ c f76719e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8481a(String str, c cVar, kotlin.coroutines.d<? super C8481a> dVar) {
        super(2, dVar);
        this.f76718d = str;
        this.f76719e = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C8481a(this.f76718d, this.f76719e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Bitmap> dVar) {
        return ((C8481a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        c cVar = this.f76719e;
        String str = this.f76718d;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        try {
            if (h.K(str)) {
                throw new IllegalArgumentException("You have to provide a valid URL");
            }
            URLConnection openConnection = new URL(str).openConnection();
            if (openConnection.getContentLength() <= W2.MAX_EVENT_SIZE_BYTES) {
                return BitmapFactory.decodeStream(openConnection.getInputStream());
            }
            c.a(cVar).b("Image size exceeds 1048576 bytes", null);
            return null;
        } catch (Exception e11) {
            c.a(cVar).error("Could not download image", e11);
            return null;
        }
    }
}
