package ru.ozon.app.android.returns.details.presentation.viewHolder.delegate.components;

import Sc.o;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import i10.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.returns.R$drawable;
import ru.ozon.app.android.returns.details.data.dto.ReturnMethodDto;
import ru.ozon.app.android.returns.details.presentation.viewHolder.delegate.components.dateSlots.DateSlotsAdapter;
import ru.ozon.app.android.returns.details.presentation.viewHolder.delegate.components.dateSlots.DateSlotsItemDecoration;
import ru.ozon.app.android.returns.details.presentation.viewModel.ReturnDetailsViewModel;
import ru.ozon.app.android.returns.details.presentation.views.ReturnMethodView;
import ru.ozon.app.android.uikit.view.atoms.select.SelectView;
import ru.ozon.app.android.uikit.view.atoms.select.dialog.SelectModel;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.utils.ContainerExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 /2\u00020\u0001:\u0001/B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R$\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/components/ReturnMethodViewHolder;", "Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/components/ComponentViewHolder;", "Lru/ozon/app/android/returns/details/presentation/views/ReturnMethodView;", "returnMethodView", "Lru/ozon/app/android/returns/details/presentation/viewModel/ReturnDetailsViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "<init>", "(Lru/ozon/app/android/returns/details/presentation/views/ReturnMethodView;Lru/ozon/app/android/returns/details/presentation/viewModel/ReturnDetailsViewModel;Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$TimeSlotSelector;", "timeSlotSelector", "setTimeSlots", "(Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$TimeSlotSelector;)V", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "message", "showError", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "showSuccess", "Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$TimeSlotDto;", "selected", "", "position", "onDateSlotChange", "(Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto$TimeSlotDto;I)V", "Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto;", "returnMethod", "bind", "(Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto;)V", "Lru/ozon/app/android/returns/details/presentation/views/ReturnMethodView;", "Lru/ozon/app/android/returns/details/presentation/viewModel/ReturnDetailsViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "infoAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/components/dateSlots/DateSlotsAdapter;", "dateSlotsAdapter", "Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/components/dateSlots/DateSlotsAdapter;", "Landroidx/recyclerview/widget/r;", "scroller", "Landroidx/recyclerview/widget/r;", "Companion", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnMethodViewHolder extends ComponentViewHolder {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final DateSlotsAdapter dateSlotsAdapter;

    @NotNull
    private final AtomsAdapter infoAdapter;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final ReturnMethodView returnMethodView;

    @NotNull
    private final r scroller;

    @NotNull
    private final ReturnDetailsViewModel viewModel;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.returns.details.presentation.viewHolder.delegate.components.ReturnMethodViewHolder$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function1<List<ReturnMethodDto.TimeSlotDto>, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, DateSlotsAdapter.class, "submitList", "submitList(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<ReturnMethodDto.TimeSlotDto> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<ReturnMethodDto.TimeSlotDto> list) {
            ((DateSlotsAdapter) this.receiver).submitList(list);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.returns.details.presentation.viewHolder.delegate.components.ReturnMethodViewHolder$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 extends C7735q implements Function1<List<? extends SelectModel>, Unit> {
        AnonymousClass3(Object obj) {
            super(1, obj, SelectView.class, "bind", "bind(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends SelectModel> list) {
            invoke2((List<SelectModel>) list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<SelectModel> p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((SelectView) this.receiver).bind(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/returns/details/presentation/viewModel/ReturnDetailsViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/returns/details/presentation/viewModel/ReturnDetailsViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.returns.details.presentation.viewHolder.delegate.components.ReturnMethodViewHolder$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<ReturnDetailsViewModel.Action, Unit> {
        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ReturnDetailsViewModel.Action action) {
            invoke2(action);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ReturnDetailsViewModel.Action action) {
            if (action instanceof ReturnDetailsViewModel.Action.Error) {
                ReturnMethodViewHolder.this.showError(((ReturnDetailsViewModel.Action.Error) action).getMsg());
                return;
            }
            if (action instanceof ReturnDetailsViewModel.Action.Success) {
                ReturnDetailsViewModel.Action.Success success = (ReturnDetailsViewModel.Action.Success) action;
                ReturnMethodViewHolder.this.actionHandler.invoke(success.getAction());
                ReturnMethodViewHolder.this.showSuccess(success.getMessage());
            } else {
                if (!(action instanceof ReturnDetailsViewModel.Action.Loading)) {
                    throw new o();
                }
                if (((ReturnDetailsViewModel.Action.Loading) action).getShowLoader()) {
                    ReturnMethodViewHolder.this.refs.getController().e(new l.a.C1079a(0L, null, 3));
                } else {
                    ReturnMethodViewHolder.this.refs.getController().hideLoader();
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReturnMethodViewHolder(@NotNull ReturnMethodView returnMethodView, @NotNull ReturnDetailsViewModel viewModel, @NotNull ComposerReferences refs, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(returnMethodView, null);
        Intrinsics.checkNotNullParameter(returnMethodView, "returnMethodView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.returnMethodView = returnMethodView;
        this.viewModel = viewModel;
        this.refs = refs;
        this.actionHandler = actionHandler;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.infoAdapter = atomsAdapter;
        DateSlotsAdapter dateSlotsAdapter = new DateSlotsAdapter(new ReturnMethodViewHolder$dateSlotsAdapter$1(this));
        this.dateSlotsAdapter = dateSlotsAdapter;
        final Context context = returnMethodView.getContext();
        this.scroller = new r(context) { // from class: ru.ozon.app.android.returns.details.presentation.viewHolder.delegate.components.ReturnMethodViewHolder$scroller$1
            @Override // androidx.recyclerview.widget.r
            protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
                return 350.0f / displayMetrics.densityDpi;
            }
        };
        returnMethodView.getInfoVerticalAtomsLayout().setAdapter(atomsAdapter);
        returnMethodView.getInfoVerticalAtomsLayout().setDecorator(new InfoItemsDecorator());
        atomsAdapter.setOnAction(actionHandler);
        returnMethodView.getDateSlotListRv().setAdapter(dateSlotsAdapter);
        returnMethodView.getDateSlotListRv().addItemDecoration(new DateSlotsItemDecoration());
        viewModel.getDateSlots().observe(refs.getContainer().g(), new ReturnMethodViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass2(dateSlotsAdapter)));
        viewModel.getTimeSlots().observe(refs.getContainer().g(), new ReturnMethodViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass3(returnMethodView.getTimeSlotSv())));
        viewModel.getAction().observe(refs.getContainer().g(), new ReturnMethodViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass4()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDateSlotChange(ReturnMethodDto.TimeSlotDto selected, int position) {
        RecyclerView.o layoutManager = this.returnMethodView.getDateSlotListRv().getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        this.scroller.setTargetPosition(position);
        if (linearLayoutManager != null) {
            linearLayoutManager.startSmoothScroll(this.scroller);
        }
        this.viewModel.onDateSlotChange(selected);
    }

    private final void setTimeSlots(ReturnMethodDto.TimeSlotSelector timeSlotSelector) {
        ReturnMethodView returnMethodView = this.returnMethodView;
        this.viewModel.init(timeSlotSelector);
        this.returnMethodView.changeVisibility(timeSlotSelector != null);
        returnMethodView.getTimeSlotSv().setBackgroundResource(R$drawable.bg_time_slot_select);
        returnMethodView.getTimeSlotSv().setOnDialogItemClick(new ReturnMethodViewHolder$setTimeSlots$1$1(this.viewModel));
        WrappedButtonHolderKt.bindOrGone(returnMethodView.getTimeSlotConfirmBtn(), timeSlotSelector != null ? timeSlotSelector.getConfirm() : null, new ReturnMethodViewHolder$setTimeSlots$1$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(OzonSpannableString message) {
        ViewGroup rootView;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(message), null, 6000L, null, this.refs.getContainer().g(), 42, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSuccess(OzonSpannableString message) {
        ViewGroup rootView;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) {
            return;
        }
        FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(message), null, null, Integer.valueOf(ru.ozon.app.android.uikit.R$drawable.ic_check_green), null, UniColors.GRAPHIC_POSITIVE_PRIMARY.getToken(), null, null, null, null, null, 6000L, null, null, this.refs.getContainer().g(), 57178, null).show();
    }

    public final void bind(@NotNull ReturnMethodDto returnMethod) {
        Intrinsics.checkNotNullParameter(returnMethod, "returnMethod");
        ReturnMethodView returnMethodView = this.returnMethodView;
        ReturnMethodDto.Description description = returnMethod.getDescription();
        BadgeHolderKt.bind$default(returnMethodView.getIconBadge(), description.getBadge(), (Function1) null, 2, (Object) null);
        TextAtomHolderKt.bind$default(returnMethodView.getTitleTextAtom(), description.getTitle(), null, 2, null);
        TextAtomHolderKt.bindOrGone$default(returnMethodView.getSubtitleTextAtom(), description.getSubtitle(), null, 2, null);
        WrappedBorderlessButtonHolderKt.bindOrGone(returnMethodView.getLinkBtn(), description.getLink(), this.actionHandler);
        List<BadgeDTO> infoFields = description.getInfoFields();
        if (infoFields != null) {
            AtomsAdapter atomsAdapter = this.infoAdapter;
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            atomsAdapter.bind(context, infoFields);
            ViewExtKt.show(returnMethodView.getInfoVerticalAtomsLayout());
        } else {
            ViewExtKt.gone(returnMethodView.getInfoVerticalAtomsLayout());
        }
        ContainerExtKt.bindOrGone$default(returnMethodView.getDisclaimerSingleAtom(), returnMethod.getDisclaimer(), false, 2, null);
        setTimeSlots(returnMethod.getDescription().getTimeSlotSelector());
    }
}
