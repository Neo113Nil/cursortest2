package th;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import okio.Okio;
import okio.Source;
import qh.d;
import qh.e;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a extends b {

    /* renamed from: f, reason: collision with root package name */
    public final String f23967f;

    public a() {
        Intrinsics.checkNotNullParameter("PublicSuffixDatabase.list", "path");
        this.f23967f = "PublicSuffixDatabase.list";
    }

    @Override // th.b
    public final Source a() {
        e eVar = e.f22190a;
        Object obj = e.f22190a;
        d dVar = obj != null ? (d) obj : null;
        Context b10 = dVar != null ? dVar.b() : null;
        AssetManager assets = b10 != null ? b10.getAssets() : null;
        if (assets == null) {
            if (Build.FINGERPRINT == null) {
                throw new IOException("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            }
            throw new IOException("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        }
        InputStream open = assets.open(this.f23967f);
        Intrinsics.checkNotNullExpressionValue(open, "open(...)");
        return Okio.source(open);
    }
}
