package d9;

import androidx.annotation.NonNull;
import b9.C5590e;
import c9.InterfaceC5770b;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzow;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrx;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsa;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuf;
import e9.C6320a;
import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
public final class o extends C5590e implements InterfaceC5770b {

    /* renamed from: g, reason: collision with root package name */
    private final C6320a f61361g;

    o(@NonNull C6105c c6105c, @NonNull Executor executor, @NonNull zzuc zzucVar, @NonNull C6320a c6320a) {
        super(c6105c, executor);
        this.f61361g = c6320a;
        zzow zzowVar = new zzow();
        zzowVar.zze(c6320a.c() ? zzot.TYPE_THICK : zzot.TYPE_THIN);
        zzrx zzrxVar = new zzrx();
        zzsa zzsaVar = new zzsa();
        zzsaVar.zza(C6103a.a(1));
        zzrxVar.zze(zzsaVar.zzc());
        zzowVar.zzh(zzrxVar.zzf());
        zzucVar.zzd(zzuf.zzg(zzowVar, 1), zzov.ON_DEVICE_TEXT_CREATE);
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return C6104b.a(this.f61361g);
    }
}
