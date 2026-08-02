package l1;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import l1.C7843t;
import org.jetbrains.annotations.NotNull;

/* renamed from: l1.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7796N {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C7796N f72231a = new C7796N();

    @NotNull
    public final BlendModeColorFilter a(long j11, int i11) {
        C7822h.b();
        return p002if.g.b(C7811b0.i(j11), C7843t.a(i11));
    }

    @NotNull
    public final C7795M b(@NotNull BlendModeColorFilter blendModeColorFilter) {
        int color;
        BlendMode mode;
        int ordinal;
        int i11;
        color = blendModeColorFilter.getColor();
        long b11 = C7811b0.b(color);
        mode = blendModeColorFilter.getMode();
        int[] iArr = C7843t.a.f72279a;
        ordinal = mode.ordinal();
        switch (iArr[ordinal]) {
            case 1:
                i11 = 0;
                break;
            case 2:
                i11 = 1;
                break;
            case 3:
                i11 = 2;
                break;
            case 4:
            default:
                i11 = 3;
                break;
            case 5:
                i11 = 4;
                break;
            case 6:
                i11 = 5;
                break;
            case 7:
                i11 = 6;
                break;
            case 8:
                i11 = 7;
                break;
            case 9:
                i11 = 8;
                break;
            case 10:
                i11 = 9;
                break;
            case 11:
                i11 = 10;
                break;
            case 12:
                i11 = 11;
                break;
            case 13:
                i11 = 12;
                break;
            case 14:
                i11 = 13;
                break;
            case 15:
                i11 = 14;
                break;
            case 16:
                i11 = 15;
                break;
            case 17:
                i11 = 16;
                break;
            case 18:
                i11 = 17;
                break;
            case 19:
                i11 = 18;
                break;
            case 20:
                i11 = 19;
                break;
            case 21:
                i11 = 20;
                break;
            case 22:
                i11 = 21;
                break;
            case 23:
                i11 = 22;
                break;
            case 24:
                i11 = 23;
                break;
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                i11 = 24;
                break;
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                i11 = 25;
                break;
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                i11 = 26;
                break;
            case 28:
                i11 = 27;
                break;
            case 29:
                i11 = 28;
                break;
        }
        return new C7795M(b11, i11, blendModeColorFilter);
    }
}
