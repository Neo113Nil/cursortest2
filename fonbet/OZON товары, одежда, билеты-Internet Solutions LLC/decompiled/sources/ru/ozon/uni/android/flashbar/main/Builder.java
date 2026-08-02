package ru.ozon.uni.android.flashbar.main;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.flashbar.callback.OnDismissListener;
import ru.ozon.uni.android.flashbar.callback.OnShowListener;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u00020\u00002\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\u0004\b\u001e\u0010\u0017J\u0015\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00002\b\b\u0001\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u000e¢\u0006\u0004\b%\u0010\u0011J\u0017\u0010)\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b)\u0010\u0011J\u0015\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0000¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b0\u00101J\u0019\u00102\u001a\u00020\u00002\n\b\u0001\u00102\u001a\u0004\u0018\u00010#¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u00020\u00002\n\b\u0001\u00104\u001a\u0004\u0018\u00010#¢\u0006\u0004\b4\u00103J\r\u00105\u001a\u00020\u0013¢\u0006\u0004\b5\u00106R\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010\u0005R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010\t\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010;\u001a\u0004\b@\u0010=\"\u0004\bA\u0010?R\"\u0010\f\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010G\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR0\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010W\u001a\u0004\u0018\u00010#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u00100\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR$\u0010'\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010H\u001a\u0004\bb\u0010J\"\u0004\bc\u0010LR$\u0010)\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010H\u001a\u0004\bd\u0010J\"\u0004\be\u0010LR0\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010R\u001a\u0004\bf\u0010T\"\u0004\bg\u0010VR$\u0010h\u001a\u0004\u0018\u00010\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010+\u001a\u0004\u0018\u00010*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010-\u001a\u00020s8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u00102\u001a\u0004\u0018\u00010#8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b2\u0010X\u001a\u0004\by\u0010Z\"\u0004\bz\u0010\\R$\u00104\u001a\u0004\u0018\u00010#8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b4\u0010X\u001a\u0004\b{\u0010Z\"\u0004\b|\u0010\\R(\u0010~\u001a\u0004\u0018\u00010}8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0084\u0001"}, d2 = {"Lru/ozon/uni/android/flashbar/main/Builder;", "", "Landroid/view/ViewGroup;", "rootView", "<init>", "(Landroid/view/ViewGroup;)V", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "(Lru/ozon/uni/atoms/utils/OzonSpannableString;)Lru/ozon/uni/android/flashbar/main/Builder;", "message", "", "milliseconds", "duration", "(J)Lru/ozon/uni/android/flashbar/main/Builder;", "", "text", "actionButtonText", "(Ljava/lang/String;)Lru/ozon/uni/android/flashbar/main/Builder;", "Lkotlin/Function1;", "Lru/ozon/uni/android/flashbar/main/Flashbar;", "", "onActionTapListener", "actionButtonTapListener", "(Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/android/flashbar/main/Builder;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "dto", "atomActionButton", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom;)Lru/ozon/uni/android/flashbar/main/Builder;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "atomActionHandler", "Lru/ozon/uni/android/flashbar/callback/OnDismissListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "dismissListener", "(Lru/ozon/uni/android/flashbar/callback/OnDismissListener;)Lru/ozon/uni/android/flashbar/main/Builder;", "", "iconId", "icon", "(I)Lru/ozon/uni/android/flashbar/main/Builder;", "iconUrl", "tint", "imageTintColor", "Lru/ozon/uni/android/flashbar/model/Restriction$Progress;", "progressInfo", "(Lru/ozon/uni/android/flashbar/model/Restriction$Progress;)Lru/ozon/uni/android/flashbar/main/Builder;", "enableSwipeToDismiss", "()Lru/ozon/uni/android/flashbar/main/Builder;", "Landroid/graphics/drawable/Drawable;", "background", "(Landroid/graphics/drawable/Drawable;)Lru/ozon/uni/android/flashbar/main/Builder;", "messageTextColor", "(Ljava/lang/Integer;)Lru/ozon/uni/android/flashbar/main/Builder;", "titleTextColor", "build", "()Lru/ozon/uni/android/flashbar/main/Flashbar;", "Landroid/view/ViewGroup;", "getRootView$uni_release", "()Landroid/view/ViewGroup;", "setRootView$uni_release", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle$uni_release", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "setTitle$uni_release", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "getMessage$uni_release", "setMessage$uni_release", "J", "getDuration$uni_release", "()J", "setDuration$uni_release", "(J)V", "positiveActionText", "Ljava/lang/String;", "getPositiveActionText$uni_release", "()Ljava/lang/String;", "setPositiveActionText$uni_release", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "getAtomActionButton$uni_release", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "setAtomActionButton$uni_release", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom;)V", "Lkotlin/jvm/functions/Function1;", "getAtomActionHandler$uni_release", "()Lkotlin/jvm/functions/Function1;", "setAtomActionHandler$uni_release", "(Lkotlin/jvm/functions/Function1;)V", "iconDrawableRes", "Ljava/lang/Integer;", "getIconDrawableRes$uni_release", "()Ljava/lang/Integer;", "setIconDrawableRes$uni_release", "(Ljava/lang/Integer;)V", "Landroid/graphics/drawable/Drawable;", "getBackground$uni_release", "()Landroid/graphics/drawable/Drawable;", "setBackground$uni_release", "(Landroid/graphics/drawable/Drawable;)V", "getIconUrl$uni_release", "setIconUrl$uni_release", "getImageTintColor$uni_release", "setImageTintColor$uni_release", "getOnActionTapListener$uni_release", "setOnActionTapListener$uni_release", "onDismissListener", "Lru/ozon/uni/android/flashbar/callback/OnDismissListener;", "getOnDismissListener$uni_release", "()Lru/ozon/uni/android/flashbar/callback/OnDismissListener;", "setOnDismissListener$uni_release", "(Lru/ozon/uni/android/flashbar/callback/OnDismissListener;)V", "Lru/ozon/uni/android/flashbar/model/Restriction$Progress;", "getProgressInfo$uni_release", "()Lru/ozon/uni/android/flashbar/model/Restriction$Progress;", "setProgressInfo$uni_release", "(Lru/ozon/uni/android/flashbar/model/Restriction$Progress;)V", "", "Z", "getEnableSwipeToDismiss$uni_release", "()Z", "setEnableSwipeToDismiss$uni_release", "(Z)V", "getMessageTextColor$uni_release", "setMessageTextColor$uni_release", "getTitleTextColor$uni_release", "setTitleTextColor$uni_release", "Lru/ozon/uni/android/flashbar/callback/OnShowListener;", "onShowListener", "Lru/ozon/uni/android/flashbar/callback/OnShowListener;", "getOnShowListener$uni_release", "()Lru/ozon/uni/android/flashbar/callback/OnShowListener;", "setOnShowListener$uni_release", "(Lru/ozon/uni/android/flashbar/callback/OnShowListener;)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Builder {
    private ButtonV3Atom atomActionButton;
    private Function1<? super AtomAction, Unit> atomActionHandler;
    private Drawable background;
    private long duration;
    private boolean enableSwipeToDismiss;
    private Integer iconDrawableRes;
    private String iconUrl;
    private String imageTintColor;
    private OzonSpannableString message;
    private Integer messageTextColor;
    private Function1<? super Flashbar, Unit> onActionTapListener;
    private OnDismissListener onDismissListener;
    private String positiveActionText;
    private Restriction.Progress progressInfo;

    @NotNull
    private ViewGroup rootView;
    private OzonSpannableString title;
    private Integer titleTextColor;

    public Builder(@NotNull ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.rootView = rootView;
        this.duration = 10000L;
    }

    @NotNull
    public final Builder actionButtonTapListener(@NotNull Function1<? super Flashbar, Unit> onActionTapListener) {
        Intrinsics.checkNotNullParameter(onActionTapListener, "onActionTapListener");
        this.onActionTapListener = onActionTapListener;
        return this;
    }

    @NotNull
    public final Builder actionButtonText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.positiveActionText = text;
        return this;
    }

    @NotNull
    public final Builder atomActionButton(@NotNull ButtonV3Atom dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        this.atomActionButton = dto;
        return this;
    }

    @NotNull
    public final Builder atomActionHandler(Function1<? super AtomAction, Unit> actionHandler) {
        this.atomActionHandler = actionHandler;
        return this;
    }

    @NotNull
    public final Builder background(Drawable background) {
        this.background = background;
        return this;
    }

    @NotNull
    public final Flashbar build() {
        return new Flashbar(this);
    }

    @NotNull
    public final Builder dismissListener(@NotNull OnDismissListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onDismissListener = listener;
        return this;
    }

    @NotNull
    public final Builder duration(long milliseconds) {
        this.duration = milliseconds;
        return this;
    }

    @NotNull
    public final Builder enableSwipeToDismiss() {
        this.enableSwipeToDismiss = true;
        return this;
    }

    /* renamed from: getAtomActionButton$uni_release, reason: from getter */
    public final ButtonV3Atom getAtomActionButton() {
        return this.atomActionButton;
    }

    public final Function1<AtomAction, Unit> getAtomActionHandler$uni_release() {
        return this.atomActionHandler;
    }

    /* renamed from: getBackground$uni_release, reason: from getter */
    public final Drawable getBackground() {
        return this.background;
    }

    /* renamed from: getDuration$uni_release, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* renamed from: getEnableSwipeToDismiss$uni_release, reason: from getter */
    public final boolean getEnableSwipeToDismiss() {
        return this.enableSwipeToDismiss;
    }

    /* renamed from: getIconDrawableRes$uni_release, reason: from getter */
    public final Integer getIconDrawableRes() {
        return this.iconDrawableRes;
    }

    /* renamed from: getIconUrl$uni_release, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: getImageTintColor$uni_release, reason: from getter */
    public final String getImageTintColor() {
        return this.imageTintColor;
    }

    /* renamed from: getMessage$uni_release, reason: from getter */
    public final OzonSpannableString getMessage() {
        return this.message;
    }

    /* renamed from: getMessageTextColor$uni_release, reason: from getter */
    public final Integer getMessageTextColor() {
        return this.messageTextColor;
    }

    public final Function1<Flashbar, Unit> getOnActionTapListener$uni_release() {
        return this.onActionTapListener;
    }

    /* renamed from: getOnDismissListener$uni_release, reason: from getter */
    public final OnDismissListener getOnDismissListener() {
        return this.onDismissListener;
    }

    public final OnShowListener getOnShowListener$uni_release() {
        return null;
    }

    /* renamed from: getPositiveActionText$uni_release, reason: from getter */
    public final String getPositiveActionText() {
        return this.positiveActionText;
    }

    /* renamed from: getProgressInfo$uni_release, reason: from getter */
    public final Restriction.Progress getProgressInfo() {
        return this.progressInfo;
    }

    @NotNull
    /* renamed from: getRootView$uni_release, reason: from getter */
    public final ViewGroup getRootView() {
        return this.rootView;
    }

    /* renamed from: getTitle$uni_release, reason: from getter */
    public final OzonSpannableString getTitle() {
        return this.title;
    }

    /* renamed from: getTitleTextColor$uni_release, reason: from getter */
    public final Integer getTitleTextColor() {
        return this.titleTextColor;
    }

    @NotNull
    public final Builder icon(int iconId) {
        this.iconDrawableRes = Integer.valueOf(iconId);
        return this;
    }

    @NotNull
    public final Builder imageTintColor(String tint) {
        this.imageTintColor = tint;
        return this;
    }

    @NotNull
    public final Builder message(@NotNull OzonSpannableString message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
        return this;
    }

    @NotNull
    public final Builder messageTextColor(Integer messageTextColor) {
        this.messageTextColor = messageTextColor;
        return this;
    }

    @NotNull
    public final Builder progressInfo(@NotNull Restriction.Progress progressInfo) {
        Intrinsics.checkNotNullParameter(progressInfo, "progressInfo");
        this.progressInfo = progressInfo;
        return this;
    }

    @NotNull
    public final Builder title(@NotNull OzonSpannableString title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        return this;
    }

    @NotNull
    public final Builder titleTextColor(Integer titleTextColor) {
        this.titleTextColor = titleTextColor;
        return this;
    }

    @NotNull
    public final Builder icon(@NotNull String iconUrl) {
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        this.iconUrl = iconUrl;
        return this;
    }
}
