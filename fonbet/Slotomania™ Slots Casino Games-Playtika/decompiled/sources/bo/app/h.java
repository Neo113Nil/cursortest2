package bo.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import bo.app.o0;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.X3;
import java.io.File;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.io.files.FileSystemKt;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¨\u0006\u0014"}, d2 = {"Lbo/app/h;", "", "", "key", "c", "Landroid/graphics/Bitmap;", "b", "bitmap", "", Constants.BRAZE_PUSH_CONTENT_KEY, "", "Ljava/io/File;", "directory", "", X3.j.W, "valueCount", "", SDKConstants.PARAM_CONTEXT_MAX_SIZE, "<init>", "(Ljava/io/File;IIJ)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class h {
    private final o0 a;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error while retrieving disk for key " + this.b + " diskKey " + this.c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to get bitmap from disk cache for key " + this.b + " diskKey " + this.c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to load image from disk cache: " + this.b + FileSystemKt.UnixPathSeparator + this.c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error while producing output stream or compressing bitmap for key " + this.b + " diskKey " + this.c;
        }
    }

    public h(File file, int i, int i2, long j) {
        o0 a2 = o0.a(file, i, i2, j);
        Intrinsics.checkNotNullExpressionValue(a2, "open(directory, appVersion, valueCount, maxSize)");
        this.a = a2;
    }

    private final String c(String key) {
        return String.valueOf(key.hashCode());
    }

    public final void a(String key, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        String c2 = c(key);
        try {
            o0.c a2 = this.a.a(c2);
            OutputStream a3 = a2.a(0);
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, a3);
                a3.flush();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(a3, null);
                a2.b();
            } finally {
            }
        } catch (Throwable th) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, th, new d(key, c2));
        }
    }

    public final Bitmap b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String c2 = c(key);
        try {
            o0.d b2 = this.a.b(c2);
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(b2.a(0));
                CloseableKt.closeFinally(b2, null);
                return decodeStream;
            } finally {
            }
        } catch (Throwable th) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            brazeLogger.brazelog(this, BrazeLogger.Priority.E, th, new b(key, c2));
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new c(key, c2), 3, (Object) null);
            return null;
        }
    }

    public final boolean a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String c2 = c(key);
        try {
            o0.d b2 = this.a.b(c2);
            boolean z = b2 != null;
            CloseableKt.closeFinally(b2, null);
            return z;
        } catch (Throwable th) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, th, new a(key, c2));
            return false;
        }
    }
}
