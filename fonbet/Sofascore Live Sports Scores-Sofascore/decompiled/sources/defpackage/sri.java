package defpackage;

import com.sofascore.results.tv.TVChannelEditorActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sri implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TVChannelEditorActivity b;

    public /* synthetic */ sri(TVChannelEditorActivity tVChannelEditorActivity, int i) {
        this.a = i;
        this.b = tVChannelEditorActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        TVChannelEditorActivity tVChannelEditorActivity = this.b;
        switch (i) {
            case 0:
                return tVChannelEditorActivity.getDefaultViewModelProviderFactory();
            case 1:
                return tVChannelEditorActivity.getViewModelStore();
            default:
                return tVChannelEditorActivity.getDefaultViewModelCreationExtras();
        }
    }
}
