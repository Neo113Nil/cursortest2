package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;
import java.time.Instant;
import java.time.ZoneOffset;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class s6i extends p8 {
    public final /* synthetic */ int c;
    public final u22 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6i(u22 u22Var, int i) {
        super(u22Var.b);
        this.c = i;
        switch (i) {
            case 1:
                super(u22Var.b);
                this.d = u22Var;
                break;
            default:
                this.d = u22Var;
                break;
        }
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        int i3 = this.c;
        u22 u22Var = this.d;
        switch (i3) {
            case 0:
                p6i p6iVar = (p6i) obj;
                p6iVar.getClass();
                TextView textView = u22Var.b;
                sea.v(textView, false, i == i2 + (-1), 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                boolean z = p6iVar.b;
                Long l = p6iVar.a;
                if (!z) {
                    textView.setSelected(false);
                    String string = textView.getContext().getString(R.string.last_updated);
                    Context context = textView.getContext();
                    context.getClass();
                    textView.setText(string + ": " + rik.j(context, l.longValue(), bi4.PATTERN_DMM, ", "));
                    break;
                } else {
                    textView.setSelected(true);
                    textView.setText(R.string.motorsport_live_updates_status);
                    break;
                }
            default:
                bai baiVar = (bai) obj;
                baiVar.getClass();
                long j = baiVar.a;
                TextView textView2 = u22Var.b;
                sea.v(textView2, false, baiVar.c, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                if (!baiVar.b) {
                    textView2.setSelected(false);
                    Instant ofEpochSecond = Instant.ofEpochSecond(j);
                    ZoneOffset zoneOffset = ZoneOffset.UTC;
                    int year = ofEpochSecond.atZone(zoneOffset).getYear();
                    int year2 = Instant.now().atZone(zoneOffset).getYear();
                    String string2 = textView2.getContext().getString(R.string.last_updated);
                    Context context2 = textView2.getContext();
                    context2.getClass();
                    textView2.setText(string2 + ": " + rik.j(context2, j, year == year2 ? bi4.PATTERN_DMM : bi4.PATTERN_DMMY, ", "));
                    break;
                } else {
                    textView2.setSelected(true);
                    textView2.setText(R.string.live_standings);
                    break;
                }
        }
    }
}
