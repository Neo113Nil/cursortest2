package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.protobuf.DescriptorProtos$FileOptions;

/* loaded from: classes9.dex */
final class zbaci implements zbuj {
    static final zbuj zba = new zbaci();

    private zbaci() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuj
    public final boolean zba(int i11) {
        if (i11 == 200 || i11 == 300 || i11 == 302 || i11 == 312 || i11 == 15000 || i11 == 304 || i11 == 305) {
            return true;
        }
        switch (i11) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                switch (i11) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        return true;
                    default:
                        switch (i11) {
                            case 43:
                            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                return true;
                            default:
                                switch (i11) {
                                    case 220:
                                    case 221:
                                    case 222:
                                    case 223:
                                    case 224:
                                    case 225:
                                    case 226:
                                    case 227:
                                        return true;
                                    default:
                                        switch (i11) {
                                            case 238:
                                            case 239:
                                            case 240:
                                            case 241:
                                            case 242:
                                            case 243:
                                                return true;
                                            default:
                                                switch (i11) {
                                                    case 314:
                                                    case 315:
                                                    case 316:
                                                        return true;
                                                    default:
                                                        return false;
                                                }
                                        }
                                }
                        }
                }
        }
    }
}
