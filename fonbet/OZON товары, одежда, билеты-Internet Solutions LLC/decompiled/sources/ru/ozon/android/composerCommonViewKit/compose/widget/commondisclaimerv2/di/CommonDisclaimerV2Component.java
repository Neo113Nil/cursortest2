package ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.di;

import Cn.C2782a;
import Ug.a;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/di/CommonDisclaimerV2Component;", "Lhi/a;", "LUg/a;", "getActionHandlerComponentApi", "()LUg/a;", "actionHandlerComponentApi", "Companion", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CommonDisclaimerV2Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/di/CommonDisclaimerV2Component$Companion;", "", "<init>", "()V", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/di/CommonDisclaimerV2Component;", "invoke", "(Lk20/g;)Lk20/e;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CommonDisclaimerV2Component invoke$lambda$0(final C7475g c7475g) {
            return new CommonDisclaimerV2Component() { // from class: ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.di.CommonDisclaimerV2Component$Companion$invoke$1$1
                @Override // ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.di.CommonDisclaimerV2Component
                public a getActionHandlerComponentApi() {
                    return (a) C7475g.this.getComponent(a.class);
                }
            };
        }

        @NotNull
        public final C7473e<CommonDisclaimerV2Component> invoke(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(CommonDisclaimerV2Component.class), new C2782a(storage, 5));
        }
    }

    @NotNull
    a getActionHandlerComponentApi();
}
