package io.sentry.android.replay;

import io.sentry.b5;
import io.sentry.b6;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends Lambda implements Function0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f16047f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, int i5) {
        super(0);
        this.f16046e = i5;
        this.f16047f = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16046e) {
            case 0:
                j jVar = this.f16047f;
                if (jVar.n() == null) {
                    return null;
                }
                File file = new File(jVar.n(), ".ongoing_segment");
                if (!file.exists()) {
                    file.createNewFile();
                }
                return file;
            default:
                j jVar2 = this.f16047f;
                b6 options = jVar2.f16051a;
                io.sentry.protocol.v replayId = jVar2.f16052b;
                Intrinsics.checkNotNullParameter(options, "options");
                Intrinsics.checkNotNullParameter(replayId, "replayId");
                String cacheDirPath = options.getCacheDirPath();
                if (cacheDirPath == null || cacheDirPath.length() == 0) {
                    options.getLogger().h(b5.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                    return null;
                }
                String cacheDirPath2 = options.getCacheDirPath();
                Intrinsics.checkNotNull(cacheDirPath2);
                File file2 = new File(cacheDirPath2, "replay_" + replayId);
                file2.mkdirs();
                return file2;
        }
    }
}
