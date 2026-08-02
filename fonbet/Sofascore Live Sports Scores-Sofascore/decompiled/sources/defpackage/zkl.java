package defpackage;

import android.content.Intent;
import com.sofascore.results.wc26.widget.configurationActivity.WorldCupWidgetConfigActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class zkl extends ot8 implements Function0 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zkl(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.b = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.b) {
            case 0:
                WorldCupWidgetConfigActivity worldCupWidgetConfigActivity = (WorldCupWidgetConfigActivity) this.receiver;
                int i = WorldCupWidgetConfigActivity.N;
                worldCupWidgetConfigActivity.getClass();
                Intent putExtra = new Intent().putExtra("appWidgetId", ((Number) worldCupWidgetConfigActivity.K.getValue()).intValue());
                putExtra.getClass();
                worldCupWidgetConfigActivity.setResult(-1, putExtra);
                worldCupWidgetConfigActivity.finish();
                break;
            default:
                ((WorldCupWidgetConfigActivity) this.receiver).finish();
                break;
        }
        return Unit.a;
    }
}
