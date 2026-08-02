package com.facebook.react.uimanager;

import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.uimanager.annotations.ReactPropertyHolder;
import com.facebook.yoga.YogaValue;
import java.util.ArrayList;
import java.util.Arrays;

@ReactPropertyHolder
@Deprecated(since = "This class is part of Legacy Architecture and will be removed in a future release")
/* loaded from: classes2.dex */
public class ReactShadowNodeImpl implements ReactShadowNode<ReactShadowNodeImpl> {
    private static final com.facebook.yoga.c sYogaConfig;
    private ArrayList<ReactShadowNodeImpl> mChildren;
    private Integer mHeightMeasureSpec;
    private boolean mIsLayoutOnly;
    private ReactShadowNodeImpl mLayoutParent;
    private ArrayList<ReactShadowNodeImpl> mNativeChildren;
    private ReactShadowNodeImpl mNativeParent;
    private final float[] mPadding;
    private ReactShadowNodeImpl mParent;
    private int mReactTag;
    private int mRootTag;
    private int mScreenHeight;
    private int mScreenWidth;
    private int mScreenX;
    private int mScreenY;
    private boolean mShouldNotifyOnLayout;
    private ThemedReactContext mThemedContext;
    private String mViewClassName;
    private Integer mWidthMeasureSpec;
    private com.facebook.yoga.r mYogaNode;
    private boolean mNodeUpdated = true;
    private int mTotalNativeChildren = 0;
    private final boolean[] mPaddingIsPercent = new boolean[9];
    private final Spacing mDefaultPadding = new Spacing(0.0f);

    static {
        com.facebook.yoga.c a10 = com.facebook.yoga.d.a();
        sYogaConfig = a10;
        a10.b(0.0f);
        a10.a(com.facebook.yoga.k.ALL);
        LegacyArchitectureLogger.assertLegacyArchitecture("ReactShadowNodeImpl", LegacyArchitectureLogLevel.ERROR);
    }

    public ReactShadowNodeImpl() {
        float[] fArr = new float[9];
        this.mPadding = fArr;
        if (isVirtual()) {
            this.mYogaNode = null;
            return;
        }
        com.facebook.yoga.r a10 = com.facebook.yoga.s.a(sYogaConfig);
        this.mYogaNode = a10;
        a10.z(this);
        Arrays.fill(fArr, com.facebook.yoga.g.f31669b);
    }

    private void getHierarchyInfoWithIndentation(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
        sb2.append("<");
        sb2.append(getClass().getSimpleName());
        sb2.append(" view='");
        sb2.append(getViewClass());
        sb2.append("' tag=");
        sb2.append(getReactTag());
        if (this.mYogaNode != null) {
            sb2.append(" layout='x:");
            sb2.append(getScreenX());
            sb2.append(" y:");
            sb2.append(getScreenY());
            sb2.append(" w:");
            sb2.append(getLayoutWidth());
            sb2.append(" h:");
            sb2.append(getLayoutHeight());
            sb2.append("'");
        } else {
            sb2.append("(virtual node)");
        }
        sb2.append(">\n");
        if (getChildCount() == 0) {
            return;
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).getHierarchyInfoWithIndentation(sb2, i10 + 1);
        }
    }

    private int getTotalNativeNodeContributionToParent() {
        return 0;
    }

    private void updateNativeChildrenCountInParent(int i10) {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void updatePadding() {
        for (int i10 = 0; i10 <= 8; i10++) {
            if (i10 == 0 || i10 == 2 || i10 == 4 || i10 == 5) {
                if (com.facebook.yoga.g.a(this.mPadding[i10]) && com.facebook.yoga.g.a(this.mPadding[6]) && com.facebook.yoga.g.a(this.mPadding[8])) {
                    this.mYogaNode.c0(com.facebook.yoga.j.b(i10), this.mDefaultPadding.getRaw(i10));
                }
                if (this.mPaddingIsPercent[i10]) {
                    this.mYogaNode.d0(com.facebook.yoga.j.b(i10), this.mPadding[i10]);
                } else {
                    this.mYogaNode.c0(com.facebook.yoga.j.b(i10), this.mPadding[i10]);
                }
            } else if (i10 == 1 || i10 == 3) {
                if (com.facebook.yoga.g.a(this.mPadding[i10]) && com.facebook.yoga.g.a(this.mPadding[7]) && com.facebook.yoga.g.a(this.mPadding[8])) {
                    this.mYogaNode.c0(com.facebook.yoga.j.b(i10), this.mDefaultPadding.getRaw(i10));
                }
                if (this.mPaddingIsPercent[i10]) {
                }
            } else {
                if (com.facebook.yoga.g.a(this.mPadding[i10])) {
                    this.mYogaNode.c0(com.facebook.yoga.j.b(i10), this.mDefaultPadding.getRaw(i10));
                }
                if (this.mPaddingIsPercent[i10]) {
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void calculateLayout() {
        float f10 = com.facebook.yoga.g.f31669b;
        calculateLayout(f10, f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public Iterable<? extends ReactShadowNode> calculateLayoutOnChildren() {
        if (isVirtualAnchor()) {
            return null;
        }
        return this.mChildren;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void dirty() {
        if (!isVirtual()) {
            this.mYogaNode.c();
        } else if (getParent() != null) {
            getParent().dirty();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void dispatchUpdates(float f10, float f11, UIViewOperationQueue uIViewOperationQueue, NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        if (this.mNodeUpdated) {
            onCollectExtraUpdates(uIViewOperationQueue);
        }
        if (hasNewLayout()) {
            float layoutX = getLayoutX();
            float layoutY = getLayoutY();
            float f12 = f10 + layoutX;
            int round = Math.round(f12);
            float f13 = f11 + layoutY;
            int round2 = Math.round(f13);
            int round3 = Math.round(f12 + getLayoutWidth());
            int round4 = Math.round(f13 + getLayoutHeight());
            int round5 = Math.round(layoutX);
            int round6 = Math.round(layoutY);
            int i10 = round3 - round;
            int i11 = round4 - round2;
            boolean z10 = (round5 == this.mScreenX && round6 == this.mScreenY && i10 == this.mScreenWidth && i11 == this.mScreenHeight) ? false : true;
            this.mScreenX = round5;
            this.mScreenY = round6;
            this.mScreenWidth = i10;
            this.mScreenHeight = i11;
            if (z10) {
                if (nativeViewHierarchyOptimizer != null) {
                    nativeViewHierarchyOptimizer.handleUpdateLayout(this);
                } else {
                    uIViewOperationQueue.enqueueUpdateLayout(getParent().getReactTag(), getReactTag(), getScreenX(), getScreenY(), getScreenWidth(), getScreenHeight(), getLayoutDirection());
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean dispatchUpdatesWillChangeLayout(float f10, float f11) {
        if (!hasNewLayout()) {
            return false;
        }
        float layoutX = getLayoutX();
        float layoutY = getLayoutY();
        float f12 = f10 + layoutX;
        int round = Math.round(f12);
        float f13 = f11 + layoutY;
        int round2 = Math.round(f13);
        return (Math.round(layoutX) == this.mScreenX && Math.round(layoutY) == this.mScreenY && Math.round(f12 + getLayoutWidth()) - round == this.mScreenWidth && Math.round(f13 + getLayoutHeight()) - round2 == this.mScreenHeight) ? false : true;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void dispose() {
        com.facebook.yoga.r rVar = this.mYogaNode;
        if (rVar != null) {
            rVar.s();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getChildCount() {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public float getFlex() {
        return this.mYogaNode.d();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public Integer getHeightMeasureSpec() {
        return this.mHeightMeasureSpec;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public String getHierarchyInfo() {
        StringBuilder sb2 = new StringBuilder();
        getHierarchyInfoWithIndentation(sb2, 0);
        return sb2.toString();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final com.facebook.yoga.h getLayoutDirection() {
        return this.mYogaNode.f();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getLayoutHeight() {
        return this.mYogaNode.g();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getLayoutWidth() {
        return this.mYogaNode.i();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getLayoutX() {
        return this.mYogaNode.j();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getLayoutY() {
        return this.mYogaNode.k();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getNativeChildCount() {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mNativeChildren;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getPadding(int i10) {
        return this.mYogaNode.h(com.facebook.yoga.j.b(i10));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getReactTag() {
        return this.mReactTag;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getRootTag() {
        S7.a.a(this.mRootTag != 0);
        return this.mRootTag;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public int getScreenHeight() {
        return this.mScreenHeight;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public int getScreenWidth() {
        return this.mScreenWidth;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public int getScreenX() {
        return this.mScreenX;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public int getScreenY() {
        return this.mScreenY;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final YogaValue getStyleHeight() {
        return this.mYogaNode.e();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final YogaValue getStylePadding(int i10) {
        return this.mYogaNode.l(com.facebook.yoga.j.b(i10));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final YogaValue getStyleWidth() {
        return this.mYogaNode.m();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ThemedReactContext getThemedContext() {
        return (ThemedReactContext) S7.a.c(this.mThemedContext);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getTotalNativeChildren() {
        return this.mTotalNativeChildren;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final String getViewClass() {
        return (String) S7.a.c(this.mViewClassName);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public Integer getWidthMeasureSpec() {
        return this.mWidthMeasureSpec;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean hasNewLayout() {
        com.facebook.yoga.r rVar = this.mYogaNode;
        return rVar != null && rVar.n();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean hasUnseenUpdates() {
        return this.mNodeUpdated;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean hasUpdates() {
        return this.mNodeUpdated || hasNewLayout() || isDirty();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean hoistNativeChildren() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean isDirty() {
        com.facebook.yoga.r rVar = this.mYogaNode;
        return rVar != null && rVar.o();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean isLayoutOnly() {
        return this.mIsLayoutOnly;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isMeasureDefined() {
        return this.mYogaNode.p();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtual() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtualAnchor() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isYogaLeafNode() {
        return isMeasureDefined();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void markLayoutSeen() {
        com.facebook.yoga.r rVar = this.mYogaNode;
        if (rVar != null) {
            rVar.q();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void markUpdateSeen() {
        this.mNodeUpdated = false;
        if (hasNewLayout()) {
            markLayoutSeen();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void markUpdated() {
        if (this.mNodeUpdated) {
            return;
        }
        this.mNodeUpdated = true;
        ReactShadowNodeImpl parent = getParent();
        if (parent != null) {
            parent.markUpdated();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void onAfterUpdateTransaction() {
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void onBeforeLayout(NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void removeAllNativeChildren() {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mNativeChildren;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.mNativeChildren.get(size).mNativeParent = null;
            }
            this.mNativeChildren.clear();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void removeAndDisposeAllChildren() {
        if (getChildCount() == 0) {
            return;
        }
        int i10 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (this.mYogaNode != null && !isYogaLeafNode()) {
                this.mYogaNode.r(childCount);
            }
            ReactShadowNodeImpl childAt = getChildAt(childCount);
            childAt.mParent = null;
            i10 += childAt.getTotalNativeNodeContributionToParent();
            childAt.dispose();
        }
        ((ArrayList) S7.a.c(this.mChildren)).clear();
        markUpdated();
        this.mTotalNativeChildren -= i10;
        updateNativeChildrenCountInParent(-i10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setAlignContent(com.facebook.yoga.a aVar) {
        this.mYogaNode.t(aVar);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setAlignItems(com.facebook.yoga.a aVar) {
        this.mYogaNode.u(aVar);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setAlignSelf(com.facebook.yoga.a aVar) {
        this.mYogaNode.v(aVar);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setBaselineFunction(com.facebook.yoga.b bVar) {
        this.mYogaNode.x(bVar);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setBorder(int i10, float f10) {
        this.mYogaNode.y(com.facebook.yoga.j.b(i10), f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setColumnGap(float f10) {
        this.mYogaNode.J(com.facebook.yoga.m.COLUMN, f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setColumnGapPercent(float f10) {
        this.mYogaNode.K(com.facebook.yoga.m.COLUMN, f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setDefaultPadding(int i10, float f10) {
        this.mDefaultPadding.set(i10, f10);
        updatePadding();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setDisplay(com.facebook.yoga.i iVar) {
        this.mYogaNode.B(iVar);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlex(float f10) {
        this.mYogaNode.C(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexBasis(float f10) {
        this.mYogaNode.D(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexBasisAuto() {
        this.mYogaNode.E();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexBasisPercent(float f10) {
        this.mYogaNode.F(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexDirection(com.facebook.yoga.l lVar) {
        this.mYogaNode.G(lVar);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexGrow(float f10) {
        this.mYogaNode.H(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexShrink(float f10) {
        this.mYogaNode.I(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexWrap(com.facebook.yoga.x xVar) {
        this.mYogaNode.k0(xVar);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setGap(float f10) {
        this.mYogaNode.J(com.facebook.yoga.m.ALL, f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setGapPercent(float f10) {
        this.mYogaNode.J(com.facebook.yoga.m.ALL, f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void setIsLayoutOnly(boolean z10) {
        S7.a.b(getParent() == null, "Must remove from no opt parent first");
        S7.a.b(this.mNativeParent == null, "Must remove from native parent first");
        S7.a.b(getNativeChildCount() == 0, "Must remove all native children first");
        this.mIsLayoutOnly = z10;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setJustifyContent(com.facebook.yoga.n nVar) {
        this.mYogaNode.O(nVar);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setLayoutDirection(com.facebook.yoga.h hVar) {
        this.mYogaNode.A(hVar);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setLocalData(Object obj) {
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMargin(int i10, float f10) {
        this.mYogaNode.P(com.facebook.yoga.j.b(i10), f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMarginAuto(int i10) {
        this.mYogaNode.Q(com.facebook.yoga.j.b(i10));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMarginPercent(int i10, float f10) {
        this.mYogaNode.R(com.facebook.yoga.j.b(i10), f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMeasureFunction(com.facebook.yoga.o oVar) {
        this.mYogaNode.W(oVar);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMeasureSpecs(int i10, int i11) {
        this.mWidthMeasureSpec = Integer.valueOf(i10);
        this.mHeightMeasureSpec = Integer.valueOf(i11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setOverflow(com.facebook.yoga.u uVar) {
        this.mYogaNode.b0(uVar);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPadding(int i10, float f10) {
        this.mPadding[i10] = f10;
        this.mPaddingIsPercent[i10] = false;
        updatePadding();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPaddingPercent(int i10, float f10) {
        this.mPadding[i10] = f10;
        this.mPaddingIsPercent[i10] = !com.facebook.yoga.g.a(f10);
        updatePadding();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPosition(int i10, float f10) {
        this.mYogaNode.e0(com.facebook.yoga.j.b(i10), f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPositionPercent(int i10, float f10) {
        this.mYogaNode.f0(com.facebook.yoga.j.b(i10), f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPositionType(com.facebook.yoga.v vVar) {
        this.mYogaNode.g0(vVar);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setReactTag(int i10) {
        this.mReactTag = i10;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void setRootTag(int i10) {
        this.mRootTag = i10;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setRowGap(float f10) {
        this.mYogaNode.J(com.facebook.yoga.m.ROW, f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setRowGapPercent(float f10) {
        this.mYogaNode.K(com.facebook.yoga.m.ROW, f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setShouldNotifyOnLayout(boolean z10) {
        this.mShouldNotifyOnLayout = z10;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleAspectRatio(float f10) {
        this.mYogaNode.w(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleHeight(float f10) {
        this.mYogaNode.L(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleHeightAuto() {
        this.mYogaNode.M();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleHeightPercent(float f10) {
        this.mYogaNode.N(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMaxHeight(float f10) {
        this.mYogaNode.S(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMaxHeightPercent(float f10) {
        this.mYogaNode.T(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMaxWidth(float f10) {
        this.mYogaNode.U(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMaxWidthPercent(float f10) {
        this.mYogaNode.V(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMinHeight(float f10) {
        this.mYogaNode.X(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMinHeightPercent(float f10) {
        this.mYogaNode.Y(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMinWidth(float f10) {
        this.mYogaNode.Z(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMinWidthPercent(float f10) {
        this.mYogaNode.a0(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleWidth(float f10) {
        this.mYogaNode.h0(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleWidthAuto() {
        this.mYogaNode.i0();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleWidthPercent(float f10) {
        this.mYogaNode.j0(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setThemedContext(ThemedReactContext themedReactContext) {
        this.mThemedContext = themedReactContext;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void setViewClassName(String str) {
        this.mViewClassName = str;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean shouldNotifyOnLayout() {
        return this.mShouldNotifyOnLayout;
    }

    public String toString() {
        return "[" + this.mViewClassName + " " + getReactTag() + "]";
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void updateProperties(ReactStylesDiffMap reactStylesDiffMap) {
        ViewManagerPropertyUpdater.updateProps(this, reactStylesDiffMap);
        onAfterUpdateTransaction();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void addChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i10) {
        if (this.mChildren == null) {
            this.mChildren = new ArrayList<>(4);
        }
        this.mChildren.add(i10, reactShadowNodeImpl);
        reactShadowNodeImpl.mParent = this;
        if (this.mYogaNode != null && !isYogaLeafNode()) {
            com.facebook.yoga.r rVar = reactShadowNodeImpl.mYogaNode;
            if (rVar == null) {
                throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + reactShadowNodeImpl.toString() + "' to a '" + toString() + "')");
            }
            this.mYogaNode.a(rVar, i10);
        }
        markUpdated();
        int totalNativeNodeContributionToParent = reactShadowNodeImpl.getTotalNativeNodeContributionToParent();
        this.mTotalNativeChildren += totalNativeNodeContributionToParent;
        updateNativeChildrenCountInParent(totalNativeNodeContributionToParent);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void addNativeChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i10) {
        if (this.mNativeChildren == null) {
            this.mNativeChildren = new ArrayList<>(4);
        }
        this.mNativeChildren.add(i10, reactShadowNodeImpl);
        reactShadowNodeImpl.mNativeParent = this;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void calculateLayout(float f10, float f11) {
        this.mYogaNode.b(f10, f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ReactShadowNodeImpl getChildAt(int i10) {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        if (arrayList != null) {
            return arrayList.get(i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i10 + " out of bounds: node has no children");
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ReactShadowNodeImpl getLayoutParent() {
        ReactShadowNodeImpl reactShadowNodeImpl = this.mLayoutParent;
        return reactShadowNodeImpl != null ? reactShadowNodeImpl : getNativeParent();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getNativeOffsetForChild(ReactShadowNodeImpl reactShadowNodeImpl) {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            ReactShadowNodeImpl childAt = getChildAt(i11);
            if (reactShadowNodeImpl == childAt) {
                return i10;
            }
            i10 += childAt.getTotalNativeNodeContributionToParent();
        }
        throw new RuntimeException("Child " + reactShadowNodeImpl.getReactTag() + " was not a child of " + this.mReactTag);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ReactShadowNodeImpl getNativeParent() {
        return this.mNativeParent;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ReactShadowNodeImpl getParent() {
        return this.mParent;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int indexOf(ReactShadowNodeImpl reactShadowNodeImpl) {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        if (arrayList == null) {
            return -1;
        }
        return arrayList.indexOf(reactShadowNodeImpl);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int indexOfNativeChild(ReactShadowNodeImpl reactShadowNodeImpl) {
        S7.a.c(this.mNativeChildren);
        return this.mNativeChildren.indexOf(reactShadowNodeImpl);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isDescendantOf(ReactShadowNodeImpl reactShadowNodeImpl) {
        for (ReactShadowNodeImpl parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent == reactShadowNodeImpl) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public ReactShadowNodeImpl removeChildAt(int i10) {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        if (arrayList == null) {
            throw new ArrayIndexOutOfBoundsException("Index " + i10 + " out of bounds: node has no children");
        }
        ReactShadowNodeImpl remove = arrayList.remove(i10);
        remove.mParent = null;
        if (this.mYogaNode != null && !isYogaLeafNode()) {
            this.mYogaNode.r(i10);
        }
        markUpdated();
        int totalNativeNodeContributionToParent = remove.getTotalNativeNodeContributionToParent();
        this.mTotalNativeChildren -= totalNativeNodeContributionToParent;
        updateNativeChildrenCountInParent(-totalNativeNodeContributionToParent);
        return remove;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ReactShadowNodeImpl removeNativeChildAt(int i10) {
        S7.a.c(this.mNativeChildren);
        ReactShadowNodeImpl remove = this.mNativeChildren.remove(i10);
        remove.mNativeParent = null;
        return remove;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void setLayoutParent(ReactShadowNodeImpl reactShadowNodeImpl) {
        this.mLayoutParent = reactShadowNodeImpl;
    }
}
