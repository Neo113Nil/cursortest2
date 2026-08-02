package k5;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import k5.InterfaceC7518g2;

/* loaded from: classes8.dex */
final class H0 extends InterfaceC7518g2.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ I0 f70568a;

    H0(I0 i02) {
        this.f70568a = i02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        r0 = r0.f70583h;
        r0.c(Mm0.e.GoogleServicesDeviceId, r1.getString(1));
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Context context;
        String str;
        String[] strArr;
        String str2;
        I0 i02 = this.f70568a;
        try {
            context = i02.f70582g;
            ContentResolver contentResolver = context.getContentResolver();
            str = I0.f70579j;
            Uri parse = Uri.parse(str);
            strArr = i02.f70580e;
            Cursor query = contentResolver.query(parse, null, null, strArr, null);
            while (true) {
                try {
                    if (!query.moveToNext()) {
                        break;
                    }
                    String string = query.getString(0);
                    str2 = I0.f70578i;
                    if (str2.equals(string)) {
                        break;
                    }
                } finally {
                }
            }
            query.close();
        } catch (Throwable unused) {
        }
    }
}
