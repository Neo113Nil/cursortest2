package k5;

import android.os.Environment;
import android.os.StatFs;
import androidx.annotation.NonNull;
import java.util.HashSet;

/* loaded from: classes8.dex */
public final class N1 extends D0<Om0.a> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final HashSet f70613e;

    N1(@NonNull HashSet hashSet) {
        super(Mm0.e.FileSystemInfo);
        this.f70613e = hashSet;
    }

    @Override // k5.D0
    @NonNull
    protected final Om0.a s() throws D1 {
        Om0.a aVar = new Om0.a();
        Mm0.e eVar = Mm0.e.RootBytes;
        HashSet hashSet = this.f70613e;
        if (hashSet.contains(eVar)) {
            aVar.put("RootBytes", String.valueOf(new StatFs(Environment.getRootDirectory().getPath()).getTotalBytes()));
        }
        if (hashSet.contains(Mm0.e.DataBytes)) {
            aVar.put("DataBytes", String.valueOf(new StatFs(Environment.getDataDirectory().getPath()).getTotalBytes()));
        }
        if (hashSet.contains(Mm0.e.ExStorageBytes)) {
            aVar.put("ExStorageBytes", String.valueOf(new StatFs(Environment.getExternalStorageDirectory().getPath()).getTotalBytes()));
        }
        return aVar;
    }
}
