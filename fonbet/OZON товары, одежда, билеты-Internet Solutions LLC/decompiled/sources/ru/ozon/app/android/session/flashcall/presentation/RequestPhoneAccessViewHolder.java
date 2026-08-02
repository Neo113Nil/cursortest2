package ru.ozon.app.android.session.flashcall.presentation;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.n;
import Sc.o;
import a00.C4911f;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import i10.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.R$string;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.permission.extension.PermissionExtensionsKt;
import ru.ozon.app.android.session.databinding.WidgetRequestPhoneAccessBinding;
import ru.ozon.app.android.session.flashcall.presentation.PermissionsAction;
import ru.ozon.app.android.session.flashcall.presentation.RequestPhoneAccessVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.uikit.view.atoms.texts.VerticalImageSpan;
import ru.ozon.app.android.utils.PermissionExtKt;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u000f2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001f0#2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0013\u0010-\u001a\u00020,*\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000fH\u0002¢\u0006\u0004\b/\u00100J#\u00105\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u00022\n\u00104\u001a\u000602j\u0002`3H\u0014¢\u0006\u0004\b5\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00108R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00109R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010A\u001a\n @*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR \u0010E\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u000f0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0018\u0010S\u001a\u00060Oj\u0002`P8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LPc/a;", "Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessViewModel;", "viewModelProvider", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LPc/a;)V", "Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$TitleVO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "setupTitle", "(Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$TitleVO;)V", "Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$SubtitleVO;", "subtitle", "setupSubtitle", "(Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$SubtitleVO;)V", "", "Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO$PermissionVO;", "permissions", "setupPermissions", "(Ljava/util/List;)V", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "helpText", "setupHelpText", "(Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "icon", "", "iconTintColor", "Lkotlin/Pair;", "Landroid/text/style/ImageSpan;", "getImageSpanWithOffset", "(Ljava/lang/String;Ljava/lang/Integer;)Lkotlin/Pair;", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "handleRequestButtonClick", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "Landroid/content/Context;", "", "isPermissionsGranted", "(Landroid/content/Context;)Z", "showError", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessVO;Ll20/d;)V", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "LPc/a;", "Lru/ozon/app/android/session/databinding/WidgetRequestPhoneAccessBinding;", "binding$delegate", "LSc/j;", "getBinding", "()Lru/ozon/app/android/session/databinding/WidgetRequestPhoneAccessBinding;", "binding", "kotlin.jvm.PlatformType", "widgetViewModel", "Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/composer/ComposerNavigator;", "getNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "Ll10/b;", "getController", "()Ll10/b;", "controller", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "getContainer", "()La00/f;", "container", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RequestPhoneAccessViewHolder extends k<RequestPhoneAccessVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j binding;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final View containerView;

    @NotNull
    private final a<RequestPhoneAccessViewModel> viewModelProvider;
    private final RequestPhoneAccessViewModel widgetViewModel;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/session/flashcall/presentation/PermissionsAction;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/session/flashcall/presentation/PermissionsAction;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.flashcall.presentation.RequestPhoneAccessViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<PermissionsAction, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PermissionsAction permissionsAction) {
            invoke2(permissionsAction);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PermissionsAction permissionsAction) {
            if (permissionsAction instanceof PermissionsAction.OpenLink) {
                RequestPhoneAccessViewHolder.this.getNavigator().popBackStack();
                ComposerNavigator.DefaultImpls.openDeeplink$default(RequestPhoneAccessViewHolder.this.getNavigator(), ((PermissionsAction.OpenLink) permissionsAction).getLink(), null, 2, null);
                return;
            }
            if (permissionsAction instanceof PermissionsAction.ShowLoading) {
                if (((PermissionsAction.ShowLoading) permissionsAction).getIsShow()) {
                    RequestPhoneAccessViewHolder.this.getController().e(new l.a.C1079a(0L, null, 3));
                    return;
                } else {
                    RequestPhoneAccessViewHolder.this.getController().hideLoader();
                    return;
                }
            }
            if (permissionsAction instanceof PermissionsAction.ShowError) {
                RequestPhoneAccessViewHolder.this.showError();
                RequestPhoneAccessViewHolder.this.getNavigator().popBackStack();
            } else {
                if (!(permissionsAction instanceof PermissionsAction.ShowSettings)) {
                    throw new o();
                }
                r a11 = RequestPhoneAccessViewHolder.this.getContainer().a();
                if (a11 != null) {
                    PermissionExtKt.openAppSettings(a11);
                }
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RequestPhoneAccessVO.AlignmentVO.values().length];
            try {
                iArr[RequestPhoneAccessVO.AlignmentVO.ALIGNMENT_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestPhoneAccessVO.AlignmentVO.ALIGNMENT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequestPhoneAccessVO.AlignmentVO.ALIGNMENT_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestPhoneAccessViewHolder(@NotNull View containerView, @NotNull ComposerReferences composerReferences, @NotNull a<RequestPhoneAccessViewModel> viewModelProvider) {
        super(containerView);
        SingleLiveEvent<PermissionsAction> permissionAction;
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        this.containerView = containerView;
        this.composerReferences = composerReferences;
        this.viewModelProvider = viewModelProvider;
        this.binding = Sc.k.a(n.NONE, new RequestPhoneAccessViewHolder$binding$2(this));
        RequestPhoneAccessViewModel requestPhoneAccessViewModel = (RequestPhoneAccessViewModel) new z0(composerReferences.getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.session.flashcall.presentation.RequestPhoneAccessViewHolder$special$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = RequestPhoneAccessViewHolder.this.viewModelProvider;
                RequestPhoneAccessViewModel requestPhoneAccessViewModel2 = (RequestPhoneAccessViewModel) aVar.get();
                Intrinsics.g(requestPhoneAccessViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return requestPhoneAccessViewModel2;
            }
        }).a(RequestPhoneAccessViewModel.class);
        this.widgetViewModel = requestPhoneAccessViewModel;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).onClick(new RequestPhoneAccessViewHolder$actionHandler$1(this)).buildHandler();
        if (requestPhoneAccessViewModel == null || (permissionAction = requestPhoneAccessViewModel.getPermissionAction()) == null) {
            return;
        }
        permissionAction.observe(getContainer().g(), new RequestPhoneAccessViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
    }

    private final WidgetRequestPhoneAccessBinding getBinding() {
        return (WidgetRequestPhoneAccessBinding) this.binding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4911f getContainer() {
        return this.composerReferences.getContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC7851b getController() {
        return this.composerReferences.getController();
    }

    private final Pair<ImageSpan, String> getImageSpanWithOffset(String icon, Integer iconTintColor) {
        Drawable colorDrawable;
        if (icon == null || (colorDrawable = ExtensionsKt.loadDrawableByName(getContext(), icon)) == null) {
            colorDrawable = new ColorDrawable();
            colorDrawable.setBounds(0, 0, 0, ResourceExtKt.toPx(16, getContext()));
        } else {
            colorDrawable.mutate();
            if (iconTintColor != null) {
                colorDrawable.setTint(iconTintColor.intValue());
            }
            colorDrawable.setBounds(0, 0, colorDrawable.getIntrinsicWidth(), colorDrawable.getIntrinsicHeight());
        }
        return new Pair<>(new VerticalImageSpan(colorDrawable), "  i");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposerNavigator getNavigator() {
        return this.composerReferences.getNavigator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRequestButtonClick(AtomAction.Click action) {
        RequestPhoneAccessViewModel requestPhoneAccessViewModel;
        String id2 = action.getId();
        if (!Intrinsics.d(id2, "allowAccessButton")) {
            if (!Intrinsics.d(id2, "disallowAccessButton") || (requestPhoneAccessViewModel = this.widgetViewModel) == null) {
                return;
            }
            requestPhoneAccessViewModel.onDisallowAccessButtonClicked(action.getLink());
            return;
        }
        RequestPhoneAccessViewModel requestPhoneAccessViewModel2 = this.widgetViewModel;
        if (requestPhoneAccessViewModel2 != null) {
            requestPhoneAccessViewModel2.setAction(action);
        }
        if (isPermissionsGranted(getContext())) {
            RequestPhoneAccessViewModel requestPhoneAccessViewModel3 = this.widgetViewModel;
            if (requestPhoneAccessViewModel3 != null) {
                requestPhoneAccessViewModel3.onPermissionGranted();
                return;
            }
            return;
        }
        ComponentCallbacksC5392m c11 = getContainer().c();
        if (c11 != null) {
            c11.requestPermissions(new String[]{"android.permission.READ_CALL_LOG", "android.permission.READ_PHONE_STATE"}, 123456);
        }
    }

    private final boolean isPermissionsGranted(Context context) {
        return PermissionExtensionsKt.isPermissionGranted(context, "android.permission.READ_CALL_LOG") && PermissionExtensionsKt.isPermissionGranted(context, "android.permission.READ_PHONE_STATE");
    }

    private final void setupHelpText(TextAtom helpText) {
        WidgetRequestPhoneAccessBinding binding = getBinding();
        Object[] spans = helpText.getText().getSpans(0, helpText.getText().length(), URLSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        URLSpan uRLSpan = (URLSpan) C7705l.F(spans);
        if (uRLSpan != null) {
            helpText.getText().setSpan(new ClickableSpan() { // from class: ru.ozon.app.android.session.flashcall.presentation.RequestPhoneAccessViewHolder$setupHelpText$1$1$1
                @Override // android.text.style.ClickableSpan
                public void onClick(View widget) {
                    Intrinsics.checkNotNullParameter(widget, "widget");
                    r a11 = RequestPhoneAccessViewHolder.this.getContainer().a();
                    if (a11 != null) {
                        PermissionExtKt.openAppSettings(a11);
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint ds) {
                    Intrinsics.checkNotNullParameter(ds, "ds");
                    super.updateDrawState(ds);
                    ds.setUnderlineText(false);
                }
            }, helpText.getText().getSpanStart(uRLSpan), helpText.getText().getSpanEnd(uRLSpan), 33);
        }
        TextAtomView help = binding.help;
        Intrinsics.checkNotNullExpressionValue(help, "help");
        TextAtomHolderKt.bind$default(help, helpText, null, 2, null);
    }

    private final void setupPermissions(List<RequestPhoneAccessVO.PermissionVO> permissions) {
        LinearLayoutCompat linearLayoutCompat = getBinding().permissionsContainer;
        if (permissions == null) {
            Intrinsics.f(linearLayoutCompat);
            ViewExtKt.gone(linearLayoutCompat);
            return;
        }
        if (linearLayoutCompat.getChildCount() > 0) {
            linearLayoutCompat.removeAllViews();
        }
        for (RequestPhoneAccessVO.PermissionVO permissionVO : permissions) {
            Context context = linearLayoutCompat.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            BulletElementView bulletElementView = new BulletElementView(context, null, 0, 6, null);
            bulletElementView.setText(permissionVO.getText());
            bulletElementView.setIcon(permissionVO.getIcon());
            linearLayoutCompat.addView(bulletElementView);
        }
        ViewExtKt.show(linearLayoutCompat);
    }

    private final void setupSubtitle(final RequestPhoneAccessVO.SubtitleVO subtitle) {
        TextAtomView textAtomView = getBinding().subtitle;
        if (subtitle == null) {
            Intrinsics.f(textAtomView);
            ViewExtKt.gone(textAtomView);
            return;
        }
        String image = subtitle.getIcon().getImage();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = textAtomView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Pair<ImageSpan, String> imageSpanWithOffset = getImageSpanWithOffset(image, Integer.valueOf(styleParser.parseColor(context, subtitle.getIcon().getTintColor(), StyleParser.OzColor.OZ_SEMANTIC_TEXT_POSITIVE)));
        ImageSpan a11 = imageSpanWithOffset.a();
        String b11 = imageSpanWithOffset.b();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(subtitle.getText().getText());
        spannableStringBuilder.append((CharSequence) b11);
        spannableStringBuilder.setSpan(a11, h.G(spannableStringBuilder), spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(new ClickableSpan() { // from class: ru.ozon.app.android.session.flashcall.presentation.RequestPhoneAccessViewHolder$setupSubtitle$1$1$subtitleText$1$1
            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                String link;
                Intrinsics.checkNotNullParameter(widget, "widget");
                AtomActionDTO action = RequestPhoneAccessVO.SubtitleVO.this.getAction();
                if (action == null || (link = action.getLink()) == null) {
                    return;
                }
                ComposerNavigator.DefaultImpls.openDeeplink$default(this.getNavigator(), link, null, 2, null);
            }
        }, h.G(spannableStringBuilder), spannableStringBuilder.length(), 17);
        TextAtomHolderKt.bind(textAtomView, TextAtom.copy$default(subtitle.getText(), OzonSpannableStringKt.toOzonSpannableString(spannableStringBuilder), null, null, null, null, null, null, 126, null), this.actionHandler);
        ViewExtKt.show(textAtomView);
    }

    private final void setupTitle(RequestPhoneAccessVO.TitleVO title) {
        int i11;
        TextAtomView textAtomView = getBinding().title;
        Intrinsics.f(textAtomView);
        TextAtomHolderKt.bind(textAtomView, title.getText(), this.actionHandler);
        int i12 = WhenMappings.$EnumSwitchMapping$0[title.getAlignment().ordinal()];
        if (i12 == 1) {
            i11 = 8388611;
        } else if (i12 == 2) {
            i11 = 17;
        } else {
            if (i12 != 3) {
                throw new o();
            }
            i11 = 8388613;
        }
        textAtomView.setGravity(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError() {
        ViewGroup rootView;
        r a11 = getContainer().a();
        if (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, StringProvider.getString(R$string.common_error_try_one_more_time), null, null, null, getContainer().g(), 58, null).show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull RequestPhoneAccessVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        setupTitle(item.getTitle());
        setupSubtitle(item.getSubtitle());
        setupPermissions(item.getPermissions());
        setupHelpText(item.getHelp());
        WidgetRequestPhoneAccessBinding binding = getBinding();
        LargeButtonView requestButton = binding.requestButton;
        Intrinsics.checkNotNullExpressionValue(requestButton, "requestButton");
        LargeButtonHolderKt.bind(requestButton, item.getAllowButton(), this.actionHandler);
        LargeButtonView skipButton = binding.skipButton;
        Intrinsics.checkNotNullExpressionValue(skipButton, "skipButton");
        LargeButtonHolderKt.bind(skipButton, item.getDisallowButton(), this.actionHandler);
    }
}
