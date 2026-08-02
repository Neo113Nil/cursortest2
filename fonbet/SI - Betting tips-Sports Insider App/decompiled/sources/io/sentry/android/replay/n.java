package io.sentry.android.replay;

import android.graphics.Matrix;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.util.Range;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.j0;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends Lambda implements Function0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16067f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i5, Object obj) {
        super(0);
        this.f16066e = i5;
        this.f16067f = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16066e) {
            case 0:
                ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new j0(2));
                Intrinsics.checkNotNull(newSingleThreadScheduledExecutor);
                b6 b6Var = ((ReplayIntegration) this.f16067f).f15926d;
                if (b6Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    b6Var = null;
                }
                break;
            case 1:
                ScheduledExecutorService newSingleThreadScheduledExecutor2 = Executors.newSingleThreadScheduledExecutor(new j0(3));
                Intrinsics.checkNotNull(newSingleThreadScheduledExecutor2);
                break;
            case 2:
                Matrix matrix = new Matrix();
                v vVar = ((io.sentry.android.replay.screenshot.d) this.f16067f).f16080d;
                matrix.preScale(vVar.f16139c, vVar.f16140d);
                break;
            case 3:
                ec.y yVar = (ec.y) this.f16067f;
                io.sentry.android.replay.video.a aVar = (io.sentry.android.replay.video.a) yVar.f9065b;
                b6 b6Var2 = (b6) yVar.f9064a;
                int i5 = aVar.f16147e;
                try {
                    MediaCodecInfo.VideoCapabilities videoCapabilities = ((MediaCodec) yVar.f9067d).getCodecInfo().getCapabilitiesForType("video/avc").getVideoCapabilities();
                    if (!videoCapabilities.getBitrateRange().contains((Range<Integer>) Integer.valueOf(i5))) {
                        b6Var2.getLogger().h(b5.DEBUG, "Encoder doesn't support the provided bitRate: " + i5 + ", the value will be clamped to the closest one", new Object[0]);
                        Integer clamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(i5));
                        Intrinsics.checkNotNullExpressionValue(clamp, "clamp(...)");
                        i5 = clamp.intValue();
                    }
                } catch (Throwable th2) {
                    b6Var2.getLogger().e(b5.DEBUG, "Could not retrieve MediaCodec info", th2);
                }
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", aVar.f16144b, aVar.f16145c);
                Intrinsics.checkNotNullExpressionValue(createVideoFormat, "createVideoFormat(...)");
                createVideoFormat.setInteger("color-format", 2130708361);
                createVideoFormat.setInteger("bitrate", i5);
                createVideoFormat.setFloat("frame-rate", aVar.f16146d);
                createVideoFormat.setInteger("i-frame-interval", 6);
                break;
            case 4:
                break;
            case 5:
                ((io.sentry.android.sqlite.h) this.f16067f).f16200a.i();
                break;
            case 6:
                ((oi.w) this.f16067f).a(new u0.a("Your device doesn't support credential manager", "androidx.credentials.TYPE_CLEAR_CREDENTIAL_UNSUPPORTED_EXCEPTION"));
                break;
            default:
                ((oi.w) this.f16067f).a(new u0.h("Your device doesn't support credential manager"));
                break;
        }
        return Unit.f19194a;
    }
}
