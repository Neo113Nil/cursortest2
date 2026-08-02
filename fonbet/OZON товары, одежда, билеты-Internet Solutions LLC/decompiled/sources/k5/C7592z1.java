package k5;

import Ve.Sp;
import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedList;

/* renamed from: k5.z1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7592z1 extends D0<Serializable> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70894e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    Sp f70895f;

    C7592z1(@NonNull Sp sp, @NonNull Context context) {
        super(Mm0.e.PackageManager);
        this.f70895f = sp;
        this.f70894e = context;
    }

    @Override // k5.D0
    @NonNull
    protected final Serializable s() throws D1 {
        Om0.a aVar = new Om0.a();
        PackageManager packageManager = this.f70894e.getPackageManager();
        Sp sp = this.f70895f;
        if (sp.a().contains(Mm0.e.SystemAvailableFeatures)) {
            FeatureInfo[] systemAvailableFeatures = packageManager.getSystemAvailableFeatures();
            LinkedList linkedList = new LinkedList();
            aVar.put("SystemAvailableFeatures", linkedList);
            for (FeatureInfo featureInfo : systemAvailableFeatures) {
                String str = featureInfo.name;
                if (str != null) {
                    linkedList.add(str);
                }
            }
        }
        if (sp.a().contains(Mm0.e.SystemSharedLibraryNames)) {
            String[] systemSharedLibraryNames = packageManager.getSystemSharedLibraryNames();
            LinkedList linkedList2 = new LinkedList();
            aVar.put("SystemSharedLibraryNames", linkedList2);
            if (systemSharedLibraryNames != null) {
                linkedList2.addAll(Arrays.asList(systemSharedLibraryNames));
            }
        }
        if (!new LinkedList().contains(Mm0.e.PackageManager)) {
            return aVar;
        }
        try {
            return Nm0.e.b(Nm0.e.c(Nm0.e.d(aVar)), "TestKey");
        } catch (Throwable unused) {
            return "";
        }
    }
}
