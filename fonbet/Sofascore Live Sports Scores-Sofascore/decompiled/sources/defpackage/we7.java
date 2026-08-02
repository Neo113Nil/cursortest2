package defpackage;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class we7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ we7(int i, long j, int i2) {
        this.a = i2;
        this.b = i;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        long j = this.c;
        int i2 = this.b;
        SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
        switch (i) {
            case 0:
                editor.getClass();
                editor.putLong("competition_" + i2 + "_reveal_timestamp", j);
                break;
            case 1:
                editor.getClass();
                if (i2 <= 3) {
                    editor.putInt("PREF_AI_TAB_OPEN_COUNT", i2);
                }
                if (j == 0) {
                    editor.putLong("PREF_AI_TAB_FIRST_OPEN_TIMESTAMP", System.currentTimeMillis());
                }
                break;
            default:
                editor.getClass();
                editor.putLong("timestamp_for_update_version_" + i2, j);
                break;
        }
        return Unit.a;
    }
}
