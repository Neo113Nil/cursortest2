package d90;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;

/* renamed from: d90.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6116d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f61377a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ExternalNetworkSettings f61378b;

    public C6116d(@NotNull SharedPreferences sharedPreferences, @NotNull ExternalNetworkSettings externalNetworkSettings) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(externalNetworkSettings, "externalNetworkSettings");
        this.f61377a = sharedPreferences;
        this.f61378b = externalNetworkSettings;
    }

    public final String a() {
        String meshHeader = this.f61378b.getMeshHeader();
        return meshHeader == null ? this.f61377a.getString("fintech_mesh_header", null) : meshHeader;
    }

    public final void b(@NotNull String mesh) {
        Intrinsics.checkNotNullParameter(mesh, "mesh");
        SharedPreferences.Editor edit = this.f61377a.edit();
        edit.putString("fintech_mesh_header", mesh);
        edit.commit();
    }
}
