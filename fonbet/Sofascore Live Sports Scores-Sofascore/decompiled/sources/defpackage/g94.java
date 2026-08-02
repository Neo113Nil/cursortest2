package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g94 extends b8d {
    public final KSerializer r;
    public final String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g94(KSerializer kSerializer) {
        super(true);
        kSerializer.getClass();
        this.r = kSerializer;
        this.s = FantasyRoundPlayerUiModel.class.getName();
    }

    @Override // defpackage.b8d
    public final Object a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        return (Parcelable) gz8.K(bundle, str, FantasyRoundPlayerUiModel.class);
    }

    @Override // defpackage.b8d
    public final String b() {
        return this.s;
    }

    @Override // defpackage.b8d
    public final Object d(String str) {
        str.getClass();
        if (str.length() == 0) {
            return null;
        }
        bga bgaVar = vga.a;
        KSerializer kSerializer = this.r;
        String decode = Uri.decode(str);
        decode.getClass();
        return (Parcelable) bgaVar.b(kSerializer, decode);
    }

    @Override // defpackage.b8d
    public final void e(Bundle bundle, String str, Object obj) {
        str.getClass();
        bundle.putParcelable(str, (Parcelable) obj);
    }

    @Override // defpackage.b8d
    public final String f(Object obj) {
        String encode;
        Parcelable parcelable = (Parcelable) obj;
        return (parcelable == null || (encode = Uri.encode(vga.a.c(this.r, parcelable))) == null) ? "" : encode;
    }
}
