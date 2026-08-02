package z7;

import H6.h;
import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public static f f68627a;

    public static f a() {
        if (f68627a == null) {
            f68627a = new f();
        }
        return f68627a;
    }

    @Override // H6.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void release(Bitmap bitmap) {
        bitmap.recycle();
    }
}
