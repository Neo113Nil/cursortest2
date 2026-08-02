package ru.ozon.debugMenu.internal.core.ui.widgets.input.core.decorationBox;

import B1.m0;
import Z1.b;
import e1.InterfaceC6250b;
import hd.C6915b;
import kotlin.Metadata;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000D\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001aG\u0010\u0014\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a_\u0010 \u001a\u00020\u001f*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010!\u001aE\u0010#\u001a\u00020\u001f*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010$\"\u001a\u0010&\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"", "textFieldWidth", "labelWidth", "placeholderWidth", "LZ1/b;", "constraints", "calculateWidth--hBUhpc", "(IIIJ)I", "calculateWidth", "textFieldHeight", "", "hasLabel", "labelHeight", "placeholderHeight", "", "density", "Lu0/x;", "paddingValues", "calculateHeight-WeOhcdQ", "(IZIIJFLu0/x;)I", "calculateHeight", "LB1/m0$a;", "height", "LB1/m0;", "textfieldPlaceable", "labelPlaceable", "placeholderPlaceable", "singleLine", "labelEndPosition", "textPosition", "animationProgress", "", "placeWithLabel", "(LB1/m0$a;ILB1/m0;LB1/m0;LB1/m0;ZIIFF)V", "textPlaceable", "placeWithoutLabel", "(LB1/m0$a;ILB1/m0;LB1/m0;ZFLu0/x;)V", "LZ1/h;", "TextFieldTopPadding", "F", "getTextFieldTopPadding", "()F", "ozon-debug-menu_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextFieldMeasurePolicyKt {
    private static final float TextFieldTopPadding = 2;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-WeOhcdQ, reason: not valid java name */
    public static final int m1629calculateHeightWeOhcdQ(int i11, boolean z11, int i12, int i13, long j11, float f7, InterfaceC9914x interfaceC9914x) {
        float f11 = TextFieldTopPadding * f7;
        float d11 = interfaceC9914x.d() * f7;
        float a11 = interfaceC9914x.a() * f7;
        int max = Math.max(i11, i13);
        return Math.max(C6915b.c(z11 ? i12 + f11 + max + a11 : d11 + max + a11), b.l(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth--hBUhpc, reason: not valid java name */
    public static final int m1630calculateWidthhBUhpc(int i11, int i12, int i13, long j11) {
        return Math.max(Math.max(i11, Math.max(i12, i13)), b.m(j11));
    }

    public static final float getTextFieldTopPadding() {
        return TextFieldTopPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithLabel(m0.a aVar, int i11, m0 m0Var, m0 m0Var2, m0 m0Var3, boolean z11, int i12, int i13, float f7, float f11) {
        if (m0Var2 != null) {
            aVar.h(m0Var2, 0, (z11 ? InterfaceC6250b.a.i().a(m0Var2.l0(), i11) : C6915b.c(TextFieldImplKt.getTextFieldPadding() * f11)) - C6915b.c((r2 - i12) * f7), 0.0f);
        }
        aVar.h(m0Var, 0, i13, 0.0f);
        if (m0Var3 != null) {
            aVar.h(m0Var3, 0, i13, 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(m0.a aVar, int i11, m0 m0Var, m0 m0Var2, boolean z11, float f7, InterfaceC9914x interfaceC9914x) {
        int c11 = C6915b.c(interfaceC9914x.d() * f7);
        aVar.h(m0Var, 0, z11 ? InterfaceC6250b.a.i().a(m0Var.l0(), i11) : c11, 0.0f);
        if (m0Var2 != null) {
            if (z11) {
                c11 = InterfaceC6250b.a.i().a(m0Var2.l0(), i11);
            }
            aVar.h(m0Var2, 0, c11, 0.0f);
        }
    }
}
