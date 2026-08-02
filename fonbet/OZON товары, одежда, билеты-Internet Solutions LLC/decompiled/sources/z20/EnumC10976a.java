package z20;

import S0.InterfaceC3967k;
import y20.C10833a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z20.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC10976a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC10976a[] $VALUES;
    public static final EnumC10976a ActiveTextAction;
    public static final EnumC10976a BgActionPrimary;
    public static final EnumC10976a BgActionSecondary;
    public static final EnumC10976a BgActionSecondaryTransparent;
    public static final EnumC10976a BgSecondaryTransparent;
    public static final EnumC10976a GraphicActionPrimary;
    public static final EnumC10976a GraphicNeutralTransparent;
    public static final EnumC10976a GraphicTertiaryTransparent;
    public static final EnumC10976a LayerFloor0;
    public static final EnumC10976a LayerFloor1;
    public static final EnumC10976a LayerSurfaceTransparent;
    public static final EnumC10976a StaticGraphicLightKey;
    public static final EnumC10976a StaticGraphicPrimaryOnDarkTransparent;
    public static final EnumC10976a StaticGraphicTertiaryOnLightTransparent;
    public static final EnumC10976a StaticTextLightKey;
    public static final EnumC10976a TextAction;
    public static final EnumC10976a TextPrimary;
    public static final EnumC10976a TextSecondaryTransparent;
    public static final EnumC10976a TextTertiaryTransparent;

    static {
        EnumC10976a enumC10976a = new EnumC10976a("TextPrimary", 0);
        TextPrimary = enumC10976a;
        EnumC10976a enumC10976a2 = new EnumC10976a("TextSecondaryTransparent", 1);
        TextSecondaryTransparent = enumC10976a2;
        EnumC10976a enumC10976a3 = new EnumC10976a("TextTertiaryTransparent", 2);
        TextTertiaryTransparent = enumC10976a3;
        EnumC10976a enumC10976a4 = new EnumC10976a("TextAction", 3);
        TextAction = enumC10976a4;
        EnumC10976a enumC10976a5 = new EnumC10976a("GraphicTertiaryTransparent", 4);
        GraphicTertiaryTransparent = enumC10976a5;
        EnumC10976a enumC10976a6 = new EnumC10976a("GraphicNeutralTransparent", 5);
        GraphicNeutralTransparent = enumC10976a6;
        EnumC10976a enumC10976a7 = new EnumC10976a("GraphicActionPrimary", 6);
        GraphicActionPrimary = enumC10976a7;
        EnumC10976a enumC10976a8 = new EnumC10976a("BgSecondaryTransparent", 7);
        BgSecondaryTransparent = enumC10976a8;
        EnumC10976a enumC10976a9 = new EnumC10976a("BgActionPrimary", 8);
        BgActionPrimary = enumC10976a9;
        EnumC10976a enumC10976a10 = new EnumC10976a("BgActionSecondary", 9);
        BgActionSecondary = enumC10976a10;
        EnumC10976a enumC10976a11 = new EnumC10976a("BgActionSecondaryTransparent", 10);
        BgActionSecondaryTransparent = enumC10976a11;
        EnumC10976a enumC10976a12 = new EnumC10976a("LayerFloor0", 11);
        LayerFloor0 = enumC10976a12;
        EnumC10976a enumC10976a13 = new EnumC10976a("LayerFloor1", 12);
        LayerFloor1 = enumC10976a13;
        EnumC10976a enumC10976a14 = new EnumC10976a("LayerSurfaceTransparent", 13);
        LayerSurfaceTransparent = enumC10976a14;
        EnumC10976a enumC10976a15 = new EnumC10976a("StaticTextLightKey", 14);
        StaticTextLightKey = enumC10976a15;
        EnumC10976a enumC10976a16 = new EnumC10976a("StaticGraphicTertiaryOnLightTransparent", 15);
        StaticGraphicTertiaryOnLightTransparent = enumC10976a16;
        EnumC10976a enumC10976a17 = new EnumC10976a("StaticGraphicLightKey", 16);
        StaticGraphicLightKey = enumC10976a17;
        EnumC10976a enumC10976a18 = new EnumC10976a("StaticGraphicPrimaryOnDarkTransparent", 17);
        StaticGraphicPrimaryOnDarkTransparent = enumC10976a18;
        EnumC10976a enumC10976a19 = new EnumC10976a("ActiveTextAction", 18);
        ActiveTextAction = enumC10976a19;
        EnumC10976a[] enumC10976aArr = {enumC10976a, enumC10976a2, enumC10976a3, enumC10976a4, enumC10976a5, enumC10976a6, enumC10976a7, enumC10976a8, enumC10976a9, enumC10976a10, enumC10976a11, enumC10976a12, enumC10976a13, enumC10976a14, enumC10976a15, enumC10976a16, enumC10976a17, enumC10976a18, enumC10976a19};
        $VALUES = enumC10976aArr;
        $ENTRIES = Xc.b.a(enumC10976aArr);
    }

    private EnumC10976a() {
        throw null;
    }

    public static EnumC10976a valueOf(String str) {
        return (EnumC10976a) Enum.valueOf(EnumC10976a.class, str);
    }

    public static EnumC10976a[] values() {
        return (EnumC10976a[]) $VALUES.clone();
    }

    public final long a(InterfaceC3967k interfaceC3967k) {
        return (C10833a.a(interfaceC3967k).o() ? d.a() : f.a()).get(ordinal()).w();
    }
}
