package defpackage;

import android.content.Intent;
import com.sofascore.results.media.news.TopNewsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class llj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TopNewsActivity b;

    public /* synthetic */ llj(TopNewsActivity topNewsActivity, int i) {
        this.a = i;
        this.b = topNewsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        int i = this.a;
        TopNewsActivity topNewsActivity = this.b;
        switch (i) {
            case 0:
                int i2 = TopNewsActivity.O;
                return wrh.b(topNewsActivity.getLayoutInflater(), null, false);
            case 1:
                int i3 = TopNewsActivity.O;
                fdi fdiVar = ((qlj) topNewsActivity.K.getValue()).j;
                do {
                    value = fdiVar.getValue();
                } while (!fdiVar.k(value, plj.a((plj) value, null, 0, 7)));
                return Unit.a;
            case 2:
                int i4 = TopNewsActivity.O;
                topNewsActivity.finish();
                return Unit.a;
            case 3:
                int i5 = TopNewsActivity.O;
                Intent intent = topNewsActivity.getIntent();
                if (intent != null) {
                    return Boolean.valueOf(intent.getBooleanExtra("from_world_cup", false));
                }
                return null;
            default:
                int i6 = TopNewsActivity.O;
                return topNewsActivity.getIntent().getStringExtra("analytics_location");
        }
    }
}
