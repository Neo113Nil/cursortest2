package defpackage;

import com.sofascore.results.media.highlights.MediaHighlightsActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a5c implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaHighlightsActivity b;

    public /* synthetic */ a5c(MediaHighlightsActivity mediaHighlightsActivity, int i) {
        this.a = i;
        this.b = mediaHighlightsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MediaHighlightsActivity mediaHighlightsActivity = this.b;
        switch (i) {
            case 0:
                return mediaHighlightsActivity.getDefaultViewModelProviderFactory();
            case 1:
                return mediaHighlightsActivity.getViewModelStore();
            default:
                return mediaHighlightsActivity.getDefaultViewModelCreationExtras();
        }
    }
}
