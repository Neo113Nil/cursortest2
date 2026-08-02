package defpackage;

import com.sofascore.results.chat.ChatTranslateActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ks2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatTranslateActivity b;

    public /* synthetic */ ks2(ChatTranslateActivity chatTranslateActivity, int i) {
        this.a = i;
        this.b = chatTranslateActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ChatTranslateActivity chatTranslateActivity = this.b;
        switch (i) {
            case 0:
                return chatTranslateActivity.getDefaultViewModelProviderFactory();
            case 1:
                return chatTranslateActivity.getViewModelStore();
            default:
                return chatTranslateActivity.getDefaultViewModelCreationExtras();
        }
    }
}
