package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.TextureView;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cpk implements qyf, lb3 {
    public final plk d;
    public final String[] e;

    public cpk() {
        plk plkVar = plk.a;
        String[] strArr = {MimeTypes.APPLICATION_M3U8, MimeTypes.VIDEO_MP4, MimeTypes.VIDEO_H263, "video/avc", "video/x-flv"};
        this.d = plkVar;
        this.e = strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059 A[Catch: all -> 0x008a, TryCatch #0 {all -> 0x008a, blocks: (B:3:0x0008, B:5:0x0023, B:8:0x002a, B:12:0x004d, B:14:0x0059, B:16:0x005d, B:18:0x0061, B:19:0x006c, B:21:0x0072, B:24:0x007f, B:27:0x0086, B:35:0x0090, B:36:0x0099, B:38:0x009f, B:40:0x00ab, B:42:0x00ad, B:45:0x00b1, B:47:0x00b7, B:50:0x00ca, B:60:0x008e, B:61:0x0035, B:63:0x003b, B:64:0x003f), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f A[Catch: all -> 0x008a, TryCatch #0 {all -> 0x008a, blocks: (B:3:0x0008, B:5:0x0023, B:8:0x002a, B:12:0x004d, B:14:0x0059, B:16:0x005d, B:18:0x0061, B:19:0x006c, B:21:0x0072, B:24:0x007f, B:27:0x0086, B:35:0x0090, B:36:0x0099, B:38:0x009f, B:40:0x00ab, B:42:0x00ad, B:45:0x00b1, B:47:0x00b7, B:50:0x00ca, B:60:0x008e, B:61:0x0035, B:63:0x003b, B:64:0x003f), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7 A[Catch: all -> 0x008a, TryCatch #0 {all -> 0x008a, blocks: (B:3:0x0008, B:5:0x0023, B:8:0x002a, B:12:0x004d, B:14:0x0059, B:16:0x005d, B:18:0x0061, B:19:0x006c, B:21:0x0072, B:24:0x007f, B:27:0x0086, B:35:0x0090, B:36:0x0099, B:38:0x009f, B:40:0x00ab, B:42:0x00ad, B:45:0x00b1, B:47:0x00b7, B:50:0x00ca, B:60:0x008e, B:61:0x0035, B:63:0x003b, B:64:0x003f), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #0 {all -> 0x008a, blocks: (B:3:0x0008, B:5:0x0023, B:8:0x002a, B:12:0x004d, B:14:0x0059, B:16:0x005d, B:18:0x0061, B:19:0x006c, B:21:0x0072, B:24:0x007f, B:27:0x0086, B:35:0x0090, B:36:0x0099, B:38:0x009f, B:40:0x00ab, B:42:0x00ad, B:45:0x00b1, B:47:0x00b7, B:50:0x00ca, B:60:0x008e, B:61:0x0035, B:63:0x003b, B:64:0x003f), top: B:2:0x0008 }] */
    /* JADX WARN: Type inference failed for: r17v0, types: [pyf] */
    /* JADX WARN: Type inference failed for: r3v0, types: [km5] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    @Override // defpackage.qyf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(hcd hcdVar, lcd lcdVar, pyf pyfVar) {
        Object u2gVar;
        String str;
        NetworkInfo activeNetworkInfo;
        int i;
        tkk tkkVar;
        ?? r3;
        ArrayList arrayList;
        Iterator it;
        flk flkVar;
        alk alkVar;
        int i2;
        hcdVar.getClass();
        try {
            p2g p2gVar = w2g.b;
            Context context = lcdVar.getContext();
            context.getClass();
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() == 1) {
                i2 = 20000;
            } else if (activeNetworkInfo.getType() == 0) {
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        i2 = 400;
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        i2 = TTAdConstant.STYLE_SIZE_RADIO_3_2;
                        break;
                    case 13:
                    case 18:
                    case 19:
                    case 20:
                        i2 = 10000;
                        break;
                }
                olk x = f6a.x(hcdVar.a());
                tkkVar = x.b;
                if (tkkVar != null || (flkVar = tkkVar.a) == null || (alkVar = flkVar.d) == null) {
                    r3 = km5.a;
                } else {
                    ArrayList arrayList2 = alkVar.a;
                    r3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        List a = ((zkk) next).a();
                        if (a != null && !a.isEmpty()) {
                            r3.add(next);
                        }
                    }
                }
                arrayList = new ArrayList();
                it = r3.iterator();
                while (it.hasNext()) {
                    List a2 = ((zkk) it.next()).a();
                    if (a2 == null) {
                        a2 = km5.a;
                    }
                    o13.v(a2, arrayList);
                }
                if (arrayList.isEmpty()) {
                    ((pcd) pyfVar).onError(new qcd(4, "Invalid VAST markup", null));
                    b6a.p(x, 2);
                    return;
                }
                rlk rlkVar = new rlk(hcdVar.b(), new TextureView(lcdVar.getContext()), this.d, x, i);
                lcdVar.addView(rlkVar.b, 0, new ViewGroup.LayoutParams(-1, -1));
                pkk pkkVar = new pkk(hcdVar, lcdVar, rlkVar, x, hcdVar.i());
                lcdVar.d = pkkVar;
                pyfVar.onAdRendered(pkkVar);
                pkkVar.p();
                u2gVar = Unit.a;
                Throwable a3 = w2g.a(u2gVar);
                if (a3 != null) {
                    pcd pcdVar = (pcd) pyfVar;
                    if (a3 instanceof XmlPullParserException) {
                        str = bf3.o(new StringBuilder("Invalid VAST markup "), a3);
                    } else {
                        str = "Error loading VAST media " + a3 + ".message";
                    }
                    pcdVar.onError(new qcd(4, str, a3));
                    return;
                }
                return;
            }
            i = i2;
            olk x2 = f6a.x(hcdVar.a());
            tkkVar = x2.b;
            if (tkkVar != null) {
            }
            r3 = km5.a;
            arrayList = new ArrayList();
            it = r3.iterator();
            while (it.hasNext()) {
            }
            if (arrayList.isEmpty()) {
            }
        }
        i = 0;
        olk x22 = f6a.x(hcdVar.a());
        tkkVar = x22.b;
        if (tkkVar != null) {
        }
        r3 = km5.a;
        arrayList = new ArrayList();
        it = r3.iterator();
        while (it.hasNext()) {
        }
        if (arrayList.isEmpty()) {
        }
    }

    @Override // defpackage.lb3
    public final void b() {
        qyf.a.put("video", this);
        gcd.c = this.e;
        plk plkVar = this.d;
        if (plkVar != null) {
            oie.a().registerComponentCallbacks(plkVar);
        }
    }
}
