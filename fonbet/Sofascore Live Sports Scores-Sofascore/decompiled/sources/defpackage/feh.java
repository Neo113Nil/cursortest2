package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.branding.BrandType;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class feh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;

    public /* synthetic */ feh(Context context, String str, int i) {
        this.a = i;
        this.b = context;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        File unityAdsDataStoreFile;
        int i = this.a;
        String str = this.c;
        Context context = this.b;
        switch (i) {
            case 0:
                SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
            case 1:
                unityAdsDataStoreFile = ContextExtensionsKt.unityAdsDataStoreFile(context, str);
                return unityAdsDataStoreFile;
            case 2:
                return b6a.y(context, "widget_preferences_" + str);
            default:
                nv.q(context, 16, BrandLocation.FeaturedTournament, str, BrandType.BANNER);
                return Unit.a;
        }
    }
}
