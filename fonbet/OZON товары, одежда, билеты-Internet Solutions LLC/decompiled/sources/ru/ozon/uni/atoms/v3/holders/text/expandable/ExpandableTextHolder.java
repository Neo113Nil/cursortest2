package ru.ozon.uni.atoms.v3.holders.text.expandable;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.atom.text.expandable.ExpandableTextAtomView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.CommonCellSettingsKt;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.data.text.expandable.ExpandableTextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringExtKt;
import ru.ozon.uni.atoms.v3.AtomV3;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002¨\u0006\u0013"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/text/expandable/ExpandableTextHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;", "Lru/ozon/uni/android/atom/text/expandable/ExpandableTextAtomView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/atom/text/expandable/ExpandableTextAtomView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "mapPreset", "", "preset", "Lru/ozon/uni/atoms/data/text/TextPreset;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExpandableTextHolder extends AtomV3<ExpandableTextDTO, ExpandableTextAtomView> {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.uni.atoms.v3.holders.text.expandable.ExpandableTextHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AtomAction atomAction;
            ExpandableTextDTO expandableTextDTO = (ExpandableTextDTO) ExpandableTextHolder.this.getData();
            AtomActionDTO action = expandableTextDTO.getAction();
            if (action != null && (atomAction = AtomActionMapperKt.toAtomAction(action, expandableTextDTO.getTrackingInfo())) != null) {
                ExpandableTextHolder.this.handleAction(atomAction);
                return;
            }
            Object parent = ExpandableTextHolder.this.getContainerView().getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                view.callOnClick();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextPreset.values().length];
            try {
                iArr[TextPreset.f97930H1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextPreset.f97931H2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextPreset.f97932H3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextPreset.f97933H4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TextPreset.PARAGRAPH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TextPreset.PARAGRAPH_COMPACT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TextPreset.UI_H2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TextPreset.UI_H2_COMPACT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TextPreset.UI_H1.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TextPreset.PRESET_CUSTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableTextHolder(@NotNull ExpandableTextAtomView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnClickListener(new AnonymousClass1());
    }

    private final int mapPreset(TextPreset preset) {
        switch (preset == null ? -1 : WhenMappings.$EnumSwitchMapping$0[preset.ordinal()]) {
            case 1:
                return R$style.ExpandableTextAtom_H1;
            case 2:
                return R$style.ExpandableTextAtom_H2;
            case 3:
                return R$style.ExpandableTextAtom_H3;
            case 4:
                return R$style.ExpandableTextAtom_H4;
            case 5:
                return R$style.ExpandableTextAtom_Paragraph;
            case 6:
                return R$style.ExpandableTextAtom_ParagraphCompact;
            case 7:
                return R$style.ExpandableTextAtom_UIH2;
            case 8:
                return R$style.ExpandableTextAtom_UIH2_Compact;
            case 9:
                return R$style.ExpandableTextAtom_UIH1;
            case 10:
                return R$style.ExpandableTextAtom_CUSTOM;
            default:
                return R$style.ExpandableTextAtom_Paragraph;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ExpandableTextDTO item) {
        String str;
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((ExpandableTextHolder) item);
        ExpandableTextAtomView containerView = getContainerView();
        int mapPreset = mapPreset(item.getPreset());
        boolean z11 = item.getPreset() == TextPreset.PRESET_CUSTOM;
        String typographyToken = item.getTypographyToken();
        String moreTextTypographyToken = item.getMoreTextTypographyToken();
        if (item.getTagSupported()) {
            OzonSpannableString text = item.getText();
            Context context = containerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            OzonSpannableStringExtKt.applyUnderlineFlag(text, context);
            str = text;
        } else {
            String obj = item.getText().toString();
            Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
            str = obj;
        }
        containerView.setText(str);
        Resources resources = containerView.getResources();
        CommonCellSettings.LayoutPadding leftPadding = item.getLeftPadding();
        int dimension = (int) resources.getDimension(leftPadding != null ? leftPadding.getCellLayoutPadding() : CommonCellSettingsKt.getNone());
        Resources resources2 = containerView.getResources();
        CommonCellSettings.LayoutPadding rightPadding = item.getRightPadding();
        int dimension2 = (int) resources2.getDimension(rightPadding != null ? rightPadding.getCellLayoutPadding() : CommonCellSettingsKt.getNone());
        CommonCellSettings.LayoutPadding topPadding = item.getTopPadding();
        Integer valueOf = topPadding != null ? Integer.valueOf(topPadding.getCellLayoutPadding()) : null;
        Integer valueOf2 = (valueOf == null || !z11) ? null : Integer.valueOf((int) containerView.getResources().getDimension(valueOf.intValue()));
        CommonCellSettings.LayoutPadding bottomPadding = item.getBottomPadding();
        Integer valueOf3 = bottomPadding != null ? Integer.valueOf(bottomPadding.getCellLayoutPadding()) : null;
        Integer valueOf4 = (valueOf3 == null || !z11) ? null : Integer.valueOf((int) containerView.getResources().getDimension(valueOf3.intValue()));
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer mapColor = styleParser.mapColor(context2, item.getTextColor());
        Integer valueOf5 = mapColor != null ? Integer.valueOf(a.getColor(containerView.getContext(), mapColor.intValue())) : null;
        Context context3 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        Integer mapColor2 = styleParser.mapColor(context3, item.getMoreBackgroundColor());
        Integer valueOf6 = mapColor2 != null ? Integer.valueOf(a.getColor(containerView.getContext(), mapColor2.intValue())) : null;
        Integer numberOfLines = item.getNumberOfLines();
        boolean isExpanded = item.isExpanded();
        OzonSpannableString moreText = item.getMoreText();
        Context context4 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        ExpandableTextHolderKt.applyStyle(containerView, context4, mapPreset, dimension, dimension2, valueOf2, valueOf4, valueOf5, valueOf6, numberOfLines, Boolean.valueOf(isExpanded), moreText, z11, typographyToken, moreTextTypographyToken);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandableTextHolder(@NotNull Context context, String str) {
        this(new ExpandableTextAtomView(context, null, 0, 0, 14, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
