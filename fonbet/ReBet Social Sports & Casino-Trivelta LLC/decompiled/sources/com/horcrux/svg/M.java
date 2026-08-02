package com.horcrux.svg;

import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.SVGLength;

/* loaded from: classes3.dex */
public abstract class M {

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$SVGLength$UnitType;

        static {
            int[] iArr = new int[SVGLength.UnitType.values().length];
            $SwitchMap$com$horcrux$svg$SVGLength$UnitType = iArr;
            try {
                iArr[SVGLength.UnitType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.PX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.PERCENTAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.EMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.EXS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.CM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.MM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.PT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.PC.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLength$UnitType[SVGLength.UnitType.UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static double a(SVGLength sVGLength, double d10, double d11, double d12, double d13) {
        double d14;
        if (sVGLength == null) {
            return d11;
        }
        SVGLength.UnitType unitType = sVGLength.f38737b;
        double d15 = sVGLength.f38736a;
        switch (a.$SwitchMap$com$horcrux$svg$SVGLength$UnitType[unitType.ordinal()]) {
            case 1:
            case 2:
                d13 = 1.0d;
                d15 *= d13;
                d14 = d15 * d12;
                break;
            case 3:
                d14 = (d15 / 100.0d) * d10;
                break;
            case 4:
                d15 *= d13;
                d14 = d15 * d12;
                break;
            case 5:
                d13 /= 2.0d;
                d15 *= d13;
                d14 = d15 * d12;
                break;
            case 6:
                d13 = 35.43307d;
                d15 *= d13;
                d14 = d15 * d12;
                break;
            case 7:
                d13 = 3.543307d;
                d15 *= d13;
                d14 = d15 * d12;
                break;
            case 8:
                d13 = 90.0d;
                d15 *= d13;
                d14 = d15 * d12;
                break;
            case 9:
                d13 = 1.25d;
                d15 *= d13;
                d14 = d15 * d12;
                break;
            case 10:
                d13 = 15.0d;
                d15 *= d13;
                d14 = d15 * d12;
                break;
            default:
                d14 = d15 * d12;
                break;
        }
        return d14 + d11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static double b(String str, double d10, double d11, double d12) {
        double doubleValue;
        String trim = str.trim();
        int length = trim.length();
        int i10 = length - 1;
        if (length == 0 || trim.equals("normal")) {
            return 0.0d;
        }
        if (trim.codePointAt(i10) == 37) {
            return (Double.valueOf(trim.substring(0, i10)).doubleValue() / 100.0d) * d10;
        }
        int i11 = length - 2;
        if (i11 > 0) {
            String substring = trim.substring(i11);
            substring.getClass();
            switch (substring) {
                case "cm":
                    d12 = 35.43307d;
                    length = i11;
                    break;
                case "em":
                    length = i11;
                    break;
                case "in":
                    d12 = 90.0d;
                    length = i11;
                    break;
                case "mm":
                    d12 = 3.543307d;
                    length = i11;
                    break;
                case "pc":
                    d12 = 15.0d;
                    length = i11;
                    break;
                case "pt":
                    d12 = 1.25d;
                    length = i11;
                    break;
                case "px":
                    length = i11;
                    d12 = 1.0d;
                    break;
                default:
                    d12 = 1.0d;
                    break;
            }
            doubleValue = Double.valueOf(trim.substring(0, length)).doubleValue() * d12;
        } else {
            doubleValue = Double.valueOf(trim).doubleValue();
        }
        return doubleValue * d11;
    }

    public static int c(ReadableArray readableArray, float[] fArr, float f10) {
        int size = readableArray.size();
        if (size != 6) {
            return size;
        }
        fArr[0] = (float) readableArray.getDouble(0);
        fArr[1] = (float) readableArray.getDouble(2);
        fArr[2] = ((float) readableArray.getDouble(4)) * f10;
        fArr[3] = (float) readableArray.getDouble(1);
        fArr[4] = (float) readableArray.getDouble(3);
        fArr[5] = ((float) readableArray.getDouble(5)) * f10;
        return 6;
    }
}
