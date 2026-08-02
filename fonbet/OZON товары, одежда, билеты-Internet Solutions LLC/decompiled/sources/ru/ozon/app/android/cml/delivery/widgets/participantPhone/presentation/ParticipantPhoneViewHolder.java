package ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation;

import Ae.C2408n0;
import JG.a;
import Ve.C4598rp;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cml.delivery.common.ext.CommonControlSettingsExtKt;
import ru.ozon.app.android.cml.delivery.common.ext.OzonTextInputLayoutExtKt;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.ParticipantPhoneVO;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsAdapter;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsHelper;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsMapper;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsRepository;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.view.ParticipantPhoneView;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.cell.text.data.TextFieldPresets;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0002KQ\b\u0000\u0018\u0000 b2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001bBW\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\"\u0010\u001cJ)\u0010'\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001aH\u0003¢\u0006\u0004\b)\u0010\u001cJ\u000f\u0010*\u001a\u00020\u001aH\u0002¢\u0006\u0004\b*\u0010\u001cJ\u0017\u0010,\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020+H\u0002¢\u0006\u0004\b.\u0010-J\u001f\u00103\u001a\u00020\u001a2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u001d\u00108\u001a\u00020\u001a2\f\u00107\u001a\b\u0012\u0004\u0012\u00020605H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020/H\u0002¢\u0006\u0004\b;\u0010<R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010=R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010>R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010?R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010@R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010AR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010BR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010CR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010DR \u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u001a0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR$\u0010J\u001a\u0012\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u001a0Ej\u0002`I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010HR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001c\u0010Z\u001a\b\u0012\u0004\u0012\u000206058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010]\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010a\u001a\u0004\u0018\u00010F8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`¨\u0006c"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/view/ParticipantPhoneView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneViewModel;", "viewModel", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsRepository;", "contactsRepository", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsMapper;", "contactsMapper", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsHelper;", "contactsHelper", "<init>", "(LVg/d;Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/view/ParticipantPhoneView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneViewModel;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsRepository;Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsMapper;Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsHelper;)V", "", "onAttach", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneVO;Ll20/d;)V", "onDetach", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "setupWidget", "cleanupWidget", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneVO$PhoneInputVO;", "bindCountryCode", "(Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneVO$PhoneInputVO;)V", "bindPhoneInput", "", "phone", "", "isFullPhoneEntered", "onPhoneChanged", "(Ljava/lang/String;Z)V", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cells", "bindContacts", "(Ljava/util/List;)V", "input", "onInputChanged", "(Ljava/lang/String;)V", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/view/ParticipantPhoneView;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneViewModel;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsRepository;", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsMapper;", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsHelper;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/action/BuildedActionHandler;", "phoneCellActionHandler", "ru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneViewHolder$contactsTouchListener$1", "contactsTouchListener", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneViewHolder$contactsTouchListener$1;", "Landroid/view/View$OnTouchListener;", "touchListener", "Landroid/view/View$OnTouchListener;", "ru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneViewHolder$scrollListener$1", "scrollListener", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneViewHolder$scrollListener$1;", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneTextWatcher;", "phoneTextWatcher", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneTextWatcher;", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsAdapter;", "contactsAdapter", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsAdapter;", "allContactsCells", "Ljava/util/List;", "Lxe/B0;", "filterJob", "Lxe/B0;", "getPhoneAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "phoneAction", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParticipantPhoneViewHolder extends k<ParticipantPhoneVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private List<CellDTO> allContactsCells;

    @NotNull
    private final ContactsAdapter contactsAdapter;

    @NotNull
    private final ContactsHelper contactsHelper;

    @NotNull
    private final ContactsMapper contactsMapper;

    @NotNull
    private final ContactsRepository contactsRepository;

    @NotNull
    private final ParticipantPhoneViewHolder$contactsTouchListener$1 contactsTouchListener;

    @NotNull
    private final ParticipantPhoneView containerView;
    private B0 filterJob;

    @NotNull
    private final HandlersInhibitor handlersInhibitor;

    @NotNull
    private final Function1<AtomAction, Unit> phoneCellActionHandler;

    @NotNull
    private final ParticipantPhoneTextWatcher phoneTextWatcher;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final ParticipantPhoneViewHolder$scrollListener$1 scrollListener;

    @NotNull
    private final l tokenizedAnalytics;

    @SuppressLint({"ClickableViewAccessibility"})
    @NotNull
    private final View.OnTouchListener touchListener;

    @NotNull
    private final ParticipantPhoneViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneViewHolder$Companion;", "", "<init>", "()V", "THROTTLE_TIME", "", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v4, types: [ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.ParticipantPhoneViewHolder$contactsTouchListener$1] */
    /* JADX WARN: Type inference failed for: r2v6, types: [ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.ParticipantPhoneViewHolder$scrollListener$1] */
    public ParticipantPhoneViewHolder(@NotNull d customActionHandlersStoreFactory, @NotNull ParticipantPhoneView containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull ParticipantPhoneViewModel viewModel, @NotNull HandlersInhibitor handlersInhibitor, @NotNull ContactsRepository contactsRepository, @NotNull ContactsMapper contactsMapper, @NotNull ContactsHelper contactsHelper) {
        super(containerView);
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        Intrinsics.checkNotNullParameter(contactsHelper, "contactsHelper");
        this.containerView = containerView;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        this.handlersInhibitor = handlersInhibitor;
        this.contactsRepository = contactsRepository;
        this.contactsMapper = contactsMapper;
        this.contactsHelper = contactsHelper;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new ParticipantPhoneViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.phoneCellActionHandler = new ParticipantPhoneViewHolder$phoneCellActionHandler$1(this);
        this.contactsTouchListener = new RecyclerView.s() { // from class: ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.ParticipantPhoneViewHolder$contactsTouchListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.s
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e11) {
                ParticipantPhoneView participantPhoneView;
                ComposerReferences composerReferences;
                View view;
                RecyclerView composerRecyclerView;
                Intrinsics.checkNotNullParameter(rv, "rv");
                Intrinsics.checkNotNullParameter(e11, "e");
                if (e11.getAction() == 2) {
                    composerReferences = ParticipantPhoneViewHolder.this.refs;
                    ComponentCallbacksC5392m c11 = composerReferences.getContainer().c();
                    if (c11 != null && (view = c11.getView()) != null && (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) != null) {
                        composerRecyclerView.requestDisallowInterceptTouchEvent(true);
                    }
                }
                participantPhoneView = ParticipantPhoneViewHolder.this.containerView;
                participantPhoneView.closeKeyboard();
                return false;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.s
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.s
            public void onTouchEvent(RecyclerView rv, MotionEvent e11) {
                Intrinsics.checkNotNullParameter(rv, "rv");
                Intrinsics.checkNotNullParameter(e11, "e");
            }
        };
        this.touchListener = new a(1, this);
        this.scrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.ParticipantPhoneViewHolder$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                ParticipantPhoneView participantPhoneView;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (dy != 0) {
                    participantPhoneView = ParticipantPhoneViewHolder.this.containerView;
                    participantPhoneView.closeKeyboard();
                }
            }
        };
        this.phoneTextWatcher = new ParticipantPhoneTextWatcher(new ParticipantPhoneViewHolder$phoneTextWatcher$1(this), new ParticipantPhoneViewHolder$phoneTextWatcher$2(this));
        this.contactsAdapter = new ContactsAdapter(new ParticipantPhoneViewHolder$contactsAdapter$1(this), this);
        this.allContactsCells = K.f71697a;
        r a11 = refs.getContainer().a();
        if (a11 != null) {
            if (contactsRepository.checkPermission(a11)) {
                viewModel.onPermissionGranted();
            } else {
                contactsRepository.requestPermission(a11, new ParticipantPhoneViewHolder$1$1(this));
            }
        }
        setupWidget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindContacts(List<CellDTO> cells) {
        this.contactsAdapter.submitList(cells);
        this.containerView.getContactsRv().scrollToPosition(0);
    }

    private final void bindCountryCode(ParticipantPhoneVO.PhoneInputVO item) {
        ParticipantPhoneView participantPhoneView = this.containerView;
        participantPhoneView.getCountryCodeTv().setText(item.getCountryCode());
        Context context = participantPhoneView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer iconResByToken = TokensExtKt.getIconResByToken(context, item.getCountryFlagUrl());
        if (iconResByToken != null) {
            participantPhoneView.getCountryFlagIv().setImageResource(iconResByToken.intValue());
        }
        this.viewModel.setCountryCode(item.getCountryCode());
    }

    private final void bindPhoneInput(ParticipantPhoneVO.PhoneInputVO item) {
        this.phoneTextWatcher.updatePhoneFormat(item);
        final ParticipantPhoneView participantPhoneView = this.containerView;
        participantPhoneView.getPhoneInputLayout().setInputText(this.viewModel.getEnteredPhone());
        participantPhoneView.getPhoneInputLayout().setInputLabelText(item.getLabel());
        AppCompatEditText editText = OzonTextInputLayoutExtKt.getEditText(participantPhoneView.getPhoneInputLayout().getMainView());
        if (!editText.isLaidOut() || editText.isLayoutRequested()) {
            editText.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.ParticipantPhoneViewHolder$bindPhoneInput$lambda$8$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    ParticipantPhoneView.this.openKeyboard();
                }
            });
        } else {
            participantPhoneView.openKeyboard();
        }
        participantPhoneView.bindErrorMessage(item.getErrorMessage());
    }

    private final void cleanupWidget() {
        ParticipantPhoneView participantPhoneView = this.containerView;
        participantPhoneView.getPhoneInputLayout().getMainView().setTextWatcher(null);
        participantPhoneView.closeKeyboard();
        participantPhoneView.setOnTouchListener(null);
        RecyclerView contactsRv = this.containerView.getContactsRv();
        contactsRv.removeOnScrollListener(this.scrollListener);
        contactsRv.removeOnItemTouchListener(this.contactsTouchListener);
    }

    private final AtomAction getPhoneAction() {
        ParticipantPhoneVO.PhoneInputVO phoneInput;
        CommonControlSettings common;
        ParticipantPhoneVO boundData = getBoundData();
        if (boundData == null || (phoneInput = boundData.getPhoneInput()) == null || (common = phoneInput.getCommon()) == null) {
            return null;
        }
        return CommonControlSettingsExtKt.atomAction$default(common, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onAttach$suspendConversion0(Function1 function1, AtomAction atomAction, kotlin.coroutines.d dVar) {
        function1.invoke(atomAction);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInputChanged(String input) {
        if (input.length() > 0) {
            this.containerView.hidePhoneAndErrorMessage();
        } else {
            this.containerView.showPhone();
        }
        B0 b02 = this.filterJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.filterJob = C10727i.c(androidx.lifecycle.K.a(this.refs.getContainer().g()), null, null, new ParticipantPhoneViewHolder$onInputChanged$1(this, input, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPhoneChanged(String phone, boolean isFullPhoneEntered) {
        if (!this.viewModel.isPhoneChanged(phone)) {
            this.containerView.showPhone();
        }
        this.viewModel.onPhoneChanged(phone, isFullPhoneEntered, getPhoneAction());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void setupWidget() {
        TextFieldCellView phoneInputLayout = this.containerView.getPhoneInputLayout();
        phoneInputLayout.setPreset(TextFieldPresets.INSTANCE.getDefault600End());
        phoneInputLayout.setInputKeyboardAction(OzonTextInputLayoutModel.KeyboardAction.DONE);
        phoneInputLayout.setInputKeyboardType(OzonTextInputLayoutModel.KeyboardType.TEXT);
        phoneInputLayout.inputCanReset(true);
        phoneInputLayout.getMainView().setTextWatcher(this.phoneTextWatcher);
        RecyclerView contactsRv = this.containerView.getContactsRv();
        contactsRv.setAdapter(this.contactsAdapter);
        contactsRv.setNestedScrollingEnabled(false);
        contactsRv.addOnItemTouchListener(this.contactsTouchListener);
        contactsRv.addOnScrollListener(this.scrollListener);
        this.containerView.setOnTouchListener(this.touchListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean touchListener$lambda$0(ParticipantPhoneViewHolder participantPhoneViewHolder, View view, MotionEvent motionEvent) {
        participantPhoneViewHolder.containerView.closeKeyboard();
        return false;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        C4598rp.f(this.refs, new C2408n0(this.viewModel.phoneActionFlow(), new ParticipantPhoneViewHolder$onAttach$1(this.actionHandler)));
        C4598rp.f(this.refs, new C2408n0(this.viewModel.permissionGrantedFlow(), new ParticipantPhoneViewHolder$onAttach$2(this, null)));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        cleanupWidget();
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ParticipantPhoneVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.setContentDescription(CommonControlSettingsExtKt.getAutomatizationId(item.getPhoneInput().getCommon()));
        this.containerView.setBackgroundColor(StyleParser.INSTANCE.parseColor(getContext(), item.getBackgroundColor(), R$color.layer_floor_1));
        TextHolderKt.bind$default(this.containerView.getTitleTv(), item.getTitle(), null, 2, null);
        bindCountryCode(item.getPhoneInput());
        bindPhoneInput(item.getPhoneInput());
        CellHolderKt.bindOrGone(this.containerView.getPhoneCell(), item.getPhoneCell(), this.phoneCellActionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ParticipantPhoneVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((ParticipantPhoneViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
