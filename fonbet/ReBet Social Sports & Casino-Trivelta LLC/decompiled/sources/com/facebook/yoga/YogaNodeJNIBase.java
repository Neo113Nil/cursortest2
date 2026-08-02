package com.facebook.yoga;

import java.util.ArrayList;
import java.util.List;

@B8.a
/* loaded from: classes2.dex */
public abstract class YogaNodeJNIBase extends r implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public YogaNodeJNIBase f31640a;

    @B8.a
    private float[] arr;

    /* renamed from: b, reason: collision with root package name */
    public c f31641b;

    /* renamed from: c, reason: collision with root package name */
    public List f31642c;

    /* renamed from: d, reason: collision with root package name */
    public o f31643d;

    /* renamed from: e, reason: collision with root package name */
    public b f31644e;

    /* renamed from: f, reason: collision with root package name */
    public long f31645f;

    /* renamed from: g, reason: collision with root package name */
    public Object f31646g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f31647h;

    @B8.a
    private int mLayoutDirection;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$yoga$YogaEdge;

        static {
            int[] iArr = new int[j.values().length];
            $SwitchMap$com$facebook$yoga$YogaEdge = iArr;
            try {
                iArr[j.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaEdge[j.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaEdge[j.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaEdge[j.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaEdge[j.START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaEdge[j.END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public YogaNodeJNIBase(long j10) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f31647h = true;
        if (j10 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.f31645f = j10;
    }

    public static YogaValue o0(long j10) {
        return new YogaValue(Float.intBitsToFloat((int) j10), (int) (j10 >> 32));
    }

    @B8.a
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i10) {
        List list = this.f31642c;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i10);
        this.f31642c.add(i10, yogaNodeJNIBase);
        yogaNodeJNIBase.f31640a = this;
        return yogaNodeJNIBase.f31645f;
    }

    @Override // com.facebook.yoga.r
    public void A(h hVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.f31645f, hVar.c());
    }

    @Override // com.facebook.yoga.r
    public void B(i iVar) {
        YogaNative.jni_YGNodeStyleSetDisplayJNI(this.f31645f, iVar.b());
    }

    @Override // com.facebook.yoga.r
    public void C(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.f31645f, f10);
    }

    @Override // com.facebook.yoga.r
    public void D(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.f31645f, f10);
    }

    @Override // com.facebook.yoga.r
    public void E() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.f31645f);
    }

    @Override // com.facebook.yoga.r
    public void F(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.f31645f, f10);
    }

    @Override // com.facebook.yoga.r
    public void G(l lVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.f31645f, lVar.b());
    }

    @Override // com.facebook.yoga.r
    public void H(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.f31645f, f10);
    }

    @Override // com.facebook.yoga.r
    public void I(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.f31645f, f10);
    }

    @Override // com.facebook.yoga.r
    public void J(m mVar, float f10) {
        YogaNative.jni_YGNodeStyleSetGapJNI(this.f31645f, mVar.b(), f10);
    }

    @Override // com.facebook.yoga.r
    public void K(m mVar, float f10) {
        YogaNative.jni_YGNodeStyleSetGapPercentJNI(this.f31645f, mVar.b(), f10);
    }

    @Override // com.facebook.yoga.r
    public void L(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.f31645f, f10);
    }

    @Override // com.facebook.yoga.r
    public void M() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.f31645f);
    }

    @Override // com.facebook.yoga.r
    public void N(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.f31645f, f10);
    }

    @Override // com.facebook.yoga.r
    public void O(n nVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.f31645f, nVar.b());
    }

    @Override // com.facebook.yoga.r
    public void P(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.f31645f, jVar.c(), f10);
    }

    @Override // com.facebook.yoga.r
    public void Q(j jVar) {
        YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.f31645f, jVar.c());
    }

    @Override // com.facebook.yoga.r
    public void R(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.f31645f, jVar.c(), f10);
    }

    @Override // com.facebook.yoga.r
    public void S(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.f31645f, f10);
    }

    @Override // com.facebook.yoga.r
    public void T(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.f31645f, f10);
    }

    @Override // com.facebook.yoga.r
    public void U(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.f31645f, f10);
    }

    @Override // com.facebook.yoga.r
    public void V(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.f31645f, f10);
    }

    @Override // com.facebook.yoga.r
    public void W(o oVar) {
        this.f31643d = oVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.f31645f, oVar != null);
    }

    @Override // com.facebook.yoga.r
    public void X(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.f31645f, f10);
    }

    @Override // com.facebook.yoga.r
    public void Y(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.f31645f, f10);
    }

    @Override // com.facebook.yoga.r
    public void Z(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.f31645f, f10);
    }

    @Override // com.facebook.yoga.r
    public void a(r rVar, int i10) {
        if (rVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) rVar;
            if (yogaNodeJNIBase.f31640a != null) {
                throw new IllegalStateException("Child already has a parent, it must be removed first.");
            }
            if (this.f31642c == null) {
                this.f31642c = new ArrayList(4);
            }
            this.f31642c.add(i10, yogaNodeJNIBase);
            yogaNodeJNIBase.f31640a = this;
            YogaNative.jni_YGNodeInsertChildJNI(this.f31645f, yogaNodeJNIBase.f31645f, i10);
        }
    }

    @Override // com.facebook.yoga.r
    public void a0(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.f31645f, f10);
    }

    @Override // com.facebook.yoga.r
    public void b(float f10, float f11) {
        l0(null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i10);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.f31642c;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.l0(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i11 = 0; i11 < yogaNodeJNIBaseArr.length; i11++) {
            jArr[i11] = yogaNodeJNIBaseArr[i11].f31645f;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.f31645f, f10, f11, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.facebook.yoga.r
    public void b0(u uVar) {
        YogaNative.jni_YGNodeStyleSetOverflowJNI(this.f31645f, uVar.b());
    }

    @B8.a
    public final float baseline(float f10, float f11) {
        return this.f31644e.a(this, f10, f11);
    }

    @Override // com.facebook.yoga.r
    public void c() {
        YogaNative.jni_YGNodeMarkDirtyJNI(this.f31645f);
    }

    @Override // com.facebook.yoga.r
    public void c0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.f31645f, jVar.c(), f10);
    }

    @Override // com.facebook.yoga.r
    public float d() {
        return YogaNative.jni_YGNodeStyleGetFlexJNI(this.f31645f);
    }

    @Override // com.facebook.yoga.r
    public void d0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.f31645f, jVar.c(), f10);
    }

    @Override // com.facebook.yoga.r
    public YogaValue e() {
        return o0(YogaNative.jni_YGNodeStyleGetHeightJNI(this.f31645f));
    }

    @Override // com.facebook.yoga.r
    public void e0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.f31645f, jVar.c(), f10);
    }

    @Override // com.facebook.yoga.r
    public h f() {
        float[] fArr = this.arr;
        return h.b(fArr != null ? (int) fArr[5] : this.mLayoutDirection);
    }

    @Override // com.facebook.yoga.r
    public void f0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.f31645f, jVar.c(), f10);
    }

    @Override // com.facebook.yoga.r
    public float g() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.r
    public void g0(v vVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.f31645f, vVar.b());
    }

    @Override // com.facebook.yoga.r
    public float h(j jVar) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        float f10 = fArr[0];
        if ((((int) f10) & 2) != 2) {
            return 0.0f;
        }
        int i10 = (((int) f10) & 1) != 1 ? 4 : 0;
        int i11 = 10 - i10;
        switch (a.$SwitchMap$com$facebook$yoga$YogaEdge[jVar.ordinal()]) {
            case 1:
                return this.arr[i11];
            case 2:
                return this.arr[11 - i10];
            case 3:
                return this.arr[12 - i10];
            case 4:
                return this.arr[13 - i10];
            case 5:
                return f() == h.RTL ? this.arr[12 - i10] : this.arr[i11];
            case 6:
                return f() == h.RTL ? this.arr[i11] : this.arr[12 - i10];
            default:
                throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.r
    public void h0(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.f31645f, f10);
    }

    @Override // com.facebook.yoga.r
    public float i() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.r
    public void i0() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.f31645f);
    }

    @Override // com.facebook.yoga.r
    public float j() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.r
    public void j0(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.f31645f, f10);
    }

    @Override // com.facebook.yoga.r
    public float k() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.r
    public void k0(x xVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.f31645f, xVar.b());
    }

    @Override // com.facebook.yoga.r
    public YogaValue l(j jVar) {
        return o0(YogaNative.jni_YGNodeStyleGetPaddingJNI(this.f31645f, jVar.c()));
    }

    public final void l0(r rVar) {
        m0();
    }

    @Override // com.facebook.yoga.r
    public YogaValue m() {
        return o0(YogaNative.jni_YGNodeStyleGetWidthJNI(this.f31645f));
    }

    public Object m0() {
        return this.f31646g;
    }

    @B8.a
    public final long measure(float f10, int i10, float f11, int i11) {
        if (p()) {
            return this.f31643d.measure(this, f10, p.b(i10), f11, p.b(i11));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.facebook.yoga.r
    public boolean n() {
        float[] fArr = this.arr;
        return fArr != null ? (((int) fArr[0]) & 16) == 16 : this.f31647h;
    }

    @Override // com.facebook.yoga.r
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase r(int i10) {
        List list = this.f31642c;
        if (list == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) list.remove(i10);
        yogaNodeJNIBase.f31640a = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.f31645f, yogaNodeJNIBase.f31645f);
        return yogaNodeJNIBase;
    }

    @Override // com.facebook.yoga.r
    public boolean o() {
        return YogaNative.jni_YGNodeIsDirtyJNI(this.f31645f);
    }

    @Override // com.facebook.yoga.r
    public boolean p() {
        return this.f31643d != null;
    }

    @Override // com.facebook.yoga.r
    public void q() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.f31647h = false;
    }

    @Override // com.facebook.yoga.r
    public void s() {
        this.f31643d = null;
        this.f31644e = null;
        this.f31646g = null;
        this.arr = null;
        this.f31647h = true;
        this.mLayoutDirection = 0;
        YogaNative.jni_YGNodeResetJNI(this.f31645f);
    }

    @Override // com.facebook.yoga.r
    public void t(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.f31645f, aVar.b());
    }

    @Override // com.facebook.yoga.r
    public void u(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.f31645f, aVar.b());
    }

    @Override // com.facebook.yoga.r
    public void v(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.f31645f, aVar.b());
    }

    @Override // com.facebook.yoga.r
    public void w(float f10) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.f31645f, f10);
    }

    @Override // com.facebook.yoga.r
    public void x(b bVar) {
        this.f31644e = bVar;
        YogaNative.jni_YGNodeSetHasBaselineFuncJNI(this.f31645f, bVar != null);
    }

    @Override // com.facebook.yoga.r
    public void y(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.f31645f, jVar.c(), f10);
    }

    @Override // com.facebook.yoga.r
    public void z(Object obj) {
        this.f31646g = obj;
    }

    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    public YogaNodeJNIBase(c cVar) {
        this(YogaNative.jni_YGNodeNewWithConfigJNI(((e) cVar).f31667c));
        this.f31641b = cVar;
    }
}
