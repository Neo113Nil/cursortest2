package defpackage;

import com.google.android.gms.internal.ads.zzgtz;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzguz;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class fho extends pyh {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fho(zzguz zzguzVar, CharSequence charSequence, Object obj, int i) {
        super(zzguzVar, charSequence);
        this.i = i;
        this.j = obj;
    }

    @Override // defpackage.pyh
    public final int c(int i) {
        int i2 = this.i;
        Object obj = this.j;
        switch (i2) {
            case 0:
                CharSequence charSequence = this.d;
                int length = charSequence.length();
                zzguk.j(i, length);
                while (i < length) {
                    if (((sgo) obj).a(charSequence.charAt(i))) {
                        return i;
                    }
                    i++;
                }
                return -1;
            default:
                Matcher matcher = ((aho) ((zzgtz) obj)).a;
                if (matcher.find(i)) {
                    return matcher.start();
                }
                return -1;
        }
    }

    @Override // defpackage.pyh
    public final int d(int i) {
        switch (this.i) {
            case 0:
                return i + 1;
            default:
                return ((aho) ((zzgtz) this.j)).a.end();
        }
    }
}
