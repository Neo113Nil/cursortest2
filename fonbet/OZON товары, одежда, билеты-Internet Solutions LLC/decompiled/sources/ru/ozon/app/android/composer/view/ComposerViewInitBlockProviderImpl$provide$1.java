package ru.ozon.app.android.composer.view;

import Hh.C3140a;
import Ih.b;
import Lm0.a;
import Qj0.AbstractC3880a;
import Qj0.Q;
import Qj0.U;
import android.app.Application;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.g;
import java.util.Iterator;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.c;
import m10.C8042d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.app.android.analytics.eventstorage.ViewEventStorage;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.composer.navigator.redirect.ComposerRedirectHandler;
import ru.ozon.app.android.composer.tracker.AnalyticsExtKt;
import ru.ozon.app.android.composer.view.WidgetsDebugToolsDecoration;
import ru.ozon.app.android.composer.view.performance.ViewHoldersPerformanceTracker;
import ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHoldersRumTracker;
import ru.ozon.app.android.composer.view.screenState.PageIssueListener;
import ru.ozon.app.android.debug.WidgetsDebugToolsInteractor;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.storage.debug.DebugToolsStorage;
import ru.ozon.composer.ui.view.issue.PageIssueStateView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import t10.C9727b;
import y00.AbstractC10819a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll10/i;", "", "invoke", "(Ll10/i;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class ComposerViewInitBlockProviderImpl$provide$1 extends AbstractC7737t implements Function1<i, Unit> {
    final /* synthetic */ ComposerViewInitBlockProviderImpl this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.composer.view.ComposerViewInitBlockProviderImpl$provide$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ ComposerViewInitBlockProviderImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ComposerViewInitBlockProviderImpl composerViewInitBlockProviderImpl) {
            super(0);
            this.this$0 = composerViewInitBlockProviderImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ViewHoldersPerformanceTracker viewHoldersPerformanceTracker;
            viewHoldersPerformanceTracker = this.this$0.viewHoldersPerformanceTracker;
            viewHoldersPerformanceTracker.clearUnfinishedWidgetLayoutEvents();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm10/d;", "", "invoke", "(Lm10/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.composer.view.ComposerViewInitBlockProviderImpl$provide$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<C8042d, Unit> {
        final /* synthetic */ ComposerViewInitBlockProviderImpl this$0;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "", "time", "", "invoke", "(Lru/ozon/composer/ui/widget/k;J)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.composer.view.ComposerViewInitBlockProviderImpl$provide$1$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<k<c>, Long, Unit> {
            final /* synthetic */ ComposerViewInitBlockProviderImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ComposerViewInitBlockProviderImpl composerViewInitBlockProviderImpl) {
                super(2);
                this.this$0 = composerViewInitBlockProviderImpl;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(k<c> kVar, Long l11) {
                invoke(kVar, l11.longValue());
                return Unit.f71690a;
            }

            public final void invoke(k<c> onCreate, long j11) {
                ViewHoldersPerformanceTracker viewHoldersPerformanceTracker;
                Intrinsics.checkNotNullParameter(onCreate, "$this$onCreate");
                viewHoldersPerformanceTracker = this.this$0.viewHoldersPerformanceTracker;
                viewHoldersPerformanceTracker.onCreateViewHolder(onCreate, j11);
                if (onCreate.itemView.getBackground() == null) {
                    View view = onCreate.itemView;
                    if ((view instanceof IslandSeparatorView) || view.getTag(R$id.skip_composer_default_widget_background) != null) {
                        return;
                    }
                    onCreate.itemView.setBackgroundColor(ThemeExtKt.themeColor(onCreate.getContext(), R$attr.layerFloor1));
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "Lru/ozon/composer/ui/widget/l;", "item", "", "invoke", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/composer/ui/widget/l;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.composer.view.ComposerViewInitBlockProviderImpl$provide$1$2$2, reason: invalid class name and collision with other inner class name */
        static final class C17592 extends AbstractC7737t implements Function2<k<c>, l, Unit> {
            final /* synthetic */ ComposerViewInitBlockProviderImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17592(ComposerViewInitBlockProviderImpl composerViewInitBlockProviderImpl) {
                super(2);
                this.this$0 = composerViewInitBlockProviderImpl;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(k<c> kVar, l lVar) {
                invoke2(kVar, lVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<c> onBindStart, l item) {
                ViewHoldersPerformanceTracker viewHoldersPerformanceTracker;
                Intrinsics.checkNotNullParameter(onBindStart, "$this$onBindStart");
                Intrinsics.checkNotNullParameter(item, "item");
                viewHoldersPerformanceTracker = this.this$0.viewHoldersPerformanceTracker;
                viewHoldersPerformanceTracker.onBindStart(onBindStart, item);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "Lru/ozon/composer/ui/widget/l;", "item", "", "invoke", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/composer/ui/widget/l;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.composer.view.ComposerViewInitBlockProviderImpl$provide$1$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends AbstractC7737t implements Function2<k<c>, l, Unit> {
            final /* synthetic */ ComposerViewInitBlockProviderImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(ComposerViewInitBlockProviderImpl composerViewInitBlockProviderImpl) {
                super(2);
                this.this$0 = composerViewInitBlockProviderImpl;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(k<c> kVar, l lVar) {
                invoke2(kVar, lVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final k<c> onBindEnd, final l item) {
                ViewHoldersPerformanceTracker viewHoldersPerformanceTracker;
                ViewHoldersPerformanceTracker viewHoldersPerformanceTracker2;
                boolean isTestUser;
                Intrinsics.checkNotNullParameter(onBindEnd, "$this$onBindEnd");
                Intrinsics.checkNotNullParameter(item, "item");
                if (!(onBindEnd.itemView instanceof BadgeView)) {
                    isTestUser = this.this$0.isTestUser();
                    if (isTestUser) {
                        onBindEnd.itemView.setContentDescription("widget " + item.c().c().g() + "." + item.c().c().c());
                    }
                }
                viewHoldersPerformanceTracker = this.this$0.viewHoldersPerformanceTracker;
                viewHoldersPerformanceTracker.onBindEnd(onBindEnd, item);
                final View itemView = onBindEnd.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                final ComposerViewInitBlockProviderImpl composerViewInitBlockProviderImpl = this.this$0;
                if (!itemView.isAttachedToWindow()) {
                    itemView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.ozon.app.android.composer.view.ComposerViewInitBlockProviderImpl$provide$1$2$3$invoke$$inlined$doOnAttach$1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(@NotNull View view) {
                            ViewHoldersPerformanceTracker viewHoldersPerformanceTracker3;
                            itemView.removeOnAttachStateChangeListener(this);
                            viewHoldersPerformanceTracker3 = composerViewInitBlockProviderImpl.viewHoldersPerformanceTracker;
                            viewHoldersPerformanceTracker3.onLayoutStart(onBindEnd);
                            View itemView2 = onBindEnd.itemView;
                            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                            itemView2.addOnLayoutChangeListener(new ComposerViewInitBlockProviderImpl$provide$1$2$3$invoke$lambda$1$$inlined$doOnNextLayout$1(composerViewInitBlockProviderImpl, onBindEnd, item));
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(@NotNull View view) {
                        }
                    });
                    return;
                }
                viewHoldersPerformanceTracker2 = composerViewInitBlockProviderImpl.viewHoldersPerformanceTracker;
                viewHoldersPerformanceTracker2.onLayoutStart(onBindEnd);
                View itemView2 = onBindEnd.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                itemView2.addOnLayoutChangeListener(new ComposerViewInitBlockProviderImpl$provide$1$2$3$invoke$lambda$1$$inlined$doOnNextLayout$1(composerViewInitBlockProviderImpl, onBindEnd, item));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ComposerViewInitBlockProviderImpl composerViewInitBlockProviderImpl) {
            super(1);
            this.this$0 = composerViewInitBlockProviderImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C8042d c8042d) {
            invoke2(c8042d);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C8042d adapter) {
            Intrinsics.checkNotNullParameter(adapter, "$this$adapter");
            AnonymousClass1 block = new AnonymousClass1(this.this$0);
            Intrinsics.checkNotNullParameter(adapter, "<this>");
            Intrinsics.checkNotNullParameter(block, "block");
            adapter.i().f(block);
            C17592 block2 = new C17592(this.this$0);
            Intrinsics.checkNotNullParameter(adapter, "<this>");
            Intrinsics.checkNotNullParameter(block2, "block");
            adapter.i().e(block2);
            AnonymousClass3 block3 = new AnonymousClass3(this.this$0);
            Intrinsics.checkNotNullParameter(adapter, "<this>");
            Intrinsics.checkNotNullParameter(block3, "block");
            adapter.i().d(block3);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/recyclerview/widget/g;", "", "invoke", "(Landroidx/recyclerview/widget/g;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.composer.view.ComposerViewInitBlockProviderImpl$provide$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<g, Unit> {
        final /* synthetic */ ComposerViewInitBlockProviderImpl this$0;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.composer.view.ComposerViewInitBlockProviderImpl$provide$1$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
            final /* synthetic */ ComposerViewInitBlockProviderImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ComposerViewInitBlockProviderImpl composerViewInitBlockProviderImpl) {
                super(0);
                this.this$0 = composerViewInitBlockProviderImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                C3140a c3140a;
                c3140a = this.this$0.fpsTracker;
                c3140a.t();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.composer.view.ComposerViewInitBlockProviderImpl$provide$1$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
            final /* synthetic */ ComposerViewInitBlockProviderImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ComposerViewInitBlockProviderImpl composerViewInitBlockProviderImpl) {
                super(0);
                this.this$0 = composerViewInitBlockProviderImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                C3140a c3140a;
                c3140a = this.this$0.fpsTracker;
                c3140a.u();
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "uuid", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.composer.view.ComposerViewInitBlockProviderImpl$provide$1$3$3, reason: invalid class name and collision with other inner class name */
        static final class C17603 extends AbstractC7737t implements Function1<String, Unit> {
            final /* synthetic */ ComposerViewInitBlockProviderImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17603(ComposerViewInitBlockProviderImpl composerViewInitBlockProviderImpl) {
                super(1);
                this.this$0 = composerViewInitBlockProviderImpl;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String uuid) {
                b bVar;
                Intrinsics.checkNotNullParameter(uuid, "uuid");
                bVar = this.this$0.pagePerformanceTracker;
                bVar.e(uuid);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "uuid", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.composer.view.ComposerViewInitBlockProviderImpl$provide$1$3$4, reason: invalid class name */
        static final class AnonymousClass4 extends AbstractC7737t implements Function1<String, Unit> {
            final /* synthetic */ ComposerViewInitBlockProviderImpl this$0;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQj0/U;", "", "invoke", "(LQj0/U;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.composer.view.ComposerViewInitBlockProviderImpl$provide$1$3$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements Function1<U, Unit> {
                final /* synthetic */ String $uuid;
                final /* synthetic */ ComposerViewInitBlockProviderImpl this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ComposerViewInitBlockProviderImpl composerViewInitBlockProviderImpl, String str) {
                    super(1);
                    this.this$0 = composerViewInitBlockProviderImpl;
                    this.$uuid = str;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(U u11) {
                    invoke2(u11);
                    return Unit.f71690a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(U onWidgetsListLayoutEnded) {
                    ViewEventStorage viewEventStorage;
                    AbstractC3880a abstractC3880a;
                    Intrinsics.checkNotNullParameter(onWidgetsListLayoutEnded, "$this$onWidgetsListLayoutEnded");
                    viewEventStorage = this.this$0.viewEventStorage;
                    String str = this.$uuid;
                    TreeSet j11 = onWidgetsListLayoutEnded.j();
                    Iterator<AbstractC3880a> it = onWidgetsListLayoutEnded.e().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            abstractC3880a = null;
                            break;
                        } else {
                            abstractC3880a = it.next();
                            if (abstractC3880a instanceof Q) {
                                break;
                            }
                        }
                    }
                    viewEventStorage.putValue(str, j11, abstractC3880a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(ComposerViewInitBlockProviderImpl composerViewInitBlockProviderImpl) {
                super(1);
                this.this$0 = composerViewInitBlockProviderImpl;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String uuid) {
                PerformanceTrackerDelegate performanceTrackerDelegate;
                b bVar;
                ViewHoldersRumTracker viewHoldersRumTracker;
                Intrinsics.checkNotNullParameter(uuid, "uuid");
                performanceTrackerDelegate = this.this$0.performanceTrackerDelegate;
                boolean hasTrace = performanceTrackerDelegate.hasTrace(uuid);
                bVar = this.this$0.pagePerformanceTracker;
                bVar.g(uuid, new AnonymousClass1(this.this$0, uuid));
                if (hasTrace) {
                    viewHoldersRumTracker = this.this$0.viewHoldersRumTracker;
                    viewHoldersRumTracker.removePageTraceKey(uuid);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "uuid", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.composer.view.ComposerViewInitBlockProviderImpl$provide$1$3$5, reason: invalid class name */
        static final class AnonymousClass5 extends AbstractC7737t implements Function2<String, Exception, Unit> {
            final /* synthetic */ g $this_recyclerView;
            final /* synthetic */ ComposerViewInitBlockProviderImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(g gVar, ComposerViewInitBlockProviderImpl composerViewInitBlockProviderImpl) {
                super(2);
                this.$this_recyclerView = gVar;
                this.this$0 = composerViewInitBlockProviderImpl;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Exception exc) {
                invoke2(str, exc);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str, Exception e11) {
                b bVar;
                Intrinsics.checkNotNullParameter(e11, "e");
                a.f17149a.e(e11);
                LoggerExtKt.sendNonFatal$default(e11, null, null, null, 14, null);
                LoggerExtKt.sendLog$default("[MetricsView] Failed to layout MetricsView. Adapter: " + this.$this_recyclerView.getAdapter(), null, 2, null);
                bVar = this.this$0.pagePerformanceTracker;
                bVar.c(str);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.composer.view.ComposerViewInitBlockProviderImpl$provide$1$3$6, reason: invalid class name */
        static final class AnonymousClass6 extends AbstractC7737t implements Function0<Unit> {
            final /* synthetic */ g $this_recyclerView;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(g gVar) {
                super(0);
                this.$this_recyclerView = gVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                LoggerExtKt.sendLog$default("[MetricsView] Called onDestroyView. Adapter: " + this.$this_recyclerView.getAdapter(), null, 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(ComposerViewInitBlockProviderImpl composerViewInitBlockProviderImpl) {
            super(1);
            this.this$0 = composerViewInitBlockProviderImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(g gVar) {
            invoke2(gVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(g recyclerView) {
            C3140a c3140a;
            Intrinsics.checkNotNullParameter(recyclerView, "$this$recyclerView");
            c3140a = this.this$0.fpsTracker;
            Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            c3140a.k(context);
            AnonymousClass1 block = new AnonymousClass1(this.this$0);
            Intrinsics.checkNotNullParameter(recyclerView, "<this>");
            Intrinsics.checkNotNullParameter(block, "block");
            recyclerView.getF44873b().l(block);
            AnonymousClass2 block2 = new AnonymousClass2(this.this$0);
            Intrinsics.checkNotNullParameter(recyclerView, "<this>");
            Intrinsics.checkNotNullParameter(block2, "block");
            recyclerView.getF44873b().k(block2);
            C17603 block3 = new C17603(this.this$0);
            Intrinsics.checkNotNullParameter(recyclerView, "<this>");
            Intrinsics.checkNotNullParameter(block3, "block");
            recyclerView.getF44873b().j(block3);
            AnonymousClass4 block4 = new AnonymousClass4(this.this$0);
            Intrinsics.checkNotNullParameter(recyclerView, "<this>");
            Intrinsics.checkNotNullParameter(block4, "block");
            recyclerView.getF44873b().h(block4);
            AnonymousClass5 block5 = new AnonymousClass5(recyclerView, this.this$0);
            Intrinsics.checkNotNullParameter(recyclerView, "<this>");
            Intrinsics.checkNotNullParameter(block5, "block");
            recyclerView.getF44873b().i(block5);
            AnonymousClass6 block6 = new AnonymousClass6(recyclerView);
            Intrinsics.checkNotNullParameter(recyclerView, "<this>");
            Intrinsics.checkNotNullParameter(block6, "block");
            recyclerView.getF44873b().g(block6);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/composer/ui/view/issue/PageIssueStateView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.composer.view.ComposerViewInitBlockProviderImpl$provide$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<PageIssueStateView, Unit> {
        final /* synthetic */ ComposerViewInitBlockProviderImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(ComposerViewInitBlockProviderImpl composerViewInitBlockProviderImpl) {
            super(1);
            this.this$0 = composerViewInitBlockProviderImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PageIssueStateView pageIssueStateView) {
            invoke2(pageIssueStateView);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PageIssueStateView pageIssue) {
            ComposerNavigator composerNavigator;
            Intrinsics.checkNotNullParameter(pageIssue, "$this$pageIssue");
            composerNavigator = this.this$0.navigator;
            PageIssueListener listener = new PageIssueListener(pageIssue, composerNavigator);
            Intrinsics.checkNotNullParameter(pageIssue, "<this>");
            Intrinsics.checkNotNullParameter(listener, "listener");
            pageIssue.m(listener);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly00/a$e;", "it", "", "invoke", "(Ly00/a$e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.composer.view.ComposerViewInitBlockProviderImpl$provide$1$5, reason: invalid class name */
    static final class AnonymousClass5 extends AbstractC7737t implements Function1<AbstractC10819a.e, Unit> {
        final /* synthetic */ ComposerRedirectHandler $composerRedirectHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(ComposerRedirectHandler composerRedirectHandler) {
            super(1);
            this.$composerRedirectHandler = composerRedirectHandler;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC10819a.e eVar) {
            invoke2(eVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AbstractC10819a.e it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$composerRedirectHandler.handleRedirect(it);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.composer.view.ComposerViewInitBlockProviderImpl$provide$1$6, reason: invalid class name */
    static final class AnonymousClass6 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ ComposerViewInitBlockProviderImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(ComposerViewInitBlockProviderImpl composerViewInitBlockProviderImpl) {
            super(0);
            this.this$0 = composerViewInitBlockProviderImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            RZ.a aVar;
            C3140a c3140a;
            aVar = this.this$0.analytics;
            if (AnalyticsExtKt.isPageTrackingEnabled(aVar)) {
                c3140a = this.this$0.fpsTracker;
                c3140a.q();
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.composer.view.ComposerViewInitBlockProviderImpl$provide$1$7, reason: invalid class name */
    static final class AnonymousClass7 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ ComposerViewInitBlockProviderImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass7(ComposerViewInitBlockProviderImpl composerViewInitBlockProviderImpl) {
            super(0);
            this.this$0 = composerViewInitBlockProviderImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C3140a c3140a;
            c3140a = this.this$0.fpsTracker;
            c3140a.m();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposerViewInitBlockProviderImpl$provide$1(ComposerViewInitBlockProviderImpl composerViewInitBlockProviderImpl) {
        super(1);
        this.this$0 = composerViewInitBlockProviderImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(i iVar) {
        invoke2(iVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(i iVar) {
        Application application;
        ComposerNavigator composerNavigator;
        Pc.a aVar;
        DebugToolsStorage debugToolsStorage;
        WidgetsDebugToolsInteractor widgetsDebugToolsInteractor;
        WidgetsDebugToolsInteractor widgetsDebugToolsInteractor2;
        WidgetsDebugToolsInteractor widgetsDebugToolsInteractor3;
        WidgetsDebugToolsInteractor widgetsDebugToolsInteractor4;
        WidgetsDebugToolsInteractor widgetsDebugToolsInteractor5;
        WidgetsDebugToolsInteractor widgetsDebugToolsInteractor6;
        C3140a c3140a;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        application = this.this$0.application;
        composerNavigator = this.this$0.navigator;
        ComposerRedirectHandler composerRedirectHandler = new ComposerRedirectHandler(application, composerNavigator, iVar);
        aVar = this.this$0.notificationControllerProvider;
        ComposerNotificationController incidentsListener = (ComposerNotificationController) aVar.get();
        AnonymousClass1 block = new AnonymousClass1(this.this$0);
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        iVar.m0(block);
        debugToolsStorage = this.this$0.debugToolsStorage;
        if (debugToolsStorage.isDebugEnabled()) {
            g e02 = iVar.e0();
            widgetsDebugToolsInteractor = this.this$0.debugTools;
            boolean isBorderEnabled = widgetsDebugToolsInteractor.isBorderEnabled();
            widgetsDebugToolsInteractor2 = this.this$0.debugTools;
            int textSize = widgetsDebugToolsInteractor2.getTextSize();
            StyleParser styleParser = StyleParser.INSTANCE;
            Context L11 = iVar.L();
            Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
            widgetsDebugToolsInteractor3 = this.this$0.debugTools;
            int parseColor = styleParser.parseColor(L11, widgetsDebugToolsInteractor3.getTextColor(), R$color.oz_black);
            Context L12 = iVar.L();
            Intrinsics.checkNotNullExpressionValue(L12, "<get-context>(...)");
            widgetsDebugToolsInteractor4 = this.this$0.debugTools;
            int parseColor2 = styleParser.parseColor(L12, widgetsDebugToolsInteractor4.getBubbleColor(), R$color.oz_red);
            Context L13 = iVar.L();
            Intrinsics.checkNotNullExpressionValue(L13, "<get-context>(...)");
            widgetsDebugToolsInteractor5 = this.this$0.debugTools;
            int parseColor3 = styleParser.parseColor(L13, widgetsDebugToolsInteractor5.getBorderColor(), R$color.oz_blue);
            widgetsDebugToolsInteractor6 = this.this$0.debugTools;
            WidgetsDebugToolsDecoration.Config config = new WidgetsDebugToolsDecoration.Config(isBorderEnabled, textSize, parseColor, parseColor2, parseColor3, widgetsDebugToolsInteractor6.getAlpha());
            C8042d I11 = iVar.I();
            c3140a = this.this$0.fpsTracker;
            e02.addItemDecoration(new WidgetsDebugToolsDecoration(config, I11, c3140a));
        }
        AnonymousClass2 block2 = new AnonymousClass2(this.this$0);
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(block2, "block");
        block2.invoke((AnonymousClass2) iVar.I());
        C9727b.a(iVar, new AnonymousClass3(this.this$0));
        AnonymousClass4 block3 = new AnonymousClass4(this.this$0);
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(block3, "block");
        PageIssueStateView S11 = iVar.S();
        if (S11 != null) {
            block3.invoke((AnonymousClass4) S11);
        }
        Intrinsics.f(incidentsListener);
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(incidentsListener, "incidentsListener");
        iVar.l0(incidentsListener);
        AnonymousClass5 redirect = new AnonymousClass5(composerRedirectHandler);
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(redirect, "redirect");
        iVar.q0(redirect);
        AnonymousClass6 block4 = new AnonymousClass6(this.this$0);
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(block4, "block");
        iVar.p0(block4);
        AnonymousClass7 block5 = new AnonymousClass7(this.this$0);
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(block5, "block");
        iVar.o0(block5);
    }
}
