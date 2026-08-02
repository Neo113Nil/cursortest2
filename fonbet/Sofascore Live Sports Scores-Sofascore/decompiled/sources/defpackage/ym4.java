package defpackage;

import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ym4 implements qdb, rdb, dp4, ep4 {
    public final /* synthetic */ int a;

    public /* synthetic */ ym4(int i) {
        this.a = i;
    }

    @Override // defpackage.dp4, defpackage.ep4
    public Constructor a() {
        int i = this.a;
        Class cls = Integer.TYPE;
        switch (i) {
            case 28:
                if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(kl6.class).getConstructor(cls);
                }
                return null;
            default:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(ll6.class).getConstructor(cls);
                }
                return null;
        }
    }

    @Override // defpackage.rdb
    public void b(Object obj, i78 i78Var) {
    }

    @Override // defpackage.qdb
    public void invoke(Object obj) {
        sv svVar = (sv) obj;
        switch (this.a) {
            case 0:
                svVar.getClass();
                break;
            case 1:
                svVar.getClass();
                break;
            case 2:
                svVar.getClass();
                break;
            case 3:
                svVar.getClass();
                break;
            case 4:
                svVar.getClass();
                break;
            case 5:
                svVar.getClass();
                break;
            case 6:
                svVar.getClass();
                break;
            case 7:
                svVar.getClass();
                break;
            case 8:
                svVar.getClass();
                break;
            case 9:
                svVar.getClass();
                break;
            case 10:
            default:
                svVar.getClass();
                break;
            case 11:
                svVar.getClass();
                break;
            case 12:
                svVar.getClass();
                break;
            case 13:
                svVar.getClass();
                break;
            case 14:
                svVar.getClass();
                break;
            case 15:
                svVar.getClass();
                break;
            case 16:
                svVar.getClass();
                break;
            case 17:
                svVar.getClass();
                break;
            case 18:
                svVar.getClass();
                break;
            case 19:
                svVar.getClass();
                break;
            case 20:
                svVar.getClass();
                break;
            case 21:
                svVar.getClass();
                break;
            case 22:
                svVar.getClass();
                break;
            case 23:
                svVar.getClass();
                break;
            case 24:
                svVar.getClass();
                break;
            case 25:
                svVar.getClass();
                break;
            case 26:
                svVar.getClass();
                break;
        }
    }
}
