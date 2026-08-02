package c6;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.IOException;

/* loaded from: classes.dex */
public final class x implements T5.k<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final o f56608a;

    public x(o oVar) {
        this.f56608a = oVar;
    }

    @Override // T5.k
    public final boolean a(@NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull T5.i iVar) throws IOException {
        ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
        String str = Build.MANUFACTURER;
        return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor2.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // T5.k
    public final V5.v<Bitmap> b(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i11, int i12, @NonNull T5.i iVar) throws IOException {
        return this.f56608a.a(parcelFileDescriptor, i11, i12, iVar);
    }
}
