package e9;

import androidx.annotation.NonNull;
import c9.InterfaceC5771c;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.text.latin.ModuleDescriptor;
import com.google.mlkit.common.sdkinternal.h;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: e9.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6320a implements InterfaceC5771c {

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public static final C6320a f62040c = new C6320a();

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference f62041a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private final String f62042b = "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile";

    @Override // c9.InterfaceC5771c
    @NonNull
    public final String a() {
        return true != c() ? "play-services-mlkit-text-recognition" : "text-recognition";
    }

    @Override // c9.InterfaceC5771c
    @NonNull
    public final String b() {
        return this.f62042b;
    }

    @Override // c9.InterfaceC5771c
    public final boolean c() {
        AtomicReference atomicReference = this.f62041a;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean z11 = DynamiteModule.getLocalVersion(h.c().b(), ModuleDescriptor.MODULE_ID) > 0;
        atomicReference.set(Boolean.valueOf(z11));
        return z11;
    }

    @Override // c9.InterfaceC5771c
    public final int d() {
        return c() ? 24317 : 24306;
    }

    @Override // c9.InterfaceC5771c
    @NonNull
    public final String e() {
        return true != c() ? "com.google.android.gms.vision.ocr" : ModuleDescriptor.MODULE_ID;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6320a)) {
            return false;
        }
        ((C6320a) obj).getClass();
        return Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(null);
    }
}
