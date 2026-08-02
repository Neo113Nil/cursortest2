package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class SVGLength {

    /* renamed from: a, reason: collision with root package name */
    public final double f38736a;

    /* renamed from: b, reason: collision with root package name */
    public final UnitType f38737b;

    public enum UnitType {
        UNKNOWN,
        NUMBER,
        PERCENTAGE,
        EMS,
        EXS,
        PX,
        CM,
        MM,
        IN,
        PT,
        PC
    }

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public SVGLength() {
        this.f38736a = 0.0d;
        this.f38737b = UnitType.UNKNOWN;
    }

    public static ArrayList a(Dynamic dynamic) {
        int i10 = a.$SwitchMap$com$facebook$react$bridge$ReadableType[dynamic.getType().ordinal()];
        if (i10 == 1) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new SVGLength(dynamic.asDouble()));
            return arrayList;
        }
        int i11 = 0;
        if (i10 == 2) {
            String[] split = dynamic.asString().trim().replaceAll(",", " ").split(" ");
            ArrayList arrayList2 = new ArrayList(split.length);
            int length = split.length;
            while (i11 < length) {
                arrayList2.add(new SVGLength(split[i11]));
                i11++;
            }
            return arrayList2;
        }
        if (i10 != 3) {
            return null;
        }
        ReadableArray asArray = dynamic.asArray();
        int size = asArray.size();
        ArrayList arrayList3 = new ArrayList(size);
        while (i11 < size) {
            arrayList3.add(b(asArray.getDynamic(i11)));
            i11++;
        }
        return arrayList3;
    }

    public static SVGLength b(Dynamic dynamic) {
        int i10 = a.$SwitchMap$com$facebook$react$bridge$ReadableType[dynamic.getType().ordinal()];
        return i10 != 1 ? i10 != 2 ? new SVGLength() : new SVGLength(dynamic.asString()) : new SVGLength(dynamic.asDouble());
    }

    public static String c(Dynamic dynamic) {
        int i10 = a.$SwitchMap$com$facebook$react$bridge$ReadableType[dynamic.getType().ordinal()];
        if (i10 == 1) {
            return String.valueOf(dynamic.asDouble());
        }
        if (i10 != 2) {
            return null;
        }
        return dynamic.asString();
    }

    public SVGLength(double d10) {
        this.f38736a = d10;
        this.f38737b = UnitType.NUMBER;
    }

    public SVGLength(String str) {
        String trim = str.trim();
        int length = trim.length();
        int i10 = length - 1;
        if (length != 0 && !trim.equals("normal")) {
            if (trim.codePointAt(i10) == 37) {
                this.f38737b = UnitType.PERCENTAGE;
                this.f38736a = Double.valueOf(trim.substring(0, i10)).doubleValue();
                return;
            }
            int i11 = length - 2;
            if (i11 > 0) {
                String substring = trim.substring(i11);
                substring.getClass();
                switch (substring) {
                    case "cm":
                        this.f38737b = UnitType.CM;
                        length = i11;
                        break;
                    case "em":
                        this.f38737b = UnitType.EMS;
                        length = i11;
                        break;
                    case "ex":
                        this.f38737b = UnitType.EXS;
                        length = i11;
                        break;
                    case "in":
                        this.f38737b = UnitType.IN;
                        length = i11;
                        break;
                    case "mm":
                        this.f38737b = UnitType.MM;
                        length = i11;
                        break;
                    case "pc":
                        this.f38737b = UnitType.PC;
                        length = i11;
                        break;
                    case "pt":
                        this.f38737b = UnitType.PT;
                        length = i11;
                        break;
                    case "px":
                        this.f38737b = UnitType.NUMBER;
                        length = i11;
                        break;
                    default:
                        this.f38737b = UnitType.NUMBER;
                        break;
                }
                this.f38736a = Double.valueOf(trim.substring(0, length)).doubleValue();
                return;
            }
            this.f38737b = UnitType.NUMBER;
            this.f38736a = Double.valueOf(trim).doubleValue();
            return;
        }
        this.f38737b = UnitType.UNKNOWN;
        this.f38736a = 0.0d;
    }
}
