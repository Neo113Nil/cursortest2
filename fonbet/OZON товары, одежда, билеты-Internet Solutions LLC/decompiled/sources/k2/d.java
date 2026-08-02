package k2;

import androidx.annotation.NonNull;
import j2.f;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class d extends j2.d {

    /* renamed from: n0, reason: collision with root package name */
    protected float f70300n0;

    /* renamed from: o0, reason: collision with root package name */
    @NonNull
    @Deprecated
    protected HashMap<String, Float> f70301o0;

    /* renamed from: p0, reason: collision with root package name */
    @NonNull
    @Deprecated
    protected HashMap<String, Float> f70302p0;

    /* renamed from: q0, reason: collision with root package name */
    @NonNull
    @Deprecated
    protected HashMap<String, Float> f70303q0;

    /* renamed from: r0, reason: collision with root package name */
    private HashMap<String, Float> f70304r0;

    /* renamed from: s0, reason: collision with root package name */
    private HashMap<String, Float> f70305s0;

    /* renamed from: t0, reason: collision with root package name */
    @NonNull
    protected f.a f70306t0;

    public d(@NonNull j2.f fVar, @NonNull f.d dVar) {
        super(fVar, dVar);
        this.f70300n0 = 0.5f;
        this.f70301o0 = new HashMap<>();
        this.f70302p0 = new HashMap<>();
        this.f70303q0 = new HashMap<>();
        this.f70306t0 = f.a.SPREAD;
    }

    public final void L(@NonNull String str, float f7, float f11, float f12, float f13, float f14) {
        H(str);
        String obj = str.toString();
        if (!Float.isNaN(f7)) {
            this.f70301o0.put(obj, Float.valueOf(f7));
        }
        if (!Float.isNaN(f11)) {
            this.f70302p0.put(obj, Float.valueOf(f11));
        }
        if (!Float.isNaN(f12)) {
            this.f70303q0.put(obj, Float.valueOf(f12));
        }
        if (!Float.isNaN(f13)) {
            if (this.f70304r0 == null) {
                this.f70304r0 = new HashMap<>();
            }
            this.f70304r0.put(obj, Float.valueOf(f13));
        }
        if (Float.isNaN(f14)) {
            return;
        }
        if (this.f70305s0 == null) {
            this.f70305s0 = new HashMap<>();
        }
        this.f70305s0.put(obj, Float.valueOf(f14));
    }

    @NonNull
    public final void M(float f7) {
        this.f70300n0 = f7;
    }

    final float N(@NonNull String str) {
        HashMap<String, Float> hashMap = this.f70305s0;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return 0.0f;
        }
        return this.f70305s0.get(str).floatValue();
    }

    protected final float O(@NonNull String str) {
        HashMap<String, Float> hashMap = this.f70303q0;
        if (hashMap.containsKey(str)) {
            return hashMap.get(str).floatValue();
        }
        return 0.0f;
    }

    final float P(@NonNull String str) {
        HashMap<String, Float> hashMap = this.f70304r0;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return 0.0f;
        }
        return this.f70304r0.get(str).floatValue();
    }

    protected final float Q(@NonNull String str) {
        HashMap<String, Float> hashMap = this.f70302p0;
        if (hashMap.containsKey(str)) {
            return hashMap.get(str).floatValue();
        }
        return 0.0f;
    }

    @NonNull
    public final void R(@NonNull f.a aVar) {
        this.f70306t0 = aVar;
    }
}
