package ru.ozon.app.android.storefront.core.socialAtoms.text;

import Sc.o;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.Y;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomDTO;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001?B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ!\u0010\u0013\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+JA\u00100\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2*\b\u0002\u0010/\u001a$\u0012\u0004\u0012\u00020(\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020.\u0018\u00010-\u0012\u0004\u0012\u00020\r\u0018\u00010,¢\u0006\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0018\u00108\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R8\u0010/\u001a$\u0012\u0004\u0012\u00020(\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020.\u0018\u00010-\u0012\u0004\u0012\u00020\r\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010:R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;", "atomDto", "", "setText", "(Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;)V", "loadIcon", "Landroid/graphics/drawable/Drawable;", "drawable", "setIcon", "(Landroid/graphics/drawable/Drawable;Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;)V", "Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO$IconPosition;", "iconPosition", "appendIcon", "(Landroid/graphics/drawable/Drawable;Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO$IconPosition;)V", "appendIconSpanAtStart", "(Landroid/graphics/drawable/Drawable;)V", "appendIconSpanAtEnd", "setEllipsis", "()V", "getEllipsizeStart", "()Ljava/lang/Integer;", "startPosition", "truncateSpannableText", "(I)V", "Landroid/text/StaticLayout;", "getStaticLayout", "()Landroid/text/StaticLayout;", "getAtomWidth", "()I", "", "text", "setLocators", "(Ljava/lang/String;)V", "Lkotlin/Function2;", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "onTagClick", "setup", "(Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;Lkotlin/jvm/functions/Function2;)V", "Landroid/text/TextUtils$TruncateAt;", "ellipsis", "Landroid/text/TextUtils$TruncateAt;", "imagePadding", "I", "imageSize", "dto", "Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;", "Lkotlin/jvm/functions/Function2;", "Landroid/graphics/drawable/Drawable;", "", "isIconNotChanged", "Z", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SocialTextAtomView extends AppCompatTextView implements AtomView {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<Character> tagsDelimiters = C7714v.b0('#', '@');
    private Drawable drawable;
    private SocialTextAtomDTO dto;

    @NotNull
    private final TextUtils.TruncateAt ellipsis;
    private final int imagePadding;
    private final int imageSize;
    private boolean isIconNotChanged;
    private Function2<? super String, ? super Map<String, TokenizedTrackingInfo>, Unit> onTagClick;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\f\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomView$Companion;", "", "<init>", "()V", "IMAGE_PADDING", "", "ICON_SIZE", "tagsDelimiters", "", "", "getTagsDelimiters", "()Ljava/util/List;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<Character> getTagsDelimiters() {
            return SocialTextAtomView.tagsDelimiters;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SocialTextAtomDTO.IconPosition.values().length];
            try {
                iArr[SocialTextAtomDTO.IconPosition.ICON_POSITION_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SocialTextAtomDTO.IconPosition.ICON_POSITION_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SocialTextAtomView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void appendIcon(Drawable drawable, SocialTextAtomDTO.IconPosition iconPosition) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[iconPosition.ordinal()];
        if (i11 == 1) {
            appendIconSpanAtStart(drawable);
        } else {
            if (i11 != 2) {
                throw new o();
            }
            appendIconSpanAtEnd(drawable);
        }
    }

    private final void appendIconSpanAtEnd(Drawable drawable) {
        CharSequence text = getText();
        Intrinsics.g(text, "null cannot be cast to non-null type android.text.Spannable");
        Spannable spannable = (Spannable) text;
        spannable.setSpan(new ImageWithHorizontalPaddingSpan(drawable, this.imagePadding, 0, 4, null), h.G(spannable), spannable.length(), 17);
    }

    private final void appendIconSpanAtStart(Drawable drawable) {
        CharSequence text = getText();
        Intrinsics.g(text, "null cannot be cast to non-null type android.text.Spannable");
        ((Spannable) text).setSpan(new ImageWithHorizontalPaddingSpan(drawable, 0, this.imagePadding, 2, null), 0, 1, 17);
    }

    private final int getAtomWidth() {
        int measuredWidth;
        int paddingEnd;
        SocialTextAtomDTO socialTextAtomDTO = this.dto;
        if ((socialTextAtomDTO != null ? socialTextAtomDTO.getIcon() : null) != null) {
            measuredWidth = ((getMeasuredWidth() - this.imagePadding) - this.imageSize) - getPaddingStart();
            paddingEnd = getPaddingEnd();
        } else {
            measuredWidth = getMeasuredWidth() - getPaddingStart();
            paddingEnd = getPaddingEnd();
        }
        return measuredWidth - paddingEnd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer getEllipsizeStart() {
        SocialTextAtomDTO socialTextAtomDTO;
        if (getLineCount() <= getMaxLines() || (socialTextAtomDTO = this.dto) == null || socialTextAtomDTO.getText() == null) {
            return null;
        }
        int max = Integer.max(0, getMaxLines() - 1);
        StaticLayout staticLayout = getStaticLayout();
        return Integer.valueOf(staticLayout.getEllipsisStart(max) + staticLayout.getLineStart(max));
    }

    private final StaticLayout getStaticLayout() {
        TextDirectionHeuristic textDirectionHeuristic;
        boolean isFallbackLineSpacing;
        StaticLayout.Builder ellipsizedWidth = StaticLayout.Builder.obtain(getText().toString(), 0, getText().length(), getPaint(), (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd()).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(getIncludeFontPadding()).setBreakStrategy(getBreakStrategy()).setHyphenationFrequency(getHyphenationFrequency()).setMaxLines(getMaxLines()).setEllipsize(this.ellipsis).setEllipsizedWidth(getAtomWidth());
        Intrinsics.checkNotNullExpressionValue(ellipsizedWidth, "setEllipsizedWidth(...)");
        int i11 = Build.VERSION.SDK_INT;
        ellipsizedWidth.setJustificationMode(getJustificationMode());
        if (i11 >= 28) {
            isFallbackLineSpacing = isFallbackLineSpacing();
            ellipsizedWidth.setUseLineSpacingFromFallbacks(isFallbackLineSpacing);
        }
        if (i11 >= 30) {
            textDirectionHeuristic = getTextDirectionHeuristic();
            ellipsizedWidth.setTextDirection(textDirectionHeuristic);
        }
        StaticLayout build = ellipsizedWidth.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final void loadIcon(final SocialTextAtomDTO atomDto) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String icon = atomDto.getIcon();
        int i11 = this.imageSize;
        ContextExtKt.load(context, icon, (r15 & 2) != 0 ? K.f71697a : null, (r15 & 4) != 0 ? null : new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomView$loadIcon$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception e11) {
                SocialTextAtomView.this.drawable = null;
                SocialTextAtomView.this.setEllipsis();
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                if (resource == null) {
                    SocialTextAtomView.this.drawable = null;
                } else {
                    SocialTextAtomView.this.setIcon(resource, atomDto);
                    SocialTextAtomView.this.setEllipsis();
                }
            }
        }, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? LoadPriority.NORMAL : null, (r15 & 32) != 0 ? false : false, (r15 & 64) != 0 ? null : new ImageSize(i11, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setEllipsis() {
        SocialTextAtomDTO socialTextAtomDTO;
        SocialTextAtomDTO.IconPosition iconPosition;
        int i11 = Y.f42258g;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomView$setEllipsis$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    SocialTextAtomDTO socialTextAtomDTO2;
                    SocialTextAtomDTO.IconPosition iconPosition2;
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    Integer ellipsizeStart = SocialTextAtomView.this.getEllipsizeStart();
                    if (ellipsizeStart != null) {
                        if (ellipsizeStart.intValue() <= 0) {
                            ellipsizeStart = null;
                        }
                        if (ellipsizeStart != null) {
                            int intValue = ellipsizeStart.intValue();
                            SocialTextAtomDTO socialTextAtomDTO3 = SocialTextAtomView.this.dto;
                            if (socialTextAtomDTO3 == null || socialTextAtomDTO3.getText() == null) {
                                return;
                            }
                            SocialTextAtomView.this.truncateSpannableText(intValue);
                            Drawable drawable = SocialTextAtomView.this.drawable;
                            if (drawable == null || (socialTextAtomDTO2 = SocialTextAtomView.this.dto) == null || (iconPosition2 = socialTextAtomDTO2.getIconPosition()) == null) {
                                return;
                            }
                            SocialTextAtomView.this.appendIcon(drawable, iconPosition2);
                        }
                    }
                }
            });
            return;
        }
        Integer ellipsizeStart = getEllipsizeStart();
        if (ellipsizeStart != null) {
            if (ellipsizeStart.intValue() <= 0) {
                ellipsizeStart = null;
            }
            if (ellipsizeStart != null) {
                int intValue = ellipsizeStart.intValue();
                SocialTextAtomDTO socialTextAtomDTO2 = this.dto;
                if (socialTextAtomDTO2 == null || socialTextAtomDTO2.getText() == null) {
                    return;
                }
                truncateSpannableText(intValue);
                Drawable drawable = this.drawable;
                if (drawable == null || (socialTextAtomDTO = this.dto) == null || (iconPosition = socialTextAtomDTO.getIconPosition()) == null) {
                    return;
                }
                appendIcon(drawable, iconPosition);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setIcon(Drawable drawable, SocialTextAtomDTO atomDto) {
        if (drawable == null) {
            return;
        }
        this.drawable = drawable;
        Pattern pattern = Patterns.WEB_URL;
        String icon = atomDto.getIcon();
        if (icon == null) {
            icon = "";
        }
        if (!pattern.matcher(icon).matches()) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, atomDto.getIconTintColor());
            if (parseColor != null) {
                drawable.setTint(parseColor.intValue());
            } else {
                drawable.setTintList(null);
            }
        }
        int i11 = this.imageSize;
        drawable.setBounds(0, 0, i11, i11);
        appendIcon(drawable, atomDto.getIconPosition());
    }

    private final void setLocators(String text) {
        setContentDescription(text);
    }

    private final void setText(SocialTextAtomDTO atomDto) {
        Drawable drawable;
        setMovementMethod(LinkMovementMethod.getInstance());
        setHighlightColor(0);
        Integer maxLines = atomDto.getMaxLines();
        setMaxLines(maxLines != null ? maxLines.intValue() : Integer.MAX_VALUE);
        StringBuilder italic = StringBuilderUtilsKt.italic(new StringBuilder(atomDto.getText()), getTypeface().isItalic());
        SocialTextAtomDTO socialTextAtomDTO = this.dto;
        SpannableString spannableString = new SpannableString(StringBuilderUtilsKt.icon(italic, socialTextAtomDTO != null ? socialTextAtomDTO.getIcon() : null, atomDto.getIconPosition()));
        List<TextTag> textTags = atomDto.getTextTags();
        if (textTags != null) {
            for (TextTag textTag : textTags) {
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                spannableString.setSpan(new ClickableTagSpan(textTag.getDeeplink(), styleParser.parseColor(context, textTag.getTextColor()), textTag.getTrackingInfo(), this.onTagClick), (int) textTag.getStartPosition(), (int) (textTag.getLength() + textTag.getStartPosition()), 33);
            }
        }
        setText(spannableString, TextView.BufferType.SPANNABLE);
        if (!this.isIconNotChanged || (drawable = this.drawable) == null) {
            loadIcon(atomDto);
        } else {
            setIcon(drawable, atomDto);
            setEllipsis();
        }
        if (atomDto.getIcon() == null) {
            setEllipsis();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void truncateSpannableText(int startPosition) {
        SocialTextAtomDTO socialTextAtomDTO = this.dto;
        if (socialTextAtomDTO != null) {
            SpannableStringBuilder delete = new SpannableStringBuilder(getText()).delete(startPosition, getText().length());
            Intrinsics.checkNotNullExpressionValue(delete, "delete(...)");
            SpannableStringBuilder ellipsis = StringBuilderUtilsKt.ellipsis(delete);
            if (getTypeface().isItalic()) {
                StringBuilderUtilsKt.addNonBreakSpaceAtEndForItalic(ellipsis);
            } else {
                StringBuilderUtilsKt.addSpaceForIconAtEnd(ellipsis, socialTextAtomDTO.getIcon(), socialTextAtomDTO.getIconPosition());
            }
            setText(ellipsis, TextView.BufferType.SPANNABLE);
        }
    }

    public final void setup(@NotNull SocialTextAtomDTO atomDto, Function2<? super String, ? super Map<String, TokenizedTrackingInfo>, Unit> onTagClick) {
        Intrinsics.checkNotNullParameter(atomDto, "atomDto");
        SocialTextAtomDTO socialTextAtomDTO = this.dto;
        if (socialTextAtomDTO != null) {
            this.isIconNotChanged = Intrinsics.d(socialTextAtomDTO.getIcon(), atomDto.getIcon()) && socialTextAtomDTO.getIconPosition() == atomDto.getIconPosition() && Intrinsics.d(socialTextAtomDTO.getIconTintColor(), atomDto.getIconTintColor());
        }
        this.dto = atomDto;
        this.onTagClick = onTagClick;
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseTextStyle = styleParser.parseTextStyle(atomDto.getTextStyle());
        if (parseTextStyle != null) {
            int intValue = parseTextStyle.intValue();
            StyleAppearance ofText$default = StyleAppearance.Companion.ofText$default(StyleAppearance.INSTANCE, null, 1, null);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ofText$default.read(context, intValue);
            ofText$default.apply(this);
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        SocialTextAtomDTO socialTextAtomDTO2 = this.dto;
        Integer parseColor = styleParser.parseColor(context2, socialTextAtomDTO2 != null ? socialTextAtomDTO2.getTextColor() : null);
        if (parseColor != null) {
            setTextColor(parseColor.intValue());
        }
        setText(atomDto);
        setLocators(atomDto.getText());
    }

    public /* synthetic */ SocialTextAtomView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialTextAtomView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.ellipsis = TextUtils.TruncateAt.END;
        this.imagePadding = ResourceExtKt.toPx(4);
        this.imageSize = ResourceExtKt.toPx(16);
    }
}
