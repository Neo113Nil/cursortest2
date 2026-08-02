package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.sofascore.local_persistance.Brand;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.branding.BrandType;
import com.sofascore.model.mvvm.model.Team;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class x22 implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;

    public /* synthetic */ x22(jqe jqeVar, y21 y21Var, Team team, int i, Double d) {
        this.e = jqeVar;
        this.c = y21Var;
        this.d = team;
        this.b = i;
        this.f = d;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Serializable serializable = this.f;
        int i2 = this.b;
        Serializable serializable2 = this.d;
        Serializable serializable3 = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                BrandLocation brandLocation = (BrandLocation) serializable3;
                String str = (String) serializable2;
                BrandType brandType = (BrandType) serializable;
                Integer valueOf = Integer.valueOf(i2);
                if (str == null) {
                    str = "";
                }
                nv.q(context, valueOf, brandLocation, str, brandType);
                break;
            case 1:
                ImageView imageView = (ImageView) obj;
                Context context2 = imageView.getContext();
                context2.getClass();
                nv.o(context2, Integer.valueOf(i2), (BrandLocation) serializable3, ((Brand) serializable).getSlug(), BrandType.BANNER);
                Context context3 = imageView.getContext();
                context3.getClass();
                bea.G(context3, (String) serializable2);
                break;
            default:
                y21 y21Var = (y21) serializable3;
                Team team = (Team) serializable2;
                Double d = (Double) serializable;
                gt8 gt8Var = ((jqe) obj).q;
                if (gt8Var != null) {
                    gt8Var.invoke(Integer.valueOf(y21Var.d().getId()), team, y21Var.d().getStatusType(), Integer.valueOf(i2), d, y21Var.d().getHasXg());
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ x22(Context context, int i, BrandLocation brandLocation, String str, BrandType brandType) {
        this.e = context;
        this.b = i;
        this.c = brandLocation;
        this.d = str;
        this.f = brandType;
    }

    public /* synthetic */ x22(ImageView imageView, int i, BrandLocation brandLocation, Brand brand, String str) {
        this.e = imageView;
        this.b = i;
        this.c = brandLocation;
        this.f = brand;
        this.d = str;
    }
}
