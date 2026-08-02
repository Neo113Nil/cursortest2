package ru.ozon.uni.atoms.v3.holders.apsect;

import HY.d;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.atom.aspect.AspectViewState;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.AtomV3;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002¨\u0006\u0013"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/apsect/AspectHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "Lru/ozon/uni/android/atom/aspect/AspectView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/atom/aspect/AspectView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "mapState", "Lru/ozon/uni/android/atom/aspect/AspectViewState;", "state", "Lru/ozon/uni/atoms/data/aspect/AspectDTO$AspectState;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AspectHolder extends AtomV3<AspectDTO, AspectView> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AspectDTO.AspectState.values().length];
            try {
                iArr[AspectDTO.AspectState.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AspectDTO.AspectState.SELECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AspectDTO.AspectState.UNAVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AspectDTO.AspectState.SELECTED_UNAVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AspectDTO.AspectState.PARTIALLY_AVAILABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectHolder(@NotNull AspectView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnClickListener(new d(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(AspectHolder aspectHolder, View view) {
        AtomActionDTO action;
        AtomAction atomAction;
        AspectDTO aspectDTO = (AspectDTO) aspectHolder.getData();
        CommonControlSettings common = aspectDTO.getCommon();
        if (common != null && (action = common.getAction()) != null && (atomAction = AtomActionMapperKt.toAtomAction(action, aspectDTO.getTrackingInfo())) != null) {
            aspectHolder.handleAction(atomAction);
            return;
        }
        Object parent = aspectHolder.getContainerView().getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.callOnClick();
        }
    }

    private final AspectViewState mapState(AspectDTO.AspectState state) {
        int i11 = state == null ? -1 : WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? AspectViewState.ENABLED : AspectViewState.PARTIALLY_AVAILABLE : AspectViewState.SELECTED_UNAVAILABLE : AspectViewState.UNAVAILABLE : AspectViewState.SELECTED : AspectViewState.ENABLED;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull AspectDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((AspectHolder) item);
        AspectView containerView = getContainerView();
        CornerRadius radius = item.getRadius();
        containerView.setCornerRadius$uni_release(radius != null ? UiExtKt.toPxF(radius.getPx()) : 0.0f);
        containerView.setState$uni_release(mapState(item.getState()));
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AspectDTO.CustomStyle customStyle = item.getCustomStyle();
        containerView.setBackgroundColor$uni_release(styleParser.parseColor(context, customStyle != null ? customStyle.getBackgroundColor() : null));
        Context context2 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        AspectDTO.CustomStyle customStyle2 = item.getCustomStyle();
        containerView.setStrokeColor$uni_release(styleParser.parseColor(context2, customStyle2 != null ? customStyle2.getBorderColor() : null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AspectHolder(@NotNull Context context, String str) {
        this(new AspectView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
