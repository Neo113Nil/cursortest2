package ru.ozon.app.android.videomoleculecompose.slots.lifecyclePlayback;

import S0.M;
import S0.N;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseMediaPlayController;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS0/N;", "LS0/M;", "invoke", "(LS0/N;)LS0/M;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class DefaultVideoMoleculeLifecyclePlaybackEffectKt$DefaultVideoMoleculeLifecyclePlaybackEffect$1$1 extends AbstractC7737t implements Function1<N, M> {
    final /* synthetic */ AbstractC5434v $lifecycle;
    final /* synthetic */ BasePlayerController $playerController;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC5434v.a.values().length];
            try {
                iArr[AbstractC5434v.a.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC5434v.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultVideoMoleculeLifecyclePlaybackEffectKt$DefaultVideoMoleculeLifecyclePlaybackEffect$1$1(BasePlayerController basePlayerController, AbstractC5434v abstractC5434v) {
        super(1);
        this.$playerController = basePlayerController;
        this.$lifecycle = abstractC5434v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(I i11, BaseMediaPlayController baseMediaPlayController, J j11, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(j11, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i12 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i12 != 1) {
            if (i12 == 2 && i11.f71783a) {
                i11.f71783a = false;
                baseMediaPlayController.resume();
                return;
            }
            return;
        }
        boolean isPlaying = baseMediaPlayController.isPlaying();
        i11.f71783a = isPlaying;
        if (isPlaying) {
            baseMediaPlayController.pause();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final BaseMediaPlayController mediaPlayController = this.$playerController.mediaPlayController();
        final I i11 = new I();
        final G g10 = new G() { // from class: ru.ozon.app.android.videomoleculecompose.slots.lifecyclePlayback.a
            @Override // androidx.lifecycle.G
            public final void onStateChanged(J j11, AbstractC5434v.a aVar) {
                DefaultVideoMoleculeLifecyclePlaybackEffectKt$DefaultVideoMoleculeLifecyclePlaybackEffect$1$1.invoke$lambda$0(I.this, mediaPlayController, j11, aVar);
            }
        };
        this.$lifecycle.a(g10);
        final AbstractC5434v abstractC5434v = this.$lifecycle;
        return new M() { // from class: ru.ozon.app.android.videomoleculecompose.slots.lifecyclePlayback.DefaultVideoMoleculeLifecyclePlaybackEffectKt$DefaultVideoMoleculeLifecyclePlaybackEffect$1$1$invoke$$inlined$onDispose$1
            @Override // S0.M
            public void dispose() {
                AbstractC5434v.this.e(g10);
            }
        };
    }
}
