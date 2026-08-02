package ru.ozon.uni.android.ds.compose.component.input.inputCore;

import Z1.b;
import hd.C6915b;
import kotlin.Metadata;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001aG\u0010\u0014\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"", "textFieldWidth", "labelWidth", "placeholderWidth", "LZ1/b;", "constraints", "calculateWidth--hBUhpc", "(IIIJ)I", "calculateWidth", "textFieldHeight", "", "hasLabel", "labelHeight", "placeholderHeight", "", "density", "Lu0/x;", "paddingValues", "calculateHeight-WeOhcdQ", "(IZIIJFLu0/x;)I", "calculateHeight", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldMeasurePolicyKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-WeOhcdQ, reason: not valid java name */
    public static final int m1750calculateHeightWeOhcdQ(int i11, boolean z11, int i12, int i13, long j11, float f7, InterfaceC9914x interfaceC9914x) {
        float m1847getDp2D9Ej5fM = DsSpacings.INSTANCE.m1847getDp2D9Ej5fM() * f7;
        float d11 = interfaceC9914x.d() * f7;
        float a11 = interfaceC9914x.a() * f7;
        int max = Math.max(i11, i13);
        return Math.max(C6915b.c(z11 ? i12 + m1847getDp2D9Ej5fM + max + a11 : d11 + max + a11), b.l(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth--hBUhpc, reason: not valid java name */
    public static final int m1751calculateWidthhBUhpc(int i11, int i12, int i13, long j11) {
        return Math.max(Math.max(i11, Math.max(i12, i13)), b.m(j11));
    }
}
