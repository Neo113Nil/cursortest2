package v9;

import android.content.Intent;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: v9.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10278a {

    /* renamed from: a, reason: collision with root package name */
    public static final List f102565a = Collections.unmodifiableList(Arrays.asList("UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14"));

    /* renamed from: b, reason: collision with root package name */
    public static final List f102566b = Collections.unmodifiableList(Arrays.asList("UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14", "CODE_39", "CODE_93", "CODE_128", "ITF", "RSS_14", "RSS_EXPANDED"));

    public static b a(Intent intent) {
        String stringExtra = intent.getStringExtra("SCAN_RESULT");
        String stringExtra2 = intent.getStringExtra("SCAN_RESULT_FORMAT");
        byte[] byteArrayExtra = intent.getByteArrayExtra("SCAN_RESULT_BYTES");
        int intExtra = intent.getIntExtra("SCAN_RESULT_ORIENTATION", LinearLayoutManager.INVALID_OFFSET);
        return new b(stringExtra, stringExtra2, byteArrayExtra, intExtra == Integer.MIN_VALUE ? null : Integer.valueOf(intExtra), intent.getStringExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL"), intent.getStringExtra("SCAN_RESULT_IMAGE_PATH"), intent);
    }
}
