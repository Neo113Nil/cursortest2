package defpackage;

import android.content.ClipData;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.ScrollCaptureTarget;
import androidx.compose.runtime.e;
import java.util.Arrays;
import java.util.function.Consumer;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xo3 implements yo3, ap3 {
    public final /* synthetic */ int a;
    public final Object b;

    public xo3() {
        this.a = 2;
        this.b = e.f(Boolean.FALSE);
    }

    @Override // defpackage.yo3
    public void a(Uri uri) {
        ((ContentInfo.Builder) this.b).setLinkUri(uri);
    }

    @Override // defpackage.ap3
    public ContentInfo b() {
        return (ContentInfo) this.b;
    }

    @Override // defpackage.yo3
    public bp3 build() {
        return new bp3(new xo3(((ContentInfo.Builder) this.b).build()));
    }

    @Override // defpackage.ap3
    public ClipData c() {
        return ((ContentInfo) this.b).getClip();
    }

    @Override // defpackage.yo3
    public void d(int i) {
        ((ContentInfo.Builder) this.b).setFlags(i);
    }

    @Override // defpackage.ap3
    public int e() {
        return ((ContentInfo) this.b).getFlags();
    }

    public void f(xy xyVar, v3h v3hVar, CoroutineContext coroutineContext, Consumer consumer) {
        i1d i1dVar = new i1d(new xtg[16], 0);
        v7a.H(v3hVar.a(), 0, new i43(1, i1dVar, i1d.class, "add", "add(Ljava/lang/Object;)Z", 8, 4));
        Arrays.sort(i1dVar.a, 0, i1dVar.c, o93.a(tyd.o, tyd.p));
        int i = i1dVar.c;
        xtg xtgVar = (xtg) (i == 0 ? null : i1dVar.a[i - 1]);
        if (xtgVar == null) {
            return;
        }
        x6a x6aVar = xtgVar.c;
        xe3 xe3Var = new xe3(xtgVar.a, x6aVar, s9a.c(coroutineContext), this, xyVar);
        wdd wddVar = xtgVar.d;
        oqf p = o6a.y(wddVar).p(wddVar, true);
        long c = x6aVar.c();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(xyVar, wba.M(y6a.J(p)), new Point((int) (c >> 32), (int) (c & 4294967295L)), xe3Var);
        scrollCaptureTarget.setScrollBounds(wba.M(x6aVar));
        consumer.accept(scrollCaptureTarget);
    }

    @Override // defpackage.ap3
    public int getSource() {
        return ((ContentInfo) this.b).getSource();
    }

    @Override // defpackage.yo3
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.b).setExtras(bundle);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            default:
                return super.toString();
        }
    }

    public xo3(ContentInfo contentInfo) {
        this.a = 1;
        contentInfo.getClass();
        this.b = contentInfo;
    }

    public xo3(ClipData clipData, int i) {
        this.a = 0;
        this.b = pz.f(clipData, i);
    }
}
