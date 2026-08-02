package k5;

import Ve.Sp;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: k5.o1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7549o1 extends D0<Om0.a> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70815e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final Sp f70816f;

    C7549o1(@NonNull Sp sp, @NonNull Context context) {
        super(Mm0.e.HoursSinceInstall);
        this.f70815e = context;
        this.f70816f = sp;
    }

    @Override // k5.D0
    @NonNull
    protected final Om0.a s() throws D1 {
        int i11;
        Om0.a aVar = new Om0.a();
        Om0.a aVar2 = new Om0.a();
        Om0.a aVar3 = new Om0.a();
        Set<String> keySet = Mm0.e.a().keySet();
        Sp sp = this.f70816f;
        for (Map.Entry<String, String> entry : Mm0.e.a().entrySet()) {
            String key = entry.getValue().isEmpty() ? entry.getKey() : entry.getValue();
            if (!key.isEmpty()) {
                try {
                    i11 = (int) TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - this.f70815e.getPackageManager().getPackageInfo(entry.getKey(), 4096).firstInstallTime);
                } catch (PackageManager.NameNotFoundException unused) {
                    i11 = -1;
                }
                if (keySet.contains(entry.getKey())) {
                    aVar2.put(key, Integer.valueOf(i11));
                } else {
                    aVar3.put(key, Integer.valueOf(i11));
                }
            }
        }
        if (!aVar2.isEmpty()) {
            HashSet a11 = sp.a();
            Mm0.e eVar = Mm0.e.Default;
            if (a11.contains(eVar)) {
                aVar.put(eVar.name(), aVar2);
            }
        }
        if (!aVar3.isEmpty()) {
            HashSet a12 = sp.a();
            Mm0.e eVar2 = Mm0.e.Custom;
            if (a12.contains(eVar2)) {
                aVar.put(eVar2.name(), aVar3);
            }
        }
        return aVar;
    }
}
