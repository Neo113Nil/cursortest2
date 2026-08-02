package ru.ozon.app.android.messenger.widgets.messengerCounterV2.presentation;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.messenger.widgets.messengerCounterV2.presentation.MessengerCounterV2ViewHolder;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.v3.holders.indicator.IndicatorHolderKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\f0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2VO;", "Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2ViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2ViewModel;)V", "item", "", "bindBadge", "(Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2VO;)V", "Landroidx/lifecycle/v$a;", "event", "handleLifecycleEvent", "(Landroidx/lifecycle/v$a;)V", "onResume", "()V", "onPause", "onDestroy", "onAttach", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2VO;Ll20/d;)V", "onDetach", "Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2View;", "Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2ViewModel;", "", "isPreviousStateWasOnPause", "Z", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroidx/lifecycle/G;", "lifecycleObserver", "Landroidx/lifecycle/G;", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MessengerCounterV2ViewHolder extends k<MessengerCounterV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private boolean isPreviousStateWasOnPause;

    @NotNull
    private final G lifecycleObserver;

    @NotNull
    private final MessengerCounterV2View view;

    @NotNull
    private final MessengerCounterV2ViewModel viewModel;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.messenger.widgets.messengerCounterV2.presentation.MessengerCounterV2ViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<MessengerCounterV2VO, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, MessengerCounterV2ViewHolder.class, "bindBadge", "bindBadge(Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2VO;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MessengerCounterV2VO messengerCounterV2VO) {
            invoke2(messengerCounterV2VO);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MessengerCounterV2VO p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((MessengerCounterV2ViewHolder) this.receiver).bindBadge(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC5434v.a.values().length];
            try {
                iArr[AbstractC5434v.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC5434v.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC5434v.a.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerCounterV2ViewHolder(@NotNull MessengerCounterV2View view, @NotNull ComposerReferences refs, @NotNull MessengerCounterV2ViewModel viewModel) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.view = view;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.lifecycleObserver = new G() { // from class: wA.a
            @Override // androidx.lifecycle.G
            public final void onStateChanged(J j11, AbstractC5434v.a aVar) {
                MessengerCounterV2ViewHolder.lifecycleObserver$lambda$0(MessengerCounterV2ViewHolder.this, j11, aVar);
            }
        };
        viewModel.getUpdateUnreadCountEvent().observe(refs.getContainer().g(), new MessengerCounterV2ViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindBadge(MessengerCounterV2VO item) {
        IndicatorDTO indicatorDto = item.getIndicatorDto();
        String text = indicatorDto != null ? indicatorDto.getText() : null;
        MessengerCounterV2View messengerCounterV2View = this.view;
        IndicatorHolderKt.bindOrGone$default(messengerCounterV2View.getIndicatorView(), item.getIndicatorDto(), null, 2, null);
        messengerCounterV2View.getIndicatorView().setContentDescription(text != null ? text : "0");
        WrappedIconButtonHolderKt.bindOrGone(messengerCounterV2View.getIconButtonView(), item.getButtonDto(), this.actionHandler);
        ViewExtKt.setOnClickListenerThrottle$default(messengerCounterV2View.getIconButtonAnimation(), 0L, new MessengerCounterV2ViewHolder$bindBadge$1$1(item, this), 1, null);
        if (Intrinsics.d(text, "0") || text == null || text.length() == 0) {
            return;
        }
        messengerCounterV2View.prepareViewsBeforeAnimation();
        messengerCounterV2View.playAnimation();
    }

    private final void handleLifecycleEvent(AbstractC5434v.a event) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i11 == 1) {
            onResume();
        } else if (i11 == 2) {
            onPause();
        } else {
            if (i11 != 3) {
                return;
            }
            onDestroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleObserver$lambda$0(MessengerCounterV2ViewHolder messengerCounterV2ViewHolder, J j11, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(j11, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        messengerCounterV2ViewHolder.handleLifecycleEvent(event);
    }

    private final void onDestroy() {
        this.view.cancelAnimation();
    }

    private final void onPause() {
        this.isPreviousStateWasOnPause = true;
    }

    private final void onResume() {
        if (this.isPreviousStateWasOnPause) {
            this.isPreviousStateWasOnPause = false;
            MessengerCounterV2VO boundedData = getBoundedData();
            if (boundedData != null) {
                bindBadge(boundedData);
            }
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        getLifecycle().a(this.lifecycleObserver);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        getLifecycle().e(this.lifecycleObserver);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull MessengerCounterV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        MessengerCounterV2VO synchronizedItem = this.viewModel.getSynchronizedItem(item);
        MessengerCounterV2View messengerCounterV2View = this.view;
        ButtonV3Atom.SmallIconButton buttonDto = synchronizedItem.getButtonDto();
        messengerCounterV2View.setTint(buttonDto != null ? buttonDto.getTintColor() : null);
        bindBadge(synchronizedItem);
    }
}
