package com.plaid.internal.core.protos.income_verification_manager;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum d implements Internal.EnumLite {
    UPLOAD_FILE_TYPE_NONE(0),
    UPLOAD_FILE_TYPE_PDF(1),
    UPLOAD_FILE_TYPE_PNG(2),
    UPLOAD_FILE_TYPE_JPEG(3),
    UPLOAD_FILE_TYPE_BMP(4),
    UPLOAD_FILE_TYPE_TIFF(5),
    UPLOAD_FILE_TYPE_GIF(6),
    UNRECOGNIZED(-1);

    public static final int UPLOAD_FILE_TYPE_BMP_VALUE = 4;
    public static final int UPLOAD_FILE_TYPE_GIF_VALUE = 6;
    public static final int UPLOAD_FILE_TYPE_JPEG_VALUE = 3;
    public static final int UPLOAD_FILE_TYPE_NONE_VALUE = 0;
    public static final int UPLOAD_FILE_TYPE_PDF_VALUE = 1;
    public static final int UPLOAD_FILE_TYPE_PNG_VALUE = 2;
    public static final int UPLOAD_FILE_TYPE_TIFF_VALUE = 5;

    /* renamed from: b, reason: collision with root package name */
    public static final a f39903b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f39905a;

    public class a implements Internal.EnumLiteMap<d> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final d findValueByNumber(int i10) {
            return d.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f39906a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return d.forNumber(i10) != null;
        }
    }

    d(int i10) {
        this.f39905a = i10;
    }

    public static d forNumber(int i10) {
        switch (i10) {
            case 0:
                return UPLOAD_FILE_TYPE_NONE;
            case 1:
                return UPLOAD_FILE_TYPE_PDF;
            case 2:
                return UPLOAD_FILE_TYPE_PNG;
            case 3:
                return UPLOAD_FILE_TYPE_JPEG;
            case 4:
                return UPLOAD_FILE_TYPE_BMP;
            case 5:
                return UPLOAD_FILE_TYPE_TIFF;
            case 6:
                return UPLOAD_FILE_TYPE_GIF;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<d> internalGetValueMap() {
        return f39903b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f39906a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f39905a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static d valueOf(int i10) {
        return forNumber(i10);
    }
}
