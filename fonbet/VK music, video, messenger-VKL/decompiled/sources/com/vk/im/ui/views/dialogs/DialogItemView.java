package com.vk.im.ui.views.dialogs;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.im.ImageList;
import com.vk.im.design.view.counter.ImVkCounter;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.engine.models.typing.ComposingType;
import com.vk.toggle.b;
import com.vk.toggle.features.ImFeatures;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.a2u0;
import xsna.asp;
import xsna.awt0;
import xsna.bwt0;
import xsna.cn70;
import xsna.egm;
import xsna.f4m;
import xsna.gp10;
import xsna.msy;
import xsna.too0;
import xsna.vq6;
import xsna.zrp;

/* compiled from: DialogItemView.kt */
/* loaded from: classes2.dex */
public final class DialogItemView extends ViewGroup implements too0 {
    public static final /* synthetic */ int e = 0;
    public final boolean b;
    public final boolean c;
    public final Object d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DialogItemView.kt */
    public static final class ExtraIcon {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ExtraIcon[] $VALUES;
        public static final ExtraIcon BOMB;
        public static final ExtraIcon DRAG;
        public static final ExtraIcon MENTION;
        public static final ExtraIcon NONE;
        public static final ExtraIcon PIN;

        static {
            ExtraIcon extraIcon = new ExtraIcon("BOMB", 0);
            BOMB = extraIcon;
            ExtraIcon extraIcon2 = new ExtraIcon("MENTION", 1);
            MENTION = extraIcon2;
            ExtraIcon extraIcon3 = new ExtraIcon("PIN", 2);
            PIN = extraIcon3;
            ExtraIcon extraIcon4 = new ExtraIcon("DRAG", 3);
            DRAG = extraIcon4;
            ExtraIcon extraIcon5 = new ExtraIcon("NONE", 4);
            NONE = extraIcon5;
            ExtraIcon[] extraIconArr = {extraIcon, extraIcon2, extraIcon3, extraIcon4, extraIcon5};
            $VALUES = extraIconArr;
            $ENTRIES = new asp(extraIconArr);
        }

        public ExtraIcon() {
            throw null;
        }

        public static ExtraIcon valueOf(String str) {
            return (ExtraIcon) Enum.valueOf(ExtraIcon.class, str);
        }

        public static ExtraIcon[] values() {
            return (ExtraIcon[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DialogItemView.kt */
    public static final class LinesCount {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LinesCount[] $VALUES;
        public static final LinesCount LINES_2;
        public static final LinesCount LINES_3;

        static {
            LinesCount linesCount = new LinesCount("LINES_2", 0);
            LINES_2 = linesCount;
            LinesCount linesCount2 = new LinesCount("LINES_3", 1);
            LINES_3 = linesCount2;
            LinesCount[] linesCountArr = {linesCount, linesCount2};
            $VALUES = linesCountArr;
            $ENTRIES = new asp(linesCountArr);
        }

        public LinesCount() {
            throw null;
        }

        public static LinesCount valueOf(String str) {
            return (LinesCount) Enum.valueOf(LinesCount.class, str);
        }

        public static LinesCount[] values() {
            return (LinesCount[]) $VALUES.clone();
        }
    }

    public DialogItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = BuildInfo.t();
        ImFeatures imFeatures = ImFeatures.REDESIGN_DIALOG_LIST_ITEM;
        imFeatures.getClass();
        this.c = b.A.a(imFeatures);
        this.d = msy.a(LazyThreadSafetyMode.NONE, new vq6(10, this, attributeSet));
        getDialogItemViewDelegate().P();
        getDialogItemViewDelegate().T();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final egm getDialogItemViewDelegate() {
        return (egm) this.d.getValue();
    }

    @Override // xsna.too0
    public final void Ng() {
        getDialogItemViewDelegate().h();
    }

    public final void a() {
        getDialogItemViewDelegate().i();
    }

    public final void b(Rect rect) {
        getDialogItemViewDelegate().k(rect);
    }

    public final boolean c() {
        egm dialogItemViewDelegate = getDialogItemViewDelegate();
        boolean K = bwt0.K(dialogItemViewDelegate.F());
        Lazy<VkImageSimple> G = dialogItemViewDelegate.G();
        boolean K2 = K | (!G.isInitialized() ? false : bwt0.K(G.getValue()));
        Lazy<VkImageSimple> x = dialogItemViewDelegate.x();
        boolean K3 = K2 | (!x.isInitialized() ? false : bwt0.K(x.getValue()));
        Lazy<VkImageSimple> z = dialogItemViewDelegate.z();
        boolean K4 = K3 | (!z.isInitialized() ? false : bwt0.K(z.getValue()));
        return !(K4 | (dialogItemViewDelegate.r().isInitialized() ? bwt0.K(r0.getValue()) : false));
    }

    public final boolean d() {
        egm dialogItemViewDelegate = getDialogItemViewDelegate();
        boolean K = bwt0.K(dialogItemViewDelegate.F());
        Lazy<ImVkCounter> H = dialogItemViewDelegate.H();
        return (!H.isInitialized() ? false : bwt0.K(H.getValue())) | K;
    }

    public final void e(Image image) {
        egm dialogItemViewDelegate = getDialogItemViewDelegate();
        dialogItemViewDelegate.getClass();
        ImageSize Ab = image.Ab(cn70.b(20), false);
        dialogItemViewDelegate.u().getValue().o0(Ab != null ? Ab.d.d : null, null);
    }

    public final void f(ImageList imageList, Drawable drawable, boolean z) {
        getDialogItemViewDelegate().Y(imageList, drawable, z);
    }

    public final void g(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo) {
        getDialogItemViewDelegate().Z(dialog, profilesSimpleInfo);
    }

    public final View getAvatarView() {
        return getDialogItemViewDelegate().l();
    }

    public final ExtraIcon getExtraIconType() {
        return getDialogItemViewDelegate().l;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void h(CharSequence charSequence, CharSequence charSequence2) {
        egm dialogItemViewDelegate = getDialogItemViewDelegate();
        if (charSequence != null) {
            dialogItemViewDelegate.getClass();
            if (charSequence.length() != 0) {
                dialogItemViewDelegate.d0(charSequence);
                dialogItemViewDelegate.X(charSequence2);
                if (charSequence != null || charSequence.length() == 0) {
                    if (charSequence2 != null || charSequence2.length() == 0) {
                        dialogItemViewDelegate.d0((String) dialogItemViewDelegate.i.getValue());
                        dialogItemViewDelegate.X(null);
                    }
                    return;
                }
                return;
            }
        }
        dialogItemViewDelegate.d0(null);
        dialogItemViewDelegate.X(charSequence2);
        if (charSequence != null) {
        }
        if (charSequence2 != null) {
        }
        dialogItemViewDelegate.d0((String) dialogItemViewDelegate.i.getValue());
        dialogItemViewDelegate.X(null);
    }

    public final void i() {
        getDialogItemViewDelegate().d0(null);
        getDialogItemViewDelegate().X(null);
    }

    public final void j(ExtraIcon extraIcon, boolean z) {
        getDialogItemViewDelegate().e0(extraIcon, z);
    }

    public final void k() {
        egm dialogItemViewDelegate = getDialogItemViewDelegate();
        dialogItemViewDelegate.E().getValue().getDrawable().setVisible(false, false);
        egm.a.i(dialogItemViewDelegate.E(), false);
        egm.a.i(getDialogItemViewDelegate().D(), false);
    }

    public final void l() {
        getDialogItemViewDelegate().f0();
    }

    public final void m() {
        getDialogItemViewDelegate().g0();
    }

    public final void n() {
        getDialogItemViewDelegate().i0();
    }

    public final void o() {
        getDialogItemViewDelegate().j0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getDialogItemViewDelegate().v0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
        if (!this.b) {
            getDialogItemViewDelegate().U(paddingLeft, paddingTop, measuredWidth, measuredHeight);
            return;
        }
        egm dialogItemViewDelegate = getDialogItemViewDelegate();
        View l = dialogItemViewDelegate.l();
        LinesCount p = dialogItemViewDelegate.p();
        LinesCount linesCount = LinesCount.LINES_2;
        int u0 = p == linesCount ? ((measuredHeight + paddingTop) / 2) - (bwt0.u0(l) / 2) : cn70.b(4) + paddingTop;
        int v0 = bwt0.v0(l) + paddingLeft;
        bwt0.u0(l);
        dialogItemViewDelegate.a(paddingLeft, u0);
        int M = dialogItemViewDelegate.p() == linesCount ? ((measuredHeight + paddingTop) / 2) - (dialogItemViewDelegate.M() / 2) : bwt0.P(l) + (dialogItemViewDelegate.M() / 2) + u0;
        dialogItemViewDelegate.M();
        dialogItemViewDelegate.K(v0, u0);
        int b = cn70.b(2) + bwt0.M(dialogItemViewDelegate.C()) + dialogItemViewDelegate.C().getBottom();
        dialogItemViewDelegate.g();
        dialogItemViewDelegate.f();
        dialogItemViewDelegate.d(v0, b);
        dialogItemViewDelegate.w0(v0, b);
        int v02 = measuredWidth - bwt0.v0(dialogItemViewDelegate.B());
        int u02 = M - (dialogItemViewDelegate.p() == linesCount ? bwt0.u0(dialogItemViewDelegate.B()) / 2 : cn70.b(0));
        int i5 = a2u0.a;
        a2u0.b(v02, u02, dialogItemViewDelegate.B());
        int p0 = v02 - dialogItemViewDelegate.p0();
        int max = ((Math.max(Math.max(egm.a.k(dialogItemViewDelegate.G()), egm.a.k(dialogItemViewDelegate.x())), Math.max(egm.a.k(dialogItemViewDelegate.z()), egm.a.k(dialogItemViewDelegate.r()))) + u02) + u02) / 2;
        egm.a.d(dialogItemViewDelegate.G(), egm.a.e(dialogItemViewDelegate.G()) + p0, egm.a.g(dialogItemViewDelegate.G()) + (max - (egm.a.a(dialogItemViewDelegate.G()) / 2)));
        egm.a.d(dialogItemViewDelegate.x(), egm.a.e(dialogItemViewDelegate.x()) + p0, egm.a.g(dialogItemViewDelegate.x()) + (max - (egm.a.a(dialogItemViewDelegate.x()) / 2)));
        egm.a.d(dialogItemViewDelegate.z(), egm.a.e(dialogItemViewDelegate.z()) + p0, egm.a.g(dialogItemViewDelegate.z()) + (max - (egm.a.a(dialogItemViewDelegate.z()) / 2)));
        egm.a.d(dialogItemViewDelegate.r(), egm.a.e(dialogItemViewDelegate.r()) + p0, egm.a.g(dialogItemViewDelegate.r()) + (max - (egm.a.a(dialogItemViewDelegate.r()) / 2)));
        int s0 = measuredWidth - dialogItemViewDelegate.s0();
        int max2 = ((Math.max(Math.max(egm.a.k(dialogItemViewDelegate.t()), bwt0.u0(dialogItemViewDelegate.F())), Math.max(egm.a.k(dialogItemViewDelegate.H()), egm.a.k(dialogItemViewDelegate.y()))) + b) + b) / 2;
        egm.a.d(dialogItemViewDelegate.y(), egm.a.e(dialogItemViewDelegate.y()) + s0, egm.a.g(dialogItemViewDelegate.y()) + (max2 - (egm.a.a(dialogItemViewDelegate.y()) / 2)));
        egm.a.d(dialogItemViewDelegate.H(), egm.a.e(dialogItemViewDelegate.H()) + s0, egm.a.g(dialogItemViewDelegate.H()) + (max2 - (egm.a.a(dialogItemViewDelegate.H()) / 2)));
        if (egm.a.c(dialogItemViewDelegate.H())) {
            s0 = egm.a.f(dialogItemViewDelegate.H()) + egm.a.b(dialogItemViewDelegate.H());
        }
        egm.a.d(dialogItemViewDelegate.t(), egm.a.e(dialogItemViewDelegate.t()) + s0, egm.a.g(dialogItemViewDelegate.t()) + (max2 - (egm.a.a(dialogItemViewDelegate.t()) / 2)));
        if (egm.a.c(dialogItemViewDelegate.t())) {
            s0 = egm.a.f(dialogItemViewDelegate.t()) + egm.a.b(dialogItemViewDelegate.t());
        }
        a2u0.b(bwt0.N(dialogItemViewDelegate.F()) + s0, bwt0.P(dialogItemViewDelegate.F()) + (max2 - (dialogItemViewDelegate.F().getMeasuredHeight() / 2)), dialogItemViewDelegate.F());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        int size2 = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        if (this.b) {
            egm dialogItemViewDelegate = getDialogItemViewDelegate();
            View l = dialogItemViewDelegate.l();
            egm.b bVar = dialogItemViewDelegate.m;
            if (bVar == null) {
                bVar = null;
            }
            dialogItemViewDelegate.r0(gp10.c(size2 - bVar.f, Integer.MIN_VALUE), gp10.c(0, 0));
            int p0 = dialogItemViewDelegate.p0();
            int s0 = dialogItemViewDelegate.s0();
            dialogItemViewDelegate.b(gp10.c(size2, Integer.MIN_VALUE), gp10.c(0, 0));
            int v0 = size2 - bwt0.v0(l);
            int c = gp10.c(v0, Integer.MIN_VALUE);
            int c2 = gp10.c(0, 0);
            dialogItemViewDelegate.L(c, c2);
            int b = cn70.b(12) + bwt0.v0(dialogItemViewDelegate.B()) + egm.a.l(dialogItemViewDelegate.J()) + egm.a.l(dialogItemViewDelegate.n()) + egm.a.l(dialogItemViewDelegate.s()) + egm.a.l(dialogItemViewDelegate.w()) + egm.a.l(dialogItemViewDelegate.I()) + egm.a.l(dialogItemViewDelegate.q()) + egm.a.l(dialogItemViewDelegate.u()) + p0;
            int i3 = a2u0.a;
            a2u0.c(dialogItemViewDelegate.C(), c, b, c2);
            dialogItemViewDelegate.e(gp10.c(v0, Integer.MIN_VALUE), gp10.c(0, 0), s0 == 0 ? 0 : cn70.b(8) + s0);
            dialogItemViewDelegate.x0(gp10.c(v0, Integer.MIN_VALUE), gp10.c(0, 0));
        } else {
            getDialogItemViewDelegate().V(size2);
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            int M = getDialogItemViewDelegate().M();
            int max = Math.max(getDialogItemViewDelegate().f(), Math.max(getDialogItemViewDelegate().y0(), getDialogItemViewDelegate().t0()));
            size = Math.max(Math.max(bwt0.u0(getAvatarView()), M + max) + getPaddingBottom() + getPaddingTop(), getMinimumHeight());
        } else {
            size = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
    }

    public final void p(CharSequence charSequence, boolean z) {
        getDialogItemViewDelegate().l0(charSequence, z);
    }

    public final void q(CharSequence charSequence, ComposingType composingType) {
        egm dialogItemViewDelegate = getDialogItemViewDelegate();
        dialogItemViewDelegate.getClass();
        if (charSequence.length() == 0) {
            dialogItemViewDelegate.E().getValue().getDrawable().setVisible(false, false);
            egm.a.i(dialogItemViewDelegate.E(), false);
            egm.a.i(dialogItemViewDelegate.D(), false);
            return;
        }
        dialogItemViewDelegate.o().a(composingType);
        dialogItemViewDelegate.E().getValue().getDrawable().setVisible(true, false);
        Lazy<VkImageSimple> E = dialogItemViewDelegate.E();
        E.isInitialized();
        bwt0.p0(E.getValue(), true);
        Lazy<VkText> D = dialogItemViewDelegate.D();
        D.isInitialized();
        bwt0.p0(D.getValue(), true);
        dialogItemViewDelegate.D().getValue().setText(charSequence);
        dialogItemViewDelegate.e.a(dialogItemViewDelegate.D().getValue());
    }

    public final void r(int i, boolean z) {
        egm dialogItemViewDelegate = getDialogItemViewDelegate();
        dialogItemViewDelegate.F().setVisibility(0);
        dialogItemViewDelegate.F().setRenderMode(ImVkCounter.DrawMode.COUNTER);
        if (z) {
            dialogItemViewDelegate.F().setCounterWithAnimation(i);
        } else {
            dialogItemViewDelegate.F().setCounterWithoutAnimation(i);
        }
        egm.a.i(dialogItemViewDelegate.y(), false);
    }

    public final void setAccessibilityTime(CharSequence charSequence) {
        getDialogItemViewDelegate().B().setContentDescription(charSequence);
    }

    public final void setAvatarContentDescription(String str) {
        getDialogItemViewDelegate().b0(str);
    }

    public final void setAvatarOnTouchListener(View.OnTouchListener onTouchListener) {
        getDialogItemViewDelegate().c0(onTouchListener);
    }

    public final void setAvatarViewClickListener(View.OnClickListener onClickListener) {
        getDialogItemViewDelegate().a0(onClickListener);
    }

    public final void setCasperIconColor(int i) {
        bwt0.o0(getDialogItemViewDelegate().n().getValue(), i);
    }

    public final void setCasperIconVisible(boolean z) {
        Lazy<VkImageSimple> n = getDialogItemViewDelegate().n();
        if (z || n.isInitialized()) {
            awt0.v(n.getValue(), z);
        }
    }

    public final void setDonutIconVisible(boolean z) {
        Lazy<VkImageSimple> q = getDialogItemViewDelegate().q();
        if (z || q.isInitialized()) {
            awt0.v(q.getValue(), z);
        }
    }

    public final void setErrorVisible(boolean z) {
        Lazy<VkImageSimple> r = getDialogItemViewDelegate().r();
        if (z || r.isInitialized()) {
            awt0.v(r.getValue(), z);
        }
    }

    public final void setHiddenVisible(boolean z) {
        Lazy<VkImageSimple> s = getDialogItemViewDelegate().s();
        if (z || s.isInitialized()) {
            awt0.v(s.getValue(), z);
        }
    }

    public final void setImageStatusContentDescription(CharSequence charSequence) {
        getDialogItemViewDelegate().u().getValue().setContentDescription(charSequence);
    }

    public final void setImageStatusVisible(boolean z) {
        Lazy<VkEnhancedImageView> u = getDialogItemViewDelegate().u();
        if (z || u.isInitialized()) {
            awt0.v(u.getValue(), z);
        }
    }

    public final void setMutedVisible(boolean z) {
        Lazy<VkImageSimple> w = getDialogItemViewDelegate().w();
        if (z || w.isInitialized()) {
            awt0.v(w.getValue(), z);
        }
    }

    public final void setReadOutVisible(boolean z) {
        Lazy<VkImageSimple> x = getDialogItemViewDelegate().x();
        if (z || x.isInitialized()) {
            awt0.v(x.getValue(), z);
        }
    }

    public final void setReplyButtonInStatus(boolean z) {
        egm dialogItemViewDelegate = getDialogItemViewDelegate();
        if (!z) {
            egm.a.i(dialogItemViewDelegate.y(), false);
            return;
        }
        Lazy<VkText> y = dialogItemViewDelegate.y();
        y.isInitialized();
        bwt0.p0(y.getValue(), true);
    }

    public final void setSendingVisible(boolean z) {
        Lazy<VkImageSimple> z2 = getDialogItemViewDelegate().z();
        if (z || z2.isInitialized()) {
            awt0.v(z2.getValue(), z);
        }
    }

    public final void setSpecialStatusCall(boolean z) {
        getDialogItemViewDelegate().h0(z);
    }

    public final void setStories(ImStoryState imStoryState) {
        getDialogItemViewDelegate().k0(imStoryState);
    }

    public final void setTime(CharSequence charSequence) {
        getDialogItemViewDelegate().B().setText(charSequence);
    }

    public final void setUnreadInMuted(boolean z) {
        getDialogItemViewDelegate().m0(z);
    }

    public final void setUnreadOutVisible(boolean z) {
        Lazy<VkImageSimple> G = getDialogItemViewDelegate().G();
        if (z || G.isInitialized()) {
            awt0.v(G.getValue(), z);
        }
    }

    public final void setVerified(VerifyInfo verifyInfo) {
        getDialogItemViewDelegate().o0(verifyInfo);
    }

    public final void setWritingDisabledIconVisible(boolean z) {
        Lazy<VkImageSimple> J = getDialogItemViewDelegate().J();
        if (z || J.isInitialized()) {
            awt0.v(J.getValue(), z);
        }
    }

    public final void t() {
        egm dialogItemViewDelegate = getDialogItemViewDelegate();
        dialogItemViewDelegate.F().setVisibility(0);
        dialogItemViewDelegate.F().setRenderMode(ImVkCounter.DrawMode.EMPTY);
        egm.a.i(dialogItemViewDelegate.y(), false);
    }

    public final void u() {
        egm dialogItemViewDelegate = getDialogItemViewDelegate();
        f4m.j(dialogItemViewDelegate.F());
        dialogItemViewDelegate.F().setCounterWithoutAnimation(0);
    }

    public final void v(boolean z, boolean z2) {
        egm dialogItemViewDelegate = getDialogItemViewDelegate();
        Lazy<ImVkCounter> H = dialogItemViewDelegate.H();
        if (H.isInitialized() || z) {
            bwt0.p0(H.getValue(), z);
        }
        Lazy<ImVkCounter> H2 = dialogItemViewDelegate.H();
        if (!H2.isInitialized() ? false : bwt0.K(H2.getValue())) {
            egm.a.i(dialogItemViewDelegate.y(), false);
            dialogItemViewDelegate.n0(z2);
        }
    }

    public final void w() {
        getDialogItemViewDelegate().z0();
    }
}
