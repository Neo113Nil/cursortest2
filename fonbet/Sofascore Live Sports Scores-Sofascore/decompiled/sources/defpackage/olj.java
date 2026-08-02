package defpackage;

import com.sofascore.results.media.news.TopNewsActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class olj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TopNewsActivity b;

    public /* synthetic */ olj(TopNewsActivity topNewsActivity, int i) {
        this.a = i;
        this.b = topNewsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        TopNewsActivity topNewsActivity = this.b;
        switch (i) {
            case 0:
                return topNewsActivity.getDefaultViewModelProviderFactory();
            case 1:
                return topNewsActivity.getViewModelStore();
            default:
                return topNewsActivity.getDefaultViewModelCreationExtras();
        }
    }
}
