package d9;

import a9.C4962a;
import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import b9.C5587b;
import b9.C5589d;
import c9.C5769a;
import c9.InterfaceC5771c;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzow;
import com.google.android.gms.internal.mlkit_vision_text_common.zzru;
import com.google.android.gms.internal.mlkit_vision_text_common.zztr;
import com.google.android.gms.internal.mlkit_vision_text_common.zzub;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuq;
import com.google.android.gms.internal.mlkit_vision_text_common.zzut;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzux;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvh;

/* renamed from: d9.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C6109g implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f61347a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5771c f61348b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f61349c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f61350d;

    /* renamed from: e, reason: collision with root package name */
    private final zzuc f61351e;

    /* renamed from: f, reason: collision with root package name */
    private zzuv f61352f;

    C6109g(Context context, InterfaceC5771c interfaceC5771c, zzuc zzucVar) {
        this.f61347a = context;
        this.f61348b = interfaceC5771c;
        this.f61351e = zzucVar;
    }

    private static zzvh b(InterfaceC5771c interfaceC5771c, String str) {
        boolean z11 = false;
        if ((interfaceC5771c instanceof InterfaceC6108f) && ((InterfaceC6108f) interfaceC5771c).zza()) {
            z11 = true;
        }
        return new zzvh(interfaceC5771c.b(), "optional-module-text-latin", str, true, 1, "en", z11);
    }

    @Override // d9.n
    public final C5769a a(C4962a c4962a) throws R8.a {
        if (this.f61352f == null) {
            zzb();
        }
        zzuv zzuvVar = (zzuv) Preconditions.checkNotNull(this.f61352f);
        boolean z11 = this.f61349c;
        InterfaceC5771c interfaceC5771c = this.f61348b;
        if (!z11) {
            try {
                zzuvVar.zze();
                this.f61349c = true;
            } catch (RemoteException e11) {
                throw new R8.a("Failed to init text recognizer ".concat(interfaceC5771c.a()), e11);
            }
        }
        zzuq zzuqVar = new zzuq(c4962a.c(), c4962a.e(), c4962a.d(), C5587b.a(0), SystemClock.elapsedRealtime());
        C5589d.b().getClass();
        try {
            return new C5769a(zzuvVar.zzd(C5589d.a(c4962a), zzuqVar));
        } catch (RemoteException e12) {
            throw new R8.a("Failed to run text recognizer ".concat(interfaceC5771c.a()), e12);
        }
    }

    @Override // d9.n
    public final void zzb() throws R8.a {
        zzuv zzd;
        zzuc zzucVar = this.f61351e;
        Context context = this.f61347a;
        InterfaceC5771c interfaceC5771c = this.f61348b;
        if (this.f61352f != null) {
            return;
        }
        try {
            boolean z11 = interfaceC5771c instanceof InterfaceC6107e;
            String zza = z11 ? ((InterfaceC6107e) interfaceC5771c).zza() : null;
            if (interfaceC5771c.c()) {
                Log.d("DecoupledTextDelegate", "Start loading thick OCR module.");
                zzd = zzux.zza(DynamiteModule.load(context, DynamiteModule.PREFER_LOCAL, interfaceC5771c.e()).instantiate("com.google.mlkit.vision.text.bundled.common.BundledTextRecognizerCreator")).zze(ObjectWrapper.wrap(context), b(interfaceC5771c, zza));
            } else if (z11) {
                Log.d("DecoupledTextDelegate", "Start loading custom OCR module.");
                zzd = zzut.zza(DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, interfaceC5771c.e()).instantiate("com.google.android.gms.vision.text.mlkit.CommonTextRecognizerCreator")).zzd(ObjectWrapper.wrap(context), null, b(interfaceC5771c, zza));
            } else {
                Log.d("DecoupledTextDelegate", "Start loading thin OCR module.");
                zzd = zzux.zza(DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, interfaceC5771c.e()).instantiate("com.google.android.gms.vision.text.mlkit.TextRecognizerCreator")).zzd(ObjectWrapper.wrap(context));
            }
            this.f61352f = zzd;
            final boolean c11 = interfaceC5771c.c();
            final zzou zzouVar = zzou.NO_ERROR;
            zzucVar.zzf(new zzub() { // from class: d9.m
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzub
                public final zztr zza() {
                    zzow zzowVar = new zzow();
                    zzowVar.zze(c11 ? zzot.TYPE_THICK : zzot.TYPE_THIN);
                    zzru zzruVar = new zzru();
                    zzruVar.zzb(zzouVar);
                    zzowVar.zzg(zzruVar.zzc());
                    return zzuf.zzf(zzowVar);
                }
            }, zzov.ON_DEVICE_TEXT_LOAD);
        } catch (RemoteException e11) {
            final boolean c12 = interfaceC5771c.c();
            final zzou zzouVar2 = zzou.OPTIONAL_MODULE_INIT_ERROR;
            zzucVar.zzf(new zzub() { // from class: d9.m
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzub
                public final zztr zza() {
                    zzow zzowVar = new zzow();
                    zzowVar.zze(c12 ? zzot.TYPE_THICK : zzot.TYPE_THIN);
                    zzru zzruVar = new zzru();
                    zzruVar.zzb(zzouVar2);
                    zzowVar.zzg(zzruVar.zzc());
                    return zzuf.zzf(zzowVar);
                }
            }, zzov.ON_DEVICE_TEXT_LOAD);
            throw new R8.a("Failed to create text recognizer ".concat(interfaceC5771c.a()), e11);
        } catch (DynamiteModule.LoadingException e12) {
            final boolean c13 = interfaceC5771c.c();
            final zzou zzouVar3 = zzou.OPTIONAL_MODULE_NOT_AVAILABLE;
            zzucVar.zzf(new zzub() { // from class: d9.m
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzub
                public final zztr zza() {
                    zzow zzowVar = new zzow();
                    zzowVar.zze(c13 ? zzot.TYPE_THICK : zzot.TYPE_THIN);
                    zzru zzruVar = new zzru();
                    zzruVar.zzb(zzouVar3);
                    zzowVar.zzg(zzruVar.zzc());
                    return zzuf.zzf(zzowVar);
                }
            }, zzov.ON_DEVICE_TEXT_LOAD);
            if (interfaceC5771c.c()) {
                throw new R8.a(Sh.b.c("Failed to load text module ", interfaceC5771c.a(), ". ", e12.getMessage()), e12);
            }
            if (!this.f61350d) {
                com.google.mlkit.common.sdkinternal.l.c(context, C6104b.a(interfaceC5771c));
                this.f61350d = true;
            }
            throw new R8.a("Waiting for the text optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override // d9.n
    public final void zzc() {
        zzuv zzuvVar = this.f61352f;
        if (zzuvVar != null) {
            try {
                zzuvVar.zzf();
            } catch (RemoteException e11) {
                Log.e("DecoupledTextDelegate", "Failed to release text recognizer ".concat(this.f61348b.a()), e11);
            }
            this.f61352f = null;
        }
        this.f61349c = false;
    }
}
