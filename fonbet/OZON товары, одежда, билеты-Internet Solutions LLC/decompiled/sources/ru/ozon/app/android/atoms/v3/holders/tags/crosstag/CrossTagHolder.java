package ru.ozon.app.android.atoms.v3.holders.tags.crosstag;

import Ax.ViewOnClickListenerC2451a;
import D90.c;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.app.android.uikit.view.atoms.tags.CrossTagAtomView;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.v3.AtomV3;

@InterfaceC3999a
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J!\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\r*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0002¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/tags/crosstag/CrossTagHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$CrossTagAtom;", "Lru/ozon/app/android/uikit/view/atoms/tags/CrossTagAtomView;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/tags/CrossTagAtomView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "loadImage", "icon", "tintColor", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "applyStyle", "style", "Lru/ozon/app/android/atoms/v3/holders/tags/crosstag/CrossTagStyle;", "getTextColor", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CrossTagHolder extends AtomV3<TagV3Atom.CrossTagAtom, CrossTagAtomView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossTagHolder(@NotNull CrossTagAtomView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        getContainerView().setOnClickListener(new ViewOnClickListenerC2451a(this, 11));
        ImageView imageView = (ImageView) getContainerView().findViewById(R$id.crossCircleIv);
        if (imageView != null) {
            imageView.setOnClickListener(new c(this, 10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(CrossTagHolder crossTagHolder, View view) {
        AtomAction atomAction;
        TagV3Atom.CrossTagAtom crossTagAtom = (TagV3Atom.CrossTagAtom) crossTagHolder.getData();
        AtomActionDTO action = crossTagAtom.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, crossTagAtom.getTrackingInfo())) == null) {
            return;
        }
        crossTagHolder.handleAction(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$3(CrossTagHolder crossTagHolder, View view) {
        AtomAction atomAction;
        TagV3Atom.CrossTagAtom crossTagAtom = (TagV3Atom.CrossTagAtom) crossTagHolder.getData();
        AtomActionDTO crossAction = crossTagAtom.getCrossAction();
        if (crossAction == null) {
            crossAction = crossTagAtom.getAction();
        }
        Map<String, TokenizedTrackingInfo> crossTrackingInfo = crossTagAtom.getCrossTrackingInfo();
        if (crossTrackingInfo == null) {
            crossTrackingInfo = crossTagAtom.getTrackingInfo();
        }
        if (crossAction == null || (atomAction = AtomActionMapperKt.toAtomAction(crossAction, crossTrackingInfo)) == null) {
            return;
        }
        crossTagHolder.handleAction(atomAction);
    }

    private final void applyStyle(CrossTagAtomView crossTagAtomView, CrossTagStyle crossTagStyle) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = crossTagAtomView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        crossTagAtomView.setTextColor(styleParser.parseColor(context, getTextColor(crossTagStyle), R$color.oz_semantic_white_overlay_2));
        Context context2 = crossTagAtomView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        crossTagAtomView.setCrossIconColor(styleParser.parseColor(context2, crossTagStyle.getIconColor(), R$color.oz_semantic_white_overlay_2));
        crossTagAtomView.setBackgroundResource(crossTagStyle.getBackgroundResId());
    }

    private final String getTextColor(CrossTagStyle style) {
        return getContainerView().isEnabled() ? style.getTextColor() : style.getDisabledTextColor();
    }

    private final void loadImage(String icon, Integer tintColor) {
        ImageView tagImage = getContainerView().getTagImage();
        if (icon != null) {
            if (h.K(icon)) {
                icon = null;
            }
            if (icon != null) {
                ViewExtKt.show(tagImage);
                getContainerView().setTintColor(tintColor);
                AtomConfig.INSTANCE.getImageLoader().load(tagImage, icon);
                return;
            }
        }
        ViewExtKt.gone(tagImage);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull TagV3Atom.CrossTagAtom item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((CrossTagHolder) item);
        CrossTagStyle crossTagStyle = CrossTagStyleMapperKt.toCrossTagStyle(item.getTheme());
        CrossTagAtomView containerView = getContainerView();
        containerView.setText(item.getText());
        containerView.setEnabled(item.getAction() != null);
        applyStyle(containerView, crossTagStyle);
        loadImage(item.getIcon(), StyleParser.INSTANCE.parseColor(getContext(), getTextColor(crossTagStyle)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CrossTagHolder(@NotNull Context context, String str) {
        this(new CrossTagAtomView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
