package ru.ozon.app.android.atoms.v3.molecules.authorBlock;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.databinding.AtomAuthorBlockBinding;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikit.view.atoms.avatar.AvatarView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.avatar.AvatarHolderKt;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ9\u0010\u001f\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001f\u0010\u001eJ-\u0010$\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010 2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0010\u0018\u00010!¢\u0006\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/atoms/v3/molecules/authorBlock/AuthorBlockView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "textView", "", "text", "textColor", "", "bindText", "(Landroid/widget/TextView;Ljava/lang/String;I)V", "Landroid/widget/ImageView;", "iconView", "icon", "iconColor", "bindIcon", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;)V", "Lru/ozon/uni/atoms/data/avatar/Avatar;", "item", "bindAvatar", "(Lru/ozon/uni/atoms/data/avatar/Avatar;)V", "bindTitle", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "bindSubtitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bindIconButton", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/atoms/databinding/AtomAuthorBlockBinding;", "binding", "Lru/ozon/app/android/atoms/databinding/AtomAuthorBlockBinding;", "Landroid/view/animation/LinearInterpolator;", "linearInterpolator", "Landroid/view/animation/LinearInterpolator;", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AuthorBlockView extends ConstraintLayout implements AtomView {

    @NotNull
    private final AtomAuthorBlockBinding binding;

    @NotNull
    private final LinearInterpolator linearInterpolator;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AuthorBlockView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void bindIcon(ImageView iconView, String icon, Integer iconColor) {
        if (icon != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Drawable loadDrawableByName = ExtensionsKt.loadDrawableByName(context, icon);
            if (loadDrawableByName != null) {
                loadDrawableByName.mutate();
                if (iconColor != null) {
                    loadDrawableByName.setTint(iconColor.intValue());
                }
                iconView.setImageDrawable(loadDrawableByName);
                ViewExtKt.show(iconView);
                return;
            }
        }
        ViewExtKt.gone(iconView);
    }

    private final void bindText(TextView textView, String text, int textColor) {
        TextViewExtKt.setTextOrGone(textView, text);
        textView.setTextColor(textColor);
    }

    public final void bindAvatar(@NotNull Avatar item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AvatarView avatar = this.binding.avatar;
        Intrinsics.checkNotNullExpressionValue(avatar, "avatar");
        AvatarHolderKt.bind$default(avatar, item, null, 2, null);
    }

    public final void bindIconButton(ButtonV3Atom.SmallIconButton item, Function1<? super AtomAction, Unit> onAction) {
        SmallIconButtonView smallIconButtonView = this.binding.smallIconButton;
        Intrinsics.f(smallIconButtonView);
        WrappedIconButtonHolderKt.bindOrGone(smallIconButtonView, item, onAction);
        smallIconButtonView.setAlpha(1.0f);
        ViewExtKt.updatePadding(smallIconButtonView, 0, 0, 0, 0);
    }

    public final void bindSubtitle(String text, Integer textColor, String icon, Integer iconColor) {
        int themeColor;
        AppCompatTextView subtitleTextTV = this.binding.subtitleTextTV;
        Intrinsics.checkNotNullExpressionValue(subtitleTextTV, "subtitleTextTV");
        if (textColor != null) {
            themeColor = textColor.intValue();
        } else {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            themeColor = ThemeExtKt.themeColor(context, R$attr.oz_semantic_text_secondary);
        }
        bindText(subtitleTextTV, text, themeColor);
        ImageView subtitleIconIV = this.binding.subtitleIconIV;
        Intrinsics.checkNotNullExpressionValue(subtitleIconIV, "subtitleIconIV");
        bindIcon(subtitleIconIV, icon, iconColor);
    }

    public final void bindTitle(@NotNull String text, Integer textColor, String icon, Integer iconColor) {
        int themeColor;
        Intrinsics.checkNotNullParameter(text, "text");
        AppCompatTextView titleTextTV = this.binding.titleTextTV;
        Intrinsics.checkNotNullExpressionValue(titleTextTV, "titleTextTV");
        if (textColor != null) {
            themeColor = textColor.intValue();
        } else {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            themeColor = ThemeExtKt.themeColor(context, R$attr.oz_semantic_text_primary);
        }
        bindText(titleTextTV, text, themeColor);
        ImageView titleIconIV = this.binding.titleIconIV;
        Intrinsics.checkNotNullExpressionValue(titleIconIV, "titleIconIV");
        bindIcon(titleIconIV, icon, iconColor);
    }

    public /* synthetic */ AuthorBlockView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorBlockView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.linearInterpolator = new LinearInterpolator();
        this.binding = AtomAuthorBlockBinding.inflate(LayoutInflater.from(context), this);
    }
}
