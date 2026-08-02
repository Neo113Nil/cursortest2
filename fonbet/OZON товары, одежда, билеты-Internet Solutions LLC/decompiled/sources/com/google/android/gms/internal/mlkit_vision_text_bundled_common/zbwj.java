package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
final class zbwj {
    static String zba(zbtc zbtcVar) {
        StringBuilder sb2 = new StringBuilder(zbtcVar.zbd());
        for (int i11 = 0; i11 < zbtcVar.zbd(); i11++) {
            byte zba = zbtcVar.zba(i11);
            if (zba == 34) {
                sb2.append("\\\"");
            } else if (zba == 39) {
                sb2.append("\\'");
            } else if (zba != 92) {
                switch (zba) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (zba < 32 || zba > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((zba >>> 6) & 3) + 48));
                            sb2.append((char) (((zba >>> 3) & 7) + 48));
                            sb2.append((char) ((zba & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) zba);
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
