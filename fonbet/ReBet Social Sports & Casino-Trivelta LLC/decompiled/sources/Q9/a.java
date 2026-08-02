package Q9;

import android.app.Activity;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC3163x;
import com.google.android.gms.common.api.internal.C3118a;
import com.google.android.gms.common.api.internal.InterfaceC3153s;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.internal.fido.zzo;
import com.google.android.gms.internal.fido.zzp;
import com.google.android.gms.internal.fido.zzs;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public static final C3117a.g f9556a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3117a f9557b;

    static {
        C3117a.g gVar = new C3117a.g();
        f9556a = gVar;
        f9557b = new C3117a("Fido.FIDO2_API", new zzo(), gVar);
    }

    public a(Activity activity) {
        super(activity, f9557b, C3117a.d.f32289J4, new C3118a());
    }

    public Task d(final PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        return doRead(AbstractC3163x.a().b(new InterfaceC3153s() { // from class: Q9.b
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                a aVar = a.this;
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions2 = publicKeyCredentialCreationOptions;
                ((zzs) ((zzp) obj).getService()).zzc(new c(aVar, (TaskCompletionSource) obj2), publicKeyCredentialCreationOptions2);
            }
        }).e(5407).a());
    }
}
