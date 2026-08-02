package ru.ozon.android.composerCommonViewKit.emptyState.di;

import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import k20.InterfaceC7469a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.c;
import m20.InterfaceC8046a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;
import ru.ozon.android.composerCommonViewKit.emptyState.di.EmptyStateWidgetComponent;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.core.StatusWidgetParser;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.core.EmptyStateV2Parser;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR(\u0010\u000f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/di/EmptyStateWidgetComponent;", "Lhi/a;", "Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/core/StatusWidgetParser;", "getStatusParser", "()Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/core/StatusWidgetParser;", "statusParser", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/core/EmptyStateV2Parser;", "getEmptyStateParser", "()Lru/ozon/android/composerCommonViewKit/emptyState/v2/core/EmptyStateV2Parser;", "emptyStateParser", "", "Lm20/a;", "Ll20/c;", "getViewMappers", "()[Lm20/a;", "viewMappers", "Companion", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface EmptyStateWidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0006H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/di/EmptyStateWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "storage", "Lkotlin/Function1;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "pJsonParser", "Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "pActionHandlersFactory", "Lk20/e;", "Lru/ozon/android/composerCommonViewKit/emptyState/di/EmptyStateWidgetComponent;", "invoke", "(Lk20/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lk20/e;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EmptyStateWidgetComponent invoke$lambda$0(Function1 function1, C7475g c7475g, Function1 function12) {
            return new EmptyStateWidgetComponent$Companion$invoke$1$1(function1, c7475g, function12);
        }

        @NotNull
        public final C7473e<EmptyStateWidgetComponent> invoke(@NotNull final C7475g storage, @NotNull final Function1<? super C7475g, ? extends JsonParser> pJsonParser, @NotNull final Function1<? super C7475g, ? extends ActionHandlersFactory> pActionHandlersFactory) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            Intrinsics.checkNotNullParameter(pJsonParser, "pJsonParser");
            Intrinsics.checkNotNullParameter(pActionHandlersFactory, "pActionHandlersFactory");
            return new C7473e<>(N.b(EmptyStateWidgetComponent.class), new InterfaceC7469a() { // from class: Th.a
                @Override // k20.InterfaceC7469a
                public final InterfaceC6958a component() {
                    EmptyStateWidgetComponent invoke$lambda$0;
                    invoke$lambda$0 = EmptyStateWidgetComponent.Companion.invoke$lambda$0(Function1.this, storage, pActionHandlersFactory);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @NotNull
    EmptyStateV2Parser getEmptyStateParser();

    @NotNull
    StatusWidgetParser getStatusParser();

    @NotNull
    InterfaceC8046a<?, ? extends c>[] getViewMappers();
}
