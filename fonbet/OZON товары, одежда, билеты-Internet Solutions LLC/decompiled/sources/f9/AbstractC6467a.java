package f9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* renamed from: f9.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC6467a {

    @KeepForSdk
    /* renamed from: f9.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1006a {
        @NonNull
        @KeepForSdk
        public abstract AbstractC6467a a();

        @NonNull
        @KeepForSdk
        public abstract AbstractC1006a b(boolean z11);
    }

    @NonNull
    @KeepForSdk
    public static AbstractC1006a a(@NonNull String str, String str2, @NonNull String str3) {
        d dVar = new d();
        dVar.c(str);
        if (str2 == null) {
            str2 = "mlkit-google-ocr-models";
        }
        dVar.e(str2);
        dVar.d(str3);
        dVar.b(false);
        return dVar;
    }

    abstract String b();

    abstract String c();

    abstract String d();

    abstract boolean e();
}
