package defpackage;

import com.inmobi.media.C3401em;
import kotlin.jvm.functions.Function0;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class u8m implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ XmlPullParser b;
    public final /* synthetic */ C3401em c;
    public final /* synthetic */ asf d;

    public /* synthetic */ u8m(XmlPullParser xmlPullParser, C3401em c3401em, asf asfVar, int i) {
        this.a = i;
        this.b = xmlPullParser;
        this.c = c3401em;
        this.d = asfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        asf asfVar = this.d;
        C3401em c3401em = this.c;
        XmlPullParser xmlPullParser = this.b;
        switch (i) {
            case 0:
                return C3401em.a(xmlPullParser, c3401em, asfVar);
            default:
                return C3401em.b(xmlPullParser, c3401em, asfVar);
        }
    }
}
