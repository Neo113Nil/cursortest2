package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tyd extends xka implements Function1 {
    public static final tyd j;
    public static final tyd k;
    public static final tyd l;
    public static final tyd m;
    public static final tyd n;
    public static final tyd o;
    public static final tyd p;
    public static final tyd q;
    public static final tyd r;
    public static final tyd s;
    public static final tyd t;
    public static final tyd u;
    public static final tyd v;
    public final /* synthetic */ int i;

    static {
        int i = 1;
        j = new tyd(i, 0);
        k = new tyd(i, 1);
        l = new tyd(i, 2);
        m = new tyd(i, 3);
        n = new tyd(i, 4);
        o = new tyd(i, 5);
        p = new tyd(i, 6);
        q = new tyd(i, 7);
        r = new tyd(i, 8);
        s = new tyd(i, 9);
        t = new tyd(i, 10);
        u = new tyd(i, 11);
        v = new tyd(i, 12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyd(fsf fsfVar) {
        super(1);
        this.i = 18;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.i) {
            case 0:
                wma wmaVar = (wma) obj;
                if (wmaVar.H()) {
                    wmaVar.F();
                }
                return Unit.a;
            case 1:
                return Unit.a;
            case 2:
                b2f b2fVar = (b2f) obj;
                if (b2fVar.isAttachedToWindow()) {
                    b2fVar.q();
                }
                return Unit.a;
            case 3:
                return Boolean.FALSE;
            case 4:
                return Unit.a;
            case 5:
                return Integer.valueOf(((xtg) obj).b);
            case 6:
                return Integer.valueOf(((xtg) obj).c.b());
            case 7:
                return Unit.a;
            case 8:
                int i = ((lu9) obj).a;
                return Unit.a;
            case 9:
                return Unit.a;
            case 10:
                int i2 = ((lu9) obj).a;
                return Unit.a;
            case 11:
                String str = ((k38) obj).a;
                str.getClass();
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
                uRLConnection.getClass();
                return (HttpURLConnection) uRLConnection;
            case 12:
                ExoPlayer exoPlayer = (ExoPlayer) obj;
                exoPlayer.getClass();
                ((vg6) exoPlayer).release();
                return Unit.a;
            case 13:
                String str2 = ((k38) obj).a;
                str2.getClass();
                cjb.a("Error firing CLICKED event tracker [" + str2 + ']');
                return Unit.a;
            case 14:
                return new c7a((((int) (((c7a) obj).a & 4294967295L)) & 4294967295L) | (0 << 32));
            case 15:
                return new c7a((((int) (((c7a) obj).a >> 32)) << 32) | (4294967295L & 0));
            case 16:
                return new c7a((((int) (((c7a) obj).a & 4294967295L)) & 4294967295L) | (0 << 32));
            case 17:
                return new c7a((((int) (((c7a) obj).a >> 32)) << 32) | (4294967295L & 0));
            case 18:
                ((rf9) obj).getClass();
                return Boolean.TRUE;
            default:
                uy8 uy8Var = (uy8) obj;
                return Boolean.valueOf((uy8Var instanceof fy0) || (uy8Var instanceof ic));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tyd(int i, int i2) {
        super(i);
        this.i = i2;
    }
}
