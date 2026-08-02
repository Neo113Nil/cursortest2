package ru.ozon.uni.android.ds.compose.component.tooltip;

import B1.B;
import S0.A1;
import S0.C3956f1;
import S0.C3987u0;
import S0.InterfaceC3978p0;
import Z1.n;
import Z1.o;
import Z1.s;
import d2.InterfaceC6040Q;
import k1.C7459e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.tooltip.DsTooltipBeakPosition;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 !2\u00020\u0001:\u0001!B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0015\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipPositionProvider;", "Ld2/Q;", "LB1/B;", "anchorCoordinates", "Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition;", "beakPosition", "<init>", "(LB1/B;Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition;)V", "LZ1/m;", "getMarginOffset-Bjo55l4", "(Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition;)J", "getMarginOffset", "LZ1/o;", "anchorBounds", "LZ1/q;", "windowSize", "LZ1/s;", "layoutDirection", "popupContentSize", "calculatePosition-llwVHH4", "(LZ1/o;JLZ1/s;J)J", "calculatePosition", "LB1/B;", "Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition;", "LS0/p0;", "", "_beakOffset", "LS0/p0;", "LS0/A1;", "beakOffset", "LS0/A1;", "getBeakOffset$uni_release", "()LS0/A1;", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsTooltipPositionProvider implements InterfaceC6040Q {

    @NotNull
    private InterfaceC3978p0<Integer> _beakOffset;
    private final B anchorCoordinates;

    @NotNull
    private final A1<Integer> beakOffset;

    @NotNull
    private final DsTooltipBeakPosition beakPosition;

    public DsTooltipPositionProvider(B b11, @NotNull DsTooltipBeakPosition beakPosition) {
        Intrinsics.checkNotNullParameter(beakPosition, "beakPosition");
        this.anchorCoordinates = b11;
        this.beakPosition = beakPosition;
        C3987u0 a11 = C3956f1.a(-1);
        this._beakOffset = a11;
        this.beakOffset = a11;
    }

    /* renamed from: getMarginOffset-Bjo55l4, reason: not valid java name */
    private final long m1829getMarginOffsetBjo55l4(DsTooltipBeakPosition beakPosition) {
        if (beakPosition instanceof DsTooltipBeakPosition.TopCustom) {
            DsTooltipBeakPosition.TopCustom topCustom = (DsTooltipBeakPosition.TopCustom) beakPosition;
            return n.a(topCustom.getLeftMargin(), topCustom.getRightMargin());
        }
        if (!(beakPosition instanceof DsTooltipBeakPosition.BottomCustom)) {
            return n.a(0, 0);
        }
        DsTooltipBeakPosition.BottomCustom bottomCustom = (DsTooltipBeakPosition.BottomCustom) beakPosition;
        return n.a(bottomCustom.getLeftMargin(), bottomCustom.getRightMargin());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a6, code lost:
    
        if (r5 > r6) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a8, code lost:
    
        r1 = r1 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00aa, code lost:
    
        r1 = r1 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
    
        if (r5 > r6) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0088, code lost:
    
        if (r7 > r8) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008a, code lost:
    
        r3 = r3 + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x008c, code lost:
    
        r3 = r3 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x008e, code lost:
    
        if (r7 > r8) goto L24;
     */
    @Override // d2.InterfaceC6040Q
    /* renamed from: calculatePosition-llwVHH4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo6calculatePositionllwVHH4(@NotNull o anchorBounds, long windowSize, @NotNull s layoutDirection, long popupContentSize) {
        int i11;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        B b11 = this.anchorCoordinates;
        if (b11 == null) {
            return 0L;
        }
        long u11 = b11.u(0L);
        int g10 = (int) C7459e.g(u11);
        int g11 = (int) C7459e.g(u11);
        int h11 = (int) C7459e.h(u11);
        long a11 = this.anchorCoordinates.a();
        int i14 = (int) (a11 >> 32);
        int i15 = (int) (popupContentSize >> 32);
        int abs = Math.abs(i14 - i15) / 2;
        int i16 = (int) (a11 & 4294967295L);
        int i17 = (int) (popupContentSize & 4294967295L);
        int abs2 = Math.abs(i16 - i17) / 2;
        DsTooltipBeakPosition dsTooltipBeakPosition = this.beakPosition;
        DsTooltipBeakPosition.TopCenter topCenter = DsTooltipBeakPosition.TopCenter.INSTANCE;
        if (!Intrinsics.d(dsTooltipBeakPosition, topCenter) && !(dsTooltipBeakPosition instanceof DsTooltipBeakPosition.TopCustom)) {
            if (Intrinsics.d(dsTooltipBeakPosition, DsTooltipBeakPosition.Left.INSTANCE)) {
                i11 = g10 + i14;
            } else if (Intrinsics.d(dsTooltipBeakPosition, DsTooltipBeakPosition.Right.INSTANCE)) {
                i11 = g10 - i15;
            } else if (!Intrinsics.d(dsTooltipBeakPosition, DsTooltipBeakPosition.BottomCenter.INSTANCE) && !(dsTooltipBeakPosition instanceof DsTooltipBeakPosition.BottomCustom)) {
                throw new Sc.o();
            }
        }
        DsTooltipBeakPosition dsTooltipBeakPosition2 = this.beakPosition;
        if (Intrinsics.d(dsTooltipBeakPosition2, topCenter) || (dsTooltipBeakPosition2 instanceof DsTooltipBeakPosition.TopCustom)) {
            i12 = h11 + i16;
        } else if (!Intrinsics.d(dsTooltipBeakPosition2, DsTooltipBeakPosition.Left.INSTANCE)) {
            if (!Intrinsics.d(dsTooltipBeakPosition2, DsTooltipBeakPosition.Right.INSTANCE)) {
                if (!Intrinsics.d(dsTooltipBeakPosition2, DsTooltipBeakPosition.BottomCenter.INSTANCE) && !(dsTooltipBeakPosition2 instanceof DsTooltipBeakPosition.BottomCustom)) {
                    throw new Sc.o();
                }
                i12 = h11 - i17;
            }
        }
        long a12 = n.a(i11, i12);
        DsTooltipBeakPosition dsTooltipBeakPosition3 = this.beakPosition;
        if (!(dsTooltipBeakPosition3 instanceof DsTooltipBeakPosition.TopCustom) && !(dsTooltipBeakPosition3 instanceof DsTooltipBeakPosition.BottomCustom)) {
            return a12;
        }
        long m1829getMarginOffsetBjo55l4 = m1829getMarginOffsetBjo55l4(dsTooltipBeakPosition3);
        InterfaceC3978p0<Integer> interfaceC3978p0 = this._beakOffset;
        if (i14 >= i15) {
            i13 = ((i15 - ((int) (m1829getMarginOffsetBjo55l4 >> 32))) - ((int) (m1829getMarginOffsetBjo55l4 & 4294967295L))) / 2;
        } else {
            int i18 = (i14 / 2) + g11;
            int i19 = i11 > 0 ? ((int) (m1829getMarginOffsetBjo55l4 >> 32)) + i11 : (int) (m1829getMarginOffsetBjo55l4 >> 32);
            int i21 = (i11 + i15) - ((int) (windowSize >> 32));
            int i22 = i18 - i19;
            if (i21 > 0) {
                i22 += i21;
            }
            i13 = i22;
        }
        interfaceC3978p0.setValue(Integer.valueOf(i13));
        return a12;
    }

    @NotNull
    public final A1<Integer> getBeakOffset$uni_release() {
        return this.beakOffset;
    }
}
