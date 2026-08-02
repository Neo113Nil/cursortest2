package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.multi;

import WZ.l;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.core.multi.EntryBannerWidgetMultiScrollStateUpdate;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.EntryBannerWidgetVO;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.multi.recyclerview.EntryBannerRvAdapter;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00100\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/multi/EntryBannerWidgetMultiViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/EntryBannerWidgetVO$Multi;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/multi/EntryBannerWidgetMultiView;", "entryBannerWidgetMultiView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/multi/EntryBannerWidgetMultiView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/EntryBannerWidgetVO$Multi;Ll20/d;)V", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/multi/EntryBannerWidgetMultiView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EntryBannerWidgetMultiViewHolder extends k<EntryBannerWidgetVO.Multi> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final EntryBannerWidgetMultiView entryBannerWidgetMultiView;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/os/Parcelable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.multi.EntryBannerWidgetMultiViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Parcelable, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Parcelable parcelable) {
            invoke2(parcelable);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Parcelable parcelable) {
            EntryBannerWidgetMultiViewHolder.this.composerReferences.getController().d(new EntryBannerWidgetMultiScrollStateUpdate(parcelable));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntryBannerWidgetMultiViewHolder(@NotNull EntryBannerWidgetMultiView entryBannerWidgetMultiView, @NotNull ComposerReferences composerReferences, @NotNull l tokenizedAnalytics) {
        super(entryBannerWidgetMultiView);
        Intrinsics.checkNotNullParameter(entryBannerWidgetMultiView, "entryBannerWidgetMultiView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.entryBannerWidgetMultiView = entryBannerWidgetMultiView;
        this.composerReferences = composerReferences;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composerReferences, this).buildHandler();
        this.actionHandler = buildHandler;
        entryBannerWidgetMultiView.setupBannersRecyclerView(new EntryBannerRvAdapter(tokenizedAnalytics, buildHandler, composerReferences.getContainer().g()));
        entryBannerWidgetMultiView.onScrollStateIdle(new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull EntryBannerWidgetVO.Multi item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.entryBannerWidgetMultiView.bind(item);
    }
}
