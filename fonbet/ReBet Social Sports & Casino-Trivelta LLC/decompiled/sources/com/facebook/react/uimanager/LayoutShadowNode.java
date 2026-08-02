package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import kotlin.jvm.internal.FloatCompanionObject;

@Deprecated(since = "This class is part of Legacy Architecture and will be removed in a future release")
/* loaded from: classes2.dex */
public class LayoutShadowNode extends ReactShadowNodeImpl {
    boolean mCollapsable;
    private final MutableYogaValue mTempYogaValue = new MutableYogaValue();

    /* renamed from: com.facebook.react.uimanager.LayoutShadowNode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$yoga$YogaUnit;

        static {
            int[] iArr = new int[com.facebook.yoga.w.values().length];
            $SwitchMap$com$facebook$yoga$YogaUnit = iArr;
            try {
                iArr[com.facebook.yoga.w.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaUnit[com.facebook.yoga.w.UNDEFINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaUnit[com.facebook.yoga.w.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaUnit[com.facebook.yoga.w.PERCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class MutableYogaValue {
        com.facebook.yoga.w unit;
        float value;

        public void setFromDynamic(Dynamic dynamic) {
            if (dynamic.isNull()) {
                this.unit = com.facebook.yoga.w.UNDEFINED;
                this.value = com.facebook.yoga.g.f31669b;
                return;
            }
            if (dynamic.getType() != ReadableType.String) {
                if (dynamic.getType() == ReadableType.Number) {
                    this.unit = com.facebook.yoga.w.POINT;
                    this.value = PixelUtil.toPixelFromDIP(dynamic.asDouble());
                    return;
                } else {
                    this.unit = com.facebook.yoga.w.UNDEFINED;
                    this.value = com.facebook.yoga.g.f31669b;
                    return;
                }
            }
            String asString = dynamic.asString();
            if (asString.equals("auto")) {
                this.unit = com.facebook.yoga.w.AUTO;
                this.value = com.facebook.yoga.g.f31669b;
            } else {
                if (asString.endsWith("%")) {
                    this.unit = com.facebook.yoga.w.PERCENT;
                    this.value = Float.parseFloat(asString.substring(0, asString.length() - 1));
                    return;
                }
                E6.a.K(ReactConstants.TAG, "Unknown value: " + asString);
                this.unit = com.facebook.yoga.w.UNDEFINED;
                this.value = com.facebook.yoga.g.f31669b;
            }
        }

        private MutableYogaValue() {
        }

        private MutableYogaValue(MutableYogaValue mutableYogaValue) {
            this.value = mutableYogaValue.value;
            this.unit = mutableYogaValue.unit;
        }
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("LayoutShadowNode", LegacyArchitectureLogLevel.ERROR);
    }

    private int maybeTransformLeftRightToStartEnd(int i10) {
        if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(getThemedContext())) {
            if (i10 == 0) {
                return 4;
            }
            if (i10 == 2) {
                return 5;
            }
        }
        return i10;
    }

    @ReactProp(name = ViewProps.ALIGN_CONTENT)
    public void setAlignContent(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setAlignContent(com.facebook.yoga.a.FLEX_START);
            return;
        }
        switch (str) {
            case "stretch":
                setAlignContent(com.facebook.yoga.a.STRETCH);
                break;
            case "baseline":
                setAlignContent(com.facebook.yoga.a.BASELINE);
                break;
            case "center":
                setAlignContent(com.facebook.yoga.a.CENTER);
                break;
            case "flex-start":
                setAlignContent(com.facebook.yoga.a.FLEX_START);
                break;
            case "auto":
                setAlignContent(com.facebook.yoga.a.AUTO);
                break;
            case "space-between":
                setAlignContent(com.facebook.yoga.a.SPACE_BETWEEN);
                break;
            case "flex-end":
                setAlignContent(com.facebook.yoga.a.FLEX_END);
                break;
            case "space-around":
                setAlignContent(com.facebook.yoga.a.SPACE_AROUND);
                break;
            case "space-evenly":
                setAlignContent(com.facebook.yoga.a.SPACE_EVENLY);
                break;
            default:
                E6.a.K(ReactConstants.TAG, "invalid value for alignContent: " + str);
                setAlignContent(com.facebook.yoga.a.FLEX_START);
                break;
        }
    }

    @ReactProp(name = ViewProps.ALIGN_ITEMS)
    public void setAlignItems(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setAlignItems(com.facebook.yoga.a.STRETCH);
            return;
        }
        switch (str) {
            case "stretch":
                setAlignItems(com.facebook.yoga.a.STRETCH);
                break;
            case "baseline":
                setAlignItems(com.facebook.yoga.a.BASELINE);
                break;
            case "center":
                setAlignItems(com.facebook.yoga.a.CENTER);
                break;
            case "flex-start":
                setAlignItems(com.facebook.yoga.a.FLEX_START);
                break;
            case "auto":
                setAlignItems(com.facebook.yoga.a.AUTO);
                break;
            case "space-between":
                setAlignItems(com.facebook.yoga.a.SPACE_BETWEEN);
                break;
            case "flex-end":
                setAlignItems(com.facebook.yoga.a.FLEX_END);
                break;
            case "space-around":
                setAlignItems(com.facebook.yoga.a.SPACE_AROUND);
                break;
            default:
                E6.a.K(ReactConstants.TAG, "invalid value for alignItems: " + str);
                setAlignItems(com.facebook.yoga.a.STRETCH);
                break;
        }
    }

    @ReactProp(name = ViewProps.ALIGN_SELF)
    public void setAlignSelf(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setAlignSelf(com.facebook.yoga.a.AUTO);
            return;
        }
        switch (str) {
            case "stretch":
                setAlignSelf(com.facebook.yoga.a.STRETCH);
                break;
            case "baseline":
                setAlignSelf(com.facebook.yoga.a.BASELINE);
                break;
            case "center":
                setAlignSelf(com.facebook.yoga.a.CENTER);
                break;
            case "flex-start":
                setAlignSelf(com.facebook.yoga.a.FLEX_START);
                break;
            case "auto":
                setAlignSelf(com.facebook.yoga.a.AUTO);
                break;
            case "space-between":
                setAlignSelf(com.facebook.yoga.a.SPACE_BETWEEN);
                break;
            case "flex-end":
                setAlignSelf(com.facebook.yoga.a.FLEX_END);
                break;
            case "space-around":
                setAlignSelf(com.facebook.yoga.a.SPACE_AROUND);
                break;
            default:
                E6.a.K(ReactConstants.TAG, "invalid value for alignSelf: " + str);
                setAlignSelf(com.facebook.yoga.a.AUTO);
                break;
        }
    }

    @ReactProp(defaultFloat = FloatCompanionObject.NaN, name = ViewProps.ASPECT_RATIO)
    public void setAspectRatio(float f10) {
        setStyleAspectRatio(f10);
    }

    @ReactPropGroup(defaultFloat = FloatCompanionObject.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_START_WIDTH, ViewProps.BORDER_END_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH})
    public void setBorderWidths(int i10, float f10) {
        if (isVirtual()) {
            return;
        }
        setBorder(maybeTransformLeftRightToStartEnd(ViewProps.BORDER_SPACING_TYPES[i10]), PixelUtil.toPixelFromDIP(f10));
    }

    @ReactProp(name = ViewProps.COLLAPSABLE)
    public void setCollapsable(boolean z10) {
        this.mCollapsable = z10;
    }

    @ReactProp(name = ViewProps.COLLAPSABLE_CHILDREN)
    public void setCollapsableChildren(boolean z10) {
    }

    @ReactProp(name = ViewProps.COLUMN_GAP)
    public void setColumnGap(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i10 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            setColumnGap(this.mTempYogaValue.value);
        } else if (i10 == 4) {
            setColumnGapPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.DISPLAY)
    public void setDisplay(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setDisplay(com.facebook.yoga.i.FLEX);
            return;
        }
        if (str.equals(ViewProps.FLEX)) {
            setDisplay(com.facebook.yoga.i.FLEX);
            return;
        }
        if (str.equals(ViewProps.NONE)) {
            setDisplay(com.facebook.yoga.i.NONE);
            return;
        }
        E6.a.K(ReactConstants.TAG, "invalid value for display: " + str);
        setDisplay(com.facebook.yoga.i.FLEX);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @ReactProp(defaultFloat = 0.0f, name = ViewProps.FLEX)
    public void setFlex(float f10) {
        if (isVirtual()) {
            return;
        }
        super.setFlex(f10);
    }

    @ReactProp(name = ViewProps.FLEX_BASIS)
    public void setFlexBasis(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i10 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i10 == 1 || i10 == 2) {
            setFlexBasis(this.mTempYogaValue.value);
        } else if (i10 == 3) {
            setFlexBasisAuto();
        } else if (i10 == 4) {
            setFlexBasisPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.FLEX_DIRECTION)
    public void setFlexDirection(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setFlexDirection(com.facebook.yoga.l.COLUMN);
            return;
        }
        switch (str) {
            case "row-reverse":
                setFlexDirection(com.facebook.yoga.l.ROW_REVERSE);
                break;
            case "column":
                setFlexDirection(com.facebook.yoga.l.COLUMN);
                break;
            case "row":
                setFlexDirection(com.facebook.yoga.l.ROW);
                break;
            case "column-reverse":
                setFlexDirection(com.facebook.yoga.l.COLUMN_REVERSE);
                break;
            default:
                E6.a.K(ReactConstants.TAG, "invalid value for flexDirection: " + str);
                setFlexDirection(com.facebook.yoga.l.COLUMN);
                break;
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @ReactProp(defaultFloat = 0.0f, name = ViewProps.FLEX_GROW)
    public void setFlexGrow(float f10) {
        if (isVirtual()) {
            return;
        }
        super.setFlexGrow(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @ReactProp(defaultFloat = 0.0f, name = ViewProps.FLEX_SHRINK)
    public void setFlexShrink(float f10) {
        if (isVirtual()) {
            return;
        }
        super.setFlexShrink(f10);
    }

    @ReactProp(name = ViewProps.FLEX_WRAP)
    public void setFlexWrap(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setFlexWrap(com.facebook.yoga.x.NO_WRAP);
            return;
        }
        switch (str) {
            case "nowrap":
                setFlexWrap(com.facebook.yoga.x.NO_WRAP);
                break;
            case "wrap-reverse":
                setFlexWrap(com.facebook.yoga.x.WRAP_REVERSE);
                break;
            case "wrap":
                setFlexWrap(com.facebook.yoga.x.WRAP);
                break;
            default:
                E6.a.K(ReactConstants.TAG, "invalid value for flexWrap: " + str);
                setFlexWrap(com.facebook.yoga.x.NO_WRAP);
                break;
        }
    }

    @ReactProp(name = ViewProps.GAP)
    public void setGap(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i10 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            setGap(this.mTempYogaValue.value);
        } else if (i10 == 4) {
            setGapPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = "height")
    public void setHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i10 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i10 == 1 || i10 == 2) {
            setStyleHeight(this.mTempYogaValue.value);
        } else if (i10 == 3) {
            setStyleHeightAuto();
        } else if (i10 == 4) {
            setStyleHeightPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = "inset")
    public void setInset(Dynamic dynamic) {
    }

    @ReactPropGroup(names = {"insetBlock", "insetBlockEnd", "insetBlockStart"})
    public void setInsetBlock(int i10, Dynamic dynamic) {
    }

    @ReactPropGroup(names = {"insetInline", "insetInlineEnd", "insetInlineStart"})
    public void setInsetInline(int i10, Dynamic dynamic) {
    }

    @ReactProp(name = ViewProps.JUSTIFY_CONTENT)
    public void setJustifyContent(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setJustifyContent(com.facebook.yoga.n.FLEX_START);
            return;
        }
        switch (str) {
            case "center":
                setJustifyContent(com.facebook.yoga.n.CENTER);
                break;
            case "flex-start":
                setJustifyContent(com.facebook.yoga.n.FLEX_START);
                break;
            case "space-between":
                setJustifyContent(com.facebook.yoga.n.SPACE_BETWEEN);
                break;
            case "flex-end":
                setJustifyContent(com.facebook.yoga.n.FLEX_END);
                break;
            case "space-around":
                setJustifyContent(com.facebook.yoga.n.SPACE_AROUND);
                break;
            case "space-evenly":
                setJustifyContent(com.facebook.yoga.n.SPACE_EVENLY);
                break;
            default:
                E6.a.K(ReactConstants.TAG, "invalid value for justifyContent: " + str);
                setJustifyContent(com.facebook.yoga.n.FLEX_START);
                break;
        }
    }

    @ReactPropGroup(names = {"marginBlock", "marginBlockEnd", "marginBlockStart"})
    public void setMarginBlock(int i10, Dynamic dynamic) {
    }

    @ReactPropGroup(names = {"marginInline", "marginInlineEnd", "marginInlineStart"})
    public void setMarginInline(int i10, Dynamic dynamic) {
    }

    @ReactPropGroup(names = {ViewProps.MARGIN, ViewProps.MARGIN_VERTICAL, ViewProps.MARGIN_HORIZONTAL, ViewProps.MARGIN_START, ViewProps.MARGIN_END, ViewProps.MARGIN_TOP, ViewProps.MARGIN_BOTTOM, ViewProps.MARGIN_LEFT, ViewProps.MARGIN_RIGHT})
    public void setMargins(int i10, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int maybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(ViewProps.PADDING_MARGIN_SPACING_TYPES[i10]);
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i11 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i11 == 1 || i11 == 2) {
            setMargin(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
        } else if (i11 == 3) {
            setMarginAuto(maybeTransformLeftRightToStartEnd);
        } else if (i11 == 4) {
            setMarginPercent(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.MAX_HEIGHT)
    public void setMaxHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i10 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i10 == 1 || i10 == 2) {
            setStyleMaxHeight(this.mTempYogaValue.value);
        } else if (i10 == 4) {
            setStyleMaxHeightPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.MAX_WIDTH)
    public void setMaxWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i10 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i10 == 1 || i10 == 2) {
            setStyleMaxWidth(this.mTempYogaValue.value);
        } else if (i10 == 4) {
            setStyleMaxWidthPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.MIN_HEIGHT)
    public void setMinHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i10 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i10 == 1 || i10 == 2) {
            setStyleMinHeight(this.mTempYogaValue.value);
        } else if (i10 == 4) {
            setStyleMinHeightPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.MIN_WIDTH)
    public void setMinWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i10 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i10 == 1 || i10 == 2) {
            setStyleMinWidth(this.mTempYogaValue.value);
        } else if (i10 == 4) {
            setStyleMinWidthPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.OVERFLOW)
    public void setOverflow(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setOverflow(com.facebook.yoga.u.VISIBLE);
            return;
        }
        switch (str) {
            case "hidden":
                setOverflow(com.facebook.yoga.u.HIDDEN);
                break;
            case "scroll":
                setOverflow(com.facebook.yoga.u.SCROLL);
                break;
            case "visible":
                setOverflow(com.facebook.yoga.u.VISIBLE);
                break;
            default:
                E6.a.K(ReactConstants.TAG, "invalid value for overflow: " + str);
                setOverflow(com.facebook.yoga.u.VISIBLE);
                break;
        }
    }

    @ReactPropGroup(names = {"paddingBlock", "paddingBlockEnd", "paddingBlockStart"})
    public void setPaddingBlock(int i10, Dynamic dynamic) {
    }

    @ReactPropGroup(names = {"paddingInline", "paddingInlineEnd", "paddingInlineStart"})
    public void setPaddingInline(int i10, Dynamic dynamic) {
    }

    @ReactPropGroup(names = {ViewProps.PADDING, ViewProps.PADDING_VERTICAL, ViewProps.PADDING_HORIZONTAL, ViewProps.PADDING_START, ViewProps.PADDING_END, ViewProps.PADDING_TOP, ViewProps.PADDING_BOTTOM, ViewProps.PADDING_LEFT, ViewProps.PADDING_RIGHT})
    public void setPaddings(int i10, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int maybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(ViewProps.PADDING_MARGIN_SPACING_TYPES[i10]);
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i11 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i11 == 1 || i11 == 2) {
            setPadding(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
        } else if (i11 == 4) {
            setPaddingPercent(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.POSITION)
    public void setPosition(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setPositionType(com.facebook.yoga.v.RELATIVE);
            return;
        }
        if (str.equals("relative")) {
            setPositionType(com.facebook.yoga.v.RELATIVE);
            return;
        }
        if (str.equals("absolute")) {
            setPositionType(com.facebook.yoga.v.ABSOLUTE);
            return;
        }
        E6.a.K(ReactConstants.TAG, "invalid value for position: " + str);
        setPositionType(com.facebook.yoga.v.RELATIVE);
    }

    @ReactPropGroup(names = {ViewProps.START, ViewProps.END, ViewProps.LEFT, ViewProps.RIGHT, ViewProps.TOP, ViewProps.BOTTOM})
    public void setPositionValues(int i10, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int maybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(new int[]{4, 5, 0, 2, 1, 3}[i10]);
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i11 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i11 == 1 || i11 == 2) {
            setPosition(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
        } else if (i11 == 4) {
            setPositionPercent(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.ROW_GAP)
    public void setRowGap(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i10 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            setRowGap(this.mTempYogaValue.value);
        } else if (i10 == 4) {
            setRowGapPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @ReactProp(name = "onLayout")
    public void setShouldNotifyOnLayout(boolean z10) {
        super.setShouldNotifyOnLayout(z10);
    }

    @ReactProp(name = ViewProps.ON_POINTER_ENTER)
    public void setShouldNotifyPointerEnter(boolean z10) {
    }

    @ReactProp(name = ViewProps.ON_POINTER_LEAVE)
    public void setShouldNotifyPointerLeave(boolean z10) {
    }

    @ReactProp(name = ViewProps.ON_POINTER_MOVE)
    public void setShouldNotifyPointerMove(boolean z10) {
    }

    @ReactProp(name = "width")
    public void setWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i10 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i10 == 1 || i10 == 2) {
            setStyleWidth(this.mTempYogaValue.value);
        } else if (i10 == 3) {
            setStyleWidthAuto();
        } else if (i10 == 4) {
            setStyleWidthPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }
}
