package ru.ozon.uni.atoms.v3.holders.controls.tag;

import Aw.ViewOnClickListenerC2448a;
import Cw.ViewOnClickListenerC2787a;
import Sc.o;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.indicator.ui.IndicatorView;
import ru.ozon.uni.android.controls.common.ButtonImageView;
import ru.ozon.uni.android.controls.tag.CustomTagStyle;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.android.controls.tag.TagSize;
import ru.ozon.uni.android.controls.tag.TagStyle;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.resources.DrawableResource;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Rounds;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.indicator.IndicatorHolderKt;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014J\u0016\u0010\u0011\u001a\u00020\u000f*\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\u0018H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0019\u001a\u00020\u001a*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001bR\u0018\u0010\u001c\u001a\u00020\u001a*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/controls/tag/TagButtonHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/controls/tag/TagButtonView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "closeIconOnClickListener", "Landroid/view/View$OnClickListener;", "onBind", "", "item", "bindIndicator", "dto", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "mapStyle", "Lru/ozon/uni/android/controls/tag/TagStyle;", "mapToCustom", "Lru/ozon/uni/android/controls/tag/CustomTagStyle;", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO$CustomTagButtonStyle;", "isDisabledSafe", "", "(Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;)Z", "isClosableSafe", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TagButtonHolder extends AtomV3<TagButtonDTO, TagButtonView> {

    @NotNull
    private final View.OnClickListener closeIconOnClickListener;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[IndicatorDTO.IndicatorSize.values().length];
            try {
                iArr[IndicatorDTO.IndicatorSize.SIZE_400.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndicatorDTO.IndicatorSize.SIZE_500.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TagButtonDTO.StyleType.values().length];
            try {
                iArr2[TagButtonDTO.StyleType.CUSTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TagButtonDTO.StyleType.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagButtonHolder(@NotNull TagButtonView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.closeIconOnClickListener = new ViewOnClickListenerC2448a(this, 11);
        view.setOnClickListener(new ViewOnClickListenerC2787a(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$4(TagButtonHolder tagButtonHolder, View view) {
        AtomAction atomAction;
        TagButtonDTO tagButtonDTO = (TagButtonDTO) tagButtonHolder.getData();
        if (tagButtonHolder.isDisabledSafe(tagButtonDTO)) {
            return;
        }
        CommonControlSettings common = tagButtonDTO.getCommon();
        if (common != null && (atomAction = common.toAtomAction()) != null) {
            tagButtonHolder.handleAction(atomAction);
            return;
        }
        if (tagButtonHolder.isClosableSafe(tagButtonDTO)) {
            CommonControlSettings closeControlSettings = tagButtonDTO.getCloseControlSettings();
            if ((closeControlSettings != null ? closeControlSettings.getAction() : null) != null) {
                AtomAction atomAction2 = tagButtonDTO.getCloseControlSettings().toAtomAction();
                if (atomAction2 != null) {
                    tagButtonHolder.handleAction(atomAction2);
                    return;
                }
                return;
            }
        }
        Object parent = tagButtonHolder.getContainerView().getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.callOnClick();
        }
    }

    private final void bindIndicator(TagButtonView tagButtonView, IndicatorDTO indicatorDTO) {
        if (indicatorDTO == null) {
            tagButtonView.setHasIndicator(false);
            return;
        }
        IndicatorDTO.IndicatorSize size = indicatorDTO.getSize();
        int i11 = size == null ? -1 : WhenMappings.$EnumSwitchMapping$0[size.ordinal()];
        IndicatorDTO copy$default = (i11 == 1 || i11 == 2) ? indicatorDTO : IndicatorDTO.copy$default(indicatorDTO, null, null, IndicatorDTO.IndicatorSize.SIZE_500, null, null, null, null, null, null, null, null, 2043, null);
        tagButtonView.setHasIndicator(true);
        tagButtonView.setIndicatorGap(copy$default.getSize() != IndicatorDTO.IndicatorSize.SIZE_500 ? 4 : 0);
        IndicatorView indicatorView = tagButtonView.getIndicatorView();
        if (indicatorView != null) {
            IndicatorHolderKt.bind$default(indicatorView, copy$default, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void closeIconOnClickListener$lambda$1(TagButtonHolder tagButtonHolder, View view) {
        CommonControlSettings closeControlSettings;
        AtomAction atomAction;
        TagButtonDTO tagButtonDTO = (TagButtonDTO) tagButtonHolder.getData();
        if (tagButtonHolder.isDisabledSafe(tagButtonDTO) || !tagButtonHolder.isClosableSafe(tagButtonDTO) || (closeControlSettings = tagButtonDTO.getCloseControlSettings()) == null || (atomAction = closeControlSettings.toAtomAction()) == null) {
            return;
        }
        tagButtonHolder.handleAction(atomAction);
    }

    private final boolean isClosableSafe(TagButtonDTO tagButtonDTO) {
        Boolean isClosable = tagButtonDTO.isClosable();
        if (isClosable != null) {
            return isClosable.booleanValue();
        }
        return false;
    }

    private final boolean isDisabledSafe(TagButtonDTO tagButtonDTO) {
        Boolean isDisabled = tagButtonDTO.isDisabled();
        if (isDisabled != null) {
            return isDisabled.booleanValue();
        }
        return false;
    }

    private final TagStyle mapStyle(TagButtonDTO item) {
        TagButtonDTO.StyleType styleType = item.getStyleType();
        int i11 = styleType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[styleType.ordinal()];
        if (i11 != -1) {
            if (i11 == 1) {
                return new TagStyle.Custom(mapToCustom(item.getCustomDefaultStyle()), mapToCustom(item.getCustomSelectedStyle()));
            }
            if (i11 != 2) {
                throw new o();
            }
        }
        return TagStyle.Default.INSTANCE;
    }

    private final CustomTagStyle mapToCustom(TagButtonDTO.CustomTagButtonStyle customTagButtonStyle) {
        Color solid;
        UniGradient gradientByToken;
        Color color = null;
        if (customTagButtonStyle == null) {
            return null;
        }
        String backgroundColor = customTagButtonStyle.getBackgroundColor();
        if (backgroundColor == null || (gradientByToken = TokensExtKt.getGradientByToken(backgroundColor)) == null || (solid = TokensExtKt.toGradient(gradientByToken, getContext())) == null) {
            Integer parseColor = StyleParser.INSTANCE.parseColor(getContext(), customTagButtonStyle.getBackgroundColor());
            if (parseColor != null) {
                solid = new Color.Solid(parseColor.intValue());
            }
            StyleParser styleParser = StyleParser.INSTANCE;
            return new CustomTagStyle(color, styleParser.parseColor(getContext(), customTagButtonStyle.getTextColor()), styleParser.parseColor(getContext(), customTagButtonStyle.getIconColor()), styleParser.parseColor(getContext(), customTagButtonStyle.getCloseIconColor()));
        }
        color = solid;
        StyleParser styleParser2 = StyleParser.INSTANCE;
        return new CustomTagStyle(color, styleParser2.parseColor(getContext(), customTagButtonStyle.getTextColor()), styleParser2.parseColor(getContext(), customTagButtonStyle.getIconColor()), styleParser2.parseColor(getContext(), customTagButtonStyle.getCloseIconColor()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull TagButtonDTO item) {
        boolean z11;
        TagSize tagSize;
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((TagButtonHolder) item);
        TagButtonView containerView = getContainerView();
        Rounds round = item.getRound();
        if ((round != null ? Boolean.valueOf(round.getRoundCorners()) : null) != null) {
            z11 = item.getRound().getRoundCorners();
        } else {
            Context context = containerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (!UniGlobalConfigKt.getRoundCornersFlag(context)) {
                TagButtonDTO.Size size = item.getSize();
                if ((size != null ? size.getTagSize() : null) != TagSize.TAG_600) {
                    z11 = false;
                }
            }
            z11 = true;
        }
        containerView.setRounded$uni_release(z11);
        TagButtonDTO.Size size2 = item.getSize();
        if (size2 == null || (tagSize = size2.getTagSize()) == null) {
            tagSize = TagSize.TAG_600;
        }
        containerView.setSize(tagSize);
        containerView.setDisabled(isDisabledSafe(item));
        Boolean isSelected = item.isSelected();
        containerView.setTagSelected(isSelected != null ? isSelected.booleanValue() : false);
        Boolean isStateChangeDisabled = item.isStateChangeDisabled();
        containerView.setStateChangeDisabled(isStateChangeDisabled != null ? isStateChangeDisabled.booleanValue() : false);
        containerView.setStyle(mapStyle(item));
        DrawableResource.Companion companion = DrawableResource.INSTANCE;
        String icon = item.getIcon();
        Context context2 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        containerView.setIconResource(companion.fromTokenResolved(icon, context2));
        ImageDTO image = item.getImage();
        containerView.setImageUrl(image != null ? image.getImage() : null);
        ImageDTO image2 = item.getImage();
        if (image2 != null) {
            Image imageView = containerView.getImageView();
            if (imageView == null) {
                imageView = containerView.createImageView$uni_release();
            }
            ImageHolderKt.bind$default(imageView, image2, null, 2, null);
            ViewExtKt.show(imageView);
        } else {
            Image imageView2 = containerView.getImageView();
            if (imageView2 != null) {
                ViewExtKt.gone(imageView2);
            }
        }
        containerView.setText(item.getText());
        bindIndicator(containerView, item.getIndicator());
        containerView.setCloseable(isClosableSafe(item));
        ButtonImageView closeIconView = containerView.getCloseIconView();
        if (closeIconView != null) {
            closeIconView.setOnClickListener(this.closeIconOnClickListener);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TagButtonHolder(@NotNull Context context, String str) {
        this(new TagButtonView(context, null, 0, 0, 14, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
