package defpackage;

import com.google.android.gms.cast.framework.media.ImagePicker;
import com.google.android.gms.cast.framework.media.zzc;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ioo extends zzc {
    public final /* synthetic */ ImagePicker a;

    public /* synthetic */ ioo(ImagePicker imagePicker) {
        this.a = imagePicker;
    }

    @Override // com.google.android.gms.cast.framework.media.zzd
    public final IObjectWrapper zzf() {
        return new ObjectWrapper(this.a);
    }
}
