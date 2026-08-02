package androidx.compose.ui.node;

import androidx.compose.ui.node.a;
import androidx.compose.ui.node.o;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.azl;
import xsna.fif0;
import xsna.fwr;
import xsna.gzs;
import xsna.ho5;
import xsna.kdu;
import xsna.kfo;
import xsna.kl;
import xsna.lo5;
import xsna.lwz;
import xsna.m490;
import xsna.mdu;
import xsna.mgi0;
import xsna.mio0;
import xsna.mzb0;
import xsna.n2x;
import xsna.n4s;
import xsna.nek0;
import xsna.no5;
import xsna.reg0;
import xsna.rut0;
import xsna.s090;
import xsna.s3q0;
import xsna.spx0;
import xsna.t590;
import xsna.toy;
import xsna.tra0;
import xsna.ura0;
import xsna.v090;
import xsna.v4s;
import xsna.vlb0;
import xsna.vtu;
import xsna.wfd;
import xsna.wzs;
import xsna.xfd;
import xsna.ymo0;
import xsna.z630;

/* compiled from: Owner.kt */
/* loaded from: classes11.dex */
public interface p extends mzb0 {

    /* compiled from: Owner.kt */
    public interface a {
        void h();
    }

    void A(LayoutNode layoutNode);

    void C(LayoutNode layoutNode);

    m490 D(wzs wzsVar, o.f fVar, mdu mduVar);

    void E(LayoutNode layoutNode);

    void a(boolean z);

    void b(LayoutNode layoutNode);

    void e(LayoutNode layoutNode);

    void f(a.b bVar);

    long g(long j);

    kl getAccessibilityManager();

    ho5 getAutofill();

    lo5 getAutofillManager();

    no5 getAutofillTree();

    wfd getClipboard();

    xfd getClipboardManager();

    kotlin.coroutines.d getCoroutineContext();

    azl getDensity();

    kfo getDragAndDropManager();

    fwr getFocusOwner();

    v4s.a getFontFamilyResolver();

    n4s.a getFontLoader();

    kdu getGraphicsContext();

    vtu getHapticFeedBack();

    n2x getInputModeManager();

    LayoutDirection getLayoutDirection();

    lwz getLocaleList();

    z630 getModifierLocalManager();

    default s090 getOutOfFrameExecutor() {
        return null;
    }

    default tra0.a getPlacementScope() {
        ura0.a aVar = ura0.a;
        return new v090(this);
    }

    vlb0 getPointerIconService();

    fif0 getRectManager();

    reg0 getRetainedValuesStore();

    LayoutNode getRoot();

    mgi0 getSemanticsOwner();

    toy getSharedDrawScope();

    boolean getShowLayoutBounds();

    t590 getSnapshotObserver();

    nek0 getSoftwareKeyboardController();

    mio0 getTextInputService();

    ymo0 getTextToolbar();

    rut0 getViewConfiguration();

    spx0 getWindowInfo();

    void h();

    void i();

    long j(long j);

    void l(LayoutNode layoutNode, boolean z);

    void m(LayoutNode layoutNode);

    void q(gzs<s3q0> gzsVar);

    void setShowLayoutBounds(boolean z);

    CoroutineSingletons u(wzs wzsVar, ContinuationImpl continuationImpl);

    void v();

    void w(LayoutNode layoutNode, long j);

    void x(LayoutNode layoutNode, boolean z, boolean z2, boolean z3);

    void y(LayoutNode layoutNode, boolean z, boolean z2);

    void z(LayoutNode layoutNode);

    default void c() {
    }

    default void o() {
    }

    default void s(float f) {
    }

    default void B(int i, LayoutNode layoutNode) {
    }

    default void n(int i, LayoutNode layoutNode) {
    }
}
