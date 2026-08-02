package defpackage;

import com.inmobi.media.C3401em;
import kotlin.jvm.functions.Function0;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class v8m implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ XmlPullParser b;
    public final /* synthetic */ asf c;
    public final /* synthetic */ C3401em d;
    public final /* synthetic */ asf e;

    public /* synthetic */ v8m(XmlPullParser xmlPullParser, asf asfVar, C3401em c3401em, asf asfVar2) {
        this.b = xmlPullParser;
        this.c = asfVar;
        this.d = c3401em;
        this.e = asfVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        asf asfVar = this.e;
        C3401em c3401em = this.d;
        asf asfVar2 = this.c;
        XmlPullParser xmlPullParser = this.b;
        switch (i) {
            case 0:
                return C3401em.a(xmlPullParser, c3401em, asfVar2, asfVar);
            default:
                return C3401em.a(xmlPullParser, asfVar2, c3401em, asfVar);
        }
    }

    public /* synthetic */ v8m(XmlPullParser xmlPullParser, C3401em c3401em, asf asfVar, asf asfVar2) {
        this.b = xmlPullParser;
        this.d = c3401em;
        this.c = asfVar;
        this.e = asfVar2;
    }
}
