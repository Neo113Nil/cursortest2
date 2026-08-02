package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.view;

import S0.A1;
import S0.C3956f1;
import S0.C3987u0;
import S0.InterfaceC3978p0;
import Z1.n;
import Z1.o;
import Z1.s;
import android.view.View;
import d2.InterfaceC6040Q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.TooltipDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 !2\u00020\u0001:\u0001!B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0015\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/view/AndroidViewTooltipPositionProvider;", "Ld2/Q;", "Landroid/view/View;", "anchorView", "Lru/ozon/uni/atoms/data/common/TooltipDTO$BeakPosition;", "beakPosition", "", "leftMargin", "rightMargin", "<init>", "(Landroid/view/View;Lru/ozon/uni/atoms/data/common/TooltipDTO$BeakPosition;II)V", "LZ1/o;", "anchorBounds", "LZ1/q;", "windowSize", "LZ1/s;", "layoutDirection", "popupContentSize", "LZ1/m;", "calculatePosition-llwVHH4", "(LZ1/o;JLZ1/s;J)J", "calculatePosition", "Landroid/view/View;", "Lru/ozon/uni/atoms/data/common/TooltipDTO$BeakPosition;", "I", "LS0/p0;", "_beakOffset", "LS0/p0;", "LS0/A1;", "beakOffset", "LS0/A1;", "getBeakOffset", "()LS0/A1;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AndroidViewTooltipPositionProvider implements InterfaceC6040Q {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private InterfaceC3978p0<Integer> _beakOffset;

    @NotNull
    private final View anchorView;

    @NotNull
    private final A1<Integer> beakOffset;

    @NotNull
    private final TooltipDTO.BeakPosition beakPosition;
    private final int leftMargin;
    private final int rightMargin;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/view/AndroidViewTooltipPositionProvider$Companion;", "", "<init>", "()V", "BEAK_NO_OFFSET", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TooltipDTO.BeakPosition.values().length];
            try {
                iArr[TooltipDTO.BeakPosition.TOP_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TooltipDTO.BeakPosition.TOP_CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TooltipDTO.BeakPosition.BOTTOM_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TooltipDTO.BeakPosition.BOTTOM_CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TooltipDTO.BeakPosition.LEFT_CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TooltipDTO.BeakPosition.RIGHT_CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidViewTooltipPositionProvider(@NotNull View anchorView, @NotNull TooltipDTO.BeakPosition beakPosition, int i11, int i12) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        Intrinsics.checkNotNullParameter(beakPosition, "beakPosition");
        this.anchorView = anchorView;
        this.beakPosition = beakPosition;
        this.leftMargin = i11;
        this.rightMargin = i12;
        C3987u0 a11 = C3956f1.a(-1);
        this._beakOffset = a11;
        this.beakOffset = a11;
    }

    @Override // d2.InterfaceC6040Q
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo6calculatePositionllwVHH4(@NotNull o anchorBounds, long windowSize, @NotNull s layoutDirection, long popupContentSize) {
        int i11;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (!this.anchorView.isAttachedToWindow()) {
            return 0L;
        }
        int[] iArr = new int[2];
        this.anchorView.getLocationInWindow(iArr);
        int i14 = iArr[0];
        int i15 = iArr[1];
        int width = this.anchorView.getWidth();
        int height = this.anchorView.getHeight();
        int i16 = (int) (popupContentSize >> 32);
        int abs = Math.abs(width - i16) / 2;
        int i17 = (int) (popupContentSize & 4294967295L);
        int abs2 = Math.abs(height - i17) / 2;
        TooltipDTO.BeakPosition beakPosition = this.beakPosition;
        int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
        switch (iArr2[beakPosition.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                if (width <= i16) {
                    i11 = i14 - abs;
                    break;
                } else {
                    i11 = abs + i14;
                    break;
                }
            case 5:
                i11 = i14 + width;
                break;
            case 6:
                i11 = i14 - i16;
                break;
            default:
                throw new Sc.o();
        }
        switch (iArr2[this.beakPosition.ordinal()]) {
            case 1:
            case 2:
                i12 = i15 + height;
                break;
            case 3:
            case 4:
                i12 = i15 - i17;
                break;
            case 5:
            case 6:
                if (height <= i17) {
                    i12 = i15 - abs2;
                    break;
                } else {
                    i12 = i15 + abs2;
                    break;
                }
            default:
                throw new Sc.o();
        }
        TooltipDTO.BeakPosition beakPosition2 = this.beakPosition;
        if (beakPosition2 == TooltipDTO.BeakPosition.TOP_CUSTOM || beakPosition2 == TooltipDTO.BeakPosition.BOTTOM_CUSTOM) {
            InterfaceC3978p0<Integer> interfaceC3978p0 = this._beakOffset;
            if (width >= i16) {
                i13 = ((i16 - this.leftMargin) - this.rightMargin) / 2;
            } else {
                int i18 = (width / 2) + i14;
                int i19 = this.leftMargin;
                if (i11 > 0) {
                    i19 += i11;
                }
                int i21 = (i16 + i11) - ((int) (windowSize >> 32));
                int i22 = i18 - i19;
                if (i21 > 0) {
                    i22 += i21;
                }
                i13 = i22;
            }
            interfaceC3978p0.setValue(Integer.valueOf(i13));
        }
        return n.a(i11, i12);
    }

    @NotNull
    public final A1<Integer> getBeakOffset() {
        return this.beakOffset;
    }
}
