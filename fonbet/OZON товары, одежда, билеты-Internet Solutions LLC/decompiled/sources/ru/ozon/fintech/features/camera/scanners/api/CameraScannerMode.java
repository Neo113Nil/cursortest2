package ru.ozon.fintech.features.camera.scanners.api;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.camera.TakePhotoRequest;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/fintech/features/camera/scanners/api/CameraScannerMode;", "", "<init>", "(Ljava/lang/String;I)V", TakePhotoRequest.QR_SCANNER_TYPE, TakePhotoRequest.BARCODE_SCANNER_TYPE, "PHONE", "MIX_QR_BARCODE", TakePhotoRequest.BANK_CARD, "camera-scanners-api_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CameraScannerMode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CameraScannerMode[] $VALUES;
    public static final CameraScannerMode QR = new CameraScannerMode(TakePhotoRequest.QR_SCANNER_TYPE, 0);
    public static final CameraScannerMode BARCODE = new CameraScannerMode(TakePhotoRequest.BARCODE_SCANNER_TYPE, 1);
    public static final CameraScannerMode PHONE = new CameraScannerMode("PHONE", 2);
    public static final CameraScannerMode MIX_QR_BARCODE = new CameraScannerMode("MIX_QR_BARCODE", 3);
    public static final CameraScannerMode BANK_CARD = new CameraScannerMode(TakePhotoRequest.BANK_CARD, 4);

    private static final /* synthetic */ CameraScannerMode[] $values() {
        return new CameraScannerMode[]{QR, BARCODE, PHONE, MIX_QR_BARCODE, BANK_CARD};
    }

    static {
        CameraScannerMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private CameraScannerMode(String str, int i11) {
    }

    @NotNull
    public static a<CameraScannerMode> getEntries() {
        return $ENTRIES;
    }

    public static CameraScannerMode valueOf(String str) {
        return (CameraScannerMode) Enum.valueOf(CameraScannerMode.class, str);
    }

    public static CameraScannerMode[] values() {
        return (CameraScannerMode[]) $VALUES.clone();
    }
}
