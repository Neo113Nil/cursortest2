package defpackage;

import android.os.Bundle;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.results.feed.MediaExternalVideoDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class u4c implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaExternalVideoDialog b;

    public /* synthetic */ u4c(MediaExternalVideoDialog mediaExternalVideoDialog, int i) {
        this.a = i;
        this.b = mediaExternalVideoDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MediaExternalVideoDialog mediaExternalVideoDialog = this.b;
        switch (i) {
            case 0:
                Bundle requireArguments = mediaExternalVideoDialog.requireArguments();
                requireArguments.getClass();
                return (Highlight) gz8.M(requireArguments, "HIGHLIGHT", Highlight.class);
            default:
                mediaExternalVideoDialog.k(false, false);
                return Unit.a;
        }
    }
}
