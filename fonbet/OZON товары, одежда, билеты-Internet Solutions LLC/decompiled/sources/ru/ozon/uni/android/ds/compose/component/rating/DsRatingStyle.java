package ru.ozon.uni.android.ds.compose.component.rating;

import S0.InterfaceC3967k;
import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.models.UniColorToken;
import ru.ozon.uni.core.repository.UniTheme;

@InterfaceC6346b
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087@\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\r"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/rating/DsRatingStyle;", "", "", "index", "constructor-impl", "(I)I", "Ll1/Z;", "getSelectedColor", "(ILS0/k;I)J", "selectedColor", "getBackgroundColor", "backgroundColor", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsRatingStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int DEFAULT = m1767constructorimpl(0);
    private static final int DEFAULT_ON_DARK = m1767constructorimpl(1);
    private static final int STATIC_ON_DARK = m1767constructorimpl(2);
    private static final int CUSTOM = m1767constructorimpl(3);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0013\u0010\r\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/rating/DsRatingStyle$Companion;", "", "<init>", "()V", "DEFAULT", "Lru/ozon/uni/android/ds/compose/component/rating/DsRatingStyle;", "getDEFAULT-snpJkgg", "()I", "I", "DEFAULT_ON_DARK", "getDEFAULT_ON_DARK-snpJkgg", "STATIC_ON_DARK", "getSTATIC_ON_DARK-snpJkgg", "CUSTOM", "getCUSTOM-snpJkgg", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getCUSTOM-snpJkgg, reason: not valid java name */
        public final int m1769getCUSTOMsnpJkgg() {
            return DsRatingStyle.CUSTOM;
        }

        /* renamed from: getDEFAULT-snpJkgg, reason: not valid java name */
        public final int m1770getDEFAULTsnpJkgg() {
            return DsRatingStyle.DEFAULT;
        }

        /* renamed from: getDEFAULT_ON_DARK-snpJkgg, reason: not valid java name */
        public final int m1771getDEFAULT_ON_DARKsnpJkgg() {
            return DsRatingStyle.DEFAULT_ON_DARK;
        }

        /* renamed from: getSTATIC_ON_DARK-snpJkgg, reason: not valid java name */
        public final int m1772getSTATIC_ON_DARKsnpJkgg() {
            return DsRatingStyle.STATIC_ON_DARK;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m1767constructorimpl(int i11) {
        return i11;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1768equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    public static final long getBackgroundColor(int i11, InterfaceC3967k interfaceC3967k, int i12) {
        long j11;
        interfaceC3967k.o(1715842111);
        if (i11 == DEFAULT) {
            interfaceC3967k.o(799196394);
            j11 = UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getLayerActiveSurface();
            interfaceC3967k.k();
        } else if (i11 == DEFAULT_ON_DARK) {
            interfaceC3967k.o(799199558);
            j11 = UniCompositionLocalKt.getNotThemedColor(UniTheme.INSTANCE.getColorTokens().getGraphicNeutralOnLight(), interfaceC3967k, UniColorToken.$stable);
            interfaceC3967k.k();
        } else if (i11 == STATIC_ON_DARK) {
            interfaceC3967k.o(799202566);
            j11 = UniCompositionLocalKt.getNotThemedColor(UniTheme.INSTANCE.getColorTokens().getGraphicNeutralOnLight(), interfaceC3967k, UniColorToken.$stable);
            interfaceC3967k.k();
        } else {
            if (i11 != CUSTOM) {
                interfaceC3967k.o(799205166);
                interfaceC3967k.k();
                throw new IllegalStateException("Unknown value");
            }
            interfaceC3967k.o(799204131);
            interfaceC3967k.k();
            j11 = C7807Z.f72259m;
        }
        interfaceC3967k.k();
        return j11;
    }

    public static final long getSelectedColor(int i11, InterfaceC3967k interfaceC3967k, int i12) {
        long j11;
        interfaceC3967k.o(-1479969499);
        if (i11 == DEFAULT) {
            interfaceC3967k.o(-297305294);
            j11 = UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getGraphicRating();
            interfaceC3967k.k();
        } else if (i11 == DEFAULT_ON_DARK) {
            interfaceC3967k.o(-297303150);
            j11 = UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getGraphicRating();
            interfaceC3967k.k();
        } else if (i11 == STATIC_ON_DARK) {
            interfaceC3967k.o(-297300525);
            j11 = UniCompositionLocalKt.getNotThemedColor(UniTheme.INSTANCE.getColorTokens().getBgLightKey(), interfaceC3967k, UniColorToken.$stable);
            interfaceC3967k.k();
        } else {
            if (i11 != CUSTOM) {
                interfaceC3967k.o(-297297925);
                interfaceC3967k.k();
                throw new IllegalStateException("Unknown value");
            }
            interfaceC3967k.o(-297298960);
            interfaceC3967k.k();
            j11 = C7807Z.f72259m;
        }
        interfaceC3967k.k();
        return j11;
    }
}
