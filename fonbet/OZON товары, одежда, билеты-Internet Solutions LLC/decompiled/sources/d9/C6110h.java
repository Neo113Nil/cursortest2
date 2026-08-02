package d9;

import a9.C4962a;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Log;
import b9.C5587b;
import b9.C5588c;
import c9.C5769a;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzj;
import com.google.android.gms.internal.mlkit_vision_text_common.zzp;

/* renamed from: d9.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C6110h implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f61353a;

    /* renamed from: b, reason: collision with root package name */
    private final zzp f61354b = new zzp(null);

    /* renamed from: c, reason: collision with root package name */
    private boolean f61355c;

    /* renamed from: d, reason: collision with root package name */
    private zzh f61356d;

    C6110h(Context context) {
        this.f61353a = context;
    }

    @Override // d9.n
    public final C5769a a(C4962a c4962a) throws R8.a {
        Bitmap b11;
        if (this.f61356d == null) {
            zzb();
        }
        if (this.f61356d == null) {
            throw new R8.a("Waiting for the text recognition module to be downloaded. Please wait.", 14);
        }
        int i11 = 0;
        if (c4962a.c() == -1) {
            b11 = c4962a.b();
            i11 = C5587b.a(0);
        } else {
            b11 = C5588c.b(c4962a);
        }
        int i12 = i11;
        try {
            return l.a(((zzh) Preconditions.checkNotNull(this.f61356d)).zze(ObjectWrapper.wrap(b11), new zzd(c4962a.e(), c4962a.d(), 0, 0L, i12)));
        } catch (RemoteException e11) {
            throw new R8.a("Failed to run legacy text recognizer.", e11);
        }
    }

    @Override // d9.n
    public final void zzb() throws R8.a {
        Context context = this.f61353a;
        if (this.f61356d != null) {
            return;
        }
        try {
            zzh zzd = zzj.zza(DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.dynamite").instantiate("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator")).zzd(ObjectWrapper.wrap(context), this.f61354b);
            this.f61356d = zzd;
            if (zzd != null || this.f61355c) {
                return;
            }
            Log.d("LegacyTextDelegate", "Request OCR optional module download.");
            Feature[] featureArr = com.google.mlkit.common.sdkinternal.l.f60042a;
            com.google.mlkit.common.sdkinternal.l.b(context, zzaf.zzh("ocr"));
            this.f61355c = true;
        } catch (RemoteException e11) {
            throw new R8.a("Failed to create legacy text recognizer.", e11);
        } catch (DynamiteModule.LoadingException e12) {
            throw new R8.a("Failed to load deprecated vision dynamite module.", e12);
        }
    }

    @Override // d9.n
    public final void zzc() {
        zzh zzhVar = this.f61356d;
        if (zzhVar != null) {
            try {
                zzhVar.zzd();
            } catch (RemoteException e11) {
                Log.e("LegacyTextDelegate", "Failed to release legacy text recognizer.", e11);
            }
            this.f61356d = null;
        }
    }
}
