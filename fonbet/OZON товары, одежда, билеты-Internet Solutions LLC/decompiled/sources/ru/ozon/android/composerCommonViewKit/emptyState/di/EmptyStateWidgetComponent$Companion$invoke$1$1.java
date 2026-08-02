package ru.ozon.android.composerCommonViewKit.emptyState.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import l20.c;
import m20.InterfaceC8046a;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.core.StatusWidgetParser;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.core.EmptyStateV2Parser;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

@Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R/\u0010\u0018\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\u00140\u00130\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"ru/ozon/android/composerCommonViewKit/emptyState/di/EmptyStateWidgetComponent$Companion$invoke$1$1", "Lru/ozon/android/composerCommonViewKit/emptyState/di/EmptyStateWidgetComponent;", "Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "actionHandlersFactory$delegate", "LSc/j;", "getActionHandlersFactory", "()Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "actionHandlersFactory", "Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/core/StatusWidgetParser;", "statusParser$delegate", "getStatusParser", "()Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/core/StatusWidgetParser;", "statusParser", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/core/EmptyStateV2Parser;", "emptyStateParser$delegate", "getEmptyStateParser", "()Lru/ozon/android/composerCommonViewKit/emptyState/v2/core/EmptyStateV2Parser;", "emptyStateParser", "", "Lm20/a;", "Ll20/c;", "viewMappers$delegate", "getViewMappers", "()[Lm20/a;", "viewMappers", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "getJsonParser", "()Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "jsonParser", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EmptyStateWidgetComponent$Companion$invoke$1$1 implements EmptyStateWidgetComponent {
    final /* synthetic */ Function1<C7475g, JsonParser> $pJsonParser;
    final /* synthetic */ C7475g $storage;

    /* renamed from: actionHandlersFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j actionHandlersFactory;

    /* renamed from: statusParser$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j statusParser = k.b(new EmptyStateWidgetComponent$Companion$invoke$1$1$statusParser$2(this));

    /* renamed from: emptyStateParser$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j emptyStateParser = k.b(new EmptyStateWidgetComponent$Companion$invoke$1$1$emptyStateParser$2(this));

    /* renamed from: viewMappers$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewMappers = k.b(new EmptyStateWidgetComponent$Companion$invoke$1$1$viewMappers$2(this));

    /* JADX WARN: Multi-variable type inference failed */
    EmptyStateWidgetComponent$Companion$invoke$1$1(Function1<? super C7475g, ? extends JsonParser> function1, C7475g c7475g, Function1<? super C7475g, ? extends ActionHandlersFactory> function12) {
        this.$pJsonParser = function1;
        this.$storage = c7475g;
        this.actionHandlersFactory = k.b(new EmptyStateWidgetComponent$Companion$invoke$1$1$actionHandlersFactory$2(function12, c7475g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActionHandlersFactory getActionHandlersFactory() {
        return (ActionHandlersFactory) this.actionHandlersFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonParser getJsonParser() {
        return this.$pJsonParser.invoke(this.$storage);
    }

    @Override // ru.ozon.android.composerCommonViewKit.emptyState.di.EmptyStateWidgetComponent
    public EmptyStateV2Parser getEmptyStateParser() {
        return (EmptyStateV2Parser) this.emptyStateParser.getValue();
    }

    @Override // ru.ozon.android.composerCommonViewKit.emptyState.di.EmptyStateWidgetComponent
    public StatusWidgetParser getStatusParser() {
        return (StatusWidgetParser) this.statusParser.getValue();
    }

    @Override // ru.ozon.android.composerCommonViewKit.emptyState.di.EmptyStateWidgetComponent
    public InterfaceC8046a<?, ? extends c>[] getViewMappers() {
        return (InterfaceC8046a[]) this.viewMappers.getValue();
    }
}
