package ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation;

import F3.G;
import Sc.o;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.R$id;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.core.EmptyStateV2BaseViewMapper;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J5\u0010\u001a\u001a\u00020\u000e*\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010%\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u0017¢\u0006\u0004\b%\u0010&J)\u0010%\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u0017¢\u0006\u0004\b%\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,¨\u0006."}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "imageTopMargin", "", "bindImage", "(Lru/ozon/uni/atoms/data/image/ImageDTO;I)V", "setupSubviews", "()V", "setupConstraints", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bindOrGoneWithPaddingsRefresh", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Lru/ozon/uni/atoms/data/text/TextDTO;Lkotlin/jvm/functions/Function1;)V", "", "backgroundColor", "bindBackground", "(Ljava/lang/String;)V", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2TopPartVO;", "item", "", "payload", "actionHandler", "bind", "(Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2TopPartVO;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "(Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2TopPartVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/atom/image/Image;", "imageIV", "Lru/ozon/uni/android/atom/image/Image;", "titleTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "messageTAV", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EmptyStateView extends ConstraintLayout {
    public static final int $stable = TextAtomV2View.$stable | Image.$stable;

    @NotNull
    private final Image imageIV;

    @NotNull
    private final TextAtomV2View messageTAV;

    @NotNull
    private final TextAtomV2View titleTAV;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmptyStateV2BaseViewMapper.EmptyStateV2Payload.values().length];
            try {
                iArr[EmptyStateV2BaseViewMapper.EmptyStateV2Payload.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EmptyStateV2BaseViewMapper.EmptyStateV2Payload.TITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EmptyStateV2BaseViewMapper.EmptyStateV2Payload.MESSAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EmptyStateV2BaseViewMapper.EmptyStateV2Payload.BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ EmptyStateView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void bindBackground(String backgroundColor) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(styleParser.parseColor(context, backgroundColor, R$color.transparent));
    }

    private final void bindImage(ImageDTO image, int imageTopMargin) {
        Image image2 = this.imageIV;
        ImageHolderKt.bindOrGone$default(image2, image, null, 2, null);
        ViewGroup.LayoutParams layoutParams = image2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = imageTopMargin;
        image2.setLayoutParams(bVar);
    }

    private final void bindOrGoneWithPaddingsRefresh(TextAtomV2View textAtomV2View, TextDTO textDTO, Function1<? super AtomAction, Unit> function1) {
        OzonSpannableString text;
        if (textDTO != null && (text = textDTO.getText()) != null) {
            OzonUrlSpan.INSTANCE.setOnUrlSpanClick(text, textAtomV2View, new EmptyStateView$bindOrGoneWithPaddingsRefresh$1(function1));
        }
        if (textDTO == null) {
            textAtomV2View.setVisibility(8);
            return;
        }
        textAtomV2View.setVisibility(0);
        textAtomV2View.setPadding(0, 0, 0, 0);
        TextHolderKt.bind(textAtomV2View, textDTO, function1);
    }

    private final void setupConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, this.imageIV);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, this.imageIV);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, this.imageIV);
        ConstraintSetExtKt.layoutConstraintBottomToTopOf(dVar, this.imageIV, this.titleTAV);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, this.titleTAV, this.imageIV);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, this.titleTAV);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, this.titleTAV);
        ConstraintSetExtKt.layoutConstraintBottomToTopOf(dVar, this.titleTAV, this.messageTAV);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, this.messageTAV, this.titleTAV);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, this.messageTAV);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, this.messageTAV);
        ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(dVar, this.messageTAV);
        dVar.f(this);
    }

    private final void setupSubviews() {
        addView(this.imageIV);
        addView(this.titleTAV);
        addView(this.messageTAV);
    }

    public final void bind(@NotNull EmptyStateV2TopPartVO item, @NotNull Object payload, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (Intrinsics.d(payload, Unit.f71690a)) {
            bindImage(item.getImage(), item.getImageTopMargin());
            bindBackground(item.getBackgroundColor());
            bindOrGoneWithPaddingsRefresh(this.titleTAV, item.getTitle(), actionHandler);
            bindOrGoneWithPaddingsRefresh(this.messageTAV, item.getMessage(), actionHandler);
            return;
        }
        Iterator it = ((List) payload).iterator();
        while (it.hasNext()) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[((EmptyStateV2BaseViewMapper.EmptyStateV2Payload) it.next()).ordinal()];
            if (i11 == 1) {
                bindImage(item.getImage(), item.getImageTopMargin());
            } else if (i11 == 2) {
                bindOrGoneWithPaddingsRefresh(this.titleTAV, item.getTitle(), actionHandler);
            } else if (i11 == 3) {
                bindOrGoneWithPaddingsRefresh(this.messageTAV, item.getMessage(), actionHandler);
            } else {
                if (i11 != 4) {
                    throw new o();
                }
                bindBackground(item.getBackgroundColor());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyStateView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        Image image = new Image(context, null, 0, 6, null);
        image.setId(R$id.emptyStateIv);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41604K = 2;
        image.setLayoutParams(bVar);
        this.imageIV = image;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        G.g(textAtomV2View, R$id.emptyStateTitleTv, -2, -2);
        this.titleTAV = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        G.g(textAtomV2View2, R$id.emptyStateMessageTv, -2, -2);
        this.messageTAV = textAtomV2View2;
        setupSubviews();
        setupConstraints();
    }

    public final void bind(@NotNull EmptyStateV2TopPartVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        bind(item, Unit.f71690a, actionHandler);
    }
}
