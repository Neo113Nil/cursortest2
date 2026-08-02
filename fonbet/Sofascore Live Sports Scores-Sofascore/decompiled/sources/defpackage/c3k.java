package defpackage;

import android.content.Context;
import com.google.android.material.button.MaterialButton;
import com.sofascore.results.event.details.view.tv.dialog.TvChannelContributionDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class c3k implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TvChannelContributionDialog b;

    public /* synthetic */ c3k(TvChannelContributionDialog tvChannelContributionDialog, int i) {
        this.a = i;
        this.b = tvChannelContributionDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        TvChannelContributionDialog tvChannelContributionDialog = this.b;
        switch (i) {
            case 0:
                MaterialButton materialButton = tvChannelContributionDialog.D;
                if (materialButton != null) {
                    materialButton.setEnabled(true);
                }
                return Unit.a;
            case 1:
                return tvChannelContributionDialog.requireArguments().getString("ARG_COUNTRY_CODE", "");
            case 2:
                return tvChannelContributionDialog.requireArguments().getString("ARG_TV_CHANNEL_NAME");
            default:
                Context requireContext = tvChannelContributionDialog.requireContext();
                requireContext.getClass();
                f3k f3kVar = new f3k(requireContext);
                f3kVar.a.d = new uri(f3kVar, 14);
                return f3kVar;
        }
    }
}
