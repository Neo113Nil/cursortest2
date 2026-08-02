package ru.ozon.uni.atoms.v3.holders.tags;

import EJ.a;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.tags.TagAtomView;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.extensions.ViewExtKt;
import ru.ozon.uni.atoms.v3.AtomV3;

@InterfaceC3999a
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014J\u0012\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0002J\f\u0010\u0013\u001a\u00020\r*\u00020\u0002H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/tags/TagHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "Lru/ozon/uni/android/uikit/view/atoms/tags/TagAtomView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/tags/TagAtomView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "dp4", "", "onBind", "", "item", "loadImage", "icon", "getBackgroundByTheme", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TagHolder extends AtomV3<TagV3Atom.TagAtom, TagAtomView> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final int dp4;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/tags/TagHolder$Companion;", "", "<init>", "()V", "LOCATOR_ICON", "", "LOCATOR_TEXT", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TagV3Atom.TagAtom.ThemeType.values().length];
            try {
                iArr[TagV3Atom.TagAtom.ThemeType.THEME_TYPE_DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TagV3Atom.TagAtom.ThemeType.THEME_TYPE_TRUST_FACTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagHolder(@NotNull TagAtomView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.dp4 = ResourceExtKt.toPx(4);
        getContainerView().setOnClickListener(new a(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(TagHolder tagHolder, View view) {
        AtomAction atomAction;
        TagV3Atom.TagAtom tagAtom = (TagV3Atom.TagAtom) tagHolder.getData();
        AtomActionDTO action = tagAtom.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, tagAtom.getTrackingInfo())) == null) {
            return;
        }
        tagHolder.handleAction(atomAction);
    }

    private final int getBackgroundByTheme(TagV3Atom.TagAtom tagAtom) {
        TagV3Atom.TagAtom.ThemeType theme = tagAtom.getTheme();
        int i11 = theme == null ? -1 : WhenMappings.$EnumSwitchMapping$0[theme.ordinal()];
        return i11 != 1 ? i11 != 2 ? R$drawable.o2_tag : R$drawable.o2_trust_factor_tag : R$drawable.o2_delivery_tag;
    }

    private final void loadImage(String icon) {
        ImageView tagImage = getContainerView().getTagImage();
        if (icon != null) {
            if (h.K(icon)) {
                icon = null;
            }
            if (icon != null) {
                ViewExtKt.show(tagImage);
                AtomConfig.INSTANCE.getImageLoader().load(tagImage, icon);
                tagImage.setContentDescription("locator_tag_icon_".concat(icon));
                return;
            }
        }
        ViewExtKt.gone(tagImage);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull TagV3Atom.TagAtom item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((TagHolder) item);
        TagAtomView containerView = getContainerView();
        containerView.setBackgroundResource(getBackgroundByTheme(item));
        containerView.setText(item.getText());
        containerView.setCount(item.getCount());
        containerView.setSelected(item.isSelected());
        containerView.setEnabled(item.getAction() != null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        containerView.setTintColor(styleParser.parseColor(context, item.getTintColor()));
        loadImage(item.getIcon());
        String text = item.getText();
        Integer valueOf = text != null ? Integer.valueOf(text.hashCode()) : null;
        containerView.getTagTextView().setContentDescription("locator_tag_text_" + valueOf);
        ViewExtKt.updatePadding$default(containerView.getTagTextView(), item.getIcon() != null ? this.dp4 : 0, 0, 0, 0, 14, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TagHolder(@NotNull Context context, String str) {
        this((TagAtomView) q.f64554a.g(N.b(TagAtomView.class), context), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
