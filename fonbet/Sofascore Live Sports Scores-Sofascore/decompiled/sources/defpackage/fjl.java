package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.branding.BrandType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class fjl implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fjl(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj4;
                Context context = (Context) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                if (function0 != null) {
                    function0.invoke();
                } else {
                    BrandLocation brandLocation = BrandLocation.FeaturedTournament;
                    if (str == null) {
                        str = "";
                    }
                    nv.o(context, 16, brandLocation, str, BrandType.BANNER);
                    bea.G(context, str2);
                }
                break;
            default:
                uxm uxmVar = (uxm) obj4;
                boolean z = e0n.n;
                ImageView imageView = uxmVar.s;
                imageView.getClass();
                ctl.setPlayerButtonUi$default(imageView, ((BlazeVideosPlayerStyle) obj3).getButtons().getFullScreen(), false, ((n4m) obj2).b, null, 10, null);
                uxmVar.s.setOnClickListener(new b0n((e0n) obj, 8));
                break;
        }
        return Unit.a;
    }
}
