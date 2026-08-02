package ru.ozon.uni.atoms.data.cell;

import Z1.h;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$dimen;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniPaddingToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\" \u0010\u0001\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\" \u0010\u0007\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0002\u0012\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0004\" \u0010\n\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0002\u0012\u0004\b\f\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004\" \u0010\r\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0002\u0012\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004\" \u0010\u0010\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0002\u0012\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004\" \u0010\u0013\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0002\u0012\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004\" \u0010\u0016\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0002\u0012\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004\" \u0010\u0019\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0002\u0012\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004\" \u0010\u001c\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0002\u0012\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004\" \u0010\u001f\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0002\u0012\u0004\b!\u0010\u0006\u001a\u0004\b \u0010\u0004\" \u0010\"\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0002\u0012\u0004\b$\u0010\u0006\u001a\u0004\b#\u0010\u0004\" \u0010%\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u0002\u0012\u0004\b'\u0010\u0006\u001a\u0004\b&\u0010\u0004\" \u0010(\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010\u0002\u0012\u0004\b*\u0010\u0006\u001a\u0004\b)\u0010\u0004\" \u0010+\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010\u0002\u0012\u0004\b-\u0010\u0006\u001a\u0004\b,\u0010\u0004\" \u0010.\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010\u0002\u0012\u0004\b0\u0010\u0006\u001a\u0004\b/\u0010\u0004\" \u00101\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010\u0002\u0012\u0004\b3\u0010\u0006\u001a\u0004\b2\u0010\u0004\" \u00104\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010\u0002\u0012\u0004\b6\u0010\u0006\u001a\u0004\b5\u0010\u0004\" \u00107\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u0010\u0002\u0012\u0004\b9\u0010\u0006\u001a\u0004\b8\u0010\u0004\" \u0010:\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b:\u0010\u0002\u0012\u0004\b<\u0010\u0006\u001a\u0004\b;\u0010\u0004\"\u0017\u0010A\u001a\u0004\u0018\u00010>*\u00020=8F¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lru/ozon/uni/atoms/data/cell/CellLayoutPadding;", DevicePublicKeyStringDef.NONE, "I", "getNone", "()I", "getNone$annotations", "()V", "padding100", "getPadding100", "getPadding100$annotations", "padding200", "getPadding200", "getPadding200$annotations", "padding250", "getPadding250", "getPadding250$annotations", "padding300", "getPadding300", "getPadding300$annotations", "padding350", "getPadding350", "getPadding350$annotations", "padding400", "getPadding400", "getPadding400$annotations", "padding450", "getPadding450", "getPadding450$annotations", "padding500", "getPadding500", "getPadding500$annotations", "padding550", "getPadding550", "getPadding550$annotations", "padding600", "getPadding600", "getPadding600$annotations", "padding700", "getPadding700", "getPadding700$annotations", "padding750", "getPadding750", "getPadding750$annotations", "padding800", "getPadding800", "getPadding800$annotations", "padding900", "getPadding900", "getPadding900$annotations", "padding950", "getPadding950", "getPadding950$annotations", "padding1000", "getPadding1000", "getPadding1000$annotations", "padding1050", "getPadding1050", "getPadding1050$annotations", "padding1100", "getPadding1100", "getPadding1100$annotations", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "LZ1/h;", "getDp", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)LZ1/h;", "dp", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CommonCellSettingsKt {
    private static final int none = CellLayoutPadding.m1864constructorimpl(R$dimen.dimen_0);
    private static final int padding100 = CellLayoutPadding.m1864constructorimpl(R$dimen.dimen_2);
    private static final int padding200 = CellLayoutPadding.m1864constructorimpl(R$dimen.dimen_4);
    private static final int padding250 = CellLayoutPadding.m1864constructorimpl(R$dimen.dimen_6);
    private static final int padding300 = CellLayoutPadding.m1864constructorimpl(R$dimen.dimen_8);
    private static final int padding350 = CellLayoutPadding.m1864constructorimpl(R$dimen.dimen_10);
    private static final int padding400 = CellLayoutPadding.m1864constructorimpl(R$dimen.dimen_12);
    private static final int padding450 = CellLayoutPadding.m1864constructorimpl(R$dimen.dimen_14);
    private static final int padding500 = CellLayoutPadding.m1864constructorimpl(R$dimen.dimen_16);
    private static final int padding550 = CellLayoutPadding.m1864constructorimpl(R$dimen.dimen_18);
    private static final int padding600 = CellLayoutPadding.m1864constructorimpl(R$dimen.dimen_20);
    private static final int padding700 = CellLayoutPadding.m1864constructorimpl(R$dimen.dimen_24);
    private static final int padding750 = CellLayoutPadding.m1864constructorimpl(R$dimen.dimen_28);
    private static final int padding800 = CellLayoutPadding.m1864constructorimpl(R$dimen.dimen_32);
    private static final int padding900 = CellLayoutPadding.m1864constructorimpl(R$dimen.dimen_40);
    private static final int padding950 = CellLayoutPadding.m1864constructorimpl(R$dimen.dimen_44);
    private static final int padding1000 = CellLayoutPadding.m1864constructorimpl(R$dimen.dimen_48);
    private static final int padding1050 = CellLayoutPadding.m1864constructorimpl(R$dimen.dimen_52);
    private static final int padding1100 = CellLayoutPadding.m1864constructorimpl(R$dimen.dimen_56);

    public static final h getDp(@NotNull CommonCellSettings.LayoutPadding layoutPadding) {
        Intrinsics.checkNotNullParameter(layoutPadding, "<this>");
        UniPaddingToken byId = UniTheme.INSTANCE.getPaddingTokens().getById(layoutPadding.name());
        if (byId != null) {
            return h.a(TokensExtKt.getDp(byId));
        }
        return null;
    }

    public static final int getNone() {
        return none;
    }

    public static final int getPadding100() {
        return padding100;
    }

    public static final int getPadding1000() {
        return padding1000;
    }

    public static final int getPadding1050() {
        return padding1050;
    }

    public static final int getPadding1100() {
        return padding1100;
    }

    public static final int getPadding200() {
        return padding200;
    }

    public static final int getPadding250() {
        return padding250;
    }

    public static final int getPadding300() {
        return padding300;
    }

    public static final int getPadding350() {
        return padding350;
    }

    public static final int getPadding400() {
        return padding400;
    }

    public static final int getPadding450() {
        return padding450;
    }

    public static final int getPadding500() {
        return padding500;
    }

    public static final int getPadding550() {
        return padding550;
    }

    public static final int getPadding600() {
        return padding600;
    }

    public static final int getPadding700() {
        return padding700;
    }

    public static final int getPadding750() {
        return padding750;
    }

    public static final int getPadding800() {
        return padding800;
    }

    public static final int getPadding900() {
        return padding900;
    }

    public static final int getPadding950() {
        return padding950;
    }
}
