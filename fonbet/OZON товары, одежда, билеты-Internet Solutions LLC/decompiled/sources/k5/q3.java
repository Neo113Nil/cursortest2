package k5;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import java.util.HashSet;

/* loaded from: classes8.dex */
public final class q3 extends D0<Om0.a> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70832e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final HashSet f70833f;

    q3(@NonNull HashSet hashSet, @NonNull Context context) {
        super(Mm0.e.DisplayMetrics);
        this.f70833f = hashSet;
        this.f70832e = context;
    }

    @Override // k5.D0
    @NonNull
    protected final Om0.a s() throws D1 {
        Om0.a aVar = new Om0.a();
        DisplayMetrics displayMetrics = this.f70832e.getResources().getDisplayMetrics();
        Mm0.e eVar = Mm0.e.Density;
        HashSet hashSet = this.f70833f;
        if (hashSet.contains(eVar)) {
            aVar.put("Density", Float.valueOf(displayMetrics.density));
        }
        if (hashSet.contains(Mm0.e.DensityDpi)) {
            aVar.put("DensityDpi", Integer.valueOf(displayMetrics.densityDpi));
        }
        if (hashSet.contains(Mm0.e.ScaledDensity)) {
            aVar.put("ScaledDensity", Float.valueOf(displayMetrics.scaledDensity));
        }
        return aVar;
    }
}
