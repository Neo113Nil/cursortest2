package ru.ozon.app.android.search.categories;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Intent;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.updates.VoiceRecognitionData;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\f"}, d2 = {"Lru/ozon/app/android/search/categories/VoiceRecognitionConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VoiceRecognitionConfigurator extends ComposerScreenConfig.PageConfigurator {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final InterfaceC4008j<Integer> VOICE_RECOGNITION_KEY$delegate = k.b(VoiceRecognitionConfigurator$Companion$VOICE_RECOGNITION_KEY$2.INSTANCE);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/search/categories/VoiceRecognitionConfigurator$Companion;", "", "<init>", "()V", "", "VOICE_RECOGNITION_KEY$delegate", "LSc/j;", "getVOICE_RECOGNITION_KEY", "()I", "VOICE_RECOGNITION_KEY", "", "VOICE_RECOGNITION_TOKEN", "Ljava/lang/String;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getVOICE_RECOGNITION_KEY() {
            return ((Number) VoiceRecognitionConfigurator.VOICE_RECOGNITION_KEY$delegate.getValue()).intValue();
        }

        private Companion() {
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        InterfaceC7851b controller;
        ArrayList<String> stringArrayListExtra;
        Companion companion = INSTANCE;
        if (requestCode == companion.getVOICE_RECOGNITION_KEY() && resultCode == -1) {
            String str = (data == null || (stringArrayListExtra = data.getStringArrayListExtra("android.speech.extra.RESULTS")) == null) ? null : (String) C7714v.M(stringArrayListExtra);
            if (str == null) {
                str = "";
            }
            ConfiguratorReferences references = getReferences();
            if (references == null || (controller = references.getController()) == null) {
                return;
            }
            controller.update(new VoiceRecognitionData(companion.getVOICE_RECOGNITION_KEY(), str));
        }
    }
}
