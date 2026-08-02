package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import GZ.g;
import IU.b;
import Sc.InterfaceC4008j;
import Sc.s;
import Wc.a;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.lifecycle.K;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.ugc.core.R$drawable;
import ru.ozon.app.android.ugc.core.R$string;
import ru.ozon.app.android.ugc.core.databinding.FragmentReviewReplyCommentBinding;
import ru.ozon.app.android.ugc.core.databinding.FragmentReviewSendCommentBinding;
import ru.ozon.app.android.ugc.core.databinding.ItemReviewCommentInputBinding;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.Action;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentInputViewHolder;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.html.spans.CustomTypefaceSpan;
import ru.ozon.uni.core.R$font;
import ru.ozon.uni.core.UniColorsSelect;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001DB=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u0017J\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0018H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u00020\u0013H\u0002¢\u0006\u0004\b+\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010,R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010-R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010.R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010/R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00100R\u001d\u00105\u001a\u0004\u0018\u00010&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001d\u00108\u001a\u0004\u0018\u00010&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00104R\u001d\u0010;\u001a\u0004\u0018\u00010&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00102\u001a\u0004\b:\u00104R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u00102\u001a\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentInputViewHolder;", "Ld20/a;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListInputVO;", "Lru/ozon/app/android/ugc/core/databinding/ItemReviewCommentInputBinding;", "binding", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsViewModel;", "viewModel", "LGZ/g;", "router", "", "isSelect", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/app/android/ugc/core/databinding/ItemReviewCommentInputBinding;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsViewModel;LGZ/g;ZLl10/i;Ld20/e;)V", "item", "", "bind", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListInputVO;)V", "onWidgetDestroyed", "()V", "", "replyTo", "Lkotlin/Function0;", "onReplyClosed", "showReplyTo", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "hideReplyTo", "activate", "activateCommentField", "(Z)V", "authorName", "Landroid/text/SpannedString;", "createReplyText", "(Ljava/lang/String;)Landroid/text/SpannedString;", "", "insets", "setupSendCommentIv", "(I)V", "sendCommentWithScrollIfNeeded", "setupSendCommentEt", "Lru/ozon/app/android/ugc/core/databinding/ItemReviewCommentInputBinding;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsViewModel;", "LGZ/g;", "Z", "Ll10/i;", "defaultArrowColor$delegate", "LSc/j;", "getDefaultArrowColor", "()Ljava/lang/Integer;", "defaultArrowColor", "activeArrowColorSelect$delegate", "getActiveArrowColorSelect", "activeArrowColorSelect", "activeArrowColorBO$delegate", "getActiveArrowColorBO", "activeArrowColorBO", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Landroid/graphics/drawable/GradientDrawable;", "selectCursorDrawable$delegate", "getSelectCursorDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "selectCursorDrawable", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentInputViewHolder extends AbstractC6064a<CommentsListInputVO> {

    /* renamed from: activeArrowColorBO$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j activeArrowColorBO;

    /* renamed from: activeArrowColorSelect$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j activeArrowColorSelect;

    @NotNull
    private final ItemReviewCommentInputBinding binding;

    @NotNull
    private final i container;

    /* renamed from: defaultArrowColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultArrowColor;

    @NotNull
    private final Handler handler;
    private final boolean isSelect;

    @NotNull
    private final g router;

    /* renamed from: selectCursorDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j selectCursorDrawable;

    @NotNull
    private final CommentsViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int cursorHeight = ResourceExtKt.toPx(24);
    private static final int cursorWidth = ResourceExtKt.toPx(2);
    private static final int SELECT_CURSOR_COLOR = UniColorsSelect.TEXT_ACTION_SELECT.getResId();

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentInputViewHolder$1", f = "CommentInputViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentInputViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Action, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentInputViewHolder$1$1, reason: invalid class name and collision with other inner class name */
        /* synthetic */ class C19411 extends C7735q implements Function0<Unit> {
            C19411(Object obj) {
                super(0, obj, CommentsViewModel.class, "closeReplyTo", "closeReplyTo()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((CommentsViewModel) this.receiver).closeReplyTo();
            }
        }

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = CommentInputViewHolder.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Action action = (Action) this.L$0;
            if (action instanceof Action.ReplyToComment) {
                CommentInputViewHolder.this.showReplyTo(((Action.ReplyToComment) action).getReplyTo(), new C19411(CommentInputViewHolder.this.viewModel));
            } else if (action instanceof Action.CloseReplyTo) {
                CommentInputViewHolder.this.hideReplyTo();
            } else if (action instanceof Action.CallAuth) {
                g gVar = CommentInputViewHolder.this.router;
                String uri = LinkGenerator.INSTANCE.auth().toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                g.a.a(gVar, uri, null, null, 6);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Action action, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(action, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentInputViewHolder$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7719a implements Function2<Boolean, d<? super Unit>, Object> {
        AnonymousClass2(Object obj) {
            super(2, obj, CommentInputViewHolder.class, "activateCommentField", "activateCommentField(Z)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
            return invoke(bool.booleanValue(), dVar);
        }

        public final Object invoke(boolean z11, d<? super Unit> dVar) {
            return CommentInputViewHolder._init_$activateCommentField((CommentInputViewHolder) this.receiver, z11, dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentInputViewHolder$Companion;", "", "<init>", "()V", "cursorHeight", "", "getCursorHeight", "()I", "cursorWidth", "getCursorWidth", "SELECT_CURSOR_COLOR", "getSELECT_CURSOR_COLOR", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getCursorHeight() {
            return CommentInputViewHolder.cursorHeight;
        }

        public final int getCursorWidth() {
            return CommentInputViewHolder.cursorWidth;
        }

        public final int getSELECT_CURSOR_COLOR() {
            return CommentInputViewHolder.SELECT_CURSOR_COLOR;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentInputViewHolder(@NotNull ItemReviewCommentInputBinding binding, @NotNull CommentsViewModel viewModel, @NotNull g router, boolean z11, @NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        androidx.core.graphics.d f7;
        androidx.core.graphics.d f11;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.binding = binding;
        this.viewModel = viewModel;
        this.router = router;
        this.isSelect = z11;
        this.container = container;
        this.defaultArrowColor = LazyUtilsKt.unsafeLazy(new CommentInputViewHolder$defaultArrowColor$2(this));
        this.activeArrowColorSelect = LazyUtilsKt.unsafeLazy(new CommentInputViewHolder$activeArrowColorSelect$2(this));
        this.activeArrowColorBO = LazyUtilsKt.unsafeLazy(new CommentInputViewHolder$activeArrowColorBO$2(this));
        this.handler = new Handler(Looper.getMainLooper());
        this.selectCursorDrawable = LazyUtilsKt.unsafeLazy(new CommentInputViewHolder$selectCursorDrawable$2(this));
        C5353y0 n11 = Y.n(container.Y());
        int i11 = 0;
        int i12 = (n11 == null || (f11 = n11.f(2)) == null) ? 0 : f11.f42129d;
        if (n11 != null && (f7 = n11.f(1)) != null) {
            i11 = f7.f42127b;
        }
        setupSendCommentIv(i12 + i11);
        setupSendCommentEt();
        hideReplyTo();
        C2399j.C(new C2408n0(viewModel.getActionFlow(), new AnonymousClass1(null)), K.a(container.K().f()));
        C2399j.C(new C2408n0(viewModel.getKeyboardVisibility(), new AnonymousClass2(this)), K.a(container.K().f()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object _init_$activateCommentField(CommentInputViewHolder commentInputViewHolder, boolean z11, d dVar) {
        commentInputViewHolder.activateCommentField(z11);
        return Unit.f71690a;
    }

    private final void activateCommentField(boolean activate) {
        EditText editText = this.binding.sendCommentLl.sendCommentEt;
        if (activate) {
            if (!editText.isFocused()) {
                editText.requestFocus();
            }
            KeyboardUtilsKt.showKeyboard(editText);
        } else {
            editText.clearFocus();
            KeyboardUtilsKt.hideKeyboard(editText);
            editText.getText().clear();
        }
    }

    private final SpannedString createReplyText(String authorName) {
        Context context = this.binding.getConstraintLayout().getContext();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringProvider.getString(R$string.review_comment_reply_text_android, authorName));
        spannableStringBuilder.setSpan(new CustomTypefaceSpan(androidx.core.content.res.g.e(R$font.onest_semibold, context)), h.J(spannableStringBuilder, " ", 0, false, 6), spannableStringBuilder.length(), 33);
        return new SpannedString(spannableStringBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer getActiveArrowColorBO() {
        return (Integer) this.activeArrowColorBO.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer getActiveArrowColorSelect() {
        return (Integer) this.activeArrowColorSelect.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer getDefaultArrowColor() {
        return (Integer) this.defaultArrowColor.getValue();
    }

    private final GradientDrawable getSelectCursorDrawable() {
        return (GradientDrawable) this.selectCursorDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void hideReplyTo() {
        ItemReviewCommentInputBinding itemReviewCommentInputBinding = this.binding;
        LinearLayout constraintLayout = itemReviewCommentInputBinding.replyCommentLl.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewExtKt.gone(constraintLayout);
        EditText editText = itemReviewCommentInputBinding.sendCommentLl.sendCommentEt;
        CommentsListInputVO commentsListInputVO = (CommentsListInputVO) getBoundData();
        editText.setHint(commentsListInputVO != null ? commentsListInputVO.getInputPlaceholder() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendCommentWithScrollIfNeeded(int insets) {
        String obj = this.binding.sendCommentLl.sendCommentEt.getText().toString();
        if (this.viewModel.getIsCommentsVisible()) {
            this.viewModel.sendComment(obj);
        } else {
            InterfaceC7851b.a.c(this.container.M(), "commentsList", Integer.valueOf(insets), 4);
            this.handler.postDelayed(new b(this, obj, 0), 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendCommentWithScrollIfNeeded$lambda$8(CommentInputViewHolder commentInputViewHolder, String str) {
        commentInputViewHolder.viewModel.sendComment(str);
    }

    private final void setupSendCommentEt() {
        final FragmentReviewSendCommentBinding fragmentReviewSendCommentBinding = this.binding.sendCommentLl;
        EditText sendCommentEt = fragmentReviewSendCommentBinding.sendCommentEt;
        Intrinsics.checkNotNullExpressionValue(sendCommentEt, "sendCommentEt");
        sendCommentEt.addTextChangedListener(new TextWatcher() { // from class: ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentInputViewHolder$setupSendCommentEt$lambda$11$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                Integer defaultArrowColor;
                boolean z11;
                boolean z12 = s11 == null || s11.length() == 0;
                FragmentReviewSendCommentBinding.this.sendCommentIv.setEnabled(!z12);
                if (z12) {
                    ImageView sendCommentIv = FragmentReviewSendCommentBinding.this.sendCommentIv;
                    Intrinsics.checkNotNullExpressionValue(sendCommentIv, "sendCommentIv");
                    defaultArrowColor = this.getDefaultArrowColor();
                    ThemeExtKt.tint(sendCommentIv, defaultArrowColor);
                    return;
                }
                ImageView sendCommentIv2 = FragmentReviewSendCommentBinding.this.sendCommentIv;
                Intrinsics.checkNotNullExpressionValue(sendCommentIv2, "sendCommentIv");
                z11 = this.isSelect;
                ThemeExtKt.tint(sendCommentIv2, z11 ? this.getActiveArrowColorSelect() : this.getActiveArrowColorBO());
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
        if (Build.VERSION.SDK_INT >= 29 && this.isSelect) {
            fragmentReviewSendCommentBinding.sendCommentEt.setTextCursorDrawable(getSelectCursorDrawable());
        }
        fragmentReviewSendCommentBinding.sendCommentEt.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: IU.c
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                CommentInputViewHolder.setupSendCommentEt$lambda$11$lambda$10(CommentInputViewHolder.this, view, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupSendCommentEt$lambda$11$lambda$10(CommentInputViewHolder commentInputViewHolder, View view, boolean z11) {
        if (z11) {
            commentInputViewHolder.viewModel.checkAuthorise();
        }
    }

    private final void setupSendCommentIv(int insets) {
        ImageView imageView = this.binding.sendCommentLl.sendCommentIv;
        imageView.setBackground(androidx.core.content.a.getDrawable(imageView.getContext(), this.isSelect ? R$drawable.bg_send_comment_iv_select : R$drawable.bg_send_comment_iv));
        ThemeExtKt.tint(imageView, getDefaultArrowColor());
        imageView.setEnabled(false);
        ViewExtKt.setOnClickListenerThrottle$default(imageView, 0L, new CommentInputViewHolder$setupSendCommentIv$1$1(this, insets), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void showReplyTo(String replyTo, Function0<Unit> onReplyClosed) {
        ItemReviewCommentInputBinding itemReviewCommentInputBinding = this.binding;
        FragmentReviewReplyCommentBinding fragmentReviewReplyCommentBinding = itemReviewCommentInputBinding.replyCommentLl;
        fragmentReviewReplyCommentBinding.replyCommentTv.setText(createReplyText(replyTo));
        fragmentReviewReplyCommentBinding.replyCloseIv.setOnClickListener(new IU.a(onReplyClosed, 0));
        LinearLayout constraintLayout = fragmentReviewReplyCommentBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewExtKt.show(constraintLayout);
        EditText editText = itemReviewCommentInputBinding.sendCommentLl.sendCommentEt;
        CommentsListInputVO commentsListInputVO = (CommentsListInputVO) getBoundData();
        editText.setHint(commentsListInputVO != null ? commentsListInputVO.getInputAnswerPlaceholder() : null);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.viewModel.hideKeyboard();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull CommentsListInputVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.binding.sendCommentLl.sendCommentEt.setHint(item.getInputPlaceholder());
    }
}
