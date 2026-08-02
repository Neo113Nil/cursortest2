package defpackage;

import android.os.Bundle;
import com.blaze.blazesdk.ads.custom_native.models.BlazeAdRequestData;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import com.blaze.blazesdk.features.moments.widgets.compose.BlazeComposeWidgetMomentsStateHandler;
import com.blaze.blazesdk.features.moments.widgets.compose.row.BlazeComposeMomentsWidgetRowViewKt;
import com.blaze.blazesdk.features.stories.widgets.compose.BlazeComposeWidgetStoriesStateHandler;
import com.blaze.blazesdk.features.stories.widgets.compose.row.BlazeComposeStoriesWidgetRowViewKt;
import com.blaze.blazesdk.features.videos.players.ui.VideosPlayerActivity;
import com.blaze.blazesdk.features.videos.widgets.compose.BlazeComposeWidgetVideosStateHandler;
import com.blaze.blazesdk.features.videos.widgets.compose.row.BlazeComposeVideosWidgetRowViewKt;
import com.blaze.blazesdk.shared.BlazeSDK;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class di implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ di(int i, xmd xmdVar, vmd vmdVar, boolean z, int i2) {
        this.a = 9;
        this.c = i;
        this.d = xmdVar;
        this.e = vmdVar;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        boolean z = this.b;
        Object obj3 = this.d;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                hi.e((r9k) obj3, z, (String) obj4, (of3) obj, aba.K(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                BlazeComposeMomentsWidgetRowViewKt.a((xtc) obj3, (BlazeComposeWidgetMomentsStateHandler) obj4, z, (of3) obj, aba.K(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                BlazeComposeStoriesWidgetRowViewKt.a((xtc) obj3, (BlazeComposeWidgetStoriesStateHandler) obj4, z, (of3) obj, aba.K(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                BlazeComposeVideosWidgetRowViewKt.a((xtc) obj3, (BlazeComposeWidgetVideosStateHandler) obj4, z, (of3) obj, aba.K(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ml4.h((b83) obj3, z, (xtc) obj4, (of3) obj, aba.K(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                wnn.g((Long) obj3, (xtc) obj4, z, (of3) obj, aba.K(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                int K = aba.K(3073);
                fqj.f((gv9) obj3, this.c, this.b, (xtc) obj4, (of3) obj, K);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int K2 = aba.K(1);
                z8e.j((lj7) obj3, this.c, this.b, (xtc) obj4, (of3) obj, K2);
                break;
            case 8:
                ((Integer) obj2).getClass();
                t62.r((ux6) obj3, z, (xtc) obj4, (of3) obj, aba.K(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                int K3 = aba.K(1);
                ku7.a(this.c, (xmd) obj3, (vmd) obj4, this.b, (of3) obj, K3);
                break;
            case 10:
                ((Integer) obj2).getClass();
                fkf.j((oz6) obj3, z, (xtc) obj4, (of3) obj, aba.K(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                int K4 = aba.K(1);
                u0a.g(this.c, (r2f) obj3, this.b, (Function0) obj4, (of3) obj, K4);
                break;
            case 12:
                ((Integer) obj2).getClass();
                w3a.a((q1h) obj3, z, (y1h) obj4, (of3) obj, aba.K(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                w3a.c((r1h) obj3, z, (y1h) obj4, (of3) obj, aba.K(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                y6a.m((h4j) obj3, z, (Function1) obj4, (of3) obj, aba.K(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                u0a.o(z, (d1g) obj3, (tbj) obj4, (of3) obj, aba.K(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                rrj.b((String) obj4, z, (Function0) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                euj.a((wtj) obj3, z, (xtc) obj4, (of3) obj, aba.K(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).intValue();
                VideosPlayerActivity.a aVar = VideosPlayerActivity.u;
                ((VideosPlayerActivity) obj3).t((Bundle) obj4, z, (of3) obj, aba.K(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                int K5 = aba.K(1);
                q5a.g((ajl) obj3, this.c, this.b, (Function1) obj4, (of3) obj, K5);
                break;
            case 20:
                BlazeContentExtraInfo blazeContentExtraInfo = (BlazeContentExtraInfo) obj;
                Function1 function1 = (Function1) obj2;
                blazeContentExtraInfo.getClass();
                function1.getClass();
                evl.dispatchOnIO$default(BlazeSDK.INSTANCE, null, new dyl((BlazeAdRequestData) obj3, blazeContentExtraInfo, this.c, (String) obj4, this.b, function1, null), 1, null);
                break;
            default:
                ((Integer) obj2).getClass();
                tmm.b((String) obj4, z, (tc3) obj3, (of3) obj, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ di(int i, int i2, int i3, Object obj, Object obj2, boolean z) {
        this.a = i3;
        this.d = obj;
        this.c = i;
        this.b = z;
        this.e = obj2;
    }

    public /* synthetic */ di(int i, r2f r2fVar, boolean z, Function0 function0, int i2) {
        this.a = 11;
        this.c = i;
        this.d = r2fVar;
        this.b = z;
        this.e = function0;
    }

    public /* synthetic */ di(int i, BlazeAdRequestData blazeAdRequestData, String str, boolean z) {
        this.a = 20;
        this.d = blazeAdRequestData;
        this.c = i;
        this.e = str;
        this.b = z;
    }

    public /* synthetic */ di(Object obj, Object obj2, boolean z, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.c = i;
    }

    public /* synthetic */ di(Object obj, boolean z, Object obj2, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = z;
        this.e = obj2;
        this.c = i;
    }

    public /* synthetic */ di(String str, boolean z, dt8 dt8Var, int i, int i2) {
        this.a = i2;
        this.e = str;
        this.b = z;
        this.d = dt8Var;
        this.c = i;
    }

    public /* synthetic */ di(boolean z, d1g d1gVar, tbj tbjVar, int i) {
        this.a = 15;
        this.b = z;
        this.d = d1gVar;
        this.e = tbjVar;
        this.c = i;
    }
}
