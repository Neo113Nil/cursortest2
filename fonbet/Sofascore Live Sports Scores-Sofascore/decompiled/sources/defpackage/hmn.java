package defpackage;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.android.gms.internal.ads.zzhah;
import com.google.android.gms.internal.ads.zzhdr;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class hmn implements PackageManager$OnChecksumsReadyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hmn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onChecksumsReady(List list) {
        int i = this.a;
        Object obj = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                zzhdr zzhdrVar = (zzhdr) obj;
                if (list == null) {
                    zzhdrVar.d(null);
                    break;
                } else {
                    try {
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            ApkChecksum c = hbo.c(list.get(i3));
                            if (c.getType() == 8) {
                                byte[] value = c.getValue();
                                int length = value.length;
                                char[] cArr = new char[length + length];
                                while (i2 < value.length) {
                                    byte b = value[i2];
                                    int i4 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    char[] cArr2 = zzbcj.a;
                                    int i5 = i2 + i2;
                                    cArr[i5] = cArr2[i4 >>> 4];
                                    cArr[i5 + 1] = cArr2[b & 15];
                                    i2++;
                                }
                                zzhdrVar.d(new String(cArr));
                                break;
                            }
                        }
                        zzhdrVar.d(null);
                        break;
                    } catch (Throwable unused) {
                        zzhdrVar.d(null);
                        return;
                    }
                }
            case 1:
                uh2 uh2Var = (uh2) obj;
                if (list == null) {
                    uh2Var.a("");
                    break;
                } else {
                    try {
                        int size2 = list.size();
                        while (i2 < size2) {
                            ApkChecksum c2 = hbo.c(list.get(i2));
                            if (c2.getType() == 8) {
                                zzhah j = zzhah.c.j();
                                byte[] value2 = c2.getValue();
                                uh2Var.a(j.f(value2.length, value2));
                                break;
                            } else {
                                i2++;
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                    uh2Var.a("");
                    break;
                }
            default:
                n8p n8pVar = (n8p) obj;
                if (list == null) {
                    n8pVar.d(null);
                    break;
                } else {
                    try {
                        int size3 = list.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            ApkChecksum c3 = hbo.c(list.get(i6));
                            if (c3.getType() == 8) {
                                byte[] value3 = c3.getValue();
                                int length2 = value3.length;
                                char[] cArr3 = new char[length2 + length2];
                                while (i2 < value3.length) {
                                    byte b2 = value3[i2];
                                    int i7 = b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    char[] cArr4 = m6k.g;
                                    int i8 = i2 + i2;
                                    cArr3[i8] = cArr4[i7 >>> 4];
                                    cArr3[i8 + 1] = cArr4[b2 & 15];
                                    i2++;
                                }
                                n8pVar.d(new String(cArr3));
                                break;
                            }
                        }
                        n8pVar.d(null);
                        break;
                    } catch (Throwable unused3) {
                        n8pVar.d(null);
                    }
                }
        }
    }
}
