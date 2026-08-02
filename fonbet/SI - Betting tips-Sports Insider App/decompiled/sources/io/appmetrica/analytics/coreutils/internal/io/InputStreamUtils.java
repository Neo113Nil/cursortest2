package io.appmetrica.analytics.coreutils.internal.io;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okio.Segment;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¨\u0006\t"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/io/InputStreamUtils;", "", "", "limit", "Lkotlin/Function0;", "Ljava/io/InputStream;", "inputStreamProvider", "", "readSafelyApprox", "core-utils_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class InputStreamUtils {

    @NotNull
    public static final InputStreamUtils INSTANCE = new InputStreamUtils();

    private InputStreamUtils() {
    }

    @NotNull
    public final byte[] readSafelyApprox(int limit, @NotNull Function0<? extends InputStream> inputStreamProvider) {
        try {
            InputStream inputStream = (InputStream) inputStreamProvider.invoke();
            if (inputStream != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            byte[] bArr = new byte[Segment.SIZE];
                            int i5 = 0;
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (-1 == read || i5 > limit) {
                                    break;
                                }
                                if (read > 0) {
                                    byteArrayOutputStream.write(bArr, 0, read);
                                    i5 += read;
                                }
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            inputStream.close();
                            return byteArray;
                        } catch (Throwable unused) {
                            Unit unit = Unit.f19194a;
                            byteArrayOutputStream.close();
                            inputStream.close();
                        }
                    } finally {
                    }
                } finally {
                }
            }
        } catch (Throwable unused2) {
        }
        return new byte[0];
    }
}
